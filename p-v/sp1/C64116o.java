package sp1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: sp1.o */
public final class C64116o extends C87413o implements C32224a<AnimatorSet> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopHotSellView f181787d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64116o(FinderLiveShopHotSellView finderLiveShopHotSellView) {
        super(0);
        this.f181787d = finderLiveShopHotSellView;
    }

    public Object invoke() {
        AnimatorSet animatorSet = new AnimatorSet();
        FinderLiveShopHotSellView finderLiveShopHotSellView = this.f181787d;
        FinderLiveGiftTextView finderLiveGiftTextView = finderLiveShopHotSellView.f160944o;
        if (finderLiveGiftTextView != null) {
            finderLiveGiftTextView.setPivotX(0.0f);
            finderLiveGiftTextView.setPivotY((float) finderLiveGiftTextView.getMeasuredHeight());
        }
        animatorSet.playTogether(new Animator[]{finderLiveShopHotSellView.getSellNumScalex1(), finderLiveShopHotSellView.getSellNumScaley1(), finderLiveShopHotSellView.getSellNumScalex2(), finderLiveShopHotSellView.getSellNumScaley2(), finderLiveShopHotSellView.getSellNumAlpha1()});
        return animatorSet;
    }
}
