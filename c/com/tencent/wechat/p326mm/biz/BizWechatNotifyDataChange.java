package com.tencent.wechat.p326mm.biz;

/* renamed from: com.tencent.wechat.mm.biz.BizWechatNotifyDataChange */
public class BizWechatNotifyDataChange {
    private static BizWechatNotifyDataChange instance = new BizWechatNotifyDataChange();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    /* renamed from: com.tencent.wechat.mm.biz.BizWechatNotifyDataChange$Callback */
    public interface Callback {
        void onDataChangeEvent(int i);

        void onIDKeyEvent(int i, int i2, int i3);

        void onInitDoneEvent(boolean z);

        void onKVEvent(int i, String str);
    }

    private BizWechatNotifyDataChange() {
        jniCreateBizWechatNotifyDataChange();
    }

    public static BizWechatNotifyDataChange getInstance() {
        return instance;
    }

    private native void jniCreateBizWechatNotifyDataChange();

    private native void jniSetCallback(Object obj);

    private native void jnicallOnDataChange(int i);

    private native void jnicallOnIDKey(int i, int i2, int i3);

    private native void jnicallOnInitDone(boolean z);

    private native void jnicallOnKV(int i, String str);

    public void callOnDataChange(int i) {
        jnicallOnDataChange(i);
    }

    public void callOnIDKey(int i, int i2, int i3) {
        jnicallOnIDKey(i, i2, i3);
    }

    public void callOnInitDone(boolean z) {
        jnicallOnInitDone(z);
    }

    public void callOnKV(int i, String str) {
        jnicallOnKV(i, str);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
