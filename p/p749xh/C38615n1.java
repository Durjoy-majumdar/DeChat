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

/* renamed from: xh.n1 */
public class C38615n1 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103055f;

    /* renamed from: g */
    public static final String[] f103056g = new String[0];

    /* renamed from: h */
    public static final int f103057h = -63202513;

    /* renamed from: i */
    public static final int f103058i = 40698571;

    /* renamed from: j */
    public static final int f103059j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103060n = initAutoDBInfo(C38615n1.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38615n1> f103061o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103062d = true;

    /* renamed from: e */
    public boolean f103063e = true;
    public String field_contactName;
    public String field_labelId;

    static {
        SingleTable singleTable = new SingleTable("ContactLabelCache");
        f103055f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("labelId", "string", singleTable.getName(), "");
        new Column("contactName", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "labelId";
        mAutoDBInfo.colsMap.put("labelId", "TEXT");
        mAutoDBInfo.columns[1] = "contactName";
        mAutoDBInfo.colsMap.put("contactName", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " labelId TEXT,  contactName TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38615n1)) {
            return false;
        }
        C38615n1 n1Var = (C38615n1) iAutoDBItem;
        return C46238a.m51546a(this.field_labelId, n1Var.field_labelId) && C46238a.m51546a(this.field_contactName, n1Var.field_contactName);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103057h == hashCode) {
                    try {
                        this.field_labelId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabelCache", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103058i == hashCode) {
                    try {
                        this.field_contactName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabelCache", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103059j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103062d) {
            contentValues.put("labelId", this.field_labelId);
        }
        if (this.f103063e) {
            contentValues.put("contactName", this.field_contactName);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseContactLabelCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ContactLabelCache ( " + f103060n.sql + ");");
        for (String add : f103056g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseContactLabelCache", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ContactLabelCache", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103060n, "ContactLabelCache", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseContactLabelCache", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ContactLabelCache", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseContactLabelCache", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103060n;
    }

    public String[] getIndexCreateSQL() {
        return f103056g;
    }

    public StorageObserverOwner<C38615n1> getObserverOwner() {
        return f103061o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103055f;
    }

    public String getTableName() {
        return f103055f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("labelId")) {
            this.field_labelId = contentValues.getAsString("labelId");
            if (z) {
                this.f103062d = true;
            }
        }
        if (contentValues.containsKey("contactName")) {
            this.field_contactName = contentValues.getAsString("contactName");
            if (z) {
                this.f103063e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
