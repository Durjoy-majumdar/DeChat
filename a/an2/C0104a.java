package an2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: an2.a */
public final class C0104a extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0104a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.bwl).view(C0966R.C0970id.i_l).descFormat(C0966R.string.hq8).valueByView(C0966R.C0970id.hfo).valueByKey("sex_key").valueByView(C0966R.C0970id.c7l).valueByView(C0966R.C0970id.jax).valueByView(C0966R.C0970id.f359155jb0).valueByView(C0966R.C0970id.i_y);
    }
}
