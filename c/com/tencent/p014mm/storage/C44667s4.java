package com.tencent.p014mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MStorage;
import g62.C8235p;
import junit.framework.Assert;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.s4 */
public class C44667s4 extends MStorage implements C8235p {

    /* renamed from: e */
    public static final String[] f121100e = {"CREATE TABLE IF NOT EXISTS role_info ( id TEXT PRIMARY KEY, name TEXT, status INT, text_reserved1 TEXT, text_reserved2 TEXT, text_reserved3 TEXT, text_reserved4 TEXT, int_reserved1 INT, int_reserved2 INT, int_reserved3 INT, int_reserved4 INT )"};

    /* renamed from: d */
    public ISQLiteDatabase f121101d;

    public C44667s4(C91753f fVar) {
        this.f121101d = fVar;
    }

    /* renamed from: Lo */
    public C44665r4 mo69816Lo(String str) {
        Assert.assertTrue(str != null && str.length() > 0);
        C44665r4 r4Var = new C44665r4();
        Cursor query = this.f121101d.query("role_info", (String[]) null, "name= ?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            r4Var.mo69812a(query);
        } else {
            r4Var = null;
        }
        query.close();
        return r4Var;
    }

    /* renamed from: Ow */
    public void mo69817Ow(String str, int i) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.RoleStorage", "insert role info failed: empty user");
        } else if (mo69816Lo(str) == null) {
            mo69818Yt(new C44665r4(str, true, true, i));
            Log.m105918d("MicroMsg.RoleStorage", "insert new role, user=" + str);
        }
    }

    /* renamed from: Yt */
    public final void mo69818Yt(C44665r4 r4Var) {
        r4Var.f121094a = 135;
        ContentValues b = r4Var.mo69813b();
        if (b.size() > 0 && this.f121101d.insert("role_info", "id", b) != 0) {
            doNotify();
        }
    }

    /* renamed from: bD */
    public void mo69819bD(C44665r4 r4Var) {
        ContentValues b = r4Var.mo69813b();
        if (b.size() > 0) {
            int update = this.f121101d.update("role_info", b, "name like ?", new String[]{r4Var.f121095b});
            Log.m105918d("MicroMsg.RoleStorage", "update role info, name=" + r4Var.f121095b + ", res:" + update);
            if (update > 0) {
                doNotify();
            }
        }
    }

    /* renamed from: c */
    public void mo69820c(String str) {
        Assert.assertTrue(str.length() > 0);
        ISQLiteDatabase iSQLiteDatabase = this.f121101d;
        int delete = iSQLiteDatabase.delete("role_info", "name=?", new String[]{"" + str});
        Log.m105918d("MicroMsg.RoleStorage", "delete name name :" + str + ", res:" + delete);
        if (delete > 0) {
            doNotify();
        }
    }

    /* renamed from: jo */
    public C44665r4 mo69821jo(String str) {
        C44665r4 r4Var = null;
        if (str != null && str.length() > 0) {
            C44665r4 r4Var2 = new C44665r4();
            ISQLiteDatabase iSQLiteDatabase = this.f121101d;
            Cursor query = iSQLiteDatabase.query("role_info", (String[]) null, "name LIKE ?", new String[]{"%" + str}, (String) null, (String) null, (String) null, 2);
            if (query.moveToFirst()) {
                r4Var2.mo69812a(query);
                r4Var = r4Var2;
            }
            query.close();
        }
        return r4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if ((r0 == 9) != false) goto L_0x0023;
     */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo69822qq(java.lang.String r5) {
        /*
            r4 = this;
            com.tencent.mm.storage.r4 r0 = r4.mo69816Lo(r5)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.f121098e
            r3 = 4
            if (r0 != r3) goto L_0x000f
            r3 = 1
            goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            if (r3 != 0) goto L_0x0023
            r3 = 5
            if (r0 != r3) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r3 != 0) goto L_0x0023
            r3 = 9
            if (r0 != r3) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.String r0 = "@"
            int r0 = r5.indexOf(r0)
            java.lang.String r3 = ""
            if (r0 < 0) goto L_0x0036
            r5.substring(r2, r0)
            java.lang.String r0 = r5.substring(r0)
            goto L_0x0037
        L_0x0036:
            r0 = r3
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            r3 = r0
        L_0x003a:
            com.tencent.mm.storage.r4 r0 = r4.mo69821jo(r3)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r0.f121095b
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C44667s4.mo69822qq(java.lang.String):boolean");
    }
}
