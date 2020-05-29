package com.structure.bridge.message;

/**
 * @Author : Ming
 * @Description : 消息实现者接口
 * @Date : 2020/5/28
 * @Modify by :
 */
public interface MessageImplementor {

    /**
     * 发送消息
     *
     * @param message 消息内容
     * @param toUser  接收者
     */
    void sendMessage(String message, String toUser);
}
