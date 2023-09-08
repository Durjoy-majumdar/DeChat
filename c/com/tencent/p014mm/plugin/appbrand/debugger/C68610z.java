package com.tencent.p014mm.plugin.appbrand.debugger;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.z */
public class C68610z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RemoteDebugMoveView f197075d;

    public C68610z(RemoteDebugMoveView remoteDebugMoveView) {
        this.f197075d = remoteDebugMoveView;
    }

    public void run() {
        float y = this.f197075d.getY() + ((float) this.f197075d.getHeight());
        RemoteDebugMoveView remoteDebugMoveView = this.f197075d;
        int i = remoteDebugMoveView.f197034e;
        if (y > ((float) i)) {
            remoteDebugMoveView.setY((float) (i - remoteDebugMoveView.getHeight()));
        }
    }
}
