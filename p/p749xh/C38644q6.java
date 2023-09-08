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

/* renamed from: xh.q6 */
public class C38644q6 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103407f;

    /* renamed from: g */
    public static final String[] f103408g = new String[0];

    /* renamed from: h */
    public static final int f103409h = -553589393;

    /* renamed from: i */
    public static final int f103410i = -353340323;

    /* renamed from: j */
    public static final int f103411j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103412n = initAutoDBInfo(C38644q6.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38644q6> f103413o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103414d = true;

    /* renamed from: e */
    public boolean f103415e = true;
    public long field_cacheTime;
    public String field_reportStr;

    static {
        SingleTable singleTable = new SingleTable("NewUserBehaviourCache");
        f103407f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("cacheTime", "long", singleTable.getName(), "");
        new Column("reportStr", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "cacheTime";
        mAutoDBInfo.colsMap.put("cacheTime", "LONG");
        mAutoDBInfo.columns[1] = "reportStr";
        mAutoDBInfo.colsMap.put("reportStr", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " cacheTime LONG,  reportStr TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38644q6)) {
            return false;
        }
        C38644q6 q6Var = (C38644q6) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_cacheTime), Long.valueOf(q6Var.field_cacheTime)) && C46238a.m51546a(this.field_reportStr, q6Var.field_reportStr);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103409h == hashCode) {
                    try {
                        this.field_cacheTime = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewUserBehaviourCache", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103410i == hashCode) {
                    try {
                        this.field_reportStr = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewUserBehaviourCache", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103411j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103414d) {
            contentValues.put("cacheTime", Long.valueOf(this.field_cacheTime));
        }
        if (this.f103415e) {
            contentValues.put("reportStr", this.field_reportStr);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseNewUserBehaviourCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS NewUserBehaviourCache ( " + f103412n.sql + ");");
        for (String add : f103408g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseNewUserBehaviourCache", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("NewUserBehaviourCache", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103412n, "NewUserBehaviourCache", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseNewUserBehaviourCache", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("NewUserBehaviourCache", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseNewUserBehaviourCache", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103412n;
    }

    public String[] getIndexCreateSQL() {
        return f103408g;
    }

    public StorageObserverOwner<C38644q6> getObserverOwner() {
        return f103413o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103407f;
    }

    public String getTableName() {
        return f103407f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("cacheTime")) {
            this.field_cacheTime = contentValues.getAsLong("cacheTime").longValue();
            if (z) {
                this.f103414d = true;
            }
        }
        if (contentValues.containsKey("reportStr")) {
            this.field_reportStr = contentValues.getAsString("reportStr");
            if (z) {
                this.f103415e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
