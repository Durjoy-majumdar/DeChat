package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95296z0;
import java.math.BigInteger;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a1 */
public class C95047a1 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ImageView f275846a;

    /* renamed from: b */
    public final /* synthetic */ C95296z0.C95298b f275847b;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a1$a */
    public class C95048a implements Animation.AnimationListener {

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a1$a$a */
        public class C95049a implements Animation.AnimationListener {
            public C95049a() {
            }

            public void onAnimationEnd(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1$1");
                C95047a1.this.f275846a.setAlpha(0.0f);
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1$1");
            }

            public void onAnimationRepeat(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1$1");
            }

            public void onAnimationStart(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1$1");
            }
        }

        public C95048a() {
        }

        public void onAnimationEnd(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1");
            long longValue = new BigInteger((String) C95047a1.this.f275846a.getTag()).longValue();
            if (longValue >= 3) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.8f, 0.0f);
                C95296z0.C95298b bVar = C95047a1.this.f275847b;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                int i = bVar.f276607n;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                alphaAnimation.setDuration((long) i);
                alphaAnimation.setInterpolator(new DecelerateInterpolator(1.2f));
                alphaAnimation.setAnimationListener(new C95049a());
                C95047a1.this.f275846a.startAnimation(alphaAnimation);
            } else {
                C95047a1.this.f275846a.setTag((longValue + 1) + "");
                C95047a1 a1Var = C95047a1.this;
                C95296z0.C95298b.m121397b(a1Var.f275847b, a1Var.f275846a);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1");
        }

        public void onAnimationRepeat(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1");
        }

        public void onAnimationStart(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1$1");
        }
    }

    public C95047a1(C95296z0.C95298b bVar, ImageView imageView) {
        this.f275847b = bVar;
        this.f275846a = imageView;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1");
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(-5.0f, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration((long) C95296z0.C95298b.m121396a(this.f275847b));
        translateAnimation.setInterpolator(new DecelerateInterpolator(1.2f));
        translateAnimation.setStartTime((long) C95296z0.C95298b.m121396a(this.f275847b));
        animationSet.addAnimation(translateAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 0.8f);
        alphaAnimation.setDuration((long) C95296z0.C95298b.m121396a(this.f275847b));
        alphaAnimation.setInterpolator(new DecelerateInterpolator(1.2f));
        alphaAnimation.setStartTime((long) C95296z0.C95298b.m121396a(this.f275847b));
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new C95048a());
        this.f275846a.startAnimation(animationSet);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter$1");
    }
}
