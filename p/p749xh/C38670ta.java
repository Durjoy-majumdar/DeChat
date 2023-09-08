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

/* renamed from: xh.ta */
public class C38670ta extends IAutoDBItem {

    /* renamed from: A */
    public static final int f103816A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f103817B = initAutoDBInfo(C38670ta.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C38670ta> f103818C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f103819p;

    /* renamed from: q */
    public static final String[] f103820q = new String[0];

    /* renamed from: r */
    public static final int f103821r = -734590612;

    /* renamed from: s */
    public static final int f103822s = 63475452;

    /* renamed from: t */
    public static final int f103823t = 870516780;

    /* renamed from: u */
    public static final int f103824u = -202022634;

    /* renamed from: v */
    public static final int f103825v = -991548906;

    /* renamed from: w */
    public static final int f103826w = 769664562;

    /* renamed from: x */
    public static final int f103827x = -1180109083;

    /* renamed from: y */
    public static final int f103828y = -198232019;

    /* renamed from: z */
    public static final int f103829z = 1369213417;

    /* renamed from: d */
    public boolean f103830d = true;

    /* renamed from: e */
    public boolean f103831e = true;

    /* renamed from: f */
    public boolean f103832f = true;
    public String field_AppId;
    public String field_AppName;
    public String field_BriefIntro;
    public String field_IconUrl;
    public String field_RecordId;
    public String field_UserName;
    public long field_createTime;
    public int field_debugType;
    public boolean field_isSync;

    /* renamed from: g */
    public boolean f103833g = true;

    /* renamed from: h */
    public boolean f103834h = true;

    /* renamed from: i */
    public boolean f103835i = true;

    /* renamed from: j */
    public boolean f103836j = true;

    /* renamed from: n */
    public boolean f103837n = true;

    /* renamed from: o */
    public boolean f103838o = true;

    static {
        SingleTable singleTable = new SingleTable("WxagGameInfo");
        f103819p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("RecordId", "string", singleTable.getName(), "");
        new Column("AppId", "string", singleTable.getName(), "");
        new Column("AppName", "string", singleTable.getName(), "");
        new Column("UserName", "string", singleTable.getName(), "");
        new Column("IconUrl", "string", singleTable.getName(), "");
        new Column("BriefIntro", "string", singleTable.getName(), "");
        new Column("isSync", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("debugType", "int", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "RecordId";
        mAutoDBInfo.colsMap.put("RecordId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "RecordId";
        mAutoDBInfo.columns[1] = "AppId";
        mAutoDBInfo.colsMap.put("AppId", "TEXT");
        mAutoDBInfo.columns[2] = "AppName";
        mAutoDBInfo.colsMap.put("AppName", "TEXT");
        mAutoDBInfo.columns[3] = "UserName";
        mAutoDBInfo.colsMap.put("UserName", "TEXT");
        mAutoDBInfo.columns[4] = "IconUrl";
        mAutoDBInfo.colsMap.put("IconUrl", "TEXT");
        mAutoDBInfo.columns[5] = "BriefIntro";
        mAutoDBInfo.colsMap.put("BriefIntro", "TEXT");
        mAutoDBInfo.columns[6] = "isSync";
        mAutoDBInfo.colsMap.put("isSync", "INTEGER default 'false' ");
        mAutoDBInfo.columns[7] = "debugType";
        mAutoDBInfo.colsMap.put("debugType", "INTEGER");
        mAutoDBInfo.columns[8] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " RecordId TEXT PRIMARY KEY ,  AppId TEXT,  AppName TEXT,  UserName TEXT,  IconUrl TEXT,  BriefIntro TEXT,  isSync INTEGER default 'false' ,  debugType INTEGER,  createTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38670ta)) {
            return false;
        }
        C38670ta taVar = (C38670ta) iAutoDBItem;
        return C46238a.m51546a(this.field_RecordId, taVar.field_RecordId) && C46238a.m51546a(this.field_AppId, taVar.field_AppId) && C46238a.m51546a(this.field_AppName, taVar.field_AppName) && C46238a.m51546a(this.field_UserName, taVar.field_UserName) && C46238a.m51546a(this.field_IconUrl, taVar.field_IconUrl) && C46238a.m51546a(this.field_BriefIntro, taVar.field_BriefIntro) && C46238a.m51546a(Boolean.valueOf(this.field_isSync), Boolean.valueOf(taVar.field_isSync)) && C46238a.m51546a(Integer.valueOf(this.field_debugType), Integer.valueOf(taVar.field_debugType)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(taVar.field_createTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103821r == hashCode) {
                    try {
                        this.field_RecordId = cursor.getString(i);
                        this.f103830d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103822s == hashCode) {
                    try {
                        this.field_AppId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103823t == hashCode) {
                    try {
                        this.field_AppName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103824u == hashCode) {
                    try {
                        this.field_UserName = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103825v == hashCode) {
                    try {
                        this.field_IconUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103826w == hashCode) {
                    try {
                        this.field_BriefIntro = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103827x == hashCode) {
                    try {
                        this.field_isSync = cursor.getInt(i) != 0;
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103828y == hashCode) {
                    try {
                        this.field_debugType = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103829z == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103816A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103830d) {
            contentValues.put("RecordId", this.field_RecordId);
        }
        if (this.f103831e) {
            contentValues.put("AppId", this.field_AppId);
        }
        if (this.f103832f) {
            contentValues.put("AppName", this.field_AppName);
        }
        if (this.f103833g) {
            contentValues.put("UserName", this.field_UserName);
        }
        if (this.f103834h) {
            contentValues.put("IconUrl", this.field_IconUrl);
        }
        if (this.f103835i) {
            contentValues.put("BriefIntro", this.field_BriefIntro);
        }
        if (this.f103836j) {
            if (this.field_isSync) {
                contentValues.put("isSync", 1);
            } else {
                contentValues.put("isSync", 0);
            }
        }
        if (this.f103837n) {
            contentValues.put("debugType", Integer.valueOf(this.field_debugType));
        }
        if (this.f103838o) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxagGameInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxagGameInfo ( " + f103817B.sql + ");");
        for (String add : f103820q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxagGameInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxagGameInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103817B, "WxagGameInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxagGameInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxagGameInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxagGameInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103817B;
    }

    public String[] getIndexCreateSQL() {
        return f103820q;
    }

    public StorageObserverOwner<C38670ta> getObserverOwner() {
        return f103818C;
    }

    public Object getPrimaryKeyValue() {
        return this.field_RecordId;
    }

    public SingleTable getTable() {
        return f103819p;
    }

    public String getTableName() {
        return f103819p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("RecordId")) {
            this.field_RecordId = contentValues.getAsString("RecordId");
            if (z) {
                this.f103830d = true;
            }
        }
        if (contentValues.containsKey("AppId")) {
            this.field_AppId = contentValues.getAsString("AppId");
            if (z) {
                this.f103831e = true;
            }
        }
        if (contentValues.containsKey("AppName")) {
            this.field_AppName = contentValues.getAsString("AppName");
            if (z) {
                this.f103832f = true;
            }
        }
        if (contentValues.containsKey("UserName")) {
            this.field_UserName = contentValues.getAsString("UserName");
            if (z) {
                this.f103833g = true;
            }
        }
        if (contentValues.containsKey("IconUrl")) {
            this.field_IconUrl = contentValues.getAsString("IconUrl");
            if (z) {
                this.f103834h = true;
            }
        }
        if (contentValues.containsKey("BriefIntro")) {
            this.field_BriefIntro = contentValues.getAsString("BriefIntro");
            if (z) {
                this.f103835i = true;
            }
        }
        if (contentValues.containsKey("isSync")) {
            this.field_isSync = contentValues.getAsInteger("isSync").intValue() != 0;
            if (z) {
                this.f103836j = true;
            }
        }
        if (contentValues.containsKey("debugType")) {
            this.field_debugType = contentValues.getAsInteger("debugType").intValue();
            if (z) {
                this.f103837n = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f103838o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
