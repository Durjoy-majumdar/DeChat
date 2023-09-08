package com.tencent.wechat.p326mm.biz;

import com.google.protobuf.C23922p0;
import com.tencent.wechat.p326mm.biz.BizProto;

/* renamed from: com.tencent.wechat.mm.biz.BizDynamicCardMrg */
public class BizDynamicCardMrg {
    private static BizDynamicCardMrg instance = new BizDynamicCardMrg();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    /* renamed from: com.tencent.wechat.mm.biz.BizDynamicCardMrg$Callback */
    public interface Callback {
        void onAdServerInfoEvent(String str);

        void onDynamicCardInfoEvent(int i, long j, String str, String str2);
    }

    private BizDynamicCardMrg() {
        jniCreateBizDynamicCardMrg();
    }

    public static BizDynamicCardMrg getInstance() {
        return instance;
    }

    private native void jniCreateBizDynamicCardMrg();

    private native void jniSetCallback(Object obj);

    private native void jnicallOnAdServerInfo(String str);

    private native void jnicallOnDynamicCardInfo(int i, long j, String str, String str2);

    private native boolean jnideleteDynamicCard(long j, int i);

    private native byte[] jnigetAllDynamicCardInfo(int i);

    private native void jnimockInsertCanvas(int i, String str, String str2);

    private native boolean jnisetAdCardRequestInfo(long j, String str);

    private native boolean jnisetAdRequestInfo(String str, String str2);

    public void callOnAdServerInfo(String str) {
        jnicallOnAdServerInfo(str);
    }

    public void callOnDynamicCardInfo(int i, long j, String str, String str2) {
        jnicallOnDynamicCardInfo(i, j, str, str2);
    }

    public boolean deleteDynamicCard(long j, int i) {
        return jnideleteDynamicCard(j, i);
    }

    public BizProto.DynamicCardInfoList getAllDynamicCardInfo(int i) {
        try {
            return BizProto.DynamicCardInfoList.parseFrom(jnigetAllDynamicCardInfo(i));
        } catch (C23922p0 unused) {
            return null;
        }
    }

    public void mockInsertCanvas(int i, String str, String str2) {
        jnimockInsertCanvas(i, str, str2);
    }

    public boolean setAdCardRequestInfo(long j, String str) {
        return jnisetAdCardRequestInfo(j, str);
    }

    public boolean setAdRequestInfo(String str, String str2) {
        return jnisetAdRequestInfo(str, str2);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
