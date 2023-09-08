package vp1;

import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C8480h;
import gy3.C87412m;
import p749xh.C66261f3;
import te3.C50140kk0;
import wp1.C15585f;

/* renamed from: vp1.s */
public final class C14944s extends C14945t {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14944s(C50140kk0 kk02) {
        super(kk02);
        C87412m.m108594g(kk02, FirebaseAnalytics.C113379b.SOURCE);
    }

    /* renamed from: a */
    public C0740i2 mo9512a() {
        FinderItem a;
        C50140kk0 kk02 = this.f40983a;
        BaseFinderFeed baseFinderFeed = null;
        if (kk02.f136842i == 0 && (a = C14936m.f40971a.mo13978a(kk02)) != null) {
            baseFinderFeed = C15585f.f42211a.mo14348k(a);
            if (this.f40983a.f136845o) {
                baseFinderFeed.mo3514o0(true);
            }
        }
        return baseFinderFeed;
    }

    public C14944s(int i, long j, FinderObject finderObject, int i2, boolean z) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        ((C58417y0) C86312j.m106911c(C58417y0.class)).ry0(finderObject);
        C50140kk0 kk02 = this.f40983a;
        kk02.f136838e = j;
        kk02.f136837d = i;
        kk02.f136839f = finderObject;
        kk02.f136840g = i2;
        kk02.f136842i = 0;
        kk02.f136845o = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14944s(int i, long j, FinderObject finderObject, int i2, boolean z, int i3, C8480h hVar) {
        this(i, j, finderObject, i2, (i3 & 16) != 0 ? false : z);
    }
}
