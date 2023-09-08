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

/* renamed from: xh.s0 */
public class C53349s0 extends IAutoDBItem {

    /* renamed from: A */
    public static final SingleTable f149875A;

    /* renamed from: B */
    public static final String[] f149876B = new String[0];

    /* renamed from: C */
    public static final int f149877C = -265713450;

    /* renamed from: D */
    public static final int f149878D = 93028124;

    /* renamed from: E */
    public static final int f149879E = -787524411;

    /* renamed from: F */
    public static final int f149880F = -79730605;

    /* renamed from: G */
    public static final int f149881G = 520191988;

    /* renamed from: H */
    public static final int f149882H = -787700845;

    /* renamed from: I */
    public static final int f149883I = -1306498449;

    /* renamed from: J */
    public static final int f149884J = -787609387;

    /* renamed from: K */
    public static final int f149885K = -571464529;

    /* renamed from: L */
    public static final int f149886L = -295931082;

    /* renamed from: M */
    public static final int f149887M = -316545647;

    /* renamed from: N */
    public static final int f149888N = -1226967966;

    /* renamed from: P */
    public static final int f149889P = 3575610;

    /* renamed from: Q */
    public static final int f149890Q = -892481550;

    /* renamed from: R */
    public static final int f149891R = 1022482461;

    /* renamed from: S */
    public static final int f149892S = 871127988;

    /* renamed from: T */
    public static final int f149893T = -872398957;

    /* renamed from: U */
    public static final int f149894U = -73178356;

    /* renamed from: V */
    public static final int f149895V = 1510775813;

    /* renamed from: W */
    public static final int f149896W = -103570919;

    /* renamed from: X */
    public static final int f149897X = 108705909;

    /* renamed from: Y */
    public static final IAutoDBItem.MAutoDBInfo f149898Y = initAutoDBInfo(C53349s0.class);

    /* renamed from: Z */
    public static final StorageObserverOwner<C53349s0> f149899Z = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f149900d = true;

    /* renamed from: e */
    public boolean f149901e = true;

    /* renamed from: f */
    public boolean f149902f = true;
    public int field_acceptType;
    public String field_appId;
    public String field_attrSyncVersion;
    public int field_bitFlag;
    public int field_brandFlag;
    public String field_brandIconURL;
    public String field_brandInfo;
    public String field_brandList;
    public String field_brandListContent;
    public String field_brandListVersion;
    public String field_enterpriseFather;
    public String field_extInfo;
    public int field_hadAlert;
    public long field_incrementUpdateTime;
    public String field_kfWorkerId;
    public int field_specialType;
    public int field_status;
    public int field_type;
    public long field_updateTime;
    public String field_username;

    /* renamed from: g */
    public boolean f149903g = true;

    /* renamed from: h */
    public boolean f149904h = true;

    /* renamed from: i */
    public boolean f149905i = true;

    /* renamed from: j */
    public boolean f149906j = true;

    /* renamed from: n */
    public boolean f149907n = true;

    /* renamed from: o */
    public boolean f149908o = true;

    /* renamed from: p */
    public boolean f149909p = true;

    /* renamed from: q */
    public boolean f149910q = true;

    /* renamed from: r */
    public boolean f149911r = true;

    /* renamed from: s */
    public boolean f149912s = true;

    /* renamed from: t */
    public boolean f149913t = true;

    /* renamed from: u */
    public boolean f149914u = true;

    /* renamed from: v */
    public boolean f149915v = true;

    /* renamed from: w */
    public boolean f149916w = true;

    /* renamed from: x */
    public boolean f149917x = true;

    /* renamed from: y */
    public boolean f149918y = true;

    /* renamed from: z */
    public boolean f149919z = true;

