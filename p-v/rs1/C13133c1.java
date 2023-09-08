package rs1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: rs1.c1 */
public final class C13133c1 extends UIComponent {

    /* renamed from: d */
    public final C55776r f37371d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13133c1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f37371d = new C55776r(appCompatActivity);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13133c1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        FragmentActivity activity = fragment.getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        this.f37371d = new C55776r((MMFragmentActivity) activity);
    }
}
