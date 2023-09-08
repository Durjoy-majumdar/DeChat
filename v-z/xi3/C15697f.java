package xi3;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: xi3.f */
public final class C15697f extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15697f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.hv5);
        ViewSetter view = root.view(C0966R.C0970id.hv4);
        ViewType viewType = ViewType.Button;
        view.type(viewType);
        root.view(C0966R.C0970id.c0h).type(viewType).clickAs(C0966R.C0970id.c0g).desc((int) C0966R.string.byd);
        root(C0966R.C0970id.f358921hv2).view(C0966R.C0970id.hv4).type(viewType);
    }
}
