package vp1;

import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import kf1.C9778h6;
import te3.C49980je1;
import te3.C50140kk0;

/* renamed from: vp1.u */
public final class C14946u extends C14945t {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14946u(C50140kk0 kk02) {
        super(kk02);
        C87412m.m108594g(kk02, FirebaseAnalytics.C113379b.SOURCE);
    }

    /* renamed from: a */
    public C0740i2 mo9512a() {
        C49980je1 je12;
        C50140kk0 kk02 = this.f40983a;
        C87412m.m108594g(kk02, "data");
        boolean z = true;
        if (kk02.f136842i != 1) {
            z = false;
        }
        if (!z || (je12 = kk02.f136841h) == null) {
            return null;
        }
        return C9778h6.f30304a.mo10380a(je12);
    }

    public C14946u(int i, long j, int i2, C49980je1 je12) {
        C87412m.m108594g(je12, "lbsSection");
        C50140kk0 kk02 = this.f40983a;
        kk02.f136838e = j;
        kk02.f136837d = i;
        kk02.f136839f = new FinderObject();
        kk02.f136840g = i2;
        kk02.f136841h = je12;
        kk02.f136842i = 1;
    }
}
