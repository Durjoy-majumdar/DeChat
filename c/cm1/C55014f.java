package cm1;

import gy3.C8480h;
import gy3.C87412m;
import jq3.C60898l;
import tf1.C13914m;

/* renamed from: cm1.f */
public final class C55014f extends C60898l.C60899a implements C13914m {

    /* renamed from: d */
    public final long f154475d;

    /* renamed from: e */
    public final String f154476e;

    /* renamed from: f */
    public int f154477f;

    public C55014f(long j, String str, int i, int i2, C8480h hVar) {
        i = (i2 & 4) != 0 ? 0 : i;
        C87412m.m108594g(str, "objectNonceId");
        this.f154475d = j;
        this.f154476e = str;
        this.f154477f = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return -4;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
