package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.m */
public class C30758m extends MAutoStorage<C30754l> {

    /* renamed from: e */
    public static final String[] f82708e = {MAutoStorage.getCreateSQLs(C30754l.f82700p, "BackupRecoverMsgListDataId")};

    /* renamed from: d */
    public C91753f f82709d;

    public C30758m(C91753f fVar) {
        super(fVar, C30754l.f82700p, "BackupRecoverMsgListDataId", (String[]) null);
        this.f82709d = fVar;
    }

    /* renamed from: Lo */
    public String mo57666Lo(String str) {
        String str2 = "SELECT * FROM BackupRecoverMsgListDataId WHERE msgListDataId = \"" + str + "\" ";
        Log.m105918d("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionNameByMsgListDataId:" + str2);
        Cursor rawQuery = this.f82709d.rawQuery(str2, (String[]) null);
        if (rawQuery == null) {
            Log.m105921e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionNameByMsgListDataId failed, msgListDataId:%s", str);
            return null;
        } else if (rawQuery.moveToFirst()) {
            C30754l lVar = new C30754l();
            lVar.convertFrom(rawQuery);
            rawQuery.close();
            return lVar.field_sessionName;
        } else {
            rawQuery.close();
            return null;
        }
    }

    public boolean deleteAllData() {
        boolean execSQL = this.f82709d.execSQL("BackupRecoverMsgListDataId", "delete from BackupRecoverMsgListDataId");
        Log.m105925i("MicroMsg.BackupRecoverMsgListDataIdStorage", "deleteAllData, result:%b", Boolean.valueOf(execSQL));
        return execSQL;
    }

    /* renamed from: jo */
    public int mo57668jo() {
        Log.m105918d("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionCount:SELECT COUNT(DISTINCT sessionName) FROM BackupRecoverMsgListDataId ");
        Cursor rawQuery = this.f82709d.rawQuery("SELECT COUNT(DISTINCT sessionName) FROM BackupRecoverMsgListDataId ", (String[]) null);
        int i = 0;
        if (rawQuery.moveToLast()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: qq */
    public boolean mo57669qq() {
        Log.m105918d("MicroMsg.BackupRecoverMsgListDataIdStorage", "isMsgListDataIdExist:SELECT * FROM BackupRecoverMsgListDataId");
        Cursor rawQuery = this.f82709d.rawQuery("SELECT * FROM BackupRecoverMsgListDataId", (String[]) null);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.BackupRecoverMsgListDataIdStorage", "isMsgListDataIdExist failed.");
            return false;
        } else if (rawQuery.getCount() <= 0) {
            Log.m105920e("MicroMsg.BackupRecoverMsgListDataIdStorage", "No data in BackupRecoverMsgListDataIdStorage.");
            rawQuery.close();
            return false;
        } else {
            rawQuery.close();
            return true;
        }
    }

    public boolean update(long j, IAutoDBItem iAutoDBItem) {
        return super.update(j, (C30754l) iAutoDBItem);
    }
}
