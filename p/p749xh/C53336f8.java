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

/* renamed from: xh.f8 */
public class C53336f8 extends IAutoDBItem {

    /* renamed from: A */
    public static final SingleTable f149360A;

    /* renamed from: B */
    public static final String[] f149361B = new String[0];

    /* renamed from: C */
    public static final int f149362C = 462907924;

    /* renamed from: D */
    public static final int f149363D = -265713450;

    /* renamed from: E */
    public static final int f149364E = 70690926;

    /* renamed from: F */
    public static final int f149365F = -987485392;

    /* renamed from: G */
    public static final int f149366G = 3053931;

    /* renamed from: H */
    public static final int f149367H = 1073584312;

    /* renamed from: I */
    public static final int f149368I = 288459765;

    /* renamed from: J */
    public static final int f149369J = 113766;

    /* renamed from: K */
    public static final int f149370K = 509692277;

    /* renamed from: L */
    public static final int f149371L = 118137549;

    /* renamed from: M */
    public static final int f149372M = -130486271;

    /* renamed from: N */
    public static final int f149373N = 2022955529;

    /* renamed from: P */
    public static final int f149374P = 2022955530;

    /* renamed from: Q */
    public static final int f149375Q = 2022955531;

    /* renamed from: R */
    public static final int f149376R = 2022955532;

    /* renamed from: S */
    public static final int f149377S = 3575610;

    /* renamed from: T */
    public static final int f149378T = -486944182;

    /* renamed from: U */
    public static final int f149379U = -1991004415;

    /* renamed from: V */
    public static final int f149380V = -2053655292;

    /* renamed from: W */
    public static final int f149381W = -1466057341;

    /* renamed from: X */
    public static final int f149382X = 108705909;

    /* renamed from: Y */
    public static final IAutoDBItem.MAutoDBInfo f149383Y = initAutoDBInfo(C53336f8.class);

    /* renamed from: Z */
    public static final StorageObserverOwner<C53336f8> f149384Z = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f149385d = true;

    /* renamed from: e */
    public boolean f149386e = true;

    /* renamed from: f */
    public boolean f149387f = true;
    public String field_city;
    public String field_distance;
    public int field_hasHDImg;
    public int field_imgstatus;
    public int field_insertBatch;
    public byte[] field_lvbuffer;
    public String field_nickname;
    public String field_province;
    public String field_regionCode;
    public int field_reserved1;
    public int field_reserved2;
    public String field_reserved3;
    public String field_reserved4;
    public int field_sex;
    public int field_shakeItemID;
    public String field_signature;
    public int field_snsFlag;
    public String field_sns_bgurl;
    public int field_type;
    public String field_username;

    /* renamed from: g */
    public boolean f149388g = true;

    /* renamed from: h */
    public boolean f149389h = true;

    /* renamed from: i */
    public boolean f149390i = true;

    /* renamed from: j */
    public boolean f149391j = true;

    /* renamed from: n */
    public boolean f149392n = true;

    /* renamed from: o */
    public boolean f149393o = true;

    /* renamed from: p */
    public boolean f149394p = true;

    /* renamed from: q */
    public boolean f149395q = true;

    /* renamed from: r */
    public boolean f149396r = true;

    /* renamed from: s */
    public boolean f149397s = true;

    /* renamed from: t */
    public boolean f149398t = true;

    /* renamed from: u */
    public boolean f149399u = true;

    /* renamed from: v */
    public boolean f149400v = true;

    /* renamed from: w */
    public boolean f149401w = true;

    /* renamed from: x */
    public boolean f149402x = true;

    /* renamed from: y */
    public boolean f149403y = true;

    /* renamed from: z */
    public boolean f149404z = true;

