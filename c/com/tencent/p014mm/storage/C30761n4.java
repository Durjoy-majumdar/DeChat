package com.tencent.p014mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.storage.n4 */
public class C30761n4 extends MAutoStorage<C30759m4> {

    /* renamed from: e */
    public static final String[] f82712e = {MAutoStorage.getCreateSQLs(C30759m4.f82710x, "OpenMsgListener")};

    /* renamed from: d */
    public ISQLiteDatabase f82713d;

    public C30761n4(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C30759m4.f82710x, "OpenMsgListener", (String[]) null);
        this.f82713d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerAppIdIndex ON OpenMsgListener ( appId )");
        iSQLiteDatabase.execSQL("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerStatusIndex ON OpenMsgListener ( status )");
    }

    /* renamed from: Lo */
    public int mo57670Lo(String str, C30759m4 m4Var) {
        int i;
        if (Util.isNullOrNil(str) || m4Var == null || Util.isNullOrNil(m4Var.field_appId)) {
            Log.m105928w("MicroMsg.OpenMsgListenerStorage", "wrong argument");
            return 0;
        }
        ContentValues convertTo = m4Var.convertTo();
        if (convertTo.size() > 0) {
            i = this.f82713d.update("OpenMsgListener", convertTo, "appId=?", new String[]{Util.escapeSqlValue(str)});
        } else {
            i = 0;
        }
        Log.m105919d("MicroMsg.OpenMsgListenerStorage", "update: id=%s, ret=%s ", m4Var.field_appId, Integer.valueOf(i));
        return i;
    }

    /* renamed from: jo */
    public C30759m4 mo57671jo(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        Cursor query = this.f82713d.query("OpenMsgListener", (String[]) null, "appId=?", new String[]{Util.escapeSqlValue(str)}, (String) null, (String) null, (String) null, 2);
        if (!query.moveToFirst()) {
            Log.m105928w("MicroMsg.OpenMsgListenerStorage", "get null with appId:" + str);
            query.close();
            return null;
        }
        C30759m4 m4Var = new C30759m4();
        m4Var.convertFrom(query);
        query.close();
        return m4Var;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        C30759m4 m4Var = (C30759m4) iAutoDBItem;
        if (m4Var == null || Util.isNullOrNil(m4Var.field_appId)) {
            Log.m105928w("MicroMsg.OpenMsgListenerStorage", "wrong argument");
            return false;
        }
        boolean z = this.f82713d.replace("OpenMsgListener", C30759m4.f82710x.primaryKey, m4Var.convertTo()) > 0;
        Log.m105919d("MicroMsg.OpenMsgListenerStorage", "replace: id=%s, ret=%s ", m4Var.field_appId, Boolean.valueOf(z));
        return z;
    }
}
