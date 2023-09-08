package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import f40.C86709a0;
import hg0.C59887l0;

/* renamed from: com.tencent.mm.plugin.account.ui.n */
public class C115138n implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C59887l0 f345174d;

    public C115138n(EmailVerifyUI emailVerifyUI, C59887l0 l0Var) {
        this.f345174d = l0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f345174d);
    }
}
