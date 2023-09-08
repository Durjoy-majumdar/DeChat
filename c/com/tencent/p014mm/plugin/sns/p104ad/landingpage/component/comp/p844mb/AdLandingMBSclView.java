package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.p844mb;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/component/comp/mb/AdLandingMBSclView;", "Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView */
public final class AdLandingMBSclView extends MagicSclViewContainer {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AdLandingMBSclView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView");
        super.onDetachedFromWindow();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView");
        super.onLayout(z, i, i2, i3, i4);
        Log.m105924i("AdLandingMBSclView", "AdLandingMBSclView, onLayout:w=" + (i3 - i) + ", h=" + (i4 - i2));
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLandingMBSclView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
