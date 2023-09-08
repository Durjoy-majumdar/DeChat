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

/* renamed from: xh.p9 */
public class C38637p9 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103318j;

    /* renamed from: n */
    public static final String[] f103319n = new String[0];

    /* renamed from: o */
    public static final int f103320o = 1483411318;

    /* renamed from: p */
    public static final int f103321p = -801536064;

    /* renamed from: q */
    public static final int f103322q = -801737967;

    /* renamed from: r */
    public static final int f103323r = -198363103;

    /* renamed from: s */
    public static final int f103324s = 1971282070;

    /* renamed from: t */
    public static final int f103325t = -1712330219;

    /* renamed from: u */
    public static final int f103326u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f103327v = initAutoDBInfo(C38637p9.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38637p9> f103328w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103329d = true;

    /* renamed from: e */
    public boolean f103330e = true;

    /* renamed from: f */
    public boolean f103331f = true;
    public int field_wallet_balance;
    public String field_wallet_name;
    public int field_wallet_selected;
    public String field_wallet_tpa_country;
    public int field_wallet_tpa_country_mask;
    public int field_wallet_type;

    /* renamed from: g */
    public boolean f103332g = true;

    /* renamed from: h */
    public boolean f103333h = true;

    /* renamed from: i */
    public boolean f103334i = true;

    static {
        SingleTable singleTable = new SingleTable("WalletKindInfo");
        f103318j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("wallet_tpa_country", "string", singleTable.getName(), "");
        new Column("wallet_type", "int", singleTable.getName(), "");
        new Column("wallet_name", "string", singleTable.getName(), "");
        new Column("wallet_selected", "int", singleTable.getName(), "");
        new Column("wallet_balance", "int", singleTable.getName(), "");
        new Column("wallet_tpa_country_mask", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "wallet_tpa_country";
        mAutoDBInfo.colsMap.put("wallet_tpa_country", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "wallet_tpa_country";
        mAutoDBInfo.columns[1] = "wallet_type";
        mAutoDBInfo.colsMap.put("wallet_type", "INTEGER");
        mAutoDBInfo.columns[2] = "wallet_name";
        mAutoDBInfo.colsMap.put("wallet_name", "TEXT");
        mAutoDBInfo.columns[3] = "wallet_selected";
        mAutoDBInfo.colsMap.put("wallet_selected", "INTEGER");
        mAutoDBInfo.columns[4] = "wallet_balance";
        mAutoDBInfo.colsMap.put("wallet_balance", "INTEGER");
        mAutoDBInfo.columns[5] = "wallet_tpa_country_mask";
        mAutoDBInfo.colsMap.put("wallet_tpa_country_mask", "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " wallet_tpa_country TEXT PRIMARY KEY ,  wallet_type INTEGER,  wallet_name TEXT,  wallet_selected INTEGER,  wallet_balance INTEGER,  wallet_tpa_country_mask INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38637p9)) {
            return false;
        }
        C38637p9 p9Var = (C38637p9) iAutoDBItem;
        return C46238a.m51546a(this.field_wallet_tpa_country, p9Var.field_wallet_tpa_country) && C46238a.m51546a(Integer.valueOf(this.field_wallet_type), Integer.valueOf(p9Var.field_wallet_type)) && C46238a.m51546a(this.field_wallet_name, p9Var.field_wallet_name) && C46238a.m51546a(Integer.valueOf(this.field_wallet_selected), Integer.valueOf(p9Var.field_wallet_selected)) && C46238a.m51546a(Integer.valueOf(this.field_wallet_balance), Integer.valueOf(p9Var.field_wallet_balance)) && C46238a.m51546a(Integer.valueOf(this.field_wallet_tpa_country_mask), Integer.valueOf(p9Var.field_wallet_tpa_country_mask));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103320o == hashCode) {
                    try {
                        this.field_wallet_tpa_country = cursor.getString(i);
                        this.f103329d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103321p == hashCode) {
                    try {
                        this.field_wallet_type = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103322q == hashCode) {
                    try {
                        this.field_wallet_name = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103323r == hashCode) {
                    try {
                        this.field_wallet_selected = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103324s == hashCode) {
                    try {
                        this.field_wallet_balance = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103325t == hashCode) {
                    try {
                        this.field_wallet_tpa_country_mask = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103326u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103329d) {
            contentValues.put("wallet_tpa_country", this.field_wallet_tpa_country);
        }
        if (this.f103330e) {
            contentValues.put("wallet_type", Integer.valueOf(this.field_wallet_type));
        }
        if (this.f103331f) {
            contentValues.put("wallet_name", this.field_wallet_name);
        }
        if (this.f103332g) {
            contentValues.put("wallet_selected", Integer.valueOf(this.field_wallet_selected));
        }
        if (this.f103333h) {
            contentValues.put("wallet_balance", Integer.valueOf(this.field_wallet_balance));
        }
        if (this.f103334i) {
            contentValues.put("wallet_tpa_country_mask", Integer.valueOf(this.field_wallet_tpa_country_mask));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWalletKindInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WalletKindInfo ( " + f103327v.sql + ");");
        for (String add : f103319n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWalletKindInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WalletKindInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103327v, "WalletKindInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWalletKindInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WalletKindInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWalletKindInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103327v;
    }

    public String[] getIndexCreateSQL() {
        return f103319n;
    }

    public StorageObserverOwner<C38637p9> getObserverOwner() {
        return f103328w;
    }

    public Object getPrimaryKeyValue() {
        return this.field_wallet_tpa_country;
    }

    public SingleTable getTable() {
        return f103318j;
    }

    public String getTableName() {
        return f103318j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("wallet_tpa_country")) {
            this.field_wallet_tpa_country = contentValues.getAsString("wallet_tpa_country");
            if (z) {
                this.f103329d = true;
            }
        }
        if (contentValues.containsKey("wallet_type")) {
            this.field_wallet_type = contentValues.getAsInteger("wallet_type").intValue();
            if (z) {
                this.f103330e = true;
            }
        }
        if (contentValues.containsKey("wallet_name")) {
            this.field_wallet_name = contentValues.getAsString("wallet_name");
            if (z) {
                this.f103331f = true;
            }
        }
        if (contentValues.containsKey("wallet_selected")) {
            this.field_wallet_selected = contentValues.getAsInteger("wallet_selected").intValue();
            if (z) {
                this.f103332g = true;
            }
        }
        if (contentValues.containsKey("wallet_balance")) {
            this.field_wallet_balance = contentValues.getAsInteger("wallet_balance").intValue();
            if (z) {
                this.f103333h = true;
            }
        }
        if (contentValues.containsKey("wallet_tpa_country_mask")) {
            this.field_wallet_tpa_country_mask = contentValues.getAsInteger("wallet_tpa_country_mask").intValue();
            if (z) {
                this.f103334i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
