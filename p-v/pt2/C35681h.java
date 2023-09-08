package pt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: pt2.h */
public final class C35681h {

    /* renamed from: a */
    public boolean f95350a;

    /* renamed from: b */
    public String f95351b;

    public C35681h() {
        this(false, "");
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
            return true;
        } else if (!(obj instanceof C35681h)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
            return false;
        } else {
            C35681h hVar = (C35681h) obj;
            if (this.f95350a != hVar.f95350a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
                return false;
            }
            boolean b = C87412m.m108589b(this.f95351b, hVar.f95351b);
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
            return b;
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        boolean z = this.f95350a;
        if (z) {
            z = true;
        }
        int hashCode = ((z ? 1 : 0) * true) + this.f95351b.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        String str = "SnsMsgStopRemindReportInfo(blockNotifyEduFlag=" + this.f95350a + ", EduTriggerFeedid=" + this.f95351b + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        return str;
    }

    public C35681h(boolean z, String str) {
        C87412m.m108594g(str, "EduTriggerFeedid");
        this.f95350a = z;
        this.f95351b = str;
    }
}
