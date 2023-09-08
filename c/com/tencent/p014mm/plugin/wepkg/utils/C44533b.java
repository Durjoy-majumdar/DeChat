package com.tencent.p014mm.plugin.wepkg.utils;

import com.tencent.p014mm.plugin.wepkg.model.C44523r;
import com.tencent.p014mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.plugin.wepkg.utils.WepkgListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import sx1.C48493b;

/* renamed from: com.tencent.mm.plugin.wepkg.utils.b */
public class C44533b implements C48493b.C48494a {

    /* renamed from: com.tencent.mm.plugin.wepkg.utils.b$a */
    public class C44534a implements Runnable {
        public C44534a(C44533b bVar) {
        }

        public void run() {
            WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
            wepkgCrossProcessTask.f120618h = 2003;
            if (MMApplicationContext.isMMProcess()) {
                wepkgCrossProcessTask.mo1553j();
            } else {
                wepkgCrossProcessTask.mo114396f();
            }
            WepkgVersion wepkgVersion = wepkgCrossProcessTask.f120619i;
            if (wepkgVersion != null && !Util.isNullOrNil(wepkgVersion.f120651d)) {
                C44523r.m48890b().mo69301d(wepkgVersion.f120651d, true);
            }
        }
    }

    public C44533b(WepkgListener.C445263 r1) {
    }

    /* renamed from: a */
    public void mo65649a() {
        C44536d.m48918d().postToWorker(new C44534a(this));
    }
}
