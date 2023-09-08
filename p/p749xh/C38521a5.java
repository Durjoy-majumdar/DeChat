package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.measurement.AppMeasurement;
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

/* renamed from: xh.a5 */
public class C38521a5 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f101632i;

    /* renamed from: j */
    public static final String[] f101633j = new String[0];

    /* renamed from: n */
    public static final int f101634n = -938280377;

    /* renamed from: o */
    public static final int f101635o = 417550839;

    /* renamed from: p */
    public static final int f101636p = -265713450;

    /* renamed from: q */
    public static final int f101637q = 55126294;

    /* renamed from: r */
    public static final int f101638r = 1103716175;

    /* renamed from: s */
    public static final int f101639s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f101640t = initAutoDBInfo(C38521a5.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38521a5> f101641u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101642d = true;

    /* renamed from: e */
    public boolean f101643e = true;

    /* renamed from: f */
    public boolean f101644f = true;
    public String field_appusername;
    public String field_liketips;
    public String field_rankID;
    public int field_timestamp;
    public String field_username;

    /* renamed from: g */
    public boolean f101645g = true;

    /* renamed from: h */
    public boolean f101646h = true;

    static {
        SingleTable singleTable = new SingleTable("HardDeviceLikeUser");
        f101632i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("rankID", "string", singleTable.getName(), "");
        new Column("appusername", "string", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "int", singleTable.getName(), "");
        new Column("liketips", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "rankID";
        mAutoDBInfo.colsMap.put("rankID", "TEXT");
        mAutoDBInfo.columns[1] = "appusername";
        mAutoDBInfo.colsMap.put("appusername", "TEXT");
        mAutoDBInfo.columns[2] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[3] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = "liketips";
        mAutoDBInfo.colsMap.put("liketips", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " rankID TEXT,  appusername TEXT,  username TEXT,  timestamp INTEGER default '0' ,  liketips TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38521a5)) {
            return false;
        }
        C38521a5 a5Var = (C38521a5) iAutoDBItem;
        return C46238a.m51546a(this.field_rankID, a5Var.field_rankID) && C46238a.m51546a(this.field_appusername, a5Var.field_appusername) && C46238a.m51546a(this.field_username, a5Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_timestamp), Integer.valueOf(a5Var.field_timestamp)) && C46238a.m51546a(this.field_liketips, a5Var.field_liketips);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101634n == hashCode) {
                    try {
                        this.field_rankID = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceLikeUser", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101635o == hashCode) {
                    try {
                        this.field_appusername = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceLikeUser", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101636p == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceLikeUser", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101637q == hashCode) {
                    try {
                        this.field_timestamp = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceLikeUser", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101638r == hashCode) {
                    try {
                        this.field_liketips = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceLikeUser", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101639s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101642d) {
            contentValues.put("rankID", this.field_rankID);
        }
        if (this.f101643e) {
            contentValues.put("appusername", this.field_appusername);
        }
        if (this.f101644f) {
            contentValues.put("username", this.field_username);
        }
        if (this.f101645g) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Integer.valueOf(this.field_timestamp));
        }
        if (this.field_liketips == null) {
            this.field_liketips = "";
        }
        if (this.f101646h) {
            contentValues.put("liketips", this.field_liketips);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseHardDeviceLikeUser", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS HardDeviceLikeUser ( " + f101640t.sql + ");");
        for (String add : f101633j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceLikeUser", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("HardDeviceLikeUser", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101640t, "HardDeviceLikeUser", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceLikeUser", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("HardDeviceLikeUser", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseHardDeviceLikeUser", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101640t;
    }

    public String[] getIndexCreateSQL() {
        return f101633j;
    }

    public StorageObserverOwner<C38521a5> getObserverOwner() {
        return f101641u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101632i;
    }

    public String getTableName() {
        return f101632i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("rankID")) {
            this.field_rankID = contentValues.getAsString("rankID");
            if (z) {
                this.f101642d = true;
            }
        }
        if (contentValues.containsKey("appusername")) {
            this.field_appusername = contentValues.getAsString("appusername");
            if (z) {
                this.f101643e = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f101644f = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsInteger(AppMeasurement.Param.TIMESTAMP).intValue();
            if (z) {
                this.f101645g = true;
            }
        }
        if (contentValues.containsKey("liketips")) {
            this.field_liketips = contentValues.getAsString("liketips");
            if (z) {
                this.f101646h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
