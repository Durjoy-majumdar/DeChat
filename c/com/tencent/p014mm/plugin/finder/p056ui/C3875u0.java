package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import di3.C86312j;
import ht1.C8794p5;
import te3.C64707sc1;

/* renamed from: com.tencent.mm.plugin.finder.ui.u0 */
public final class C3875u0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f17428d;

    /* renamed from: e */
    public final /* synthetic */ C8794p5<C64707sc1> f17429e;

    public C3875u0(String str, C8794p5<C64707sc1> p5Var) {
        this.f17428d = str;
        this.f17429e = p5Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3603n1 n1Var = (C3603n1) C86312j.m106911c(C3603n1.class);
        String str = this.f17428d;
        if (str == null) {
            str = "";
        }
        n1Var.mo3969Xt(str, true, this.f17429e);
    }
}
