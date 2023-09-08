package rb0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.BizQualityReportStruct;
import com.tencent.p014mm.plugin.biz.C55579f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19607d1;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.p014mm.storage.C30755l0;
import com.tencent.p014mm.storage.C30766q;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import h81.C32735h;
import java.util.HashSet;
import rb0.C48011x;
import sb0.C48329b;
import sb0.C48335d;
import sb0.C48345g;
import sb0.C48349h;
import sb0.C48352i;
import sb0.C48354k;
import zh3.C91753f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: rb0.v0 */
public class C48009v0 extends C86301e {

    /* renamed from: x */
    public static long f128769x;

    /* renamed from: y */
    public static final Object f128770y = new Object();

    /* renamed from: d */
    public C47976j f128771d;

    /* renamed from: e */
    public C48011x.C48012a f128772e = null;

    /* renamed from: f */
    public C47997p f128773f = null;

    /* renamed from: g */
    public C47994n f128774g;

    /* renamed from: h */
    public C47989m f128775h = null;

    /* renamed from: i */
    public C48335d f128776i = null;

    /* renamed from: j */
    public C30766q f128777j = null;

    /* renamed from: n */
    public C30755l0 f128778n = null;

    /* renamed from: o */
    public C48329b f128779o = null;

    /* renamed from: p */
    public C48354k f128780p = null;

    /* renamed from: q */
    public C48345g f128781q = null;

    /* renamed from: r */
    public C48352i f128782r = null;

    /* renamed from: s */
    public C48349h f128783s = null;

    /* renamed from: t */
    public C47971i f128784t = null;

    /* renamed from: u */
    public C19625p0 f128785u = null;

    /* renamed from: v */
    public C19607d1 f128786v = null;

    /* renamed from: w */
    public C47961a f128787w;

