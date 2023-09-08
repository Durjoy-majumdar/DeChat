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

/* renamed from: xh.n9 */
public class C38620n9 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f103146A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f103147B = initAutoDBInfo(C38620n9.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C38620n9> f103148C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f103149p;

    /* renamed from: q */
    public static final String[] f103150q = new String[0];

    /* renamed from: r */
    public static final int f103151r = 387619828;

    /* renamed from: s */
    public static final int f103152s = -2122613279;

    /* renamed from: t */
    public static final int f103153t = 1207108311;

    /* renamed from: u */
    public static final int f103154u = -1155412283;

    /* renamed from: v */
    public static final int f103155v = 1524956312;

    /* renamed from: w */
    public static final int f103156w = 1741636017;

    /* renamed from: x */
    public static final int f103157x = -254991906;

    /* renamed from: y */
    public static final int f103158y = 1898728418;

    /* renamed from: z */
    public static final int f103159z = 3575610;

    /* renamed from: d */
    public boolean f103160d = true;

    /* renamed from: e */
    public boolean f103161e = true;

    /* renamed from: f */
    public boolean f103162f = true;
    public String field_bulletin_content;
    public String field_bulletin_scene;
    public String field_bulletin_url;
    public int field_is_show_notice;
    public String field_jump_url;
    public String field_left_icon;
    public String field_notice_id;
    public int field_type;
    public String field_wording;

    /* renamed from: g */
    public boolean f103163g = true;

    /* renamed from: h */
    public boolean f103164h = true;

    /* renamed from: i */
    public boolean f103165i = true;

    /* renamed from: j */
    public boolean f103166j = true;

    /* renamed from: n */
    public boolean f103167n = true;

    /* renamed from: o */
    public boolean f103168o = true;

    static {
        SingleTable singleTable = new SingleTable("WalletBulletin");
        f103149p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("bulletin_scene", "string", singleTable.getName(), "");
        new Column("bulletin_content", "string", singleTable.getName(), "");
        new Column("bulletin_url", "string", singleTable.getName(), "");
        new Column("is_show_notice", "int", singleTable.getName(), "");
        new Column("wording", "string", singleTable.getName(), "");
        new Column("left_icon", "string", singleTable.getName(), "");
        new Column("jump_url", "string", singleTable.getName(), "");
        new Column("notice_id", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "bulletin_scene";
        mAutoDBInfo.colsMap.put("bulletin_scene", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "bulletin_scene";
        mAutoDBInfo.columns[1] = "bulletin_content";
        mAutoDBInfo.colsMap.put("bulletin_content", "TEXT");
        mAutoDBInfo.columns[2] = "bulletin_url";
        mAutoDBInfo.colsMap.put("bulletin_url", "TEXT");
        mAutoDBInfo.columns[3] = "is_show_notice";
        mAutoDBInfo.colsMap.put("is_show_notice", "INTEGER");
        mAutoDBInfo.columns[4] = "wording";
        mAutoDBInfo.colsMap.put("wording", "TEXT");
        mAutoDBInfo.columns[5] = "left_icon";
        mAutoDBInfo.colsMap.put("left_icon", "TEXT");
        mAutoDBInfo.columns[6] = "jump_url";
        mAutoDBInfo.colsMap.put("jump_url", "TEXT");
        mAutoDBInfo.columns[7] = "notice_id";
        mAutoDBInfo.colsMap.put("notice_id", "TEXT");
        mAutoDBInfo.columns[8] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER default '1' ");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " bulletin_scene TEXT PRIMARY KEY ,  bulletin_content TEXT,  bulletin_url TEXT,  is_show_notice INTEGER,  wording TEXT,  left_icon TEXT,  jump_url TEXT,  notice_id TEXT,  type INTEGER default '1' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38620n9)) {
            return false;
        }
        C38620n9 n9Var = (C38620n9) iAutoDBItem;
        return C46238a.m51546a(this.field_bulletin_scene, n9Var.field_bulletin_scene) && C46238a.m51546a(this.field_bulletin_content, n9Var.field_bulletin_content) && C46238a.m51546a(this.field_bulletin_url, n9Var.field_bulletin_url) && C46238a.m51546a(Integer.valueOf(this.field_is_show_notice), Integer.valueOf(n9Var.field_is_show_notice)) && C46238a.m51546a(this.field_wording, n9Var.field_wording) && C46238a.m51546a(this.field_left_icon, n9Var.field_left_icon) && C46238a.m51546a(this.field_jump_url, n9Var.field_jump_url) && C46238a.m51546a(this.field_notice_id, n9Var.field_notice_id) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(n9Var.field_type));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103151r == hashCode) {
                    try {
                        this.field_bulletin_scene = cursor.getString(i);
                        this.f103160d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103152s == hashCode) {
                    try {
                        this.field_bulletin_content = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103153t == hashCode) {
                    try {
                        this.field_bulletin_url = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103154u == hashCode) {
                    try {
                        this.field_is_show_notice = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103155v == hashCode) {
                    try {
                        this.field_wording = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103156w == hashCode) {
                    try {
                        this.field_left_icon = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103157x == hashCode) {
                    try {
                        this.field_jump_url = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103158y == hashCode) {
                    try {
                        this.field_notice_id = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103159z == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103146A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103160d) {
            contentValues.put("bulletin_scene", this.field_bulletin_scene);
        }
        if (this.f103161e) {
            contentValues.put("bulletin_content", this.field_bulletin_content);
        }
        if (this.f103162f) {
            contentValues.put("bulletin_url", this.field_bulletin_url);
        }
        if (this.f103163g) {
            contentValues.put("is_show_notice", Integer.valueOf(this.field_is_show_notice));
        }
        if (this.f103164h) {
            contentValues.put("wording", this.field_wording);
        }
        if (this.f103165i) {
            contentValues.put("left_icon", this.field_left_icon);
        }
        if (this.f103166j) {
            contentValues.put("jump_url", this.field_jump_url);
        }
        if (this.f103167n) {
            contentValues.put("notice_id", this.field_notice_id);
        }
        if (this.f103168o) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWalletBulletin", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WalletBulletin ( " + f103147B.sql + ");");
        for (String add : f103150q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWalletBulletin", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WalletBulletin", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103147B, "WalletBulletin", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWalletBulletin", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WalletBulletin", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWalletBulletin", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103147B;
    }

    public String[] getIndexCreateSQL() {
        return f103150q;
    }

    public StorageObserverOwner<C38620n9> getObserverOwner() {
        return f103148C;
    }

    public Object getPrimaryKeyValue() {
        return this.field_bulletin_scene;
    }

    public SingleTable getTable() {
        return f103149p;
    }

    public String getTableName() {
        return f103149p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("bulletin_scene")) {
            this.field_bulletin_scene = contentValues.getAsString("bulletin_scene");
            if (z) {
                this.f103160d = true;
            }
        }
        if (contentValues.containsKey("bulletin_content")) {
            this.field_bulletin_content = contentValues.getAsString("bulletin_content");
            if (z) {
                this.f103161e = true;
            }
        }
        if (contentValues.containsKey("bulletin_url")) {
            this.field_bulletin_url = contentValues.getAsString("bulletin_url");
            if (z) {
                this.f103162f = true;
            }
        }
        if (contentValues.containsKey("is_show_notice")) {
            this.field_is_show_notice = contentValues.getAsInteger("is_show_notice").intValue();
            if (z) {
                this.f103163g = true;
            }
        }
        if (contentValues.containsKey("wording")) {
            this.field_wording = contentValues.getAsString("wording");
            if (z) {
                this.f103164h = true;
            }
        }
        if (contentValues.containsKey("left_icon")) {
            this.field_left_icon = contentValues.getAsString("left_icon");
            if (z) {
                this.f103165i = true;
            }
        }
        if (contentValues.containsKey("jump_url")) {
            this.field_jump_url = contentValues.getAsString("jump_url");
            if (z) {
                this.f103166j = true;
            }
        }
        if (contentValues.containsKey("notice_id")) {
            this.field_notice_id = contentValues.getAsString("notice_id");
            if (z) {
                this.f103167n = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f103168o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
