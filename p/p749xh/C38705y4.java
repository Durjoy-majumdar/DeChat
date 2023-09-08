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

/* renamed from: xh.y4 */
public class C38705y4 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f104321g;

    /* renamed from: h */
    public static final String[] f104322h = new String[0];

    /* renamed from: i */
    public static final int f104323i = -265713450;

    /* renamed from: j */
    public static final int f104324j = 424379462;

    /* renamed from: n */
    public static final int f104325n = -200696284;

    /* renamed from: o */
    public static final int f104326o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f104327p = initAutoDBInfo(C38705y4.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38705y4> f104328q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104329d = true;

    /* renamed from: e */
    public boolean f104330e = true;

    /* renamed from: f */
    public boolean f104331f = true;
    public String field_championMotto;
    public String field_championUrl;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("HardDeviceChampionInfo");
        f104321g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("championUrl", "string", singleTable.getName(), "");
        new Column("championMotto", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[1] = "championUrl";
        mAutoDBInfo.colsMap.put("championUrl", "TEXT");
        mAutoDBInfo.columns[2] = "championMotto";
        mAutoDBInfo.colsMap.put("championMotto", "TEXT");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " username TEXT,  championUrl TEXT,  championMotto TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38705y4)) {
            return false;
        }
        C38705y4 y4Var = (C38705y4) iAutoDBItem;
        return C46238a.m51546a(this.field_username, y4Var.field_username) && C46238a.m51546a(this.field_championUrl, y4Var.field_championUrl) && C46238a.m51546a(this.field_championMotto, y4Var.field_championMotto);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104323i == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceChampionInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104324j == hashCode) {
                    try {
                        this.field_championUrl = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceChampionInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104325n == hashCode) {
                    try {
                        this.field_championMotto = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceChampionInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104326o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104329d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f104330e) {
            contentValues.put("championUrl", this.field_championUrl);
        }
        if (this.f104331f) {
            contentValues.put("championMotto", this.field_championMotto);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseHardDeviceChampionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS HardDeviceChampionInfo ( " + f104327p.sql + ");");
        for (String add : f104322h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceChampionInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("HardDeviceChampionInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104327p, "HardDeviceChampionInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceChampionInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("HardDeviceChampionInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseHardDeviceChampionInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104327p;
    }

    public String[] getIndexCreateSQL() {
        return f104322h;
    }

    public StorageObserverOwner<C38705y4> getObserverOwner() {
        return f104328q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f104321g;
    }

    public String getTableName() {
        return f104321g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f104329d = true;
            }
        }
        if (contentValues.containsKey("championUrl")) {
            this.field_championUrl = contentValues.getAsString("championUrl");
            if (z) {
                this.f104330e = true;
            }
        }
        if (contentValues.containsKey("championMotto")) {
            this.field_championMotto = contentValues.getAsString("championMotto");
            if (z) {
                this.f104331f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
