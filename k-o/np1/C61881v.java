package np1;

import android.content.Context;
import cj1.C54789l6;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di0.C86299o;
import er1.C58719f2;
import er1.C58739j4;
import fj1.C45795b;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import o40.C61926c;
import sk1.C63965x;
import te3.C64287ci1;
import te3.C64370fp1;
import te3.C64513l40;
import wi0.C66117m;
import z04.C112550d0;

/* renamed from: np1.v */
public final class C61881v {

    /* renamed from: a */
    public static final C61881v f175961a = new C61881v();

    /* renamed from: a */
    public final String mo86809a(String str, long j) {
        C87412m.m108594g(str, "url");
        boolean z = false;
        if (C112550d0.m153801u(str, "?", false)) {
            return str + "&objectId=" + C61926c.m72691p(j);
        }
        if (str.length() > 0) {
            z = true;
        }
        if (!z) {
            return str;
        }
        return str + "?objectId=" + C61926c.m72691p(j);
    }

    /* renamed from: b */
    public final HalfScreenConfig.ShareActionConfig mo86810b(C45795b bVar, C63965x xVar, C64513l40 l402) {
        C45795b bVar2 = bVar;
        C63965x xVar2 = xVar;
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(bVar2, "liveData");
        C87412m.m108594g(xVar2, "data");
        String str = ((C54991o) bVar2.mo71262a(cls)).f154345o;
        long j = ((C55001u) bVar2.mo71262a(cls2)).f154416j;
        String str2 = ((C55001u) bVar2.mo71262a(cls2)).f154423t;
        C64370fp1 fp12 = xVar2.f181346s;
        C58719f2 f2Var = C58719f2.f168110a;
        C64287ci1 e = f2Var.mo83632e(str, j, str2, fp12, C61926c.m72691p(((C55001u) bVar2.mo71262a(cls2)).f154420q.f182392d), l402);
        e.f182512x = ((C54991o) bVar2.mo71262a(cls)).f154199F1;
        String h = f2Var.mo83635h(e);
        f2Var.mo83636i(e, "commodity_item", C58719f2.m68198d(f2Var, e, (String) null, (String) null, (Integer) null, 14, (Object) null));
        return new HalfScreenConfig.ShareActionConfig(true, h);
    }

    /* renamed from: c */
    public final C86299o mo86811c(Context context, C64513l40 l402, int i, byte[] bArr, String str, C45795b bVar) {
        HashMap<String, String> hashMap;
        HashMap<String, String> hashMap2;
        C64513l40 l403 = l402;
        byte[] bArr2 = bArr;
        String str2 = str;
        C45795b bVar2 = bVar;
        Class cls = C54979h1.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(l403, "page");
        C87412m.m108594g(bArr2, "locClickId");
        C87412m.m108594g(str2, "setSceneNote");
        String str3 = l403.f184031d;
        String str4 = "";
        if (str3 != null) {
            if (!(bVar2 == null || (hashMap2 = ((C54979h1) bVar2.mo71262a(cls)).f154124Q) == null)) {
                String str5 = l403.f184033f;
                if (str5 == null) {
                    str5 = str4;
                }
                hashMap2.put(str3, str5);
            }
            if (!(bVar2 == null || (hashMap = ((C54979h1) bVar2.mo71262a(cls)).f154125R) == null)) {
                String str6 = l403.f184034g;
                if (str6 == null) {
                    str6 = str4;
                }
                hashMap.put(str3, str6);
            }
        }
        boolean z = l403.f184036i == 1;
        Log.m105924i("FinderLive.MiniProgramPayloadHelper", "getBundleFromPage showNavigationBar:" + z);
        C86299o oVar = new C86299o();
        C54789l6 l6Var = new C54789l6();
        l6Var.f153587h = str4;
        l6Var.f153586g = "push";
        l6Var.f153591o = -1;
        l6Var.f153592p = bArr2;
        l6Var.f153594r = false;
        l6Var.f153595s = true;
        oVar.f250937i = l6Var;
        boolean z2 = l6Var.f153594r;
        boolean z3 = l6Var.f153595s;
        String str7 = l403.f184031d;
        if (str7 == null) {
            str7 = str4;
        }
        oVar.f250930b = str7;
        String str8 = l403.f184032e;
        if (str8 != null) {
            str4 = str8;
        }
        oVar.f250934f = str4;
        oVar.f250939k = i;
        oVar.f250940l = str2;
        int d = f175961a.mo86812d();
        HalfScreenConfig.C55451a aVar = HalfScreenConfig.C55451a.POPUP;
        C86299o oVar2 = oVar;
        oVar2.f250912A = new HalfScreenConfig(true, d, aVar, true, new HalfScreenConfig.BackgroundShapeConfig(MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f357030a80), true, true, false, false, 24, (C8480h) null), true, new HalfScreenConfig.CloseWhenClickEmptyAreaConfig(context.getClass().getName(), aVar), z ? HalfScreenConfig.C55453c.SINGLE_CLOSE : HalfScreenConfig.C55453c.HIDE, z2, z, (WeAppHalfScreenStatusChangeListener) null, HalfScreenConfig.C55456f.NORMAL, !z, z3, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, C58739j4.f168176a.mo83713i(l403), (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw), z2 && !z3, false, 0, false, false, false, -234896384, 1, (C8480h) null);
        return oVar2;
    }

    /* renamed from: d */
    public final int mo86812d() {
        float f = (float) C75044y4.m89990b(MMApplicationContext.getContext()).y;
        if (MMApplicationContext.getResources().getConfiguration().orientation == 2) {
            f = (float) C75044y4.m89990b(MMApplicationContext.getContext()).x;
        }
        return ((int) ((((float) C32444a.f86121a.mo58621b()) / 100.0f) * f)) + ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw));
    }

    /* renamed from: e */
    public final void mo86813e(C86299o oVar) {
        C87412m.m108594g(oVar, "bundle");
        Log.m105924i("FinderLive.MiniProgramPayloadHelper", "[appId:" + oVar.f250930b + ",path:" + oVar.f250934f + ",halfScreen:" + oVar.f250912A.mo76931c() + ",scene:" + oVar.f250939k + ",sceneNote:" + oVar.f250940l + ",extraData:" + oVar.f250937i + ']');
    }
}
