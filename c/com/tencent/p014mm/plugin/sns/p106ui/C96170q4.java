package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.SnsHeader;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.sns.ui.q4 */
public class C96170q4 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ SnsHeader f280950a;

    public C96170q4(SnsHeader snsHeader) {
        this.f280950a = snsHeader;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$12");
        if (i == 0) {
            SnsHeader snsHeader = this.f280950a;
            if (snsHeader.f278106n) {
                snsHeader.mo132740g();
            } else if (!SnsHeader.m122099e(snsHeader).field_isLike && SnsHeader.m122100f(this.f280950a) != null) {
                SnsHeader.m122099e(this.f280950a).field_isLike = !SnsHeader.m122099e(this.f280950a).field_isLike;
                SnsHeader.C95544h f = SnsHeader.m122100f(this.f280950a);
                SnsHeader snsHeader2 = this.f280950a;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                long j = snsHeader2.f278103h;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                ((SnsUIAction.C95663f) f).mo133052a(j, SnsHeader.m122099e(this.f280950a).field_isLike);
                SnsHeader snsHeader3 = this.f280950a;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                snsHeader3.mo132750n();
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$12");
    }
}
