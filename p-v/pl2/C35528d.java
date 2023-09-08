package pl2;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import gy3.C87412m;

/* renamed from: pl2.d */
public final class C35528d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C35526c f95008d;

    /* renamed from: e */
    public final /* synthetic */ CheckResUpdateCacheFileEvent f95009e;

    public C35528d(C35526c cVar, CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f95008d = cVar;
        this.f95009e = checkResUpdateCacheFileEvent;
    }

    public final void run() {
        C35526c cVar = this.f95008d;
        String str = this.f95009e.f78743d.f78746c;
        C87412m.m108593f(str, "event.data.filePath");
        CheckResUpdateCacheFileEvent.C28720a aVar = this.f95009e.f78743d;
        C35526c.vx0(cVar, str, aVar.f78744a, aVar.f78745b, aVar.f78747d);
    }
}
