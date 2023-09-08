package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.exdevice.model.g */
public class C41129g implements MTimerHandler.CallBack {

    /* renamed from: d */
    public long f110798d = 10;

    /* renamed from: e */
    public final /* synthetic */ C41132h f110799e;

    public C41129g(C41132h hVar) {
        this.f110799e = hVar;
    }

    public boolean onTimerExpired() {
        if (this.f110799e.f110806a == null) {
            long j = this.f110798d;
            this.f110798d = j - 1;
            if (j > 0) {
                return true;
            }
        }
        Log.m105925i("MicroMsg.exdevice.ExDeviceTaskService", "now retry count = %d", Long.valueOf(this.f110798d));
        if (this.f110798d > 0) {
            this.f110799e.mo64200c();
        }
        return false;
    }
}
