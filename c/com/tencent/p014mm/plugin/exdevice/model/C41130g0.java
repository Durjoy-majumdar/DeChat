package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.model.C41125f0;
import com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager;
import com.tencent.p014mm.plugin.exdevice.service.C41191f;
import com.tencent.p014mm.sdk.platformtools.Log;
import y71.C53499i;

/* renamed from: com.tencent.mm.plugin.exdevice.model.g0 */
public class C41130g0 extends C41191f.C41192a {

    /* renamed from: e */
    public final /* synthetic */ C41125f0.C41127b f110800e;

    /* renamed from: f */
    public final /* synthetic */ C41125f0 f110801f;

    public C41130g0(C41125f0 f0Var, C41125f0.C41127b bVar) {
        this.f110801f = f0Var;
        this.f110800e = bVar;
    }

    public void k20(long j, int i, int i2, int i3, long j2) {
        String str = C41125f0.f110792h;
        Log.m105919d(str, "mac=%d, oldState=%d, newState=%d, errCode=%d, profileType=%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j2));
        C53499i.C53500a e = this.f110801f.f110794f.mo74178e(j);
        if (e != null) {
            e.f150449e = i2;
            e.f150451g = j2;
        } else {
            int i4 = i2;
            long j3 = j2;
            Log.m105925i(str, "get connect state faild : %d", Long.valueOf(j));
        }
        ((ExdeviceEventManager.C41107a) this.f110800e).mo64186a(j, i, i2, i3, j2);
    }
}
