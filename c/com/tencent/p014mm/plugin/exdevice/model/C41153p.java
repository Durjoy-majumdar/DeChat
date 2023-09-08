package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import y71.C53502m;

/* renamed from: com.tencent.mm.plugin.exdevice.model.p */
public class C41153p implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ long f110867d;

    /* renamed from: e */
    public final /* synthetic */ String f110868e;

    /* renamed from: f */
    public final /* synthetic */ int f110869f;

    /* renamed from: g */
    public final /* synthetic */ C41140m f110870g;

    public C41153p(C41140m mVar, long j, String str, int i) {
        this.f110870g = mVar;
        this.f110867d = j;
        this.f110868e = str;
        this.f110869f = i;
    }

    public boolean onTimerExpired() {
        int c = C53502m.m60037a().mo74176c(this.f110867d);
        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "now it is time to notify ui show the connect time out tips, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", this.f110868e, Long.valueOf(this.f110867d), Integer.valueOf(this.f110869f), Integer.valueOf(c));
        if (c != 2) {
            C41166r1.yx0().mo64181m(this.f110868e, 2);
        }
        this.f110870g.f110828c.remove(Long.valueOf(this.f110867d));
        return false;
    }
}
