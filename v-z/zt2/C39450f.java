package zt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: zt2.f */
public final class C39450f {

    /* renamed from: a */
    public final boolean f105956a;

    /* renamed from: b */
    public final long f105957b;

    /* renamed from: c */
    public final long f105958c;

    /* renamed from: d */
    public final long f105959d;

    /* renamed from: e */
    public final long f105960e;

    /* renamed from: f */
    public final long f105961f;

    /* renamed from: g */
    public final long f105962g;

    /* renamed from: h */
    public final int f105963h;

    /* renamed from: i */
    public final long f105964i;

    public C39450f(boolean z, long j, long j2, long j3, long j4, long j5, long j6, int i, long j7) {
        this.f105956a = z;
        this.f105957b = j;
        this.f105958c = j2;
        this.f105959d = j3;
        this.f105960e = j4;
        this.f105961f = j5;
        this.f105962g = j6;
        this.f105963h = i;
        this.f105964i = j7;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return true;
        } else if (!(obj instanceof C39450f)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return false;
        } else {
            C39450f fVar = (C39450f) obj;
            if (this.f105956a != fVar.f105956a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
                return false;
            } else if (this.f105957b != fVar.f105957b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
                return false;
            } else if (this.f105958c != fVar.f105958c) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
                return false;
            } else if (this.f105959d != fVar.f105959d) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
                return false;
            } else if (this.f105960e != fVar.f105960e) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
                return false;
            } else if (this.f105961f != fVar.f105961f) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
                return false;
            } else if (this.f105962g != fVar.f105962g) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
                return false;
            } else if (this.f105963h != fVar.f105963h) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
                return false;
            } else {
                int i = (this.f105964i > fVar.f105964i ? 1 : (this.f105964i == fVar.f105964i ? 0 : -1));
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
                return i == 0;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        boolean z = this.f105956a;
        if (z) {
            z = true;
        }
        long j = this.f105957b;
        long j2 = this.f105958c;
        long j3 = this.f105959d;
        long j4 = this.f105960e;
        long j5 = this.f105961f;
        long j6 = this.f105962g;
        long j7 = this.f105964i;
        int i = ((((((((((((((((z ? 1 : 0) * true) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f105963h) * 31) + ((int) (j7 ^ (j7 >>> 32)));
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        return i;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        String str = "SnsUnReadConfig(jumpEnable=" + this.f105956a + ", jumpMinInterval=" + this.f105957b + ", jumpMaxInterval=" + this.f105958c + ", jumpMinFeedsCount=" + this.f105959d + ", jumpMinFeedsGapCount=" + this.f105960e + ", jumpNotWsPercent=" + this.f105961f + ", jumpReadContinuousCount=" + this.f105962g + ", jumpIndicatorIndexOffset=" + this.f105963h + ", jumpIndicatorExposeInterval=" + this.f105964i + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        return str;
    }
}
