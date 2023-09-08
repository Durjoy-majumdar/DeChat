package yy2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import uy2.C52657a;
import wz2.C53271b;

/* renamed from: yy2.a */
public final class C53658a extends MAutoStorage<C52657a> {

    /* renamed from: e */
    public static final String[] f150721e = {MAutoStorage.getCreateSQLs(C52657a.f147039T0, "TextStatusConversation")};

    /* renamed from: d */
    public final ISQLiteDatabase f150722d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53658a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C52657a.f147039T0, "TextStatusConversation", C53271b.f148693D);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C52657a.f147039T0;
        this.f150722d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("TextStatusConversation", "CREATE INDEX IF NOT EXISTS TextStatusConversation_type_scene_index ON TextStatusConversation(scene,type)");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        cy3.C58003b.m67160a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        throw r6;
     */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m60191qq(yy2.C53658a r4, int r5, int r6, java.lang.Object r7) {
        /*
            r6 = r6 & 1
            if (r6 == 0) goto L_0x0005
            r5 = -1
        L_0x0005:
            r4.getClass()
            if (r5 >= 0) goto L_0x000d
            java.lang.String r5 = "select sum(unReadCount) from TextStatusConversation"
            goto L_0x0023
        L_0x000d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "select sum(unReadCount) from TextStatusConversation where updateTime > "
            r6.append(r7)
            long r0 = (long) r5
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r6.append(r0)
            java.lang.String r5 = r6.toString()
        L_0x0023:
            android.os.SystemClock.uptimeMillis()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r4.f150722d
            r6 = 0
            android.database.Cursor r4 = r4.rawQuery(r5, r6)
            boolean r5 = r4.moveToFirst()     // Catch:{ all -> 0x005a }
            r7 = 0
            if (r5 == 0) goto L_0x003e
            boolean r5 = r4.isAfterLast()     // Catch:{ all -> 0x005a }
            if (r5 != 0) goto L_0x003e
            int r7 = r4.getInt(r7)     // Catch:{ all -> 0x005a }
        L_0x003e:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x005a }
            cy3.C58003b.m67160a(r4, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[getUnreadCount] count="
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.TextStatus.TextStatusConversationStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            return r7
        L_0x005a:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x005c }
        L_0x005c:
            r6 = move-exception
            cy3.C58003b.m67160a(r4, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yy2.C53658a.m60191qq(yy2.a, int, int, java.lang.Object):int");
    }

    /* renamed from: K */
    public final boolean mo74245K(String str) {
        C87412m.m108594g(str, "sessionId");
        if (str.length() == 0) {
            return false;
        }
        C52657a jo = mo74248jo(str);
        int i = jo.field_unReadCount;
        jo.field_unReadCount = 0;
        jo.field_readStatus = 1;
        jo.field_isRedDot = 0;
        boolean update = update(jo.systemRowid, jo);
        doNotify(jo.field_sessionId, 5, jo);
        Log.m105924i("MicroMsg.TextStatus.TextStatusConversationStorage", "[clearUnreadCount] ret=" + update + ' ' + i + " => " + jo.field_unReadCount + " sessionId=" + str);
        return update;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo74246Lo() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            int r1 = m60191qq(r5, r0, r1, r2)
            az2.e r3 = az2.C39674e.f106452d
            r3.getClass()
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_CONV_UNREAD_INT
            java.lang.Object r3 = r3.mo119685f(r4, r2)
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x0021
            r2 = r3
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0021:
            if (r2 == 0) goto L_0x0027
            int r0 = r2.intValue()
        L_0x0027:
            int r1 = r1 - r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yy2.C53658a.mo74246Lo():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0103, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0104, code lost:
        cy3.C58003b.m67160a(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0107, code lost:
        throw r11;
     */
    /* renamed from: Yt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<uy2.C52657a> mo74247Yt(int r10, int r11, int[] r12, int r13) {
        /*
            r9 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r1 = " offset "
            if (r12 == 0) goto L_0x0082
            int r2 = r12.length
            r3 = 0
            java.lang.String r4 = "("
            r5 = r4
            r4 = 0
        L_0x000f:
            java.lang.String r6 = " or "
            if (r3 >= r2) goto L_0x0045
            r7 = r12[r3]
            int r4 = r4 + 1
            r8 = 100
            if (r7 != r8) goto L_0x001c
            goto L_0x0042
        L_0x001c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = "type="
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            int r7 = r12.length
            if (r4 >= r7) goto L_0x0042
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
        L_0x0042:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0045:
            java.lang.String r2 = z04.C112550d0.m153780P(r5, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r2 = 41
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "select *, rowid from TextStatusConversation WHERE scene="
            r3.append(r4)
            r3.append(r13)
            java.lang.String r4 = " and "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "  ORDER BY placedFlag DESC, updateTime DESC limit "
            r3.append(r2)
            r3.append(r11)
            r3.append(r1)
            r3.append(r10)
            java.lang.String r1 = r3.toString()
            goto L_0x0099
        L_0x0082:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "select *, rowid from TextStatusConversation ORDER BY placedFlag DESC, updateTime DESC limit "
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
        L_0x0099:
            android.os.SystemClock.uptimeMillis()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r9.f150722d
            r3 = 0
            android.database.Cursor r1 = r2.rawQuery(r1, r3)
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0101 }
            if (r2 == 0) goto L_0x00c1
        L_0x00a9:
            boolean r2 = r1.isAfterLast()     // Catch:{ all -> 0x0101 }
            if (r2 != 0) goto L_0x00c1
            uy2.a r2 = new uy2.a     // Catch:{ all -> 0x0101 }
            r2.<init>()     // Catch:{ all -> 0x0101 }
            r2.convertFrom(r1)     // Catch:{ all -> 0x0101 }
            r2.mo73602l2()     // Catch:{ all -> 0x0101 }
            r0.add(r2)     // Catch:{ all -> 0x0101 }
            r1.moveToNext()     // Catch:{ all -> 0x0101 }
            goto L_0x00a9
        L_0x00c1:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0101 }
            cy3.C58003b.m67160a(r1, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[query] offset="
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = " pageCount="
            r1.append(r10)
            r1.append(r11)
            java.lang.String r10 = " type="
            r1.append(r10)
            r1.append(r12)
            java.lang.String r10 = " list size="
            r1.append(r10)
            int r10 = r0.size()
            r1.append(r10)
            java.lang.String r10 = ", scene="
            r1.append(r10)
            r1.append(r13)
            java.lang.String r10 = r1.toString()
            java.lang.String r11 = "MicroMsg.TextStatus.TextStatusConversationStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            return r0
        L_0x0101:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r11 = move-exception
            cy3.C58003b.m67160a(r1, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yy2.C53658a.mo74247Yt(int, int, int[], int):java.util.List");
    }

    /* renamed from: jo */
    public final C52657a mo74248jo(String str) {
        C87412m.m108594g(str, "sessionId");
        Cursor rawQuery = this.f150722d.rawQuery("select *, rowid from TextStatusConversation where sessionId = '" + str + "' ", (String[]) null);
        C52657a aVar = new C52657a();
        aVar.field_sessionId = str;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                aVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0124, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0125, code lost:
        cy3.C58003b.m67160a(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0128, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean replace(com.tencent.p014mm.sdk.storage.IAutoDBItem r9, boolean r10) {
        /*
            r8 = this;
            uy2.a r9 = (uy2.C52657a) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[replace] "
            r0.append(r1)
            r1 = 0
            if (r9 == 0) goto L_0x00a3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sessionId="
            r2.append(r3)
            java.lang.String r3 = r9.field_sessionId
            r2.append(r3)
            java.lang.String r3 = " placedFlag="
            r2.append(r3)
            long r3 = r9.field_placedFlag
            r2.append(r3)
            java.lang.String r3 = " unReadCount="
            r2.append(r3)
            int r4 = r9.field_unReadCount
            r2.append(r4)
            java.lang.String r4 = " status="
            r2.append(r4)
            int r4 = r9.field_status
            r2.append(r4)
            java.lang.String r4 = " updateTime="
            r2.append(r4)
            long r4 = r9.field_updateTime
            r2.append(r4)
            java.lang.String r4 = " digest="
            r2.append(r4)
            java.lang.String r4 = r9.field_digest
            r2.append(r4)
            java.lang.String r4 = " digestType="
            r2.append(r4)
            java.lang.String r4 = r9.field_digestType
            r2.append(r4)
            java.lang.String r4 = " lastMsgID="
            r2.append(r4)
            long r4 = r9.field_lastMsgID
            r2.append(r4)
            r2.append(r3)
            int r3 = r9.field_unReadCount
            r2.append(r3)
            java.lang.String r3 = "content="
            r2.append(r3)
            java.lang.String r3 = r9.field_content
            r2.append(r3)
            java.lang.String r3 = " isSend="
            r2.append(r3)
            int r3 = r9.field_isSend
            r2.append(r3)
            java.lang.String r3 = " editingMsg="
            r2.append(r3)
            java.lang.String r3 = r9.field_editingMsg
            r2.append(r3)
            java.lang.String r3 = " systemRowId="
            r2.append(r3)
            long r3 = r9.systemRowid
            r2.append(r3)
            java.lang.String r3 = " type="
            r2.append(r3)
            int r3 = r9.field_type
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x00a4
        L_0x00a3:
            r2 = r1
        L_0x00a4:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.TextStatus.TextStatusConversationStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 0
            if (r9 != 0) goto L_0x00b4
            goto L_0x0121
        L_0x00b4:
            android.content.ContentValues r2 = r9.convertTo()
            java.lang.String r3 = r9.field_sessionId
            java.lang.String r4 = "item.field_sessionId"
            gy3.C87412m.m108593f(r3, r4)
            android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "select *, rowid from TextStatusConversation where sessionId = '"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = "' "
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r8.f150722d
            android.database.Cursor r3 = r4.rawQuery(r3, r1)
            int r4 = r3.getCount()     // Catch:{ all -> 0x0122 }
            r5 = 1
            if (r4 <= 0) goto L_0x00e7
            r4 = 1
            goto L_0x00e8
        L_0x00e7:
            r4 = 0
        L_0x00e8:
            cy3.C58003b.m67160a(r3, r1)
            if (r4 == 0) goto L_0x0114
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r8.f150722d
            java.lang.String r3 = r8.getTableName()
            java.lang.String[] r4 = new java.lang.String[r5]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = ""
            r6.append(r7)
            java.lang.String r7 = r9.field_sessionId
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4[r0] = r6
            java.lang.String r6 = "sessionId = ?"
            int r1 = r1.update(r3, r2, r6, r4)
            if (r1 <= 0) goto L_0x0118
            r0 = 1
            goto L_0x0118
        L_0x0114:
            boolean r0 = super.insertNotify(r9, r0)
        L_0x0118:
            if (r0 == 0) goto L_0x0121
            if (r10 == 0) goto L_0x0121
            java.lang.String r9 = r9.field_sessionId
            r8.doNotify(r9)
        L_0x0121:
            return r0
        L_0x0122:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r10 = move-exception
            cy3.C58003b.m67160a(r3, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yy2.C53658a.replace(com.tencent.mm.sdk.storage.IAutoDBItem, boolean):boolean");
    }
}
