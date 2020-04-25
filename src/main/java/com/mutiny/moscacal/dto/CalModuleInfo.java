package com.mutiny.moscacal.dto;

import com.mutiny.moscacal.FHE.Key;
import com.mutiny.moscacal.pojo.Module;

import java.util.List;
import java.util.Map;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/18 12:28
 */
public class CalModuleInfo {
    private int moduleId;
    private String func;
    private Key key;
    private Map<String, List<String>> map;
    private String username;
    private int size;
    private Module module;

    public CalModuleInfo() {
    }

    public CalModuleInfo(int moduleId, String func, Key key, Map<String, List<String>> map, String username, int size, Module module) {
        this.moduleId = moduleId;
        this.func = func;
        this.key = key;
        this.map = map;
        this.username = username;
        this.size = size;
        this.module = module;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
