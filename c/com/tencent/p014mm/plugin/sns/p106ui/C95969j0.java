package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C54020j;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import g34.C116918i;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kr2.C76634a;
import p159gw.C8462g;
import te3.C101802kr2;
import te3.f94;

/* renamed from: com.tencent.mm.plugin.sns.ui.j0 */
public class C95969j0 extends C96157q {

    /* renamed from: c */
    public MMActivity f280226c;

    /* renamed from: d */
    public String f280227d = "";

    /* renamed from: e */
    public String f280228e;

    /* renamed from: f */
    public String f280229f;

    /* renamed from: g */
    public String f280230g;

    /* renamed from: h */
    public String f280231h;

    /* renamed from: i */
    public boolean f280232i;

    /* renamed from: j */
    public final int f280233j = 34;

    /* renamed from: k */
    public C54020j f280234k;

    /* renamed from: l */
    public View f280235l;

    /* renamed from: m */
    public ImageView f280236m;

    /* renamed from: n */
    public TextView f280237n;

    /* renamed from: o */
    public View f280238o;

    public C95969j0(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "context");
        this.f280226c = mMActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c0, code lost:
        if (r6 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        if (r6 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0326  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo132124a() {
        /*
            r28 = this;
            r0 = r28
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.Class<ir.n> r2 = p565ir.C60606n.class
            java.lang.String r3 = "initView"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.FinderLiveWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            com.tencent.mm.ui.MMActivity r5 = r0.f280226c
            java.lang.String r6 = "context"
            r7 = 0
            if (r5 == 0) goto L_0x0356
            android.view.LayoutInflater r5 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r5)
            r8 = 2131497653(0x7f0c12b5, float:1.8618905E38)
            android.view.View r5 = r5.inflate(r8, r7)
            java.lang.String r8 = "getInflater(context).inf…s_finder_live_item, null)"
            gy3.C87412m.m108593f(r5, r8)
            r0.f280235l = r5
            r8 = 2131313987(0x7f094543, float:1.8246386E38)
            android.view.View r5 = r5.findViewById(r8)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f280236m = r5
            android.view.View r5 = r0.f280235l
            java.lang.String r8 = "layout"
            if (r5 == 0) goto L_0x0351
            r9 = 2131302686(0x7f09191e, float:1.8223465E38)
            android.view.View r5 = r5.findViewById(r9)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f280237n = r5
            android.view.View r5 = r0.f280235l
            if (r5 == 0) goto L_0x034c
            r9 = 2131304550(0x7f092066, float:1.8227246E38)
            android.view.View r5 = r5.findViewById(r9)
            r0.f280238o = r5
            ad0.j r5 = r0.f280234k
            if (r5 == 0) goto L_0x033f
            gy3.C87412m.m108591d(r5)
            te3.p81 r5 = r5.mo74686c()
            if (r5 == 0) goto L_0x033f
            ad0.j r5 = r0.f280234k
            gy3.C87412m.m108591d(r5)
            te3.p81 r5 = r5.mo74686c()
            com.tencent.mm.ui.MMActivity r9 = r0.f280226c
            if (r9 == 0) goto L_0x033a
            int[] r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2.m121130b(r9)
            r10 = 0
            r11 = r9[r10]
            r12 = 1
            r9 = r9[r12]
            com.tencent.mm.ui.MMActivity r13 = r0.f280226c
            if (r13 == 0) goto L_0x0335
            android.util.Pair r6 = ad0.C91999u.m115565k(r11, r9, r13, r10)
            java.lang.Object r6 = r6.first
            r9 = r6
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r11 = 1080033280(0x40600000, float:3.5)
            float r6 = r6 * r11
            r11 = 1077936128(0x40400000, float:3.0)
            float r6 = r6 / r11
            int r6 = (int) r6
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            java.lang.String r13 = "smallSide"
            gy3.C87412m.m108593f(r9, r13)
            int r13 = r9.intValue()
            r11.<init>(r13, r6)
            android.view.View r6 = r0.f280235l
            if (r6 == 0) goto L_0x0330
            r6.setLayoutParams(r11)
            android.view.View r6 = r0.f280235l
            if (r6 == 0) goto L_0x032b
            r6.requestLayout()
            java.lang.String r6 = r5.f184783i
            if (r6 == 0) goto L_0x00b9
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r6 = 0
            goto L_0x00ba
        L_0x00b9:
            r6 = 1
        L_0x00ba:
            java.lang.String r11 = ""
            if (r6 != 0) goto L_0x00c5
            java.lang.String r6 = r5.f184783i
            if (r6 != 0) goto L_0x00c3
        L_0x00c2:
            r6 = r11
        L_0x00c3:
            r14 = r6
            goto L_0x00db
        L_0x00c5:
            java.lang.String r6 = r5.f184789r
            if (r6 == 0) goto L_0x00d2
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r6 = 0
            goto L_0x00d3
        L_0x00d2:
            r6 = 1
        L_0x00d3:
            if (r6 != 0) goto L_0x00da
            java.lang.String r6 = r5.f184789r
            if (r6 != 0) goto L_0x00c3
            goto L_0x00c2
        L_0x00da:
            r14 = r11
        L_0x00db:
            int r6 = r5.f184772Q
            java.lang.String r13 = "getService(IFinderCommon…atureService::class.java)"
            r15 = 8
            if (r6 != r12) goto L_0x010e
            di3.d r1 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r1, r13)
            r13 = r1
            ht1.t1 r13 = (ht1.C60200t1) r13
            android.widget.ImageView r1 = r0.f280236m
            r16 = 0
            r17 = 4
            r18 = 0
            r6 = 8
            r15 = r1
            ht1.C60200t1.C60201a.m70367e(r13, r14, r15, r16, r17, r18)
            android.widget.TextView r1 = r0.f280237n
            if (r1 != 0) goto L_0x0100
            goto L_0x0105
        L_0x0100:
            java.lang.String r13 = r5.f184773R
            r1.setText(r13)
        L_0x0105:
            android.widget.TextView r1 = r0.f280237n
            if (r1 != 0) goto L_0x010a
            goto L_0x012d
        L_0x010a:
            r1.setVisibility(r10)
            goto L_0x012d
        L_0x010e:
            r6 = 8
            di3.d r1 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r1, r13)
            r13 = r1
            ht1.t1 r13 = (ht1.C60200t1) r13
            android.widget.ImageView r15 = r0.f280236m
            r16 = 0
            r17 = 4
            r18 = 0
            ht1.C60200t1.C60201a.m70370h(r13, r14, r15, r16, r17, r18)
            android.widget.TextView r1 = r0.f280237n
            if (r1 != 0) goto L_0x012a
            goto L_0x012d
        L_0x012a:
            r1.setVisibility(r6)
        L_0x012d:
            di3.d r1 = di3.C86312j.m106911c(r2)
            ir.n r1 = (p565ir.C60606n) r1
            android.view.View r13 = r0.f280235l
            if (r13 == 0) goto L_0x0326
            r14 = 2131303693(0x7f091d0d, float:1.8225508E38)
            android.view.View r13 = r13.findViewById(r14)
            int r14 = r5.f184759C
            r1.Ej0(r13, r10, r14)
            java.lang.String r1 = r5.f184765I
            if (r1 == 0) goto L_0x0150
            int r1 = r1.length()
            if (r1 != 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r1 = 0
            goto L_0x0151
        L_0x0150:
            r1 = 1
        L_0x0151:
            if (r1 != 0) goto L_0x02d4
            java.lang.String r1 = r5.f184768L
            if (r1 == 0) goto L_0x0160
            int r1 = r1.length()
            if (r1 != 0) goto L_0x015e
            goto L_0x0160
        L_0x015e:
            r1 = 0
            goto L_0x0161
        L_0x0160:
            r1 = 1
        L_0x0161:
            if (r1 != 0) goto L_0x02d4
            java.lang.String r1 = r5.f184768L
            java.lang.String r13 = "1"
            boolean r1 = gy3.C87412m.m108589b(r1, r13)
            if (r1 == 0) goto L_0x02d4
            android.view.View r1 = r0.f280238o
            if (r1 == 0) goto L_0x0283
            r13 = 2131304546(0x7f092062, float:1.8227238E38)
            android.view.View r13 = r1.findViewById(r13)
            java.lang.String r14 = "it.findViewById(R.id.finder_olympic_invite_bg)"
            gy3.C87412m.m108593f(r13, r14)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r14 = 2131304547(0x7f092063, float:1.822724E38)
            android.view.View r14 = r1.findViewById(r14)
            java.lang.String r15 = "it.findViewById(R.id.finder_olympic_invite_icon)"
            gy3.C87412m.m108593f(r14, r15)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            di3.d r15 = di3.C86312j.m106911c(r2)
            ir.n r15 = (p565ir.C60606n) r15
            ks3.t r7 = ks3.C61165t.SHARE_BG
            r10 = 2131232945(0x7f0808b1, float:1.8082014E38)
            r15.x30(r13, r7, r10)
            di3.d r2 = di3.C86312j.m106911c(r2)
            ir.n r2 = (p565ir.C60606n) r2
            ks3.t r7 = ks3.C61165t.SHARE_ICON
            r10 = 2131232946(0x7f0808b2, float:1.8082016E38)
            r2.x30(r14, r7, r10)
            r2 = 2131304549(0x7f092065, float:1.8227244E38)
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r7 = "it.findViewById(R.id.finder_olympic_invite_text)"
            gy3.C87412m.m108593f(r2, r7)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r7 = 1096810496(0x41600000, float:14.0)
            r2.setTextSize(r12, r7)
            r10 = 2131304548(0x7f092064, float:1.8227242E38)
            android.view.View r10 = r1.findViewById(r10)
            java.lang.String r13 = "it.findViewById(R.id.finder_olympic_invite_name)"
            gy3.C87412m.m108593f(r10, r13)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r10.setTextSize(r12, r7)
            r7 = 2131304551(0x7f092067, float:1.8227248E38)
            android.view.View r1 = r1.findViewById(r7)
            java.lang.String r7 = "it.findViewById(R.id.finder_olympic_invite_you)"
            gy3.C87412m.m108593f(r1, r7)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7 = 1097859072(0x41700000, float:15.0)
            r1.setTextSize(r12, r7)
            android.text.TextPaint r7 = r2.getPaint()
            r13 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r7, r13)
            android.text.TextPaint r7 = r10.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r7, r13)
            android.text.TextPaint r1 = r1.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1, r13)
            java.lang.String r1 = r5.f184766J
            if (r1 == 0) goto L_0x020a
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0208
            goto L_0x020a
        L_0x0208:
            r1 = 0
            goto L_0x020b
        L_0x020a:
            r1 = 1
        L_0x020b:
            if (r1 == 0) goto L_0x0212
            r10.setVisibility(r6)
            r1 = 0
            goto L_0x022b
        L_0x0212:
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r13 = r5.f184766J
            android.text.SpannableString r1 = r1.mo107057T1(r7, r13)
            r10.setText(r1)
            r1 = 0
            r10.setVisibility(r1)
        L_0x022b:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r10 = 2131829356(0x7f11226c, float:1.9291679E38)
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.String r5 = r5.f184765I
            r13[r1] = r5
            java.lang.String r1 = r7.getString(r10, r13)
            java.lang.String r5 = "getContext().resources.g…, shareObject.relayIndex)"
            gy3.C87412m.m108593f(r1, r5)
            int r5 = r9.intValue()
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 12
            int r7 = kg3.C76577a.m92151b(r7, r9)
            int r7 = r7 * 2
            int r23 = r5 - r7
            java.lang.String r5 = "\n"
            r7 = 0
            java.lang.String r5 = z04.C112551y.m153814n(r1, r5, r11, r7)
            android.text.StaticLayout r7 = new android.text.StaticLayout
            r20 = 0
            int r21 = r5.length()
            android.text.TextPaint r22 = r2.getPaint()
            android.text.Layout$Alignment r24 = android.text.Layout.Alignment.ALIGN_NORMAL
            r25 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            r27 = 1
            r18 = r7
            r19 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r7 = r7.getLineCount()
            if (r7 > r12) goto L_0x0280
            r1 = r5
        L_0x0280:
            r2.setText(r1)
        L_0x0283:
            android.view.View r9 = r0.f280238o
            if (r9 != 0) goto L_0x0288
            goto L_0x02cb
        L_0x0288:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r5)
            java.lang.Object[] r19 = r1.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/FinderLiveWidget"
            java.lang.String r21 = "initView"
            java.lang.String r22 = "()Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r9
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/FinderLiveWidget"
            java.lang.String r11 = "initView"
            java.lang.String r12 = "()Landroid/view/View;"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x02cb:
            android.widget.ImageView r1 = r0.f280236m
            if (r1 != 0) goto L_0x02d0
            goto L_0x031f
        L_0x02d0:
            r1.setVisibility(r6)
            goto L_0x0324
        L_0x02d4:
            android.view.View r9 = r0.f280238o
            if (r9 != 0) goto L_0x02d9
            goto L_0x031b
        L_0x02d9:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1.mo10233c(r2)
            java.lang.Object[] r19 = r1.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/FinderLiveWidget"
            java.lang.String r21 = "initView"
            java.lang.String r22 = "()Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r9
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/FinderLiveWidget"
            java.lang.String r11 = "initView"
            java.lang.String r12 = "()Landroid/view/View;"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x031b:
            android.widget.ImageView r1 = r0.f280236m
            if (r1 != 0) goto L_0x0320
        L_0x031f:
            goto L_0x0324
        L_0x0320:
            r2 = 0
            r1.setVisibility(r2)
        L_0x0324:
            r1 = 0
            goto L_0x0340
        L_0x0326:
            gy3.C87412m.m108603p(r8)
            r1 = 0
            throw r1
        L_0x032b:
            r1 = r7
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x0330:
            r1 = r7
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x0335:
            r1 = r7
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x033a:
            r1 = r7
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x033f:
            r1 = r7
        L_0x0340:
            android.view.View r2 = r0.f280235l
            if (r2 == 0) goto L_0x0348
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r2
        L_0x0348:
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x034c:
            r1 = r7
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x0351:
            r1 = r7
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x0356:
            r1 = r7
            gy3.C87412m.m108603p(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C95969j0.mo132124a():android.view.View");
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        Map<String, String> parseXml;
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        MMActivity mMActivity = this.f280226c;
        if (mMActivity != null) {
            String nullAs = Util.nullAs(mMActivity.getIntent().getStringExtra("Ksnsupload_title"), "");
            C87412m.m108593f(nullAs, "nullAs(context!!.intent.…dUI.KSnsUploadTitle), \"\")");
            this.f280227d = nullAs;
            MMActivity mMActivity2 = this.f280226c;
            if (mMActivity2 != null) {
                this.f280230g = Util.nullAs(mMActivity2.getIntent().getStringExtra("KPublisherId"), "");
                MMActivity mMActivity3 = this.f280226c;
                if (mMActivity3 != null) {
                    this.f280231h = Util.nullAs(mMActivity3.getIntent().getStringExtra("reportSessionId"), "");
                    MMActivity mMActivity4 = this.f280226c;
                    if (mMActivity4 != null) {
                        this.f280228e = Util.nullAs(mMActivity4.getIntent().getStringExtra("Ksnsupload_appid"), "");
                        MMActivity mMActivity5 = this.f280226c;
                        if (mMActivity5 != null) {
                            this.f280229f = Util.nullAs(mMActivity5.getIntent().getStringExtra("Ksnsupload_appname"), "");
                            MMActivity mMActivity6 = this.f280226c;
                            if (mMActivity6 != null) {
                                this.f280232i = mMActivity6.getIntent().getBooleanExtra("ksnsupload_finder_need_report", false);
                                SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                                MMActivity mMActivity7 = this.f280226c;
                                if (mMActivity7 != null) {
                                    snsReportHelper.f275525S = mMActivity7.getIntent().getLongExtra("finder_feed_id", 0);
                                    MMActivity mMActivity8 = this.f280226c;
                                    if (mMActivity8 != null) {
                                        String stringExtra = mMActivity8.getIntent().getStringExtra("ksnsupload_finder_live_xml");
                                        if (!Util.isNullOrNil(stringExtra) && (parseXml = XmlParser.parseXml(stringExtra, "finderLive", (String) null)) != null) {
                                            C54020j jVar = new C54020j();
                                            this.f280234k = jVar;
                                            jVar.mo74688e("", parseXml);
                                        }
                                        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
                                        return;
                                    }
                                    C87412m.m108603p("context");
                                    throw null;
                                }
                                C87412m.m108603p("context");
                                throw null;
                            }
                            C87412m.m108603p("context");
                            throw null;
                        }
                        C87412m.m108603p("context");
                        throw null;
                    }
                    C87412m.m108603p("context");
                    throw null;
                }
                C87412m.m108603p("context");
                throw null;
            }
            C87412m.m108603p("context");
            throw null;
        }
        C87412m.m108603p("context");
        throw null;
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        C116918i iVar2 = iVar;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        int k = mo133250k();
        MMActivity mMActivity = this.f280226c;
        if (mMActivity != null) {
            C94945s2 s2Var = new C94945s2(k, mMActivity);
            C54020j jVar = this.f280234k;
            if (jVar != null) {
                s2Var.mo131233G(jVar);
            }
            C87412m.m108591d(pInt);
            pInt.value = s2Var.mo131253j();
            if (i3 > C76634a.f224255a) {
                s2Var.mo131261r(1, 4);
            }
            s2Var.mo131267x(this.f280227d);
            s2Var.mo131260q(str);
            MMActivity mMActivity2 = this.f280226c;
            if (mMActivity2 != null) {
                s2Var.mo131266w(Util.nullAs(mMActivity2.getIntent().getStringExtra("ksnsupload_link_desc"), ""));
                s2Var.mo131262s(linkedList);
                int i6 = i;
                s2Var.mo131228B(i);
                if (z) {
                    s2Var.mo131264u(1);
                } else {
                    s2Var.mo131264u(0);
                }
                s2Var.mo131263t(list2);
                LinkedList linkedList2 = new LinkedList();
                if (list != null) {
                    new LinkedList();
                    List<String> gt = ((C8462g) C86312j.m106911c(C8462g.class)).mo9266gt();
                    for (String next : list) {
                        if (gt != null && !gt.contains(next)) {
                            f94 f94 = new f94();
                            f94.f298255d = next;
                            linkedList2.add(f94);
                        }
                    }
                }
                if (iVar2 != null) {
                    s2Var.mo131241O(iVar2.f350347d, iVar2.f350348e);
                }
                s2Var.mo131243Q(linkedList2);
                if (!Util.isNullOrNil(this.f280228e)) {
                    s2Var.mo131231E(this.f280228e);
                }
                if (!Util.isNullOrNil(this.f280229f)) {
                    s2Var.mo131230D(Util.nullAs(this.f280229f, ""));
                }
                s2Var.mo131265v(kr22);
                s2Var.mo131259p(str2);
                s2Var.mo131229C(this.f280230g);
                s2Var.mo131232F(this.f280231h);
                mo133779j(s2Var);
                MMActivity mMActivity3 = this.f280226c;
                if (mMActivity3 != null) {
                    mo133251l(mMActivity3, s2Var);
                    int i7 = s2Var.mo131252i();
                    if (this.f280232i) {
                        SnsReportHelper.f275506m0.f275524R = i7;
                    }
                    C94866e1.gy0().mo131192c();
                    MMActivity mMActivity4 = this.f280226c;
                    if (mMActivity4 != null) {
                        mMActivity4.finish();
                        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
                        return false;
                    }
                    C87412m.m108603p("context");
                    throw null;
                }
                C87412m.m108603p("context");
                throw null;
            }
            C87412m.m108603p("context");
            throw null;
        }
        C87412m.m108603p("context");
        throw null;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        boolean z = this.f280234k != null;
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return z;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
    }

    /* renamed from: k */
    public int mo133250k() {
        SnsMethodCalculate.markStartTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        int i = this.f280233j;
        SnsMethodCalculate.markEndTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return i;
    }

    /* renamed from: l */
    public void mo133251l(MMActivity mMActivity, C94945s2 s2Var) {
        SnsMethodCalculate.markStartTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(s2Var, "packHelper");
        SnsMethodCalculate.markEndTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return false;
    }
}
