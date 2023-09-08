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

/* renamed from: xh.h1 */
public class C78810h1 extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C78810h1> f230663A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f230664o;

    /* renamed from: p */
    public static final String[] f230665p = new String[0];

    /* renamed from: q */
    public static final int f230666q = -881080743;

    /* renamed from: r */
    public static final int f230667r = 104192092;

    /* renamed from: s */
    public static final int f230668s = -1179549740;

    /* renamed from: t */
    public static final int f230669t = -1422950858;

    /* renamed from: u */
    public static final int f230670u = -730552025;

    /* renamed from: v */
    public static final int f230671v = 985252545;

    /* renamed from: w */
    public static final int f230672w = 3575610;

    /* renamed from: x */
    public static final int f230673x = 55126294;

    /* renamed from: y */
    public static final int f230674y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f230675z = initAutoDBInfo(C78810h1.class);

    /* renamed from: d */
    public boolean f230676d = true;

    /* renamed from: e */
    public boolean f230677e = true;

    /* renamed from: f */
    public boolean f230678f = true;
    public int field_action;
    public int field_dayOfWeek;
    public int field_hourOfDay;
    public int field_isfrom;
    public long field_msgid;
    public String field_talker;
    public long field_timestamp;
    public int field_type;

    /* renamed from: g */
    public boolean f230679g = true;

    /* renamed from: h */
    public boolean f230680h = true;

    /* renamed from: i */
    public boolean f230681i = true;

    /* renamed from: j */
    public boolean f230682j = true;

    /* renamed from: n */
    public boolean f230683n = true;

    static {
        SingleTable singleTable = new SingleTable("ChattingEvent");
        f230664o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("msgid", "long", singleTable.getName(), "");
        new Column("isfrom", "int", singleTable.getName(), "");
        new Column("action", "int", singleTable.getName(), "");
        new Column("dayOfWeek", "int", singleTable.getName(), "");
        new Column("hourOfDay", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT");
        mAutoDBInfo.columns[1] = "msgid";
        mAutoDBInfo.colsMap.put("msgid", "LONG");
        mAutoDBInfo.columns[2] = "isfrom";
        mAutoDBInfo.colsMap.put("isfrom", "INTEGER");
        mAutoDBInfo.columns[3] = "action";
        mAutoDBInfo.colsMap.put("action", "INTEGER");
        mAutoDBInfo.columns[4] = "dayOfWeek";
        mAutoDBInfo.colsMap.put("dayOfWeek", "INTEGER");
        mAutoDBInfo.columns[5] = "hourOfDay";
        mAutoDBInfo.colsMap.put("hourOfDay", "INTEGER");
        mAutoDBInfo.columns[6] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[7] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " talker TEXT,  msgid LONG,  isfrom INTEGER,  action INTEGER,  dayOfWeek INTEGER,  hourOfDay INTEGER,  type INTEGER,  timestamp LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78810h1)) {
            return false;
        }
        C78810h1 h1Var = (C78810h1) iAutoDBItem;
        return C46238a.m51546a(this.field_talker, h1Var.field_talker) && C46238a.m51546a(Long.valueOf(this.field_msgid), Long.valueOf(h1Var.field_msgid)) && C46238a.m51546a(Integer.valueOf(this.field_isfrom), Integer.valueOf(h1Var.field_isfrom)) && C46238a.m51546a(Integer.valueOf(this.field_action), Integer.valueOf(h1Var.field_action)) && C46238a.m51546a(Integer.valueOf(this.field_dayOfWeek), Integer.valueOf(h1Var.field_dayOfWeek)) && C46238a.m51546a(Integer.valueOf(this.field_hourOfDay), Integer.valueOf(h1Var.field_hourOfDay)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(h1Var.field_type)) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(h1Var.field_timestamp));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230666q == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230667r == hashCode) {
                    try {
                        this.field_msgid = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230668s == hashCode) {
                    try {
                        this.field_isfrom = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230669t == hashCode) {
                    try {
                        this.field_action = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230670u == hashCode) {
                    try {
                        this.field_dayOfWeek = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230671v == hashCode) {
                    try {
                        this.field_hourOfDay = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230672w == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230673x == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230674y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f230676d) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f230677e) {
            contentValues.put("msgid", Long.valueOf(this.field_msgid));
        }
        if (this.f230678f) {
            contentValues.put("isfrom", Integer.valueOf(this.field_isfrom));
        }
        if (this.f230679g) {
            contentValues.put("action", Integer.valueOf(this.field_action));
        }
        if (this.f230680h) {
            contentValues.put("dayOfWeek", Integer.valueOf(this.field_dayOfWeek));
        }
        if (this.f230681i) {
            contentValues.put("hourOfDay", Integer.valueOf(this.field_hourOfDay));
        }
        if (this.f230682j) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f230683n) {
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
            Log.m105920e("MicroMsg.SDK.BaseChattingEvent", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ChattingEvent ( " + f230675z.sql + ");");
        for (String add : f230665p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseChattingEvent", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ChattingEvent", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f230675z, "ChattingEvent", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseChattingEvent", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ChattingEvent", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseChattingEvent", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230675z;
    }

    public String[] getIndexCreateSQL() {
        return f230665p;
    }

    public StorageObserverOwner<C78810h1> getObserverOwner() {
        return f230663A;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f230664o;
    }

    public String getTableName() {
        return f230664o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f230676d = true;
            }
        }
        if (contentValues.containsKey("msgid")) {
            this.field_msgid = contentValues.getAsLong("msgid").longValue();
            if (z) {
                this.f230677e = true;
            }
        }
        if (contentValues.containsKey("isfrom")) {
            this.field_isfrom = contentValues.getAsInteger("isfrom").intValue();
            if (z) {
                this.f230678f = true;
            }
        }
        if (contentValues.containsKey("action")) {
            this.field_action = contentValues.getAsInteger("action").intValue();
            if (z) {
                this.f230679g = true;
            }
        }
        if (contentValues.containsKey("dayOfWeek")) {
            this.field_dayOfWeek = contentValues.getAsInteger("dayOfWeek").intValue();
            if (z) {
                this.f230680h = true;
            }
        }
        if (contentValues.containsKey("hourOfDay")) {
            this.field_hourOfDay = contentValues.getAsInteger("hourOfDay").intValue();
            if (z) {
                this.f230681i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f230682j = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f230683n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
