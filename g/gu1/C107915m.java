package gu1;

import com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: gu1.m */
public final class C107915m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CachedFlutterEngines.C105354a f323118d;

    /* renamed from: e */
    public final /* synthetic */ String f323119e;

    public C107915m(CachedFlutterEngines.C105354a aVar, String str) {
        this.f323118d = aVar;
        this.f323119e = str;
    }

    public final void run() {
        this.f323118d.f313152a.quitSafely();
        Log.m105924i("MicroMsg.CachedFlutterEngines", "clear engine quit background executor:" + this.f323119e);
    }
}
