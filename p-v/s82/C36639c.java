package s82;

import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: s82.c */
public class C36639c extends MAutoStorage<C36638b> {

    /* renamed from: d */
    public static final String[] f97398d = {MAutoStorage.getCreateSQLs(C36638b.f97397z, "MultiTalkMember"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkMember  on MultiTalkMember  (  wxGroupId )"};

    public C36639c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C36638b.f97397z, "MultiTalkMember", (String[]) null);
    }

    /* renamed from: Lo */
    public C36638b mo60775Lo(String str, String str2) {
        Cursor rawQuery = rawQuery("select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '" + str + "' and userName ='" + str2 + "'", new String[0]);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToNext()) {
                    C36638b bVar = new C36638b();
                    bVar.field_memberUuid = (long) rawQuery.getInt(0);
                    bVar.field_wxGroupId = rawQuery.getString(1);
                    bVar.field_userName = rawQuery.getString(2);
                    bVar.field_inviteUserName = rawQuery.getString(3);
                    bVar.field_memberId = rawQuery.getLong(4);
                    bVar.field_status = rawQuery.getInt(5);
                    bVar.field_createTime = rawQuery.getLong(6);
                    Log.m105925i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "getMultiTalkMember get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d", Long.valueOf(bVar.field_memberUuid), bVar.field_wxGroupId, bVar.field_userName, bVar.field_inviteUserName, Long.valueOf(bVar.field_memberId), Integer.valueOf(bVar.field_status), Long.valueOf(bVar.field_createTime));
                    rawQuery.close();
                    return bVar;
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", e.toString());
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
        if (rawQuery == null) {
            return null;
        }
        rawQuery.close();
        return null;
    }

    /* renamed from: Ow */
    public boolean mo60776Ow(C36638b bVar) {
        if (bVar == null) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "save. MultiTalkMember is null!");
            return false;
        }
        String str = bVar.field_userName;
        Cursor rawQuery = rawQuery("select * from MultiTalkMember where userName = '" + str + "' and wxGroupId = '" + bVar.field_wxGroupId + "'", new String[0]);
        try {
            if (rawQuery.getCount() == 0) {
                boolean insert = insert(bVar);
                Log.m105924i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "insert ret " + insert + " for userName = " + str);
                return insert;
            }
            boolean update = update(bVar, new String[0]);
            Log.m105924i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "update ret " + update + " for userName = " + str);
            rawQuery.close();
            return update;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", e.toString());
            return false;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: Yt */
    public boolean mo60777Yt(C36638b bVar) {
        if (bVar == null) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "save. MultiTalkMember is null!");
            return false;
        }
        long j = bVar.field_memberUuid;
        Cursor rawQuery = rawQuery("select * from MultiTalkMember where memberUuid = '" + j + "' and wxGroupId = '" + bVar.field_wxGroupId + "'", new String[0]);
        try {
            if (rawQuery.getCount() == 0) {
                boolean insert = insert(bVar);
                Log.m105924i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "insert ret " + insert + " for memberUuid = " + j);
                return insert;
            }
            boolean update = update(bVar, new String[0]);
            Log.m105924i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "update ret " + update + " for memberUuid = " + j);
            rawQuery.close();
            return update;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", e.toString());
            return false;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: c */
    public boolean mo60778c(String str) {
        Log.m105924i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + str);
        try {
            super.execSQL("MultiTalkMember", "delete from MultiTalkMember where wxGroupId = \"" + str + FastJsonResponse.QUOTE);
            return true;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + str);
            return false;
        }
    }

    /* renamed from: jo */
    public boolean mo60779jo(String str, String str2) {
        Log.m105924i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + str + ",member = " + str2);
        try {
            super.execSQL("MultiTalkMember", "delete from MultiTalkMember where wxGroupId = \"" + str + "\" and userName = \"" + str2 + FastJsonResponse.QUOTE);
            return true;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + str + ",member = " + str2);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a9, code lost:
        if (r15 != null) goto L_0x00ab;
     */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.LinkedList<s82.C36638b> mo60780qq(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "MicroMsg.MultiTalk.storage.MultiTalkMemberStorage"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '"
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = "'"
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            android.database.Cursor r15 = r14.rawQuery(r15, r2)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L_0x0024:
            if (r15 == 0) goto L_0x00a9
            boolean r3 = r15.moveToNext()     // Catch:{ Exception -> 0x009c }
            if (r3 == 0) goto L_0x00a9
            s82.b r3 = new s82.b     // Catch:{ Exception -> 0x009c }
            r3.<init>()     // Catch:{ Exception -> 0x009c }
            int r4 = r15.getInt(r1)     // Catch:{ Exception -> 0x009c }
            long r4 = (long) r4     // Catch:{ Exception -> 0x009c }
            r3.field_memberUuid = r4     // Catch:{ Exception -> 0x009c }
            r4 = 1
            java.lang.String r5 = r15.getString(r4)     // Catch:{ Exception -> 0x009c }
            r3.field_wxGroupId = r5     // Catch:{ Exception -> 0x009c }
            r5 = 2
            java.lang.String r6 = r15.getString(r5)     // Catch:{ Exception -> 0x009c }
            r3.field_userName = r6     // Catch:{ Exception -> 0x009c }
            r6 = 3
            java.lang.String r7 = r15.getString(r6)     // Catch:{ Exception -> 0x009c }
            r3.field_inviteUserName = r7     // Catch:{ Exception -> 0x009c }
            r7 = 4
            long r8 = r15.getLong(r7)     // Catch:{ Exception -> 0x009c }
            r3.field_memberId = r8     // Catch:{ Exception -> 0x009c }
            r8 = 5
            int r9 = r15.getInt(r8)     // Catch:{ Exception -> 0x009c }
            r3.field_status = r9     // Catch:{ Exception -> 0x009c }
            r9 = 6
            long r10 = r15.getLong(r9)     // Catch:{ Exception -> 0x009c }
            r3.field_createTime = r10     // Catch:{ Exception -> 0x009c }
            java.lang.String r10 = "getMultiTalkMemberList get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d"
            r11 = 7
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x009c }
            long r12 = r3.field_memberUuid     // Catch:{ Exception -> 0x009c }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x009c }
            r11[r1] = r12     // Catch:{ Exception -> 0x009c }
            java.lang.String r12 = r3.field_wxGroupId     // Catch:{ Exception -> 0x009c }
            r11[r4] = r12     // Catch:{ Exception -> 0x009c }
            java.lang.String r4 = r3.field_userName     // Catch:{ Exception -> 0x009c }
            r11[r5] = r4     // Catch:{ Exception -> 0x009c }
            java.lang.String r4 = r3.field_inviteUserName     // Catch:{ Exception -> 0x009c }
            r11[r6] = r4     // Catch:{ Exception -> 0x009c }
            long r4 = r3.field_memberId     // Catch:{ Exception -> 0x009c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x009c }
            r11[r7] = r4     // Catch:{ Exception -> 0x009c }
            int r4 = r3.field_status     // Catch:{ Exception -> 0x009c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x009c }
            r11[r8] = r4     // Catch:{ Exception -> 0x009c }
            long r4 = r3.field_createTime     // Catch:{ Exception -> 0x009c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x009c }
            r11[r9] = r4     // Catch:{ Exception -> 0x009c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r10, r11)     // Catch:{ Exception -> 0x009c }
            r2.add(r3)     // Catch:{ Exception -> 0x009c }
            goto L_0x0024
        L_0x009a:
            r0 = move-exception
            goto L_0x00a5
        L_0x009c:
            r1 = move-exception
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x009a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x009a }
            goto L_0x00ab
        L_0x00a5:
            r15.close()
            throw r0
        L_0x00a9:
            if (r15 == 0) goto L_0x00ae
        L_0x00ab:
            r15.close()
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s82.C36639c.mo60780qq(java.lang.String):java.util.LinkedList");
    }
}
