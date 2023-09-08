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
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.p */
public class C38630p extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103278f;

    /* renamed from: g */
    public static final String[] f103279g = new String[0];

    /* renamed from: h */
    public static final int f103280h = -265713450;

    /* renamed from: i */
    public static final int f103281i = 110541305;

    /* renamed from: j */
    public static final int f103282j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103283n = initAutoDBInfo(C38630p.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38630p> f103284o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103285d = true;

    /* renamed from: e */
    public boolean f103286e = true;
    public String field_token;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("AppBrandBackgroundFetchDataToken");
        f103278f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[1] = XWalkReaderBasePlugin.PARAM_KEY_TOKEN;
        mAutoDBInfo.colsMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " username TEXT,  token TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38630p)) {
            return false;
        }
        C38630p pVar = (C38630p) iAutoDBItem;
        return C46238a.m51546a(this.field_username, pVar.field_username) && C46238a.m51546a(this.field_token, pVar.field_token);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103280h == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103281i == hashCode) {
                    try {
                        this.field_token = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103282j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103285d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f103286e) {
            contentValues.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, this.field_token);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandBackgroundFetchDataToken ( " + f103283n.sql + ");");
        for (String add : f103279g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandBackgroundFetchDataToken", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103283n, "AppBrandBackgroundFetchDataToken", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandBackgroundFetchDataToken", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103283n;
    }

    public String[] getIndexCreateSQL() {
        return f103279g;
    }

    public StorageObserverOwner<C38630p> getObserverOwner() {
        return f103284o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103278f;
    }

    public String getTableName() {
        return f103278f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f103285d = true;
            }
        }
        if (contentValues.containsKey(XWalkReaderBasePlugin.PARAM_KEY_TOKEN)) {
            this.field_token = contentValues.getAsString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            if (z) {
                this.f103286e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
