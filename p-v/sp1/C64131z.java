package sp1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: sp1.z */
public final class C64131z extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopPromoteContainer f181806d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64131z(FinderLiveShopPromoteContainer finderLiveShopPromoteContainer) {
        super(0);
        this.f181806d = finderLiveShopPromoteContainer;
    }

    public Object invoke() {
        return this.f181806d.getContainer().findViewById(C0966R.C0970id.muq);
    }
}
