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

/* renamed from: xh.m5 */
public class C38611m5 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103005f;

    /* renamed from: g */
    public static final String[] f103006g = new String[0];

    /* renamed from: h */
    public static final int f103007h = 103148415;

    /* renamed from: i */
    public static final int f103008i = 973469816;

    /* renamed from: j */
    public static final int f103009j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103010n = initAutoDBInfo(C38611m5.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38611m5> f103011o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103012d = true;

    /* renamed from: e */
    public boolean f103013e = true;
    public long field_liftTime;
    public int field_logId;

    static {
        SingleTable singleTable = new SingleTable("JsLogBlockList");
        f103005f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("logId", "int", singleTable.getName(), "");
        new Column("liftTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "logId";
        mAutoDBInfo.colsMap.put("logId", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "logId";
        mAutoDBInfo.columns[1] = "liftTime";
        mAutoDBInfo.colsMap.put("liftTime", "LONG");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " logId INTEGER PRIMARY KEY ,  liftTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38611m5)) {
            return false;
        }
        C38611m5 m5Var = (C38611m5) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_logId), Integer.valueOf(m5Var.field_logId)) && C46238a.m51546a(Long.valueOf(this.field_liftTime), Long.valueOf(m5Var.field_liftTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103007h == hashCode) {
                    try {
                        this.field_logId = cursor.getInt(i);
                        this.f103012d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseJsLogBlockList", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103008i == hashCode) {
                    try {
                        this.field_liftTime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseJsLogBlockList", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103009j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103012d) {
            contentValues.put("logId", Integer.valueOf(this.field_logId));
        }
        if (this.f103013e) {
            contentValues.put("liftTime", Long.valueOf(this.field_liftTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseJsLogBlockList", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS JsLogBlockList ( " + f103010n.sql + ");");
        for (String add : f103006g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseJsLogBlockList", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("JsLogBlockList", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103010n, "JsLogBlockList", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseJsLogBlockList", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("JsLogBlockList", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseJsLogBlockList", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103010n;
    }

    public String[] getIndexCreateSQL() {
        return f103006g;
    }

    public StorageObserverOwner<C38611m5> getObserverOwner() {
        return f103011o;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_logId);
    }

    public SingleTable getTable() {
        return f103005f;
    }

    public String getTableName() {
        return f103005f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("logId")) {
            this.field_logId = contentValues.getAsInteger("logId").intValue();
            if (z) {
                this.f103012d = true;
            }
        }
        if (contentValues.containsKey("liftTime")) {
            this.field_liftTime = contentValues.getAsLong("liftTime").longValue();
            if (z) {
                this.f103013e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
