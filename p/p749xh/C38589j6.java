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

/* renamed from: xh.j6 */
public class C38589j6 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f102638i;

    /* renamed from: j */
    public static final String[] f102639j = new String[0];

    /* renamed from: n */
    public static final int f102640n = 104191100;

    /* renamed from: o */
    public static final int f102641o = -1294411543;

    /* renamed from: p */
    public static final int f102642p = 1210381300;

    /* renamed from: q */
    public static final int f102643q = -2066225551;

    /* renamed from: r */
    public static final int f102644r = -892481550;

    /* renamed from: s */
    public static final int f102645s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f102646t = initAutoDBInfo(C38589j6.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38589j6> f102647u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102648d = true;

    /* renamed from: e */
    public boolean f102649e = true;

    /* renamed from: f */
    public boolean f102650f = true;
    public long field_msgId;
    public long field_msgSvrId;
    public long field_quotedMsgId;
    public long field_quotedMsgSvrId;
    public int field_status;

    /* renamed from: g */
    public boolean f102651g = true;

    /* renamed from: h */
    public boolean f102652h = true;

    static {
        SingleTable singleTable = new SingleTable("MsgQuote");
        f102638i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("msgSvrId", "long", singleTable.getName(), "");
        new Column("quotedMsgId", "long", singleTable.getName(), "");
        new Column("quotedMsgSvrId", "long", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG");
        mAutoDBInfo.columns[1] = "msgSvrId";
        mAutoDBInfo.colsMap.put("msgSvrId", "LONG");
        mAutoDBInfo.columns[2] = "quotedMsgId";
        mAutoDBInfo.colsMap.put("quotedMsgId", "LONG");
        mAutoDBInfo.columns[3] = "quotedMsgSvrId";
        mAutoDBInfo.colsMap.put("quotedMsgSvrId", "LONG");
        mAutoDBInfo.columns[4] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " msgId LONG,  msgSvrId LONG,  quotedMsgId LONG,  quotedMsgSvrId LONG,  status INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38589j6)) {
            return false;
        }
        C38589j6 j6Var = (C38589j6) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(j6Var.field_msgId)) && C46238a.m51546a(Long.valueOf(this.field_msgSvrId), Long.valueOf(j6Var.field_msgSvrId)) && C46238a.m51546a(Long.valueOf(this.field_quotedMsgId), Long.valueOf(j6Var.field_quotedMsgId)) && C46238a.m51546a(Long.valueOf(this.field_quotedMsgSvrId), Long.valueOf(j6Var.field_quotedMsgSvrId)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(j6Var.field_status));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102640n == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102641o == hashCode) {
                    try {
                        this.field_msgSvrId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102642p == hashCode) {
                    try {
                        this.field_quotedMsgId = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102643q == hashCode) {
                    try {
                        this.field_quotedMsgSvrId = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102644r == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102645s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102648d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f102649e) {
            contentValues.put("msgSvrId", Long.valueOf(this.field_msgSvrId));
        }
        if (this.f102650f) {
            contentValues.put("quotedMsgId", Long.valueOf(this.field_quotedMsgId));
        }
        if (this.f102651g) {
            contentValues.put("quotedMsgSvrId", Long.valueOf(this.field_quotedMsgSvrId));
        }
        if (this.f102652h) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMsgQuote", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MsgQuote ( " + f102646t.sql + ");");
        for (String add : f102639j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMsgQuote", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MsgQuote", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102646t, "MsgQuote", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMsgQuote", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MsgQuote", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMsgQuote", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102646t;
    }

    public String[] getIndexCreateSQL() {
        return f102639j;
    }

    public StorageObserverOwner<C38589j6> getObserverOwner() {
        return f102647u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102638i;
    }

    public String getTableName() {
        return f102638i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f102648d = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z) {
                this.f102649e = true;
            }
        }
        if (contentValues.containsKey("quotedMsgId")) {
            this.field_quotedMsgId = contentValues.getAsLong("quotedMsgId").longValue();
            if (z) {
                this.f102650f = true;
            }
        }
        if (contentValues.containsKey("quotedMsgSvrId")) {
            this.field_quotedMsgSvrId = contentValues.getAsLong("quotedMsgSvrId").longValue();
            if (z) {
                this.f102651g = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f102652h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
