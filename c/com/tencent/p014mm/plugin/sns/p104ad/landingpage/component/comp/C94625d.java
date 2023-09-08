package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.C94782f;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeRandomEncoreView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95250a;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import mo2.C99936b;
import org.json.JSONObject;
import ps2.C100862c0;
import ps2.C100863e;
import ps2.C100883m;
import ps2.C100894u;
import qs2.C101253a;
import qs2.C101255a0;
import rq2.C101419f;
import so2.C101668d;
import so2.C101677l;
import so2.C101689s;
import sq2.C13774c;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d */
public class C94625d extends C95250a {

    /* renamed from: s */
    public C101668d f273814s;

    /* renamed from: t */
    public List<C95295z> f273815t;

    /* renamed from: u */
    public C100862c0 f273816u;

    /* renamed from: v */
    public ShakeRandomEncoreView f273817v;

    /* renamed from: w */
    public C95295z f273818w;

    /* renamed from: x */
    public C101255a0 f273819x;

    /* renamed from: y */
    public boolean f273820y = false;

    /* renamed from: z */
    public AdLandingHBCardComponent f273821z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d$a */
    public class C94626a extends C13774c {
        public C94626a() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent$2");
            C94625d dVar = C94625d.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            ShakeRandomEncoreView shakeRandomEncoreView = dVar.f273817v;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            shakeRandomEncoreView.setVisibility(4);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent$2");
        }
    }

    public C94625d(Context context, C101668d dVar, ViewGroup viewGroup) {
        super(context, dVar, viewGroup);
        this.f273814s = dVar;
        this.f273815t = new ArrayList();
    }

    /* renamed from: I */
    public static View m119712I(C95295z zVar) {
        SnsMethodCalculate.markStartTimeMs("findAnimCardView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (zVar.mo131850h().f296513s || zVar.mo131850h().f296516v) {
            View i = zVar.mo131609i();
            SnsMethodCalculate.markEndTimeMs("findAnimCardView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return i;
        }
        if (zVar instanceof C95250a) {
            for (C95295z I : ((C95250a) zVar).mo130196E()) {
                View I2 = m119712I(I);
                if (I2 != null) {
                    SnsMethodCalculate.markEndTimeMs("findAnimCardView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    return I2;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("findAnimCardView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return null;
    }

    /* renamed from: J */
    public static C94625d m119713J(C95295z zVar) {
        SnsMethodCalculate.markStartTimeMs("findEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (zVar instanceof C94625d) {
            C94625d dVar = (C94625d) zVar;
            SnsMethodCalculate.markEndTimeMs("findEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return dVar;
        }
        if (zVar instanceof C95250a) {
            for (C95295z J : ((C95250a) zVar).mo130196E()) {
                C94625d J2 = m119713J(J);
                if (J2 != null) {
                    SnsMethodCalculate.markEndTimeMs("findEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    return J2;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("findEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return null;
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Log.m105918d("AdLandingEggCardComponent", "viewAppeared, curComp=" + mo130203P());
        C95295z zVar = this.f273818w;
        if (zVar != null && zVar.mo131640s()) {
            this.f273818w.mo130145A();
        }
        super.mo130145A();
        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Log.m105918d("AdLandingEggCardComponent", "viewWillAppear, curComp=" + mo130203P());
        C95295z zVar = this.f273818w;
        if (zVar != null && zVar.mo131640s()) {
            this.f273818w.mo124360B();
        }
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Log.m105924i("AdLandingEggCardComponent", "viewWillDestroy, curComp=" + mo130203P());
        super.mo67235C();
        for (C95295z C : this.f273815t) {
            C.mo67235C();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Log.m105918d("AdLandingEggCardComponent", "viewWillDisappear, curComp=" + mo130203P());
        C95295z zVar = this.f273818w;
        if (zVar != null) {
            zVar.mo124361D();
        }
        super.mo124361D();
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: E */
    public List<C95295z> mo130196E() {
        SnsMethodCalculate.markStartTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (this.f273816u != null) {
            ArrayList arrayList = new ArrayList(this.f273816u.mo140331a());
            SnsMethodCalculate.markEndTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        SnsMethodCalculate.markEndTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return arrayList2;
    }

    /* renamed from: G */
    public void mo130197G() {
        SnsMethodCalculate.markStartTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Log.m105918d("AdLandingEggCardComponent", "updateChildExposure, curComp=" + mo130203P());
        C95295z zVar = this.f273818w;
        if (zVar != null) {
            if (zVar.mo131640s()) {
                this.f273818w.mo124360B();
                this.f273818w.mo130145A();
            } else {
                this.f273818w.mo124361D();
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: H */
    public void mo130198H() {
        String str;
        AdLandingHBCardComponent adLandingHBCardComponent;
        String str2;
        C99936b bVar;
        View view;
        SnsMethodCalculate.markStartTimeMs("checkShowDoubleHbCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (!this.f273820y || (adLandingHBCardComponent = this.f273821z) == null) {
            str = "checkShowDoubleHbCardAppearAnim";
        } else {
            adLandingHBCardComponent.getClass();
            SnsMethodCalculate.markStartTimeMs("startDoubleCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (adLandingHBCardComponent.f273710w != 3 || (bVar = adLandingHBCardComponent.f273707t) == null || (view = bVar.f292813c) == null) {
                str2 = "checkShowDoubleHbCardAppearAnim";
            } else {
                SnsMethodCalculate.markStartTimeMs("doDoubleCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                str2 = "checkShowDoubleHbCardAppearAnim";
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "doDoubleCardAppearAnim", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "doDoubleCardAppearAnim", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = new View(adLandingHBCardComponent.f276579d);
                adLandingHBCardComponent.f273709v.addView(view3, 0, new FrameLayout.LayoutParams(-1, -1));
                view3.setBackgroundResource(C0966R.C0969drawable.bte);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "alpha", new float[]{1.0f, 1.0f});
                ofFloat2.setDuration(1000);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "alpha", new float[]{1.0f, 0.0f});
                ofFloat3.setDuration(200);
                ofFloat3.addListener(new C94669s(adLandingHBCardComponent, view3));
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "Rotation", new float[]{0.0f, 8.0f});
                ofFloat4.setDuration(400);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "Rotation", new float[]{8.0f, 5.0f});
                ofFloat5.setDuration(200);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat4).after(ofFloat);
                animatorSet.play(ofFloat5).after(ofFloat4);
                animatorSet.play(ofFloat2).after(ofFloat);
                animatorSet.play(ofFloat3).after(ofFloat2);
                animatorSet.start();
                SnsMethodCalculate.markEndTimeMs("doDoubleCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            }
            SnsMethodCalculate.markEndTimeMs("startDoubleCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            str = str2;
        }
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: K */
    public final C94670s0 mo130199K(C95295z zVar) {
        SnsMethodCalculate.markStartTimeMs("findSocialCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (zVar == null) {
            SnsMethodCalculate.markEndTimeMs("findSocialCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        } else if (zVar instanceof C94670s0) {
            C94670s0 s0Var = (C94670s0) zVar;
            SnsMethodCalculate.markEndTimeMs("findSocialCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return s0Var;
        } else {
            try {
                if (zVar instanceof C95250a) {
                    for (C95295z K : ((C95250a) zVar).mo130196E()) {
                        C94670s0 K2 = mo130199K(K);
                        if (K2 != null) {
                            SnsMethodCalculate.markEndTimeMs("findSocialCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                            return K2;
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingEggCardComponent", "findSocialCardComp, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("findSocialCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        }
    }

    /* renamed from: M */
    public final C101689s mo130200M(C101255a0 a0Var) {
        List<C101255a0> a;
        SnsMethodCalculate.markStartTimeMs("findSocialCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (a0Var == null) {
            SnsMethodCalculate.markEndTimeMs("findSocialCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        } else if (a0Var instanceof C101689s) {
            C101689s sVar = (C101689s) a0Var;
            SnsMethodCalculate.markEndTimeMs("findSocialCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return sVar;
        } else {
            try {
                if (C100894u.m132237q(a0Var.f296505k) && (a = a0Var.mo140732a()) != null) {
                    for (C101255a0 M : a) {
                        C101689s M2 = mo130200M(M);
                        if (M2 != null) {
                            SnsMethodCalculate.markEndTimeMs("findSocialCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                            return M2;
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingEggCardComponent", "findSocialCardInfo, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("findSocialCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        }
    }

    /* renamed from: N */
    public C101253a mo130201N(C95295z zVar) {
        SnsMethodCalculate.markStartTimeMs("findVideoComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (zVar == null) {
            SnsMethodCalculate.markEndTimeMs("findVideoComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        } else if (zVar instanceof C101253a) {
            Log.m105918d("AdLandingEggCardComponent", "find normal videoComp");
            C101253a aVar = (C101253a) zVar;
            SnsMethodCalculate.markEndTimeMs("findVideoComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return aVar;
        } else {
            try {
                if (zVar instanceof C95250a) {
                    for (C95295z N : ((C95250a) zVar).mo130196E()) {
                        C101253a N2 = mo130201N(N);
                        if (N2 != null) {
                            SnsMethodCalculate.markEndTimeMs("findVideoComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                            return N2;
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingEggCardComponent", "findSocialCardComp, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("findVideoComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        }
    }

    /* renamed from: O */
    public C101255a0 mo130202O(String str) {
        SnsMethodCalculate.markStartTimeMs("getCardInfoById", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("getCardInfoById", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        }
        for (C101255a0 next : this.f273814s.f297604z) {
            if (str.equals(next.f296515u)) {
                SnsMethodCalculate.markEndTimeMs("getCardInfoById", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                return next;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getCardInfoById", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return null;
    }

    /* renamed from: P */
    public String mo130203P() {
        SnsMethodCalculate.markStartTimeMs("getCurCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        C95295z zVar = this.f273818w;
        String simpleName = zVar == null ? "null" : zVar.getClass().getSimpleName();
        SnsMethodCalculate.markEndTimeMs("getCurCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return simpleName;
    }

    /* renamed from: Q */
    public C95295z mo130204Q() {
        SnsMethodCalculate.markStartTimeMs("getCurrentShowComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        C95295z zVar = this.f273818w;
        SnsMethodCalculate.markEndTimeMs("getCurrentShowComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return zVar;
    }

    /* renamed from: R */
    public C101255a0 mo130205R() {
        SnsMethodCalculate.markStartTimeMs("getDefaultCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        for (C101255a0 next : this.f273814s.f297604z) {
            if (next.f296514t) {
                SnsMethodCalculate.markEndTimeMs("getDefaultCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                return next;
            }
        }
        if (this.f273814s.f297604z.size() > 0) {
            C101255a0 a0Var = this.f273814s.f297604z.get(0);
            SnsMethodCalculate.markEndTimeMs("getDefaultCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return a0Var;
        }
        SnsMethodCalculate.markEndTimeMs("getDefaultCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return null;
    }

    /* renamed from: U */
    public Pair<Integer, Integer> mo130206U() {
        float f;
        float f2;
        SnsMethodCalculate.markStartTimeMs("getTwistCardSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        C101255a0 R = mo130205R();
        if (R != null) {
            f = R.f296501g;
            f2 = R.f296502h;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            Log.m105920e("AdLandingEggCardComponent", "default card size is 0, w=" + f + ", h=" + f2);
        }
        Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf((int) f), Integer.valueOf((int) f2));
        SnsMethodCalculate.markEndTimeMs("getTwistCardSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return pair;
    }

    /* renamed from: V */
    public void mo130207V() {
        SnsMethodCalculate.markStartTimeMs("hideEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        ShakeRandomEncoreView shakeRandomEncoreView = this.f273817v;
        if (shakeRandomEncoreView == null) {
            SnsMethodCalculate.markEndTimeMs("hideEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        } else if (shakeRandomEncoreView.getVisibility() != 0) {
            SnsMethodCalculate.markEndTimeMs("hideEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f273817v, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.addListener(new C94626a());
            ofFloat.setDuration(400);
            ofFloat.start();
            SnsMethodCalculate.markEndTimeMs("hideEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        }
    }

    /* renamed from: W */
    public boolean mo130208W() {
        C101668d.C101669a aVar;
        SnsMethodCalculate.markStartTimeMs("isSupportEncoreShake", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        C101668d dVar = this.f273814s;
        boolean z = true;
        if (dVar == null || (aVar = dVar.f297603C) == null || aVar.f297605a != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isSupportEncoreShake", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return z;
    }

    /* renamed from: X */
    public final void mo130209X(C95295z zVar) {
        C101253a aVar;
        C101253a aVar2;
        SnsMethodCalculate.markStartTimeMs("resetHbCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (zVar instanceof AdLandingHBCardComponent) {
            AdLandingHBCardComponent adLandingHBCardComponent = (AdLandingHBCardComponent) zVar;
            adLandingHBCardComponent.getClass();
            SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            Log.m105918d("AdLandingHBCardComponent", "reset");
            C99936b bVar = adLandingHBCardComponent.f273706s;
            if (!(bVar == null || (aVar2 = bVar.f292821k) == null)) {
                aVar2.mo130237P(0, false);
            }
            C99936b bVar2 = adLandingHBCardComponent.f273707t;
            if (!(bVar2 == null || (aVar = bVar2.f292821k) == null)) {
                aVar.mo130237P(0, false);
            }
            SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        }
        SnsMethodCalculate.markEndTimeMs("resetHbCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: Y */
    public void mo130210Y(String str, String str2) {
        int i;
        Iterator<C95295z> it;
        String str3 = str;
        String str4 = str2;
        SnsMethodCalculate.markStartTimeMs("selectShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        int i2 = 0;
        this.f273820y = false;
        this.f273821z = null;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            SnsMethodCalculate.markStartTimeMs("getCardTypeFromExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            i = new JSONObject(str4).optInt("cardType");
            SnsMethodCalculate.markEndTimeMs("getCardTypeFromExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("getCardTypeFromExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            i = 0;
        } catch (Throwable th) {
            Log.m105920e("AdLandingEggCardComponent", "selectShowCard, exp=" + th.toString());
        }
        C101255a0 O = mo130202O(str);
        if (O == null) {
            O = mo130205R();
            Log.m105924i("AdLandingEggCardComponent", "selectShowCard, useDefaultCard, cardId=" + str3);
        }
        if (O != null) {
            if (i == 1) {
                C101689s M = mo130200M(O);
                if (M != null) {
                    Log.m105924i("AdLandingEggCardComponent", "selectShowCard, show socialCard, cardId=" + str3);
                    M.mo141136c(str4);
                }
            } else if (i == 2) {
                SnsMethodCalculate.markStartTimeMs("findHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                C101677l lVar = (C101677l) new C100883m().mo140351a(this.f273814s, C101677l.class);
                SnsMethodCalculate.markEndTimeMs("findHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                if (lVar != null) {
                    Log.m105924i("AdLandingEggCardComponent", "selectShowCard, show hbCard, cardId=" + str3);
                }
            }
            boolean z = this.f273817v != null;
            Iterator<C95295z> it4 = this.f273815t.iterator();
            while (it4.hasNext()) {
                C95295z next = it4.next();
                String str5 = O.f296495a;
                if (str5 == null || !str5.equals(next.mo131857r())) {
                    it = it4;
                    next.mo124361D();
                    if (z) {
                        View i3 = next.mo131609i();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(i3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingEggCardComponent", "selectShowCard", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        i3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(i3, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingEggCardComponent", "selectShowCard", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        this.f273816u.mo140334d(next);
                        next.mo67235C();
                    }
                } else {
                    View i4 = next.mo131609i();
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    it = it4;
                    aVar2.mo10233c(Integer.valueOf(i2));
                    C117292a.m165358d(i4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingEggCardComponent", "selectShowCard", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i4.setVisibility(((Integer) aVar2.mo10231a(i2)).intValue());
                    C117292a.m165359e(i4, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingEggCardComponent", "selectShowCard", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C95295z zVar = this.f273818w;
                    SnsMethodCalculate.markStartTimeMs("resetNormalCardVideo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    C101253a N = mo130201N(zVar);
                    Log.m105924i("AdLandingEggCardComponent", "resetNormalCardVideo, videoComp=" + N);
                    if (N != null) {
                        N.mo130237P(0, false);
                    }
                    SnsMethodCalculate.markEndTimeMs("resetNormalCardVideo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    mo130209X(this.f273818w);
                    this.f273818w = next;
                    this.f273819x = O;
                    if (i == 1) {
                        C94670s0 K = mo130199K(next);
                        if (K != null) {
                            K.mo130260H();
                        }
                    } else if (i == 2) {
                        SnsMethodCalculate.markStartTimeMs("findHBCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        AdLandingHBCardComponent adLandingHBCardComponent = (AdLandingHBCardComponent) new C100863e().mo140335a(next, AdLandingHBCardComponent.class);
                        SnsMethodCalculate.markEndTimeMs("findHBCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        if (adLandingHBCardComponent != null) {
                            this.f273821z = adLandingHBCardComponent;
                            adLandingHBCardComponent.mo130154V(str4, str3);
                            SnsMethodCalculate.markStartTimeMs("getSubCardType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                            int i5 = adLandingHBCardComponent.f273710w;
                            SnsMethodCalculate.markEndTimeMs("getSubCardType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                            this.f273820y = i5 == 3;
                        }
                    }
                }
                it4 = it;
                i2 = 0;
            }
            this.f273815t = mo130196E();
        } else {
            Log.m105920e("AdLandingEggCardComponent", "selectShowCard, showCardInfo==null");
        }
        Log.m105924i("AdLandingEggCardComponent", "selectShowCard, cost=" + (System.currentTimeMillis() - currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("selectShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: b0 */
    public void mo130211b0(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEncoreShakeEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        ShakeRandomEncoreView shakeRandomEncoreView = this.f273817v;
        if (shakeRandomEncoreView != null) {
            if (z) {
                shakeRandomEncoreView.mo130599b();
            } else {
                shakeRandomEncoreView.mo130600c();
            }
        }
        SnsMethodCalculate.markEndTimeMs("setEncoreShakeEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: c0 */
    public void mo130212c0() {
        SnsMethodCalculate.markStartTimeMs("showEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        ShakeRandomEncoreView shakeRandomEncoreView = this.f273817v;
        if (shakeRandomEncoreView == null) {
            SnsMethodCalculate.markEndTimeMs("showEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        } else if (shakeRandomEncoreView.getVisibility() == 0) {
            SnsMethodCalculate.markEndTimeMs("showEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        } else {
            this.f273817v.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f273817v, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(400);
            ofFloat.start();
            SnsMethodCalculate.markEndTimeMs("showEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        }
    }

    /* renamed from: f */
    public View mo67239f() {
        SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        FrameLayout frameLayout = new FrameLayout(this.f276579d);
        SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return frameLayout;
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Log.m105918d("AdLandingEggCardComponent", "fillItem");
        C100862c0 c0Var = this.f273816u;
        if (c0Var == null) {
            C100862c0 c0Var2 = new C100862c0(this.f273814s.f297604z, this.f276579d, 0, (FrameLayout) this.f276586n);
            this.f273816u = c0Var2;
            c0Var2.mo140332b();
            this.f273815t = mo130196E();
        } else {
            c0Var.mo140333c(this.f273814s.f297604z);
        }
        for (C95295z i : this.f273815t) {
            View i2 = i.mo131609i();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = i2;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingEggCardComponent", "fillItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingEggCardComponent", "fillItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (mo130208W()) {
            SnsMethodCalculate.markStartTimeMs("addEncoreShakeView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            if (this.f273817v == null) {
                ShakeRandomEncoreView shakeRandomEncoreView = new ShakeRandomEncoreView(this.f276579d);
                this.f273817v = shakeRandomEncoreView;
                C101668d.C101669a aVar2 = this.f273814s.f297603C;
                SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
                shakeRandomEncoreView.f274502g = aVar2;
                shakeRandomEncoreView.f274501f.setText(aVar2.f297606b);
                if (!TextUtils.isEmpty(aVar2.f297607c)) {
                    C101419f.m133083f(aVar2.f297607c, shakeRandomEncoreView.f274500e);
                } else {
                    shakeRandomEncoreView.f274500e.setVisibility(8);
                }
                if (aVar2.f297605a == 1 && shakeRandomEncoreView.f274503h == null) {
                    shakeRandomEncoreView.f274503h = new C94782f(shakeRandomEncoreView.f274499d);
                }
                SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = C76577a.m92151b(this.f276579d, 12);
                ((FrameLayout) this.f276586n).addView(this.f273817v, layoutParams);
                this.f273817v.setOnShakeListener(new C94623c(this));
            }
            SnsMethodCalculate.markEndTimeMs("addEncoreShakeView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            this.f273817v.setVisibility(4);
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C101255a0 a0Var = this.f276580e;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
        }
        this.f276586n.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* renamed from: z */
    public void mo130213z(C101255a0 a0Var) {
        SnsMethodCalculate.markStartTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Log.m105918d("AdLandingEggCardComponent", "updateDataSet, info=" + a0Var);
        if (a0Var instanceof C101668d) {
            this.f273814s = (C101668d) a0Var;
        }
        super.mo130213z(a0Var);
        SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }
}
