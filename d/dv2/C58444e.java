package dv2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: dv2.e */
public final class C58444e {

    /* renamed from: a */
    public final int f167421a;

    /* renamed from: b */
    public final int f167422b;

    /* renamed from: c */
    public final int f167423c;

    /* renamed from: d */
    public final int f167424d;

    public C58444e(int i, int i2, int i3, int i4) {
        this.f167421a = i;
        this.f167422b = i2;
        this.f167423c = i3;
        this.f167424d = i4;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return true;
        } else if (!(obj instanceof C58444e)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return false;
        } else {
            C58444e eVar = (C58444e) obj;
            if (this.f167421a != eVar.f167421a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
                return false;
            } else if (this.f167422b != eVar.f167422b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
                return false;
            } else if (this.f167423c != eVar.f167423c) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
                return false;
            } else {
                int i = this.f167424d;
                int i2 = eVar.f167424d;
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
                return i == i2;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        int i = (((((this.f167421a * 31) + this.f167422b) * 31) + this.f167423c) * 31) + this.f167424d;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        return i;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        String str = "SelectVisibleGroupChildConfigItem(visibleState=" + this.f167421a + ", childKey=" + this.f167422b + ", titleResId=" + this.f167423c + ", subTitleResId=" + this.f167424d + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        return str;
    }
}
