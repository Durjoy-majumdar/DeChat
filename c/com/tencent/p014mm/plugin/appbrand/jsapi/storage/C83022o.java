package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81419l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import java.lang.ref.WeakReference;
import java.util.List;
import p1039tb.C90388a;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.o */
public class C83022o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeakReference f242731d;

    /* renamed from: e */
    public final /* synthetic */ int f242732e;

    /* renamed from: f */
    public final /* synthetic */ String f242733f;

    /* renamed from: g */
    public final /* synthetic */ int f242734g;

    /* renamed from: h */
    public final /* synthetic */ int f242735h;

    /* renamed from: i */
    public final /* synthetic */ long f242736i;

    /* renamed from: j */
    public final /* synthetic */ C83024q f242737j;

    public C83022o(C83024q qVar, WeakReference weakReference, int i, String str, int i2, int i3, long j) {
        this.f242737j = qVar;
        this.f242731d = weakReference;
        this.f242732e = i;
        this.f242733f = str;
        this.f242734g = i2;
        this.f242735h = i3;
        this.f242736i = j;
    }

    public void run() {
        C82554k kVar = (C82554k) this.f242731d.get();
        if (kVar != null) {
            Object[] Bh = ((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(kVar.getAppId(), this.f242732e, this.f242733f).mo56588Bh(this.f242734g, kVar.getAppId());
            List list = (List) Bh[0];
            int ceil = (int) Math.ceil(((Integer) Bh[1]).doubleValue() / 1000.0d);
            C83024q.m101831w(this.f242737j, list, ceil, (int) Math.ceil(((Integer) Bh[2]).doubleValue() / 1000.0d), kVar, this.f242735h);
            C83024q qVar = this.f242737j;
            int i = ceil * 1000;
            long j = this.f242736i;
            qVar.getClass();
            C81419l0.m99894a(2, 3, i, list == null ? 0 : list.size(), System.currentTimeMillis() - j, kVar);
        }
    }
}
