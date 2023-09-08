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

/* renamed from: xh.y3 */
public class C38704y3 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f104312f;

    /* renamed from: g */
    public static final String[] f104313g = {"CREATE INDEX IF NOT EXISTS Finder_ShareInfo_username ON FinderShareInfo(username)"};

    /* renamed from: h */
    public static final int f104314h = -265713450;

    /* renamed from: i */
    public static final int f104315i = -1582035124;

    /* renamed from: j */
    public static final int f104316j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f104317n = initAutoDBInfo(C38704y3.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38704y3> f104318o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104319d = true;

    /* renamed from: e */
    public boolean f104320e = true;
    public long field_shareTime;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("FinderShareInfo");
        f104312f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("shareTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[1] = "shareTime";
        mAutoDBInfo.colsMap.put("shareTime", "LONG");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " username TEXT,  shareTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38704y3)) {
            return false;
        }
        C38704y3 y3Var = (C38704y3) iAutoDBItem;
        return C46238a.m51546a(this.field_username, y3Var.field_username) && C46238a.m51546a(Long.valueOf(this.field_shareTime), Long.valueOf(y3Var.field_shareTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104314h == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderShareInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104315i == hashCode) {
                    try {
                        this.field_shareTime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderShareInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104316j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104319d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f104320e) {
            contentValues.put("shareTime", Long.valueOf(this.field_shareTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderShareInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderShareInfo ( " + f104317n.sql + ");");
        for (String add : f104313g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderShareInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderShareInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104317n, "FinderShareInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderShareInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderShareInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderShareInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104317n;
    }

    public String[] getIndexCreateSQL() {
        return f104313g;
    }

    public StorageObserverOwner<C38704y3> getObserverOwner() {
        return f104318o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f104312f;
    }

    public String getTableName() {
        return f104312f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f104319d = true;
            }
        }
        if (contentValues.containsKey("shareTime")) {
            this.field_shareTime = contentValues.getAsLong("shareTime").longValue();
            if (z) {
                this.f104320e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
