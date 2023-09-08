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

/* renamed from: xh.u1 */
public class C38673u1 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f103871g;

    /* renamed from: h */
    public static final String[] f103872h = new String[0];

    /* renamed from: i */
    public static final int f103873i = -580140067;

    /* renamed from: j */
    public static final int f103874j = 621700735;

    /* renamed from: n */
    public static final int f103875n = 3076010;

    /* renamed from: o */
    public static final int f103876o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f103877p = initAutoDBInfo(C38673u1.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38673u1> f103878q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103879d = true;

    /* renamed from: e */
    public boolean f103880e = true;

    /* renamed from: f */
    public boolean f103881f = true;
    public String field_configID;
    public String field_data;
    public long field_reportTimeEC;

    static {
        SingleTable singleTable = new SingleTable("EdgeComputingCacheDataModel");
        f103871g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("configID", "string", singleTable.getName(), "");
        new Column("reportTimeEC", "long", singleTable.getName(), "");
        new Column("data", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "configID";
        mAutoDBInfo.colsMap.put("configID", "TEXT");
        mAutoDBInfo.columns[1] = "reportTimeEC";
        mAutoDBInfo.colsMap.put("reportTimeEC", "LONG");
        mAutoDBInfo.columns[2] = "data";
        mAutoDBInfo.colsMap.put("data", "TEXT");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " configID TEXT,  reportTimeEC LONG,  data TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38673u1)) {
            return false;
        }
        C38673u1 u1Var = (C38673u1) iAutoDBItem;
        return C46238a.m51546a(this.field_configID, u1Var.field_configID) && C46238a.m51546a(Long.valueOf(this.field_reportTimeEC), Long.valueOf(u1Var.field_reportTimeEC)) && C46238a.m51546a(this.field_data, u1Var.field_data);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103873i == hashCode) {
                    try {
                        this.field_configID = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103874j == hashCode) {
                    try {
                        this.field_reportTimeEC = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103875n == hashCode) {
                    try {
                        this.field_data = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103876o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103879d) {
            contentValues.put("configID", this.field_configID);
        }
        if (this.f103880e) {
            contentValues.put("reportTimeEC", Long.valueOf(this.field_reportTimeEC));
        }
        if (this.f103881f) {
            contentValues.put("data", this.field_data);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EdgeComputingCacheDataModel ( " + f103877p.sql + ");");
        for (String add : f103872h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EdgeComputingCacheDataModel", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103877p, "EdgeComputingCacheDataModel", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EdgeComputingCacheDataModel", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103877p;
    }

    public String[] getIndexCreateSQL() {
        return f103872h;
    }

    public StorageObserverOwner<C38673u1> getObserverOwner() {
        return f103878q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103871g;
    }

    public String getTableName() {
        return f103871g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("configID")) {
            this.field_configID = contentValues.getAsString("configID");
            if (z) {
                this.f103879d = true;
            }
        }
        if (contentValues.containsKey("reportTimeEC")) {
            this.field_reportTimeEC = contentValues.getAsLong("reportTimeEC").longValue();
            if (z) {
                this.f103880e = true;
            }
        }
        if (contentValues.containsKey("data")) {
            this.field_data = contentValues.getAsString("data");
            if (z) {
                this.f103881f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
