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

/* renamed from: xh.j */
public class C38584j extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f102577n;

    /* renamed from: o */
    public static final String[] f102578o = {"CREATE INDEX IF NOT EXISTS TimestampIndex ON AdvertisePushDBInfo(timestamp)", "CREATE INDEX IF NOT EXISTS AdvertisePushDBInfoSlotId ON AdvertisePushDBInfo(message_slotid)"};

    /* renamed from: p */
    public static final int f102579p = 3355;

    /* renamed from: q */
    public static final int f102580q = 55126294;

    /* renamed from: r */
    public static final int f102581r = -1269047925;

    /* renamed from: s */
    public static final int f102582s = -872788732;

    /* renamed from: t */
    public static final int f102583t = 1001432785;

    /* renamed from: u */
    public static final int f102584u = 1824338483;

    /* renamed from: v */
    public static final int f102585v = 2025484520;

    /* renamed from: w */
    public static final int f102586w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f102587x = initAutoDBInfo(C38584j.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38584j> f102588y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102589d = false;

    /* renamed from: e */
    public boolean f102590e = false;

    /* renamed from: f */
    public boolean f102591f = false;
    private String field_id;
    private long field_message_aid;
    private long field_message_op_time;
    private long field_message_slotid;
    private String field_message_traceid;
    private int field_op_code;
    private long field_timestamp;

    /* renamed from: g */
    public boolean f102592g = false;

    /* renamed from: h */
    public boolean f102593h = false;

    /* renamed from: i */
    public boolean f102594i = false;

    /* renamed from: j */
    public boolean f102595j = false;

    static {
        SingleTable singleTable = new SingleTable("AdvertisePushDBInfo");
        f102577n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("id", "string", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
        new Column("op_code", "int", singleTable.getName(), "");
        new Column("message_aid", "long", singleTable.getName(), "");
        new Column("message_slotid", "long", singleTable.getName(), "");
        new Column("message_op_time", "long", singleTable.getName(), "");
        new Column("message_traceid", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "id";
        mAutoDBInfo.colsMap.put("id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "id";
        mAutoDBInfo.columns[1] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG default '0' ");
        mAutoDBInfo.columns[2] = "op_code";
        mAutoDBInfo.colsMap.put("op_code", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "message_aid";
        mAutoDBInfo.colsMap.put("message_aid", "LONG default '0' ");
        mAutoDBInfo.columns[4] = "message_slotid";
        mAutoDBInfo.colsMap.put("message_slotid", "LONG default '0' ");
        mAutoDBInfo.columns[5] = "message_op_time";
        mAutoDBInfo.colsMap.put("message_op_time", "LONG default '0' ");
        mAutoDBInfo.columns[6] = "message_traceid";
        mAutoDBInfo.colsMap.put("message_traceid", "TEXT default '' ");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " id TEXT PRIMARY KEY ,  timestamp LONG default '0' ,  op_code INTEGER default '0' ,  message_aid LONG default '0' ,  message_slotid LONG default '0' ,  message_op_time LONG default '0' ,  message_traceid TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38584j)) {
            return false;
        }
        C38584j jVar = (C38584j) iAutoDBItem;
        return C46238a.m51546a(this.field_id, jVar.field_id) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(jVar.field_timestamp)) && C46238a.m51546a(Integer.valueOf(this.field_op_code), Integer.valueOf(jVar.field_op_code)) && C46238a.m51546a(Long.valueOf(this.field_message_aid), Long.valueOf(jVar.field_message_aid)) && C46238a.m51546a(Long.valueOf(this.field_message_slotid), Long.valueOf(jVar.field_message_slotid)) && C46238a.m51546a(Long.valueOf(this.field_message_op_time), Long.valueOf(jVar.field_message_op_time)) && C46238a.m51546a(this.field_message_traceid, jVar.field_message_traceid);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102579p == hashCode) {
                    try {
                        this.field_id = cursor.getString(i);
                        this.f102589d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102580q == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102581r == hashCode) {
                    try {
                        this.field_op_code = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102582s == hashCode) {
                    try {
                        this.field_message_aid = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102583t == hashCode) {
                    try {
                        this.field_message_slotid = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102584u == hashCode) {
                    try {
                        this.field_message_op_time = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102585v == hashCode) {
                    try {
                        this.field_message_traceid = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102586w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102589d) {
            contentValues.put("id", this.field_id);
        }
        if (this.f102590e) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        if (this.f102591f) {
            contentValues.put("op_code", Integer.valueOf(this.field_op_code));
        }
        if (this.f102592g) {
            contentValues.put("message_aid", Long.valueOf(this.field_message_aid));
        }
        if (this.f102593h) {
            contentValues.put("message_slotid", Long.valueOf(this.field_message_slotid));
        }
        if (this.f102594i) {
            contentValues.put("message_op_time", Long.valueOf(this.field_message_op_time));
        }
        if (this.field_message_traceid == null) {
            this.field_message_traceid = "";
        }
        if (this.f102595j) {
            contentValues.put("message_traceid", this.field_message_traceid);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAdvertisePushDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AdvertisePushDBInfo ( " + f102587x.sql + ");");
        for (String add : f102578o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAdvertisePushDBInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AdvertisePushDBInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102587x, "AdvertisePushDBInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAdvertisePushDBInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AdvertisePushDBInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAdvertisePushDBInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102587x;
    }

    public String[] getIndexCreateSQL() {
        return f102578o;
    }

    public StorageObserverOwner<C38584j> getObserverOwner() {
        return f102588y;
    }

    public Object getPrimaryKeyValue() {
        return this.field_id;
    }

    public SingleTable getTable() {
        return f102577n;
    }

    public String getTableName() {
        return f102577n.getName();
    }

    public long getTimestamp() {
        return this.field_timestamp;
    }

    /* renamed from: l2 */
    public long mo61714l2() {
        return this.field_message_aid;
    }

    /* renamed from: m2 */
    public long mo61715m2() {
        return this.field_message_op_time;
    }

    /* renamed from: n2 */
    public long mo61716n2() {
        return this.field_message_slotid;
    }

    /* renamed from: o2 */
    public String mo61717o2() {
        return this.field_message_traceid;
    }

    /* renamed from: p2 */
    public int mo61718p2() {
        return this.field_op_code;
    }

    /* renamed from: q2 */
    public void mo61719q2(String str) {
        this.field_id = str;
        this.f102589d = true;
    }

    /* renamed from: r2 */
    public void mo61720r2(long j) {
        this.field_message_aid = j;
        this.f102592g = true;
    }

    /* renamed from: s2 */
    public void mo61721s2(long j) {
        this.field_message_op_time = j;
        this.f102594i = true;
    }

    /* renamed from: t2 */
    public void mo61722t2(long j) {
        this.field_message_slotid = j;
        this.f102593h = true;
    }

    /* renamed from: u2 */
    public void mo61723u2(String str) {
        this.field_message_traceid = str;
        this.f102595j = true;
    }

    /* renamed from: v2 */
    public void mo61724v2(int i) {
        this.field_op_code = i;
        this.f102591f = true;
    }

    /* renamed from: w2 */
    public void mo61725w2(long j) {
        this.field_timestamp = j;
        this.f102590e = true;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsString("id");
            if (z) {
                this.f102589d = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f102590e = true;
            }
        }
        if (contentValues.containsKey("op_code")) {
            this.field_op_code = contentValues.getAsInteger("op_code").intValue();
            if (z) {
                this.f102591f = true;
            }
        }
        if (contentValues.containsKey("message_aid")) {
            this.field_message_aid = contentValues.getAsLong("message_aid").longValue();
            if (z) {
                this.f102592g = true;
            }
        }
        if (contentValues.containsKey("message_slotid")) {
            this.field_message_slotid = contentValues.getAsLong("message_slotid").longValue();
            if (z) {
                this.f102593h = true;
            }
        }
        if (contentValues.containsKey("message_op_time")) {
            this.field_message_op_time = contentValues.getAsLong("message_op_time").longValue();
            if (z) {
                this.f102594i = true;
            }
        }
        if (contentValues.containsKey("message_traceid")) {
            this.field_message_traceid = contentValues.getAsString("message_traceid");
            if (z) {
                this.f102595j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
