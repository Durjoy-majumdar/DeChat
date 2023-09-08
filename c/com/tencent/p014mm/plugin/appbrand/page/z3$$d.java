package com.tencent.p014mm.plugin.appbrand.page;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.z3$$d */
public class z3$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f245187d;

    public z3$$d(C83984z3 z3Var, LinkedList linkedList) {
        this.f245187d = linkedList;
    }

    public void run() {
        Iterator it = this.f245187d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
