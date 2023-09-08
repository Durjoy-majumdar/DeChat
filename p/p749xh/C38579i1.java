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

/* renamed from: xh.i1 */
public class C38579i1 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f102510n;

    /* renamed from: o */
    public static final String[] f102511o = new String[0];

    /* renamed from: p */
    public static final int f102512p = 1369213417;

    /* renamed from: q */
    public static final int f102513q = 1211388583;

    /* renamed from: r */
    public static final int f102514r = 1764589336;

    /* renamed from: s */
    public static final int f102515s = 3355;

    /* renamed from: t */
    public static final int f102516t = -2072608278;

    /* renamed from: u */
    public static final int f102517u = 3530753;

    /* renamed from: v */
    public static final int f102518v = 97513095;

    /* renamed from: w */
    public static final int f102519w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f102520x = initAutoDBInfo(C38579i1.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38579i1> f102521y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102522d = true;

    /* renamed from: e */
    public boolean f102523e = true;

    /* renamed from: f */
    public boolean f102524f = true;
    public long field_createTime;
    public long field_deleteTime;
    public long field_flags;
    public String field_id;
    public long field_modifyTime;
    public long field_saveTime;
    public long field_size;

    /* renamed from: g */
    public boolean f102525g = true;

    /* renamed from: h */
    public boolean f102526h = true;

    /* renamed from: i */
    public boolean f102527i = true;

    /* renamed from: j */
    public boolean f102528j = true;

    static {
        SingleTable singleTable = new SingleTable("CleanDeleteItem");
        f102510n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("modifyTime", "long", singleTable.getName(), "");
        new Column("deleteTime", "long", singleTable.getName(), "");
        new Column("id", "string", singleTable.getName(), "");
        new Column("saveTime", "long", singleTable.getName(), "");
        new Column("size", "long", singleTable.getName(), "");
        new Column("flags", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG default '0' ");
        mAutoDBInfo.columns[1] = "modifyTime";
        mAutoDBInfo.colsMap.put("modifyTime", "LONG default '0' ");
        mAutoDBInfo.columns[2] = "deleteTime";
        mAutoDBInfo.colsMap.put("deleteTime", "LONG default '0' ");
        mAutoDBInfo.columns[3] = "id";
        mAutoDBInfo.colsMap.put("id", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "saveTime";
        mAutoDBInfo.colsMap.put("saveTime", "LONG default '0' ");
        mAutoDBInfo.columns[5] = "size";
        mAutoDBInfo.colsMap.put("size", "LONG default '0' ");
        mAutoDBInfo.columns[6] = "flags";
        mAutoDBInfo.colsMap.put("flags", "LONG default '0' ");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " createTime LONG default '0' ,  modifyTime LONG default '0' ,  deleteTime LONG default '0' ,  id TEXT default '' ,  saveTime LONG default '0' ,  size LONG default '0' ,  flags LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38579i1)) {
            return false;
        }
        C38579i1 i1Var = (C38579i1) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(i1Var.field_createTime)) && C46238a.m51546a(Long.valueOf(this.field_modifyTime), Long.valueOf(i1Var.field_modifyTime)) && C46238a.m51546a(Long.valueOf(this.field_deleteTime), Long.valueOf(i1Var.field_deleteTime)) && C46238a.m51546a(this.field_id, i1Var.field_id) && C46238a.m51546a(Long.valueOf(this.field_saveTime), Long.valueOf(i1Var.field_saveTime)) && C46238a.m51546a(Long.valueOf(this.field_size), Long.valueOf(i1Var.field_size)) && C46238a.m51546a(Long.valueOf(this.field_flags), Long.valueOf(i1Var.field_flags));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102512p == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102513q == hashCode) {
                    try {
                        this.field_modifyTime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102514r == hashCode) {
                    try {
                        this.field_deleteTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102515s == hashCode) {
                    try {
                        this.field_id = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102516t == hashCode) {
                    try {
                        this.field_saveTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102517u == hashCode) {
                    try {
                        this.field_size = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102518v == hashCode) {
                    try {
                        this.field_flags = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102519w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102522d) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f102523e) {
            contentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
        }
        if (this.f102524f) {
            contentValues.put("deleteTime", Long.valueOf(this.field_deleteTime));
        }
        if (this.field_id == null) {
            this.field_id = "";
        }
        if (this.f102525g) {
            contentValues.put("id", this.field_id);
        }
        if (this.f102526h) {
            contentValues.put("saveTime", Long.valueOf(this.field_saveTime));
        }
        if (this.f102527i) {
            contentValues.put("size", Long.valueOf(this.field_size));
        }
        if (this.f102528j) {
            contentValues.put("flags", Long.valueOf(this.field_flags));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseCleanDeleteItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS CleanDeleteItem ( " + f102520x.sql + ");");
        for (String add : f102511o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseCleanDeleteItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("CleanDeleteItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102520x, "CleanDeleteItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseCleanDeleteItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("CleanDeleteItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseCleanDeleteItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102520x;
    }

    public String[] getIndexCreateSQL() {
        return f102511o;
    }

    public StorageObserverOwner<C38579i1> getObserverOwner() {
        return f102521y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102510n;
    }

    public String getTableName() {
        return f102510n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f102522d = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.field_modifyTime = contentValues.getAsLong("modifyTime").longValue();
            if (z) {
                this.f102523e = true;
            }
        }
        if (contentValues.containsKey("deleteTime")) {
            this.field_deleteTime = contentValues.getAsLong("deleteTime").longValue();
            if (z) {
                this.f102524f = true;
            }
        }
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsString("id");
            if (z) {
                this.f102525g = true;
            }
        }
        if (contentValues.containsKey("saveTime")) {
            this.field_saveTime = contentValues.getAsLong("saveTime").longValue();
            if (z) {
                this.f102526h = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z) {
                this.f102527i = true;
            }
        }
        if (contentValues.containsKey("flags")) {
            this.field_flags = contentValues.getAsLong("flags").longValue();
            if (z) {
                this.f102528j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
