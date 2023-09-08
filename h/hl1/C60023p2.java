package hl1;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62647ba;
import vk1.C65762c;

/* renamed from: hl1.p2 */
public final class C60023p2 extends C87413o implements C32224a<C62647ba> {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f171317d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f171318e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60023p2(ViewGroup viewGroup, C65762c cVar) {
        super(0);
        this.f171317d = viewGroup;
        this.f171318e = cVar;
    }

    public Object invoke() {
        ViewGroup viewGroup = this.f171317d;
        C87412m.m108593f(viewGroup, "parent");
        return new C62647ba(viewGroup, (FinderLiveLogoGroupView) this.f171317d.findViewById(C0966R.C0970id.mui), this.f171318e, true, C46078o2.f124229d);
    }
}
