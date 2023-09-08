package com.tencent.p014mm.plugin.downloader.model;

import e51.C45545g;
import org.json.JSONObject;
import p237sp.C13747c0;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.model.y */
public class C40973y implements C45545g.C45546a {

    /* renamed from: a */
    public final /* synthetic */ long f110271a;

    /* renamed from: b */
    public final /* synthetic */ C13747c0.C13748a f110272b;

    public C40973y(long j, C13747c0.C13748a aVar) {
        this.f110271a = j;
        this.f110272b = aVar;
    }

    /* renamed from: a */
    public void mo63989a() {
        C53736a c = C40933j.m44314c(this.f110271a);
        if (c == null) {
            this.f110272b.mo287a((String) null, (JSONObject) null);
            return;
        }
        c.field_downloadInWifi = false;
        c.field_reserveInWifi = false;
        C40933j.m44322k(c);
        this.f110272b.mo287a("", (JSONObject) null);
    }
}
