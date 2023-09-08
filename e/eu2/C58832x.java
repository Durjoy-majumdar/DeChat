package eu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: eu2.x */
public final class C58832x {

    /* renamed from: a */
    public String f168429a;

    /* renamed from: b */
    public String f168430b;

    public C58832x() {
        this((String) null, (String) null, 3, (C8480h) null);
    }

    public C58832x(String str, String str2, int i, C8480h hVar) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "uniqueKey");
        this.f168429a = str;
        this.f168430b = str2;
    }

    /* renamed from: a */
    public final String mo84007a() {
        SnsMethodCalculate.markStartTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        String str = this.f168430b;
        SnsMethodCalculate.markEndTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return str;
    }

    /* renamed from: b */
    public final String mo84008b() {
        SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        String str = this.f168429a;
        SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return str;
    }

    /* renamed from: c */
    public final void mo84009c(String str) {
        SnsMethodCalculate.markStartTimeMs("setUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        C87412m.m108594g(str, "<set-?>");
        this.f168430b = str;
        SnsMethodCalculate.markEndTimeMs("setUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
    }

    /* renamed from: d */
    public final void mo84010d(String str) {
        SnsMethodCalculate.markStartTimeMs("setUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        C87412m.m108594g(str, "<set-?>");
        this.f168429a = str;
        SnsMethodCalculate.markEndTimeMs("setUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
            return true;
        } else if (!(obj instanceof C58832x)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
            return false;
        } else {
            C58832x xVar = (C58832x) obj;
            if (!C87412m.m108589b(this.f168429a, xVar.f168429a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
                return false;
            }
            boolean b = C87412m.m108589b(this.f168430b, xVar.f168430b);
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
            return b;
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        int hashCode = (this.f168429a.hashCode() * 31) + this.f168430b.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        String str = "UrlAndToken(url=" + this.f168429a + ", uniqueKey=" + this.f168430b + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return str;
    }
}
