package com.tencent.wechat.aff.common;

import com.tencent.wechat.aff.common.CommonProto;

public class AffFlutterCgiHost {
    private static AffFlutterCgiHost instance = new AffFlutterCgiHost();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void onRequestComplete(long j);

        void onResponseEvent(long j, CommonProto.AffCgiResponse affCgiResponse);
    }

    private AffFlutterCgiHost() {
        jniCreateAffFlutterCgiHost();
    }

    public static AffFlutterCgiHost getInstance() {
        return instance;
    }

    private native void jniCreateAffFlutterCgiHost();

    private native void jniRequestAsync(long j, long j2, byte[] bArr);

    private native void jniSetCallback(Object obj);

    public void requestAsync(long j, long j2, CommonProto.AffCgiRequest affCgiRequest) {
        jniRequestAsync(j, j2, affCgiRequest.toByteArray());
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
