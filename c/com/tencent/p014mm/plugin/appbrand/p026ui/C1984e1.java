package com.tencent.p014mm.plugin.appbrand.p026ui;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.e1 */
public final class C1984e1 extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1984e1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f6445f2);
        root.view(C0966R.C0970id.i58).disable();
        ViewSetter view = root.view(C0966R.C0970id.gzo);
        ViewType viewType = ViewType.Button;
        view.type(viewType).desc((int) C0966R.string.a8b);
        root.view(C0966R.C0970id.i4l).type(viewType).desc((int) C0966R.string.a8c);
        root.view(C0966R.C0970id.i7g).type(viewType).desc((int) C0966R.string.a8d);
        root(C0966R.C0971layout.f6444f1).view(C0966R.C0970id.i6t).type(viewType);
        root(C0966R.C0971layout.f6441ey).view(C0966R.C0970id.i6q).type(viewType).descFormat(C0966R.string.a8f).valueByView(C0966R.C0970id.i6p);
    }
}
