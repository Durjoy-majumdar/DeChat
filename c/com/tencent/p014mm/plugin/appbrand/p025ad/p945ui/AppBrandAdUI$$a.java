package com.tencent.p014mm.plugin.appbrand.p025ad.p945ui;

import ai0.C79553f;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$a */
public final /* synthetic */ class AppBrandAdUI$$a implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAdUI f238408d;

    public /* synthetic */ AppBrandAdUI$$a(AppBrandAdUI appBrandAdUI) {
        this.f238408d = appBrandAdUI;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AppBrandAdUI appBrandAdUI = this.f238408d;
        int i9 = AppBrandAdUI.f238401j;
        appBrandAdUI.getClass();
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        if ((i == i5 && i2 == i6 && i3 == i7 && i4 == i8) ? false : true) {
            int height = appBrandAdUI.f238405h.getContentContainer().getHeight();
            int width = appBrandAdUI.f238405h.getContentContainer().getWidth();
            AppBrandRuntimeWC appBrandRuntimeWC = appBrandAdUI.f238402e;
            if (appBrandRuntimeWC != null) {
                appBrandRuntimeWC.f238295w1.mo113817f(new AppBrandAdUI$$b(appBrandAdUI, width, height));
            }
        }
    }
}
