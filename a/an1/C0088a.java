package an1;

import cm1.C0740i2;
import gy3.C87412m;
import te3.C48682a91;
import te3.C49416ff0;
import tf1.C13914m;

/* renamed from: an1.a */
public final class C0088a implements C0740i2 {

    /* renamed from: d */
    public final C49416ff0 f521d;

    /* renamed from: e */
    public final String f522e;

    /* renamed from: f */
    public final int f523f;

    /* renamed from: g */
    public final int f524g;

    public C0088a(C49416ff0 ff02, String str, C48682a91 a912, int i, int i2) {
        C87412m.m108594g(ff02, "adInfo");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(a912, "container");
        this.f521d = ff02;
        this.f522e = str;
        this.f523f = i;
        this.f524g = i2;
    }

    /* renamed from: c */
    public int mo75c() {
        return 8;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return -1;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
