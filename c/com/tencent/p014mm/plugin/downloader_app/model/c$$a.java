package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.DialogInterface;
import e51.C45543b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.c$$a */
public final /* synthetic */ class c$$a implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C53736a f110314d;

    /* renamed from: e */
    public final /* synthetic */ C45543b f110315e;

    public /* synthetic */ c$$a(C53736a aVar, C45543b bVar) {
        this.f110314d = aVar;
        this.f110315e = bVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C40983c.m44425g(this.f110314d, this.f110315e);
    }
}
