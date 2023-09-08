package zt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: zt2.h */
public final class C103081h {

    /* renamed from: a */
    public final String f304146a;

    /* renamed from: b */
    public ArrayList<String> f304147b;

    /* renamed from: c */
    public final ArrayList<String> f304148c;

    public C103081h(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        C87412m.m108594g(str, "indicator");
        C87412m.m108594g(arrayList, "feedList");
        C87412m.m108594g(arrayList2, "userNames");
        this.f304146a = str;
        this.f304147b = arrayList;
        this.f304148c = arrayList2;
    }

    /* renamed from: a */
    public final ArrayList<String> mo142795a() {
        SnsMethodCalculate.markStartTimeMs("getFeedList", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        ArrayList<String> arrayList = this.f304147b;
        SnsMethodCalculate.markEndTimeMs("getFeedList", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return arrayList;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            return true;
        } else if (!(obj instanceof C103081h)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            return false;
        } else {
            C103081h hVar = (C103081h) obj;
            if (!C87412m.m108589b(this.f304146a, hVar.f304146a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
                return false;
            } else if (!C87412m.m108589b(this.f304147b, hVar.f304147b)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f304148c, hVar.f304148c);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        int hashCode = (((this.f304146a.hashCode() * 31) + this.f304147b.hashCode()) * 31) + this.f304148c.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        String str = "SnsUnreadTier(indicator=" + this.f304146a + ", feedList=" + this.f304147b + ", userNames=" + this.f304148c + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return str;
    }
}
