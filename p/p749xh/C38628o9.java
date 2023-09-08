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

/* renamed from: xh.o9 */
public class C38628o9 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103252j;

    /* renamed from: n */
    public static final String[] f103253n = new String[0];

    /* renamed from: o */
    public static final int f103254o = -1553000966;

    /* renamed from: p */
    public static final int f103255p = 2053414053;

    /* renamed from: q */
    public static final int f103256q = 1377092573;

    /* renamed from: r */
    public static final int f103257r = -1907063343;

    /* renamed from: s */
    public static final int f103258s = 556341005;

    /* renamed from: t */
    public static final int f103259t = 964067593;

    /* renamed from: u */
    public static final int f103260u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f103261v = initAutoDBInfo(C38628o9.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38628o9> f103262w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103263d = true;

    /* renamed from: e */
    public boolean f103264e = true;

    /* renamed from: f */
    public boolean f103265f = true;
    public String field_banner_list;
    public String field_function_list;
    public int field_isShowSetting;
    public String field_new_list;
    public String field_type_name_list;
    public int field_wallet_region;

    /* renamed from: g */
    public boolean f103266g = true;

    /* renamed from: h */
    public boolean f103267h = true;

    /* renamed from: i */
    public boolean f103268i = true;

    static {
        SingleTable singleTable = new SingleTable("WalletFunciontList");
        f103252j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("wallet_region", "int", singleTable.getName(), "");
        new Column("function_list", "string", singleTable.getName(), "");
        new Column("new_list", "string", singleTable.getName(), "");
        new Column("banner_list", "string", singleTable.getName(), "");
        new Column("type_name_list", "string", singleTable.getName(), "");
        new Column("isShowSetting", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "wallet_region";
        mAutoDBInfo.colsMap.put("wallet_region", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "wallet_region";
        mAutoDBInfo.columns[1] = "function_list";
        mAutoDBInfo.colsMap.put("function_list", "TEXT");
        mAutoDBInfo.columns[2] = "new_list";
        mAutoDBInfo.colsMap.put("new_list", "TEXT");
        mAutoDBInfo.columns[3] = "banner_list";
        mAutoDBInfo.colsMap.put("banner_list", "TEXT");
        mAutoDBInfo.columns[4] = "type_name_list";
        mAutoDBInfo.colsMap.put("type_name_list", "TEXT");
        mAutoDBInfo.columns[5] = "isShowSetting";
        mAutoDBInfo.colsMap.put("isShowSetting", "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " wallet_region INTEGER PRIMARY KEY ,  function_list TEXT,  new_list TEXT,  banner_list TEXT,  type_name_list TEXT,  isShowSetting INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38628o9)) {
            return false;
        }
        C38628o9 o9Var = (C38628o9) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_wallet_region), Integer.valueOf(o9Var.field_wallet_region)) && C46238a.m51546a(this.field_function_list, o9Var.field_function_list) && C46238a.m51546a(this.field_new_list, o9Var.field_new_list) && C46238a.m51546a(this.field_banner_list, o9Var.field_banner_list) && C46238a.m51546a(this.field_type_name_list, o9Var.field_type_name_list) && C46238a.m51546a(Integer.valueOf(this.field_isShowSetting), Integer.valueOf(o9Var.field_isShowSetting));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103254o == hashCode) {
                    try {
                        this.field_wallet_region = cursor.getInt(i);
                        this.f103263d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103255p == hashCode) {
                    try {
                        this.field_function_list = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103256q == hashCode) {
                    try {
                        this.field_new_list = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103257r == hashCode) {
                    try {
                        this.field_banner_list = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103258s == hashCode) {
                    try {
                        this.field_type_name_list = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103259t == hashCode) {
                    try {
                        this.field_isShowSetting = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103260u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103263d) {
            contentValues.put("wallet_region", Integer.valueOf(this.field_wallet_region));
        }
        if (this.f103264e) {
            contentValues.put("function_list", this.field_function_list);
        }
        if (this.f103265f) {
            contentValues.put("new_list", this.field_new_list);
        }
        if (this.f103266g) {
            contentValues.put("banner_list", this.field_banner_list);
        }
        if (this.f103267h) {
            contentValues.put("type_name_list", this.field_type_name_list);
        }
        if (this.f103268i) {
            contentValues.put("isShowSetting", Integer.valueOf(this.field_isShowSetting));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWalletFunciontList", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WalletFunciontList ( " + f103261v.sql + ");");
        for (String add : f103253n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWalletFunciontList", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WalletFunciontList", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103261v, "WalletFunciontList", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWalletFunciontList", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WalletFunciontList", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWalletFunciontList", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103261v;
    }

    public String[] getIndexCreateSQL() {
        return f103253n;
    }

    public StorageObserverOwner<C38628o9> getObserverOwner() {
        return f103262w;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_wallet_region);
    }

    public SingleTable getTable() {
        return f103252j;
    }

    public String getTableName() {
        return f103252j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("wallet_region")) {
            this.field_wallet_region = contentValues.getAsInteger("wallet_region").intValue();
            if (z) {
                this.f103263d = true;
            }
        }
        if (contentValues.containsKey("function_list")) {
            this.field_function_list = contentValues.getAsString("function_list");
            if (z) {
                this.f103264e = true;
            }
        }
        if (contentValues.containsKey("new_list")) {
            this.field_new_list = contentValues.getAsString("new_list");
            if (z) {
                this.f103265f = true;
            }
        }
        if (contentValues.containsKey("banner_list")) {
            this.field_banner_list = contentValues.getAsString("banner_list");
            if (z) {
                this.f103266g = true;
            }
        }
        if (contentValues.containsKey("type_name_list")) {
            this.field_type_name_list = contentValues.getAsString("type_name_list");
            if (z) {
                this.f103267h = true;
            }
        }
        if (contentValues.containsKey("isShowSetting")) {
            this.field_isShowSetting = contentValues.getAsInteger("isShowSetting").intValue();
            if (z) {
                this.f103268i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
