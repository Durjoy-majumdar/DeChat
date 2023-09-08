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

/* renamed from: xh.g5 */
public class C38567g5 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102362f;

    /* renamed from: g */
    public static final String[] f102363g = new String[0];

    /* renamed from: h */
    public static final int f102364h = 1353538740;

    /* renamed from: i */
    public static final int f102365i = 104191100;

    /* renamed from: j */
    public static final int f102366j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102367n = initAutoDBInfo(C38567g5.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38567g5> f102368o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102369d = true;

    /* renamed from: e */
    public boolean f102370e = true;
    public long field_msgId;
    public String field_payMsgId;

    static {
        SingleTable singleTable = new SingleTable("HoneyPayMsgRecord");
        f102362f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("payMsgId", "string", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "payMsgId";
        mAutoDBInfo.colsMap.put("payMsgId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "payMsgId";
        mAutoDBInfo.columns[1] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " payMsgId TEXT PRIMARY KEY ,  msgId LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38567g5)) {
            return false;
        }
        C38567g5 g5Var = (C38567g5) iAutoDBItem;
        return C46238a.m51546a(this.field_payMsgId, g5Var.field_payMsgId) && C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(g5Var.field_msgId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102364h == hashCode) {
                    try {
                        this.field_payMsgId = cursor.getString(i);
                        this.f102369d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHoneyPayMsgRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102365i == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHoneyPayMsgRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102366j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102369d) {
            contentValues.put("payMsgId", this.field_payMsgId);
        }
        if (this.f102370e) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseHoneyPayMsgRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS HoneyPayMsgRecord ( " + f102367n.sql + ");");
        for (String add : f102363g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseHoneyPayMsgRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("HoneyPayMsgRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102367n, "HoneyPayMsgRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseHoneyPayMsgRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("HoneyPayMsgRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseHoneyPayMsgRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102367n;
    }

    public String[] getIndexCreateSQL() {
        return f102363g;
    }

    public StorageObserverOwner<C38567g5> getObserverOwner() {
        return f102368o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_payMsgId;
    }

    public SingleTable getTable() {
        return f102362f;
    }

    public String getTableName() {
        return f102362f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("payMsgId")) {
            this.field_payMsgId = contentValues.getAsString("payMsgId");
            if (z) {
                this.f102369d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f102370e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
