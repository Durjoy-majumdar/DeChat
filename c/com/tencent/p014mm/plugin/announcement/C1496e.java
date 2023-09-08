package com.tencent.p014mm.plugin.announcement;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.announcement.e */
public final class C1496e extends MMBaseAccessibilityConfig {

    /* renamed from: com.tencent.mm.plugin.announcement.e$a */
    public static final class C1497a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C1497a f10849d = new C1497a();

        public C1497a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return "" + ((TextView) view.findViewById(C0966R.C0970id.hjg)).getText() + ((TextView) view.findViewById(C0966R.C0970id.hjh)).getText();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1496e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        view(C0966R.C0970id.euz, C0966R.C0970id.euz).desc((C32226l<? super View, String>) C1497a.f10849d).disableChildren();
    }
}
