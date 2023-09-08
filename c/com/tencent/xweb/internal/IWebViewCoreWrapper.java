package com.tencent.xweb.internal;

public interface IWebViewCoreWrapper {
    Class<?> getBridgeClass(String str);

    Object getBridgeObject(Object obj);

    String getBridgePackageName();

    Class<?> getClass(String str);

    ClassLoader getWebViewCoreClassLoader();

    boolean hasFeature(int i);

    boolean invokeNativeChannel(int i, Object[] objArr);

    Object invokeRuntimeChannel(int i, Object[] objArr);
}
