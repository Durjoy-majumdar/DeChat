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

/* renamed from: xh.k5 */
public class C38597k5 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f102832j;

    /* renamed from: n */
    public static final String[] f102833n = new String[0];

    /* renamed from: o */
    public static final int f102834o = -276836809;

    /* renamed from: p */
    public static final int f102835p = -171676117;

    /* renamed from: q */
    public static final int f102836q = -1992012396;

    /* renamed from: r */
    public static final int f102837r = -892481550;

    /* renamed from: s */
    public static final int f102838s = 874543151;

    /* renamed from: t */
    public static final int f102839t = -1028990520;

    /* renamed from: u */
    public static final int f102840u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f102841v = initAutoDBInfo(C38597k5.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38597k5> f102842w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102843d = true;

    /* renamed from: e */
    public boolean f102844e = true;

    /* renamed from: f */
    public boolean f102845f = true;
    public long field_addressId;
    public long field_calltime;
    public long field_duration;
    public int field_phoneType;
    public String field_phonenumber;
    public int field_status;

    /* renamed from: g */
    public boolean f102846g = true;

    /* renamed from: h */
    public boolean f102847h = true;

    /* renamed from: i */
    public boolean f102848i = true;

    static {
        SingleTable singleTable = new SingleTable("IPCallRecord");
        f102832j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("phonenumber", "string", singleTable.getName(), "");
        new Column("calltime", "long", singleTable.getName(), "");
        new Column("duration", "long", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("addressId", "long", singleTable.getName(), "");
        new Column("phoneType", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "phonenumber";
        mAutoDBInfo.colsMap.put("phonenumber", "TEXT");
        mAutoDBInfo.columns[1] = "calltime";
        mAutoDBInfo.colsMap.put("calltime", "LONG");
        mAutoDBInfo.columns[2] = "duration";
        mAutoDBInfo.colsMap.put("duration", "LONG");
        mAutoDBInfo.columns[3] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[4] = "addressId";
        mAutoDBInfo.colsMap.put("addressId", "LONG default '-1' ");
        mAutoDBInfo.columns[5] = "phoneType";
        mAutoDBInfo.colsMap.put("phoneType", "INTEGER default '-1' ");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " phonenumber TEXT,  calltime LONG,  duration LONG,  status INTEGER,  addressId LONG default '-1' ,  phoneType INTEGER default '-1' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38597k5)) {
            return false;
        }
        C38597k5 k5Var = (C38597k5) iAutoDBItem;
        return C46238a.m51546a(this.field_phonenumber, k5Var.field_phonenumber) && C46238a.m51546a(Long.valueOf(this.field_calltime), Long.valueOf(k5Var.field_calltime)) && C46238a.m51546a(Long.valueOf(this.field_duration), Long.valueOf(k5Var.field_duration)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(k5Var.field_status)) && C46238a.m51546a(Long.valueOf(this.field_addressId), Long.valueOf(k5Var.field_addressId)) && C46238a.m51546a(Integer.valueOf(this.field_phoneType), Integer.valueOf(k5Var.field_phoneType));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102834o == hashCode) {
                    try {
                        this.field_phonenumber = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102835p == hashCode) {
                    try {
                        this.field_calltime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102836q == hashCode) {
                    try {
                        this.field_duration = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102837r == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102838s == hashCode) {
                    try {
                        this.field_addressId = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102839t == hashCode) {
                    try {
                        this.field_phoneType = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102840u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102843d) {
            contentValues.put("phonenumber", this.field_phonenumber);
        }
        if (this.f102844e) {
            contentValues.put("calltime", Long.valueOf(this.field_calltime));
        }
        if (this.f102845f) {
            contentValues.put("duration", Long.valueOf(this.field_duration));
        }
        if (this.f102846g) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f102847h) {
            contentValues.put("addressId", Long.valueOf(this.field_addressId));
        }
        if (this.f102848i) {
            contentValues.put("phoneType", Integer.valueOf(this.field_phoneType));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseIPCallRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS IPCallRecord ( " + f102841v.sql + ");");
        for (String add : f102833n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseIPCallRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("IPCallRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102841v, "IPCallRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseIPCallRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("IPCallRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseIPCallRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102841v;
    }

    public String[] getIndexCreateSQL() {
        return f102833n;
    }

    public StorageObserverOwner<C38597k5> getObserverOwner() {
        return f102842w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102832j;
    }

    public String getTableName() {
        return f102832j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("phonenumber")) {
            this.field_phonenumber = contentValues.getAsString("phonenumber");
            if (z) {
                this.f102843d = true;
            }
        }
        if (contentValues.containsKey("calltime")) {
            this.field_calltime = contentValues.getAsLong("calltime").longValue();
            if (z) {
                this.f102844e = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsLong("duration").longValue();
            if (z) {
                this.f102845f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f102846g = true;
            }
        }
        if (contentValues.containsKey("addressId")) {
            this.field_addressId = contentValues.getAsLong("addressId").longValue();
            if (z) {
                this.f102847h = true;
            }
        }
        if (contentValues.containsKey("phoneType")) {
            this.field_phoneType = contentValues.getAsInteger("phoneType").intValue();
            if (z) {
                this.f102848i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
