package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.matrix.resource.C80530h;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p723vf.C118672d;
import p757xv.C91355x;
import p761yd.C91441c;
import p982if.C87719c;
import t70.C36961c;
import t70.C90378b;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$a */
public final /* synthetic */ class MemoryWatchDog$$a implements Callable {

    /* renamed from: d */
    public final /* synthetic */ C91355x f248596d;

    public /* synthetic */ MemoryWatchDog$$a(C91355x xVar) {
        this.f248596d = xVar;
    }

    public final Object call() {
        C91355x xVar = this.f248596d;
        long j = xVar.f262014p - xVar.f262015q;
        long j2 = xVar.f262012n;
        try {
            long j3 = C85329e.f248650d;
            int i = (j3 > 419430400 ? 1 : (j3 == 419430400 ? 0 : -1));
            if (i > 0 && j < 367001600) {
                return C85329e.f248647a;
            }
            if (i <= 0 && ((double) j) < ((double) j3) * 0.8d) {
                return C85329e.f248647a;
            }
            if (!C91441c.m114729c()) {
                Log.m105920e("MicroMsg.HprofLimitPublisher", "skip hprof dump: Matrix NOT installed");
            } else {
                boolean z = true;
                if (((C80530h) C91441c.m114730d().mo125377a(C80530h.class)) == null || !C87719c.f253996d) {
                    z = false;
                }
                if (z) {
                    Log.m105924i("MicroMsg.HprofLimitPublisher", "Skip hprof dump: Matrix is analyzing resources.");
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - C85329e.f248648b > TimeUnit.MINUTES.toMillis(1) || j - C85329e.f248649c > 52428800) {
                        C85329e.f248648b = currentTimeMillis;
                        C85329e.f248649c = j;
                        C36961c.C36962a.m41108a(C90378b.f259390d, false, 0, new C85328d(j, j2), 3, (Object) null);
                        Log.m105924i("MicroMsg.HprofLimitPublisher", "published");
                    }
                }
            }
            return C85329e.f248647a;
        } catch (Throwable th) {
            C118672d.m167354d("MicroMsg.HprofLimitPublisher", th, "", new Object[0]);
        }
    }
}
