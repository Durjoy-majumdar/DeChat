package com.tencent.p014mm.plugin.appbrand.ipc;

import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import p329d3.C86165a;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.i */
public class C81962i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f240362d;

    /* renamed from: e */
    public final /* synthetic */ Object f240363e;

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.i$a */
    public class C81963a implements C86165a<MMToClientEvent.C81947d> {
        public C81963a() {
        }

        public void accept(Object obj) {
            MMToClientEvent.C81947d dVar = (MMToClientEvent.C81947d) obj;
            if (dVar != null) {
                dVar.mo22085a(C81962i.this.f240363e);
            }
        }
    }

    public C81962i(MMToClientEvent mMToClientEvent, String str, Object obj) {
        this.f240362d = str;
        this.f240363e = obj;
    }

    public void run() {
        MMToClientEvent.f240340r.mo122461b(this.f240362d, new C81963a());
    }
}
