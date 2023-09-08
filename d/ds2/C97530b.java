package ds2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: ds2.b */
public enum C97530b {
    SUBMIT(1),
    START(2),
    FINISH_V2(3),
    FINISH_V4(4);
    

    /* renamed from: d */
    public final int f286219d;

    /* access modifiers changed from: public */
    C97530b(int i) {
        this.f286219d = i;
    }

    public final int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.config.PredictType");
        int i = this.f286219d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.config.PredictType");
        return i;
    }
}
