package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import com.tencent.p014mm.modelsimple.C114735a0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.account.ui.k0 */
public class C115131k0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C114735a0 f345156d;

    public C115131k0(LoginIndepPass loginIndepPass, C114735a0 a0Var) {
        this.f345156d = a0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f345156d);
    }
}
