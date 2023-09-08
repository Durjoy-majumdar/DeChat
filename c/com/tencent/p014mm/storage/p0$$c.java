package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.storage.MStorageEvent;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.storage.p0$$c */
public class p0$$c extends MStorageEvent<p0$$h, p0$$f> {

    /* renamed from: a */
    public final /* synthetic */ C19625p0 f82717a;

    public p0$$c(C19625p0 p0Var) {
        this.f82717a = p0Var;
    }

    public boolean needNotifyExtension() {
        return true;
    }

    public void processEvent(Object obj, Object obj2) {
        ((p0$$h) obj).mo21358p(this.f82717a, (p0$$f) obj2);
    }

    public void processEventForExtensionOnDemand(Object obj) {
        p0$$f p0__f = (p0$$f) obj;
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(p0$$i.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            ((p0$$i) ((C38174i) bVar.next()).get()).mo25747p(this.f82717a, p0__f);
        }
    }
}
