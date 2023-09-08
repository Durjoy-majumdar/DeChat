package com.tencent.p014mm.plugin.appbrand.debugger;

import android.view.ViewGroup;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.k0 */
public class C68598k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C68600m0 f197044d;

    public C68598k0(C68600m0 m0Var) {
        this.f197044d = m0Var;
    }

    public void run() {
        C68600m0 m0Var = this.f197044d;
        RemoteDebugMoveView remoteDebugMoveView = m0Var.f197048f;
        int width = m0Var.getWidth();
        int height = this.f197044d.getHeight();
        remoteDebugMoveView.getClass();
        remoteDebugMoveView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        remoteDebugMoveView.f197033d = width;
        remoteDebugMoveView.f197034e = height;
        remoteDebugMoveView.post(new C68609y(remoteDebugMoveView));
        C68600m0 m0Var2 = this.f197044d;
        m0Var2.addView(m0Var2.f197048f);
    }
}
