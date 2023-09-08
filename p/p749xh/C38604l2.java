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

/* renamed from: xh.l2 */
public class C38604l2 extends IAutoDBItem {

    /* renamed from: A */
    public static final IAutoDBItem.MAutoDBInfo f102911A = initAutoDBInfo(C38604l2.class);

    /* renamed from: B */
    public static final StorageObserverOwner<C38604l2> f102912B = new StorageObserverOwner<>();

    /* renamed from: n */
    public static final SingleTable f102913n;

    /* renamed from: o */
    public static final Column f102914o;

    /* renamed from: p */
    public static final Column f102915p;

    /* renamed from: q */
    public static final Column f102916q;

    /* renamed from: r */
    public static final String[] f102917r = new String[0];

    /* renamed from: s */
    public static final int f102918s = 95757395;

    /* renamed from: t */
    public static final int f102919t = 3575610;

    /* renamed from: u */
    public static final int f102920u = -1867567750;

    /* renamed from: v */
    public static final int f102921v = -740565257;

    /* renamed from: w */
    public static final int f102922w = 467329943;

    /* renamed from: x */
    public static final int f102923x = 55126294;

    /* renamed from: y */
    public static final int f102924y = -892481550;

    /* renamed from: z */
    public static final int f102925z = 108705909;

    /* renamed from: d */
    public boolean f102926d = false;

    /* renamed from: e */
    public boolean f102927e = false;

    /* renamed from: f */
    public boolean f102928f = false;
    private String field_auxIndex;
    private long field_docId;
    private long field_entityId;
    private int field_status;
    private int field_subType;
    private long field_timestamp;
    private int field_type;

    /* renamed from: g */
    public boolean f102929g = false;

    /* renamed from: h */
    public boolean f102930h = false;

    /* renamed from: i */
    public boolean f102931i = false;

    /* renamed from: j */
    public boolean f102932j = false;

    static {
        SingleTable singleTable = new SingleTable("FTS5MetaMessage");
        f102913n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("docid", "long", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("subtype", "int", singleTable.getName(), "");
        f102914o = new Column("entity_id", "long", singleTable.getName(), "");
        new Column("aux_index", "string", singleTable.getName(), "");
        f102915p = new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
        f102916q = new Column("status", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "docid";
        mAutoDBInfo.colsMap.put("docid", "LONG default '0'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "docid";
        mAutoDBInfo.columns[1] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER default '0' ");
        mAutoDBInfo.columns[2] = "subtype";
        mAutoDBInfo.colsMap.put("subtype", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "entity_id";
        mAutoDBInfo.colsMap.put("entity_id", "LONG default '0' ");
        mAutoDBInfo.columns[4] = "aux_index";
        mAutoDBInfo.colsMap.put("aux_index", "TEXT default '' ");
        mAutoDBInfo.columns[5] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG default '0' ");
        mAutoDBInfo.columns[6] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " docid LONG default '0'  PRIMARY KEY ,  type INTEGER default '0' ,  subtype INTEGER default '0' ,  entity_id LONG default '0' ,  aux_index TEXT default '' ,  timestamp LONG default '0' ,  status INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38604l2)) {
            return false;
        }
        C38604l2 l2Var = (C38604l2) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_docId), Long.valueOf(l2Var.field_docId)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(l2Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_subType), Integer.valueOf(l2Var.field_subType)) && C46238a.m51546a(Long.valueOf(this.field_entityId), Long.valueOf(l2Var.field_entityId)) && C46238a.m51546a(this.field_auxIndex, l2Var.field_auxIndex) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(l2Var.field_timestamp)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(l2Var.field_status));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102918s == hashCode) {
                    try {
                        this.field_docId = cursor.getLong(i);
                        this.f102926d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102919t == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102920u == hashCode) {
                    try {
                        this.field_subType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102921v == hashCode) {
                    try {
                        this.field_entityId = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102922w == hashCode) {
                    try {
                        this.field_auxIndex = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102923x == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102924y == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102925z == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102926d) {
            contentValues.put("docid", Long.valueOf(this.field_docId));
        }
        if (this.f102927e) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f102928f) {
            contentValues.put("subtype", Integer.valueOf(this.field_subType));
        }
        if (this.f102929g) {
            contentValues.put("entity_id", Long.valueOf(this.field_entityId));
        }
        if (this.field_auxIndex == null) {
            this.field_auxIndex = "";
        }
        if (this.f102930h) {
            contentValues.put("aux_index", this.field_auxIndex);
        }
        if (this.f102931i) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        if (this.f102932j) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFTS5MetaMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FTS5MetaMessage ( " + f102911A.sql + ");");
        for (String add : f102917r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFTS5MetaMessage", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FTS5MetaMessage", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102911A, "FTS5MetaMessage", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFTS5MetaMessage", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FTS5MetaMessage", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFTS5MetaMessage", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102911A;
    }

    public String[] getIndexCreateSQL() {
        return f102917r;
    }

    public StorageObserverOwner<C38604l2> getObserverOwner() {
        return f102912B;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_docId);
    }

    public SingleTable getTable() {
        return f102913n;
    }

    public String getTableName() {
        return f102913n.getName();
    }

    public long getTimestamp() {
        return this.field_timestamp;
    }

    /* renamed from: l2 */
    public long mo61729l2() {
        return this.field_entityId;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("docid")) {
            this.field_docId = contentValues.getAsLong("docid").longValue();
            if (z) {
                this.f102926d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f102927e = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.field_subType = contentValues.getAsInteger("subtype").intValue();
            if (z) {
                this.f102928f = true;
            }
        }
        if (contentValues.containsKey("entity_id")) {
            this.field_entityId = contentValues.getAsLong("entity_id").longValue();
            if (z) {
                this.f102929g = true;
            }
        }
        if (contentValues.containsKey("aux_index")) {
            this.field_auxIndex = contentValues.getAsString("aux_index");
            if (z) {
                this.f102930h = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f102931i = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f102932j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
