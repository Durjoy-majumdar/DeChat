package yg1;

import cl1.C0691u1;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import rx3.C13598b0;
import te3.C48742ao0;
import te3.C51503u71;
import te3.C64273c21;
import yg1.C39014a;

/* renamed from: yg1.j */
public final class C16008j extends C66639f {
    public C16008j(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        C13598b0 b0Var;
        C51503u71 u712;
        C87412m.m108594g(aVar, "respWrapper");
        C48742ao0 ao02 = aVar.f105072a;
        boolean z = false;
        if (ao02 == null) {
            return false;
        }
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        Class cls = C0691u1.class;
        if (bVar == null) {
            Log.m105928w("WishBannerInterceptor", "checkLiveClose return by curLiveData == null");
        } else {
            C64273c21 c212 = ao02.f130678f;
            if (c212 == null || (u712 = c212.f182371Q0) == null) {
                b0Var = null;
            } else {
                Log.m105924i("WishBannerInterceptor", "checkWishBanner enable_flag: " + u712.f142641d + ", cur: " + u712.f142643f + " target: " + u712.f142642e + " size " + u712.f142646i.size() + "} wishId: " + u712.f142647j);
                ((C0691u1) bVar.mo71262a(cls)).f1637f.postValue(u712);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                ((C0691u1) bVar.mo71262a(cls)).f1637f.postValue(new C51503u71());
            }
            z = true;
        }
        return !z;
    }
}
