package com.tencent.p014mm.plugin.appbrand.performance;

import android.os.Build;
import android.os.HandlerThread;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;
import mj0.C88734d;
import p1017od.C89153a;
import p1017od.C89157e;
import p935cb.C79991m;
import p958eb.C86474e;
import p958eb.C86476g;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.performance.c */
public class C83994c extends AppBrandPerformanceManager {

    /* renamed from: b */
    public static final /* synthetic */ int f245226b = 0;

    /* renamed from: com.tencent.mm.plugin.appbrand.performance.c$a */
    public enum C83995a {
        INST;
        

        /* renamed from: d */
        public volatile HandlerThread f245229d;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.performance.c$b */
    public static class C83996b extends AppBrandPerformanceManager.C83989b {
        public C83996b(AppBrandRuntimeWC appBrandRuntimeWC) {
            super(appBrandRuntimeWC);
            this.f245215j = appBrandRuntimeWC.mo121254q1();
        }

        /* renamed from: a */
        public void mo116630a() {
            if (this.f245215j) {
                try {
                    C83997d.m103519b(this.f245210e, "Game", "DRAW_CALLS", (double) ((C88734d) ((C88267e) C81682d.m100222b(this.f245210e).f238150p)).mo123174R0().f235059h.mo123498a());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", e, "get QualityEvent of WAGame but fail.", new Object[0]);
                }
            }
        }

        /* renamed from: b */
        public void mo116631b() {
            C89153a aVar;
            int i;
            int i2;
            if (this.f245215j) {
                try {
                    C86474e eVar = (C86474e) ((C88267e) C81682d.m100222b(this.f245210e).f238150p).mo125517G0(C86474e.class);
                    if (eVar != null) {
                        C89157e eVar2 = eVar.mo120910U().f235059h;
                        synchronized (eVar2.f256898a) {
                            aVar = eVar2.f256900c;
                        }
                        if (aVar != null) {
                            C86812g gVar = this.f245209d;
                            AppBrandPerformanceManager.m103496e(gVar, 303, Math.round(aVar.f256873a) + " fps");
                            C83997d.m103519b(this.f245210e, "Game", "FPS_GAME_RT", (double) aVar.f256873a);
                            C83997d.m103519b(this.f245210e, "Game", "FPS_GAME_EX", (double) aVar.f256874b);
                            C83997d.m103519b(this.f245210e, "Game", "JANK", (double) aVar.f256875c);
                            C83997d.m103519b(this.f245210e, "Game", "BIG_JANK", (double) aVar.f256876d);
                            C83997d.m103519b(this.f245210e, "Game", "STUTTER", (double) aVar.f256877e);
                            try {
                                C88734d dVar = (C88734d) ((C88267e) C81682d.m100222b(this.f245210e).f238150p);
                                C89157e eVar3 = dVar.mo123174R0().f235059h;
                                synchronized (eVar3.f256898a) {
                                    i = eVar3.f256912o.f256914a;
                                }
                                C83997d.m103519b(this.f245210e, "Game", "FPS_GAME_LAG", (double) i);
                                C89157e eVar4 = dVar.mo123174R0().f235059h;
                                synchronized (eVar4.f256898a) {
                                    i2 = eVar4.f256912o.f256915b;
                                }
                                C83997d.m103519b(this.f245210e, "Game", "FPS_GAME_LOW", (double) i2);
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", e, "get QualityEvent of WAGame but fail.", new Object[0]);
                            }
                        }
                    } else {
                        throw new C86476g();
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", e2, "get QualityEvent of WAGame but fail.", new Object[0]);
                    aVar = null;
                }
            }
        }

        /* renamed from: c */
        public void mo116632c() {
            if (this.f245215j) {
                try {
                    C83997d.m103519b(this.f245210e, "Game", "TRIANGLES", (double) ((C88734d) ((C88267e) C81682d.m100222b(this.f245210e).f238150p)).mo123174R0().f235059h.mo123500c());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", e, "get QualityEvent of WAGame but fail.", new Object[0]);
                }
            }
        }

        /* renamed from: d */
        public void mo116633d() {
            if (this.f245215j) {
                try {
                    C83997d.m103519b(this.f245210e, "Game", "VERTEXES", (double) ((C88734d) ((C88267e) C81682d.m100222b(this.f245210e).f238150p)).mo123174R0().f235059h.mo123501d());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", e, "get QualityEvent of WAGame but fail.", new Object[0]);
                }
            }
        }

        /* renamed from: e */
        public void mo116634e() {
            if (this.f245215j && !this.f245209d.mo113064k0()) {
                QualitySessionRuntime c = C84185b.m103770c(this.f245210e, true);
                int selfMemInMB = c != null ? Util.getSelfMemInMB(MMApplicationContext.getContext()) - c.f245862w : Integer.MAX_VALUE;
                if (selfMemInMB != Integer.MAX_VALUE) {
                    C86812g gVar = this.f245209d;
                    AppBrandPerformanceManager.m103496e(gVar, 103, selfMemInMB + "m");
                }
            }
        }

        /* renamed from: f */
        public void mo116635f() {
            super.mo116635f();
            if (this.f245215j) {
                C79991m.C79992a b = C79991m.INST.mo110171b();
                C83997d.m103519b(this.f245210e, "Hardware", "NATIVE_MEMORY", (double) b.f234285b);
                if (Build.VERSION.SDK_INT >= 23) {
                    AppBrandPerformanceManager.m103496e(this.f245209d, 105, b.f234294k);
                    C83997d.m103519b(this.f245210e, "Hardware", "SYSTEM_MEMORY", (double) b.f234288e);
                    C83997d.m103519b(this.f245210e, "Hardware", "TOTAL_SWAP_MEMORY", (double) b.f234289f);
                    C83997d.m103519b(this.f245210e, "Hardware", "JAVA_HEAP_MEMORY", (double) b.f234290g);
                    C83997d.m103519b(this.f245210e, "Hardware", "PRIVATE_OTHER_MEMORY", (double) b.f234291h);
                    C83997d.m103519b(this.f245210e, "Hardware", "CODE_MEMORY", (double) b.f234292i);
                    C83997d.m103519b(this.f245210e, "Hardware", "STACK_MEMORY", (double) b.f234293j);
                    C83997d.m103519b(this.f245210e, "Hardware", "GRAPHICS_MEMORY", (double) b.f234287d);
                }
                C83997d.m103519b(this.f245210e, "Hardware", "DALVIK_MEMORY", (double) b.f234286c);
            }
        }
    }
}
