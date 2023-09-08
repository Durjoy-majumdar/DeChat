package mu2;

import com.tencent.p014mm.plugin.sns.p106ui.item.C95917e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nu2.C100205f;
import nu2.C100207g;

/* renamed from: mu2.c */
public class C99975c extends C95917e {
    /* renamed from: D */
    public void mo133428D() {
        SnsMethodCalculate.markStartTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
        super.mo133428D();
        C100207g gVar = this.f280064B;
        if (gVar != null && (gVar instanceof C100205f)) {
            ((C100205f) gVar).mo139509q(this.f280066r.f280077F0);
        }
        SnsMethodCalculate.markEndTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
    }

    /* renamed from: E */
    public C100207g mo133429E() {
        SnsMethodCalculate.markStartTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
        C100205f fVar = new C100205f();
        SnsMethodCalculate.markEndTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
        return fVar;
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
        return "GestureAdTimeLineItem";
    }
}
