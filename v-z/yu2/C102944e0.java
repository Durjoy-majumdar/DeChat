package yu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import gy3.C87412m;
import te3.C101804kv2;

/* renamed from: yu2.e0 */
public final class C102944e0 {

    /* renamed from: a */
    public final SnsInfo f303825a;

    /* renamed from: b */
    public final C101804kv2 f303826b;

    public C102944e0(SnsInfo snsInfo, C101804kv2 kv22) {
        C87412m.m108594g(snsInfo, "info");
        C87412m.m108594g(kv22, "mediaObj");
        this.f303825a = snsInfo;
        this.f303826b = kv22;
    }

    /* renamed from: a */
    public final SnsInfo mo142658a() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        SnsInfo snsInfo = this.f303825a;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return snsInfo;
    }

    /* renamed from: b */
    public final C101804kv2 mo142659b() {
        SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        C101804kv2 kv22 = this.f303826b;
        SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return kv22;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
            return true;
        } else if (!(obj instanceof C102944e0)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
            return false;
        } else {
            C102944e0 e0Var = (C102944e0) obj;
            if (!C87412m.m108589b(this.f303825a, e0Var.f303825a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
                return false;
            }
            boolean b = C87412m.m108589b(this.f303826b, e0Var.f303826b);
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
            return b;
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        int hashCode = (this.f303825a.hashCode() * 31) + this.f303826b.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        String str = "SnsPickerMediaInfo(info=" + this.f303825a + ", mediaObj=" + this.f303826b + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return str;
    }
}
