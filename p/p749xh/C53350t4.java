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

/* renamed from: xh.t4 */
public class C53350t4 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f149920A = -887187658;

    /* renamed from: B */
    public static final int f149921B = -327542779;

    /* renamed from: C */
    public static final int f149922C = -265713450;

    /* renamed from: D */
    public static final int f149923D = 70690926;

    /* renamed from: E */
    public static final int f149924E = -785493235;

    /* renamed from: F */
    public static final int f149925F = -1947551393;

    /* renamed from: G */
    public static final int f149926G = -1622888905;

    /* renamed from: H */
    public static final int f149927H = -114822736;

    /* renamed from: I */
    public static final int f149928I = 112801;

    /* renamed from: J */
    public static final int f149929J = -892481550;

    /* renamed from: K */
    public static final int f149930K = -1500045593;

    /* renamed from: L */
    public static final int f149931L = 1786555038;

    /* renamed from: M */
    public static final int f149932M = -703098786;

    /* renamed from: N */
    public static final int f149933N = -1374215859;

    /* renamed from: P */
    public static final int f149934P = 108705909;

    /* renamed from: Q */
    public static final IAutoDBItem.MAutoDBInfo f149935Q = initAutoDBInfo(C53350t4.class);

    /* renamed from: R */
    public static final StorageObserverOwner<C53350t4> f149936R = new StorageObserverOwner<>();

    /* renamed from: w */
    public static final SingleTable f149937w;

    /* renamed from: x */
    public static final String[] f149938x = new String[0];

    /* renamed from: y */
    public static final int f149939y = 2125775124;

    /* renamed from: z */
    public static final int f149940z = -1534389180;

    /* renamed from: d */
    public boolean f149941d = true;

    /* renamed from: e */
    public boolean f149942e = true;

    /* renamed from: f */
    public boolean f149943f = true;
    public String field_big_url;
    public String field_contecttype;
    public int field_googlecgistatus;
    public String field_googlegmail;
    public String field_googleid;
    public String field_googleitemid;
    public String field_googlename;
    public String field_googlenamepy;
    public String field_googlephotourl;
    public String field_nickname;
    public String field_nicknameqp;
    public int field_ret;
    public String field_small_url;
    public int field_status;
    public String field_username;
    public String field_usernamepy;

    /* renamed from: g */
    public boolean f149944g = true;

    /* renamed from: h */
    public boolean f149945h = true;

    /* renamed from: i */
    public boolean f149946i = true;

    /* renamed from: j */
    public boolean f149947j = true;

    /* renamed from: n */
    public boolean f149948n = true;

    /* renamed from: o */
    public boolean f149949o = true;

    /* renamed from: p */
    public boolean f149950p = true;

    /* renamed from: q */
    public boolean f149951q = true;

    /* renamed from: r */
    public boolean f149952r = true;

    /* renamed from: s */
    public boolean f149953s = true;

    /* renamed from: t */
    public boolean f149954t = true;

    /* renamed from: u */
    public boolean f149955u = true;

    /* renamed from: v */
    public boolean f149956v = true;

    static {
        SingleTable singleTable = new SingleTable("GoogleFriend");
        f149937w = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("googleid", "string", singleTable.getName(), "");
        new Column("googlename", "string", singleTable.getName(), "");
        new Column("googlephotourl", "string", singleTable.getName(), "");
        new Column("googlegmail", "string", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("nicknameqp", "string", singleTable.getName(), "");
        new Column("usernamepy", "string", singleTable.getName(), "");
        new Column("small_url", "string", singleTable.getName(), "");
        new Column("big_url", "string", singleTable.getName(), "");
        new Column("ret", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("googleitemid", "string", singleTable.getName(), "");
        new Column("googlecgistatus", "int", singleTable.getName(), "");
        new Column("contecttype", "string", singleTable.getName(), "");
        new Column("googlenamepy", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[16];
        String[] strArr = new String[17];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "googleid";
        mAutoDBInfo.colsMap.put("googleid", "TEXT");
        mAutoDBInfo.columns[1] = "googlename";
        mAutoDBInfo.colsMap.put("googlename", "TEXT");
        mAutoDBInfo.columns[2] = "googlephotourl";
        mAutoDBInfo.colsMap.put("googlephotourl", "TEXT");
        mAutoDBInfo.columns[3] = "googlegmail";
        mAutoDBInfo.colsMap.put("googlegmail", "TEXT");
        mAutoDBInfo.columns[4] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[5] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT");
        mAutoDBInfo.columns[6] = "nicknameqp";
        mAutoDBInfo.colsMap.put("nicknameqp", "TEXT");
        mAutoDBInfo.columns[7] = "usernamepy";
        mAutoDBInfo.colsMap.put("usernamepy", "TEXT");
        mAutoDBInfo.columns[8] = "small_url";
        mAutoDBInfo.colsMap.put("small_url", "TEXT");
        mAutoDBInfo.columns[9] = "big_url";
        mAutoDBInfo.colsMap.put("big_url", "TEXT");
        mAutoDBInfo.columns[10] = "ret";
        mAutoDBInfo.colsMap.put("ret", "INTEGER");
        mAutoDBInfo.columns[11] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[12] = "googleitemid";
        mAutoDBInfo.colsMap.put("googleitemid", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "googleitemid";
        mAutoDBInfo.columns[13] = "googlecgistatus";
        mAutoDBInfo.colsMap.put("googlecgistatus", "INTEGER default '2' ");
        mAutoDBInfo.columns[14] = "contecttype";
        mAutoDBInfo.colsMap.put("contecttype", "TEXT");
        mAutoDBInfo.columns[15] = "googlenamepy";
        mAutoDBInfo.colsMap.put("googlenamepy", "TEXT");
        mAutoDBInfo.columns[16] = "rowid";
        mAutoDBInfo.sql = " googleid TEXT,  googlename TEXT,  googlephotourl TEXT,  googlegmail TEXT,  username TEXT,  nickname TEXT,  nicknameqp TEXT,  usernamepy TEXT,  small_url TEXT,  big_url TEXT,  ret INTEGER,  status INTEGER,  googleitemid TEXT PRIMARY KEY ,  googlecgistatus INTEGER default '2' ,  contecttype TEXT,  googlenamepy TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53350t4)) {
            return false;
        }
        C53350t4 t4Var = (C53350t4) iAutoDBItem;
        return C46238a.m51546a(this.field_googleid, t4Var.field_googleid) && C46238a.m51546a(this.field_googlename, t4Var.field_googlename) && C46238a.m51546a(this.field_googlephotourl, t4Var.field_googlephotourl) && C46238a.m51546a(this.field_googlegmail, t4Var.field_googlegmail) && C46238a.m51546a(this.field_username, t4Var.field_username) && C46238a.m51546a(this.field_nickname, t4Var.field_nickname) && C46238a.m51546a(this.field_nicknameqp, t4Var.field_nicknameqp) && C46238a.m51546a(this.field_usernamepy, t4Var.field_usernamepy) && C46238a.m51546a(this.field_small_url, t4Var.field_small_url) && C46238a.m51546a(this.field_big_url, t4Var.field_big_url) && C46238a.m51546a(Integer.valueOf(this.field_ret), Integer.valueOf(t4Var.field_ret)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(t4Var.field_status)) && C46238a.m51546a(this.field_googleitemid, t4Var.field_googleitemid) && C46238a.m51546a(Integer.valueOf(this.field_googlecgistatus), Integer.valueOf(t4Var.field_googlecgistatus)) && C46238a.m51546a(this.field_contecttype, t4Var.field_contecttype) && C46238a.m51546a(this.field_googlenamepy, t4Var.field_googlenamepy);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149939y == hashCode) {
                    try {
                        this.field_googleid = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149940z == hashCode) {
                    try {
                        this.field_googlename = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149920A == hashCode) {
                    try {
                        this.field_googlephotourl = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149921B == hashCode) {
                    try {
                        this.field_googlegmail = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149922C == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149923D == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149924E == hashCode) {
                    try {
                        this.field_nicknameqp = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149925F == hashCode) {
                    try {
                        this.field_usernamepy = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149926G == hashCode) {
                    try {
                        this.field_small_url = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149927H == hashCode) {
                    try {
                        this.field_big_url = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149928I == hashCode) {
                    try {
                        this.field_ret = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149929J == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149930K == hashCode) {
                    try {
                        this.field_googleitemid = cursor.getString(i);
                        this.f149953s = true;
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149931L == hashCode) {
                    try {
                        this.field_googlecgistatus = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149932M == hashCode) {
                    try {
                        this.field_contecttype = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149933N == hashCode) {
                    try {
                        this.field_googlenamepy = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149934P == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149941d) {
            contentValues.put("googleid", this.field_googleid);
        }
        if (this.f149942e) {
            contentValues.put("googlename", this.field_googlename);
        }
        if (this.f149943f) {
            contentValues.put("googlephotourl", this.field_googlephotourl);
        }
        if (this.f149944g) {
            contentValues.put("googlegmail", this.field_googlegmail);
        }
        if (this.f149945h) {
            contentValues.put("username", this.field_username);
        }
        if (this.f149946i) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f149947j) {
            contentValues.put("nicknameqp", this.field_nicknameqp);
        }
        if (this.f149948n) {
            contentValues.put("usernamepy", this.field_usernamepy);
        }
        if (this.f149949o) {
            contentValues.put("small_url", this.field_small_url);
        }
        if (this.f149950p) {
            contentValues.put("big_url", this.field_big_url);
        }
        if (this.f149951q) {
            contentValues.put("ret", Integer.valueOf(this.field_ret));
        }
        if (this.f149952r) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f149953s) {
            contentValues.put("googleitemid", this.field_googleitemid);
        }
        if (this.f149954t) {
            contentValues.put("googlecgistatus", Integer.valueOf(this.field_googlecgistatus));
        }
        if (this.f149955u) {
            contentValues.put("contecttype", this.field_contecttype);
        }
        if (this.f149956v) {
            contentValues.put("googlenamepy", this.field_googlenamepy);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGoogleFriend", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GoogleFriend ( " + f149935Q.sql + ");");
        for (String add : f149938x) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGoogleFriend", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GoogleFriend", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149935Q, "GoogleFriend", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGoogleFriend", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GoogleFriend", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGoogleFriend", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149935Q;
    }

    public String[] getIndexCreateSQL() {
        return f149938x;
    }

    public StorageObserverOwner<C53350t4> getObserverOwner() {
        return f149936R;
    }

    public Object getPrimaryKeyValue() {
        return this.field_googleitemid;
    }

    public SingleTable getTable() {
        return f149937w;
    }

    public String getTableName() {
        return f149937w.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("googleid")) {
            this.field_googleid = contentValues.getAsString("googleid");
            if (z) {
                this.f149941d = true;
            }
        }
        if (contentValues.containsKey("googlename")) {
            this.field_googlename = contentValues.getAsString("googlename");
            if (z) {
                this.f149942e = true;
            }
        }
        if (contentValues.containsKey("googlephotourl")) {
            this.field_googlephotourl = contentValues.getAsString("googlephotourl");
            if (z) {
                this.f149943f = true;
            }
        }
        if (contentValues.containsKey("googlegmail")) {
            this.field_googlegmail = contentValues.getAsString("googlegmail");
            if (z) {
                this.f149944g = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f149945h = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f149946i = true;
            }
        }
        if (contentValues.containsKey("nicknameqp")) {
            this.field_nicknameqp = contentValues.getAsString("nicknameqp");
            if (z) {
                this.f149947j = true;
            }
        }
        if (contentValues.containsKey("usernamepy")) {
            this.field_usernamepy = contentValues.getAsString("usernamepy");
            if (z) {
                this.f149948n = true;
            }
        }
        if (contentValues.containsKey("small_url")) {
            this.field_small_url = contentValues.getAsString("small_url");
            if (z) {
                this.f149949o = true;
            }
        }
        if (contentValues.containsKey("big_url")) {
            this.field_big_url = contentValues.getAsString("big_url");
            if (z) {
                this.f149950p = true;
            }
        }
        if (contentValues.containsKey("ret")) {
            this.field_ret = contentValues.getAsInteger("ret").intValue();
            if (z) {
                this.f149951q = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f149952r = true;
            }
        }
        if (contentValues.containsKey("googleitemid")) {
            this.field_googleitemid = contentValues.getAsString("googleitemid");
            if (z) {
                this.f149953s = true;
            }
        }
        if (contentValues.containsKey("googlecgistatus")) {
            this.field_googlecgistatus = contentValues.getAsInteger("googlecgistatus").intValue();
            if (z) {
                this.f149954t = true;
            }
        }
        if (contentValues.containsKey("contecttype")) {
            this.field_contecttype = contentValues.getAsString("contecttype");
            if (z) {
                this.f149955u = true;
            }
        }
        if (contentValues.containsKey("googlenamepy")) {
            this.field_googlenamepy = contentValues.getAsString("googlenamepy");
            if (z) {
                this.f149956v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
