package com.tencent.p014mm.plugin.downloader.model;

import org.json.JSONObject;
import p237sp.C13747c0;
import p237sp.C90271s;

/* renamed from: com.tencent.mm.plugin.downloader.model.e0 */
public class C2201e0 implements C13747c0.C13748a {

    /* renamed from: a */
    public final /* synthetic */ C90271s.C13751b f12218a;

    public C2201e0(C90271s.C13751b bVar) {
        this.f12218a = bVar;
    }

    /* renamed from: a */
    public void mo287a(String str, JSONObject jSONObject) {
        if (str != null) {
            this.f12218a.mo13120b(C2205h0.m2038a(str), str);
        } else {
            this.f12218a.mo13120b(0, "none");
        }
    }
}
