package com.tencent.kinda.framework.app;

import android.view.Choreographer;
import com.tencent.kinda.gen.IDeviceFrameDrawLoopCallback;
import com.tencent.kinda.gen.VoidI64Callback;
import com.tencent.tav.coremedia.TimeUtil;

public class KindaDeviceFrameDrawLoopCallback implements IDeviceFrameDrawLoopCallback {
    private Choreographer choreographer = Choreographer.getInstance();
    private Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() {
        public void doFrame(long j) {
            KindaDeviceFrameDrawLoopCallback.this.onDoFrame(j);
        }
    };
    private VoidI64Callback frameDrawCallback;
    private volatile boolean isStart = false;

    public void onDoFrame(long j) {
        this.frameDrawCallback.call(j / TimeUtil.SECOND_TO_US);
        if (this.isStart) {
            this.choreographer.postFrameCallback(this.frameCallback);
        }
    }

    public void startListenerImpl(VoidI64Callback voidI64Callback) {
        this.isStart = true;
        this.frameDrawCallback = voidI64Callback;
        this.choreographer.removeFrameCallback(this.frameCallback);
        this.choreographer.postFrameCallback(this.frameCallback);
    }

    public void stopListener() {
        this.isStart = false;
        this.choreographer.removeFrameCallback(this.frameCallback);
    }
}
