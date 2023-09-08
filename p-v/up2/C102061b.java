package up2;

import android.content.Context;
import tp2.C101912b;

/* renamed from: up2.b */
public class C102061b extends C101912b<C102060a> {
    public C102061b(Context context) {
        super(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e3  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tp2.C101913c mo126056d(com.tencent.p014mm.plugin.sns.storage.SnsInfo r11, tp2.C101914d r12) {
        /*
            r10 = this;
            java.lang.String r0 = "makeActionImpl"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            if (r11 == 0) goto L_0x0119
            com.tencent.mm.plugin.sns.storage.ADXml r3 = r11.getAdXml()
            if (r3 != 0) goto L_0x0016
            goto L_0x0119
        L_0x0016:
            r3 = 0
            if (r12 == 0) goto L_0x0027
            java.lang.String r4 = "scene"
            java.lang.Object r4 = r12.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r11.getAdXml()
            com.tencent.mm.plugin.sns.storage.ADInfo r11 = r11.getAdInfo()
            r6 = 1
            r7 = 10
            r8 = 8
            if (r4 != r6) goto L_0x003f
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r11 = r5.adCardActionBtnInfo
            if (r11 == 0) goto L_0x00dc
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = r11.clickActionInfo
            goto L_0x00dd
        L_0x003f:
            r6 = 2
            if (r4 != r6) goto L_0x004a
            co2.s r11 = r5.adTagBtnInfo
            if (r11 == 0) goto L_0x00dc
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = r11.f264599o
            goto L_0x00dd
        L_0x004a:
            r6 = 3
            java.lang.String r9 = "subClickPos"
            if (r4 != r6) goto L_0x0070
            co2.r r11 = r5.adSliderFullCardInfo
            if (r11 == 0) goto L_0x00dc
            if (r12 == 0) goto L_0x0060
            java.lang.Object r11 = r12.get(r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r3 = r11.intValue()
        L_0x0060:
            co2.r r11 = r5.adSliderFullCardInfo
            java.util.List<co2.q> r11 = r11.f264582a
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r11 = r11.get(r3)
            co2.q r11 = (co2.C92448q) r11
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = r11.f264578f
            goto L_0x00dd
        L_0x0070:
            r6 = 4
            if (r4 != r6) goto L_0x0094
            co2.r r11 = r5.adSliderFullCardInfo
            if (r11 == 0) goto L_0x00dc
            if (r12 == 0) goto L_0x0083
            java.lang.Object r11 = r12.get(r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r3 = r11.intValue()
        L_0x0083:
            co2.r r11 = r5.adSliderFullCardInfo
            java.util.List<co2.q> r11 = r11.f264582a
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r11 = r11.get(r3)
            co2.q r11 = (co2.C92448q) r11
            co2.t r11 = r11.f264579g
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = r11.f264603c
            goto L_0x00dd
        L_0x0094:
            r6 = 5
            if (r4 != r6) goto L_0x00a0
            com.tencent.mm.plugin.sns.storage.ADXml$h r11 = r5.getAdSelectInfo()
            if (r11 == 0) goto L_0x00dc
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = r11.f275707c
            goto L_0x00dd
        L_0x00a0:
            r6 = 6
            if (r4 != r6) goto L_0x00ac
            com.tencent.mm.plugin.sns.storage.ADXml$h r11 = r5.getAdSelectInfo()
            if (r11 == 0) goto L_0x00dc
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = r11.f275708d
            goto L_0x00dd
        L_0x00ac:
            r6 = 7
            if (r4 == r6) goto L_0x00b7
            if (r4 != r8) goto L_0x00b2
            goto L_0x00b7
        L_0x00b2:
            if (r4 != r7) goto L_0x00dc
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = r5.adActionLinkClickInfo
            goto L_0x00dd
        L_0x00b7:
            if (r11 == 0) goto L_0x00dc
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r4 = r11.adClickActionInfoList
            boolean r4 = rq2.C101425k.m133097a(r4)
            if (r4 != 0) goto L_0x00dc
            if (r12 == 0) goto L_0x00cd
            java.lang.Object r12 = r12.get(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r3 = r12.intValue()
        L_0x00cd:
            boolean r12 = r11.checkCurIndexCanJump(r3)
            if (r12 == 0) goto L_0x00dc
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r11 = r11.adClickActionInfoList
            java.lang.Object r11 = r11.get(r3)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = (com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo) r11
            goto L_0x00dd
        L_0x00dc:
            r11 = r2
        L_0x00dd:
            if (r11 != 0) goto L_0x00e3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0124
        L_0x00e3:
            int r12 = r11.f273641b
            if (r12 != r8) goto L_0x00f0
            vp2.a r2 = new vp2.a
            r2.<init>(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0124
        L_0x00f0:
            r3 = 9
            if (r12 != r3) goto L_0x00fd
            vp2.e r2 = new vp2.e
            r2.<init>(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0124
        L_0x00fd:
            if (r12 != r7) goto L_0x0108
            vp2.f r2 = new vp2.f
            r2.<init>(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0124
        L_0x0108:
            r3 = 11
            if (r12 != r3) goto L_0x0115
            vp2.g r2 = new vp2.g
            r2.<init>(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0124
        L_0x0115:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0124
        L_0x0119:
            java.lang.String r11 = "SnsAd.AdActionButtonClick"
            java.lang.String r12 = "the sns info or adxml is null!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
        L_0x0124:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: up2.C102061b.mo126056d(com.tencent.mm.plugin.sns.storage.SnsInfo, tp2.d):tp2.c");
    }
}
