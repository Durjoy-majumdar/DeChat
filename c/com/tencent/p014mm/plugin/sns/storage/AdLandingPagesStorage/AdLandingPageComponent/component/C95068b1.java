package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.animation.Animation;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95296z0;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b1 */
public class C95068b1 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ImageView f275948a;

    /* renamed from: b */
    public final /* synthetic */ C95296z0.C95298b f275949b;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b1$a */
    public class C95069a implements Runnable {
        public C95069a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$2$1");
            C95068b1 b1Var = C95068b1.this;
            C95296z0.C95298b.m121397b(b1Var.f275949b, b1Var.f275948a);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$2$1");
        }
    }

    public C95068b1(C95296z0.C95298b bVar, ImageView imageView) {
        this.f275949b = bVar;
        this.f275948a = imageView;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$2");
        this.f275948a.setAlpha(0.8f);
        new MMHandler().postDelayed(new C95069a(), 200);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$2");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$2");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$2");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$2");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$2");
    }
}
