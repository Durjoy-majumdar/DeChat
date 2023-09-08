package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C49875io;
import te3.C50015jo;
import te3.C51996xm2;

/* renamed from: hz0.w */
public class C46160w extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124437d;

    /* renamed from: e */
    public byte[] f124438e;

    /* renamed from: f */
    public C11385n f124439f;

    public C46160w(int i, int i2) {
        Log.m105919d("MicroMsg.NetSceneCardSync", "<init>, selector = %d", Integer.valueOf(i));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49875io();
        bVar.f127067b = new C50015jo();
        bVar.f127068c = "/cgi-bin/micromsg-bin/cardsync";
        bVar.f127069d = 1047;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124437d = a;
        C51996xm2 xm22 = new C51996xm2();
        xm22.f144753f = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, (Object) null);
        xm22.f144751d = (double) C46153l0.Jx0().f124035d;
        xm22.f144752e = (double) C46153l0.Jx0().f124036e;
        C49875io ioVar = (C49875io) a.f127055a.f127080a;
        ioVar.f135525d = i;
        ioVar.f135527f = xm22;
        ioVar.f135528g = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124439f = nVar;
        C49875io ioVar = (C49875io) this.f124437d.f127055a.f127080a;
        byte[] decodeHexString = Util.decodeHexString(Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(282880, (Object) null)));
        this.f124438e = decodeHexString;
        if (decodeHexString == null || decodeHexString.length == 0) {
            Log.m105920e("MicroMsg.NetSceneCardSync", "doScene, keyBuf is null, init card sync~~~");
        }
        ioVar.f135526e = C48374j0.m53712a(this.f124438e);
        Object[] objArr = new Object[1];
        byte[] bArr = this.f124438e;
        objArr[0] = Integer.valueOf(bArr == null ? 0 : bArr.length);
        Log.m105925i("MicroMsg.NetSceneCardSync", "doScene, keyBuf.length = %d", objArr);
        return dispatch(gVar, this.f124437d, this);
    }

    public int getType() {
        return 1047;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f4, code lost:
        r12 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r8, int r9, int r10, java.lang.String r11, com.tencent.p014mm.network.C114799u r12, byte[] r13) {
        /*
            r7 = this;
            java.lang.String r8 = "MicroMsg.NetSceneCardSync"
            java.lang.String r12 = "onGYNetEnd, errType = %d, errCode = %d"
            r13 = 2
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r3 = 1
            r0[r3] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r12, r0)
            if (r9 != 0) goto L_0x01c2
            if (r10 == 0) goto L_0x001e
            goto L_0x01c2
        L_0x001e:
            ob0.c r8 = r7.f124437d
            ob0.c$d r8 = r8.f127056b
            pe3.a r8 = r8.f127083a
            te3.jo r8 = (te3.C50015jo) r8
            int r9 = r8.f136219g
            if (r9 != r3) goto L_0x0031
            java.lang.String r9 = "MicroMsg.NetSceneCardSync"
            java.lang.String r10 = "need do getCardsLayoutScene"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
        L_0x0031:
            te3.qv3 r9 = r8.f136217e
            byte[] r10 = new byte[r2]
            byte[] r9 = sf0.C48374j0.m53716e(r9, r10)
            r7.f124438e = r9
            te3.qx r9 = r8.f136216d
            if (r9 != 0) goto L_0x0041
            r9 = 0
            goto L_0x0043
        L_0x0041:
            java.util.LinkedList<te3.px> r9 = r9.f140594e
        L_0x0043:
            java.lang.String r10 = "MicroMsg.NetSceneCardSync"
            java.lang.String r12 = "onGYNetEnd, cmd list size = %d, synckey length = %d, continueFlag = %d"
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            if (r9 != 0) goto L_0x004e
            r4 = 0
            goto L_0x0052
        L_0x004e:
            int r4 = r9.size()
        L_0x0052:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            byte[] r4 = r7.f124438e
            if (r4 != 0) goto L_0x005e
            r4 = 0
            goto L_0x005f
        L_0x005e:
            int r4 = r4.length
        L_0x005f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            int r4 = r8.f136218f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r13] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r1)
            if (r9 == 0) goto L_0x013d
            int r10 = r9.size()
            if (r10 <= 0) goto L_0x013d
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x007d:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0126
            java.lang.Object r12 = r9.next()
            te3.px r12 = (te3.C50886px) r12
            java.lang.String r1 = "MicroMsg.NetSceneCardSync"
            if (r12 != 0) goto L_0x0096
            java.lang.String r12 = "processCmdItem fail, null cmd"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
        L_0x0093:
            r12 = 0
            goto L_0x0120
        L_0x0096:
            te3.qv3 r4 = r12.f140038e
            byte[] r4 = sf0.C48374j0.m53715d(r4)
            if (r4 == 0) goto L_0x0118
            int r5 = r4.length
            if (r5 != 0) goto L_0x00a2
            goto L_0x0118
        L_0x00a2:
            java.lang.Object[] r5 = new java.lang.Object[r13]
            int r6 = r4.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            int r6 = r12.f140037d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r3] = r6
            java.lang.String r6 = "processCmdItem, buf length = %d, cmdId = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r5)
            int r12 = r12.f140037d     // Catch:{ Exception -> 0x0107 }
            if (r12 == r3) goto L_0x00cc
            java.lang.String r4 = "processCmdItem, unknown cmdId = %d"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0107 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0107 }
            r5[r2] = r12     // Catch:{ Exception -> 0x0107 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r4, r5)     // Catch:{ Exception -> 0x0107 }
            goto L_0x0093
        L_0x00cc:
            te3.mo r12 = new te3.mo     // Catch:{ Exception -> 0x0107 }
            r12.<init>()     // Catch:{ Exception -> 0x0107 }
            pe3.a r12 = r12.parseFrom(r4)     // Catch:{ Exception -> 0x0107 }
            te3.mo r12 = (te3.C50426mo) r12     // Catch:{ Exception -> 0x0107 }
            java.lang.String r4 = "processCmdIem, card user item, Status = %d"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0107 }
            int r6 = r12.f138124h     // Catch:{ Exception -> 0x0107 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0107 }
            r5[r2] = r6     // Catch:{ Exception -> 0x0107 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r5)     // Catch:{ Exception -> 0x0107 }
            int r4 = r12.f138124h     // Catch:{ Exception -> 0x0107 }
            switch(r4) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00ed;
                case 2: goto L_0x00ed;
                case 3: goto L_0x00ed;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00ed;
                case 6: goto L_0x00f4;
                case 7: goto L_0x00ed;
                default: goto L_0x00ec;
            }     // Catch:{ Exception -> 0x0107 }
        L_0x00ec:
            goto L_0x00f6
        L_0x00ed:
            gz0.c r4 = hz0.C46153l0.vx0()     // Catch:{ Exception -> 0x0107 }
            r4.mo58724c(r12)     // Catch:{ Exception -> 0x0107 }
        L_0x00f4:
            r12 = 1
            goto L_0x0120
        L_0x00f6:
            java.lang.String r4 = "processCmdIem, card user item, unknown StateFlag = %d"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0107 }
            int r12 = r12.f138122f     // Catch:{ Exception -> 0x0107 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0107 }
            r5[r2] = r12     // Catch:{ Exception -> 0x0107 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r5)     // Catch:{ Exception -> 0x0107 }
            goto L_0x0093
        L_0x0107:
            r12 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r12 = r12.getMessage()
            r4[r2] = r12
            java.lang.String r12 = "processCmdItem fail, ex = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r12, r4)
            goto L_0x0093
        L_0x0118:
            java.lang.String r12 = "processCmdItem fail, null buf"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            goto L_0x0093
        L_0x0120:
            if (r12 != 0) goto L_0x007d
            int r10 = r10 + 1
            goto L_0x007d
        L_0x0126:
            java.lang.String r9 = "MicroMsg.NetSceneCardSync"
            java.lang.String r12 = "onGYNetEnd, %d fail cmds"
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13[r2] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r13)
            gz0.c r9 = hz0.C46153l0.vx0()
            r9.mo58723b()
            goto L_0x0170
        L_0x013d:
            java.lang.String r9 = "MicroMsg.NetSceneCardSync"
            java.lang.String r10 = "cmdList == null or size is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            gz0.c r9 = hz0.C46153l0.vx0()
            r9.getClass()
            java.lang.String r10 = "MicroMsg.BatchGetCardMgr"
            java.lang.String r12 = "retryAll, getNow = %b"
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r13[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r13)
            byte[] r12 = r9.f86604d
            monitor-enter(r12)
            java.util.List<hz0.j0> r10 = r9.f86605e     // Catch:{ all -> 0x01bf }
            java.util.List<hz0.j0> r13 = r9.f86606f     // Catch:{ all -> 0x01bf }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ all -> 0x01bf }
            r10.addAll(r13)     // Catch:{ all -> 0x01bf }
            java.util.List<hz0.j0> r10 = r9.f86606f     // Catch:{ all -> 0x01bf }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ all -> 0x01bf }
            r10.clear()     // Catch:{ all -> 0x01bf }
            monitor-exit(r12)     // Catch:{ all -> 0x01bf }
            r9.mo58723b()
        L_0x0170:
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            r10 = 282880(0x45100, float:3.964E-40)
            byte[] r12 = r7.f124438e
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r12)
            r9.mo119676J(r10, r12)
            int r8 = r8.f136218f
            if (r8 <= 0) goto L_0x01b9
            java.lang.String r9 = "MicroMsg.NetSceneCardSync"
            java.lang.String r10 = "onGYNetEnd, should continue, continueFlag = %d"
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r10, r12)
            com.tencent.mm.network.g r8 = r7.dispatcher()
            ob0.n r9 = r7.f124439f
            int r8 = r7.doScene(r8, r9)
            if (r8 > 0) goto L_0x01be
            java.lang.String r9 = "MicroMsg.NetSceneCardSync"
            java.lang.String r10 = "onGYNetEnd, doScene again fail, ret = %d"
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r10, r12)
            ob0.n r8 = r7.f124439f
            r9 = -1
            r8.onSceneEnd(r0, r9, r11, r7)
            goto L_0x01be
        L_0x01b9:
            ob0.n r8 = r7.f124439f
            r8.onSceneEnd(r2, r2, r11, r7)
        L_0x01be:
            return
        L_0x01bf:
            r8 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01bf }
            throw r8
        L_0x01c2:
            java.lang.String r8 = "MicroMsg.NetSceneCardSync"
            java.lang.String r12 = "onGYNetEnd, card sync fail, errType = %d, errCode = %d"
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r13[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r13[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r12, r13)
            ob0.n r8 = r7.f124439f
            r8.onSceneEnd(r9, r10, r11, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hz0.C46160w.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
