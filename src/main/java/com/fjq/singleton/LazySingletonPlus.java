package com.fjq.singleton;

public class LazySingletonPlus {

    private static LazySingletonPlus instance = null;

    private LazySingletonPlus() {

    }

    public LazySingletonPlus getInstance() {
        if (null == instance) {
            synchronized (LazySingletonPlus.class) {
                // ˫��У����
                if (null == instance) {
                    instance = new LazySingletonPlus();
                }
            }
        }
        return instance;
    }
}
