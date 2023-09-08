package xu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: xu2.b */
public final class C66444b {

    /* renamed from: a */
    public int f191201a;

    /* renamed from: b */
    public String f191202b;

    public C66444b() {
        this(0, (String) null, 3, (C8480h) null);
    }

    public C66444b(int i, String str, int i2, C8480h hVar) {
        i = (i2 & 1) != 0 ? -1 : i;
        str = (i2 & 2) != 0 ? "idle" : str;
        C87412m.m108594g(str, "scrollWord");
        this.f191201a = i;
        this.f191202b = str;
    }

    /* renamed from: a */
    public final void mo90530a(String str) {
        SnsMethodCalculate.markStartTimeMs("setScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        C87412m.m108594g(str, "<set-?>");
        this.f191202b = str;
        SnsMethodCalculate.markEndTimeMs("setScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            return true;
        } else if (!(obj instanceof C66444b)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            return false;
        } else {
            C66444b bVar = (C66444b) obj;
            if (this.f191201a != bVar.f191201a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
                return false;
            }
            boolean b = C87412m.m108589b(this.f191202b, bVar.f191202b);
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            return b;
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        int hashCode = (this.f191201a * 31) + this.f191202b.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        String str = "ScrollState(scrollState=" + this.f191201a + ", scrollWord=" + this.f191202b + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        return str;
    }
}
