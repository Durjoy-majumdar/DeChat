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

/* renamed from: xh.s2 */
public class C102667s2 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f302925A = -1086611576;

    /* renamed from: B */
    public static final int f302926B = -260487426;

    /* renamed from: C */
    public static final int f302927C = 108705909;

    /* renamed from: D */
    public static final IAutoDBItem.MAutoDBInfo f302928D = initAutoDBInfo(C102667s2.class);

    /* renamed from: E */
    public static final StorageObserverOwner<C102667s2> f302929E = new StorageObserverOwner<>();

    /* renamed from: q */
    public static final SingleTable f302930q;

    /* renamed from: r */
    public static final String[] f302931r = new String[0];

    /* renamed from: s */
    public static final int f302932s = 116079;

    /* renamed from: t */
    public static final int f302933t = 3530753;

    /* renamed from: u */
    public static final int f302934u = 3433509;

    /* renamed from: v */
    public static final int f302935v = -442721009;

    /* renamed from: w */
    public static final int f302936w = -709166357;

    /* renamed from: x */
    public static final int f302937x = -1075295096;

    /* renamed from: y */
    public static final int f302938y = -295931082;

    /* renamed from: z */
    public static final int f302939z = -892481550;

    /* renamed from: d */
    public boolean f302940d = true;

    /* renamed from: e */
    public boolean f302941e = true;

    /* renamed from: f */
    public boolean f302942f = true;
    public int field_failNum;
    public long field_favTime;
    public String field_imgDirPath;
    public String field_imgPaths;
    public int field_isReport;
    public String field_path;
    public long field_size;
    public int field_status;
    public long field_updateTime;
    public String field_url;

    /* renamed from: g */
    public boolean f302943g = true;

    /* renamed from: h */
    public boolean f302944h = true;

    /* renamed from: i */
    public boolean f302945i = true;

    /* renamed from: j */
    public boolean f302946j = true;

    /* renamed from: n */
    public boolean f302947n = true;

    /* renamed from: o */
    public boolean f302948o = true;

    /* renamed from: p */
    public boolean f302949p = true;

    static {
        SingleTable singleTable = new SingleTable("FavOffline");
        f302930q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("size", "long", singleTable.getName(), "");
        new Column("path", "string", singleTable.getName(), "");
        new Column("imgDirPath", "string", singleTable.getName(), "");
        new Column("imgPaths", "string", singleTable.getName(), "");
        new Column("favTime", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("failNum", "int", singleTable.getName(), "");
        new Column("isReport", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[10];
        String[] strArr = new String[11];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[1] = "size";
        mAutoDBInfo.colsMap.put("size", "LONG");
        mAutoDBInfo.columns[2] = "path";
        mAutoDBInfo.colsMap.put("path", "TEXT");
        mAutoDBInfo.columns[3] = "imgDirPath";
        mAutoDBInfo.colsMap.put("imgDirPath", "TEXT");
        mAutoDBInfo.columns[4] = "imgPaths";
        mAutoDBInfo.colsMap.put("imgPaths", "TEXT");
        mAutoDBInfo.columns[5] = "favTime";
        mAutoDBInfo.colsMap.put("favTime", "LONG");
        mAutoDBInfo.columns[6] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[7] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[8] = "failNum";
        mAutoDBInfo.colsMap.put("failNum", "INTEGER");
        mAutoDBInfo.columns[9] = "isReport";
        mAutoDBInfo.colsMap.put("isReport", "INTEGER");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " url TEXT,  size LONG,  path TEXT,  imgDirPath TEXT,  imgPaths TEXT,  favTime LONG,  updateTime LONG,  status INTEGER,  failNum INTEGER,  isReport INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102667s2)) {
            return false;
        }
        C102667s2 s2Var = (C102667s2) iAutoDBItem;
        return C46238a.m51546a(this.field_url, s2Var.field_url) && C46238a.m51546a(Long.valueOf(this.field_size), Long.valueOf(s2Var.field_size)) && C46238a.m51546a(this.field_path, s2Var.field_path) && C46238a.m51546a(this.field_imgDirPath, s2Var.field_imgDirPath) && C46238a.m51546a(this.field_imgPaths, s2Var.field_imgPaths) && C46238a.m51546a(Long.valueOf(this.field_favTime), Long.valueOf(s2Var.field_favTime)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(s2Var.field_updateTime)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(s2Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_failNum), Integer.valueOf(s2Var.field_failNum)) && C46238a.m51546a(Integer.valueOf(this.field_isReport), Integer.valueOf(s2Var.field_isReport));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302932s == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302933t == hashCode) {
                    try {
                        this.field_size = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302934u == hashCode) {
                    try {
                        this.field_path = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302935v == hashCode) {
                    try {
                        this.field_imgDirPath = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302936w == hashCode) {
                    try {
                        this.field_imgPaths = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302937x == hashCode) {
                    try {
                        this.field_favTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302938y == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302939z == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302925A == hashCode) {
                    try {
                        this.field_failNum = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302926B == hashCode) {
                    try {
                        this.field_isReport = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302927C == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302940d) {
            contentValues.put("url", this.field_url);
        }
        if (this.f302941e) {
            contentValues.put("size", Long.valueOf(this.field_size));
        }
        if (this.f302942f) {
            contentValues.put("path", this.field_path);
        }
        if (this.f302943g) {
            contentValues.put("imgDirPath", this.field_imgDirPath);
        }
        if (this.f302944h) {
            contentValues.put("imgPaths", this.field_imgPaths);
        }
        if (this.f302945i) {
            contentValues.put("favTime", Long.valueOf(this.field_favTime));
        }
        if (this.f302946j) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f302947n) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f302948o) {
            contentValues.put("failNum", Integer.valueOf(this.field_failNum));
        }
        if (this.f302949p) {
            contentValues.put("isReport", Integer.valueOf(this.field_isReport));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFavOffline", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FavOffline ( " + f302928D.sql + ");");
        for (String add : f302931r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFavOffline", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FavOffline", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302928D, "FavOffline", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFavOffline", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FavOffline", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFavOffline", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302928D;
    }

    public String[] getIndexCreateSQL() {
        return f302931r;
    }

    public StorageObserverOwner<C102667s2> getObserverOwner() {
        return f302929E;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f302930q;
    }

    public String getTableName() {
        return f302930q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f302940d = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z) {
                this.f302941e = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsString("path");
            if (z) {
                this.f302942f = true;
            }
        }
        if (contentValues.containsKey("imgDirPath")) {
            this.field_imgDirPath = contentValues.getAsString("imgDirPath");
            if (z) {
                this.f302943g = true;
            }
        }
        if (contentValues.containsKey("imgPaths")) {
            this.field_imgPaths = contentValues.getAsString("imgPaths");
            if (z) {
                this.f302944h = true;
            }
        }
        if (contentValues.containsKey("favTime")) {
            this.field_favTime = contentValues.getAsLong("favTime").longValue();
            if (z) {
                this.f302945i = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f302946j = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f302947n = true;
            }
        }
        if (contentValues.containsKey("failNum")) {
            this.field_failNum = contentValues.getAsInteger("failNum").intValue();
            if (z) {
                this.f302948o = true;
            }
        }
        if (contentValues.containsKey("isReport")) {
            this.field_isReport = contentValues.getAsInteger("isReport").intValue();
            if (z) {
                this.f302949p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
