package com.tencent.p014mm.plugin.appbrand;

import ai0.C79575q;
import android.content.Context;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.game.preload.C81889e;
import com.tencent.p014mm.plugin.appbrand.game.preload.C81891f;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82816p;
import com.tencent.p014mm.plugin.appbrand.keepalive.C83202b;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchErrorAction;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle;
import com.tencent.p014mm.plugin.appbrand.launching.C83303d0;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.report.model.C84170q;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84218r;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import java.util.Locale;
import junit.framework.Assert;
import p170ic.C87690d;
import sr0.C90343c;
import vq0.C90860a;
import vq0.C90864k;
import wi0.C90981g;
import wq0.C91069h;
import xq0.C91323a;

/* renamed from: com.tencent.mm.plugin.appbrand.a2 */
public class C81108a2 implements AppBrandPrepareTask.C83253c<AppBrandSysConfigWC> {

    /* renamed from: d */
    public volatile C85043y3 f238374d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandPrepareTask f238375e;

    /* renamed from: f */
    public final /* synthetic */ long f238376f;

    /* renamed from: g */
    public final /* synthetic */ AppBrandRuntime$$z f238377g;

    /* renamed from: h */
    public final /* synthetic */ AppBrandRuntimeWC f238378h;

    public C81108a2(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandPrepareTask appBrandPrepareTask, long j, AppBrandRuntime$$z appBrandRuntime$$z) {
        this.f238378h = appBrandRuntimeWC;
        this.f238375e = appBrandPrepareTask;
        this.f238376f = j;
        this.f238377g = appBrandRuntime$$z;
    }

    /* renamed from: B */
    public void mo113268B() {
        boolean z = this.f238378h.mo113064k0() || this.f238375e.f243156b;
        this.f238378h.mo113052e("onSyncAppidABTestStart task[%d] interrupted[%b]", Integer.valueOf(this.f238375e.hashCode()), Boolean.valueOf(z));
        if (!z) {
            try {
                C84185b.m103770c(this.f238378h.f238147j, true).f245852M = true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandRuntimeWC", "onSyncAppidABTestStart get QualitySession with appId[%s], e=%s", this.f238378h.f238147j, e);
            }
            C81688d0 d0Var = this.f238378h.f238290r1;
            if (d0Var != null) {
                d0Var.mo114035j(d0$$h.SYNC_APPID_ABTEST_INFO);
            } else {
                Log.m105920e("MicroMsg.AppBrandRuntimeWC", "AppBrandRuntimeBoostStrategy boost null!");
            }
        }
    }

    /* renamed from: C */
    public void mo113269C(String str) {
        boolean z = this.f238378h.mo113064k0() || this.f238375e.f243156b;
        this.f238378h.mo113052e("notifyStartMigrateTargetApp, task[%d], interrupted[%b]", Integer.valueOf(this.f238375e.hashCode()), Boolean.valueOf(z));
        if (!z) {
            this.f238378h.mo113190U1(str);
        }
    }

    /* renamed from: I */
    public void mo113270I() {
        boolean z = this.f238378h.mo113064k0() || this.f238375e.f243156b;
        this.f238378h.mo113052e("onSyncLaunchStart task[%d] interrupted[%b]", Integer.valueOf(this.f238375e.hashCode()), Boolean.valueOf(z));
        if (!z) {
            try {
                C84185b.m103770c(this.f238378h.f238147j, true).f245849J = true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandRuntimeWC", "onSyncLaunchStart get QualitySession with appId[%s], e=%s", this.f238378h.f238147j, e);
            }
            C81688d0 d0Var = this.f238378h.f238290r1;
            if (d0Var != null) {
                d0Var.mo114035j(d0$$h.SYNC_LAUNCH);
            }
        }
    }

    /* renamed from: J */
    public void mo113271J() {
        boolean z = this.f238378h.mo113064k0() || this.f238375e.f243156b;
        this.f238378h.mo113052e("notifyAppRestartOnLaunchRequestedLatestVersion, task[%d], interrupted[%b]", Integer.valueOf(this.f238375e.hashCode()), Boolean.valueOf(z));
        if (!z) {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f238378h;
            Log.m105925i("MicroMsg.AppBrand.RuntimeRestartHelper", "restartAppImplOnLaunchRequestedLatestVersion appId:%s", appBrandRuntimeWC.f238147j);
            LaunchParcel a = C90981g.m114148a(appBrandRuntimeWC.mo113210l1());
            a.mo115684d();
            a.f243718J = new AppBrandRuntimeReloadReportBundle(appBrandRuntimeWC.mo113210l1().f239379j1.f245832d, "NeedLatestVersion");
            AppBrandPreInitTask appBrandPreInitTask = new AppBrandPreInitTask(appBrandRuntimeWC.f238141d, a, false, new d4$$a(appBrandRuntimeWC));
            appBrandPreInitTask.f243144n = true;
            appBrandPreInitTask.mo115494v();
        }
    }

