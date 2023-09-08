package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import qk0.C89694i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b */
public class C82223b implements C89694i {

    /* renamed from: a */
    public final /* synthetic */ C82225c f241098a;

    public C82223b(C82225c cVar) {
        this.f241098a = cVar;
    }

    /* renamed from: a */
    public void mo114612a(String str, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.f241098a.f241104h).iterator();
        while (it.hasNext()) {
            ((C89694i) it.next()).mo114612a(str, z);
        }
    }
}
