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

/* renamed from: xh.r9 */
public class C53348r9 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f149852A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f149853B = initAutoDBInfo(C53348r9.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C53348r9> f149854C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f149855p;

    /* renamed from: q */
    public static final String[] f149856q = new String[0];

    /* renamed from: r */
    public static final int f149857r = -1288853949;

    /* renamed from: s */
    public static final int f149858s = -1629634244;

    /* renamed from: t */
    public static final int f149859t = -1288843949;

    /* renamed from: u */
    public static final int f149860u = 2082222322;

    /* renamed from: v */
    public static final int f149861v = -1299975379;

    /* renamed from: w */
    public static final int f149862w = 2027875547;

    /* renamed from: x */
    public static final int f149863x = 685162667;

    /* renamed from: y */
    public static final int f149864y = -1101010892;

    /* renamed from: z */
    public static final int f149865z = -540204413;

    /* renamed from: d */
    public boolean f149866d = true;

    /* renamed from: e */
    public boolean f149867e = true;

    /* renamed from: f */
    public boolean f149868f = true;
    public int field_is_show;
    public int field_jump_type;
    public String field_logo_url;
    public String field_pref_desc;
    public String field_pref_key;
    public String field_pref_title;
    public String field_pref_url;
    public String field_tinyapp_path;
    public String field_tinyapp_username;

    /* renamed from: g */
    public boolean f149869g = true;

    /* renamed from: h */
    public boolean f149870h = true;

    /* renamed from: i */
    public boolean f149871i = true;

    /* renamed from: j */
    public boolean f149872j = true;

    /* renamed from: n */
    public boolean f149873n = true;

    /* renamed from: o */
    public boolean f149874o = true;

    static {
        SingleTable singleTable = new SingleTable("WalletPrefInfo");
        f149855p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("pref_key", "string", singleTable.getName(), "");
        new Column("pref_title", "string", singleTable.getName(), "");
        new Column("pref_url", "string", singleTable.getName(), "");
        new Column("is_show", "int", singleTable.getName(), "");
        new Column("pref_desc", "string", singleTable.getName(), "");
        new Column("logo_url", "string", singleTable.getName(), "");
        new Column("jump_type", "int", singleTable.getName(), "");
        new Column("tinyapp_username", "string", singleTable.getName(), "");
        new Column("tinyapp_path", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "pref_key";
        mAutoDBInfo.colsMap.put("pref_key", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "pref_key";
        mAutoDBInfo.columns[1] = "pref_title";
        mAutoDBInfo.colsMap.put("pref_title", "TEXT");
        mAutoDBInfo.columns[2] = "pref_url";
        mAutoDBInfo.colsMap.put("pref_url", "TEXT");
        mAutoDBInfo.columns[3] = "is_show";
        mAutoDBInfo.colsMap.put("is_show", "INTEGER default '1' ");
        mAutoDBInfo.columns[4] = "pref_desc";
        mAutoDBInfo.colsMap.put("pref_desc", "TEXT");
        mAutoDBInfo.columns[5] = "logo_url";
        mAutoDBInfo.colsMap.put("logo_url", "TEXT");
        mAutoDBInfo.columns[6] = "jump_type";
        mAutoDBInfo.colsMap.put("jump_type", "INTEGER");
        mAutoDBInfo.columns[7] = "tinyapp_username";
        mAutoDBInfo.colsMap.put("tinyapp_username", "TEXT");
        mAutoDBInfo.columns[8] = "tinyapp_path";
        mAutoDBInfo.colsMap.put("tinyapp_path", "TEXT");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " pref_key TEXT PRIMARY KEY ,  pref_title TEXT,  pref_url TEXT,  is_show INTEGER default '1' ,  pref_desc TEXT,  logo_url TEXT,  jump_type INTEGER,  tinyapp_username TEXT,  tinyapp_path TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53348r9)) {
            return false;
        }
        C53348r9 r9Var = (C53348r9) iAutoDBItem;
        return C46238a.m51546a(this.field_pref_key, r9Var.field_pref_key) && C46238a.m51546a(this.field_pref_title, r9Var.field_pref_title) && C46238a.m51546a(this.field_pref_url, r9Var.field_pref_url) && C46238a.m51546a(Integer.valueOf(this.field_is_show), Integer.valueOf(r9Var.field_is_show)) && C46238a.m51546a(this.field_pref_desc, r9Var.field_pref_desc) && C46238a.m51546a(this.field_logo_url, r9Var.field_logo_url) && C46238a.m51546a(Integer.valueOf(this.field_jump_type), Integer.valueOf(r9Var.field_jump_type)) && C46238a.m51546a(this.field_tinyapp_username, r9Var.field_tinyapp_username) && C46238a.m51546a(this.field_tinyapp_path, r9Var.field_tinyapp_path);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149857r == hashCode) {
                    try {
                        this.field_pref_key = cursor.getString(i);
                        this.f149866d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149858s == hashCode) {
                    try {
                        this.field_pref_title = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149859t == hashCode) {
                    try {
                        this.field_pref_url = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149860u == hashCode) {
                    try {
                        this.field_is_show = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149861v == hashCode) {
                    try {
                        this.field_pref_desc = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149862w == hashCode) {
                    try {
                        this.field_logo_url = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149863x == hashCode) {
                    try {
                        this.field_jump_type = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149864y == hashCode) {
                    try {
                        this.field_tinyapp_username = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149865z == hashCode) {
                    try {
                        this.field_tinyapp_path = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149852A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149866d) {
            contentValues.put("pref_key", this.field_pref_key);
        }
        if (this.f149867e) {
            contentValues.put("pref_title", this.field_pref_title);
        }
        if (this.f149868f) {
            contentValues.put("pref_url", this.field_pref_url);
        }
        if (this.f149869g) {
            contentValues.put("is_show", Integer.valueOf(this.field_is_show));
        }
        if (this.f149870h) {
            contentValues.put("pref_desc", this.field_pref_desc);
        }
        if (this.f149871i) {
            contentValues.put("logo_url", this.field_logo_url);
        }
        if (this.f149872j) {
            contentValues.put("jump_type", Integer.valueOf(this.field_jump_type));
        }
        if (this.f149873n) {
            contentValues.put("tinyapp_username", this.field_tinyapp_username);
        }
        if (this.f149874o) {
            contentValues.put("tinyapp_path", this.field_tinyapp_path);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWalletPrefInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WalletPrefInfo ( " + f149853B.sql + ");");
        for (String add : f149856q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWalletPrefInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WalletPrefInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149853B, "WalletPrefInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWalletPrefInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WalletPrefInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWalletPrefInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149853B;
    }

    public String[] getIndexCreateSQL() {
        return f149856q;
    }

    public StorageObserverOwner<C53348r9> getObserverOwner() {
        return f149854C;
    }

    public Object getPrimaryKeyValue() {
        return this.field_pref_key;
    }

    public SingleTable getTable() {
        return f149855p;
    }

    public String getTableName() {
        return f149855p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("pref_key")) {
            this.field_pref_key = contentValues.getAsString("pref_key");
            if (z) {
                this.f149866d = true;
            }
        }
        if (contentValues.containsKey("pref_title")) {
            this.field_pref_title = contentValues.getAsString("pref_title");
            if (z) {
                this.f149867e = true;
            }
        }
        if (contentValues.containsKey("pref_url")) {
            this.field_pref_url = contentValues.getAsString("pref_url");
            if (z) {
                this.f149868f = true;
            }
        }
        if (contentValues.containsKey("is_show")) {
            this.field_is_show = contentValues.getAsInteger("is_show").intValue();
            if (z) {
                this.f149869g = true;
            }
        }
        if (contentValues.containsKey("pref_desc")) {
            this.field_pref_desc = contentValues.getAsString("pref_desc");
            if (z) {
                this.f149870h = true;
            }
        }
        if (contentValues.containsKey("logo_url")) {
            this.field_logo_url = contentValues.getAsString("logo_url");
            if (z) {
                this.f149871i = true;
            }
        }
        if (contentValues.containsKey("jump_type")) {
            this.field_jump_type = contentValues.getAsInteger("jump_type").intValue();
            if (z) {
                this.f149872j = true;
            }
        }
        if (contentValues.containsKey("tinyapp_username")) {
            this.field_tinyapp_username = contentValues.getAsString("tinyapp_username");
            if (z) {
                this.f149873n = true;
            }
        }
        if (contentValues.containsKey("tinyapp_path")) {
            this.field_tinyapp_path = contentValues.getAsString("tinyapp_path");
            if (z) {
                this.f149874o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
