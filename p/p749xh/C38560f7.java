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

/* renamed from: xh.f7 */
public class C38560f7 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102267f;

    /* renamed from: g */
    public static final String[] f102268g = new String[0];

    /* renamed from: h */
    public static final int f102269h = 106079;

    /* renamed from: i */
    public static final int f102270i = 111972721;

    /* renamed from: j */
    public static final int f102271j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102272n = initAutoDBInfo(C38560f7.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38560f7> f102273o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102274d = true;

    /* renamed from: e */
    public boolean f102275e = true;
    public String field_key;
    public byte[] field_value;

    static {
        SingleTable singleTable = new SingleTable("PBCache");
        f102267f = singleTable;
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
        mAutoDBInfo.colsMap.put("key", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = "value";
        mAutoDBInfo.colsMap.put("value", "BLOB");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " key TEXT PRIMARY KEY ,  value BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38560f7)) {
            return false;
        }
        C38560f7 f7Var = (C38560f7) iAutoDBItem;
        return C46238a.m51546a(this.field_key, f7Var.field_key) && C46238a.m51546a(this.field_value, f7Var.field_value);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102269h == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                        this.f102274d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePBCache", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102270i == hashCode) {
                    try {
                        this.field_value = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePBCache", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102271j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102274d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f102275e) {
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
            Log.m105920e("MicroMsg.SDK.BasePBCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PBCache ( " + f102272n.sql + ");");
        for (String add : f102268g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePBCache", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PBCache", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102272n, "PBCache", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePBCache", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PBCache", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePBCache", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102272n;
    }

    public String[] getIndexCreateSQL() {
        return f102268g;
    }

    public StorageObserverOwner<C38560f7> getObserverOwner() {
        return f102273o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_key;
    }

    public SingleTable getTable() {
        return f102267f;
    }

    public String getTableName() {
        return f102267f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f102274d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsByteArray("value");
            if (z) {
                this.f102275e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
