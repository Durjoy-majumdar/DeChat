package ai0;

import android.content.Context;
import android.os.HandlerThread;
import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81546b;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81120h;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84560k4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84563l4;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gu0.C87386b;
import h81.C32735h;
import kr0.C88267e;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: ai0.q */
public class C79575q implements C79580u {

    /* renamed from: a */
    public final boolean f233330a;

    /* renamed from: b */
    public AppBrandRuntimeWC f233331b;

    /* renamed from: c */
    public C88267e f233332c;

    /* renamed from: d */
    public C81546b f233333d;

    /* renamed from: e */
    public int f233334e;

    /* renamed from: f */
    public MTimerHandler f233335f;

    /* renamed from: g */
    public HandlerThread f233336g;

    /* renamed from: h */
    public long f233337h;

    /* renamed from: i */
    public volatile boolean f233338i;

    /* renamed from: j */
    public volatile boolean f233339j;

    /* renamed from: k */
    public volatile boolean f233340k;

    /* renamed from: l */
    public volatile boolean f233341l;

    public C79575q(AppBrandRuntimeWC appBrandRuntimeWC, C81546b bVar) {
        this.f233330a = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_ad_liberate_preload_state_limit, 0) != 1 ? false : true;
        this.f233334e = 9;
        this.f233338i = false;
        this.f233339j = false;
        this.f233340k = false;
        this.f233341l = false;
        this.f233331b = appBrandRuntimeWC;
        this.f233333d = bVar;
    }

    /* renamed from: h */
    public static boolean m96625h(AppBrandRuntimeWC appBrandRuntimeWC) {
        return C79570o.m96621a(appBrandRuntimeWC).f233285s == 1;
    }

    /* renamed from: a */
    public final void mo109683a() {
        C84563l4 d;
        Log.m105925i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkAllFinished, isSplashAdFinished:%s, canLoadingSplashFinish:%s", Boolean.valueOf(this.f233339j), Boolean.valueOf(this.f233340k));
        if (this.f233339j && this.f233340k && (d = mo109686d()) != null) {
            Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkAllFinished, remove AdLoadingSplash");
            if (m96625h(this.f233331b)) {
                mo109688f(new q$$d(this, d));
            } else {
                d.mo117204w();
            }
        }
    }

    /* renamed from: b */
    public final void mo109684b() {
        Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdPrepareProcessReady   isResourceReady=" + this.f233341l + " isSplashAdFinished=" + this.f233339j);
    }

    /* renamed from: c */
    public final AppBrandSplashAdWorkerReportStruct mo109685c(C13604l<Long, Long> lVar, AppBrandSplashAdWorkerReportStruct appBrandSplashAdWorkerReportStruct, int i, long j, String str) {
        appBrandSplashAdWorkerReportStruct.f236347g = ((Long) lVar.f38555d).longValue();
        appBrandSplashAdWorkerReportStruct.f236348h = ((Long) lVar.f38556e).longValue();
        appBrandSplashAdWorkerReportStruct.f236350j = (long) i;
        appBrandSplashAdWorkerReportStruct.f236351k = j;
        if (str == null) {
            str = "";
        }
        appBrandSplashAdWorkerReportStruct.f236353m = appBrandSplashAdWorkerReportStruct.mo86045b("AdWorkerCreateFailErrorMsg", str, true);
        return appBrandSplashAdWorkerReportStruct;
    }

    /* renamed from: d */
    public final C84563l4 mo109686d() {
        C84560k4 k4Var = this.f233331b.f238154s;
        if (k4Var instanceof C84563l4) {
            return (C84563l4) k4Var;
        }
        return null;
    }

    /* renamed from: e */
    public final C88267e mo109687e() {
        C88267e eVar = this.f233332c;
        if (eVar != null) {
            return eVar;
        }
        AppBrandRuntimeWC appBrandRuntimeWC = this.f233331b;
        if (appBrandRuntimeWC != null) {
            return (C88267e) appBrandRuntimeWC.f238150p;
        }
        return null;
    }

    /* renamed from: f */
    public void mo109688f(C32224a<C13598b0> aVar) {
        C84563l4 d = mo109686d();
        if (d != null) {
            C84560k4 internalLoadingSplash = d.getInternalLoadingSplash();
            View view = internalLoadingSplash.getView();
            if (view == null || view.getParent() == null) {
                Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "[hideLoadingSplash] listener invoke1");
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            internalLoadingSplash.mo1911D(new q$$e(this, aVar));
        } else if (aVar != null) {
            aVar.invoke();
            Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "[hideLoadingSplash] listener invoke3");
        }
    }

    /* renamed from: g */
    public final void mo109689g() {
        C84563l4 d = mo109686d();
        if (d != null) {
            d.mo117196d();
        }
        Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hideSplashAdImmediately");
        this.f233339j = true;
        if (mo109687e() != null) {
            Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "destroyServiceAdComponentView");
            C88267e e = mo109687e();
            C79562l lVar = e.f255133S;
            if (lVar != null) {
                lVar.mo109674u();
                e.f255133S = null;
            }
        }
        mo109683a();
    }

    /* renamed from: i */
    public void mo109690i() {
        Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "onResourceReadyReceived");
        this.f233341l = true;
        mo109684b();
    }

    /* renamed from: j */
    public final void mo109691j(C40482o oVar, C88267e eVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f233332c.f240282A = appBrandRuntimeWC;
        eVar.f255130P = true;
        C81120h hVar = new C81120h();
        hVar.f238399i = "launch";
        hVar.mo113283s(eVar, (Context) null, oVar);
        this.f233334e = 8;
    }

    /* renamed from: k */
    public final void mo109692k() {
        C88267e eVar;
        Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "reportSplashAd");
        AppBrandSplashAdWorkerReportStruct c = C79570o.m96623c(this.f233331b);
        WeAppQualitySplashAdStruct.C80774a aVar = null;
        if (c != null) {
            c.f236359s = this.f233330a ? 1 : 0;
            if (!(!m96625h(this.f233331b) || (eVar = this.f233332c) == null || eVar.mo114347r0() == null)) {
                C87386b bVar = this.f233332c.mo114347r0().f245481f;
                if (bVar.f253237b == null) {
                    bVar = null;
                }
                if (bVar != null) {
                    C87386b bVar2 = this.f233332c.mo114347r0().f245481f;
                    if (bVar2.f253237b == null) {
                        bVar2 = null;
                    }
                    long j = bVar2.f253245j;
                    C87386b bVar3 = this.f233332c.mo114347r0().f245481f;
                    if (bVar3.f253237b == null) {
                        bVar3 = null;
                    }
                    long j2 = bVar3.f253244i;
                    if (j == 0) {
                        Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "WorkerCreateEarlyTime: -2");
                        c.f236360t = -2;
                    } else if (j2 == 0) {
                        Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "WorkerCreateEarlyTime: -3");
                        c.f236360t = -3;
                    } else if (j < j2) {
                        Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "WorkerCreateEarlyTime: -4");
                        c.f236360t = -4;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("WorkerCreateEarlyTime: ");
                        long j3 = j - j2;
                        sb.append(j3);
                        Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", sb.toString());
                        c.f236360t = j3;
                    }
                }
            }
        }
        AppBrandRuntimeWC appBrandRuntimeWC = this.f233331b;
        QualitySessionRuntime a = C84185b.m103768a(appBrandRuntimeWC);
        if (a != null) {
            C79551d a2 = C79570o.m96621a(appBrandRuntimeWC);
            WeAppQualitySplashAdStruct weAppQualitySplashAdStruct = new WeAppQualitySplashAdStruct();
            weAppQualitySplashAdStruct.f237095d = weAppQualitySplashAdStruct.mo86045b("InstanceId", a.f245832d, true);
            weAppQualitySplashAdStruct.f237096e = weAppQualitySplashAdStruct.mo86045b("AppId", a.f245833e, true);
            weAppQualitySplashAdStruct.f237097f = (long) a.f245837i;
            int i = a.f245834f;
            if (i == 1) {
                aVar = WeAppQualitySplashAdStruct.C80774a.release;
            } else if (i == 2) {
                aVar = WeAppQualitySplashAdStruct.C80774a.debug;
            } else if (i == 3) {
                aVar = WeAppQualitySplashAdStruct.C80774a.demo;
            }
            weAppQualitySplashAdStruct.f237098g = aVar;
            weAppQualitySplashAdStruct.f237099h = (long) a.f245835g;
            weAppQualitySplashAdStruct.f237101j = (long) a.f245836h;
            long j4 = a2.f233272f;
            weAppQualitySplashAdStruct.f237102k = j4;
            weAppQualitySplashAdStruct.mo86048e("StartTimeStampMs", j4);
            long j5 = a2.f233275i;
            weAppQualitySplashAdStruct.f237103l = j5;
            weAppQualitySplashAdStruct.mo86048e("EndTimeStampMs", j5);
            long j6 = a2.f233275i - a2.f233272f;
            weAppQualitySplashAdStruct.f237100i = j6;
            weAppQualitySplashAdStruct.mo86046c("CostTimeMs", j6);
            C79575q qVar = appBrandRuntimeWC.f238294v1;
            weAppQualitySplashAdStruct.f237104m = (long) (qVar != null ? qVar.f233334e : 9);
            long j7 = a2.f233272f;
            weAppQualitySplashAdStruct.f237105n = j7;
            long j8 = a2.f233275i;
            weAppQualitySplashAdStruct.f237106o = j8;
            weAppQualitySplashAdStruct.f237107p = j8 - j7;
            long j9 = a2.f233277k;
            weAppQualitySplashAdStruct.f237108q = j9;
            long j15 = a2.f233278l;
            weAppQualitySplashAdStruct.f237109r = j15;
            weAppQualitySplashAdStruct.f237110s = j15 - j9;
            long j16 = a2.f233279m;
            weAppQualitySplashAdStruct.f237111t = j16;
            long j17 = a2.f233280n;
            weAppQualitySplashAdStruct.f237112u = j17;
            weAppQualitySplashAdStruct.f237113v = j17 - j16;
            weAppQualitySplashAdStruct.f237114w = (long) C27903c.m38029b();
            long j18 = a2.f233274h;
            long j19 = a2.f233273g;
            weAppQualitySplashAdStruct.f237077B = j18 - j19;
            weAppQualitySplashAdStruct.f237115x = j19;
            weAppQualitySplashAdStruct.f237116y = j19 - a2.f233272f;
            weAppQualitySplashAdStruct.f237117z = j18;
            weAppQualitySplashAdStruct.f237076A = a2.f233275i - j18;
            weAppQualitySplashAdStruct.f237078C = appBrandRuntimeWC.mo113210l1() != null ? appBrandRuntimeWC.mo113210l1().f239382m1 : -1;
            weAppQualitySplashAdStruct.f237079D = 0;
            weAppQualitySplashAdStruct.f237080E = (long) a2.f233276j;
            long j25 = a2.f233281o;
            weAppQualitySplashAdStruct.f237081F = j25;
            long j26 = a2.f233282p;
            weAppQualitySplashAdStruct.f237082G = j26;
            long j27 = a2.f233283q;
            weAppQualitySplashAdStruct.f237083H = j27;
            String str = "InstanceId";
            long j28 = a2.f233284r;
            weAppQualitySplashAdStruct.f237084I = j28;
            weAppQualitySplashAdStruct.f237085J = j28 - j25;
            weAppQualitySplashAdStruct.f237086K = j27 - j26;
            weAppQualitySplashAdStruct.f237088M = (long) C27903c.m38029b();
            weAppQualitySplashAdStruct.f237087L = (long) C27903c.m38029b();
            weAppQualitySplashAdStruct.f237089N = 1;
            weAppQualitySplashAdStruct.f237090O = appBrandRuntimeWC.mo113184O1(false) != null ? (long) appBrandRuntimeWC.mo113184O1(false).mo113371a() : 0;
            weAppQualitySplashAdStruct.f237091P = weAppQualitySplashAdStruct.mo86045b("networkType", C84116i0.m103659b(MMApplicationContext.getContext()), true);
            weAppQualitySplashAdStruct.f237092Q = (long) a2.f233285s;
            weAppQualitySplashAdStruct.f237094S = a2.f233271e;
            weAppQualitySplashAdStruct.mo86054n();
            Log.m105918d("MicroMsg.AppBrandQualitySystem", "WeAppQualitySplashAdStruct:" + weAppQualitySplashAdStruct.mo1006q());
            AppBrandSplashAdWorkerReportStruct c2 = C79570o.m96623c(appBrandRuntimeWC);
            if (c2 != null) {
                c2.f236345e = c2.mo86045b(str, a.f245832d, true);
                c2.f236352l = a2.f233275i - a2.f233272f;
                C79575q qVar2 = appBrandRuntimeWC.f238294v1;
                c2.f236354n = (long) (qVar2 != null ? qVar2.f233334e : 9);
                C81546b bVar4 = appBrandRuntimeWC.f238295w1;
                c2.f236349i = (long) a2.f233285s;
                c2.f236361u = (long) a2.f233286t;
                if (bVar4 != null) {
                    c2.f236355o = bVar4.f239167g;
                    c2.f236356p = bVar4.f239168h;
                }
                c2.mo86054n();
            }
        }
        if (m96625h(this.f233331b) && c != null) {
            C84185b.m103774g(1754, 200, c.f236357q);
            C84185b.m103774g(1755, 500, c.f236358r);
        }
    }

    /* renamed from: l */
    public final void mo109693l() {
        int i;
        this.f233337h = Util.nowMilliSecond();
        HandlerThread handlerThread = new HandlerThread("checkShowAdThread");
        this.f233336g = handlerThread;
        handlerThread.start();
        this.f233335f = new MTimerHandler(this.f233336g.getLooper(), (MTimerHandler.CallBack) new q$$c(this), false);
        if (C79570o.m96621a(this.f233331b).f233285s != 2) {
            Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "NOT PRELOAD SHOW");
            C32735h.C32737c cVar = C32735h.C32737c.clicfg_appbrand_ad_not_preload_timeout_interval;
            this.f233331b.getClass();
            i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(cVar, C27903c.m38029b());
            if (i <= 0) {
                this.f233331b.getClass();
                i = C27903c.m38029b();
            }
        } else {
            Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "PRELOAD SHOW");
            this.f233331b.getClass();
            i = C27903c.m38029b();
        }
        Log.m105925i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdTimer start, timeThreshold:%s", Integer.valueOf(i));
        this.f233338i = false;
        this.f233335f.startTimer((long) i);
    }

    /* renamed from: m */
    public final void mo109694m(String str) {
        if (this.f233335f != null) {
            Log.m105925i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "stopCheckShowAdTimeoutTick, appId:%s, reason:%s, realTime:%s", this.f233331b.f238147j, str, Long.valueOf(Util.nowMilliSecond() - this.f233337h));
            this.f233338i = true;
            this.f233335f.stopTimer();
            this.f233335f = null;
        }
        HandlerThread handlerThread = this.f233336g;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f233336g = null;
        }
    }
}
