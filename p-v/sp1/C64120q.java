package sp1;

import android.animation.ObjectAnimator;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: sp1.q */
public final class C64120q extends C87413o implements C32224a<ObjectAnimator> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopHotSellView f181793d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64120q(FinderLiveShopHotSellView finderLiveShopHotSellView) {
        super(0);
        this.f181793d = finderLiveShopHotSellView;
    }

    public Object invoke() {
        FinderLiveGiftTextView finderLiveGiftTextView = this.f181793d.f160944o;
        if (finderLiveGiftTextView == null) {
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(finderLiveGiftTextView, "scaleX", new float[]{1.1f, 1.0f}).setDuration(83);
        duration.setStartDelay(125);
        return duration;
    }
}
