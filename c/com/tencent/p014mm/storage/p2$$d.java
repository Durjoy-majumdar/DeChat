package com.tencent.p014mm.storage;

/* renamed from: com.tencent.mm.storage.p2$$d */
public class p2$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C30764p2 f82728d;

    public p2$$d(C30764p2 p2Var) {
        this.f82728d = p2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0207, code lost:
        r5 = 0;
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.emoji.EmojiInfoDescStorage", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (r6 != null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r6 == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        if (com.tencent.p014mm.storage.C30777t2.f82756d.vx0() == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        r11.f82726h = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r0 = ((h81.C32735h) di3.C86312j.m106911c(h81.C32735h.class)).mo58779Qe(h81.C32735h.C32737c.clicfg_custom_emoji_partial_match_numbers, 0);
        r11.f82726h = r0;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.EmojiDescNewMgr", "tryInit matchNumbers=%d", java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        r11.f82720b = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage().toLowerCase();
        r6 = com.tencent.p014mm.storage.C30790w2.m39221h().mo57715b().mo142028kD().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00da, code lost:
        if (r6.hasNext() == false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
        r9 = r6.next();
        r0 = com.tencent.p014mm.storage.C30790w2.m39221h().mo57714a();
        r13 = r9.field_productID;
        r0.getClass();
        r14 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5 = r0.f100771d.rawQuery("select * from EmojiInfoDesc where groupId = '" + r13 + "'", (java.lang.String[]) null, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0110, code lost:
        if (r5 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0116, code lost:
        if (r5.moveToFirst() == false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0118, code lost:
        r0 = new wh3.C38131e();
        r0.convertFrom(r5);
        r14.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0127, code lost:
        if (r5.moveToNext() != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012b, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0130, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r8.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0136, code lost:
        if (r5 == null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0138, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.emoji.EmojiInfoDescStorage", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014c, code lost:
        r6 = com.tencent.p014mm.storage.C30790w2.m39221h().mo57717d().mo142036DN(true);
        r0 = sx3.C110818d0.m150926X(sx3.C110818d0.m150911I(r6, new com.tencent.p014mm.storage.p2$$a()), new com.tencent.p014mm.storage.p2$$b());
        r5 = com.tencent.p014mm.storage.C30790w2.m39221h().mo57714a();
        r5.getClass();
        r0 = (java.util.ArrayList) r0;
        r12 = ",";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017e, code lost:
        if (r0.isEmpty() == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0180, code lost:
        r0 = new java.util.ArrayList();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0188, code lost:
        r9 = new java.util.ArrayList();
        r13 = new java.lang.StringBuilder();
        r13.append('(');
        r0 = r0.iterator();
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a0, code lost:
        if (r0.hasNext() == false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a2, code lost:
        r10 = (java.lang.String) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01aa, code lost:
        if (r14 == false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ac, code lost:
        r13.append(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01af, code lost:
        r13.append("'");
        r13.append(r10);
        r13.append("'");
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01bb, code lost:
        r13.append(')');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r5 = r5.f100771d.rawQuery("select * from EmojiInfoDesc where md5 in " + r13, (java.lang.String[]) null, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d9, code lost:
        if (r5 == null) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01df, code lost:
        if (r5.moveToFirst() == false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e1, code lost:
        r0 = new wh3.C38131e();
        r0.convertFrom(r5);
        r9.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f0, code lost:
        if (r5.moveToNext() != false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f4, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r8.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ff, code lost:
        if (r5 == null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0201, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0204, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0206, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x037e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r2 = "MicroMsg.emoji.EmojiDescNewMgr"
            long r3 = java.lang.System.currentTimeMillis()
            com.tencent.mm.storage.p2 r11 = r1.f82728d
            r11.mo57675b()
            r12 = 0
            java.lang.Class<z51.g> r0 = z51.C39315g.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x007d, all -> 0x0079 }
            z51.g r0 = (z51.C39315g) r0     // Catch:{ Exception -> 0x007d, all -> 0x0079 }
            com.tencent.mm.storage.w2 r0 = r0.mo58034O6()     // Catch:{ Exception -> 0x007d, all -> 0x0079 }
            boolean[] r6 = r0.f82769a     // Catch:{ Exception -> 0x007d, all -> 0x0079 }
            monitor-enter(r6)     // Catch:{ Exception -> 0x007d, all -> 0x0079 }
            wh3.k r0 = r0.f82782n     // Catch:{ all -> 0x0076 }
            monitor-exit(r6)     // Catch:{ all -> 0x0076 }
            android.database.Cursor r6 = r0.getAll()     // Catch:{ Exception -> 0x007d, all -> 0x0079 }
            if (r6 == 0) goto L_0x0073
            boolean r0 = r6.moveToFirst()     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0073
            int r0 = r6.getCount()     // Catch:{ Exception -> 0x0071 }
            r7 = 0
        L_0x0031:
            if (r7 >= r0) goto L_0x0073
            wh3.j r8 = new wh3.j     // Catch:{ Exception -> 0x0071 }
            r8.<init>()     // Catch:{ Exception -> 0x0071 }
            r8.convertFrom(r6)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r9 = r8.field_desc     // Catch:{ Exception -> 0x0071 }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x0071 }
            if (r10 != 0) goto L_0x006b
            java.lang.String r9 = r9.toLowerCase()     // Catch:{ Exception -> 0x0071 }
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r11.f82723e     // Catch:{ Exception -> 0x0071 }
            java.lang.String r13 = r8.field_groupID     // Catch:{ Exception -> 0x0071 }
            r10.put(r9, r13)     // Catch:{ Exception -> 0x0071 }
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r9 = r11.f82722d     // Catch:{ Exception -> 0x0071 }
            java.lang.String r10 = r8.field_groupID     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x0071 }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ Exception -> 0x0071 }
            if (r9 != 0) goto L_0x005f
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x0071 }
            r9.<init>()     // Catch:{ Exception -> 0x0071 }
        L_0x005f:
            java.lang.String r10 = r8.field_desc     // Catch:{ Exception -> 0x0071 }
            r9.add(r10)     // Catch:{ Exception -> 0x0071 }
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r10 = r11.f82722d     // Catch:{ Exception -> 0x0071 }
            java.lang.String r8 = r8.field_groupID     // Catch:{ Exception -> 0x0071 }
            r10.put(r8, r9)     // Catch:{ Exception -> 0x0071 }
        L_0x006b:
            r6.moveToNext()     // Catch:{ Exception -> 0x0071 }
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0071:
            r0 = move-exception
            goto L_0x007f
        L_0x0073:
            if (r6 == 0) goto L_0x008b
            goto L_0x0088
        L_0x0076:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ Exception -> 0x007d, all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            r5 = 0
            goto L_0x037c
        L_0x007d:
            r0 = move-exception
            r6 = 0
        L_0x007f:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x037a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ all -> 0x037a }
            if (r6 == 0) goto L_0x008b
        L_0x0088:
            r6.close()
        L_0x008b:
            com.tencent.mm.storage.t2 r0 = com.tencent.p014mm.storage.C30777t2.f82756d
            boolean r0 = r0.vx0()
            r13 = 4
            r14 = 1
            if (r0 == 0) goto L_0x0098
            r11.f82726h = r13
            goto L_0x00b5
        L_0x0098:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_custom_emoji_partial_match_numbers
            int r0 = r0.mo58779Qe(r6, r12)
            r11.f82726h = r0
            java.lang.Object[] r6 = new java.lang.Object[r14]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r12] = r0
            java.lang.String r0 = "tryInit matchNumbers=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r6)
        L_0x00b5:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            java.lang.String r0 = r0.toLowerCase()
            r11.f82720b = r0
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r0 = r0.mo57715b()
            java.util.ArrayList r0 = r0.mo142028kD()
            java.util.Iterator r6 = r0.iterator()
        L_0x00cf:
            boolean r0 = r6.hasNext()
            java.lang.String r7 = "MicroMsg.emoji.EmojiInfoDescStorage"
            java.lang.String r8 = "'"
            java.lang.String r15 = ""
            r10 = 2
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r6.next()
            r9 = r0
            com.tencent.mm.storage.emotion.EmojiGroupInfo r9 = (com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r9
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.f r0 = r0.mo57714a()
            java.lang.String r13 = r9.field_productID
            r0.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r5 = "select * from EmojiInfoDesc where groupId = '"
            r12.append(r5)
            r12.append(r13)
            r12.append(r8)
            java.lang.String r5 = r12.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f100771d     // Catch:{ Exception -> 0x013c }
            r8 = 0
            android.database.Cursor r5 = r0.rawQuery(r5, r8, r10)     // Catch:{ Exception -> 0x013c }
            if (r5 == 0) goto L_0x0136
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0136
        L_0x0118:
            wh3.e r0 = new wh3.e     // Catch:{ all -> 0x012a }
            r0.<init>()     // Catch:{ all -> 0x012a }
            r0.convertFrom(r5)     // Catch:{ all -> 0x012a }
            r14.add(r0)     // Catch:{ all -> 0x012a }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x0118
            goto L_0x0136
        L_0x012a:
            r0 = move-exception
            r8 = r0
            r5.close()     // Catch:{ all -> 0x0130 }
            goto L_0x0135
        L_0x0130:
            r0 = move-exception
            r5 = r0
            r8.addSuppressed(r5)     // Catch:{ Exception -> 0x013c }
        L_0x0135:
            throw r8     // Catch:{ Exception -> 0x013c }
        L_0x0136:
            if (r5 == 0) goto L_0x0143
            r5.close()     // Catch:{ Exception -> 0x013c }
            goto L_0x0143
        L_0x013c:
            r0 = move-exception
            r5 = 0
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r15, r8)
        L_0x0143:
            int r0 = r9.field_idx
            r11.mo57674a(r14, r0)
            r12 = 0
            r13 = 4
            r14 = 1
            goto L_0x00cf
        L_0x014c:
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            r5 = 1
            java.util.List r6 = r0.mo142036DN(r5)
            com.tencent.mm.storage.p2$$a r0 = new com.tencent.mm.storage.p2$$a
            r0.<init>()
            java.util.List r0 = sx3.C110818d0.m150911I(r6, r0)
            com.tencent.mm.storage.p2$$b r5 = new com.tencent.mm.storage.p2$$b
            r5.<init>()
            java.util.List r0 = sx3.C110818d0.m150926X(r0, r5)
            com.tencent.mm.storage.w2 r5 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.f r5 = r5.mo57714a()
            r5.getClass()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r9 = r0.isEmpty()
            java.lang.String r12 = ","
            if (r9 == 0) goto L_0x0188
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5 = 0
            goto L_0x020e
        L_0x0188:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r14 = 40
            r13.append(r14)
            java.util.Iterator r0 = r0.iterator()
            r14 = 0
        L_0x019c:
            boolean r18 = r0.hasNext()
            if (r18 == 0) goto L_0x01bb
            java.lang.Object r18 = r0.next()
            r10 = r18
            java.lang.String r10 = (java.lang.String) r10
            if (r14 == 0) goto L_0x01af
            r13.append(r12)
        L_0x01af:
            r13.append(r8)
            r13.append(r10)
            r13.append(r8)
            r10 = 2
            r14 = 1
            goto L_0x019c
        L_0x01bb:
            r0 = 41
            r13.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "select * from EmojiInfoDesc where md5 in "
            r0.append(r8)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r5.f100771d     // Catch:{ Exception -> 0x0206 }
            r8 = 0
            r10 = 2
            android.database.Cursor r5 = r5.rawQuery(r0, r8, r10)     // Catch:{ Exception -> 0x0206 }
            if (r5 == 0) goto L_0x01ff
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x01ff
        L_0x01e1:
            wh3.e r0 = new wh3.e     // Catch:{ all -> 0x01f3 }
            r0.<init>()     // Catch:{ all -> 0x01f3 }
            r0.convertFrom(r5)     // Catch:{ all -> 0x01f3 }
            r9.add(r0)     // Catch:{ all -> 0x01f3 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01e1
            goto L_0x01ff
        L_0x01f3:
            r0 = move-exception
            r8 = r0
            r5.close()     // Catch:{ all -> 0x01f9 }
            goto L_0x01fe
        L_0x01f9:
            r0 = move-exception
            r5 = r0
            r8.addSuppressed(r5)     // Catch:{ Exception -> 0x0206 }
        L_0x01fe:
            throw r8     // Catch:{ Exception -> 0x0206 }
        L_0x01ff:
            if (r5 == 0) goto L_0x0204
            r5.close()     // Catch:{ Exception -> 0x0206 }
        L_0x0204:
            r5 = 0
            goto L_0x020d
        L_0x0206:
            r0 = move-exception
            r5 = 0
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r15, r8)
        L_0x020d:
            r0 = r9
        L_0x020e:
            r11.mo57674a(r0, r5)
            com.tencent.mm.storage.t2 r0 = com.tencent.p014mm.storage.C30777t2.f82756d
            boolean r0 = r0.wx0()
            r13 = 3
            if (r0 != 0) goto L_0x0226
            boolean r0 = r11.mo57678e()
            if (r0 == 0) goto L_0x0221
            goto L_0x0226
        L_0x0221:
            r0 = 3
            r7 = 0
            r12 = 2
            goto L_0x032b
        L_0x0226:
            r0 = r6
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r14 = r0.iterator()
            r5 = 0
        L_0x022e:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x0310
            java.lang.Object r6 = r14.next()
            r10 = r6
            com.tencent.mm.storage.emotion.EmojiInfo r10 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r10
            r9 = 4
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r7 = r10.field_md5
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = r10.field_meanings
            r8 = 1
            r6[r8] = r7
            int r7 = r10.field_catalog
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r16 = 2
            r6[r16] = r7
            int r7 = r10.field_state
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r13] = r7
            java.lang.String r7 = "handle emoji: md5=%s, meaning=%s, catalog=%d, state=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r6)
            java.lang.String r6 = r10.field_meanings
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0268
            goto L_0x022e
        L_0x0268:
            java.lang.String r6 = r10.field_meanings
            java.lang.String[] r8 = r6.split(r12)
            int r7 = r8.length
            r17 = r5
            r6 = 0
        L_0x0272:
            if (r6 >= r7) goto L_0x030c
            r5 = r8[r6]
            java.lang.String r5 = r11.mo57682i(r5)
            boolean r18 = android.text.TextUtils.isEmpty(r5)
            if (r18 == 0) goto L_0x028f
            r23 = r6
            r24 = r7
            r20 = r8
            r16 = r10
            r19 = r12
            r12 = 2
            r18 = 4
            goto L_0x02fc
        L_0x028f:
            boolean r18 = r11.mo57678e()
            if (r18 == 0) goto L_0x02a3
            int r9 = r5.length()
            int r13 = r11.f82726h
            if (r9 < r13) goto L_0x02a0
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.storage.p2$$e>> r9 = r11.f82725g
            goto L_0x02ac
        L_0x02a0:
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.storage.p2$$e>> r9 = r11.f82724f
            goto L_0x02ac
        L_0x02a3:
            int r9 = r11.f82726h
            if (r9 <= 0) goto L_0x02aa
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.storage.p2$$e>> r9 = r11.f82725g
            goto L_0x02ac
        L_0x02aa:
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.storage.p2$$e>> r9 = r11.f82724f
        L_0x02ac:
            boolean r13 = r9.containsKey(r5)
            if (r13 == 0) goto L_0x02c1
            java.lang.Object r5 = r9.get(r5)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x02bf
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x02bf:
            r13 = r5
            goto L_0x02c9
        L_0x02c1:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r9.put(r5, r13)
        L_0x02c9:
            com.tencent.mm.storage.p2$$e r9 = new com.tencent.mm.storage.p2$$e
            java.lang.String r5 = r10.field_md5
            r19 = 0
            r20 = r8
            int r8 = r10.field_reserved3
            r21 = r8
            int r8 = r10.field_catalog
            r22 = r5
            r5 = r9
            r23 = r6
            r6 = r11
            r24 = r7
            r7 = r22
            r22 = r8
            r8 = r19
            r25 = r9
            r18 = 4
            r9 = r21
            r16 = r10
            r19 = r12
            r12 = 2
            r10 = r22
            r5.<init>(r6, r7, r8, r9, r10)
            r5 = r25
            r13.add(r5)
            int r17 = r17 + 1
        L_0x02fc:
            int r6 = r23 + 1
            r10 = r16
            r12 = r19
            r8 = r20
            r7 = r24
            r9 = 4
            r13 = 3
            r16 = 2
            goto L_0x0272
        L_0x030c:
            r5 = r17
            goto L_0x022e
        L_0x0310:
            r12 = 2
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 0
            r6[r7] = r5
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 1
            r6[r5] = r0
            java.lang.String r0 = "added %d custom emoji entries, total=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r6)
            r0 = 3
        L_0x032b:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.storage.p2$$e>> r5 = r11.f82724f
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r7] = r5
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r11.f82721c
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r0[r6] = r5
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.storage.p2$$e>> r5 = r11.f82725g
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r12] = r5
            java.lang.String r5 = "tryInit: %s, %s, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r0)
            com.tencent.mm.storage.p2 r0 = r1.f82728d
            r0.f82719a = r6
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r3
            r5.append(r6)
            r5.append(r15)
            java.lang.String r3 = r5.toString()
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "cpan[newinit] all use time:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
            return
        L_0x037a:
            r0 = move-exception
            r5 = r6
        L_0x037c:
            if (r5 == 0) goto L_0x0381
            r5.close()
        L_0x0381:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.p2$$d.run():void");
    }

    public String toString() {
        return super.toString() + "|newinit";
    }
}
