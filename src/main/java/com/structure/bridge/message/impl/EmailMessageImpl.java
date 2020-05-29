package com.structure.bridge.message.impl;

import com.structure.bridge.message.MessageImplementor;

/**
 * @Author : Ming
 * @Description :
 * @Date : 2020/5/28
 * @Modify by :
 */
public class EmailMessageImpl implements MessageImplementor {

    @Override
    public void sendMessage(String message, String toUser) {
        System.out.println("邮件消息发送：\n  内容：" + message + " \n  接收者：" + toUser);
    }
}
