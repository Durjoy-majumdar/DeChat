package jq2;

import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;

/* renamed from: jq2.v */
public class C99007v {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037 A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a A[Catch:{ all -> 0x0015 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m128935a(int r6, com.tencent.p014mm.plugin.sns.storage.ADXml r7, com.tencent.p014mm.protocal.protobuf.TimeLineObject r8) {
        /*
            java.lang.String r0 = "reportAdType"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineStaticHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 4
            r3 = 5
            r4 = 1697(0x6a1, float:2.378E-42)
            r5 = 1
            if (r6 != r2) goto L_0x0018
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0015 }
            r6.mo175911u(r4, r3)     // Catch:{ all -> 0x0015 }
            goto L_0x0020
        L_0x0015:
            r6 = move-exception
            goto L_0x00ba
        L_0x0018:
            if (r6 != r5) goto L_0x0020
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0015 }
            r2 = 6
            r6.mo175911u(r4, r2)     // Catch:{ all -> 0x0015 }
        L_0x0020:
            te3.j00 r6 = r8.ContentObj     // Catch:{ all -> 0x0015 }
            int r6 = r6.f298424e     // Catch:{ all -> 0x0015 }
            r8 = 15
            r2 = 0
            if (r6 == r8) goto L_0x002f
            if (r6 != r3) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            if (r6 != r5) goto L_0x0030
            goto L_0x0031
        L_0x002f:
            r2 = 1
        L_0x0030:
            r5 = 0
        L_0x0031:
            boolean r6 = r7.isFullCardAd()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x007a
            boolean r6 = r7.isLongPressGestureAd()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x0041
            r8 = 22
            goto L_0x00b4
        L_0x0041:
            boolean r6 = r7.isGestureAd()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x004b
            r8 = 23
            goto L_0x00b4
        L_0x004b:
            boolean r6 = r7.isTwistAd()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x0055
            r8 = 24
            goto L_0x00b4
        L_0x0055:
            boolean r6 = r7.isShakeAd()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x005e
            r8 = 25
            goto L_0x00b4
        L_0x005e:
            boolean r6 = r7.isAdBreakFrameVideo()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x0067
            r8 = 26
            goto L_0x00b4
        L_0x0067:
            boolean r6 = r7.isAdIpInteractVideo()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x0070
            r8 = 44
            goto L_0x00b4
        L_0x0070:
            if (r5 == 0) goto L_0x0075
            r8 = 11
            goto L_0x00b4
        L_0x0075:
            if (r2 == 0) goto L_0x00b4
            r8 = 12
            goto L_0x00b4
        L_0x007a:
            boolean r6 = r7.isCardAd()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x008a
            if (r5 == 0) goto L_0x0085
            r8 = 9
            goto L_0x00b4
        L_0x0085:
            if (r2 == 0) goto L_0x00b4
            r8 = 10
            goto L_0x00b4
        L_0x008a:
            boolean r6 = r7.isSphereCardAd()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x0093
            r8 = 13
            goto L_0x00b4
        L_0x0093:
            boolean r6 = r7.isFinderTopicCard()     // Catch:{ all -> 0x0015 }
            if (r6 != 0) goto L_0x00b2
            boolean r6 = r7.isSlideFullCard()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x00a0
            goto L_0x00b2
        L_0x00a0:
            boolean r6 = r7.isCombinedGridAD()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x00a9
            r8 = 43
            goto L_0x00b4
        L_0x00a9:
            if (r5 == 0) goto L_0x00ad
            r8 = 7
            goto L_0x00b4
        L_0x00ad:
            if (r2 == 0) goto L_0x00b4
            r8 = 8
            goto L_0x00b4
        L_0x00b2:
            r8 = 14
        L_0x00b4:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0015 }
            r6.mo175911u(r4, r8)     // Catch:{ all -> 0x0015 }
            goto L_0x00d5
        L_0x00ba:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "reportAdType, exp="
            r7.append(r8)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TimeLineStaticHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r6)
        L_0x00d5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jq2.C99007v.m128935a(int, com.tencent.mm.plugin.sns.storage.ADXml, com.tencent.mm.protocal.protobuf.TimeLineObject):void");
    }

    /* renamed from: b */
    public static void m128936b(int i) {
        SnsMethodCalculate.markStartTimeMs("reportNetType", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineStaticHelper");
        try {
            Context context = MMApplicationContext.getContext();
            if (NetStatusUtil.isWifi(context)) {
                C115669n.INSTANCE.mo175911u(1697, 27);
            } else if (NetStatusUtil.is5G(context)) {
                C115669n.INSTANCE.mo175911u(1697, 28);
            } else if (NetStatusUtil.is4G(context)) {
                C115669n.INSTANCE.mo175911u(1697, 29);
            } else {
                C115669n.INSTANCE.mo175911u(1697, 30);
            }
        } catch (Throwable th) {
            Log.m105920e("TimeLineStaticHelper", "reportNetType, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportNetType", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineStaticHelper");
    }
}
