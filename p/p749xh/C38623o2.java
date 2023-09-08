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
import org.json.JSONObject;

/* renamed from: xh.o2 */
public class C38623o2 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103199f;

    /* renamed from: g */
    public static final String[] f103200g = new String[0];

    /* renamed from: h */
    public static final int f103201h = -580140035;

    /* renamed from: i */
    public static final int f103202i = 111972721;

    /* renamed from: j */
    public static final int f103203j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103204n = initAutoDBInfo(C38623o2.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38623o2> f103205o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103206d = true;

    /* renamed from: e */
    public boolean f103207e = true;
    public int field_configId;
    public String field_value;

    static {
        SingleTable singleTable = new SingleTable("FavConfigInfo");
        f103199f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("configId", "int", singleTable.getName(), "");
        new Column("value", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "configId";
        mAutoDBInfo.colsMap.put("configId", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "configId";
        mAutoDBInfo.columns[1] = "value";
        mAutoDBInfo.colsMap.put("value", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " configId INTEGER PRIMARY KEY ,  value TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38623o2)) {
            return false;
        }
        C38623o2 o2Var = (C38623o2) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_configId), Integer.valueOf(o2Var.field_configId)) && C46238a.m51546a(this.field_value, o2Var.field_value);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103201h == hashCode) {
                    try {
                        this.field_configId = cursor.getInt(i);
                        this.f103206d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavConfigInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103202i == hashCode) {
                    try {
                        this.field_value = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavConfigInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103203j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103206d) {
            contentValues.put("configId", Integer.valueOf(this.field_configId));
        }
        if (this.f103207e) {
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
            Log.m105920e("MicroMsg.SDK.BaseFavConfigInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FavConfigInfo ( " + f103204n.sql + ");");
        for (String add : f103200g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFavConfigInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FavConfigInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103204n, "FavConfigInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFavConfigInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FavConfigInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFavConfigInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103204n;
    }

    public String[] getIndexCreateSQL() {
        return f103200g;
    }

    public StorageObserverOwner<C38623o2> getObserverOwner() {
        return f103205o;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_configId);
    }

    public SingleTable getTable() {
        return f103199f;
    }

    public String getTableName() {
        return f103199f.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "configId", Integer.valueOf(this.field_configId));
            C46238a.m51547b(jSONObject, "value", this.field_value);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("configId")) {
            this.field_configId = contentValues.getAsInteger("configId").intValue();
            if (z) {
                this.f103206d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsString("value");
            if (z) {
                this.f103207e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
