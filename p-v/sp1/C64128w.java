package sp1;

import android.view.LayoutInflater;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: sp1.w */
public final class C64128w extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopPromoteContainer f181803d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64128w(FinderLiveShopPromoteContainer finderLiveShopPromoteContainer) {
        super(0);
        this.f181803d = finderLiveShopPromoteContainer;
    }

    public Object invoke() {
        return LayoutInflater.from(this.f181803d.getContext()).inflate(C0966R.C0971layout.cta, this.f181803d, true);
    }
}
