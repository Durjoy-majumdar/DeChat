package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import qo3.C101218e0;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C51824we3;

/* renamed from: com.tencent.mm.plugin.finder.view.t3 */
public final class C4179t3 extends FrameLayout {

    /* renamed from: d */
    public CheckBox f18431d;

    /* renamed from: e */
    public ImageView f18432e;

    /* renamed from: f */
    public C101218e0 f18433f;

    /* renamed from: g */
    public C51824we3 f18434g;

    /* renamed from: h */
    public boolean f18435h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4179t3(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(context, C0966R.C0971layout.f359773an0, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.e_q);
        C87412m.m108593f(findViewById, "root.findViewById<FrameL…d.fl_poi_panel_close_img)");
        ((FrameLayout) findViewById).setOnClickListener(new C4146p3(this));
        View findViewById2 = inflate.findViewById(C0966R.C0970id.fd9);
        C87412m.m108593f(findViewById2, "root.findViewById<ImageView>(R.id.iv_poi_guide)");
        this.f18432e = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.ay_);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.cb_poi_license_checkbox)");
        this.f18431d = (CheckBox) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f358602g14);
        C87412m.m108593f(findViewById4, "findViewById(R.id.ll_check_container)");
        ((LinearLayout) findViewById4).setOnClickListener(new C4154q3(this, context));
        View findViewById5 = inflate.findViewById(C0966R.C0970id.kxh);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.tv_poi_license_content)");
        ((TextView) findViewById5).setOnClickListener(new C4163r3(context));
        boolean z = !LocaleUtil.isChineseAppLang();
        C49712hj1 hj12 = null;
        if (z) {
            ImageView imageView = this.f18432e;
            if (imageView != null) {
                imageView.setImageDrawable(getResources().getDrawable(C0966R.C0969drawable.c2t));
            } else {
                C87412m.m108603p("guideImg");
                throw null;
            }
        } else {
            ImageView imageView2 = this.f18432e;
            if (imageView2 != null) {
                imageView2.setImageDrawable(getResources().getDrawable(C0966R.C0969drawable.c2s));
            } else {
                C87412m.m108603p("guideImg");
                throw null;
            }
        }
        if (C85875k4.m106211z()) {
            if (z) {
                ImageView imageView3 = this.f18432e;
                if (imageView3 != null) {
                    imageView3.setImageDrawable(getResources().getDrawable(C0966R.C0969drawable.c2v));
                } else {
                    C87412m.m108603p("guideImg");
                    throw null;
                }
            } else {
                ImageView imageView4 = this.f18432e;
                if (imageView4 != null) {
                    imageView4.setImageDrawable(getResources().getDrawable(C0966R.C0969drawable.c2u));
                } else {
                    C87412m.m108603p("guideImg");
                    throw null;
                }
            }
        }
        C101218e0 e0Var = new C101218e0(context, 2, 0);
        this.f18433f = e0Var;
        e0Var.mo140676v(1);
        C101218e0 e0Var2 = this.f18433f;
        if (e0Var2 != null) {
            e0Var2.mo140677w(getResources().getString(C0966R.string.e2r));
            C101218e0 e0Var3 = this.f18433f;
            if (e0Var3 != null) {
                e0Var3.mo140678x(getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
                C101218e0 e0Var4 = this.f18433f;
                if (e0Var4 != null) {
                    e0Var4.f296375F = new C4171s3(this, context);
                    e0Var4.mo140663j(this);
                    C101218e0 e0Var5 = this.f18433f;
                    if (e0Var5 != null) {
                        e0Var5.mo140655A();
                        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
                        y0Var.Cx0(0, "poi_channelclaim_page", "", f != null ? f.mo12861q3() : hj12);
                        return;
                    }
                    C87412m.m108603p("bottomDialog");
                    throw null;
                }
                C87412m.m108603p("bottomDialog");
                throw null;
            }
            C87412m.m108603p("bottomDialog");
            throw null;
        }
        C87412m.m108603p("bottomDialog");
        throw null;
    }

    public final void setPoiPrepare(C51824we3 we32) {
        this.f18434g = we32;
    }
}
