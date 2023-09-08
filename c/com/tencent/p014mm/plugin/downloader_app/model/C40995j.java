package com.tencent.p014mm.plugin.downloader_app.model;

import com.tencent.p014mm.plugin.downloader.model.C40933j;
import e51.C45545g;
import java.util.Iterator;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.j */
public class C40995j implements C45545g.C45546a {

    /* renamed from: a */
    public final /* synthetic */ C40990e0 f110352a;

    public C40995j(C40990e0 e0Var) {
        this.f110352a = e0Var;
    }

    /* renamed from: a */
    public void mo63989a() {
        C53736a d = C40933j.m44315d(this.f110352a.f110335f);
        if (d != null) {
            d.field_downloadInWifi = true;
            d.field_reserveInWifi = true;
            C40933j.m44322k(d);
            String str = d.field_appId;
            Iterator<v$$f> it = C41008v.f110379e.iterator();
            while (it.hasNext()) {
                it.next().mo64030a(str);
            }
        }
    }
}
