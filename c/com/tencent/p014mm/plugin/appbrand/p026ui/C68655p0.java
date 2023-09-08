package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.p0 */
public class C68655p0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandLauncherUI f197208d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.p0$a */
    public class C68656a implements C76879j.C47267l {

        /* renamed from: a */
        public final /* synthetic */ AppBrandLauncherUI f197209a;

        public C68656a(C68655p0 p0Var, AppBrandLauncherUI appBrandLauncherUI) {
            this.f197209a = appBrandLauncherUI;
        }

        public boolean onFinish(CharSequence charSequence) {
            String str;
            String str2;
            if (TextUtils.isEmpty(charSequence)) {
                return false;
            }
            String charSequence2 = charSequence.toString();
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            if (Util.nullAsNil(charSequence2).endsWith("@app")) {
                str2 = charSequence2;
                str = null;
            } else {
                str = charSequence2;
                str2 = null;
            }
            appBrandStatObject.f245533f = 1001;
            ((C83285a) C83428o.f243800a).mo115583c(this.f197209a, str2, str, (String) null, 0, 0, appBrandStatObject, (AppBrandLaunchReferrer) null, (LaunchParamsOptional) null);
            return true;
        }
    }

    public C68655p0(AppBrandLauncherUI appBrandLauncherUI) {
        this.f197208d = appBrandLauncherUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (WeChatEnvironment.hasDebugger()) {
            AppBrandLauncherUI appBrandLauncherUI = this.f197208d;
            C76879j.m92720N(appBrandLauncherUI, appBrandLauncherUI.getResources().getString(C0966R.string.f360107a53), "", "", Integer.MAX_VALUE, new C68656a(this, appBrandLauncherUI));
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
