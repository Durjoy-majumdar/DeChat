package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Queue;

/* renamed from: com.tencent.mm.plugin.appbrand.task.j0 */
public final class C84309j0 implements Runnable {

    /* renamed from: d */
    public static final C84309j0 f246193d = new C84309j0();

    public final void run() {
        q$$f q__f = C84331q.f246221a;
        synchronized (C84331q.class) {
            for (C84343y yVar : C84343y.values()) {
                if (C84343y.NIL != yVar) {
                    Queue queue = C84331q.f246223c.get(yVar);
                    Queue queue2 = C84331q.f246224d.get(yVar);
                    if (queue != null) {
                        new C84337r(queue).mo117030a();
                    }
                    if (queue2 != null) {
                        new C84337r(queue2).mo117030a();
                    }
                    if ((queue == null || queue.isEmpty()) && (queue2 == null || queue2.isEmpty())) {
                        Log.m105925i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "releasePreloadedAndSparedEnvironment, reset %s", yVar);
                        C84331q.m103958m(yVar);
                    }
                }
            }
        }
    }
}
