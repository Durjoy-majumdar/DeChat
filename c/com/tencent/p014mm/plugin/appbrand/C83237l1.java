package com.tencent.p014mm.plugin.appbrand;

import android.os.Looper;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppInitLagMonitorStruct;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.LinkedHashMap;
import p1013nf.C88938b;
import p1035sf.C90183c;
import p1042u.C90590d;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p221qf.C89644g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.l1 */
public final class C83237l1 extends C89644g {

    /* renamed from: b */
    public static final C83237l1 f243102b = new C83237l1();

    /* renamed from: c */
    public static final MMHandler f243103c = new MMHandler("AppBrandRuntimeInitUiThreadLagDetector");

    /* renamed from: d */
    public static final C13601g f243104d = C36568h.m40985a(C1920b.f11792d);

    /* renamed from: e */
    public static final C13601g f243105e = C36568h.m40985a(C1919a.f11791d);

    /* renamed from: f */
    public static final C90590d<AppBrandRuntime> f243106f = new C90590d<>();

    /* renamed from: g */
    public static final Runnable f243107g = C83238c.f243108d;

    /* renamed from: com.tencent.mm.plugin.appbrand.l1$a */
    public static final class C1919a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C1919a f11791d = new C1919a();

        public C1919a() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_runtime_init_main_thread_lag_monitor, (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) ? 1 : 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.l1$b */
    public static final class C1920b extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C1920b f11792d = new C1920b();

        public C1920b() {
            super(0);
        }

        public Object invoke() {
            return Long.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_android_appbrand_runtime_init_main_thread_lag_threshold, 1000));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.l1$c */
    public static final class C83238c implements Runnable {

        /* renamed from: d */
        public static final C83238c f243108d = new C83238c();

        public final void run() {
            WeAppInitLagMonitorStruct.C80752a aVar;
            AppBrandRuntimeWC appBrandRuntimeWC;
            try {
                LinkedHashMap<String, AppBrandRuntimeWC> linkedHashMap = C81682d.f239733c;
                synchronized (linkedHashMap) {
                    aVar = null;
                    appBrandRuntimeWC = linkedHashMap.isEmpty() ? null : (AppBrandRuntimeWC) linkedHashMap.values().toArray()[linkedHashMap.size() - 1];
                }
                if (appBrandRuntimeWC != null) {
                    QualitySessionRuntime a = C84185b.m103768a(appBrandRuntimeWC);
                    if (a != null) {
                        String f = C90183c.m112858f(Looper.getMainLooper().getThread().getStackTrace());
                        WeAppInitLagMonitorStruct weAppInitLagMonitorStruct = new WeAppInitLagMonitorStruct();
                        weAppInitLagMonitorStruct.f236592d = weAppInitLagMonitorStruct.mo86045b("AppId", appBrandRuntimeWC.f238147j, true);
                        weAppInitLagMonitorStruct.f236593e = (long) a.f245837i;
                        int i = a.f245834f;
                        if (i == 1) {
                            aVar = WeAppInitLagMonitorStruct.C80752a.release;
                        } else if (i == 2) {
                            aVar = WeAppInitLagMonitorStruct.C80752a.debug;
                        } else if (i == 3) {
                            aVar = WeAppInitLagMonitorStruct.C80752a.demo;
                        }
                        weAppInitLagMonitorStruct.f236594f = aVar;
                        weAppInitLagMonitorStruct.f236595g = (long) a.f245835g;
                        weAppInitLagMonitorStruct.f236596h = (long) a.f245836h;
                        weAppInitLagMonitorStruct.f236597i = weAppInitLagMonitorStruct.mo86045b("InstanceId", a.f245832d, true);
                        weAppInitLagMonitorStruct.f236598j = weAppInitLagMonitorStruct.mo86045b("ProcessName", MMApplicationContext.getProcessName(), true);
                        weAppInitLagMonitorStruct.f236599k = weAppInitLagMonitorStruct.mo86045b("ThreadName", FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT, true);
                        weAppInitLagMonitorStruct.f236600l = weAppInitLagMonitorStruct.mo86045b("Stack", f, true);
                        weAppInitLagMonitorStruct.f236601m = weAppInitLagMonitorStruct.mo86045b("StackID", MD5Util.getMD5String(f), true);
                        weAppInitLagMonitorStruct.f236602n = ((Number) ((C36570n) C83237l1.f243104d).getValue()).longValue();
                        weAppInitLagMonitorStruct.mo86054n();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo115471a(long j, long j2, long j3) {
        this.f257873a = true;
        f243103c.postDelayed(f243107g, Math.max(0, ((Number) ((C36570n) f243104d).getValue()).longValue() - ((System.nanoTime() - j3) / ((long) 1000000))));
    }

    /* renamed from: b */
    public void mo115472b(long j, long j2, long j3, long j4, long j5, boolean z) {
        this.f257873a = false;
        f243103c.removeCallbacks(f243107g);
    }

    /* renamed from: d */
    public final void mo115473d(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "rt");
        if (((Boolean) ((C36570n) f243105e).getValue()).booleanValue()) {
            C90590d<AppBrandRuntime> dVar = f243106f;
            dVar.remove(appBrandRuntime);
            if (dVar.f260295f == 0) {
                C88938b bVar = C88938b.f256497y;
                if (bVar.f256515x) {
                    synchronized (bVar.f256500f) {
                        bVar.f256500f.remove(this);
                        if (bVar.f256500f.isEmpty()) {
                            bVar.mo123326g();
                        }
                    }
                }
            }
        }
    }
}
