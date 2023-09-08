package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.executor.InsertExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.C49230e40;

/* renamed from: xh.u5 */
public class C66275u5 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f190672A = 778276635;

    /* renamed from: B */
    public static final int f190673B = -2028516794;

    /* renamed from: C */
    public static final int f190674C = 1957063737;

    /* renamed from: D */
    public static final int f190675D = -2074899386;

    /* renamed from: E */
    public static final int f190676E = 108705909;

    /* renamed from: F */
    public static final IAutoDBItem.MAutoDBInfo f190677F = initAutoDBInfo(C66275u5.class);

    /* renamed from: G */
    public static final StorageObserverOwner<C66275u5> f190678G = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f190679p;

    /* renamed from: q */
    public static final Column f190680q;

    /* renamed from: r */
    public static final Column f190681r;

    /* renamed from: s */
    public static final Column f190682s;

    /* renamed from: t */
    public static final Column f190683t;

    /* renamed from: u */
    public static final String[] f190684u;

    /* renamed from: v */
    public static final int f190685v = 3355;

    /* renamed from: w */
    public static final int f190686w = 3237038;

    /* renamed from: x */
    public static final int f190687x = 55126294;

    /* renamed from: y */
    public static final int f190688y = -1868103470;

    /* renamed from: z */
    public static final int f190689z = -995874628;

    /* renamed from: d */
    public boolean f190690d = false;

    /* renamed from: e */
    public boolean f190691e = false;

    /* renamed from: f */
    public boolean f190692f = false;
    private byte[] field_byteData;
    private double field_doubleData = 0.0d;
    private String field_id = "";
    private String field_info = "";
    private int field_intData = 0;
    private long field_longData = 0;
    private C49230e40 field_pbData;
    private short field_shortData = 0;
    private long field_timestamp = 0;

    /* renamed from: g */
    public boolean f190693g = false;

    /* renamed from: h */
    public boolean f190694h = false;

    /* renamed from: i */
    public boolean f190695i = false;

    /* renamed from: j */
    public boolean f190696j = false;

    /* renamed from: n */
    public boolean f190697n = false;

    /* renamed from: o */
    public boolean f190698o = false;

    static {
        SingleTable singleTable = new SingleTable("LiveDemoDBInfo");
        f190679p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        Column column = new Column("id", "string", singleTable.getName(), "");
        f190680q = column;
        Column column2 = new Column("info", "string", singleTable.getName(), "");
        Column column3 = new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
        f190681r = column3;
        new Column("byteData", "byte[]", singleTable.getName(), "");
        new Column("pbData", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.DemoProto");
        new Column("doubleData", "double", singleTable.getName(), "");
        new Column("shortData", "short", singleTable.getName(), "");
        f190682s = new Column("intData", "int", singleTable.getName(), "");
        f190683t = new Column("longData", "long", singleTable.getName(), "");
        f190684u = new String[]{"CREATE INDEX IF NOT EXISTS TimestampIndex ON LiveDemoDBInfo(timestamp)", singleTable.index("IdInfoTimestamp").mo81862on(column, column2, column3).build().toSql()};
    }

    public static void createTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLiveDemoDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LiveDemoDBInfo ( " + f190677F.sql + ");");
        for (String add : f190684u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLiveDemoDBInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LiveDemoDBInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f190677F, "LiveDemoDBInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLiveDemoDBInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LiveDemoDBInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLiveDemoDBInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "id";
        mAutoDBInfo.colsMap.put("id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "id";
        mAutoDBInfo.columns[1] = "info";
        mAutoDBInfo.colsMap.put("info", "TEXT default '' ");
        mAutoDBInfo.columns[2] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG default '0' ");
        mAutoDBInfo.columns[3] = "byteData";
        mAutoDBInfo.colsMap.put("byteData", "BLOB");
        mAutoDBInfo.columns[4] = "pbData";
        mAutoDBInfo.colsMap.put("pbData", "BLOB");
        mAutoDBInfo.columns[5] = "doubleData";
        mAutoDBInfo.colsMap.put("doubleData", "DOUBLE default '0' ");
        mAutoDBInfo.columns[6] = "shortData";
        mAutoDBInfo.colsMap.put("shortData", "SHORT default '0' ");
        mAutoDBInfo.columns[7] = "intData";
        mAutoDBInfo.colsMap.put("intData", "INTEGER default '0' ");
        mAutoDBInfo.columns[8] = "longData";
        mAutoDBInfo.colsMap.put("longData", "LONG default '0' ");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " id TEXT PRIMARY KEY ,  info TEXT default '' ,  timestamp LONG default '0' ,  byteData BLOB,  pbData BLOB,  doubleData DOUBLE default '0' ,  shortData SHORT default '0' ,  intData INTEGER default '0' ,  longData LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    /* renamed from: n2 */
    public static final InsertExecutor m78194n2(C66275u5 u5Var, boolean z) {
        if (!z) {
            return new InsertExecutor(u5Var, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseLiveDemoDBInfo");
        }
        u5Var.getClass();
        StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getINSERT(), String.valueOf(u5Var.field_id), "MicroMsg.SDK.BaseLiveDemoDBInfo");
        storageObserverEvent.setObj(u5Var);
        return new InsertExecutor(u5Var, true, storageObserverEvent, f190678G, "MicroMsg.SDK.BaseLiveDemoDBInfo");
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66275u5)) {
            return false;
        }
        C66275u5 u5Var = (C66275u5) iAutoDBItem;
        return C46238a.m51546a(this.field_id, u5Var.field_id) && C46238a.m51546a(this.field_info, u5Var.field_info) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(u5Var.field_timestamp)) && C46238a.m51546a(this.field_byteData, u5Var.field_byteData) && C46238a.m51546a(this.field_pbData, u5Var.field_pbData) && C46238a.m51546a(Double.valueOf(this.field_doubleData), Double.valueOf(u5Var.field_doubleData)) && C46238a.m51546a(Short.valueOf(this.field_shortData), Short.valueOf(u5Var.field_shortData)) && C46238a.m51546a(Integer.valueOf(this.field_intData), Integer.valueOf(u5Var.field_intData)) && C46238a.m51546a(Long.valueOf(this.field_longData), Long.valueOf(u5Var.field_longData));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f190685v == hashCode) {
                    try {
                        this.field_id = cursor.getString(i);
                        this.f190690d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190686w == hashCode) {
                    try {
                        this.field_info = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190687x == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190688y == hashCode) {
                    try {
                        this.field_byteData = cursor.getBlob(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190689z == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_pbData = (C49230e40) new C49230e40().parseFrom(blob);
                        }
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190672A == hashCode) {
                    try {
                        this.field_doubleData = cursor.getDouble(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190673B == hashCode) {
                    try {
                        this.field_shortData = cursor.getShort(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190674C == hashCode) {
                    try {
                        this.field_intData = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190675D == hashCode) {
                    try {
                        this.field_longData = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190676E == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C49230e40 e402;
        ContentValues contentValues = new ContentValues();
        if (this.f190690d) {
            contentValues.put("id", this.field_id);
        }
        if (this.field_info == null) {
            this.field_info = "";
        }
        if (this.f190691e) {
            contentValues.put("info", this.field_info);
        }
        if (this.f190692f) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        if (this.f190693g) {
            contentValues.put("byteData", this.field_byteData);
        }
        if (this.f190694h && (e402 = this.field_pbData) != null) {
            try {
                contentValues.put("pbData", e402.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseLiveDemoDBInfo", e.getMessage());
            }
        }
        if (this.f190695i) {
            contentValues.put("doubleData", Double.valueOf(this.field_doubleData));
        }
        if (this.f190696j) {
            contentValues.put("shortData", Short.valueOf(this.field_shortData));
        }
        if (this.f190697n) {
            contentValues.put("intData", Integer.valueOf(this.field_intData));
        }
        if (this.f190698o) {
            contentValues.put("longData", Long.valueOf(this.field_longData));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        createTable(iSQLiteDatabase);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190677F;
    }

    public String[] getIndexCreateSQL() {
        return f190684u;
    }

    public StorageObserverOwner<C66275u5> getObserverOwner() {
        return f190678G;
    }

    public Object getPrimaryKeyValue() {
        return this.field_id;
    }

    public SingleTable getTable() {
        return f190679p;
    }

    public String getTableName() {
        return f190679p.getName();
    }

    public long getTimestamp() {
        return this.field_timestamp;
    }

    /* renamed from: l2 */
    public String mo90394l2() {
        return this.field_id;
    }

    /* renamed from: m2 */
    public String mo90395m2() {
        return this.field_info;
    }

    /* renamed from: o2 */
    public void mo90396o2(double d) {
        this.field_doubleData = d;
        this.f190695i = true;
    }

    /* renamed from: p2 */
    public void mo90397p2(String str) {
        this.field_id = str;
        this.f190690d = true;
    }

    /* renamed from: q2 */
    public void mo90398q2(String str) {
        this.field_info = str;
        this.f190691e = true;
    }

    /* renamed from: r2 */
    public void mo90399r2(int i) {
        this.field_intData = i;
        this.f190697n = true;
    }

    /* renamed from: s2 */
    public void mo90400s2(long j) {
        this.field_longData = j;
        this.f190698o = true;
    }

    /* renamed from: t2 */
    public void mo90401t2(short s) {
        this.field_shortData = s;
        this.f190696j = true;
    }

    /* renamed from: u2 */
    public void mo90402u2(long j) {
        this.field_timestamp = j;
        this.f190692f = true;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsString("id");
            if (z) {
                this.f190690d = true;
            }
        }
        if (contentValues.containsKey("info")) {
            this.field_info = contentValues.getAsString("info");
            if (z) {
                this.f190691e = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f190692f = true;
            }
        }
        if (contentValues.containsKey("byteData")) {
            this.field_byteData = contentValues.getAsByteArray("byteData");
            if (z) {
                this.f190693g = true;
            }
        }
        if (contentValues.containsKey("pbData")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("pbData");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_pbData = (C49230e40) new C49230e40().parseFrom(asByteArray);
                    if (z) {
                        this.f190694h = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseLiveDemoDBInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("doubleData")) {
            this.field_doubleData = contentValues.getAsDouble("doubleData").doubleValue();
            if (z) {
                this.f190695i = true;
            }
        }
        if (contentValues.containsKey("shortData")) {
            this.field_shortData = contentValues.getAsShort("shortData").shortValue();
            if (z) {
                this.f190696j = true;
            }
        }
        if (contentValues.containsKey("intData")) {
            this.field_intData = contentValues.getAsInteger("intData").intValue();
            if (z) {
                this.f190697n = true;
            }
        }
        if (contentValues.containsKey("longData")) {
            this.field_longData = contentValues.getAsLong("longData").longValue();
            if (z) {
                this.f190698o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
