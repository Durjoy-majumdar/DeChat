package com.tencent.p014mm.plugin.sns.p104ad.widget.shakead;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import co2.C92435h;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94724k;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fr2.C8197b;
import fr2.C97953c;
import h81.C32735h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p156gj.C87203t;
import zq2.C103063b;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView */
public class ShakeCardAnimView extends FrameLayout {

    /* renamed from: o */
    public static final /* synthetic */ int f274459o = 0;

    /* renamed from: d */
    public Context f274460d;

    /* renamed from: e */
    public PAGView f274461e;

    /* renamed from: f */
    public C92435h.C92436a f274462f;

    /* renamed from: g */
    public CardAnimView f274463g;

    /* renamed from: h */
    public GLCardAnimView f274464h;

    /* renamed from: i */
    public boolean f274465i = false;

    /* renamed from: j */
    public boolean f274466j = false;

    /* renamed from: n */
    public C94768c f274467n;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$a */
    public class C94766a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f274468d;

        /* renamed from: e */
        public final /* synthetic */ String f274469e;

        public C94766a(String str, String str2) {
            this.f274468d = str;
            this.f274469e = str2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$2");
            try {
                if (ShakeCardAnimView.m120062b(ShakeCardAnimView.this)) {
                    ShakeCardAnimView.m120061a(ShakeCardAnimView.this).setPath("assets://sns/sns_ad_shake_landing_page_anim_low.pag");
                    Log.m105924i("ShakeCardAnimView", "initPagAnimViewData, force use local low file");
                } else {
                    String b = C94724k.m119922b(this.f274468d, this.f274469e);
                    if (!TextUtils.isEmpty(b)) {
                        ShakeCardAnimView.m120061a(ShakeCardAnimView.this).setComposition(PAGFile.Load(C94724k.m119923c(b)));
                        Log.m105924i("ShakeCardAnimView", "initPagAnimViewData, use sever file");
                    } else {
                        AdLandingPagesProxy.getInstance().downloadPagFile(this.f274468d);
                        ShakeCardAnimView.m120061a(ShakeCardAnimView.this).setPath("assets://sns/sns_ad_shake_landing_page_anim_low.pag");
                        Log.m105924i("ShakeCardAnimView", "initPagAnimViewData, use local file");
                    }
                }
                ShakeCardAnimView.m120061a(ShakeCardAnimView.this).setScaleMode(3);
                ShakeCardAnimView.m120061a(ShakeCardAnimView.this).setRepeatCount(1);
            } catch (Throwable th) {
                Log.m105920e("ShakeCardAnimView", "initPagAnimViewData , exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$b */
    public class C94767b implements Runnable {
        public C94767b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$3");
            try {
                ShakeCardAnimView.m120061a(ShakeCardAnimView.this).play();
            } catch (Throwable th) {
                Log.m105920e("ShakeCardAnimView", "startPAGAnim, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$c */
    public interface C94768c {
    }

    public ShakeCardAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        this.f274460d = context;
        SnsMethodCalculate.markStartTimeMs("isUseGLCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_shake_anim_gl, 0);
            boolean z2 = Qe > 0;
            Log.m105924i("ShakeCardAnimView", "isUseGLCardView, exptValue=" + Qe);
            SnsMethodCalculate.markEndTimeMs("isUseGLCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            z = z2;
        } catch (Throwable th) {
            Log.m105920e("ShakeCardAnimView", "isUseGLCardView, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isUseGLCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        }
        this.f274465i = z;
        Context context2 = this.f274460d;
        SnsMethodCalculate.markStartTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        if (this.f274465i) {
            GLCardAnimView gLCardAnimView = new GLCardAnimView(context2);
            this.f274464h = gLCardAnimView;
            addView(gLCardAnimView, new FrameLayout.LayoutParams(-1, -1));
            C115669n.INSTANCE.mo175911u(1572, 15);
        } else {
            CardAnimView cardAnimView = new CardAnimView(context2);
            this.f274463g = cardAnimView;
            addView(cardAnimView, new FrameLayout.LayoutParams(-1, -1));
        }
        SnsMethodCalculate.markEndTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        Context context3 = this.f274460d;
        SnsMethodCalculate.markStartTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        PAGView pAGView = new PAGView(context3);
        this.f274461e = pAGView;
        pAGView.addListener(new C94781e(this));
        addView(this.f274461e, new FrameLayout.LayoutParams(-1, -1));
        SnsMethodCalculate.markEndTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }

    /* renamed from: a */
    public static /* synthetic */ PAGView m120061a(ShakeCardAnimView shakeCardAnimView) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        PAGView pAGView = shakeCardAnimView.f274461e;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        return pAGView;
    }

    /* renamed from: b */
    public static boolean m120062b(ShakeCardAnimView shakeCardAnimView) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        shakeCardAnimView.getClass();
        SnsMethodCalculate.markStartTimeMs("isForceLocalLowPag", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        boolean z = false;
        try {
            int[] b = C95198o2.m121130b(shakeCardAnimView.f274460d);
            Log.m105924i("ShakeCardAnimView", "w=" + b[0] + ", h=" + b[1]);
            if (b[0] * b[1] <= 921600 || shakeCardAnimView.mo130573d()) {
                Log.m105924i("ShakeCardAnimView", "isLowPerformanceDevice, ret=true");
                C115669n.INSTANCE.mo175911u(1572, 9);
                SnsMethodCalculate.markEndTimeMs("isForceLocalLowPag", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                z = true;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                return z;
            }
        } catch (Throwable th) {
            Log.m105920e("ShakeCardAnimView", "isForceLocalLowPag, exp=" + th.toString());
        }
        Log.m105924i("ShakeCardAnimView", "isLowPerformanceDevice, ret=false");
        SnsMethodCalculate.markEndTimeMs("isForceLocalLowPag", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        return z;
    }

    /* renamed from: c */
    public final void mo130572c(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        PAGView pAGView = this.f274461e;
        if (pAGView == null) {
            Log.m105920e("ShakeCardAnimView", "initPagAnimViewData, mPAGAnimView==null");
            SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            return;
        }
        pAGView.post(new C94766a(str, str2));
        SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }

    /* renamed from: d */
    public final boolean mo130573d() {
        SnsMethodCalculate.markStartTimeMs("isInBlackList", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        try {
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_ad_shake_pag_black_list, "");
            String k = C87203t.m108275k();
            boolean z = !TextUtils.isEmpty(Y60) && !TextUtils.isEmpty(k) && Y60.toLowerCase().contains(k.toLowerCase());
            Log.m105924i("ShakeCardAnimView", "isInBlackList, blackList=" + Y60 + ", curDev=" + k + ", ret=" + z);
            SnsMethodCalculate.markEndTimeMs("isInBlackList", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            return z;
        } catch (Throwable th) {
            Log.m105920e("ShakeCardAnimView", "isInBlackList, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isInBlackList", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            return false;
        }
    }

    /* renamed from: e */
    public void mo130574e() {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("startCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        Log.m105924i("ShakeCardAnimView", "startCardAnim");
        if (this.f274465i) {
            GLCardAnimView gLCardAnimView = this.f274464h;
            gLCardAnimView.getClass();
            SnsMethodCalculate.markStartTimeMs("startCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            gLCardAnimView.f274457z = true;
            int b = C76577a.m92151b(gLCardAnimView.f274450s, 140);
            int i = -b;
            gLCardAnimView.mo130569k((C103063b) gLCardAnimView.mo130530e(0), 0, 500, i);
            gLCardAnimView.mo130569k((C103063b) gLCardAnimView.mo130530e(4), 0, 500, b);
            C103063b bVar = (C103063b) gLCardAnimView.mo130530e(2);
            gLCardAnimView.f274455x = bVar;
            bVar.mo142775l(1.0f);
            SnsMethodCalculate.markStartTimeMs("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar, "translationY", new float[]{(float) (-((gLCardAnimView.getHeight() / 2) + (gLCardAnimView.f274452u / 2) + gLCardAnimView.f274453v)), 0.0f});
            long j = (long) 500;
            ofFloat.setDuration(j);
            ofFloat.addListener(new C97953c(gLCardAnimView, bVar));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar, "scaleX", new float[]{0.33333334f, 1.0f});
            ofFloat2.setDuration(j);
            str = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView";
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar, "scaleY", new float[]{0.33333334f, 1.0f});
            ofFloat3.setDuration(j);
            ofFloat.addListener(new C94778c(gLCardAnimView));
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar, "scaleX", new float[]{1.0f, 3.3333333f});
            ofFloat4.setDuration(j);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(bVar, "scaleY", new float[]{1.0f, 3.3333333f});
            ofFloat5.setDuration(j);
            int i2 = b;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(gLCardAnimView.f274454w, "scaleX", new float[]{0.33333334f, 1.0f});
            ofFloat6.setDuration(j);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(gLCardAnimView.f274454w, "scaleY", new float[]{0.33333334f, 1.0f});
            ofFloat7.setDuration(j);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
            animatorSet.play(ofFloat4).with(ofFloat5).with(ofFloat6).with(ofFloat7).after(ofFloat2);
            animatorSet.setStartDelay(100);
            animatorSet.start();
            SnsMethodCalculate.markEndTimeMs("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            gLCardAnimView.mo130569k((C103063b) gLCardAnimView.mo130530e(1), 50, 500, i);
            gLCardAnimView.mo130569k((C103063b) gLCardAnimView.mo130530e(3), 50, 500, i2);
            str2 = "startCardAnim";
            SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        } else {
            str = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView";
            String str3 = "startCardAnim";
            CardAnimView cardAnimView = this.f274463g;
            cardAnimView.getClass();
            SnsMethodCalculate.markStartTimeMs(str3, "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            cardAnimView.f274446n = true;
            int b2 = C76577a.m92151b(cardAnimView.f274439d, 140);
            View childAt = cardAnimView.getChildAt(0);
            View childAt2 = cardAnimView.getChildAt(4);
            int i3 = -b2;
            cardAnimView.mo130564d(childAt, 0, 500, i3);
            cardAnimView.mo130564d(childAt2, 0, 500, b2);
            View childAt3 = cardAnimView.getChildAt(2);
            cardAnimView.f274444i = childAt3;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view = childAt3;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startCardAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startCardAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markStartTimeMs("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(childAt3, "translationY", new float[]{(float) (-((cardAnimView.getHeight() / 2) + (cardAnimView.f274441f / 2) + cardAnimView.f274442g)), 0.0f});
            long j2 = (long) 500;
            ofFloat8.setDuration(j2);
            ofFloat8.addListener(new C8197b(cardAnimView, childAt3));
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(childAt3, "scaleX", new float[]{0.33333334f, 1.0f});
            ofFloat9.setDuration(j2);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(childAt3, "scaleY", new float[]{0.33333334f, 1.0f});
            ofFloat10.setDuration(j2);
            ofFloat8.addListener(new C94775a(cardAnimView));
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(childAt3, "scaleX", new float[]{1.0f, 3.3333333f});
            ofFloat11.setDuration(j2);
            String str4 = str3;
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(childAt3, "scaleY", new float[]{1.0f, 3.3333333f});
            ofFloat12.setDuration(j2);
            int i4 = b2;
            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(cardAnimView.f274443h, "scaleX", new float[]{0.33333334f, 1.0f});
            ofFloat13.setDuration(j2);
            ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(cardAnimView.f274443h, "scaleY", new float[]{0.33333334f, 1.0f});
            ofFloat14.setDuration(j2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{ofFloat8, ofFloat9, ofFloat10});
            animatorSet2.play(ofFloat11).with(ofFloat12).with(ofFloat13).with(ofFloat14).after(ofFloat9);
            animatorSet2.setStartDelay(100);
            animatorSet2.start();
            SnsMethodCalculate.markEndTimeMs("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            View childAt4 = cardAnimView.getChildAt(1);
            View childAt5 = cardAnimView.getChildAt(3);
            cardAnimView.mo130564d(childAt4, 50, 500, i3);
            cardAnimView.mo130564d(childAt5, 50, 500, i4);
            str2 = str4;
            SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        }
        SnsMethodCalculate.markEndTimeMs(str2, str);
    }

    /* renamed from: f */
    public void mo130575f() {
        SnsMethodCalculate.markStartTimeMs("startPAGAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        Log.m105924i("ShakeCardAnimView", "startPAGAnim");
        PAGView pAGView = this.f274461e;
        if (pAGView == null) {
            SnsMethodCalculate.markEndTimeMs("startPAGAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            return;
        }
        pAGView.post(new C94767b());
        SnsMethodCalculate.markEndTimeMs("startPAGAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }

    public void setAnimCardView(View view) {
        SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        Log.m105924i("ShakeCardAnimView", "setAnimCardView");
        if (this.f274465i) {
            this.f274464h.setAnimCardView(view);
        } else {
            this.f274463g.setAnimCardView(view);
        }
        SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }

    public void setOnCardAnimListener(C94768c cVar) {
        SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        this.f274467n = cVar;
        if (this.f274465i) {
            this.f274464h.setOnCardAnimListener(cVar);
        } else {
            this.f274463g.setOnCardAnimListener(cVar);
        }
        SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }
}
