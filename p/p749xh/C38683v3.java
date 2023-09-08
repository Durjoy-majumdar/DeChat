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

/* renamed from: xh.v3 */
public class C38683v3 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103950j;

    /* renamed from: n */
    public static final String[] f103951n = new String[0];

    /* renamed from: o */
    public static final int f103952o = 3215;

    /* renamed from: p */
    public static final int f103953p = 3208676;

    /* renamed from: q */
    public static final int f103954q = -1656171908;

    /* renamed from: r */
    public static final int f103955r = -949112281;

    /* renamed from: s */
    public static final int f103956s = 1812847849;

    /* renamed from: t */
    public static final int f103957t = 1263384693;

    /* renamed from: u */
    public static final int f103958u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f103959v = initAutoDBInfo(C38683v3.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38683v3> f103960w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103961d = true;

    /* renamed from: e */
    public boolean f103962e = true;

    /* renamed from: f */
    public boolean f103963f = true;
    public long field_actionMs;
    public int field_ds;
    public int field_hadFinderLiveRedDot;
    public int field_hadFinderRedDot;
    public int field_hour;
    public int field_isGoToFinderUI;

    /* renamed from: g */
    public boolean f103964g = true;

    /* renamed from: h */
    public boolean f103965h = true;

    /* renamed from: i */
    public boolean f103966i = true;

    static {
        SingleTable singleTable = new SingleTable("FinderRedDotHistory");
        f103950j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("ds", "int", singleTable.getName(), "");
        new Column("hour", "int", singleTable.getName(), "");
        new Column("actionMs", "long", singleTable.getName(), "");
        new Column("isGoToFinderUI", "int", singleTable.getName(), "");
        new Column("hadFinderRedDot", "int", singleTable.getName(), "");
        new Column("hadFinderLiveRedDot", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "ds";
        mAutoDBInfo.colsMap.put("ds", "INTEGER");
        mAutoDBInfo.columns[1] = "hour";
        mAutoDBInfo.colsMap.put("hour", "INTEGER");
        mAutoDBInfo.columns[2] = "actionMs";
        mAutoDBInfo.colsMap.put("actionMs", "LONG");
        mAutoDBInfo.columns[3] = "isGoToFinderUI";
        mAutoDBInfo.colsMap.put("isGoToFinderUI", "INTEGER");
        mAutoDBInfo.columns[4] = "hadFinderRedDot";
        mAutoDBInfo.colsMap.put("hadFinderRedDot", "INTEGER");
        mAutoDBInfo.columns[5] = "hadFinderLiveRedDot";
        mAutoDBInfo.colsMap.put("hadFinderLiveRedDot", "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " ds INTEGER,  hour INTEGER,  actionMs LONG,  isGoToFinderUI INTEGER,  hadFinderRedDot INTEGER,  hadFinderLiveRedDot INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38683v3)) {
            return false;
        }
        C38683v3 v3Var = (C38683v3) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_ds), Integer.valueOf(v3Var.field_ds)) && C46238a.m51546a(Integer.valueOf(this.field_hour), Integer.valueOf(v3Var.field_hour)) && C46238a.m51546a(Long.valueOf(this.field_actionMs), Long.valueOf(v3Var.field_actionMs)) && C46238a.m51546a(Integer.valueOf(this.field_isGoToFinderUI), Integer.valueOf(v3Var.field_isGoToFinderUI)) && C46238a.m51546a(Integer.valueOf(this.field_hadFinderRedDot), Integer.valueOf(v3Var.field_hadFinderRedDot)) && C46238a.m51546a(Integer.valueOf(this.field_hadFinderLiveRedDot), Integer.valueOf(v3Var.field_hadFinderLiveRedDot));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103952o == hashCode) {
                    try {
                        this.field_ds = cursor.getInt(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotHistory", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103953p == hashCode) {
                    try {
                        this.field_hour = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotHistory", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103954q == hashCode) {
                    try {
                        this.field_actionMs = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotHistory", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103955r == hashCode) {
                    try {
                        this.field_isGoToFinderUI = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotHistory", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103956s == hashCode) {
                    try {
                        this.field_hadFinderRedDot = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotHistory", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103957t == hashCode) {
                    try {
                        this.field_hadFinderLiveRedDot = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotHistory", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103958u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103961d) {
            contentValues.put("ds", Integer.valueOf(this.field_ds));
        }
        if (this.f103962e) {
            contentValues.put("hour", Integer.valueOf(this.field_hour));
        }
        if (this.f103963f) {
            contentValues.put("actionMs", Long.valueOf(this.field_actionMs));
        }
        if (this.f103964g) {
            contentValues.put("isGoToFinderUI", Integer.valueOf(this.field_isGoToFinderUI));
        }
        if (this.f103965h) {
            contentValues.put("hadFinderRedDot", Integer.valueOf(this.field_hadFinderRedDot));
        }
        if (this.f103966i) {
            contentValues.put("hadFinderLiveRedDot", Integer.valueOf(this.field_hadFinderLiveRedDot));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderRedDotHistory", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderRedDotHistory ( " + f103959v.sql + ");");
        for (String add : f103951n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderRedDotHistory", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderRedDotHistory", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103959v, "FinderRedDotHistory", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderRedDotHistory", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderRedDotHistory", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderRedDotHistory", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103959v;
    }

    public String[] getIndexCreateSQL() {
        return f103951n;
    }

    public StorageObserverOwner<C38683v3> getObserverOwner() {
        return f103960w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103950j;
    }

    public String getTableName() {
        return f103950j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("ds")) {
            this.field_ds = contentValues.getAsInteger("ds").intValue();
            if (z) {
                this.f103961d = true;
            }
        }
        if (contentValues.containsKey("hour")) {
            this.field_hour = contentValues.getAsInteger("hour").intValue();
            if (z) {
                this.f103962e = true;
            }
        }
        if (contentValues.containsKey("actionMs")) {
            this.field_actionMs = contentValues.getAsLong("actionMs").longValue();
            if (z) {
                this.f103963f = true;
            }
        }
        if (contentValues.containsKey("isGoToFinderUI")) {
            this.field_isGoToFinderUI = contentValues.getAsInteger("isGoToFinderUI").intValue();
            if (z) {
                this.f103964g = true;
            }
        }
        if (contentValues.containsKey("hadFinderRedDot")) {
            this.field_hadFinderRedDot = contentValues.getAsInteger("hadFinderRedDot").intValue();
            if (z) {
                this.f103965h = true;
            }
        }
        if (contentValues.containsKey("hadFinderLiveRedDot")) {
            this.field_hadFinderLiveRedDot = contentValues.getAsInteger("hadFinderLiveRedDot").intValue();
            if (z) {
                this.f103966i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
