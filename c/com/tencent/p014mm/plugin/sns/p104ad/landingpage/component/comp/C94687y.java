package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y */
public final class C94687y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94680v f274010d;

    public C94687y(C94680v vVar) {
        this.f274010d = vVar;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showReqCardAnim$1");
        C94680v vVar = this.f274010d;
        SnsMethodCalculate.markStartTimeMs("access$startReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        vVar.getClass();
        SnsMethodCalculate.markStartTimeMs("startReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        Log.m105924i("AdLandingHalfEggCardComponent", "startReqCardAnim");
        ImageView imageView = vVar.f273981B;
        if (imageView != null) {
            imageView.setVisibility(0);
            ImageView imageView2 = vVar.f273981B;
            if (imageView2 != null) {
                imageView2.setAlpha(1.0f);
                float f = vVar.f276579d.getResources().getDisplayMetrics().density * ((float) -4000);
                ImageView imageView3 = vVar.f273981B;
                if (imageView3 != null) {
                    imageView3.setCameraDistance(f);
                    ImageView imageView4 = vVar.f273981B;
                    if (imageView4 != null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView4, "translationY", new float[]{((float) vVar.f276586n.getLayoutParams().height) / 2.0f, 0.0f});
                        ofFloat.setInterpolator(vVar.mo130272J());
                        ofFloat.setDuration(1000);
                        ImageView imageView5 = vVar.f273981B;
                        if (imageView5 != null) {
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView5, "rotationY", new float[]{720.0f, 0.0f});
                            ofFloat2.setInterpolator(vVar.mo130272J());
                            ofFloat2.setDuration(1500);
                            ImageView imageView6 = vVar.f273981B;
                            if (imageView6 != null) {
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView6, "alpha", new float[]{1.0f, 0.0f});
                                ofFloat3.setInterpolator(vVar.mo130272J());
                                ofFloat3.setDuration(500);
                                ofFloat3.setStartDelay(1500 - ofFloat3.getDuration());
                                ofFloat3.addListener(new C94688z(vVar));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
                                animatorSet.start();
                                ImageView imageView7 = vVar.f273997u;
                                if (imageView7 != null) {
                                    imageView7.setVisibility(0);
                                    ImageView imageView8 = vVar.f273997u;
                                    if (imageView8 != null) {
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView8, "alpha", new float[]{0.0f, 1.0f});
                                        ofFloat4.setInterpolator(vVar.mo130272J());
                                        ofFloat4.setDuration(250);
                                        ofFloat4.start();
                                        SnsMethodCalculate.markEndTimeMs("startReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                                        SnsMethodCalculate.markEndTimeMs("access$startReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showReqCardAnim$1");
                                        return;
                                    }
                                    C87412m.m108603p("mBgView");
                                    throw null;
                                }
                                C87412m.m108603p("mBgView");
                                throw null;
                            }
                            C87412m.m108603p("mAnimView");
                            throw null;
                        }
                        C87412m.m108603p("mAnimView");
                        throw null;
                    }
                    C87412m.m108603p("mAnimView");
                    throw null;
                }
                C87412m.m108603p("mAnimView");
                throw null;
            }
            C87412m.m108603p("mAnimView");
            throw null;
        }
        C87412m.m108603p("mAnimView");
        throw null;
    }
}
