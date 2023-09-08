package com.tencent.p014mm.plugin.dbbackup;

import android.content.Context;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.dbbackup.b$$j */
public final /* synthetic */ class b$$j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89779i0 f12192d;

    /* renamed from: e */
    public final /* synthetic */ Context f12193e;

    public /* synthetic */ b$$j(C89779i0 i0Var, Context context) {
        this.f12192d = i0Var;
        this.f12193e = context;
    }

    public final void run() {
        C89779i0 i0Var = this.f12192d;
        Context context = this.f12193e;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C76879j.m92748s(context, "损坏信息已保存", "");
    }
}
