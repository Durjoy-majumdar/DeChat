package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsHeader;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.story.api.AbsStoryHeaderTipView;
import hp3.C87581a;
import j20.C117292a;
import jr2.C99014h;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$f */
public class SnsTimeLineUI$$f implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ C99014h f278740a;

    /* renamed from: b */
    public final /* synthetic */ int f278741b;

    /* renamed from: c */
    public final /* synthetic */ SnsTimeLineUI f278742c;

    public SnsTimeLineUI$$f(SnsTimeLineUI snsTimeLineUI, C99014h hVar, int i) {
        this.f278742c = snsTimeLineUI;
        this.f278740a = hVar;
        this.f278741b = i;
    }

    public Object call(Object obj) {
        AbsStoryHeaderTipView absStoryHeaderTipView;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$23");
        Void voidR = (Void) obj;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$23");
        if (SnsTimeLineUI.m122285M7(this.f278742c) != null) {
            SnsTimeLineUI snsTimeLineUI = this.f278742c;
            SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            snsTimeLineUI.f278622D = false;
            SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            SnsTimeLineUI.m122285M7(this.f278742c).mo133008b();
        }
        SnsTimeLineUI.m122302d8(this.f278742c).f278863s = this.f278740a.mo131175t0();
        if (this.f278740a.mo131175t0()) {
            SnsTimeLineUI.m122302d8(this.f278742c).mo133043u(this.f278740a.mo131161C());
            SnsTimeLineUI snsTimeLineUI2 = this.f278742c;
            if (snsTimeLineUI2.f278646P1 == 1) {
                SnsTimeLineUI.m122302d8(snsTimeLineUI2).mo133045w(this.f278741b, this.f278740a.mo131161C());
            }
        } else if (this.f278740a.mo131176w()) {
            SnsTimeLineUI.m122290R7(this.f278742c).mo137502b(((SnsTimeLineUI$$p) SnsTimeLineUI.m122286N7(this.f278742c)).getType(), SnsTimeLineUI.m122287O7(this.f278742c), SnsTimeLineUI.m122288P7(this.f278742c), SnsTimeLineUI.m122289Q7(this.f278742c), 0);
        }
        SnsUIAction d8 = SnsTimeLineUI.m122302d8(this.f278742c);
        d8.getClass();
        C117292a.m165355a("com/tencent/mm/plugin/sns/ui/SnsUIAction", "com/tencent/mm/plugin/sns/ui/SnsUIAction", "resetStoryHeader", "()V", d8);
        SnsMethodCalculate.markStartTimeMs("resetStoryHeader", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsHeader snsHeader = d8.f278860p;
        if (snsHeader != null) {
            SnsMethodCalculate.markStartTimeMs("resetStoryHeader", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsHeader.C95546j jVar = snsHeader.f278099d;
            if (!(jVar == null || (absStoryHeaderTipView = jVar.f278131f) == null || !snsHeader.f278115w)) {
                absStoryHeaderTipView.mo134181g();
            }
            SnsMethodCalculate.markEndTimeMs("resetStoryHeader", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        }
        SnsMethodCalculate.markEndTimeMs("resetStoryHeader", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        C117292a.m165361g(d8, "com/tencent/mm/plugin/sns/ui/SnsUIAction", "com/tencent/mm/plugin/sns/ui/SnsUIAction", "resetStoryHeader", "()V");
        C94866e1.fy0().mo131310k();
        C94866e1.fy0().mo131302c(0);
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$23");
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$23");
        return voidR;
    }
}
