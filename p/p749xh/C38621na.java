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

/* renamed from: xh.na */
public class C38621na extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f103169g;

    /* renamed from: h */
    public static final String[] f103170h = new String[0];

    /* renamed from: i */
    public static final int f103171i = 869640073;

    /* renamed from: j */
    public static final int f103172j = -1159730422;

    /* renamed from: n */
    public static final int f103173n = -1177314540;

    /* renamed from: o */
    public static final int f103174o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f103175p = initAutoDBInfo(C38621na.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38621na> f103176q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103177d = true;

    /* renamed from: e */
    public boolean f103178e = true;

    /* renamed from: f */
    public boolean f103179f = true;
    public String field_pluginAppID;
    public int field_pluginAppVersion;
    public String field_pluginStringVersion;

    static {
        SingleTable singleTable = new SingleTable("WxaPluginCodeVersionInfo");
        f103169g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("pluginAppID", "string", singleTable.getName(), "");
        new Column("pluginAppVersion", "int", singleTable.getName(), "");
        new Column("pluginStringVersion", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "pluginAppID";
        mAutoDBInfo.colsMap.put("pluginAppID", "TEXT");
        mAutoDBInfo.columns[1] = "pluginAppVersion";
        mAutoDBInfo.colsMap.put("pluginAppVersion", "INTEGER");
        mAutoDBInfo.columns[2] = "pluginStringVersion";
        mAutoDBInfo.colsMap.put("pluginStringVersion", "TEXT");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " pluginAppID TEXT,  pluginAppVersion INTEGER,  pluginStringVersion TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38621na)) {
            return false;
        }
        C38621na naVar = (C38621na) iAutoDBItem;
        return C46238a.m51546a(this.field_pluginAppID, naVar.field_pluginAppID) && C46238a.m51546a(Integer.valueOf(this.field_pluginAppVersion), Integer.valueOf(naVar.field_pluginAppVersion)) && C46238a.m51546a(this.field_pluginStringVersion, naVar.field_pluginStringVersion);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103171i == hashCode) {
                    try {
                        this.field_pluginAppID = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103172j == hashCode) {
                    try {
                        this.field_pluginAppVersion = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103173n == hashCode) {
                    try {
                        this.field_pluginStringVersion = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103174o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103177d) {
            contentValues.put("pluginAppID", this.field_pluginAppID);
        }
        if (this.f103178e) {
            contentValues.put("pluginAppVersion", Integer.valueOf(this.field_pluginAppVersion));
        }
        if (this.f103179f) {
            contentValues.put("pluginStringVersion", this.field_pluginStringVersion);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaPluginCodeVersionInfo ( " + f103175p.sql + ");");
        for (String add : f103170h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaPluginCodeVersionInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103175p, "WxaPluginCodeVersionInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaPluginCodeVersionInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103175p;
    }

    public String[] getIndexCreateSQL() {
        return f103170h;
    }

    public StorageObserverOwner<C38621na> getObserverOwner() {
        return f103176q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103169g;
    }

    public String getTableName() {
        return f103169g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("pluginAppID")) {
            this.field_pluginAppID = contentValues.getAsString("pluginAppID");
            if (z) {
                this.f103177d = true;
            }
        }
        if (contentValues.containsKey("pluginAppVersion")) {
            this.field_pluginAppVersion = contentValues.getAsInteger("pluginAppVersion").intValue();
            if (z) {
                this.f103178e = true;
            }
        }
        if (contentValues.containsKey("pluginStringVersion")) {
            this.field_pluginStringVersion = contentValues.getAsString("pluginStringVersion");
            if (z) {
                this.f103179f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
