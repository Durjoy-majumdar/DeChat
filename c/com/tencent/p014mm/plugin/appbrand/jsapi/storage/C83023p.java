package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81419l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.p */
public class C83023p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JsApiGetStorageInfoTask f242738d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference f242739e;

    /* renamed from: f */
    public final /* synthetic */ int f242740f;

    /* renamed from: g */
    public final /* synthetic */ long f242741g;

    /* renamed from: h */
    public final /* synthetic */ C83024q f242742h;

    public C83023p(C83024q qVar, JsApiGetStorageInfoTask jsApiGetStorageInfoTask, WeakReference weakReference, int i, long j) {
        this.f242742h = qVar;
        this.f242738d = jsApiGetStorageInfoTask;
        this.f242739e = weakReference;
        this.f242740f = i;
        this.f242741g = j;
    }

    public void run() {
        this.f242738d.mo114397h();
        C82554k kVar = (C82554k) this.f242739e.get();
        if (kVar != null) {
            C83024q qVar = this.f242742h;
            JsApiGetStorageInfoTask jsApiGetStorageInfoTask = this.f242738d;
            C83024q.m101831w(qVar, jsApiGetStorageInfoTask.f242663h, jsApiGetStorageInfoTask.f242664i, jsApiGetStorageInfoTask.f242665j, kVar, this.f242740f);
            C83024q qVar2 = this.f242742h;
            JsApiGetStorageInfoTask jsApiGetStorageInfoTask2 = this.f242738d;
            ArrayList<String> arrayList = jsApiGetStorageInfoTask2.f242663h;
            int i = jsApiGetStorageInfoTask2.f242664i * 1000;
            long j = this.f242741g;
            qVar2.getClass();
            C81419l0.m99894a(1, 3, i, arrayList == null ? 0 : arrayList.size(), System.currentTimeMillis() - j, kVar);
            this.f242738d.mo114397h();
        }
    }
}
