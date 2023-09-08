package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.Context;
import e51.C45542a;
import e51.C45543b;
import e51.C45545g;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.k */
public class C40996k implements C45545g.C45546a {

    /* renamed from: a */
    public final /* synthetic */ C53736a f110353a;

    /* renamed from: b */
    public final /* synthetic */ Context f110354b;

    /* renamed from: c */
    public final /* synthetic */ C45543b f110355c;

    /* renamed from: com.tencent.mm.plugin.downloader_app.model.k$a */
    public class C40997a implements C45543b {
        public C40997a() {
        }

        /* renamed from: a */
        public void mo63984a(C45542a aVar, long j) {
            C40983c.m44419a(C40996k.this.f110354b);
            C45543b bVar = C40996k.this.f110355c;
            if (bVar != null) {
                bVar.mo63984a(aVar, j);
            }
        }
    }

    public C40996k(C53736a aVar, Context context, C45543b bVar) {
        this.f110353a = aVar;
        this.f110354b = context;
        this.f110355c = bVar;
    }

    /* renamed from: a */
    public void mo63989a() {
        C41008v.m44443c(this.f110353a.field_appId);
        C40983c.m44424f(this.f110353a, false, new C40997a());
    }
}
