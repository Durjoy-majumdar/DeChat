package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.SystemClock;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import di0.C7331m;
import di0.C86293g;
import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.d */
public final class C84836d extends C86301e implements C86293g {
    /* renamed from: Im */
    public C7331m mo117568Im() {
        C84840f0 f0Var = C84840f0.f247297a;
        f0Var.getClass();
        if (!C84840f0.f247299c) {
            WxaPkgV8SnapshotInfo b = C84874w.f247383a.mo117627b();
            if (b == null) {
                return null;
            }
            NodeFakeCommLibReader nodeFakeCommLibReader = new NodeFakeCommLibReader((IPkgInfo) null, 1, (C8480h) null);
            if (!b.mo117551a(nodeFakeCommLibReader, f0Var.mo117577i(nodeFakeCommLibReader, C84872v0.NODE))) {
                return null;
            }
            return new C7331m(b.f247273i, b.mo117552c());
        }
        SystemClock.elapsedRealtime();
        WxaPkgV8SnapshotInfo b2 = C84874w.f247383a.mo117627b();
        if (b2 == null) {
            return null;
        }
        NodeFakeCommLibReader nodeFakeCommLibReader2 = new NodeFakeCommLibReader((IPkgInfo) null, 1, (C8480h) null);
        if (!b2.mo117551a(nodeFakeCommLibReader2, f0Var.mo117577i(nodeFakeCommLibReader2, C84872v0.NODE))) {
            return null;
        }
        return new C7331m(b2.f247273i, b2.mo117552c());
    }
}
