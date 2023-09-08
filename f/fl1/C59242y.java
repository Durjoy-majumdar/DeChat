package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import vk1.C65760a;

/* renamed from: fl1.y */
public final class C59242y extends C87413o implements C32224a<FinderLiveAnchorExceptionPlugin> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169396d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59242y(C65760a aVar) {
        super(0);
        this.f169396d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169396d.findViewById(C0966R.C0970id.dkg);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_exception)");
        return new FinderLiveAnchorExceptionPlugin((ViewGroup) findViewById, this.f169396d);
    }
}
