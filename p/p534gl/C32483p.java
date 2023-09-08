package p534gl;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: gl.p */
public final class C32483p {

    /* renamed from: a */
    public long f86296a;

    /* renamed from: b */
    public int f86297b;

    /* renamed from: c */
    public int f86298c;

    /* renamed from: d */
    public String f86299d;

    public C32483p(long j, int i, int i2, String str, int i3, C8480h hVar) {
        j = (i3 & 1) != 0 ? 0 : j;
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        str = (i3 & 8) != 0 ? "-1" : str;
        C87412m.m108594g(str, "preloadSessionId");
        this.f86296a = j;
        this.f86297b = i;
        this.f86298c = i2;
        this.f86299d = str;
    }
}
