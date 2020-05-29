package com.structure.bridge.message.impl;

import com.structure.bridge.message.MessageImplementor;
import com.structure.bridge.message.NormalMessage;

/**
 * @Author : Ming
 * @Description :
 * @Date : 2020/5/28
 * @Modify by :
 */
public class NormalMessageImpl implements MessageImplementor {

    /**
     * 通用消息发送
     * @param message 消息内容
     * @param toUser  消息接收者
     */
    @Override
    public void sendMessage(String message, String toUser){
        System.out.println("通用消息发送：\n  内容：" + message + " \n  接收者：" + toUser);
    }
}
