package nm2;

import java.util.LinkedList;
import te3.C77949j3;
import te3.C77952jg2;

/* renamed from: nm2.c */
public final class C76929c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C77952jg2 f224817d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C77949j3> f224818e;

    /* renamed from: nm2.c$a */
    public static final class C76930a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76931d f224819d;

        public C76930a(C76931d dVar) {
            this.f224819d = dVar;
        }

        public final void run() {
            this.f224819d.f224826g.startTimer(50);
        }
    }

    public C76929c(C77952jg2 jg22, LinkedList<C77949j3> linkedList) {
        this.f224817d = jg22;
        this.f224818e = linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            nm2.d r1 = new nm2.d
            te3.jg2 r2 = r11.f224817d
            r1.<init>(r2)
            java.util.LinkedList<te3.j3> r2 = r11.f224818e
            te3.jg2 r3 = r11.f224817d
            r4 = 0
            r1.f224821b = r4
            java.util.LinkedList<te3.j3> r4 = r1.f224822c
            r4.addAll(r2)
            long r4 = r3.f227667g
            r6 = 1
            long r4 = r4 - r6
            r1.f224824e = r4
            java.util.Iterator r2 = r2.iterator()
        L_0x0020:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r2.next()
            te3.j3 r4 = (te3.C77949j3) r4
            k40.a r5 = f40.C86709a0.m107533q(r0)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            java.lang.String r6 = r3.f227668h
            long r7 = r4.f227638r
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4 r4 = r5.h30(r6, r7)
            long r5 = r4.getMsgId()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0020
            java.util.HashMap<java.lang.Long, com.tencent.mm.storage.f4> r5 = r1.f224823d
            long r6 = r4.mo108774y2()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.put(r6, r4)
            goto L_0x0020
        L_0x0058:
            k40.a r2 = f40.C86709a0.m107533q(r0)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            java.lang.String r4 = r3.f227668h
            long r5 = r3.f227667g
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            r2.getClass()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r8 = 0
            if (r7 == 0) goto L_0x0075
        L_0x0072:
            r4 = r8
            goto L_0x00f3
        L_0x0075:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "select * from message where"
            r7.append(r9)
            java.lang.String r9 = r2.iy0(r4)
            r7.append(r9)
            java.lang.String r9 = " and "
            r7.append(r9)
            java.lang.String r9 = "createTime"
            r7.append(r9)
            java.lang.String r10 = " < "
            r7.append(r10)
            r7.append(r5)
            java.lang.String r5 = " order by "
            r7.append(r5)
            r7.append(r9)
            java.lang.String r5 = " DESC LIMIT 1 "
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getBeforeMsg: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.MsgInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r6)
            zh3.f r2 = r2.f212775p
            android.database.Cursor r2 = r2.rawQuery(r5, r8)
            if (r2 != 0) goto L_0x00dd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "getBeforeMsgq failed "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
            goto L_0x0072
        L_0x00dd:
            boolean r4 = r2.moveToFirst()
            if (r4 == 0) goto L_0x00ef
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4
            r4.<init>()
            r4.convertFrom(r2)
            r2.close()
            goto L_0x00f3
        L_0x00ef:
            r2.close()
            goto L_0x0072
        L_0x00f3:
            java.lang.String r2 = " existSize:"
            java.lang.String r5 = ", msgMaxCreateTime:"
            java.lang.String r6 = ", msgMinCreateTime:"
            java.lang.String r7 = "MicroMsg.selectRecord.HistoryRecordUnPackMsgLogic"
            if (r4 == 0) goto L_0x014d
            long r8 = r4.getCreateTime()
            r1.f224825f = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getBeforeMsg talker:"
            r8.append(r9)
            java.lang.String r9 = r3.f227668h
            r8.append(r9)
            java.lang.String r9 = ", msgCreateTime:"
            r8.append(r9)
            long r9 = r3.f227667g
            r8.append(r9)
            r8.append(r6)
            long r9 = r1.f224825f
            r8.append(r9)
            r8.append(r5)
            long r9 = r1.f224824e
            r8.append(r9)
            r8.append(r2)
            java.util.HashMap<java.lang.Long, com.tencent.mm.storage.f4> r9 = r1.f224823d
            int r9 = r9.size()
            r8.append(r9)
            java.lang.String r9 = " lastContent:"
            r8.append(r9)
            java.lang.String r4 = r4.getContent()
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x014d:
            if (r8 != 0) goto L_0x01a0
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.f r0 = r0.mo96093DX()
            java.lang.String r4 = r3.f227668h
            com.tencent.mm.storage.n2 r0 = (com.tencent.p014mm.storage.C72986n2) r0
            long r8 = r0.mo101184jo(r4)
            r1.f224825f = r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "no before msg, talker:"
            r0.append(r4)
            java.lang.String r4 = r3.f227668h
            r0.append(r4)
            java.lang.String r4 = ", createTime:"
            r0.append(r4)
            long r3 = r3.f227667g
            r0.append(r3)
            r0.append(r6)
            long r3 = r1.f224825f
            r0.append(r3)
            r0.append(r5)
            long r3 = r1.f224824e
            r0.append(r3)
            r0.append(r2)
            java.util.HashMap<java.lang.Long, com.tencent.mm.storage.f4> r2 = r1.f224823d
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x01a0:
            java.util.LinkedList<te3.j3> r0 = r1.f224822c
            r0.size()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r0 = f40.C86709a0.m107525e()
            nm2.c$a r2 = new nm2.c$a
            r2.<init>(r1)
            r0.postToWorker(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nm2.C76929c.run():void");
    }
}
