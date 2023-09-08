package com.tencent.p014mm.plugin.sport.model;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.sport.model.i */
public final class C115768i implements Runnable {

    /* renamed from: h */
    public static volatile long f347331h;

    /* renamed from: d */
    public final long f347332d;

    /* renamed from: e */
    public final long f347333e;

    /* renamed from: f */
    public final long f347334f;

    /* renamed from: g */
    public final String f347335g;

    public C115768i(long j, long j2, long j3, String str) {
        C87412m.m108594g(str, "process");
        this.f347332d = j;
        this.f347333e = j2;
        this.f347334f = j3;
        this.f347335g = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r32 = this;
            r0 = r32
            java.lang.Class<sv2.f> r1 = sv2.C118311f.class
            long r2 = f347331h
            long r4 = r0.f347332d
            r6 = 4
            r7 = 5
            java.lang.String r8 = "MicroMsg.Sport.PushSportTask"
            r9 = 3
            r10 = 2
            r11 = 0
            r12 = 1
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 < 0) goto L_0x0040
            java.lang.Object[] r1 = new java.lang.Object[r7]
            long r2 = r0.f347333e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r11] = r2
            long r2 = r0.f347334f
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r12] = r2
            long r2 = f347331h
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r10] = r2
            long r2 = r0.f347332d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r9] = r2
            java.lang.String r2 = r0.f347335g
            r1[r6] = r2
            java.lang.String r2 = "PushStepChangeTask execute sync smaller nano time %s %s %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r1)
            return
        L_0x0040:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "PushStepChangeTask execute sync time sensorStep:"
            r2.append(r3)
            long r3 = r0.f347333e
            r2.append(r3)
            java.lang.String r3 = " sensorNanoTime:"
            r2.append(r3)
            long r3 = r0.f347334f
            r2.append(r3)
            java.lang.String r3 = " lastTickTime:"
            r2.append(r3)
            long r3 = r0.f347332d
            r2.append(r3)
            java.lang.String r3 = " process:"
            r2.append(r3)
            java.lang.String r3 = r0.f347335g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            long r2 = r0.f347332d
            f347331h = r2
            di3.d r2 = di3.C86312j.m106911c(r1)
            if (r2 == 0) goto L_0x027b
            di3.d r1 = di3.C86312j.m106911c(r1)
            sv2.f r1 = (sv2.C118311f) r1
            com.tencent.mm.plugin.sport.model.PushSportStepDetector r1 = r1.xx0()
            long r2 = r0.f347333e
            long r4 = r0.f347334f
            java.lang.String r8 = r0.f347335g
            r1.getClass()
            org.json.JSONObject r13 = com.tencent.p014mm.plugin.sport.model.C115769k.m162824c()
            java.lang.String r14 = "deviceStepSwitch"
            int r14 = r13.optInt(r14)
            java.lang.String r15 = "MicroMsg.Sport.PushSportStepDetector"
            if (r14 == r12) goto L_0x00a9
            r1.mo176111d()
            java.lang.String r1 = "device step switch off"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            goto L_0x027b
        L_0x00a9:
            r14 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r7 = "stepCounterMaxStep5m"
            int r7 = r13.optInt(r7, r14)
            long r16 = com.tencent.p014mm.plugin.sport.model.C115778q.m162838g()
            r18 = 0
            int r14 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r14 >= 0) goto L_0x00bd
            goto L_0x027b
        L_0x00bd:
            long r20 = eb0.C31543z5.m39453c()
            long r22 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347301o
            int r14 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x00ef
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r7 = com.tencent.p014mm.plugin.sport.model.C115778q.m162837f(r16)
            r6[r11] = r7
            long r7 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347301o
            java.lang.String r7 = com.tencent.p014mm.plugin.sport.model.C115778q.m162837f(r7)
            r6[r12] = r7
            java.lang.String r7 = "new day beginOfToday: %s saveTodayBeginTime: %s, "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r7, r6)
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347298i = r2
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347299j = r18
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347300n = r18
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347301o = r16
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347302p = r20
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347303q = r20
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347304r = r4
            r1.mo176110c()
            goto L_0x027b
        L_0x00ef:
            long r16 = eb0.C31543z5.m39453c()
            long r22 = android.os.SystemClock.elapsedRealtime()
            long r16 = r16 - r22
            long r22 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347303q
            long r22 = r20 - r22
            r24 = 300000(0x493e0, double:1.482197E-318)
            long r26 = r22 / r24
            long r22 = r22 % r24
            int r14 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            r23 = r7
            if (r14 <= 0) goto L_0x010c
            r14 = 1
            goto L_0x010d
        L_0x010c:
            r14 = 0
        L_0x010d:
            long r6 = (long) r14
            long r26 = r26 + r6
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r28 = r4 / r6
            long r30 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347304r
            long r30 = r30 / r6
            long r28 = r28 - r30
            long r6 = r28 / r24
            long r28 = r28 % r24
            int r14 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            r24 = r13
            if (r14 <= 0) goto L_0x0127
            r14 = 1
            goto L_0x0128
        L_0x0127:
            r14 = 0
        L_0x0128:
            long r12 = (long) r14
            long r6 = r6 + r12
            java.lang.String r12 = ""
            long r13 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347302p
            int r28 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r28 <= 0) goto L_0x0185
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            r13[r11] = r14
            java.lang.String r14 = com.tencent.p014mm.plugin.sport.model.C115778q.m162837f(r16)
            r16 = 1
            r13[r16] = r14
            long r16 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347302p
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            r13[r10] = r14
            java.lang.String r14 = "reboot %d %s lastSaveStepTime %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r14, r13)
            long r13 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347300n
            long r13 = r2 - r13
            int r16 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            r28 = r12
            r10 = r23
            if (r16 <= 0) goto L_0x016b
            long r11 = (long) r10
            long r29 = r11 * r6
            int r31 = (r13 > r29 ? 1 : (r13 == r29 ? 0 : -1))
            if (r31 < 0) goto L_0x0168
            long r11 = r11 * r26
            int r29 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r29 >= 0) goto L_0x016b
        L_0x0168:
            java.lang.String r12 = "rebootIncrease Valid Step diffStep > 0"
            goto L_0x016f
        L_0x016b:
            r13 = r18
            r12 = r28
        L_0x016f:
            if (r16 >= 0) goto L_0x0182
            long r10 = (long) r10
            long r6 = r6 * r10
            int r16 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r16 < 0) goto L_0x017e
            long r10 = r10 * r26
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0182
        L_0x017e:
            java.lang.String r6 = "rebootIncrease Valid Step diffStep < 0"
            r13 = r2
            r12 = r6
        L_0x0182:
            r16 = 1
            goto L_0x01d6
        L_0x0185:
            r28 = r12
            r10 = r23
            long r11 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347298i
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x01b6
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            r13 = 0
            r11[r13] = r12
            long r12 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347298i
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 1
            r11[r13] = r12
            long r12 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347300n
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 2
            r11[r13] = r12
            java.lang.String r12 = "invalid currentSensorStep %d preSensorStep %d lastSaveSensorStep %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r11)
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347298i = r2
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347300n = r2
            r16 = 1
            goto L_0x01b8
        L_0x01b6:
            r16 = 0
        L_0x01b8:
            long r11 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347298i
            long r13 = r2 - r11
            long r10 = (long) r10
            long r6 = r6 * r10
            int r12 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r12 < 0) goto L_0x01d4
            long r10 = r10 * r26
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x01ca
            goto L_0x01d4
        L_0x01ca:
            java.lang.String r6 = "increase step too large, not like a person"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r6)
            r13 = r18
            r12 = r28
            goto L_0x01d6
        L_0x01d4:
            java.lang.String r12 = "normalIncrease Valid Step"
        L_0x01d6:
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r8
            r7 = 1
            r6[r7] = r12
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            r8 = 2
            r6[r8] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r16)
            r6[r9] = r7
            long r7 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347305s
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 4
            r6[r8] = r7
            long r7 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347299j
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 5
            r6[r8] = r7
            r7 = 6
            long r8 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347300n
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6[r7] = r8
            java.lang.String r7 = "%s increase step %s %d %b %d todayStep:%d %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r7, r6)
            long r6 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347299j
            long r6 = r6 + r13
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347299j = r6
            long r6 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347305s
            long r6 = r6 + r13
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347305s = r6
            long r6 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347302p
            long r6 = r20 - r6
            r8 = 60000(0xea60, float:8.4078E-41)
            java.lang.String r9 = "stepCounterSaveInterval"
            r10 = r24
            int r8 = r10.optInt(r9, r8)
            long r8 = (long) r8
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x0243
            long r6 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347300n
            long r6 = r2 - r6
            java.lang.String r8 = "stepCounterSaveStep"
            int r8 = r10.optInt(r8)
            long r8 = (long) r8
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0243
            if (r16 == 0) goto L_0x023c
            goto L_0x0243
        L_0x023c:
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347298i = r2
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347303q = r20
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347304r = r4
            goto L_0x027b
        L_0x0243:
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347302p = r20
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347300n = r2
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347298i = r2
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347303q = r20
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347304r = r4
            r1.mo176110c()
            long r1 = com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347305s
            r3 = 500(0x1f4, double:2.47E-321)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x027b
            java.lang.String r1 = "notifyUploadStep"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = r2.getPackageName()
            r1.setPackage(r2)
            java.lang.String r2 = "com.tencent.mm.plugin.sport.uploadstep"
            r1.setAction(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2.sendBroadcast(r1)
            com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.f347305s = r18
        L_0x027b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sport.model.C115768i.run():void");
    }
}
