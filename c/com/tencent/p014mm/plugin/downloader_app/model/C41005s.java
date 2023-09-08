package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.DialogInterface;
import e51.C45543b;
import y41.C53491a;
import y41.C53493b;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.s */
public class C41005s implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C40979a f110371d;

    /* renamed from: e */
    public final /* synthetic */ C45543b f110372e;

    public C41005s(C40979a aVar, C45543b bVar) {
        this.f110371d = aVar;
        this.f110372e = bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C40983c.m44421c(this.f110371d, this.f110372e);
        C40979a aVar = this.f110371d;
        C53491a.m60013c(11, new C53493b(aVar.f110292d, aVar.f110299k, -1, "", (String) null, 1));
    }
}
