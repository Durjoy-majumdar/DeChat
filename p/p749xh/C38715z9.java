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

/* renamed from: xh.z9 */
public class C38715z9 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f104455j;

    /* renamed from: n */
    public static final String[] f104456n = new String[0];

    /* renamed from: o */
    public static final int f104457o = 93027984;

    /* renamed from: p */
    public static final int f104458p = -794301531;

    /* renamed from: q */
    public static final int f104459q = -1411084842;

    /* renamed from: r */
    public static final int f104460r = -1411084740;

    /* renamed from: s */
    public static final int f104461s = 93028134;

    /* renamed from: t */
    public static final int f104462t = -794273301;

    /* renamed from: u */
    public static final int f104463u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f104464v = initAutoDBInfo(C38715z9.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38715z9> f104465w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104466d = true;

    /* renamed from: e */
    public boolean f104467e = true;

    /* renamed from: f */
    public boolean f104468f = true;
    public int field_appDs;
    public int field_appHour;
    public long field_appIn;
    public long field_appInbg;
    public long field_appTbe;
    public long field_appTen;

    /* renamed from: g */
    public boolean f104469g = true;

    /* renamed from: h */
    public boolean f104470h = true;

    /* renamed from: i */
    public boolean f104471i = true;

    static {
        SingleTable singleTable = new SingleTable("WechatAppHistory");
        f104455j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appDs", "int", singleTable.getName(), "");
        new Column("appHour", "int", singleTable.getName(), "");
        new Column("appTbe", "long", singleTable.getName(), "");
        new Column("appTen", "long", singleTable.getName(), "");
        new Column("appIn", "long", singleTable.getName(), "");
        new Column("appInbg", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appDs";
        mAutoDBInfo.colsMap.put("appDs", "INTEGER");
        mAutoDBInfo.columns[1] = "appHour";
        mAutoDBInfo.colsMap.put("appHour", "INTEGER");
        mAutoDBInfo.columns[2] = "appTbe";
        mAutoDBInfo.colsMap.put("appTbe", "LONG");
        mAutoDBInfo.columns[3] = "appTen";
        mAutoDBInfo.colsMap.put("appTen", "LONG");
        mAutoDBInfo.columns[4] = "appIn";
        mAutoDBInfo.colsMap.put("appIn", "LONG");
        mAutoDBInfo.columns[5] = "appInbg";
        mAutoDBInfo.colsMap.put("appInbg", "LONG");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " appDs INTEGER,  appHour INTEGER,  appTbe LONG,  appTen LONG,  appIn LONG,  appInbg LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38715z9)) {
            return false;
        }
        C38715z9 z9Var = (C38715z9) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_appDs), Integer.valueOf(z9Var.field_appDs)) && C46238a.m51546a(Integer.valueOf(this.field_appHour), Integer.valueOf(z9Var.field_appHour)) && C46238a.m51546a(Long.valueOf(this.field_appTbe), Long.valueOf(z9Var.field_appTbe)) && C46238a.m51546a(Long.valueOf(this.field_appTen), Long.valueOf(z9Var.field_appTen)) && C46238a.m51546a(Long.valueOf(this.field_appIn), Long.valueOf(z9Var.field_appIn)) && C46238a.m51546a(Long.valueOf(this.field_appInbg), Long.valueOf(z9Var.field_appInbg));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104457o == hashCode) {
                    try {
                        this.field_appDs = cursor.getInt(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatAppHistory", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104458p == hashCode) {
                    try {
                        this.field_appHour = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatAppHistory", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104459q == hashCode) {
                    try {
                        this.field_appTbe = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatAppHistory", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104460r == hashCode) {
                    try {
                        this.field_appTen = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatAppHistory", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104461s == hashCode) {
                    try {
                        this.field_appIn = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatAppHistory", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104462t == hashCode) {
                    try {
                        this.field_appInbg = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWechatAppHistory", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104463u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104466d) {
            contentValues.put("appDs", Integer.valueOf(this.field_appDs));
        }
        if (this.f104467e) {
            contentValues.put("appHour", Integer.valueOf(this.field_appHour));
        }
        if (this.f104468f) {
            contentValues.put("appTbe", Long.valueOf(this.field_appTbe));
        }
        if (this.f104469g) {
            contentValues.put("appTen", Long.valueOf(this.field_appTen));
        }
        if (this.f104470h) {
            contentValues.put("appIn", Long.valueOf(this.field_appIn));
        }
        if (this.f104471i) {
            contentValues.put("appInbg", Long.valueOf(this.field_appInbg));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWechatAppHistory", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WechatAppHistory ( " + f104464v.sql + ");");
        for (String add : f104456n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWechatAppHistory", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WechatAppHistory", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104464v, "WechatAppHistory", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWechatAppHistory", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WechatAppHistory", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWechatAppHistory", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104464v;
    }

    public String[] getIndexCreateSQL() {
        return f104456n;
    }

    public StorageObserverOwner<C38715z9> getObserverOwner() {
        return f104465w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f104455j;
    }

    public String getTableName() {
        return f104455j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appDs")) {
            this.field_appDs = contentValues.getAsInteger("appDs").intValue();
            if (z) {
                this.f104466d = true;
            }
        }
        if (contentValues.containsKey("appHour")) {
            this.field_appHour = contentValues.getAsInteger("appHour").intValue();
            if (z) {
                this.f104467e = true;
            }
        }
        if (contentValues.containsKey("appTbe")) {
            this.field_appTbe = contentValues.getAsLong("appTbe").longValue();
            if (z) {
                this.f104468f = true;
            }
        }
        if (contentValues.containsKey("appTen")) {
            this.field_appTen = contentValues.getAsLong("appTen").longValue();
            if (z) {
                this.f104469g = true;
            }
        }
        if (contentValues.containsKey("appIn")) {
            this.field_appIn = contentValues.getAsLong("appIn").longValue();
            if (z) {
                this.f104470h = true;
            }
        }
        if (contentValues.containsKey("appInbg")) {
            this.field_appInbg = contentValues.getAsLong("appInbg").longValue();
            if (z) {
                this.f104471i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
