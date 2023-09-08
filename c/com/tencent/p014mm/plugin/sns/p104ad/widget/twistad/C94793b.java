package com.tencent.p014mm.plugin.sns.p104ad.widget.twistad;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94722i;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lo2.C99557n0;
import zq2.C103063b;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.b */
public class C94793b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GLTwistRoateCardsView f274608d;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.b$a */
    public class C94794a implements Runnable {
        public C94794a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$6$1");
            if (GLTwistRoateCardsView.m120098h(C94793b.this.f274608d) != null) {
                C94722i iVar = (C94722i) GLTwistRoateCardsView.m120098h(C94793b.this.f274608d);
                iVar.getClass();
                SnsMethodCalculate.markStartTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
                AdLandingPageEggCardHelper adLandingPageEggCardHelper = iVar.f274143a;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                boolean z = adLandingPageEggCardHelper.f274112w;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                if (!z) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(AdLandingPageEggCardHelper.m119892b(iVar.f274143a), "alpha", new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(500);
                    ofFloat.start();
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(AdLandingPageEggCardHelper.m119894d(iVar.f274143a), "alpha", new float[]{AdLandingPageEggCardHelper.m119894d(iVar.f274143a).getAlpha(), 0.0f});
                    ofFloat2.setDuration(300);
                    ofFloat2.start();
                }
                if (!AdLandingPageEggCardHelper.m119895e(iVar.f274143a)) {
                    View g = AdLandingPageEggCardHelper.m119897g(iVar.f274143a);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = g;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    g.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(AdLandingPageEggCardHelper.m119897g(iVar.f274143a), "alpha", new float[]{0.0f, 1.0f});
                ofFloat3.setDuration(500);
                ofFloat3.start();
                View i = AdLandingPageEggCardHelper.m119899i(iVar.f274143a).mo131609i();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = i;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                SnsMethodCalculate.markEndTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$6$1");
        }
    }

    public C94793b(GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f274608d = gLTwistRoateCardsView;
    }

    public void run() {
        C103063b bVar;
        String str;
        View view;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$6");
        MMHandlerThread.postToMainThread(new C94794a());
        GLTwistRoateCardsView gLTwistRoateCardsView = this.f274608d;
        int i = GLTwistRoateCardsView.f274526L;
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        gLTwistRoateCardsView.getClass();
        SnsMethodCalculate.markStartTimeMs("doOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        for (int i2 = 0; i2 < 12; i2++) {
            C103063b bVar2 = (C103063b) gLTwistRoateCardsView.mo130530e(i2);
            if (i2 != gLTwistRoateCardsView.f274530D) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar2, "alpha", new float[]{1.0f, 0.0f});
                ofFloat.setDuration(500);
                ofFloat.start();
            }
        }
        SnsMethodCalculate.markEndTimeMs("doOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        GLTwistRoateCardsView gLTwistRoateCardsView2 = this.f274608d;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        gLTwistRoateCardsView2.getClass();
        SnsMethodCalculate.markStartTimeMs("doMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        int i3 = 0;
        while (true) {
            if (i3 >= 12) {
                bVar = null;
                break;
            } else if (i3 == gLTwistRoateCardsView2.f274530D) {
                bVar = (C103063b) gLTwistRoateCardsView2.mo130530e(i3);
                break;
            } else {
                i3++;
            }
        }
        if (bVar == null || (view = gLTwistRoateCardsView2.f274528B) == null) {
            str = "run";
        } else {
            SnsMethodCalculate.markStartTimeMs("getMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            bVar.mo142772i(rect);
            int i4 = rect.left;
            int i5 = gLTwistRoateCardsView2.f274545z;
            int i6 = i4 + i5;
            rect.left = i6;
            int i7 = rect.top + i5;
            rect.top = i7;
            rect.right = i6 + gLTwistRoateCardsView2.f274543x;
            rect.bottom = i7 + gLTwistRoateCardsView2.f274544y;
            view.getGlobalVisibleRect(rect2);
            int i8 = rect.bottom;
            int i9 = i8 - rect.top;
            int i15 = rect2.bottom - (i8 + ((((int) (((float) i9) / 0.75f)) - i9) / 2));
            float b = (float) C76577a.m92151b(gLTwistRoateCardsView2.f274538s, 40);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "translationY", new float[]{0.0f, b});
            C103063b bVar3 = bVar;
            ofFloat2.setDuration(200);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object) null, "translationY", new float[]{b, (float) i15});
            ofFloat3.setDuration(300);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object) null, "scaleX", new float[]{1.0f, 0.93333334f});
            String str2 = "scaleX";
            ofFloat4.setDuration(200);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((Object) null, "scaleY", new float[]{1.0f, 0.93333334f});
            str = "run";
            ofFloat5.setDuration(200);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat((Object) null, str2, new float[]{0.93333334f, 1.3333334f});
            ofFloat6.setDuration(300);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat((Object) null, "scaleY", new float[]{0.93333334f, 1.3333334f});
            ofFloat7.setDuration(300);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat3).after(ofFloat2);
            animatorSet.play(ofFloat4).with(ofFloat5);
            animatorSet.play(ofFloat6).with(ofFloat7);
            animatorSet.play(ofFloat6).after(ofFloat4);
            animatorSet.play(ofFloat2).with(ofFloat4);
            SnsMethodCalculate.markEndTimeMs("getMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            animatorSet.addListener(new C94795c(gLTwistRoateCardsView2));
            C103063b bVar4 = bVar3;
            animatorSet.setTarget(bVar4);
            animatorSet.start();
            View view2 = gLTwistRoateCardsView2.f274528B;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/twistad/GLTwistRoateCardsView", "doMainCardAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ad/widget/twistad/GLTwistRoateCardsView", "doMainCardAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = gLTwistRoateCardsView2.f274528B;
            SnsMethodCalculate.markStartTimeMs("getTargetAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            bVar4.mo142772i(rect3);
            view4.getGlobalVisibleRect(rect4);
            int i16 = rect4.bottom;
            int i17 = i16 - rect4.top;
            int i18 = rect3.bottom - (i16 - ((i17 - ((int) (((float) i17) * 0.75f))) / 2));
            float b2 = (float) (C76577a.m92151b(gLTwistRoateCardsView2.f274538s, 40) + i18);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat((Object) null, "translationY", new float[]{(float) i18, b2});
            ofFloat8.setDuration(200);
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat((Object) null, "translationY", new float[]{b2, 0.0f});
            ofFloat9.setDuration(300);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat((Object) null, str2, new float[]{0.75f, 0.7f});
            ofFloat10.setDuration(200);
            String str3 = "scaleY";
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat((Object) null, str3, new float[]{0.75f, 0.7f});
            ofFloat11.setDuration(200);
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat((Object) null, str2, new float[]{0.7f, 1.0f});
            ofFloat12.setDuration(300);
            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat((Object) null, str3, new float[]{0.7f, 1.0f});
            ofFloat13.setDuration(300);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofFloat9).after(ofFloat8);
            animatorSet2.play(ofFloat10).with(ofFloat11);
            animatorSet2.play(ofFloat12).with(ofFloat13);
            animatorSet2.play(ofFloat12).after(ofFloat10);
            animatorSet2.play(ofFloat8).with(ofFloat10);
            SnsMethodCalculate.markEndTimeMs("getTargetAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            animatorSet2.setTarget(gLTwistRoateCardsView2.f274528B);
            animatorSet2.start();
            new C99557n0(gLTwistRoateCardsView2.f274528B, bVar3, gLTwistRoateCardsView2.f274538s, gLTwistRoateCardsView2.f274529C, 500, -5000).mo138936a();
        }
        SnsMethodCalculate.markEndTimeMs("doMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$6");
    }
}
