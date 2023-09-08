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

/* renamed from: xh.ga */
public class C38570ga extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f102393h;

    /* renamed from: i */
    public static final String[] f102394i = new String[0];

    /* renamed from: j */
    public static final int f102395j = 93028124;

    /* renamed from: n */
    public static final int f102396n = -793934597;

    /* renamed from: o */
    public static final int f102397o = 689108018;

    /* renamed from: p */
    public static final int f102398p = -1648143396;

    /* renamed from: q */
    public static final int f102399q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f102400r = initAutoDBInfo(C38570ga.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38570ga> f102401s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102402d = true;

    /* renamed from: e */
    public boolean f102403e = true;

    /* renamed from: f */
    public boolean f102404f = true;
    public String field_appId;
    public int field_appType;
    public byte[] field_permissionBytes;
    public int field_versionType;

    /* renamed from: g */
    public boolean f102405g = true;

    static {
        SingleTable singleTable = new SingleTable("WxaAppidABTestInfo");
        f102393h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("appType", "int", singleTable.getName(), "");
        new Column("versionType", "int", singleTable.getName(), "");
        new Column("permissionBytes", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "appType";
        mAutoDBInfo.colsMap.put("appType", "INTEGER");
        mAutoDBInfo.columns[2] = "versionType";
        mAutoDBInfo.colsMap.put("versionType", "INTEGER");
        mAutoDBInfo.columns[3] = "permissionBytes";
        mAutoDBInfo.colsMap.put("permissionBytes", "BLOB");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  appType INTEGER,  versionType INTEGER,  permissionBytes BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38570ga)) {
            return false;
        }
        C38570ga gaVar = (C38570ga) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, gaVar.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_appType), Integer.valueOf(gaVar.field_appType)) && C46238a.m51546a(Integer.valueOf(this.field_versionType), Integer.valueOf(gaVar.field_versionType)) && C46238a.m51546a(this.field_permissionBytes, gaVar.field_permissionBytes);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102395j == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppidABTestInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102396n == hashCode) {
                    try {
                        this.field_appType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppidABTestInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102397o == hashCode) {
                    try {
                        this.field_versionType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppidABTestInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102398p == hashCode) {
                    try {
                        this.field_permissionBytes = cursor.getBlob(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppidABTestInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102399q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102402d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f102403e) {
            contentValues.put("appType", Integer.valueOf(this.field_appType));
        }
        if (this.f102404f) {
            contentValues.put("versionType", Integer.valueOf(this.field_versionType));
        }
        if (this.f102405g) {
            contentValues.put("permissionBytes", this.field_permissionBytes);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaAppidABTestInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaAppidABTestInfo ( " + f102400r.sql + ");");
        for (String add : f102394i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaAppidABTestInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaAppidABTestInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102400r, "WxaAppidABTestInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaAppidABTestInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaAppidABTestInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaAppidABTestInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102400r;
    }

    public String[] getIndexCreateSQL() {
        return f102394i;
    }

    public StorageObserverOwner<C38570ga> getObserverOwner() {
        return f102401s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102393h;
    }

    public String getTableName() {
        return f102393h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f102402d = true;
            }
        }
        if (contentValues.containsKey("appType")) {
            this.field_appType = contentValues.getAsInteger("appType").intValue();
            if (z) {
                this.f102403e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z) {
                this.f102404f = true;
            }
        }
        if (contentValues.containsKey("permissionBytes")) {
            this.field_permissionBytes = contentValues.getAsByteArray("permissionBytes");
            if (z) {
                this.f102405g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
