package com.tencent.p014mm.plugin.game;

import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.game.l$$e */
public class l$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C48478n.C48479a f112842d;

    public l$$e(C41877l lVar, C48478n.C48479a aVar) {
        this.f112842d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            py1.j1 r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45375i()
            if (r0 == 0) goto L_0x00a9
            py1.a3 r0 = r0.f127801e
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r0.f127560d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0014
            goto L_0x00a9
        L_0x0014:
            java.lang.Class<sw1.q> r0 = sw1.C48484q.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            sw1.q r0 = (sw1.C48484q) r0
            com.tencent.mm.plugin.game.model.b0 r0 = r0.xi0()
            r0.getClass()
            java.lang.String r1 = "MicroMsg.GameMessageStorage"
            sw1.n$b r2 = new sw1.n$b
            r2.<init>()
            r3 = 1
            r4 = 0
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r7 = "select count(*) from GameRawMessage where rawXML like \"%<chatmsg%\" and isRead=0"
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0093 }
            android.database.Cursor r7 = r0.rawQuery(r7, r8)     // Catch:{ Exception -> 0x0093 }
            if (r7 == 0) goto L_0x0064
            boolean r8 = r7.moveToFirst()     // Catch:{ Exception -> 0x0093 }
            if (r8 == 0) goto L_0x004a
            int r8 = r7.getInt(r4)     // Catch:{ Exception -> 0x0093 }
            if (r8 <= 0) goto L_0x004a
            r2.f129683a = r3     // Catch:{ Exception -> 0x0093 }
            r2.f129684b = r8     // Catch:{ Exception -> 0x0093 }
        L_0x004a:
            r7.close()     // Catch:{ Exception -> 0x0093 }
            boolean r7 = r2.f129683a     // Catch:{ Exception -> 0x0093 }
            if (r7 == 0) goto L_0x0064
            java.lang.String r0 = "unread logic costtime:%d"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0093 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0093 }
            long r8 = r8 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0093 }
            r7[r4] = r5     // Catch:{ Exception -> 0x0093 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r7)     // Catch:{ Exception -> 0x0093 }
            goto L_0x00a1
        L_0x0064:
            java.lang.String r7 = "select count(*) from GameRawMessage where rawXML like \"%<chatmsg%\""
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0093 }
            android.database.Cursor r0 = r0.rawQuery(r7, r8)     // Catch:{ Exception -> 0x0093 }
            if (r0 != 0) goto L_0x006f
            goto L_0x00a1
        L_0x006f:
            boolean r7 = r0.moveToFirst()     // Catch:{ Exception -> 0x0093 }
            if (r7 == 0) goto L_0x007d
            int r7 = r0.getInt(r4)     // Catch:{ Exception -> 0x0093 }
            if (r7 <= 0) goto L_0x007d
            r2.f129683a = r3     // Catch:{ Exception -> 0x0093 }
        L_0x007d:
            r0.close()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r0 = "loop logic costtime:%d"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0093 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0093 }
            long r8 = r8 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0093 }
            r7[r4] = r5     // Catch:{ Exception -> 0x0093 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r7)     // Catch:{ Exception -> 0x0093 }
            goto L_0x00a1
        L_0x0093:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3[r4] = r0
            java.lang.String r0 = "errMsg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r3)
        L_0x00a1:
            sw1.n$a r0 = r10.f112842d
            if (r0 == 0) goto L_0x00a8
            r0.mo71895a(r2)
        L_0x00a8:
            return
        L_0x00a9:
            sw1.n$a r0 = r10.f112842d
            if (r0 == 0) goto L_0x00b1
            r1 = 0
            r0.mo71895a(r1)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.l$$e.run():void");
    }
}
