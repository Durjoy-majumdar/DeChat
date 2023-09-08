package ip2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: ip2.b */
public final class C98779b {

    /* renamed from: a */
    public final String f289596a;

    /* renamed from: b */
    public final String f289597b;

    /* renamed from: c */
    public final String f289598c;

    /* renamed from: d */
    public final int f289599d;

    /* renamed from: e */
    public final int f289600e;

    /* renamed from: f */
    public final int f289601f;

    /* renamed from: g */
    public final JSONObject f289602g;

    /* renamed from: h */
    public final String f289603h;

    public C98779b(String str, String str2, String str3, int i, int i2, int i3, JSONObject jSONObject, String str4) {
        C87412m.m108594g(str, "frameSetName");
        C87412m.m108594g(str2, "id");
        C87412m.m108594g(str3, "linkId");
        C87412m.m108594g(jSONObject, "components");
        C87412m.m108594g(str4, "compDsl");
        this.f289596a = str;
        this.f289597b = str2;
        this.f289598c = str3;
        this.f289599d = i;
        this.f289600e = i2;
        this.f289601f = i3;
        this.f289602g = jSONObject;
        this.f289603h = str4;
    }

    /* renamed from: a */
    public final String mo138160a() {
        SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        String str = this.f289597b;
        SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        return str;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return true;
        } else if (!(obj instanceof C98779b)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return false;
        } else {
            C98779b bVar = (C98779b) obj;
            if (!C87412m.m108589b(this.f289596a, bVar.f289596a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                return false;
            } else if (!C87412m.m108589b(this.f289597b, bVar.f289597b)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                return false;
            } else if (!C87412m.m108589b(this.f289598c, bVar.f289598c)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                return false;
            } else if (this.f289599d != bVar.f289599d) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                return false;
            } else if (this.f289600e != bVar.f289600e) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                return false;
            } else if (this.f289601f != bVar.f289601f) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                return false;
            } else if (!C87412m.m108589b(this.f289602g, bVar.f289602g)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f289603h, bVar.f289603h);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        int hashCode = (((((((((((((this.f289596a.hashCode() * 31) + this.f289597b.hashCode()) * 31) + this.f289598c.hashCode()) * 31) + this.f289599d) * 31) + this.f289600e) * 31) + this.f289601f) * 31) + this.f289602g.hashCode()) * 31) + this.f289603h.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        String str = "MBNodeInfo(frameSetName=" + this.f289596a + ", id=" + this.f289597b + ", linkId=" + this.f289598c + ", width=" + this.f289599d + ", height=" + this.f289600e + ", fullScreen=" + this.f289601f + ", components=" + this.f289602g + ", compDsl=" + this.f289603h + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        return str;
    }
}
