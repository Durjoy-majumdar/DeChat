package fp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import gy3.C87412m;
import ip2.C98778a;

/* renamed from: fp2.b */
public final class C87066b {

    /* renamed from: a */
    public final int f252647a;

    /* renamed from: b */
    public C87067c f252648b;

    /* renamed from: c */
    public C98778a f252649c;

    public C87066b(int i, C87067c cVar, C98778a aVar, int i2, C8480h hVar) {
        cVar = (i2 & 2) != 0 ? null : cVar;
        aVar = (i2 & 4) != 0 ? null : aVar;
        this.f252647a = i;
        this.f252648b = cVar;
        this.f252649c = aVar;
    }

    /* renamed from: a */
    public final C98778a mo121532a() {
        SnsMethodCalculate.markStartTimeMs("getMbInfoHelper", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        C98778a aVar = this.f252649c;
        SnsMethodCalculate.markEndTimeMs("getMbInfoHelper", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return aVar;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
            return true;
        } else if (!(obj instanceof C87066b)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
            return false;
        } else {
            C87066b bVar = (C87066b) obj;
            if (this.f252647a != bVar.f252647a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                return false;
            } else if (!C87412m.m108589b(this.f252648b, bVar.f252648b)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f252649c, bVar.f252649c);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        int i = this.f252647a * 31;
        C87067c cVar = this.f252648b;
        int i2 = 0;
        int hashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C98778a aVar = this.f252649c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        int i3 = hashCode + i2;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return i3;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        String str = "MagicBrushData(activityHash=" + this.f252647a + ", biz=" + this.f252648b + ", mbInfoHelper=" + this.f252649c + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return str;
    }
}
