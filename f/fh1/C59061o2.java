package fh1;

import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import f50.C58924d;
import gk1.C59522a;
import j50.C60735a;
import p50.C62197e;

/* renamed from: fh1.o2 */
public final class C59061o2 implements C59522a.C59523a {
    /* renamed from: a */
    public void mo84267a() {
        C58924d dVar;
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
        if (eVar != null && (dVar = eVar.f176822Y0.f152627a) != null) {
            dVar.pause();
        }
    }

    /* renamed from: b */
    public void mo84268b() {
        C58924d dVar;
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
        if (eVar != null && (dVar = eVar.f176822Y0.f152627a) != null) {
            dVar.resume();
        }
    }
}
