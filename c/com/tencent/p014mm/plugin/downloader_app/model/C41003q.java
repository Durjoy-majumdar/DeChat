package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.DialogInterface;
import e51.C45543b;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.q */
public class C41003q implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C40979a f110367d;

    /* renamed from: e */
    public final /* synthetic */ C45543b f110368e;

    public C41003q(C40979a aVar, C45543b bVar) {
        this.f110367d = aVar;
        this.f110368e = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C40979a aVar = this.f110367d;
        aVar.f110300l = false;
        C40983c.m44421c(aVar, this.f110368e);
    }
}
