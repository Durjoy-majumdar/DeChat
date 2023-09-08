package cm1;

import gy3.C87412m;
import jq3.C9493c;
import te3.C50557nk0;
import tf1.C13914m;

/* renamed from: cm1.w */
public final class C0787w implements C9493c, C13914m {

    /* renamed from: d */
    public C50557nk0 f1843d;

    public C0787w(C50557nk0 nk02) {
        C87412m.m108594g(nk02, "favInfo");
        this.f1843d = nk02;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return 0;
    }

    public long getItemId() {
        String str = this.f1843d.f138637f;
        return (long) (str != null ? str.hashCode() : 0);
    }
}
