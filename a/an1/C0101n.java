package an1;

import cm1.C0740i2;
import gy3.C87412m;
import te3.C48682a91;
import te3.C49098d51;
import te3.C49114d91;
import tf1.C13914m;

/* renamed from: an1.n */
public final class C0101n implements C0740i2 {

    /* renamed from: d */
    public final C49114d91 f541d;

    /* renamed from: e */
    public final C48682a91 f542e;

    public C0101n(C49114d91 d912, C48682a91 a912) {
        C87412m.m108594g(d912, "notice");
        C87412m.m108594g(a912, "container");
        this.f541d = d912;
        this.f542e = a912;
    }

    /* renamed from: c */
    public int mo75c() {
        return 5;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (mVar instanceof C0101n) {
            C49098d51 d512 = ((C0101n) mVar).f541d.f132196d;
            String str = null;
            String str2 = d512 != null ? d512.f132122h : null;
            C49098d51 d513 = this.f541d.f132196d;
            if (d513 != null) {
                str = d513.f132122h;
            }
            if (C87412m.m108589b(str2, str)) {
                return 0;
            }
        }
        return -1;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
