package qs2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: qs2.t0 */
public class C101293t0 {

    /* renamed from: a */
    public String f296735a;

    /* renamed from: b */
    public float f296736b;

    /* renamed from: c */
    public float f296737c;

    /* renamed from: d */
    public float f296738d;

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
        boolean z = true;
        if (obj == this) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
            return true;
        } else if (obj instanceof C101293t0) {
            C101293t0 t0Var = (C101293t0) obj;
            if (!(t0Var.f296735a.equals(this.f296735a) && t0Var.f296736b == this.f296736b && t0Var.f296737c == this.f296737c && t0Var.f296738d == this.f296738d)) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
            return z;
        } else {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
            return false;
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
        int hashCode = super.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
        return hashCode;
    }
}
