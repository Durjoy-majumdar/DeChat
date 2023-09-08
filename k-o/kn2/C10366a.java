package kn2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: kn2.a */
public final class C10366a extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10366a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.h77);
        root.view(C0966R.C0970id.h76).desc((int) C0966R.string.j3d);
        root.view(C0966R.C0970id.h7h).desc((int) C0966R.string.j5m);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.hhb);
        root2.view(C0966R.C0970id.hhp).desc((int) C0966R.string.j3d);
        root2.view(C0966R.C0970id.hhq).desc((int) C0966R.string.j5m);
    }
}
