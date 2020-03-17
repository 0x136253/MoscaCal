package com.mutiny.moscacal.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/17 16:18
 */
@Component
public class CountThread {
    @Value("{cal.count}")
    private int count;
    private int now;

    public Boolean canBeRun() {
        if (now<count){
            return true;
        }
        return false;
    }

    public void Run(int now) {
        this.now = now;
    }
}
