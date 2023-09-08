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

/* renamed from: xh.ha */
public class C38576ha extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f102475h;

    /* renamed from: i */
    public static final String[] f102476i = {"CREATE INDEX IF NOT EXISTS WxaAttrVersionServerNotifyRecordAppVersionIndex ON WxaAttrVersionServerNotifyRecord(appVersion)"};

    /* renamed from: j */
    public static final int f102477j = -265713450;

    /* renamed from: n */
    public static final int f102478n = 1484112759;

    /* renamed from: o */
    public static final int f102479o = -427040401;

    /* renamed from: p */
    public static final int f102480p = -2129938799;

    /* renamed from: q */
    public static final int f102481q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f102482r = initAutoDBInfo(C38576ha.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38576ha> f102483s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102484d = true;

    /* renamed from: e */
    public boolean f102485e = true;

    /* renamed from: f */
    public boolean f102486f = true;
    public int field_appVersion;
    public int field_launchFallbackDirectlyMinVersion;
    public int field_reportId;
    public String field_username;

    /* renamed from: g */
    public boolean f102487g = true;

    static {
        SingleTable singleTable = new SingleTable("WxaAttrVersionServerNotifyRecord");
        f102475h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("appVersion", "int", singleTable.getName(), "");
        new Column("reportId", "int", singleTable.getName(), "");
        new Column("launchFallbackDirectlyMinVersion", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "appVersion";
        mAutoDBInfo.colsMap.put("appVersion", "INTEGER");
        mAutoDBInfo.columns[2] = "reportId";
        mAutoDBInfo.colsMap.put("reportId", "INTEGER");
        mAutoDBInfo.columns[3] = "launchFallbackDirectlyMinVersion";
        mAutoDBInfo.colsMap.put("launchFallbackDirectlyMinVersion", "INTEGER default '-1' ");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " username TEXT PRIMARY KEY ,  appVersion INTEGER,  reportId INTEGER,  launchFallbackDirectlyMinVersion INTEGER default '-1' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38576ha)) {
            return false;
        }
        C38576ha haVar = (C38576ha) iAutoDBItem;
        return C46238a.m51546a(this.field_username, haVar.field_username) && C46238a.m51546a(Integer.valueOf(this.field_appVersion), Integer.valueOf(haVar.field_appVersion)) && C46238a.m51546a(Integer.valueOf(this.field_reportId), Integer.valueOf(haVar.field_reportId)) && C46238a.m51546a(Integer.valueOf(this.field_launchFallbackDirectlyMinVersion), Integer.valueOf(haVar.field_launchFallbackDirectlyMinVersion));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102477j == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f102484d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102478n == hashCode) {
                    try {
                        this.field_appVersion = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102479o == hashCode) {
                    try {
                        this.field_reportId = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102480p == hashCode) {
                    try {
                        this.field_launchFallbackDirectlyMinVersion = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102481q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102484d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f102485e) {
            contentValues.put("appVersion", Integer.valueOf(this.field_appVersion));
        }
        if (this.f102486f) {
            contentValues.put("reportId", Integer.valueOf(this.field_reportId));
        }
        if (this.f102487g) {
            contentValues.put("launchFallbackDirectlyMinVersion", Integer.valueOf(this.field_launchFallbackDirectlyMinVersion));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaAttrVersionServerNotifyRecord ( " + f102482r.sql + ");");
        for (String add : f102476i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaAttrVersionServerNotifyRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102482r, "WxaAttrVersionServerNotifyRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaAttrVersionServerNotifyRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102482r;
    }

    public String[] getIndexCreateSQL() {
        return f102476i;
    }

    public StorageObserverOwner<C38576ha> getObserverOwner() {
        return f102483s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f102475h;
    }

    public String getTableName() {
        return f102475h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f102484d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z) {
                this.f102485e = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z) {
                this.f102486f = true;
            }
        }
        if (contentValues.containsKey("launchFallbackDirectlyMinVersion")) {
            this.field_launchFallbackDirectlyMinVersion = contentValues.getAsInteger("launchFallbackDirectlyMinVersion").intValue();
            if (z) {
                this.f102487g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
