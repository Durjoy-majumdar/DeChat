package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.i0 */
public final class C84844i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ICommLibReader f247326d;

    /* renamed from: e */
    public final /* synthetic */ WxaPkgV8SnapshotInfo f247327e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<CreateSnapshotResult, C13598b0> f247328f;

    public C84844i0(ICommLibReader iCommLibReader, WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, C32226l<? super CreateSnapshotResult, C13598b0> lVar) {
        this.f247326d = iCommLibReader;
        this.f247327e = wxaPkgV8SnapshotInfo;
        this.f247328f = lVar;
    }

    public final void run() {
        this.f247328f.invoke(C84841g0.f247320a.mo117578a(this.f247326d, this.f247327e));
    }
}
