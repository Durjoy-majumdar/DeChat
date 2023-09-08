package wz2;

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

/* renamed from: wz2.g */
public class C53275g extends IAutoDBItem {

    /* renamed from: A */
    public static final int f148825A = 113766;

    /* renamed from: B */
    public static final int f148826B = -987485392;

    /* renamed from: C */
    public static final int f148827C = 3053931;

    /* renamed from: D */
    public static final int f148828D = 1073584312;

    /* renamed from: E */
    public static final int f148829E = 447997388;

    /* renamed from: F */
    public static final int f148830F = -1262690029;

    /* renamed from: G */
    public static final int f148831G = 1921923568;

    /* renamed from: H */
    public static final int f148832H = 957831062;

    /* renamed from: I */
    public static final int f148833I = 1050464506;

    /* renamed from: J */
    public static final int f148834J = 93832333;

    /* renamed from: K */
    public static final int f148835K = 549765276;

    /* renamed from: L */
    public static final int f148836L = 108705909;

    /* renamed from: M */
    public static final IAutoDBItem.MAutoDBInfo f148837M = initAutoDBInfo(C53275g.class);

    /* renamed from: N */
    public static final StorageObserverOwner<C53275g> f148838N = new StorageObserverOwner<>();

    /* renamed from: u */
    public static final SingleTable f148839u;

    /* renamed from: v */
    public static final Column f148840v;

    /* renamed from: w */
    public static final String[] f148841w = {"CREATE INDEX IF NOT EXISTS TextStatusStrangerContact_sessionId_index ON TextStatusStrangerContact(sessionId)", "CREATE INDEX IF NOT EXISTS TextStatusStrangerContact_userName_index ON TextStatusStrangerContact(userName)"};

    /* renamed from: x */
    public static final int f148842x = 607796817;

    /* renamed from: y */
    public static final int f148843y = -266666762;

    /* renamed from: z */
    public static final int f148844z = 70690926;

    /* renamed from: d */
    public boolean f148845d = true;

    /* renamed from: e */
    public boolean f148846e = true;

    /* renamed from: f */
    public boolean f148847f = true;
    public String field_bigHeadImgUrl;
    public int field_block;
    public int field_canTalk;
    public String field_city;
    public String field_country;
    public String field_nickname;
    public String field_province;
    public String field_sessionId;
    public int field_sex;
    public String field_signature;
    public String field_smallHeadImgUrl;
    public String field_textStatusExtInfo;
    public String field_textStatusId;
    public String field_userName;

    /* renamed from: g */
    public boolean f148848g = true;

    /* renamed from: h */
    public boolean f148849h = true;

    /* renamed from: i */
    public boolean f148850i = true;

    /* renamed from: j */
    public boolean f148851j = true;

    /* renamed from: n */
    public boolean f148852n = true;

    /* renamed from: o */
    public boolean f148853o = true;

    /* renamed from: p */
    public boolean f148854p = true;

    /* renamed from: q */
    public boolean f148855q = true;

    /* renamed from: r */
    public boolean f148856r = true;

    /* renamed from: s */
    public boolean f148857s = true;

    /* renamed from: t */
    public boolean f148858t = true;

