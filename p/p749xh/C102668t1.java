package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.executor.DeleteExecutor;
import com.tencent.p014mm.sdk.storage.executor.ReplaceExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.t1 */
public class C102668t1 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f302950A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f302951B = initAutoDBInfo(C102668t1.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C102668t1> f302952C = new StorageObserverOwner<>();

    /* renamed from: n */
    public static final SingleTable f302953n;

    /* renamed from: o */
    public static final Column f302954o;

    /* renamed from: p */
    public static final Column f302955p;

    /* renamed from: q */
    public static final Column f302956q;

    /* renamed from: r */
    public static final Column f302957r;

    /* renamed from: s */
    public static final String[] f302958s = {"CREATE INDEX IF NOT EXISTS md5Index ON DupCheckInfo(md5)"};

    /* renamed from: t */
    public static final int f302959t = 3355;

    /* renamed from: u */
    public static final int f302960u = 107902;

    /* renamed from: v */
    public static final int f302961v = 3530753;

    /* renamed from: w */
    public static final int f302962w = 3433509;

    /* renamed from: x */
    public static final int f302963x = -97599763;

    /* renamed from: y */
    public static final int f302964y = -295931082;

    /* renamed from: z */
    public static final int f302965z = -1306659477;

    /* renamed from: d */
    public boolean f302966d = false;

    /* renamed from: e */
    public boolean f302967e = false;

    /* renamed from: f */
    public boolean f302968f = false;
    private long field_bizType;
    private byte[] field_extData;
    private String field_id;
    private String field_md5;
    private String field_path;
    private long field_size;
    private long field_updateTime;

    /* renamed from: g */
    public boolean f302969g = false;

    /* renamed from: h */
    public boolean f302970h = false;

    /* renamed from: i */
    public boolean f302971i = false;

    /* renamed from: j */
    public boolean f302972j = false;

    static {
        SingleTable singleTable = new SingleTable("DupCheckInfo");
        f302953n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f302954o = new Column("id", "string", singleTable.getName(), "");
        f302955p = new Column("md5", "string", singleTable.getName(), "");
        f302956q = new Column("size", "long", singleTable.getName(), "");
        new Column("path", "string", singleTable.getName(), "");
        new Column("bizType", "long", singleTable.getName(), "");
        f302957r = new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("extData", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "id";
        mAutoDBInfo.colsMap.put("id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "id";
        mAutoDBInfo.columns[1] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[2] = "size";
        mAutoDBInfo.colsMap.put("size", "LONG default '0' ");
        mAutoDBInfo.columns[3] = "path";
        mAutoDBInfo.colsMap.put("path", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "bizType";
        mAutoDBInfo.colsMap.put("bizType", "LONG default '0' ");
        mAutoDBInfo.columns[5] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[6] = "extData";
        mAutoDBInfo.colsMap.put("extData", "BLOB");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " id TEXT PRIMARY KEY ,  md5 TEXT,  size LONG default '0' ,  path TEXT default '' ,  bizType LONG default '0' ,  updateTime LONG default '0' ,  extData BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public static final DeleteExecutor m135646l2(C102668t1 t1Var, boolean z) {
        if (!z) {
            return new DeleteExecutor(t1Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseDupCheckInfo");
        }
        t1Var.getClass();
        StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getDELETE(), String.valueOf(t1Var.field_id), "MicroMsg.SDK.BaseDupCheckInfo");
        storageObserverEvent.setObj(t1Var);
        return new DeleteExecutor(t1Var, storageObserverEvent, f302952C, "MicroMsg.SDK.BaseDupCheckInfo");
    }

    /* renamed from: p2 */
    public static final SelectSql m135647p2(String str) {
        return f302953n.selectAll().where(f302954o.equal(str)).log("MicroMsg.SDK.BaseDupCheckInfo").build();
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102668t1)) {
            return false;
        }
        C102668t1 t1Var = (C102668t1) iAutoDBItem;
        return C46238a.m51546a(this.field_id, t1Var.field_id) && C46238a.m51546a(this.field_md5, t1Var.field_md5) && C46238a.m51546a(Long.valueOf(this.field_size), Long.valueOf(t1Var.field_size)) && C46238a.m51546a(this.field_path, t1Var.field_path) && C46238a.m51546a(Long.valueOf(this.field_bizType), Long.valueOf(t1Var.field_bizType)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(t1Var.field_updateTime)) && C46238a.m51546a(this.field_extData, t1Var.field_extData);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302959t == hashCode) {
                    try {
                        this.field_id = cursor.getString(i);
                        this.f302966d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302960u == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302961v == hashCode) {
                    try {
                        this.field_size = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302962w == hashCode) {
                    try {
                        this.field_path = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302963x == hashCode) {
                    try {
                        this.field_bizType = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302964y == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302965z == hashCode) {
                    try {
                        this.field_extData = cursor.getBlob(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302950A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302966d) {
            contentValues.put("id", this.field_id);
        }
        if (this.f302967e) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f302968f) {
            contentValues.put("size", Long.valueOf(this.field_size));
        }
        if (this.field_path == null) {
            this.field_path = "";
        }
        if (this.f302969g) {
            contentValues.put("path", this.field_path);
        }
        if (this.f302970h) {
            contentValues.put("bizType", Long.valueOf(this.field_bizType));
        }
        if (this.f302971i) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f302972j) {
            contentValues.put("extData", this.field_extData);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseDupCheckInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS DupCheckInfo ( " + f302951B.sql + ");");
        for (String add : f302958s) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseDupCheckInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("DupCheckInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302951B, "DupCheckInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseDupCheckInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("DupCheckInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseDupCheckInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302951B;
    }

    public String[] getIndexCreateSQL() {
        return f302958s;
    }

    public StorageObserverOwner<C102668t1> getObserverOwner() {
        return f302952C;
    }

    public String getPath() {
        return this.field_path;
    }

    public Object getPrimaryKeyValue() {
        return this.field_id;
    }

    public SingleTable getTable() {
        return f302953n;
    }

    public String getTableName() {
        return f302953n.getName();
    }

    /* renamed from: m2 */
    public long mo142447m2() {
        return this.field_bizType;
    }

    /* renamed from: n2 */
    public byte[] mo142448n2() {
        return this.field_extData;
    }

    /* renamed from: o2 */
    public String mo142449o2() {
        return this.field_id;
    }

    /* renamed from: q2 */
    public void mo142450q2(long j) {
        this.field_bizType = j;
        this.f302970h = true;
    }

    /* renamed from: r2 */
    public void mo142451r2(byte[] bArr) {
        this.field_extData = bArr;
        this.f302972j = true;
    }

    public long replaceToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        ReplaceExecutor replaceExecutor;
        if (z) {
            StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getUPDATE(), String.valueOf(this.field_id), "MicroMsg.SDK.BaseDupCheckInfo");
            storageObserverEvent.setObj(this);
            replaceExecutor = new ReplaceExecutor(this, storageObserverEvent, f302952C, "MicroMsg.SDK.BaseDupCheckInfo");
        } else {
            replaceExecutor = new ReplaceExecutor(this, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseDupCheckInfo");
        }
        return replaceExecutor.execute(iSQLiteDatabase);
    }

    /* renamed from: s2 */
    public void mo142453s2(String str) {
        this.field_id = str;
        this.f302966d = true;
    }

    public void setMd5(String str) {
        this.field_md5 = str;
        this.f302967e = true;
    }

    /* renamed from: t2 */
    public void mo142455t2(String str) {
        this.field_path = str;
        this.f302969g = true;
    }

    /* renamed from: u2 */
    public void mo142456u2(long j) {
        this.field_size = j;
        this.f302968f = true;
    }

    /* renamed from: v2 */
    public void mo142457v2(long j) {
        this.field_updateTime = j;
        this.f302971i = true;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsString("id");
            if (z) {
                this.f302966d = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f302967e = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z) {
                this.f302968f = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsString("path");
            if (z) {
                this.f302969g = true;
            }
        }
        if (contentValues.containsKey("bizType")) {
            this.field_bizType = contentValues.getAsLong("bizType").longValue();
            if (z) {
                this.f302970h = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f302971i = true;
            }
        }
        if (contentValues.containsKey("extData")) {
            this.field_extData = contentValues.getAsByteArray("extData");
            if (z) {
                this.f302972j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
