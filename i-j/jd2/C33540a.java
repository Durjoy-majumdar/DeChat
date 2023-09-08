package jd2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import id2.C33290s;

/* renamed from: jd2.a */
public class C33540a extends MAutoStorage<C33290s> {

    /* renamed from: e */
    public static final String[] f90803e = {MAutoStorage.getCreateSQLs(C33290s.f90286t, "OfflineOrderStatus")};

    /* renamed from: d */
    public ISQLiteDatabase f90804d;

    public C33540a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33290s.f90286t, "OfflineOrderStatus", (String[]) null);
        this.f90804d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public String mo59192Lo(int i) {
        Cursor rawQuery = this.f90804d.rawQuery(String.format("SELECT * FROM %s ORDER BY %s DESC LIMIT %d;", new Object[]{"OfflineOrderStatus", "rowid", Integer.valueOf(i)}), (String[]) null, 2);
        String str = "";
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.OfflineOrderStatusStorage", "getAllOrdersInfo: error.cursor is null\n");
        } else {
            int i2 = 0;
            while (rawQuery.moveToNext() && (i2 = i2 + 1) <= i) {
                for (int i3 = 0; i3 < rawQuery.getColumnCount(); i3++) {
                    str = str + rawQuery.getColumnName(i3) + ": " + rawQuery.getString(i3) + ", ";
                }
                str = str + ";";
            }
            rawQuery.close();
        }
        return str;
    }

    /* renamed from: Ow */
    public void mo59193Ow(String str) {
        C33290s qq = mo59197qq(str);
        if (qq != null) {
            qq.field_status = -1;
        } else {
            qq = new C33290s();
            qq.field_reqkey = str;
            qq.field_status = -1;
        }
        mo59195bD(qq);
    }

    /* renamed from: Yt */
    public int mo59194Yt() {
        int i = 0;
        Cursor rawQuery = this.f90804d.rawQuery(String.format("SELECT COUNT(*) FROM %s;", new Object[]{"OfflineOrderStatus"}), (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.OfflineOrderStatusStorage", "getOrdersCount: error.cursor is null\n");
        } else {
            if (rawQuery.moveToNext() && rawQuery.getColumnCount() > 0) {
                i = rawQuery.getInt(0);
            }
            rawQuery.close();
        }
        return i;
    }

    /* renamed from: bD */
    public void mo59195bD(C33290s sVar) {
        boolean z;
        String str = sVar.field_reqkey;
        if (str == null) {
            Log.m105920e("MicroMsg.OfflineOrderStatusStorage", "status.field_reqkey is null");
            return;
        }
        Cursor rawQuery = this.f90804d.rawQuery("select * from OfflineOrderStatus where reqkey=?", new String[]{str}, 2);
        if (rawQuery == null) {
            z = false;
        } else {
            rawQuery.moveToFirst();
            z = !rawQuery.isAfterLast();
            rawQuery.close();
        }
        if (!z) {
            Log.m105925i("MicroMsg.OfflineOrderStatusStorage", "saveOfflineOrderStatus: insert reqKey: %s,  status: %d ", sVar.field_reqkey, Integer.valueOf(sVar.field_status));
            insert(sVar);
            return;
        }
        Log.m105925i("MicroMsg.OfflineOrderStatusStorage", "saveOfflineOrderStatus: update reqKey: %s,  status: %d ", sVar.field_reqkey, Integer.valueOf(sVar.field_status));
        update(sVar, new String[0]);
    }

    /* renamed from: jo */
    public C33290s mo59196jo() {
        Log.m105925i("MicroMsg.OfflineOrderStatusStorage", "in getLastestOrder: orders count: %d, latest 3 orders: %s", Integer.valueOf(mo59194Yt()), mo59192Lo(3));
        C33290s sVar = null;
        Cursor rawQuery = this.f90804d.rawQuery("SELECT * FROM OfflineOrderStatus WHERE status!=-1 ORDER BY rowid DESC LIMIT 1", (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        rawQuery.moveToFirst();
        if (!rawQuery.isAfterLast()) {
            sVar = new C33290s();
            sVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        if (sVar != null) {
            Log.m105924i("MicroMsg.OfflineOrderStatusStorage", "getLastestOrder status = " + sVar.field_status);
        } else {
            Log.m105924i("MicroMsg.OfflineOrderStatusStorage", "getLastestOrder null");
        }
        return sVar;
    }

    /* renamed from: qq */
    public C33290s mo59197qq(String str) {
        Cursor rawQuery = this.f90804d.rawQuery("select * from OfflineOrderStatus where reqkey=?", new String[]{str}, 2);
        C33290s sVar = null;
        if (rawQuery == null) {
            return null;
        }
        rawQuery.moveToFirst();
        Log.m105924i("MicroMsg.OfflineOrderStatusStorage", "in getOrderStatusByTranId: cursor.isAfterLast() = " + rawQuery.isAfterLast());
        if (!rawQuery.isAfterLast()) {
            sVar = new C33290s();
            sVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return sVar;
    }
}
