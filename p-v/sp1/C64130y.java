package sp1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: sp1.y */
public final class C64130y extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopPromoteContainer f181805d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64130y(FinderLiveShopPromoteContainer finderLiveShopPromoteContainer) {
        super(0);
        this.f181805d = finderLiveShopPromoteContainer;
    }

    public Object invoke() {
        return this.f181805d.getContainer().findViewById(C0966R.C0970id.f358965i40);
    }
}
