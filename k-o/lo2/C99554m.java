package lo2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C102236a0;

/* renamed from: lo2.m */
public final class C99554m {

    /* renamed from: a */
    public static long f291831a;

    /* JADX WARNING: Removed duplicated region for block: B:123:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0194 A[EDGE_INSN: B:150:0x0194->B:55:0x0194 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0197 A[Catch:{ all -> 0x01e3 }, LOOP:0: B:21:0x00ce->B:56:0x0197, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0222 A[Catch:{ all -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0272  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m129936a(int r27, int r28, java.lang.String r29) {
        /*
            r1 = r27
            r2 = r28
            java.lang.String r3 = "checkDeleteExpireAdByPage"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r6 = "AdExpireDeleteHelper"
            r7 = 1
            if (r1 == r2) goto L_0x042f
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 1612(0x64c, float:2.259E-42)
            if (r2 != 0) goto L_0x0028
            java.lang.String r0 = "query startTime==0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0.mo175911u(r10, r7)
        L_0x0028:
            java.lang.String r11 = "checkDeleteExpireContractAd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r4)
            long r12 = java.lang.System.currentTimeMillis()
            long r14 = f291831a
            long r12 = r12 - r14
            java.lang.String r10 = ", exposureCnt="
            java.lang.String r7 = ", delCount="
            java.lang.String r14 = ", belowAdTime="
            java.lang.String r15 = ", exposureTime="
            r19 = r3
            r17 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x007b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "checkContractAd return, duration="
            r0.append(r3)
            r0.append(r12)
            java.lang.String r3 = ", delay="
            r0.append(r3)
            r3 = 60000(0xea60, float:8.4078E-41)
            r0.append(r3)
            java.lang.String r3 = ", lastTime="
            r0.append(r3)
            long r12 = f291831a
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            r1 = r4
            r23 = r5
            r2 = r7
            r20 = r8
            r22 = r14
            goto L_0x025e
        L_0x007b:
            long r12 = java.lang.System.currentTimeMillis()
            f291831a = r12
            int r3 = eb0.C31543z5.m39455e()
            r0 = 432000(0x69780, float:6.05361E-40)
            int r0 = r3 - r0
            if (r0 >= 0) goto L_0x008d
            r0 = 0
        L_0x008d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "checkContractAd, topAdTime="
            r12.append(r13)
            r12.append(r3)
            r12.append(r14)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            lo2.y0$a r13 = lo2.C34323y0.C34324a.m40328b()
            r18 = 0
            r20 = r8
            os2.j r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()     // Catch:{ all -> 0x01f2 }
            android.database.Cursor r8 = r8.mo139860Lo(r3, r0)     // Catch:{ all -> 0x01f2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r9.<init>()     // Catch:{ all -> 0x01e5 }
            if (r8 == 0) goto L_0x01aa
            boolean r0 = r8.moveToFirst()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01aa
            if (r3 <= 0) goto L_0x01aa
            r0 = 0
            r16 = 1
        L_0x00ce:
            int r18 = r0 + 1
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r0 = new com.tencent.mm.plugin.sns.storage.AdSnsInfo     // Catch:{ all -> 0x016c }
            r0.<init>()     // Catch:{ all -> 0x016c }
            r0.convertFrom((android.database.Cursor) r8)     // Catch:{ all -> 0x016c }
            r22 = r14
            com.tencent.mm.plugin.sns.storage.ADInfo r14 = r0.getAdInfo()     // Catch:{ all -> 0x0163 }
            r23 = r5
            boolean r5 = r0.isExposured()     // Catch:{ all -> 0x015f }
            long r1 = r0.field_snsId     // Catch:{ all -> 0x015f }
            java.lang.String r1 = vr2.C102236a0.m134765q0(r1)     // Catch:{ all -> 0x015f }
            int r2 = r14.contractAdEndTime     // Catch:{ all -> 0x015f }
            if (r2 <= 0) goto L_0x0119
            if (r2 >= r3) goto L_0x0119
            if (r5 != 0) goto L_0x0119
            r2 = r7
            r24 = r8
            long r7 = r0.field_snsId     // Catch:{ all -> 0x0115 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0115 }
            r12.add(r7)     // Catch:{ all -> 0x0115 }
            com.tencent.mm.plugin.sns.storage.ADInfo r7 = r0.getAdInfo()     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = r7.uxInfo     // Catch:{ all -> 0x0115 }
            r8 = 3
            r25 = r4
            r4 = 0
            r13.mo59560a(r7, r1, r8, r4)     // Catch:{ all -> 0x015d }
            r9.append(r1)     // Catch:{ all -> 0x015d }
            java.lang.String r4 = "|"
            r9.append(r4)     // Catch:{ all -> 0x015d }
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            r25 = r4
            goto L_0x0176
        L_0x0119:
            r25 = r4
            r2 = r7
            r24 = r8
        L_0x011e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015d }
            r4.<init>()     // Catch:{ all -> 0x015d }
            java.lang.String r7 = "checkContractAd, snsId="
            r4.append(r7)     // Catch:{ all -> 0x015d }
            r4.append(r1)     // Catch:{ all -> 0x015d }
            java.lang.String r1 = ", contractAdEndTime="
            r4.append(r1)     // Catch:{ all -> 0x015d }
            int r1 = r14.contractAdEndTime     // Catch:{ all -> 0x015d }
            r4.append(r1)     // Catch:{ all -> 0x015d }
            java.lang.String r1 = ", isExposure="
            r4.append(r1)     // Catch:{ all -> 0x015d }
            r4.append(r5)     // Catch:{ all -> 0x015d }
            r4.append(r15)     // Catch:{ all -> 0x015d }
            int r1 = r0.field_exposureTime     // Catch:{ all -> 0x015d }
            r4.append(r1)     // Catch:{ all -> 0x015d }
            r4.append(r10)     // Catch:{ all -> 0x015d }
            int r0 = r0.field_exposureCount     // Catch:{ all -> 0x015d }
            r4.append(r0)     // Catch:{ all -> 0x015d }
            java.lang.String r0 = ", now="
            r4.append(r0)     // Catch:{ all -> 0x015d }
            r4.append(r3)     // Catch:{ all -> 0x015d }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x015d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x015d }
            goto L_0x018e
        L_0x015d:
            r0 = move-exception
            goto L_0x0176
        L_0x015f:
            r0 = move-exception
            r25 = r4
            goto L_0x0168
        L_0x0163:
            r0 = move-exception
            r25 = r4
            r23 = r5
        L_0x0168:
            r2 = r7
            r24 = r8
            goto L_0x0176
        L_0x016c:
            r0 = move-exception
            r25 = r4
            r23 = r5
            r2 = r7
            r24 = r8
            r22 = r14
        L_0x0176:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e3 }
            r1.<init>()     // Catch:{ all -> 0x01e3 }
            java.lang.String r4 = "checkContractAd loop exp="
            r1.append(r4)     // Catch:{ all -> 0x01e3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e3 }
            r1.append(r0)     // Catch:{ all -> 0x01e3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01e3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ all -> 0x01e3 }
        L_0x018e:
            boolean r0 = r24.moveToNext()     // Catch:{ all -> 0x01e3 }
            if (r0 != 0) goto L_0x0197
            r0 = r18
            goto L_0x01b4
        L_0x0197:
            r1 = r27
            r7 = r2
            r0 = r18
            r14 = r22
            r5 = r23
            r8 = r24
            r4 = r25
            r16 = 1
            r2 = r28
            goto L_0x00ce
        L_0x01aa:
            r25 = r4
            r23 = r5
            r2 = r7
            r24 = r8
            r22 = r14
            r0 = 0
        L_0x01b4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e3 }
            r1.<init>()     // Catch:{ all -> 0x01e3 }
            java.lang.String r3 = "checkContractAd, delAd="
            r1.append(r3)     // Catch:{ all -> 0x01e3 }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x01e3 }
            r1.append(r3)     // Catch:{ all -> 0x01e3 }
            r1.append(r2)     // Catch:{ all -> 0x01e3 }
            int r3 = r12.size()     // Catch:{ all -> 0x01e3 }
            r1.append(r3)     // Catch:{ all -> 0x01e3 }
            java.lang.String r3 = ", totalCount="
            r1.append(r3)     // Catch:{ all -> 0x01e3 }
            r1.append(r0)     // Catch:{ all -> 0x01e3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01e3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x01e3 }
            if (r24 == 0) goto L_0x0219
            r8 = r24
            goto L_0x0216
        L_0x01e3:
            r0 = move-exception
            goto L_0x01ef
        L_0x01e5:
            r0 = move-exception
            r25 = r4
            r23 = r5
            r2 = r7
            r24 = r8
            r22 = r14
        L_0x01ef:
            r18 = r24
            goto L_0x01fa
        L_0x01f2:
            r0 = move-exception
            r25 = r4
            r23 = r5
            r2 = r7
            r22 = r14
        L_0x01fa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0423 }
            r1.<init>()     // Catch:{ all -> 0x0423 }
            java.lang.String r3 = "checkContractAd, exp="
            r1.append(r3)     // Catch:{ all -> 0x0423 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0423 }
            r1.append(r0)     // Catch:{ all -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0423 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ all -> 0x0423 }
            if (r18 == 0) goto L_0x0219
            r8 = r18
        L_0x0216:
            r8.close()     // Catch:{ all -> 0x0219 }
        L_0x0219:
            r13.mo59561c()
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0241 }
            if (r0 != 0) goto L_0x023e
            java.util.Iterator r0 = r12.iterator()     // Catch:{ all -> 0x0241 }
        L_0x0226:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0241 }
            if (r1 == 0) goto L_0x023b
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0241 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0241 }
            long r3 = r1.longValue()     // Catch:{ all -> 0x0241 }
            r1 = 5
            com.tencent.p014mm.plugin.sns.model.C94833a.m120153f(r3, r1)     // Catch:{ all -> 0x0241 }
            goto L_0x0226
        L_0x023b:
            r12.clear()     // Catch:{ all -> 0x0241 }
        L_0x023e:
            r1 = r25
            goto L_0x025b
        L_0x0241:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "checkContractAd deleteAdWithNoCheck exp="
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x023e
        L_0x025b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)
        L_0x025e:
            os2.j r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
            r3 = r27
            r4 = r28
            android.database.Cursor r0 = r0.mo139860Lo(r3, r4)
            if (r0 == 0) goto L_0x03c4
            boolean r7 = r0.moveToFirst()
            if (r7 == 0) goto L_0x03c4
            lo2.y0$a r7 = lo2.C34323y0.C34324a.m40328b()
            r8 = 0
            r9 = 1
        L_0x0278:
            int r8 = r8 + r9
            r9 = 50
            if (r8 <= r9) goto L_0x028a
            r25 = r0
            r24 = r2
            r26 = r8
            r3 = r23
            r5 = 0
            r2 = r29
            goto L_0x03a9
        L_0x028a:
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r9 = new com.tencent.mm.plugin.sns.storage.AdSnsInfo
            r9.<init>()
            r9.convertFrom((android.database.Cursor) r0)
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r9.convertToSnsInfo()
            long r12 = r11.field_snsId
            java.lang.String r12 = vr2.C102236a0.m134765q0(r12)
            com.tencent.mm.plugin.sns.storage.ADInfo r13 = r11.getAdInfo()
            int r14 = r11.field_createTime
            boolean r5 = r9.isExposured()
            if (r13 == 0) goto L_0x02c0
            r24 = 60
            if (r5 == 0) goto L_0x02b5
            long r13 = r13.exposureNoActionExpireTime
            long r13 = r13 * r24
            r26 = r8
            int r8 = r9.field_exposureTime
            goto L_0x02bd
        L_0x02b5:
            r26 = r8
            long r13 = r13.noExposureExpireTime
            long r13 = r13 * r24
            int r8 = r9.field_createAdTime
        L_0x02bd:
            r24 = r2
            goto L_0x02c7
        L_0x02c0:
            r26 = r8
            r24 = r2
            r8 = r14
            r13 = 21600(0x5460, double:1.0672E-319)
        L_0x02c7:
            long r2 = (long) r8
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r25 = r0
            java.lang.String r0 = "expire check, snsId="
            r4.append(r0)
            r4.append(r12)
            java.lang.String r0 = ", isExposured="
            r4.append(r0)
            r4.append(r5)
            r4.append(r10)
            int r0 = r9.field_exposureCount
            r4.append(r0)
            r4.append(r15)
            r4.append(r13)
            java.lang.String r0 = ", field_createTime="
            r4.append(r0)
            int r0 = r11.field_createTime
            r4.append(r0)
            java.lang.String r0 = ", checktime="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", gettime="
            r4.append(r0)
            r4.append(r8)
            r4.append(r15)
            int r0 = r9.field_exposureTime
            r4.append(r0)
            java.lang.String r0 = ", adCreateTIme="
            r4.append(r0)
            int r0 = r9.field_createAdTime
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0358
            com.tencent.mm.protocal.protobuf.SnsObject r0 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120367e(r11)
            r2 = r29
            boolean r0 = vr2.C102260r.m134839H(r0, r2)
            if (r0 != 0) goto L_0x035a
            long r3 = r11.field_snsId
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r3 = r23
            r3.add(r0)
            if (r5 != 0) goto L_0x0356
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r9.getAdInfo()
            java.lang.String r0 = r0.uxInfo
            r4 = 2
            r5 = 0
            r7.mo59560a(r0, r12, r4, r5)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 1907(0x773, float:2.672E-42)
            r8 = 21
            r0.mo175911u(r4, r8)
            goto L_0x03a9
        L_0x0356:
            r5 = 0
            goto L_0x03a9
        L_0x0358:
            r2 = r29
        L_0x035a:
            r3 = r23
            r5 = 0
            java.lang.String r0 = "updateAdDetail"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            long r8 = r11.field_snsId
            java.util.List<java.lang.Long> r4 = com.tencent.p014mm.plugin.sns.model.C94835a0.f274744h
            java.lang.String r4 = "addDetailReq"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r12)
            java.util.List<java.lang.Long> r13 = com.tencent.p014mm.plugin.sns.model.C94835a0.f274744h
            java.lang.Long r14 = java.lang.Long.valueOf(r8)
            boolean r13 = r13.contains(r14)
            if (r13 == 0) goto L_0x037f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r12)
            r4 = 0
            goto L_0x038c
        L_0x037f:
            java.util.List<java.lang.Long> r13 = com.tencent.p014mm.plugin.sns.model.C94835a0.f274744h
            java.lang.Long r14 = java.lang.Long.valueOf(r8)
            r13.add(r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r12)
            r4 = 1
        L_0x038c:
            if (r4 == 0) goto L_0x03a6
            com.tencent.mm.plugin.sns.model.a0 r4 = new com.tencent.mm.plugin.sns.model.a0
            com.tencent.mm.plugin.sns.storage.ADInfo r11 = r11.getAdInfo()
            java.lang.String r11 = r11.adInfoSyncBuffer
            r12 = 1
            r4.<init>((long) r8, (int) r12, (java.lang.String) r11)
            f40.C86709a0.m107528h()
            f40.g r8 = f40.C86709a0.m107529k()
            ob0.b0 r8 = r8.f251779b
            r8.mo123460f(r4)
        L_0x03a6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
        L_0x03a9:
            boolean r0 = r25.moveToNext()
            if (r0 != 0) goto L_0x03b5
            r7.mo59561c()
            r5 = r26
            goto L_0x03cb
        L_0x03b5:
            r4 = r28
            r23 = r3
            r2 = r24
            r0 = r25
            r8 = r26
            r9 = 1
            r3 = r27
            goto L_0x0278
        L_0x03c4:
            r25 = r0
            r24 = r2
            r3 = r23
            r5 = 0
        L_0x03cb:
            if (r25 == 0) goto L_0x03d0
            r25.close()
        L_0x03d0:
            long r7 = java.lang.System.currentTimeMillis()
            int r0 = r3.size()
            r2 = r28
            if (r2 != 0) goto L_0x03ea
            int r4 = r5 - r0
            r9 = 2
            if (r4 <= r9) goto L_0x03ea
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 29
            r10 = 1612(0x64c, float:2.259E-42)
            r4.mo175911u(r10, r9)
        L_0x03ea:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "checkExpireAd, topAdTime="
            r4.append(r9)
            r9 = r27
            r4.append(r9)
            r9 = r22
            r4.append(r9)
            r4.append(r2)
            java.lang.String r2 = ", adCount="
            r4.append(r2)
            r4.append(r5)
            r2 = r24
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = ", timeCost="
            r4.append(r0)
            long r7 = r7 - r20
            r4.append(r7)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0433
        L_0x0423:
            r0 = move-exception
            r1 = r25
            if (r18 == 0) goto L_0x042b
            r18.close()     // Catch:{ all -> 0x042b }
        L_0x042b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)
            throw r0
        L_0x042f:
            r19 = r3
            r1 = r4
            r3 = r5
        L_0x0433:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x046d
            java.util.Iterator r0 = r3.iterator()
        L_0x043d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x046a
            java.lang.Object r2 = r0.next()
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "deleteAdWithNoCheck, id="
            r2.append(r7)
            java.lang.String r7 = vr2.C102236a0.m134765q0(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r2 = 1
            com.tencent.p014mm.plugin.sns.model.C94833a.m120153f(r4, r2)
            goto L_0x043d
        L_0x046a:
            r3.clear()
        L_0x046d:
            r2 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C99554m.m129936a(int, int, java.lang.String):void");
    }

    /* renamed from: b */
    public static AdSnsInfo m129937b(AdSnsInfo adSnsInfo) {
        SnsMethodCalculate.markStartTimeMs("resetAdExposureInfo", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        if (adSnsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("resetAdExposureInfo", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return null;
        }
        String q0 = C102236a0.m134765q0(adSnsInfo.field_snsId);
        int i = adSnsInfo.field_exposureTime;
        int i2 = adSnsInfo.field_exposureCount;
        boolean isExposured = adSnsInfo.isExposured();
        Log.m105924i("AdExpireDeleteHelper", "resetAdExposureInfo, snsId=" + q0 + ", exposureTime=" + i + ", exposureCount=" + i2 + ", isExposured=" + isExposured);
        adSnsInfo.field_exposureTime = 0;
        adSnsInfo.field_exposureCount = 0;
        adSnsInfo.setNotExposured();
        SnsMethodCalculate.markEndTimeMs("resetAdExposureInfo", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        return adSnsInfo;
    }
}
