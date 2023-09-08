package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.DialogInterface;
import e51.C45543b;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.t */
public class C41006t implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C40979a f110373d;

    /* renamed from: e */
    public final /* synthetic */ C45543b f110374e;

    public C41006t(C40979a aVar, C45543b bVar) {
        this.f110373d = aVar;
        this.f110374e = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C41008v.m44443c(this.f110373d.f110292d);
        C40979a aVar = this.f110373d;
        aVar.f110300l = false;
        C40983c.m44421c(aVar, this.f110374e);
        dialogInterface.dismiss();
    }
}
