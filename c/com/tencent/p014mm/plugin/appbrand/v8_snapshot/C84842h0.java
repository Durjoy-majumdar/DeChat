package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.h0 */
public final class C84842h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ICommLibReader f247321d;

    /* renamed from: e */
    public final /* synthetic */ WxaPkgV8SnapshotInfo f247322e;

    /* renamed from: f */
    public final /* synthetic */ boolean f247323f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<CreateSnapshotResult, C13598b0> f247324g;

    public C84842h0(ICommLibReader iCommLibReader, WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, boolean z, C32226l<? super CreateSnapshotResult, C13598b0> lVar) {
        this.f247321d = iCommLibReader;
        this.f247322e = wxaPkgV8SnapshotInfo;
        this.f247323f = z;
        this.f247324g = lVar;
    }

    public final void run() {
        this.f247324g.invoke(C84841g0.f247320a.mo117579b(this.f247321d, this.f247322e, this.f247323f));
    }
}
