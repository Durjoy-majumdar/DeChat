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

/* renamed from: xh.y0 */
public class C38703y0 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f104303f;

    /* renamed from: g */
    public static final String[] f104304g = new String[0];

    /* renamed from: h */
    public static final int f104305h = -1100816956;

    /* renamed from: i */
    public static final int f104306i = -1835527912;

    /* renamed from: j */
    public static final int f104307j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f104308n = initAutoDBInfo(C38703y0.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38703y0> f104309o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104310d = false;

    /* renamed from: e */
    public boolean f104311e = false;
    private int field_Priority;
    private long field_Quota = 0;

    static {
        SingleTable singleTable = new SingleTable("C2CQuotaQueryDBInfo");
        f104303f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("Priority", "int", singleTable.getName(), "");
        new Column("sum(C2CPreDownloadDBInfo.LastLen)", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "Priority";
        mAutoDBInfo.colsMap.put("Priority", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "Priority";
        mAutoDBInfo.columns[1] = "sum(C2CPreDownloadDBInfo.LastLen)";
        mAutoDBInfo.colsMap.put("sum(C2CPreDownloadDBInfo.LastLen)", "LONG default '0' ");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " Priority INTEGER PRIMARY KEY ,  sum(C2CPreDownloadDBInfo.LastLen) LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38703y0)) {
            return false;
        }
        C38703y0 y0Var = (C38703y0) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_Priority), Integer.valueOf(y0Var.field_Priority)) && C46238a.m51546a(Long.valueOf(this.field_Quota), Long.valueOf(y0Var.field_Quota));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104305h == hashCode) {
                    try {
                        this.field_Priority = cursor.getInt(i);
                        this.f104310d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104306i == hashCode) {
                    try {
                        this.field_Quota = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104307j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104310d) {
            contentValues.put("Priority", Integer.valueOf(this.field_Priority));
        }
        if (this.f104311e) {
            contentValues.put("sum(C2CPreDownloadDBInfo.LastLen)", Long.valueOf(this.field_Quota));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS C2CQuotaQueryDBInfo ( " + f104308n.sql + ");");
        for (String add : f104304g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("C2CQuotaQueryDBInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104308n, "C2CQuotaQueryDBInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("C2CQuotaQueryDBInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104308n;
    }

    public String[] getIndexCreateSQL() {
        return f104304g;
    }

    public StorageObserverOwner<C38703y0> getObserverOwner() {
        return f104309o;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_Priority);
    }

    public SingleTable getTable() {
        return f104303f;
    }

    public String getTableName() {
        return f104303f.getName();
    }

    /* renamed from: l2 */
    public int mo61731l2() {
        return this.field_Priority;
    }

    /* renamed from: m2 */
    public long mo61732m2() {
        return this.field_Quota;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("Priority")) {
            this.field_Priority = contentValues.getAsInteger("Priority").intValue();
            if (z) {
                this.f104310d = true;
            }
        }
        if (contentValues.containsKey("sum(C2CPreDownloadDBInfo.LastLen)")) {
            this.field_Quota = contentValues.getAsLong("sum(C2CPreDownloadDBInfo.LastLen)").longValue();
            if (z) {
                this.f104311e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
