package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.c */
public class C95276c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ContentFragment f276531d;

    public C95276c(ContentFragment contentFragment) {
        this.f276531d = contentFragment;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$5");
        Log.m105918d("ContentFragment", "onAnimationEnd show nextBtn");
        ContentFragment.m121305M(this.f276531d).f276526f = false;
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$5");
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$5");
        Log.m105918d("ContentFragment", "onAnimationStart show nextBtn");
        ContentFragment.m121305M(this.f276531d).f276526f = true;
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$5");
    }
}
