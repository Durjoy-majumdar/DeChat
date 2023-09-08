package com.tencent.p014mm.plugin.card.p031ui;

import android.widget.AdapterView;

/* renamed from: com.tencent.mm.plugin.card.ui.g */
public class C18595g implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CardDetailUIContoller f51918d;

    public C18595g(CardDetailUIContoller cardDetailUIContoller) {
        this.f51918d = cardDetailUIContoller;
    }

    /* JADX WARNING: Removed duplicated region for block: B:95:0x05d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r26, android.view.View r27, int r28, long r29) {
        /*
            r25 = this;
            r6 = r25
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r26
            r0.add(r1)
            r1 = r27
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r0.add(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r29)
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$1"
            java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r2 = "onItemClick"
            java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            r4 = r25
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            java.util.List<hz0.b> r0 = r0.f51778G
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r1 = r28
            java.lang.Object r0 = r0.get(r1)
            hz0.b r0 = (hz0.C21034b) r0
            java.lang.String r1 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r2 = "onItemClick"
            java.lang.String r3 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r4 = "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$1"
            if (r0 != 0) goto L_0x0051
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x0051:
            java.lang.String r5 = r0.f64749g
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            java.lang.String r8 = ""
            if (r5 == 0) goto L_0x005d
            r0.f64749g = r8
        L_0x005d:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r9 = r6.f51918d
            dz0.c r9 = r9.f51776E
            boolean r10 = r9 instanceof com.tencent.p014mm.plugin.card.model.CardInfo
            java.lang.String r11 = "key_card_info_data"
            if (r10 == 0) goto L_0x0072
            com.tencent.mm.plugin.card.model.CardInfo r9 = (com.tencent.p014mm.plugin.card.model.CardInfo) r9
            r5.putExtra(r11, r9)
            goto L_0x007b
        L_0x0072:
            boolean r10 = r9 instanceof com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo
            if (r10 == 0) goto L_0x007b
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r9 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r9
            r5.putExtra(r11, r9)
        L_0x007b:
            java.lang.String r9 = r0.f64749g
            java.lang.String r10 = "card://jump_detail"
            boolean r9 = r9.equals(r10)
            r10 = 2
            r12 = 9
            r15 = 1
            r11 = 0
            r13 = 3
            r14 = 5
            if (r9 == 0) goto L_0x0160
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            dz0.c r0 = r0.f51776E
            te3.ko r0 = r0.mo23264L0()
            te3.m40 r0 = r0.f64115M
            if (r0 == 0) goto L_0x00bc
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            dz0.c r0 = r0.f51776E
            te3.ko r0 = r0.mo23264L0()
            te3.m40 r0 = r0.f64115M
            java.lang.String r0 = r0.f64221e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bc
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            com.tencent.mm.ui.MMActivity r5 = r0.f51797e
            dz0.c r0 = r0.f51776E
            te3.ko r0 = r0.mo23264L0()
            te3.m40 r0 = r0.f64115M
            java.lang.String r0 = r0.f64221e
            wz0.C53246b.m59678j(r5, r0, r15)
            goto L_0x0100
        L_0x00bc:
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            com.tencent.mm.ui.MMActivity r0 = r0.f51797e
            java.lang.Class<com.tencent.mm.plugin.card.ui.CardDetailPreference> r7 = com.tencent.p014mm.plugin.card.p031ui.CardDetailPreference.class
            r5.setClass(r0, r7)
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            com.tencent.mm.ui.MMActivity r0 = r0.f51797e
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r5)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$1"
            java.lang.String r19 = "onItemClick"
            java.lang.String r20 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r7.mo10231a(r11)
            android.content.Intent r5 = (android.content.Intent) r5
            r0.startActivity(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$1"
            java.lang.String r18 = "onItemClick"
            java.lang.String r19 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r20 = "Undefined"
            java.lang.String r21 = "startActivity"
            java.lang.String r22 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0100:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.String r7 = "CardLeftRightIntroduceView"
            r5[r11] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            te3.ko r7 = r7.mo23264L0()
            int r7 = r7.f64141i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r15] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            java.lang.String r7 = r7.mo23270R0()
            r5[r10] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            java.lang.String r7 = r7.getCardId()
            r5[r13] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r9 = 4
            r5[r9] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r7 = r7.f51791U
            int r7 = r7.f51823b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r14] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r9 = r7.f51791U
            java.lang.String r9 = r9.f51825d
            r10 = 6
            r5[r10] = r9
            dz0.c r7 = r7.f51776E
            boolean r7 = r7.mo23277X0()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 7
            r5[r9] = r7
            r7 = 8
            r5[r7] = r8
            r7 = 11324(0x2c3c, float:1.5868E-41)
            r0.mo160131h(r7, r5)
            goto L_0x05ee
        L_0x0160:
            java.lang.String r5 = r0.f64749g
            java.lang.String r9 = "card://jump_shop_list"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x017d
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            dz0.c r5 = r5.f51776E
            te3.ko r5 = r5.mo23264L0()
            int r5 = r5.f64154x
            if (r5 < r15) goto L_0x017d
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller.m19341f(r0)
            goto L_0x05ee
        L_0x017d:
            java.lang.String r5 = r0.f64749g
            java.lang.String r9 = "card://jump_shop"
            boolean r5 = r5.equals(r9)
            java.lang.String r9 = "MicroMsg.CardDetailUIContoller"
            r12 = 11941(0x2ea5, float:1.6733E-41)
            if (r5 == 0) goto L_0x0256
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            dz0.c r5 = r5.f51776E
            te3.ko r5 = r5.mo23264L0()
            int r5 = r5.f64154x
            if (r5 < r15) goto L_0x0256
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            java.util.ArrayList<te3.co> r0 = r0.f51777F
            if (r0 == 0) goto L_0x024d
            int r0 = r0.size()
            if (r0 != 0) goto L_0x01a5
            goto L_0x024d
        L_0x01a5:
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            java.util.ArrayList<te3.co> r0 = r0.f51777F
            java.lang.Object r0 = r0.get(r11)
            te3.co r0 = (te3.C49029co) r0
            if (r0 == 0) goto L_0x01eb
            java.lang.String r5 = r0.f131858q
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01eb
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            com.tencent.mm.ui.MMActivity r5 = r5.f51797e
            java.lang.String r7 = r0.f131858q
            wz0.C53246b.m59678j(r5, r7, r15)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r14]
            r9 = 4
            java.lang.Integer r17 = java.lang.Integer.valueOf(r9)
            r7[r11] = r17
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r9 = r6.f51918d
            dz0.c r9 = r9.f51776E
            java.lang.String r9 = r9.getCardId()
            r7[r15] = r9
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r9 = r6.f51918d
            dz0.c r9 = r9.f51776E
            java.lang.String r9 = r9.mo23270R0()
            r7[r10] = r9
            r7[r13] = r8
            java.lang.String r0 = r0.f131848d
            r9 = 4
            r7[r9] = r0
            r5.mo160131h(r12, r7)
        L_0x01eb:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 9
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r7 = "UsedStoresView"
            r5[r11] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            te3.ko r7 = r7.mo23264L0()
            int r7 = r7.f64141i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r15] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            java.lang.String r7 = r7.mo23270R0()
            r5[r10] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            java.lang.String r7 = r7.getCardId()
            r5[r13] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r9 = 4
            r5[r9] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r7 = r7.f51791U
            int r7 = r7.f51823b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r14] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r9 = r7.f51791U
            java.lang.String r9 = r9.f51825d
            r10 = 6
            r5[r10] = r9
            dz0.c r7 = r7.f51776E
            boolean r7 = r7.mo23277X0()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 7
            r5[r9] = r7
            r7 = 8
            r5[r7] = r8
            r7 = 11324(0x2c3c, float:1.5868E-41)
            r0.mo160131h(r7, r5)
            goto L_0x05ee
        L_0x024d:
            java.lang.String r0 = "mShopList == null || mShopList.size() == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x0256:
            java.lang.String r5 = r0.f64749g
            java.lang.String r12 = "card://jump_service"
            boolean r5 = r5.equals(r12)
            if (r5 == 0) goto L_0x02d9
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            dz0.c r0 = r0.f51776E
            te3.ko r0 = r0.mo23264L0()
            java.lang.String r0 = r0.f64139g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0296
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            com.tencent.mm.ui.MMActivity r5 = r0.f51797e
            dz0.c r0 = r0.f51776E
            te3.ko r0 = r0.mo23264L0()
            java.lang.String r0 = r0.f64139g
            wz0.C53246b.m59680l(r5, r0)
            gz0.p r0 = hz0.C46153l0.Jx0()
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            dz0.c r5 = r5.f51776E
            java.lang.String r5 = r5.getCardId()
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            java.lang.String r7 = r7.mo23270R0()
            r0.mo71409a(r5, r7, r15)
        L_0x0296:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 11582(0x2d3e, float:1.623E-41)
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "OperService"
            r7[r11] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r7[r15] = r8
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r8 = r6.f51918d
            dz0.c r8 = r8.f51776E
            te3.ko r8 = r8.mo23264L0()
            int r8 = r8.f64141i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r10] = r8
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r8 = r6.f51918d
            dz0.c r8 = r8.f51776E
            java.lang.String r8 = r8.mo23270R0()
            r7[r13] = r8
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r8 = r6.f51918d
            dz0.c r8 = r8.f51776E
            java.lang.String r8 = r8.getCardId()
            r9 = 4
            r7[r9] = r8
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r8 = r6.f51918d
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r8 = r8.f51791U
            java.lang.String r8 = r8.f51825d
            r7[r14] = r8
            r0.mo160131h(r5, r7)
            goto L_0x05ee
        L_0x02d9:
            java.lang.String r5 = r0.f64749g
            java.lang.String r12 = "card://jump_gift"
            boolean r5 = r5.equals(r12)
            r12 = 13866(0x362a, float:1.943E-41)
            if (r5 == 0) goto L_0x0347
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            com.tencent.mm.ui.MMActivity r5 = r0.f51797e
            wz0.C53246b.m59669a(r5, r11, r0)
            com.tencent.mm.ui.MMActivity r5 = r0.f51797e
            r5.mmSetOnActivityResultCallback(r0)
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            dz0.c r5 = r0.f51776E
            te3.hn r5 = r5.mo23263J0()
            te3.fy r5 = r5.f63935B
            if (r5 != 0) goto L_0x0304
            java.lang.String r0 = "mCardInfo.getDataInfo().gifting_info_cell is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x05ee
        L_0x0304:
            dz0.c r5 = r0.f51776E
            te3.hn r5 = r5.mo23263J0()
            te3.fy r5 = r5.f63935B
            te3.ud2 r5 = r5.f63892o
            if (r5 != 0) goto L_0x0317
            java.lang.String r0 = "mCardInfo.getDataInfo().gifting_info_cell.gifting_info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            goto L_0x05ee
        L_0x0317:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r13]
            r8 = 6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r11] = r8
            dz0.c r8 = r0.f51776E
            te3.hn r8 = r8.mo23263J0()
            te3.fy r8 = r8.f63935B
            te3.ud2 r8 = r8.f63892o
            java.lang.String r8 = r8.f185726e
            r7[r15] = r8
            dz0.c r0 = r0.f51776E
            te3.hn r0 = r0.mo23263J0()
            te3.fy r0 = r0.f63935B
            te3.ud2 r0 = r0.f63892o
            int r0 = r0.f185725d
            java.lang.String r0 = p823sg.C77710q.m93738a(r0)
            r7[r10] = r0
            r5.mo160131h(r12, r7)
            goto L_0x05ee
        L_0x0347:
            java.lang.String r5 = r0.f64749g
            java.lang.String r12 = "card://jump_card_gift"
            boolean r5 = r5.equals(r12)
            if (r5 == 0) goto L_0x043c
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            dz0.c r0 = r0.f51776E
            te3.hn r0 = r0.mo23263J0()
            te3.fy r0 = r0.f63935B
            if (r0 != 0) goto L_0x0366
            java.lang.String r0 = "jump_card_gift mCardInfo.getDataInfo().gifting_info_cell is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x0366:
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            dz0.c r0 = r0.f51776E
            te3.hn r0 = r0.mo23263J0()
            te3.fy r0 = r0.f63935B
            te3.ud2 r0 = r0.f63892o
            if (r0 != 0) goto L_0x037d
            java.lang.String r0 = "jump_card_gift mCardInfo.getDataInfo().gifting_info_cell.gifting_info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x037d:
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            dz0.c r5 = r0.f51776E
            te3.hn r5 = r5.mo23263J0()
            te3.fy r5 = r5.f63935B
            te3.ud2 r5 = r5.f63892o
            java.lang.String r5 = r5.f185726e
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            te3.hn r7 = r7.mo23263J0()
            te3.fy r7 = r7.f63935B
            te3.ud2 r7 = r7.f63892o
            int r7 = r7.f185725d
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r8[r11] = r5
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r8[r15] = r12
            java.lang.String r12 = "doJumpCardGift, order_id:%s, biz_uin:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r12, r8)
            android.content.Intent r8 = new android.content.Intent
            com.tencent.mm.ui.MMActivity r9 = r0.f51797e
            java.lang.Class<com.tencent.mm.plugin.card.ui.CardGiftReceiveUI> r12 = com.tencent.p014mm.plugin.card.p031ui.CardGiftReceiveUI.class
            r8.<init>(r9, r12)
            java.lang.String r9 = "key_biz_uin"
            r8.putExtra(r9, r7)
            java.lang.String r7 = "key_order_id"
            r8.putExtra(r7, r5)
            com.tencent.mm.ui.MMActivity r5 = r0.f51797e
            android.content.Intent r5 = r5.getIntent()
            java.lang.String r7 = "key_card_git_info"
            android.os.Parcelable r5 = r5.getParcelableExtra(r7)
            com.tencent.mm.plugin.card.model.CardGiftInfo r5 = (com.tencent.p014mm.plugin.card.model.CardGiftInfo) r5
            java.lang.String r7 = "key_gift_into"
            r8.putExtra(r7, r5)
            com.tencent.mm.ui.MMActivity r0 = r0.f51797e
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r8)
            java.lang.Object[] r18 = r5.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/card/ui/CardDetailUIContoller"
            java.lang.String r20 = "doJumpCardGift"
            java.lang.String r21 = "(Ljava/lang/String;I)V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "startActivity"
            java.lang.String r24 = "(Landroid/content/Intent;)V"
            r17 = r0
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r5 = r5.mo10231a(r11)
            android.content.Intent r5 = (android.content.Intent) r5
            r0.startActivity(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/card/ui/CardDetailUIContoller"
            java.lang.String r19 = "doJumpCardGift"
            java.lang.String r20 = "(Ljava/lang/String;I)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r5 = new java.lang.Object[r13]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r5[r11] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            te3.hn r7 = r7.mo23263J0()
            te3.fy r7 = r7.f63935B
            te3.ud2 r7 = r7.f63892o
            java.lang.String r7 = r7.f185726e
            r5[r15] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            te3.hn r7 = r7.mo23263J0()
            te3.fy r7 = r7.f63935B
            te3.ud2 r7 = r7.f63892o
            int r7 = r7.f185725d
            java.lang.String r7 = p823sg.C77710q.m93738a(r7)
            r5[r10] = r7
            r7 = 13866(0x362a, float:1.943E-41)
            r0.mo160131h(r7, r5)
            goto L_0x05ee
        L_0x043c:
            long r10 = r0.f64750h
            r16 = 32
            long r10 = r10 & r16
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x0457
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            com.tencent.mm.ui.MMActivity r5 = r0.f51797e
            r7 = 4
            wz0.C53246b.m59669a(r5, r7, r0)
            com.tencent.mm.ui.MMActivity r5 = r0.f51797e
            r5.mmSetOnActivityResultCallback(r0)
            goto L_0x05ee
        L_0x0457:
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r10 = r6.f51918d
            dz0.c r10 = r10.f51776E
            java.lang.String r10 = r10.getCardId()
            java.lang.String r11 = r0.f64754o
            java.lang.String r12 = r0.f64755p
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r5 = r5.f51791U
            int r9 = r5.f51823b
            int r5 = r5.f51829h
            boolean r5 = wz0.C53246b.m59672d(r10, r11, r12, r9, r5)
            if (r5 == 0) goto L_0x04a1
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r14]
            r9 = 21
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r7[r10] = r9
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r9 = r6.f51918d
            dz0.c r9 = r9.f51776E
            java.lang.String r9 = r9.getCardId()
            r7[r15] = r9
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r9 = r6.f51918d
            dz0.c r9 = r9.f51776E
            java.lang.String r9 = r9.mo23270R0()
            r10 = 2
            r7[r10] = r9
            r7[r13] = r8
            java.lang.String r0 = r0.f64746d
            r8 = 4
            r7[r8] = r0
            r0 = 11941(0x2ea5, float:1.6733E-41)
            r5.mo160131h(r0, r7)
            goto L_0x05ee
        L_0x04a1:
            java.lang.String r10 = r0.f64756q
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x04c4
            di3.d r5 = di3.C86312j.m106911c(r7)
            ht1.t1 r5 = (ht1.C60200t1) r5
            ht1.z4 r5 = r5.mo76861l7()
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            com.tencent.mm.ui.MMActivity r7 = r7.f51797e
            java.lang.String r0 = r0.f64756q
            r8 = 16
            java.lang.String r9 = wz0.C22945n.m27007g(r13)
            r5.mo83758E5(r7, r0, r8, r9)
            goto L_0x05ee
        L_0x04c4:
            java.lang.String r10 = r0.f64757r
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x04f7
            java.lang.String r10 = r0.f64758s
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x04f7
            di3.d r5 = di3.C86312j.m106911c(r7)
            ht1.t1 r5 = (ht1.C60200t1) r5
            ht1.z4 r14 = r5.mo76861l7()
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            com.tencent.mm.ui.MMActivity r15 = r5.f51797e
            java.lang.String r5 = r0.f64757r
            java.lang.String r0 = r0.f64758s
            r18 = 0
            r19 = 16
            java.lang.String r20 = wz0.C22945n.m27007g(r13)
            r16 = r5
            r17 = r0
            r14.mo83794l6(r15, r16, r17, r18, r19, r20)
            goto L_0x05ee
        L_0x04f7:
            java.lang.String r7 = r0.f64749g
            long r10 = r0.f64750h
            java.lang.String r7 = wz0.C22945n.m27011k(r7, r10)
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r10 = r6.f51918d
            com.tencent.mm.ui.MMActivity r10 = r10.f51797e
            wz0.C53246b.m59678j(r10, r7, r15)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 11492(0x2ce4, float:1.6104E-41)
            r12 = 8
            java.lang.Object[] r12 = new java.lang.Object[r12]
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r5 = r5.f51791U
            int r5 = r5.f51823b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r18 = 0
            r12[r18] = r5
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r9 = r5.f51791U
            java.lang.String r9 = r9.f51826e
            r12[r15] = r9
            dz0.c r5 = r5.f51776E
            java.lang.String r5 = r5.getCardId()
            r9 = 2
            r12[r9] = r5
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            dz0.c r5 = r5.f51776E
            java.lang.String r5 = r5.mo23270R0()
            r12[r13] = r5
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            dz0.c r5 = r5.f51776E
            te3.hn r5 = r5.mo23263J0()
            int r5 = r5.f63942d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r19 = 4
            r12[r19] = r5
            r12[r14] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            dz0.c r5 = r5.f51776E
            te3.ko r5 = r5.mo23264L0()
            int r5 = r5.f64141i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 6
            r12[r7] = r5
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            dz0.c r5 = r5.f51776E
            te3.ko r5 = r5.mo23264L0()
            java.lang.String r5 = r5.f64139g
            r19 = 7
            r12[r19] = r5
            r10.mo160131h(r11, r12)
            java.lang.Object[] r5 = new java.lang.Object[r14]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r18 = 0
            r5[r18] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            java.lang.String r7 = r7.getCardId()
            r5[r15] = r7
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r7 = r6.f51918d
            dz0.c r7 = r7.f51776E
            java.lang.String r7 = r7.mo23270R0()
            r9 = 2
            r5[r9] = r7
            r5[r13] = r8
            java.lang.String r7 = r0.f64746d
            r8 = 4
            r5[r8] = r7
            r7 = 11941(0x2ea5, float:1.6733E-41)
            r10.mo160131h(r7, r5)
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            dz0.c r5 = r5.f51776E
            java.lang.String r5 = r5.getCardId()
            long r7 = r0.f64750h
            r9 = 8
            long r7 = r7 & r9
            java.lang.String r9 = "MicroMsg.CardUtil"
            int r10 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x05b3
            java.lang.String r7 = "shouldShowWarning show the warning!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            r7 = 1
            goto L_0x05b4
        L_0x05b3:
            r7 = 0
        L_0x05b4:
            if (r7 != 0) goto L_0x05bc
            java.lang.String r5 = "ShowWarning not support show the warning!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            goto L_0x05c9
        L_0x05bc:
            java.lang.String r7 = r0.f64746d
            boolean r5 = wz0.C22945n.m27019s(r5, r7)
            if (r5 == 0) goto L_0x05cb
            java.lang.String r5 = "ShowWarning has show the warning!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
        L_0x05c9:
            r15 = 0
            goto L_0x05d0
        L_0x05cb:
            java.lang.String r5 = "ShowWarning has not show the warning!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
        L_0x05d0:
            if (r15 == 0) goto L_0x05ee
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = r6.f51918d
            dz0.c r5 = r5.f51776E
            java.lang.String r5 = r5.getCardId()
            java.lang.String r0 = r0.f64746d
            wz0.C22945n.m26999L(r5, r0)
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r6.f51918d
            com.tencent.mm.ui.MMActivity r5 = r0.f51797e
            dz0.c r0 = r0.f51776E
            te3.ko r0 = r0.mo23264L0()
            java.lang.String r0 = r0.f64142j
            wz0.C53246b.m59676h(r5, r0)
        L_0x05ee:
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.C18595g.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
