package hr2;

import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistRoateCardsView;

/* renamed from: hr2.j */
public class C98517j extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ TwistRoateCardsView f288917d;

    public C98517j(TwistRoateCardsView twistRoateCardsView) {
        this.f288917d = twistRoateCardsView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0115 A[Catch:{ all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x012b A[Catch:{ all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r27) {
        /*
            r26 = this;
            java.lang.String r1 = "onAnimationEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = r26
            com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView r4 = r3.f288917d
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r0 = com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistRoateCardsView.f274587y
            java.lang.String r5 = "access$500"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r4.getClass()
            java.lang.String r7 = "onRoateEnd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$b r0 = r4.f274605x
            if (r0 == 0) goto L_0x01e5
            r8 = r0
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$f r8 = (com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.C94709f) r8
            java.lang.String r9 = "onPrepareCard"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            java.lang.String r11 = "access$1000"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            java.lang.String r13 = r0.f274097h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            java.lang.String r11 = "access$1100"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            java.lang.String r0 = r0.f274098i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r11 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            java.lang.String r14 = "access$1500"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
            int r11 = r11.f274114y
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
            r14 = 5
            if (r11 != r14) goto L_0x00e1
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r11 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            java.lang.String r14 = "access$1600"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
            mo2.c r11 = r11.f274113x
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
            if (r11 == 0) goto L_0x00e1
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
            mo2.c r0 = r0.f274113x
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
            r0.getClass()
            java.lang.String r11 = "toExtInfoJsonString"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r14)
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bb }
            r15.<init>()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r3 = "giveCardId"
            r16 = r1
            java.lang.String r1 = r0.f292835b     // Catch:{ Exception -> 0x00b9 }
            r15.put(r3, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = "subCardType"
            int r3 = r0.f292838e     // Catch:{ Exception -> 0x00b9 }
            r15.put(r1, r3)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = "cardType"
            r3 = 2
            r15.put(r1, r3)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = "senderUserName"
            java.lang.String r3 = r0.f292836c     // Catch:{ Exception -> 0x00b9 }
            r15.put(r1, r3)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = "senderNickName"
            java.lang.String r3 = r0.f292837d     // Catch:{ Exception -> 0x00b9 }
            r15.put(r1, r3)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = "shareTime"
            r17 = r2
            long r2 = r0.f292839f     // Catch:{ Exception -> 0x00b7 }
            r15.put(r1, r2)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x00b7 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
            goto L_0x00e5
        L_0x00b7:
            r0 = move-exception
            goto L_0x00c0
        L_0x00b9:
            r0 = move-exception
            goto L_0x00be
        L_0x00bb:
            r0 = move-exception
            r16 = r1
        L_0x00be:
            r17 = r2
        L_0x00c0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "toExtInfoJsonString, exp="
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "ShareGiveHBCardInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
            java.lang.String r0 = ""
            goto L_0x00e5
        L_0x00e1:
            r16 = r1
            r17 = r2
        L_0x00e5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onPrepareCard, twistId="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = ", ext="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "AdLandingPageEggCardHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r1 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d r1 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.m119899i(r1)
            r1.mo130210Y(r13, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0140 }
            r1 = 1572(0x624, float:2.203E-42)
            if (r0 == 0) goto L_0x012b
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.m119891a(r0)     // Catch:{ all -> 0x0140 }
            qs2.i0 r0 = r0.mo132541n8()     // Catch:{ all -> 0x0140 }
            r3 = 2
            com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistCoverView.m120102g(r0, r3)     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0140 }
            r3 = 8
            r0.mo175911u(r1, r3)     // Catch:{ all -> 0x0140 }
            goto L_0x015a
        L_0x012b:
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.m119891a(r0)     // Catch:{ all -> 0x0140 }
            qs2.i0 r0 = r0.mo132541n8()     // Catch:{ all -> 0x0140 }
            r3 = 1
            com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistCoverView.m120102g(r0, r3)     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0140 }
            r3 = 7
            r0.mo175911u(r1, r3)     // Catch:{ all -> 0x0140 }
            goto L_0x015a
        L_0x0140:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "twist report exp="
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x015a:
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d r1 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.m119899i(r0)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r1 = r1.mo130204Q()
            android.view.View r1 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94625d.m119712I(r1)
            java.lang.String r3 = "access$1202"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r12)
            r0.f274095f = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r12)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            android.view.View r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.m119893c(r0)
            if (r0 == 0) goto L_0x01db
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            java.lang.String r1 = "access$1400"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r12)
            com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView r0 = r0.f274091b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r1 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            android.view.View r1 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.m119893c(r1)
            r0.setAnimCardView(r1)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.this
            android.view.View r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.m119893c(r0)
            r1 = 0
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.mo10233c(r1)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$7"
            java.lang.String r21 = "onPrepareCard"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setAlpha"
            java.lang.String r25 = "(F)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 0
            java.lang.Object r1 = r2.mo10231a(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.setAlpha(r1)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$7"
            java.lang.String r20 = "onPrepareCard"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setAlpha"
            java.lang.String r24 = "(F)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x01e1
        L_0x01db:
            java.lang.String r0 = "mTwistCardAnimView==null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x01e1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            goto L_0x01e9
        L_0x01e5:
            r16 = r1
            r17 = r2
        L_0x01e9:
            com.tencent.mm.plugin.sns.ad.widget.twistad.d r0 = new com.tencent.mm.plugin.sns.ad.widget.twistad.d
            r0.<init>(r4)
            r1 = 20
            r4.postDelayed(r0, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r1 = r16
            r2 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hr2.C98517j.onAnimationEnd(android.animation.Animator):void");
    }
}
