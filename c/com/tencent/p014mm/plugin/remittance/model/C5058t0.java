package com.tencent.p014mm.plugin.remittance.model;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.remittance.model.t0 */
public final class C5058t0 extends MMBaseAccessibilityConfig {

    /* renamed from: com.tencent.mm.plugin.remittance.model.t0$a */
    public static final class C5059a extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C5059a f20412d = new C5059a();

        public C5059a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            TextView textView = view instanceof TextView ? (TextView) view : null;
            boolean z = false;
            if (textView != null && textView.getVisibility() == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5058t0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.brs);
        root.disable(C0966R.C0970id.iwq);
        root.disable(C0966R.C0970id.f357558ah2);
        root.disable(C0966R.C0970id.ing);
        root.disable(C0966R.C0970id.f359067im3);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.cga);
        root2.view(C0966R.C0970id.lg_).type(ViewType.TextView).descFormat(C0966R.string.l9y).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_).valueByString(C0966R.string.i1p);
        root2.disable(C0966R.C0970id.ljn);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0971layout.ch_);
        ViewSetter view = root3.view(C0966R.C0970id.ffp);
        ViewType viewType = ViewType.Button;
        view.type(viewType);
        root3.view(C0966R.C0970id.ffq).type(viewType).descFormat(C0966R.string.l9v).valueByKey("keyboard_title_key");
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0971layout.brt);
        root4.view(C0966R.C0970id.inl).descFormat(C0966R.string.i0j).valueByKey("desc_length_key").valueByKey("desc_max_length_key");
        root4.view(C0966R.C0970id.inl).talkOn(C5059a.f20412d);
        root4.view(C0966R.C0970id.inj).type(viewType).desc((int) C0966R.string.i0i);
        MMBaseAccessibilityConfig.ConfigHelper root5 = root(C0966R.C0971layout.brr);
        root5.view(C0966R.C0970id.f358383et1).type(viewType).desc((int) C0966R.string.bfj);
        root5.focusFirst(C0966R.C0970id.et6);
        MMBaseAccessibilityConfig.ConfigHelper root6 = root(C0966R.C0971layout.brj);
        root6.view(C0966R.C0970id.f359072io0).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.imp).valueByView(C0966R.C0970id.imi);
        root6.view(C0966R.C0970id.hfe).descFormat(C0966R.string.l9y).valueByView(C0966R.C0970id.ine).valueByView(C0966R.C0970id.inf).valueByView(C0966R.C0970id.hfe);
        root6.disable(C0966R.C0970id.iwq);
        root6.disable(C0966R.C0970id.imp);
        root6.disable(C0966R.C0970id.imi);
        root6.disable(C0966R.C0970id.ine);
        root6.disable(C0966R.C0970id.inf);
        root6.focusFirst(C0966R.C0970id.f359072io0);
        MMBaseAccessibilityConfig.ConfigHelper root7 = root(C0966R.C0971layout.bri);
        root7.view(C0966R.C0970id.imc).descFormat(C0966R.string.f8204u3).valueByView(C0966R.C0970id.imh).valueByView(C0966R.C0970id.imc);
        root7.disable(C0966R.C0970id.imh);
        MMBaseAccessibilityConfig.ConfigHelper root8 = root(C0966R.C0971layout.brh);
        root8.disable(C0966R.C0970id.ils);
        root8.disable(C0966R.C0970id.ilz);
        root8.disable(C0966R.C0970id.f359075io3);
        root8.disable(C0966R.C0970id.io4);
        root8.disable(C0966R.C0970id.io5);
        root8.disable(C0966R.C0970id.iwq);
        root8.disable(C0966R.C0970id.ilx);
        root8.disable(C0966R.C0970id.ilw);
        root8.disable(C0966R.C0970id.iln);
        root8.focusFirst(C0966R.C0970id.lg_);
        root8.view(C0966R.C0970id.f359074io2).type(viewType).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.io5);
        root8.view(C0966R.C0970id.ilo).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.iln).valueByView(C0966R.C0970id.ilo);
        root8.view(C0966R.C0970id.d37).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.d35).valueByView(C0966R.C0970id.d36);
    }
}
