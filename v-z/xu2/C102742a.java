package xu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;

/* renamed from: xu2.a */
public final class C102742a {

    /* renamed from: a */
    public long f303366a;

    /* renamed from: b */
    public int f303367b;

    /* renamed from: c */
    public long f303368c;

    /* renamed from: d */
    public long f303369d;

    /* renamed from: e */
    public int f303370e;

    /* renamed from: f */
    public long f303371f;

    /* renamed from: g */
    public int f303372g;

    /* renamed from: h */
    public int f303373h;

    public C102742a() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 255, (C8480h) null);
    }

    public C102742a(long j, int i, long j2, long j3, int i2, long j4, int i3, int i4, int i5, C8480h hVar) {
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
        this.f303366a = j6;
        this.f303367b = i8;
        this.f303368c = j7;
        this.f303369d = j8;
        this.f303370e = i9;
        this.f303371f = j5;
        this.f303372g = i15;
        this.f303373h = i7;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return true;
        } else if (!(obj instanceof C102742a)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        } else {
            C102742a aVar = (C102742a) obj;
            if (this.f303366a != aVar.f303366a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                return false;
            } else if (this.f303367b != aVar.f303367b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                return false;
            } else if (this.f303368c != aVar.f303368c) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                return false;
            } else if (this.f303369d != aVar.f303369d) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                return false;
            } else if (this.f303370e != aVar.f303370e) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                return false;
            } else if (this.f303371f != aVar.f303371f) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                return false;
            } else if (this.f303372g != aVar.f303372g) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                return false;
            } else {
                int i = this.f303373h;
                int i2 = aVar.f303373h;
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                return i == i2;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        long j = this.f303366a;
        long j2 = this.f303368c;
        long j3 = this.f303369d;
        long j4 = this.f303371f;
        int i = (((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.f303367b) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f303370e) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f303372g) * 31) + this.f303373h;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        return i;
    }

    public String toString() {
        long j;
        String str;
        long j2;
        long j3;
        long j4;
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        long j5 = this.f303366a;
        long j6 = this.f303368c;
        long j7 = j5 - j6;
        int i = this.f303370e;
        int i2 = this.f303372g;
        int i3 = i - i2;
        long j8 = this.f303371f;
        long j9 = this.f303369d;
        long j15 = j8 - j9;
        String str2 = "toString";
        long j16 = -1;
        if (j8 > 0) {
            str = "com.tencent.mm.plugin.sns.ui.monitor.JankModel";
            j = j7;
            j2 = (((long) 100) * j9) / j8;
        } else {
            str = "com.tencent.mm.plugin.sns.ui.monitor.JankModel";
            j = j7;
            j2 = -1;
        }
        if (j6 > 0) {
            j3 = j2;
            j4 = ((long) (this.f303373h * 1000)) / j6;
        } else {
            j3 = j2;
            j4 = -1;
        }
        if (j8 > 0) {
            long j17 = ((long) (i * 1000)) / j8;
        }
        if (i > 0) {
            j16 = j8 / ((long) i);
        }
        long j18 = j16;
        if (j9 > 0) {
            long j19 = ((long) (i2 * 1000)) / j9;
        }
        if (j15 > 0) {
            long j25 = ((long) (i3 * 1000)) / j15;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("总停留时长:");
        sb.append(this.f303366a);
        sb.append(" ms, 滑动时长:");
        sb.append(this.f303368c);
        sb.append("ms(");
        long j26 = (long) 100;
        sb.append((this.f303368c * j26) / this.f303366a);
        sb.append("%) 静止时长:");
        long j27 = j;
        sb.append(j27);
        sb.append("ms\n累计卡顿时长:");
        sb.append(j18);
        sb.append("ms(");
        sb.append((j26 * j18) / this.f303366a);
        sb.append("%) 滑动卡顿时长:");
        sb.append(this.f303369d);
        sb.append("ms(");
        sb.append(j3);
        sb.append("%) 静止卡顿时长:");
        sb.append(j18 - this.f303369d);
        sb.append("ms\n总帧数:");
        sb.append(this.f303367b);
        sb.append(",正常帧数:");
        sb.append(this.f303367b - this.f303370e);
        sb.append(",卡顿帧数=");
        sb.append(this.f303370e);
        sb.append(",静止帧数:");
        sb.append(this.f303367b - this.f303373h);
        sb.append(",滑动帧数:");
        sb.append(this.f303373h);
        sb.append("\n页面平均帧率:");
        sb.append(((long) (this.f303367b * 1000)) / this.f303366a);
        sb.append(",帧均耗时:");
        sb.append(((long) (this.f303367b * 1000)) / this.f303366a);
        sb.append("ms 静止帧率:");
        sb.append(((long) ((this.f303367b - this.f303373h) * 1000)) / j27);
        sb.append(" 滑动帧率:");
        sb.append(j4);
        sb.append(" \n");
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs(str2, str);
        return sb4;
    }
}
