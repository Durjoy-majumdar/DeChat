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

/* renamed from: xh.d8 */
public class C38549d8 extends IAutoDBItem {

    /* renamed from: A */
    public static final IAutoDBItem.MAutoDBInfo f102086A = initAutoDBInfo(C38549d8.class);

    /* renamed from: B */
    public static final StorageObserverOwner<C38549d8> f102087B = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f102088o;

    /* renamed from: p */
    public static final Column f102089p;

    /* renamed from: q */
    public static final String[] f102090q = new String[0];

    /* renamed from: r */
    public static final int f102091r = 3355;

    /* renamed from: s */
    public static final int f102092s = 1379043041;

    /* renamed from: t */
    public static final int f102093t = 1369213417;

    /* renamed from: u */
    public static final int f102094u = -295931082;

    /* renamed from: v */
    public static final int f102095v = -834724724;

    /* renamed from: w */
    public static final int f102096w = 3575610;

    /* renamed from: x */
    public static final int f102097x = 3076010;

    /* renamed from: y */
    public static final int f102098y = -808004708;

    /* renamed from: z */
    public static final int f102099z = 108705909;

    /* renamed from: d */
    public boolean f102100d = true;

    /* renamed from: e */
    public boolean f102101e = true;

    /* renamed from: f */
    public boolean f102102f = true;
    public long field_createTime;
    public byte[] field_data;
    public long field_expireTime;
    public String field_id;
    public String field_indexData;
    public String field_originId;
    public int field_type;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f102103g = true;

    /* renamed from: h */
    public boolean f102104h = true;

    /* renamed from: i */
    public boolean f102105i = true;

    /* renamed from: j */
    public boolean f102106j = true;

    /* renamed from: n */
    public boolean f102107n = true;

    static {
        SingleTable singleTable = new SingleTable("SecReportDataInfo");
        f102088o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("id", "string", singleTable.getName(), "");
        new Column("originId", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        f102089p = new Column("expireTime", "long", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("data", "byte[]", singleTable.getName(), "");
        new Column("indexData", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "id";
        mAutoDBInfo.colsMap.put("id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "id";
        mAutoDBInfo.columns[1] = "originId";
        mAutoDBInfo.colsMap.put("originId", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG default '0' ");
        mAutoDBInfo.columns[3] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[4] = "expireTime";
        mAutoDBInfo.colsMap.put("expireTime", "LONG default '0' ");
        mAutoDBInfo.columns[5] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "data";
        mAutoDBInfo.colsMap.put("data", "BLOB");
        mAutoDBInfo.columns[7] = "indexData";
        mAutoDBInfo.colsMap.put("indexData", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " id TEXT PRIMARY KEY ,  originId TEXT default '' ,  createTime LONG default '0' ,  updateTime LONG default '0' ,  expireTime LONG default '0' ,  type INTEGER default '0' ,  data BLOB,  indexData TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38549d8)) {
            return false;
        }
        C38549d8 d8Var = (C38549d8) iAutoDBItem;
        return C46238a.m51546a(this.field_id, d8Var.field_id) && C46238a.m51546a(this.field_originId, d8Var.field_originId) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(d8Var.field_createTime)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(d8Var.field_updateTime)) && C46238a.m51546a(Long.valueOf(this.field_expireTime), Long.valueOf(d8Var.field_expireTime)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(d8Var.field_type)) && C46238a.m51546a(this.field_data, d8Var.field_data) && C46238a.m51546a(this.field_indexData, d8Var.field_indexData);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102091r == hashCode) {
                    try {
                        this.field_id = cursor.getString(i);
                        this.f102100d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102092s == hashCode) {
                    try {
                        this.field_originId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102093t == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102094u == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102095v == hashCode) {
                    try {
                        this.field_expireTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102096w == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102097x == hashCode) {
                    try {
                        this.field_data = cursor.getBlob(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102098y == hashCode) {
                    try {
                        this.field_indexData = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102099z == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102100d) {
            contentValues.put("id", this.field_id);
        }
        if (this.field_originId == null) {
            this.field_originId = "";
        }
        if (this.f102101e) {
            contentValues.put("originId", this.field_originId);
        }
        if (this.f102102f) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f102103g) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f102104h) {
            contentValues.put("expireTime", Long.valueOf(this.field_expireTime));
        }
        if (this.f102105i) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f102106j) {
            contentValues.put("data", this.field_data);
        }
        if (this.field_indexData == null) {
            this.field_indexData = "";
        }
        if (this.f102107n) {
            contentValues.put("indexData", this.field_indexData);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSecReportDataInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SecReportDataInfo ( " + f102086A.sql + ");");
        for (String add : f102090q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSecReportDataInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SecReportDataInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102086A, "SecReportDataInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSecReportDataInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SecReportDataInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSecReportDataInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102086A;
    }

    public String[] getIndexCreateSQL() {
        return f102090q;
    }

    public StorageObserverOwner<C38549d8> getObserverOwner() {
        return f102087B;
    }

    public Object getPrimaryKeyValue() {
        return this.field_id;
    }

    public SingleTable getTable() {
        return f102088o;
    }

    public String getTableName() {
        return f102088o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsString("id");
            if (z) {
                this.f102100d = true;
            }
        }
        if (contentValues.containsKey("originId")) {
            this.field_originId = contentValues.getAsString("originId");
            if (z) {
                this.f102101e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f102102f = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f102103g = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z) {
                this.f102104h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f102105i = true;
            }
        }
        if (contentValues.containsKey("data")) {
            this.field_data = contentValues.getAsByteArray("data");
            if (z) {
                this.f102106j = true;
            }
        }
        if (contentValues.containsKey("indexData")) {
            this.field_indexData = contentValues.getAsString("indexData");
            if (z) {
                this.f102107n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
