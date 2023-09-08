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

/* renamed from: xh.v9 */
public class C38687v9 extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C38687v9> f104016A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f104017o;

    /* renamed from: p */
    public static final String[] f104018p = new String[0];

    /* renamed from: q */
    public static final int f104019q = 93028124;

    /* renamed from: r */
    public static final int f104020r = 1147011491;

    /* renamed from: s */
    public static final int f104021s = 111972721;

    /* renamed from: t */
    public static final int f104022t = -791592328;

    /* renamed from: u */
    public static final int f104023u = -834724724;

    /* renamed from: v */
    public static final int f104024v = 25573622;

    /* renamed from: w */
    public static final int f104025w = 3530753;

    /* renamed from: x */
    public static final int f104026x = -1205625977;

    /* renamed from: y */
    public static final int f104027y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f104028z = initAutoDBInfo(C38687v9.class);

    /* renamed from: d */
    public boolean f104029d = true;

    /* renamed from: e */
    public boolean f104030e = true;

    /* renamed from: f */
    public boolean f104031f = true;
    public String field_appId;
    public String field_appIdKey;
    public long field_expireTime;
    public String field_localFile;
    public long field_size;
    public long field_timeStamp;
    public String field_value;
    public String field_weight;

    /* renamed from: g */
    public boolean f104032g = true;

    /* renamed from: h */
    public boolean f104033h = true;

    /* renamed from: i */
    public boolean f104034i = true;

    /* renamed from: j */
    public boolean f104035j = true;

    /* renamed from: n */
    public boolean f104036n = true;

    static {
        SingleTable singleTable = new SingleTable("WebViewData");
        f104017o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("appIdKey", "string", singleTable.getName(), "");
        new Column("value", "string", singleTable.getName(), "");
        new Column("weight", "string", singleTable.getName(), "");
        new Column("expireTime", "long", singleTable.getName(), "");
        new Column("timeStamp", "long", singleTable.getName(), "");
        new Column("size", "long", singleTable.getName(), "");
        new Column("localFile", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "appIdKey";
        mAutoDBInfo.colsMap.put("appIdKey", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appIdKey";
        mAutoDBInfo.columns[2] = "value";
        mAutoDBInfo.colsMap.put("value", "TEXT");
        mAutoDBInfo.columns[3] = "weight";
        mAutoDBInfo.colsMap.put("weight", "TEXT");
        mAutoDBInfo.columns[4] = "expireTime";
        mAutoDBInfo.colsMap.put("expireTime", "LONG");
        mAutoDBInfo.columns[5] = "timeStamp";
        mAutoDBInfo.colsMap.put("timeStamp", "LONG");
        mAutoDBInfo.columns[6] = "size";
        mAutoDBInfo.colsMap.put("size", "LONG");
        mAutoDBInfo.columns[7] = "localFile";
        mAutoDBInfo.colsMap.put("localFile", "TEXT");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  appIdKey TEXT PRIMARY KEY ,  value TEXT,  weight TEXT,  expireTime LONG,  timeStamp LONG,  size LONG,  localFile TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38687v9)) {
            return false;
        }
        C38687v9 v9Var = (C38687v9) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, v9Var.field_appId) && C46238a.m51546a(this.field_appIdKey, v9Var.field_appIdKey) && C46238a.m51546a(this.field_value, v9Var.field_value) && C46238a.m51546a(this.field_weight, v9Var.field_weight) && C46238a.m51546a(Long.valueOf(this.field_expireTime), Long.valueOf(v9Var.field_expireTime)) && C46238a.m51546a(Long.valueOf(this.field_timeStamp), Long.valueOf(v9Var.field_timeStamp)) && C46238a.m51546a(Long.valueOf(this.field_size), Long.valueOf(v9Var.field_size)) && C46238a.m51546a(this.field_localFile, v9Var.field_localFile);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104019q == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104020r == hashCode) {
                    try {
                        this.field_appIdKey = cursor.getString(i);
                        this.f104030e = true;
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104021s == hashCode) {
                    try {
                        this.field_value = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104022t == hashCode) {
                    try {
                        this.field_weight = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104023u == hashCode) {
                    try {
                        this.field_expireTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104024v == hashCode) {
                    try {
                        this.field_timeStamp = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104025w == hashCode) {
                    try {
                        this.field_size = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104026x == hashCode) {
                    try {
                        this.field_localFile = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104027y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104029d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f104030e) {
            contentValues.put("appIdKey", this.field_appIdKey);
        }
        if (this.f104031f) {
            contentValues.put("value", this.field_value);
        }
        if (this.f104032g) {
            contentValues.put("weight", this.field_weight);
        }
        if (this.f104033h) {
            contentValues.put("expireTime", Long.valueOf(this.field_expireTime));
        }
        if (this.f104034i) {
            contentValues.put("timeStamp", Long.valueOf(this.field_timeStamp));
        }
        if (this.f104035j) {
            contentValues.put("size", Long.valueOf(this.field_size));
        }
        if (this.f104036n) {
            contentValues.put("localFile", this.field_localFile);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWebViewData", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WebViewData ( " + f104028z.sql + ");");
        for (String add : f104018p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWebViewData", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WebViewData", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104028z, "WebViewData", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWebViewData", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WebViewData", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWebViewData", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104028z;
    }

    public String[] getIndexCreateSQL() {
        return f104018p;
    }

    public StorageObserverOwner<C38687v9> getObserverOwner() {
        return f104016A;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appIdKey;
    }

    public SingleTable getTable() {
        return f104017o;
    }

    public String getTableName() {
        return f104017o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f104029d = true;
            }
        }
        if (contentValues.containsKey("appIdKey")) {
            this.field_appIdKey = contentValues.getAsString("appIdKey");
            if (z) {
                this.f104030e = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsString("value");
            if (z) {
                this.f104031f = true;
            }
        }
        if (contentValues.containsKey("weight")) {
            this.field_weight = contentValues.getAsString("weight");
            if (z) {
                this.f104032g = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z) {
                this.f104033h = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z) {
                this.f104034i = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z) {
                this.f104035j = true;
            }
        }
        if (contentValues.containsKey("localFile")) {
            this.field_localFile = contentValues.getAsString("localFile");
            if (z) {
                this.f104036n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
