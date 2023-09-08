package com.tencent.p014mm.plugin.appbrand.debugger;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.l0 */
public class C68599l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C68600m0 f197045d;

    public C68599l0(C68600m0 m0Var) {
        this.f197045d = m0Var;
    }

    public void run() {
        C68600m0 m0Var = this.f197045d;
        if (m0Var.f197047e == null) {
            Log.m105928w("MicroMsg.RemoteDebugView", "showDebugView mContentView is null");
        } else if (m0Var.mo94268c()) {
            this.f197045d.setVisibility(0);
            C68600m0 m0Var2 = this.f197045d;
            if (m0Var2.f197047e.indexOfChild(m0Var2) == -1) {
                C68600m0 m0Var3 = this.f197045d;
                m0Var3.f197047e.addView(m0Var3);
            }
            C68600m0 m0Var4 = this.f197045d;
            m0Var4.f197047e.bringChildToFront(m0Var4);
            C68600m0 m0Var5 = this.f197045d;
            m0Var5.setBackgroundColor(m0Var5.getContext().getResources().getColor(C0966R.color.f3552xi));
        } else {
            C68600m0 m0Var6 = this.f197045d;
            m0Var6.setBackgroundColor(m0Var6.getContext().getResources().getColor(C0966R.color.ahf));
        }
    }
}
