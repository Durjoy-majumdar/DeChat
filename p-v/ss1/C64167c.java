package ss1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderNotifyFragment;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import ls1.C10648k;
import ls1.C61385b;
import ls1.C61386e;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: ss1.c */
public final class C64167c extends C61386e {
    public C64167c() {
        FinderNotifyFragment finderNotifyFragment = new FinderNotifyFragment();
        finderNotifyFragment.f17334o = 0;
        C13598b0 b0Var = C13598b0.f38549a;
        FinderNotifyFragment finderNotifyFragment2 = new FinderNotifyFragment();
        finderNotifyFragment2.f17334o = 1;
        FinderNotifyFragment finderNotifyFragment3 = new FinderNotifyFragment();
        finderNotifyFragment3.f17334o = 2;
        setFragments(C64197v.m75534c(finderNotifyFragment, finderNotifyFragment2, finderNotifyFragment3));
        setTabContainer(new C64166b());
        C87412m.m108593f(MMApplicationContext.getContext().getString(C0966R.string.f360726j30), "getContext().getString(R…nder_notify_tab_like_new)");
        setTabs(C64197v.m75534c(new C13778a(C0966R.string.efh), new C13778a(C0966R.string.eff), new C13778a(C0966R.string.efg)));
        setTabViewAction(new C10648k());
        this.f174594a = new C61385b(1);
    }
}
