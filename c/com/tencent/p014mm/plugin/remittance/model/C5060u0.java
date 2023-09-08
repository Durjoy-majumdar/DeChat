package com.tencent.p014mm.plugin.remittance.model;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.remittance.model.u0 */
public final class C5060u0 extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5060u0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.brm);
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.cen);
        root.view(C0966R.C0970id.lg_).type(ViewType.TextView).descFormat(C0966R.string.f361604l60).valueByKey("page_title_key").valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_).valueByString(C0966R.string.i1p);
        root.disable(C0966R.C0970id.ljn);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.ch_);
        ViewSetter view = root2.view(C0966R.C0970id.ffp);
        ViewType viewType = ViewType.Button;
        view.type(viewType);
        root2.view(C0966R.C0970id.ffq).type(viewType).descFormat(C0966R.string.l9v).valueByKey("keyboard_title_key");
    }
}
