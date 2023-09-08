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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.d */
public class C38544d extends IAutoDBItem {

    /* renamed from: A */
    public static final int f102009A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f102010B = initAutoDBInfo(C38544d.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C38544d> f102011C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f102012p;

    /* renamed from: q */
    public static final String[] f102013q = new String[0];

    /* renamed from: r */
    public static final int f102014r = -41955764;

    /* renamed from: s */
    public static final int f102015s = -1146830912;

    /* renamed from: t */
    public static final int f102016t = 96960536;

    /* renamed from: u */
    public static final int f102017u = 1349547969;

    /* renamed from: v */
    public static final int f102018v = 852985952;

    /* renamed from: w */
    public static final int f102019w = -2129294769;

    /* renamed from: x */
    public static final int f102020x = -1607243192;

    /* renamed from: y */
    public static final int f102021y = -1375370902;

    /* renamed from: z */
    public static final int f102022z = -938030385;

    /* renamed from: d */
    public boolean f102023d = true;

    /* renamed from: e */
    public boolean f102024e = true;

    /* renamed from: f */
    public boolean f102025f = true;
    public String field_business;
    public long field_endTime;
    public String field_expId;
    public String field_layerId;
    public boolean field_needReport;
    public int field_prioritylevel;
    public String field_rawXML;
    public long field_sequence;
    public long field_startTime;

    /* renamed from: g */
    public boolean f102026g = true;

    /* renamed from: h */
    public boolean f102027h = true;

    /* renamed from: i */
    public boolean f102028i = true;

    /* renamed from: j */
    public boolean f102029j = true;

    /* renamed from: n */
    public boolean f102030n = true;

    /* renamed from: o */
    public boolean f102031o = true;

    static {
        SingleTable singleTable = new SingleTable("ABTestItem");
        f102012p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("layerId", "string", singleTable.getName(), "");
        new Column("business", "string", singleTable.getName(), "");
        new Column("expId", "string", singleTable.getName(), "");
        new Column("sequence", "long", singleTable.getName(), "");
        new Column("prioritylevel", "int", singleTable.getName(), "");
        new Column("startTime", "long", singleTable.getName(), "");
        new Column("endTime", "long", singleTable.getName(), "");
        new Column("needReport", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("rawXML", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "layerId";
        mAutoDBInfo.colsMap.put("layerId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "layerId";
        mAutoDBInfo.columns[1] = "business";
        mAutoDBInfo.colsMap.put("business", "TEXT");
        mAutoDBInfo.columns[2] = "expId";
        mAutoDBInfo.colsMap.put("expId", "TEXT");
        mAutoDBInfo.columns[3] = "sequence";
        mAutoDBInfo.colsMap.put("sequence", "LONG");
        mAutoDBInfo.columns[4] = "prioritylevel";
        mAutoDBInfo.colsMap.put("prioritylevel", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "LONG");
        mAutoDBInfo.columns[6] = "endTime";
        mAutoDBInfo.colsMap.put("endTime", "LONG");
        mAutoDBInfo.columns[7] = "needReport";
        mAutoDBInfo.colsMap.put("needReport", "INTEGER");
        mAutoDBInfo.columns[8] = "rawXML";
        mAutoDBInfo.colsMap.put("rawXML", "TEXT default '' ");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " layerId TEXT PRIMARY KEY ,  business TEXT,  expId TEXT,  sequence LONG,  prioritylevel INTEGER default '0' ,  startTime LONG,  endTime LONG,  needReport INTEGER,  rawXML TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38544d)) {
            return false;
        }
        C38544d dVar = (C38544d) iAutoDBItem;
        return C46238a.m51546a(this.field_layerId, dVar.field_layerId) && C46238a.m51546a(this.field_business, dVar.field_business) && C46238a.m51546a(this.field_expId, dVar.field_expId) && C46238a.m51546a(Long.valueOf(this.field_sequence), Long.valueOf(dVar.field_sequence)) && C46238a.m51546a(Integer.valueOf(this.field_prioritylevel), Integer.valueOf(dVar.field_prioritylevel)) && C46238a.m51546a(Long.valueOf(this.field_startTime), Long.valueOf(dVar.field_startTime)) && C46238a.m51546a(Long.valueOf(this.field_endTime), Long.valueOf(dVar.field_endTime)) && C46238a.m51546a(Boolean.valueOf(this.field_needReport), Boolean.valueOf(dVar.field_needReport)) && C46238a.m51546a(this.field_rawXML, dVar.field_rawXML);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102014r == hashCode) {
                    try {
                        this.field_layerId = cursor.getString(i);
                        this.f102023d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102015s == hashCode) {
                    try {
                        this.field_business = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102016t == hashCode) {
                    try {
                        this.field_expId = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102017u == hashCode) {
                    try {
                        this.field_sequence = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102018v == hashCode) {
                    try {
                        this.field_prioritylevel = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102019w == hashCode) {
                    try {
                        this.field_startTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102020x == hashCode) {
                    try {
                        this.field_endTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102021y == hashCode) {
                    try {
                        this.field_needReport = cursor.getInt(i) != 0;
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102022z == hashCode) {
                    try {
                        this.field_rawXML = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102009A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102023d) {
            contentValues.put("layerId", this.field_layerId);
        }
        if (this.f102024e) {
            contentValues.put("business", this.field_business);
        }
        if (this.f102025f) {
            contentValues.put("expId", this.field_expId);
        }
        if (this.f102026g) {
            contentValues.put("sequence", Long.valueOf(this.field_sequence));
        }
        if (this.f102027h) {
            contentValues.put("prioritylevel", Integer.valueOf(this.field_prioritylevel));
        }
        if (this.f102028i) {
            contentValues.put("startTime", Long.valueOf(this.field_startTime));
        }
        if (this.f102029j) {
            contentValues.put("endTime", Long.valueOf(this.field_endTime));
        }
        if (this.f102030n) {
            if (this.field_needReport) {
                contentValues.put("needReport", 1);
            } else {
                contentValues.put("needReport", 0);
            }
        }
        if (this.field_rawXML == null) {
            this.field_rawXML = "";
        }
        if (this.f102031o) {
            contentValues.put("rawXML", this.field_rawXML);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseABTestItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ABTestItem ( " + f102010B.sql + ");");
        for (String add : f102013q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseABTestItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ABTestItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102010B, "ABTestItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseABTestItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ABTestItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseABTestItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102010B;
    }

    public String[] getIndexCreateSQL() {
        return f102013q;
    }

    public StorageObserverOwner<C38544d> getObserverOwner() {
        return f102011C;
    }

    public Object getPrimaryKeyValue() {
        return this.field_layerId;
    }

    public SingleTable getTable() {
        return f102012p;
    }

    public String getTableName() {
        return f102012p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("layerId")) {
            this.field_layerId = contentValues.getAsString("layerId");
            if (z) {
                this.f102023d = true;
            }
        }
        if (contentValues.containsKey("business")) {
            this.field_business = contentValues.getAsString("business");
            if (z) {
                this.f102024e = true;
            }
        }
        if (contentValues.containsKey("expId")) {
            this.field_expId = contentValues.getAsString("expId");
            if (z) {
                this.f102025f = true;
            }
        }
        if (contentValues.containsKey("sequence")) {
            this.field_sequence = contentValues.getAsLong("sequence").longValue();
            if (z) {
                this.f102026g = true;
            }
        }
        if (contentValues.containsKey("prioritylevel")) {
            this.field_prioritylevel = contentValues.getAsInteger("prioritylevel").intValue();
            if (z) {
                this.f102027h = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z) {
                this.f102028i = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z) {
                this.f102029j = true;
            }
        }
        if (contentValues.containsKey("needReport")) {
            this.field_needReport = contentValues.getAsInteger("needReport").intValue() != 0;
            if (z) {
                this.f102030n = true;
            }
        }
        if (contentValues.containsKey("rawXML")) {
            this.field_rawXML = contentValues.getAsString("rawXML");
            if (z) {
                this.f102031o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
