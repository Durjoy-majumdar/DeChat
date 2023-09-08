package jz1;

import sw1.C48478n;

/* renamed from: jz1.p */
public final class C46614p implements C48478n.C48479a {

    /* renamed from: a */
    public final /* synthetic */ C46615q f125547a;

    public C46614p(C46615q qVar) {
        this.f125547a = qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        cy3.C58003b.m67160a(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71895a(sw1.C48478n.C48480b r11) {
        /*
            r10 = this;
            java.lang.String r0 = "GameLife.ConversationPresenter"
            if (r11 != 0) goto L_0x000b
            java.lang.String r11 = "checkHistoryConversation gameLifeHistoryNode null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            goto L_0x00ba
        L_0x000b:
            boolean r1 = r11.f129683a
            if (r1 == 0) goto L_0x00b5
            jz1.q r1 = r10.f125547a
            cz1.i r1 = r1.f125552e
            r1.getClass()
            cz1.c r2 = new cz1.c
            r2.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f122570d
            r3 = 0
            java.lang.String r4 = "SELECT *, rowid FROM GameLifeConversation WHERE sessionId='@gamelifehistory'"
            android.database.Cursor r1 = r1.rawQuery(r4, r3)
            boolean r4 = r1.moveToFirst()     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x0031
            r2.convertFrom(r1)     // Catch:{ all -> 0x00ae }
            cy3.C58003b.m67160a(r1, r3)
            goto L_0x0036
        L_0x0031:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00ae }
            cy3.C58003b.m67160a(r1, r3)
        L_0x0036:
            jz1.q r1 = r10.f125547a
            int r11 = r11.f129684b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkHistoryConversation sysrowid: "
            r3.append(r4)
            long r4 = r2.systemRowid
            r3.append(r4)
            java.lang.String r4 = " old: "
            r3.append(r4)
            int r4 = r2.field_unReadCount
            r3.append(r4)
            java.lang.String r4 = " new: "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            int r0 = r2.field_unReadCount
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r3) goto L_0x006a
            return
        L_0x006a:
            long r3 = r2.systemRowid
            java.lang.String r5 = "single"
            r6 = 0
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0083
            if (r11 > r0) goto L_0x0083
            r2.field_unReadCount = r11
            cz1.i r11 = r1.f125552e
            r11.update(r3, r2, r6)
            r0 = 4
            r11.doNotify(r5, r0, r2)
            goto L_0x00ba
        L_0x0083:
            long r3 = eb0.C31543z5.m39453c()
            r2.field_updateTime = r3
            r2.field_unReadCount = r11
            java.lang.String r11 = "@gamelifehistory"
            r2.field_sessionId = r11
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0 = 2131830973(0x7f1128bd, float:1.9294958E38)
            java.lang.String r11 = kg3.C76577a.m92166q(r11, r0)
            r2.field_digest = r11
            cz1.i r11 = r1.f125552e
            r11.replace(r2, r6)
            long r0 = r2.systemRowid
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x00a9
            r0 = 2
            goto L_0x00aa
        L_0x00a9:
            r0 = 1
        L_0x00aa:
            r11.doNotify(r5, r0, r2)
            goto L_0x00ba
        L_0x00ae:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            cy3.C58003b.m67160a(r1, r11)
            throw r0
        L_0x00b5:
            java.lang.String r11 = "checkHistoryConversation gameLifeNode.hasGameLife false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz1.C46614p.mo71895a(sw1.n$b):void");
    }
}
