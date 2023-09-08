package com.tencent.p014mm.plugin.appbrand.task;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.task.q$$f */
public class q$$f {

    /* renamed from: a */
    public final Map<C84343y, q$$h> f246242a;

    public q$$f() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f246242a = concurrentHashMap;
        C84343y yVar = C84343y.WASERVICE;
        q$$h q__h = q$$h.NOT_PRELOAD;
        concurrentHashMap.put(yVar, q__h);
        concurrentHashMap.put(C84343y.WAGAME, q__h);
    }

    /* renamed from: a */
    public q$$h mo117027a(C84343y yVar) {
        return (q$$h) ((ConcurrentHashMap) this.f246242a).get(yVar);
    }

    /* renamed from: b */
    public boolean mo117028b(C84343y yVar) {
        q$$h q__h = (q$$h) ((ConcurrentHashMap) this.f246242a).get(yVar);
        return q__h == q$$h.PRELOADED_FULL || q__h == q$$h.PRELOADED_DOWNGRADE;
    }

    /* renamed from: c */
    public void mo117029c(C84343y yVar, q$$h q__h) {
        ((ConcurrentHashMap) this.f246242a).put(yVar, q__h);
    }
}
