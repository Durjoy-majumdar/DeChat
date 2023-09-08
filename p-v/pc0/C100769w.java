package pc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: pc0.w */
public class C100769w {
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m131942a(int r20, byte[] r21, byte[] r22, long r23) {
        /*
            java.lang.String r1 = "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]"
            java.lang.String r2 = "MicroMsg.NewSyncMgr"
            qe3.q0 r0 = new qe3.q0
            r0.<init>()
            com.tencent.mm.pointers.PByteArray r6 = new com.tencent.mm.pointers.PByteArray
            r6.<init>()
            com.tencent.mm.pointers.PByteArray r13 = new com.tencent.mm.pointers.PByteArray
            r13.<init>()
            com.tencent.mm.pointers.PInt r14 = new com.tencent.mm.pointers.PInt
            r14.<init>()
            com.tencent.mm.pointers.PInt r15 = new com.tencent.mm.pointers.PInt
            r15.<init>()
            com.tencent.mm.pointers.PInt r12 = new com.tencent.mm.pointers.PInt
            r11 = 0
            r12.<init>(r11)
            com.tencent.mm.pointers.PInt r10 = new com.tencent.mm.pointers.PInt
            r3 = 255(0xff, float:3.57E-43)
            r10.<init>(r3)
            com.tencent.mm.pointers.PInt r9 = new com.tencent.mm.pointers.PInt
            r9.<init>(r11)
            com.tencent.mm.pointers.PInt r8 = new com.tencent.mm.pointers.PInt
            r8.<init>(r11)
            r7 = 2
            r5 = 1
            r3 = r13
            r4 = r21
            r16 = r13
            r13 = 1
            r5 = r22
            r7 = r14
            r17 = r8
            r8 = r15
            r18 = r9
            r9 = r12
            r22 = r10
            r11 = r18
            r19 = r12
            r12 = r17
            boolean r3 = com.tencent.p014mm.protocal.MMProtocalJni.unpack(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0186 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0186 }
            r4.<init>()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r5 = "summerdiz dealWithPushResp unpack ret:"
            r4.append(r5)     // Catch:{ Exception -> 0x0186 }
            r4.append(r3)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r5 = ", noticeid:"
            r4.append(r5)     // Catch:{ Exception -> 0x0186 }
            r4.append(r3)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0186 }
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0186 }
            r6 = r19
            int r7 = r6.value     // Catch:{ Exception -> 0x0184 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0184 }
            r8 = 0
            r5[r8] = r7     // Catch:{ Exception -> 0x0181 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r5)     // Catch:{ Exception -> 0x0181 }
            int r4 = r6.value     // Catch:{ Exception -> 0x0181 }
            if (r4 == 0) goto L_0x00a6
            com.tencent.mm.autogen.events.GetDisasterInfoEvent r4 = new com.tencent.mm.autogen.events.GetDisasterInfoEvent     // Catch:{ Exception -> 0x0181 }
            r4.<init>()     // Catch:{ Exception -> 0x0181 }
            com.tencent.mm.autogen.events.GetDisasterInfoEvent$a r5 = r4.f78820d     // Catch:{ Exception -> 0x0181 }
            int r7 = r6.value     // Catch:{ Exception -> 0x0181 }
            r5.f78821a = r7     // Catch:{ Exception -> 0x0181 }
            boolean r4 = r4.publish()     // Catch:{ Exception -> 0x0181 }
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x017f }
            int r9 = r6.value     // Catch:{ Exception -> 0x017f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x017f }
            r7[r8] = r9     // Catch:{ Exception -> 0x017f }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x017f }
            r7[r13] = r4     // Catch:{ Exception -> 0x017f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r7)     // Catch:{ Exception -> 0x017f }
            r6.value = r8     // Catch:{ Exception -> 0x017f }
            goto L_0x00a7
        L_0x00a6:
            r5 = 2
        L_0x00a7:
            int r4 = r15.value     // Catch:{ Exception -> 0x017f }
            r7 = 13
            if (r4 != r7) goto L_0x00fc
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x017f }
            f40.g r4 = f40.C86709a0.m107529k()     // Catch:{ Exception -> 0x017f }
            r7 = 3
            byte[] r4 = r4.mo121128c(r7)     // Catch:{ Exception -> 0x017f }
            r7 = r16
            byte[] r9 = r7.value     // Catch:{ Exception -> 0x017f }
            byte[] r9 = com.tencent.p014mm.jni.utils.UtilsJni.AesGcmDecryptWithUncompress(r4, r9)     // Catch:{ Exception -> 0x017f }
            r7.value = r9     // Catch:{ Exception -> 0x017f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017f }
            r9.<init>()     // Catch:{ Exception -> 0x017f }
            java.lang.String r10 = "summerdiz dealWithPushResp unpack AES_GCM_ENCRYPT serverSession"
            r9.append(r10)     // Catch:{ Exception -> 0x017f }
            r10 = -1
            if (r4 != 0) goto L_0x00d3
            r4 = -1
            goto L_0x00d4
        L_0x00d3:
            int r4 = r4.length     // Catch:{ Exception -> 0x017f }
        L_0x00d4:
            r9.append(r4)     // Catch:{ Exception -> 0x017f }
            java.lang.String r4 = " new pr["
            r9.append(r4)     // Catch:{ Exception -> 0x017f }
            byte[] r4 = r7.value     // Catch:{ Exception -> 0x017f }
            r9.append(r4)     // Catch:{ Exception -> 0x017f }
            java.lang.String r4 = ": "
            r9.append(r4)     // Catch:{ Exception -> 0x017f }
            byte[] r4 = r7.value     // Catch:{ Exception -> 0x017f }
            if (r4 != 0) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            int r10 = r4.length     // Catch:{ Exception -> 0x017f }
        L_0x00ec:
            r9.append(r10)     // Catch:{ Exception -> 0x017f }
            java.lang.String r4 = "]"
            r9.append(r4)     // Catch:{ Exception -> 0x017f }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x017f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ Exception -> 0x017f }
            goto L_0x00fe
        L_0x00fc:
            r7 = r16
        L_0x00fe:
            if (r3 != 0) goto L_0x0107
            java.lang.String r0 = "unpack push resp failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x017f }
            return
        L_0x0107:
            r3 = r22
            int r3 = r3.value     // Catch:{ Exception -> 0x017f }
            r0.setHeadExtFlags(r3)     // Catch:{ Exception -> 0x017f }
            int r3 = r14.value     // Catch:{ Exception -> 0x017f }
            r4 = -13
            if (r3 != r4) goto L_0x011e
            r0.setRetCode(r3)     // Catch:{ Exception -> 0x017f }
            java.lang.String r0 = "unpack push resp failed session timeout"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x017f }
            return
        L_0x011e:
            byte[] r3 = r7.value     // Catch:{ Exception -> 0x017f }
            int r3 = r0.fromProtoBuf(r3)     // Catch:{ Exception -> 0x017f }
            java.lang.String r4 = "bufToResp using protobuf ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r4)     // Catch:{ Exception -> 0x017f }
            r0.setRetCode(r3)     // Catch:{ Exception -> 0x017f }
            r3 = r21
            int r3 = r3.length     // Catch:{ Exception -> 0x017f }
            long r3 = (long) r3     // Catch:{ Exception -> 0x017f }
            r0.setBufferSize(r3)     // Catch:{ Exception -> 0x017f }
            pc0.d0$a r3 = pc0.C118000d0.f352701a     // Catch:{ Exception -> 0x017f }
            byte[] r3 = r3.mo182756a()     // Catch:{ Exception -> 0x017f }
            te3.x33 r4 = r0.f296025a     // Catch:{ Exception -> 0x017f }
            te3.qv3 r4 = r4.f299848g     // Catch:{ Exception -> 0x017f }
            byte[] r4 = sf0.C48374j0.m53715d(r4)     // Catch:{ Exception -> 0x017f }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x017f }
            f40.e r7 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x017f }
            te3.x33 r9 = r0.f296025a     // Catch:{ Exception -> 0x017f }
            int r10 = r9.f299849h     // Catch:{ Exception -> 0x017f }
            int r9 = r9.f299850i     // Catch:{ Exception -> 0x017f }
            r7.mo121105D(r10, r9)     // Catch:{ Exception -> 0x017f }
            te3.x33 r7 = r0.f296025a     // Catch:{ Exception -> 0x017f }
            int r7 = r7.f299849h     // Catch:{ Exception -> 0x017f }
            f40.C86718e.m107545A(r7)     // Catch:{ Exception -> 0x017f }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r4)     // Catch:{ Exception -> 0x017f }
            if (r7 != 0) goto L_0x0179
            boolean r3 = qe3.C101126c1.m132545b(r3, r4)     // Catch:{ Exception -> 0x017f }
            if (r3 != 0) goto L_0x0165
            goto L_0x0179
        L_0x0165:
            java.lang.Class<lc3.c> r3 = lc3.C117474c.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x017f }
            lc3.c r3 = (lc3.C117474c) r3     // Catch:{ Exception -> 0x017f }
            pc0.e0 r3 = r3.yn0()     // Catch:{ Exception -> 0x017f }
            r4 = r20
            r9 = r23
            r3.mo182765i(r0, r4, r9)     // Catch:{ Exception -> 0x017f }
            goto L_0x019c
        L_0x0179:
            java.lang.String r0 = "compareKeybuf syncKey failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x017f }
            return
        L_0x017f:
            r0 = move-exception
            goto L_0x018b
        L_0x0181:
            r0 = move-exception
            r5 = 2
            goto L_0x018b
        L_0x0184:
            r0 = move-exception
            goto L_0x0189
        L_0x0186:
            r0 = move-exception
            r6 = r19
        L_0x0189:
            r5 = 2
            r8 = 0
        L_0x018b:
            java.lang.Object[] r3 = new java.lang.Object[r13]
            r3[r8] = r0
            java.lang.String r4 = "unpack push resp failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
        L_0x019c:
            int r0 = r6.value
            if (r0 == 0) goto L_0x01c4
            com.tencent.mm.autogen.events.GetDisasterInfoEvent r0 = new com.tencent.mm.autogen.events.GetDisasterInfoEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GetDisasterInfoEvent$a r3 = r0.f78820d
            int r4 = r6.value
            r3.f78821a = r4
            boolean r0 = r0.publish()
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r4 = r6.value
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r8] = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3[r13] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r3)
            r6.value = r8
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc0.C100769w.m131942a(int, byte[], byte[], long):void");
    }

    /* renamed from: b */
    public static boolean m131943b() {
        boolean z;
        if (C118000d0.f352701a.mo182756a().length > 0) {
            C86709a0.m107528h();
            if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(15, (Object) null)) != 0) {
                z = false;
                Log.m105925i("MicroMsg.NewSyncMgr", "summerinit needInit ret[%b]", Boolean.valueOf(z));
                return z;
            }
        }
        z = true;
        Log.m105925i("MicroMsg.NewSyncMgr", "summerinit needInit ret[%b]", Boolean.valueOf(z));
        return z;
    }
}
