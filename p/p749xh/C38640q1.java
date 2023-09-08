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

/* renamed from: xh.q1 */
public class C38640q1 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103357f;

    /* renamed from: g */
    public static final String[] f103358g = new String[0];

    /* renamed from: h */
    public static final int f103359h = 104191100;

    /* renamed from: i */
    public static final int f103360i = -1727368602;

    /* renamed from: j */
    public static final int f103361j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103362n = initAutoDBInfo(C38640q1.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38640q1> f103363o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103364d = true;

    /* renamed from: e */
    public boolean f103365e = true;
    public long field_msgId;
    public String field_transferId;

    static {
        SingleTable singleTable = new SingleTable("DelayTransferRecord");
        f103357f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("transferId", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msgId";
        mAutoDBInfo.columns[1] = "transferId";
        mAutoDBInfo.colsMap.put("transferId", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " msgId LONG PRIMARY KEY ,  transferId TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38640q1)) {
            return false;
        }
        C38640q1 q1Var = (C38640q1) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(q1Var.field_msgId)) && C46238a.m51546a(this.field_transferId, q1Var.field_transferId);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103359h == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                        this.f103364d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDelayTransferRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103360i == hashCode) {
                    try {
                        this.field_transferId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDelayTransferRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103361j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103364d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f103365e) {
            contentValues.put("transferId", this.field_transferId);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseDelayTransferRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS DelayTransferRecord ( " + f103362n.sql + ");");
        for (String add : f103358g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseDelayTransferRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("DelayTransferRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103362n, "DelayTransferRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseDelayTransferRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("DelayTransferRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseDelayTransferRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103362n;
    }

    public String[] getIndexCreateSQL() {
        return f103358g;
    }

    public StorageObserverOwner<C38640q1> getObserverOwner() {
        return f103363o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_msgId);
    }

    public SingleTable getTable() {
        return f103357f;
    }

    public String getTableName() {
        return f103357f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f103364d = true;
            }
        }
        if (contentValues.containsKey("transferId")) {
            this.field_transferId = contentValues.getAsString("transferId");
            if (z) {
                this.f103365e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
