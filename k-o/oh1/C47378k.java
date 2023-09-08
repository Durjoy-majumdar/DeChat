package oh1;

import android.content.Context;
import cj1.C0572m5;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58739j4;
import gy3.C87412m;
import hp3.C87581a;
import je1.C46523h2;
import kr0.C76630x0;
import np1.C61885z;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49361f11;
import te3.C49498g11;
import te3.C51314sy0;
import te3.C64370fp1;
import te3.C64513l40;
import wi0.C90973a0;
import wi0.C91003z;

/* renamed from: oh1.k */
public final class C47378k {

    /* renamed from: oh1.k$a */
    public static final class C47379a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Context f127130a;

        /* renamed from: b */
        public final /* synthetic */ C0572m5 f127131b;

        /* renamed from: c */
        public final /* synthetic */ C56032b f127132c;

        public C47379a(Context context, C0572m5 m5Var, C56032b bVar) {
            this.f127130a = context;
            this.f127131b = m5Var;
            this.f127132c = bVar;
        }

        public Object call(Object obj) {
            String str;
            C64513l40 l402;
            String str2;
            C64513l40 l403;
            C11424j jVar = new C11424j(this.f127131b);
            C86299o oVar = new C86299o();
            C56032b bVar = this.f127132c;
            C64370fp1 fp12 = ((C49498g11) ((C89132b.C89134c) obj).f256796d).f133782f;
            String str3 = "";
            if (fp12 == null || (l403 = fp12.f183185p) == null || (str = l403.f184031d) == null) {
                str = str3;
            }
            oVar.f250930b = str;
            if (!(fp12 == null || (l402 = fp12.f183185p) == null || (str2 = l402.f184032e) == null)) {
                str3 = str2;
            }
            oVar.f250934f = str3;
            oVar.f250939k = 1205;
            oVar.f250931c = C58739j4.f168176a.mo83673A();
            C91003z zVar = C91003z.DISABLED;
            oVar.f250923L = zVar;
            oVar.f250924M = zVar;
            oVar.f250913B = C90973a0.TRANSPARENT;
            String str4 = oVar.f250930b;
            C87412m.m108593f(str4, "appId");
            oVar.f250943o = new C61885z(bVar, str4);
            oVar.f250937i = jVar;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f127130a, oVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m52727a(C0572m5 m5Var, Context context, C56032b bVar) {
        Class cls = C55001u.class;
        C87412m.m108594g(m5Var, "<this>");
        C87412m.m108594g(context, "context");
        Log.m105924i("FlashSaleInfoLocal", "open flash sale dialog");
        int e = C31543z5.m39455e();
        if (e > m5Var.f1373b) {
            Log.m105920e("FlashSaleInfoLocal", "try open flash sale after expiration, currentTime = " + e + ", expireTime = " + m5Var.f1373b);
        } else if (bVar == null) {
            Log.m105924i("FlashSaleInfoLocal", "plugin layout is null");
        } else {
            C49361f11 f112 = new C49361f11();
            f112.f133229d = C46523h2.f125330a.mo71859a(6211);
            f112.f133230e = ((C55001u) bVar.business(cls)).f154416j;
            f112.f133231f = ((C55001u) bVar.business(cls)).f154420q.f182392d;
            f112.f133232g = ((C55001u) bVar.business(cls)).f154423t;
            C51314sy0 sy02 = m5Var.f1375d;
            f112.f133233h = sy02 != null ? sy02.f141826d : 0;
            f112.f133239q = 1;
            f112.mo73339b().mo9225i().mo123420E(new C47379a(context, m5Var, bVar));
        }
    }
}
