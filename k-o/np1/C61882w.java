package np1;

import cj1.C54789l6;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86295k;
import di0.C86299o;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kr0.C76630x0;
import kr0.C88262c1;
import kr0.C88273g1;
import kr0.C88274h0;
import lc3.C10485b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: np1.w */
public final class C61882w {

    /* renamed from: a */
    public static final C61882w f175962a = new C61882w();

    /* renamed from: b */
    public static final String f175963b = "MiniProgramPreloadHelper";

    /* renamed from: c */
    public static boolean f175964c;

    /* renamed from: d */
    public static boolean f175965d;

    /* renamed from: e */
    public static boolean f175966e;

    /* renamed from: f */
    public static final C13601g f175967f = C36568h.m40985a(C11262a.f33199d);

    /* renamed from: np1.w$a */
    public static final class C11262a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C11262a f33199d = new C11262a();

        public C11262a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ClientBenchmarkLevel", -1));
        }
    }

    /* renamed from: a */
    public final void mo86814a(C45795b bVar, C86299o oVar) {
        C86295k kVar = oVar.f250937i;
        Integer num = null;
        C54789l6 l6Var = kVar instanceof C54789l6 ? (C54789l6) kVar : null;
        if (l6Var != null) {
            num = Integer.valueOf(l6Var.f153593q);
        }
        if (num != null && num.intValue() == 1) {
            String str = f175963b;
            StringBuilder sb = new StringBuilder();
            sb.append("[preRender] performanceLevel:");
            sb.append(((Number) ((C36570n) f175967f).getValue()).intValue());
            sb.append(",appId:");
            sb.append(oVar.f250930b);
            sb.append(",patch:");
            sb.append(oVar.f250934f);
            sb.append(",type:");
            C58739j4 j4Var = C58739j4.f168176a;
            sb.append(j4Var.mo83673A());
            sb.append(",preloadIfFail:");
            sb.append(false);
            Log.m105924i(str, sb.toString());
            if (Util.isNullOrNil(oVar.f250930b) || Util.isNullOrNil(oVar.f250934f)) {
                Log.m105924i(str, "[preRender] fail, stack:" + Util.getStack());
                return;
            }
            oVar.f250931c = j4Var.mo83673A();
            long currentTimeMillis = System.currentTimeMillis();
            f175966e = true;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).y20(oVar, new C61883x(bVar, oVar, currentTimeMillis, false));
        } else if (num != null && num.intValue() == 2) {
            mo86815b(oVar);
        } else if (num != null && num.intValue() == 3) {
            mo86815b(oVar);
            Log.m105924i(f175963b, "[prepareEnv]");
            ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113305TH(C88273g1.FINDER_LIVING);
            f175964c = true;
        }
    }

    /* renamed from: b */
    public final void mo86815b(C86299o oVar) {
        String str = f175963b;
        Log.m105924i(str, "[preloadPkg],username:" + oVar.f250929a + ",appId:" + oVar.f250930b + ",path:" + oVar.f250934f);
        if (!Util.isNullOrNil(oVar.f250929a) || !Util.isNullOrNil(oVar.f250930b)) {
            ((C88262c1) C86312j.m106911c(C88262c1.class)).e60(oVar.f250929a, oVar.f250930b, 4);
            f175965d = true;
            return;
        }
        Log.m105924i(str, "[preloadPkg] fail, stack:" + Util.getStack());
    }

    /* renamed from: c */
    public final void mo86816c(C45795b bVar, C86299o oVar, boolean z) {
        C87412m.m108594g(oVar, "bundle");
        if (Util.isNullOrNil(oVar.f250930b)) {
            Log.m105924i(f175963b, "[tryToPreRender] fail, appId is empty!");
            return;
        }
        boolean ud = ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106899ud(oVar.f250930b, C58739j4.f168176a.mo83673A());
        String str = f175963b;
        Log.m105924i(str, "[tryToPreRender] hasInstance:" + ud + ",appId:" + oVar.f250930b + ",patch:" + oVar.f250934f);
        if (!ud) {
            mo86814a(bVar, oVar);
        }
    }
}
