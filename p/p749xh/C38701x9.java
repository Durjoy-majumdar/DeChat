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

/* renamed from: xh.x9 */
public class C38701x9 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f104285f;

    /* renamed from: g */
    public static final String[] f104286g = new String[0];

    /* renamed from: h */
    public static final int f104287h = 3208616;

    /* renamed from: i */
    public static final int f104288i = -834724724;

    /* renamed from: j */
    public static final int f104289j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f104290n = initAutoDBInfo(C38701x9.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38701x9> f104291o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104292d = true;

    /* renamed from: e */
    public boolean f104293e = true;
    public long field_expireTime;
    public String field_host;

    static {
        SingleTable singleTable = new SingleTable("WebViewHostsFilter");
        f104285f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("host", "string", singleTable.getName(), "");
        new Column("expireTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "host";
        mAutoDBInfo.colsMap.put("host", "TEXT");
        mAutoDBInfo.columns[1] = "expireTime";
        mAutoDBInfo.colsMap.put("expireTime", "LONG");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " host TEXT,  expireTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38701x9)) {
            return false;
        }
        C38701x9 x9Var = (C38701x9) iAutoDBItem;
        return C46238a.m51546a(this.field_host, x9Var.field_host) && C46238a.m51546a(Long.valueOf(this.field_expireTime), Long.valueOf(x9Var.field_expireTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104287h == hashCode) {
                    try {
                        this.field_host = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHostsFilter", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104288i == hashCode) {
                    try {
                        this.field_expireTime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHostsFilter", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104289j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104292d) {
            contentValues.put("host", this.field_host);
        }
        if (this.f104293e) {
            contentValues.put("expireTime", Long.valueOf(this.field_expireTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWebViewHostsFilter", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WebViewHostsFilter ( " + f104290n.sql + ");");
        for (String add : f104286g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWebViewHostsFilter", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WebViewHostsFilter", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104290n, "WebViewHostsFilter", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWebViewHostsFilter", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WebViewHostsFilter", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWebViewHostsFilter", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104290n;
    }

    public String[] getIndexCreateSQL() {
        return f104286g;
    }

    public StorageObserverOwner<C38701x9> getObserverOwner() {
        return f104291o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f104285f;
    }

    public String getTableName() {
        return f104285f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("host")) {
            this.field_host = contentValues.getAsString("host");
            if (z) {
                this.f104292d = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z) {
                this.f104293e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
