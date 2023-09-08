package com.tencent.p014mm.plugin.wallet_core.utils;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.a */
public final class C5809a extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5809a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        ViewSetter view = root(C0966R.C0971layout.cdz).view(C0966R.C0970id.lgn);
        ViewType viewType = ViewType.Button;
        view.type(viewType).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.lgo);
        root(C0966R.C0971layout.f6563ie).disable(C0966R.C0970id.fph);
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f6562id);
        root.view(C0966R.C0970id.brg).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.akq);
        root.disable(C0966R.C0970id.akq);
        root.disable(C0966R.C0970id.akp);
        root(C0966R.C0971layout.f6303b5).view(C0966R.C0970id.gsl).type(viewType).desc((int) C0966R.string.kn_);
    }
}
