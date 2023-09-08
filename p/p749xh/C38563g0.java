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

/* renamed from: xh.g0 */
public class C38563g0 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102306g;

    /* renamed from: h */
    public static final String[] f102307h = new String[0];

    /* renamed from: i */
    public static final int f102308i = 3145580;

    /* renamed from: j */
    public static final int f102309j = 93028124;

    /* renamed from: n */
    public static final int f102310n = -896594087;

    /* renamed from: o */
    public static final int f102311o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102312p = initAutoDBInfo(C38563g0.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38563g0> f102313q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102314d = true;

    /* renamed from: e */
    public boolean f102315e = true;

    /* renamed from: f */
    public boolean f102316f = true;
    public String field_appId;
    public long field_flag;
    public int field_sortId;

    static {
        SingleTable singleTable = new SingleTable("AppSort");
        f102306g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("flag", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("sortId", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "flag";
        mAutoDBInfo.colsMap.put("flag", "LONG default '0' ");
        mAutoDBInfo.columns[1] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "sortId";
        mAutoDBInfo.colsMap.put("sortId", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " flag LONG default '0' ,  appId TEXT default '' ,  sortId INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38563g0)) {
            return false;
        }
        C38563g0 g0Var = (C38563g0) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_flag), Long.valueOf(g0Var.field_flag)) && C46238a.m51546a(this.field_appId, g0Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_sortId), Integer.valueOf(g0Var.field_sortId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102308i == hashCode) {
                    try {
                        this.field_flag = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppSort", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102309j == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppSort", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102310n == hashCode) {
                    try {
                        this.field_sortId = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppSort", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102311o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102314d) {
            contentValues.put("flag", Long.valueOf(this.field_flag));
        }
        if (this.field_appId == null) {
            this.field_appId = "";
        }
        if (this.f102315e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f102316f) {
            contentValues.put("sortId", Integer.valueOf(this.field_sortId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppSort", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppSort ( " + f102312p.sql + ");");
        for (String add : f102307h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppSort", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppSort", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102312p, "AppSort", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppSort", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppSort", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppSort", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102312p;
    }

    public String[] getIndexCreateSQL() {
        return f102307h;
    }

    public StorageObserverOwner<C38563g0> getObserverOwner() {
        return f102313q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102306g;
    }

    public String getTableName() {
        return f102306g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsLong("flag").longValue();
            if (z) {
                this.f102314d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f102315e = true;
            }
        }
        if (contentValues.containsKey("sortId")) {
            this.field_sortId = contentValues.getAsInteger("sortId").intValue();
            if (z) {
                this.f102316f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
