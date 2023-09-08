package com.tencent.p014mm.plugin.appbrand.launching;

import android.util.Pair;
import bp0.C79746b;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.plugin.appbrand.launching.C83460s2;
import com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import mp3.C88819d;
import ob0.C89132b;
import org.json.JSONException;
import org.json.JSONObject;
import sx3.C110823p;
import te3.C90422jy;
import te3.C90436rm2;
import te3.C90446wm2;
import te3.b85;
import te3.l65;
import te3.p45;
import te3.p65;
import u24.C90599h;
import wi0.C38164x;
import wi0.C91000y;
import wo0.C66142j;
import wo0.C91044c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.y3 */
public class C83524y3 extends C83448q3<Pair<C83515w2, C90446wm2>> {

    /* renamed from: A */
    public final AppBrandRuntimeReloadReportBundle f244019A;

    /* renamed from: B */
    public final boolean f244020B;

    /* renamed from: h */
    public final String f244021h;

    /* renamed from: i */
    public final int f244022i;

    /* renamed from: j */
    public final int f244023j;

    /* renamed from: n */
    public final ICommLibReader f244024n;

    /* renamed from: o */
    public final int f244025o;

    /* renamed from: p */
    public final int f244026p;

    /* renamed from: q */
    public final String f244027q;

    /* renamed from: r */
    public final AppBrandLaunchReferrer f244028r;

    /* renamed from: s */
    public final String f244029s;

    /* renamed from: t */
    public final QualitySession f244030t;

    /* renamed from: u */
    public final String f244031u;

    /* renamed from: v */
    public final AppBrandLaunchFromNotifyReferrer f244032v;

    /* renamed from: w */
    public final String f244033w;

    /* renamed from: x */
    public final C80247h f244034x;

    /* renamed from: y */
    public final int f244035y;

    /* renamed from: z */
    public final int f244036z;

    public C83524y3(String str, int i, WxaAttributes.WxaVersionInfo wxaVersionInfo, int i2, int i3, String str2, AppBrandLaunchReferrer appBrandLaunchReferrer, String str3, ICommLibReader iCommLibReader, QualitySession qualitySession, String str4, AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer, String str5, C80247h hVar, int i4, int i5, AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle, boolean z) {
        this.f244021h = str;
        this.f244022i = i;
        this.f244023j = C81289m.C81290a.m99664b(i) ? wxaVersionInfo.f239452d : 0;
        this.f244025o = i2;
        this.f244026p = i3;
        this.f244027q = str2;
        this.f244028r = appBrandLaunchReferrer;
        this.f244029s = str3;
        this.f244031u = str4;
        this.f244032v = appBrandLaunchFromNotifyReferrer;
        this.f244033w = str5;
        this.f244034x = hVar;
        this.f244035y = i4;
        this.f244036z = i5;
        this.f244019A = appBrandRuntimeReloadReportBundle;
        this.f244024n = iCommLibReader;
        this.f244030t = qualitySession;
        this.f244020B = z;
    }

