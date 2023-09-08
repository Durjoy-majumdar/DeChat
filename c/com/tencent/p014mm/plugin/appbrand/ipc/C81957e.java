package com.tencent.p014mm.plugin.appbrand.ipc;

import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80910p;
import com.tencent.p014mm.ipcinvoker.C80936x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.e */
public class C81957e {

    /* renamed from: a */
    public static boolean f240359a;

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.e$a */
    public class C81958a implements Runnable {
        public void run() {
            C81957e.m100676a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.e$b */
    public static class C81959b implements C80936x {
        public C81959b(C81958a aVar) {
        }

        /* renamed from: a */
        public void mo112721a() {
            Log.m105925i("MicroMsg.AppBrandMainProcessService", "onDisconnect: [%s] disconnected, reconnect immediately", MMApplicationContext.getMainProcessName());
            C81957e.m100676a();
        }
    }

    /* renamed from: a */
    public static void m100676a() {
        if (!MMHandlerThread.isMainThread()) {
            ((C119157j) C119157j.f356862d).mo183895z(new C81958a());
            return;
        }
        Log.m105926v("MicroMsg.AppBrandMainProcessService", "tryBind: ");
        if (!f240359a) {
            C80907o.m98779b(MMApplicationContext.getMainProcessName(), new C81959b((C81958a) null));
            f240359a = true;
        }
        C80910p.m98789a(MMApplicationContext.getMainProcessName());
    }
}
