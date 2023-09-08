package com.tencent.p014mm.plugin.sns.p104ad.widget.twistad;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lo2.C99557n0;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.d */
public class C94797d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TwistRoateCardsView f274612d;

    public C94797d(TwistRoateCardsView twistRoateCardsView) {
        this.f274612d = twistRoateCardsView;
    }

    public void run() {
        View view;
        String str;
        String str2;
        String str3;
        String str4;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$5");
        if (TwistRoateCardsView.m120116a(this.f274612d) != null) {
            AdLandingPageEggCardHelper.C94709f fVar = (AdLandingPageEggCardHelper.C94709f) TwistRoateCardsView.m120116a(this.f274612d);
            fVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7");
            AdLandingPageEggCardHelper adLandingPageEggCardHelper = AdLandingPageEggCardHelper.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            boolean z = adLandingPageEggCardHelper.f274112w;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (!z && !fVar.f274127a) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(AdLandingPageEggCardHelper.m119892b(AdLandingPageEggCardHelper.this), "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(500);
                ofFloat.start();
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(AdLandingPageEggCardHelper.m119894d(AdLandingPageEggCardHelper.this), "alpha", new float[]{AdLandingPageEggCardHelper.m119894d(AdLandingPageEggCardHelper.this).getAlpha(), 0.0f});
                ofFloat2.setDuration(300);
                ofFloat2.start();
            }
            if (!fVar.f274127a) {
                if (!AdLandingPageEggCardHelper.m119895e(AdLandingPageEggCardHelper.this)) {
                    View g = AdLandingPageEggCardHelper.m119897g(AdLandingPageEggCardHelper.this);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = g;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$7", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    g.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$7", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(AdLandingPageEggCardHelper.m119897g(AdLandingPageEggCardHelper.this), "alpha", new float[]{0.0f, 1.0f});
                ofFloat3.setDuration(500);
                ofFloat3.start();
            }
            View i = AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo131609i();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = i;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$7", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$7", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7");
        }
        TwistRoateCardsView twistRoateCardsView = this.f274612d;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        twistRoateCardsView.getClass();
        SnsMethodCalculate.markStartTimeMs("doOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        for (int i2 = 0; i2 < 12; i2++) {
            View childAt = twistRoateCardsView.getChildAt(i2);
            if (i2 != twistRoateCardsView.f274600s) {
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(childAt, "alpha", new float[]{1.0f, 0.0f});
                ofFloat4.setDuration(500);
                ofFloat4.start();
            }
        }
        SnsMethodCalculate.markEndTimeMs("doOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        TwistRoateCardsView twistRoateCardsView2 = this.f274612d;
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        twistRoateCardsView2.getClass();
        SnsMethodCalculate.markStartTimeMs("doMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        int i3 = 0;
        while (true) {
            if (i3 >= 12) {
                view = null;
                break;
            } else if (i3 == twistRoateCardsView2.f274600s) {
                view = twistRoateCardsView2.getChildAt(i3);
                break;
            } else {
                i3++;
            }
        }
        if (view == null || twistRoateCardsView2.f274598q == null) {
            str3 = "run";
            str2 = "access$900";
            str = "doMainCardAnim";
            str4 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView";
        } else {
            View childAt2 = ((ViewGroup) view).getChildAt(0);
            View view4 = twistRoateCardsView2.f274598q;
            SnsMethodCalculate.markStartTimeMs("getMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            childAt2.getGlobalVisibleRect(rect);
            view4.getGlobalVisibleRect(rect2);
            int i4 = rect.bottom;
            int i5 = i4 - rect.top;
            int i6 = i4 + ((((int) (((float) i5) / 0.75f)) - i5) / 2);
            float b = (float) C76577a.m92151b(twistRoateCardsView2.f274588d, 40);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((Object) null, "translationY", new float[]{0.0f, b});
            ofFloat5.setDuration(200);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat((Object) null, "translationY", new float[]{b, (float) (rect2.bottom - i6)});
            ofFloat6.setDuration(300);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat((Object) null, "scaleX", new float[]{1.0f, 0.93333334f});
            ofFloat7.setDuration(200);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat((Object) null, "scaleY", new float[]{1.0f, 0.93333334f});
            str3 = "run";
            ofFloat8.setDuration(200);
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat((Object) null, "scaleX", new float[]{0.93333334f, 1.3333334f});
            str2 = "access$900";
            str = "doMainCardAnim";
            ofFloat9.setDuration(300);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat((Object) null, "scaleY", new float[]{0.93333334f, 1.3333334f});
            ofFloat10.setDuration(300);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat6).after(ofFloat5);
            animatorSet.play(ofFloat7).with(ofFloat8);
            animatorSet.play(ofFloat9).with(ofFloat10);
            animatorSet.play(ofFloat9).after(ofFloat7);
            animatorSet.play(ofFloat5).with(ofFloat7);
            str4 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView";
            SnsMethodCalculate.markEndTimeMs("getMainCardAnim", str4);
            animatorSet.addListener(new C94798e(twistRoateCardsView2));
            animatorSet.setTarget(view);
            animatorSet.start();
            View view5 = twistRoateCardsView2.f274598q;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c((Object) null);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/twistad/TwistRoateCardsView", "doMainCardAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ad/widget/twistad/TwistRoateCardsView", "doMainCardAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = twistRoateCardsView2.f274598q;
            SnsMethodCalculate.markStartTimeMs("getTargetAnimView", str4);
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            childAt2.getGlobalVisibleRect(rect3);
            view7.getGlobalVisibleRect(rect4);
            int i7 = rect4.bottom;
            int i8 = i7 - rect4.top;
            int i9 = rect3.bottom - (i7 - ((i8 - ((int) (((float) i8) * 0.75f))) / 2));
            float b2 = (float) (C76577a.m92151b(twistRoateCardsView2.f274588d, 40) + i9);
            String str5 = "translationY";
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat((Object) null, str5, new float[]{(float) i9, b2});
            ofFloat11.setDuration(200);
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat((Object) null, str5, new float[]{b2, 0.0f});
            ofFloat12.setDuration(300);
            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat((Object) null, "scaleX", new float[]{0.75f, 0.7f});
            ofFloat13.setDuration(200);
            ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat((Object) null, "scaleY", new float[]{0.75f, 0.7f});
            ofFloat14.setDuration(200);
            ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat((Object) null, "scaleX", new float[]{0.7f, 1.0f});
            ofFloat15.setDuration(300);
            ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat((Object) null, "scaleY", new float[]{0.7f, 1.0f});
            ofFloat16.setDuration(300);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofFloat12).after(ofFloat11);
            animatorSet2.play(ofFloat13).with(ofFloat14);
            animatorSet2.play(ofFloat15).with(ofFloat16);
            animatorSet2.play(ofFloat15).after(ofFloat13);
            animatorSet2.play(ofFloat11).with(ofFloat13);
            SnsMethodCalculate.markEndTimeMs("getTargetAnimView", str4);
            animatorSet2.setTarget(twistRoateCardsView2.f274598q);
            animatorSet2.start();
            new C99557n0(twistRoateCardsView2.f274598q, view, twistRoateCardsView2.f274588d, twistRoateCardsView2.f274599r, 500, -3000).mo138936a();
        }
        SnsMethodCalculate.markEndTimeMs(str, str4);
        SnsMethodCalculate.markEndTimeMs(str2, str4);
        SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$5");
    }
}
