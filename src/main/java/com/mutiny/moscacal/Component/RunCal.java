package com.mutiny.moscacal.Component;

import com.mutiny.moscacal.FHE.EncryptDecrypt;
import com.mutiny.moscacal.FHE.Key;
import com.mutiny.moscacal.FHE.RecursiveDescent;
import com.mutiny.moscacal.dto.CalDefaultDataInfo;
import com.mutiny.moscacal.dto.CalModuleInfo;
import com.mutiny.moscacal.util.RecursiveDescentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.*;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/17 16:21
 */
public class RunCal implements Runnable{
    private static int count=0;
    private boolean isDefault;
    private int id;
    private String func;
    private Key key;
    private Map<Character, BigInteger>[] calMap;
    private Map<String, List<String>> InfoMap;

    public static int getCount() {
        return count;
    }

    public Boolean stringValHandle(Character k,List<String> val){
        int length = val.size();
        try {
            for (int i=0;i<length;i++){
                if (calMap[i]==null){
                    calMap[i]= new HashMap<>();
                }
                calMap[i].put(k,new BigInteger(val.get(i)));
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }


    public boolean mapHandle(Map<String,List<String>> map){
        try{
            Set<String> keySet = map.keySet();
            Iterator<String> itKeySet = keySet.iterator();
            while (itKeySet.hasNext()){
                String k = itKeySet.next();
                if (k.length()==1){
                    stringValHandle(k.charAt(0),map.get(k));
                }else {
                    InfoMap.put(k,map.get(k));
                }
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public RunCal(CalDefaultDataInfo calDefaultDataInfo) {
        this.calMap = new HashMap[calDefaultDataInfo.getSize()];
        this.InfoMap = new HashMap<>();
        this.isDefault = true;
        this.id = calDefaultDataInfo.getModuleId();
        this.key = calDefaultDataInfo.getKey();
        this.func = calDefaultDataInfo.getFunc();
        mapHandle(calDefaultDataInfo.getMap());
    }

    public RunCal(CalModuleInfo calModuleInfo) {
        this.calMap = new HashMap[calModuleInfo.getSize()];
        this.InfoMap = new HashMap<>();
        this.isDefault = true;
        this.id = calModuleInfo.getModuleId();
        this.key = calModuleInfo.getKey();
        this.func = calModuleInfo.getFunc();
        mapHandle(calModuleInfo.getMap());
    }

    public Map<Character,BigInteger> decode(Map<Character, BigInteger> map){
        Iterator<Character> keySet = map.keySet().iterator();
        Map<Character, BigInteger> answ = new HashMap<>();
        while (keySet.hasNext()){
            Character keys = keySet.next();
            answ.put(keys,EncryptDecrypt.decryption(map.get(keys),key));
        }
        return answ;
    }
    @Override
    public void run() {
        count++;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i =0;i<calMap.length;i++){
            System.out.println("num "+i+": ");
            RecursiveDescentUtils recursiveDescentUtils = new RecursiveDescentUtils(func,decode(calMap[i]));
            System.out.println(recursiveDescentUtils.exp());
            RecursiveDescent recursiveDescent = new RecursiveDescent(func,calMap[i],key);
            System.out.println(EncryptDecrypt.decryption(recursiveDescent.exp(),key));
        }
        count--;
    }
}
