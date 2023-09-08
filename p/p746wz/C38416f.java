package p746wz;

import di3.C86301e;
import ei3.C86522b;
import p275xz.C79012e;

@C86522b
/* renamed from: wz.f */
public class C38416f extends C86301e implements C79012e {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String rk0(java.lang.String r16) {
        /*
            r15 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.getClass()
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            r5.<init>()     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            zh3.f r6 = r0.f212775p     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            java.lang.String r7 = "message"
            r8 = 0
            java.lang.String r9 = "talker=? AND createTime>=? AND type IN (436207665,419430449)"
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r16)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            r10[r3] = r0     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 - r13
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            r10[r4] = r0     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            r11 = 0
            r12 = 0
            java.lang.String r13 = "createTime ASC"
            r14 = 2
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
        L_0x0040:
            boolean r0 = r6.moveToNext()     // Catch:{ Exception -> 0x0056 }
            if (r0 == 0) goto L_0x0052
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4     // Catch:{ Exception -> 0x0056 }
            r0.<init>()     // Catch:{ Exception -> 0x0056 }
            r0.convertFrom(r6)     // Catch:{ Exception -> 0x0056 }
            r5.add(r0)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0040
        L_0x0052:
            r6.close()
            goto L_0x0072
        L_0x0056:
            r0 = move-exception
            goto L_0x005d
        L_0x0058:
            r0 = move-exception
            goto L_0x013f
        L_0x005b:
            r0 = move-exception
            r6 = r2
        L_0x005d:
            java.lang.String r5 = "MicroMsg.MsgInfoStorage"
            java.lang.String r7 = "getLastDayC2CMsgByTalker error: %s"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x013d }
            java.lang.String r9 = r0.getMessage()     // Catch:{ all -> 0x013d }
            r8[r3] = r9     // Catch:{ all -> 0x013d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r7, r8)     // Catch:{ all -> 0x013d }
            if (r6 == 0) goto L_0x0071
            r6.close()
        L_0x0071:
            r5 = r2
        L_0x0072:
            if (r5 == 0) goto L_0x013c
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r6 = r5.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r3] = r6
            java.lang.String r6 = "MicroMsg.WalletConvDelCheckLogic"
            java.lang.String r7 = "checkUnProcessWalletMsgCount, msgInfoList size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r0)
            java.util.Iterator r0 = r5.iterator()
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x008e:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x00d3
            java.lang.Object r8 = r0.next()
            com.tencent.mm.storage.f4 r8 = (com.tencent.p014mm.storage.C72963f4) r8
            boolean r9 = ie3.C60275g.m70538a(r8)
            if (r9 == 0) goto L_0x008e
            int r9 = r8.getType()
            r10 = 419430449(0x19000031, float:6.6174836E-24)
            if (r9 != r10) goto L_0x00ac
            int r7 = r7 + 1
            goto L_0x008e
        L_0x00ac:
            int r9 = r8.getType()
            r10 = 436207665(0x1a000031, float:2.6469934E-23)
            if (r9 != r10) goto L_0x008e
            java.lang.String r8 = r8.getContent()
            if (r8 == 0) goto L_0x00c0
            com.tencent.mm.message.l$b r8 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r8, r2)
            goto L_0x00c1
        L_0x00c0:
            r8 = r2
        L_0x00c1:
            if (r8 == 0) goto L_0x008e
            java.lang.String r8 = r8.f195604n1
            java.lang.String r9 = "1001"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00d0
            int r6 = r6 + 1
            goto L_0x008e
        L_0x00d0:
            int r5 = r5 + 1
            goto L_0x008e
        L_0x00d3:
            if (r5 > 0) goto L_0x00d9
            if (r6 > 0) goto L_0x00d9
            if (r7 <= 0) goto L_0x013c
        L_0x00d9:
            if (r6 <= 0) goto L_0x00ef
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131839063(0x7f114857, float:1.9311367E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2[r3] = r4
            java.lang.String r2 = r0.getString(r1, r2)
            goto L_0x013c
        L_0x00ef:
            if (r5 <= 0) goto L_0x0107
            if (r7 > 0) goto L_0x0107
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131839065(0x7f114859, float:1.931137E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2[r3] = r4
            java.lang.String r2 = r0.getString(r1, r2)
            goto L_0x013c
        L_0x0107:
            if (r7 <= 0) goto L_0x011f
            if (r5 > 0) goto L_0x011f
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131839066(0x7f11485a, float:1.9311373E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r2[r3] = r4
            java.lang.String r2 = r0.getString(r1, r2)
            goto L_0x013c
        L_0x011f:
            if (r7 <= 0) goto L_0x013c
            if (r5 <= 0) goto L_0x013c
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131839064(0x7f114858, float:1.9311369E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r3] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1[r4] = r3
            java.lang.String r2 = r0.getString(r2, r1)
        L_0x013c:
            return r2
        L_0x013d:
            r0 = move-exception
            r2 = r6
        L_0x013f:
            if (r2 == 0) goto L_0x0144
            r2.close()
        L_0x0144:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p746wz.C38416f.rk0(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: wQ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> mo61653wQ() {
        /*
            r15 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r0)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.getClass()
            r2 = 0
            r3 = 1
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r5.<init>()     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            zh3.f r6 = r1.f212775p     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r7 = "message"
            r8 = 0
            java.lang.String r9 = "createTime>=? AND type IN (436207665,419430449)"
            java.lang.String[] r10 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 - r13
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r10[r4] = r1     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r11 = 0
            r12 = 0
            java.lang.String r13 = "createTime ASC"
            r14 = 2
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
        L_0x0039:
            boolean r6 = r1.moveToNext()     // Catch:{ Exception -> 0x004f }
            if (r6 == 0) goto L_0x004b
            com.tencent.mm.storage.f4 r6 = new com.tencent.mm.storage.f4     // Catch:{ Exception -> 0x004f }
            r6.<init>()     // Catch:{ Exception -> 0x004f }
            r6.convertFrom(r1)     // Catch:{ Exception -> 0x004f }
            r5.add(r6)     // Catch:{ Exception -> 0x004f }
            goto L_0x0039
        L_0x004b:
            r1.close()
            goto L_0x006c
        L_0x004f:
            r5 = move-exception
            goto L_0x0057
        L_0x0051:
            r0 = move-exception
            goto L_0x00cf
        L_0x0054:
            r1 = move-exception
            r5 = r1
            r1 = r2
        L_0x0057:
            java.lang.String r6 = "MicroMsg.MsgInfoStorage"
            java.lang.String r7 = "getLastDayC2CMsgByTalker error: %s"
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ all -> 0x00cd }
            java.lang.String r9 = r5.getMessage()     // Catch:{ all -> 0x00cd }
            r8[r4] = r9     // Catch:{ all -> 0x00cd }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r5, r7, r8)     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x006b
            r1.close()
        L_0x006b:
            r5 = r2
        L_0x006c:
            if (r5 == 0) goto L_0x00cc
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r2 = r5.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r4] = r2
            java.lang.String r2 = "MicroMsg.WalletConvDelCheckLogic"
            java.lang.String r3 = "checkGetUnProcessorWalletConversation, msgInfoList size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x008a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c4
            java.lang.Object r3 = r2.next()
            com.tencent.mm.storage.f4 r3 = (com.tencent.p014mm.storage.C72963f4) r3
            java.lang.String r4 = r3.mo108768t()
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L_0x008a
            k40.a r4 = f40.C86709a0.m107533q(r0)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.v3 r4 = r4.mo96094Ku()
            java.lang.String r5 = r3.mo108768t()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            com.tencent.mm.storage.h2 r4 = r4.mo69771j(r5)
            if (r4 == 0) goto L_0x008a
            boolean r4 = ie3.C60275g.m70538a(r3)
            if (r4 == 0) goto L_0x008a
            java.lang.String r3 = r3.mo108768t()
            r1.add(r3)
            goto L_0x008a
        L_0x00c4:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r1)
        L_0x00cc:
            return r2
        L_0x00cd:
            r0 = move-exception
            r2 = r1
        L_0x00cf:
            if (r2 == 0) goto L_0x00d4
            r2.close()
        L_0x00d4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p746wz.C38416f.mo61653wQ():java.util.ArrayList");
    }
}
