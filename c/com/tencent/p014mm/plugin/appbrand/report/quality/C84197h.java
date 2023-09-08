package com.tencent.p014mm.plugin.appbrand.report.quality;

import android.os.Handler;
import android.os.Looper;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.performance.C84001g;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84182a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import p1017od.C89153a;
import p1017od.C89157e;
import p935cb.C79991m;
import p958eb.C86474e;
import qj0.C89683b;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.h */
public class C84197h {

    /* renamed from: a */
    public Handler f245935a;

    /* renamed from: b */
    public final C84200c f245936b = new C84200c((C84198a) null);

    /* renamed from: c */
    public QualitySessionRuntime f245937c;

    /* renamed from: d */
    public C84001g f245938d;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.h$b */
    public enum C84199b {
        Light,
        Full
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.h$c */
    public class C84200c implements Runnable {

        /* renamed from: d */
        public long f245942d = 0;

        /* renamed from: e */
        public C84199b f245943e = null;

        /* renamed from: f */
        public boolean f245944f = false;

        public C84200c(C84198a aVar) {
        }

        public void run() {
            if (C84197h.this.f245937c != null) {
                if (this.f245943e == null) {
                    Log.m105920e("MicroMsg.AppBrandRuntimeEventReporter", "hy: null type! could not happen");
                }
                C84197h hVar = C84197h.this;
                C84199b bVar = this.f245943e;
                boolean z = this.f245944f;
                C84199b bVar2 = C84199b.Full;
                synchronized (hVar) {
                    QualitySessionRuntime qualitySessionRuntime = hVar.f245937c;
                    if (qualitySessionRuntime != null) {
                        C84182a0 a = C84197h.m103802a(qualitySessionRuntime, bVar);
                        if (a != null) {
                            QualitySessionRuntime qualitySessionRuntime2 = hVar.f245937c;
                            boolean z2 = true;
                            if (!qualitySessionRuntime2.f245865z) {
                                C84185b.f245912a.mo116891j(qualitySessionRuntime2.f245833e, a);
                                C89683b bVar3 = new C89683b(hVar.f245937c, a);
                                if (bVar != bVar2) {
                                    z2 = false;
                                }
                                bVar3.mo124008a(z2);
                            } else if (z) {
                                C84185b.f245912a.mo116891j(qualitySessionRuntime2.f245833e, a);
                            } else {
                                C89683b bVar4 = new C89683b(qualitySessionRuntime2, a);
                                if (bVar != bVar2) {
                                    z2 = false;
                                }
                                bVar4.mo124008a(z2);
                            }
                        }
                    }
                }
                C84197h hVar2 = C84197h.this;
                hVar2.f245935a.postDelayed(hVar2.f245936b, this.f245942d);
            }
        }
    }

