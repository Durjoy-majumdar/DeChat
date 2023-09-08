package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import f40.C86709a0;
import hg0.C76170j0;

/* renamed from: com.tencent.mm.plugin.account.ui.a2 */
public class C68491a2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C76170j0 f196752d;

    /* renamed from: e */
    public final /* synthetic */ C68493c2 f196753e;

    public C68491a2(C68493c2 c2Var, C76170j0 j0Var) {
        this.f196753e = c2Var;
        this.f196752d = j0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f196752d);
        C86709a0.m107524d().mo123470p(132, this.f196753e);
    }
}
