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

/* renamed from: xh.pa */
public class C38638pa extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103335h;

    /* renamed from: i */
    public static final String[] f103336i = new String[0];

    /* renamed from: j */
    public static final int f103337j = 110541305;

    /* renamed from: n */
    public static final int f103338n = -265713450;

    /* renamed from: o */
    public static final int f103339o = 115802;

    /* renamed from: p */
    public static final int f103340p = 93029116;

    /* renamed from: q */
    public static final int f103341q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103342r = initAutoDBInfo(C38638pa.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38638pa> f103343s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103344d = true;

    /* renamed from: e */
    public boolean f103345e = true;

    /* renamed from: f */
    public boolean f103346f = true;
    public String field_appid;
    public String field_token;
    public int field_uin;
    public String field_username;

    /* renamed from: g */
    public boolean f103347g = true;

    static {
        SingleTable singleTable = new SingleTable("WxaTokenInfo");
        f103335h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, "string", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("uin", "int", singleTable.getName(), "");
        new Column("appid", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = XWalkReaderBasePlugin.PARAM_KEY_TOKEN;
        mAutoDBInfo.colsMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = XWalkReaderBasePlugin.PARAM_KEY_TOKEN;
        mAutoDBInfo.columns[1] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[2] = "uin";
        mAutoDBInfo.colsMap.put("uin", "INTEGER");
        mAutoDBInfo.columns[3] = "appid";
        mAutoDBInfo.colsMap.put("appid", "TEXT");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " token TEXT PRIMARY KEY ,  username TEXT,  uin INTEGER,  appid TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38638pa)) {
            return false;
        }
        C38638pa paVar = (C38638pa) iAutoDBItem;
        return C46238a.m51546a(this.field_token, paVar.field_token) && C46238a.m51546a(this.field_username, paVar.field_username) && C46238a.m51546a(Integer.valueOf(this.field_uin), Integer.valueOf(paVar.field_uin)) && C46238a.m51546a(this.field_appid, paVar.field_appid);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103337j == hashCode) {
                    try {
                        this.field_token = cursor.getString(i);
                        this.f103344d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaTokenInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103338n == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaTokenInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103339o == hashCode) {
                    try {
                        this.field_uin = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaTokenInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103340p == hashCode) {
                    try {
                        this.field_appid = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaTokenInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103341q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103344d) {
            contentValues.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, this.field_token);
        }
        if (this.f103345e) {
            contentValues.put("username", this.field_username);
        }
        if (this.f103346f) {
            contentValues.put("uin", Integer.valueOf(this.field_uin));
        }
        if (this.f103347g) {
            contentValues.put("appid", this.field_appid);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaTokenInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaTokenInfo ( " + f103342r.sql + ");");
        for (String add : f103336i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaTokenInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaTokenInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103342r, "WxaTokenInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaTokenInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaTokenInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaTokenInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103342r;
    }

    public String[] getIndexCreateSQL() {
        return f103336i;
    }

    public StorageObserverOwner<C38638pa> getObserverOwner() {
        return f103343s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_token;
    }

    public SingleTable getTable() {
        return f103335h;
    }

    public String getTableName() {
        return f103335h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(XWalkReaderBasePlugin.PARAM_KEY_TOKEN)) {
            this.field_token = contentValues.getAsString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            if (z) {
                this.f103344d = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f103345e = true;
            }
        }
        if (contentValues.containsKey("uin")) {
            this.field_uin = contentValues.getAsInteger("uin").intValue();
            if (z) {
                this.f103346f = true;
            }
        }
        if (contentValues.containsKey("appid")) {
            this.field_appid = contentValues.getAsString("appid");
            if (z) {
                this.f103347g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
