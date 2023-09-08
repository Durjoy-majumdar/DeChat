package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.n */
public class C41000n implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f110363d;

    /* renamed from: e */
    public final /* synthetic */ C40990e0 f110364e;

    public C41000n(Context context, C40990e0 e0Var) {
        this.f110363d = context;
        this.f110364e = e0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C40983c.m44420b(this.f110363d, this.f110364e, false);
    }
}
