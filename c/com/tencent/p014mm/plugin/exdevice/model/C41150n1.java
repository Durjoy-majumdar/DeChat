package com.tencent.p014mm.plugin.exdevice.model;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.exdevice.model.n1 */
public class C41150n1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C41124e1 f110859d;

    /* renamed from: e */
    public final /* synthetic */ C41152o1 f110860e;

    public C41150n1(C41152o1 o1Var, C41124e1 e1Var) {
        this.f110860e = o1Var;
        this.f110859d = e1Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107529k().f251779b.mo123458d(this.f110859d);
        GetA8KeyRedirectEvent getA8KeyRedirectEvent = this.f110860e.f110866e;
        Runnable runnable = getA8KeyRedirectEvent.callback;
        if (runnable != null) {
            getA8KeyRedirectEvent.f107574e.f107579a = 1;
            runnable.run();
        }
    }
}
