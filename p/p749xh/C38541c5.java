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
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.c5 */
public class C38541c5 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f101962i;

    /* renamed from: j */
    public static final String[] f101963j = new String[0];

    /* renamed from: n */
    public static final int f101964n = 417550839;

    /* renamed from: o */
    public static final int f101965o = -938280377;

    /* renamed from: p */
    public static final int f101966p = -265713450;

    /* renamed from: q */
    public static final int f101967q = 3540684;

    /* renamed from: r */
    public static final int f101968r = 3536286;

    /* renamed from: s */
    public static final int f101969s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f101970t = initAutoDBInfo(C38541c5.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38541c5> f101971u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101972d = true;

    /* renamed from: e */
    public boolean f101973e = true;

    /* renamed from: f */
    public boolean f101974f = true;
    public String field_appusername;
    public String field_rankID;
    public int field_sort;
    public int field_step;
    public String field_username;

    /* renamed from: g */
    public boolean f101975g = true;

    /* renamed from: h */
    public boolean f101976h = true;

    static {
        SingleTable singleTable = new SingleTable("HardDeviceRankFollowInfo");
        f101962i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appusername", "string", singleTable.getName(), "");
        new Column("rankID", "string", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column(TPReportKeys.Common.COMMON_STEP, "int", singleTable.getName(), "");
        new Column("sort", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appusername";
        mAutoDBInfo.colsMap.put("appusername", "TEXT");
        mAutoDBInfo.columns[1] = "rankID";
        mAutoDBInfo.colsMap.put("rankID", "TEXT");
        mAutoDBInfo.columns[2] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[3] = TPReportKeys.Common.COMMON_STEP;
        mAutoDBInfo.colsMap.put(TPReportKeys.Common.COMMON_STEP, "INTEGER");
        mAutoDBInfo.columns[4] = "sort";
        mAutoDBInfo.colsMap.put("sort", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " appusername TEXT,  rankID TEXT,  username TEXT,  step INTEGER,  sort INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38541c5)) {
            return false;
        }
        C38541c5 c5Var = (C38541c5) iAutoDBItem;
        return C46238a.m51546a(this.field_appusername, c5Var.field_appusername) && C46238a.m51546a(this.field_rankID, c5Var.field_rankID) && C46238a.m51546a(this.field_username, c5Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_step), Integer.valueOf(c5Var.field_step)) && C46238a.m51546a(Integer.valueOf(this.field_sort), Integer.valueOf(c5Var.field_sort));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101964n == hashCode) {
                    try {
                        this.field_appusername = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101965o == hashCode) {
                    try {
                        this.field_rankID = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101966p == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101967q == hashCode) {
                    try {
                        this.field_step = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101968r == hashCode) {
                    try {
                        this.field_sort = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101969s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101972d) {
            contentValues.put("appusername", this.field_appusername);
        }
        if (this.f101973e) {
            contentValues.put("rankID", this.field_rankID);
        }
        if (this.f101974f) {
            contentValues.put("username", this.field_username);
        }
        if (this.f101975g) {
            contentValues.put(TPReportKeys.Common.COMMON_STEP, Integer.valueOf(this.field_step));
        }
        if (this.f101976h) {
            contentValues.put("sort", Integer.valueOf(this.field_sort));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS HardDeviceRankFollowInfo ( " + f101970t.sql + ");");
        for (String add : f101963j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("HardDeviceRankFollowInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101970t, "HardDeviceRankFollowInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("HardDeviceRankFollowInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101970t;
    }

    public String[] getIndexCreateSQL() {
        return f101963j;
    }

    public StorageObserverOwner<C38541c5> getObserverOwner() {
        return f101971u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101962i;
    }

    public String getTableName() {
        return f101962i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appusername")) {
            this.field_appusername = contentValues.getAsString("appusername");
            if (z) {
                this.f101972d = true;
            }
        }
        if (contentValues.containsKey("rankID")) {
            this.field_rankID = contentValues.getAsString("rankID");
            if (z) {
                this.f101973e = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f101974f = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.Common.COMMON_STEP)) {
            this.field_step = contentValues.getAsInteger(TPReportKeys.Common.COMMON_STEP).intValue();
            if (z) {
                this.f101975g = true;
            }
        }
        if (contentValues.containsKey("sort")) {
            this.field_sort = contentValues.getAsInteger("sort").intValue();
            if (z) {
                this.f101976h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
