package com.structure.bridge.message;

/**
 * @Author : Ming
 * @Description :
 * @Date : 2020/5/28
 * @Modify by :
 */
public class EmailMessage extends AbstractMessage {
    /**
     * 创建此类需传实现接口对象
     *
     * @param msImpl
     */
    public EmailMessage(MessageImplementor msImpl) {
        super(msImpl);
    }

    /**
     * 邮件消息发送
     *
     * @param message 消息内容
     * @param toUser  消息接收者
     */
    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);

    }
}
