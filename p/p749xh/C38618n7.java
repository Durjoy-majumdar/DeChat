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

/* renamed from: xh.n7 */
public class C38618n7 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f103122g;

    /* renamed from: h */
    public static final String[] f103123h = new String[0];

    /* renamed from: i */
    public static final int f103124i = 93028124;

    /* renamed from: j */
    public static final int f103125j = 688612233;

    /* renamed from: n */
    public static final int f103126n = -1335185910;

    /* renamed from: o */
    public static final int f103127o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f103128p = initAutoDBInfo(C38618n7.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38618n7> f103129q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103130d = true;

    /* renamed from: e */
    public boolean f103131e = true;

    /* renamed from: f */
    public boolean f103132f = true;
    public String field_appId;
    public long field_devKey;
    public String field_versionDesc;

    static {
        SingleTable singleTable = new SingleTable("PluginDevLaunchInfo");
        f103122g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("versionDesc", "string", singleTable.getName(), "");
        new Column("devKey", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "versionDesc";
        mAutoDBInfo.colsMap.put("versionDesc", "TEXT");
        mAutoDBInfo.columns[2] = "devKey";
        mAutoDBInfo.colsMap.put("devKey", "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  versionDesc TEXT,  devKey LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38618n7)) {
            return false;
        }
        C38618n7 n7Var = (C38618n7) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, n7Var.field_appId) && C46238a.m51546a(this.field_versionDesc, n7Var.field_versionDesc) && C46238a.m51546a(Long.valueOf(this.field_devKey), Long.valueOf(n7Var.field_devKey));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103124i == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePluginDevLaunchInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103125j == hashCode) {
                    try {
                        this.field_versionDesc = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePluginDevLaunchInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103126n == hashCode) {
                    try {
                        this.field_devKey = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePluginDevLaunchInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103127o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103130d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103131e) {
            contentValues.put("versionDesc", this.field_versionDesc);
        }
        if (this.f103132f) {
            contentValues.put("devKey", Long.valueOf(this.field_devKey));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BasePluginDevLaunchInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PluginDevLaunchInfo ( " + f103128p.sql + ");");
        for (String add : f103123h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePluginDevLaunchInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PluginDevLaunchInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103128p, "PluginDevLaunchInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePluginDevLaunchInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PluginDevLaunchInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePluginDevLaunchInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103128p;
    }

    public String[] getIndexCreateSQL() {
        return f103123h;
    }

    public StorageObserverOwner<C38618n7> getObserverOwner() {
        return f103129q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103122g;
    }

    public String getTableName() {
        return f103122g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103130d = true;
            }
        }
        if (contentValues.containsKey("versionDesc")) {
            this.field_versionDesc = contentValues.getAsString("versionDesc");
            if (z) {
                this.f103131e = true;
            }
        }
        if (contentValues.containsKey("devKey")) {
            this.field_devKey = contentValues.getAsLong("devKey").longValue();
            if (z) {
                this.f103132f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
