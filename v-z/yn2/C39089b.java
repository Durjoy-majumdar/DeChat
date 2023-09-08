package yn2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: yn2.b */
public final class C39089b {

    /* renamed from: a */
    public final String f105220a;

    /* renamed from: b */
    public final long f105221b;

    /* renamed from: c */
    public final long f105222c;

    public C39089b(String str, long j, long j2) {
        C87412m.m108594g(str, "path");
        this.f105220a = str;
        this.f105221b = j;
        this.f105222c = j2;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
            return true;
        } else if (!(obj instanceof C39089b)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
            return false;
        } else {
            C39089b bVar = (C39089b) obj;
            if (!C87412m.m108589b(this.f105220a, bVar.f105220a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
                return false;
            } else if (this.f105221b != bVar.f105221b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
                return false;
            } else {
                int i = (this.f105222c > bVar.f105222c ? 1 : (this.f105222c == bVar.f105222c ? 0 : -1));
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
                return i == 0;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        long j = this.f105221b;
        long j2 = this.f105222c;
        int hashCode = (((this.f105220a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        String str = "ABAVideoInfo(path=" + this.f105220a + ", videoStart=" + this.f105221b + ", videoEnd=" + this.f105222c + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        return str;
    }
}
