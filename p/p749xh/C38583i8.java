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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.i8 */
public class C38583i8 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f102562i;

    /* renamed from: j */
    public static final String[] f102563j = new String[0];

    /* renamed from: n */
    public static final int f102564n = 553933994;

    /* renamed from: o */
    public static final int f102565o = -227989926;

    /* renamed from: p */
    public static final int f102566p = -573446013;

    /* renamed from: q */
    public static final int f102567q = 113759;

    /* renamed from: r */
    public static final int f102568r = -1163811001;

    /* renamed from: s */
    public static final int f102569s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f102570t = initAutoDBInfo(C38583i8.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38583i8> f102571u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102572d = true;

    /* renamed from: e */
    public boolean f102573e = true;

    /* renamed from: f */
    public boolean f102574f = true;
    public String field_card_id;
    public int field_retryCount;
    public long field_seq;
    public int field_state_flag;
    public long field_update_time;

    /* renamed from: g */
    public boolean f102575g = true;

    /* renamed from: h */
    public boolean f102576h = true;

    static {
        SingleTable singleTable = new SingleTable("ShareCardSyncItemInfo");
        f102562i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("card_id", "string", singleTable.getName(), "");
        new Column("state_flag", "int", singleTable.getName(), "");
        new Column("update_time", "long", singleTable.getName(), "");
        new Column(TPReportKeys.Common.COMMON_SEQ, "long", singleTable.getName(), "");
        new Column("retryCount", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "card_id";
        mAutoDBInfo.colsMap.put("card_id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "card_id";
        mAutoDBInfo.columns[1] = "state_flag";
        mAutoDBInfo.colsMap.put("state_flag", "INTEGER");
        mAutoDBInfo.columns[2] = "update_time";
        mAutoDBInfo.colsMap.put("update_time", "LONG");
        mAutoDBInfo.columns[3] = TPReportKeys.Common.COMMON_SEQ;
        mAutoDBInfo.colsMap.put(TPReportKeys.Common.COMMON_SEQ, "LONG");
        mAutoDBInfo.columns[4] = "retryCount";
        mAutoDBInfo.colsMap.put("retryCount", "INTEGER");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " card_id TEXT PRIMARY KEY ,  state_flag INTEGER,  update_time LONG,  seq LONG,  retryCount INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38583i8)) {
            return false;
        }
        C38583i8 i8Var = (C38583i8) iAutoDBItem;
        return C46238a.m51546a(this.field_card_id, i8Var.field_card_id) && C46238a.m51546a(Integer.valueOf(this.field_state_flag), Integer.valueOf(i8Var.field_state_flag)) && C46238a.m51546a(Long.valueOf(this.field_update_time), Long.valueOf(i8Var.field_update_time)) && C46238a.m51546a(Long.valueOf(this.field_seq), Long.valueOf(i8Var.field_seq)) && C46238a.m51546a(Integer.valueOf(this.field_retryCount), Integer.valueOf(i8Var.field_retryCount));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102564n == hashCode) {
                    try {
                        this.field_card_id = cursor.getString(i);
                        this.f102572d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardSyncItemInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102565o == hashCode) {
                    try {
                        this.field_state_flag = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardSyncItemInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102566p == hashCode) {
                    try {
                        this.field_update_time = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardSyncItemInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102567q == hashCode) {
                    try {
                        this.field_seq = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardSyncItemInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102568r == hashCode) {
                    try {
                        this.field_retryCount = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardSyncItemInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102569s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102572d) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f102573e) {
            contentValues.put("state_flag", Integer.valueOf(this.field_state_flag));
        }
        if (this.f102574f) {
            contentValues.put("update_time", Long.valueOf(this.field_update_time));
        }
        if (this.f102575g) {
            contentValues.put(TPReportKeys.Common.COMMON_SEQ, Long.valueOf(this.field_seq));
        }
        if (this.f102576h) {
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
            Log.m105920e("MicroMsg.SDK.BaseShareCardSyncItemInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ShareCardSyncItemInfo ( " + f102570t.sql + ");");
        for (String add : f102563j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseShareCardSyncItemInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ShareCardSyncItemInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102570t, "ShareCardSyncItemInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseShareCardSyncItemInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ShareCardSyncItemInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseShareCardSyncItemInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102570t;
    }

    public String[] getIndexCreateSQL() {
        return f102563j;
    }

    public StorageObserverOwner<C38583i8> getObserverOwner() {
        return f102571u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_card_id;
    }

    public SingleTable getTable() {
        return f102562i;
    }

    public String getTableName() {
        return f102562i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z) {
                this.f102572d = true;
            }
        }
        if (contentValues.containsKey("state_flag")) {
            this.field_state_flag = contentValues.getAsInteger("state_flag").intValue();
            if (z) {
                this.f102573e = true;
            }
        }
        if (contentValues.containsKey("update_time")) {
            this.field_update_time = contentValues.getAsLong("update_time").longValue();
            if (z) {
                this.f102574f = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.Common.COMMON_SEQ)) {
            this.field_seq = contentValues.getAsLong(TPReportKeys.Common.COMMON_SEQ).longValue();
            if (z) {
                this.f102575g = true;
            }
        }
        if (contentValues.containsKey("retryCount")) {
            this.field_retryCount = contentValues.getAsInteger("retryCount").intValue();
            if (z) {
                this.f102576h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
