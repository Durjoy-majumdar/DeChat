package rs1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.C4105m5;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: rs1.ua */
public final class C13480ua extends UIComponent {

    /* renamed from: d */
    public C4105m5<BaseFinderFeed> f38200d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13480ua(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13480ua(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
