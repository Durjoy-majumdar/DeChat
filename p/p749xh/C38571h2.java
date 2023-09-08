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

/* renamed from: xh.h2 */
public class C38571h2 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102406f;

    /* renamed from: g */
    public static final String[] f102407g = new String[0];

    /* renamed from: h */
    public static final int f102408h = -1308945176;

    /* renamed from: i */
    public static final int f102409i = -1289150094;

    /* renamed from: j */
    public static final int f102410j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102411n = initAutoDBInfo(C38571h2.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38571h2> f102412o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102413d = true;

    /* renamed from: e */
    public boolean f102414e = true;
    public int field_exptId;
    public String field_exptKey;

    static {
        SingleTable singleTable = new SingleTable("ExptKeyMapId");
        f102406f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("exptKey", "string", singleTable.getName(), "");
        new Column("exptId", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "exptKey";
        mAutoDBInfo.colsMap.put("exptKey", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "exptKey";
        mAutoDBInfo.columns[1] = "exptId";
        mAutoDBInfo.colsMap.put("exptId", "INTEGER");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " exptKey TEXT PRIMARY KEY ,  exptId INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38571h2)) {
            return false;
        }
        C38571h2 h2Var = (C38571h2) iAutoDBItem;
        return C46238a.m51546a(this.field_exptKey, h2Var.field_exptKey) && C46238a.m51546a(Integer.valueOf(this.field_exptId), Integer.valueOf(h2Var.field_exptId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102408h == hashCode) {
                    try {
                        this.field_exptKey = cursor.getString(i);
                        this.f102413d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptKeyMapId", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102409i == hashCode) {
                    try {
                        this.field_exptId = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptKeyMapId", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102410j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102413d) {
            contentValues.put("exptKey", this.field_exptKey);
        }
        if (this.f102414e) {
            contentValues.put("exptId", Integer.valueOf(this.field_exptId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseExptKeyMapId", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ExptKeyMapId ( " + f102411n.sql + ");");
        for (String add : f102407g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseExptKeyMapId", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ExptKeyMapId", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102411n, "ExptKeyMapId", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseExptKeyMapId", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ExptKeyMapId", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseExptKeyMapId", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102411n;
    }

    public String[] getIndexCreateSQL() {
        return f102407g;
    }

    public StorageObserverOwner<C38571h2> getObserverOwner() {
        return f102412o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_exptKey;
    }

    public SingleTable getTable() {
        return f102406f;
    }

    public String getTableName() {
        return f102406f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("exptKey")) {
            this.field_exptKey = contentValues.getAsString("exptKey");
            if (z) {
                this.f102413d = true;
            }
        }
        if (contentValues.containsKey("exptId")) {
            this.field_exptId = contentValues.getAsInteger("exptId").intValue();
            if (z) {
                this.f102414e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
