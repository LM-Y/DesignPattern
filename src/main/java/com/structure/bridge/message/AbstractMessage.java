package com.structure.bridge.message;

/**
 * @Author : Ming
 * @Description :
 * @Date : 2020/5/28
 * @Modify by :
 */
public abstract class AbstractMessage {
    /**
     * 接口方法实现类
     */
    MessageImplementor messageImplementor;

    /**
     * 创建此类需传实现接口对象
     *
     * @param msImpl
     */

    public AbstractMessage(MessageImplementor msImpl) {
        this.messageImplementor = msImpl;
    }

    /**
     * 因消息发送类型有很多，根据不同需求重写此方法
     *
     * @param message 消息内容
     * @param toUser  消息接收者
     */
    public void sendMessage(String message, String toUser) {
        messageImplementor.sendMessage(message, toUser);
    }

}
