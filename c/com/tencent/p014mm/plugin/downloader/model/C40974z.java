package com.tencent.p014mm.plugin.downloader.model;

import e51.C45545g;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13747c0;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.model.z */
public class C40974z implements C45545g.C45546a {

    /* renamed from: a */
    public final /* synthetic */ long f110273a;

    /* renamed from: b */
    public final /* synthetic */ C13747c0.C13748a f110274b;

    /* renamed from: c */
    public final /* synthetic */ JSONObject f110275c;

    public C40974z(long j, C13747c0.C13748a aVar, JSONObject jSONObject) {
        this.f110273a = j;
        this.f110274b = aVar;
        this.f110275c = jSONObject;
    }

    /* renamed from: a */
    public void mo63989a() {
        C53736a c = C40933j.m44314c(this.f110273a);
        if (c == null) {
            this.f110274b.mo287a((String) null, (JSONObject) null);
            return;
        }
        try {
            this.f110275c.put("reserve_for_wifi", 1);
        } catch (JSONException unused) {
        }
        c.field_downloadInWifi = true;
        c.field_reserveInWifi = true;
        C40933j.m44322k(c);
        this.f110274b.mo287a("", this.f110275c);
    }
}
