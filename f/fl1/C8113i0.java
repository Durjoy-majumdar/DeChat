package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import vk1.C65760a;

/* renamed from: fl1.i0 */
public final class C8113i0 extends C87413o implements C32224a<FinderLiveRandomMatchLinkMicStatePlugin> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26973d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8113i0(C65760a aVar) {
        super(0);
        this.f26973d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26973d.findViewById(C0966R.C0970id.f358226dy1);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…match_link_state_ui_root)");
        return new FinderLiveRandomMatchLinkMicStatePlugin((ViewGroup) findViewById, this.f26973d);
    }
}
