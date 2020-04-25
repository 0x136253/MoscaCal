package com.mutiny.moscacal.dto;

import com.mutiny.moscacal.FHE.Key;
import com.mutiny.moscacal.pojo.DefaultData;
import com.mutiny.moscacal.pojo.DefaultModule;

import java.util.List;
import java.util.Map;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/18 12:28
 */
public class CalDefaultDataInfo {
    private int moduleId;
    private String func;
    private Key key;
    private Map<String, List<String>> map;
    private String username;
    private int size;
    private DefaultData defaultData;
    private DefaultModule defaultModule;

    public CalDefaultDataInfo() {
    }

    public CalDefaultDataInfo(int moduleId, String func, Key key, Map<String, List<String>> map, String username, int size, DefaultData defaultData, DefaultModule defaultModule) {
        this.moduleId = moduleId;
        this.func = func;
        this.key = key;
        this.map = map;
        this.username = username;
        this.size = size;
        this.defaultData = defaultData;
        this.defaultModule = defaultModule;
    }

    public DefaultModule getDefaultModule() {
        return defaultModule;
    }

    public void setDefaultModule(DefaultModule defaultModule) {
        this.defaultModule = defaultModule;
    }

    public DefaultData getDefaultData() {
        return defaultData;
    }

    public void setDefaultData(DefaultData defaultData) {
        this.defaultData = defaultData;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<String>> map) {
        this.map = map;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
