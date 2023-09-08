package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import com.tencent.p014mm.modelsimple.C114735a0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.account.ui.l0 */
public class C68502l0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C114735a0 f196773d;

    /* renamed from: e */
    public final /* synthetic */ LoginPasswordUI f196774e;

    public C68502l0(LoginPasswordUI loginPasswordUI, C114735a0 a0Var) {
        this.f196774e = loginPasswordUI;
        this.f196773d = a0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f196773d);
        LoginPasswordUI loginPasswordUI = this.f196774e;
        loginPasswordUI.getClass();
        C86709a0.m107524d().mo123470p(701, loginPasswordUI);
        C86709a0.m107524d().mo123470p(252, loginPasswordUI);
    }
}
