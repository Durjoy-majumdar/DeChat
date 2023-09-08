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

/* renamed from: xh.c */
public class C38536c extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C38536c> f101843A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f101844o;

    /* renamed from: p */
    public static final String[] f101845p = new String[0];

    /* renamed from: q */
    public static final int f101846q = -1655147188;

    /* renamed from: r */
    public static final int f101847r = 111972721;

    /* renamed from: s */
    public static final int f101848s = 96960536;

    /* renamed from: t */
    public static final int f101849t = 1349547969;

    /* renamed from: u */
    public static final int f101850u = 852985952;

    /* renamed from: v */
    public static final int f101851v = -2129294769;

    /* renamed from: w */
    public static final int f101852w = -1607243192;

    /* renamed from: x */
    public static final int f101853x = 608582229;

    /* renamed from: y */
    public static final int f101854y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f101855z = initAutoDBInfo(C38536c.class);

    /* renamed from: d */
    public boolean f101856d = true;

    /* renamed from: e */
    public boolean f101857e = true;

    /* renamed from: f */
    public boolean f101858f = true;
    public String field_abtestkey;
    public long field_endTime;
    public String field_expId;
    public boolean field_noReport;
    public int field_prioritylevel;
    public long field_sequence;
    public long field_startTime;
    public String field_value;

    /* renamed from: g */
    public boolean f101859g = true;

    /* renamed from: h */
    public boolean f101860h = true;

    /* renamed from: i */
    public boolean f101861i = true;

    /* renamed from: j */
    public boolean f101862j = true;

    /* renamed from: n */
    public boolean f101863n = true;

    static {
        SingleTable singleTable = new SingleTable("ABTestInfo");
        f101844o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("abtestkey", "string", singleTable.getName(), "");
        new Column("value", "string", singleTable.getName(), "");
        new Column("expId", "string", singleTable.getName(), "");
        new Column("sequence", "long", singleTable.getName(), "");
        new Column("prioritylevel", "int", singleTable.getName(), "");
        new Column("startTime", "long", singleTable.getName(), "");
        new Column("endTime", "long", singleTable.getName(), "");
        new Column("noReport", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "abtestkey";
        mAutoDBInfo.colsMap.put("abtestkey", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "abtestkey";
        mAutoDBInfo.columns[1] = "value";
        mAutoDBInfo.colsMap.put("value", "TEXT");
        mAutoDBInfo.columns[2] = "expId";
        mAutoDBInfo.colsMap.put("expId", "TEXT");
        mAutoDBInfo.columns[3] = "sequence";
        mAutoDBInfo.colsMap.put("sequence", "LONG");
        mAutoDBInfo.columns[4] = "prioritylevel";
        mAutoDBInfo.colsMap.put("prioritylevel", "INTEGER");
        mAutoDBInfo.columns[5] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "LONG");
        mAutoDBInfo.columns[6] = "endTime";
        mAutoDBInfo.colsMap.put("endTime", "LONG");
        mAutoDBInfo.columns[7] = "noReport";
        mAutoDBInfo.colsMap.put("noReport", "INTEGER");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " abtestkey TEXT PRIMARY KEY ,  value TEXT,  expId TEXT,  sequence LONG,  prioritylevel INTEGER,  startTime LONG,  endTime LONG,  noReport INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38536c)) {
            return false;
        }
        C38536c cVar = (C38536c) iAutoDBItem;
        return C46238a.m51546a(this.field_abtestkey, cVar.field_abtestkey) && C46238a.m51546a(this.field_value, cVar.field_value) && C46238a.m51546a(this.field_expId, cVar.field_expId) && C46238a.m51546a(Long.valueOf(this.field_sequence), Long.valueOf(cVar.field_sequence)) && C46238a.m51546a(Integer.valueOf(this.field_prioritylevel), Integer.valueOf(cVar.field_prioritylevel)) && C46238a.m51546a(Long.valueOf(this.field_startTime), Long.valueOf(cVar.field_startTime)) && C46238a.m51546a(Long.valueOf(this.field_endTime), Long.valueOf(cVar.field_endTime)) && C46238a.m51546a(Boolean.valueOf(this.field_noReport), Boolean.valueOf(cVar.field_noReport));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101846q == hashCode) {
                    try {
                        this.field_abtestkey = cursor.getString(i);
                        this.f101856d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101847r == hashCode) {
                    try {
                        this.field_value = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101848s == hashCode) {
                    try {
                        this.field_expId = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101849t == hashCode) {
                    try {
                        this.field_sequence = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101850u == hashCode) {
                    try {
                        this.field_prioritylevel = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101851v == hashCode) {
                    try {
                        this.field_startTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101852w == hashCode) {
                    try {
                        this.field_endTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101853x == hashCode) {
                    try {
                        this.field_noReport = cursor.getInt(i) != 0;
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101854y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101856d) {
            contentValues.put("abtestkey", this.field_abtestkey);
        }
        if (this.f101857e) {
            contentValues.put("value", this.field_value);
        }
        if (this.f101858f) {
            contentValues.put("expId", this.field_expId);
        }
        if (this.f101859g) {
            contentValues.put("sequence", Long.valueOf(this.field_sequence));
        }
        if (this.f101860h) {
            contentValues.put("prioritylevel", Integer.valueOf(this.field_prioritylevel));
        }
        if (this.f101861i) {
            contentValues.put("startTime", Long.valueOf(this.field_startTime));
        }
        if (this.f101862j) {
            contentValues.put("endTime", Long.valueOf(this.field_endTime));
        }
        if (this.f101863n) {
            if (this.field_noReport) {
                contentValues.put("noReport", 1);
            } else {
                contentValues.put("noReport", 0);
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseABTestInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ABTestInfo ( " + f101855z.sql + ");");
        for (String add : f101845p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseABTestInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ABTestInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101855z, "ABTestInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseABTestInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ABTestInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseABTestInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101855z;
    }

    public String[] getIndexCreateSQL() {
        return f101845p;
    }

    public StorageObserverOwner<C38536c> getObserverOwner() {
        return f101843A;
    }

    public Object getPrimaryKeyValue() {
        return this.field_abtestkey;
    }

    public SingleTable getTable() {
        return f101844o;
    }

    public String getTableName() {
        return f101844o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("abtestkey")) {
            this.field_abtestkey = contentValues.getAsString("abtestkey");
            if (z) {
                this.f101856d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsString("value");
            if (z) {
                this.f101857e = true;
            }
        }
        if (contentValues.containsKey("expId")) {
            this.field_expId = contentValues.getAsString("expId");
            if (z) {
                this.f101858f = true;
            }
        }
        if (contentValues.containsKey("sequence")) {
            this.field_sequence = contentValues.getAsLong("sequence").longValue();
            if (z) {
                this.f101859g = true;
            }
        }
        if (contentValues.containsKey("prioritylevel")) {
            this.field_prioritylevel = contentValues.getAsInteger("prioritylevel").intValue();
            if (z) {
                this.f101860h = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z) {
                this.f101861i = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z) {
                this.f101862j = true;
            }
        }
        if (contentValues.containsKey("noReport")) {
            this.field_noReport = contentValues.getAsInteger("noReport").intValue() != 0;
            if (z) {
                this.f101863n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
