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

/* renamed from: xh.i3 */
public class C38580i3 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102529f;

    /* renamed from: g */
    public static final String[] f102530g = new String[0];

    /* renamed from: h */
    public static final int f102531h = 106079;

    /* renamed from: i */
    public static final int f102532i = 111972721;

    /* renamed from: j */
    public static final int f102533j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102534n = initAutoDBInfo(C38580i3.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38580i3> f102535o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102536d = true;

    /* renamed from: e */
    public boolean f102537e = true;
    public String field_key;
    public byte[] field_value;

    static {
        SingleTable singleTable = new SingleTable("FinderLiveConfig");
        f102529f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("key", "string", singleTable.getName(), "");
        new Column("value", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = "value";
        mAutoDBInfo.colsMap.put("value", "BLOB");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " key TEXT default ''  PRIMARY KEY ,  value BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38580i3)) {
            return false;
        }
        C38580i3 i3Var = (C38580i3) iAutoDBItem;
        return C46238a.m51546a(this.field_key, i3Var.field_key) && C46238a.m51546a(this.field_value, i3Var.field_value);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102531h == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                        this.f102536d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveConfig", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102532i == hashCode) {
                    try {
                        this.field_value = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveConfig", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102533j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_key == null) {
            this.field_key = "";
        }
        if (this.f102536d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f102537e) {
            contentValues.put("value", this.field_value);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderLiveConfig", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLiveConfig ( " + f102534n.sql + ");");
        for (String add : f102530g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveConfig", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLiveConfig", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102534n, "FinderLiveConfig", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveConfig", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLiveConfig", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLiveConfig", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102534n;
    }

    public String[] getIndexCreateSQL() {
        return f102530g;
    }

    public StorageObserverOwner<C38580i3> getObserverOwner() {
        return f102535o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_key;
    }

    public SingleTable getTable() {
        return f102529f;
    }

    public String getTableName() {
        return f102529f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f102536d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsByteArray("value");
            if (z) {
                this.f102537e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
