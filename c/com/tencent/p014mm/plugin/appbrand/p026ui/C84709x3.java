package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.x3 */
public final class C84709x3 implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ AppBrandVideoPreviewUI f247099a;

    public C84709x3(AppBrandVideoPreviewUI appBrandVideoPreviewUI) {
        this.f247099a = appBrandVideoPreviewUI;
    }

    public final void onSystemUiVisibilityChange(int i) {
        if ((i & 4) == 0) {
            View decorView = this.f247099a.getWindow().getDecorView();
            this.f247099a.getClass();
            decorView.setSystemUiVisibility(1280);
        }
    }
}
