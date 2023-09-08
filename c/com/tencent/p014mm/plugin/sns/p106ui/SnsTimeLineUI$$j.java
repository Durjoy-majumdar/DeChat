package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import hp3.C87581a;
import ht2.C98524a;
import jr2.C99014h;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$j */
public class SnsTimeLineUI$$j implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ C99014h f278758a;

    /* renamed from: b */
    public final /* synthetic */ SnsTimeLineUI f278759b;

    public SnsTimeLineUI$$j(SnsTimeLineUI snsTimeLineUI, C99014h hVar) {
        this.f278759b = snsTimeLineUI;
        this.f278758a = hVar;
    }

    public Object call(Object obj) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$27");
        Void voidR = (Void) obj;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$27");
        C94866e1.fy0().f275365t = false;
        if (SnsTimeLineUI.m122282J7(this.f278759b) != null) {
            long h = SnsTimeLineUI.m122282J7(this.f278759b).mo137293h(false);
            if (h != 0) {
                C98524a aVar = (C98524a) SnsTimeLineUI.m122282J7(this.f278759b).mo137295j();
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getUnreadTopSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                String str = aVar.f288930v;
                SnsMethodCalculate.markEndTimeMs("getUnreadTopSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                if (h >= C102236a0.m134706B0(str)) {
                    z = true;
                    if (this.f278758a.mo131169k() || z) {
                        SnsTimeLineUI.m122302d8(this.f278759b).mo133028D(false);
                    }
                    SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$27");
                    SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$27");
                    return voidR;
                }
            }
        }
        z = false;
        SnsTimeLineUI.m122302d8(this.f278759b).mo133028D(false);
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$27");
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$27");
        return voidR;
    }
}
