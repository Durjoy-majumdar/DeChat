package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.e1 */
public final class C85101e1 extends C114668z.C104589a {

    /* renamed from: d */
    public boolean f247981d = true;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.e1$a */
    public static final class C85102a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C85101e1 f247982d;

        public C85102a(C85101e1 e1Var) {
            this.f247982d = e1Var;
        }

        public final void run() {
            if (!this.f247982d.f247981d && !C19636w0.f55627d) {
                BizTLRecCardJsEngine.f247961Y.mo118095b();
            }
        }
    }

    public synchronized void onAppBackground(String str) {
        C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f247981d = false;
        BizTLRecCardJsEngine.Companion companion = BizTLRecCardJsEngine.f247961Y;
        if (BizTLRecCardJsEngine.f247960R0 == null) {
            Log.m105918d("MicroMsg.BizTLRecCardJsEngine", "onAppBackground engine is null");
            return;
        }
        C119179t tVar = C119157j.f356862d;
        C85102a aVar = new C85102a(this);
        long j = BuildInfo.DEBUG ? FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION : 30000;
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, j, false);
    }

    public synchronized void onAppForeground(String str) {
        C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f247981d = true;
    }
}
