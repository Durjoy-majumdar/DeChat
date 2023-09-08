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

/* renamed from: xh.aa */
public class C38525aa extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C38525aa> f101680A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f101681o;

    /* renamed from: p */
    public static final String[] f101682p = new String[0];

    /* renamed from: q */
    public static final int f101683q = 3215;

    /* renamed from: r */
    public static final int f101684r = 3208676;

    /* renamed from: s */
    public static final int f101685s = -425815264;

    /* renamed from: t */
    public static final int f101686t = 1548376068;

    /* renamed from: u */
    public static final int f101687u = -958142429;

    /* renamed from: v */
    public static final int f101688v = -1591952738;

    /* renamed from: w */
    public static final int f101689w = -948579243;

    /* renamed from: x */
    public static final int f101690x = -892477985;

    /* renamed from: y */
    public static final int f101691y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f101692z = initAutoDBInfo(C38525aa.class);

    /* renamed from: d */
    public boolean f101693d = true;

    /* renamed from: e */
    public boolean f101694e = true;

    /* renamed from: f */
    public boolean f101695f = true;
    public String field_currSession;
    public int field_ds;
    public long field_enterMs;
    public int field_hour;
    public String field_lastSession;
    public String field_nextSession;
    public long field_quitMs;
    public long field_stayMs;

    /* renamed from: g */
    public boolean f101696g = true;

    /* renamed from: h */
    public boolean f101697h = true;

    /* renamed from: i */
    public boolean f101698i = true;

    /* renamed from: j */
    public boolean f101699j = true;

    /* renamed from: n */
    public boolean f101700n = true;

    static {
        SingleTable singleTable = new SingleTable("WechatSessionHistory");
        f101681o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("ds", "int", singleTable.getName(), "");
        new Column("hour", "int", singleTable.getName(), "");
        new Column("lastSession", "string", singleTable.getName(), "");
        new Column("currSession", "string", singleTable.getName(), "");
        new Column("nextSession", "string", singleTable.getName(), "");
        new Column("enterMs", "long", singleTable.getName(), "");
        new Column("quitMs", "long", singleTable.getName(), "");
        new Column("stayMs", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "ds";
        mAutoDBInfo.colsMap.put("ds", "INTEGER");
        mAutoDBInfo.columns[1] = "hour";
        mAutoDBInfo.colsMap.put("hour", "INTEGER");
        mAutoDBInfo.columns[2] = "lastSession";
        mAutoDBInfo.colsMap.put("lastSession", "TEXT");
        mAutoDBInfo.columns[3] = "currSession";
        mAutoDBInfo.colsMap.put("currSession", "TEXT");
        mAutoDBInfo.columns[4] = "nextSession";
        mAutoDBInfo.colsMap.put("nextSession", "TEXT");
        mAutoDBInfo.columns[5] = "enterMs";
        mAutoDBInfo.colsMap.put("enterMs", "LONG");
        mAutoDBInfo.columns[6] = "quitMs";
        mAutoDBInfo.colsMap.put("quitMs", "LONG");
        mAutoDBInfo.columns[7] = "stayMs";
        mAutoDBInfo.colsMap.put("stayMs", "LONG");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " ds INTEGER,  hour INTEGER,  lastSession TEXT,  currSession TEXT,  nextSession TEXT,  enterMs LONG,  quitMs LONG,  stayMs LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38525aa)) {
            return false;
        }
        C38525aa aaVar = (C38525aa) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_ds), Integer.valueOf(aaVar.field_ds)) && C46238a.m51546a(Integer.valueOf(this.field_hour), Integer.valueOf(aaVar.field_hour)) && C46238a.m51546a(this.field_lastSession, aaVar.field_lastSession) && C46238a.m51546a(this.field_currSession, aaVar.field_currSession) && C46238a.m51546a(this.field_nextSession, aaVar.field_nextSession) && C46238a.m51546a(Long.valueOf(this.field_enterMs), Long.valueOf(aaVar.field_enterMs)) && C46238a.m51546a(Long.valueOf(this.field_quitMs), Long.valueOf(aaVar.field_quitMs)) && C46238a.m51546a(Long.valueOf(this.field_stayMs), Long.valueOf(aaVar.field_stayMs));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101683q == hashCode) {
                    try {
                        this.field_ds = cursor.getInt(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatSessionHistory", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101684r == hashCode) {
                    try {
                        this.field_hour = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatSessionHistory", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101685s == hashCode) {
                    try {
                        this.field_lastSession = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatSessionHistory", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101686t == hashCode) {
                    try {
                        this.field_currSession = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatSessionHistory", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101687u == hashCode) {
                    try {
                        this.field_nextSession = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatSessionHistory", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101688v == hashCode) {
                    try {
                        this.field_enterMs = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatSessionHistory", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101689w == hashCode) {
                    try {
                        this.field_quitMs = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatSessionHistory", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101690x == hashCode) {
                    try {
                        this.field_stayMs = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatSessionHistory", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101691y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101693d) {
            contentValues.put("ds", Integer.valueOf(this.field_ds));
        }
        if (this.f101694e) {
            contentValues.put("hour", Integer.valueOf(this.field_hour));
        }
        if (this.f101695f) {
            contentValues.put("lastSession", this.field_lastSession);
        }
        if (this.f101696g) {
            contentValues.put("currSession", this.field_currSession);
        }
        if (this.f101697h) {
            contentValues.put("nextSession", this.field_nextSession);
        }
        if (this.f101698i) {
            contentValues.put("enterMs", Long.valueOf(this.field_enterMs));
        }
        if (this.f101699j) {
            contentValues.put("quitMs", Long.valueOf(this.field_quitMs));
        }
        if (this.f101700n) {
            contentValues.put("stayMs", Long.valueOf(this.field_stayMs));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWechatSessionHistory", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WechatSessionHistory ( " + f101692z.sql + ");");
        for (String add : f101682p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWechatSessionHistory", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WechatSessionHistory", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101692z, "WechatSessionHistory", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWechatSessionHistory", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WechatSessionHistory", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWechatSessionHistory", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101692z;
    }

    public String[] getIndexCreateSQL() {
        return f101682p;
    }

    public StorageObserverOwner<C38525aa> getObserverOwner() {
        return f101680A;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101681o;
    }

    public String getTableName() {
        return f101681o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("ds")) {
            this.field_ds = contentValues.getAsInteger("ds").intValue();
            if (z) {
                this.f101693d = true;
            }
        }
        if (contentValues.containsKey("hour")) {
            this.field_hour = contentValues.getAsInteger("hour").intValue();
            if (z) {
                this.f101694e = true;
            }
        }
        if (contentValues.containsKey("lastSession")) {
            this.field_lastSession = contentValues.getAsString("lastSession");
            if (z) {
                this.f101695f = true;
            }
        }
        if (contentValues.containsKey("currSession")) {
            this.field_currSession = contentValues.getAsString("currSession");
            if (z) {
                this.f101696g = true;
            }
        }
        if (contentValues.containsKey("nextSession")) {
            this.field_nextSession = contentValues.getAsString("nextSession");
            if (z) {
                this.f101697h = true;
            }
        }
        if (contentValues.containsKey("enterMs")) {
            this.field_enterMs = contentValues.getAsLong("enterMs").longValue();
            if (z) {
                this.f101698i = true;
            }
        }
        if (contentValues.containsKey("quitMs")) {
            this.field_quitMs = contentValues.getAsLong("quitMs").longValue();
            if (z) {
                this.f101699j = true;
            }
        }
        if (contentValues.containsKey("stayMs")) {
            this.field_stayMs = contentValues.getAsLong("stayMs").longValue();
            if (z) {
                this.f101700n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