    static {
        SingleTable singleTable = new SingleTable("shakeitem1");
        f149360A = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("shakeItemID", "int", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("province", "string", singleTable.getName(), "");
        new Column("city", "string", singleTable.getName(), "");
        new Column("signature", "string", singleTable.getName(), "");
        new Column("distance", "string", singleTable.getName(), "");
        new Column("sex", "int", singleTable.getName(), "");
        new Column("imgstatus", "int", singleTable.getName(), "");
        new Column("hasHDImg", "int", singleTable.getName(), "");
        new Column("insertBatch", "int", singleTable.getName(), "");
        new Column("reserved1", "int", singleTable.getName(), "");
        new Column("reserved2", "int", singleTable.getName(), "");
        new Column("reserved3", "string", singleTable.getName(), "");
        new Column("reserved4", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("lvbuffer", "byte[]", singleTable.getName(), "");
        new Column("regionCode", "string", singleTable.getName(), "");
        new Column("snsFlag", "int", singleTable.getName(), "");
        new Column("sns_bgurl", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[20];
        String[] strArr = new String[21];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "shakeItemID";
        mAutoDBInfo.colsMap.put("shakeItemID", "INTEGER default '0'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "shakeItemID";
        mAutoDBInfo.columns[1] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[2] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT");
        mAutoDBInfo.columns[3] = "province";
        mAutoDBInfo.colsMap.put("province", "TEXT");
        mAutoDBInfo.columns[4] = "city";
        mAutoDBInfo.colsMap.put("city", "TEXT");
        mAutoDBInfo.columns[5] = "signature";
        mAutoDBInfo.colsMap.put("signature", "TEXT");
        mAutoDBInfo.columns[6] = "distance";
        mAutoDBInfo.colsMap.put("distance", "TEXT");
        mAutoDBInfo.columns[7] = "sex";
        mAutoDBInfo.colsMap.put("sex", "INTEGER");
        mAutoDBInfo.columns[8] = "imgstatus";
        mAutoDBInfo.colsMap.put("imgstatus", "INTEGER");
        mAutoDBInfo.columns[9] = "hasHDImg";
        mAutoDBInfo.colsMap.put("hasHDImg", "INTEGER");
        mAutoDBInfo.columns[10] = "insertBatch";
        mAutoDBInfo.colsMap.put("insertBatch", "INTEGER");
        mAutoDBInfo.columns[11] = "reserved1";
        mAutoDBInfo.colsMap.put("reserved1", "INTEGER");
        mAutoDBInfo.columns[12] = "reserved2";
        mAutoDBInfo.colsMap.put("reserved2", "INTEGER");
        mAutoDBInfo.columns[13] = "reserved3";
        mAutoDBInfo.colsMap.put("reserved3", "TEXT");
        mAutoDBInfo.columns[14] = "reserved4";
        mAutoDBInfo.colsMap.put("reserved4", "TEXT");
        mAutoDBInfo.columns[15] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[16] = "lvbuffer";
        mAutoDBInfo.colsMap.put("lvbuffer", "BLOB");
        mAutoDBInfo.columns[17] = "regionCode";
        mAutoDBInfo.colsMap.put("regionCode", "TEXT");
        mAutoDBInfo.columns[18] = "snsFlag";
        mAutoDBInfo.colsMap.put("snsFlag", "INTEGER");
        mAutoDBInfo.columns[19] = "sns_bgurl";
        mAutoDBInfo.colsMap.put("sns_bgurl", "TEXT");
        mAutoDBInfo.columns[20] = "rowid";
        mAutoDBInfo.sql = " shakeItemID INTEGER default '0'  PRIMARY KEY ,  username TEXT,  nickname TEXT,  province TEXT,  city TEXT,  signature TEXT,  distance TEXT,  sex INTEGER,  imgstatus INTEGER,  hasHDImg INTEGER,  insertBatch INTEGER,  reserved1 INTEGER,  reserved2 INTEGER,  reserved3 TEXT,  reserved4 TEXT,  type INTEGER,  lvbuffer BLOB,  regionCode TEXT,  snsFlag INTEGER,  sns_bgurl TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53336f8)) {
            return false;
        }
        C53336f8 f8Var = (C53336f8) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_shakeItemID), Integer.valueOf(f8Var.field_shakeItemID)) && C46238a.m51546a(this.field_username, f8Var.field_username) && C46238a.m51546a(this.field_nickname, f8Var.field_nickname) && C46238a.m51546a(this.field_province, f8Var.field_province) && C46238a.m51546a(this.field_city, f8Var.field_city) && C46238a.m51546a(this.field_signature, f8Var.field_signature) && C46238a.m51546a(this.field_distance, f8Var.field_distance) && C46238a.m51546a(Integer.valueOf(this.field_sex), Integer.valueOf(f8Var.field_sex)) && C46238a.m51546a(Integer.valueOf(this.field_imgstatus), Integer.valueOf(f8Var.field_imgstatus)) && C46238a.m51546a(Integer.valueOf(this.field_hasHDImg), Integer.valueOf(f8Var.field_hasHDImg)) && C46238a.m51546a(Integer.valueOf(this.field_insertBatch), Integer.valueOf(f8Var.field_insertBatch)) && C46238a.m51546a(Integer.valueOf(this.field_reserved1), Integer.valueOf(f8Var.field_reserved1)) && C46238a.m51546a(Integer.valueOf(this.field_reserved2), Integer.valueOf(f8Var.field_reserved2)) && C46238a.m51546a(this.field_reserved3, f8Var.field_reserved3) && C46238a.m51546a(this.field_reserved4, f8Var.field_reserved4) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(f8Var.field_type)) && C46238a.m51546a(this.field_lvbuffer, f8Var.field_lvbuffer) && C46238a.m51546a(this.field_regionCode, f8Var.field_regionCode) && C46238a.m51546a(Integer.valueOf(this.field_snsFlag), Integer.valueOf(f8Var.field_snsFlag)) && C46238a.m51546a(this.field_sns_bgurl, f8Var.field_sns_bgurl);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149362C == hashCode) {
                    try {
                        this.field_shakeItemID = cursor.getInt(i);
                        this.f149385d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149363D == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149364E == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149365F == hashCode) {
                    try {
                        this.field_province = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149366G == hashCode) {
                    try {
                        this.field_city = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149367H == hashCode) {
                    try {
                        this.field_signature = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149368I == hashCode) {
                    try {
                        this.field_distance = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149369J == hashCode) {
                    try {
                        this.field_sex = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149370K == hashCode) {
                    try {
                        this.field_imgstatus = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149371L == hashCode) {
                    try {
                        this.field_hasHDImg = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149372M == hashCode) {
                    try {
                        this.field_insertBatch = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149373N == hashCode) {
                    try {
                        this.field_reserved1 = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149374P == hashCode) {
                    try {
                        this.field_reserved2 = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149375Q == hashCode) {
                    try {
                        this.field_reserved3 = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149376R == hashCode) {
                    try {
                        this.field_reserved4 = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149377S == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149378T == hashCode) {
                    try {
                        this.field_lvbuffer = cursor.getBlob(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149379U == hashCode) {
                    try {
                        this.field_regionCode = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149380V == hashCode) {
                    try {
                        this.field_snsFlag = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149381W == hashCode) {
                    try {
                        this.field_sns_bgurl = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149382X == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149385d) {
            contentValues.put("shakeItemID", Integer.valueOf(this.field_shakeItemID));
        }
        if (this.f149386e) {
            contentValues.put("username", this.field_username);
        }
        if (this.f149387f) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f149388g) {
            contentValues.put("province", this.field_province);
        }
        if (this.f149389h) {
            contentValues.put("city", this.field_city);
        }
        if (this.f149390i) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.f149391j) {
            contentValues.put("distance", this.field_distance);
        }
        if (this.f149392n) {
            contentValues.put("sex", Integer.valueOf(this.field_sex));
        }
        if (this.f149393o) {
            contentValues.put("imgstatus", Integer.valueOf(this.field_imgstatus));
        }
        if (this.f149394p) {
            contentValues.put("hasHDImg", Integer.valueOf(this.field_hasHDImg));
        }
        if (this.f149395q) {
            contentValues.put("insertBatch", Integer.valueOf(this.field_insertBatch));
        }
        if (this.f149396r) {
            contentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
        }
        if (this.f149397s) {
            contentValues.put("reserved2", Integer.valueOf(this.field_reserved2));
        }
        if (this.f149398t) {
            contentValues.put("reserved3", this.field_reserved3);
        }
        if (this.f149399u) {
            contentValues.put("reserved4", this.field_reserved4);
        }
        if (this.f149400v) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f149401w) {
            contentValues.put("lvbuffer", this.field_lvbuffer);
        }
        if (this.f149402x) {
            contentValues.put("regionCode", this.field_regionCode);
        }
        if (this.f149403y) {
            contentValues.put("snsFlag", Integer.valueOf(this.field_snsFlag));
        }
        if (this.f149404z) {
            contentValues.put("sns_bgurl", this.field_sns_bgurl);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseShakeItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS shakeitem1 ( " + f149383Y.sql + ");");
        for (String add : f149361B) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseShakeItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("shakeitem1", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149383Y, "shakeitem1", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseShakeItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("shakeitem1", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseShakeItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149383Y;
    }

    public String[] getIndexCreateSQL() {
        return f149361B;
    }

    public StorageObserverOwner<C53336f8> getObserverOwner() {
        return f149384Z;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_shakeItemID);
    }

    public SingleTable getTable() {
        return f149360A;
    }

    public String getTableName() {
        return f149360A.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("shakeItemID")) {
            this.field_shakeItemID = contentValues.getAsInteger("shakeItemID").intValue();
            if (z) {
                this.f149385d = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f149386e = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f149387f = true;
            }
        }
        if (contentValues.containsKey("province")) {
            this.field_province = contentValues.getAsString("province");
            if (z) {
                this.f149388g = true;
            }
        }
        if (contentValues.containsKey("city")) {
            this.field_city = contentValues.getAsString("city");
            if (z) {
                this.f149389h = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z) {
                this.f149390i = true;
            }
        }
        if (contentValues.containsKey("distance")) {
            this.field_distance = contentValues.getAsString("distance");
            if (z) {
                this.f149391j = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.field_sex = contentValues.getAsInteger("sex").intValue();
            if (z) {
                this.f149392n = true;
            }
        }
        if (contentValues.containsKey("imgstatus")) {
            this.field_imgstatus = contentValues.getAsInteger("imgstatus").intValue();
            if (z) {
                this.f149393o = true;
            }
        }
        if (contentValues.containsKey("hasHDImg")) {
            this.field_hasHDImg = contentValues.getAsInteger("hasHDImg").intValue();
            if (z) {
                this.f149394p = true;
            }
        }
        if (contentValues.containsKey("insertBatch")) {
            this.field_insertBatch = contentValues.getAsInteger("insertBatch").intValue();
            if (z) {
                this.f149395q = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.field_reserved1 = contentValues.getAsInteger("reserved1").intValue();
            if (z) {
                this.f149396r = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.field_reserved2 = contentValues.getAsInteger("reserved2").intValue();
            if (z) {
                this.f149397s = true;
            }
        }
        if (contentValues.containsKey("reserved3")) {
            this.field_reserved3 = contentValues.getAsString("reserved3");
            if (z) {
                this.f149398t = true;
            }
        }
        if (contentValues.containsKey("reserved4")) {
            this.field_reserved4 = contentValues.getAsString("reserved4");
            if (z) {
                this.f149399u = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f149400v = true;
            }
        }
        if (contentValues.containsKey("lvbuffer")) {
            this.field_lvbuffer = contentValues.getAsByteArray("lvbuffer");
            if (z) {
                this.f149401w = true;
            }
        }
        if (contentValues.containsKey("regionCode")) {
            this.field_regionCode = contentValues.getAsString("regionCode");
            if (z) {
                this.f149402x = true;
            }
        }
        if (contentValues.containsKey("snsFlag")) {
            this.field_snsFlag = contentValues.getAsInteger("snsFlag").intValue();
            if (z) {
                this.f149403y = true;
            }
        }
        if (contentValues.containsKey("sns_bgurl")) {
            this.field_sns_bgurl = contentValues.getAsString("sns_bgurl");
            if (z) {
                this.f149404z = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
