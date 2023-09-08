package com.tencent.p014mm.plugin.report.service;

import java.util.LinkedList;
import java.util.Map;
import te3.C49122dc;
import te3.ro4;

/* renamed from: com.tencent.mm.plugin.report.service.w */
public final class C5147w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C49122dc f20537d;

    /* renamed from: e */
    public final /* synthetic */ Map.Entry<Long, LinkedList<ro4>> f20538e;

    public C5147w(C49122dc dcVar, Map.Entry<Long, ? extends LinkedList<ro4>> entry) {
        this.f20537d = dcVar;
        this.f20538e = entry;
    }

    public final void run() {
        LinkedList<ro4> linkedList = this.f20537d.f132225d;
        if (linkedList != null) {
            linkedList.addAll(this.f20538e.getValue());
        }
        C5139t.f20522a.mo6108f();
    }
}
