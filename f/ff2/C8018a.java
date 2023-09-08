package ff2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: ff2.a */
public final class C8018a extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8018a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.bdb).view(C0966R.C0970id.j69).expand(40, 5, 40, 0);
        root(C0966R.C0971layout.bda).view(C0966R.C0970id.gv6).descFormat(C0966R.string.jup).valueByView(16908310).valueByView(C0966R.C0970id.kiq).valueByView(16908304).disableChildren();
        root(C0966R.C0971layout.bek).view(16908310).type(ViewType.Button).descFormat(C0966R.string.aq4).valueByKey("title_key");
    }
}
