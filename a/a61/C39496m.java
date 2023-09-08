package a61;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: a61.m */
public class C39496m extends IStaticListener<PostSyncTaskEvent> {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r3 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        if (r3 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b5, code lost:
        if (r1.size() <= 0) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.EmojiPostTaskListener", "try to sync emoji uploadEmojiList:%d", java.lang.Integer.valueOf(r1.size()));
        r11 = new java.util.ArrayList();
        r2 = r1.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
        if (r7 >= r2) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        r11.add(new l61.C46835c((java.lang.String) r1.get(r7)));
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.EmojiPostTaskListener", "try to sync emoji upload Emoji:%s", r1.get(r7));
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f4, code lost:
        r1 = ((p441aq.C92054g) di3.C86312j.m106911c(r0)).wx0().f268269a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        if (r1.f110550f != null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0104, code lost:
        r1.f110550f = new java.util.Vector<>();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010f, code lost:
        if (r11.size() <= 0) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0111, code lost:
        r2 = r11.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0116, code lost:
        if (r3 >= r2) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0118, code lost:
        r7 = (com.tencent.p014mm.plugin.emoji.sync.C41062e) r11.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011e, code lost:
        if (r7 == null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0126, code lost:
        if (r1.f110550f.contains(r7) != false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0128, code lost:
        r1.f110550f.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist:%s", r7.getKey());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0140, code lost:
        ((p441aq.C92054g) di3.C86312j.m106911c(r0)).wx0().f268269a.mo64097f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0150, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.emoji.EmojiPostTaskListener", "no things need to upload.");
        f40.C86709a0.m107535s().mo121142i().mo119676J(348165, java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0162, code lost:
        f40.C86709a0.m107535s().mo121142i().mo119676J(348166, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087 A[Catch:{ Exception -> 0x009a, all -> 0x0097 }, LOOP:0: B:19:0x0087->B:20:0x0092, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m42135d(boolean r11) {
        /*
            java.lang.Class<aq.g> r0 = p441aq.C92054g.class
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r2 = 348165(0x55005, float:4.87883E-40)
            r3 = 0
            java.lang.Object r1 = r1.mo119684e(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r4 = 0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Boolean) r1, (boolean) r4)
            r5 = 1
            r6 = 348166(0x55006, float:4.87884E-40)
            if (r1 == 0) goto L_0x0047
            r7 = 0
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Object r1 = r1.mo119684e(r6, r3)
            if (r1 == 0) goto L_0x0039
            boolean r9 = r1 instanceof java.lang.Long
            if (r9 == 0) goto L_0x0039
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
        L_0x0039:
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r7
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x004c
            if (r11 == 0) goto L_0x0175
        L_0x004c:
            di3.d r11 = di3.C86312j.m106911c(r0)
            aq.g r11 = (p441aq.C92054g) r11
            r11.getClass()
            com.tencent.mm.storage.w2 r11 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r11 = r11.mo57717d()
            r11.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r7 = "select md5 from EmojiInfo where needupload=? and catalog=?"
            r8 = 2
            java.lang.String[] r9 = new java.lang.String[r8]
            java.lang.String r10 = java.lang.String.valueOf(r5)
            r9[r4] = r10
            r10 = 81
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r9[r5] = r10
            com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r11.f301704d     // Catch:{ Exception -> 0x009a }
            android.database.Cursor r3 = r11.rawQuery(r7, r9, r8)     // Catch:{ Exception -> 0x009a }
            if (r3 == 0) goto L_0x0094
            boolean r11 = r3.moveToFirst()     // Catch:{ Exception -> 0x009a }
            if (r11 == 0) goto L_0x0094
        L_0x0087:
            java.lang.String r11 = r3.getString(r4)     // Catch:{ Exception -> 0x009a }
            r1.add(r11)     // Catch:{ Exception -> 0x009a }
            boolean r11 = r3.moveToNext()     // Catch:{ Exception -> 0x009a }
            if (r11 != 0) goto L_0x0087
        L_0x0094:
            if (r3 == 0) goto L_0x00af
            goto L_0x00ac
        L_0x0097:
            r11 = move-exception
            goto L_0x0176
        L_0x009a:
            r11 = move-exception
            java.lang.String r7 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r8 = "get need upload emoji MD5 list failed :%s"
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x0097 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r11)     // Catch:{ all -> 0x0097 }
            r9[r4] = r11     // Catch:{ all -> 0x0097 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r9)     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x00af
        L_0x00ac:
            r3.close()
        L_0x00af:
            int r11 = r1.size()
            java.lang.String r3 = "MicroMsg.emoji.EmojiPostTaskListener"
            if (r11 <= 0) goto L_0x0150
            java.lang.Object[] r11 = new java.lang.Object[r5]
            int r2 = r1.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11[r4] = r2
            java.lang.String r2 = "try to sync emoji uploadEmojiList:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r2 = r1.size()
            r7 = 0
        L_0x00d3:
            if (r7 >= r2) goto L_0x00f4
            l61.c r8 = new l61.c
            java.lang.Object r9 = r1.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            r8.<init>(r9)
            r11.add(r8)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r9 = r1.get(r7)
            r8[r4] = r9
            java.lang.String r9 = "try to sync emoji upload Emoji:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r8)
            int r7 = r7 + 1
            goto L_0x00d3
        L_0x00f4:
            di3.d r1 = di3.C86312j.m106911c(r0)
            aq.g r1 = (p441aq.C92054g) r1
            com.tencent.mm.plugin.emoji.sync.b r1 = r1.wx0()
            com.tencent.mm.plugin.emoji.sync.BKGLoaderManager r1 = r1.f268269a
            java.util.Vector<com.tencent.mm.plugin.emoji.sync.e> r2 = r1.f110550f
            if (r2 != 0) goto L_0x010b
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            r1.f110550f = r2
        L_0x010b:
            int r2 = r11.size()
            if (r2 <= 0) goto L_0x0140
            int r2 = r11.size()
            r3 = 0
        L_0x0116:
            if (r3 >= r2) goto L_0x0140
            java.lang.Object r7 = r11.get(r3)
            com.tencent.mm.plugin.emoji.sync.e r7 = (com.tencent.p014mm.plugin.emoji.sync.C41062e) r7
            if (r7 == 0) goto L_0x012e
            java.util.Vector<com.tencent.mm.plugin.emoji.sync.e> r8 = r1.f110550f
            boolean r8 = r8.contains(r7)
            if (r8 != 0) goto L_0x012e
            java.util.Vector<com.tencent.mm.plugin.emoji.sync.e> r8 = r1.f110550f
            r8.add(r7)
            goto L_0x013d
        L_0x012e:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r7 = r7.getKey()
            r8[r4] = r7
            java.lang.String r7 = "MicroMsg.BKGLoader.BKGLoaderManager"
            java.lang.String r9 = "[cpan] task is has exist:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r8)
        L_0x013d:
            int r3 = r3 + 1
            goto L_0x0116
        L_0x0140:
            di3.d r11 = di3.C86312j.m106911c(r0)
            aq.g r11 = (p441aq.C92054g) r11
            com.tencent.mm.plugin.emoji.sync.b r11 = r11.wx0()
            com.tencent.mm.plugin.emoji.sync.BKGLoaderManager r11 = r11.f268269a
            r11.mo64097f()
            goto L_0x0162
        L_0x0150:
            java.lang.String r11 = "no things need to upload."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.mo119676J(r2, r0)
        L_0x0162:
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.mo119676J(r6, r0)
        L_0x0175:
            return
        L_0x0176:
            if (r3 == 0) goto L_0x017b
            r3.close()
        L_0x017b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a61.C39496m.m42135d(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        if (r1 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r1 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e9, code lost:
        if (r3 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
        if (r3 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fd, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0100, code lost:
        f40.C86709a0.m107529k().f251779b.mo123460f(new j61.C9283v(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m42136q(boolean r14) {
        /*
            java.lang.Class<aq.g> r0 = p441aq.C92054g.class
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_LONG
            r3 = 0
            java.lang.Object r1 = r1.mo119685f(r2, r3)
            if (r1 == 0) goto L_0x001e
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L_0x001e
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x0020
        L_0x001e:
            r1 = 0
        L_0x0020:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            r6 = 0
            r7 = 1
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0030
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            if (r1 != 0) goto L_0x0035
            if (r14 == 0) goto L_0x010e
        L_0x0035:
            di3.d r1 = di3.C86312j.m106911c(r0)
            aq.g r1 = (p441aq.C92054g) r1
            r1.getClass()
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r1 = r1.mo57715b()
            r1.getClass()
            java.lang.String r2 = "1"
            java.lang.String r4 = "2"
            java.lang.String r5 = "0"
            java.lang.String r8 = "7"
            java.lang.String[] r9 = new java.lang.String[]{r2, r4, r5, r8}
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.String r11 = "select sync from EmojiGroupInfo where (type= ? or type= ? ) and sync=? and status=?"
            r10[r6] = r11
            java.lang.String r12 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.String r13 = "checkStoreEmojiSync:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r10)
            r10 = 2
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f301702d     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            android.database.Cursor r1 = r1.rawQuery(r11, r9, r10)     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            if (r1 == 0) goto L_0x0077
            boolean r9 = r1.moveToFirst()     // Catch:{ Exception -> 0x007e }
            if (r9 == 0) goto L_0x0077
            r1.close()
            r1 = 1
            goto L_0x0089
        L_0x0077:
            if (r1 == 0) goto L_0x0088
            goto L_0x0085
        L_0x007a:
            r14 = move-exception
            goto L_0x0117
        L_0x007d:
            r1 = r3
        L_0x007e:
            java.lang.String r9 = "checkStoreEmojiSync fail."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r9)     // Catch:{ all -> 0x0115 }
            if (r1 == 0) goto L_0x0088
        L_0x0085:
            r1.close()
        L_0x0088:
            r1 = 0
        L_0x0089:
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            r9[r6] = r11
            java.lang.String r11 = "MicroMsg.emoji.EmojiPostTaskListener"
            java.lang.String r13 = "uploadStoreEmoji need upload:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r9)
            if (r1 != 0) goto L_0x00ae
            if (r14 == 0) goto L_0x009e
            goto L_0x00ae
        L_0x009e:
            f40.o r14 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r14 = r14.mo121142i()
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_FINISH_BOOLEAN
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r14.mo119677K(r0, r1)
            goto L_0x010e
        L_0x00ae:
            di3.d r14 = di3.C86312j.m106911c(r0)
            aq.g r14 = (p441aq.C92054g) r14
            r14.getClass()
            com.tencent.mm.storage.w2 r14 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r14 = r14.mo57715b()
            r14.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "select productID from EmojiGroupInfo where sync=? and (type=?  and status=?) or (type=? and flag=?)"
            java.lang.String[] r2 = new java.lang.String[]{r5, r4, r8, r2, r5}
            com.tencent.mm.sdk.storage.ISQLiteDatabase r14 = r14.f301702d     // Catch:{ Exception -> 0x00ee }
            android.database.Cursor r3 = r14.rawQuery(r1, r2, r10)     // Catch:{ Exception -> 0x00ee }
            if (r3 == 0) goto L_0x00e9
            boolean r14 = r3.moveToFirst()     // Catch:{ Exception -> 0x00ee }
            if (r14 == 0) goto L_0x00e9
        L_0x00dc:
            java.lang.String r14 = r3.getString(r6)     // Catch:{ Exception -> 0x00ee }
            r0.add(r14)     // Catch:{ Exception -> 0x00ee }
            boolean r14 = r3.moveToNext()     // Catch:{ Exception -> 0x00ee }
            if (r14 != 0) goto L_0x00dc
        L_0x00e9:
            if (r3 == 0) goto L_0x0100
            goto L_0x00fd
        L_0x00ec:
            r14 = move-exception
            goto L_0x010f
        L_0x00ee:
            java.lang.String r14 = "getNeedToUploadStoreEmojiProductList. exception.%s"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x00ec }
            com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()     // Catch:{ all -> 0x00ec }
            r1[r6] = r2     // Catch:{ all -> 0x00ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r14, r1)     // Catch:{ all -> 0x00ec }
            if (r3 == 0) goto L_0x0100
        L_0x00fd:
            r3.close()
        L_0x0100:
            j61.v r14 = new j61.v
            r14.<init>(r0, r7)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r0.mo123460f(r14)
        L_0x010e:
            return
        L_0x010f:
            if (r3 == 0) goto L_0x0114
            r3.close()
        L_0x0114:
            throw r14
        L_0x0115:
            r14 = move-exception
            r3 = r1
        L_0x0117:
            if (r3 == 0) goto L_0x011c
            r3.close()
        L_0x011c:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a61.C39496m.m42136q(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r18) {
        /*
            r17 = this;
            java.lang.Class<aq.g> r0 = p441aq.C92054g.class
            r1 = r18
            com.tencent.mm.autogen.events.PostSyncTaskEvent r1 = (com.tencent.p014mm.autogen.events.PostSyncTaskEvent) r1
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r2 = 348162(0x55002, float:4.87879E-40)
            r3 = 0
            java.lang.Object r1 = r1.mo119684e(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r4 = 0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Boolean) r1, (boolean) r4)
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN
            java.lang.Object r5 = r5.mo119685f(r6, r3)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Boolean) r5, (boolean) r4)
            r6 = 348163(0x55003, float:4.8788E-40)
            r7 = 0
            r9 = 1
            if (r5 != 0) goto L_0x0063
            if (r1 == 0) goto L_0x0063
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Object r1 = r1.mo119684e(r6, r3)
            if (r1 == 0) goto L_0x0054
            boolean r5 = r1 instanceof java.lang.Long
            if (r5 == 0) goto L_0x0054
            java.lang.Long r1 = (java.lang.Long) r1
            long r10 = r1.longValue()
            goto L_0x0055
        L_0x0054:
            r10 = r7
        L_0x0055:
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r10
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0063
            r1 = 1
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            r5 = 2
            java.lang.String r10 = "MicroMsg.emoji.EmojiPostTaskListener"
            if (r1 == 0) goto L_0x0120
            java.lang.String r1 = "[cpan] start do backup emoji."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            di3.d r1 = di3.C86312j.m106911c(r0)
            aq.g r1 = (p441aq.C92054g) r1
            r1.getClass()
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r1 = r1.mo57717d()
            java.util.List r1 = r1.mo142067vP(r4)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r11 = r1.size()
            if (r11 > 0) goto L_0x009f
            java.lang.String r1 = "[cpan] no local emoji need not to backup "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r1.mo119676J(r2, r6)
            goto L_0x0120
        L_0x009f:
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r2.mo119676J(r6, r11)
            java.lang.String r2 = "[cpan] start backup local emoji "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            int r2 = r1.size()
            r6 = 50
            if (r2 <= r6) goto L_0x0112
            int r2 = r1.size()
            int r6 = r2 / 50
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11[r4] = r12
            java.lang.String r12 = "count:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r11)
            r11 = 0
        L_0x00d3:
            if (r11 > r6) goto L_0x0120
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r13 = r11 * 50
            int r11 = r11 + 1
            int r14 = r11 * 50
            int r15 = r14 + -1
            if (r15 < r2) goto L_0x00e5
            r14 = r2
        L_0x00e5:
            java.lang.Object[] r15 = new java.lang.Object[r5]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            r15[r4] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)
            r15[r9] = r16
            java.lang.String r3 = "start index:%d to index:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r15)
            if (r14 <= r13) goto L_0x0110
            java.util.List r3 = r1.subList(r13, r14)
            r12.addAll(r3)
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            j61.f r13 = new j61.f
            r13.<init>(r12)
            r3.mo123460f(r13)
        L_0x0110:
            r3 = 0
            goto L_0x00d3
        L_0x0112:
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            j61.f r3 = new j61.f
            r3.<init>(r1)
            r2.mo123460f(r3)
        L_0x0120:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object r1 = r1.mo119685f(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_NEXT_CUSTOM_BATCH_DOWNLOAD_TIME_LONG
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
            java.lang.Object r2 = r2.mo119685f(r6, r11)
            java.lang.Long r2 = (java.lang.Long) r2
            long r11 = r2.longValue()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r2[r4] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r2[r9] = r6
            java.lang.String r6 = "isNeedDownloadCustomEmoji: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r2)
            long r13 = java.lang.System.currentTimeMillis()
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x016d
            if (r1 == 0) goto L_0x016d
            r1 = 1
            goto L_0x016e
        L_0x016d:
            r1 = 0
        L_0x016e:
            if (r1 == 0) goto L_0x017a
            ll.l r1 = new ll.l
            r2 = 0
            r1.<init>(r4, r2)
            r1.mo138911a()
            goto L_0x017d
        L_0x017a:
            u61.C101964h.m134223e()
        L_0x017d:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN
            java.lang.Object r1 = r1.mo119685f(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_NEXT_CAPTURE_BATCH_DOWNLOAD_TIME_LONG
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            java.lang.Object r2 = r2.mo119685f(r3, r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            r6[r4] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            r6[r9] = r11
            java.lang.String r11 = "downloadCaptureEmoji: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r6)
            if (r1 == 0) goto L_0x01cf
            long r10 = java.lang.System.currentTimeMillis()
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x01cf
            ll.l r1 = new ll.l
            r2 = 0
            r1.<init>(r9, r2)
            r1.mo138911a()
        L_0x01cf:
            m42135d(r4)
            m42136q(r4)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_FINISH_BOOLEAN
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.mo119685f(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r1 != 0) goto L_0x01f1
            goto L_0x0219
        L_0x01f1:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_STORE_EMOJI_DOWNLOAD_LONG
            r10 = 0
            java.lang.Object r1 = r1.mo119685f(r6, r10)
            if (r1 == 0) goto L_0x020d
            boolean r6 = r1 instanceof java.lang.Long
            if (r6 == 0) goto L_0x020d
            java.lang.Long r1 = (java.lang.Long) r1
            long r10 = r1.longValue()
            goto L_0x020e
        L_0x020d:
            r10 = r7
        L_0x020e:
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r10
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0219
            r1 = 1
            goto L_0x021a
        L_0x0219:
            r1 = 0
        L_0x021a:
            if (r1 == 0) goto L_0x0221
            ll.j r1 = p595ll.C46878j.f126071a
            r1.mo72084a()
        L_0x0221:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_REPORT_CUSTOM_EMOJI_COUNT_LONG
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object r1 = r1.mo119685f(r6, r7)
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r7
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x02a5
            di3.d r1 = di3.C86312j.m106911c(r0)
            aq.g r1 = (p441aq.C92054g) r1
            r1.getClass()
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r1 = r1.mo57717d()
            int r1 = r1.mo142063qq(r4, r9)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r3[r9] = r1
            r1 = 11597(0x2d4d, float:1.6251E-41)
            r2.mo160131h(r1, r3)
            di3.d r0 = di3.C86312j.m106911c(r0)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            int r0 = r0.mo142038Lo(r9)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3[r9] = r0
            r2.mo160131h(r1, r3)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.mo119677K(r6, r1)
        L_0x02a5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a61.C39496m.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
