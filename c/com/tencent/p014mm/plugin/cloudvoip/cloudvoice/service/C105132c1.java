package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c1 */
public class C105132c1 {

    /* renamed from: a */
    public String f312154a = null;

    /* renamed from: b */
    public long f312155b = -1;

    /* renamed from: c */
    public long f312156c = -1;

    /* renamed from: a */
    public boolean mo149444a() {
        return !Util.isNullOrNil(this.f312154a) && Util.ticksToNow(this.f312156c + 3600) / 1000 < this.f312155b;
    }

    public String toString() {
        return "OpenVoiceSessionKey{sessionKey='" + this.f312154a + '\'' + ", expireTicks=" + this.f312155b + ", initTicks=" + this.f312156c + '}';
    }
}
