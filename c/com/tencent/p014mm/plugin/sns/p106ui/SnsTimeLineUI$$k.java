package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ft2.C97979c;
import hp3.C87581a;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$k */
public class SnsTimeLineUI$$k implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ SnsTimeLineUI f278761a;

    public SnsTimeLineUI$$k(SnsTimeLineUI snsTimeLineUI) {
        this.f278761a = snsTimeLineUI;
    }

    public Object call(Object obj) {
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$28");
        Void voidR = (Void) obj;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$28");
        C97979c J7 = SnsTimeLineUI.m122282J7(this.f278761a);
        if (J7 != null) {
            SnsTimeLineUI snsTimeLineUI = this.f278761a;
            long h = J7.mo137293h(true);
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            snsTimeLineUI.f278700y0 = h;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            J7.mo137295j().mo137874k();
            J7.mo133186F0("");
        }
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$28");
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$28");
        return voidR;
    }
}
