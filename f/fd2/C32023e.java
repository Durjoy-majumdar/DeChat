package fd2;

import g62.C75875l;

/* renamed from: fd2.e */
public class C32023e implements C75875l.C32329c {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        if (r6.equals("delete") == false) goto L_0x0084;
     */
    /* renamed from: w5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55728w5(g62.C75875l r12, g62.C75875l.C45886e r13) {
        /*
            r11 = this;
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.isBackupMerge()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Class<ed2.b> r0 = ed2.C31563b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ed2.b r0 = (ed2.C31563b) r0
            u90.b r0 = r0.ab0()
            java.lang.String r1 = "MicroMsg.NotifyMsgChangeListener"
            if (r0 != 0) goto L_0x001d
            java.lang.String r12 = "get message notify storage return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            return
        L_0x001d:
            java.lang.String r2 = "notifymessage"
            java.lang.String r3 = "delete"
            if (r12 == 0) goto L_0x00b4
            java.util.ArrayList<com.tencent.mm.storage.f4> r12 = r13.f123846c
            if (r12 == 0) goto L_0x00b4
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x00b4
            java.util.ArrayList<com.tencent.mm.storage.f4> r12 = r13.f123846c
            java.util.Iterator r12 = r12.iterator()
        L_0x0034:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x00e8
            java.lang.Object r4 = r12.next()
            com.tencent.mm.storage.f4 r4 = (com.tencent.p014mm.storage.C72963f4) r4
            if (r4 != 0) goto L_0x0043
            goto L_0x0034
        L_0x0043:
            java.lang.String r5 = r13.f123844a
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x004c
            goto L_0x0034
        L_0x004c:
            r5 = r0
            com.tencent.mm.storage.l4 r5 = (com.tencent.p014mm.storage.C30757l4) r5
            java.lang.String r6 = r5.mo57661Yt(r4)
            com.tencent.mm.pointers.PString r7 = new com.tencent.mm.pointers.PString
            r7.<init>()
            com.tencent.mm.pointers.PString r8 = new com.tencent.mm.pointers.PString
            r8.<init>()
            com.tencent.mm.pointers.PInt r9 = new com.tencent.mm.pointers.PInt
            r9.<init>()
            r10 = 0
            java.lang.String r7 = p875ci.C67379u.m79740d(r4, r7, r8, r9, r10)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 == 0) goto L_0x0074
            java.lang.String r6 = "username is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            goto L_0x0077
        L_0x0074:
            r4.mo108749c3(r6)
        L_0x0077:
            java.lang.String r6 = r13.f123845b
            r6.getClass()
            r8 = -1
            int r9 = r6.hashCode()
            switch(r9) {
                case -1335458389: goto L_0x009d;
                case -1183792455: goto L_0x0092;
                case -838846263: goto L_0x0086;
                default: goto L_0x0084;
            }
        L_0x0084:
            r10 = -1
            goto L_0x00a4
        L_0x0086:
            java.lang.String r9 = "update"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0090
            goto L_0x0084
        L_0x0090:
            r10 = 2
            goto L_0x00a4
        L_0x0092:
            java.lang.String r9 = "insert"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x009b
            goto L_0x0084
        L_0x009b:
            r10 = 1
            goto L_0x00a4
        L_0x009d:
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x00a4
            goto L_0x0084
        L_0x00a4:
            switch(r10) {
                case 0: goto L_0x00b0;
                case 1: goto L_0x00ac;
                case 2: goto L_0x00a8;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            goto L_0x0034
        L_0x00a8:
            r5.mo57664kD(r4, r7)
            goto L_0x0034
        L_0x00ac:
            r5.mo57660Ow(r4, r7)
            goto L_0x0034
        L_0x00b0:
            r5.mo57663jo(r4)
            goto L_0x0034
        L_0x00b4:
            java.lang.String r12 = r13.f123845b
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00e8
            java.lang.String r12 = r13.f123844a
            boolean r12 = r2.equals(r12)
            if (r12 == 0) goto L_0x00e8
            java.lang.Class<f62.k0> r12 = f62.C75700k0.class
            k40.a r12 = f40.C86709a0.m107533q(r12)
            f62.k0 r12 = (f62.C75700k0) r12
            g62.l r12 = r12.mo96095LE()
            java.lang.String r13 = r13.f123844a
            com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12
            int r12 = r12.Vx0(r13)
            if (r12 != 0) goto L_0x00e8
            java.lang.String r12 = "clear service notify record"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            com.tencent.mm.storage.l4 r0 = (com.tencent.p014mm.storage.C30757l4) r0
            java.lang.String r12 = "NotifyMessageRecord"
            java.lang.String r13 = "DELETE FROM NotifyMessageRecord"
            r0.execSQL(r12, r13)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fd2.C32023e.mo55728w5(g62.l, g62.l$e):void");
    }
}
