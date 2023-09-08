package com.tencent.p014mm.plugin.wallet_core.utils;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.l */
public final class C5810l extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5810l(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.chh);
        root.disable(C0966R.C0970id.ltm);
        ViewSetter view = root.view(C0966R.C0970id.ltl);
        ViewType viewType = ViewType.Button;
        view.type(viewType).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.ltm);
        root.focusFirst(C0966R.C0970id.ltn);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.chg);
        root2.disable(C0966R.C0970id.f359568ll0);
        root2.disable(C0966R.C0970id.lky);
        root2.disable(C0966R.C0970id.lkz);
        root2.disable(C0966R.C0970id.lt9);
        root2.disable(C0966R.C0970id.lt6);
        root2.disable(C0966R.C0970id.lt8);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0970id.ltc);
        root3.view(C0966R.C0970id.ltc).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_);
        root3.disable(C0966R.C0970id.ljn);
        root3.disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0970id.lt_);
        root4.view(C0966R.C0970id.lt_).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_);
        root4.disable(C0966R.C0970id.ljn);
        root4.disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root5 = root(C0966R.C0970id.lt7);
        root5.view(C0966R.C0970id.lt7).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_);
        root5.disable(C0966R.C0970id.ljn);
        root5.disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root6 = root(C0966R.C0970id.lt5);
        root6.view(C0966R.C0970id.lt5).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_);
        root6.disable(C0966R.C0970id.ljn);
        root6.disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root7 = root(C0966R.C0970id.lt4);
        root7.view(C0966R.C0970id.lt4).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_);
        root7.disable(C0966R.C0970id.ljn);
        root7.disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root8 = root(C0966R.C0970id.f359608lt3);
        root8.view(C0966R.C0970id.f359608lt3).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_);
        root8.disable(C0966R.C0970id.ljn);
        root8.disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root9 = root(C0966R.C0970id.f359607lt2);
        root9.view(C0966R.C0970id.f359607lt2).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_);
        root9.disable(C0966R.C0970id.ljn);
        root9.disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root10 = root(C0966R.C0970id.ltb);
        root10.view(C0966R.C0970id.ltb).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_);
        root10.disable(C0966R.C0970id.ljn);
        root10.disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root11 = root(C0966R.C0970id.f359606lt1);
        root11.view(C0966R.C0970id.f359606lt1).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_);
        root11.disable(C0966R.C0970id.ljn);
        root11.disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root12 = root(C0966R.C0971layout.chc);
        root12.focusFirst(C0966R.C0970id.lsq);
        root12.disable(C0966R.C0970id.lsp);
        root12.disable(C0966R.C0970id.lsn);
        MMBaseAccessibilityConfig.ConfigHelper root13 = root(C0966R.C0970id.lsr);
        root13.view(C0966R.C0970id.lsr).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_);
        root13.disable(C0966R.C0970id.ljn);
        root13.disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root14 = root(C0966R.C0971layout.chf);
        root14.focusFirst(C0966R.C0970id.f359569ll1);
        root14.disable(C0966R.C0970id.lkx);
        root14.disable(C0966R.C0970id.f359570ll2);
        root14.disable(C0966R.C0970id.f359605lt0);
        root(C0966R.C0970id.lsy).disable(C0966R.C0970id.ljn);
        root(C0966R.C0971layout.cgh).focusFirst(C0966R.C0970id.lja);
    }
}
