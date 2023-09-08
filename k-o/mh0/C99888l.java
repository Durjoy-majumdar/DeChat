package mh0;

import com.tencent.p014mm.storage.C72963f4;

/* renamed from: mh0.l */
public final class C99888l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f292692d;

    /* renamed from: e */
    public final /* synthetic */ C99879i f292693e;

    public C99888l(C72963f4 f4Var, C99879i iVar, boolean z) {
        this.f292692d = f4Var;
        this.f292693e = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r20 = this;
            r0 = r20
            com.tencent.mm.storage.f4 r1 = r0.f292692d
            r2 = 1
            r3 = 0
            java.lang.String r4 = "MicroMsg.AlbumMsgSendService"
            if (r1 == 0) goto L_0x0058
            mh0.i r5 = r0.f292693e
            java.util.HashMap<java.lang.Long, mh0.i$a> r5 = r5.f292658f
            long r6 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.Object r1 = r5.get(r1)
            mh0.i$a r1 = (mh0.C99879i.C99880a) r1
            if (r1 != 0) goto L_0x0047
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.mm.storage.f4 r5 = r0.f292692d
            long r5 = r5.getMsgId()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1[r3] = r5
            java.lang.String r5 = "do add job, msgid %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r1)
            mh0.i$a r1 = new mh0.i$a
            r1.<init>()
            mh0.i r5 = r0.f292693e
            java.util.HashMap<java.lang.Long, mh0.i$a> r5 = r5.f292658f
            com.tencent.mm.storage.f4 r6 = r0.f292692d
            long r6 = r6.getMsgId()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.put(r6, r1)
        L_0x0047:
            mh0.i r1 = r0.f292693e
            com.tencent.mm.storage.f4 r5 = r0.f292692d
            java.util.LinkedList<com.tencent.mm.storage.f4> r6 = r1.f292659g
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L_0x0058
            java.util.LinkedList<com.tencent.mm.storage.f4> r1 = r1.f292659g
            r1.add(r5)
        L_0x0058:
            mh0.i r1 = r0.f292693e
            boolean r5 = r1.f292656d
            if (r5 == 0) goto L_0x0070
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r1 = r1.f292657e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r3] = r1
            java.lang.String r1 = "send album is working, return lastWorkType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r2)
            goto L_0x0223
        L_0x0070:
            java.util.LinkedList<com.tencent.mm.storage.f4> r5 = r1.f292659g
            boolean r5 = r5.isEmpty()
            r6 = 300000(0x493e0, double:1.482197E-318)
            r8 = 2
            r9 = 1124073521(0x43000031, float:128.00075)
            if (r5 == 0) goto L_0x0192
            java.lang.String r5 = "send album jobs list size is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            i40.b$a r5 = i40.C98597b.f289091e
            java.lang.Class<mh0.d> r10 = mh0.C99864d.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            java.lang.String r11 = "getService(AlbumFeatureService::class.java)"
            gy3.C87412m.m108593f(r10, r11)
            i40.e r10 = (i40.C98598e) r10
            java.lang.Class<mh0.t> r11 = mh0.C99895t.class
            i40.b r5 = r5.mo85231a(r10, r11)
            mh0.t r5 = (mh0.C99895t) r5
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            r5.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            zh3.f r11 = r5.f212775p
            r5 = 3
            java.lang.String[] r15 = new java.lang.String[r5]
            java.lang.String r12 = java.lang.String.valueOf(r2)
            r15[r3] = r12
            java.lang.String r12 = java.lang.String.valueOf(r2)
            r15[r2] = r12
            java.lang.String r12 = java.lang.String.valueOf(r9)
            r15[r8] = r12
            r13 = 0
            r16 = 0
            r17 = 0
            r19 = 2
            java.lang.String r12 = "message"
            java.lang.String r14 = "status=? AND isSend=? AND type=?"
            java.lang.String r18 = "createTime ASC"
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00dc:
            boolean r12 = r11.moveToNext()
            if (r12 == 0) goto L_0x0119
            com.tencent.mm.storage.f4 r12 = new com.tencent.mm.storage.f4
            r12.<init>()
            r12.convertFrom(r11)
            int r13 = r12.f230723F
            r13 = r13 & 32
            if (r13 <= 0) goto L_0x00f2
            r13 = 1
            goto L_0x00f3
        L_0x00f2:
            r13 = 0
        L_0x00f3:
            r13 = r13 ^ r2
            r13 = r13 & r2
            if (r13 == 0) goto L_0x00dc
            java.lang.String r13 = r12.mo108768t()
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85798E5(r13)
            if (r13 != 0) goto L_0x00dc
            java.lang.String r13 = r12.mo108768t()
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85848s5(r13)
            if (r13 != 0) goto L_0x00dc
            java.lang.String r13 = r12.mo108768t()
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85811N4(r13)
            if (r13 != 0) goto L_0x00dc
            r10.add(r12)
            goto L_0x00dc
        L_0x0119:
            r11.close()
            java.util.Iterator r10 = r10.iterator()
        L_0x0120:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0192
            java.lang.Object r11 = r10.next()
            com.tencent.mm.storage.f4 r11 = (com.tencent.p014mm.storage.C72963f4) r11
            java.util.HashMap<java.lang.Long, mh0.i$a> r12 = r1.f292658f
            long r13 = r11.getMsgId()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            java.lang.Object r12 = r12.get(r13)
            mh0.i$a r12 = (mh0.C99879i.C99880a) r12
            if (r12 == 0) goto L_0x0159
            int r13 = r12.f292664b
            if (r13 >= 0) goto L_0x0150
            long r13 = android.os.SystemClock.elapsedRealtime()
            r16 = r10
            long r9 = r12.f292663a
            long r13 = r13 - r9
            int r9 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0152
            goto L_0x018c
        L_0x0150:
            r16 = r10
        L_0x0152:
            int r9 = r12.f292664b
            if (r9 >= 0) goto L_0x016d
            r12.f292664b = r5
            goto L_0x016d
        L_0x0159:
            r16 = r10
            mh0.i$a r9 = new mh0.i$a
            r9.<init>()
            java.util.HashMap<java.lang.Long, mh0.i$a> r10 = r1.f292658f
            long r12 = r11.getMsgId()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r10.put(r12, r9)
        L_0x016d:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            long r12 = r11.getMsgId()
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            r9[r3] = r10
            java.lang.String r10 = "send album do add job from db, msgid %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r10, r9)
            java.util.LinkedList<com.tencent.mm.storage.f4> r9 = r1.f292659g
            boolean r9 = r9.contains(r11)
            if (r9 != 0) goto L_0x018c
            java.util.LinkedList<com.tencent.mm.storage.f4> r9 = r1.f292659g
            r9.add(r11)
        L_0x018c:
            r10 = r16
            r9 = 1124073521(0x43000031, float:128.00075)
            goto L_0x0120
        L_0x0192:
            java.util.LinkedList<com.tencent.mm.storage.f4> r5 = r1.f292659g
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x01ae
            java.lang.String r2 = "try to do job, but job list size is empty, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)
            java.util.LinkedList<com.tencent.mm.storage.f4> r2 = r1.f292659g
            r2.clear()
            java.util.HashMap<java.lang.Long, mh0.i$a> r2 = r1.f292658f
            r2.clear()
            r1.f292656d = r3
            goto L_0x0223
        L_0x01ae:
            java.util.LinkedList<com.tencent.mm.storage.f4> r4 = r1.f292659g
            java.lang.Object r4 = r4.removeFirst()
            com.tencent.mm.storage.f4 r4 = (com.tencent.p014mm.storage.C72963f4) r4
            java.lang.String r5 = "job"
            gy3.C87412m.m108593f(r4, r5)
            java.util.HashMap<java.lang.Long, mh0.i$a> r5 = r1.f292658f
            long r9 = r4.getMsgId()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Object r5 = r5.get(r9)
            mh0.i$a r5 = (mh0.C99879i.C99880a) r5
            if (r5 != 0) goto L_0x01e0
            mh0.i$a r5 = new mh0.i$a
            r5.<init>()
            java.util.HashMap<java.lang.Long, mh0.i$a> r9 = r1.f292658f
            long r10 = r4.getMsgId()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.put(r10, r5)
        L_0x01e0:
            int r9 = r5.f292664b
            int r9 = r9 + -1
            r5.f292664b = r9
            if (r9 >= 0) goto L_0x01f7
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r11 = r5.f292663a
            long r9 = r9 - r11
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x01f5
            r5 = 0
            goto L_0x01fe
        L_0x01f5:
            r5.f292664b = r8
        L_0x01f7:
            long r6 = android.os.SystemClock.elapsedRealtime()
            r5.f292663a = r6
            r5 = 1
        L_0x01fe:
            if (r5 == 0) goto L_0x021f
            r1.f292656d = r2
            int r2 = r4.getType()
            r1.f292657e = r2
            int r2 = r4.getType()
            r5 = 1124073521(0x43000031, float:128.00075)
            if (r2 != r5) goto L_0x021c
            mh0.i$b r2 = new mh0.i$b
            r2.<init>(r1, r4)
            java.lang.String r1 = "AlbumMsgSendService_normalDataCopy"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r2, r1)
            goto L_0x0223
        L_0x021c:
            r1.f292656d = r3
            goto L_0x0223
        L_0x021f:
            r2 = 0
            r1.mo106377PI(r2)
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh0.C99888l.run():void");
    }

    public String toString() {
        return super.toString() + "|run";
    }
}
