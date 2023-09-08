package ho1;

import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import kf1.C9778h6;
import te3.C50140kk0;
import te3.C50382mc1;
import te3.C51692vg1;
import vp1.C14945t;

/* renamed from: ho1.p */
public final class C8643p extends C14945t {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8643p(C50140kk0 kk02) {
        super(kk02);
        C87412m.m108594g(kk02, FirebaseAnalytics.C113379b.SOURCE);
    }

    /* renamed from: a */
    public C0740i2 mo9512a() {
        C51692vg1 vg12;
        C50140kk0 kk02 = this.f40983a;
        C87412m.m108594g(kk02, "data");
        if (!(kk02.f136842i == 3) || (vg12 = kk02.f136844n) == null) {
            return null;
        }
        C9778h6 h6Var = C9778h6.f30304a;
        C50382mc1 mc12 = new C50382mc1();
        mc12.f137948d = 4;
        mc12.f137952h = vg12;
        return h6Var.mo10381b(mc12);
    }

    public C8643p(int i, C51692vg1 vg12) {
        C87412m.m108594g(vg12, "finderPoiInfo");
        C50140kk0 kk02 = this.f40983a;
        kk02.f136837d = i;
        kk02.f136844n = vg12;
        kk02.f136842i = 3;
    }
}
