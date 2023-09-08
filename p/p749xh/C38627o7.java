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

/* renamed from: xh.o7 */
public class C38627o7 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f103233n;

    /* renamed from: o */
    public static final String[] f103234o = {"CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestAppIDIndex ON PredownloadBlockCgiRequest(appId)", "CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestStartTimeIndex ON PredownloadBlockCgiRequest(startTime)", "CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestEndTimeIndex ON PredownloadBlockCgiRequest(endTime)"};

    /* renamed from: p */
    public static final int f103235p = -265713450;

    /* renamed from: q */
    public static final int f103236q = 93028124;

    /* renamed from: r */
    public static final int f103237r = -2129294769;

    /* renamed from: s */
    public static final int f103238s = -1607243192;

    /* renamed from: t */
    public static final int f103239t = 1729107786;

    /* renamed from: u */
    public static final int f103240u = 716692163;

    /* renamed from: v */
    public static final int f103241v = -427040401;

    /* renamed from: w */
    public static final int f103242w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f103243x = initAutoDBInfo(C38627o7.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38627o7> f103244y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103245d = true;

    /* renamed from: e */
    public boolean f103246e = true;

    /* renamed from: f */
    public boolean f103247f = true;
    public String field_appId;
    public String field_cgiList;
    public long field_endTime;
    public int field_reportId;
    public String field_sceneList;
    public long field_startTime;
    public String field_username;

    /* renamed from: g */
    public boolean f103248g = true;

    /* renamed from: h */
    public boolean f103249h = true;

    /* renamed from: i */
    public boolean f103250i = true;

    /* renamed from: j */
    public boolean f103251j = true;

    static {
        SingleTable singleTable = new SingleTable("PredownloadBlockCgiRequest");
        f103233n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("startTime", "long", singleTable.getName(), "");
        new Column("endTime", "long", singleTable.getName(), "");
        new Column("sceneList", "string", singleTable.getName(), "");
        new Column("cgiList", "string", singleTable.getName(), "");
        new Column("reportId", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[2] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "LONG");
        mAutoDBInfo.columns[3] = "endTime";
        mAutoDBInfo.colsMap.put("endTime", "LONG");
        mAutoDBInfo.columns[4] = "sceneList";
        mAutoDBInfo.colsMap.put("sceneList", "TEXT");
        mAutoDBInfo.columns[5] = "cgiList";
        mAutoDBInfo.colsMap.put("cgiList", "TEXT");
        mAutoDBInfo.columns[6] = "reportId";
        mAutoDBInfo.colsMap.put("reportId", "INTEGER");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " username TEXT PRIMARY KEY ,  appId TEXT,  startTime LONG,  endTime LONG,  sceneList TEXT,  cgiList TEXT,  reportId INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38627o7)) {
            return false;
        }
        C38627o7 o7Var = (C38627o7) iAutoDBItem;
        return C46238a.m51546a(this.field_username, o7Var.field_username) && C46238a.m51546a(this.field_appId, o7Var.field_appId) && C46238a.m51546a(Long.valueOf(this.field_startTime), Long.valueOf(o7Var.field_startTime)) && C46238a.m51546a(Long.valueOf(this.field_endTime), Long.valueOf(o7Var.field_endTime)) && C46238a.m51546a(this.field_sceneList, o7Var.field_sceneList) && C46238a.m51546a(this.field_cgiList, o7Var.field_cgiList) && C46238a.m51546a(Integer.valueOf(this.field_reportId), Integer.valueOf(o7Var.field_reportId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103235p == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f103245d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103236q == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103237r == hashCode) {
                    try {
                        this.field_startTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103238s == hashCode) {
                    try {
                        this.field_endTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103239t == hashCode) {
                    try {
                        this.field_sceneList = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103240u == hashCode) {
                    try {
                        this.field_cgiList = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103241v == hashCode) {
                    try {
                        this.field_reportId = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103242w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103245d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f103246e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103247f) {
            contentValues.put("startTime", Long.valueOf(this.field_startTime));
        }
        if (this.f103248g) {
            contentValues.put("endTime", Long.valueOf(this.field_endTime));
        }
        if (this.f103249h) {
            contentValues.put("sceneList", this.field_sceneList);
        }
        if (this.f103250i) {
            contentValues.put("cgiList", this.field_cgiList);
        }
        if (this.f103251j) {
            contentValues.put("reportId", Integer.valueOf(this.field_reportId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PredownloadBlockCgiRequest ( " + f103243x.sql + ");");
        for (String add : f103234o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PredownloadBlockCgiRequest", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103243x, "PredownloadBlockCgiRequest", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PredownloadBlockCgiRequest", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103243x;
    }

    public String[] getIndexCreateSQL() {
        return f103234o;
    }

    public StorageObserverOwner<C38627o7> getObserverOwner() {
        return f103244y;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f103233n;
    }

    public String getTableName() {
        return f103233n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f103245d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103246e = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z) {
                this.f103247f = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z) {
                this.f103248g = true;
            }
        }
        if (contentValues.containsKey("sceneList")) {
            this.field_sceneList = contentValues.getAsString("sceneList");
            if (z) {
                this.f103249h = true;
            }
        }
        if (contentValues.containsKey("cgiList")) {
            this.field_cgiList = contentValues.getAsString("cgiList");
            if (z) {
                this.f103250i = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z) {
                this.f103251j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
