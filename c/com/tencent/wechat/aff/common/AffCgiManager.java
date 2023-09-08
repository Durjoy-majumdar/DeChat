package com.tencent.wechat.aff.common;

import com.tencent.wechat.aff.common.CommonProto;

public class AffCgiManager {
    private static AffCgiManager instance = new AffCgiManager();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void onGetProxyIlinkComplete(long j, boolean z);

        void onNotifyResponseComplete(long j);

        void onRequestCgiEvent(long j, CommonProto.AffCgiRequest affCgiRequest);

        void onRequestComplete(long j);

        void onSetProxyIlinkComplete(long j);
    }

    private AffCgiManager() {
        jniCreateAffCgiManager();
    }

    public static AffCgiManager getInstance() {
        return instance;
    }

    private native void jniCreateAffCgiManager();

    private native void jniGetProxyIlinkAsync(long j);

    private native void jniNotifyResponseAsync(long j, long j2, byte[] bArr);

    private native void jniRequestAsync(long j, long j2, byte[] bArr);

    private native void jniSetCallback(Object obj);

    private native void jniSetProxyIlinkAsync(long j, boolean z);

    public void getProxyIlinkAsync(long j) {
        jniGetProxyIlinkAsync(j);
    }

    public void notifyResponseAsync(long j, long j2, CommonProto.AffCgiResponse affCgiResponse) {
        jniNotifyResponseAsync(j, j2, affCgiResponse.toByteArray());
    }

    public void requestAsync(long j, long j2, CommonProto.AffCgiRequest affCgiRequest) {
        jniRequestAsync(j, j2, affCgiRequest.toByteArray());
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void setProxyIlinkAsync(long j, boolean z) {
        jniSetProxyIlinkAsync(j, z);
    }
}
