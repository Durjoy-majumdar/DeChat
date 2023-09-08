package i61;

/* renamed from: i61.a */
public class C98600a implements Runnable {
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        r2.close();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            dl.o r0 = p490dl.C97489o.m125592g()
            r1 = 1
            java.util.ArrayList r0 = r0.mo136761b(r1)
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r2 = r2.mo57717d()
            r2.getClass()
            java.lang.String r3 = "SELECT * FROM EmojiInfo WHERE catalog =?  OR catalog=? OR groupId IS NOT NULL"
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]
            r6 = 81
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            r6 = 65
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5[r1] = r6
            r6 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f301704d     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            android.database.Cursor r2 = r2.rawQuery(r3, r5, r4)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            if (r2 == 0) goto L_0x005b
            boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x0059 }
            if (r3 == 0) goto L_0x005b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0059 }
            r3.<init>()     // Catch:{ Exception -> 0x0059 }
        L_0x003e:
            com.tencent.mm.storage.emotion.EmojiInfo r5 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch:{ Exception -> 0x0059 }
            r5.<init>()     // Catch:{ Exception -> 0x0059 }
            r5.convertFrom(r2)     // Catch:{ Exception -> 0x0059 }
            int r8 = r5.field_reserved4     // Catch:{ Exception -> 0x0059 }
            r8 = r8 & r1
            if (r8 == r1) goto L_0x004e
            r3.add(r5)     // Catch:{ Exception -> 0x0059 }
        L_0x004e:
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x0059 }
            if (r5 != 0) goto L_0x003e
            r2.close()
            r6 = r3
            goto L_0x0078
        L_0x0059:
            r3 = move-exception
            goto L_0x0064
        L_0x005b:
            if (r2 == 0) goto L_0x0078
            goto L_0x0075
        L_0x005e:
            r0 = move-exception
            goto L_0x0140
        L_0x0061:
            r2 = move-exception
            r3 = r2
            r2 = r6
        L_0x0064:
            java.lang.String r5 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r8 = "getAllStoreAndCustomEmoji :%s"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x013e }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)     // Catch:{ all -> 0x013e }
            r9[r7] = r3     // Catch:{ all -> 0x013e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r8, r9)     // Catch:{ all -> 0x013e }
            if (r2 == 0) goto L_0x0078
        L_0x0075:
            r2.close()
        L_0x0078:
            r0.addAll(r6)
            java.util.Iterator r2 = r0.iterator()
        L_0x007f:
            boolean r3 = r2.hasNext()
            java.lang.String r5 = "MicroMsg.emoji.EmojiCommandMgr"
            if (r3 == 0) goto L_0x00ca
            java.lang.Object r3 = r2.next()
            com.tencent.mm.storage.emotion.EmojiInfo r3 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r3
            long r8 = java.lang.System.currentTimeMillis()
            tk.a r6 = p384tk.C101897a.m134075e()
            byte[] r3 = r6.mo126270A2(r3)
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r8
            boolean r6 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isWXGF((byte[]) r3)     // Catch:{ Exception -> 0x00af }
            if (r6 == 0) goto L_0x00aa
            qz1.h r6 = new qz1.h     // Catch:{ Exception -> 0x00af }
            r6.<init>(r3)     // Catch:{ Exception -> 0x00af }
            goto L_0x00af
        L_0x00aa:
            qz1.d r6 = new qz1.d     // Catch:{ Exception -> 0x00af }
            r6.<init>((byte[]) r3, (boolean) r7)     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r8
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r3[r7] = r6
            long r12 = r12 - r10
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r3[r1] = r6
            java.lang.String r6 = "run: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            goto L_0x007f
        L_0x00ca:
            java.util.Iterator r0 = r0.iterator()
        L_0x00ce:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x013d
            java.lang.Object r2 = r0.next()
            com.tencent.mm.storage.emotion.EmojiInfo r2 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r2
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = r2.mo62640K1()
            com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            com.tencent.mm.emoji.decode.MMGIFJNIFactory$Companion r6 = com.tencent.p014mm.emoji.decode.MMGIFJNIFactory.Companion
            tk.d r6 = r6.getDecoder((com.tencent.p014mm.storage.emotion.EmojiInfo) r2)
            r6.mo35631b()
            r6.getFrame()
            r6.destroy()
            java.lang.Object[] r6 = new java.lang.Object[r1]
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r6[r7] = r3
            java.lang.String r3 = "run: time is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r6)
            java.lang.String r3 = "/sdcard/temp/emoji/"
            com.tencent.p014mm.vfs.C86013q1.m106461v(r3)
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r2 = r2.field_md5
            r4.append(r2)
            java.lang.String r2 = ".jpg"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r2)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r8
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r7] = r3
            java.lang.String r3 = "run: file time is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            goto L_0x00ce
        L_0x013d:
            return
        L_0x013e:
            r0 = move-exception
            r6 = r2
        L_0x0140:
            if (r6 == 0) goto L_0x0145
            r6.close()
        L_0x0145:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i61.C98600a.run():void");
    }
}
