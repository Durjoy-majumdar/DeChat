package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.ResultReceiver;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import fy3.C32224a;
import lu3.C34379c;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.a */
public final class C84830a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AndroidWxaCommLibV8SnapshotService f247285d;

    /* renamed from: e */
    public final /* synthetic */ ICommLibReader f247286e;

    /* renamed from: f */
    public final /* synthetic */ boolean f247287f;

    /* renamed from: g */
    public final /* synthetic */ WxaPkgV8SnapshotInfo f247288g;

    /* renamed from: h */
    public final /* synthetic */ boolean f247289h;

    /* renamed from: i */
    public final /* synthetic */ ResultReceiver f247290i;

    /* renamed from: j */
    public final /* synthetic */ C32224a<C34379c<?>> f247291j;

    public C84830a(AndroidWxaCommLibV8SnapshotService androidWxaCommLibV8SnapshotService, ICommLibReader iCommLibReader, boolean z, WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, boolean z2, ResultReceiver resultReceiver, C32224a<? extends C34379c<?>> aVar) {
        this.f247285d = androidWxaCommLibV8SnapshotService;
        this.f247286e = iCommLibReader;
        this.f247287f = z;
        this.f247288g = wxaPkgV8SnapshotInfo;
        this.f247289h = z2;
        this.f247290i = resultReceiver;
        this.f247291j = aVar;
    }

    public final void run() {
        this.f247285d.f247246d.add(this.f247286e);
        this.f247285d.mo117515a(this.f247290i, this.f247287f ? C84841g0.f247320a.mo117578a(this.f247286e, this.f247288g) : C84841g0.f247320a.mo117579b(this.f247286e, this.f247288g, this.f247289h));
        this.f247285d.f247246d.remove(this.f247286e);
        this.f247291j.invoke();
    }
}
