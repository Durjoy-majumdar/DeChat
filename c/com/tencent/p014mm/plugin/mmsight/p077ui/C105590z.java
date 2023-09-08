package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.z */
public class C105590z implements C96875r0.C96876a {

    /* renamed from: d */
    public final /* synthetic */ C105562q f314038d;

    public C105590z(C105562q qVar) {
        this.f314038d = qVar;
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        return 0;
    }

    public void onCompletion() {
        C105562q qVar = this.f314038d;
        int i = qVar.f313985d;
        if (i > 0) {
            qVar.f313989h.mo24787a((double) i, true);
        } else {
            qVar.f313989h.mo24787a(0.0d, true);
        }
    }

    public void onError(int i, int i2) {
    }

    public void onPrepared() {
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
    }
}