    public static C48335d Ax0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128776i == null) {
            Mx0().f128776i = new C48335d(C86709a0.m107535s().f251811i);
        }
        return Mx0().f128776i;
    }

    public static C48354k Bx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128780p == null) {
            Mx0().f128780p = new C48354k(C86709a0.m107535s().f251811i);
        }
        return Mx0().f128780p;
    }

    public static C47997p Cx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128773f == null) {
            Mx0().f128773f = new C47997p();
        }
        return Mx0().f128773f;
    }

    public static C48329b Dx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128779o == null) {
            Mx0().f128779o = new C48329b(C86709a0.m107535s().f251811i);
        }
        return Mx0().f128779o;
    }

    public static C47971i Ex0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128784t == null) {
            Mx0().f128784t = new C47971i(C86709a0.m107535s().f251811i);
        }
        return Mx0().f128784t;
    }

    public static C47976j Fx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128771d == null) {
            Mx0().f128771d = new C47976j(C86709a0.m107535s().f251811i);
        }
        return Mx0().f128771d;
    }

    public static C47989m Gx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128775h == null) {
            Mx0().f128775h = new C47989m();
            C47989m mVar = Mx0().f128775h;
            mVar.getClass();
            C86709a0.m107529k().f251779b.mo123455a(675, mVar);
            C86709a0.m107529k().f251779b.mo123455a(672, mVar);
            C86709a0.m107529k().f251779b.mo123455a(674, mVar);
            synchronized (mVar.f128704d) {
                mVar.f128708h.clear();
            }
            Class cls = C32735h.class;
            mVar.f128705e.f128709a = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_biz_kf_guide_appbrand_enable, 0) == 1 || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED;
            mVar.f128705e.f128710b = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_biz_kf_guide_appbrand_appid, "wx3591b9dad10767f7");
            mVar.f128705e.f128711c = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_biz_kf_guide_appbrand_path, "pages/profile/profile.html");
            mVar.f128705e.f128712d = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_biz_kf_guide_appbrand_version_type, 0);
            Log.m105925i("MicroMsg.BizKFService", "alvinluo initKFGuideAppBrandConfig: %s", mVar.f128705e);
        }
        return Mx0().f128775h;
    }

    public static C47994n Hx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128774g == null) {
            Mx0().f128774g = new C47994n(C86709a0.m107535s().f251811i);
        }
        return Mx0().f128774g;
    }

    public static C30755l0 Ix0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128778n == null) {
            Mx0().f128778n = new C30755l0(C86709a0.m107535s().f251811i);
        }
        return Mx0().f128778n;
    }

    public static C19625p0 Jx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128785u == null) {
            synchronized (f128770y) {
                if (Mx0().f128785u == null) {
                    C91753f vx02 = ((C55579f) C86312j.m106911c(C55579f.class)).vx0();
                    if (vx02 != null) {
                        C115669n.INSTANCE.idkeyStat(1378, 23, 1, false);
                        BizQualityReportStruct bizQualityReportStruct = new BizQualityReportStruct();
                        bizQualityReportStruct.f107857d = 2;
                        bizQualityReportStruct.mo86054n();
                        Log.m105924i("MicroMsg.SubCoreBiz", "newBizDb create ok!");
                    } else {
                        vx02 = C86709a0.m107535s().f251811i;
                        C115669n.INSTANCE.idkeyStat(1378, 22, 1, false);
                        BizQualityReportStruct bizQualityReportStruct2 = new BizQualityReportStruct();
                        bizQualityReportStruct2.f107857d = 1;
                        bizQualityReportStruct2.mo86054n();
                        Log.m105924i("MicroMsg.SubCoreBiz", "newBizDb is null!");
                    }
                    try {
                        Mx0().f128785u = new C19625p0(vx02);
                        Log.m105924i("MicroMsg.SubCoreBiz", "create bizTimeLineInfoStorage success!");
                    } catch (Throwable th) {
                        Log.m105921e("MicroMsg.SubCoreBiz", "create bizTimeLineInfoStorage fail! %s", th.getMessage());
                        BizQualityReportStruct bizQualityReportStruct3 = new BizQualityReportStruct();
                        bizQualityReportStruct3.f107857d = 3;
                        bizQualityReportStruct3.mo86054n();
                        Mx0().f128785u = new C19625p0(C86709a0.m107535s().f251811i);
                    }
                }
            }
        }
        return Mx0().f128785u;
    }

    public static C19607d1 Kx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128786v == null) {
            Mx0().f128786v = new C19607d1(C86709a0.m107535s().f251811i);
        }
        return Mx0().f128786v;
    }

    public static C48011x.C48012a Lx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128772e == null) {
            Mx0().f128772e = new C48011x.C48012a();
        }
        return Mx0().f128772e;
    }

    public static C48009v0 Mx0() {
        return (C48009v0) C86312j.m106911c(C48009v0.class);
    }

    public static long Nx0() {
        Object f;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_NEED_TO_UPDATE_CONVERSATION_TIME_DIVIDER_LONG;
        if (f128769x == 0 && (f = C86709a0.m107535s().mo121142i().mo119685f(aVar, (Object) null)) != null && (f instanceof Long)) {
            long longValue = ((Long) f).longValue();
            f128769x = longValue;
            Log.m105925i("MicroMsg.SubCoreBiz", "temp session needUpdateTime : %d.(get from ConfigStorage)", Long.valueOf(longValue));
        }
        if (f128769x == 0) {
            f128769x = System.currentTimeMillis();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(f128769x));
            Log.m105925i("MicroMsg.SubCoreBiz", "temp session needUpdateTime is 0, so get current time : %d.", Long.valueOf(f128769x));
        }
        return f128769x;
    }

    public static C30766q vx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128777j == null) {
            Mx0().f128777j = new C30766q(C86709a0.m107535s().f251811i);
        }
        return Mx0().f128777j;
    }

    public static C47961a wx0() {
        if (Mx0().f128787w == null) {
            Mx0().f128787w = new C47961a();
        }
        return Mx0().f128787w;
    }

    public static C48345g xx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128781q == null) {
            Mx0().f128781q = new C48345g(C86709a0.m107535s().f251811i);
        }
        return Mx0().f128781q;
    }

    public static C48349h yx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128783s == null) {
            Mx0().f128783s = new C48349h();
        }
        return Mx0().f128783s;
    }

    public static C48352i zx0() {
        C86709a0.m107523b().mo121108c();
        if (Mx0().f128782r == null) {
            Mx0().f128782r = new C48352i();
        }
        return Mx0().f128782r;
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C47997p pVar = this.f128773f;
        if (pVar != null) {
            pVar.getClass();
        }
        C47989m mVar = this.f128775h;
        if (mVar != null) {
            mVar.getClass();
            C86709a0.m107529k().f251779b.mo123470p(675, mVar);
            C86709a0.m107529k().f251779b.mo123470p(672, mVar);
            C86709a0.m107529k().f251779b.mo123470p(674, mVar);
            synchronized (mVar.f128704d) {
                mVar.f128708h.clear();
            }
            ((HashSet) mVar.f128707g).clear();
        }
    }
}
