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

/* renamed from: xh.ia */
public class C91206ia extends IAutoDBItem {

    /* renamed from: C */
    public static final SingleTable f261519C;

    /* renamed from: D */
    public static final String[] f261520D = {"CREATE INDEX IF NOT EXISTS WxaAttributesTableAppIdIndex ON WxaAttributesTable(appId)"};

    /* renamed from: E */
    public static final int f261521E = 1007641348;

    /* renamed from: F */
    public static final int f261522F = -265713450;

    /* renamed from: G */
    public static final int f261523G = 93028124;

    /* renamed from: H */
    public static final int f261524H = 70690926;

    /* renamed from: I */
    public static final int f261525I = -738700022;

    /* renamed from: J */
    public static final int f261526J = -571464529;

    /* renamed from: K */
    public static final int f261527K = -1153507156;

    /* renamed from: L */
    public static final int f261528L = -1301829041;

    /* renamed from: M */
    public static final int f261529M = 1551813736;

    /* renamed from: N */
    public static final int f261530N = 1073584312;

    /* renamed from: P */
    public static final int f261531P = -1411089198;

    /* renamed from: Q */
    public static final int f261532Q = -485573474;

    /* renamed from: Q0 */
    public static final StorageObserverOwner<C91206ia> f261533Q0 = new StorageObserverOwner<>();

    /* renamed from: R */
    public static final int f261534R = -794273169;

    /* renamed from: S */
    public static final int f261535S = 688769446;

    /* renamed from: T */
    public static final int f261536T = -1954138046;

    /* renamed from: U */
    public static final int f261537U = 566372231;

    /* renamed from: V */
    public static final int f261538V = 1199995761;

    /* renamed from: W */
    public static final int f261539W = -258997875;

    /* renamed from: X */
    public static final int f261540X = -350385368;

    /* renamed from: Y */
    public static final int f261541Y = -1164564836;

    /* renamed from: Z */
    public static final int f261542Z = -1289976387;

    /* renamed from: p0 */
    public static final int f261543p0 = -97827566;

    /* renamed from: x0 */
    public static final int f261544x0 = 108705909;

    /* renamed from: y0 */
    public static final IAutoDBItem.MAutoDBInfo f261545y0 = initAutoDBInfo(C91206ia.class);

    /* renamed from: A */
    public boolean f261546A = true;

    /* renamed from: B */
    public boolean f261547B = true;

    /* renamed from: d */
    public boolean f261548d = true;

    /* renamed from: e */
    public boolean f261549e = true;

    /* renamed from: f */
    public boolean f261550f = true;
    public String field_appId;
    public String field_appInfo;
    public int field_appOpt;
    public String field_bigHeadURL;
    public String field_bindWxaInfo;
    public String field_bizMenu;
    public String field_brandIconURL;
    public String field_dynamicInfo;
    public String field_nickname;
    public String field_passThroughInfo;
    public String field_registerSource;
    public String field_reserved;
    public String field_roundedSquareIconURL;
    public String field_shortNickname;
    public String field_signature;
    public String field_smallHeadURL;
    public String field_stablePassThroughInfo;
    public long field_syncTimeSecond;
    public String field_syncVersion;
    public String field_username;
    public int field_usernameHash;
    public String field_versionInfo;

    /* renamed from: g */
    public boolean f261551g = true;

    /* renamed from: h */
    public boolean f261552h = true;

    /* renamed from: i */
    public boolean f261553i = true;

    /* renamed from: j */
    public boolean f261554j = true;

    /* renamed from: n */
    public boolean f261555n = true;

    /* renamed from: o */
    public boolean f261556o = true;

    /* renamed from: p */
    public boolean f261557p = true;

    /* renamed from: q */
    public boolean f261558q = true;

    /* renamed from: r */
    public boolean f261559r = true;

    /* renamed from: s */
    public boolean f261560s = true;

    /* renamed from: t */
    public boolean f261561t = true;

    /* renamed from: u */
    public boolean f261562u = true;

    /* renamed from: v */
    public boolean f261563v = true;

    /* renamed from: w */
    public boolean f261564w = true;

    /* renamed from: x */
    public boolean f261565x = true;

    /* renamed from: y */
    public boolean f261566y = true;

    /* renamed from: z */
    public boolean f261567z = true;

