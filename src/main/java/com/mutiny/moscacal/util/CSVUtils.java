package com.mutiny.moscacal.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.*;

/**
 * @Author: Anonsmd
 * @Date: 2020/1/30 17:19
 */
public class CSVUtils {

    //CSV文件分隔符
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static Map<String, List<String>> readCsvFile(Reader in,int num){
//        File file = new File(filename);
        try {
//            Reader in = new FileReader(filename);
            CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
            List<String> header = csvParser.getHeaderNames();
            Map<String,List<String> > map = new HashMap<>();
            for (String str:header){
                map.put(str,new ArrayList<>());
            }
            Iterable<CSVRecord> records = csvParser;
            for (CSVRecord record: records){
                num--;
                for (String str:header){
                    map.get(str).add(record.get(str));
                }
                if (num == 0){
                    return  map;
                }
            }
            return map;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 写CSV文件
     */
    public static String writeCsvFile(String dir,Map<String,List<String>> datamap){
        //获取文件夹名
        String fileName =  UUID.randomUUID()+".csv";
        File dirFile = new File(dir);
        //判断文件是否存在
        if(!dirFile.exists()) {
            dirFile.mkdirs();
        }
        fileName=dir+"//"+fileName;
        File file=new File(fileName);
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = null;
        CSVPrinter csvFilePrinter = null;
        //创建 CSVFormat
        Set<String> keySet = datamap.keySet();
        Map<String,List<String>> map=datamap;
        String[] header=new String[keySet.size()];
        String[][] data = new String[keySet.size()][];
        int cnt=0;
        for (String str : keySet) {
            header[cnt]=str;
            List<String> temp = map.get(str);
            data[cnt++]= temp.toArray(new String[temp.size()]);
//            System.out.println(str);
        }
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);
        try{
            //初始化FileWriter
            fileWriter = new FileWriter(fileName);
            //初始化 CSVPrinter
            csvFilePrinter = new CSVPrinter(fileWriter,csvFileFormat);
            //创建CSV文件头
            csvFilePrinter.printRecord(header);
            //遍历写进CSV
            Iterator<Map.Entry< String,List<String> >> it =datamap.entrySet().iterator();
            int length=data[0].length;
            for (int i=0;i<length;i++){
                List<String> FileDTO = new ArrayList<>();
                for (int j=0;j<header.length;j++){
                    FileDTO.add(data[j][i]);
                }
                csvFilePrinter.printRecord(FileDTO);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                fileWriter.flush();
                fileWriter.close();
                csvFilePrinter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return fileName;
    }
}