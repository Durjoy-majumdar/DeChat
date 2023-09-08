package com.tencent.p014mm.p136ui;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.ui.n3 */
public final class C57842n3 extends MMBaseAccessibilityConfig {

    /* renamed from: com.tencent.mm.ui.n3$a */
    public static final class C57843a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C57843a f165472d = new C57843a();

        public C57843a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) view;
            String string = mMSwitchBtn.getContext().getResources().getString(C0966R.string.md7);
            C87412m.m108593f(string, "it.context.resources.get…tings_accessibility_open)");
            String string2 = mMSwitchBtn.getContext().getResources().getString(C0966R.string.md6);
            C87412m.m108593f(string2, "it.context.resources.get…ings_accessibility_close)");
            return mMSwitchBtn.f220433y ? string : string2;
        }
    }

    /* renamed from: com.tencent.mm.ui.n3$b */
    public static final class C57844b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C57844b f165473d = new C57844b();

        public C57844b() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) view;
            String string = mMSwitchBtn.getContext().getResources().getString(C0966R.string.md7);
            C87412m.m108593f(string, "it.context.resources.get…tings_accessibility_open)");
            String string2 = mMSwitchBtn.getContext().getResources().getString(C0966R.string.md6);
            C87412m.m108593f(string2, "it.context.resources.get…ings_accessibility_close)");
            return mMSwitchBtn.f220433y ? string : string2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57842n3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.bwr).view(C0966R.C0970id.bab).desc((C32226l<? super View, String>) C57843a.f165472d);
        root(C0966R.C0971layout.bwr).view(C0966R.C0970id.la5).desc((C32226l<? super View, String>) C57844b.f165473d);
    }
}
