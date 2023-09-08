package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.storage.f5 */
public class C30739f5 extends MAutoStorage<C30733e5> {

    /* renamed from: e */
    public static final String[] f82665e = {MAutoStorage.getCreateSQLs(C30733e5.f82657r, "UserOpenIdInApp")};

    /* renamed from: d */
    public ISQLiteDatabase f82666d;

    public C30739f5(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C30733e5.f82657r, "UserOpenIdInApp", (String[]) null);
        this.f82666d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppAppIdUsernameIndex ON UserOpenIdInApp ( appId,username )");
        iSQLiteDatabase.execSQL("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppOpenIdIndex ON UserOpenIdInApp ( openId )");
    }

    /* renamed from: Lo */
    public C30733e5 mo57647Lo(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        Cursor query = this.f82666d.query("UserOpenIdInApp", (String[]) null, "openId=?", new String[]{Util.escapeSqlValue(str)}, (String) null, (String) null, (String) null, 2);
        if (!query.moveToFirst()) {
            Log.m105928w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with openId:" + str);
            query.close();
            return null;
        }
        C30733e5 e5Var = new C30733e5();
        e5Var.convertFrom(query);
        query.close();
        return e5Var;
    }

    /* renamed from: jo */
    public C30733e5 mo57648jo(String str, String str2) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return null;
        }
        Cursor query = this.f82666d.query("UserOpenIdInApp", (String[]) null, "appId=? and username=? ", new String[]{Util.escapeSqlValue(str), Util.escapeSqlValue(str2)}, (String) null, (String) null, (String) null, 2);
        if (!query.moveToFirst()) {
            Log.m105929w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with appId-%s, username-%s:", str, str2);
            query.close();
            return null;
        }
        C30733e5 e5Var = new C30733e5();
        e5Var.convertFrom(query);
        query.close();
        return e5Var;
    }

    /* renamed from: qq */
    public boolean replace(C30733e5 e5Var) {
        if (e5Var == null || Util.isNullOrNil(e5Var.field_appId) || Util.isNullOrNil(e5Var.field_openId) || Util.isNullOrNil(e5Var.field_username)) {
            Log.m105928w("MicroMsg.scanner.UserOpenIdInAppStorage", "wrong argument");
            return false;
        }
        boolean z = this.f82666d.replace("UserOpenIdInApp", C30733e5.f82657r.primaryKey, e5Var.convertTo()) > 0;
        Log.m105919d("MicroMsg.scanner.UserOpenIdInAppStorage", "replace: appId=%s, username=%s, ret=%s ", e5Var.field_appId, e5Var.field_username, Boolean.valueOf(z));
        return z;
    }
}
