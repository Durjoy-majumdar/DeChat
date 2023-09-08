package w71;

import android.database.Cursor;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;
import u71.C52452d;
import v71.C52778d;

/* renamed from: w71.d */
public class C53087d extends MAutoStorage<C52778d> {

    /* renamed from: e */
    public static final String[] f148161e = {MAutoStorage.getCreateSQLs(C52778d.f147471B, "HardDeviceRankInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f148162d;

    public C53087d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C52778d.f147471B, "HardDeviceRankInfo", (String[]) null);
        this.f148162d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("HardDeviceRankInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankInfoRankIdAppNameIndex ON HardDeviceRankInfo ( rankID, appusername )");
    }

    /* renamed from: Lo */
    public boolean mo73770Lo(C52778d dVar, boolean z) {
        if (mo73772Yt(dVar, z)) {
            return true;
        }
        Assert.assertTrue(true);
        insert(dVar);
        Log.m105918d("MicroMsg.ExdeviceRankInfoStg", "hy: insert success");
        if (z) {
            C41166r1.Ix0().mo73404a("HardDeviceRankInfo", new C52452d(dVar.field_rankID, dVar.field_appusername, dVar.field_username));
        }
        return true;
    }

    /* renamed from: Ow */
    public void mo73771Ow(String str, String str2, int i) {
        Assert.assertTrue(!Util.isNullOrNil(str) && !Util.isNullOrNil(str2) && (i == 1 || i == 0 || i == 2));
        C52778d jo = mo73773jo(new C52452d(str, (String) null, str2));
        if (jo == null) {
            Log.m105928w("MicroMsg.ExdeviceRankInfoStg", "hy: info is null. abort");
            return;
        }
        jo.field_selfLikeState = i;
        if (i == 0) {
            jo.field_likecount--;
        } else if (i != 1) {
            Log.m105928w("MicroMsg.ExdeviceRankInfoStg", "hy: still loading...abort");
            return;
        } else {
            jo.field_likecount++;
        }
        mo73770Lo(jo, true);
    }

    /* renamed from: Yt */
    public boolean mo73772Yt(C52778d dVar, boolean z) {
        Assert.assertTrue(dVar != null);
        C52778d jo = mo73773jo(new C52452d(dVar.field_rankID, dVar.field_appusername, dVar.field_username));
        if (jo == null) {
            return false;
        }
        jo.field_likecount = dVar.field_likecount;
        jo.field_selfLikeState = dVar.field_selfLikeState;
        update(jo, "rankID", "username");
        Log.m105918d("MicroMsg.ExdeviceRankInfoStg", "hy: update success");
        if (z) {
            C41166r1.Ix0().mo73404a("HardDeviceRankInfo", new C52452d(dVar.field_rankID, dVar.field_appusername, dVar.field_username));
        }
        return true;
    }

    /* renamed from: jo */
    public C52778d mo73773jo(C52452d dVar) {
        C52778d dVar2 = null;
        if (dVar == null) {
            Log.m105920e("MicroMsg.ExdeviceRankInfoStg", "hy: param error");
            return null;
        }
        String format = String.format("select *, rowid from %s where %s = ? and %s = ? limit 1", new Object[]{"HardDeviceRankInfo", "rankID", "username"});
        Cursor rawQuery = this.f148162d.rawQuery(format, new String[]{Util.nullAs(dVar.f146566a, ""), Util.nullAs(dVar.f146567b, "")}, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
            return null;
        }
        if (rawQuery.moveToFirst()) {
            dVar2 = new C52778d();
            dVar2.convertFrom(rawQuery);
        } else {
            Log.m105918d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
        }
        rawQuery.close();
        return dVar2;
    }

    /* renamed from: qq */
    public void mo73774qq(String str, ArrayList<C52778d> arrayList, boolean z) {
        int i;
        Assert.assertTrue(!Util.isNullOrNil(str));
        if (arrayList != null) {
            String format = String.format("select COUNT(*) from %s where %s = ?", new Object[]{"HardDeviceRankInfo", "rankID"});
            Cursor rawQuery = this.f148162d.rawQuery(format, new String[]{Util.nullAs(str, "")}, 2);
            if (rawQuery == null) {
                Log.m105920e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
                i = 0;
            } else {
                if (rawQuery.moveToFirst()) {
                    i = rawQuery.getInt(0);
                } else {
                    Log.m105918d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
                    i = 0;
                }
                rawQuery.close();
            }
            if (i == 0) {
                Iterator<C52778d> it = arrayList.iterator();
                while (it.hasNext()) {
                    mo73770Lo(it.next(), false);
                }
            } else {
                Iterator<C52778d> it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    mo73772Yt(it4.next(), false);
                }
            }
            if (z) {
                C41166r1.Ix0().mo73404a("HardDeviceRankInfo", new C52452d(str, (String) null, (String) null));
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.ExdeviceRankInfoStg", "hy: data is null. abort insert");
    }
}
