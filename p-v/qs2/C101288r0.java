package qs2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qs2.r0 */
public class C101288r0 extends C101255a0 {

    /* renamed from: A */
    public float f296715A;

    /* renamed from: B */
    public String f296716B = "";

    /* renamed from: C */
    public int f296717C;

    /* renamed from: D */
    public int f296718D;

    /* renamed from: E */
    public int f296719E;

    /* renamed from: F */
    public int f296720F;

    /* renamed from: G */
    public String f296721G = "";

    /* renamed from: H */
    public List<C101289a> f296722H = new ArrayList();

    /* renamed from: z */
    public String f296723z = "";

    /* renamed from: qs2.r0$a */
    public static class C101289a {

        /* renamed from: a */
        public String f296724a = "";

        /* renamed from: b */
        public String f296725b = "";

        /* renamed from: c */
        public float f296726c;

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
            boolean z = true;
            if (obj == this) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
                return true;
            } else if (obj instanceof C101289a) {
                C101289a aVar = (C101289a) obj;
                if (!aVar.f296724a.equals(this.f296724a) || !aVar.f296725b.equals(this.f296725b) || aVar.f296726c != this.f296726c) {
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
                return z;
            } else {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
                return false;
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
            int hashCode = (int) (((float) (this.f296724a.hashCode() + this.f296725b.hashCode())) + this.f296726c);
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
            return hashCode;
        }
    }

    public boolean equals(Object obj) {
        String str;
        List<C101289a> list;
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
        boolean z = true;
        if (obj == this) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
            return true;
        } else if (obj instanceof C101288r0) {
            C101288r0 r0Var = (C101288r0) obj;
            String str2 = r0Var.f296723z;
            if (str2 != null ? str2.equals(this.f296723z) : this.f296723z == null) {
                if (r0Var.f296715A == this.f296715A) {
                    if ((str = r0Var.f296716B) != null ? str.equals(this.f296716B) : this.f296716B == null) {
                        if (r0Var.f296717C == this.f296717C) {
                            if (r0Var.f296718D == this.f296718D) {
                                if (r0Var.f296719E == this.f296719E) {
                                    if (r0Var.f296720F == this.f296720F) {
                                        if ((list = r0Var.f296722H) != null ? list.equals(this.f296722H) : this.f296722H == null) {
                                            if ((r7 = r0Var.f296721G) != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z = false;
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
            return z;
        } else {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
            return false;
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
        int hashCode = super.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
        return hashCode;
    }
}
