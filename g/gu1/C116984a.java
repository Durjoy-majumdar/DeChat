package gu1;

import a10.C103281d;
import a10.C112719j;
import a10.C112725w;
import a10.j$$a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.FlutterMemoryPigeon;
import gy3.C87412m;
import p172io.flutter.embedding.engine.FlutterEngine;

/* renamed from: gu1.a */
public final class C116984a implements FlutterEngine.EngineLifecycleListener {

    /* renamed from: a */
    public final /* synthetic */ C116989f f350549a;

    /* renamed from: b */
    public final /* synthetic */ C112725w f350550b;

    public C116984a(C116989f fVar, C112725w wVar) {
        this.f350549a = fVar;
        this.f350550b = wVar;
    }

    public void onEngineWillDestroy() {
        this.f350549a.f350561f.remove(this.f350550b.f337501b);
        String str = this.f350549a.f350560e;
        Log.m105924i(str, "onEngineWillDestroy, remain engines:" + this.f350549a.f350561f.size() + ", autoReleaseInterval:" + this.f350549a.f350557b);
        if (this.f350549a.f350561f.size() == 0) {
            C116989f fVar = this.f350549a;
            if (!fVar.f350558c) {
                Log.m105924i(fVar.f350560e, "all engine destroy, try free resources");
                C112719j jVar = this.f350549a.f350556a.f337474h;
                C103281d dVar = C103281d.f304525d;
                jVar.getClass();
                C87412m.m108594g(dVar, "callback");
                FlutterMemoryPigeon.FlutterMemoryHost flutterMemoryHost = jVar.f337494d;
                if (flutterMemoryHost != null) {
                    flutterMemoryHost.freeImageCache(new j$$a(dVar));
                }
            }
        }
        this.f350549a.mo180957a();
    }

    public void onPreEngineRestart() {
    }
}
