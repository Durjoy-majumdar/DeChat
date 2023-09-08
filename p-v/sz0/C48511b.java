package sz0;

import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardHomePageNewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C22514mn;
import te3.C49200dx1;
import wz0.C22945n;

/* renamed from: sz0.b */
public final class C48511b<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ CardHomePageNewUI f129744a;

    /* renamed from: b */
    public final /* synthetic */ String f129745b;

    public C48511b(CardHomePageNewUI cardHomePageNewUI, String str) {
        this.f129744a = cardHomePageNewUI;
        this.f129745b = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            T t = cVar.f256796d;
            CardHomePageNewUI cardHomePageNewUI = this.f129744a;
            String str = this.f129745b;
            C49200dx1 dx12 = (C49200dx1) t;
            Log.m105925i("MicroMsg.CardHomePageNewUI", "retCode: %s, refresh: %s", Integer.valueOf(dx12.f132559d), Integer.valueOf(dx12.f132562g));
            if (dx12.f132559d != 0) {
                C22945n.m27018r(cardHomePageNewUI, dx12.f132560e);
            } else if (dx12.f132562g == 1) {
                cardHomePageNewUI.f51975K = true;
                cardHomePageNewUI.f51982p = 0;
                cardHomePageNewUI.mo23419M7();
            } else if (cardHomePageNewUI.f51967C != 0) {
                CardHomePageNewUI.C18611c cVar2 = cardHomePageNewUI.f51979j;
                if (cVar2 != null) {
                    C22514mn mnVar = dx12.f132561f;
                    C87412m.m108593f(mnVar, "card_pkg_mch_info");
                    cVar2.mo23425g5(str, mnVar);
                } else {
                    C87412m.m108603p("mHomePageAdapter");
                    throw null;
                }
            } else if (dx12.f132561f.f64255p.size() == 0) {
                CardHomePageNewUI.C18611c cVar3 = cardHomePageNewUI.f51979j;
                if (cVar3 != null) {
                    cVar3.mo23424O4(str);
                } else {
                    C87412m.m108603p("mHomePageAdapter");
                    throw null;
                }
            } else {
                CardHomePageNewUI.C18611c cVar4 = cardHomePageNewUI.f51979j;
                if (cVar4 != null) {
                    C22514mn mnVar2 = dx12.f132561f;
                    C87412m.m108593f(mnVar2, "card_pkg_mch_info");
                    cVar4.mo23425g5(str, mnVar2);
                } else {
                    C87412m.m108603p("mHomePageAdapter");
                    throw null;
                }
            }
        } else {
            C22945n.m27017q(this.f129744a, "");
        }
        this.f129744a.f51967C = -1;
        return C13598b0.f38549a;
    }
}
