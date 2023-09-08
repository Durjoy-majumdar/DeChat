package com.tencent.xweb.internal;

public interface IWebViewDatabase {
    @Deprecated
    void clearFormData();

    void clearHttpAuthUsernamePassword();

    @Deprecated
    void clearUsernamePassword();

    String[] getHttpAuthUsernamePassword(String str, String str2);

    @Deprecated
    boolean hasFormData();

    boolean hasHttpAuthUsernamePassword();

    @Deprecated
    boolean hasUsernamePassword();

    void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4);
}
