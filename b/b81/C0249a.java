package b81;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: b81.a */
public final class C0249a extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0249a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f359661a50);
        root.view(C0966R.C0970id.cmk).descFormat(C0966R.string.cf7).valueByView(C0966R.C0970id.cml).valueByView(C0966R.C0970id.cmp).valueByView(C0966R.C0970id.clm);
        root.view(C0966R.C0970id.f357946cm3).disable();
        root.view(C0966R.C0970id.cmo).desc((int) C0966R.string.a_r);
        root.view(C0966R.C0970id.cmq).disable();
        root.view(C0966R.C0970id.cmb).descFormat(C0966R.string.f360391ce1).valueByView(C0966R.C0970id.cma);
    }
}
