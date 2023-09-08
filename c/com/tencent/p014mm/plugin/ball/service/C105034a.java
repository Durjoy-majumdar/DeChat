package com.tencent.p014mm.plugin.ball.service;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.model.BallReportInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.List;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.plugin.ball.service.a */
public final class C105034a {
    /* renamed from: a */
    public static void m140875a(BallInfo ballInfo, List<BallInfo> list) {
        String str;
        int i;
        int i2 = ballInfo.f311683H.f311722n;
        Log.m105927v("MicroMsg.FloatBallReportLogic", "alvinluo addBallReport overLimitType: %d", Integer.valueOf(i2));
        int size = list.size();
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        for (int i6 = 0; i6 < size; i6++) {
            BallInfo ballInfo2 = list.get(i6);
            boolean z = ballInfo2.f311680E;
            if (z) {
                i3++;
            }
            if (z == ballInfo.f311680E && (i = ballInfo2.f311683H.f311725q) >= i4) {
                i4 = i + 1;
                i5 = i;
            }
        }
        int i7 = 2;
        ballInfo.f311683H.f311723o = String.format("%s_%d", new Object[]{C86709a0.m107523b().mo121111i(), Long.valueOf(ballInfo.f311704y)});
        BallReportInfo ballReportInfo = ballInfo.f311683H;
        if (size <= 1) {
            str = String.format("Aggre_%s", new Object[]{ballReportInfo.f311723o});
        } else {
            str = list.get(0).f311683H.f311724p;
        }
        ballReportInfo.f311724p = str;
        BallReportInfo ballReportInfo2 = ballInfo.f311683H;
        ballReportInfo2.f311725q = i4;
        if (ballReportInfo2.f311715d == 6) {
            ballReportInfo2.f311725q = i5;
        }
        try {
            Object[] objArr = new Object[15];
            objArr[0] = Long.valueOf(ballInfo.f311703x);
            objArr[1] = Integer.valueOf(ballReportInfo2.f311715d);
            objArr[2] = Integer.valueOf(ballReportInfo2.f311716e);
            objArr[3] = ballReportInfo2.f311723o;
            int i8 = 4;
            objArr[4] = ballReportInfo2.f311724p;
            objArr[5] = Integer.valueOf(ballReportInfo2.f311725q);
            objArr[6] = Integer.valueOf(size - i3);
            objArr[7] = Integer.valueOf(i3);
            if (ballInfo.f311680E) {
                i7 = 1;
            }
            objArr[8] = Integer.valueOf(i7);
            objArr[9] = Integer.valueOf(ballReportInfo2.f311717f);
            objArr[10] = C117627q.m165908a(Util.nullAsNil(ballReportInfo2.f311718g));
            objArr[11] = C117627q.m165908a(Util.nullAsNil(ballReportInfo2.f311719h));
            objArr[12] = C117627q.m165908a(Util.nullAsNil(ballReportInfo2.f311720i));
            int i9 = ballInfo.f311679D;
            if (i9 != 8) {
                if (i9 != 4) {
                    i8 = i9;
                }
            }
            objArr[13] = Integer.valueOf(i8);
            objArr[14] = Integer.valueOf(i2);
            String format = String.format("%d,%d,%d,%s,%s,%d,%d,%d,%d,%d,%s,%s,%s,%d,%d", objArr);
            Log.m105927v("MicroMsg.FloatBallReportLogic", "addBallReport reportStr:%s", format);
            C115669n.INSTANCE.kvStat(17602, format);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m140876b(BallInfo ballInfo, int i) {
        long j = 0;
        if (i == 18 && ballInfo.f311676A > 0) {
            j = Util.nowMilliSecond() - ballInfo.f311676A;
        }
        m140877c(ballInfo, i, 0, 0, 0, 0, j);
    }

    /* renamed from: c */
    public static void m140877c(BallInfo ballInfo, int i, long j, long j2, long j3, long j4, long j5) {
        BallInfo ballInfo2 = ballInfo;
        BallReportInfo ballReportInfo = ballInfo2.f311683H;
        Object[] objArr = new Object[10];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = ballReportInfo.f311723o;
        int i2 = 2;
        objArr[2] = ballReportInfo.f311724p;
        objArr[3] = Long.valueOf(j);
        objArr[4] = Long.valueOf(j2);
        objArr[5] = Long.valueOf(j3);
        if (ballInfo2.f311680E) {
            i2 = 1;
        }
        objArr[6] = Integer.valueOf(i2);
        objArr[7] = Integer.valueOf(ballReportInfo.f311725q);
        objArr[8] = Long.valueOf(j4);
        objArr[9] = Long.valueOf(j5);
        String format = String.format("%d,%s,%s,%d,%d,%d,%d,%d,%d,%d", objArr);
        C115669n.INSTANCE.kvStat(17604, format);
        Log.m105927v("MicroMsg.FloatBallReportLogic", "doOpBallReport reportStr:%s", format);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m140878d(com.tencent.p014mm.plugin.ball.model.BallInfo r15, boolean r16) {
        /*
            r0 = r15
            com.tencent.mm.plugin.ball.model.BallReportInfo r1 = r0.f311683H
            int r1 = r1.f311721j
            r2 = 0
            r3 = 1
            r4 = 10
            if (r1 == r4) goto L_0x0026
            r5 = 9
            if (r1 == r5) goto L_0x0026
            r5 = 8
            if (r1 == r5) goto L_0x0026
            r5 = 11
            if (r1 == r5) goto L_0x0026
            r5 = 14
            if (r1 == r5) goto L_0x0026
            r5 = 15
            if (r1 == r5) goto L_0x0026
            r5 = 16
            if (r1 != r5) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r5 = 0
            goto L_0x0027
        L_0x0026:
            r5 = 1
        L_0x0027:
            if (r5 != 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "MicroMsg.FloatBallReportLogic"
            java.lang.String r2 = "removeBallReport unexpected opType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r2, r0)
            return
        L_0x003a:
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r5 = r0.f311703x
            long r8 = r1 - r5
            long r5 = r0.f311704y
            long r6 = r1 - r5
            r10 = 0
            if (r16 == 0) goto L_0x006e
            com.tencent.mm.plugin.ball.model.BallReportInfo r3 = r0.f311683H
            java.lang.String r3 = r3.f311724p
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x006e
            com.tencent.mm.plugin.ball.model.BallReportInfo r3 = r0.f311683H
            java.lang.String r3 = r3.f311724p
            r5 = -1
            java.lang.String r12 = "_"
            java.lang.String[] r3 = r3.split(r12, r5)
            int r5 = r3.length
            r12 = 3
            if (r5 != r12) goto L_0x006e
            r5 = 2
            r3 = r3[r5]     // Catch:{ Exception -> 0x006d }
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r3)     // Catch:{ Exception -> 0x006d }
            long r12 = r1 - r12
            goto L_0x006f
        L_0x006d:
        L_0x006e:
            r12 = r10
        L_0x006f:
            com.tencent.mm.plugin.ball.model.BallReportInfo r3 = r0.f311683H
            int r3 = r3.f311721j
            if (r3 != r4) goto L_0x007d
            long r4 = r0.f311676A
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x007d
            long r1 = r1 - r4
            r10 = r1
        L_0x007d:
            r4 = 0
            r0 = r15
            r1 = r3
            r2 = r4
            r4 = r12
            m140877c(r0, r1, r2, r4, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.service.C105034a.m140878d(com.tencent.mm.plugin.ball.model.BallInfo, boolean):void");
    }
}
