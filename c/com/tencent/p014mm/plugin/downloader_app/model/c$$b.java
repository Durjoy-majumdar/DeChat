package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.c$$b */
public class c$$b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f110316d;

    /* renamed from: e */
    public final /* synthetic */ C40990e0 f110317e;

    public c$$b(Context context, C40990e0 e0Var) {
        this.f110316d = context;
        this.f110317e = e0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C40983c.m44420b(this.f110316d, this.f110317e, false);
    }
}
