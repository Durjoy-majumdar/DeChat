package fu2;

import android.content.Context;
import gy3.C87412m;

/* renamed from: fu2.p */
public final class C98022p extends C97987a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98022p(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02d1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71269a(android.view.View r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "click"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveInteractionClick"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "start popLikeCommentMenuWindow view:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " info:"
            r3.append(r4)
            gu2.b r4 = r27.mo137310c()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.Improve.CommentClick"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            if (r0 == 0) goto L_0x02dc
            gu2.b r3 = r27.mo137310c()
            if (r3 != 0) goto L_0x0036
            goto L_0x02dc
        L_0x0036:
            ju2.e r3 = ju2.C99045e.f290344a
            android.content.Context r4 = r27.mo137309b()
            gu2.b r5 = r27.mo137310c()
            gy3.C87412m.m108591d(r5)
            int r6 = r27.mo137316j()
            java.lang.String r7 = "showLikeCommentWindow"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.String r9 = "context"
            gy3.C87412m.m108594g(r4, r9)
            android.widget.PopupWindow r9 = ju2.C99045e.f290347d
            r10 = 0
            r11 = 1
            r12 = 0
            if (r9 != 0) goto L_0x0104
            java.lang.String r9 = "setupWindow"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            android.view.LayoutInflater r4 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r4)
            r13 = 2131497629(0x7f0c129d, float:1.8618857E38)
            android.view.View r4 = r4.inflate(r13, r10)
            android.widget.PopupWindow r13 = new android.widget.PopupWindow
            r14 = -2
            r13.<init>(r4, r14, r14)
            ju2.C99045e.f290347d = r13
            r13.setOutsideTouchable(r12)
            android.widget.PopupWindow r13 = ju2.C99045e.f290347d
            if (r13 != 0) goto L_0x007c
            goto L_0x007f
        L_0x007c:
            r13.setTouchable(r11)
        L_0x007f:
            r4.measure(r12, r12)
            int r13 = r4.getMeasuredWidth()
            ju2.C99045e.f290348e = r13
            int r4 = r4.getMeasuredHeight()
            ju2.C99045e.f290349f = r4
            android.widget.PopupWindow r4 = ju2.C99045e.f290347d
            if (r4 != 0) goto L_0x0093
            goto L_0x0096
        L_0x0093:
            r4.setAnimationStyle(r12)
        L_0x0096:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            java.lang.String r4 = "setupAnimation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            android.view.animation.TranslateAnimation r9 = new android.view.animation.TranslateAnimation
            r14 = 1
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            r21 = 0
            r13 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            ju2.C99045e.f290345b = r9
            r13 = 100
            r9.setStartOffset(r13)
            android.view.animation.TranslateAnimation r9 = ju2.C99045e.f290345b
            r10 = 200(0xc8, double:9.9E-322)
            if (r9 != 0) goto L_0x00c2
            goto L_0x00c5
        L_0x00c2:
            r9.setDuration(r10)
        L_0x00c5:
            android.view.animation.TranslateAnimation r9 = ju2.C99045e.f290345b
            if (r9 == 0) goto L_0x00d1
            ju2.i r15 = new ju2.i
            r15.<init>()
            r9.setAnimationListener(r15)
        L_0x00d1:
            android.view.animation.TranslateAnimation r9 = new android.view.animation.TranslateAnimation
            r19 = 1
            r20 = 0
            r21 = 1
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1
            r24 = 0
            r25 = 1
            r26 = 0
            r18 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            ju2.C99045e.f290346c = r9
            r9.setStartOffset(r13)
            android.view.animation.TranslateAnimation r9 = ju2.C99045e.f290346c
            if (r9 != 0) goto L_0x00f2
            goto L_0x00f5
        L_0x00f2:
            r9.setDuration(r10)
        L_0x00f5:
            android.view.animation.TranslateAnimation r9 = ju2.C99045e.f290346c
            if (r9 == 0) goto L_0x0101
            ju2.j r10 = new ju2.j
            r10.<init>()
            r9.setAnimationListener(r10)
        L_0x0101:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
        L_0x0104:
            android.widget.PopupWindow r4 = ju2.C99045e.f290347d
            if (r4 == 0) goto L_0x0112
            boolean r4 = r4.isShowing()
            r9 = 1
            if (r4 != r9) goto L_0x0113
            r16 = 1
            goto L_0x0115
        L_0x0112:
            r9 = 1
        L_0x0113:
            r16 = 0
        L_0x0115:
            if (r16 == 0) goto L_0x012e
            java.lang.String r0 = "dismissCommentWindow"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            ju2.d r3 = new ju2.d
            r3.<init>(r9)
            o40.C61926c.m72668M(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            r17 = 0
            goto L_0x02b5
        L_0x012e:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 4
            int r4 = kg3.C76577a.m92151b(r4, r9)
            android.widget.PopupWindow r9 = ju2.C99045e.f290347d
            if (r9 == 0) goto L_0x014c
            int r10 = ju2.C99045e.f290348e
            int r10 = -r10
            int r10 = r10 - r4
            int r4 = ju2.C99045e.f290349f
            int r11 = r28.getHeight()
            int r4 = r4 + r11
            int r4 = -r4
            int r4 = r4 / 2
            r9.showAsDropDown(r0, r10, r4)
        L_0x014c:
            android.widget.PopupWindow r0 = ju2.C99045e.f290347d
            if (r0 == 0) goto L_0x0155
            android.view.View r0 = r0.getContentView()
            goto L_0x0156
        L_0x0155:
            r0 = 0
        L_0x0156:
            java.lang.String r4 = "loadContentLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            if (r0 != 0) goto L_0x0165
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            r17 = 0
            goto L_0x02a3
        L_0x0165:
            android.content.Context r9 = r0.getContext()
            r10 = 2131296810(0x7f09022a, float:1.8211547E38)
            android.view.View r10 = r0.findViewById(r10)
            r11 = 2131296800(0x7f090220, float:1.8211527E38)
            android.view.View r11 = r0.findViewById(r11)
            com.tencent.mm.ui.widget.imageview.WeImageView r11 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r11
            r13 = 2131296811(0x7f09022b, float:1.821155E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131296842(0x7f09024a, float:1.8211612E38)
            android.view.View r14 = r0.findViewById(r14)
            r15 = 2131296843(0x7f09024b, float:1.8211614E38)
            android.view.View r15 = r0.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r12 = 2131296841(0x7f090249, float:1.821161E38)
            android.view.View r0 = r0.findViewById(r12)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            r12 = 2131165329(0x7f070091, float:1.7944872E38)
            int r12 = kg3.C76577a.m92157h(r9, r12)
            r3.mo138388b(r0, r12, r12)
            r3.mo138388b(r11, r12, r12)
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r14, r3)
            r3 = r14
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r11 = 0
            r3.setClipToPadding(r11)
            r3.setClipChildren(r11)
            java.lang.String r11 = "isInValid"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            long r19 = r5.mo142401p2()
            r21 = 0
            int r23 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r23 != 0) goto L_0x01cd
            r19 = 1
            goto L_0x01cf
        L_0x01cd:
            r19 = 0
        L_0x01cf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            r12 = 2131756329(0x7f100529, float:1.9143562E38)
            if (r19 == 0) goto L_0x021d
            r11 = 0
            r10.setEnabled(r11)
            r3.setEnabled(r11)
            android.content.res.Resources r3 = r9.getResources()
            r5 = 2131101518(0x7f06074e, float:1.7815448E38)
            int r3 = r3.getColor(r5)
            r13.setTextColor(r3)
            android.content.res.Resources r3 = r9.getResources()
            int r3 = r3.getColor(r5)
            r15.setTextColor(r3)
            r0.setImageResource(r12)
            android.content.res.Resources r3 = r9.getResources()
            r5 = 2131099940(0x7f060124, float:1.7812247E38)
            int r3 = r3.getColor(r5)
            r0.setIconColor(r3)
            r0 = 2131837012(0x7f114054, float:1.9307207E38)
            java.lang.String r0 = r9.getString(r0)
            r15.setText(r0)
            r0 = 0
            r10.setOnClickListener(r0)
            r14.setOnClickListener(r0)
            r17 = r0
            goto L_0x02a0
        L_0x021d:
            r11 = 1
            r17 = 0
            r10.setEnabled(r11)
            r3.setEnabled(r11)
            android.content.res.Resources r3 = r9.getResources()
            r11 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r3 = r3.getColor(r11)
            r13.setTextColor(r3)
            android.content.res.Resources r3 = r9.getResources()
            int r3 = r3.getColor(r11)
            r15.setTextColor(r3)
            int r3 = r5.getLikeFlag()
            if (r3 != 0) goto L_0x0268
            r0.setImageResource(r12)
            android.content.res.Resources r3 = r9.getResources()
            r11 = 2131099940(0x7f060124, float:1.7812247E38)
            int r3 = r3.getColor(r11)
            r0.setIconColor(r3)
            r0 = 2131837012(0x7f114054, float:1.9307207E38)
            java.lang.String r3 = r9.getString(r0)
            r15.setText(r3)
            java.lang.String r0 = r9.getString(r0)
            r15.setContentDescription(r0)
            goto L_0x0290
        L_0x0268:
            r3 = 2131756063(0x7f10041f, float:1.9143023E38)
            r0.setImageResource(r3)
            android.content.res.Resources r3 = r9.getResources()
            r11 = 2131099897(0x7f0600f9, float:1.781216E38)
            int r3 = r3.getColor(r11)
            r0.setIconColor(r3)
            r0 = 2131836943(0x7f11400f, float:1.9307067E38)
            java.lang.String r0 = r9.getString(r0)
            r15.setText(r0)
            r0 = 2131836724(0x7f113f34, float:1.9306623E38)
            java.lang.String r0 = r9.getString(r0)
            r15.setContentDescription(r0)
        L_0x0290:
            ju2.f r0 = new ju2.f
            r0.<init>(r5, r6)
            r10.setOnClickListener(r0)
            ju2.g r0 = new ju2.g
            r0.<init>(r5)
            r14.setOnClickListener(r0)
        L_0x02a0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
        L_0x02a3:
            android.widget.PopupWindow r0 = ju2.C99045e.f290347d
            if (r0 == 0) goto L_0x02b2
            android.view.View r0 = r0.getContentView()
            if (r0 == 0) goto L_0x02b2
            android.view.animation.TranslateAnimation r3 = ju2.C99045e.f290345b
            r0.startAnimation(r3)
        L_0x02b2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        L_0x02b5:
            gu2.b r0 = r27.mo137310c()
            if (r0 == 0) goto L_0x02c3
            int r0 = r0.getLikeFlag()
            if (r0 != 0) goto L_0x02c3
            r12 = 1
            goto L_0x02c4
        L_0x02c3:
            r12 = 0
        L_0x02c4:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            gu2.b r3 = r27.mo137310c()
            if (r3 == 0) goto L_0x02d1
            java.lang.String r10 = r3.mo137504B2()
            goto L_0x02d3
        L_0x02d1:
            r10 = r17
        L_0x02d3:
            r3 = 1
            r3 = r3 ^ r12
            r0.mo131382o(r10, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x02dc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fu2.C98022p.mo71269a(android.view.View):void");
    }
}
