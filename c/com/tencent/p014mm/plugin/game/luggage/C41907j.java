package com.tencent.p014mm.plugin.game.luggage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.concurrent.atomic.AtomicInteger;
import kb3.C46668d;
import ky1.C46803a;
import ky1.C46808b;
import ky1.C46810d;

/* renamed from: com.tencent.mm.plugin.game.luggage.j */
public class C41907j {

    /* renamed from: a */
    public static AtomicInteger f112910a = new AtomicInteger(0);

    /* renamed from: a */
    public static void m45459a() {
        int decrementAndGet = f112910a.decrementAndGet();
        Log.m105924i("MicroMsg.LuggageGameWebViewActivityStack", "remove count = " + decrementAndGet);
        if (decrementAndGet <= 0) {
            if (C46803a.m52100d() != null) {
                C46803a d = C46803a.m52100d();
                d.getClass();
                Log.m105924i("MicroMsg.GameJsCore", "stop");
                d.f125932h = C46803a.C46807c.stopped;
                d.f125930f.mo72031a(new C46810d(d, "onStop"));
                MTimerHandler mTimerHandler = new MTimerHandler(new C46808b(d), false);
                d.f125933i = mTimerHandler;
                mTimerHandler.startTimer(300000);
            }
            String str = C46668d.f125638a;
            Log.m105924i("MicroMsg.GameJsServerCommLibPkg", "load");
        }
    }
}
