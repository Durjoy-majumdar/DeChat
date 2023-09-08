package com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial;

import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95917e;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import kg3.C76577a;
import nq2.C100151a;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.a */
public class C94753a {
    /* renamed from: a */
    public static void m119989a(SnsInfo snsInfo, C100151a.C100155d dVar) {
        ViewStub viewStub;
        SnsMethodCalculate.markStartTimeMs("checkAttractAnimationView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        if (m119992d(snsInfo)) {
            if (dVar.f293350F == null && (viewStub = dVar.f293349E) != null) {
                dVar.f293350F = (AdAttitudeAttractView) viewStub.inflate();
            }
            AdAttitudeAttractView adAttitudeAttractView = dVar.f293350F;
            if (adAttitudeAttractView != null) {
                dVar.f293348D.setOnCancelAttractAnimationListener(adAttitudeAttractView);
                AdAttitudeAttractView adAttitudeAttractView2 = dVar.f293350F;
                adAttitudeAttractView2.getClass();
                SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                String snsId = snsInfo.getSnsId();
                if (Util.isNullOrNil(snsId)) {
                    Log.m105920e("AdAttitudeAttractView", "resetUI, snsId is null");
                    SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                } else if (Util.isEqual(snsId, adAttitudeAttractView2.f274242i)) {
                    SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                } else {
                    adAttitudeAttractView2.f274242i = snsId;
                    adAttitudeAttractView2.f274237d = snsInfo;
                    adAttitudeAttractView2.f274238e = dVar;
                    C100151a.C100154c cVar = dVar.f293355K;
                    if (cVar != null) {
                        int i = cVar.f293340a;
                        SnsMethodCalculate.markStartTimeMs("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                        if (i == 0) {
                            adAttitudeAttractView2.f274254x = C76577a.m92151b(adAttitudeAttractView2.getContext(), 14);
                            adAttitudeAttractView2.f274255y = C76577a.m92151b(adAttitudeAttractView2.getContext(), 56);
                            adAttitudeAttractView2.f274256z = adAttitudeAttractView2.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
                        } else {
                            adAttitudeAttractView2.f274254x = adAttitudeAttractView2.f274239f.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
                            adAttitudeAttractView2.f274255y = adAttitudeAttractView2.f274239f.getResources().getDimensionPixelSize(C0966R.dimen.ao_) + adAttitudeAttractView2.f274239f.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
                            adAttitudeAttractView2.f274256z = adAttitudeAttractView2.f274254x;
                        }
                        SnsMethodCalculate.markEndTimeMs("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    }
                    adAttitudeAttractView2.f274241h = false;
                    adAttitudeAttractView2.f274234D = false;
                    adAttitudeAttractView2.f274243j = null;
                    adAttitudeAttractView2.mo130448i();
                    SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                }
            }
        } else {
            AdAttitudeAttractView adAttitudeAttractView3 = dVar.f293350F;
            if (adAttitudeAttractView3 != null) {
                adAttitudeAttractView3.setVisibility(8);
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkAttractAnimationView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    /* renamed from: b */
    public static void m119990b(C100151a.C100155d dVar, SnsInfo snsInfo, TimelineClickListener timelineClickListener, C95917e.C95922e eVar) {
        SnsMethodCalculate.markStartTimeMs("checkShowAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        try {
            if (m119995g(snsInfo)) {
                if (dVar.f293352H == null) {
                    dVar.f293352H = (AdAttitudePlayView) dVar.f293351G.inflate();
                }
                if (dVar.f293348D == null) {
                    AdSocialAttitudeView adSocialAttitudeView = (AdSocialAttitudeView) dVar.f293347C.inflate();
                    dVar.f293348D = adSocialAttitudeView;
                    adSocialAttitudeView.setOnShowAttitudeListener(dVar.f293352H);
                    dVar.f293352H.setOnAnimationStatusListener(dVar.f293348D);
                }
                m119989a(snsInfo, dVar);
                m119994f(8, dVar);
                dVar.f293348D.setTag(eVar);
                dVar.f293348D.setOnCommentClickListener(timelineClickListener);
                dVar.f293348D.setVisibility(0);
                dVar.f293348D.mo130475n(dVar, snsInfo);
                dVar.f293352H.mo130462e(dVar, snsInfo);
            } else {
                AdAttitudeAttractView adAttitudeAttractView = dVar.f293350F;
                if (adAttitudeAttractView != null) {
                    adAttitudeAttractView.setVisibility(8);
                }
                AdSocialAttitudeView adSocialAttitudeView2 = dVar.f293348D;
                if (adSocialAttitudeView2 != null) {
                    adSocialAttitudeView2.setVisibility(8);
                }
                AdAttitudePlayView adAttitudePlayView = dVar.f293352H;
                if (adAttitudePlayView != null) {
                    adAttitudePlayView.setVisibility(8);
                }
                m119994f(0, dVar);
            }
        } catch (Throwable th) {
            Log.m105920e("AdSocialAttitudeHelper", "checkShowAdAttitude exp: " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("checkShowAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    /* renamed from: c */
    public static void m119991c(int i, C100151a.C100155d dVar, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkStartPlayAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        try {
            if (!m119995g(snsInfo)) {
                AdAttitudeAttractView adAttitudeAttractView = dVar.f293350F;
                if (adAttitudeAttractView != null) {
                    adAttitudeAttractView.setVisibility(8);
                }
            } else if (m119996h(snsInfo, i, dVar)) {
                SnsMethodCalculate.markStartTimeMs("isMagicWindowUseAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                boolean z = C85875k4.m106197n0() && C85875k4.m106208w();
                SnsMethodCalculate.markEndTimeMs("isMagicWindowUseAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                if (z) {
                    AdSocialAttitudeView adSocialAttitudeView = dVar.f293348D;
                    if (adSocialAttitudeView != null) {
                        SnsMethodCalculate.markStartTimeMs("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        boolean z2 = adSocialAttitudeView.f274313S0;
                        SnsMethodCalculate.markEndTimeMs("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        if (!z2) {
                            dVar.f293348D.mo130480q();
                            Log.m105924i("AdSocialAttitudeHelper", "checkStartPlayAttractAnimation, but isMagicWindowUseAd, only start play icon attract animation");
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("checkStartPlayAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
                    return;
                }
                AdAttitudeAttractView adAttitudeAttractView2 = dVar.f293350F;
                if (adAttitudeAttractView2 != null) {
                    SnsMethodCalculate.markStartTimeMs("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    boolean z3 = adAttitudeAttractView2.f274241h;
                    SnsMethodCalculate.markEndTimeMs("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    if (!z3) {
                        dVar.f293350F.mo130446g(snsInfo);
                    }
                }
            }
        } catch (Throwable th) {
            Log.m105920e("AdSocialAttitudeHelper", "checkStartPlayAttractAnimation exp: " + th);
        }
        SnsMethodCalculate.markEndTimeMs("checkStartPlayAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    /* renamed from: d */
    public static boolean m119992d(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("hasAdAttractAnimationInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        boolean z = m119995g(snsInfo) && snsInfo.getAdXml().adSocialInfo.f294144d != null;
        SnsMethodCalculate.markEndTimeMs("hasAdAttractAnimationInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        return z;
    }

    /* renamed from: e */
    public static boolean m119993e() {
        SnsMethodCalculate.markStartTimeMs("isLikedHapticFeedback", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_social_comp_liked_haptic_feedback, 1);
            Log.m105924i("AdSocialAttitudeHelper", "isLikedHapticFeedback is " + Qe);
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isLikedHapticFeedback", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("AdSocialAttitudeHelper", "isLikedHapticFeedback, exp is " + th);
            SnsMethodCalculate.markEndTimeMs("isLikedHapticFeedback", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        }
    }

    /* renamed from: f */
    public static void m119994f(int i, C100151a.C100155d dVar) {
        SnsMethodCalculate.markStartTimeMs("setCommentVisibility", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        if (dVar.f293355K.f293340a == 0) {
            ImageView imageView = (ImageView) dVar.f293377v.findViewById(C0966R.C0970id.f5746nh);
            if (imageView != null) {
                imageView.setVisibility(i);
            }
        } else {
            ImageButton imageButton = (ImageButton) dVar.f293377v.findViewById(C0966R.C0970id.f5746nh);
            if (imageButton != null) {
                imageButton.setVisibility(i);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setCommentVisibility", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    /* renamed from: g */
    public static boolean m119995g(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("showAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        boolean z = snsInfo != null && snsInfo.isSocialAttitudeAd();
        SnsMethodCalculate.markEndTimeMs("showAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        return z;
    }

    /* renamed from: h */
    public static boolean m119996h(SnsInfo snsInfo, int i, C100151a.C100155d dVar) {
        SnsMethodCalculate.markStartTimeMs("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        if (!m119992d(snsInfo)) {
            SnsMethodCalculate.markEndTimeMs("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        } else if (dVar == null || dVar.f293348D == null) {
            Log.m105920e("AdSocialAttitudeHelper", "showAdAttractAnimation, viewHolder or showAdAttitudeView is null");
            SnsMethodCalculate.markEndTimeMs("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        } else {
            int i2 = snsInfo.getAdXml().adSocialInfo.f294144d.f294157a;
            if (i < i2 || i >= i2 + 1000) {
                SnsMethodCalculate.markEndTimeMs("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
                return false;
            }
            boolean m = dVar.f293348D.mo130474m();
            SnsMethodCalculate.markEndTimeMs("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return m;
        }
    }
}
