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

/* renamed from: xh.z0 */
public class C38710z0 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f104382g;

    /* renamed from: h */
    public static final String[] f104383h = new String[0];

    /* renamed from: i */
    public static final int f104384i = -105740141;

    /* renamed from: j */
    public static final int f104385j = 1017037727;

    /* renamed from: n */
    public static final int f104386n = 1369213417;

    /* renamed from: o */
    public static final int f104387o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f104388p = initAutoDBInfo(C38710z0.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38710z0> f104389q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104390d = true;

    /* renamed from: e */
    public boolean f104391e = true;

    /* renamed from: f */
    public boolean f104392f = true;
    public long field_canvasId;
    public String field_canvasXml;
    public long field_createTime;

    static {
        SingleTable singleTable = new SingleTable("CanvasInfo");
        f104382g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("canvasId", "long", singleTable.getName(), "");
        new Column("canvasXml", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "canvasId";
        mAutoDBInfo.colsMap.put("canvasId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "canvasId";
        mAutoDBInfo.columns[1] = "canvasXml";
        mAutoDBInfo.colsMap.put("canvasXml", "TEXT");
        mAutoDBInfo.columns[2] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " canvasId LONG PRIMARY KEY ,  canvasXml TEXT,  createTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38710z0)) {
            return false;
        }
        C38710z0 z0Var = (C38710z0) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_canvasId), Long.valueOf(z0Var.field_canvasId)) && C46238a.m51546a(this.field_canvasXml, z0Var.field_canvasXml) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(z0Var.field_createTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104384i == hashCode) {
                    try {
                        this.field_canvasId = cursor.getLong(i);
                        this.f104390d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCanvasInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104385j == hashCode) {
                    try {
                        this.field_canvasXml = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCanvasInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104386n == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCanvasInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104387o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104390d) {
            contentValues.put("canvasId", Long.valueOf(this.field_canvasId));
        }
        if (this.f104391e) {
            contentValues.put("canvasXml", this.field_canvasXml);
        }
        if (this.f104392f) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseCanvasInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS CanvasInfo ( " + f104388p.sql + ");");
        for (String add : f104383h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseCanvasInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("CanvasInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104388p, "CanvasInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseCanvasInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("CanvasInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseCanvasInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104388p;
    }

    public String[] getIndexCreateSQL() {
        return f104383h;
    }

    public StorageObserverOwner<C38710z0> getObserverOwner() {
        return f104389q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_canvasId);
    }

    public SingleTable getTable() {
        return f104382g;
    }

    public String getTableName() {
        return f104382g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("canvasId")) {
            this.field_canvasId = contentValues.getAsLong("canvasId").longValue();
            if (z) {
                this.f104390d = true;
            }
        }
        if (contentValues.containsKey("canvasXml")) {
            this.field_canvasXml = contentValues.getAsString("canvasXml");
            if (z) {
                this.f104391e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f104392f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
