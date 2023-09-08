package com.tencent.p014mm.plugin.appbrand.debugger;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.y */
public class C68609y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RemoteDebugMoveView f197074d;

    public C68609y(RemoteDebugMoveView remoteDebugMoveView) {
        this.f197074d = remoteDebugMoveView;
    }

    public void run() {
        RemoteDebugMoveView remoteDebugMoveView = this.f197074d;
        int i = remoteDebugMoveView.f197033d;
        int width = remoteDebugMoveView.getWidth();
        if (width <= 0) {
            width = C76577a.m92151b(remoteDebugMoveView.getContext(), 200);
        }
        remoteDebugMoveView.setX((float) (i - width));
        this.f197074d.setY((float) ((int) (C76577a.m92156g(MMApplicationContext.getContext()) * 120.0f)));
    }
}