    /* renamed from: K */
    public void mo113179K(int i) {
        this.f238378h.mo113179K(i);
    }

    /* renamed from: L */
    public void mo113272L() {
        boolean z = this.f238378h.mo113064k0() || this.f238375e.f243156b;
        boolean z2 = this.f238378h.mo113210l1().f239389t1;
        this.f238378h.mo113052e("onLaunchTimeoutFallbackReloadRequested, task[%d], interrupted[%b], isBackupWxaAttrsAlreadyUsed[%b]", Integer.valueOf(this.f238375e.hashCode()), Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!z && !z2) {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f238378h;
            AppBrandPrepareTask appBrandPrepareTask = this.f238375e;
            C87412m.m108594g(appBrandRuntimeWC, "rt");
            C87412m.m108594g(appBrandPrepareTask, "prepareTask");
            Context R = appBrandRuntimeWC.mo113026R();
            if (R == null) {
                R = appBrandRuntimeWC.f238141d;
            }
            C87412m.m108593f(R, "rt.context ?: rt.appContext");
            AppBrandInitConfigWC M1 = appBrandRuntimeWC.mo113210l1();
            C87412m.m108593f(M1, "rt.initConfig");
            LaunchParcel a = C90981g.m114148a(M1);
            String str = appBrandRuntimeWC.mo113210l1().f239379j1.f245832d;
            C87412m.m108593f(str, "rt.initConfig.qualityReportSession.instanceId");
            a.f243718J = new AppBrandRuntimeReloadReportBundle(str, "LocalVersionFallback");
            C85043y3 y3Var = new C85043y3(appBrandRuntimeWC, appBrandPrepareTask);
            AppBrandPreInitTask appBrandPreInitTask = new AppBrandPreInitTask(R, a, true, y3Var);
            appBrandPreInitTask.f243144n = true;
            appBrandPreInitTask.mo115494v();
            this.f238374d = y3Var;
        }
    }

