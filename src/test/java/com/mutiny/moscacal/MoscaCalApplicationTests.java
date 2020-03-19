package com.mutiny.moscacal;

import com.mutiny.moscacal.dao.ModuleMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/17 17:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MoscaCalApplicationTests {
    @Autowired
    private ModuleMapper moduleMapper;

    @org.junit.Test
    public void testDataBase(){
        System.out.println(moduleMapper.selectByPrimaryKey(21));
    }
}
