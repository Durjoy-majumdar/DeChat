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

/* renamed from: xh.s */
public class C38655s extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103563f;

    /* renamed from: g */
    public static final String[] f103564g = new String[0];

    /* renamed from: h */
    public static final int f103565h = -265713450;

    /* renamed from: i */
    public static final int f103566i = 93028124;

    /* renamed from: j */
    public static final int f103567j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103568n = initAutoDBInfo(C38655s.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38655s> f103569o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103570d = true;

    /* renamed from: e */
    public boolean f103571e = true;
    public String field_appId;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("AppBrandIdentifierInfo");
        f103563f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[1] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " username TEXT,  appId TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38655s)) {
            return false;
        }
        C38655s sVar = (C38655s) iAutoDBItem;
        return C46238a.m51546a(this.field_username, sVar.field_username) && C46238a.m51546a(this.field_appId, sVar.field_appId);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103565h == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandIdentifierInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103566i == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandIdentifierInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103567j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103570d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f103571e) {
            contentValues.put("appId", this.field_appId);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandIdentifierInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandIdentifierInfo ( " + f103568n.sql + ");");
        for (String add : f103564g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandIdentifierInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandIdentifierInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103568n, "AppBrandIdentifierInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandIdentifierInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandIdentifierInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandIdentifierInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103568n;
    }

    public String[] getIndexCreateSQL() {
        return f103564g;
    }

    public StorageObserverOwner<C38655s> getObserverOwner() {
        return f103569o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103563f;
    }

    public String getTableName() {
        return f103563f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f103570d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103571e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
