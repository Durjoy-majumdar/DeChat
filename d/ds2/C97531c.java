package ds2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: ds2.c */
public enum C97531c {
    FIRST(1),
    AFTER_MAX(2),
    BEFORE_MIN(3),
    EMPTY(4);
    

    /* renamed from: d */
    public final int f286225d;

    /* access modifiers changed from: public */
    C97531c(int i) {
        this.f286225d = i;
    }

    public final int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        int i = this.f286225d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        return i;
    }
}
