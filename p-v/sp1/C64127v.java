package sp1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: sp1.v */
public final class C64127v extends C87413o implements C32224a<Float> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopPromoteContainer f181802d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64127v(FinderLiveShopPromoteContainer finderLiveShopPromoteContainer) {
        super(0);
        this.f181802d = finderLiveShopPromoteContainer;
    }

    public Object invoke() {
        return Float.valueOf((float) this.f181802d.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df));
    }
}
