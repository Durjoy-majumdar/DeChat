package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.DialogInterface;
import e51.C45543b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.e */
public class C40989e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53736a f110328d;

    /* renamed from: e */
    public final /* synthetic */ C45543b f110329e;

    public C40989e(C53736a aVar, C45543b bVar) {
        this.f110328d = aVar;
        this.f110329e = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C41008v.m44443c(this.f110328d.field_appId);
        C40983c.m44424f(this.f110328d, false, this.f110329e);
    }
}
