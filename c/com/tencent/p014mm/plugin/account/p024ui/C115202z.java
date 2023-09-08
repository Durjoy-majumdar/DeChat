package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import bc0.C67216a;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.account.ui.z */
public class C115202z implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C67216a f345246d;

    public C115202z(LoginByMobileSendSmsUI loginByMobileSendSmsUI, C67216a aVar) {
        this.f345246d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f345246d);
    }
}
