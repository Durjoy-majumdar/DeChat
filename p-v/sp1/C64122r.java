package sp1;

import android.animation.ObjectAnimator;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: sp1.r */
public final class C64122r extends C87413o implements C32224a<ObjectAnimator> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopHotSellView f181794d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64122r(FinderLiveShopHotSellView finderLiveShopHotSellView) {
        super(0);
        this.f181794d = finderLiveShopHotSellView;
    }

    public Object invoke() {
        FinderLiveGiftTextView finderLiveGiftTextView = this.f181794d.f160944o;
        if (finderLiveGiftTextView != null) {
            return ObjectAnimator.ofFloat(finderLiveGiftTextView, "scaleY", new float[]{0.0f, 1.1f}).setDuration(125);
        }
        return null;
    }
}
