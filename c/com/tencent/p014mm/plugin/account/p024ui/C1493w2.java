package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import com.tencent.p014mm.modelsimple.C114735a0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.account.ui.w2 */
public class C1493w2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C114735a0 f10846d;

    public C1493w2(RegByMobileRegAIOUI regByMobileRegAIOUI, C114735a0 a0Var) {
        this.f10846d = a0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f10846d);
    }
}
