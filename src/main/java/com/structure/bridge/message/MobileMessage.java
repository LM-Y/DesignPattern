package com.structure.bridge.message;

/**
 * @Author : Ming
 * @Description : 移动端消息
 * @Date : 2020/5/28
 * @Modify by :
 */
public class MobileMessage extends AbstractMessage {
    /**
     * 创建此类需传实现接口对象
     *
     * @param msImpl
     */
    public MobileMessage(MessageImplementor msImpl) {
        super(msImpl);
    }

    /**
     * 移动端消息发送
     * @param message 消息内容
     * @param toUser  消息接收者
     */
    @Override
    public void sendMessage(String message, String toUser){
        super.sendMessage(message, toUser);
    }
}
