package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ft2.C97979c;
import hp3.C87581a;

/* renamed from: com.tencent.mm.plugin.sns.ui.l6 */
public class C96007l6 implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ SnsTimeLineUI.C956493 f280334a;

    public C96007l6(SnsTimeLineUI.C956493 r1) {
        this.f280334a = r1;
    }

    public Object call(Object obj) {
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$3$1");
        Void voidR = (Void) obj;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$3$1");
        C97979c J7 = SnsTimeLineUI.m122282J7(SnsTimeLineUI.this);
        if (J7 != null) {
            J7.mo137295j().mo137877q();
            J7.mo133186F0("");
        }
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$3$1");
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$3$1");
        return voidR;
    }
}
