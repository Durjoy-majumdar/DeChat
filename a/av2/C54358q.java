package av2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;

/* renamed from: av2.q */
public final class C54358q {

    /* renamed from: a */
    public final int f152526a;

    /* renamed from: b */
    public final int f152527b;

    /* renamed from: c */
    public final int f152528c;

    public C54358q(int i, int i2, int i3) {
        this.f152526a = i;
        this.f152527b = i2;
        this.f152528c = i3;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return true;
        } else if (!(obj instanceof C54358q)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return false;
        } else {
            C54358q qVar = (C54358q) obj;
            if (this.f152526a != qVar.f152526a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                return false;
            } else if (this.f152527b != qVar.f152527b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                return false;
            } else {
                int i = this.f152528c;
                int i2 = qVar.f152528c;
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                return i == i2;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        int i = (((this.f152526a * 31) + this.f152527b) * 31) + this.f152528c;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        return i;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        String str = "MenuItem(nameResId=" + this.f152526a + ", rawResId=" + this.f152527b + ", colorResId=" + this.f152528c + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        return str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54358q(int i, int i2, int i3, int i4, C8480h hVar) {
        this(i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
