package av2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: av2.n */
public final class C54354n {

    /* renamed from: a */
    public final int f152519a;

    /* renamed from: b */
    public final String f152520b;

    /* renamed from: c */
    public final int f152521c;

    public C54354n(int i, String str, int i2) {
        C87412m.m108594g(str, "name");
        this.f152519a = i;
        this.f152520b = str;
        this.f152521c = i2;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            return true;
        } else if (!(obj instanceof C54354n)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            return false;
        } else {
            C54354n nVar = (C54354n) obj;
            if (this.f152519a != nVar.f152519a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                return false;
            } else if (!C87412m.m108589b(this.f152520b, nVar.f152520b)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                return false;
            } else {
                int i = this.f152521c;
                int i2 = nVar.f152521c;
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                return i == i2;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        int hashCode = (((this.f152519a * 31) + this.f152520b.hashCode()) * 31) + this.f152521c;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        String str = "LabelInfo(id=" + this.f152519a + ", name=" + this.f152520b + ", count=" + this.f152521c + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        return str;
    }
}
