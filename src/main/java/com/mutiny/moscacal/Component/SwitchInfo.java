package com.mutiny.moscacal.Component;

import com.mutiny.moscacal.FHE.Key;
import com.mutiny.moscacal.dao.DefaultDataMapper;
import com.mutiny.moscacal.dao.DefaultModuleMapper;
import com.mutiny.moscacal.dao.ModuleMapper;
import com.mutiny.moscacal.dto.CalDefaultDataInfo;
import com.mutiny.moscacal.dto.CalModuleInfo;
import com.mutiny.moscacal.pojo.DefaultData;
import com.mutiny.moscacal.pojo.DefaultModule;
import com.mutiny.moscacal.pojo.Module;
import com.mutiny.moscacal.util.CSVUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/18 12:59
 */
@Component
public class SwitchInfo {
    @Autowired
    private ModuleMapper moduleMapper;
    @Autowired
    private DefaultDataMapper defaultDataMapper;
    @Autowired
    private DefaultModuleMapper defaultModuleMapper;

    public int getSize(Map<String, List<String>> fileMap){
        Set<String> keySet = fileMap.keySet();
        Iterator<String> itkeySet = keySet.iterator();
        return fileMap.get(itkeySet.next()).size();
    }

    public CalDefaultDataInfo switchDefaultData(int moduleId,int fileId,String fileUrl,int keyFileId,String keyFileUrl,long time,String ip,String username){
        Map<String, List<String>> fileMap = CSVUtils.readCsvFile(pathHandle(fileUrl,ip),-1);
        Key keyFile = getKey(CSVUtils.readCsvFile(pathHandle(keyFileUrl,ip),-1));
        DefaultData defaultData = defaultDataMapper.selectByPrimaryKey(moduleId);
        DefaultModule defaultModule = defaultModuleMapper.selectByPrimaryKey(defaultData.getDefaultId());
        CalDefaultDataInfo calDefaultDataInfo = new CalDefaultDataInfo(moduleId,defaultModule.getTfunction(),keyFile,fileMap,username,getSize(fileMap),defaultData,defaultModule);
        return calDefaultDataInfo;
    }

    public CalModuleInfo switchModule(int moduleId,int fileId,String fileUrl,int keyFileId,String keyFileUrl,long time,String ip,String username){
        Map<String, List<String>> fileMap = CSVUtils.readCsvFile(pathHandle(fileUrl,ip),-1);
        Key keyFile = getKey(CSVUtils.readCsvFile(pathHandle(keyFileUrl,ip),-1));
        Module module = moduleMapper.selectByPrimaryKey(moduleId);
        CalModuleInfo calModuleInfo = new CalModuleInfo(moduleId,module.getTfunction(),keyFile,fileMap,username,getSize(fileMap),module);
        return calModuleInfo;
    }

    public Key getKey(Map<String, List<String>> keyFileMap){
        Key key = new Key();
        key.P1 = new BigInteger(keyFileMap.get("P1").get(0));
        key.N = new BigInteger(keyFileMap.get("N").get(0));
        key.g1 = new BigInteger(keyFileMap.get("g1").get(0));
        key.g2 = new BigInteger(keyFileMap.get("g2").get(0));
        key.T = new BigInteger(keyFileMap.get("T").get(0));
        return key;
    }
    public Reader pathHandle(String path,String ip){
        if (path.startsWith("D://temp-rainy//")){
            path =  path.substring(16,path.length());
        }
        else if (path.startsWith("/temp-rainy/")){
            path = path.substring(12,path.length());
        }
        System.out.println(path);
        String system = System.getProperty("os.name");
        path=path.replaceAll("//","/");
        if (system.startsWith("Windows")){
            path = "http://"+ip+":8080/image/"+path;
        }
        else if (system.startsWith("Linux")){
            path = "http://"+ip+":8080/demo-0.1.0/image/"+path;
        }
        return download(path);
    }

    public Reader download(String path) {
        Reader reader = null;
        BufferedReader in = null;
        try {
            URL url=new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            conn.setDoInput(true);
            conn.setRequestMethod("GET");
            reader = new InputStreamReader(conn.getInputStream(), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reader;
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        SwitchInfo switchInfo = new SwitchInfo();
        System.out.println(CSVUtils.readCsvFile(switchInfo.pathHandle("D://temp-rainy//ModuleFile//18bedc5d-0603-49ac-a190-f9b9e7dacef1.csv","localhost"),2));
//        switchInfo.pathHandle("D://temp-rainy//729f365d-0fa8-40d8-b8ea-41f1726c75ca.png");
//        switchInfo.pathHandle("/temp-rainy/dca7c6a9-0a0e-42cb-a0c0-a60be5e022bb.png");
    }
}
