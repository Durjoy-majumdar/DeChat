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

/* renamed from: xh.o8 */
public class C102659o8 extends IAutoDBItem {

    /* renamed from: C */
    public static final SingleTable f302803C;

    /* renamed from: D */
    public static final String[] f302804D = new String[0];

    /* renamed from: E */
    public static final int f302805E = -266666762;

    /* renamed from: F */
    public static final int f302806F = 107902;

    /* renamed from: G */
    public static final int f302807G = 1382781227;

    /* renamed from: H */
    public static final int f302808H = 3020864;

    /* renamed from: I */
    public static final int f302809I = 93658858;

    /* renamed from: J */
    public static final int f302810J = -1284304757;

    /* renamed from: K */
    public static final int f302811K = 1303299008;

    /* renamed from: L */
    public static final int f302812L = -1179126040;

    /* renamed from: M */
    public static final int f302813M = 99161973;

    /* renamed from: N */
    public static final int f302814N = -1194055098;

    /* renamed from: P */
    public static final int f302815P = -1281619343;

    /* renamed from: Q */
    public static final int f302816Q = -2053780008;

    /* renamed from: Q0 */
    public static final StorageObserverOwner<C102659o8> f302817Q0 = new StorageObserverOwner<>();

    /* renamed from: R */
    public static final int f302818R = -2052248253;

    /* renamed from: S */
    public static final int f302819S = 942938387;

    /* renamed from: T */
    public static final int f302820T = -167842004;

    /* renamed from: U */
    public static final int f302821U = -167325575;

    /* renamed from: V */
    public static final int f302822V = -1184670471;

    /* renamed from: W */
    public static final int f302823W = 1532060815;

    /* renamed from: X */
    public static final int f302824X = 1920329945;

    /* renamed from: Y */
    public static final int f302825Y = -140408018;

    /* renamed from: Z */
    public static final int f302826Z = -2033849930;

    /* renamed from: p0 */
    public static final int f302827p0 = 2066955584;

    /* renamed from: x0 */
    public static final int f302828x0 = 108705909;

    /* renamed from: y0 */
    public static final IAutoDBItem.MAutoDBInfo f302829y0 = initAutoDBInfo(C102659o8.class);

    /* renamed from: A */
    public boolean f302830A = true;

    /* renamed from: B */
    public boolean f302831B = true;

    /* renamed from: d */
    public boolean f302832d = true;

    /* renamed from: e */
    public boolean f302833e = true;

    /* renamed from: f */
    public boolean f302834f = true;
    public byte[] field_adsession;
    public String field_albumMd5;
    public String field_bgId;
    public String field_bgUrl;
    public byte[] field_faultS;
    public int field_iFlag;
    public int field_icount;
    public String field_imBGaeskey;
    public String field_imBGauthkey;
    public String field_imBGfileid;
    public String field_imBGmd5sum;
    public int field_istyle;
    public int field_lastFirstPageRequestErrCode;
    public int field_lastFirstPageRequestErrType;
    public int field_local_flag;
    public String field_md5;
    public String field_newerIds;
    public String field_older_bgId;
    public long field_snsBgId;
    public byte[] field_snsYearMonthInfo;
    public byte[] field_snsuser;
    public String field_userName;

    /* renamed from: g */
    public boolean f302835g = true;

    /* renamed from: h */
    public boolean f302836h = true;

    /* renamed from: i */
    public boolean f302837i = true;

    /* renamed from: j */
    public boolean f302838j = true;

    /* renamed from: n */
    public boolean f302839n = true;

    /* renamed from: o */
    public boolean f302840o = true;

    /* renamed from: p */
    public boolean f302841p = true;

    /* renamed from: q */
    public boolean f302842q = true;

    /* renamed from: r */
    public boolean f302843r = true;

    /* renamed from: s */
    public boolean f302844s = true;

    /* renamed from: t */
    public boolean f302845t = true;

    /* renamed from: u */
    public boolean f302846u = true;

    /* renamed from: v */
    public boolean f302847v = true;

    /* renamed from: w */
    public boolean f302848w = true;