    static {
        SingleTable singleTable = new SingleTable("WxaAttributesTable");
        f261519C = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("usernameHash", "int", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("shortNickname", "string", singleTable.getName(), "");
        new Column("brandIconURL", "string", singleTable.getName(), "");
        new Column("roundedSquareIconURL", "string", singleTable.getName(), "");
        new Column("bigHeadURL", "string", singleTable.getName(), "");
        new Column("smallHeadURL", "string", singleTable.getName(), "");
        new Column("signature", "string", singleTable.getName(), "");
        new Column("appOpt", "int", singleTable.getName(), "");
        new Column("registerSource", "string", singleTable.getName(), "");
        new Column("appInfo", "string", singleTable.getName(), "");
        new Column("versionInfo", "string", singleTable.getName(), "");
        new Column("passThroughInfo", "string", singleTable.getName(), "");
        new Column("stablePassThroughInfo", "string", singleTable.getName(), "");
        new Column("bindWxaInfo", "string", singleTable.getName(), "");
        new Column("dynamicInfo", "string", singleTable.getName(), "");
        new Column("reserved", "string", singleTable.getName(), "");
        new Column("syncTimeSecond", "long", singleTable.getName(), "");
        new Column("syncVersion", "string", singleTable.getName(), "");
        new Column("bizMenu", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[22];
        String[] strArr = new String[23];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "usernameHash";
        mAutoDBInfo.colsMap.put("usernameHash", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "usernameHash";
        mAutoDBInfo.columns[1] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[2] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[3] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT");
        mAutoDBInfo.columns[4] = "shortNickname";
        mAutoDBInfo.colsMap.put("shortNickname", "TEXT");
        mAutoDBInfo.columns[5] = "brandIconURL";
        mAutoDBInfo.colsMap.put("brandIconURL", "TEXT");
        mAutoDBInfo.columns[6] = "roundedSquareIconURL";
        mAutoDBInfo.colsMap.put("roundedSquareIconURL", "TEXT");
        mAutoDBInfo.columns[7] = "bigHeadURL";
        mAutoDBInfo.colsMap.put("bigHeadURL", "TEXT");
        mAutoDBInfo.columns[8] = "smallHeadURL";
        mAutoDBInfo.colsMap.put("smallHeadURL", "TEXT");
        mAutoDBInfo.columns[9] = "signature";
        mAutoDBInfo.colsMap.put("signature", "TEXT");
        mAutoDBInfo.columns[10] = "appOpt";
        mAutoDBInfo.colsMap.put("appOpt", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "registerSource";
        mAutoDBInfo.colsMap.put("registerSource", "TEXT");
        mAutoDBInfo.columns[12] = "appInfo";
        mAutoDBInfo.colsMap.put("appInfo", "TEXT");
        mAutoDBInfo.columns[13] = "versionInfo";
        mAutoDBInfo.colsMap.put("versionInfo", "TEXT");
        mAutoDBInfo.columns[14] = "passThroughInfo";
        mAutoDBInfo.colsMap.put("passThroughInfo", "TEXT");
        mAutoDBInfo.columns[15] = "stablePassThroughInfo";
        mAutoDBInfo.colsMap.put("stablePassThroughInfo", "TEXT");
        mAutoDBInfo.columns[16] = "bindWxaInfo";
        mAutoDBInfo.colsMap.put("bindWxaInfo", "TEXT");
        mAutoDBInfo.columns[17] = "dynamicInfo";
        mAutoDBInfo.colsMap.put("dynamicInfo", "TEXT");
        mAutoDBInfo.columns[18] = "reserved";
        mAutoDBInfo.colsMap.put("reserved", "TEXT");
        mAutoDBInfo.columns[19] = "syncTimeSecond";
        mAutoDBInfo.colsMap.put("syncTimeSecond", "LONG default '0' ");
        mAutoDBInfo.columns[20] = "syncVersion";
        mAutoDBInfo.colsMap.put("syncVersion", "TEXT");
        mAutoDBInfo.columns[21] = "bizMenu";
        mAutoDBInfo.colsMap.put("bizMenu", "TEXT");
        mAutoDBInfo.columns[22] = "rowid";
        mAutoDBInfo.sql = " usernameHash INTEGER PRIMARY KEY ,  username TEXT,  appId TEXT,  nickname TEXT,  shortNickname TEXT,  brandIconURL TEXT,  roundedSquareIconURL TEXT,  bigHeadURL TEXT,  smallHeadURL TEXT,  signature TEXT,  appOpt INTEGER default '0' ,  registerSource TEXT,  appInfo TEXT,  versionInfo TEXT,  passThroughInfo TEXT,  stablePassThroughInfo TEXT,  bindWxaInfo TEXT,  dynamicInfo TEXT,  reserved TEXT,  syncTimeSecond LONG default '0' ,  syncVersion TEXT,  bizMenu TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C91206ia)) {
            return false;
        }
        C91206ia iaVar = (C91206ia) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_usernameHash), Integer.valueOf(iaVar.field_usernameHash)) && C46238a.m51546a(this.field_username, iaVar.field_username) && C46238a.m51546a(this.field_appId, iaVar.field_appId) && C46238a.m51546a(this.field_nickname, iaVar.field_nickname) && C46238a.m51546a(this.field_shortNickname, iaVar.field_shortNickname) && C46238a.m51546a(this.field_brandIconURL, iaVar.field_brandIconURL) && C46238a.m51546a(this.field_roundedSquareIconURL, iaVar.field_roundedSquareIconURL) && C46238a.m51546a(this.field_bigHeadURL, iaVar.field_bigHeadURL) && C46238a.m51546a(this.field_smallHeadURL, iaVar.field_smallHeadURL) && C46238a.m51546a(this.field_signature, iaVar.field_signature) && C46238a.m51546a(Integer.valueOf(this.field_appOpt), Integer.valueOf(iaVar.field_appOpt)) && C46238a.m51546a(this.field_registerSource, iaVar.field_registerSource) && C46238a.m51546a(this.field_appInfo, iaVar.field_appInfo) && C46238a.m51546a(this.field_versionInfo, iaVar.field_versionInfo) && C46238a.m51546a(this.field_passThroughInfo, iaVar.field_passThroughInfo) && C46238a.m51546a(this.field_stablePassThroughInfo, iaVar.field_stablePassThroughInfo) && C46238a.m51546a(this.field_bindWxaInfo, iaVar.field_bindWxaInfo) && C46238a.m51546a(this.field_dynamicInfo, iaVar.field_dynamicInfo) && C46238a.m51546a(this.field_reserved, iaVar.field_reserved) && C46238a.m51546a(Long.valueOf(this.field_syncTimeSecond), Long.valueOf(iaVar.field_syncTimeSecond)) && C46238a.m51546a(this.field_syncVersion, iaVar.field_syncVersion) && C46238a.m51546a(this.field_bizMenu, iaVar.field_bizMenu);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f261521E == hashCode) {
                    try {
                        this.field_usernameHash = cursor.getInt(i);
                        this.f261548d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261522F == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261523G == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261524H == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261525I == hashCode) {
                    try {
                        this.field_shortNickname = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261526J == hashCode) {
                    try {
                        this.field_brandIconURL = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261527K == hashCode) {
                    try {
                        this.field_roundedSquareIconURL = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261528L == hashCode) {
                    try {
                        this.field_bigHeadURL = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261529M == hashCode) {
                    try {
                        this.field_smallHeadURL = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261530N == hashCode) {
                    try {
                        this.field_signature = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261531P == hashCode) {
                    try {
                        this.field_appOpt = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261532Q == hashCode) {
                    try {
                        this.field_registerSource = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261534R == hashCode) {
                    try {
                        this.field_appInfo = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261535S == hashCode) {
                    try {
                        this.field_versionInfo = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261536T == hashCode) {
                    try {
                        this.field_passThroughInfo = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261537U == hashCode) {
                    try {
                        this.field_stablePassThroughInfo = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261538V == hashCode) {
                    try {
                        this.field_bindWxaInfo = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261539W == hashCode) {
                    try {
                        this.field_dynamicInfo = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261540X == hashCode) {
                    try {
                        this.field_reserved = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261541Y == hashCode) {
                    try {
                        this.field_syncTimeSecond = cursor.getLong(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261542Z == hashCode) {
                    try {
                        this.field_syncVersion = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261543p0 == hashCode) {
                    try {
                        this.field_bizMenu = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttributesTable", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261544x0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f261548d) {
            contentValues.put("usernameHash", Integer.valueOf(this.field_usernameHash));
        }
        if (this.f261549e) {
            contentValues.put("username", this.field_username);
        }
        if (this.f261550f) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f261551g) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f261552h) {
            contentValues.put("shortNickname", this.field_shortNickname);
        }
        if (this.f261553i) {
            contentValues.put("brandIconURL", this.field_brandIconURL);
        }
        if (this.f261554j) {
            contentValues.put("roundedSquareIconURL", this.field_roundedSquareIconURL);
        }
        if (this.f261555n) {
            contentValues.put("bigHeadURL", this.field_bigHeadURL);
        }
        if (this.f261556o) {
            contentValues.put("smallHeadURL", this.field_smallHeadURL);
        }
        if (this.f261557p) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.f261558q) {
            contentValues.put("appOpt", Integer.valueOf(this.field_appOpt));
        }
        if (this.f261559r) {
            contentValues.put("registerSource", this.field_registerSource);
        }
        if (this.f261560s) {
            contentValues.put("appInfo", this.field_appInfo);
        }
        if (this.f261561t) {
            contentValues.put("versionInfo", this.field_versionInfo);
        }
        if (this.f261562u) {
            contentValues.put("passThroughInfo", this.field_passThroughInfo);
        }
        if (this.f261563v) {
            contentValues.put("stablePassThroughInfo", this.field_stablePassThroughInfo);
        }
        if (this.f261564w) {
            contentValues.put("bindWxaInfo", this.field_bindWxaInfo);
        }
        if (this.f261565x) {
            contentValues.put("dynamicInfo", this.field_dynamicInfo);
        }
        if (this.f261566y) {
            contentValues.put("reserved", this.field_reserved);
        }
        if (this.f261567z) {
            contentValues.put("syncTimeSecond", Long.valueOf(this.field_syncTimeSecond));
        }
        if (this.f261546A) {
            contentValues.put("syncVersion", this.field_syncVersion);
        }
        if (this.f261547B) {
            contentValues.put("bizMenu", this.field_bizMenu);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaAttributesTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaAttributesTable ( " + f261545y0.sql + ");");
        for (String add : f261520D) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaAttributesTable", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaAttributesTable", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f261545y0, "WxaAttributesTable", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaAttributesTable", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaAttributesTable", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaAttributesTable", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f261545y0;
    }

    public String[] getIndexCreateSQL() {
        return f261520D;
    }

    public StorageObserverOwner<C91206ia> getObserverOwner() {
        return f261533Q0;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_usernameHash);
    }

    public SingleTable getTable() {
        return f261519C;
    }

    public String getTableName() {
        return f261519C.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("usernameHash")) {
            this.field_usernameHash = contentValues.getAsInteger("usernameHash").intValue();
            if (z) {
                this.f261548d = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f261549e = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f261550f = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f261551g = true;
            }
        }
        if (contentValues.containsKey("shortNickname")) {
            this.field_shortNickname = contentValues.getAsString("shortNickname");
            if (z) {
                this.f261552h = true;
            }
        }
        if (contentValues.containsKey("brandIconURL")) {
            this.field_brandIconURL = contentValues.getAsString("brandIconURL");
            if (z) {
                this.f261553i = true;
            }
        }
        if (contentValues.containsKey("roundedSquareIconURL")) {
            this.field_roundedSquareIconURL = contentValues.getAsString("roundedSquareIconURL");
            if (z) {
                this.f261554j = true;
            }
        }
        if (contentValues.containsKey("bigHeadURL")) {
            this.field_bigHeadURL = contentValues.getAsString("bigHeadURL");
            if (z) {
                this.f261555n = true;
            }
        }
        if (contentValues.containsKey("smallHeadURL")) {
            this.field_smallHeadURL = contentValues.getAsString("smallHeadURL");
            if (z) {
                this.f261556o = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z) {
                this.f261557p = true;
            }
        }
        if (contentValues.containsKey("appOpt")) {
            this.field_appOpt = contentValues.getAsInteger("appOpt").intValue();
            if (z) {
                this.f261558q = true;
            }
        }
        if (contentValues.containsKey("registerSource")) {
            this.field_registerSource = contentValues.getAsString("registerSource");
            if (z) {
                this.f261559r = true;
            }
        }
        if (contentValues.containsKey("appInfo")) {
            this.field_appInfo = contentValues.getAsString("appInfo");
            if (z) {
                this.f261560s = true;
            }
        }
        if (contentValues.containsKey("versionInfo")) {
            this.field_versionInfo = contentValues.getAsString("versionInfo");
            if (z) {
                this.f261561t = true;
            }
        }
        if (contentValues.containsKey("passThroughInfo")) {
            this.field_passThroughInfo = contentValues.getAsString("passThroughInfo");
            if (z) {
                this.f261562u = true;
            }
        }
        if (contentValues.containsKey("stablePassThroughInfo")) {
            this.field_stablePassThroughInfo = contentValues.getAsString("stablePassThroughInfo");
            if (z) {
                this.f261563v = true;
            }
        }
        if (contentValues.containsKey("bindWxaInfo")) {
            this.field_bindWxaInfo = contentValues.getAsString("bindWxaInfo");
            if (z) {
                this.f261564w = true;
            }
        }
        if (contentValues.containsKey("dynamicInfo")) {
            this.field_dynamicInfo = contentValues.getAsString("dynamicInfo");
            if (z) {
                this.f261565x = true;
            }
        }
        if (contentValues.containsKey("reserved")) {
            this.field_reserved = contentValues.getAsString("reserved");
            if (z) {
                this.f261566y = true;
            }
        }
        if (contentValues.containsKey("syncTimeSecond")) {
            this.field_syncTimeSecond = contentValues.getAsLong("syncTimeSecond").longValue();
            if (z) {
                this.f261567z = true;
            }
        }
        if (contentValues.containsKey("syncVersion")) {
            this.field_syncVersion = contentValues.getAsString("syncVersion");
            if (z) {
                this.f261546A = true;
            }
        }
        if (contentValues.containsKey("bizMenu")) {
            this.field_bizMenu = contentValues.getAsString("bizMenu");
            if (z) {
                this.f261547B = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
