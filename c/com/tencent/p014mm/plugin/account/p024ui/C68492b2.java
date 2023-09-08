package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import f40.C86709a0;
import hg0.C76170j0;

/* renamed from: com.tencent.mm.plugin.account.ui.b2 */
public class C68492b2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C76170j0 f196754d;

    /* renamed from: e */
    public final /* synthetic */ C68493c2 f196755e;

    public C68492b2(C68493c2 c2Var, C76170j0 j0Var) {
        this.f196755e = c2Var;
        this.f196754d = j0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f196754d);
        C86709a0.m107524d().mo123470p(132, this.f196755e);
    }
}
