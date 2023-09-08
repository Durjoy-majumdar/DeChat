package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.res.Resources;
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

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.e */
public final class C5711e extends MMBaseAccessibilityConfig {

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.e$a */
    public static final class C5712a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C5712a f21727d = new C5712a();

        public C5712a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Resources resources = view.getResources();
            String string = resources != null ? resources.getString(C0966R.string.n5k) : null;
            return string == null ? "" : string;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.e$b */
    public static final class C5713b extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C5713b f21728d = new C5713b();

        public C5713b() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            MMSwitchBtn mMSwitchBtn = view instanceof MMSwitchBtn ? (MMSwitchBtn) view : null;
            return Boolean.valueOf(mMSwitchBtn != null ? mMSwitchBtn.f220433y : false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5711e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.d5v).view(C0966R.C0970id.nxj).desc((C32226l<? super View, String>) C5712a.f21727d).checkOn(C5713b.f21728d);
    }
}
