package sp1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: sp1.x */
public final class C64129x extends C87413o implements C32224a<FinderLiveShopHotSellView> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopPromoteContainer f181804d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64129x(FinderLiveShopPromoteContainer finderLiveShopPromoteContainer) {
        super(0);
        this.f181804d = finderLiveShopPromoteContainer;
    }

    public Object invoke() {
        return (FinderLiveShopHotSellView) this.f181804d.getContainer().findViewById(C0966R.C0970id.msr);
    }
}
