package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import com.tencent.p014mm.modelsimple.C114735a0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.account.ui.t0 */
public class C1488t0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C114735a0 f10834d;

    /* renamed from: e */
    public final /* synthetic */ LoginUI f10835e;

    public C1488t0(LoginUI loginUI, C114735a0 a0Var) {
        this.f10835e = loginUI;
        this.f10834d = a0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f10834d);
        C86709a0.m107524d().mo123470p(252, this.f10835e);
        C86709a0.m107524d().mo123470p(701, this.f10835e);
    }
}
