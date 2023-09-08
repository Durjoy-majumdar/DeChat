package lo2;

import com.tencent.p014mm.plugin.sns.storage.SnsInfo;

/* renamed from: lo2.y */
public class C99576y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f291877d;

    public C99576y(SnsInfo snsInfo) {
        this.f291877d = snsInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0233 A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x027f A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0286 A[SYNTHETIC, Splitter:B:123:0x0286] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4 A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0117 A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0173 A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01de A[Catch:{ all -> 0x0102 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            java.lang.String r1 = "run"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            long r3 = java.lang.System.currentTimeMillis()
            r5 = r21
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r5.f291877d
            java.lang.String r6 = "access$000"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            java.lang.String r8 = "doPreloadWeAppEnvForTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
            java.lang.String r9 = "AdWeAppPreloader"
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "doPreloadWeAppEnvForTimeLine, snsInfo==null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            r18 = r1
            goto L_0x02be
        L_0x002c:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x02a0 }
            r10.<init>()     // Catch:{ all -> 0x02a0 }
            com.tencent.mm.plugin.sns.storage.ADInfo r11 = r0.getAdInfo()     // Catch:{ all -> 0x02a0 }
            com.tencent.mm.plugin.sns.storage.ADXml r12 = r0.getAdXml()     // Catch:{ all -> 0x02a0 }
            long r13 = r0.field_snsId     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = vr2.C102236a0.m134765q0(r13)     // Catch:{ all -> 0x02a0 }
            if (r12 == 0) goto L_0x0047
            boolean r15 = r12.preloadWeAppPkg     // Catch:{ all -> 0x02a0 }
            if (r15 == 0) goto L_0x0047
            r15 = 1
            goto L_0x0048
        L_0x0047:
            r15 = 0
        L_0x0048:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a0 }
            r13.<init>()     // Catch:{ all -> 0x02a0 }
            java.lang.String r14 = "doPreloadWeAppEnvForTimeLine, snsId="
            r13.append(r14)     // Catch:{ all -> 0x02a0 }
            r13.append(r0)     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x02a0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = ", weAppType="
            if (r11 == 0) goto L_0x00ad
            com.tencent.mm.plugin.sns.storage.ADInfo$b r14 = r11.actionExtWeApp     // Catch:{ all -> 0x02a0 }
            if (r14 == 0) goto L_0x00ad
            java.lang.String r14 = r14.f275645a     // Catch:{ all -> 0x02a0 }
            boolean r17 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x02a0 }
            if (r17 != 0) goto L_0x00ad
            com.tencent.mm.plugin.sns.storage.ADInfo$b r13 = r11.actionExtWeApp     // Catch:{ all -> 0x02a0 }
            java.lang.String r5 = r13.f275646b     // Catch:{ all -> 0x02a0 }
            int r13 = r13.f275648d     // Catch:{ all -> 0x02a0 }
            r18 = r1
            lo2.a0$a r1 = new lo2.a0$a     // Catch:{ all -> 0x0102 }
            r1.<init>(r14, r5, r13)     // Catch:{ all -> 0x0102 }
            boolean r5 = r10.contains(r1)     // Catch:{ all -> 0x0102 }
            if (r5 != 0) goto L_0x00af
            r10.add(r1)     // Catch:{ all -> 0x0102 }
            r1 = 2
            if (r13 != r1) goto L_0x0089
            r1 = 0
            r16 = 1
            goto L_0x008c
        L_0x0089:
            r1 = 1
            r16 = 0
        L_0x008c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r5.<init>()     // Catch:{ all -> 0x0102 }
            r19 = r1
            java.lang.String r1 = "adInfo.actionExtWeApp, userName="
            r5.append(r1)     // Catch:{ all -> 0x0102 }
            r5.append(r14)     // Catch:{ all -> 0x0102 }
            r5.append(r0)     // Catch:{ all -> 0x0102 }
            r5.append(r13)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0102 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ all -> 0x0102 }
            r13 = r16
            r16 = r19
            goto L_0x00b2
        L_0x00ad:
            r18 = r1
        L_0x00af:
            r13 = 0
            r16 = 0
        L_0x00b2:
            if (r12 == 0) goto L_0x0105
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r1 = r12.adCardActionBtnInfo     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x0105
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r1 = r1.clickActionInfo     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x0105
            java.lang.String r1 = r1.f273645d     // Catch:{ all -> 0x0102 }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0102 }
            if (r5 != 0) goto L_0x0105
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r5 = r12.adCardActionBtnInfo     // Catch:{ all -> 0x0102 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r5 = r5.clickActionInfo     // Catch:{ all -> 0x0102 }
            java.lang.String r14 = r5.f273647e     // Catch:{ all -> 0x0102 }
            int r5 = r5.f273651g     // Catch:{ all -> 0x0102 }
            r19 = r13
            lo2.a0$a r13 = new lo2.a0$a     // Catch:{ all -> 0x0102 }
            r13.<init>(r1, r14, r5)     // Catch:{ all -> 0x0102 }
            boolean r14 = r10.contains(r13)     // Catch:{ all -> 0x0102 }
            if (r14 != 0) goto L_0x0107
            r10.add(r13)     // Catch:{ all -> 0x0102 }
            r13 = 2
            if (r5 != r13) goto L_0x00e1
            r13 = 1
            goto L_0x00e5
        L_0x00e1:
            r13 = r19
            r16 = 1
        L_0x00e5:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r14.<init>()     // Catch:{ all -> 0x0102 }
            r19 = r13
            java.lang.String r13 = "actionBtnWeApp, userName="
            r14.append(r13)     // Catch:{ all -> 0x0102 }
            r14.append(r1)     // Catch:{ all -> 0x0102 }
            r14.append(r0)     // Catch:{ all -> 0x0102 }
            r14.append(r5)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0102 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ all -> 0x0102 }
            goto L_0x0107
        L_0x0102:
            r0 = move-exception
            goto L_0x02a3
        L_0x0105:
            r19 = r13
        L_0x0107:
            r13 = r19
            if (r12 == 0) goto L_0x0153
            com.tencent.mm.plugin.sns.storage.ADXml$q r1 = r12.weAppInfo     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x0153
            java.lang.String r1 = r1.f275751a     // Catch:{ all -> 0x0102 }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0102 }
            if (r5 != 0) goto L_0x0153
            com.tencent.mm.plugin.sns.storage.ADXml$q r5 = r12.weAppInfo     // Catch:{ all -> 0x0102 }
            java.lang.String r14 = r5.f275752b     // Catch:{ all -> 0x0102 }
            int r5 = r5.f275754d     // Catch:{ all -> 0x0102 }
            r19 = r13
            lo2.a0$a r13 = new lo2.a0$a     // Catch:{ all -> 0x0102 }
            r13.<init>(r1, r14, r5)     // Catch:{ all -> 0x0102 }
            boolean r14 = r10.contains(r13)     // Catch:{ all -> 0x0102 }
            if (r14 != 0) goto L_0x0155
            r10.add(r13)     // Catch:{ all -> 0x0102 }
            r13 = 2
            if (r5 != r13) goto L_0x0132
            r13 = 1
            goto L_0x0136
        L_0x0132:
            r13 = r19
            r16 = 1
        L_0x0136:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r14.<init>()     // Catch:{ all -> 0x0102 }
            r19 = r13
            java.lang.String r13 = "headWeApp, userName="
            r14.append(r13)     // Catch:{ all -> 0x0102 }
            r14.append(r1)     // Catch:{ all -> 0x0102 }
            r14.append(r0)     // Catch:{ all -> 0x0102 }
            r14.append(r5)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0102 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ all -> 0x0102 }
            goto L_0x0155
        L_0x0153:
            r19 = r13
        L_0x0155:
            r13 = r19
            if (r12 == 0) goto L_0x021d
            co2.r r1 = r12.adSliderFullCardInfo     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x021d
            java.util.List<co2.q> r1 = r1.f264582a     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x021d
            boolean r5 = rq2.C101425k.m133097a(r1)     // Catch:{ all -> 0x0102 }
            if (r5 != 0) goto L_0x021d
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0102 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0102 }
        L_0x016d:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0102 }
            if (r5 == 0) goto L_0x021b
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0102 }
            co2.q r5 = (co2.C92448q) r5     // Catch:{ all -> 0x0102 }
            if (r5 != 0) goto L_0x017c
            goto L_0x016d
        L_0x017c:
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r12 = r5.f264578f     // Catch:{ all -> 0x0102 }
            if (r12 == 0) goto L_0x01c8
            java.lang.String r12 = r12.f273645d     // Catch:{ all -> 0x0102 }
            boolean r14 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0102 }
            if (r14 != 0) goto L_0x01c8
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r14 = r5.f264578f     // Catch:{ all -> 0x0102 }
            r19 = r1
            java.lang.String r1 = r14.f273647e     // Catch:{ all -> 0x0102 }
            int r14 = r14.f273651g     // Catch:{ all -> 0x0102 }
            r20 = r13
            lo2.a0$a r13 = new lo2.a0$a     // Catch:{ all -> 0x0102 }
            r13.<init>(r12, r1, r14)     // Catch:{ all -> 0x0102 }
            boolean r1 = r10.contains(r13)     // Catch:{ all -> 0x0102 }
            if (r1 != 0) goto L_0x01cc
            r10.add(r13)     // Catch:{ all -> 0x0102 }
            r1 = 2
            if (r14 != r1) goto L_0x01a5
            r13 = 1
            goto L_0x01a9
        L_0x01a5:
            r13 = r20
            r16 = 1
        L_0x01a9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r1.<init>()     // Catch:{ all -> 0x0102 }
            r20 = r13
            java.lang.String r13 = "adSliderFullCardWeApp, weAppUserName = "
            r1.append(r13)     // Catch:{ all -> 0x0102 }
            r1.append(r12)     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = ", weAppType = "
            r1.append(r12)     // Catch:{ all -> 0x0102 }
            r1.append(r14)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0102 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ all -> 0x0102 }
            goto L_0x01cc
        L_0x01c8:
            r19 = r1
            r20 = r13
        L_0x01cc:
            r13 = r20
            co2.t r1 = r5.f264579g     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x0217
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r1 = r1.f264603c     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x0217
            java.lang.String r1 = r1.f273645d     // Catch:{ all -> 0x0102 }
            boolean r12 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0102 }
            if (r12 != 0) goto L_0x0217
            co2.t r5 = r5.f264579g     // Catch:{ all -> 0x0102 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r5 = r5.f264603c     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = r5.f273647e     // Catch:{ all -> 0x0102 }
            int r5 = r5.f273651g     // Catch:{ all -> 0x0102 }
            lo2.a0$a r14 = new lo2.a0$a     // Catch:{ all -> 0x0102 }
            r14.<init>(r1, r12, r5)     // Catch:{ all -> 0x0102 }
            boolean r12 = r10.contains(r14)     // Catch:{ all -> 0x0102 }
            if (r12 != 0) goto L_0x0217
            r10.add(r14)     // Catch:{ all -> 0x0102 }
            r12 = 2
            if (r5 != r12) goto L_0x01f9
            r13 = 1
            goto L_0x01fb
        L_0x01f9:
            r16 = 1
        L_0x01fb:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r12.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r14 = "adSliderFullCardBtnWeApp, btnWeAppUserName = "
            r12.append(r14)     // Catch:{ all -> 0x0102 }
            r12.append(r1)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = ", btnWeAppType = "
            r12.append(r1)     // Catch:{ all -> 0x0102 }
            r12.append(r5)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = r12.toString()     // Catch:{ all -> 0x0102 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ all -> 0x0102 }
        L_0x0217:
            r1 = r19
            goto L_0x016d
        L_0x021b:
            r20 = r13
        L_0x021d:
            if (r11 == 0) goto L_0x0277
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r1 = r11.adClickActionInfoList     // Catch:{ all -> 0x0102 }
            boolean r1 = rq2.C101425k.m133097a(r1)     // Catch:{ all -> 0x0102 }
            if (r1 != 0) goto L_0x0277
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r1 = r11.adClickActionInfoList     // Catch:{ all -> 0x0102 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0102 }
        L_0x022d:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0102 }
            if (r5 == 0) goto L_0x0277
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0102 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r5 = (com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo) r5     // Catch:{ all -> 0x0102 }
            if (r5 == 0) goto L_0x022d
            java.lang.String r11 = r5.f273645d     // Catch:{ all -> 0x0102 }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0102 }
            if (r12 != 0) goto L_0x022d
            java.lang.String r12 = r5.f273647e     // Catch:{ all -> 0x0102 }
            int r5 = r5.f273651g     // Catch:{ all -> 0x0102 }
            lo2.a0$a r14 = new lo2.a0$a     // Catch:{ all -> 0x0102 }
            r14.<init>(r11, r12, r5)     // Catch:{ all -> 0x0102 }
            boolean r12 = r10.contains(r14)     // Catch:{ all -> 0x0102 }
            if (r12 != 0) goto L_0x022d
            r10.add(r14)     // Catch:{ all -> 0x0102 }
            r12 = 2
            if (r5 != r12) goto L_0x025a
            r13 = 1
            goto L_0x025c
        L_0x025a:
            r16 = 1
        L_0x025c:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r14.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = "clickActionInfoList from adInfo, userName="
            r14.append(r12)     // Catch:{ all -> 0x0102 }
            r14.append(r11)     // Catch:{ all -> 0x0102 }
            r14.append(r0)     // Catch:{ all -> 0x0102 }
            r14.append(r5)     // Catch:{ all -> 0x0102 }
            java.lang.String r5 = r14.toString()     // Catch:{ all -> 0x0102 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)     // Catch:{ all -> 0x0102 }
            goto L_0x022d
        L_0x0277:
            r0 = r16
            boolean r1 = r10.isEmpty()     // Catch:{ all -> 0x0102 }
            if (r1 != 0) goto L_0x0286
            lo2.C99520a0.m129874d(r10, r15, r13, r0)     // Catch:{ all -> 0x0102 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            goto L_0x02be
        L_0x0286:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r0.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "doPreloadWeAppEnvForTimeLine, preloadWeAppPkg="
            r0.append(r1)     // Catch:{ all -> 0x0102 }
            r0.append(r15)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = ", no weAppUserName"
            r0.append(r1)     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0102 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ all -> 0x0102 }
            goto L_0x02bb
        L_0x02a0:
            r0 = move-exception
            r18 = r1
        L_0x02a3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "doPreloadWeAppEnvForTimeLine, exp="
            r1.append(r5)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
        L_0x02bb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
        L_0x02be:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "---checkPreloadWeAppEnvForTimeLine, timeCost="
            r0.append(r1)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r1 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C99576y.run():void");
    }
}
