package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.Log;
import qs2.C101255a0;
import so2.C90270r;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r0 */
public class C85459r0 extends C95295z {

    /* renamed from: s */
    public C90270r f249065s;

    /* renamed from: t */
    public FrameLayout f249066t;

    public C85459r0(Context context, C90270r rVar, ViewGroup viewGroup) {
        super(context, rVar, viewGroup);
        this.f249065s = rVar;
    }

    /* renamed from: f */
    public View mo67239f() {
        SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        FrameLayout frameLayout = new FrameLayout(this.f276579d);
        this.f249066t = frameLayout;
        SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        return frameLayout;
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        if (this.f249066t == null) {
            Log.m105920e("MicroMsg.Sns.AdLandingSeparatorComponent", "fillItem but layout is null");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
            return;
        }
        if (this.f249065s == null) {
            Log.m105920e("MicroMsg.Sns.AdLandingSeparatorComponent", "fillItem but info is null");
        }
        try {
            this.f249066t.setBackgroundColor(Color.parseColor(this.f249065s.f259118z));
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingSeparatorComponent", "fillItem but exp is " + th);
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        if (this.f276586n == null) {
            Log.m105920e("MicroMsg.Sns.AdLandingSeparatorComponent", "setPadding but contentView is null");
        }
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C101255a0 a0Var = this.f276580e;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
        }
        this.f276586n.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
    }
}
