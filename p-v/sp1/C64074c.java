package sp1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: sp1.c */
public final class C64074c extends C87413o implements C32224a<Integer> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopHotSellView f181650d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64074c(FinderLiveShopHotSellView finderLiveShopHotSellView) {
        super(0);
        this.f181650d = finderLiveShopHotSellView;
    }

    public Object invoke() {
        return Integer.valueOf(this.f181650d.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df));
    }
}
