package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.l2 */
public class C105656l2 {

    /* renamed from: a */
    public String f314150a = null;

    /* renamed from: b */
    public long f314151b = -1;

    /* renamed from: c */
    public long f314152c = -1;

    /* renamed from: a */
    public boolean mo150521a() {
        return !Util.isNullOrNil(this.f314150a) && Util.ticksToNow(this.f314152c + 3600) / 1000 < this.f314151b;
    }

    public String toString() {
        return "ILinkSessionKey{sessionKey='" + this.f314150a + '\'' + ", expireTicks=" + this.f314151b + ", initTicks=" + this.f314152c + '}';
    }
}
