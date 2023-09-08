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

/* renamed from: xh.ja */
public class C38592ja extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102697g;

    /* renamed from: h */
    public static final String[] f102698h = new String[0];

    /* renamed from: i */
    public static final int f102699i = 93028124;

    /* renamed from: j */
    public static final int f102700j = -1438599086;

    /* renamed from: n */
    public static final int f102701n = 690045861;

    /* renamed from: o */
    public static final int f102702o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102703p = initAutoDBInfo(C38592ja.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38592ja> f102704q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102705d = true;

    /* renamed from: e */
    public boolean f102706e = true;

    /* renamed from: f */
    public boolean f102707f = true;
    public String field_appId;
    public boolean field_permissionDemo;
    public long field_versiontime;

    static {
        SingleTable singleTable = new SingleTable("WxaCheckDemoInfo");
        f102697g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("permissionDemo", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("versiontime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = "permissionDemo";
        mAutoDBInfo.colsMap.put("permissionDemo", "INTEGER default 'false' ");
        mAutoDBInfo.columns[2] = "versiontime";
        mAutoDBInfo.colsMap.put("versiontime", "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " appId TEXT PRIMARY KEY ,  permissionDemo INTEGER default 'false' ,  versiontime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38592ja)) {
            return false;
        }
        C38592ja jaVar = (C38592ja) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, jaVar.field_appId) && C46238a.m51546a(Boolean.valueOf(this.field_permissionDemo), Boolean.valueOf(jaVar.field_permissionDemo)) && C46238a.m51546a(Long.valueOf(this.field_versiontime), Long.valueOf(jaVar.field_versiontime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102699i == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f102705d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaCheckDemoInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102700j == hashCode) {
                    try {
                        this.field_permissionDemo = cursor.getInt(i) != 0;
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaCheckDemoInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102701n == hashCode) {
                    try {
                        this.field_versiontime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaCheckDemoInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102702o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102705d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f102706e) {
            if (this.field_permissionDemo) {
                contentValues.put("permissionDemo", 1);
            } else {
                contentValues.put("permissionDemo", 0);
            }
        }
        if (this.f102707f) {
            contentValues.put("versiontime", Long.valueOf(this.field_versiontime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaCheckDemoInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaCheckDemoInfo ( " + f102703p.sql + ");");
        for (String add : f102698h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaCheckDemoInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaCheckDemoInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102703p, "WxaCheckDemoInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaCheckDemoInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaCheckDemoInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaCheckDemoInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102703p;
    }

    public String[] getIndexCreateSQL() {
        return f102698h;
    }

    public StorageObserverOwner<C38592ja> getObserverOwner() {
        return f102704q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f102697g;
    }

    public String getTableName() {
        return f102697g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f102705d = true;
            }
        }
        if (contentValues.containsKey("permissionDemo")) {
            this.field_permissionDemo = contentValues.getAsInteger("permissionDemo").intValue() != 0;
            if (z) {
                this.f102706e = true;
            }
        }
        if (contentValues.containsKey("versiontime")) {
            this.field_versiontime = contentValues.getAsLong("versiontime").longValue();
            if (z) {
                this.f102707f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
