package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y0 */
public final class C40787y0 extends C114668z.C104589a {

    /* renamed from: d */
    public boolean f109638d = true;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y0$a */
    public static final class C40788a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C40787y0 f109639d;

        public C40788a(C40787y0 y0Var) {
            this.f109639d = y0Var;
        }

        public final void run() {
            if (!this.f109639d.f109638d) {
                Object[] objArr = new Object[1];
                WebPrefetcherManifest.C40692a aVar = WebPrefetcherManifest.f109316e;
                objArr[0] = aVar != null ? Integer.valueOf(aVar.hashCode()) : null;
                Log.m105925i("MicroMsg.WebPrefetcherManifest", "onAppBackground releaseEngine %s", objArr);
                WebPrefetcherManifest.f109312a.mo63597i();
            }
        }
    }

    public synchronized void onAppBackground(String str) {
        C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f109638d = false;
        if (WebPrefetcherManifest.f109316e == null) {
            Log.m105928w("MicroMsg.WebPrefetcherManifest", "onAppBackground localManager is null");
            return;
        }
        C119179t tVar = C119157j.f356862d;
        C40788a aVar = new C40788a(this);
        long j = BuildInfo.DEBUG ? FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION : 30000;
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, j, false);
    }

    public synchronized void onAppForeground(String str) {
        C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f109638d = true;
    }
}
