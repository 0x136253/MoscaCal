package com.mutiny.moscacal.message;

import com.mutiny.moscacal.dao.MessageInfoMapper;
import com.mutiny.moscacal.dao.MessageUserMapper;
import com.mutiny.moscacal.dao.UserMapper;
import com.mutiny.moscacal.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/20 17:49
 */
@Component
public class MessageSend {
    @Autowired
    private MessageInfoMapper messageInfoMapper;
    @Autowired
    private MessageUserMapper messageUserMapper;
    /**
     * 发送消息,userList 可用userMapper生成
     * @param message
     * @return
     * @throws Exception
     */
    public boolean sendAll(Message message,List<User> userList) throws Exception{
        MessageInfoExample messageInfoExample = new MessageInfoExample();
        messageInfoExample.createCriteria();
        int info_size = messageInfoMapper.selectByExample(messageInfoExample).size();
        int user_size = userList.size();
        MessageInfo messageInfo = message.toMessageInfo();
        messageInfo.setMessageInfoId(info_size+1);
        messageInfo.setsNum(user_size);
        messageInfo.setnNum(0);
        messageInfoMapper.insertSelective(messageInfo);
        for(User record:userList) {
            MessageUser messageUser = new MessageUser();
            messageUser.setMessageInfoId(info_size+1);
            messageUser.setUserId(record.getId());
            messageUserMapper.insertSelective(messageUser);
        }
        return true;
    }


}
