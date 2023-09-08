package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import bc0.C67216a;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.account.ui.o0 */
public class C115146o0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C67216a f345184d;

    public C115146o0(LoginSmsUI loginSmsUI, C67216a aVar) {
        this.f345184d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f345184d);
    }
}
