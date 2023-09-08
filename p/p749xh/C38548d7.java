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

/* renamed from: xh.d7 */
public class C38548d7 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102075g;

    /* renamed from: h */
    public static final String[] f102076h = new String[0];

    /* renamed from: i */
    public static final int f102077i = 104191100;

    /* renamed from: j */
    public static final int f102078j = 1899068223;

    /* renamed from: n */
    public static final int f102079n = -1180158496;

    /* renamed from: o */
    public static final int f102080o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102081p = initAutoDBInfo(C38548d7.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38548d7> f102082q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102083d = true;

    /* renamed from: e */
    public boolean f102084e = true;

    /* renamed from: f */
    public boolean f102085f = true;
    public String field_isRead;
    public String field_msgContentXml;
    public String field_msgId;

    static {
        SingleTable singleTable = new SingleTable("OrderCommonMsgXml");
        f102075g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgId", "string", singleTable.getName(), "");
        new Column("msgContentXml", "string", singleTable.getName(), "");
        new Column("isRead", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msgId";
        mAutoDBInfo.columns[1] = "msgContentXml";
        mAutoDBInfo.colsMap.put("msgContentXml", "TEXT");
        mAutoDBInfo.columns[2] = "isRead";
        mAutoDBInfo.colsMap.put("isRead", "TEXT");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " msgId TEXT PRIMARY KEY ,  msgContentXml TEXT,  isRead TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38548d7)) {
            return false;
        }
        C38548d7 d7Var = (C38548d7) iAutoDBItem;
        return C46238a.m51546a(this.field_msgId, d7Var.field_msgId) && C46238a.m51546a(this.field_msgContentXml, d7Var.field_msgContentXml) && C46238a.m51546a(this.field_isRead, d7Var.field_isRead);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102077i == hashCode) {
                    try {
                        this.field_msgId = cursor.getString(i);
                        this.f102083d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOrderCommonMsgXml", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102078j == hashCode) {
                    try {
                        this.field_msgContentXml = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOrderCommonMsgXml", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102079n == hashCode) {
                    try {
                        this.field_isRead = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOrderCommonMsgXml", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102080o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102083d) {
            contentValues.put("msgId", this.field_msgId);
        }
        if (this.f102084e) {
            contentValues.put("msgContentXml", this.field_msgContentXml);
        }
        if (this.f102085f) {
            contentValues.put("isRead", this.field_isRead);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseOrderCommonMsgXml", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OrderCommonMsgXml ( " + f102081p.sql + ");");
        for (String add : f102076h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOrderCommonMsgXml", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OrderCommonMsgXml", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102081p, "OrderCommonMsgXml", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOrderCommonMsgXml", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OrderCommonMsgXml", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOrderCommonMsgXml", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102081p;
    }

    public String[] getIndexCreateSQL() {
        return f102076h;
    }

    public StorageObserverOwner<C38548d7> getObserverOwner() {
        return f102082q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_msgId;
    }

    public SingleTable getTable() {
        return f102075g;
    }

    public String getTableName() {
        return f102075g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsString("msgId");
            if (z) {
                this.f102083d = true;
            }
        }
        if (contentValues.containsKey("msgContentXml")) {
            this.field_msgContentXml = contentValues.getAsString("msgContentXml");
            if (z) {
                this.f102084e = true;
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.field_isRead = contentValues.getAsString("isRead");
            if (z) {
                this.f102085f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
