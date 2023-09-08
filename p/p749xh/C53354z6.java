package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import org.json.JSONObject;

/* renamed from: xh.z6 */
public class C53354z6 extends IAutoDBItem {

    /* renamed from: A */
    public static final String[] f150115A = {"CREATE INDEX IF NOT EXISTS OpenIMKefuContact_username_index ON OpenIMKefuContact(username)"};

    /* renamed from: B */
    public static final int f150116B = -265713450;

    /* renamed from: C */
    public static final int f150117C = 70690926;

    /* renamed from: D */
    public static final int f150118D = -1301839709;

    /* renamed from: E */
    public static final int f150119E = 1551803068;

    /* renamed from: F */
    public static final int f150120F = -455752505;

    /* renamed from: G */
    public static final int f150121G = 2066725741;

    /* renamed from: H */
    public static final int f150122H = 1685832366;

    /* renamed from: I */
    public static final int f150123I = 594986452;

    /* renamed from: J */
    public static final int f150124J = -896505829;

    /* renamed from: K */
    public static final int f150125K = 398583797;

    /* renamed from: L */
    public static final int f150126L = -528622238;

    /* renamed from: M */
    public static final int f150127M = -1110754064;

    /* renamed from: N */
    public static final int f150128N = -873960692;

    /* renamed from: P */
    public static final int f150129P = 3575610;

    /* renamed from: Q */
    public static final int f150130Q = -1522671844;

    /* renamed from: R */
    public static final int f150131R = 101940756;

    /* renamed from: S */
    public static final int f150132S = -539261252;

    /* renamed from: T */
    public static final int f150133T = -1375370902;

    /* renamed from: U */
    public static final int f150134U = -58277745;

    /* renamed from: V */
    public static final int f150135V = 108705909;

    /* renamed from: W */
    public static final IAutoDBItem.MAutoDBInfo f150136W = initAutoDBInfo(C53354z6.class);

    /* renamed from: X */
    public static final StorageObserverOwner<C53354z6> f150137X = new StorageObserverOwner<>();

    /* renamed from: z */
    public static final SingleTable f150138z;

    /* renamed from: d */
    public boolean f150139d = true;

    /* renamed from: e */
    public boolean f150140e = true;

    /* renamed from: f */
    public boolean f150141f = true;
    public String field_bigHeadImg;
    public int field_checkTime;
    public String field_customInfoDetail;
    public int field_customInfoDetailVisible;
    public String field_finderUsername;
    public boolean field_hasSetReport;
    public String field_kfUrl;
    public String field_locationType;
    public boolean field_needReport;
    public String field_nickname;
    public String field_nicknamePyInit;
    public String field_nicknamePyQuanPin;
    public String field_openImAppId;
    public String field_openImDescWordingId;
    public String field_smallHeadImg;
    public int field_source;
    public String field_ticket;
    public long field_type;
    public String field_username;

    /* renamed from: g */
    public boolean f150142g = true;

    /* renamed from: h */
    public boolean f150143h = true;

    /* renamed from: i */
    public boolean f150144i = true;

    /* renamed from: j */
    public boolean f150145j = true;

    /* renamed from: n */
    public boolean f150146n = true;

    /* renamed from: o */
    public boolean f150147o = true;

    /* renamed from: p */
    public boolean f150148p = true;

    /* renamed from: q */
    public boolean f150149q = true;

    /* renamed from: r */
    public boolean f150150r = true;

    /* renamed from: s */
    public boolean f150151s = true;

    /* renamed from: t */
    public boolean f150152t = true;

    /* renamed from: u */
    public boolean f150153u = true;

    /* renamed from: v */
    public boolean f150154v = true;

    /* renamed from: w */
    public boolean f150155w = true;

    /* renamed from: x */
    public boolean f150156x = true;

    /* renamed from: y */
    public boolean f150157y = true;

