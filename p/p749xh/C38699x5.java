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

/* renamed from: xh.x5 */
public class C38699x5 extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C38699x5> f104255A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f104256o;

    /* renamed from: p */
    public static final String[] f104257p = new String[0];

    /* renamed from: q */
    public static final int f104258q = 116079;

    /* renamed from: r */
    public static final int f104259r = 93029116;

    /* renamed from: s */
    public static final int f104260s = 3433509;

    /* renamed from: t */
    public static final int f104261t = 305255604;

    /* renamed from: u */
    public static final int f104262u = -745606536;

    /* renamed from: v */
    public static final int f104263v = -306964292;

    /* renamed from: w */
    public static final int f104264w = -295931082;

    /* renamed from: x */
    public static final int f104265x = -60585556;

    /* renamed from: y */
    public static final int f104266y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f104267z = initAutoDBInfo(C38699x5.class);

    /* renamed from: d */
    public boolean f104268d = true;

    /* renamed from: e */
    public boolean f104269e = true;

    /* renamed from: f */
    public boolean f104270f = true;
    public String field_appid;
    public int field_expire_duration;
    public boolean field_hasLiteConf;
    public String field_path;
    public int field_refresh_duration;
    public long field_updateTime;
    public String field_url;
    public String field_wepkg_id;

    /* renamed from: g */
    public boolean f104271g = true;

    /* renamed from: h */
    public boolean f104272h = true;

    /* renamed from: i */
    public boolean f104273i = true;

    /* renamed from: j */
    public boolean f104274j = true;

    /* renamed from: n */
    public boolean f104275n = true;

    static {
        SingleTable singleTable = new SingleTable("LocalLiteAppConf");
        f104256o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("appid", "string", singleTable.getName(), "");
        new Column("path", "string", singleTable.getName(), "");
        new Column("expire_duration", "int", singleTable.getName(), "");
        new Column("refresh_duration", "int", singleTable.getName(), "");
        new Column("wepkg_id", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("hasLiteConf", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "url";
        mAutoDBInfo.columns[1] = "appid";
        mAutoDBInfo.colsMap.put("appid", "TEXT");
        mAutoDBInfo.columns[2] = "path";
        mAutoDBInfo.colsMap.put("path", "TEXT");
        mAutoDBInfo.columns[3] = "expire_duration";
        mAutoDBInfo.colsMap.put("expire_duration", "INTEGER");
        mAutoDBInfo.columns[4] = "refresh_duration";
        mAutoDBInfo.colsMap.put("refresh_duration", "INTEGER");
        mAutoDBInfo.columns[5] = "wepkg_id";
        mAutoDBInfo.colsMap.put("wepkg_id", "TEXT");
        mAutoDBInfo.columns[6] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[7] = "hasLiteConf";
        mAutoDBInfo.colsMap.put("hasLiteConf", "INTEGER default 'false' ");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " url TEXT PRIMARY KEY ,  appid TEXT,  path TEXT,  expire_duration INTEGER,  refresh_duration INTEGER,  wepkg_id TEXT,  updateTime LONG,  hasLiteConf INTEGER default 'false' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38699x5)) {
            return false;
        }
        C38699x5 x5Var = (C38699x5) iAutoDBItem;
        return C46238a.m51546a(this.field_url, x5Var.field_url) && C46238a.m51546a(this.field_appid, x5Var.field_appid) && C46238a.m51546a(this.field_path, x5Var.field_path) && C46238a.m51546a(Integer.valueOf(this.field_expire_duration), Integer.valueOf(x5Var.field_expire_duration)) && C46238a.m51546a(Integer.valueOf(this.field_refresh_duration), Integer.valueOf(x5Var.field_refresh_duration)) && C46238a.m51546a(this.field_wepkg_id, x5Var.field_wepkg_id) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(x5Var.field_updateTime)) && C46238a.m51546a(Boolean.valueOf(this.field_hasLiteConf), Boolean.valueOf(x5Var.field_hasLiteConf));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104258q == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                        this.f104268d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104259r == hashCode) {
                    try {
                        this.field_appid = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104260s == hashCode) {
                    try {
                        this.field_path = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104261t == hashCode) {
                    try {
                        this.field_expire_duration = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104262u == hashCode) {
                    try {
                        this.field_refresh_duration = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104263v == hashCode) {
                    try {
                        this.field_wepkg_id = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104264w == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104265x == hashCode) {
                    try {
                        this.field_hasLiteConf = cursor.getInt(i) != 0;
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104266y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104268d) {
            contentValues.put("url", this.field_url);
        }
        if (this.f104269e) {
            contentValues.put("appid", this.field_appid);
        }
        if (this.f104270f) {
            contentValues.put("path", this.field_path);
        }
        if (this.f104271g) {
            contentValues.put("expire_duration", Integer.valueOf(this.field_expire_duration));
        }
        if (this.f104272h) {
            contentValues.put("refresh_duration", Integer.valueOf(this.field_refresh_duration));
        }
        if (this.f104273i) {
            contentValues.put("wepkg_id", this.field_wepkg_id);
        }
        if (this.f104274j) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f104275n) {
            if (this.field_hasLiteConf) {
                contentValues.put("hasLiteConf", 1);
            } else {
                contentValues.put("hasLiteConf", 0);
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
            Log.m105920e("MicroMsg.SDK.BaseLocalLiteAppConf", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LocalLiteAppConf ( " + f104267z.sql + ");");
        for (String add : f104257p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLocalLiteAppConf", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LocalLiteAppConf", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104267z, "LocalLiteAppConf", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLocalLiteAppConf", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LocalLiteAppConf", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLocalLiteAppConf", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104267z;
    }

    public String[] getIndexCreateSQL() {
        return f104257p;
    }

    public StorageObserverOwner<C38699x5> getObserverOwner() {
        return f104255A;
    }

    public Object getPrimaryKeyValue() {
        return this.field_url;
    }

    public SingleTable getTable() {
        return f104256o;
    }

    public String getTableName() {
        return f104256o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f104268d = true;
            }
        }
        if (contentValues.containsKey("appid")) {
            this.field_appid = contentValues.getAsString("appid");
            if (z) {
                this.f104269e = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsString("path");
            if (z) {
                this.f104270f = true;
            }
        }
        if (contentValues.containsKey("expire_duration")) {
            this.field_expire_duration = contentValues.getAsInteger("expire_duration").intValue();
            if (z) {
                this.f104271g = true;
            }
        }
        if (contentValues.containsKey("refresh_duration")) {
            this.field_refresh_duration = contentValues.getAsInteger("refresh_duration").intValue();
            if (z) {
                this.f104272h = true;
            }
        }
        if (contentValues.containsKey("wepkg_id")) {
            this.field_wepkg_id = contentValues.getAsString("wepkg_id");
            if (z) {
                this.f104273i = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f104274j = true;
            }
        }
        if (contentValues.containsKey("hasLiteConf")) {
            this.field_hasLiteConf = contentValues.getAsInteger("hasLiteConf").intValue() != 0;
            if (z) {
                this.f104275n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
