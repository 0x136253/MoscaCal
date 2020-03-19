package com.mutiny.moscacal.Component;

import com.mutiny.moscacal.dto.CalDefaultDataInfo;
import com.mutiny.moscacal.dto.CalModuleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/17 16:18
 */
@Component
public class CountThread {
    @Value("${cal.count}")
    private int count;

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
        RunCal runCal = new RunCal(calModuleInfo);
        Thread thread = new Thread(runCal);
        thread.start();
    }

    public void runDefaultData(CalDefaultDataInfo calDefaultDataInfo) throws Exception{
        if (!canBeRun()){
            throw new Exception("The Running Module is full");
        }
        RunCal runCal = new RunCal(calDefaultDataInfo);
        Thread thread = new Thread(runCal);
        thread.start();
    }
}
