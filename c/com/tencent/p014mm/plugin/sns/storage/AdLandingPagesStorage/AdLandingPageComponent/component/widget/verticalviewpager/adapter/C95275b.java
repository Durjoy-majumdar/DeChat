package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b */
public class C95275b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ContentFragment f276530d;

    public C95275b(ContentFragment contentFragment) {
        this.f276530d = contentFragment;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$4");
        ContentFragment.m121305M(this.f276530d).f276524d.setTranslationY((float) ((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) (-C76577a.m92151b(this.f276530d.getContext(), 20))))));
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$4");
    }
}
