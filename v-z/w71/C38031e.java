package w71;

import android.database.Cursor;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;
import u71.C52452d;
import v71.C37690e;

/* renamed from: w71.e */
public class C38031e extends MAutoStorage<C37690e> {

    /* renamed from: e */
    public static final String[] f100543e = {MAutoStorage.getCreateSQLs(C37690e.f99877v, "HardDeviceLikeUser")};

    /* renamed from: d */
    public ISQLiteDatabase f100544d;

    public C38031e(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37690e.f99877v, "HardDeviceLikeUser", (String[]) null);
        this.f100544d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("HardDeviceLikeUser", "CREATE INDEX IF NOT EXISTS ExdeviceRankLikeInfoRankIdAppNameIndex ON HardDeviceLikeUser ( rankID, appusername )");
    }

    /* renamed from: Lo */
    public ArrayList<C37690e> mo61493Lo(String str) {
        ArrayList<C37690e> arrayList = null;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ExdeviceRankLikeUserStg", "hy: param error");
            return null;
        }
        String format = String.format("select *, rowid from %s where %s = ? order by %s desc", new Object[]{"HardDeviceLikeUser", "rankID", AppMeasurement.Param.TIMESTAMP});
        Cursor rawQuery = this.f100544d.rawQuery(format, new String[]{Util.nullAs(str, "")}, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.ExdeviceRankLikeUserStg", "Get no rank in DB");
            return null;
        }
        if (rawQuery.moveToFirst()) {
            ArrayList<C37690e> arrayList2 = new ArrayList<>();
            do {
                C37690e eVar = new C37690e();
                eVar.convertFrom(rawQuery);
                arrayList2.add(eVar);
            } while (rawQuery.moveToNext());
            arrayList = arrayList2;
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: jo */
    public void mo61494jo(String str, String str2, ArrayList<C37690e> arrayList) {
        Assert.assertTrue(!Util.isNullOrNil(str));
        if (arrayList == null) {
            Log.m105924i("MicroMsg.ExdeviceRankLikeUserStg", "batchInsertOrUpdate failed, data is null.");
            return;
        }
        Iterator<C37690e> it = arrayList.iterator();
        while (it.hasNext()) {
            C37690e next = it.next();
            Assert.assertTrue(next != null);
            if (update(next, "rankID", "username")) {
                Log.m105918d("MicroMsg.ExdeviceRankLikeUserStg", "hy: update success");
            } else if (insert(next)) {
                Log.m105918d("MicroMsg.ExdeviceRankLikeUserStg", "hy: insert success");
            } else {
                Log.m105928w("MicroMsg.ExdeviceRankLikeUserStg", "hy: insert or update failed");
            }
        }
        C41166r1.Ix0().mo73404a("HardDeviceLikeUser", new C52452d(str, str2, (String) null));
    }
}
