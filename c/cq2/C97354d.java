package cq2;

import android.content.Context;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.util.SparseLongArray;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.thumbplayer.core.common.TPGeneralError;
import java.util.Map;

/* renamed from: cq2.d */
public class C97354d {

    /* renamed from: b */
    public static volatile C97354d f285830b;

    /* renamed from: c */
    public static final SparseLongArray f285831c;

    /* renamed from: a */
    public final Map<String, SparseArray<C97356f>> f285832a = new ArrayMap();

    /* renamed from: cq2.d$a */
    public interface C97355a {
    }

    static {
        SparseLongArray sparseLongArray = new SparseLongArray();
        f285831c = sparseLongArray;
        sparseLongArray.append(1, 1800000);
        sparseLongArray.append(2, 300000);
        sparseLongArray.append(TPGeneralError.FAILED, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        sparseLongArray.append(1000003, 60000);
        sparseLongArray.append(3, 3600000);
    }

    /* renamed from: c */
    public static C97354d m125367c(Context context) {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (f285830b == null) {
            synchronized (C97354d.class) {
                try {
                    if (f285830b == null) {
                        f285830b = new C97354d();
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    throw th;
                }
            }
        }
        C97354d dVar = f285830b;
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        return dVar;
    }

    /* renamed from: a */
    public void mo136622a(int i, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("doForceLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        try {
            mo136625e(i, snsInfo, false);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doForceLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    /* renamed from: b */
    public void mo136623b(int i, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("doLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        try {
            mo136625e(i, snsInfo, true);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo136624d(java.lang.String r17, int r18, co2.C92433g r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r7 = r18
            r2 = r19
            java.lang.String r8 = "isIntervalTimeExpired"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            java.util.Map<java.lang.String, android.util.SparseArray<cq2.f>> r3 = r0.f285832a
            android.util.ArrayMap r3 = (android.util.ArrayMap) r3
            java.lang.Object r3 = r3.get(r1)
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            if (r3 != 0) goto L_0x0028
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.Map<java.lang.String, android.util.SparseArray<cq2.f>> r4 = r0.f285832a
            android.util.ArrayMap r4 = (android.util.ArrayMap) r4
            r4.put(r1, r3)
        L_0x0028:
            r10 = r3
            r1 = 1
            r3 = 0
            if (r20 == 0) goto L_0x0045
            java.lang.Object r4 = r10.get(r7)
            cq2.f r4 = (cq2.C97356f) r4
            if (r4 == 0) goto L_0x0046
            long r5 = r4.f285833a
            long r11 = rq2.C101426m.m133104b()
            long r11 = r11 - r5
            long r5 = r4.f285834b
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 >= 0) goto L_0x0046
            r1 = 0
            r11 = 0
            goto L_0x0047
        L_0x0045:
            r4 = r3
        L_0x0046:
            r11 = 1
        L_0x0047:
            if (r11 == 0) goto L_0x0095
            java.lang.String r12 = "keepRequestTime"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r9)
            if (r2 == 0) goto L_0x005c
            android.util.SparseArray<co2.g$a> r1 = r2.f264508a
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r1.get(r7)
            r3 = r1
            co2.g$a r3 = (co2.C92433g.C92434a) r3
        L_0x005c:
            long r5 = rq2.C101426m.m133104b()
            if (r4 != 0) goto L_0x0082
            android.util.SparseLongArray r1 = f285831c
            r13 = 5000(0x1388, double:2.4703E-320)
            long r1 = r1.get(r7, r13)
            if (r3 == 0) goto L_0x0075
            int r3 = r3.f264510b
            long r3 = (long) r3
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0075
            r13 = r3
            goto L_0x0076
        L_0x0075:
            r13 = r1
        L_0x0076:
            cq2.f r15 = new cq2.f
            r1 = r15
            r2 = r5
            r4 = r13
            r6 = r18
            r1.<init>(r2, r4, r6)
            r4 = r15
            goto L_0x008f
        L_0x0082:
            java.lang.String r1 = "setLastRequestTime"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.dynamic.RequestTime"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r4.f285833a = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x008f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r9)
            r10.put(r7, r4)
        L_0x0095:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: cq2.C97354d.mo136624d(java.lang.String, int, co2.g, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136625e(int r19, com.tencent.p014mm.plugin.sns.storage.SnsInfo r20, boolean r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            java.lang.String r2 = "livingStatusRequest"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            if (r20 == 0) goto L_0x01e4
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r20.getAdXml()
            if (r4 == 0) goto L_0x01e4
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r20.getAdXml()
            co2.n r4 = r4.adLiveInfo
            if (r4 != 0) goto L_0x001e
            goto L_0x01e4
        L_0x001e:
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r20.getAdXml()
            co2.n r4 = r4.adLiveInfo
            int r4 = r4.f264555a
            r5 = 2
            java.lang.String r6 = "SnsAd.DynamicUpdate"
            r7 = 1
            java.lang.String r8 = "isIntervalTimeExpired"
            if (r4 != 0) goto L_0x00f6
            java.lang.String r4 = "doWeAppLivingRequest"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            java.lang.String r10 = vr2.C102236a0.m134728W(r20)
            com.tencent.mm.plugin.sns.storage.ADInfo r11 = r20.getAdInfo()
            r12 = r19
            if (r12 != r5) goto L_0x0044
            com.tencent.mm.plugin.sns.storage.ADInfo r11 = r20.getAtAdInfo()
        L_0x0044:
            if (r11 == 0) goto L_0x0049
            java.lang.String r11 = r11.uxInfo
            goto L_0x004b
        L_0x0049:
            java.lang.String r11 = ""
        L_0x004b:
            java.lang.String r12 = "makeWeAppLivingRequestParams"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            com.tencent.mm.plugin.sns.storage.ADXml r14 = r20.getAdXml()
            if (r14 == 0) goto L_0x0091
            com.tencent.mm.plugin.sns.storage.ADXml r14 = r20.getAdXml()
            co2.n r14 = r14.adLiveInfo
            if (r14 != 0) goto L_0x0062
            goto L_0x0091
        L_0x0062:
            com.tencent.mm.plugin.sns.storage.ADXml r14 = r20.getAdXml()
            co2.n r14 = r14.adLiveInfo
            int r9 = r14.f264555a
            if (r9 != 0) goto L_0x008c
            te3.f2[] r7 = new te3.C49364f2[r7]
            te3.f2 r9 = new te3.f2     // Catch:{ all -> 0x008d }
            r9.<init>()     // Catch:{ all -> 0x008d }
            r9.f133246d = r5     // Catch:{ all -> 0x008d }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x008d }
            r5.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r15 = "liveParams"
            java.lang.String r14 = r14.f264556b     // Catch:{ all -> 0x008d }
            r5.putOpt(r15, r14)     // Catch:{ all -> 0x008d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x008d }
            r9.f133247e = r5     // Catch:{ all -> 0x008d }
            r5 = 0
            r7[r5] = r9     // Catch:{ all -> 0x008d }
            goto L_0x008d
        L_0x008c:
            r7 = 0
        L_0x008d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            goto L_0x0095
        L_0x0091:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            r7 = 0
        L_0x0095:
            java.lang.String r5 = "filterRequestParams"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            if (r7 != 0) goto L_0x00a1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            r9 = 0
            goto L_0x00d8
        L_0x00a1:
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            int r12 = r7.length
            r13 = 0
        L_0x00a8:
            if (r13 >= r12) goto L_0x00cb
            r14 = r7[r13]
            if (r14 == 0) goto L_0x00c4
            int r15 = r14.f133246d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            r20 = r7
            r7 = 0
            boolean r15 = r0.mo136624d(r10, r15, r7, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            if (r15 != 0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            r9.add(r14)
            goto L_0x00c6
        L_0x00c4:
            r20 = r7
        L_0x00c6:
            int r13 = r13 + 1
            r7 = r20
            goto L_0x00a8
        L_0x00cb:
            r7 = 0
            te3.f2[] r1 = new te3.C49364f2[r7]
            java.lang.Object[] r1 = r9.toArray(r1)
            r9 = r1
            te3.f2[] r9 = (te3.C49364f2[]) r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        L_0x00d8:
            boolean r1 = rq2.C101425k.m133102f(r9)
            if (r1 == 0) goto L_0x00ec
            lp2.g r1 = new lp2.g
            r1.<init>(r10, r11, r9)
            cq2.a r5 = new cq2.a
            r5.<init>(r0)
            r1.mo72088m1(r5)
            goto L_0x00f1
        L_0x00ec:
            java.lang.String r1 = "doWeAppLivingRequest::is the time not expired??"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
        L_0x00f1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x01e0
        L_0x00f6:
            if (r4 != r7) goto L_0x0147
            java.lang.String r4 = "requestFinderLivingNoticeState"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r20.getAdXml()
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r5 = r5.adCardActionBtnInfo
            if (r5 == 0) goto L_0x010f
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r20.getAdXml()
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r5 = r5.adCardActionBtnInfo
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r5 = r5.clickActionInfo
            goto L_0x0110
        L_0x010f:
            r5 = 0
        L_0x0110:
            if (r5 != 0) goto L_0x0117
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x01e0
        L_0x0117:
            java.lang.String r7 = vr2.C102236a0.m134728W(r20)
            r9 = 1000001(0xf4241, float:1.4013E-39)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            r10 = 0
            boolean r1 = r0.mo136624d(r7, r9, r10, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            if (r1 != 0) goto L_0x0136
            java.lang.String r1 = "requestFinderLivingNoticeState: is the time not expired??"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x01e0
        L_0x0136:
            java.lang.String r1 = r5.finderUsername
            java.lang.String r5 = r5.f273622J
            cq2.b r6 = new cq2.b
            r6.<init>(r0)
            io2.C98771b.m128554c(r7, r1, r5, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x01e0
        L_0x0147:
            if (r4 != r5) goto L_0x01e0
            java.lang.String r4 = "requestFinderLivingState"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r20.getAdXml()
            co2.n r5 = r5.adLiveInfo
            java.lang.String r7 = vr2.C102236a0.m134728W(r20)
            r9 = 1000003(0xf4243, float:1.401303E-39)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            r10 = 0
            boolean r1 = r0.mo136624d(r7, r9, r10, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            if (r1 != 0) goto L_0x0173
            java.lang.String r1 = "requestFinderLivingState: is the time not expired??"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x01e0
        L_0x0173:
            java.lang.String r9 = r5.f264557c
            java.lang.String r1 = r5.f264558d
            cq2.c r5 = new cq2.c
            r5.<init>(r0)
            java.lang.String r6 = "SnsAd.FinderLivingRequest"
            java.lang.String r14 = "requestLivingState"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            ht1.z4 r8 = io2.C98771b.m128552a()     // Catch:{ all -> 0x01c5 }
            if (r8 != 0) goto L_0x0196
            java.lang.String r1 = "the IFinderUtilApi is null in requestLivingState, is there something wrong in wechat??!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)     // Catch:{ all -> 0x01c5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
            goto L_0x01dd
        L_0x0196:
            io2.b$d r12 = new io2.b$d     // Catch:{ all -> 0x01c5 }
            r10 = 3
            r12.<init>(r7, r10, r5)     // Catch:{ all -> 0x01c5 }
            io2.b$c r13 = new io2.b$c     // Catch:{ all -> 0x01c5 }
            r13.<init>(r7, r10, r5)     // Catch:{ all -> 0x01c5 }
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r1)     // Catch:{ all -> 0x01c5 }
            r16 = 0
            int r5 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x01af
            r8.mo83774U5(r9, r10, r12, r13)     // Catch:{ all -> 0x01c5 }
            goto L_0x01da
        L_0x01af:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r5.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r8 = "is the liveId not number in requestLivingState????, liveId="
            r5.append(r8)     // Catch:{ all -> 0x01c5 }
            r5.append(r1)     // Catch:{ all -> 0x01c5 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01c5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)     // Catch:{ all -> 0x01c5 }
            goto L_0x01da
        L_0x01c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "requestLivingState is failed: sns id = "
            r1.append(r5)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
        L_0x01da:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
        L_0x01dd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
        L_0x01e0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x01e4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cq2.C97354d.mo136625e(int, com.tencent.mm.plugin.sns.storage.SnsInfo, boolean):void");
    }
}
