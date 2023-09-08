package com.tencent.p014mm.plugin.appbrand.jsapi.media;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.g2 */
public final class C82719g2 {

    /* renamed from: a */
    public final long f242033a;

    /* renamed from: b */
    public final long f242034b;

    /* renamed from: c */
    public final int f242035c;

    /* renamed from: d */
    public final int f242036d;

    public C82719g2(long j, long j2, int i, int i2) {
        this.f242033a = j;
        this.f242034b = j2;
        this.f242035c = i;
        this.f242036d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82719g2)) {
            return false;
        }
        C82719g2 g2Var = (C82719g2) obj;
        return this.f242033a == g2Var.f242033a && this.f242034b == g2Var.f242034b && this.f242035c == g2Var.f242035c && this.f242036d == g2Var.f242036d;
    }

    public int hashCode() {
        long j = this.f242033a;
        long j2 = this.f242034b;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f242035c) * 31) + this.f242036d;
    }

    public String toString() {
        return "VideoMetaData(duration=" + this.f242033a + ", size=" + this.f242034b + ", width=" + this.f242035c + ", height=" + this.f242036d + ')';
    }
}
