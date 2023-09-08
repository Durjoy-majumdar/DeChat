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

/* renamed from: xh.t6 */
public class C38667t6 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103775h;

    /* renamed from: i */
    public static final String[] f103776i = new String[0];

    /* renamed from: j */
    public static final int f103777j = -934495999;

    /* renamed from: n */
    public static final int f103778n = -1170417239;

    /* renamed from: o */
    public static final int f103779o = -892481550;

    /* renamed from: p */
    public static final int f103780p = -771625303;

    /* renamed from: q */
    public static final int f103781q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103782r = initAutoDBInfo(C38667t6.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38667t6> f103783s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103784d = true;

    /* renamed from: e */
    public boolean f103785e = true;

    /* renamed from: f */
    public boolean f103786f = true;
    public String field_ack_key;
    public long field_receive_time;
    public String field_reqkey;
    public int field_status;

    /* renamed from: g */
    public boolean f103787g = true;

    static {
        SingleTable singleTable = new SingleTable("OfflineOrderStatus");
        f103775h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("reqkey", "string", singleTable.getName(), "");
        new Column("ack_key", "string", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("receive_time", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "reqkey";
        mAutoDBInfo.colsMap.put("reqkey", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "reqkey";
        mAutoDBInfo.columns[1] = "ack_key";
        mAutoDBInfo.colsMap.put("ack_key", "TEXT");
        mAutoDBInfo.columns[2] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[3] = "receive_time";
        mAutoDBInfo.colsMap.put("receive_time", "LONG");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " reqkey TEXT PRIMARY KEY ,  ack_key TEXT,  status INTEGER,  receive_time LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38667t6)) {
            return false;
        }
        C38667t6 t6Var = (C38667t6) iAutoDBItem;
        return C46238a.m51546a(this.field_reqkey, t6Var.field_reqkey) && C46238a.m51546a(this.field_ack_key, t6Var.field_ack_key) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(t6Var.field_status)) && C46238a.m51546a(Long.valueOf(this.field_receive_time), Long.valueOf(t6Var.field_receive_time));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103777j == hashCode) {
                    try {
                        this.field_reqkey = cursor.getString(i);
                        this.f103784d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOfflineOrderStatus", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103778n == hashCode) {
                    try {
                        this.field_ack_key = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOfflineOrderStatus", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103779o == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOfflineOrderStatus", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103780p == hashCode) {
                    try {
                        this.field_receive_time = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOfflineOrderStatus", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103781q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103784d) {
            contentValues.put("reqkey", this.field_reqkey);
        }
        if (this.f103785e) {
            contentValues.put("ack_key", this.field_ack_key);
        }
        if (this.f103786f) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f103787g) {
            contentValues.put("receive_time", Long.valueOf(this.field_receive_time));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseOfflineOrderStatus", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OfflineOrderStatus ( " + f103782r.sql + ");");
        for (String add : f103776i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOfflineOrderStatus", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OfflineOrderStatus", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103782r, "OfflineOrderStatus", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOfflineOrderStatus", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OfflineOrderStatus", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOfflineOrderStatus", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103782r;
    }

    public String[] getIndexCreateSQL() {
        return f103776i;
    }

    public StorageObserverOwner<C38667t6> getObserverOwner() {
        return f103783s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_reqkey;
    }

    public SingleTable getTable() {
        return f103775h;
    }

    public String getTableName() {
        return f103775h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("reqkey")) {
            this.field_reqkey = contentValues.getAsString("reqkey");
            if (z) {
                this.f103784d = true;
            }
        }
        if (contentValues.containsKey("ack_key")) {
            this.field_ack_key = contentValues.getAsString("ack_key");
            if (z) {
                this.f103785e = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f103786f = true;
            }
        }
        if (contentValues.containsKey("receive_time")) {
            this.field_receive_time = contentValues.getAsLong("receive_time").longValue();
            if (z) {
                this.f103787g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
