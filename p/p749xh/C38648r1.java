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

/* renamed from: xh.r1 */
public class C38648r1 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f103463g;

    /* renamed from: h */
    public static final String[] f103464h = new String[0];

    /* renamed from: i */
    public static final int f103465i = 93028124;

    /* renamed from: j */
    public static final int f103466j = 689108018;

    /* renamed from: n */
    public static final int f103467n = -1306463575;

    /* renamed from: o */
    public static final int f103468o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f103469p = initAutoDBInfo(C38648r1.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38648r1> f103470q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103471d = true;

    /* renamed from: e */
    public boolean f103472e = true;

    /* renamed from: f */
    public boolean f103473f = true;
    public String field_appId;
    public String field_extJson;
    public int field_versionType;

    static {
        SingleTable singleTable = new SingleTable("DevPkgLaunchExtInfo");
        f103463g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("versionType", "int", singleTable.getName(), "");
        new Column("extJson", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "versionType";
        mAutoDBInfo.colsMap.put("versionType", "INTEGER");
        mAutoDBInfo.columns[2] = "extJson";
        mAutoDBInfo.colsMap.put("extJson", "TEXT");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  versionType INTEGER,  extJson TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38648r1)) {
            return false;
        }
        C38648r1 r1Var = (C38648r1) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, r1Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_versionType), Integer.valueOf(r1Var.field_versionType)) && C46238a.m51546a(this.field_extJson, r1Var.field_extJson);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103465i == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103466j == hashCode) {
                    try {
                        this.field_versionType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103467n == hashCode) {
                    try {
                        this.field_extJson = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103468o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103471d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103472e) {
            contentValues.put("versionType", Integer.valueOf(this.field_versionType));
        }
        if (this.f103473f) {
            contentValues.put("extJson", this.field_extJson);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS DevPkgLaunchExtInfo ( " + f103469p.sql + ");");
        for (String add : f103464h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("DevPkgLaunchExtInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103469p, "DevPkgLaunchExtInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("DevPkgLaunchExtInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103469p;
    }

    public String[] getIndexCreateSQL() {
        return f103464h;
    }

    public StorageObserverOwner<C38648r1> getObserverOwner() {
        return f103470q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103463g;
    }

    public String getTableName() {
        return f103463g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103471d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z) {
                this.f103472e = true;
            }
        }
        if (contentValues.containsKey("extJson")) {
            this.field_extJson = contentValues.getAsString("extJson");
            if (z) {
                this.f103473f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
