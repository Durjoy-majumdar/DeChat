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

/* renamed from: xh.p8 */
public class C78822p8 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f231277A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f231278B = initAutoDBInfo(C78822p8.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C78822p8> f231279C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f231280p;

    /* renamed from: q */
    public static final String[] f231281q = new String[0];

    /* renamed from: r */
    public static final int f231282r = 109595795;

    /* renamed from: s */
    public static final int f231283s = 106164915;

    /* renamed from: t */
    public static final int f231284t = -1422950858;

    /* renamed from: u */
    public static final int f231285u = -730552025;

    /* renamed from: v */
    public static final int f231286v = 985252545;

    /* renamed from: w */
    public static final int f231287w = 3575610;

    /* renamed from: x */
    public static final int f231288x = 3053931;

    /* renamed from: y */
    public static final int f231289y = -499948310;

    /* renamed from: z */
    public static final int f231290z = 55126294;

    /* renamed from: d */
    public boolean f231291d = true;

    /* renamed from: e */
    public boolean f231292e = true;

    /* renamed from: f */
    public boolean f231293f = true;
    public int field_action;
    public String field_city;
    public int field_dayOfWeek;
    public int field_hourOfDay;
    public String field_owner;
    public String field_snsid;
    public long field_timestamp;
    public int field_type;
    public int field_weishang;

    /* renamed from: g */
    public boolean f231294g = true;

    /* renamed from: h */
    public boolean f231295h = true;

    /* renamed from: i */
    public boolean f231296i = true;

    /* renamed from: j */
    public boolean f231297j = true;

    /* renamed from: n */
    public boolean f231298n = true;

    /* renamed from: o */
    public boolean f231299o = true;

    static {
        SingleTable singleTable = new SingleTable("SnsFeature");
        f231280p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("snsid", "string", singleTable.getName(), "");
        new Column("owner", "string", singleTable.getName(), "");
        new Column("action", "int", singleTable.getName(), "");
        new Column("dayOfWeek", "int", singleTable.getName(), "");
        new Column("hourOfDay", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("city", "string", singleTable.getName(), "");
        new Column("weishang", "int", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "snsid";
        mAutoDBInfo.colsMap.put("snsid", "TEXT");
        mAutoDBInfo.columns[1] = "owner";
        mAutoDBInfo.colsMap.put("owner", "TEXT");
        mAutoDBInfo.columns[2] = "action";
        mAutoDBInfo.colsMap.put("action", "INTEGER");
        mAutoDBInfo.columns[3] = "dayOfWeek";
        mAutoDBInfo.colsMap.put("dayOfWeek", "INTEGER");
        mAutoDBInfo.columns[4] = "hourOfDay";
        mAutoDBInfo.colsMap.put("hourOfDay", "INTEGER");
        mAutoDBInfo.columns[5] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[6] = "city";
        mAutoDBInfo.colsMap.put("city", "TEXT");
        mAutoDBInfo.columns[7] = "weishang";
        mAutoDBInfo.colsMap.put("weishang", "INTEGER");
        mAutoDBInfo.columns[8] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " snsid TEXT,  owner TEXT,  action INTEGER,  dayOfWeek INTEGER,  hourOfDay INTEGER,  type INTEGER,  city TEXT,  weishang INTEGER,  timestamp LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78822p8)) {
            return false;
        }
        C78822p8 p8Var = (C78822p8) iAutoDBItem;
        return C46238a.m51546a(this.field_snsid, p8Var.field_snsid) && C46238a.m51546a(this.field_owner, p8Var.field_owner) && C46238a.m51546a(Integer.valueOf(this.field_action), Integer.valueOf(p8Var.field_action)) && C46238a.m51546a(Integer.valueOf(this.field_dayOfWeek), Integer.valueOf(p8Var.field_dayOfWeek)) && C46238a.m51546a(Integer.valueOf(this.field_hourOfDay), Integer.valueOf(p8Var.field_hourOfDay)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(p8Var.field_type)) && C46238a.m51546a(this.field_city, p8Var.field_city) && C46238a.m51546a(Integer.valueOf(this.field_weishang), Integer.valueOf(p8Var.field_weishang)) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(p8Var.field_timestamp));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231282r == hashCode) {
                    try {
                        this.field_snsid = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231283s == hashCode) {
                    try {
                        this.field_owner = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231284t == hashCode) {
                    try {
                        this.field_action = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231285u == hashCode) {
                    try {
                        this.field_dayOfWeek = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231286v == hashCode) {
                    try {
                        this.field_hourOfDay = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231287w == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231288x == hashCode) {
                    try {
                        this.field_city = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231289y == hashCode) {
                    try {
                        this.field_weishang = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231290z == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231277A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231291d) {
            contentValues.put("snsid", this.field_snsid);
        }
        if (this.f231292e) {
            contentValues.put("owner", this.field_owner);
        }
        if (this.f231293f) {
            contentValues.put("action", Integer.valueOf(this.field_action));
        }
        if (this.f231294g) {
            contentValues.put("dayOfWeek", Integer.valueOf(this.field_dayOfWeek));
        }
        if (this.f231295h) {
            contentValues.put("hourOfDay", Integer.valueOf(this.field_hourOfDay));
        }
        if (this.f231296i) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f231297j) {
            contentValues.put("city", this.field_city);
        }
        if (this.f231298n) {
            contentValues.put("weishang", Integer.valueOf(this.field_weishang));
        }
        if (this.f231299o) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSnsFeature", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SnsFeature ( " + f231278B.sql + ");");
        for (String add : f231281q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSnsFeature", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SnsFeature", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231278B, "SnsFeature", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSnsFeature", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SnsFeature", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSnsFeature", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231278B;
    }

    public String[] getIndexCreateSQL() {
        return f231281q;
    }

    public StorageObserverOwner<C78822p8> getObserverOwner() {
        return f231279C;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f231280p;
    }

    public String getTableName() {
        return f231280p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("snsid")) {
            this.field_snsid = contentValues.getAsString("snsid");
            if (z) {
                this.f231291d = true;
            }
        }
        if (contentValues.containsKey("owner")) {
            this.field_owner = contentValues.getAsString("owner");
            if (z) {
                this.f231292e = true;
            }
        }
        if (contentValues.containsKey("action")) {
            this.field_action = contentValues.getAsInteger("action").intValue();
            if (z) {
                this.f231293f = true;
            }
        }
        if (contentValues.containsKey("dayOfWeek")) {
            this.field_dayOfWeek = contentValues.getAsInteger("dayOfWeek").intValue();
            if (z) {
                this.f231294g = true;
            }
        }
        if (contentValues.containsKey("hourOfDay")) {
            this.field_hourOfDay = contentValues.getAsInteger("hourOfDay").intValue();
            if (z) {
                this.f231295h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f231296i = true;
            }
        }
        if (contentValues.containsKey("city")) {
            this.field_city = contentValues.getAsString("city");
            if (z) {
                this.f231297j = true;
            }
        }
        if (contentValues.containsKey("weishang")) {
            this.field_weishang = contentValues.getAsInteger("weishang").intValue();
            if (z) {
                this.f231298n = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f231299o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
