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

/* renamed from: xh.g7 */
public class C38568g7 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102371f;

    /* renamed from: g */
    public static final String[] f102372g = new String[0];

    /* renamed from: h */
    public static final int f102373h = 706349430;

    /* renamed from: i */
    public static final int f102374i = -1163811001;

    /* renamed from: j */
    public static final int f102375j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102376n = initAutoDBInfo(C38568g7.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38568g7> f102377o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102378d = true;

    /* renamed from: e */
    public boolean f102379e = true;
    public String field_cardUserId;
    public int field_retryCount;

    static {
        SingleTable singleTable = new SingleTable("PendingCardId");
        f102371f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("cardUserId", "string", singleTable.getName(), "");
        new Column("retryCount", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "cardUserId";
        mAutoDBInfo.colsMap.put("cardUserId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "cardUserId";
        mAutoDBInfo.columns[1] = "retryCount";
        mAutoDBInfo.colsMap.put("retryCount", "INTEGER");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " cardUserId TEXT PRIMARY KEY ,  retryCount INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38568g7)) {
            return false;
        }
        C38568g7 g7Var = (C38568g7) iAutoDBItem;
        return C46238a.m51546a(this.field_cardUserId, g7Var.field_cardUserId) && C46238a.m51546a(Integer.valueOf(this.field_retryCount), Integer.valueOf(g7Var.field_retryCount));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102373h == hashCode) {
                    try {
                        this.field_cardUserId = cursor.getString(i);
                        this.f102378d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePendingCardId", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102374i == hashCode) {
                    try {
                        this.field_retryCount = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePendingCardId", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102375j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102378d) {
            contentValues.put("cardUserId", this.field_cardUserId);
        }
        if (this.f102379e) {
            contentValues.put("retryCount", Integer.valueOf(this.field_retryCount));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BasePendingCardId", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PendingCardId ( " + f102376n.sql + ");");
        for (String add : f102372g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePendingCardId", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PendingCardId", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102376n, "PendingCardId", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePendingCardId", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PendingCardId", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePendingCardId", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102376n;
    }

    public String[] getIndexCreateSQL() {
        return f102372g;
    }

    public StorageObserverOwner<C38568g7> getObserverOwner() {
        return f102377o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_cardUserId;
    }

    public SingleTable getTable() {
        return f102371f;
    }

    public String getTableName() {
        return f102371f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("cardUserId")) {
            this.field_cardUserId = contentValues.getAsString("cardUserId");
            if (z) {
                this.f102378d = true;
            }
        }
        if (contentValues.containsKey("retryCount")) {
            this.field_retryCount = contentValues.getAsInteger("retryCount").intValue();
            if (z) {
                this.f102379e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
