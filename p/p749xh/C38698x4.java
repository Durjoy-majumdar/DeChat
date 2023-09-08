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

/* renamed from: xh.x4 */
public class C38698x4 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f104242h;

    /* renamed from: i */
    public static final String[] f104243i = new String[0];

    /* renamed from: j */
    public static final int f104244j = 724095294;

    /* renamed from: n */
    public static final int f104245n = -311541018;

    /* renamed from: o */
    public static final int f104246o = 880484258;

    /* renamed from: p */
    public static final int f104247p = -179242839;

    /* renamed from: q */
    public static final int f104248q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f104249r = initAutoDBInfo(C38698x4.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38698x4> f104250s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104251d = true;

    /* renamed from: e */
    public boolean f104252e = true;

    /* renamed from: f */
    public boolean f104253f = true;
    public String field_chatroomname;
    public int field_queryState;
    public String field_recentUseToolList;
    public String field_stickToollist;

    /* renamed from: g */
    public boolean f104254g = true;

    static {
        SingleTable singleTable = new SingleTable("GroupTools");
        f104242h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("chatroomname", "string", singleTable.getName(), "");
        new Column("stickToollist", "string", singleTable.getName(), "");
        new Column("recentUseToolList", "string", singleTable.getName(), "");
        new Column("queryState", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "chatroomname";
        mAutoDBInfo.colsMap.put("chatroomname", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "chatroomname";
        mAutoDBInfo.columns[1] = "stickToollist";
        mAutoDBInfo.colsMap.put("stickToollist", "TEXT");
        mAutoDBInfo.columns[2] = "recentUseToolList";
        mAutoDBInfo.colsMap.put("recentUseToolList", "TEXT");
        mAutoDBInfo.columns[3] = "queryState";
        mAutoDBInfo.colsMap.put("queryState", "INTEGER");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " chatroomname TEXT PRIMARY KEY ,  stickToollist TEXT,  recentUseToolList TEXT,  queryState INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38698x4)) {
            return false;
        }
        C38698x4 x4Var = (C38698x4) iAutoDBItem;
        return C46238a.m51546a(this.field_chatroomname, x4Var.field_chatroomname) && C46238a.m51546a(this.field_stickToollist, x4Var.field_stickToollist) && C46238a.m51546a(this.field_recentUseToolList, x4Var.field_recentUseToolList) && C46238a.m51546a(Integer.valueOf(this.field_queryState), Integer.valueOf(x4Var.field_queryState));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104244j == hashCode) {
                    try {
                        this.field_chatroomname = cursor.getString(i);
                        this.f104251d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTools", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104245n == hashCode) {
                    try {
                        this.field_stickToollist = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTools", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104246o == hashCode) {
                    try {
                        this.field_recentUseToolList = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTools", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104247p == hashCode) {
                    try {
                        this.field_queryState = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTools", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104248q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104251d) {
            contentValues.put("chatroomname", this.field_chatroomname);
        }
        if (this.f104252e) {
            contentValues.put("stickToollist", this.field_stickToollist);
        }
        if (this.f104253f) {
            contentValues.put("recentUseToolList", this.field_recentUseToolList);
        }
        if (this.f104254g) {
            contentValues.put("queryState", Integer.valueOf(this.field_queryState));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGroupTools", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GroupTools ( " + f104249r.sql + ");");
        for (String add : f104243i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGroupTools", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GroupTools", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104249r, "GroupTools", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGroupTools", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GroupTools", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGroupTools", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104249r;
    }

    public String[] getIndexCreateSQL() {
        return f104243i;
    }

    public StorageObserverOwner<C38698x4> getObserverOwner() {
        return f104250s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_chatroomname;
    }

    public SingleTable getTable() {
        return f104242h;
    }

    public String getTableName() {
        return f104242h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("chatroomname")) {
            this.field_chatroomname = contentValues.getAsString("chatroomname");
            if (z) {
                this.f104251d = true;
            }
        }
        if (contentValues.containsKey("stickToollist")) {
            this.field_stickToollist = contentValues.getAsString("stickToollist");
            if (z) {
                this.f104252e = true;
            }
        }
        if (contentValues.containsKey("recentUseToolList")) {
            this.field_recentUseToolList = contentValues.getAsString("recentUseToolList");
            if (z) {
                this.f104253f = true;
            }
        }
        if (contentValues.containsKey("queryState")) {
            this.field_queryState = contentValues.getAsInteger("queryState").intValue();
            if (z) {
                this.f104254g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
