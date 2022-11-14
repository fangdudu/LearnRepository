package com.fjq.singleton;

/**
 * ����ģʽ
 */
public class LazySingleton {
    private static  LazySingleton instance = null;
    private LazySingleton(){
    }
    public LazySingleton getInstance() {
        if(null==instance){
            instance = new LazySingleton();
        }
        return instance;
    }
}
