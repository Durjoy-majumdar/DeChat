package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bt0.b$$h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.f */
public class C83799f extends b$$h {

    /* renamed from: a */
    public final C83780d1 f244648a;

    /* renamed from: b */
    public boolean f244649b;

    /* renamed from: c */
    public boolean f244650c;

    public C83799f(C83780d1 d1Var) {
        C87412m.m108594g(d1Var, "pageView");
        this.f244648a = d1Var;
    }

    /* renamed from: a */
    public int mo109966a() {
        return C0966R.dimen.f4060q7;
    }

    /* renamed from: c */
    public boolean mo109968c(View view) {
        Log.m105924i("MicroMsg.AppBrandActionBarHomeButtonStyle", "pageView click close button");
        C83780d1 d1Var = this.f244648a;
        if (d1Var.f244554F.f233902u) {
            Log.m105924i("MicroMsg.AppBrandActionBarHomeButtonStyle", "pageView click close button, but nav area is hidden");
            return false;
        }
        C83849m0 Z = d1Var.getRuntime().mo113042Z();
        if (Z == null) {
            return false;
        }
        Z.mo116338c0(new C83958w0(Z, Z.f244737e.mo113008F().mo113983b(), true));
        return false;
    }

    /* renamed from: d */
    public void mo109969d(ImageView imageView, ImageView imageView2, View view, View view2) {
        this.f244650c = true;
        if (this.f244648a.f244554F != null) {
            if (imageView2 != null) {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                int dimensionPixelOffset = imageView2.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f4062q9);
                layoutParams2.height = dimensionPixelOffset;
                layoutParams2.width = dimensionPixelOffset;
                layoutParams2.gravity = 17;
                imageView2.setLayoutParams(layoutParams2);
                layoutParams2.leftMargin = 0;
                layoutParams2.rightMargin = 0;
                imageView2.clearColorFilter();
                Context context = imageView2.getContext();
                Object obj = C111105a.f332697a;
                imageView2.setImageDrawable(C111105a.C111110c.m151511b(context, C0966R.C0969drawable.btv));
                imageView2.setColorFilter(this.f244648a.f244554F.getForegroundColor(), PorterDuff.Mode.SRC_ATOP);
            }
            if (this.f244648a.getRuntime().mo113042Z().getPageCount() != 1) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                C87412m.m108591d(imageView);
                ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.rightMargin = imageView.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3633r);
                imageView.setLayoutParams(marginLayoutParams);
            } else if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (view != null) {
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
                layoutParams5.height = -2;
                layoutParams5.width = -2;
                layoutParams5.gravity = 17;
                layoutParams5.leftMargin = view.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f4060q7);
                layoutParams5.rightMargin = view.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f4061q8);
                view.setLayoutParams(layoutParams5);
            }
        }
    }
}
