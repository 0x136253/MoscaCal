package com.mutiny.moscacal.Component;

import com.mutiny.moscacal.dao.FileAnswerMapper;
import com.mutiny.moscacal.dto.CalDefaultDataInfo;
import com.mutiny.moscacal.dto.CalModuleInfo;
import com.mutiny.moscacal.pojo.FileAnswer;
import com.mutiny.moscacal.util.CSVUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/17 16:18
 */
@Component
public class CountThread {
    @Value("${cal.count}")
    private int count;
    @Autowired
    private RunCal runCal;

    public Boolean canBeRun() {
        if (RunCal.getCount()<count){
            return true;
        }
        return false;
    }

    public void runModule(CalModuleInfo calModuleInfo) throws Exception{
        if (!canBeRun()){
            throw new Exception("The Running Module is full");
        }
        runCal.runModule(calModuleInfo);
    }

    public void runDefaultData(CalDefaultDataInfo calDefaultDataInfo) throws Exception{
        if (!canBeRun()){
            throw new Exception("The Running Module is full");
        }
        runCal.runDefaultData(calDefaultDataInfo);
    }
}
