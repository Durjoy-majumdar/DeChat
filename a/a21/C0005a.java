package a21;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: a21.a */
public class C0005a extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0005a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.bbp).disable(C0966R.C0970id.f358753gv2);
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f7019v4);
        root.disable(C0966R.C0970id.iwq);
        root.disable(C0966R.C0970id.f357730bh2);
        root.disable(C0966R.C0970id.f5282au);
        ViewSetter view = root.view(C0966R.C0970id.bh8);
        ViewType viewType = ViewType.Button;
        view.type(viewType);
        root.view(C0966R.C0970id.bh9).type(viewType);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.cga);
        root2.view(C0966R.C0970id.lg_).type(ViewType.TextView).descFormat(C0966R.string.bhk).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_).valueByString(C0966R.string.bg_);
        root2.disable(C0966R.C0970id.ljn);
    }
}
