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

/* renamed from: xh.r6 */
public class C38651r6 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103507h;

    /* renamed from: i */
    public static final String[] f103508i = {"CREATE INDEX IF NOT EXISTS notifymessagerecordTalkerIndex ON NotifyMessageRecord(talker)"};

    /* renamed from: j */
    public static final int f103509j = 104191100;

    /* renamed from: n */
    public static final int f103510n = -881080743;

    /* renamed from: o */
    public static final int f103511o = 1369213417;

    /* renamed from: p */
    public static final int f103512p = -1331913276;

    /* renamed from: q */
    public static final int f103513q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103514r = initAutoDBInfo(C38651r6.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38651r6> f103515s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103516d = true;

    /* renamed from: e */
    public boolean f103517e = true;

    /* renamed from: f */
    public boolean f103518f = true;
    public long field_createTime;
    public String field_digest;
    public long field_msgId;
    public String field_talker;

    /* renamed from: g */
    public boolean f103519g = true;

    static {
        SingleTable singleTable = new SingleTable("NotifyMessageRecord");
        f103507h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("digest", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msgId";
        mAutoDBInfo.columns[1] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT");
        mAutoDBInfo.columns[2] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[3] = "digest";
        mAutoDBInfo.colsMap.put("digest", "TEXT");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " msgId LONG PRIMARY KEY ,  talker TEXT,  createTime LONG,  digest TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38651r6)) {
            return false;
        }
        C38651r6 r6Var = (C38651r6) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(r6Var.field_msgId)) && C46238a.m51546a(this.field_talker, r6Var.field_talker) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(r6Var.field_createTime)) && C46238a.m51546a(this.field_digest, r6Var.field_digest);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103509j == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                        this.f103516d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNotifyMessageRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103510n == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNotifyMessageRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103511o == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNotifyMessageRecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103512p == hashCode) {
                    try {
                        this.field_digest = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNotifyMessageRecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103513q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103516d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f103517e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f103518f) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f103519g) {
            contentValues.put("digest", this.field_digest);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseNotifyMessageRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS NotifyMessageRecord ( " + f103514r.sql + ");");
        for (String add : f103508i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseNotifyMessageRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("NotifyMessageRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103514r, "NotifyMessageRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseNotifyMessageRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("NotifyMessageRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseNotifyMessageRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103514r;
    }

    public String[] getIndexCreateSQL() {
        return f103508i;
    }

    public StorageObserverOwner<C38651r6> getObserverOwner() {
        return f103515s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_msgId);
    }

    public SingleTable getTable() {
        return f103507h;
    }

    public String getTableName() {
        return f103507h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f103516d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f103517e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f103518f = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z) {
                this.f103519g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
