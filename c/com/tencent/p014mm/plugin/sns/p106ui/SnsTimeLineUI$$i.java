package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ft2.C97979c;
import hp3.C87581a;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$i */
public class SnsTimeLineUI$$i implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ String f278753a;

    /* renamed from: b */
    public final /* synthetic */ SnsTimeLineUI f278754b;

    public SnsTimeLineUI$$i(SnsTimeLineUI snsTimeLineUI, String str) {
        this.f278754b = snsTimeLineUI;
        this.f278753a = str;
    }

    public Object call(Object obj) {
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$26");
        Void voidR = (Void) obj;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$26");
        C97979c J7 = SnsTimeLineUI.m122282J7(this.f278754b);
        if (J7 != null) {
            J7.mo137295j().mo137878r(this.f278753a);
            J7.mo137295j().mo137874k();
            J7.mo133186F0("");
        }
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$26");
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$26");
        return voidR;
    }
}
