package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import lu3.C34379c;
import rx3.C13598b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.task.e */
public final class C84281e {

    /* renamed from: a */
    public static final List<C32227p<Integer, Integer, C13598b0>> f246150a = new ArrayList();

    /* renamed from: b */
    public static C34379c<?> f246151b;

    /* renamed from: c */
    public static C34379c<?> f246152c;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.e$a */
    public static final class C84282a implements C114668z {

        /* renamed from: com.tencent.mm.plugin.appbrand.task.e$a$a */
        public static final class C84283a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C84282a f246153d;

            /* renamed from: com.tencent.mm.plugin.appbrand.task.e$a$a$a */
            public static final class C84284a implements Runnable {

                /* renamed from: d */
                public static final C84284a f246154d = new C84284a();

                public final void run() {
                    if (!AppForegroundDelegate.INSTANCE.f343454n) {
                        List<C32227p<Integer, Integer, C13598b0>> list = C84281e.f246150a;
                        C34379c<?> cVar = C84281e.f246152c;
                        Log.m105919d("MicroMsg.AppBrandMemoryPeriodicProvider", "pause: isSuccess=[%b]", cVar != null ? Boolean.valueOf(cVar.cancel(true)) : null);
                    }
                }
            }

            public C84283a(C84282a aVar) {
                this.f246153d = aVar;
            }

            public final void run() {
                Log.m105918d("MicroMsg.AppBrandMemoryPeriodicProvider", "onAppBackground: ");
                C84282a.m103904a(this.f246153d);
                List<C32227p<Integer, Integer, C13598b0>> list = C84281e.f246150a;
                C119179t tVar = C119157j.f356862d;
                C84284a aVar = C84284a.f246154d;
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                C84281e.f246151b = jVar.mo183892w(aVar, 600000, false);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.task.e$a$b */
        public static final class C84285b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C84282a f246155d;

            /* renamed from: com.tencent.mm.plugin.appbrand.task.e$a$b$a */
            public static final class C84286a implements Runnable {

                /* renamed from: d */
                public static final C84286a f246156d = new C84286a();

                public final void run() {
                    List<C32227p<Integer, Integer, C13598b0>> list = C84281e.f246150a;
                    C34379c<?> cVar = C84281e.f246152c;
                    if (cVar == null || cVar.isCancelled()) {
                        Log.m105918d("MicroMsg.AppBrandMemoryPeriodicProvider", "resume: ");
                        C34379c<?> cVar2 = C84281e.f246152c;
                        if (cVar2 != null) {
                            cVar2.cancel(true);
                        }
                        C84281e.f246152c = ((C119157j) C119157j.f356862d).mo183872c(C29646i.f80584d, 0, 310000);
                    }
                }
            }

            public C84285b(C84282a aVar) {
                this.f246155d = aVar;
            }

            public final void run() {
                C84282a.m103904a(this.f246155d);
                C119179t tVar = C119157j.f356862d;
                C84286a aVar = C84286a.f246156d;
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, 15000, false);
            }
        }

        /* renamed from: a */
        public static final void m103904a(C84282a aVar) {
            aVar.getClass();
            C34379c<?> cVar = C84281e.f246151b;
            boolean z = false;
            if (cVar != null && (!cVar.isDone())) {
                z = true;
            }
            if (z) {
                C34379c<?> cVar2 = C84281e.f246151b;
                C87412m.m108591d(cVar2);
                cVar2.cancel(true);
                Log.m105918d("MicroMsg.AppBrandMemoryPeriodicProvider", "mayCancelPauseTask: pause task canceled");
            }
        }

        public void onAppBackground(String str) {
            ((C119157j) C119157j.f356862d).mo183895z(new C84283a(this));
        }

        public void onAppForeground(String str) {
            ((C119157j) C119157j.f356862d).mo183895z(new C84285b(this));
        }
    }

    static {
        if (MMApplicationContext.isMainProcess() || !AppBrandRuntimeWC.f238264Q1) {
            AppForegroundDelegate.INSTANCE.mo174208a(new C84282a());
            return;
        }
        throw new IllegalArgumentException(android.util.Log.getStackTraceString(new Throwable()));
    }
}