    /* renamed from: a */
    public static C84182a0 m103802a(QualitySessionRuntime qualitySessionRuntime, C84199b bVar) {
        int i;
        C80301a aVar;
        C89153a aVar2;
        float f;
        C89157e.C89159b bVar2;
        float f2;
        if (qualitySessionRuntime == null) {
            return null;
        }
        AppBrandRuntimeWC appBrandRuntimeWC = qualitySessionRuntime.f245854o;
        C84182a0.C84184b bVar3 = new C84182a0.C84184b();
        if (bVar == C84199b.Full) {
            C79991m.C79992a b = C79991m.INST.mo110171b();
            int i2 = b.f234284a;
            bVar3.f245898i = i2;
            bVar3.f245899j = i2 - qualitySessionRuntime.f245862w;
            bVar3.f245896g = b.f234285b;
            bVar3.f245897h = b.f234286c;
            bVar3.f245902m = (int) Math.round(C84205l.INST.f245955d.mo116642b());
            bVar3.f245905p = b.f234287d;
        } else {
            bVar3.f245898i = -1;
            bVar3.f245899j = -1;
            bVar3.f245896g = -1;
            bVar3.f245897h = -1;
            bVar3.f245902m = -1;
            bVar3.f245905p = -1;
        }
        int i3 = 0;
        try {
            i = appBrandRuntimeWC.f238142e.getStackSize();
        } catch (Exception unused) {
            i = 0;
        }
        bVar3.f245901l = i;
        bVar3.f245900k = (int) (System.currentTimeMillis() - qualitySessionRuntime.f245856q);
        if (qualitySessionRuntime.f245865z) {
            AppBrandRuntimeWC appBrandRuntimeWC2 = qualitySessionRuntime.f245854o;
            try {
                aVar = ((C86474e) ((C88267e) appBrandRuntimeWC2.f238150p).mo125517G0(C86474e.class)).mo120910U();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandRuntimeEventReporter", e, "get QualityEvent of WAGame but fail. [%s]", appBrandRuntimeWC2);
                aVar = null;
            }
            if (aVar == null) {
                Log.m105920e("MicroMsg.AppBrandRuntimeEventReporter", "buildWAGameQualityEvent find renderer.fps == null");
            } else {
                C89157e eVar = aVar.f235059h;
                synchronized (eVar.f256898a) {
                    aVar2 = eVar.f256900c;
                }
                bVar3.f245890a = Math.round(aVar2.f256873a);
                bVar3.f245904o = Math.round(aVar2.f256874b);
                C89157e eVar2 = aVar.f235059h;
                synchronized (eVar2.f256898a) {
                    if (eVar2.f256898a.f235052a == 0) {
                        f = -1.0f;
                    } else {
                        MBRuntime mBRuntime = eVar2.f256898a;
                        f = mBRuntime.nativeGetCurrentFpsVariance(mBRuntime.f235052a);
                    }
                }
                bVar3.f245891b = f;
                bVar3.f245894e = aVar.f235059h.mo123498a();
                bVar3.f245895f = aVar.f235059h.mo123501d();
                bVar3.f245893d = aVar.f235059h.mo123500c();
                bVar3.f245892c = qualitySessionRuntime.f245841B.f246066a;
                MBRuntime.MBParams mBParams = aVar.f235053b;
                bVar3.f245903n = mBParams.use_command_buffer ? 1 : 0;
                bVar3.f245906q = mBParams.cmd_pool_type;
                C89157e eVar3 = aVar.f235059h;
                synchronized (eVar3.f256898a) {
                    bVar2 = eVar3.f256913p;
                    C89157e.C89159b bVar4 = eVar3.f256912o;
                    bVar2.f256915b = bVar4.f256915b;
                    bVar2.f256914a = bVar4.f256914a;
                    bVar2.f256916c = bVar4.f256916c;
                    bVar2.f256917d = bVar4.f256917d;
                    f2 = ((float) bVar4.f256918e) / ((float) bVar4.f256919f);
                    bVar4.f256915b = 0;
                    bVar4.f256914a = 0;
                    bVar4.f256916c = 0;
                    bVar4.f256917d = 0;
                    bVar4.f256918e = 0;
                    bVar4.f256919f = 0;
                }
                bVar3.f245907r = bVar2.f256914a;
                bVar3.f245908s = bVar2.f256915b;
                bVar3.f245909t = bVar2.f256916c;
                bVar3.f245910u = bVar2.f256917d;
                bVar3.f245911v = Math.round(f2 * 10000.0f);
            }
        } else {
            C84001g gVar = qualitySessionRuntime.f245864y.f245938d;
            if (gVar != null) {
                i3 = (int) (gVar.f245254j + 0.5d);
            }
            bVar3.f245890a = i3;
        }
        return new C84182a0(bVar3, (C84182a0.C84183a) null);
    }

    /* renamed from: b */
    public void mo116902b(QualitySessionRuntime qualitySessionRuntime, int i, C84199b bVar, boolean z) {
        this.f245937c = qualitySessionRuntime;
        if (this.f245935a == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.f245935a = handler;
            C84200c cVar = this.f245936b;
            cVar.f245942d = ((long) i) * 1000;
            cVar.f245943e = bVar;
            cVar.f245944f = z;
            handler.post(cVar);
        }
        C84001g gVar = new C84001g();
        this.f245938d = gVar;
        gVar.f245251g = 200;
        gVar.f245253i = null;
        gVar.mo116644a();
    }
}
