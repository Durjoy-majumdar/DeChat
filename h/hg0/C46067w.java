package hg0;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEx;

/* renamed from: hg0.w */
public class C46067w extends MAutoStorage<C46065v> {

    /* renamed from: f */
    public static final String[] f124208f = {MAutoStorage.getCreateSQLs(C46065v.f124205S, "GoogleFriend")};

    /* renamed from: d */
    public ISQLiteDatabase f124209d;

    /* renamed from: e */
    public MStorageEx f124210e = new C46068a();

    /* renamed from: hg0.w$a */
    public class C46068a extends MStorageEx {
        public C46068a() {
        }

        public boolean shouldProcessEvent() {
            ISQLiteDatabase iSQLiteDatabase = C46067w.this.f124209d;
            if (iSQLiteDatabase != null && !iSQLiteDatabase.isClose()) {
                return true;
            }
            Object[] objArr = new Object[1];
            ISQLiteDatabase iSQLiteDatabase2 = C46067w.this.f124209d;
            objArr[0] = iSQLiteDatabase2 == null ? "null" : Boolean.valueOf(iSQLiteDatabase2.isClose());
            Log.m105929w("MicroMsg.GoogleContact.GoogleFriendUI", "shouldProcessEvent db is close :%s", objArr);
            return false;
        }
    }

    public C46067w(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C46065v.f124205S, "GoogleFriend", (String[]) null);
        this.f124209d = iSQLiteDatabase;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo71481Lo(java.util.ArrayList<hg0.C46065v> r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "MicroMsg.GoogleContact.GoogleFriendUI"
            if (r9 == 0) goto L_0x0058
            int r2 = r9.size()
            if (r2 > 0) goto L_0x000c
            goto L_0x0058
        L_0x000c:
            r2 = 0
            r3 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r8.f124209d
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
            r5[r0] = r6
            java.lang.String r6 = "surround insertList in a transaction, ticket = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r5)
        L_0x0033:
            int r5 = r9.size()
            if (r0 >= r5) goto L_0x0045
            java.lang.Object r5 = r9.get(r0)
            hg0.v r5 = (hg0.C46065v) r5
            r8.insert(r5)
            int r0 = r0 + 1
            goto L_0x0033
        L_0x0045:
            if (r2 == 0) goto L_0x004f
            r2.endTransaction(r3)
            java.lang.String r9 = "end updateList transaction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
        L_0x004f:
            com.tencent.mm.sdk.storage.MStorageEx r9 = r8.f124210e
            r0 = 2
            java.lang.String r1 = ""
            r9.doNotify(r0, r9, r1)
            return r7
        L_0x0058:
            java.lang.String r9 = "insertList . list is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hg0.C46067w.mo71481Lo(java.util.ArrayList):boolean");
    }

    /* renamed from: Ow */
    public boolean mo71482Ow(String str, int i) {
        return this.f124209d.execSQL("GoogleFriend", "UPDATE GoogleFriend SET googlecgistatus='" + i + "' WHERE " + "googleitemid" + "='" + str + "'");
    }

    /* renamed from: Yt */
    public boolean mo71483Yt(C46065v vVar) {
        String str = vVar.field_googleitemid;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend   WHERE GoogleFriend.googleitemid = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        Cursor rawQuery = this.f124209d.rawQuery(sb.toString(), (String[]) null, 2);
        boolean moveToFirst = rawQuery.moveToFirst();
        rawQuery.close();
        if (!moveToFirst) {
            return insert(vVar);
        }
        ContentValues convertTo = vVar.convertTo();
        ISQLiteDatabase iSQLiteDatabase = this.f124209d;
        int update = iSQLiteDatabase.update("GoogleFriend", convertTo, "googleitemid=?", new String[]{"" + vVar.field_googleitemid});
        if (update > 0) {
            doNotify();
        }
        return update > 0;
    }

    /* renamed from: bD */
    public boolean mo71484bD(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f124209d.execSQL("GoogleFriend", "UPDATE GoogleFriend SET googlecgistatus='" + i + "' , " + "status" + "='" + i2 + "' WHERE " + "username" + "='" + str + "'");
    }

    public String getTableName() {
        return "GoogleFriend";
    }

    /* renamed from: jo */
    public boolean insert(C46065v vVar) {
        if (vVar == null) {
            return false;
        }
        return ((int) this.f124209d.insert("GoogleFriend", "googleitemid", vVar.convertTo())) > 0;
    }

    /* renamed from: qq */
    public Cursor mo71486qq(String str) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(" WHERE ( ");
            sb.append("GoogleFriend.googleid='" + str + "'");
            sb.append(" ) ");
        }
        ISQLiteDatabase iSQLiteDatabase = this.f124209d;
        return iSQLiteDatabase.rawQuery("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + sb, (String[]) null);
    }
}