    static {
        SingleTable singleTable = new SingleTable("BizInfo");
        f149875A = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("brandList", "string", singleTable.getName(), "");
        new Column("brandListVersion", "string", singleTable.getName(), "");
        new Column("brandListContent", "string", singleTable.getName(), "");
        new Column("brandFlag", "int", singleTable.getName(), "");
        new Column("extInfo", "string", singleTable.getName(), "");
        new Column("brandInfo", "string", singleTable.getName(), "");
        new Column("brandIconURL", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("hadAlert", "int", singleTable.getName(), "");
        new Column("acceptType", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("enterpriseFather", "string", singleTable.getName(), "");
        new Column("kfWorkerId", "string", singleTable.getName(), "");
        new Column("specialType", "int", singleTable.getName(), "");
        new Column("attrSyncVersion", "string", singleTable.getName(), "");
        new Column("incrementUpdateTime", "long", singleTable.getName(), "");
        new Column("bitFlag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[20];
        String[] strArr = new String[21];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[2] = "brandList";
        mAutoDBInfo.colsMap.put("brandList", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "brandListVersion";
        mAutoDBInfo.colsMap.put("brandListVersion", "TEXT");
        mAutoDBInfo.columns[4] = "brandListContent";
        mAutoDBInfo.colsMap.put("brandListContent", "TEXT");
        mAutoDBInfo.columns[5] = "brandFlag";
        mAutoDBInfo.colsMap.put("brandFlag", "INTEGER");
        mAutoDBInfo.columns[6] = "extInfo";
        mAutoDBInfo.colsMap.put("extInfo", "TEXT");
        mAutoDBInfo.columns[7] = "brandInfo";
        mAutoDBInfo.colsMap.put("brandInfo", "TEXT");
        mAutoDBInfo.columns[8] = "brandIconURL";
        mAutoDBInfo.colsMap.put("brandIconURL", "TEXT");
        mAutoDBInfo.columns[9] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[10] = "hadAlert";
        mAutoDBInfo.colsMap.put("hadAlert", "INTEGER");
        mAutoDBInfo.columns[11] = "acceptType";
        mAutoDBInfo.colsMap.put("acceptType", "INTEGER default '0' ");
        mAutoDBInfo.columns[12] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER default '0' ");
        mAutoDBInfo.columns[13] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "enterpriseFather";
        mAutoDBInfo.colsMap.put("enterpriseFather", "TEXT");
        mAutoDBInfo.columns[15] = "kfWorkerId";
        mAutoDBInfo.colsMap.put("kfWorkerId", "TEXT");
        mAutoDBInfo.columns[16] = "specialType";
        mAutoDBInfo.colsMap.put("specialType", "INTEGER");
        mAutoDBInfo.columns[17] = "attrSyncVersion";
        mAutoDBInfo.colsMap.put("attrSyncVersion", "TEXT");
        mAutoDBInfo.columns[18] = "incrementUpdateTime";
        mAutoDBInfo.colsMap.put("incrementUpdateTime", "LONG");
        mAutoDBInfo.columns[19] = "bitFlag";
        mAutoDBInfo.colsMap.put("bitFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[20] = "rowid";
        mAutoDBInfo.sql = " username TEXT PRIMARY KEY ,  appId TEXT,  brandList TEXT default '' ,  brandListVersion TEXT,  brandListContent TEXT,  brandFlag INTEGER,  extInfo TEXT,  brandInfo TEXT,  brandIconURL TEXT,  updateTime LONG,  hadAlert INTEGER,  acceptType INTEGER default '0' ,  type INTEGER default '0' ,  status INTEGER default '0' ,  enterpriseFather TEXT,  kfWorkerId TEXT,  specialType INTEGER,  attrSyncVersion TEXT,  incrementUpdateTime LONG,  bitFlag INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53349s0)) {
            return false;
        }
        C53349s0 s0Var = (C53349s0) iAutoDBItem;
        return C46238a.m51546a(this.field_username, s0Var.field_username) && C46238a.m51546a(this.field_appId, s0Var.field_appId) && C46238a.m51546a(this.field_brandList, s0Var.field_brandList) && C46238a.m51546a(this.field_brandListVersion, s0Var.field_brandListVersion) && C46238a.m51546a(this.field_brandListContent, s0Var.field_brandListContent) && C46238a.m51546a(Integer.valueOf(this.field_brandFlag), Integer.valueOf(s0Var.field_brandFlag)) && C46238a.m51546a(this.field_extInfo, s0Var.field_extInfo) && C46238a.m51546a(this.field_brandInfo, s0Var.field_brandInfo) && C46238a.m51546a(this.field_brandIconURL, s0Var.field_brandIconURL) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(s0Var.field_updateTime)) && C46238a.m51546a(Integer.valueOf(this.field_hadAlert), Integer.valueOf(s0Var.field_hadAlert)) && C46238a.m51546a(Integer.valueOf(this.field_acceptType), Integer.valueOf(s0Var.field_acceptType)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(s0Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(s0Var.field_status)) && C46238a.m51546a(this.field_enterpriseFather, s0Var.field_enterpriseFather) && C46238a.m51546a(this.field_kfWorkerId, s0Var.field_kfWorkerId) && C46238a.m51546a(Integer.valueOf(this.field_specialType), Integer.valueOf(s0Var.field_specialType)) && C46238a.m51546a(this.field_attrSyncVersion, s0Var.field_attrSyncVersion) && C46238a.m51546a(Long.valueOf(this.field_incrementUpdateTime), Long.valueOf(s0Var.field_incrementUpdateTime)) && C46238a.m51546a(Integer.valueOf(this.field_bitFlag), Integer.valueOf(s0Var.field_bitFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149877C == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f149900d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149878D == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149879E == hashCode) {
                    try {
                        this.field_brandList = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149880F == hashCode) {
                    try {
                        this.field_brandListVersion = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149881G == hashCode) {
                    try {
                        this.field_brandListContent = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149882H == hashCode) {
                    try {
                        this.field_brandFlag = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149883I == hashCode) {
                    try {
                        this.field_extInfo = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149884J == hashCode) {
                    try {
                        this.field_brandInfo = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149885K == hashCode) {
                    try {
                        this.field_brandIconURL = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149886L == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149887M == hashCode) {
                    try {
                        this.field_hadAlert = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149888N == hashCode) {
                    try {
                        this.field_acceptType = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149889P == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149890Q == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149891R == hashCode) {
                    try {
                        this.field_enterpriseFather = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149892S == hashCode) {
                    try {
                        this.field_kfWorkerId = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149893T == hashCode) {
                    try {
                        this.field_specialType = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149894U == hashCode) {
                    try {
                        this.field_attrSyncVersion = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149895V == hashCode) {
                    try {
                        this.field_incrementUpdateTime = cursor.getLong(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149896W == hashCode) {
                    try {
                        this.field_bitFlag = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149897X == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149900d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f149901e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.field_brandList == null) {
            this.field_brandList = "";
        }
        if (this.f149902f) {
            contentValues.put("brandList", this.field_brandList);
        }
        if (this.f149903g) {
            contentValues.put("brandListVersion", this.field_brandListVersion);
        }
        if (this.f149904h) {
            contentValues.put("brandListContent", this.field_brandListContent);
        }
        if (this.f149905i) {
            contentValues.put("brandFlag", Integer.valueOf(this.field_brandFlag));
        }
        if (this.f149906j) {
            contentValues.put("extInfo", this.field_extInfo);
        }
        if (this.f149907n) {
            contentValues.put("brandInfo", this.field_brandInfo);
        }
        if (this.f149908o) {
            contentValues.put("brandIconURL", this.field_brandIconURL);
        }
        if (this.f149909p) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f149910q) {
            contentValues.put("hadAlert", Integer.valueOf(this.field_hadAlert));
        }
        if (this.f149911r) {
            contentValues.put("acceptType", Integer.valueOf(this.field_acceptType));
        }
        if (this.f149912s) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f149913t) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f149914u) {
            contentValues.put("enterpriseFather", this.field_enterpriseFather);
        }
        if (this.f149915v) {
            contentValues.put("kfWorkerId", this.field_kfWorkerId);
        }
        if (this.f149916w) {
            contentValues.put("specialType", Integer.valueOf(this.field_specialType));
        }
        if (this.f149917x) {
            contentValues.put("attrSyncVersion", this.field_attrSyncVersion);
        }
        if (this.f149918y) {
            contentValues.put("incrementUpdateTime", Long.valueOf(this.field_incrementUpdateTime));
        }
        if (this.f149919z) {
            contentValues.put("bitFlag", Integer.valueOf(this.field_bitFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizInfo ( " + f149898Y.sql + ");");
        for (String add : f149876B) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149898Y, "BizInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149898Y;
    }

    public String[] getIndexCreateSQL() {
        return f149876B;
    }

    public StorageObserverOwner<C53349s0> getObserverOwner() {
        return f149899Z;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f149875A;
    }

    public String getTableName() {
        return f149875A.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f149900d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f149901e = true;
            }
        }
        if (contentValues.containsKey("brandList")) {
            this.field_brandList = contentValues.getAsString("brandList");
            if (z) {
                this.f149902f = true;
            }
        }
        if (contentValues.containsKey("brandListVersion")) {
            this.field_brandListVersion = contentValues.getAsString("brandListVersion");
            if (z) {
                this.f149903g = true;
            }
        }
        if (contentValues.containsKey("brandListContent")) {
            this.field_brandListContent = contentValues.getAsString("brandListContent");
            if (z) {
                this.f149904h = true;
            }
        }
        if (contentValues.containsKey("brandFlag")) {
            this.field_brandFlag = contentValues.getAsInteger("brandFlag").intValue();
            if (z) {
                this.f149905i = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.field_extInfo = contentValues.getAsString("extInfo");
            if (z) {
                this.f149906j = true;
            }
        }
        if (contentValues.containsKey("brandInfo")) {
            this.field_brandInfo = contentValues.getAsString("brandInfo");
            if (z) {
                this.f149907n = true;
            }
        }
        if (contentValues.containsKey("brandIconURL")) {
            this.field_brandIconURL = contentValues.getAsString("brandIconURL");
            if (z) {
                this.f149908o = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f149909p = true;
            }
        }
        if (contentValues.containsKey("hadAlert")) {
            this.field_hadAlert = contentValues.getAsInteger("hadAlert").intValue();
            if (z) {
                this.f149910q = true;
            }
        }
        if (contentValues.containsKey("acceptType")) {
            this.field_acceptType = contentValues.getAsInteger("acceptType").intValue();
            if (z) {
                this.f149911r = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f149912s = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f149913t = true;
            }
        }
        if (contentValues.containsKey("enterpriseFather")) {
            this.field_enterpriseFather = contentValues.getAsString("enterpriseFather");
            if (z) {
                this.f149914u = true;
            }
        }
        if (contentValues.containsKey("kfWorkerId")) {
            this.field_kfWorkerId = contentValues.getAsString("kfWorkerId");
            if (z) {
                this.f149915v = true;
            }
        }
        if (contentValues.containsKey("specialType")) {
            this.field_specialType = contentValues.getAsInteger("specialType").intValue();
            if (z) {
                this.f149916w = true;
            }
        }
        if (contentValues.containsKey("attrSyncVersion")) {
            this.field_attrSyncVersion = contentValues.getAsString("attrSyncVersion");
            if (z) {
                this.f149917x = true;
            }
        }
        if (contentValues.containsKey("incrementUpdateTime")) {
            this.field_incrementUpdateTime = contentValues.getAsLong("incrementUpdateTime").longValue();
            if (z) {
                this.f149918y = true;
            }
        }
        if (contentValues.containsKey("bitFlag")) {
            this.field_bitFlag = contentValues.getAsInteger("bitFlag").intValue();
            if (z) {
                this.f149919z = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
