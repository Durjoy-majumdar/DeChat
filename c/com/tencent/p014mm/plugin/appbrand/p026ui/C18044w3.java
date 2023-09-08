package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.w3 */
public final class C18044w3 implements C17978c.C17984f {

    /* renamed from: a */
    public final /* synthetic */ AppBrandVideoPreviewUI f49861a;

    /* renamed from: b */
    public final /* synthetic */ View f49862b;

    public C18044w3(AppBrandVideoPreviewUI appBrandVideoPreviewUI, View view) {
        this.f49861a = appBrandVideoPreviewUI;
        this.f49862b = view;
    }

    /* renamed from: a */
    public final void mo22281a(boolean z) {
        if (!z) {
            ((ImageView) this.f49861a.findViewById(C0966R.C0970id.f358954i21)).setVisibility(8);
            ((ImageView) this.f49861a.findViewById(C0966R.C0970id.i2a)).setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.f49862b.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = this.f49861a.f49826u;
            return;
        }
        ((ImageView) this.f49861a.findViewById(C0966R.C0970id.f358954i21)).setVisibility(0);
        ((ImageView) this.f49861a.findViewById(C0966R.C0970id.i2a)).setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = this.f49862b.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams2).bottomMargin = this.f49861a.f49827v;
    }
}
