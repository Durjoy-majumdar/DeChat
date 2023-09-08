package yl2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import zl2.C39380c;

/* renamed from: yl2.c */
public final class C39055c implements C39380c {

    /* renamed from: a */
    public long f105145a = System.currentTimeMillis();

    /* renamed from: a */
    public void mo61896a(String str, long j, long j2) {
        C87412m.m108594g(str, "sessionId");
        this.f105145a = j2;
        Log.m105925i("MicroMsg.MTimer", "sessionID: %s, interval:%d date:%s, distanceTime:%d", str, Long.valueOf((j2 - this.f105145a) / ((long) 3600000)), Long.valueOf(j2), Long.valueOf(j2 - j));
    }
}
