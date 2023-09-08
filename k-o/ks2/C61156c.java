package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import org.json.JSONObject;

/* renamed from: ks2.c */
public final class C61156c {

    /* renamed from: a */
    public int f174104a;

    /* renamed from: b */
    public int f174105b;

    /* renamed from: c */
    public int f174106c;

    public C61156c() {
        this(0, 0, 0, 7, (C8480h) null);
    }

    public C61156c(int i, int i2, int i3, int i4, C8480h hVar) {
        i = (i4 & 1) != 0 ? 0 : i;
        i2 = (i4 & 2) != 0 ? 0 : i2;
        i3 = (i4 & 4) != 0 ? 0 : i3;
        this.f174104a = i;
        this.f174105b = i2;
        this.f174106c = i3;
    }

    /* renamed from: a */
    public final int mo86097a() {
        SnsMethodCalculate.markStartTimeMs("getLoaderQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
        int i = this.f174106c;
        SnsMethodCalculate.markEndTimeMs("getLoaderQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
        return i;
    }

    /* renamed from: b */
    public final String mo86098b() {
        SnsMethodCalculate.markStartTimeMs("toReport", "com.tencent.mm.plugin.sns.report.QueueSize");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pendingQueueSize", this.f174104a);
        jSONObject.put("downloadingQueueSize", this.f174105b);
        String a = C61157y.m71719a(jSONObject);
        SnsMethodCalculate.markEndTimeMs("toReport", "com.tencent.mm.plugin.sns.report.QueueSize");
        return a;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
            return true;
        } else if (!(obj instanceof C61156c)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
            return false;
        } else {
            C61156c cVar = (C61156c) obj;
            if (this.f174104a != cVar.f174104a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
                return false;
            } else if (this.f174105b != cVar.f174105b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
                return false;
            } else {
                int i = this.f174106c;
                int i2 = cVar.f174106c;
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
                return i == i2;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.report.QueueSize");
        int i = (((this.f174104a * 31) + this.f174105b) * 31) + this.f174106c;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.report.QueueSize");
        return i;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.report.QueueSize");
        String str = "[pending:" + this.f174104a + ", downloading:" + this.f174105b + ']';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.report.QueueSize");
        return str;
    }
}
