package com.tencent.xweb;

public interface HttpAuthHandler {
    void cancel();

    void proceed(String str, String str2);

    boolean useHttpAuthUsernamePassword();
}
