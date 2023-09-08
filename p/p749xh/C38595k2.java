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

/* renamed from: xh.k2 */
public class C38595k2 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f102750A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f102751B = initAutoDBInfo(C38595k2.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C38595k2> f102752C = new StorageObserverOwner<>();

    /* renamed from: n */
    public static final SingleTable f102753n;

    /* renamed from: o */
    public static final Column f102754o;

    /* renamed from: p */
    public static final Column f102755p;

    /* renamed from: q */
    public static final Column f102756q;

    /* renamed from: r */
    public static final Column f102757r;

    /* renamed from: s */
    public static final String[] f102758s = new String[0];

    /* renamed from: t */
    public static final int f102759t = 95757395;

    /* renamed from: u */
    public static final int f102760u = 3575610;

    /* renamed from: v */
    public static final int f102761v = -1867567750;

    /* renamed from: w */
    public static final int f102762w = -740565257;

    /* renamed from: x */
    public static final int f102763x = 467329943;

    /* renamed from: y */
    public static final int f102764y = 55126294;

    /* renamed from: z */
    public static final int f102765z = -892481550;

    /* renamed from: d */
    public boolean f102766d = false;

    /* renamed from: e */
    public boolean f102767e = false;

    /* renamed from: f */
    public boolean f102768f = false;
    private String field_auxIndex;
    private int field_docId;
    private long field_entityId;
    private int field_status;
    private int field_subType;
    private long field_timestamp;
    private int field_type;

    /* renamed from: g */
    public boolean f102769g = false;

    /* renamed from: h */
    public boolean f102770h = false;

    /* renamed from: i */
    public boolean f102771i = false;

    /* renamed from: j */
    public boolean f102772j = false;

    static {
        SingleTable singleTable = new SingleTable("FTS5MetaContact");
        f102753n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("docid", "int", singleTable.getName(), "");
        f102754o = new Column("type", "int", singleTable.getName(), "");
        f102755p = new Column("subtype", "int", singleTable.getName(), "");
        new Column("entity_id", "long", singleTable.getName(), "");
        f102756q = new Column("aux_index", "string", singleTable.getName(), "");
        f102757r = new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "docid";
        mAutoDBInfo.colsMap.put("docid", "INTEGER default '0'  PRIMARY KEY ");
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
        mAutoDBInfo.sql = " docid INTEGER default '0'  PRIMARY KEY ,  type INTEGER default '0' ,  subtype INTEGER default '0' ,  entity_id LONG default '0' ,  aux_index TEXT default '' ,  timestamp LONG default '0' ,  status INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38595k2)) {
            return false;
        }
        C38595k2 k2Var = (C38595k2) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_docId), Integer.valueOf(k2Var.field_docId)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(k2Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_subType), Integer.valueOf(k2Var.field_subType)) && C46238a.m51546a(Long.valueOf(this.field_entityId), Long.valueOf(k2Var.field_entityId)) && C46238a.m51546a(this.field_auxIndex, k2Var.field_auxIndex) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(k2Var.field_timestamp)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(k2Var.field_status));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102759t == hashCode) {
                    try {
                        this.field_docId = cursor.getInt(i);
                        this.f102766d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102760u == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102761v == hashCode) {
                    try {
                        this.field_subType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102762w == hashCode) {
                    try {
                        this.field_entityId = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102763x == hashCode) {
                    try {
                        this.field_auxIndex = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102764y == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102765z == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102750A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102766d) {
            contentValues.put("docid", Integer.valueOf(this.field_docId));
        }
        if (this.f102767e) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f102768f) {
            contentValues.put("subtype", Integer.valueOf(this.field_subType));
        }
        if (this.f102769g) {
            contentValues.put("entity_id", Long.valueOf(this.field_entityId));
        }
        if (this.field_auxIndex == null) {
            this.field_auxIndex = "";
        }
        if (this.f102770h) {
            contentValues.put("aux_index", this.field_auxIndex);
        }
        if (this.f102771i) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        if (this.f102772j) {
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
            Log.m105920e("MicroMsg.SDK.BaseFTS5MetaContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FTS5MetaContact ( " + f102751B.sql + ");");
        for (String add : f102758s) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFTS5MetaContact", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FTS5MetaContact", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102751B, "FTS5MetaContact", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFTS5MetaContact", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FTS5MetaContact", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFTS5MetaContact", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102751B;
    }

    public String[] getIndexCreateSQL() {
        return f102758s;
    }

    public StorageObserverOwner<C38595k2> getObserverOwner() {
        return f102752C;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_docId);
    }

    public SingleTable getTable() {
        return f102753n;
    }

    public String getTableName() {
        return f102753n.getName();
    }

    public long getTimestamp() {
        return this.field_timestamp;
    }

    /* renamed from: l2 */
    public String mo61727l2() {
        return this.field_auxIndex;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("docid")) {
            this.field_docId = contentValues.getAsInteger("docid").intValue();
            if (z) {
                this.f102766d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f102767e = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.field_subType = contentValues.getAsInteger("subtype").intValue();
            if (z) {
                this.f102768f = true;
            }
        }
        if (contentValues.containsKey("entity_id")) {
            this.field_entityId = contentValues.getAsLong("entity_id").longValue();
            if (z) {
                this.f102769g = true;
            }
        }
        if (contentValues.containsKey("aux_index")) {
            this.field_auxIndex = contentValues.getAsString("aux_index");
            if (z) {
                this.f102770h = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f102771i = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f102772j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
