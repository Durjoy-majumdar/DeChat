package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import com.tencent.p014mm.modelsimple.C114739c0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.account.ui.x1 */
public class C115198x1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C114739c0 f345242d;

    public C115198x1(MobileLoginOrForceReg mobileLoginOrForceReg, C114739c0 c0Var) {
        this.f345242d = c0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f345242d);
    }
}
