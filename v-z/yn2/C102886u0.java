package yn2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import te3.C101802kr2;

/* renamed from: yn2.u0 */
public final class C102886u0 {

    /* renamed from: a */
    public final C102887v0 f303689a;

    /* renamed from: b */
    public byte[] f303690b;

    /* renamed from: c */
    public String f303691c;

    /* renamed from: d */
    public final C101802kr2 f303692d;

    /* renamed from: e */
    public final int f303693e;

    /* renamed from: f */
    public final ArrayList<String> f303694f;

    public C102886u0(C102887v0 v0Var, byte[] bArr, String str, C101802kr2 kr22, int i, ArrayList<String> arrayList, int i2, C8480h hVar) {
        bArr = (i2 & 2) != 0 ? null : bArr;
        str = (i2 & 4) != 0 ? null : str;
        kr22 = (i2 & 8) != 0 ? null : kr22;
        i = (i2 & 16) != 0 ? -1 : i;
        arrayList = (i2 & 32) != 0 ? null : arrayList;
        C87412m.m108594g(v0Var, "type");
        this.f303689a = v0Var;
        this.f303690b = bArr;
        this.f303691c = str;
        this.f303692d = kr22;
        this.f303693e = i;
        this.f303694f = arrayList;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return true;
        } else if (!(obj instanceof C102886u0)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        } else {
            C102886u0 u0Var = (C102886u0) obj;
            if (this.f303689a != u0Var.f303689a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
                return false;
            } else if (!C87412m.m108589b(this.f303690b, u0Var.f303690b)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
                return false;
            } else if (!C87412m.m108589b(this.f303691c, u0Var.f303691c)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
                return false;
            } else if (!C87412m.m108589b(this.f303692d, u0Var.f303692d)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
                return false;
            } else if (this.f303693e != u0Var.f303693e) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f303694f, u0Var.f303694f);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        int hashCode = this.f303689a.hashCode() * 31;
        byte[] bArr = this.f303690b;
        int i = 0;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        String str = this.f303691c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C101802kr2 kr22 = this.f303692d;
        int hashCode4 = (((hashCode3 + (kr22 == null ? 0 : kr22.hashCode())) * 31) + this.f303693e) * 31;
        ArrayList<String> arrayList = this.f303694f;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        int i2 = hashCode4 + i;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        return i2;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        String str = "SnsPostFinderData(type=" + this.f303689a + ", compositionInfo=" + Arrays.toString(this.f303690b) + ", videoPath=" + this.f303691c + ", location=" + this.f303692d + ", videoSourceScene=" + this.f303693e + ", photos=" + this.f303694f + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        return str;
    }
}
