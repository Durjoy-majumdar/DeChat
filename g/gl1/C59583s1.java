package gl1;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62647ba;
import vk1.C65761b;

/* renamed from: gl1.s1 */
public final class C59583s1 extends C87413o implements C32224a<C62647ba> {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f170289d;

    /* renamed from: e */
    public final /* synthetic */ C65761b f170290e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59583s1(ViewGroup viewGroup, C65761b bVar) {
        super(0);
        this.f170289d = viewGroup;
        this.f170290e = bVar;
    }

    public Object invoke() {
        ViewGroup viewGroup = this.f170289d;
        C87412m.m108593f(viewGroup, "parent");
        return new C62647ba(viewGroup, (FinderLiveLogoGroupView) this.f170289d.findViewById(C0966R.C0970id.mui), this.f170290e, true, C45936r1.f123937d);
    }
}
