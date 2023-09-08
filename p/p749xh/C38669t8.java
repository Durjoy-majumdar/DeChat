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

/* renamed from: xh.t8 */
public class C38669t8 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103803h;

    /* renamed from: i */
    public static final String[] f103804i = new String[0];

    /* renamed from: j */
    public static final int f103805j = 115029;

    /* renamed from: n */
    public static final int f103806n = -1383228885;

    /* renamed from: o */
    public static final int f103807o = 3530753;

    /* renamed from: p */
    public static final int f103808p = 109757585;

    /* renamed from: q */
    public static final int f103809q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103810r = initAutoDBInfo(C38669t8.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38669t8> f103811s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103812d = true;

    /* renamed from: e */
    public boolean f103813e = true;

    /* renamed from: f */
    public boolean f103814f = true;
    public long field_bottom;
    public int field_size;
    public int field_state;
    public long field_top;

    /* renamed from: g */
    public boolean f103815g = true;

    static {
        SingleTable singleTable = new SingleTable("SnsWsFoldGroup");
        f103803h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("top", "long", singleTable.getName(), "");
        new Column("bottom", "long", singleTable.getName(), "");
        new Column("size", "int", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "top";
        mAutoDBInfo.colsMap.put("top", "LONG");
        mAutoDBInfo.columns[1] = "bottom";
        mAutoDBInfo.colsMap.put("bottom", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "bottom";
        mAutoDBInfo.columns[2] = "size";
        mAutoDBInfo.colsMap.put("size", "INTEGER");
        mAutoDBInfo.columns[3] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " top LONG,  bottom LONG PRIMARY KEY ,  size INTEGER,  state INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38669t8)) {
            return false;
        }
        C38669t8 t8Var = (C38669t8) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_top), Long.valueOf(t8Var.field_top)) && C46238a.m51546a(Long.valueOf(this.field_bottom), Long.valueOf(t8Var.field_bottom)) && C46238a.m51546a(Integer.valueOf(this.field_size), Integer.valueOf(t8Var.field_size)) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(t8Var.field_state));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103805j == hashCode) {
                    try {
                        this.field_top = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroup", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103806n == hashCode) {
                    try {
                        this.field_bottom = cursor.getLong(i);
                        this.f103813e = true;
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroup", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103807o == hashCode) {
                    try {
                        this.field_size = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroup", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103808p == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroup", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103809q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103812d) {
            contentValues.put("top", Long.valueOf(this.field_top));
        }
        if (this.f103813e) {
            contentValues.put("bottom", Long.valueOf(this.field_bottom));
        }
        if (this.f103814f) {
            contentValues.put("size", Integer.valueOf(this.field_size));
        }
        if (this.f103815g) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSnsWsFoldGroup", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SnsWsFoldGroup ( " + f103810r.sql + ");");
        for (String add : f103804i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSnsWsFoldGroup", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SnsWsFoldGroup", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103810r, "SnsWsFoldGroup", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSnsWsFoldGroup", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SnsWsFoldGroup", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSnsWsFoldGroup", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103810r;
    }

    public String[] getIndexCreateSQL() {
        return f103804i;
    }

    public StorageObserverOwner<C38669t8> getObserverOwner() {
        return f103811s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_bottom);
    }

    public SingleTable getTable() {
        return f103803h;
    }

    public String getTableName() {
        return f103803h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("top")) {
            this.field_top = contentValues.getAsLong("top").longValue();
            if (z) {
                this.f103812d = true;
            }
        }
        if (contentValues.containsKey("bottom")) {
            this.field_bottom = contentValues.getAsLong("bottom").longValue();
            if (z) {
                this.f103813e = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsInteger("size").intValue();
            if (z) {
                this.f103814f = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f103815g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
