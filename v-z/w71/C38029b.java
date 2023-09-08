package w71;

import android.database.Cursor;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import junit.framework.Assert;
import u71.C52452d;
import v71.C37687a;

/* renamed from: w71.b */
public class C38029b extends MAutoStorage<C37687a> {

    /* renamed from: e */
    public static final String[] f100540e = {MAutoStorage.getCreateSQLs(C37687a.f99874r, "HardDeviceChampionInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f100541d;

    public C38029b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37687a.f99874r, "HardDeviceChampionInfo", (String[]) null);
        this.f100541d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("HardDeviceChampionInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankChampionInfoRankIdAppNameIndex ON HardDeviceChampionInfo ( username )");
    }

    /* renamed from: Lo */
    public boolean mo61491Lo(C37687a aVar, boolean z) {
        Assert.assertTrue(aVar != null);
        if (update(aVar, "username")) {
            Log.m105918d("MicroMsg.ExdeviceRankChampionStg", "hy: update success");
            if (z) {
                C41166r1.Ix0().mo73404a("HardDeviceChampionInfo", new C52452d((String) null, (String) null, aVar.field_username));
            }
            return true;
        } else if (insert(aVar)) {
            Log.m105918d("MicroMsg.ExdeviceRankChampionStg", "hy: insert success");
            if (z) {
                C41166r1.Ix0().mo73404a("HardDeviceChampionInfo", new C52452d((String) null, (String) null, aVar.field_username));
            }
            return true;
        } else {
            Log.m105928w("MicroMsg.ExdeviceRankChampionStg", "hy: insert or update failed");
            return false;
        }
    }

    /* renamed from: jo */
    public C37687a mo61492jo(String str) {
        String format = String.format("select *, rowid from %s where %s = ? limit 1", new Object[]{"HardDeviceChampionInfo", "username"});
        Cursor rawQuery = this.f100541d.rawQuery(format, new String[]{Util.nullAs(str, "")}, 2);
        C37687a aVar = null;
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.ExdeviceRankChampionStg", "Get no rank in DB");
            return null;
        }
        if (rawQuery.moveToFirst()) {
            aVar = new C37687a();
            aVar.convertFrom(rawQuery);
        } else {
            Log.m105918d("MicroMsg.ExdeviceRankChampionStg", "hy: no record");
        }
        rawQuery.close();
        return aVar;
    }
}
