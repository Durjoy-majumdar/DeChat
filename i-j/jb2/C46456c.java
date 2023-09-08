package jb2;

import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.tav.coremedia.TimeUtil;

/* renamed from: jb2.c */
public final class C46456c {

    /* renamed from: a */
    public final int f125140a;

    /* renamed from: b */
    public final long f125141b;

    /* renamed from: c */
    public final long f125142c;

    /* renamed from: d */
    public final long f125143d;

    public C46456c(int i, long j, long j2, long j3) {
        this.f125140a = i;
        this.f125141b = j;
        this.f125142c = j2;
        this.f125143d = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46456c)) {
            return false;
        }
        C46456c cVar = (C46456c) obj;
        return this.f125140a == cVar.f125140a && this.f125141b == cVar.f125141b && this.f125142c == cVar.f125142c && this.f125143d == cVar.f125143d;
    }

    public int hashCode() {
        long j = this.f125141b;
        long j2 = this.f125142c;
        long j3 = this.f125143d;
        return (((((this.f125140a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return this.f125140a + ": cost:" + (this.f125143d - this.f125141b) + " dispatchCost:" + (this.f125143d - this.f125142c) + " time:" + C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, this.f125141b / ((long) 1000));
    }
}