    static {
        SingleTable singleTable = new SingleTable("TextStatusStrangerContact");
        f148839u = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f148840v = new Column("sessionId", "string", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("sex", "int", singleTable.getName(), "");
        new Column("province", "string", singleTable.getName(), "");
        new Column("city", "string", singleTable.getName(), "");
        new Column("signature", "string", singleTable.getName(), "");
        new Column("bigHeadImgUrl", "string", singleTable.getName(), "");
        new Column("smallHeadImgUrl", "string", singleTable.getName(), "");
        new Column("textStatusExtInfo", "string", singleTable.getName(), "");
        new Column("country", "string", singleTable.getName(), "");
        new Column("textStatusId", "string", singleTable.getName(), "");
        new Column("block", "int", singleTable.getName(), "");
        new Column("canTalk", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[14];
        String[] strArr = new String[15];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "sessionId";
        mAutoDBInfo.colsMap.put("sessionId", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "sessionId";
        mAutoDBInfo.columns[1] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT");
        mAutoDBInfo.columns[3] = "sex";
        mAutoDBInfo.colsMap.put("sex", "INTEGER");
        mAutoDBInfo.columns[4] = "province";
        mAutoDBInfo.colsMap.put("province", "TEXT");
        mAutoDBInfo.columns[5] = "city";
        mAutoDBInfo.colsMap.put("city", "TEXT");
        mAutoDBInfo.columns[6] = "signature";
        mAutoDBInfo.colsMap.put("signature", "TEXT");
        mAutoDBInfo.columns[7] = "bigHeadImgUrl";
        mAutoDBInfo.colsMap.put("bigHeadImgUrl", "TEXT");
        mAutoDBInfo.columns[8] = "smallHeadImgUrl";
        mAutoDBInfo.colsMap.put("smallHeadImgUrl", "TEXT");
        mAutoDBInfo.columns[9] = "textStatusExtInfo";
        mAutoDBInfo.colsMap.put("textStatusExtInfo", "TEXT");
        mAutoDBInfo.columns[10] = "country";
        mAutoDBInfo.colsMap.put("country", "TEXT");
        mAutoDBInfo.columns[11] = "textStatusId";
        mAutoDBInfo.colsMap.put("textStatusId", "TEXT");
        mAutoDBInfo.columns[12] = "block";
        mAutoDBInfo.colsMap.put("block", "INTEGER");
        mAutoDBInfo.columns[13] = "canTalk";
        mAutoDBInfo.colsMap.put("canTalk", "INTEGER");
        mAutoDBInfo.columns[14] = "rowid";
        mAutoDBInfo.sql = " sessionId TEXT default ''  PRIMARY KEY ,  userName TEXT default '' ,  nickname TEXT,  sex INTEGER,  province TEXT,  city TEXT,  signature TEXT,  bigHeadImgUrl TEXT,  smallHeadImgUrl TEXT,  textStatusExtInfo TEXT,  country TEXT,  textStatusId TEXT,  block INTEGER,  canTalk INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53275g)) {
            return false;
        }
        C53275g gVar = (C53275g) iAutoDBItem;
        return C46238a.m51546a(this.field_sessionId, gVar.field_sessionId) && C46238a.m51546a(this.field_userName, gVar.field_userName) && C46238a.m51546a(this.field_nickname, gVar.field_nickname) && C46238a.m51546a(Integer.valueOf(this.field_sex), Integer.valueOf(gVar.field_sex)) && C46238a.m51546a(this.field_province, gVar.field_province) && C46238a.m51546a(this.field_city, gVar.field_city) && C46238a.m51546a(this.field_signature, gVar.field_signature) && C46238a.m51546a(this.field_bigHeadImgUrl, gVar.field_bigHeadImgUrl) && C46238a.m51546a(this.field_smallHeadImgUrl, gVar.field_smallHeadImgUrl) && C46238a.m51546a(this.field_textStatusExtInfo, gVar.field_textStatusExtInfo) && C46238a.m51546a(this.field_country, gVar.field_country) && C46238a.m51546a(this.field_textStatusId, gVar.field_textStatusId) && C46238a.m51546a(Integer.valueOf(this.field_block), Integer.valueOf(gVar.field_block)) && C46238a.m51546a(Integer.valueOf(this.field_canTalk), Integer.valueOf(gVar.field_canTalk));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f148842x == hashCode) {
                    try {
                        this.field_sessionId = cursor.getString(i);
                        this.f148845d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148843y == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148844z == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148825A == hashCode) {
                    try {
                        this.field_sex = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148826B == hashCode) {
                    try {
                        this.field_province = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148827C == hashCode) {
                    try {
                        this.field_city = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148828D == hashCode) {
                    try {
                        this.field_signature = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148829E == hashCode) {
                    try {
                        this.field_bigHeadImgUrl = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148830F == hashCode) {
                    try {
                        this.field_smallHeadImgUrl = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148831G == hashCode) {
                    try {
                        this.field_textStatusExtInfo = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148832H == hashCode) {
                    try {
                        this.field_country = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148833I == hashCode) {
                    try {
                        this.field_textStatusId = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148834J == hashCode) {
                    try {
                        this.field_block = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148835K == hashCode) {
                    try {
                        this.field_canTalk = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148836L == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_sessionId == null) {
            this.field_sessionId = "";
        }
        if (this.f148845d) {
            contentValues.put("sessionId", this.field_sessionId);
        }
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f148846e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f148847f) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f148848g) {
            contentValues.put("sex", Integer.valueOf(this.field_sex));
        }
        if (this.f148849h) {
            contentValues.put("province", this.field_province);
        }
        if (this.f148850i) {
            contentValues.put("city", this.field_city);
        }
        if (this.f148851j) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.f148852n) {
            contentValues.put("bigHeadImgUrl", this.field_bigHeadImgUrl);
        }
        if (this.f148853o) {
            contentValues.put("smallHeadImgUrl", this.field_smallHeadImgUrl);
        }
        if (this.f148854p) {
            contentValues.put("textStatusExtInfo", this.field_textStatusExtInfo);
        }
        if (this.f148855q) {
            contentValues.put("country", this.field_country);
        }
        if (this.f148856r) {
            contentValues.put("textStatusId", this.field_textStatusId);
        }
        if (this.f148857s) {
            contentValues.put("block", Integer.valueOf(this.field_block));
        }
        if (this.f148858t) {
            contentValues.put("canTalk", Integer.valueOf(this.field_canTalk));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTextStatusStrangerContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TextStatusStrangerContact ( " + f148837M.sql + ");");
        for (String add : f148841w) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusStrangerContact", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TextStatusStrangerContact", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f148837M, "TextStatusStrangerContact", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusStrangerContact", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TextStatusStrangerContact", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTextStatusStrangerContact", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f148837M;
    }

    public String[] getIndexCreateSQL() {
        return f148841w;
    }

    public StorageObserverOwner<C53275g> getObserverOwner() {
        return f148838N;
    }

    public Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    public SingleTable getTable() {
        return f148839u;
    }

    public String getTableName() {
        return f148839u.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("sessionId")) {
            this.field_sessionId = contentValues.getAsString("sessionId");
            if (z) {
                this.f148845d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f148846e = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f148847f = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.field_sex = contentValues.getAsInteger("sex").intValue();
            if (z) {
                this.f148848g = true;
            }
        }
        if (contentValues.containsKey("province")) {
            this.field_province = contentValues.getAsString("province");
            if (z) {
                this.f148849h = true;
            }
        }
        if (contentValues.containsKey("city")) {
            this.field_city = contentValues.getAsString("city");
            if (z) {
                this.f148850i = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z) {
                this.f148851j = true;
            }
        }
        if (contentValues.containsKey("bigHeadImgUrl")) {
            this.field_bigHeadImgUrl = contentValues.getAsString("bigHeadImgUrl");
            if (z) {
                this.f148852n = true;
            }
        }
        if (contentValues.containsKey("smallHeadImgUrl")) {
            this.field_smallHeadImgUrl = contentValues.getAsString("smallHeadImgUrl");
            if (z) {
                this.f148853o = true;
            }
        }
        if (contentValues.containsKey("textStatusExtInfo")) {
            this.field_textStatusExtInfo = contentValues.getAsString("textStatusExtInfo");
            if (z) {
                this.f148854p = true;
            }
        }
        if (contentValues.containsKey("country")) {
            this.field_country = contentValues.getAsString("country");
            if (z) {
                this.f148855q = true;
            }
        }
        if (contentValues.containsKey("textStatusId")) {
            this.field_textStatusId = contentValues.getAsString("textStatusId");
            if (z) {
                this.f148856r = true;
            }
        }
        if (contentValues.containsKey("block")) {
            this.field_block = contentValues.getAsInteger("block").intValue();
            if (z) {
                this.f148857s = true;
            }
        }
        if (contentValues.containsKey("canTalk")) {
            this.field_canTalk = contentValues.getAsInteger("canTalk").intValue();
            if (z) {
                this.f148858t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
