package eg1;

import com.tencent.p014mm.storage.C72963f4;

/* renamed from: eg1.z */
public final class C31598z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f84441d;

    public C31598z(C72963f4 f4Var) {
        this.f84441d = f4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            java.lang.Class<hr.t> r0 = p165hr.C60106t.class
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            boolean r2 = eg1.C31577b0.f84387b
            r3 = 1
            java.lang.String r4 = "FinderLiveNotifyReplaceManager"
            if (r2 != 0) goto L_0x0024
            eg1.b0 r2 = eg1.C31577b0.f84386a
            java.lang.String r2 = "[replaceNotify] start collect timer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            eg1.C31577b0.f84387b = r3
            rx3.g r2 = eg1.C31577b0.f84390e
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = (com.tencent.p014mm.sdk.platformtools.MTimerHandler) r2
            r5 = 1000(0x3e8, double:4.94E-321)
            r2.startTimer(r5)
            goto L_0x002b
        L_0x0024:
            eg1.b0 r2 = eg1.C31577b0.f84386a
            java.lang.String r2 = "[replaceNotify] collect timer already start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
        L_0x002b:
            di3.d r2 = di3.C86312j.m106911c(r0)
            hr.t r2 = (p165hr.C60106t) r2
            ik1.j r2 = r2.Bx0()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f90385e
            r5 = 0
            java.lang.String r6 = "select *, rowid from FinderLiveNotifyExposureInfo where exposureStatus = 0 and liveStatus = 0 ORDER BY rowid"
            android.database.Cursor r2 = r2.rawQuery(r6, r5)
            r6 = -1
            r8 = 0
            r9 = r5
            if (r2 == 0) goto L_0x0090
        L_0x0044:
            boolean r10 = r2.moveToNext()
            if (r10 == 0) goto L_0x008d
            ig1.g r9 = new ig1.g
            r9.<init>()
            r9.convertFrom(r2)
            ok1.e r10 = ok1.C62042e.f176370a
            r11 = 2
            r10.getClass()
            long r12 = r9.systemRowid
            int r10 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r10 == 0) goto L_0x0065
            r10 = r9
            goto L_0x0066
        L_0x0065:
            r10 = r5
        L_0x0066:
            if (r10 == 0) goto L_0x006f
            int r10 = r10.field_controlFlag
            boolean r10 = o40.C61926c.m72696u(r10, r11)
            goto L_0x0070
        L_0x006f:
            r10 = 0
        L_0x0070:
            if (r10 != 0) goto L_0x0073
            goto L_0x008d
        L_0x0073:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "this info can not be replace : "
            r10.append(r11)
            java.lang.String r11 = r9.field_liveId
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.FinderLiveNotifyExposureInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            goto L_0x0044
        L_0x008d:
            r2.close()
        L_0x0090:
            if (r9 == 0) goto L_0x009b
            long r10 = r9.systemRowid
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x009b
            long r9 = r9.field_msgId
            goto L_0x009c
        L_0x009b:
            r9 = r6
        L_0x009c:
            eg1.b0 r2 = eg1.C31577b0.f84386a
            r11 = r19
            com.tencent.mm.storage.f4 r12 = r11.f84441d
            java.lang.String r12 = eg1.C31577b0.m39463a(r2, r12)
            java.lang.String r13 = "[replaceNotify] newTipsId = "
            int r14 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r14 == 0) goto L_0x0158
            k40.a r6 = f40.C86709a0.m107533q(r1)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r6 = r6.b00(r9)
            long r14 = r6.getMsgId()
            r16 = 0
            java.lang.String r7 = "notifymessage"
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x00d4
            java.lang.String r14 = r6.mo108768t()
            boolean r14 = gy3.C87412m.m108589b(r14, r7)
            if (r14 == 0) goto L_0x00d4
            r14 = 1
            goto L_0x00d5
        L_0x00d4:
            r14 = 0
        L_0x00d5:
            if (r14 == 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r6 = r5
        L_0x00d9:
            if (r6 == 0) goto L_0x016f
            java.lang.String r2 = eg1.C31577b0.m39463a(r2, r6)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r12)
            java.lang.String r13 = ",replaceTipsId = "
            r14.append(r13)
            r14.append(r2)
            java.lang.String r13 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
            boolean r13 = gy3.C87412m.m108589b(r12, r2)
            if (r13 == 0) goto L_0x0105
            java.lang.String r0 = "[replaceNotify] newTipsId = oldTipsId ,return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return
        L_0x0105:
            k40.a r4 = f40.C86709a0.m107533q(r1)
            f62.k0 r4 = (f62.C75700k0) r4
            g62.l r4 = r4.mo96095LE()
            long r13 = r6.getMsgId()
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            int r4 = r4.mo101125kD(r13)
            di3.d r0 = di3.C86312j.m106911c(r0)
            hr.t r0 = (p165hr.C60106t) r0
            ik1.j r0 = r0.Bx0()
            r0.od0(r9)
            if (r4 <= 0) goto L_0x0170
            k40.a r0 = f40.C86709a0.m107533q(r1)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            com.tencent.mm.storage.h2 r0 = r0.mo69771j(r7)
            if (r0 == 0) goto L_0x0170
            int r4 = r0.mo108786G2()
            if (r4 <= 0) goto L_0x0170
            int r4 = r0.mo108786G2()
            int r4 = r4 - r3
            r0.mo108812g3(r4)
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.v3 r1 = r1.mo96094Ku()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69773k0(r0, r7)
            goto L_0x0170
        L_0x0158:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r0.append(r12)
            java.lang.String r1 = " ,no replaceable msg"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x016f:
            r2 = r5
        L_0x0170:
            int r0 = r12.length()
            if (r0 <= 0) goto L_0x0178
            r0 = 1
            goto L_0x0179
        L_0x0178:
            r0 = 0
        L_0x0179:
            if (r0 == 0) goto L_0x017c
            goto L_0x017d
        L_0x017c:
            r12 = r5
        L_0x017d:
            if (r12 == 0) goto L_0x0184
            java.util.List<java.lang.String> r0 = eg1.C31577b0.f84388c
            r0.add(r12)
        L_0x0184:
            if (r2 == 0) goto L_0x0198
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            r3 = 0
        L_0x018e:
            if (r3 == 0) goto L_0x0191
            r5 = r2
        L_0x0191:
            if (r5 == 0) goto L_0x0198
            java.util.List<java.lang.String> r0 = eg1.C31577b0.f84389d
            r0.add(r5)
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eg1.C31598z.run():void");
    }
}
