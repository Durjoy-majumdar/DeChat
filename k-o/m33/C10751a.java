package m33;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: m33.a */
public final class C10751a extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10751a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.b5j);
        root.view(C0966R.C0970id.ld6).disable();
        root.view(C0966R.C0970id.lct).disable();
        root.view(C0966R.C0970id.ld_).descFormat(C0966R.string.f361520kh1).valueByView(C0966R.C0970id.ld8).valueByView(C0966R.C0970id.lcr);
        focusFirst(C0966R.C0970id.ld_);
    }
}
