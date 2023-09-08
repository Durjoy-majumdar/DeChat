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

/* renamed from: xh.g9 */
public class C38569g9 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f102380h;

    /* renamed from: i */
    public static final String[] f102381i = new String[0];

    /* renamed from: j */
    public static final int f102382j = -105740141;

    /* renamed from: n */
    public static final int f102383n = 1017037727;

    /* renamed from: o */
    public static final int f102384o = 1369213417;

    /* renamed from: p */
    public static final int f102385p = 1017019817;

    /* renamed from: q */
    public static final int f102386q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f102387r = initAutoDBInfo(C38569g9.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38569g9> f102388s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102389d = true;

    /* renamed from: e */
    public boolean f102390e = true;

    /* renamed from: f */
    public boolean f102391f = true;
    public String field_canvasExt;
    public String field_canvasId;
    public String field_canvasXml;
    public long field_createTime;

    /* renamed from: g */
    public boolean f102392g = true;

    static {
        SingleTable singleTable = new SingleTable("UxCanvasInfo");
        f102380h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("canvasId", "string", singleTable.getName(), "");
        new Column("canvasXml", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("canvasExt", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "canvasId";
        mAutoDBInfo.colsMap.put("canvasId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "canvasId";
        mAutoDBInfo.columns[1] = "canvasXml";
        mAutoDBInfo.colsMap.put("canvasXml", "TEXT");
        mAutoDBInfo.columns[2] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[3] = "canvasExt";
        mAutoDBInfo.colsMap.put("canvasExt", "TEXT");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " canvasId TEXT PRIMARY KEY ,  canvasXml TEXT,  createTime LONG,  canvasExt TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38569g9)) {
            return false;
        }
        C38569g9 g9Var = (C38569g9) iAutoDBItem;
        return C46238a.m51546a(this.field_canvasId, g9Var.field_canvasId) && C46238a.m51546a(this.field_canvasXml, g9Var.field_canvasXml) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(g9Var.field_createTime)) && C46238a.m51546a(this.field_canvasExt, g9Var.field_canvasExt);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102382j == hashCode) {
                    try {
                        this.field_canvasId = cursor.getString(i);
                        this.f102389d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUxCanvasInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102383n == hashCode) {
                    try {
                        this.field_canvasXml = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUxCanvasInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102384o == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUxCanvasInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102385p == hashCode) {
                    try {
                        this.field_canvasExt = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUxCanvasInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102386q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102389d) {
            contentValues.put("canvasId", this.field_canvasId);
        }
        if (this.f102390e) {
            contentValues.put("canvasXml", this.field_canvasXml);
        }
        if (this.f102391f) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f102392g) {
            contentValues.put("canvasExt", this.field_canvasExt);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseUxCanvasInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS UxCanvasInfo ( " + f102387r.sql + ");");
        for (String add : f102381i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseUxCanvasInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("UxCanvasInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102387r, "UxCanvasInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseUxCanvasInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("UxCanvasInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseUxCanvasInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102387r;
    }

    public String[] getIndexCreateSQL() {
        return f102381i;
    }

    public StorageObserverOwner<C38569g9> getObserverOwner() {
        return f102388s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_canvasId;
    }

    public SingleTable getTable() {
        return f102380h;
    }

    public String getTableName() {
        return f102380h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("canvasId")) {
            this.field_canvasId = contentValues.getAsString("canvasId");
            if (z) {
                this.f102389d = true;
            }
        }
        if (contentValues.containsKey("canvasXml")) {
            this.field_canvasXml = contentValues.getAsString("canvasXml");
            if (z) {
                this.f102390e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f102391f = true;
            }
        }
        if (contentValues.containsKey("canvasExt")) {
            this.field_canvasExt = contentValues.getAsString("canvasExt");
            if (z) {
                this.f102392g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
