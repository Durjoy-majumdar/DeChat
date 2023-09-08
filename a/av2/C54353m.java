package av2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C72996z1;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: av2.m */
public final class C54353m {

    /* renamed from: a */
    public int f152515a;

    /* renamed from: b */
    public final String f152516b;

    /* renamed from: c */
    public C54354n f152517c;

    /* renamed from: d */
    public C72996z1 f152518d;

    public C54353m(int i, String str, C54354n nVar, C72996z1 z1Var, int i2, C8480h hVar) {
        str = (i2 & 2) != 0 ? null : str;
        nVar = (i2 & 4) != 0 ? null : nVar;
        z1Var = (i2 & 8) != 0 ? null : z1Var;
        this.f152515a = i;
        this.f152516b = str;
        this.f152517c = nVar;
        this.f152518d = z1Var;
    }

    /* renamed from: a */
    public final C54354n mo75121a() {
        SnsMethodCalculate.markStartTimeMs("getLabel", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        C54354n nVar = this.f152517c;
        SnsMethodCalculate.markEndTimeMs("getLabel", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return nVar;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return true;
        } else if (!(obj instanceof C54353m)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return false;
        } else {
            C54353m mVar = (C54353m) obj;
            if (this.f152515a != mVar.f152515a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
                return false;
            } else if (!C87412m.m108589b(this.f152516b, mVar.f152516b)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
                return false;
            } else if (!C87412m.m108589b(this.f152517c, mVar.f152517c)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f152518d, mVar.f152518d);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        int i = this.f152515a * 31;
        String str = this.f152516b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        C54354n nVar = this.f152517c;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        C72996z1 z1Var = this.f152518d;
        if (z1Var != null) {
            i2 = z1Var.hashCode();
        }
        int i3 = hashCode2 + i2;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return i3;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        String str = "ItemInfo(type=" + this.f152515a + ", title=" + this.f152516b + ", label=" + this.f152517c + ", contact=" + this.f152518d + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return str;
    }
}
