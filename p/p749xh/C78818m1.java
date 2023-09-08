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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.m1 */
public class C78818m1 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f231055j;

    /* renamed from: n */
    public static final Column f231056n;

    /* renamed from: o */
    public static final Column f231057o;

    /* renamed from: p */
    public static final Column f231058p;

    /* renamed from: q */
    public static final String[] f231059q = new String[0];

    /* renamed from: r */
    public static final int f231060r = -63202545;

    /* renamed from: s */
    public static final int f231061s = -607923297;

    /* renamed from: t */
    public static final int f231062t = -50009044;

    /* renamed from: u */
    public static final int f231063u = -1538658689;

    /* renamed from: v */
    public static final int f231064v = 1369213417;

    /* renamed from: w */
    public static final int f231065w = -1131560889;

    /* renamed from: x */
    public static final int f231066x = 108705909;

    /* renamed from: y */
    public static final IAutoDBItem.MAutoDBInfo f231067y = initAutoDBInfo(C78818m1.class);

    /* renamed from: z */
    public static final StorageObserverOwner<C78818m1> f231068z = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f231069d = true;

    /* renamed from: e */
    public boolean f231070e = true;

    /* renamed from: f */
    public boolean f231071f = true;
    public long field_createTime;
    public boolean field_isTemporary;
    public int field_labelID;
    public String field_labelName;
    public String field_labelPYFull;
    public String field_labelPYShort;

    /* renamed from: g */
    public boolean f231072g = true;

    /* renamed from: h */
    public boolean f231073h = true;

    /* renamed from: i */
    public boolean f231074i = true;

    static {
        SingleTable singleTable = new SingleTable("ContactLabel");
        f231055j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f231056n = new Column("labelID", "int", singleTable.getName(), "");
        f231057o = new Column("labelName", "string", singleTable.getName(), "");
        new Column("labelPYFull", "string", singleTable.getName(), "");
        new Column("labelPYShort", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        f231058p = new Column("isTemporary", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "labelID";
        mAutoDBInfo.colsMap.put("labelID", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "labelID";
        mAutoDBInfo.columns[1] = "labelName";
        mAutoDBInfo.colsMap.put("labelName", "TEXT");
        mAutoDBInfo.columns[2] = "labelPYFull";
        mAutoDBInfo.colsMap.put("labelPYFull", "TEXT");
        mAutoDBInfo.columns[3] = "labelPYShort";
        mAutoDBInfo.colsMap.put("labelPYShort", "TEXT");
        mAutoDBInfo.columns[4] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[5] = "isTemporary";
        mAutoDBInfo.colsMap.put("isTemporary", "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " labelID INTEGER PRIMARY KEY ,  labelName TEXT,  labelPYFull TEXT,  labelPYShort TEXT,  createTime LONG,  isTemporary INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78818m1)) {
            return false;
        }
        C78818m1 m1Var = (C78818m1) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_labelID), Integer.valueOf(m1Var.field_labelID)) && C46238a.m51546a(this.field_labelName, m1Var.field_labelName) && C46238a.m51546a(this.field_labelPYFull, m1Var.field_labelPYFull) && C46238a.m51546a(this.field_labelPYShort, m1Var.field_labelPYShort) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(m1Var.field_createTime)) && C46238a.m51546a(Boolean.valueOf(this.field_isTemporary), Boolean.valueOf(m1Var.field_isTemporary));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231060r == hashCode) {
                    try {
                        this.field_labelID = cursor.getInt(i);
                        this.f231069d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231061s == hashCode) {
                    try {
                        this.field_labelName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231062t == hashCode) {
                    try {
                        this.field_labelPYFull = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231063u == hashCode) {
                    try {
                        this.field_labelPYShort = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231064v == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231065w == hashCode) {
                    try {
                        this.field_isTemporary = cursor.getInt(i) != 0;
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231066x == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231069d) {
            contentValues.put("labelID", Integer.valueOf(this.field_labelID));
        }
        if (this.f231070e) {
            contentValues.put("labelName", this.field_labelName);
        }
        if (this.f231071f) {
            contentValues.put("labelPYFull", this.field_labelPYFull);
        }
        if (this.f231072g) {
            contentValues.put("labelPYShort", this.field_labelPYShort);
        }
        if (this.f231073h) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f231074i) {
            if (this.field_isTemporary) {
                contentValues.put("isTemporary", 1);
            } else {
                contentValues.put("isTemporary", 0);
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseContactLabel", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ContactLabel ( " + f231067y.sql + ");");
        for (String add : f231059q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseContactLabel", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ContactLabel", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231067y, "ContactLabel", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseContactLabel", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ContactLabel", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseContactLabel", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231067y;
    }

    public String[] getIndexCreateSQL() {
        return f231059q;
    }

    public StorageObserverOwner<C78818m1> getObserverOwner() {
        return f231068z;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_labelID);
    }

    public SingleTable getTable() {
        return f231055j;
    }

    public String getTableName() {
        return f231055j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("labelID")) {
            this.field_labelID = contentValues.getAsInteger("labelID").intValue();
            if (z) {
                this.f231069d = true;
            }
        }
        if (contentValues.containsKey("labelName")) {
            this.field_labelName = contentValues.getAsString("labelName");
            if (z) {
                this.f231070e = true;
            }
        }
        if (contentValues.containsKey("labelPYFull")) {
            this.field_labelPYFull = contentValues.getAsString("labelPYFull");
            if (z) {
                this.f231071f = true;
            }
        }
        if (contentValues.containsKey("labelPYShort")) {
            this.field_labelPYShort = contentValues.getAsString("labelPYShort");
            if (z) {
                this.f231072g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f231073h = true;
            }
        }
        if (contentValues.containsKey("isTemporary")) {
            this.field_isTemporary = contentValues.getAsInteger("isTemporary").intValue() != 0;
            if (z) {
                this.f231074i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
