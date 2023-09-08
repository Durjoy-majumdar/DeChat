package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.measurement.AppMeasurement;
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

/* renamed from: xh.n8 */
public class C38619n8 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103133h;

    /* renamed from: i */
    public static final String[] f103134i = new String[0];

    /* renamed from: j */
    public static final int f103135j = 106079;

    /* renamed from: n */
    public static final int f103136n = 55126294;

    /* renamed from: o */
    public static final int f103137o = -1306589907;

    /* renamed from: p */
    public static final int f103138p = 95844769;

    /* renamed from: q */
    public static final int f103139q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103140r = initAutoDBInfo(C38619n8.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38619n8> f103141s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103142d = true;

    /* renamed from: e */
    public boolean f103143e = true;

    /* renamed from: f */
    public boolean f103144f = true;
    public byte[] field_draft;
    public int field_extFlag;
    public String field_key;
    public long field_timestamp;

    /* renamed from: g */
    public boolean f103145g = true;

    static {
        SingleTable singleTable = new SingleTable("SnsDraft");
        f103133h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("key", "string", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
        new Column("extFlag", "int", singleTable.getName(), "");
        new Column("draft", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG default '0' ");
        mAutoDBInfo.columns[2] = "extFlag";
        mAutoDBInfo.colsMap.put("extFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "draft";
        mAutoDBInfo.colsMap.put("draft", "BLOB");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " key TEXT default ''  PRIMARY KEY ,  timestamp LONG default '0' ,  extFlag INTEGER default '0' ,  draft BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38619n8)) {
            return false;
        }
        C38619n8 n8Var = (C38619n8) iAutoDBItem;
        return C46238a.m51546a(this.field_key, n8Var.field_key) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(n8Var.field_timestamp)) && C46238a.m51546a(Integer.valueOf(this.field_extFlag), Integer.valueOf(n8Var.field_extFlag)) && C46238a.m51546a(this.field_draft, n8Var.field_draft);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103135j == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                        this.f103142d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsDraft", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103136n == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsDraft", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103137o == hashCode) {
                    try {
                        this.field_extFlag = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsDraft", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103138p == hashCode) {
                    try {
                        this.field_draft = cursor.getBlob(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsDraft", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103139q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_key == null) {
            this.field_key = "";
        }
        if (this.f103142d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f103143e) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        if (this.f103144f) {
            contentValues.put("extFlag", Integer.valueOf(this.field_extFlag));
        }
        if (this.f103145g) {
            contentValues.put("draft", this.field_draft);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSnsDraft", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SnsDraft ( " + f103140r.sql + ");");
        for (String add : f103134i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSnsDraft", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SnsDraft", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103140r, "SnsDraft", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSnsDraft", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SnsDraft", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSnsDraft", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103140r;
    }

    public String[] getIndexCreateSQL() {
        return f103134i;
    }

    public StorageObserverOwner<C38619n8> getObserverOwner() {
        return f103141s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_key;
    }

    public SingleTable getTable() {
        return f103133h;
    }

    public String getTableName() {
        return f103133h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f103142d = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f103143e = true;
            }
        }
        if (contentValues.containsKey("extFlag")) {
            this.field_extFlag = contentValues.getAsInteger("extFlag").intValue();
            if (z) {
                this.f103144f = true;
            }
        }
        if (contentValues.containsKey("draft")) {
            this.field_draft = contentValues.getAsByteArray("draft");
            if (z) {
                this.f103145g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
