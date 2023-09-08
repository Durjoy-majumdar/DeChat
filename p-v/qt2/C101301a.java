package qt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: qt2.a */
public final class C101301a {

    /* renamed from: a */
    public long f296781a;

    /* renamed from: b */
    public int f296782b;

    /* renamed from: c */
    public long f296783c;

    /* renamed from: d */
    public long f296784d;

    /* renamed from: e */
    public int f296785e;

    /* renamed from: f */
    public long f296786f;

    /* renamed from: g */
    public int f296787g;

    /* renamed from: h */
    public int f296788h;

    public C101301a() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 255, (C8480h) null);
    }

    public C101301a(long j, int i, long j2, long j3, int i2, long j4, int i3, int i4, int i5, C8480h hVar) {
        int i6 = i5;
        long j5 = 0;
        long j6 = (i6 & 1) != 0 ? 0 : j;
        int i7 = 0;
        int i8 = (i6 & 2) != 0 ? 0 : i;
        long j7 = (i6 & 4) != 0 ? 0 : j2;
        long j8 = (i6 & 8) != 0 ? 0 : j3;
        int i9 = (i6 & 16) != 0 ? 0 : i2;
        j5 = (i6 & 32) == 0 ? j4 : j5;
        int i15 = (i6 & 64) != 0 ? 0 : i3;
        i7 = (i6 & 128) == 0 ? i4 : i7;
        this.f296781a = j6;
        this.f296782b = i8;
        this.f296783c = j7;
        this.f296784d = j8;
        this.f296785e = i9;
        this.f296786f = j5;
        this.f296787g = i15;
        this.f296788h = i7;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return true;
        } else if (!(obj instanceof C101301a)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        } else {
            C101301a aVar = (C101301a) obj;
            if (this.f296781a != aVar.f296781a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                return false;
            } else if (this.f296782b != aVar.f296782b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                return false;
            } else if (this.f296783c != aVar.f296783c) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                return false;
            } else if (this.f296784d != aVar.f296784d) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                return false;
            } else if (this.f296785e != aVar.f296785e) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                return false;
            } else if (this.f296786f != aVar.f296786f) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                return false;
            } else if (this.f296787g != aVar.f296787g) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                return false;
            } else {
                int i = this.f296788h;
                int i2 = aVar.f296788h;
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                return i == i2;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j = this.f296781a;
        long j2 = this.f296783c;
        long j3 = this.f296784d;
        long j4 = this.f296786f;
        int i = (((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.f296782b) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f296785e) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f296787g) * 31) + this.f296788h;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        return i;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        StringBuffer stringBuffer = new StringBuffer();
        long j = this.f296781a;
        long j2 = this.f296783c;
        long j3 = j - j2;
        long j4 = -1;
        long j5 = j3 > 0 ? ((long) ((this.f296782b - this.f296788h) * 1000)) / j3 : -1;
        if (j2 > 0) {
            j4 = ((long) (this.f296788h * 1000)) / j2;
        }
        stringBuffer.append("total time:" + this.f296781a + " ms,scroll time:" + this.f296783c + " ms,idle time:" + j3 + 10);
        stringBuffer.append("total jank time:" + this.f296786f + " ms, scroll jank time:" + this.f296784d + " ms,idle jank time:" + (this.f296786f - this.f296784d) + " ms\n");
        stringBuffer.append("total frame:" + this.f296782b + " ,janke frame:" + this.f296785e + " scroll frame:" + this.f296788h + 10);
        StringBuilder sb = new StringBuilder();
        sb.append("scroll fps:");
        sb.append(j4);
        sb.append(" ,idle fps:");
        sb.append(j5);
        sb.append(10);
        stringBuffer.append(sb.toString());
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "builder.toString()");
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        return stringBuffer2;
    }
}
