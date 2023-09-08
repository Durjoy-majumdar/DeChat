package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.l7 */
public class C38608l7 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f102970h;

    /* renamed from: i */
    public static final String[] f102971i = new String[0];

    /* renamed from: j */
    public static final int f102972j = 93028124;

    /* renamed from: n */
    public static final int f102973n = 3575610;

    /* renamed from: o */
    public static final int f102974o = 103315;

    /* renamed from: p */
    public static final int f102975p = 1691165350;

    /* renamed from: q */
    public static final int f102976q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f102977r = initAutoDBInfo(C38608l7.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38608l7> f102978s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102979d = true;

    /* renamed from: e */
    public boolean f102980e = true;

    /* renamed from: f */
    public boolean f102981f = true;
    public String field_appId;
    public int field_hit;
    public long field_hitTimeMS;
    public int field_type;

    /* renamed from: g */
    public boolean f102982g = true;

    static {
        SingleTable singleTable = new SingleTable("PkgUsageLRURecord");
        f102970h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("hit", "int", singleTable.getName(), "");
        new Column("hitTimeMS", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[2] = "hit";
        mAutoDBInfo.colsMap.put("hit", "INTEGER");
        mAutoDBInfo.columns[3] = "hitTimeMS";
        mAutoDBInfo.colsMap.put("hitTimeMS", "LONG");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  type INTEGER,  hit INTEGER,  hitTimeMS LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38608l7)) {
            return false;
        }
        C38608l7 l7Var = (C38608l7) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, l7Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(l7Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_hit), Integer.valueOf(l7Var.field_hit)) && C46238a.m51546a(Long.valueOf(this.field_hitTimeMS), Long.valueOf(l7Var.field_hitTimeMS));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102972j == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePkgUsageLRURecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102973n == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePkgUsageLRURecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102974o == hashCode) {
                    try {
                        this.field_hit = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePkgUsageLRURecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102975p == hashCode) {
                    try {
                        this.field_hitTimeMS = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePkgUsageLRURecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102976q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102979d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f102980e) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f102981f) {
            contentValues.put("hit", Integer.valueOf(this.field_hit));
        }
        if (this.f102982g) {
            contentValues.put("hitTimeMS", Long.valueOf(this.field_hitTimeMS));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BasePkgUsageLRURecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PkgUsageLRURecord ( " + f102977r.sql + ");");
        for (String add : f102971i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePkgUsageLRURecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PkgUsageLRURecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102977r, "PkgUsageLRURecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePkgUsageLRURecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PkgUsageLRURecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePkgUsageLRURecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102977r;
    }

    public String[] getIndexCreateSQL() {
        return f102971i;
    }

    public StorageObserverOwner<C38608l7> getObserverOwner() {
        return f102978s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102970h;
    }

    public String getTableName() {
        return f102970h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f102979d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f102980e = true;
            }
        }
        if (contentValues.containsKey("hit")) {
            this.field_hit = contentValues.getAsInteger("hit").intValue();
            if (z) {
                this.f102981f = true;
            }
        }
        if (contentValues.containsKey("hitTimeMS")) {
            this.field_hitTimeMS = contentValues.getAsLong("hitTimeMS").longValue();
            if (z) {
                this.f102982g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
