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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.a8 */
public class C38524a8 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f101665i;

    /* renamed from: j */
    public static final String[] f101666j = new String[0];

    /* renamed from: n */
    public static final int f101667n = 115792;

    /* renamed from: o */
    public static final int f101668o = 3373707;

    /* renamed from: p */
    public static final int f101669p = 782144144;

    /* renamed from: q */
    public static final int f101670q = 1370166729;

    /* renamed from: r */
    public static final int f101671r = -1012222381;

    /* renamed from: s */
    public static final int f101672s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f101673t = initAutoDBInfo(C38524a8.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38524a8> f101674u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101675d = true;

    /* renamed from: e */
    public boolean f101676e = true;

    /* renamed from: f */
    public boolean f101677f = true;
    public long field_createtime;
    public String field_devicetype;
    public String field_name;
    public boolean field_online;
    public String field_uid;

    /* renamed from: g */
    public boolean f101678g = true;

    /* renamed from: h */
    public boolean f101679h = true;

    static {
        SingleTable singleTable = new SingleTable("SafeDeviceInfo");
        f101665i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("uid", "string", singleTable.getName(), "");
        new Column("name", "string", singleTable.getName(), "");
        new Column("devicetype", "string", singleTable.getName(), "");
        new Column("createtime", "long", singleTable.getName(), "");
        new Column(TPReportKeys.Common.COMMON_ONLINE, DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "uid";
        mAutoDBInfo.colsMap.put("uid", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "uid";
        mAutoDBInfo.columns[1] = "name";
        mAutoDBInfo.colsMap.put("name", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "devicetype";
        mAutoDBInfo.colsMap.put("devicetype", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "createtime";
        mAutoDBInfo.colsMap.put("createtime", "LONG default '0' ");
        mAutoDBInfo.columns[4] = TPReportKeys.Common.COMMON_ONLINE;
        mAutoDBInfo.colsMap.put(TPReportKeys.Common.COMMON_ONLINE, "INTEGER default 'false' ");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " uid TEXT default ''  PRIMARY KEY ,  name TEXT default '' ,  devicetype TEXT default '' ,  createtime LONG default '0' ,  online INTEGER default 'false' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38524a8)) {
            return false;
        }
        C38524a8 a8Var = (C38524a8) iAutoDBItem;
        return C46238a.m51546a(this.field_uid, a8Var.field_uid) && C46238a.m51546a(this.field_name, a8Var.field_name) && C46238a.m51546a(this.field_devicetype, a8Var.field_devicetype) && C46238a.m51546a(Long.valueOf(this.field_createtime), Long.valueOf(a8Var.field_createtime)) && C46238a.m51546a(Boolean.valueOf(this.field_online), Boolean.valueOf(a8Var.field_online));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101667n == hashCode) {
                    try {
                        this.field_uid = cursor.getString(i);
                        this.f101675d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101668o == hashCode) {
                    try {
                        this.field_name = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101669p == hashCode) {
                    try {
                        this.field_devicetype = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101670q == hashCode) {
                    try {
                        this.field_createtime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101671r == hashCode) {
                    try {
                        this.field_online = cursor.getInt(i) != 0;
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101672s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_uid == null) {
            this.field_uid = "";
        }
        if (this.f101675d) {
            contentValues.put("uid", this.field_uid);
        }
        if (this.field_name == null) {
            this.field_name = "";
        }
        if (this.f101676e) {
            contentValues.put("name", this.field_name);
        }
        if (this.field_devicetype == null) {
            this.field_devicetype = "";
        }
        if (this.f101677f) {
            contentValues.put("devicetype", this.field_devicetype);
        }
        if (this.f101678g) {
            contentValues.put("createtime", Long.valueOf(this.field_createtime));
        }
        if (this.f101679h) {
            if (this.field_online) {
                contentValues.put(TPReportKeys.Common.COMMON_ONLINE, 1);
            } else {
                contentValues.put(TPReportKeys.Common.COMMON_ONLINE, 0);
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
            Log.m105920e("MicroMsg.SDK.BaseSafeDeviceInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SafeDeviceInfo ( " + f101673t.sql + ");");
        for (String add : f101666j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSafeDeviceInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SafeDeviceInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101673t, "SafeDeviceInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSafeDeviceInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SafeDeviceInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSafeDeviceInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101673t;
    }

    public String[] getIndexCreateSQL() {
        return f101666j;
    }

    public StorageObserverOwner<C38524a8> getObserverOwner() {
        return f101674u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_uid;
    }

    public SingleTable getTable() {
        return f101665i;
    }

    public String getTableName() {
        return f101665i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("uid")) {
            this.field_uid = contentValues.getAsString("uid");
            if (z) {
                this.f101675d = true;
            }
        }
        if (contentValues.containsKey("name")) {
            this.field_name = contentValues.getAsString("name");
            if (z) {
                this.f101676e = true;
            }
        }
        if (contentValues.containsKey("devicetype")) {
            this.field_devicetype = contentValues.getAsString("devicetype");
            if (z) {
                this.f101677f = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z) {
                this.f101678g = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.Common.COMMON_ONLINE)) {
            this.field_online = contentValues.getAsInteger(TPReportKeys.Common.COMMON_ONLINE).intValue() != 0;
            if (z) {
                this.f101679h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
