package com.tencent.p014mm.plugin.expansions;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p210o.C11323a;

/* renamed from: com.tencent.mm.plugin.expansions.i */
public class C115405i implements Callable<Void> {

    /* renamed from: d */
    public final /* synthetic */ C11323a f345912d;

    public C115405i(C115406j jVar, C11323a aVar) {
        this.f345912d = aVar;
    }

    public Object call() {
        boolean z;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        while (true) {
            synchronized (C85178q.f248171a) {
                z = C85178q.f248173c != null;
            }
            if (!z) {
                Log.m105924i("MicroMsg.exp.ExpansionsGlobal", "expansions not ready for global, just wait");
                if (atomicInteger.getAndIncrement() < 3) {
                    Thread.sleep(1000);
                } else {
                    throw new TimeoutException("wait for global timeout");
                }
            } else if (C85178q.m105041e()) {
                Log.m105924i("MicroMsg.exp.ExpansionsGlobal", "expansions is ready");
                this.f345912d.apply(Boolean.TRUE);
                return null;
            } else {
                C85178q.m105040d(new C115404h(this));
                return null;
            }
        }
        while (true) {
        }
    }
}
