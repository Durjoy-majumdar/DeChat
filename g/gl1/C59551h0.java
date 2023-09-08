package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import vk1.C65761b;

/* renamed from: gl1.h0 */
public final class C59551h0 extends C87413o implements C32224a<FinderLiveAnchorExceptionPlugin> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170187d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59551h0(C65761b bVar) {
        super(0);
        this.f170187d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170187d.findViewById(C0966R.C0970id.dkg);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_exception)");
        return new FinderLiveAnchorExceptionPlugin((ViewGroup) findViewById, this.f170187d);
    }
}
