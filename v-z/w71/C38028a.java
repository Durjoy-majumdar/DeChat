package w71;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import u71.C37346b;
import v71.C37689c;

/* renamed from: w71.a */
public class C38028a extends MAutoStorage<C37689c> {

    /* renamed from: e */
    public static final String[] f100538e = {MAutoStorage.getCreateSQLs(C37689c.f99876v, "HardDeviceRankFollowInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f100539d;

    public C38028a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37689c.f99876v, "HardDeviceRankFollowInfo", (String[]) null);
        this.f100539d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("HardDeviceRankFollowInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankFollowRankIdAppNameIndex ON HardDeviceRankFollowInfo ( rankID, appusername )");
    }

    /* renamed from: Lo */
    public boolean mo61485Lo(String str) {
        C37689c qq = mo61490qq(new C37346b("hardcode_rank_id", "hardcode_app_name", str));
        if (qq == null) {
            return false;
        }
        delete(qq, "rankID", "appusername", "username");
        Log.m105918d("MicroMsg.ExdeviceFollowInfoStg", "ap: update success");
        return true;
    }

    /* renamed from: Ow */
    public boolean mo61486Ow(C37689c cVar) {
        boolean z = false;
        Assert.assertTrue(cVar != null);
        C37689c qq = mo61490qq(new C37346b(cVar.field_rankID, cVar.field_appusername, cVar.field_username));
        if (qq != null) {
            qq.field_step = cVar.field_step;
            update(qq, "rankID", "appusername", "username");
            Log.m105918d("MicroMsg.ExdeviceFollowInfoStg", "ap: update success");
            z = true;
        }
        if (z) {
            return true;
        }
        Assert.assertTrue(true);
        insert(cVar);
        Log.m105918d("MicroMsg.ExdeviceFollowInfoStg", "ap: insert success");
        return true;
    }

    /* renamed from: Yt */
    public ArrayList<C37689c> mo61487Yt() {
        Cursor rawQuery = this.f100539d.rawQuery(String.format("select *, rowid from %s where %s= ? and %s = ? order by rowid asc", new Object[]{"HardDeviceRankFollowInfo", "rankID", "appusername"}), new String[]{"hardcode_rank_id", "hardcode_app_name"}, 2);
        ArrayList<C37689c> arrayList = null;
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get follows not in DB");
        } else {
            if (rawQuery.moveToFirst()) {
                ArrayList<C37689c> arrayList2 = new ArrayList<>();
                do {
                    C37689c cVar = new C37689c();
                    cVar.convertFrom(rawQuery);
                    Log.m105919d("MicroMsg.ExdeviceFollowInfoStg", "follow info: rowid: %s, info: %s", Integer.valueOf(rawQuery.getColumnIndex("rowid")), cVar.toString());
                    arrayList2.add(cVar);
                } while (rawQuery.moveToNext());
                Log.m105919d("MicroMsg.ExdeviceFollowInfoStg", "getAllFollowItem: %d, %s", Integer.valueOf(arrayList2.size()), arrayList2.toString());
                arrayList = arrayList2;
            } else {
                Log.m105918d("MicroMsg.ExdeviceFollowInfoStg", "ap: no record");
            }
            rawQuery.close();
        }
        return arrayList;
    }

    /* renamed from: bD */
    public void mo61488bD(List<C37689c> list) {
        if (Util.isNullOrNil("hardcode_rank_id") || Util.isNullOrNil("hardcode_app_name")) {
            Log.m105920e("MicroMsg.ExdeviceFollowInfoStg", "ap: delete follows,params is null");
        } else {
            Log.m105919d("MicroMsg.ExdeviceFollowInfoStg", "ap: delete rankId: %s %s count %d", "hardcode_rank_id", "hardcode_app_name", Integer.valueOf(this.f100539d.delete("HardDeviceRankFollowInfo", "rankID=? and appusername=?", new String[]{"hardcode_rank_id", "hardcode_app_name"})));
        }
        if (list != null) {
            for (C37689c next : list) {
                next.field_rankID = "hardcode_rank_id";
                next.field_appusername = "hardcode_app_name";
                mo61486Ow(next);
            }
        }
    }

    /* renamed from: jo */
    public boolean mo61489jo(String str) {
        String format = String.format("select * from %s where %s=? and %s=? and %s=? limit 1", new Object[]{"HardDeviceRankFollowInfo", "rankID", "appusername", "username"});
        Cursor rawQuery = this.f100539d.rawQuery(format, new String[]{Util.nullAs("hardcode_rank_id", ""), Util.nullAs("hardcode_app_name", ""), Util.nullAs(str, "")}, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.ExdeviceFollowInfoStg", "ap: check follow not in DB");
            return false;
        }
        boolean moveToFirst = rawQuery.moveToFirst();
        rawQuery.close();
        Log.m105919d("MicroMsg.ExdeviceFollowInfoStg", "checkUserIsFollow %s", Boolean.valueOf(moveToFirst));
        return moveToFirst;
    }

    /* renamed from: qq */
    public C37689c mo61490qq(C37346b bVar) {
        C37689c cVar = null;
        if (bVar == null) {
            Log.m105920e("MicroMsg.ExdeviceFollowInfoStg", "ap: param error");
            return null;
        }
        String format = String.format("select *, rowid from %s where %s = ? and %s = ? and %s = ? limit 1", new Object[]{"HardDeviceRankFollowInfo", "rankID", "username", "appusername"});
        Cursor rawQuery = this.f100539d.rawQuery(format, new String[]{Util.nullAs(bVar.f98747a, ""), Util.nullAs(bVar.f98749c, ""), Util.nullAs(bVar.f98748b, "")}, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get no follow in DB");
            return null;
        }
        if (rawQuery.moveToFirst()) {
            cVar = new C37689c();
            cVar.convertFrom(rawQuery);
        } else {
            Log.m105918d("MicroMsg.ExdeviceFollowInfoStg", "ap: no record");
        }
        rawQuery.close();
        return cVar;
    }
}
