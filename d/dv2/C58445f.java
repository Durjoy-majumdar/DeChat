package dv2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.List;

/* renamed from: dv2.f */
public final class C58445f {

    /* renamed from: a */
    public final int f167425a;

    /* renamed from: b */
    public final int f167426b;

    /* renamed from: c */
    public final int f167427c;

    /* renamed from: d */
    public final List<C58444e> f167428d;

    public C58445f(int i, int i2, int i3, List<C58444e> list) {
        C87412m.m108594g(list, "childItems");
        this.f167425a = i;
        this.f167426b = i2;
        this.f167427c = i3;
        this.f167428d = list;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return true;
        } else if (!(obj instanceof C58445f)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        } else {
            C58445f fVar = (C58445f) obj;
            if (this.f167425a != fVar.f167425a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
                return false;
            } else if (this.f167426b != fVar.f167426b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
                return false;
            } else if (this.f167427c != fVar.f167427c) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f167428d, fVar.f167428d);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        int hashCode = (((((this.f167425a * 31) + this.f167426b) * 31) + this.f167427c) * 31) + this.f167428d.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        String str = "SelectVisibleGroupHeaderConfigItem(visibleState=" + this.f167425a + ", titleResId=" + this.f167426b + ", subTitleResId=" + this.f167427c + ", childItems=" + this.f167428d + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        return str;
    }
}
