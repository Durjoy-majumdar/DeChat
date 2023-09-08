package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.q0 */
public final class C84862q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WxaPkgV8SnapshotInfo f247357d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<WxaPkgV8SnapshotInfo, WxaPkgV8SnapshotInfo> f247358e;

    public C84862q0(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, C32226l<? super WxaPkgV8SnapshotInfo, WxaPkgV8SnapshotInfo> lVar) {
        this.f247357d = wxaPkgV8SnapshotInfo;
        this.f247358e = lVar;
    }

    public final void run() {
        WxaPkgV8SnapshotInfo a;
        C84852n0 n0Var = C84852n0.f247339d;
        C84878x0 O = n0Var.mo117596O();
        if (O != null) {
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f247357d;
            C84875w0 bD = O.mo117634bD(wxaPkgV8SnapshotInfo.f247270f, wxaPkgV8SnapshotInfo.f247272h);
            if (!(bD == null || (a = WxaPkgV8SnapshotInfo.f247265v.mo117562a(bD)) == null)) {
                n0Var.mo117595D(this.f247358e.invoke(a));
                return;
            }
        }
        Log.m105920e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "markConsumeSnapshot, realSnapshotInfo is null");
    }
}
