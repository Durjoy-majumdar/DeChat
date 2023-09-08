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
import com.tencent.xweb.IXWebPreferences;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.w1 */
public class C102675w1 extends IAutoDBItem {

    /* renamed from: K */
    public static final SingleTable f303043K;

    /* renamed from: L */
    public static final String[] f303044L = new String[0];

    /* renamed from: M */
    public static final int f303045M = -1051830710;

    /* renamed from: N */
    public static final int f303046N = 979167709;

    /* renamed from: P */
    public static final int f303047P = 2035803770;

    /* renamed from: Q */
    public static final int f303048Q = 675538801;

    /* renamed from: Q0 */
    public static final int f303049Q0 = 1736147326;

    /* renamed from: R */
    public static final int f303050R = 750296132;

    /* renamed from: R0 */
    public static final int f303051R0 = -359569557;

    /* renamed from: S */
    public static final int f303052S = 750002250;

    /* renamed from: S0 */
    public static final int f303053S0 = 3145580;

    /* renamed from: T */
    public static final int f303054T = -1835712593;

    /* renamed from: T0 */
    public static final int f303055T0 = 989200824;

    /* renamed from: U */
    public static final int f303056U = 1786693296;

    /* renamed from: U0 */
    public static final int f303057U0 = 3545755;

    /* renamed from: V */
    public static final int f303058V = 750498035;

    /* renamed from: V0 */
    public static final int f303059V0 = 104125;

    /* renamed from: W */
    public static final int f303060W = 750068005;

    /* renamed from: W0 */
    public static final int f303061W0 = 1535109430;

    /* renamed from: X */
    public static final int f303062X = -756247400;

    /* renamed from: X0 */
    public static final int f303063X0 = -1731535161;

    /* renamed from: Y */
    public static final int f303064Y = 1807631069;

    /* renamed from: Y0 */
    public static final int f303065Y0 = -396990190;

    /* renamed from: Z */
    public static final int f303066Z = -990020178;

    /* renamed from: Z0 */
    public static final int f303067Z0 = 3314158;

    /* renamed from: a1 */
    public static final int f303068a1 = -396910366;

    /* renamed from: b1 */
    public static final int f303069b1 = 358564236;

    /* renamed from: c1 */
    public static final int f303070c1 = 94851343;

    /* renamed from: d1 */
    public static final int f303071d1 = 100381624;

    /* renamed from: e1 */
    public static final int f303072e1 = 108705909;

    /* renamed from: f1 */
    public static final IAutoDBItem.MAutoDBInfo f303073f1 = initAutoDBInfo(C102675w1.class);

    /* renamed from: g1 */
    public static final StorageObserverOwner<C102675w1> f303074g1 = new StorageObserverOwner<>();

    /* renamed from: p0 */
    public static final int f303075p0 = 3575610;

    /* renamed from: x0 */
    public static final int f303076x0 = -892481550;

    /* renamed from: y0 */
    public static final int f303077y0 = 3536286;

    /* renamed from: A */
    public boolean f303078A = true;

    /* renamed from: B */
    public boolean f303079B = true;

    /* renamed from: C */
    public boolean f303080C = true;

    /* renamed from: D */
    public boolean f303081D = true;

    /* renamed from: E */
    public boolean f303082E = true;

    /* renamed from: F */
    public boolean f303083F = true;

    /* renamed from: G */
    public boolean f303084G = true;

    /* renamed from: H */
    public boolean f303085H = true;

    /* renamed from: I */
    public boolean f303086I = true;

    /* renamed from: J */
    public boolean f303087J = true;

    /* renamed from: d */
    public boolean f303088d = true;

    /* renamed from: e */
    public boolean f303089e = true;

    /* renamed from: f */
    public boolean f303090f = true;
    public String field_BigIconUrl;
    public String field_MutiLanName;
    public int field_buttonType;
    public int field_count;
    public int field_flag;
    public int field_idx;
    public String field_ipKey;
    public String field_lang;
    public long field_lastUseTime;
    public String field_packAuthInfo;
    public String field_packCopyright;
    public String field_packCoverUrl;
    public String field_packDesc;
    public long field_packExpire;
    public int field_packFlag;
    public String field_packGrayIconUrl;
    public String field_packIconUrl;
    public String field_packName;
    public String field_packPrice;
    public int field_packStatus;
    public long field_packTimeStamp;
    public int field_packType;
    public String field_productID;
    public int field_recommand;
    public int field_recommandType;
    public String field_recommandWord;
    public int field_sort;
    public int field_status;
    public int field_sync;
    public int field_type;