    public Object call() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String str;
        boolean z;
        Class<C32735h> cls = C32735h.class;
        long nowMilliSecond = Util.nowMilliSecond();
        C79746b.m96887a(0, this.f244021h, this.f244022i, this.f244023j);
        C83515w2 w2Var = new C83515w2();
        w2Var.field_appId = this.f244021h;
        C81161g2.requireAccountInitializedOnDemand();
        C83496u2 u2Var = C81161g2.f238475n;
        if (u2Var == null) {
            Log.m105921e("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "call() invalid storage, appId[%s]", this.f244021h);
            C79746b.m96887a(1, this.f244021h, this.f244022i, this.f244023j);
        } else {
            p45 p45 = new p45();
            p45.f259731d = this.f244022i;
            p45.f259732e = this.f244023j;
            p45.f259733f = this.f244026p;
            p45.f259734g = this.f244027q;
            p45.f259735h = 0;
            p45.f259736i = this.f244025o;
            b85 b = C66142j.m77970b(this.f244028r);
            l65 a = C66142j.m77969a(this.f244028r);
            ICommLibReader iCommLibReader = this.f244024n;
            int a2 = iCommLibReader == null ? -1 : iCommLibReader.mo113371a();
            C83521x3 x3Var = new C83521x3(this, u2Var, w2Var);
            C90422jy jyVar = new C90422jy();
            jyVar.f259639d = this.f244026p;
            this.f244034x.mo111350a(jyVar);
            if (((Boolean) x3Var.call()).booleanValue()) {
                Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "call() appId[%s] instanceId[%s], need sync, about to call cgi", this.f244021h, this.f244030t.f245832d);
                AppLaunchPrepareProcess appLaunchPrepareProcess = ((C83367m0) this).f243596C;
                if (appLaunchPrepareProcess.f243257g != null) {
                    C83483u uVar = (C83483u) appLaunchPrepareProcess.f243257g;
                    if (uVar.f243928d != null) {
                        AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
                        prepareResult.f243185d = AppBrandPrepareTask.C83254d.EVENT_ON_SYNC_LAUNCH_START;
                        uVar.f243928d.mo894a(prepareResult);
                    }
                } else {
                    appLaunchPrepareProcess.f243250W = Boolean.TRUE;
                }
                long nowMilliSecond2 = Util.nowMilliSecond();
                jyVar.f259641f = 101;
                Class<C32735h> cls2 = cls;
                String str2 = "MicroMsg.AppBrand.PrepareStepCheckLaunchInfo";
                CgiLaunchWxaApp cgiLaunchWxaApp = new CgiLaunchWxaApp(this.f244021h, true, p45, b, a, this.f244029s, a2, this.f244030t, this.f244031u, this.f244032v, this.f244033w, jyVar, this.f244035y, this.f244020B);
                cgiLaunchWxaApp.f243445u = this;
                C89132b.C89134c<C90446wm2> n = cgiLaunchWxaApp.mo115600n();
                C83460s2.m102419a(C83460s2.C83462b.SYNC_LAUNCH, this.f244021h, this.f244023j, this.f244022i, this.f244026p, Util.nowMilliSecond() - nowMilliSecond2, 0);
                C83226n.m102129f(this.f244021h, KSProcessWeAppLaunch.stepPrepareResourceSubProcessLaunchWxaApp_CGI, "", nowMilliSecond, Util.nowMilliSecond());
                if (cgiLaunchWxaApp.mo115602s() == null || cgiLaunchWxaApp.mo115602s().f259925g == null || !cgiLaunchWxaApp.mo115602s().f259925g.f259556j) {
                    str = str2;
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    long currentTicks = Util.currentTicks();
                    PBool pBool = new PBool();
                    new PrepareStepCheckLaunchInfo$2(this, C40008f.f107254d, currentTicks, pBool, countDownLatch).alive();
                    try {
                        countDownLatch.await();
                        z = pBool.value;
                        str = str2;
                    } catch (Exception e) {
                        str = str2;
                        Log.m105921e(str, "waitForCommLibUpdated get exception:%s", e);
                        z = true;
                    }
                    if (!z) {
                        C83454r3.m102415a(C0966R.string.f360104a50, this);
                        C79746b.m96887a(3, this.f244021h, this.f244022i, this.f244023j);
                    }
                }
                if (!(cgiLaunchWxaApp.mo115602s() == null || cgiLaunchWxaApp.mo115602s().f259922d == null || 4 != cgiLaunchWxaApp.mo115602s().f259922d.f259816d)) {
                    boolean z2 = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_wxaapp_restart_on_notify_lowest_version, 1) == 1;
                    AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle = this.f244019A;
                    boolean z3 = appBrandRuntimeReloadReportBundle != null && "NeedLatestVersion".equals(appBrandRuntimeReloadReportBundle.f243876e);
                    Log.m105925i(str, "call() meet sync launch get notify update background, appId:%s, exptOpen:%b, isRestartedBySameReason:%b", this.f244021h, Boolean.valueOf(z2), Boolean.valueOf(z3));
                    if (z2 && !z3 && C81289m.C81290a.m99664b(this.f244022i)) {
                        C79746b.m96887a(4, this.f244021h, this.f244022i, this.f244023j);
                        throw new C83310d4();
                    }
                }
                if (!(cgiLaunchWxaApp.mo115602s() == null || cgiLaunchWxaApp.mo115602s().f259922d == null || 6 != cgiLaunchWxaApp.mo115602s().f259922d.f259816d)) {
                    C79746b.m96887a(6, this.f244021h, this.f244022i, this.f244023j);
                    p65 p65 = cgiLaunchWxaApp.mo115602s().f259922d.f259821i;
                    if (p65 != null && !C90599h.m113509b(this.f244021h, p65.f139610d) && !C90599h.m113511d(p65.f139610d)) {
                        throw new C83314e4(p65.f139610d);
                    }
                }
                if (cgiLaunchWxaApp.f243442r == null) {
                    C79746b.m96887a(2, this.f244021h, this.f244022i, this.f244023j);
                    if (n != null) {
                        if (n.f256793a == 4) {
                            C79746b.m96887a(9, this.f244021h, this.f244022i, this.f244023j);
                        } else {
                            C79746b.m96887a(10, this.f244021h, this.f244022i, this.f244023j);
                        }
                    }
                } else {
                    C79746b.m96887a(11, this.f244021h, this.f244022i, this.f244023j);
                }
                if (cgiLaunchWxaApp.mo115602s() != null) {
                    C90446wm2 s = cgiLaunchWxaApp.mo115602s();
                    String str3 = this.f244021h;
                    int i = this.f244022i;
                    int i2 = this.f244023j;
                    C87412m.m108594g(s, "response");
                    C87412m.m108594g(str3, "appId");
                    ArrayList arrayList = new ArrayList(2);
                    C90436rm2 rm22 = s.f259922d;
                    int i3 = rm22 != null ? rm22.f259816d : -1;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            arrayList.add(new IDKey(1834, 52, 1));
                        } else if (i3 == 3) {
                            arrayList.add(new IDKey(1834, 53, 1));
                        } else if (i3 == 4) {
                            arrayList.add(new IDKey(1834, 54, 1));
                        } else if (i3 == 5) {
                            arrayList.add(new IDKey(1834, 55, 1));
                        }
                        arrayList.add(new IDKey(1834, 51, 1));
                        C115669n.INSTANCE.mo160124a(arrayList, true);
                        C84240s.m103836b(str3, i2, i, arrayList);
                    }
                }
                return Pair.create(cgiLaunchWxaApp.f243442r, cgiLaunchWxaApp.mo115602s());
            }
            Class<C32735h> cls3 = cls;
            jyVar.f259641f = 102;
            C88819d.LOGIC.arrange(new C91044c(new CgiLaunchWxaApp(this.f244021h, false, p45, b, a, this.f244029s, a2, this.f244030t, this.f244031u, this.f244032v, this.f244033w, jyVar, this.f244035y, this.f244020B)));
            C83226n.m102129f(this.f244021h, KSProcessWeAppLaunch.stepPrepareResourceSubProcessLaunchWxaApp_DB, "", nowMilliSecond, Util.nowMilliSecond());
            C79746b.m96887a(12, this.f244021h, this.f244022i, this.f244023j);
            Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "call() appId[%s] instanceId[%s], return with cache", this.f244021h, this.f244030t.f245832d);
            if (((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_opconfig_exptinfo_update_by_multi_source, 0) == 1) {
                String str4 = w2Var.field_opConfig;
                if (str4 == null || str4.length() == 0) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(w2Var.field_opConfig);
                    } catch (Exception e2) {
                        Log.m105920e("MicroMsg.AppBrand.LaunchWxaAppCacheStorageKt", "tryApplyLatestExptInfo for appId:" + w2Var.field_appId + ", parse original opConfig failed " + e2);
                        jSONObject = new JSONObject();
                    }
                }
                JSONObject jSONObject4 = jSONObject;
                C38164x qq = ((C91000y) C81161g2.Bx0(C91000y.class)).mo125064qq(w2Var.field_appId);
                if (qq != null) {
                    String str5 = "tryApplyLatestExptInfo(" + w2Var.field_appId + ')';
                    IAutoDBItem.MAutoDBInfo mAutoDBInfo = C38164x.f100831t;
                    JSONObject optJSONObject = jSONObject4.optJSONObject("expt_info");
                    long j = 0;
                    if (optJSONObject == null) {
                        Log.m105920e("Luggage.WeDataExptInfo", "optIssueTimestamp(tryApplyOverrideToOpConfig), it is null");
                    } else if (optJSONObject instanceof C38164x) {
                        j = ((C38164x) optJSONObject).field_issueTimestampMs;
                    } else {
                        try {
                            Object obj = optJSONObject.get("expt_ext_info_json");
                            if (obj instanceof String) {
                                jSONObject3 = new JSONObject((String) obj);
                            } else if (obj instanceof JSONObject) {
                                jSONObject3 = (JSONObject) obj;
                            } else {
                                throw new JSONException("expt_ext_info_json type error");
                            }
                            j = jSONObject3.getLong("issue_time");
                        } catch (Exception e3) {
                            Log.m105920e("Luggage.WeDataExptInfo", "optIssueTimestamp(" + "tryApplyOverrideToOpConfig" + "), json parse failed " + e3);
                        }
                    }
                    long j2 = qq.field_issueTimestampMs;
                    if (j2 == -1 || j2 > j) {
                        try {
                            jSONObject4.put("expt_info", new JSONObject(qq.field_exptInfo));
                            StringBuilder sb = new StringBuilder();
                            sb.append("applyOverrideToOpConfig(");
                            sb.append(str5);
                            sb.append("), this.timestamp(");
                            sb.append(qq.field_issueTimestampMs);
                            sb.append(") vs other.timestamp:");
                            sb.append(j);
                            sb.append(" check ok, do replace, this.source=");
                            C91000y.C91001a aVar = (C91000y.C91001a) C110823p.m150982H(C91000y.C91001a.values(), qq.field_source);
                            if (aVar == null) {
                                aVar = C91000y.C91001a.Unknown;
                            }
                            sb.append(aVar);
                            Log.m105924i("Luggage.WeDataExptInfo", sb.toString());
                            jSONObject2 = JSONObject.class.cast(jSONObject4);
                        } catch (Exception e4) {
                            Log.m105920e("Luggage.WeDataExptInfo", "applyOverrideToOpConfig(" + str5 + ", replace expt_info failed " + e4);
                        }
                        JSONObject jSONObject5 = jSONObject2;
                    }
                    jSONObject2 = jSONObject4;
                    JSONObject jSONObject52 = jSONObject2;
                }
                if (jSONObject4.length() > 0) {
                    w2Var.field_opConfig = jSONObject4.toString();
                }
            }
            return Pair.create(w2Var, (Object) null);
        }
        return null;
    }

    /* renamed from: f */
    public String mo115591f() {
        return "MicroMsg.AppBrand.PrepareStepCheckLaunchInfo";
    }
}