    static {
        SingleTable singleTable = new SingleTable("OpenIMKefuContact");
        f150138z = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("bigHeadImg", "string", singleTable.getName(), "");
        new Column("smallHeadImg", "string", singleTable.getName(), "");
        new Column("nicknamePyInit", "string", singleTable.getName(), "");
        new Column("nicknamePyQuanPin", "string", singleTable.getName(), "");
        new Column("openImAppId", "string", singleTable.getName(), "");
        new Column("openImDescWordingId", "string", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.SOURCE, "int", singleTable.getName(), "");
        new Column("checkTime", "int", singleTable.getName(), "");
        new Column("customInfoDetailVisible", "int", singleTable.getName(), "");
        new Column("customInfoDetail", "string", singleTable.getName(), "");
        new Column("ticket", "string", singleTable.getName(), "");
        new Column("type", "long", singleTable.getName(), "");
        new Column("finderUsername", "string", singleTable.getName(), "");
        new Column("kfUrl", "string", singleTable.getName(), "");
        new Column("hasSetReport", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("needReport", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("locationType", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[19];
        String[] strArr = new String[20];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "bigHeadImg";
        mAutoDBInfo.colsMap.put("bigHeadImg", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "smallHeadImg";
        mAutoDBInfo.colsMap.put("smallHeadImg", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "nicknamePyInit";
        mAutoDBInfo.colsMap.put("nicknamePyInit", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "nicknamePyQuanPin";
        mAutoDBInfo.colsMap.put("nicknamePyQuanPin", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "openImAppId";
        mAutoDBInfo.colsMap.put("openImAppId", "TEXT default '' ");
        mAutoDBInfo.columns[7] = "openImDescWordingId";
        mAutoDBInfo.colsMap.put("openImDescWordingId", "TEXT default '' ");
        mAutoDBInfo.columns[8] = FirebaseAnalytics.C113379b.SOURCE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.SOURCE, "INTEGER default '' ");
        mAutoDBInfo.columns[9] = "checkTime";
        mAutoDBInfo.colsMap.put("checkTime", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "customInfoDetailVisible";
        mAutoDBInfo.colsMap.put("customInfoDetailVisible", "INTEGER");
        mAutoDBInfo.columns[11] = "customInfoDetail";
        mAutoDBInfo.colsMap.put("customInfoDetail", "TEXT");
        mAutoDBInfo.columns[12] = "ticket";
        mAutoDBInfo.colsMap.put("ticket", "TEXT");
        mAutoDBInfo.columns[13] = "type";
        mAutoDBInfo.colsMap.put("type", "LONG default '0' ");
        mAutoDBInfo.columns[14] = "finderUsername";
        mAutoDBInfo.colsMap.put("finderUsername", "TEXT default '' ");
        mAutoDBInfo.columns[15] = "kfUrl";
        mAutoDBInfo.colsMap.put("kfUrl", "TEXT default '' ");
        mAutoDBInfo.columns[16] = "hasSetReport";
        mAutoDBInfo.colsMap.put("hasSetReport", "INTEGER default 'false' ");
        mAutoDBInfo.columns[17] = "needReport";
        mAutoDBInfo.colsMap.put("needReport", "INTEGER default 'false' ");
        mAutoDBInfo.columns[18] = "locationType";
        mAutoDBInfo.colsMap.put("locationType", "TEXT default 'Wsg84' ");
        mAutoDBInfo.columns[19] = "rowid";
        mAutoDBInfo.sql = " username TEXT default ''  PRIMARY KEY ,  nickname TEXT default '' ,  bigHeadImg TEXT default '' ,  smallHeadImg TEXT default '' ,  nicknamePyInit TEXT default '' ,  nicknamePyQuanPin TEXT default '' ,  openImAppId TEXT default '' ,  openImDescWordingId TEXT default '' ,  source INTEGER default '' ,  checkTime INTEGER default '0' ,  customInfoDetailVisible INTEGER,  customInfoDetail TEXT,  ticket TEXT,  type LONG default '0' ,  finderUsername TEXT default '' ,  kfUrl TEXT default '' ,  hasSetReport INTEGER default 'false' ,  needReport INTEGER default 'false' ,  locationType TEXT default 'Wsg84' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53354z6)) {
            return false;
        }
        C53354z6 z6Var = (C53354z6) iAutoDBItem;
        return C46238a.m51546a(this.field_username, z6Var.field_username) && C46238a.m51546a(this.field_nickname, z6Var.field_nickname) && C46238a.m51546a(this.field_bigHeadImg, z6Var.field_bigHeadImg) && C46238a.m51546a(this.field_smallHeadImg, z6Var.field_smallHeadImg) && C46238a.m51546a(this.field_nicknamePyInit, z6Var.field_nicknamePyInit) && C46238a.m51546a(this.field_nicknamePyQuanPin, z6Var.field_nicknamePyQuanPin) && C46238a.m51546a(this.field_openImAppId, z6Var.field_openImAppId) && C46238a.m51546a(this.field_openImDescWordingId, z6Var.field_openImDescWordingId) && C46238a.m51546a(Integer.valueOf(this.field_source), Integer.valueOf(z6Var.field_source)) && C46238a.m51546a(Integer.valueOf(this.field_checkTime), Integer.valueOf(z6Var.field_checkTime)) && C46238a.m51546a(Integer.valueOf(this.field_customInfoDetailVisible), Integer.valueOf(z6Var.field_customInfoDetailVisible)) && C46238a.m51546a(this.field_customInfoDetail, z6Var.field_customInfoDetail) && C46238a.m51546a(this.field_ticket, z6Var.field_ticket) && C46238a.m51546a(Long.valueOf(this.field_type), Long.valueOf(z6Var.field_type)) && C46238a.m51546a(this.field_finderUsername, z6Var.field_finderUsername) && C46238a.m51546a(this.field_kfUrl, z6Var.field_kfUrl) && C46238a.m51546a(Boolean.valueOf(this.field_hasSetReport), Boolean.valueOf(z6Var.field_hasSetReport)) && C46238a.m51546a(Boolean.valueOf(this.field_needReport), Boolean.valueOf(z6Var.field_needReport)) && C46238a.m51546a(this.field_locationType, z6Var.field_locationType);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f150116B == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f150139d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150117C == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150118D == hashCode) {
                    try {
                        this.field_bigHeadImg = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150119E == hashCode) {
                    try {
                        this.field_smallHeadImg = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150120F == hashCode) {
                    try {
                        this.field_nicknamePyInit = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150121G == hashCode) {
                    try {
                        this.field_nicknamePyQuanPin = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150122H == hashCode) {
                    try {
                        this.field_openImAppId = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150123I == hashCode) {
                    try {
                        this.field_openImDescWordingId = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150124J == hashCode) {
                    try {
                        this.field_source = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150125K == hashCode) {
                    try {
                        this.field_checkTime = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150126L == hashCode) {
                    try {
                        this.field_customInfoDetailVisible = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150127M == hashCode) {
                    try {
                        this.field_customInfoDetail = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150128N == hashCode) {
                    try {
                        this.field_ticket = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150129P == hashCode) {
                    try {
                        this.field_type = cursor.getLong(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150130Q == hashCode) {
                    try {
                        this.field_finderUsername = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150131R == hashCode) {
                    try {
                        this.field_kfUrl = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150132S == hashCode) {
                    try {
                        this.field_hasSetReport = cursor.getInt(i) != 0;
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150133T == hashCode) {
                    try {
                        this.field_needReport = cursor.getInt(i) != 0;
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150134U == hashCode) {
                    try {
                        this.field_locationType = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMKefuContact", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150135V == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f150139d) {
            contentValues.put("username", this.field_username);
        }
        if (this.field_nickname == null) {
            this.field_nickname = "";
        }
        if (this.f150140e) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.field_bigHeadImg == null) {
            this.field_bigHeadImg = "";
        }
        if (this.f150141f) {
            contentValues.put("bigHeadImg", this.field_bigHeadImg);
        }
        if (this.field_smallHeadImg == null) {
            this.field_smallHeadImg = "";
        }
        if (this.f150142g) {
            contentValues.put("smallHeadImg", this.field_smallHeadImg);
        }
        if (this.field_nicknamePyInit == null) {
            this.field_nicknamePyInit = "";
        }
        if (this.f150143h) {
            contentValues.put("nicknamePyInit", this.field_nicknamePyInit);
        }
        if (this.field_nicknamePyQuanPin == null) {
            this.field_nicknamePyQuanPin = "";
        }
        if (this.f150144i) {
            contentValues.put("nicknamePyQuanPin", this.field_nicknamePyQuanPin);
        }
        if (this.field_openImAppId == null) {
            this.field_openImAppId = "";
        }
        if (this.f150145j) {
            contentValues.put("openImAppId", this.field_openImAppId);
        }
        if (this.field_openImDescWordingId == null) {
            this.field_openImDescWordingId = "";
        }
        if (this.f150146n) {
            contentValues.put("openImDescWordingId", this.field_openImDescWordingId);
        }
        if (this.f150147o) {
            contentValues.put(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(this.field_source));
        }
        if (this.f150148p) {
            contentValues.put("checkTime", Integer.valueOf(this.field_checkTime));
        }
        if (this.f150149q) {
            contentValues.put("customInfoDetailVisible", Integer.valueOf(this.field_customInfoDetailVisible));
        }
        if (this.f150150r) {
            contentValues.put("customInfoDetail", this.field_customInfoDetail);
        }
        if (this.f150151s) {
            contentValues.put("ticket", this.field_ticket);
        }
        if (this.f150152t) {
            contentValues.put("type", Long.valueOf(this.field_type));
        }
        if (this.field_finderUsername == null) {
            this.field_finderUsername = "";
        }
        if (this.f150153u) {
            contentValues.put("finderUsername", this.field_finderUsername);
        }
        if (this.field_kfUrl == null) {
            this.field_kfUrl = "";
        }
        if (this.f150154v) {
            contentValues.put("kfUrl", this.field_kfUrl);
        }
        if (this.f150155w) {
            if (this.field_hasSetReport) {
                contentValues.put("hasSetReport", 1);
            } else {
                contentValues.put("hasSetReport", 0);
            }
        }
        if (this.f150156x) {
            if (this.field_needReport) {
                contentValues.put("needReport", 1);
            } else {
                contentValues.put("needReport", 0);
            }
        }
        if (this.field_locationType == null) {
            this.field_locationType = "Wsg84";
        }
        if (this.f150157y) {
            contentValues.put("locationType", this.field_locationType);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseOpenIMKefuContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OpenIMKefuContact ( " + f150136W.sql + ");");
        for (String add : f150115A) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMKefuContact", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OpenIMKefuContact", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f150136W, "OpenIMKefuContact", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMKefuContact", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OpenIMKefuContact", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOpenIMKefuContact", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f150136W;
    }

    public String[] getIndexCreateSQL() {
        return f150115A;
    }

    public StorageObserverOwner<C53354z6> getObserverOwner() {
        return f150137X;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f150138z;
    }

    public String getTableName() {
        return f150138z.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "username", this.field_username);
            C46238a.m51547b(jSONObject, "nickname", this.field_nickname);
            C46238a.m51547b(jSONObject, "bigHeadImg", this.field_bigHeadImg);
            C46238a.m51547b(jSONObject, "smallHeadImg", this.field_smallHeadImg);
            C46238a.m51547b(jSONObject, "nicknamePyInit", this.field_nicknamePyInit);
            C46238a.m51547b(jSONObject, "nicknamePyQuanPin", this.field_nicknamePyQuanPin);
            C46238a.m51547b(jSONObject, "openImAppId", this.field_openImAppId);
            C46238a.m51547b(jSONObject, "openImDescWordingId", this.field_openImDescWordingId);
            C46238a.m51547b(jSONObject, FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(this.field_source));
            C46238a.m51547b(jSONObject, "checkTime", Integer.valueOf(this.field_checkTime));
            C46238a.m51547b(jSONObject, "customInfoDetailVisible", Integer.valueOf(this.field_customInfoDetailVisible));
            C46238a.m51547b(jSONObject, "customInfoDetail", this.field_customInfoDetail);
            C46238a.m51547b(jSONObject, "ticket", this.field_ticket);
            C46238a.m51547b(jSONObject, "type", Long.valueOf(this.field_type));
            C46238a.m51547b(jSONObject, "finderUsername", this.field_finderUsername);
            C46238a.m51547b(jSONObject, "kfUrl", this.field_kfUrl);
            C46238a.m51547b(jSONObject, "hasSetReport", Boolean.valueOf(this.field_hasSetReport));
            C46238a.m51547b(jSONObject, "needReport", Boolean.valueOf(this.field_needReport));
            C46238a.m51547b(jSONObject, "locationType", this.field_locationType);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f150139d = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f150140e = true;
            }
        }
        if (contentValues.containsKey("bigHeadImg")) {
            this.field_bigHeadImg = contentValues.getAsString("bigHeadImg");
            if (z) {
                this.f150141f = true;
            }
        }
        if (contentValues.containsKey("smallHeadImg")) {
            this.field_smallHeadImg = contentValues.getAsString("smallHeadImg");
            if (z) {
                this.f150142g = true;
            }
        }
        if (contentValues.containsKey("nicknamePyInit")) {
            this.field_nicknamePyInit = contentValues.getAsString("nicknamePyInit");
            if (z) {
                this.f150143h = true;
            }
        }
        if (contentValues.containsKey("nicknamePyQuanPin")) {
            this.field_nicknamePyQuanPin = contentValues.getAsString("nicknamePyQuanPin");
            if (z) {
                this.f150144i = true;
            }
        }
        if (contentValues.containsKey("openImAppId")) {
            this.field_openImAppId = contentValues.getAsString("openImAppId");
            if (z) {
                this.f150145j = true;
            }
        }
        if (contentValues.containsKey("openImDescWordingId")) {
            this.field_openImDescWordingId = contentValues.getAsString("openImDescWordingId");
            if (z) {
                this.f150146n = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.SOURCE)) {
            this.field_source = contentValues.getAsInteger(FirebaseAnalytics.C113379b.SOURCE).intValue();
            if (z) {
                this.f150147o = true;
            }
        }
        if (contentValues.containsKey("checkTime")) {
            this.field_checkTime = contentValues.getAsInteger("checkTime").intValue();
            if (z) {
                this.f150148p = true;
            }
        }
        if (contentValues.containsKey("customInfoDetailVisible")) {
            this.field_customInfoDetailVisible = contentValues.getAsInteger("customInfoDetailVisible").intValue();
            if (z) {
                this.f150149q = true;
            }
        }
        if (contentValues.containsKey("customInfoDetail")) {
            this.field_customInfoDetail = contentValues.getAsString("customInfoDetail");
            if (z) {
                this.f150150r = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.field_ticket = contentValues.getAsString("ticket");
            if (z) {
                this.f150151s = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsLong("type").longValue();
            if (z) {
                this.f150152t = true;
            }
        }
        if (contentValues.containsKey("finderUsername")) {
            this.field_finderUsername = contentValues.getAsString("finderUsername");
            if (z) {
                this.f150153u = true;
            }
        }
        if (contentValues.containsKey("kfUrl")) {
            this.field_kfUrl = contentValues.getAsString("kfUrl");
            if (z) {
                this.f150154v = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("hasSetReport")) {
            this.field_hasSetReport = contentValues.getAsInteger("hasSetReport").intValue() != 0;
            if (z) {
                this.f150155w = true;
            }
        }
        if (contentValues.containsKey("needReport")) {
            if (contentValues.getAsInteger("needReport").intValue() != 0) {
                z2 = true;
            }
            this.field_needReport = z2;
            if (z) {
                this.f150156x = true;
            }
        }
        if (contentValues.containsKey("locationType")) {
            this.field_locationType = contentValues.getAsString("locationType");
            if (z) {
                this.f150157y = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
