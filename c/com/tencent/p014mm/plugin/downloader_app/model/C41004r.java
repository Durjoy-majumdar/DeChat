package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.DialogInterface;
import e51.C45543b;
import y41.C53491a;
import y41.C53493b;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.r */
public class C41004r implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C40979a f110369d;

    /* renamed from: e */
    public final /* synthetic */ C45543b f110370e;

    public C41004r(C40979a aVar, C45543b bVar) {
        this.f110369d = aVar;
        this.f110370e = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C40983c.m44421c(this.f110369d, this.f110370e);
        C40979a aVar = this.f110369d;
        C53491a.m60013c(11, new C53493b(aVar.f110292d, aVar.f110299k, -1, "", (String) null, 1));
    }
}
