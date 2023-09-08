package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import y71.C53502m;

/* renamed from: com.tencent.mm.plugin.exdevice.model.o */
public class C41151o implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ long f110861d;

    /* renamed from: e */
    public final /* synthetic */ String f110862e;

    /* renamed from: f */
    public final /* synthetic */ int f110863f;

    /* renamed from: g */
    public final /* synthetic */ C41140m f110864g;

    public C41151o(C41140m mVar, long j, String str, int i) {
        this.f110864g = mVar;
        this.f110861d = j;
        this.f110862e = str;
        this.f110863f = i;
    }

    public boolean onTimerExpired() {
        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "now it is time to check the sync connect state, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", this.f110862e, Long.valueOf(this.f110861d), Integer.valueOf(this.f110863f), Integer.valueOf(C53502m.m60037a().mo74176c(this.f110861d)));
        this.f110864g.mo64204b(this.f110861d);
        this.f110864g.f110829d.remove(Long.valueOf(this.f110861d));
        return false;
    }
}