    /* renamed from: g */
    public boolean f303091g = true;

    /* renamed from: h */
    public boolean f303092h = true;

    /* renamed from: i */
    public boolean f303093i = true;

    /* renamed from: j */
    public boolean f303094j = true;

    /* renamed from: n */
    public boolean f303095n = true;

    /* renamed from: o */
    public boolean f303096o = true;

    /* renamed from: p */
    public boolean f303097p = true;

    /* renamed from: q */
    public boolean f303098q = true;

    /* renamed from: r */
    public boolean f303099r = true;

    /* renamed from: s */
    public boolean f303100s = true;

    /* renamed from: t */
    public boolean f303101t = true;

    /* renamed from: u */
    public boolean f303102u = true;

    /* renamed from: v */
    public boolean f303103v = true;

    /* renamed from: w */
    public boolean f303104w = true;

    /* renamed from: x */
    public boolean f303105x = true;

    /* renamed from: y */
    public boolean f303106y = true;

    /* renamed from: z */
    public boolean f303107z = true;

    static {
        SingleTable singleTable = new SingleTable("EmojiGroupInfo");
        f303043K = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("productID", "string", singleTable.getName(), "");
        new Column("packIconUrl", "string", singleTable.getName(), "");
        new Column("packGrayIconUrl", "string", singleTable.getName(), "");
        new Column("packCoverUrl", "string", singleTable.getName(), "");
        new Column("packName", "string", singleTable.getName(), "");
        new Column("packDesc", "string", singleTable.getName(), "");
        new Column("packAuthInfo", "string", singleTable.getName(), "");
        new Column("packPrice", "string", singleTable.getName(), "");
        new Column("packType", "int", singleTable.getName(), "");
        new Column("packFlag", "int", singleTable.getName(), "");
        new Column("packExpire", "long", singleTable.getName(), "");
        new Column("packTimeStamp", "long", singleTable.getName(), "");
        new Column("packCopyright", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("sort", "int", singleTable.getName(), "");
        new Column("lastUseTime", "long", singleTable.getName(), "");
        new Column("packStatus", "int", singleTable.getName(), "");
        new Column("flag", "int", singleTable.getName(), "");
        new Column("recommand", "int", singleTable.getName(), "");
        new Column("sync", "int", singleTable.getName(), "");
        new Column("idx", "int", singleTable.getName(), "");
        new Column("BigIconUrl", "string", singleTable.getName(), "");
        new Column("MutiLanName", "string", singleTable.getName(), "");
        new Column("recommandType", "int", singleTable.getName(), "");
        new Column(IXWebPreferences.XWEB_LANGUAGE, "string", singleTable.getName(), "");
        new Column("recommandWord", "string", singleTable.getName(), "");
        new Column("buttonType", "int", singleTable.getName(), "");
        new Column("count", "int", singleTable.getName(), "");
        new Column("ipKey", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[30];
        String[] strArr = new String[31];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "productID";
        mAutoDBInfo.colsMap.put("productID", "TEXT PRIMARY KEY  COLLATE NOCASE ");
        mAutoDBInfo.primaryKey = "productID";
        mAutoDBInfo.columns[1] = "packIconUrl";
        mAutoDBInfo.colsMap.put("packIconUrl", "TEXT");
        mAutoDBInfo.columns[2] = "packGrayIconUrl";
        mAutoDBInfo.colsMap.put("packGrayIconUrl", "TEXT");
        mAutoDBInfo.columns[3] = "packCoverUrl";
        mAutoDBInfo.colsMap.put("packCoverUrl", "TEXT");
        mAutoDBInfo.columns[4] = "packName";
        mAutoDBInfo.colsMap.put("packName", "TEXT");
        mAutoDBInfo.columns[5] = "packDesc";
        mAutoDBInfo.colsMap.put("packDesc", "TEXT");
        mAutoDBInfo.columns[6] = "packAuthInfo";
        mAutoDBInfo.colsMap.put("packAuthInfo", "TEXT");
        mAutoDBInfo.columns[7] = "packPrice";
        mAutoDBInfo.colsMap.put("packPrice", "TEXT");
        mAutoDBInfo.columns[8] = "packType";
        mAutoDBInfo.colsMap.put("packType", "INTEGER");
        mAutoDBInfo.columns[9] = "packFlag";
        mAutoDBInfo.colsMap.put("packFlag", "INTEGER");
        mAutoDBInfo.columns[10] = "packExpire";
        mAutoDBInfo.colsMap.put("packExpire", "LONG");
        mAutoDBInfo.columns[11] = "packTimeStamp";
        mAutoDBInfo.colsMap.put("packTimeStamp", "LONG");
        mAutoDBInfo.columns[12] = "packCopyright";
        mAutoDBInfo.colsMap.put("packCopyright", "TEXT");
        mAutoDBInfo.columns[13] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[14] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[15] = "sort";
        mAutoDBInfo.colsMap.put("sort", "INTEGER default '1' ");
        mAutoDBInfo.columns[16] = "lastUseTime";
        mAutoDBInfo.colsMap.put("lastUseTime", "LONG");
        mAutoDBInfo.columns[17] = "packStatus";
        mAutoDBInfo.colsMap.put("packStatus", "INTEGER default '0' ");
        mAutoDBInfo.columns[18] = "flag";
        mAutoDBInfo.colsMap.put("flag", "INTEGER default '0' ");
        mAutoDBInfo.columns[19] = "recommand";
        mAutoDBInfo.colsMap.put("recommand", "INTEGER default '0' ");
        mAutoDBInfo.columns[20] = "sync";
        mAutoDBInfo.colsMap.put("sync", "INTEGER default '0' ");
        mAutoDBInfo.columns[21] = "idx";
        mAutoDBInfo.colsMap.put("idx", "INTEGER default '0' ");
        mAutoDBInfo.columns[22] = "BigIconUrl";
        mAutoDBInfo.colsMap.put("BigIconUrl", "TEXT");
        mAutoDBInfo.columns[23] = "MutiLanName";
        mAutoDBInfo.colsMap.put("MutiLanName", "TEXT");
        mAutoDBInfo.columns[24] = "recommandType";
        mAutoDBInfo.colsMap.put("recommandType", "INTEGER default '-1' ");
        mAutoDBInfo.columns[25] = IXWebPreferences.XWEB_LANGUAGE;
        mAutoDBInfo.colsMap.put(IXWebPreferences.XWEB_LANGUAGE, "TEXT");
        mAutoDBInfo.columns[26] = "recommandWord";
        mAutoDBInfo.colsMap.put("recommandWord", "TEXT");
        mAutoDBInfo.columns[27] = "buttonType";
        mAutoDBInfo.colsMap.put("buttonType", "INTEGER");
        mAutoDBInfo.columns[28] = "count";
        mAutoDBInfo.colsMap.put("count", "INTEGER");
        mAutoDBInfo.columns[29] = "ipKey";
        mAutoDBInfo.colsMap.put("ipKey", "TEXT");
        mAutoDBInfo.columns[30] = "rowid";
        mAutoDBInfo.sql = " productID TEXT PRIMARY KEY  COLLATE NOCASE ,  packIconUrl TEXT,  packGrayIconUrl TEXT,  packCoverUrl TEXT,  packName TEXT,  packDesc TEXT,  packAuthInfo TEXT,  packPrice TEXT,  packType INTEGER,  packFlag INTEGER,  packExpire LONG,  packTimeStamp LONG,  packCopyright TEXT,  type INTEGER,  status INTEGER,  sort INTEGER default '1' ,  lastUseTime LONG,  packStatus INTEGER default '0' ,  flag INTEGER default '0' ,  recommand INTEGER default '0' ,  sync INTEGER default '0' ,  idx INTEGER default '0' ,  BigIconUrl TEXT,  MutiLanName TEXT,  recommandType INTEGER default '-1' ,  lang TEXT,  recommandWord TEXT,  buttonType INTEGER,  count INTEGER,  ipKey TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102675w1)) {
            return false;
        }
        C102675w1 w1Var = (C102675w1) iAutoDBItem;
        return C46238a.m51546a(this.field_productID, w1Var.field_productID) && C46238a.m51546a(this.field_packIconUrl, w1Var.field_packIconUrl) && C46238a.m51546a(this.field_packGrayIconUrl, w1Var.field_packGrayIconUrl) && C46238a.m51546a(this.field_packCoverUrl, w1Var.field_packCoverUrl) && C46238a.m51546a(this.field_packName, w1Var.field_packName) && C46238a.m51546a(this.field_packDesc, w1Var.field_packDesc) && C46238a.m51546a(this.field_packAuthInfo, w1Var.field_packAuthInfo) && C46238a.m51546a(this.field_packPrice, w1Var.field_packPrice) && C46238a.m51546a(Integer.valueOf(this.field_packType), Integer.valueOf(w1Var.field_packType)) && C46238a.m51546a(Integer.valueOf(this.field_packFlag), Integer.valueOf(w1Var.field_packFlag)) && C46238a.m51546a(Long.valueOf(this.field_packExpire), Long.valueOf(w1Var.field_packExpire)) && C46238a.m51546a(Long.valueOf(this.field_packTimeStamp), Long.valueOf(w1Var.field_packTimeStamp)) && C46238a.m51546a(this.field_packCopyright, w1Var.field_packCopyright) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(w1Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(w1Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_sort), Integer.valueOf(w1Var.field_sort)) && C46238a.m51546a(Long.valueOf(this.field_lastUseTime), Long.valueOf(w1Var.field_lastUseTime)) && C46238a.m51546a(Integer.valueOf(this.field_packStatus), Integer.valueOf(w1Var.field_packStatus)) && C46238a.m51546a(Integer.valueOf(this.field_flag), Integer.valueOf(w1Var.field_flag)) && C46238a.m51546a(Integer.valueOf(this.field_recommand), Integer.valueOf(w1Var.field_recommand)) && C46238a.m51546a(Integer.valueOf(this.field_sync), Integer.valueOf(w1Var.field_sync)) && C46238a.m51546a(Integer.valueOf(this.field_idx), Integer.valueOf(w1Var.field_idx)) && C46238a.m51546a(this.field_BigIconUrl, w1Var.field_BigIconUrl) && C46238a.m51546a(this.field_MutiLanName, w1Var.field_MutiLanName) && C46238a.m51546a(Integer.valueOf(this.field_recommandType), Integer.valueOf(w1Var.field_recommandType)) && C46238a.m51546a(this.field_lang, w1Var.field_lang) && C46238a.m51546a(this.field_recommandWord, w1Var.field_recommandWord) && C46238a.m51546a(Integer.valueOf(this.field_buttonType), Integer.valueOf(w1Var.field_buttonType)) && C46238a.m51546a(Integer.valueOf(this.field_count), Integer.valueOf(w1Var.field_count)) && C46238a.m51546a(this.field_ipKey, w1Var.field_ipKey);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f303045M == hashCode) {
                    try {
                        this.field_productID = cursor.getString(i);
                        this.f303088d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303046N == hashCode) {
                    try {
                        this.field_packIconUrl = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303047P == hashCode) {
                    try {
                        this.field_packGrayIconUrl = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303048Q == hashCode) {
                    try {
                        this.field_packCoverUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303050R == hashCode) {
                    try {
                        this.field_packName = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303052S == hashCode) {
                    try {
                        this.field_packDesc = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303054T == hashCode) {
                    try {
                        this.field_packAuthInfo = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303056U == hashCode) {
                    try {
                        this.field_packPrice = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303058V == hashCode) {
                    try {
                        this.field_packType = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303060W == hashCode) {
                    try {
                        this.field_packFlag = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303062X == hashCode) {
                    try {
                        this.field_packExpire = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303064Y == hashCode) {
                    try {
                        this.field_packTimeStamp = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303066Z == hashCode) {
                    try {
                        this.field_packCopyright = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303075p0 == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303076x0 == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303077y0 == hashCode) {
                    try {
                        this.field_sort = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303049Q0 == hashCode) {
                    try {
                        this.field_lastUseTime = cursor.getLong(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303051R0 == hashCode) {
                    try {
                        this.field_packStatus = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303053S0 == hashCode) {
                    try {
                        this.field_flag = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303055T0 == hashCode) {
                    try {
                        this.field_recommand = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303057U0 == hashCode) {
                    try {
                        this.field_sync = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303059V0 == hashCode) {
                    try {
                        this.field_idx = cursor.getInt(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303061W0 == hashCode) {
                    try {
                        this.field_BigIconUrl = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303063X0 == hashCode) {
                    try {
                        this.field_MutiLanName = cursor.getString(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303065Y0 == hashCode) {
                    try {
                        this.field_recommandType = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303067Z0 == hashCode) {
                    try {
                        this.field_lang = cursor.getString(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303068a1 == hashCode) {
                    try {
                        this.field_recommandWord = cursor.getString(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303069b1 == hashCode) {
                    try {
                        this.field_buttonType = cursor.getInt(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303070c1 == hashCode) {
                    try {
                        this.field_count = cursor.getInt(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303071d1 == hashCode) {
                    try {
                        this.field_ipKey = cursor.getString(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiGroupInfo", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303072e1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f303088d) {
            contentValues.put("productID", this.field_productID);
        }
        if (this.f303089e) {
            contentValues.put("packIconUrl", this.field_packIconUrl);
        }
        if (this.f303090f) {
            contentValues.put("packGrayIconUrl", this.field_packGrayIconUrl);
        }
        if (this.f303091g) {
            contentValues.put("packCoverUrl", this.field_packCoverUrl);
        }
        if (this.f303092h) {
            contentValues.put("packName", this.field_packName);
        }
        if (this.f303093i) {
            contentValues.put("packDesc", this.field_packDesc);
        }
        if (this.f303094j) {
            contentValues.put("packAuthInfo", this.field_packAuthInfo);
        }
        if (this.f303095n) {
            contentValues.put("packPrice", this.field_packPrice);
        }
        if (this.f303096o) {
            contentValues.put("packType", Integer.valueOf(this.field_packType));
        }
        if (this.f303097p) {
            contentValues.put("packFlag", Integer.valueOf(this.field_packFlag));
        }
        if (this.f303098q) {
            contentValues.put("packExpire", Long.valueOf(this.field_packExpire));
        }
        if (this.f303099r) {
            contentValues.put("packTimeStamp", Long.valueOf(this.field_packTimeStamp));
        }
        if (this.f303100s) {
            contentValues.put("packCopyright", this.field_packCopyright);
        }
        if (this.f303101t) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f303102u) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f303103v) {
            contentValues.put("sort", Integer.valueOf(this.field_sort));
        }
        if (this.f303104w) {
            contentValues.put("lastUseTime", Long.valueOf(this.field_lastUseTime));
        }
        if (this.f303105x) {
            contentValues.put("packStatus", Integer.valueOf(this.field_packStatus));
        }
        if (this.f303106y) {
            contentValues.put("flag", Integer.valueOf(this.field_flag));
        }
        if (this.f303107z) {
            contentValues.put("recommand", Integer.valueOf(this.field_recommand));
        }
        if (this.f303078A) {
            contentValues.put("sync", Integer.valueOf(this.field_sync));
        }
        if (this.f303079B) {
            contentValues.put("idx", Integer.valueOf(this.field_idx));
        }
        if (this.f303080C) {
            contentValues.put("BigIconUrl", this.field_BigIconUrl);
        }
        if (this.f303081D) {
            contentValues.put("MutiLanName", this.field_MutiLanName);
        }
        if (this.f303082E) {
            contentValues.put("recommandType", Integer.valueOf(this.field_recommandType));
        }
        if (this.f303083F) {
            contentValues.put(IXWebPreferences.XWEB_LANGUAGE, this.field_lang);
        }
        if (this.f303084G) {
            contentValues.put("recommandWord", this.field_recommandWord);
        }
        if (this.f303085H) {
            contentValues.put("buttonType", Integer.valueOf(this.field_buttonType));
        }
        if (this.f303086I) {
            contentValues.put("count", Integer.valueOf(this.field_count));
        }
        if (this.f303087J) {
            contentValues.put("ipKey", this.field_ipKey);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEmojiGroupInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmojiGroupInfo ( " + f303073f1.sql + ");");
        for (String add : f303044L) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiGroupInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmojiGroupInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f303073f1, "EmojiGroupInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiGroupInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmojiGroupInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmojiGroupInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f303073f1;
    }

    public String[] getIndexCreateSQL() {
        return f303044L;
    }

    public StorageObserverOwner<C102675w1> getObserverOwner() {
        return f303074g1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_productID;
    }

    public SingleTable getTable() {
        return f303043K;
    }

    public String getTableName() {
        return f303043K.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("productID")) {
            this.field_productID = contentValues.getAsString("productID");
            if (z) {
                this.f303088d = true;
            }
        }
        if (contentValues.containsKey("packIconUrl")) {
            this.field_packIconUrl = contentValues.getAsString("packIconUrl");
            if (z) {
                this.f303089e = true;
            }
        }
        if (contentValues.containsKey("packGrayIconUrl")) {
            this.field_packGrayIconUrl = contentValues.getAsString("packGrayIconUrl");
            if (z) {
                this.f303090f = true;
            }
        }
        if (contentValues.containsKey("packCoverUrl")) {
            this.field_packCoverUrl = contentValues.getAsString("packCoverUrl");
            if (z) {
                this.f303091g = true;
            }
        }
        if (contentValues.containsKey("packName")) {
            this.field_packName = contentValues.getAsString("packName");
            if (z) {
                this.f303092h = true;
            }
        }
        if (contentValues.containsKey("packDesc")) {
            this.field_packDesc = contentValues.getAsString("packDesc");
            if (z) {
                this.f303093i = true;
            }
        }
        if (contentValues.containsKey("packAuthInfo")) {
            this.field_packAuthInfo = contentValues.getAsString("packAuthInfo");
            if (z) {
                this.f303094j = true;
            }
        }
        if (contentValues.containsKey("packPrice")) {
            this.field_packPrice = contentValues.getAsString("packPrice");
            if (z) {
                this.f303095n = true;
            }
        }
        if (contentValues.containsKey("packType")) {
            this.field_packType = contentValues.getAsInteger("packType").intValue();
            if (z) {
                this.f303096o = true;
            }
        }
        if (contentValues.containsKey("packFlag")) {
            this.field_packFlag = contentValues.getAsInteger("packFlag").intValue();
            if (z) {
                this.f303097p = true;
            }
        }
        if (contentValues.containsKey("packExpire")) {
            this.field_packExpire = contentValues.getAsLong("packExpire").longValue();
            if (z) {
                this.f303098q = true;
            }
        }
        if (contentValues.containsKey("packTimeStamp")) {
            this.field_packTimeStamp = contentValues.getAsLong("packTimeStamp").longValue();
            if (z) {
                this.f303099r = true;
            }
        }
        if (contentValues.containsKey("packCopyright")) {
            this.field_packCopyright = contentValues.getAsString("packCopyright");
            if (z) {
                this.f303100s = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f303101t = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f303102u = true;
            }
        }
        if (contentValues.containsKey("sort")) {
            this.field_sort = contentValues.getAsInteger("sort").intValue();
            if (z) {
                this.f303103v = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.field_lastUseTime = contentValues.getAsLong("lastUseTime").longValue();
            if (z) {
                this.f303104w = true;
            }
        }
        if (contentValues.containsKey("packStatus")) {
            this.field_packStatus = contentValues.getAsInteger("packStatus").intValue();
            if (z) {
                this.f303105x = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z) {
                this.f303106y = true;
            }
        }
        if (contentValues.containsKey("recommand")) {
            this.field_recommand = contentValues.getAsInteger("recommand").intValue();
            if (z) {
                this.f303107z = true;
            }
        }
        if (contentValues.containsKey("sync")) {
            this.field_sync = contentValues.getAsInteger("sync").intValue();
            if (z) {
                this.f303078A = true;
            }
        }
        if (contentValues.containsKey("idx")) {
            this.field_idx = contentValues.getAsInteger("idx").intValue();
            if (z) {
                this.f303079B = true;
            }
        }
        if (contentValues.containsKey("BigIconUrl")) {
            this.field_BigIconUrl = contentValues.getAsString("BigIconUrl");
            if (z) {
                this.f303080C = true;
            }
        }
        if (contentValues.containsKey("MutiLanName")) {
            this.field_MutiLanName = contentValues.getAsString("MutiLanName");
            if (z) {
                this.f303081D = true;
            }
        }
        if (contentValues.containsKey("recommandType")) {
            this.field_recommandType = contentValues.getAsInteger("recommandType").intValue();
            if (z) {
                this.f303082E = true;
            }
        }
        if (contentValues.containsKey(IXWebPreferences.XWEB_LANGUAGE)) {
            this.field_lang = contentValues.getAsString(IXWebPreferences.XWEB_LANGUAGE);
            if (z) {
                this.f303083F = true;
            }
        }
        if (contentValues.containsKey("recommandWord")) {
            this.field_recommandWord = contentValues.getAsString("recommandWord");
            if (z) {
                this.f303084G = true;
            }
        }
        if (contentValues.containsKey("buttonType")) {
            this.field_buttonType = contentValues.getAsInteger("buttonType").intValue();
            if (z) {
                this.f303085H = true;
            }
        }
        if (contentValues.containsKey("count")) {
            this.field_count = contentValues.getAsInteger("count").intValue();
            if (z) {
                this.f303086I = true;
            }
        }
        if (contentValues.containsKey("ipKey")) {
            this.field_ipKey = contentValues.getAsString("ipKey");
            if (z) {
                this.f303087J = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
