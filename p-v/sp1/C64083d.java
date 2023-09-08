package sp1;

import android.animation.ObjectAnimator;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import fy3.C32224a;
import gy3.C87413o;
import org.libpag.PAGView;

/* renamed from: sp1.d */
public final class C64083d extends C87413o implements C32224a<ObjectAnimator> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopHotSellView f181697d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64083d(FinderLiveShopHotSellView finderLiveShopHotSellView) {
        super(0);
        this.f181697d = finderLiveShopHotSellView;
    }

    public Object invoke() {
        FinderLiveShopHotSellView finderLiveShopHotSellView = this.f181697d;
        PAGView pAGView = finderLiveShopHotSellView.f160941i;
        if (pAGView == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pAGView, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration((long) finderLiveShopHotSellView.f160946q.f160956a);
        return ofFloat;
    }
}
