package com.tencent.liteav;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C28637q;

@JNINamespace("liteav")
public class LiveSettingJni {
    static {
        C28637q.m38304a();
    }

    public static native void nativeSetAppId(String str);

    public static native void nativeSetUserId(String str);
}
