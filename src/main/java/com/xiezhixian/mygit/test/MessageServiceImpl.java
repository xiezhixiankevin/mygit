package com.xiezhixian.mygit.test;

/**
 * <Description> MessageServiceImpl
 *
 * @author 26802
 * @version 1.0
 * @ClassName MessageServiceImpl
 * @taskId
 * @see com.xiezhixian.mygit.test
 */
public class MessageServiceImpl implements MessageService{
    @Override
    public void sendMessage(String str) {
        System.out.println("message:"+str);
    }

    @Override
    public void printUser(String name) {
        System.out.println("name = " + name);
    }
}
