package com.tencent.p014mm.plugin.card.p031ui;

import android.os.MessageQueue;

/* renamed from: com.tencent.mm.plugin.card.ui.u */
public class C40871u implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ CardHomePageUI f109911d;

    public C40871u(CardHomePageUI cardHomePageUI) {
        this.f109911d = cardHomePageUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean queueIdle() {
        /*
            r7 = this;
            com.tencent.mm.plugin.card.ui.CardHomePageUI r0 = r7.f109911d
            oz0.b r0 = r0.f109775z
            r1 = 0
            if (r0 == 0) goto L_0x00b3
            r0.getClass()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_HAS_UPDATE_CARD_TYPE_INT_SYNC
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.mo119685f(r2, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3 = 1
            if (r0 == 0) goto L_0x002a
            int r0 = r0.intValue()
            if (r0 != r3) goto L_0x002a
        L_0x0027:
            r3 = 0
            goto L_0x00a4
        L_0x002a:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.mo119677K(r2, r4)
            hz0.c r0 = hz0.C46153l0.Gx0()
            hz0.m r2 = hz0.C46154m.NORMAL_TYPE
            android.database.Cursor r0 = r0.mo71596jo(r2)
            java.lang.String r2 = "MicroMsg.ShareCardDataMgr"
            if (r0 == 0) goto L_0x0098
            int r4 = r0.getCount()
            if (r4 <= 0) goto L_0x0098
            r0.moveToFirst()
        L_0x0050:
            boolean r4 = r0.isAfterLast()
            if (r4 != 0) goto L_0x0094
            com.tencent.mm.plugin.card.model.CardInfo r4 = new com.tencent.mm.plugin.card.model.CardInfo
            r4.<init>()
            r4.convertFrom(r0)
            int r5 = r4.field_card_type
            r6 = -1
            if (r5 != r6) goto L_0x0090
            te3.ko r5 = r4.mo23264L0()
            if (r5 != 0) goto L_0x0070
            java.lang.String r4 = "updateCardType fail , info.getCardTpInfo() == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
            goto L_0x0090
        L_0x0070:
            te3.ko r5 = r4.mo23264L0()
            int r5 = r5.f64141i
            r4.field_card_type = r5
            hz0.c r5 = hz0.C46153l0.Gx0()
            java.lang.String[] r6 = new java.lang.String[r1]
            boolean r5 = r5.update(r4, (java.lang.String[]) r6)
            if (r5 != 0) goto L_0x0090
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r4 = r4.field_card_id
            r5[r1] = r4
            java.lang.String r4 = "updateCardType fail , cardId = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r5)
        L_0x0090:
            r0.moveToNext()
            goto L_0x0050
        L_0x0094:
            r0.close()
            goto L_0x00a4
        L_0x0098:
            if (r0 == 0) goto L_0x009d
            r0.close()
        L_0x009d:
            java.lang.String r0 = "updateAllCardInfoByBlockField cursor is null or size is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x0027
        L_0x00a4:
            if (r3 == 0) goto L_0x00b3
            java.lang.String r0 = "MicroMsg.CardHomePageUI"
            java.lang.String r2 = "try2UpdateCardType"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.card.ui.CardHomePageUI r0 = r7.f109911d
            r0.mo63780b8()
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.C40871u.queueIdle():boolean");
    }
}
