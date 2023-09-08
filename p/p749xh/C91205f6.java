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

/* renamed from: xh.f6 */
public class C91205f6 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f261500n;

    /* renamed from: o */
    public static final String[] f261501o = new String[0];

    /* renamed from: p */
    public static final int f261502p = 93028124;

    /* renamed from: q */
    public static final int f261503q = 1676903135;

    /* renamed from: r */
    public static final int f261504r = -147044749;

    /* renamed from: s */
    public static final int f261505s = 689108018;

    /* renamed from: t */
    public static final int f261506t = 128434036;

    /* renamed from: u */
    public static final int f261507u = -295931082;

    /* renamed from: v */
    public static final int f261508v = -601216670;

    /* renamed from: w */
    public static final int f261509w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f261510x = initAutoDBInfo(C91205f6.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C91205f6> f261511y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f261512d = true;

    /* renamed from: e */
    public boolean f261513e = true;

    /* renamed from: f */
    public boolean f261514f = true;
    public String field_appId;
    public String field_bluetoothDeviceId;
    public String field_entryPackage;
    public boolean field_isBlocked;
    public long field_updateTime;
    public int field_versionType;
    public String field_wechatToken;

    /* renamed from: g */
    public boolean f261515g = true;

    /* renamed from: h */
    public boolean f261516h = true;

    /* renamed from: i */
    public boolean f261517i = true;

    /* renamed from: j */
    public boolean f261518j = true;

    static {
        SingleTable singleTable = new SingleTable("MonitoredBluetoothDeviceInfoV2");
        f261500n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("bluetoothDeviceId", "string", singleTable.getName(), "");
        new Column("wechatToken", "string", singleTable.getName(), "");
        new Column("versionType", "int", singleTable.getName(), "");
        new Column("entryPackage", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("isBlocked", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "bluetoothDeviceId";
        mAutoDBInfo.colsMap.put("bluetoothDeviceId", "TEXT");
        mAutoDBInfo.columns[2] = "wechatToken";
        mAutoDBInfo.colsMap.put("wechatToken", "TEXT");
        mAutoDBInfo.columns[3] = "versionType";
        mAutoDBInfo.colsMap.put("versionType", "INTEGER");
        mAutoDBInfo.columns[4] = "entryPackage";
        mAutoDBInfo.colsMap.put("entryPackage", "TEXT");
        mAutoDBInfo.columns[5] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[6] = "isBlocked";
        mAutoDBInfo.colsMap.put("isBlocked", "INTEGER default 'false' ");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  bluetoothDeviceId TEXT,  wechatToken TEXT,  versionType INTEGER,  entryPackage TEXT,  updateTime LONG,  isBlocked INTEGER default 'false' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C91205f6)) {
            return false;
        }
        C91205f6 f6Var = (C91205f6) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, f6Var.field_appId) && C46238a.m51546a(this.field_bluetoothDeviceId, f6Var.field_bluetoothDeviceId) && C46238a.m51546a(this.field_wechatToken, f6Var.field_wechatToken) && C46238a.m51546a(Integer.valueOf(this.field_versionType), Integer.valueOf(f6Var.field_versionType)) && C46238a.m51546a(this.field_entryPackage, f6Var.field_entryPackage) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(f6Var.field_updateTime)) && C46238a.m51546a(Boolean.valueOf(this.field_isBlocked), Boolean.valueOf(f6Var.field_isBlocked));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f261502p == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261503q == hashCode) {
                    try {
                        this.field_bluetoothDeviceId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261504r == hashCode) {
                    try {
                        this.field_wechatToken = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261505s == hashCode) {
                    try {
                        this.field_versionType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261506t == hashCode) {
                    try {
                        this.field_entryPackage = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261507u == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261508v == hashCode) {
                    try {
                        this.field_isBlocked = cursor.getInt(i) != 0;
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261509w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f261512d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f261513e) {
            contentValues.put("bluetoothDeviceId", this.field_bluetoothDeviceId);
        }
        if (this.f261514f) {
            contentValues.put("wechatToken", this.field_wechatToken);
        }
        if (this.f261515g) {
            contentValues.put("versionType", Integer.valueOf(this.field_versionType));
        }
        if (this.f261516h) {
            contentValues.put("entryPackage", this.field_entryPackage);
        }
        if (this.f261517i) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f261518j) {
            if (this.field_isBlocked) {
                contentValues.put("isBlocked", 1);
            } else {
                contentValues.put("isBlocked", 0);
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
            Log.m105920e("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MonitoredBluetoothDeviceInfoV2 ( " + f261510x.sql + ");");
        for (String add : f261501o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MonitoredBluetoothDeviceInfoV2", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f261510x, "MonitoredBluetoothDeviceInfoV2", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MonitoredBluetoothDeviceInfoV2", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f261510x;
    }

    public String[] getIndexCreateSQL() {
        return f261501o;
    }

    public StorageObserverOwner<C91205f6> getObserverOwner() {
        return f261511y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f261500n;
    }

    public String getTableName() {
        return f261500n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f261512d = true;
            }
        }
        if (contentValues.containsKey("bluetoothDeviceId")) {
            this.field_bluetoothDeviceId = contentValues.getAsString("bluetoothDeviceId");
            if (z) {
                this.f261513e = true;
            }
        }
        if (contentValues.containsKey("wechatToken")) {
            this.field_wechatToken = contentValues.getAsString("wechatToken");
            if (z) {
                this.f261514f = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z) {
                this.f261515g = true;
            }
        }
        if (contentValues.containsKey("entryPackage")) {
            this.field_entryPackage = contentValues.getAsString("entryPackage");
            if (z) {
                this.f261516h = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f261517i = true;
            }
        }
        if (contentValues.containsKey("isBlocked")) {
            this.field_isBlocked = contentValues.getAsInteger("isBlocked").intValue() != 0;
            if (z) {
                this.f261518j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
