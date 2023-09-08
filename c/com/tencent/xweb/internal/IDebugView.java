package com.tencent.xweb.internal;

public interface IDebugView {
    boolean onInterceptTestUrl(String str);

    void syncConfig();
}
