package qj1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C62042e;
import rx3.C13598b0;

/* renamed from: qj1.pi */
public final class C12605pi extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderVisitorRoleChooserPlugin f36137d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12605pi(FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin) {
        super(0);
        this.f36137d = finderVisitorRoleChooserPlugin;
    }

    public Object invoke() {
        C62042e eVar = C62042e.f176370a;
        Context context = this.f36137d.getContext();
        C87412m.m108593f(context, "context");
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e_c);
        C87412m.m108593f(string, "getContext().resources.g…isitor_choose_role_title)");
        eVar.mo87041S1(context, string);
        return C13598b0.f38549a;
    }
}
