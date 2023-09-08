package jc2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.newtips.model.C115620d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: jc2.a */
public class C117341a extends MAutoStorage<C115620d> {

    /* renamed from: e */
    public static final String[] f351286e = {MAutoStorage.getCreateSQLs(C115620d.f346844L, "NewTipsInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f351287d;

    public C117341a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C115620d.f346844L, "NewTipsInfo", (String[]) null);
        this.f351287d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean insert(C115620d dVar) {
        if (dVar == null) {
            Log.m105920e("MicroMsg.NewTipsCompatInfoStorage", "NewTipsCompatInfo is null!");
            return false;
        }
        int i = dVar.field_tipId;
        if (i <= 0) {
            Log.m105921e("MicroMsg.NewTipsCompatInfoStorage", "newTipsId is error, tipsId = %s", Integer.valueOf(i));
            return false;
        }
        boolean insertNotify = insertNotify(dVar, false);
        if (insertNotify) {
            doNotify(dVar.field_tipId + "", 2, Integer.valueOf(dVar.field_tipId));
        }
        return insertNotify;
    }

    /* renamed from: jo */
    public C115620d mo182002jo(int i) {
        ISQLiteDatabase iSQLiteDatabase = this.f351287d;
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.NewTipsCompatInfoStorage", "getByTipsId, but db is null, return");
            return null;
        }
        Cursor query = iSQLiteDatabase.query("NewTipsInfo", (String[]) null, "tipId=?", new String[]{"" + i}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            C115620d dVar = new C115620d();
            try {
                dVar.convertFrom(query);
                query.close();
                return dVar;
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.NewTipsCompatInfoStorage", "getByTipsId convertFrom(cu) cause IlleagalStateException, return null");
                query.close();
                return null;
            }
        } else {
            Log.m105929w("MicroMsg.NewTipsCompatInfoStorage", "getByTipsId:%d, no data", Integer.valueOf(i));
            query.close();
            return null;
        }
    }

    /* renamed from: qq */
    public boolean update(C115620d dVar, String... strArr) {
        if (dVar == null) {
            Log.m105920e("MicroMsg.NewTipsCompatInfoStorage", "NewTipsCompatInfo is null!");
            return false;
        }
        boolean updateNotify = super.updateNotify(dVar, false, strArr);
        if (updateNotify) {
            doNotify(dVar.field_tipId + "", 3, Integer.valueOf(dVar.field_tipId));
        }
        Log.m105919d("MicroMsg.NewTipsCompatInfoStorage", "update result[%B]", Boolean.valueOf(updateNotify));
        return updateNotify;
    }
}
