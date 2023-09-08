package com.tencent.p014mm.plugin.appbrand;

import java.util.Iterator;
import java.util.LinkedList;
import p170ic.C87690d;

/* renamed from: com.tencent.mm.plugin.appbrand.b0 */
public class C81547b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f239170d;

    /* renamed from: com.tencent.mm.plugin.appbrand.b0$a */
    public class C81548a implements Runnable {
        public C81548a() {
        }

        public void run() {
            C81547b0.this.f239170d.mo113058h0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.b0$b */
    public class C81549b implements Runnable {
        public C81549b() {
        }

        public void run() {
            C81547b0.this.f239170d.f238118Q = true;
            C81547b0.this.f239170d.mo113001A0();
            LinkedList linkedList = new LinkedList(C81547b0.this.f239170d.f238106D);
            C81547b0.this.f239170d.f238106D.clear();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((C29608o3) it.next()).mo56845a();
            }
        }
    }

    public C81547b0(AppBrandRuntime appBrandRuntime) {
        this.f239170d = appBrandRuntime;
    }

    public void run() {
        C81548a aVar = new C81548a();
        if (!this.f239170d.mo113041Y0(aVar)) {
            aVar.run();
        }
        C87690d.m109091b("onReady", new C81549b());
    }
}
