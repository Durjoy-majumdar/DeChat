package com.tencent.p014mm.plugin.appbrand.config;

import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.appbrand.config.o */
public class C81680o implements C88631d.C88632b<List<String>> {

    /* renamed from: a */
    public final /* synthetic */ ConcurrentLinkedQueue f239729a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f239730b;

    public C81680o(C81662k.C81668e eVar, ConcurrentLinkedQueue concurrentLinkedQueue, Runnable runnable) {
        this.f239729a = concurrentLinkedQueue;
        this.f239730b = runnable;
    }

    /* renamed from: a */
    public void mo1772a(Object obj) {
        this.f239729a.addAll((List) obj);
        this.f239730b.run();
    }
}
