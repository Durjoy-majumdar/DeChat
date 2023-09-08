package com.tencent.p014mm.plugin.dbbackup;

import android.content.Context;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.dbbackup.b$$g */
public final /* synthetic */ class b$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89779i0 f12189d;

    /* renamed from: e */
    public final /* synthetic */ Context f12190e;

    /* renamed from: f */
    public final /* synthetic */ String f12191f;

    public /* synthetic */ b$$g(C89779i0 i0Var, Context context, String str) {
        this.f12189d = i0Var;
        this.f12190e = context;
        this.f12191f = str;
    }

    public final void run() {
        C89779i0 i0Var = this.f12189d;
        Context context = this.f12190e;
        String str = this.f12191f;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C76879j.m92748s(context, str, "");
    }
}
