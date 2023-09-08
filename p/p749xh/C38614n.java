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

/* renamed from: xh.n */
public class C38614n extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f103044g;

    /* renamed from: h */
    public static final String[] f103045h = {"CREATE INDEX IF NOT EXISTS AppBrandAppLaunchRecordUpdateTimeIndex ON AppBrandAppLaunchUsernameDuplicateRecord2(updateTime)"};

    /* renamed from: i */
    public static final int f103046i = 1007641348;

    /* renamed from: j */
    public static final int f103047j = -265713450;

    /* renamed from: n */
    public static final int f103048n = -295931082;

    /* renamed from: o */
    public static final int f103049o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f103050p = initAutoDBInfo(C38614n.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38614n> f103051q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103052d = true;

    /* renamed from: e */
    public boolean f103053e = true;

    /* renamed from: f */
    public boolean f103054f = true;
    public long field_updateTime;
    public String field_username;
    public int field_usernameHash;

    static {
        SingleTable singleTable = new SingleTable("AppBrandAppLaunchUsernameDuplicateRecord2");
        f103044g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("usernameHash", "int", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "usernameHash";
        mAutoDBInfo.colsMap.put("usernameHash", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "usernameHash";
        mAutoDBInfo.columns[1] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[2] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " usernameHash INTEGER PRIMARY KEY ,  username TEXT,  updateTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38614n)) {
            return false;
        }
        C38614n nVar = (C38614n) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_usernameHash), Integer.valueOf(nVar.field_usernameHash)) && C46238a.m51546a(this.field_username, nVar.field_username) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(nVar.field_updateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103046i == hashCode) {
                    try {
                        this.field_usernameHash = cursor.getInt(i);
                        this.f103052d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103047j == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103048n == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103049o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103052d) {
            contentValues.put("usernameHash", Integer.valueOf(this.field_usernameHash));
        }
        if (this.f103053e) {
            contentValues.put("username", this.field_username);
        }
        if (this.f103054f) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandAppLaunchUsernameDuplicateRecord2 ( " + f103050p.sql + ");");
        for (String add : f103045h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandAppLaunchUsernameDuplicateRecord2", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103050p, "AppBrandAppLaunchUsernameDuplicateRecord2", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandAppLaunchUsernameDuplicateRecord2", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103050p;
    }

    public String[] getIndexCreateSQL() {
        return f103045h;
    }

    public StorageObserverOwner<C38614n> getObserverOwner() {
        return f103051q;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_usernameHash);
    }

    public SingleTable getTable() {
        return f103044g;
    }

    public String getTableName() {
        return f103044g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("usernameHash")) {
            this.field_usernameHash = contentValues.getAsInteger("usernameHash").intValue();
            if (z) {
                this.f103052d = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f103053e = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f103054f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
