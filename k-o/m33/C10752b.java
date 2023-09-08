package m33;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: m33.b */
public final class C10752b extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10752b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.b5k);
        root.view(C0966R.C0970id.ld6).disable();
        root.view(C0966R.C0970id.lct).disable();
        root.view(C0966R.C0970id.ld7).descFormat(C0966R.string.f361520kh1).valueByView(C0966R.C0970id.ld8).valueByView(C0966R.C0970id.lcr);
        focusFirst(C0966R.C0970id.ld7);
    }
}
