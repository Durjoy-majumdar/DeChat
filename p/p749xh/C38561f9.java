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

/* renamed from: xh.f9 */
public class C38561f9 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102276g;

    /* renamed from: h */
    public static final String[] f102277h = new String[0];

    /* renamed from: i */
    public static final int f102278i = -1010580219;

    /* renamed from: j */
    public static final int f102279j = 93028124;

    /* renamed from: n */
    public static final int f102280n = -265713450;

    /* renamed from: o */
    public static final int f102281o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102282p = initAutoDBInfo(C38561f9.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38561f9> f102283q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102284d = true;

    /* renamed from: e */
    public boolean f102285e = true;

    /* renamed from: f */
    public boolean f102286f = true;
    public String field_appId;
    public String field_openId;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("UserOpenIdInApp");
        f102276g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("openId", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "openId";
        mAutoDBInfo.colsMap.put("openId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "openId";
        mAutoDBInfo.columns[1] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[2] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " openId TEXT PRIMARY KEY ,  appId TEXT,  username TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38561f9)) {
            return false;
        }
        C38561f9 f9Var = (C38561f9) iAutoDBItem;
        return C46238a.m51546a(this.field_openId, f9Var.field_openId) && C46238a.m51546a(this.field_appId, f9Var.field_appId) && C46238a.m51546a(this.field_username, f9Var.field_username);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102278i == hashCode) {
                    try {
                        this.field_openId = cursor.getString(i);
                        this.f102284d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserOpenIdInApp", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102279j == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserOpenIdInApp", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102280n == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserOpenIdInApp", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102281o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102284d) {
            contentValues.put("openId", this.field_openId);
        }
        if (this.f102285e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f102286f) {
            contentValues.put("username", this.field_username);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseUserOpenIdInApp", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS UserOpenIdInApp ( " + f102282p.sql + ");");
        for (String add : f102277h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseUserOpenIdInApp", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("UserOpenIdInApp", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102282p, "UserOpenIdInApp", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseUserOpenIdInApp", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("UserOpenIdInApp", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseUserOpenIdInApp", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102282p;
    }

    public String[] getIndexCreateSQL() {
        return f102277h;
    }

    public StorageObserverOwner<C38561f9> getObserverOwner() {
        return f102283q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_openId;
    }

    public SingleTable getTable() {
        return f102276g;
    }

    public String getTableName() {
        return f102276g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("openId")) {
            this.field_openId = contentValues.getAsString("openId");
            if (z) {
                this.f102284d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f102285e = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f102286f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
