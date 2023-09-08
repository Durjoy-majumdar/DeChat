package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i0 */
public final class C82242i0 implements C81590r.C29457a {

    /* renamed from: a */
    public final /* synthetic */ C82229d0 f241144a;

    public C82242i0(C82229d0 d0Var) {
        this.f241144a = d0Var;
    }

    /* renamed from: a */
    public final void mo56714a(MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel) {
        C87412m.m108594g(mMBackgroundRunningOperationParcel, "opParcel");
        String str = this.f241144a.f241115e;
        Log.m105924i(str, "onBackgroundRunningOperationReceived, opParcel: " + mMBackgroundRunningOperationParcel);
        if (C87412m.m108589b(mMBackgroundRunningOperationParcel.f239244d, this.f241144a.f241114d.f238147j) && C81583j.m100070b(mMBackgroundRunningOperationParcel.f239245e, 32) && mMBackgroundRunningOperationParcel.f239246f == 2) {
            C82250m.C82251a.m101007a(this.f241144a, false, 1, (Object) null);
        }
    }
}
