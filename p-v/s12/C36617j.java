package s12;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEx;

/* renamed from: s12.j */
public class C36617j extends MAutoStorage<C36616i> {

    /* renamed from: e */
    public static final String[] f97349e = {MAutoStorage.getCreateSQLs(C36616i.f97348r, "IPCallPopularCountry")};

    /* renamed from: d */
    public ISQLiteDatabase f97350d;

    /* renamed from: s12.j$a */
    public class C36618a extends MStorageEx {
        public C36618a() {
        }

        public boolean shouldProcessEvent() {
            ISQLiteDatabase iSQLiteDatabase = C36617j.this.f97350d;
            if (iSQLiteDatabase != null && !iSQLiteDatabase.isClose()) {
                return true;
            }
            Object[] objArr = new Object[1];
            ISQLiteDatabase iSQLiteDatabase2 = C36617j.this.f97350d;
            objArr[0] = iSQLiteDatabase2 == null ? "null" : Boolean.valueOf(iSQLiteDatabase2.isClose());
            Log.m105929w("MicroMsg.IPCallPopularCountryStorage", "shouldProcessEvent db is close :%s", objArr);
            return false;
        }
    }

    public C36617j(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C36616i.f97348r, "IPCallPopularCountry", (String[]) null);
        new C36618a();
        this.f97350d = iSQLiteDatabase;
    }

    public String getTableName() {
        return "IPCallPopularCountry";
    }

    /* renamed from: jo */
    public void mo60757jo(int i, long j) {
        boolean z;
        C36616i iVar = new C36616i();
        Cursor query = this.f97350d.query("IPCallPopularCountry", (String[]) null, "countryCode=?", new String[]{Integer.toString(i)}, (String) null, (String) null, (String) null, 2);
        if (!query.moveToFirst()) {
            Log.m105924i("MicroMsg.IPCallPopularCountryStorage", "get null with countryCode:" + i);
            query.close();
            iVar.field_countryCode = i;
            iVar.field_lastCallTime = j;
            iVar.field_callTimeCount = 1;
            z = insert(iVar);
        } else {
            iVar.convertFrom(query);
            iVar.field_callTimeCount++;
            iVar.field_lastCallTime = j;
            z = super.replace(iVar);
            query.close();
        }
        Log.m105924i("MicroMsg.IPCallPopularCountryStorage", "updatePopularCountryCode ret:" + z);
    }
}
