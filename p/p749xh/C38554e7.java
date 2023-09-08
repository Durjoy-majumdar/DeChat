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
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.e7 */
public class C38554e7 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f102162n;

    /* renamed from: o */
    public static final String[] f102163o = new String[0];

    /* renamed from: p */
    public static final int f102164p = 110541305;

    /* renamed from: q */
    public static final int f102165q = -265713450;

    /* renamed from: r */
    public static final int f102166r = 689108018;

    /* renamed from: s */
    public static final int f102167s = 1484112759;

    /* renamed from: t */
    public static final int f102168t = 93029116;

    /* renamed from: u */
    public static final int f102169u = 70690926;

    /* renamed from: v */
    public static final int f102170v = 1638765110;

    /* renamed from: w */
    public static final int f102171w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f102172x = initAutoDBInfo(C38554e7.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38554e7> f102173y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102174d = true;

    /* renamed from: e */
    public boolean f102175e = true;

    /* renamed from: f */
    public boolean f102176f = true;
    public int field_appVersion;
    public String field_appid;
    public String field_iconUrl;
    public String field_nickname;
    public String field_token;
    public String field_username;
    public int field_versionType;

    /* renamed from: g */
    public boolean f102177g = true;

    /* renamed from: h */
    public boolean f102178h = true;

    /* renamed from: i */
    public boolean f102179i = true;

    /* renamed from: j */
    public boolean f102180j = true;

    static {
        SingleTable singleTable = new SingleTable("OuterWidgetAppInfo");
        f102162n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, "string", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("versionType", "int", singleTable.getName(), "");
        new Column("appVersion", "int", singleTable.getName(), "");
        new Column("appid", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("iconUrl", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = XWalkReaderBasePlugin.PARAM_KEY_TOKEN;
        mAutoDBInfo.colsMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = XWalkReaderBasePlugin.PARAM_KEY_TOKEN;
        mAutoDBInfo.columns[1] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[2] = "versionType";
        mAutoDBInfo.colsMap.put("versionType", "INTEGER");
        mAutoDBInfo.columns[3] = "appVersion";
        mAutoDBInfo.colsMap.put("appVersion", "INTEGER");
        mAutoDBInfo.columns[4] = "appid";
        mAutoDBInfo.colsMap.put("appid", "TEXT");
        mAutoDBInfo.columns[5] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT");
        mAutoDBInfo.columns[6] = "iconUrl";
        mAutoDBInfo.colsMap.put("iconUrl", "TEXT");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " token TEXT PRIMARY KEY ,  username TEXT,  versionType INTEGER,  appVersion INTEGER,  appid TEXT,  nickname TEXT,  iconUrl TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38554e7)) {
            return false;
        }
        C38554e7 e7Var = (C38554e7) iAutoDBItem;
        return C46238a.m51546a(this.field_token, e7Var.field_token) && C46238a.m51546a(this.field_username, e7Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_versionType), Integer.valueOf(e7Var.field_versionType)) && C46238a.m51546a(Integer.valueOf(this.field_appVersion), Integer.valueOf(e7Var.field_appVersion)) && C46238a.m51546a(this.field_appid, e7Var.field_appid) && C46238a.m51546a(this.field_nickname, e7Var.field_nickname) && C46238a.m51546a(this.field_iconUrl, e7Var.field_iconUrl);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102164p == hashCode) {
                    try {
                        this.field_token = cursor.getString(i);
                        this.f102174d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102165q == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102166r == hashCode) {
                    try {
                        this.field_versionType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102167s == hashCode) {
                    try {
                        this.field_appVersion = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102168t == hashCode) {
                    try {
                        this.field_appid = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102169u == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102170v == hashCode) {
                    try {
                        this.field_iconUrl = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102171w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102174d) {
            contentValues.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, this.field_token);
        }
        if (this.f102175e) {
            contentValues.put("username", this.field_username);
        }
        if (this.f102176f) {
            contentValues.put("versionType", Integer.valueOf(this.field_versionType));
        }
        if (this.f102177g) {
            contentValues.put("appVersion", Integer.valueOf(this.field_appVersion));
        }
        if (this.f102178h) {
            contentValues.put("appid", this.field_appid);
        }
        if (this.f102179i) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f102180j) {
            contentValues.put("iconUrl", this.field_iconUrl);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseOuterWidgetAppInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OuterWidgetAppInfo ( " + f102172x.sql + ");");
        for (String add : f102163o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOuterWidgetAppInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OuterWidgetAppInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102172x, "OuterWidgetAppInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOuterWidgetAppInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OuterWidgetAppInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOuterWidgetAppInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102172x;
    }

    public String[] getIndexCreateSQL() {
        return f102163o;
    }

    public StorageObserverOwner<C38554e7> getObserverOwner() {
        return f102173y;
    }

    public Object getPrimaryKeyValue() {
        return this.field_token;
    }

    public SingleTable getTable() {
        return f102162n;
    }

    public String getTableName() {
        return f102162n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(XWalkReaderBasePlugin.PARAM_KEY_TOKEN)) {
            this.field_token = contentValues.getAsString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            if (z) {
                this.f102174d = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f102175e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z) {
                this.f102176f = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z) {
                this.f102177g = true;
            }
        }
        if (contentValues.containsKey("appid")) {
            this.field_appid = contentValues.getAsString("appid");
            if (z) {
                this.f102178h = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f102179i = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.field_iconUrl = contentValues.getAsString("iconUrl");
            if (z) {
                this.f102180j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
