package an1;

import cm1.C0740i2;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import te3.C48682a91;
import te3.C51942x91;
import tf1.C13914m;

/* renamed from: an1.k */
public final class C0098k implements C0740i2 {

    /* renamed from: d */
    public final String f538d;

    /* renamed from: e */
    public final C48682a91 f539e;

    /* renamed from: f */
    public final List<C51942x91> f540f = new ArrayList();

    public C0098k(String str, C48682a91 a912) {
        C87412m.m108594g(str, "content");
        C87412m.m108594g(a912, "container");
        this.f538d = str;
        this.f539e = a912;
    }

    /* renamed from: c */
    public int mo75c() {
        return -5000;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C0098k) || !C87412m.m108589b(((C0098k) mVar).f538d, this.f538d)) ? -1 : 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
