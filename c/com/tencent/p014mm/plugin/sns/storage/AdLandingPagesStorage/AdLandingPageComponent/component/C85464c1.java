package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import qs2.C89837n0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c1 */
public class C85464c1 extends C95295z {

    /* renamed from: s */
    public FrameLayout f249081s;

    /* renamed from: t */
    public MMWebView f249082t;

    public C85464c1(Context context, C89837n0 n0Var, ViewGroup viewGroup) {
        super(context, n0Var, viewGroup);
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        this.f249081s = (FrameLayout) this.f276586n;
        MMWebView a = MMWebView.C45103b.m49948a(this.f276579d);
        this.f249082t = a;
        this.f249081s.addView(a);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
    }

    /* renamed from: f */
    public View mo67239f() {
        SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        FrameLayout frameLayout = new FrameLayout(this.f276579d);
        SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        return frameLayout;
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        this.f249082t.setVerticalScrollBarEnabled(false);
        this.f249082t.setHorizontalScrollBarEnabled(false);
        this.f249082t.getSettings().setJavaScriptEnabled(true);
        MMWebView mMWebView = this.f249082t;
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        mMWebView.loadUrl(((C89837n0) this.f276580e).f258250z);
        this.f249082t.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f249082t.setVisibility(0);
        FrameLayout frameLayout = this.f249081s;
        int paddingLeft = frameLayout.getPaddingLeft();
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        int paddingRight = this.f249081s.getPaddingRight();
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        frameLayout.setPadding(paddingLeft, (int) ((C89837n0) this.f276580e).f296497c, paddingRight, (int) ((C89837n0) this.f276580e).f296498d);
        this.f249081s.setLayoutParams(new LinearLayout.LayoutParams(this.f276588p, this.f276589q));
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        return Integer.MAX_VALUE;
    }
}
