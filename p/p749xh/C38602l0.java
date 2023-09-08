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

/* renamed from: xh.l0 */
public class C38602l0 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102891g;

    /* renamed from: h */
    public static final String[] f102892h = new String[0];

    /* renamed from: i */
    public static final int f102893i = 95580;

    /* renamed from: j */
    public static final int f102894j = 104191100;

    /* renamed from: n */
    public static final int f102895n = 223959217;

    /* renamed from: o */
    public static final int f102896o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102897p = initAutoDBInfo(C38602l0.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38602l0> f102898q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102899d = true;

    /* renamed from: e */
    public boolean f102900e = true;

    /* renamed from: f */
    public boolean f102901f = true;
    public String field_aId;
    public long field_exposeTime;
    public long field_msgId;

    static {
        SingleTable singleTable = new SingleTable("BizAdInfo");
        f102891g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("aId", "string", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("exposeTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "aId";
        mAutoDBInfo.colsMap.put("aId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "aId";
        mAutoDBInfo.columns[1] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG");
        mAutoDBInfo.columns[2] = "exposeTime";
        mAutoDBInfo.colsMap.put("exposeTime", "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " aId TEXT PRIMARY KEY ,  msgId LONG,  exposeTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38602l0)) {
            return false;
        }
        C38602l0 l0Var = (C38602l0) iAutoDBItem;
        return C46238a.m51546a(this.field_aId, l0Var.field_aId) && C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(l0Var.field_msgId)) && C46238a.m51546a(Long.valueOf(this.field_exposeTime), Long.valueOf(l0Var.field_exposeTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102893i == hashCode) {
                    try {
                        this.field_aId = cursor.getString(i);
                        this.f102899d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizAdInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102894j == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizAdInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102895n == hashCode) {
                    try {
                        this.field_exposeTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizAdInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102896o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102899d) {
            contentValues.put("aId", this.field_aId);
        }
        if (this.f102900e) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f102901f) {
            contentValues.put("exposeTime", Long.valueOf(this.field_exposeTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizAdInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizAdInfo ( " + f102897p.sql + ");");
        for (String add : f102892h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizAdInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizAdInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102897p, "BizAdInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizAdInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizAdInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizAdInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102897p;
    }

    public String[] getIndexCreateSQL() {
        return f102892h;
    }

    public StorageObserverOwner<C38602l0> getObserverOwner() {
        return f102898q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_aId;
    }

    public SingleTable getTable() {
        return f102891g;
    }

    public String getTableName() {
        return f102891g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("aId")) {
            this.field_aId = contentValues.getAsString("aId");
            if (z) {
                this.f102899d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f102900e = true;
            }
        }
        if (contentValues.containsKey("exposeTime")) {
            this.field_exposeTime = contentValues.getAsLong("exposeTime").longValue();
            if (z) {
                this.f102901f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
