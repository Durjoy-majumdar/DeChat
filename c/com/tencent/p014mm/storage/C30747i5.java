package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.storage.i5 */
public class C30747i5 extends MAutoStorage<C30745h5> {

    /* renamed from: e */
    public static final String[] f82688e = {MAutoStorage.getCreateSQLs(C30745h5.f82678r, "VoiceTransText")};

    /* renamed from: d */
    public ISQLiteDatabase f82689d;

    public C30747i5(ISQLiteDatabase iSQLiteDatabase) {
        this(iSQLiteDatabase, C30745h5.f82678r, "VoiceTransText", (String[]) null);
    }

    /* renamed from: Lo */
    public boolean insert(C30745h5 h5Var) {
        if (h5Var == null) {
            return false;
        }
        return this.f82689d.replace("VoiceTransText", "msgId", h5Var.convertTo()) >= 0;
    }

    /* renamed from: jo */
    public C30745h5 mo57655jo(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C30745h5 h5Var = new C30745h5();
        ISQLiteDatabase iSQLiteDatabase = this.f82689d;
        Cursor query = iSQLiteDatabase.query("VoiceTransText", (String[]) null, "cmsgId=?", new String[]{"" + str}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            h5Var.convertFrom(query);
        }
        query.close();
        return h5Var;
    }

    public C30747i5(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f82689d = iSQLiteDatabase;
    }
}
