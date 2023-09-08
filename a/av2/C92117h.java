package av2;

import com.tencent.p014mm.plugin.sns.p106ui.FlipView;
import com.tencent.p014mm.plugin.sns.p106ui.FlipView$$l;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gq0.C107885g0;
import gy3.C87412m;

/* renamed from: av2.h */
public final class C92117h implements FlipView$$l {

    /* renamed from: a */
    public final FlipView f263699a;

    /* renamed from: b */
    public final C107885g0 f263700b;

    public C92117h(FlipView flipView, C107885g0 g0Var) {
        C87412m.m108594g(flipView, "flipView");
        C87412m.m108594g(g0Var, "enhanceController");
        this.f263699a = flipView;
        this.f263700b = g0Var;
        flipView.mo132135e(this);
    }

    /* renamed from: a */
    public void mo126096a(String str) {
        SnsMethodCalculate.markStartTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewRevokeOpenMaterialsEnableLogic");
        Log.m105924i("MicroMsg.AppBrandOpenMaterials_FlipView", "onMediaChange, do revoke");
        this.f263700b.mo158311o(C107885g0.C45943b.HIDE);
        this.f263699a.mo132155p(this);
        SnsMethodCalculate.markEndTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewRevokeOpenMaterialsEnableLogic");
    }
}
