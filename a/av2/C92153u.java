package av2;

import com.tencent.p014mm.plugin.sns.p106ui.FlipView$$l;
import com.tencent.p014mm.plugin.sns.p106ui.SnsGalleryUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gq0.C107885g0;
import gy3.C87412m;

/* renamed from: av2.u */
public final class C92153u implements FlipView$$l {

    /* renamed from: a */
    public final SnsGalleryUI f263779a;

    /* renamed from: b */
    public final C107885g0 f263780b;

    public C92153u(SnsGalleryUI snsGalleryUI, C107885g0 g0Var) {
        C87412m.m108594g(snsGalleryUI, "snsGalleryUI");
        C87412m.m108594g(g0Var, "enhanceController");
        this.f263779a = snsGalleryUI;
        this.f263780b = g0Var;
        snsGalleryUI.mo132730d8(this);
    }

    /* renamed from: a */
    public void mo126096a(String str) {
        SnsMethodCalculate.markStartTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIRevokeOpenMaterialsEnableLogic");
        Log.m105924i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "onMediaChange, do revoke");
        this.f263780b.mo158311o(C107885g0.C45943b.HIDE);
        this.f263779a.mo132733g8(this);
        SnsMethodCalculate.markEndTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIRevokeOpenMaterialsEnableLogic");
    }
}
