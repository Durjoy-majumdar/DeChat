package ds2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: ds2.a */
public final class C97529a {

    /* renamed from: a */
    public C97530b f286211a;

    /* renamed from: b */
    public long f286212b;

    /* renamed from: c */
    public long f286213c;

    public C97529a(C97530b bVar, long j, long j2) {
        C87412m.m108594g(bVar, "predictType");
        this.f286211a = bVar;
        this.f286212b = j;
        this.f286213c = j2;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            return true;
        } else if (!(obj instanceof C97529a)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            return false;
        } else {
            C97529a aVar = (C97529a) obj;
            if (this.f286211a != aVar.f286211a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                return false;
            } else if (this.f286212b != aVar.f286212b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                return false;
            } else {
                int i = (this.f286213c > aVar.f286213c ? 1 : (this.f286213c == aVar.f286213c ? 0 : -1));
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                return i == 0;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        long j = this.f286212b;
        long j2 = this.f286213c;
        int hashCode = (((this.f286211a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        String str = "KaraPredictItem(predictType=" + this.f286211a + ", predictStartTime=" + this.f286212b + ", predictCost=" + this.f286213c + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        return str;
    }
}
