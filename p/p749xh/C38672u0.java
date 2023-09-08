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

/* renamed from: xh.u0 */
public class C38672u0 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103858h;

    /* renamed from: i */
    public static final String[] f103859i = new String[0];

    /* renamed from: j */
    public static final int f103860j = -1926022145;

    /* renamed from: n */
    public static final int f103861n = 104191100;

    /* renamed from: o */
    public static final int f103862o = 223959217;

    /* renamed from: p */
    public static final int f103863p = 223974686;

    /* renamed from: q */
    public static final int f103864q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103865r = initAutoDBInfo(C38672u0.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38672u0> f103866s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103867d = true;

    /* renamed from: e */
    public boolean f103868e = true;

    /* renamed from: f */
    public boolean f103869f = true;
    public String field_exposeId;
    public long field_exposeTime;
    public int field_exposeType;
    public long field_msgId;

    /* renamed from: g */
    public boolean f103870g = true;

    static {
        SingleTable singleTable = new SingleTable("BizRecExposeInfo");
        f103858h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("exposeId", "string", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("exposeTime", "long", singleTable.getName(), "");
        new Column("exposeType", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "exposeId";
        mAutoDBInfo.colsMap.put("exposeId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "exposeId";
        mAutoDBInfo.columns[1] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG");
        mAutoDBInfo.columns[2] = "exposeTime";
        mAutoDBInfo.colsMap.put("exposeTime", "LONG");
        mAutoDBInfo.columns[3] = "exposeType";
        mAutoDBInfo.colsMap.put("exposeType", "INTEGER");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " exposeId TEXT PRIMARY KEY ,  msgId LONG,  exposeTime LONG,  exposeType INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38672u0)) {
            return false;
        }
        C38672u0 u0Var = (C38672u0) iAutoDBItem;
        return C46238a.m51546a(this.field_exposeId, u0Var.field_exposeId) && C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(u0Var.field_msgId)) && C46238a.m51546a(Long.valueOf(this.field_exposeTime), Long.valueOf(u0Var.field_exposeTime)) && C46238a.m51546a(Integer.valueOf(this.field_exposeType), Integer.valueOf(u0Var.field_exposeType));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103860j == hashCode) {
                    try {
                        this.field_exposeId = cursor.getString(i);
                        this.f103867d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizRecExposeInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103861n == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizRecExposeInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103862o == hashCode) {
                    try {
                        this.field_exposeTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizRecExposeInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103863p == hashCode) {
                    try {
                        this.field_exposeType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizRecExposeInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103864q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103867d) {
            contentValues.put("exposeId", this.field_exposeId);
        }
        if (this.f103868e) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f103869f) {
            contentValues.put("exposeTime", Long.valueOf(this.field_exposeTime));
        }
        if (this.f103870g) {
            contentValues.put("exposeType", Integer.valueOf(this.field_exposeType));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizRecExposeInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizRecExposeInfo ( " + f103865r.sql + ");");
        for (String add : f103859i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizRecExposeInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizRecExposeInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103865r, "BizRecExposeInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizRecExposeInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizRecExposeInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizRecExposeInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103865r;
    }

    public String[] getIndexCreateSQL() {
        return f103859i;
    }

    public StorageObserverOwner<C38672u0> getObserverOwner() {
        return f103866s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_exposeId;
    }

    public SingleTable getTable() {
        return f103858h;
    }

    public String getTableName() {
        return f103858h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("exposeId")) {
            this.field_exposeId = contentValues.getAsString("exposeId");
            if (z) {
                this.f103867d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f103868e = true;
            }
        }
        if (contentValues.containsKey("exposeTime")) {
            this.field_exposeTime = contentValues.getAsLong("exposeTime").longValue();
            if (z) {
                this.f103869f = true;
            }
        }
        if (contentValues.containsKey("exposeType")) {
            this.field_exposeType = contentValues.getAsInteger("exposeType").intValue();
            if (z) {
                this.f103870g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
