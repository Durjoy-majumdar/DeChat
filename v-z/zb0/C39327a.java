package zb0;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: zb0.a */
public class C39327a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CheckResUpdateCacheFileEvent f105721d;

    public C39327a(C39328b bVar, CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f105721d = checkResUpdateCacheFileEvent;
    }

    public void run() {
        C115669n.INSTANCE.mo175912v(933, 12);
        C39332f b = C39332f.m42087b();
        CheckResUpdateCacheFileEvent.C28720a aVar = this.f105721d.f78743d;
        b.mo62024d(aVar.f78746c, aVar.f78744a, aVar.f78745b, aVar.f78747d);
    }
}
