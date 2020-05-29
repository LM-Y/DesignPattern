package com.creation.singleton;

import org.junit.Test;

/**
 * @Author : Ming
 * @Description :
 * @Date : 2020/5/26
 * @Modify by :
 */
public class EnumSingletonTest {

    @Test
    public void test(){
       EnumSingleton enumSingleton =  EnumSingleton.getInstance();
       EnumSingleton enumSingleton1 =  EnumSingleton.getInstance();
       if(enumSingleton == enumSingleton1){
           System.out.println("是同一个实例");
       }else{
           System.out.println("不是同一个实例");
       }
    }
}
