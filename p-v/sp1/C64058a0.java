package sp1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: sp1.a0 */
public final class C64058a0 extends C87413o implements C32224a<FinderLiveOnliveWidget> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopPromoteContainer f181602d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64058a0(FinderLiveShopPromoteContainer finderLiveShopPromoteContainer) {
        super(0);
        this.f181602d = finderLiveShopPromoteContainer;
    }

    public Object invoke() {
        return (FinderLiveOnliveWidget) this.f181602d.getContainer().findViewById(C0966R.C0970id.mup);
    }
}
