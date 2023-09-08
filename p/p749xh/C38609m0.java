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

/* renamed from: xh.m0 */
public class C38609m0 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f102983h;

    /* renamed from: i */
    public static final String[] f102984i = new String[0];

    /* renamed from: j */
    public static final int f102985j = 664879766;

    /* renamed from: n */
    public static final int f102986n = 116079;

    /* renamed from: o */
    public static final int f102987o = 1931371041;

    /* renamed from: p */
    public static final int f102988p = -1438237525;

    /* renamed from: q */
    public static final int f102989q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f102990r = initAutoDBInfo(C38609m0.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38609m0> f102991s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102992d = true;

    /* renamed from: e */
    public boolean f102993e = true;

    /* renamed from: f */
    public boolean f102994f = true;
    public int field_aScene;
    public long field_appMsgReportContextId;
    public long field_reportTime;
    public String field_url;

    /* renamed from: g */
    public boolean f102995g = true;

    static {
        SingleTable singleTable = new SingleTable("BizAppMsgReportContext");
        f102983h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appMsgReportContextId", "long", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("reportTime", "long", singleTable.getName(), "");
        new Column("aScene", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appMsgReportContextId";
        mAutoDBInfo.colsMap.put("appMsgReportContextId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appMsgReportContextId";
        mAutoDBInfo.columns[1] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[2] = "reportTime";
        mAutoDBInfo.colsMap.put("reportTime", "LONG");
        mAutoDBInfo.columns[3] = "aScene";
        mAutoDBInfo.colsMap.put("aScene", "INTEGER");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " appMsgReportContextId LONG PRIMARY KEY ,  url TEXT,  reportTime LONG,  aScene INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38609m0)) {
            return false;
        }
        C38609m0 m0Var = (C38609m0) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_appMsgReportContextId), Long.valueOf(m0Var.field_appMsgReportContextId)) && C46238a.m51546a(this.field_url, m0Var.field_url) && C46238a.m51546a(Long.valueOf(this.field_reportTime), Long.valueOf(m0Var.field_reportTime)) && C46238a.m51546a(Integer.valueOf(this.field_aScene), Integer.valueOf(m0Var.field_aScene));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102985j == hashCode) {
                    try {
                        this.field_appMsgReportContextId = cursor.getLong(i);
                        this.f102992d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizAppMsgReportContext", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102986n == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizAppMsgReportContext", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102987o == hashCode) {
                    try {
                        this.field_reportTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizAppMsgReportContext", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102988p == hashCode) {
                    try {
                        this.field_aScene = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizAppMsgReportContext", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102989q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102992d) {
            contentValues.put("appMsgReportContextId", Long.valueOf(this.field_appMsgReportContextId));
        }
        if (this.f102993e) {
            contentValues.put("url", this.field_url);
        }
        if (this.f102994f) {
            contentValues.put("reportTime", Long.valueOf(this.field_reportTime));
        }
        if (this.f102995g) {
            contentValues.put("aScene", Integer.valueOf(this.field_aScene));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizAppMsgReportContext", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizAppMsgReportContext ( " + f102990r.sql + ");");
        for (String add : f102984i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizAppMsgReportContext", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizAppMsgReportContext", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102990r, "BizAppMsgReportContext", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizAppMsgReportContext", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizAppMsgReportContext", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizAppMsgReportContext", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102990r;
    }

    public String[] getIndexCreateSQL() {
        return f102984i;
    }

    public StorageObserverOwner<C38609m0> getObserverOwner() {
        return f102991s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_appMsgReportContextId);
    }

    public SingleTable getTable() {
        return f102983h;
    }

    public String getTableName() {
        return f102983h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appMsgReportContextId")) {
            this.field_appMsgReportContextId = contentValues.getAsLong("appMsgReportContextId").longValue();
            if (z) {
                this.f102992d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f102993e = true;
            }
        }
        if (contentValues.containsKey("reportTime")) {
            this.field_reportTime = contentValues.getAsLong("reportTime").longValue();
            if (z) {
                this.f102994f = true;
            }
        }
        if (contentValues.containsKey("aScene")) {
            this.field_aScene = contentValues.getAsInteger("aScene").intValue();
            if (z) {
                this.f102995g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
