package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import e51.C45542a;
import e51.C45543b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.m */
public class C40999m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C40979a f110361d;

    /* renamed from: e */
    public final /* synthetic */ C45543b f110362e;

    public C40999m(C40979a aVar, C45543b bVar) {
        this.f110361d = aVar;
        this.f110362e = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C53736a d = C40933j.m44315d(this.f110361d.f110292d);
        if (d != null) {
            d.field_status = 4;
            C40933j.m44322k(d);
        } else {
            d = new C53736a();
            d.field_downloadId = System.currentTimeMillis();
            C40979a aVar = this.f110361d;
            d.field_appId = aVar.f110292d;
            d.field_downloadUrl = aVar.f110289a;
            d.field_status = 4;
            C40933j.m44312a(d);
        }
        C41008v.m44441a(d.field_downloadId);
        C45543b bVar = this.f110362e;
        if (bVar != null) {
            bVar.mo63984a(C45542a.FAIL, d.field_downloadId);
        }
    }
}
