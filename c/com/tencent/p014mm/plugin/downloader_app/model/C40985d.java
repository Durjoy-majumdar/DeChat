package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import e51.C45542a;
import e51.C45543b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.d */
public class C40985d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53736a f110324d;

    /* renamed from: e */
    public final /* synthetic */ C45543b f110325e;

    public C40985d(C53736a aVar, C45543b bVar) {
        this.f110324d = aVar;
        this.f110325e = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C45542a aVar = C45542a.FAIL;
        C53736a aVar2 = this.f110324d;
        aVar2.field_status = 4;
        C40933j.m44322k(aVar2);
        C41008v.m44441a(this.f110324d.field_downloadId);
        C45543b bVar = this.f110325e;
        if (bVar != null) {
            bVar.mo63984a(aVar, this.f110324d.field_downloadId);
        }
        C45543b bVar2 = this.f110325e;
        if (bVar2 != null) {
            bVar2.mo63984a(aVar, this.f110324d.field_downloadId);
        }
    }
}
