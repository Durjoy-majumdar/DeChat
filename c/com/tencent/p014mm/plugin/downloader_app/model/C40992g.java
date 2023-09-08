package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.DialogInterface;
import e51.C45543b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.g */
public class C40992g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53736a f110348d;

    /* renamed from: e */
    public final /* synthetic */ C45543b f110349e;

    public C40992g(C53736a aVar, C45543b bVar) {
        this.f110348d = aVar;
        this.f110349e = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C41008v.m44443c(this.f110348d.field_appId);
        C40983c.m44424f(this.f110348d, false, this.f110349e);
        dialogInterface.dismiss();
    }
}
