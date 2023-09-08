package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.Context;
import e51.C45542a;
import e51.C45543b;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.p */
public class C41002p implements C45543b {

    /* renamed from: a */
    public final /* synthetic */ Context f110365a;

    /* renamed from: b */
    public final /* synthetic */ C45543b f110366b;

    public C41002p(Context context, C45543b bVar) {
        this.f110365a = context;
        this.f110366b = bVar;
    }

    /* renamed from: a */
    public void mo63984a(C45542a aVar, long j) {
        if (aVar == C45542a.OK) {
            C40983c.m44419a(this.f110365a);
        }
        C45543b bVar = this.f110366b;
        if (bVar != null) {
            bVar.mo63984a(aVar, j);
        }
    }
}
