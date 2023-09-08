package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveShadeView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ii1.C60291e;
import vk1.C65760a;

/* renamed from: fl1.k0 */
public final class C59202k0 extends C87413o implements C32224a<C60291e> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169339d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59202k0(C65760a aVar) {
        super(0);
        this.f169339d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169339d.findViewById(C0966R.C0970id.n98);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…r_live_mic_cover_ui_root)");
        C65760a aVar = this.f169339d;
        View findViewById2 = aVar.findViewById(C0966R.C0970id.dyo);
        C87412m.m108593f(findViewById2, "it.findViewById(R.id.finder_live_shade_view)");
        return new C60291e((ViewGroup) findViewById, aVar, (FinderLiveShadeView) findViewById2, (ViewGroup) this.f169339d.findViewById(C0966R.C0970id.n9_));
    }
}
