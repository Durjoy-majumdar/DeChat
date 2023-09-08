package com.tencent.xweb.pinus.sdk;

public interface HttpAuthHandlerInterface {
    void cancel();

    void proceed(String str, String str2);

    boolean useHttpAuthUsernamePassword();
}
