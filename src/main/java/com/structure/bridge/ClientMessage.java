package com.structure.bridge;

import com.structure.bridge.message.AbstractMessage;
import com.structure.bridge.message.EmailMessage;
import com.structure.bridge.message.MessageImplementor;
import com.structure.bridge.message.impl.EmailMessageImpl;
import com.structure.bridge.message.impl.MobileMessageImpl;
import com.structure.bridge.message.impl.NormalMessageImpl;

/**
 * @Author : Ming
 * @Description : 客户端
 * @Date : 2020/5/28
 * @Modify by :
 */
public class ClientMessage {

    public static void main(String[] args) {

        MessageImplementor  messageImplementor= new EmailMessageImpl();
        AbstractMessage ab = new EmailMessage(messageImplementor);
        ab.sendMessage("加班申请", "Boss");
        //邮件提醒
        MessageImplementor impl = new EmailMessageImpl();
        impl.sendMessage("加班申请", "Boss");
        ///移动端提醒
        MessageImplementor mobile = new MobileMessageImpl();
        mobile.sendMessage("离职申请", "HR");
        //通知消息
        MessageImplementor normal = new NormalMessageImpl();
        normal.sendMessage("打卡提醒", "all");
    }
}
