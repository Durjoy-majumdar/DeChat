package com.tencent.wechat.aff.ting;

import com.tencent.wechat.aff.ting.TingClientProto;

public class TingPlayUrlReplace {
    private static TingPlayUrlReplace instance = new TingPlayUrlReplace();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void onReplaceComplete(int i);

        void onReplaceCompleteEvent(long j, int i, String str, TingClientProto.TingPlayItem tingPlayItem);
    }

    private TingPlayUrlReplace() {
        jniCreateTingPlayUrlReplace();
    }

    public static TingPlayUrlReplace getInstance() {
        return instance;
    }

    private native void jniCreateTingPlayUrlReplace();

    private native void jniReplaceAsync(int i, long j, byte[] bArr);

    private native void jniSetCallback(Object obj);

    public void replaceAsync(int i, long j, TingClientProto.TingItem tingItem) {
        jniReplaceAsync(i, j, tingItem.toByteArray());
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