    /* renamed from: N */
    public void mo113273N(AppBrandSysConfigLU appBrandSysConfigLU, AppBrandLaunchErrorAction appBrandLaunchErrorAction, AppStartupPerformanceReportBundle appStartupPerformanceReportBundle) {
        AppBrandLaunchErrorAction appBrandLaunchErrorAction2 = appBrandLaunchErrorAction;
        AppStartupPerformanceReportBundle appStartupPerformanceReportBundle2 = appStartupPerformanceReportBundle;
        AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) appBrandSysConfigLU;
        boolean c = this.f238375e.mo115500c();
        boolean l0 = this.f238378h.mo113065l0();
        boolean k0 = this.f238378h.mo113064k0();
        boolean z = this.f238374d != null;
        AppBrandRuntimeWC appBrandRuntimeWC = this.f238378h;
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(this.f238375e.hashCode());
        objArr[1] = Boolean.valueOf(appBrandSysConfigWC == null);
        objArr[2] = Boolean.valueOf(c);
        objArr[3] = Boolean.valueOf(l0);
        objArr[4] = Boolean.valueOf(k0);
        objArr[5] = Boolean.valueOf(z);
        appBrandRuntimeWC.mo113052e("AppBrandPrepareTask.onPrepareDone task[%d] null==config?[%b], isInterruptedBeforePrepareDone[%b], runtimeFinishing[%b %b], isFallbackReloadRequested[%b]", objArr);
        if (c || l0 || k0) {
            this.f238378h.mo113045a0().mo117038a("destroyed");
            return;
        }
        C84185b.f245912a.mo116894m(this.f238378h.mo113012H(), appStartupPerformanceReportBundle2);
        if (appBrandSysConfigWC == null) {
            C83226n.m102125b(this.f238378h.mo113012H(), KSProcessWeAppLaunch.stepPrepareResourceWaitForResult);
            C83226n.m102125b(this.f238378h.mo113012H(), KSProcessWeAppLaunch.stepColdLaunchFailed);
            C83226n.m102132i(KSProcessWeAppLaunch.class, this.f238378h.mo113012H());
            this.f238378h.mo113045a0().mo117038a(StateEvent.ProcessResult.FAILED);
            if (this.f238374d == null) {
                this.f238378h.mo113176H1(new C85035x1(this, appBrandLaunchErrorAction2));
                if (appBrandLaunchErrorAction2 != null) {
                    OpenBusinessViewUtil.m101148b(this.f238378h);
                }
                C82816p.m101563c(this.f238378h.mo113012H(), this.f238378h.mo113030T(), this.f238378h.mo121253n1());
                return;
            }
            return;
        }
        this.f238378h.mo113052e("AppBrandPrepareTask.onPrepareDone task[%d] pkg[%s]", Integer.valueOf(this.f238375e.hashCode()), appBrandSysConfigWC.f261072r);
        if (this.f238374d != null) {
            this.f238374d.mo118013b();
        }
        C83226n.m102128e(this.f238378h.mo113012H(), KSProcessWeAppLaunch.stepPrepareResourceWaitForResult);
        C83226n.m102128e(this.f238378h.mo113012H(), KSProcessWeAppLaunch.stepPrepareResourceGroup);
        C83226n.m102130g(this.f238378h.mo113012H(), KSProcessWeAppLaunch.stepSetupConfigsPostResourcePrepared);
        ICommLibReader N1 = this.f238378h.mo113183N1();
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "onPrepareDone runtimeLibReader[%s] of runtime[%s], relyCommLibUpdate[%b]", N1, this.f238378h.toString(), Boolean.valueOf(appBrandSysConfigWC.f234856A.f234898g));
        if (N1 == null) {
            this.f238378h.mo113045a0().mo117038a("FATAL");
            return;
        }
        this.f238378h.mo113045a0().mo117041d();
        long currentTicks = Util.currentTicks();
        if (C81289m.C81290a.m99664b(this.f238378h.mo113053e0()) && this.f238378h.mo113210l1().f234802F != appBrandSysConfigWC.mo111316b()) {
            Log.m105921e("MicroMsg.AppBrandRuntimeWC", "onPrepareDone, InitConfig.appVersion(%d) != SysConfig.appVersion(%d), appId:%s", Integer.valueOf(this.f238378h.mo113210l1().f234802F), Integer.valueOf(appBrandSysConfigWC.mo111316b()), this.f238378h.mo113012H());
            if (this.f238378h.mo113044a()) {
                Assert.fail("InitConfig.appVersion != SysConfig.appVersion @smoothieli");
            }
        }
        ((AppBrandRuntime$$h) this.f238378h.mo113023P()).add(appBrandSysConfigWC);
        ((AppBrandRuntime$$h) this.f238378h.mo113023P()).add(appStartupPerformanceReportBundle2);
        this.f238378h.mo113200e2();
        try {
            C84185b.m103771d(appBrandSysConfigWC, appStartupPerformanceReportBundle2, this.f238378h);
            C84218r.m103815e(appBrandSysConfigWC.f234876S0.f239286I * 1000);
        } catch (Throwable th) {
            Log.m105929w("MicroMsg.AppBrandRuntimeWC", "onPrepareDone [%s] reportResourceReady e = %s", this.f238378h.mo113012H(), th);
        }
        this.f238378h.f238284l1.mo115918e(1, System.currentTimeMillis() - this.f238376f);
        C90343c.C90344a.f259327a.mo124565a(KSProcessWeAppLaunch.NAME, this.f238378h.mo113012H(), C90343c.C90345b.PREPARE_RESOUCE);
        ((AppBrandRuntime$$h) this.f238378h.mo113023P()).add(appBrandSysConfigWC.mo111317c());
        ((AppBrandRuntime$$h) this.f238378h.mo113023P()).add(new C91069h(appBrandSysConfigWC.f234857B));
        ((AppBrandRuntime$$h) this.f238378h.mo113023P()).add(new C91323a(appBrandSysConfigWC.f234858C));
        AppBrandRuntimeWC.m99217d(this.f238378h);
        this.f238378h.mo113062j0(true);
        try {
            C87690d.m109091b(String.format(Locale.ENGLISH, "AppBrandRuntimeWC(%s)#resetAppConfig", new Object[]{this.f238378h.mo113012H()}), new C85042y1(this));
            try {
                if (!this.f238378h.mo121254q1()) {
                    AppBrandRuntimeWC appBrandRuntimeWC2 = this.f238378h;
                    appBrandRuntimeWC2.mo113014I0(C90860a.class, C90864k.m113949b(appBrandRuntimeWC2));
                }
                C83202b.INSTANCE.mo115447b(this.f238378h);
                C84170q unused = this.f238378h.f238283k1 = null;
                C83226n.m102128e(this.f238378h.mo113012H(), KSProcessWeAppLaunch.stepSetupConfigsPostResourcePrepared);
                MMHandlerThread.postToMainThread(new C85048z1(this));
                if (!this.f238375e.mo115500c()) {
                    new C83303d0(this.f238378h, this.f238377g).mo115604a();
                }
                C79575q R1 = this.f238378h.mo113187R1();
                if (R1 != null) {
                    R1.mo109690i();
                }
                this.f238378h.mo113052e("onPrepareDone stuffs task[%d] cost[%dms] interrupted[%b]", Integer.valueOf(this.f238375e.hashCode()), Long.valueOf(Util.currentTicks() - currentTicks), Boolean.valueOf(this.f238375e.mo115500c()));
            } catch (NullPointerException e) {
                if (this.f238378h.mo113064k0() || this.f238378h.mo113065l0()) {
                    Log.m105929w("MicroMsg.AppBrandRuntimeWC", "runtime(%s) destroyed, caught npe=%s", this.f238378h.mo113012H(), e);
                    return;
                }
                throw e;
            }
        } catch (ICommLibReader.C81403a unused2) {
            Log.m105921e("MicroMsg.AppBrandRuntimeWC", "onPrepareDone [%s] commLib not ready", this.f238378h.mo113012H());
        }
    }

    /* renamed from: Q */
    public void mo113274Q(int i) {
        boolean z = this.f238378h.mo113064k0() || this.f238375e.f243156b;
        this.f238378h.mo113052e("onDownloadProgress(%d), task[%d] hasDownload[%b]", Integer.valueOf(i), Integer.valueOf(this.f238375e.hashCode()), Boolean.valueOf(this.f238378h.f238285m1));
        if (!z) {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f238378h;
            appBrandRuntimeWC.getClass();
            appBrandRuntimeWC.mo113024P0(new C85033x(appBrandRuntimeWC, i));
        }
    }

    /* renamed from: c */
    public void mo113275c(long j) {
        boolean z = this.f238378h.mo113064k0() || this.f238375e.f243156b;
        this.f238378h.mo113052e("onDownloadStarted(%s) task[%d] interrupted[%b]", Util.formatUnixTime(j), Integer.valueOf(this.f238375e.hashCode()), Boolean.valueOf(z));
        if (!z) {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f238378h;
            appBrandRuntimeWC.f238285m1 = true;
            if (appBrandRuntimeWC.f238283k1 != null) {
                this.f238378h.f238283k1.f245769b = true;
            }
            try {
                C84185b.m103770c(this.f238378h.f238147j, true).f245850K = true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandRuntimeWC", "onSyncLaunchStart get QualitySession with appId[%s], e=%s", this.f238378h.f238147j, e);
            }
            AppBrandRuntimeWC appBrandRuntimeWC2 = this.f238378h;
            boolean z2 = appBrandRuntimeWC2.f238285m1;
            appBrandRuntimeWC2.getClass();
            C81889e.m100570d().getClass();
            C81891f.m100578a().f240217h = z2;
            C81688d0 d0Var = this.f238378h.f238290r1;
            if (d0Var != null) {
                d0Var.mo114035j(d0$$h.SYNC_GET_CODE);
            }
        }
    }

    /* renamed from: z */
    public void mo113276z() {
        boolean z = this.f238378h.mo113064k0() || this.f238375e.f243156b;
        this.f238378h.mo113052e("onSyncJsApiInfoStart task[%d] interrupted[%b]", Integer.valueOf(this.f238375e.hashCode()), Boolean.valueOf(z));
        if (!z) {
            try {
                C84185b.m103770c(this.f238378h.f238147j, true).f245851L = true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandRuntimeWC", "onSyncJsApiInfoStart get QualitySession with appId[%s], e=%s", this.f238378h.f238147j, e);
            }
            C81688d0 d0Var = this.f238378h.f238290r1;
            if (d0Var != null) {
                d0Var.mo114035j(d0$$h.SYNC_JSAPIINFO);
            } else {
                Log.m105920e("MicroMsg.AppBrandRuntimeWC", "AppBrandRuntimeBoostStrategy boost null!");
            }
        }
    }
}
