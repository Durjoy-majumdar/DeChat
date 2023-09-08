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

/* renamed from: xh.f5 */
public class C38559f5 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f102252i;

    /* renamed from: j */
    public static final String[] f102253j = new String[0];

    /* renamed from: n */
    public static final int f102254n = 1109191185;

    /* renamed from: o */
    public static final int f102255o = 781190832;

    /* renamed from: p */
    public static final int f102256p = 69737614;

    /* renamed from: q */
    public static final int f102257q = 1638765110;

    /* renamed from: r */
    public static final int f102258r = -707526070;

    /* renamed from: s */
    public static final int f102259s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f102260t = initAutoDBInfo(C38559f5.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38559f5> f102261u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102262d = true;

    /* renamed from: e */
    public boolean f102263e = true;

    /* renamed from: f */
    public boolean f102264f = true;
    public String field_deviceId;
    public int field_deviceType;
    public String field_iconUrl;
    public String field_nickName;
    public String field_supportMsgTypeList;

    /* renamed from: g */
    public boolean f102265g = true;

    /* renamed from: h */
    public boolean f102266h = true;

    static {
        SingleTable singleTable = new SingleTable("HardIotDeviceInfo");
        f102252i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("deviceId", "string", singleTable.getName(), "");
        new Column("deviceType", "int", singleTable.getName(), "");
        new Column("nickName", "string", singleTable.getName(), "");
        new Column("iconUrl", "string", singleTable.getName(), "");
        new Column("supportMsgTypeList", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "deviceId";
        mAutoDBInfo.colsMap.put("deviceId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "deviceId";
        mAutoDBInfo.columns[1] = "deviceType";
        mAutoDBInfo.colsMap.put("deviceType", "INTEGER");
        mAutoDBInfo.columns[2] = "nickName";
        mAutoDBInfo.colsMap.put("nickName", "TEXT");
        mAutoDBInfo.columns[3] = "iconUrl";
        mAutoDBInfo.colsMap.put("iconUrl", "TEXT");
        mAutoDBInfo.columns[4] = "supportMsgTypeList";
        mAutoDBInfo.colsMap.put("supportMsgTypeList", "TEXT");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " deviceId TEXT PRIMARY KEY ,  deviceType INTEGER,  nickName TEXT,  iconUrl TEXT,  supportMsgTypeList TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38559f5)) {
            return false;
        }
        C38559f5 f5Var = (C38559f5) iAutoDBItem;
        return C46238a.m51546a(this.field_deviceId, f5Var.field_deviceId) && C46238a.m51546a(Integer.valueOf(this.field_deviceType), Integer.valueOf(f5Var.field_deviceType)) && C46238a.m51546a(this.field_nickName, f5Var.field_nickName) && C46238a.m51546a(this.field_iconUrl, f5Var.field_iconUrl) && C46238a.m51546a(this.field_supportMsgTypeList, f5Var.field_supportMsgTypeList);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102254n == hashCode) {
                    try {
                        this.field_deviceId = cursor.getString(i);
                        this.f102262d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102255o == hashCode) {
                    try {
                        this.field_deviceType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102256p == hashCode) {
                    try {
                        this.field_nickName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102257q == hashCode) {
                    try {
                        this.field_iconUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102258r == hashCode) {
                    try {
                        this.field_supportMsgTypeList = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102259s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102262d) {
            contentValues.put("deviceId", this.field_deviceId);
        }
        if (this.f102263e) {
            contentValues.put("deviceType", Integer.valueOf(this.field_deviceType));
        }
        if (this.f102264f) {
            contentValues.put("nickName", this.field_nickName);
        }
        if (this.f102265g) {
            contentValues.put("iconUrl", this.field_iconUrl);
        }
        if (this.f102266h) {
            contentValues.put("supportMsgTypeList", this.field_supportMsgTypeList);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseHardIotDeviceInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS HardIotDeviceInfo ( " + f102260t.sql + ");");
        for (String add : f102253j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseHardIotDeviceInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("HardIotDeviceInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102260t, "HardIotDeviceInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseHardIotDeviceInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("HardIotDeviceInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseHardIotDeviceInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102260t;
    }

    public String[] getIndexCreateSQL() {
        return f102253j;
    }

    public StorageObserverOwner<C38559f5> getObserverOwner() {
        return f102261u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_deviceId;
    }

    public SingleTable getTable() {
        return f102252i;
    }

    public String getTableName() {
        return f102252i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("deviceId")) {
            this.field_deviceId = contentValues.getAsString("deviceId");
            if (z) {
                this.f102262d = true;
            }
        }
        if (contentValues.containsKey("deviceType")) {
            this.field_deviceType = contentValues.getAsInteger("deviceType").intValue();
            if (z) {
                this.f102263e = true;
            }
        }
        if (contentValues.containsKey("nickName")) {
            this.field_nickName = contentValues.getAsString("nickName");
            if (z) {
                this.f102264f = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.field_iconUrl = contentValues.getAsString("iconUrl");
            if (z) {
                this.f102265g = true;
            }
        }
        if (contentValues.containsKey("supportMsgTypeList")) {
            this.field_supportMsgTypeList = contentValues.getAsString("supportMsgTypeList");
            if (z) {
                this.f102266h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
