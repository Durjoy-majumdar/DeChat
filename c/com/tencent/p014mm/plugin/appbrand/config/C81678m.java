package com.tencent.p014mm.plugin.appbrand.config;

import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import lp3.C46888b;

/* renamed from: com.tencent.mm.plugin.appbrand.config.m */
public class C81678m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AtomicInteger f239724d;

    /* renamed from: e */
    public final /* synthetic */ ConcurrentLinkedQueue f239725e;

    /* renamed from: f */
    public final /* synthetic */ C46888b f239726f;

    /* renamed from: g */
    public final /* synthetic */ C81662k.C81668e f239727g;

    public C81678m(C81662k.C81668e eVar, AtomicInteger atomicInteger, ConcurrentLinkedQueue concurrentLinkedQueue, C46888b bVar) {
        this.f239727g = eVar;
        this.f239724d = atomicInteger;
        this.f239725e = concurrentLinkedQueue;
        this.f239726f = bVar;
    }

    public void run() {
        if (this.f239724d.getAndDecrement() == 1) {
            Log.m105925i("MicroMsg.WxaAttrSyncHelper", "batchSync callback list_size:%d, updated_size:%d, scene:%d", Integer.valueOf(this.f239727g.f239710b.size()), Integer.valueOf(this.f239725e.size()), Integer.valueOf(this.f239727g.f239711c.f239687d));
            this.f239726f.mo72093c(new LinkedList(this.f239725e));
            C81662k.C81674j jVar = this.f239727g.f239712d;
            if (jVar != null) {
                jVar.mo109935a();
            }
        }
    }
}
