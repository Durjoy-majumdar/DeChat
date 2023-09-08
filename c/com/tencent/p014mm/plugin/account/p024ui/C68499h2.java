package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import bc0.C67216a;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.account.ui.h2 */
public class C68499h2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C67216a f196770d;

    /* renamed from: e */
    public final /* synthetic */ C115102d2 f196771e;

    public C68499h2(C115102d2 d2Var, C67216a aVar) {
        this.f196771e = d2Var;
        this.f196770d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f196770d);
        C86709a0.m107524d().mo123470p(145, this.f196771e);
    }
}
