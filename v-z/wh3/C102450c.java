package wh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import f40.C86709a0;

/* renamed from: wh3.c */
public class C102450c extends MAutoStorage<EmojiGroupInfo> {

    /* renamed from: e */
    public static final String[] f301701e = {MAutoStorage.getCreateSQLs(EmojiGroupInfo.f284122h1, "EmojiGroupInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f301702d;

    public C102450c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, EmojiGroupInfo.f284122h1, "EmojiGroupInfo", (String[]) null);
        this.f301702d = iSQLiteDatabase;
    }

    /* renamed from: TO */
    public static final String m135188TO(int i) {
        return " ( type = '" + i + "' ) ";
    }

    /* renamed from: bD */
    public static final String m135189bD() {
        return " ( " + m135188TO(2) + " and " + " ( status = '7' ) " + " ) ";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (r12 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
        if (r12 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        r12 = new java.util.ArrayList();
        r13 = new java.util.ArrayList();
        r14 = r27.size();
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.EmojiGroupInfoStorage", "updateEmojiGroupByEmotionSummary size:%d", java.lang.Integer.valueOf(r14));
        r15 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021d  */
    /* renamed from: DN */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo142018DN(java.util.ArrayList<te3.C101824o80> r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r5 = 1
            java.lang.String r6 = "event_update_group"
            java.lang.String r7 = "com.tencent.xin.emoticon.tusiji"
            java.lang.String r8 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            if (r2 == 0) goto L_0x031b
            int r0 = r27.size()
            if (r0 <= 0) goto L_0x031b
            int r0 = r27.size()
            if (r0 > 0) goto L_0x002b
            java.lang.String r0 = "updateEmojiGroupByEmotionSummary empty summary."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            r11 = r3
            goto L_0x034a
        L_0x002b:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "select * from EmojiGroupInfo where "
            r0.append(r10)
            java.lang.String r10 = r26.mo142027jo()
            r0.append(r10)
            java.lang.String r10 = " order by sort ASC,lastUseTime DESC"
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r10 = 0
            r11 = 2
            com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r1.f301702d     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            android.database.Cursor r12 = r12.rawQuery(r0, r10, r11)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r12 == 0) goto L_0x0071
            boolean r0 = r12.moveToFirst()     // Catch:{ Exception -> 0x006f }
            if (r0 == 0) goto L_0x0071
        L_0x005b:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r0 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch:{ Exception -> 0x006f }
            r0.<init>()     // Catch:{ Exception -> 0x006f }
            r0.convertFrom(r12)     // Catch:{ Exception -> 0x006f }
            java.lang.String r13 = r0.field_productID     // Catch:{ Exception -> 0x006f }
            r9.put(r13, r0)     // Catch:{ Exception -> 0x006f }
            boolean r0 = r12.moveToNext()     // Catch:{ Exception -> 0x006f }
            if (r0 != 0) goto L_0x005b
            goto L_0x0071
        L_0x006f:
            r0 = move-exception
            goto L_0x0079
        L_0x0071:
            if (r12 == 0) goto L_0x0096
            goto L_0x0093
        L_0x0074:
            r0 = move-exception
            goto L_0x0315
        L_0x0077:
            r0 = move-exception
            r12 = r10
        L_0x0079:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0313 }
            r13.<init>()     // Catch:{ all -> 0x0313 }
            java.lang.String r14 = "get all group fail."
            r13.append(r14)     // Catch:{ all -> 0x0313 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0313 }
            r13.append(r0)     // Catch:{ all -> 0x0313 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0313 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x0313 }
            if (r12 == 0) goto L_0x0096
        L_0x0093:
            r12.close()
        L_0x0096:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r14 = r27.size()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r0[r4] = r15
            java.lang.String r15 = "updateEmojiGroupByEmotionSummary size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r15, r0)
            r15 = 0
        L_0x00b3:
            r0 = 17
            if (r15 >= r14) goto L_0x0283
            java.lang.Object r16 = r2.get(r15)
            r10 = r16
            te3.o80 r10 = (te3.C101824o80) r10
            if (r10 == 0) goto L_0x026c
            java.lang.String r11 = r10.f298994d
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x00cb
            goto L_0x026c
        L_0x00cb:
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r5 = r10.f298994d
            r11[r4] = r5
            java.lang.String r5 = "summary productID:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r11)
            java.lang.String r5 = r10.f298994d
            r12.add(r5)
            java.lang.String r5 = r10.f298994d
            boolean r5 = r9.containsKey(r5)
            if (r5 == 0) goto L_0x00f8
            java.lang.String r0 = r10.f298994d
            java.lang.Object r0 = r9.get(r0)
            com.tencent.mm.storage.emotion.EmojiGroupInfo r0 = (com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r0
            if (r0 != 0) goto L_0x00f3
            com.tencent.mm.storage.emotion.EmojiGroupInfo r0 = new com.tencent.mm.storage.emotion.EmojiGroupInfo
            r0.<init>()
        L_0x00f3:
            java.lang.String r5 = r10.f298994d
            r0.field_productID = r5
            goto L_0x0121
        L_0x00f8:
            java.lang.String r5 = r10.f298994d
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0118
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.Object r5 = r9.get(r5)
            com.tencent.mm.storage.emotion.EmojiGroupInfo r5 = (com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r5
            if (r5 != 0) goto L_0x0111
            com.tencent.mm.storage.emotion.EmojiGroupInfo r5 = new com.tencent.mm.storage.emotion.EmojiGroupInfo
            r5.<init>()
        L_0x0111:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.field_productID = r0
            goto L_0x0122
        L_0x0118:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r0 = new com.tencent.mm.storage.emotion.EmojiGroupInfo
            r0.<init>()
            java.lang.String r5 = r10.f298994d
            r0.field_productID = r5
        L_0x0121:
            r5 = r0
        L_0x0122:
            java.lang.String r0 = r10.f298994d
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0134
            r5.field_flag = r4
            java.lang.String r0 = "emoji_custom_all"
            r5.field_packName = r0
            r11 = 1
            r5.field_type = r11
            goto L_0x013b
        L_0x0134:
            java.lang.String r0 = r10.f298996f
            r5.field_packName = r0
            r11 = 2
            r5.field_type = r11
        L_0x013b:
            java.lang.String r0 = r10.f298995e
            r5.field_packIconUrl = r0
            java.lang.String r0 = r10.f299006s
            r5.field_packGrayIconUrl = r0
            java.lang.String r0 = r10.f299002o
            r5.field_packCoverUrl = r0
            java.lang.String r0 = r10.f298997g
            r5.field_packDesc = r0
            java.lang.String r0 = r10.f298998h
            r5.field_packAuthInfo = r0
            java.lang.String r0 = r10.f298999i
            r5.field_packPrice = r0
            int r0 = r10.f299000j
            r5.field_packType = r0
            int r0 = r10.f299001n
            r5.field_packFlag = r0
            int r0 = r10.f299003p
            r11 = r3
            long r2 = (long) r0
            r5.field_packExpire = r2
            int r0 = r10.f299005r
            long r2 = (long) r0
            r5.field_packTimeStamp = r2
            java.lang.String r0 = r10.f298992C
            r5.field_ipKey = r0
            r2 = 1
            r5.field_sort = r2
            r5.field_idx = r15
            int r0 = r5.field_sync
            r3 = 7
            if (r0 != 0) goto L_0x0184
            int r0 = r5.field_status
            if (r0 != r3) goto L_0x0180
            int r0 = r5.field_packStatus
            if (r0 != r2) goto L_0x0180
            r4 = 2
            r5.field_sync = r4
            goto L_0x0185
        L_0x0180:
            r4 = 2
            r5.field_sync = r2
            goto L_0x0185
        L_0x0184:
            r4 = 2
        L_0x0185:
            int r0 = r5.field_sync
            if (r0 != r4) goto L_0x018b
            r5.field_status = r3
        L_0x018b:
            if (r0 != r4) goto L_0x0246
            java.lang.String r0 = r10.f298994d
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0246
            java.lang.String r0 = r10.f298994d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0231
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r2 = r2.mo57717d()
            r2.getClass()
            java.lang.String r3 = "select * from EmojiInfo where +groupId = ? and temp=? limit 1 "
            r17 = r14
            r4 = 2
            java.lang.String[] r14 = new java.lang.String[r4]
            r16 = 0
            r14[r16] = r0
            java.lang.String r0 = "0"
            r16 = 1
            r14[r16] = r0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r2.f301704d     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            android.database.Cursor r2 = r0.rawQuery(r3, r14, r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x01e0 }
            if (r0 == 0) goto L_0x01d8
            com.tencent.mm.storage.emotion.EmojiInfo r3 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch:{ Exception -> 0x01e0 }
            v51.C102151n.m134592b()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r0 = v51.C102151n.m134591a()     // Catch:{ Exception -> 0x01e0 }
            r3.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x01e0 }
            r3.convertFrom(r2)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x01d9
        L_0x01d6:
            r0 = move-exception
            goto L_0x01e8
        L_0x01d8:
            r3 = 0
        L_0x01d9:
            r2.close()
            goto L_0x020b
        L_0x01dd:
            r0 = move-exception
            r10 = r2
            goto L_0x022b
        L_0x01e0:
            r0 = move-exception
            goto L_0x01e7
        L_0x01e2:
            r0 = move-exception
            r10 = 0
            goto L_0x022b
        L_0x01e5:
            r0 = move-exception
            r2 = 0
        L_0x01e7:
            r3 = 0
        L_0x01e8:
            java.lang.String r4 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dd }
            r14.<init>()     // Catch:{ all -> 0x01dd }
            r18 = r3
            java.lang.String r3 = "getFirstEmojiByGroupId fail."
            r14.append(r3)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01dd }
            r14.append(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x01dd }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x01dd }
            if (r2 == 0) goto L_0x0209
            r2.close()
        L_0x0209:
            r3 = r18
        L_0x020b:
            if (r3 == 0) goto L_0x0233
            boolean r0 = r3.mo62633C1()
            if (r0 == 0) goto L_0x0233
            tk.a r0 = p384tk.C101897a.m134075e()
            boolean r0 = r0.mo141392a(r3)
            if (r0 != 0) goto L_0x0234
            com.tencent.mm.plugin.report.service.n r18 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 252(0xfc, double:1.245E-321)
            r21 = 9
            r23 = 1
            r25 = 0
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x0234
        L_0x022b:
            if (r10 == 0) goto L_0x0230
            r10.close()
        L_0x0230:
            throw r0
        L_0x0231:
            r17 = r14
        L_0x0233:
            r0 = 0
        L_0x0234:
            if (r0 != 0) goto L_0x0248
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = r10.f298994d
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "decode failed re download product:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r3, r0)
            r5.field_sync = r2
            goto L_0x0248
        L_0x0246:
            r17 = r14
        L_0x0248:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r5.field_productID
            r3 = 0
            r0[r3] = r2
            long r2 = r5.field_lastUseTime
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            int r2 = r5.field_sort
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = "jacks updateEmojiGroupByEmotionSummary: prodcutId: %s, lasttime: %d, sort: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r2, r0)
            r1.replace(r5)
            goto L_0x0276
        L_0x026c:
            r11 = r3
            r17 = r14
            r3 = 2
            java.lang.String r0 = "summary is null or product id is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
        L_0x0276:
            int r15 = r15 + 1
            r2 = r27
            r3 = r11
            r14 = r17
            r4 = 0
            r5 = 1
            r10 = 0
            r11 = 2
            goto L_0x00b3
        L_0x0283:
            r11 = r3
            java.util.Collection r2 = r9.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x028c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02ec
            java.lang.Object r3 = r2.next()
            com.tencent.mm.storage.emotion.EmojiGroupInfo r3 = (com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r3
            if (r3 == 0) goto L_0x028c
            java.lang.String r4 = r3.field_productID
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x028c
            java.lang.String r4 = r3.field_productID
            r5 = 18
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x02b1
            goto L_0x028c
        L_0x02b1:
            java.lang.String r4 = r3.field_productID
            java.lang.String r5 = java.lang.String.valueOf(r0)
            boolean r4 = r4.equals(r5)
            java.lang.String r5 = "need to delete product id:%s"
            if (r4 == 0) goto L_0x02d3
            boolean r3 = r12.contains(r7)
            if (r3 != 0) goto L_0x028c
            r4 = 1
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r9 = 0
            r3[r9] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r3)
            r13.add(r7)
            goto L_0x028c
        L_0x02d3:
            r4 = 1
            r9 = 0
            java.lang.String r10 = r3.field_productID
            boolean r10 = r12.contains(r10)
            if (r10 != 0) goto L_0x028c
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r4 = r3.field_productID
            r10[r9] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r10)
            java.lang.String r3 = r3.field_productID
            r13.add(r3)
            goto L_0x028c
        L_0x02ec:
            int r0 = r13.size()
            if (r0 <= 0) goto L_0x0306
            java.util.Iterator r0 = r13.iterator()
        L_0x02f6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0306
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r1.mo142021Ow(r2)
            goto L_0x02f6
        L_0x0306:
            com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1.doNotify(r6, r2, r0)
            goto L_0x034a
        L_0x0313:
            r0 = move-exception
            r10 = r12
        L_0x0315:
            if (r10 == 0) goto L_0x031a
            r10.close()
        L_0x031a:
            throw r0
        L_0x031b:
            r11 = r3
            java.util.ArrayList r0 = r26.mo142028kD()
            java.util.Iterator r0 = r0.iterator()
        L_0x0324:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0347
            java.lang.Object r2 = r0.next()
            com.tencent.mm.storage.emotion.EmojiGroupInfo r2 = (com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r2
            int r3 = r2.field_sync
            if (r3 <= 0) goto L_0x0324
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = r2.field_productID
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "delete pid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r4)
            java.lang.String r2 = r2.field_productID
            r1.mo142021Ow(r2)
            goto L_0x0324
        L_0x0347:
            r1.mo142021Ow(r7)
        L_0x034a:
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r11.longValue()
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "[cpan] preparedDownloadCustomEmojiList use time:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r0)
            com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r0 = r0.toString()
            r1.doNotify(r6, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142018DN(java.util.ArrayList):void");
    }

    /* renamed from: LL */
    public boolean insert(EmojiGroupInfo emojiGroupInfo) {
        if (emojiGroupInfo == null) {
            Log.m105922f("MicroMsg.emoji.EmojiGroupInfoStorage", "insert assertion!,invalid emojigroup info.");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        emojiGroupInfo.field_lastUseTime = currentTimeMillis;
        emojiGroupInfo.field_sort = 1;
        Log.m105919d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks insert: packname: %s, lasttime: %d", emojiGroupInfo.field_packName, Long.valueOf(currentTimeMillis));
        emojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
        emojiGroupInfo.field_flag &= -257;
        boolean replace = replace(emojiGroupInfo);
        if (replace) {
            doNotify("event_update_group", 0, Util.getStack().toString());
        }
        return replace;
    }

    /* renamed from: Lo */
    public boolean mo142020Lo() {
        return ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(208912, Boolean.FALSE)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* renamed from: Ow */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo142021Ow(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            r2 = 0
            if (r1 != 0) goto L_0x005e
            java.lang.String r1 = "com.tencent.xin.emoticon.tusiji"
            boolean r1 = r7.equals(r1)     // Catch:{ Exception -> 0x0045 }
            if (r1 == 0) goto L_0x0013
            java.lang.String r7 = "17"
        L_0x0013:
            r1 = 1
            com.tencent.mm.storage.emotion.EmojiGroupInfo r3 = r6.mo142025bF(r7, r1)     // Catch:{ Exception -> 0x0045 }
            if (r3 != 0) goto L_0x001b
            goto L_0x005e
        L_0x001b:
            int r4 = r3.field_type     // Catch:{ Exception -> 0x0045 }
            r5 = 3
            if (r4 != r5) goto L_0x0027
            java.lang.String r1 = "jacks refuse delete custom emoji"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)     // Catch:{ Exception -> 0x0045 }
            goto L_0x0036
        L_0x0027:
            int r4 = r3.field_flag     // Catch:{ Exception -> 0x0045 }
            r4 = r4 | 256(0x100, float:3.59E-43)
            r3.field_flag = r4     // Catch:{ Exception -> 0x0045 }
            r4 = -1
            r3.field_status = r4     // Catch:{ Exception -> 0x0045 }
            r3.field_sort = r1     // Catch:{ Exception -> 0x0045 }
            r3.field_recommand = r2     // Catch:{ Exception -> 0x0045 }
            r3.field_sync = r2     // Catch:{ Exception -> 0x0045 }
        L_0x0036:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0045 }
            r3.field_lastUseTime = r4     // Catch:{ Exception -> 0x0045 }
            r3.field_recommand = r2     // Catch:{ Exception -> 0x0045 }
            r3.field_sync = r2     // Catch:{ Exception -> 0x0045 }
            boolean r0 = r6.replace(r3)     // Catch:{ Exception -> 0x0045 }
            goto L_0x005f
        L_0x0045:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Delete By ProductId fail."
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x0078
            com.tencent.mm.sdk.platformtools.MMStack r1 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "event_update_group"
            r6.doNotify(r3, r2, r1)
            java.lang.String r1 = "delete_group"
            r6.doNotify(r1)
            java.lang.String r1 = "delete_group_v3"
            r6.doNotify(r1, r2, r7)
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142021Ow(java.lang.String):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r2 == 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
        if (r2 == 0) goto L_0x0080;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: SE */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap<java.lang.String, com.tencent.p014mm.storage.C96984r2> mo142022SE() {
        /*
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select * from EmojiGroupInfo where "
            r1.append(r2)
            java.lang.String r2 = m135189bD()
            r1.append(r2)
            java.lang.String r2 = " order by sort ASC,lastUseTime DESC"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r7.f301702d     // Catch:{ Exception -> 0x0062 }
            r4 = 2
            android.database.Cursor r2 = r3.rawQuery(r1, r2, r4)     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x005a
            boolean r1 = r2.moveToFirst()     // Catch:{ Exception -> 0x0062 }
            if (r1 == 0) goto L_0x005a
            com.tencent.mm.storage.r2 r1 = new com.tencent.mm.storage.r2     // Catch:{ Exception -> 0x0062 }
            r1.<init>()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r3 = "productID"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r4 = "packName"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ Exception -> 0x0062 }
        L_0x0043:
            java.lang.String r5 = r2.getString(r3)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r6 = r2.getString(r4)     // Catch:{ Exception -> 0x0062 }
            r1.f284146a = r6     // Catch:{ Exception -> 0x0062 }
            r6 = 7
            r1.mo135631a(r6)     // Catch:{ Exception -> 0x0062 }
            r0.put(r5, r1)     // Catch:{ Exception -> 0x0062 }
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x0062 }
            if (r5 != 0) goto L_0x0043
        L_0x005a:
            if (r2 == 0) goto L_0x0080
        L_0x005c:
            r2.close()
            goto L_0x0080
        L_0x0060:
            r0 = move-exception
            goto L_0x0081
        L_0x0062:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r4.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r5 = "get download group map failed."
            r4.append(r5)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0060 }
            r4.append(r1)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0060 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x0080
            goto L_0x005c
        L_0x0080:
            return r0
        L_0x0081:
            if (r2 == 0) goto L_0x0086
            r2.close()
        L_0x0086:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142022SE():java.util.HashMap");
    }

    /* renamed from: TE */
    public EmojiGroupInfo mo142023TE(String str) {
        return mo142025bF(str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r2 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r2.close();
     */
    /* renamed from: Yt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo142024Yt() {
        /*
            r6 = this;
            java.lang.String r0 = "select  count(*) from EmojiInfo where catalog=?"
            r1 = 0
            r2 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r6.f301702d     // Catch:{ Exception -> 0x0026 }
            java.lang.String r4 = "81"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x0026 }
            r5 = 2
            android.database.Cursor r2 = r3.rawQuery(r0, r4, r5)     // Catch:{ Exception -> 0x0026 }
            if (r2 == 0) goto L_0x001e
            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x0026 }
            if (r0 == 0) goto L_0x001e
            int r1 = r2.getInt(r1)     // Catch:{ Exception -> 0x0026 }
        L_0x001e:
            if (r2 == 0) goto L_0x0044
        L_0x0020:
            r2.close()
            goto L_0x0044
        L_0x0024:
            r0 = move-exception
            goto L_0x0045
        L_0x0026:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            r4.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r5 = "Check GroupId Exist Faild."
            r4.append(r5)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0024 }
            r4.append(r0)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0024 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0044
            goto L_0x0020
        L_0x0044:
            return r1
        L_0x0045:
            if (r2 == 0) goto L_0x004a
            r2.close()
        L_0x004a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142024Yt():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* renamed from: bF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.storage.emotion.EmojiGroupInfo mo142025bF(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "select * from EmojiGroupInfo where productID= ?"
            r1 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r7.f301702d     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r4 = 0
            r3[r4] = r8     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r4 = 2
            android.database.Cursor r0 = r2.rawQuery(r0, r3, r4)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            if (r0 == 0) goto L_0x002a
            boolean r2 = r0.moveToFirst()     // Catch:{ Exception -> 0x0027 }
            if (r2 == 0) goto L_0x002a
            com.tencent.mm.storage.emotion.EmojiGroupInfo r2 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch:{ Exception -> 0x0027 }
            r2.<init>()     // Catch:{ Exception -> 0x0027 }
            r2.convertFrom(r0)     // Catch:{ Exception -> 0x0025 }
            r0.close()
            return r2
        L_0x0025:
            r3 = move-exception
            goto L_0x0036
        L_0x0027:
            r3 = move-exception
            r2 = r1
            goto L_0x0036
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()
        L_0x002f:
            r2 = r1
            goto L_0x005d
        L_0x0031:
            r8 = move-exception
            goto L_0x006b
        L_0x0033:
            r3 = move-exception
            r0 = r1
            r2 = r0
        L_0x0036:
            java.lang.String r4 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r5.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.String r6 = "get getEmojiGroupInof fail. product id is"
            r5.append(r6)     // Catch:{ all -> 0x0069 }
            r5.append(r8)     // Catch:{ all -> 0x0069 }
            java.lang.String r8 = " "
            r5.append(r8)     // Catch:{ all -> 0x0069 }
            java.lang.String r8 = r3.getMessage()     // Catch:{ all -> 0x0069 }
            r5.append(r8)     // Catch:{ all -> 0x0069 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x0069 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r8)     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x005d
            r0.close()
        L_0x005d:
            if (r2 != 0) goto L_0x0068
            if (r9 == 0) goto L_0x0062
            return r1
        L_0x0062:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r8 = new com.tencent.mm.storage.emotion.EmojiGroupInfo
            r8.<init>()
            return r8
        L_0x0068:
            return r2
        L_0x0069:
            r8 = move-exception
            r1 = r0
        L_0x006b:
            if (r1 == 0) goto L_0x0070
            r1.close()
        L_0x0070:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142025bF(java.lang.String, boolean):com.tencent.mm.storage.emotion.EmojiGroupInfo");
    }

    /* renamed from: bO */
    public void mo142026bO() {
        Log.m105924i("MicroMsg.emoji.EmojiGroupInfoStorage", "recover heart begin");
        EmojiGroupInfo bF = mo142025bF(String.valueOf(18), false);
        if (bF == null) {
            bF = new EmojiGroupInfo();
        } else {
            Log.m105925i("MicroMsg.emoji.EmojiGroupInfoStorage", "EmojiGroupInfo:%s", bF.toString());
        }
        bF.field_productID = String.valueOf(18);
        bF.field_packName = "emoji_custom_group";
        bF.field_type = 3;
        bF.field_status = 0;
        bF.field_packStatus = 1;
        bF.field_flag = 0;
        replace(bF);
        Log.m105924i("MicroMsg.emoji.EmojiGroupInfoStorage", "recover heart end");
    }

    public String getTableName() {
        return "EmojiGroupInfo";
    }

    /* renamed from: jo */
    public final String mo142027jo() {
        return m135188TO(1) + " or " + m135188TO(3) + " or " + m135188TO(2) + " or " + m135188TO(256);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        if (r2 == 0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        if (r2 == 0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: kD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.tencent.p014mm.storage.emotion.EmojiGroupInfo> mo142028kD() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select * from EmojiGroupInfo where "
            r1.append(r2)
            java.lang.String r2 = m135189bD()
            r1.append(r2)
            java.lang.String r2 = " order by sort ASC,lastUseTime DESC"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r6.f301702d     // Catch:{ Exception -> 0x0049 }
            r4 = 2
            android.database.Cursor r2 = r3.rawQuery(r1, r2, r4)     // Catch:{ Exception -> 0x0049 }
            if (r2 == 0) goto L_0x0041
            boolean r1 = r2.moveToFirst()     // Catch:{ Exception -> 0x0049 }
            if (r1 == 0) goto L_0x0041
        L_0x0030:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r1 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch:{ Exception -> 0x0049 }
            r1.<init>()     // Catch:{ Exception -> 0x0049 }
            r1.convertFrom(r2)     // Catch:{ Exception -> 0x0049 }
            r0.add(r1)     // Catch:{ Exception -> 0x0049 }
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0049 }
            if (r1 != 0) goto L_0x0030
        L_0x0041:
            if (r2 == 0) goto L_0x0067
        L_0x0043:
            r2.close()
            goto L_0x0067
        L_0x0047:
            r0 = move-exception
            goto L_0x0068
        L_0x0049:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r4.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = "get all group fail."
            r4.append(r5)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0047 }
            r4.append(r1)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0047 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0067
            goto L_0x0043
        L_0x0067:
            return r0
        L_0x0068:
            if (r2 == 0) goto L_0x006d
            r2.close()
        L_0x006d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142028kD():java.util.ArrayList");
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v8, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0087, code lost:
        if (r2 == 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0089, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00aa, code lost:
        if (r2 == 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ad, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: mI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.tencent.p014mm.storage.emotion.EmojiGroupInfo> mo142029mI() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select * from EmojiGroupInfo where sync > 0  or "
            r1.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " ( "
            r2.append(r3)
            r3 = 1
            java.lang.String r3 = m135188TO(r3)
            r2.append(r3)
            java.lang.String r3 = " and "
            r2.append(r3)
            java.lang.String r3 = "( ( ( flag & 256 ) = 0 )  or ( flag is null ) ) "
            r2.append(r3)
            java.lang.String r3 = " ) "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = " or "
            r1.append(r2)
            java.lang.String r2 = " ( recommand = '1' ) "
            r1.append(r2)
            java.lang.String r2 = " order by sort ASC,idx ASC,lastUseTime DESC"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r6.f301702d     // Catch:{ Exception -> 0x008f }
            r4 = 2
            android.database.Cursor r2 = r3.rawQuery(r1, r2, r4)     // Catch:{ Exception -> 0x008f }
            if (r2 == 0) goto L_0x0087
            boolean r1 = r2.moveToFirst()     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x0087
        L_0x005b:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r1 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch:{ Exception -> 0x008f }
            r1.<init>()     // Catch:{ Exception -> 0x008f }
            r1.convertFrom(r2)     // Catch:{ Exception -> 0x008f }
            r0.add(r1)     // Catch:{ Exception -> 0x008f }
            java.lang.String r3 = r1.field_productID     // Catch:{ Exception -> 0x008f }
            r4 = 17
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x008f }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ Exception -> 0x008f }
            if (r3 == 0) goto L_0x0081
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x008f }
            r4 = 2131825086(0x7f1111be, float:1.9283018E38)
            java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x008f }
            r1.field_packName = r3     // Catch:{ Exception -> 0x008f }
        L_0x0081:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x008f }
            if (r1 != 0) goto L_0x005b
        L_0x0087:
            if (r2 == 0) goto L_0x00ad
        L_0x0089:
            r2.close()
            goto L_0x00ad
        L_0x008d:
            r0 = move-exception
            goto L_0x00ae
        L_0x008f:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            r4.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r5 = "get Panel EmojiGroupInfo."
            r4.append(r5)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x008d }
            r4.append(r1)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x008d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x00ad
            goto L_0x0089
        L_0x00ad:
            return r0
        L_0x00ae:
            if (r2 == 0) goto L_0x00b3
            r2.close()
        L_0x00b3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142029mI():java.util.ArrayList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x016b A[SYNTHETIC, Splitter:B:53:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a2 A[SYNTHETIC, Splitter:B:63:0x01a2] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b9 A[SYNTHETIC, Splitter:B:71:0x01b9] */
    /* renamed from: mL */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo142030mL(android.content.Context r19) {
        /*
            r18 = this;
            java.lang.String r1 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.String r0 = "[oneliang]init start."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = "free"
            java.lang.String r2 = "type"
            java.lang.String r3 = "sort"
            java.lang.String r4 = "exception:%s"
            java.lang.String r5 = ""
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            javax.xml.parsers.DocumentBuilderFactory r7 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r8 = 0
            r10 = 0
            java.lang.String r11 = "[oneliang]init,parse xml start."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            android.content.res.AssetManager r11 = r19.getAssets()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.String r12 = "custom_emoji/manifest.xml"
            java.io.InputStream r8 = r11.open(r12)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            javax.xml.parsers.DocumentBuilder r7 = r7.newDocumentBuilder()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            org.w3c.dom.Document r7 = r7.parse(r8)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            org.w3c.dom.Element r7 = r7.getDocumentElement()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.String r11 = "catalog"
            org.w3c.dom.NodeList r7 = r7.getElementsByTagName(r11)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r11 = 0
        L_0x0040:
            int r12 = r7.getLength()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            if (r11 >= r12) goto L_0x0112
            com.tencent.mm.storage.emotion.EmojiGroupInfo r12 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r12.<init>()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            org.w3c.dom.Node r13 = r7.item(r11)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            org.w3c.dom.Element r13 = (org.w3c.dom.Element) r13     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.String r14 = "id"
            java.lang.String r14 = r13.getAttribute(r14)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.Integer r14 = java.lang.Integer.decode(r14)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            int r14 = r14.intValue()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.String r15 = r13.getAttribute(r3)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            if (r15 != 0) goto L_0x00b8
            java.lang.String r15 = "Set Sort id:%d,sort:%d"
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r9[r10] = r17     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.String r17 = r13.getAttribute(r3)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.Integer r17 = java.lang.Integer.decode(r17)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r16 = 1
            r9[r16] = r17     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r15, r9)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r9 = r14 & 18
            r15 = 18
            if (r9 != r15) goto L_0x008b
            r9 = 1
            goto L_0x008c
        L_0x008b:
            r9 = 0
        L_0x008c:
            if (r9 == 0) goto L_0x00b4
            int r9 = r18.mo142024Yt()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            if (r9 > 0) goto L_0x009a
            boolean r9 = r18.mo142020Lo()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            if (r9 == 0) goto L_0x00b4
        L_0x009a:
            r9 = -1
            r12.field_sort = r9     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            f40.o r9 = f40.C86709a0.m107535s()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r15 = 208912(0x33010, float:2.92748E-40)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r9.mo119676J(r15, r10)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.String r9 = "moveCustomEmojiTabToSecond"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r9)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            goto L_0x00b8
        L_0x00b4:
            int r9 = r11 + 1
            r12.field_sort = r9     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
        L_0x00b8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r9.<init>()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r9.append(r14)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r9.append(r5)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r12.field_productID = r9     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.String r9 = "name"
            java.lang.String r9 = r13.getAttribute(r9)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r12.field_packName = r9     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.String r9 = r13.getAttribute(r2)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            if (r9 != 0) goto L_0x00ea
            java.lang.String r9 = r13.getAttribute(r2)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.Integer r9 = java.lang.Integer.decode(r9)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            int r9 = r9.intValue()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r12.field_type = r9     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
        L_0x00ea:
            java.lang.String r9 = r13.getAttribute(r0)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            if (r9 != 0) goto L_0x0102
            java.lang.String r9 = r13.getAttribute(r0)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            java.lang.Integer r9 = java.lang.Integer.decode(r9)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            int r9 = r9.intValue()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r12.field_packType = r9     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
        L_0x0102:
            int r9 = r12.field_type     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            r10 = 1
            if (r9 == r10) goto L_0x010a
            r10 = 3
            if (r9 != r10) goto L_0x010d
        L_0x010a:
            r6.add(r12)     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
        L_0x010d:
            int r11 = r11 + 1
            r10 = 0
            goto L_0x0040
        L_0x0112:
            int r0 = r6.size()     // Catch:{ IOException -> 0x0178, Exception -> 0x0140, all -> 0x013a }
            if (r0 <= 0) goto L_0x011e
            r2 = r18
            r2.mo142033uP(r6)     // Catch:{ IOException -> 0x0138, Exception -> 0x0136 }
            goto L_0x0120
        L_0x011e:
            r2 = r18
        L_0x0120:
            java.lang.String r0 = "[oneliang]init,parse xml end."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)     // Catch:{ IOException -> 0x0138, Exception -> 0x0136 }
            if (r8 == 0) goto L_0x01ae
            r8.close()     // Catch:{ Exception -> 0x012c }
            goto L_0x01ae
        L_0x012c:
            r0 = move-exception
            r3 = r0
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r5, r0)
            goto L_0x01ae
        L_0x0136:
            r0 = move-exception
            goto L_0x0143
        L_0x0138:
            r0 = move-exception
            goto L_0x017b
        L_0x013a:
            r0 = move-exception
            r2 = r18
        L_0x013d:
            r3 = r0
            goto L_0x01b7
        L_0x0140:
            r0 = move-exception
            r2 = r18
        L_0x0143:
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b5 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x01b5 }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x01b5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r6)     // Catch:{ all -> 0x01b5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b5 }
            r3.<init>()     // Catch:{ all -> 0x01b5 }
            java.lang.String r4 = "parse xml error; "
            r3.append(r4)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01b5 }
            r3.append(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01b5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ all -> 0x01b5 }
            if (r8 == 0) goto L_0x01ae
            r8.close()     // Catch:{ Exception -> 0x016f }
            goto L_0x01ae
        L_0x016f:
            r0 = move-exception
            r3 = r0
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r5, r0)
            goto L_0x01ae
        L_0x0178:
            r0 = move-exception
            r2 = r18
        L_0x017b:
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b5 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x01b5 }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x01b5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r6)     // Catch:{ all -> 0x01b5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b5 }
            r3.<init>()     // Catch:{ all -> 0x01b5 }
            java.lang.String r4 = "init emoji group db error."
            r3.append(r4)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01b5 }
            r3.append(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01b5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ all -> 0x01b5 }
            if (r8 == 0) goto L_0x01ae
            r8.close()     // Catch:{ Exception -> 0x01a6 }
            goto L_0x01ae
        L_0x01a6:
            r0 = move-exception
            r3 = r0
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r5, r0)
        L_0x01ae:
            java.lang.String r0 = "[oneliang]init end."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r1 = 1
            return r1
        L_0x01b5:
            r0 = move-exception
            goto L_0x013d
        L_0x01b7:
            if (r8 == 0) goto L_0x01c5
            r8.close()     // Catch:{ Exception -> 0x01bd }
            goto L_0x01c5
        L_0x01bd:
            r0 = move-exception
            r4 = r0
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r5, r0)
        L_0x01c5:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142030mL(android.content.Context):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* renamed from: nP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo142031nP() {
        /*
            r17 = this;
            r1 = r17
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f301702d
            boolean r2 = r0 instanceof zh3.C91753f
            r3 = 0
            if (r2 == 0) goto L_0x0019
            zh3.f r0 = (zh3.C91753f) r0
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r4 = r2.getId()
            long r4 = r0.beginTransaction(r4)
            r2 = r0
            goto L_0x001c
        L_0x0019:
            r4 = -1
            r2 = r3
        L_0x001c:
            java.util.ArrayList r0 = r17.mo142028kD()
            boolean r6 = r0.isEmpty()
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L_0x00d8
            java.util.Iterator r6 = r0.iterator()
        L_0x002c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r6.next()
            r9 = r0
            com.tencent.mm.storage.emotion.EmojiGroupInfo r9 = (com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r9
            if (r9 == 0) goto L_0x002c
            java.lang.String r0 = r9.field_productID
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = r9.field_productID
            java.lang.String r10 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r13 = "select count(*) from EmojiInfo where groupId= ? and temp=?"
            r14 = 2
            java.lang.String[] r15 = new java.lang.String[r14]
            r15[r8] = r0
            java.lang.String r0 = "0"
            r15[r7] = r0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f301702d     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            android.database.Cursor r13 = r0.rawQuery(r13, r15, r14)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            if (r13 == 0) goto L_0x006c
            boolean r0 = r13.moveToFirst()     // Catch:{ Exception -> 0x006a }
            if (r0 == 0) goto L_0x006c
            int r0 = r13.getInt(r8)     // Catch:{ Exception -> 0x006a }
            goto L_0x006d
        L_0x006a:
            r0 = move-exception
            goto L_0x0077
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r13 == 0) goto L_0x00a2
            r13.close()
            goto L_0x00a2
        L_0x0073:
            r0 = move-exception
            goto L_0x00d2
        L_0x0075:
            r0 = move-exception
            r13 = r3
        L_0x0077:
            java.lang.String r14 = "exception:%s"
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x00d0 }
            java.lang.String r16 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x00d0 }
            r15[r8] = r16     // Catch:{ all -> 0x00d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r14, r15)     // Catch:{ all -> 0x00d0 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r14.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r15 = "[countProductId]Count ProductId fail."
            r14.append(r15)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00d0 }
            r14.append(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x00d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ all -> 0x00d0 }
            if (r13 == 0) goto L_0x00a1
            r13.close()
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            java.lang.Object[] r13 = new java.lang.Object[r7]
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            r13[r8] = r11
            java.lang.String r11 = "count product id use time:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r13)
            int r10 = r9.field_count
            if (r10 == r0) goto L_0x002c
            r9.field_count = r0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f301702d
            android.content.ContentValues r10 = r9.convertTo()
            java.lang.String[] r11 = new java.lang.String[r7]
            java.lang.String r9 = r9.field_productID
            r11[r8] = r9
            java.lang.String r9 = "EmojiGroupInfo"
            java.lang.String r12 = "productID=?"
            r0.update(r9, r10, r12, r11)
            goto L_0x002c
        L_0x00d0:
            r0 = move-exception
            r3 = r13
        L_0x00d2:
            if (r3 == 0) goto L_0x00d7
            r3.close()
        L_0x00d7:
            throw r0
        L_0x00d8:
            r0 = -1
            if (r2 == 0) goto L_0x00e0
            int r2 = r2.endTransaction(r4)
            goto L_0x00e1
        L_0x00e0:
            r2 = -1
        L_0x00e1:
            com.tencent.mm.sdk.platformtools.MMStack r3 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "event_update_group"
            r1.doNotify(r4, r8, r3)
            if (r2 <= r0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r7 = 0
        L_0x00f2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142031nP():boolean");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r0 != 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r0 == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        return false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo142032qq(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "product id is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x000e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "select count(*) from EmojiGroupInfo where productID = '"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = "' AND "
            r0.append(r6)
            java.lang.String r6 = " ( status = '7' ) "
            r0.append(r6)
            java.lang.String r6 = " AND "
            r0.append(r6)
            java.lang.String r6 = "( ( ( flag & 256 ) = 0 )  or ( flag is null ) ) "
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r0 = 0
            r2 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r5.f301702d     // Catch:{ Exception -> 0x0055 }
            r4 = 2
            android.database.Cursor r0 = r3.rawQuery(r6, r0, r4)     // Catch:{ Exception -> 0x0055 }
            if (r0 == 0) goto L_0x0050
            boolean r6 = r0.moveToFirst()     // Catch:{ Exception -> 0x0055 }
            if (r6 == 0) goto L_0x0050
            int r6 = r0.getInt(r2)     // Catch:{ Exception -> 0x0055 }
            if (r6 <= 0) goto L_0x004c
            r2 = 1
        L_0x004c:
            r0.close()
            return r2
        L_0x0050:
            if (r0 == 0) goto L_0x0073
            goto L_0x0070
        L_0x0053:
            r6 = move-exception
            goto L_0x0074
        L_0x0055:
            r6 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
            r3.<init>()     // Catch:{ all -> 0x0053 }
            java.lang.String r4 = "Check GroupId Exist Faild."
            r3.append(r4)     // Catch:{ all -> 0x0053 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0053 }
            r3.append(r6)     // Catch:{ all -> 0x0053 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x0053 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0073
        L_0x0070:
            r0.close()
        L_0x0073:
            return r2
        L_0x0074:
            if (r0 == 0) goto L_0x0079
            r0.close()
        L_0x0079:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142032qq(java.lang.String):boolean");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: uP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo142033uP(java.util.List<com.tencent.p014mm.storage.emotion.EmojiGroupInfo> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            r1 = 0
            if (r12 == 0) goto L_0x007c
            int r2 = r12.size()
            if (r2 > 0) goto L_0x000c
            goto L_0x007c
        L_0x000c:
            r2 = 0
            r3 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r11.f301702d
            boolean r6 = r5 instanceof zh3.C91753f
            r7 = 1
            if (r6 == 0) goto L_0x0033
            r2 = r5
            zh3.f r2 = (zh3.C91753f) r2
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            long r3 = r3.getId()
            long r3 = r2.beginTransaction(r3)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r5[r1] = r6
            java.lang.String r6 = "surround updateList in a transaction, ticket = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r5)
        L_0x0033:
            r5 = 0
        L_0x0034:
            int r6 = r12.size()
            if (r5 >= r6) goto L_0x0064
            java.lang.Object r6 = r12.get(r5)
            com.tencent.mm.storage.emotion.EmojiGroupInfo r6 = (com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r6
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = r6.field_productID
            r8[r1] = r9
            long r9 = r6.field_lastUseTime
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r7] = r9
            r9 = 2
            int r10 = r6.field_sort
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8[r9] = r10
            java.lang.String r9 = "jacks packname: productid: %s, lasttime: %d, sort: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r9, r8)
            r11.replace(r6)
            int r5 = r5 + 1
            goto L_0x0034
        L_0x0064:
            if (r2 == 0) goto L_0x006e
            r2.endTransaction(r3)
            java.lang.String r12 = "end updateList transaction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
        L_0x006e:
            com.tencent.mm.sdk.platformtools.MMStack r12 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "event_update_group"
            r11.doNotify(r0, r1, r12)
            return r7
        L_0x007c:
            java.lang.String r12 = "updateList . list is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102450c.mo142033uP(java.util.List):boolean");
    }
}
