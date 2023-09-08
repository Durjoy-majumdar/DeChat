package ff2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: ff2.c */
public final class C8020c extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8020c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        ViewSetter descFormat = root(C0966R.C0970id.hhw).view(C0966R.C0970id.hhy).descFormat(C0966R.string.juo);
        ViewType viewType = ViewType.Button;
        descFormat.type(viewType).valueByView(C0966R.C0970id.hhz).valueByKey("not_allow_see_sns_permission_cb_key");
        root(C0966R.C0970id.jrr).view(C0966R.C0970id.hi7).descFormat(C0966R.string.juo).type(viewType).valueByView(C0966R.C0970id.hi8).valueByKey("not_see_sns_permission_tv_key");
        root(C0966R.C0971layout.bmo).view(C0966R.C0970id.hi7).expand(40, 40, 40, 40);
    }
}
