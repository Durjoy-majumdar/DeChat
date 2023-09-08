package com.tencent.wechat.p326mm.biz;

/* renamed from: com.tencent.wechat.mm.biz.BizCanvasDataChangeNotify */
public class BizCanvasDataChangeNotify {
    private static BizCanvasDataChangeNotify instance = new BizCanvasDataChangeNotify();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    /* renamed from: com.tencent.wechat.mm.biz.BizCanvasDataChangeNotify$Callback */
    public interface Callback {
        void onDataChangeEvent(int i);
    }

    private BizCanvasDataChangeNotify() {
        jniCreateBizCanvasDataChangeNotify();
    }

    public static BizCanvasDataChangeNotify getInstance() {
        return instance;
    }

    private native void jniCreateBizCanvasDataChangeNotify();

    private native void jniSetCallback(Object obj);

    private native void jnicallOnDataChange(int i);

    public void callOnDataChange(int i) {
        jnicallOnDataChange(i);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
