package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.Context;
import c51.C39896e;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import e51.C45542a;
import e51.C45543b;
import e51.C45545g;
import java.util.Iterator;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.l */
public class C40998l implements C45545g.C45546a {

    /* renamed from: a */
    public final /* synthetic */ C53736a f110357a;

    /* renamed from: b */
    public final /* synthetic */ Context f110358b;

    /* renamed from: c */
    public final /* synthetic */ C45543b f110359c;

    /* renamed from: d */
    public final /* synthetic */ long f110360d;

    public C40998l(C53736a aVar, Context context, C45543b bVar, long j) {
        this.f110357a = aVar;
        this.f110358b = context;
        this.f110359c = bVar;
        this.f110360d = j;
    }

    /* renamed from: a */
    public void mo63989a() {
        C53736a aVar = this.f110357a;
        aVar.field_downloadInWifi = false;
        aVar.field_reserveInWifi = false;
        C40933j.m44322k(aVar);
        C39896e.m42675c(this.f110358b, this.f110357a.field_appId);
        C53736a aVar2 = this.f110357a;
        if (aVar2.field_status == 0) {
            String str = aVar2.field_appId;
            Iterator<v$$i> it = C41008v.f110381g.iterator();
            while (it.hasNext()) {
                it.next().mo64033a(str);
            }
        }
        C45543b bVar = this.f110359c;
        if (bVar != null) {
            bVar.mo63984a(C45542a.CANCEL, this.f110360d);
        }
    }
}
