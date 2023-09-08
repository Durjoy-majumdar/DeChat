package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.DialogInterface;
import g51.C45880a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.h */
public class C40993h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C40990e0 f110350d;

    public C40993h(C40990e0 e0Var) {
        this.f110350d = e0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C40990e0 e0Var = this.f110350d;
        if (e0Var != null) {
            int a = C45880a.m51162a(e0Var.f110332c);
            C40990e0 e0Var2 = this.f110350d;
            C45880a.m51163b(10, a, e0Var2.f110333d, 4, e0Var2.f110335f, "", "");
        }
        dialogInterface.dismiss();
    }
}
