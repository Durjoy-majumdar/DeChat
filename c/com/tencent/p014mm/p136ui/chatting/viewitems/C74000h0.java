package com.tencent.p014mm.p136ui.chatting.viewitems;

import ck3.C67391b;
import com.tencent.p014mm.message.C68062c;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.h0 */
public class C74000h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74090l0.C74091a f217125d;

    /* renamed from: e */
    public final /* synthetic */ C68062c f217126e;

    /* renamed from: f */
    public final /* synthetic */ boolean f217127f;

    /* renamed from: g */
    public final /* synthetic */ C67391b f217128g;

    public C74000h0(C74090l0.C74091a aVar, C68062c cVar, boolean z, C67391b bVar) {
        this.f217125d = aVar;
        this.f217126e = cVar;
        this.f217127f = z;
        this.f217128g = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e9, code lost:
        if (((zj3.C79358g0) r5.f193278b.mo102812a(r6)).mo102456S0(r3.f217457t) != false) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r0 = r21
            java.lang.Class<f32.b> r1 = f32.C75672b.class
            com.tencent.mm.ui.chatting.viewitems.l0$a r2 = r0.f217125d
            android.view.View r2 = r2.clickArea
            int r2 = r2.getHeight()
            com.tencent.mm.ui.chatting.viewitems.l0$a r3 = r0.f217125d
            android.view.View r3 = r3.clickArea
            int r10 = r3.getWidth()
            r11 = 2
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r12 = 0
            r3[r12] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r13 = 1
            r3[r13] = r4
            java.lang.String r14 = "MicroMsg.ChattingItemAppMsgC2C"
            java.lang.String r4 = "renderEnvelope post， targetHeight:%s targetWidth:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r3)
            com.tencent.mm.ui.chatting.viewitems.l0$a r3 = r0.f217125d
            com.tencent.mm.message.c r4 = r0.f217126e
            boolean r8 = r0.f217127f
            if (r10 <= 0) goto L_0x0069
            if (r2 > 0) goto L_0x0037
            goto L_0x0069
        L_0x0037:
            te3.sf2 r7 = new te3.sf2
            r7.<init>()
            int r5 = r4.f195396m
            r7.f228201e = r5
            te3.tf2 r5 = new te3.tf2
            r5.<init>()
            r7.f228203g = r5
            if (r8 == 0) goto L_0x004c
            java.lang.String r6 = r4.f195390g
            goto L_0x004e
        L_0x004c:
            java.lang.String r6 = r4.f195388e
        L_0x004e:
            r5.f228244e = r6
            if (r8 == 0) goto L_0x0055
            java.lang.String r4 = r4.f195391h
            goto L_0x0057
        L_0x0055:
            java.lang.String r4 = r4.f195389f
        L_0x0057:
            r5.f228247h = r4
            di3.d r4 = di3.C86312j.m106911c(r1)
            f32.b r4 = (f32.C75672b) r4
            android.widget.ImageView r5 = r3.f217444g
            r9 = 0
            r3 = r4
            r4 = r5
            r5 = r2
            r6 = r10
            r3.ba0(r4, r5, r6, r7, r8, r9)
        L_0x0069:
            com.tencent.mm.ui.chatting.viewitems.l0$a r3 = r0.f217125d
            com.tencent.mm.message.c r4 = r0.f217126e
            boolean r8 = r0.f217127f
            if (r10 <= 0) goto L_0x00af
            if (r2 <= 0) goto L_0x00af
            java.lang.String r5 = r4.f195407x
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x00af
            java.lang.String r5 = r4.f195406w
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0084
            goto L_0x00af
        L_0x0084:
            te3.sf2 r7 = new te3.sf2
            r7.<init>()
            int r5 = r4.f195396m
            r7.f228201e = r5
            te3.tf2 r5 = new te3.tf2
            r5.<init>()
            r7.f228203g = r5
            java.lang.String r4 = r4.f195407x
            r5.f228244e = r4
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r4)
            r5.f228247h = r4
            di3.d r4 = di3.C86312j.m106911c(r1)
            f32.b r4 = (f32.C75672b) r4
            android.widget.ImageView r5 = r3.f217463z
            r9 = 8
            r3 = r4
            r4 = r5
            r5 = r2
            r6 = r10
            r3.ba0(r4, r5, r6, r7, r8, r9)
        L_0x00af:
            com.tencent.mm.ui.chatting.viewitems.l0$a r3 = r0.f217125d
            com.tencent.mm.message.c r4 = r0.f217126e
            ck3.b r5 = r0.f217128g
            java.lang.Class<zj3.g0> r6 = zj3.C79358g0.class
            java.lang.String r7 = r4.f195406w
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            r8 = 8
            if (r7 == 0) goto L_0x00c6
            com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.m88116e(r3)
            goto L_0x01d1
        L_0x00c6:
            if (r10 <= 0) goto L_0x01cc
            if (r2 > 0) goto L_0x00cc
            goto L_0x01cc
        L_0x00cc:
            r3.f217438F = r13
            java.lang.String r7 = r4.f195407x
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0132
            boolean r7 = r3.f217437E
            if (r7 == 0) goto L_0x00eb
            com.tencent.mm.ui.chatting.manager.a r7 = r5.f193278b
            xi.d r7 = r7.mo102812a(r6)
            zj3.g0 r7 = (zj3.C79358g0) r7
            r15 = r14
            long r13 = r3.f217457t
            boolean r7 = r7.mo102456S0(r13)
            if (r7 == 0) goto L_0x0133
        L_0x00eb:
            android.widget.ImageView r4 = r3.f217463z
            r4.setVisibility(r12)
            android.view.View r3 = r3.f217462y
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.mo10233c(r5)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C"
            java.lang.String r16 = "renderEnvelopeDynamic"
            java.lang.String r17 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;Lcom/tencent/mm/message/AppContentC2cMsgPiece;ZIILcom/tencent/mm/ui/chatting/context/ChattingContext;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r3
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C"
            java.lang.String r15 = "renderEnvelopeDynamic"
            java.lang.String r16 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;Lcom/tencent/mm/message/AppContentC2cMsgPiece;ZIILcom/tencent/mm/ui/chatting/context/ChattingContext;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01d1
        L_0x0132:
            r15 = r14
        L_0x0133:
            android.widget.ImageView r7 = r3.f217463z
            r7.setVisibility(r8)
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r13 = 24
            int r7 = kg3.C76577a.m92151b(r7, r13)
            int r7 = r10 - r7
            float r13 = (float) r2
            r14 = 1076792341(0x402e8c15, float:2.7273)
            float r13 = r13 * r14
            double r13 = (double) r13
            double r13 = java.lang.Math.ceil(r13)
            int r13 = (int) r13
            android.view.View r14 = r3.f217462y
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            r14.height = r2
            r14.width = r13
            int r16 = r13 - r7
            if (r16 > 0) goto L_0x0174
            java.lang.Object[] r9 = new java.lang.Object[r11]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r12] = r13
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13 = 1
            r9[r13] = r7
            java.lang.String r13 = "focus ！cropLeft <= 0, wantedWidth：%s, targetWidth：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r13, r9)
            r9 = 0
            goto L_0x0176
        L_0x0174:
            r9 = r16
        L_0x0176:
            android.view.View r13 = r3.f217462y
            boolean r15 = r13 instanceof com.tencent.p014mm.p136ui.chatting.view.BubbleCornorLayout
            if (r15 == 0) goto L_0x0181
            com.tencent.mm.ui.chatting.view.BubbleCornorLayout r13 = (com.tencent.p014mm.p136ui.chatting.view.BubbleCornorLayout) r13
            r13.setEXTRA_PADDING(r9)
        L_0x0181:
            android.view.View r9 = r3.f217462y
            r9.setLayoutParams(r14)
            com.tencent.mm.ui.chatting.viewitems.j0 r9 = new com.tencent.mm.ui.chatting.viewitems.j0
            r9.<init>()
            r3.f217436D = r9
            com.tencent.mm.chatting.component.ListScrollPAGView r13 = r3.f217461x
            r13.mo21212d(r9)
            com.tencent.mm.chatting.component.ListScrollPAGView r9 = r3.f217461x
            com.tencent.mm.ui.chatting.viewitems.k0 r13 = new com.tencent.mm.ui.chatting.viewitems.k0
            r13.<init>()
            r9.mo21213e(r13)
            com.tencent.mm.chatting.component.ListScrollPAGView r9 = r3.f217461x
            r7 = 1
            r9.setRepeatCount(r7)
            com.tencent.mm.chatting.component.ListScrollPAGView r7 = r3.f217461x
            r7.setScaleMode(r11)
            te3.sf2 r7 = new te3.sf2
            r7.<init>()
            int r13 = r4.f195396m
            r7.f228201e = r13
            te3.tf2 r13 = new te3.tf2
            r13.<init>()
            r7.f228203g = r13
            java.lang.String r14 = r4.f195406w
            r13.f228259w = r14
            java.lang.String r4 = r4.f195408y
            r13.f228239A = r4
            com.tencent.mm.ui.chatting.manager.a r4 = r5.f193278b
            xi.d r4 = r4.mo102812a(r6)
            zj3.g0 r4 = (zj3.C79358g0) r4
            r5 = 1
            r4.mo102457Y0(r7, r3, r5)
            goto L_0x01d1
        L_0x01cc:
            com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.m88116e(r3)
            r3.f217438F = r12
        L_0x01d1:
            com.tencent.mm.ui.chatting.viewitems.l0$a r3 = r0.f217125d
            com.tencent.mm.message.c r4 = r0.f217126e
            boolean r5 = r0.f217127f
            if (r5 == 0) goto L_0x01dc
            java.lang.String r6 = r4.f195402s
            goto L_0x01de
        L_0x01dc:
            java.lang.String r6 = r4.f195400q
        L_0x01de:
            if (r5 == 0) goto L_0x01e3
            java.lang.String r7 = r4.f195403t
            goto L_0x01e5
        L_0x01e3:
            java.lang.String r7 = r4.f195401r
        L_0x01e5:
            r13 = 0
            if (r10 <= 0) goto L_0x02da
            if (r2 <= 0) goto L_0x02da
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 != 0) goto L_0x02da
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r2 == 0) goto L_0x01f8
            goto L_0x02da
        L_0x01f8:
            android.widget.ImageView r2 = r3.f217448k
            r2.setVisibility(r12)
            android.widget.ImageView r2 = r3.f217448k
            r2.setImageBitmap(r13)
            android.widget.TextView r2 = r3.userTV
            if (r2 == 0) goto L_0x0255
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0255
            android.widget.TextView r2 = r3.userTV
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0255
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 7
            int r2 = kg3.C76577a.m92151b(r2, r6)
            android.widget.TextView r6 = r3.userTV
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 3
            int r7 = kg3.C76577a.m92151b(r7, r8)
            int r7 = r7 / r11
            r6.bottomMargin = r7
            boolean r7 = com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.m88114c()
            if (r7 == 0) goto L_0x0245
            android.widget.TextView r7 = r3.userTV
            r7.setIncludeFontPadding(r12)
            goto L_0x024b
        L_0x0245:
            android.widget.TextView r7 = r3.userTV
            r8 = 1
            r7.setIncludeFontPadding(r8)
        L_0x024b:
            android.widget.TextView r7 = r3.userTV
            r7.setPadding(r2, r12, r2, r12)
            android.widget.TextView r2 = r3.userTV
            r2.setLayoutParams(r6)
        L_0x0255:
            r2 = 1067450368(0x3fa00000, float:1.25)
            android.view.View r6 = r3.clickArea
            int r6 = r6.getHeight()
            float r6 = (float) r6
            r7 = 1069128090(0x3fb9999a, float:1.45)
            float r6 = r6 * r7
            int r15 = (int) r6
            float r6 = (float) r15
            float r6 = r6 * r2
            int r2 = (int) r6
            android.widget.ImageView r6 = r3.f217448k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            r6.height = r15
            r6.width = r2
            android.widget.ImageView r7 = r3.f217448k
            r7.setLayoutParams(r6)
            android.view.View r6 = r3.clickArea
            int r6 = r6.getHeight()
            double r6 = (double) r6
            r8 = 4601778099247172813(0x3fdccccccccccccd, double:0.45)
            double r6 = r6 * r8
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r8
            int r6 = (int) r6
            r3.f217459v = r6
            android.view.View r6 = r3.clickArea
            int r6 = r6.getWidth()
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 4
            int r7 = kg3.C76577a.m92151b(r7, r8)
            int r7 = r7 + r2
            int r6 = r6 - r7
            r3.f217460w = r6
            int r6 = r3.f217459v
            com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.m88117f(r3, r6, r5)
            te3.sf2 r6 = new te3.sf2
            r6.<init>()
            int r7 = r4.f195396m
            r6.f228201e = r7
            te3.tf2 r7 = new te3.tf2
            r7.<init>()
            r6.f228203g = r7
            if (r5 == 0) goto L_0x02ba
            java.lang.String r8 = r4.f195402s
            goto L_0x02bc
        L_0x02ba:
            java.lang.String r8 = r4.f195400q
        L_0x02bc:
            r7.f228253q = r8
            if (r5 == 0) goto L_0x02c3
            java.lang.String r4 = r4.f195403t
            goto L_0x02c5
        L_0x02c3:
            java.lang.String r4 = r4.f195401r
        L_0x02c5:
            r7.f228254r = r4
            di3.d r1 = di3.C86312j.m106911c(r1)
            r13 = r1
            f32.b r13 = (f32.C75672b) r13
            android.widget.ImageView r14 = r3.f217448k
            r16 = r2
            r17 = r6
            r18 = r5
            r13.mo95327sy(r14, r15, r16, r17, r18)
            goto L_0x02e7
        L_0x02da:
            android.widget.ImageView r1 = r3.f217448k
            r1.setVisibility(r8)
            android.widget.ImageView r1 = r3.f217448k
            r1.setImageBitmap(r13)
            com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.m88117f(r3, r12, r5)
        L_0x02e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74000h0.run():void");
    }
}
