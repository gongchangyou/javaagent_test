package com.mouse;

import java.lang.instrument.Instrumentation;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/7/26 08:41
 */
public class PreDemo {
    public static void premain(String args, Instrumentation inst) throws Exception{
        for (int i = 0; i < 10; i++) {
            System.out.println("hello I`m premain agent!!!");
        }
    }
}
