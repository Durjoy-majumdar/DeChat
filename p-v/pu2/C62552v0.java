package pu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: pu2.v0 */
public final class C62552v0 {

    /* renamed from: a */
    public String f177655a;

    /* renamed from: b */
    public String f177656b;

    public C62552v0() {
        this((String) null, (String) null, 3, (C8480h) null);
    }

    public C62552v0(String str, String str2, int i, C8480h hVar) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "uniqueKey");
        this.f177655a = str;
        this.f177656b = str2;
    }

    /* renamed from: a */
    public final String mo87555a() {
        SnsMethodCalculate.markStartTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        String str = this.f177656b;
        SnsMethodCalculate.markEndTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        return str;
    }

    /* renamed from: b */
    public final String mo87556b() {
        SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        String str = this.f177655a;
        SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        return str;
    }

    /* renamed from: c */
    public final void mo87557c(String str) {
        SnsMethodCalculate.markStartTimeMs("setUniqueKey", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        C87412m.m108594g(str, "<set-?>");
        this.f177656b = str;
        SnsMethodCalculate.markEndTimeMs("setUniqueKey", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
    }

    /* renamed from: d */
    public final void mo87558d(String str) {
        SnsMethodCalculate.markStartTimeMs("setUrl", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        C87412m.m108594g(str, "<set-?>");
        this.f177655a = str;
        SnsMethodCalculate.markEndTimeMs("setUrl", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
            return true;
        } else if (!(obj instanceof C62552v0)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
            return false;
        } else {
            C62552v0 v0Var = (C62552v0) obj;
            if (!C87412m.m108589b(this.f177655a, v0Var.f177655a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
                return false;
            }
            boolean b = C87412m.m108589b(this.f177656b, v0Var.f177656b);
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
            return b;
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        int hashCode = (this.f177655a.hashCode() * 31) + this.f177656b.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        String str = "UrlAndToken(url=" + this.f177655a + ", uniqueKey=" + this.f177656b + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.item.improve.UrlAndToken");
        return str;
    }
}
