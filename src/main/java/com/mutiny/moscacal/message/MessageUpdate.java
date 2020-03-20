package com.mutiny.moscacal.message;

import com.mutiny.moscacal.dao.MessageInfoMapper;
import com.mutiny.moscacal.dao.MessageSendMapper;
import com.mutiny.moscacal.dao.MessageUserMapper;
import com.mutiny.moscacal.pojo.MessageInfo;
import com.mutiny.moscacal.pojo.MessageUser;
import com.mutiny.moscacal.pojo.MessageUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/20 17:49
 */
@Component
public class MessageUpdate {
    @Autowired
    private MessageUserMapper messageUserMapper;
    @Autowired
    private MessageSendMapper messageSendMapper;
    @Autowired
    private MessageInfoMapper messageInfoMapper;

    public boolean update(String username) throws Exception{
        MessageUserExample messageUserExample = new MessageUserExample();
        messageUserExample.createCriteria().andUserIdEqualTo(username);
        List<MessageUser> messageUserList = messageUserMapper.selectByExample(messageUserExample);
        if (messageUserList.size()==0){
            return true;
        }
        List<MessageInfo> messageInfoList = new ArrayList<>();
        for (MessageUser record:messageUserList){
            if (!record.getStatus()){
                MessageInfo temp = messageInfoMapper.selectByPrimaryKey(record.getMessageInfoId());
                messageInfoList.add(temp);
            }
        }








        return true;
    }

}
