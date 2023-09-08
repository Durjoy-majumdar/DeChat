package rb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: rb0.n */
public class C47994n extends MAutoStorage<C47987l> implements C47965d0 {

    /* renamed from: e */
    public static final String[] f128716e = {MAutoStorage.getCreateSQLs(C47987l.f128701x, "BizKF")};

    /* renamed from: d */
    public ISQLiteDatabase f128717d;

    public C47994n(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C47987l.f128701x, "BizKF", (String[]) null);
        this.f128717d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("BizKF", "CREATE INDEX IF NOT EXISTS BizKFAppIdUsernameIndex ON BizKF ( brandUsername )");
        iSQLiteDatabase.execSQL("BizKF", "CREATE INDEX IF NOT EXISTS BizKFOpenIdIndex ON BizKF ( openId )");
    }

    /* renamed from: Lo */
    public C47987l mo72780Lo(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        Cursor query = this.f128717d.query("BizKF", (String[]) null, "openId=?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (!query.moveToFirst()) {
            Log.m105928w("MicroMsg.BizKFStorage", "get null with openId:" + str);
            query.close();
            return null;
        }
        C47987l lVar = new C47987l();
        lVar.convertFrom(query);
        query.close();
        return lVar;
    }

    /* renamed from: Ow */
    public boolean replace(C47987l lVar) {
        if (lVar == null || Util.isNullOrNil(lVar.field_openId) || Util.isNullOrNil(lVar.field_brandUsername)) {
            Log.m105928w("MicroMsg.BizKFStorage", "wrong argument");
            return false;
        }
        boolean z = this.f128717d.replace("BizKF", C47987l.f128701x.primaryKey, lVar.convertTo()) > 0;
        Log.m105925i("MicroMsg.BizKFStorage", "replace: openId=%s, brandUsername=%s, ret=%s ", lVar.field_openId, lVar.field_brandUsername, Boolean.valueOf(z));
        return z;
    }

    /* renamed from: Yt */
    public boolean mo72782Yt(C47987l lVar) {
        return lVar != null && System.currentTimeMillis() - lVar.field_updateTime >= 86400000;
    }

    /* renamed from: jo */
    public int mo72783jo(String str) {
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        int delete = this.f128717d.delete("BizKF", "brandUsername = ?", new String[]{str});
        Log.m105925i("MicroMsg.BizKFStorage", "deleteKFWorker by brand username(u:%s, r:%d).", str, Integer.valueOf(delete));
        return delete;
    }

    /* renamed from: qq */
    public C47987l mo72784qq(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Cursor query = this.f128717d.query("BizKF", (String[]) null, "brandUsername = ? order by kfType desc ", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (!query.moveToFirst()) {
            Log.m105928w("MicroMsg.BizKFStorage", "get null with brandUsername:" + str);
            query.close();
            return null;
        }
        C47987l lVar = new C47987l();
        lVar.convertFrom(query);
        query.close();
        return lVar;
    }
}
