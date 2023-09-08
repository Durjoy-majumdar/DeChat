package xu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: xu2.c */
public final class C102743c {

    /* renamed from: a */
    public final String f303374a;

    /* renamed from: b */
    public final String f303375b;

    /* renamed from: c */
    public final long f303376c;

    /* renamed from: d */
    public final ArrayList<String> f303377d;

    public C102743c(String str, String str2, long j, ArrayList<String> arrayList) {
        C87412m.m108594g(str, "methodName");
        C87412m.m108594g(str2, "clazzName");
        C87412m.m108594g(arrayList, "trace");
        this.f303374a = str;
        this.f303375b = str2;
        this.f303376c = j;
        this.f303377d = arrayList;
    }

    /* renamed from: a */
    public final long mo142525a() {
        SnsMethodCalculate.markStartTimeMs("getCostMs", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
        long j = this.f303376c;
        SnsMethodCalculate.markEndTimeMs("getCostMs", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
        return j;
    }

    /* renamed from: b */
    public final ArrayList<String> mo142526b() {
        SnsMethodCalculate.markStartTimeMs("getTrace", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
        ArrayList<String> arrayList = this.f303377d;
        SnsMethodCalculate.markEndTimeMs("getTrace", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
        return arrayList;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
            return true;
        } else if (!(obj instanceof C102743c)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
            return false;
        } else {
            C102743c cVar = (C102743c) obj;
            if (!C87412m.m108589b(this.f303374a, cVar.f303374a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                return false;
            } else if (!C87412m.m108589b(this.f303375b, cVar.f303375b)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                return false;
            } else if (this.f303376c != cVar.f303376c) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f303377d, cVar.f303377d);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
        long j = this.f303376c;
        int hashCode = (((((this.f303374a.hashCode() * 31) + this.f303375b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f303377d.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
        String str = "SnsMethodStruct(methodName=" + this.f303374a + ", clazzName=" + this.f303375b + ", costMs=" + this.f303376c + ", trace=" + this.f303377d + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
        return str;
    }
}