    /* renamed from: x */
    public boolean f302849x = true;

    /* renamed from: y */
    public boolean f302850y = true;

    /* renamed from: z */
    public boolean f302851z = true;

    static {
        SingleTable singleTable = new SingleTable("SnsExt");
        f302803C = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("newerIds", "string", singleTable.getName(), "");
        new Column("bgId", "string", singleTable.getName(), "");
        new Column("bgUrl", "string", singleTable.getName(), "");
        new Column("older_bgId", "string", singleTable.getName(), "");
        new Column("local_flag", "int", singleTable.getName(), "");
        new Column("istyle", "int", singleTable.getName(), "");
        new Column("iFlag", "int", singleTable.getName(), "");
        new Column("icount", "int", singleTable.getName(), "");
        new Column("faultS", "byte[]", singleTable.getName(), "");
        new Column("snsBgId", "long", singleTable.getName(), "");
        new Column("snsuser", "byte[]", singleTable.getName(), "");
        new Column("adsession", "byte[]", singleTable.getName(), "");
        new Column("lastFirstPageRequestErrCode", "int", singleTable.getName(), "");
        new Column("lastFirstPageRequestErrType", "int", singleTable.getName(), "");
        new Column("snsYearMonthInfo", "byte[]", singleTable.getName(), "");
        new Column("albumMd5", "string", singleTable.getName(), "");
        new Column("imBGaeskey", "string", singleTable.getName(), "");
        new Column("imBGauthkey", "string", singleTable.getName(), "");
        new Column("imBGmd5sum", "string", singleTable.getName(), "");
        new Column("imBGfileid", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[22];
        String[] strArr = new String[23];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "userName";
        mAutoDBInfo.columns[1] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[2] = "newerIds";
        mAutoDBInfo.colsMap.put("newerIds", "TEXT");
        mAutoDBInfo.columns[3] = "bgId";
        mAutoDBInfo.colsMap.put("bgId", "TEXT");
        mAutoDBInfo.columns[4] = "bgUrl";
        mAutoDBInfo.colsMap.put("bgUrl", "TEXT");
        mAutoDBInfo.columns[5] = "older_bgId";
        mAutoDBInfo.colsMap.put("older_bgId", "TEXT");
        mAutoDBInfo.columns[6] = "local_flag";
        mAutoDBInfo.colsMap.put("local_flag", "INTEGER");
        mAutoDBInfo.columns[7] = "istyle";
        mAutoDBInfo.colsMap.put("istyle", "INTEGER");
        mAutoDBInfo.columns[8] = "iFlag";
        mAutoDBInfo.colsMap.put("iFlag", "INTEGER");
        mAutoDBInfo.columns[9] = "icount";
        mAutoDBInfo.colsMap.put("icount", "INTEGER");
        mAutoDBInfo.columns[10] = "faultS";
        mAutoDBInfo.colsMap.put("faultS", "BLOB");
        mAutoDBInfo.columns[11] = "snsBgId";
        mAutoDBInfo.colsMap.put("snsBgId", "LONG");
        mAutoDBInfo.columns[12] = "snsuser";
        mAutoDBInfo.colsMap.put("snsuser", "BLOB");
        mAutoDBInfo.columns[13] = "adsession";
        mAutoDBInfo.colsMap.put("adsession", "BLOB");
        mAutoDBInfo.columns[14] = "lastFirstPageRequestErrCode";
        mAutoDBInfo.colsMap.put("lastFirstPageRequestErrCode", "INTEGER");
        mAutoDBInfo.columns[15] = "lastFirstPageRequestErrType";
        mAutoDBInfo.colsMap.put("lastFirstPageRequestErrType", "INTEGER");
        mAutoDBInfo.columns[16] = "snsYearMonthInfo";
        mAutoDBInfo.colsMap.put("snsYearMonthInfo", "BLOB");
        mAutoDBInfo.columns[17] = "albumMd5";
        mAutoDBInfo.colsMap.put("albumMd5", "TEXT");
        mAutoDBInfo.columns[18] = "imBGaeskey";
        mAutoDBInfo.colsMap.put("imBGaeskey", "TEXT");
        mAutoDBInfo.columns[19] = "imBGauthkey";
        mAutoDBInfo.colsMap.put("imBGauthkey", "TEXT");
        mAutoDBInfo.columns[20] = "imBGmd5sum";
        mAutoDBInfo.colsMap.put("imBGmd5sum", "TEXT");
        mAutoDBInfo.columns[21] = "imBGfileid";
        mAutoDBInfo.colsMap.put("imBGfileid", "TEXT");
        mAutoDBInfo.columns[22] = "rowid";
        mAutoDBInfo.sql = " userName TEXT default ''  PRIMARY KEY ,  md5 TEXT,  newerIds TEXT,  bgId TEXT,  bgUrl TEXT,  older_bgId TEXT,  local_flag INTEGER,  istyle INTEGER,  iFlag INTEGER,  icount INTEGER,  faultS BLOB,  snsBgId LONG,  snsuser BLOB,  adsession BLOB,  lastFirstPageRequestErrCode INTEGER,  lastFirstPageRequestErrType INTEGER,  snsYearMonthInfo BLOB,  albumMd5 TEXT,  imBGaeskey TEXT,  imBGauthkey TEXT,  imBGmd5sum TEXT,  imBGfileid TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102659o8)) {
            return false;
        }
        C102659o8 o8Var = (C102659o8) iAutoDBItem;
        return C46238a.m51546a(this.field_userName, o8Var.field_userName) && C46238a.m51546a(this.field_md5, o8Var.field_md5) && C46238a.m51546a(this.field_newerIds, o8Var.field_newerIds) && C46238a.m51546a(this.field_bgId, o8Var.field_bgId) && C46238a.m51546a(this.field_bgUrl, o8Var.field_bgUrl) && C46238a.m51546a(this.field_older_bgId, o8Var.field_older_bgId) && C46238a.m51546a(Integer.valueOf(this.field_local_flag), Integer.valueOf(o8Var.field_local_flag)) && C46238a.m51546a(Integer.valueOf(this.field_istyle), Integer.valueOf(o8Var.field_istyle)) && C46238a.m51546a(Integer.valueOf(this.field_iFlag), Integer.valueOf(o8Var.field_iFlag)) && C46238a.m51546a(Integer.valueOf(this.field_icount), Integer.valueOf(o8Var.field_icount)) && C46238a.m51546a(this.field_faultS, o8Var.field_faultS) && C46238a.m51546a(Long.valueOf(this.field_snsBgId), Long.valueOf(o8Var.field_snsBgId)) && C46238a.m51546a(this.field_snsuser, o8Var.field_snsuser) && C46238a.m51546a(this.field_adsession, o8Var.field_adsession) && C46238a.m51546a(Integer.valueOf(this.field_lastFirstPageRequestErrCode), Integer.valueOf(o8Var.field_lastFirstPageRequestErrCode)) && C46238a.m51546a(Integer.valueOf(this.field_lastFirstPageRequestErrType), Integer.valueOf(o8Var.field_lastFirstPageRequestErrType)) && C46238a.m51546a(this.field_snsYearMonthInfo, o8Var.field_snsYearMonthInfo) && C46238a.m51546a(this.field_albumMd5, o8Var.field_albumMd5) && C46238a.m51546a(this.field_imBGaeskey, o8Var.field_imBGaeskey) && C46238a.m51546a(this.field_imBGauthkey, o8Var.field_imBGauthkey) && C46238a.m51546a(this.field_imBGmd5sum, o8Var.field_imBGmd5sum) && C46238a.m51546a(this.field_imBGfileid, o8Var.field_imBGfileid);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302805E == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                        this.f302832d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302806F == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302807G == hashCode) {
                    try {
                        this.field_newerIds = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302808H == hashCode) {
                    try {
                        this.field_bgId = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302809I == hashCode) {
                    try {
                        this.field_bgUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302810J == hashCode) {
                    try {
                        this.field_older_bgId = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302811K == hashCode) {
                    try {
                        this.field_local_flag = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302812L == hashCode) {
                    try {
                        this.field_istyle = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302813M == hashCode) {
                    try {
                        this.field_iFlag = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302814N == hashCode) {
                    try {
                        this.field_icount = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302815P == hashCode) {
                    try {
                        this.field_faultS = cursor.getBlob(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302816Q == hashCode) {
                    try {
                        this.field_snsBgId = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302818R == hashCode) {
                    try {
                        this.field_snsuser = cursor.getBlob(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302819S == hashCode) {
                    try {
                        this.field_adsession = cursor.getBlob(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302820T == hashCode) {
                    try {
                        this.field_lastFirstPageRequestErrCode = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302821U == hashCode) {
                    try {
                        this.field_lastFirstPageRequestErrType = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302822V == hashCode) {
                    try {
                        this.field_snsYearMonthInfo = cursor.getBlob(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302823W == hashCode) {
                    try {
                        this.field_albumMd5 = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302824X == hashCode) {
                    try {
                        this.field_imBGaeskey = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302825Y == hashCode) {
                    try {
                        this.field_imBGauthkey = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302826Z == hashCode) {
                    try {
                        this.field_imBGmd5sum = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302827p0 == hashCode) {
                    try {
                        this.field_imBGfileid = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsExt", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302828x0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f302832d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f302833e) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f302834f) {
            contentValues.put("newerIds", this.field_newerIds);
        }
        if (this.f302835g) {
            contentValues.put("bgId", this.field_bgId);
        }
        if (this.f302836h) {
            contentValues.put("bgUrl", this.field_bgUrl);
        }
        if (this.f302837i) {
            contentValues.put("older_bgId", this.field_older_bgId);
        }
        if (this.f302838j) {
            contentValues.put("local_flag", Integer.valueOf(this.field_local_flag));
        }
        if (this.f302839n) {
            contentValues.put("istyle", Integer.valueOf(this.field_istyle));
        }
        if (this.f302840o) {
            contentValues.put("iFlag", Integer.valueOf(this.field_iFlag));
        }
        if (this.f302841p) {
            contentValues.put("icount", Integer.valueOf(this.field_icount));
        }
        if (this.f302842q) {
            contentValues.put("faultS", this.field_faultS);
        }
        if (this.f302843r) {
            contentValues.put("snsBgId", Long.valueOf(this.field_snsBgId));
        }
        if (this.f302844s) {
            contentValues.put("snsuser", this.field_snsuser);
        }
        if (this.f302845t) {
            contentValues.put("adsession", this.field_adsession);
        }
        if (this.f302846u) {
            contentValues.put("lastFirstPageRequestErrCode", Integer.valueOf(this.field_lastFirstPageRequestErrCode));
        }
        if (this.f302847v) {
            contentValues.put("lastFirstPageRequestErrType", Integer.valueOf(this.field_lastFirstPageRequestErrType));
        }
        if (this.f302848w) {
            contentValues.put("snsYearMonthInfo", this.field_snsYearMonthInfo);
        }
        if (this.f302849x) {
            contentValues.put("albumMd5", this.field_albumMd5);
        }
        if (this.f302850y) {
            contentValues.put("imBGaeskey", this.field_imBGaeskey);
        }
        if (this.f302851z) {
            contentValues.put("imBGauthkey", this.field_imBGauthkey);
        }
        if (this.f302830A) {
            contentValues.put("imBGmd5sum", this.field_imBGmd5sum);
        }
        if (this.f302831B) {
            contentValues.put("imBGfileid", this.field_imBGfileid);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSnsExt", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SnsExt ( " + f302829y0.sql + ");");
        for (String add : f302804D) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSnsExt", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SnsExt", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302829y0, "SnsExt", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSnsExt", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SnsExt", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSnsExt", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302829y0;
    }

    public String[] getIndexCreateSQL() {
        return f302804D;
    }

    public StorageObserverOwner<C102659o8> getObserverOwner() {
        return f302817Q0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_userName;
    }

    public SingleTable getTable() {
        return f302803C;
    }

    public String getTableName() {
        return f302803C.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f302832d = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f302833e = true;
            }
        }
        if (contentValues.containsKey("newerIds")) {
            this.field_newerIds = contentValues.getAsString("newerIds");
            if (z) {
                this.f302834f = true;
            }
        }
        if (contentValues.containsKey("bgId")) {
            this.field_bgId = contentValues.getAsString("bgId");
            if (z) {
                this.f302835g = true;
            }
        }
        if (contentValues.containsKey("bgUrl")) {
            this.field_bgUrl = contentValues.getAsString("bgUrl");
            if (z) {
                this.f302836h = true;
            }
        }
        if (contentValues.containsKey("older_bgId")) {
            this.field_older_bgId = contentValues.getAsString("older_bgId");
            if (z) {
                this.f302837i = true;
            }
        }
        if (contentValues.containsKey("local_flag")) {
            this.field_local_flag = contentValues.getAsInteger("local_flag").intValue();
            if (z) {
                this.f302838j = true;
            }
        }
        if (contentValues.containsKey("istyle")) {
            this.field_istyle = contentValues.getAsInteger("istyle").intValue();
            if (z) {
                this.f302839n = true;
            }
        }
        if (contentValues.containsKey("iFlag")) {
            this.field_iFlag = contentValues.getAsInteger("iFlag").intValue();
            if (z) {
                this.f302840o = true;
            }
        }
        if (contentValues.containsKey("icount")) {
            this.field_icount = contentValues.getAsInteger("icount").intValue();
            if (z) {
                this.f302841p = true;
            }
        }
        if (contentValues.containsKey("faultS")) {
            this.field_faultS = contentValues.getAsByteArray("faultS");
            if (z) {
                this.f302842q = true;
            }
        }
        if (contentValues.containsKey("snsBgId")) {
            this.field_snsBgId = contentValues.getAsLong("snsBgId").longValue();
            if (z) {
                this.f302843r = true;
            }
        }
        if (contentValues.containsKey("snsuser")) {
            this.field_snsuser = contentValues.getAsByteArray("snsuser");
            if (z) {
                this.f302844s = true;
            }
        }
        if (contentValues.containsKey("adsession")) {
            this.field_adsession = contentValues.getAsByteArray("adsession");
            if (z) {
                this.f302845t = true;
            }
        }
        if (contentValues.containsKey("lastFirstPageRequestErrCode")) {
            this.field_lastFirstPageRequestErrCode = contentValues.getAsInteger("lastFirstPageRequestErrCode").intValue();
            if (z) {
                this.f302846u = true;
            }
        }
        if (contentValues.containsKey("lastFirstPageRequestErrType")) {
            this.field_lastFirstPageRequestErrType = contentValues.getAsInteger("lastFirstPageRequestErrType").intValue();
            if (z) {
                this.f302847v = true;
            }
        }
        if (contentValues.containsKey("snsYearMonthInfo")) {
            this.field_snsYearMonthInfo = contentValues.getAsByteArray("snsYearMonthInfo");
            if (z) {
                this.f302848w = true;
            }
        }
        if (contentValues.containsKey("albumMd5")) {
            this.field_albumMd5 = contentValues.getAsString("albumMd5");
            if (z) {
                this.f302849x = true;
            }
        }
        if (contentValues.containsKey("imBGaeskey")) {
            this.field_imBGaeskey = contentValues.getAsString("imBGaeskey");
            if (z) {
                this.f302850y = true;
            }
        }
        if (contentValues.containsKey("imBGauthkey")) {
            this.field_imBGauthkey = contentValues.getAsString("imBGauthkey");
            if (z) {
                this.f302851z = true;
            }
        }
        if (contentValues.containsKey("imBGmd5sum")) {
            this.field_imBGmd5sum = contentValues.getAsString("imBGmd5sum");
            if (z) {
                this.f302830A = true;
            }
        }
        if (contentValues.containsKey("imBGfileid")) {
            this.field_imBGfileid = contentValues.getAsString("imBGfileid");
            if (z) {
                this.f302831B = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
