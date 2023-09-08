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

/* renamed from: xh.e */
public class C38551e extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f102117h;

    /* renamed from: i */
    public static final String[] f102118i = new String[0];

    /* renamed from: j */
    public static final int f102119j = 106079;

    /* renamed from: n */
    public static final int f102120n = 107873;

    /* renamed from: o */
    public static final int f102121o = 99224;

    /* renamed from: p */
    public static final int f102122p = -148016908;

    /* renamed from: q */
    public static final int f102123q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f102124r = initAutoDBInfo(C38551e.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38551e> f102125s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102126d = true;

    /* renamed from: e */
    public boolean f102127e = true;

    /* renamed from: f */
    public boolean f102128f = true;
    public int field_dau;
    public int field_key;
    public int field_mau;
    public long field_useTime;

    /* renamed from: g */
    public boolean f102129g = true;

    static {
        SingleTable singleTable = new SingleTable("ActiveInfo");
        f102117h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("key", "int", singleTable.getName(), "");
        new Column("mau", "int", singleTable.getName(), "");
        new Column("dau", "int", singleTable.getName(), "");
        new Column("useTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "key";
        mAutoDBInfo.colsMap.put("key", "INTEGER PRIMARY KEY  COLLATE NOCASE ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = "mau";
        mAutoDBInfo.colsMap.put("mau", "INTEGER");
        mAutoDBInfo.columns[2] = "dau";
        mAutoDBInfo.colsMap.put("dau", "INTEGER");
        mAutoDBInfo.columns[3] = "useTime";
        mAutoDBInfo.colsMap.put("useTime", "LONG");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " key INTEGER PRIMARY KEY  COLLATE NOCASE ,  mau INTEGER,  dau INTEGER,  useTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38551e)) {
            return false;
        }
        C38551e eVar = (C38551e) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_key), Integer.valueOf(eVar.field_key)) && C46238a.m51546a(Integer.valueOf(this.field_mau), Integer.valueOf(eVar.field_mau)) && C46238a.m51546a(Integer.valueOf(this.field_dau), Integer.valueOf(eVar.field_dau)) && C46238a.m51546a(Long.valueOf(this.field_useTime), Long.valueOf(eVar.field_useTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102119j == hashCode) {
                    try {
                        this.field_key = cursor.getInt(i);
                        this.f102126d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseActiveInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102120n == hashCode) {
                    try {
                        this.field_mau = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseActiveInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102121o == hashCode) {
                    try {
                        this.field_dau = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseActiveInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102122p == hashCode) {
                    try {
                        this.field_useTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseActiveInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102123q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102126d) {
            contentValues.put("key", Integer.valueOf(this.field_key));
        }
        if (this.f102127e) {
            contentValues.put("mau", Integer.valueOf(this.field_mau));
        }
        if (this.f102128f) {
            contentValues.put("dau", Integer.valueOf(this.field_dau));
        }
        if (this.f102129g) {
            contentValues.put("useTime", Long.valueOf(this.field_useTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseActiveInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ActiveInfo ( " + f102124r.sql + ");");
        for (String add : f102118i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseActiveInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ActiveInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102124r, "ActiveInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseActiveInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ActiveInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseActiveInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102124r;
    }

    public String[] getIndexCreateSQL() {
        return f102118i;
    }

    public StorageObserverOwner<C38551e> getObserverOwner() {
        return f102125s;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_key);
    }

    public SingleTable getTable() {
        return f102117h;
    }

    public String getTableName() {
        return f102117h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsInteger("key").intValue();
            if (z) {
                this.f102126d = true;
            }
        }
        if (contentValues.containsKey("mau")) {
            this.field_mau = contentValues.getAsInteger("mau").intValue();
            if (z) {
                this.f102127e = true;
            }
        }
        if (contentValues.containsKey("dau")) {
            this.field_dau = contentValues.getAsInteger("dau").intValue();
            if (z) {
                this.f102128f = true;
            }
        }
        if (contentValues.containsKey("useTime")) {
            this.field_useTime = contentValues.getAsLong("useTime").longValue();
            if (z) {
                this.f102129g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
