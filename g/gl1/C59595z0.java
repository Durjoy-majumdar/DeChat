package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveShadeView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ii1.C60291e;
import vk1.C65761b;

/* renamed from: gl1.z0 */
public final class C59595z0 extends C87413o implements C32224a<C60291e> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170306d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59595z0(C65761b bVar) {
        super(0);
        this.f170306d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170306d.findViewById(C0966R.C0970id.n98);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…r_live_mic_cover_ui_root)");
        C65761b bVar = this.f170306d;
        View findViewById2 = bVar.findViewById(C0966R.C0970id.dyo);
        C87412m.m108593f(findViewById2, "it.findViewById(R.id.finder_live_shade_view)");
        return new C60291e((ViewGroup) findViewById, bVar, (FinderLiveShadeView) findViewById2, (ViewGroup) this.f170306d.findViewById(C0966R.C0970id.n9_));
    }
}
