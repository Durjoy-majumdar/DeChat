package wc0;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.recoveryv2.C85675e;
import com.tencent.p014mm.recoveryv2.C85689j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.File;

/* renamed from: wc0.f */
public final class C90944f {
    /* renamed from: a */
    public static void m114049a(Context context) {
        C85675e.C85677b bVar = new C85675e.C85677b(context);
        bVar.mo119261a();
        String b = bVar.mo119262b();
        if (TextUtils.isEmpty(b)) {
            b = "nothing";
        }
        Log.m105924i("MicroMsg.recovery.reporter", ">>>>>>> dump recovery internal log (:main) <<<<<<<");
        Log.m105924i("MicroMsg.recovery.reporter", "\n" + b);
        Log.m105924i("MicroMsg.recovery.reporter", ">>>>>>>>>>>>>>>>>>>>>> end <<<<<<<<<<<<<<<<<<<<<<<");
        C85689j.C85691b.m105836d(new File(bVar.f249661c));
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x02c3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m114050b(android.content.Context r47) {
        /*
            java.lang.String r0 = "MicroMsg.recovery.reporter"
            java.lang.String r1 = "do recovery report after recover from exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.recoveryv2.d$b r1 = new com.tencent.mm.recoveryv2.d$b
            java.lang.String r2 = "recovery_statistic"
            r3 = r47
            r1.<init>(r3, r2)
            r1.mo119256e()
            java.lang.String r2 = "crash_count"
            r3 = 0
            int r4 = r1.getInt(r2, r3)
            java.lang.String r5 = "launch_recovery"
            boolean r6 = r1.getBoolean(r5, r3)
            java.lang.String r7 = "launch_recovery_real"
            boolean r8 = r1.getBoolean(r7, r3)
            java.lang.String r9 = "recover_from_crash"
            boolean r10 = r1.getBoolean(r9, r3)
            java.lang.String r11 = "recovery_status"
            r12 = -1
            int r13 = r1.getInt(r11, r12)
            java.lang.String r14 = "recovery_from"
            int r15 = r1.getInt(r14, r3)
            java.lang.String r12 = "recover_internal_status"
            r16 = r14
            int r14 = r1.getInt(r12, r3)
            r17 = r12
            java.lang.String r12 = "recover_launch_mode"
            int r18 = r1.getInt(r12, r3)
            java.lang.String r3 = "recover_running_time"
            r19 = r11
            r20 = r12
            r11 = 0
            long r21 = r1.getLong(r3, r11)
            java.lang.String r11 = "recover_is_discard"
            r12 = 0
            boolean r23 = r1.getBoolean(r11, r12)
            java.lang.String r12 = "recover_app_ver"
            r24 = r11
            java.lang.String r11 = ""
            java.lang.String r35 = r1.getString(r12, r11)
            if (r23 == 0) goto L_0x0077
            java.lang.String r1 = "not thing to report"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x0077:
            r23 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r36 = r12
            java.lang.String r12 = "report crash count = "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            r11 = 20
            r12 = 1
            if (r4 < r12) goto L_0x00c1
            if (r4 > r11) goto L_0x00c1
            kj2.d r11 = kj2.C117407d.INSTANCE
            r26 = 1341(0x53d, double:6.625E-321)
            int r12 = r4 + 200
            r37 = r1
            r38 = r2
            long r1 = (long) r12
            r30 = 1
            r32 = 0
            r25 = r11
            r28 = r1
            r25.idkeyStat(r26, r28, r30, r32)
            r1 = 5
            if (r4 < r1) goto L_0x00e8
            r26 = 1341(0x53d, double:6.625E-321)
            int r1 = r4 + 220
            long r1 = (long) r1
            r30 = 1
            r32 = 0
            r25 = r11
            r28 = r1
            r25.idkeyStat(r26, r28, r30, r32)
            goto L_0x00e8
        L_0x00c1:
            r37 = r1
            r38 = r2
            if (r4 <= r11) goto L_0x00e8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "abnormal crash count found, num = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            kj2.d r25 = kj2.C117407d.INSTANCE
            r26 = 1341(0x53d, double:6.625E-321)
            r28 = 105(0x69, double:5.2E-322)
            r30 = 1
            r32 = 0
            r25.idkeyStat(r26, r28, r30, r32)
        L_0x00e8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "report recovery ui launch, result = "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r6 == 0) goto L_0x010c
            kj2.d r25 = kj2.C117407d.INSTANCE
            r26 = 1341(0x53d, double:6.625E-321)
            r28 = 100
            r30 = 1
            r32 = 0
            r25.idkeyStat(r26, r28, r30, r32)
        L_0x010c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "report recovery ui launch real, result = "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r8 == 0) goto L_0x0130
            kj2.d r25 = kj2.C117407d.INSTANCE
            r26 = 1341(0x53d, double:6.625E-321)
            r28 = 102(0x66, double:5.04E-322)
            r30 = 1
            r32 = 0
            r25.idkeyStat(r26, r28, r30, r32)
        L_0x0130:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "report if recover from crash, result = "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r10 == 0) goto L_0x0154
            kj2.d r25 = kj2.C117407d.INSTANCE
            r26 = 1341(0x53d, double:6.625E-321)
            r28 = 101(0x65, double:5.0E-322)
            r30 = 1
            r32 = 0
            r25.idkeyStat(r26, r28, r30, r32)
        L_0x0154:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "recovery status = "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r13 < 0) goto L_0x0192
            if (r13 != 0) goto L_0x017b
            kj2.d r25 = kj2.C117407d.INSTANCE
            r26 = 1341(0x53d, double:6.625E-321)
            r28 = 103(0x67, double:5.1E-322)
            r30 = 1
            r32 = 0
            r25.idkeyStat(r26, r28, r30, r32)
            goto L_0x0192
        L_0x017b:
            kj2.d r1 = kj2.C117407d.INSTANCE
            r40 = 1341(0x53d, double:6.625E-321)
            r42 = 104(0x68, double:5.14E-322)
            r44 = 1
            r46 = 0
            r39 = r1
            r39.idkeyStat(r40, r42, r44, r46)
            int r2 = r13 + 110
            long r11 = (long) r2
            r42 = r11
            r39.idkeyStat(r40, r42, r44, r46)
        L_0x0192:
            java.lang.String r28 = p988jj.C87968a.m109465a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "crash-"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r30 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "needLaunch-"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r31 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hasLaunch-"
            r1.append(r2)
            if (r18 <= 0) goto L_0x01c7
            int r2 = r18 + 100
            goto L_0x01cc
        L_0x01c7:
            if (r8 == 0) goto L_0x01cb
            r2 = 1
            goto L_0x01cc
        L_0x01cb:
            r2 = 0
        L_0x01cc:
            r1.append(r2)
            java.lang.String r32 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hasRecover-"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r33 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "stat-"
            r1.append(r2)
            r1.append(r13)
            java.lang.String r34 = r1.toString()
            java.lang.String r1 = "MicroMsg.CompatReporter"
            java.lang.String r4 = "#reportRecoveryStat: recStat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r25 = 1
            r26 = 0
            java.lang.String r27 = "recStat"
            r29 = r35
            p988jj.C87968a.C87969a.m109466a(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "recovery from = "
            r4.append(r6)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            r4 = 10
            if (r15 < 0) goto L_0x0234
            if (r15 >= r4) goto L_0x0234
            kj2.d r25 = kj2.C117407d.INSTANCE
            r26 = 1341(0x53d, double:6.625E-321)
            int r6 = r15 + 140
            long r10 = (long) r6
            r30 = 1
            r32 = 0
            r28 = r10
            r25.idkeyStat(r26, r28, r30, r32)
        L_0x0234:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "recovery internalStatus = "
            r6.append(r8)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            if (r14 < 0) goto L_0x025d
            if (r14 >= r4) goto L_0x025d
            kj2.d r25 = kj2.C117407d.INSTANCE
            r26 = 1341(0x53d, double:6.625E-321)
            int r0 = r14 + 150
            long r10 = (long) r0
            r30 = 1
            r32 = 0
            r28 = r10
            r25.idkeyStat(r26, r28, r30, r32)
        L_0x025d:
            r10 = 0
            int r0 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0265
        L_0x0263:
            r12 = -1
            goto L_0x02c1
        L_0x0265:
            r10 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x026d
            r12 = 0
            goto L_0x02c1
        L_0x026d:
            r12 = 60000(0xea60, double:2.9644E-319)
            r25 = 6
            r27 = 1
            int r0 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0285
            long r21 = r21 / r10
            int r0 = (r21 > r27 ? 1 : (r21 == r27 ? 0 : -1))
            if (r0 < 0) goto L_0x0263
            int r0 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r0 > 0) goto L_0x0263
            r0 = 0
        L_0x0283:
            long r10 = (long) r0
            goto L_0x02bb
        L_0x0285:
            r10 = 600000(0x927c0, double:2.964394E-318)
            int r0 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x029a
            long r21 = r21 / r12
            int r0 = (r21 > r27 ? 1 : (r21 == r27 ? 0 : -1))
            if (r0 < 0) goto L_0x0263
            r10 = 10
            int r0 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0263
            r0 = 6
            goto L_0x02ba
        L_0x029a:
            r12 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x02ae
            long r21 = r21 / r10
            int r0 = (r21 > r27 ? 1 : (r21 == r27 ? 0 : -1))
            if (r0 < 0) goto L_0x0263
            int r0 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r0 > 0) goto L_0x0263
            r0 = 16
            goto L_0x02ba
        L_0x02ae:
            long r21 = r21 / r12
            int r0 = (r21 > r27 ? 1 : (r21 == r27 ? 0 : -1))
            if (r0 < 0) goto L_0x0263
            r0 = 22
            int r4 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r4 > 0) goto L_0x02bf
        L_0x02ba:
            goto L_0x0283
        L_0x02bb:
            long r10 = r10 + r21
            int r12 = (int) r10
            goto L_0x02c1
        L_0x02bf:
            r12 = 29
        L_0x02c1:
            if (r12 < 0) goto L_0x02d3
            kj2.d r25 = kj2.C117407d.INSTANCE
            r26 = 1341(0x53d, double:6.625E-321)
            int r0 = r12 + 160
            long r10 = (long) r0
            r30 = 1
            r32 = 0
            r28 = r10
            r25.idkeyStat(r26, r28, r30, r32)
        L_0x02d3:
            java.lang.String r28 = p988jj.C87968a.m109465a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "form-"
            r0.append(r4)
            r0.append(r15)
            java.lang.String r30 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r14)
            java.lang.String r31 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "runTime-"
            r0.append(r2)
            r0.append(r12)
            java.lang.String r32 = r0.toString()
            java.lang.String r0 = "#reportRecoveryStat: recStatInner"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r25 = 1
            r26 = 0
            java.lang.String r27 = "recStatInner"
            java.lang.String r33 = ""
            java.lang.String r34 = ""
            r29 = r35
            p988jj.C87968a.C87969a.m109466a(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = 0
            long r1 = (long) r0
            r4 = r37
            r6 = r38
            r4.mo119258g(r6, r1)
            r4.putBoolean(r5, r0)
            r4.putBoolean(r7, r0)
            r4.putBoolean(r9, r0)
            r1 = r19
            r2 = -1
            r4.putInt(r1, r2)
            r1 = r16
            r4.putInt(r1, r0)
            r1 = r17
            r4.putInt(r1, r0)
            r1 = r20
            r4.putInt(r1, r0)
            r0 = 0
            r4.putLong(r3, r0)
            r0 = r24
            r1 = 1
            r4.putBoolean(r0, r1)
            r1 = r23
            r0 = r36
            r4.putString(r0, r1)
            r4.mo119242c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wc0.C90944f.m114050b(android.content.Context):void");
    }
}
