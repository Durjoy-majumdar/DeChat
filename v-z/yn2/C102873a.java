package yn2;

import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: yn2.a */
public final class C102873a {

    /* renamed from: a */
    public final int f303669a;

    /* renamed from: b */
    public final int f303670b;

    /* renamed from: c */
    public final int f303671c;

    /* renamed from: d */
    public final int f303672d;

    /* renamed from: e */
    public final ABAPrams f303673e;

    public C102873a(int i, int i2, int i3, int i4, ABAPrams aBAPrams) {
        this.f303669a = i;
        this.f303670b = i2;
        this.f303671c = i3;
        this.f303672d = i4;
        this.f303673e = aBAPrams;
    }

    /* renamed from: a */
    public final int mo142585a() {
        SnsMethodCalculate.markStartTimeMs("getBitrate", "com.tencent.mm.plugin.sns.ABAResult");
        int i = this.f303672d;
        SnsMethodCalculate.markEndTimeMs("getBitrate", "com.tencent.mm.plugin.sns.ABAResult");
        return i;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return true;
        } else if (!(obj instanceof C102873a)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        } else {
            C102873a aVar = (C102873a) obj;
            if (this.f303669a != aVar.f303669a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
                return false;
            } else if (this.f303670b != aVar.f303670b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
                return false;
            } else if (this.f303671c != aVar.f303671c) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
                return false;
            } else if (this.f303672d != aVar.f303672d) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f303673e, aVar.f303673e);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ABAResult");
        int i = ((((((this.f303669a * 31) + this.f303670b) * 31) + this.f303671c) * 31) + this.f303672d) * 31;
        ABAPrams aBAPrams = this.f303673e;
        int hashCode = i + (aBAPrams == null ? 0 : aBAPrams.hashCode());
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ABAResult");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ABAResult");
        String str = "ABAResult(errCode=" + this.f303669a + ", width=" + this.f303670b + ", height=" + this.f303671c + ", bitrate=" + this.f303672d + ", abaParams=" + this.f303673e + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ABAResult");
        return str;
    }
}
