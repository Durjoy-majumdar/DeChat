package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.z4 */
public class C53353z4 extends IAutoDBItem {

    /* renamed from: L */
    public static final SingleTable f150065L;

    /* renamed from: M */
    public static final String[] f150066M = new String[0];

    /* renamed from: N */
    public static final int f150067N = 1109191153;

    /* renamed from: P */
    public static final int f150068P = -787472718;

    /* renamed from: Q */
    public static final int f150069Q = 107855;

    /* renamed from: Q0 */
    public static final IAutoDBItem.MAutoDBInfo f150070Q0 = initAutoDBInfo(C53353z4.class);

    /* renamed from: R */
    public static final int f150071R = 781190832;

    /* renamed from: R0 */
    public static final StorageObserverOwner<C53353z4> f150072R0 = new StorageObserverOwner<>();

    /* renamed from: S */
    public static final int f150073S = -598161892;

    /* renamed from: T */
    public static final int f150074T = -1539519809;

    /* renamed from: U */
    public static final int f150075U = -1255248501;

    /* renamed from: V */
    public static final int f150076V = -1080375341;

    /* renamed from: W */
    public static final int f150077W = -646543465;

    /* renamed from: X */
    public static final int f150078X = 116079;

    /* renamed from: Y */
    public static final int f150079Y = 1661834217;

    /* renamed from: Z */
    public static final int f150080Z = 1661826045;

    /* renamed from: p0 */
    public static final int f150081p0 = -646551637;

    /* renamed from: x0 */
    public static final int f150082x0 = -486944182;

    /* renamed from: y0 */
    public static final int f150083y0 = 108705909;

    /* renamed from: A */
    public String f150084A;

    /* renamed from: B */
    public String f150085B;

    /* renamed from: C */
    public String f150086C;

    /* renamed from: D */
    public String f150087D;

    /* renamed from: E */
    public int f150088E;

    /* renamed from: F */
    public int f150089F;

    /* renamed from: G */
    public long f150090G;

    /* renamed from: H */
    public String f150091H;

    /* renamed from: I */
    public String f150092I;

    /* renamed from: J */
    public String f150093J;

    /* renamed from: K */
    public String f150094K;

    /* renamed from: d */
    public boolean f150095d = true;

    /* renamed from: e */
    public boolean f150096e = true;

    /* renamed from: f */
    public boolean f150097f = true;
    public byte[] field_authBuf;
    public String field_authKey;
    public String field_brandName;
    public int field_closeStrategy;
    public String field_connProto;
    public int field_connStrategy;
    public String field_deviceID;
    public String field_deviceType;
    public byte[] field_lvbuffer;
    public long field_mac;
    public String field_md5Str;
    public byte[] field_sessionBuf;
    public byte[] field_sessionKey;
    public String field_url;

    /* renamed from: g */
    public boolean f150098g = true;

    /* renamed from: h */
    public boolean f150099h = true;

    /* renamed from: i */
    public boolean f150100i = true;

    /* renamed from: j */
    public boolean f150101j = true;

    /* renamed from: n */
    public boolean f150102n = true;

    /* renamed from: o */
    public boolean f150103o = true;

    /* renamed from: p */
    public boolean f150104p = true;

    /* renamed from: q */
    public boolean f150105q = true;

    /* renamed from: r */
    public boolean f150106r = true;

    /* renamed from: s */
    public boolean f150107s = true;

    /* renamed from: t */
    public boolean f150108t = true;

    /* renamed from: u */
    public int f150109u;

    /* renamed from: v */
    public int f150110v;

    /* renamed from: w */
    public long f150111w;

    /* renamed from: x */
    public long f150112x;

    /* renamed from: y */
    public String f150113y;

    /* renamed from: z */
    public String f150114z;

    static {
        SingleTable singleTable = new SingleTable("HardDeviceInfo");
        f150065L = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("deviceID", "string", singleTable.getName(), "");
        new Column("brandName", "string", singleTable.getName(), "");
        new Column(TPDownloadProxyEnum.USER_MAC, "long", singleTable.getName(), "");
        new Column("deviceType", "string", singleTable.getName(), "");
        new Column("connProto", "string", singleTable.getName(), "");
        new Column("connStrategy", "int", singleTable.getName(), "");
        new Column("closeStrategy", "int", singleTable.getName(), "");
        new Column("md5Str", "string", singleTable.getName(), "");
        new Column("authKey", "string", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("sessionKey", "byte[]", singleTable.getName(), "");
        new Column("sessionBuf", "byte[]", singleTable.getName(), "");
        new Column("authBuf", "byte[]", singleTable.getName(), "");
        new Column("lvbuffer", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[14];
        String[] strArr = new String[15];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "deviceID";
        mAutoDBInfo.colsMap.put("deviceID", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "deviceID";
        mAutoDBInfo.columns[1] = "brandName";
        mAutoDBInfo.colsMap.put("brandName", "TEXT");
        mAutoDBInfo.columns[2] = TPDownloadProxyEnum.USER_MAC;
        mAutoDBInfo.colsMap.put(TPDownloadProxyEnum.USER_MAC, "LONG");
        mAutoDBInfo.columns[3] = "deviceType";
        mAutoDBInfo.colsMap.put("deviceType", "TEXT");
        mAutoDBInfo.columns[4] = "connProto";
        mAutoDBInfo.colsMap.put("connProto", "TEXT");
        mAutoDBInfo.columns[5] = "connStrategy";
        mAutoDBInfo.colsMap.put("connStrategy", "INTEGER");
        mAutoDBInfo.columns[6] = "closeStrategy";
        mAutoDBInfo.colsMap.put("closeStrategy", "INTEGER");
        mAutoDBInfo.columns[7] = "md5Str";
        mAutoDBInfo.colsMap.put("md5Str", "TEXT");
        mAutoDBInfo.columns[8] = "authKey";
        mAutoDBInfo.colsMap.put("authKey", "TEXT");
        mAutoDBInfo.columns[9] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[10] = "sessionKey";
        mAutoDBInfo.colsMap.put("sessionKey", "BLOB");
        mAutoDBInfo.columns[11] = "sessionBuf";
        mAutoDBInfo.colsMap.put("sessionBuf", "BLOB");
        mAutoDBInfo.columns[12] = "authBuf";
        mAutoDBInfo.colsMap.put("authBuf", "BLOB");
        mAutoDBInfo.columns[13] = "lvbuffer";
        mAutoDBInfo.colsMap.put("lvbuffer", "BLOB");
        mAutoDBInfo.columns[14] = "rowid";
        mAutoDBInfo.sql = " deviceID TEXT PRIMARY KEY ,  brandName TEXT,  mac LONG,  deviceType TEXT,  connProto TEXT,  connStrategy INTEGER,  closeStrategy INTEGER,  md5Str TEXT,  authKey TEXT,  url TEXT,  sessionKey BLOB,  sessionBuf BLOB,  authBuf BLOB,  lvbuffer BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53353z4)) {
            return false;
        }
        C53353z4 z4Var = (C53353z4) iAutoDBItem;
        return C46238a.m51546a(this.field_deviceID, z4Var.field_deviceID) && C46238a.m51546a(this.field_brandName, z4Var.field_brandName) && C46238a.m51546a(Long.valueOf(this.field_mac), Long.valueOf(z4Var.field_mac)) && C46238a.m51546a(this.field_deviceType, z4Var.field_deviceType) && C46238a.m51546a(this.field_connProto, z4Var.field_connProto) && C46238a.m51546a(Integer.valueOf(this.field_connStrategy), Integer.valueOf(z4Var.field_connStrategy)) && C46238a.m51546a(Integer.valueOf(this.field_closeStrategy), Integer.valueOf(z4Var.field_closeStrategy)) && C46238a.m51546a(this.field_md5Str, z4Var.field_md5Str) && C46238a.m51546a(this.field_authKey, z4Var.field_authKey) && C46238a.m51546a(this.field_url, z4Var.field_url) && C46238a.m51546a(this.field_sessionKey, z4Var.field_sessionKey) && C46238a.m51546a(this.field_sessionBuf, z4Var.field_sessionBuf) && C46238a.m51546a(this.field_authBuf, z4Var.field_authBuf) && C46238a.m51546a(this.field_lvbuffer, z4Var.field_lvbuffer);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f150067N == hashCode) {
                    try {
                        this.field_deviceID = cursor.getString(i);
                        this.f150095d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150068P == hashCode) {
                    try {
                        this.field_brandName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150069Q == hashCode) {
                    try {
                        this.field_mac = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150071R == hashCode) {
                    try {
                        this.field_deviceType = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150073S == hashCode) {
                    try {
                        this.field_connProto = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150074T == hashCode) {
                    try {
                        this.field_connStrategy = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150075U == hashCode) {
                    try {
                        this.field_closeStrategy = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150076V == hashCode) {
                    try {
                        this.field_md5Str = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150077W == hashCode) {
                    try {
                        this.field_authKey = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150078X == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150079Y == hashCode) {
                    try {
                        this.field_sessionKey = cursor.getBlob(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150080Z == hashCode) {
                    try {
                        this.field_sessionBuf = cursor.getBlob(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150081p0 == hashCode) {
                    try {
                        this.field_authBuf = cursor.getBlob(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150082x0 == hashCode) {
                    try {
                        this.field_lvbuffer = cursor.getBlob(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150083y0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
            try {
                byte[] bArr = this.field_lvbuffer;
                if (bArr == null) {
                    return;
                }
                if (bArr.length != 0) {
                    LVBuffer lVBuffer = new LVBuffer();
                    int initParse = lVBuffer.initParse(this.field_lvbuffer);
                    if (initParse != 0) {
                        Log.m105920e("MicroMsg.SDK.BaseHardDeviceInfo", "parse LVBuffer error:" + initParse);
                        return;
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150109u = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150110v = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150111w = lVBuffer.getLong();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150112x = lVBuffer.getLong();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150113y = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150114z = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150084A = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150085B = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150086C = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150087D = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150088E = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150089F = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150090G = lVBuffer.getLong();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150091H = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150092I = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150093J = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f150094K = lVBuffer.getString();
                    }
                }
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.SDK.BaseHardDeviceInfo", "get value failed");
            }
        }
    }

    public ContentValues convertTo() {
        try {
            if (this.f150108t) {
                LVBuffer lVBuffer = new LVBuffer();
                lVBuffer.initBuild();
                lVBuffer.putInt(this.f150109u);
                lVBuffer.putInt(this.f150110v);
                lVBuffer.putLong(this.f150111w);
                lVBuffer.putLong(this.f150112x);
                lVBuffer.putString(this.f150113y);
                lVBuffer.putString(this.f150114z);
                lVBuffer.putString(this.f150084A);
                lVBuffer.putString(this.f150085B);
                lVBuffer.putString(this.f150086C);
                lVBuffer.putString(this.f150087D);
                lVBuffer.putInt(this.f150088E);
                lVBuffer.putInt(this.f150089F);
                lVBuffer.putLong(this.f150090G);
                lVBuffer.putString(this.f150091H);
                lVBuffer.putString(this.f150092I);
                lVBuffer.putString(this.f150093J);
                lVBuffer.putString(this.f150094K);
                this.field_lvbuffer = lVBuffer.buildFinish();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SDK.BaseHardDeviceInfo", "get value failed, %s", e.getMessage());
        }
        ContentValues contentValues = new ContentValues();
        if (this.f150095d) {
            contentValues.put("deviceID", this.field_deviceID);
        }
        if (this.f150096e) {
            contentValues.put("brandName", this.field_brandName);
        }
        if (this.f150097f) {
            contentValues.put(TPDownloadProxyEnum.USER_MAC, Long.valueOf(this.field_mac));
        }
        if (this.f150098g) {
            contentValues.put("deviceType", this.field_deviceType);
        }
        if (this.f150099h) {
            contentValues.put("connProto", this.field_connProto);
        }
        if (this.f150100i) {
            contentValues.put("connStrategy", Integer.valueOf(this.field_connStrategy));
        }
        if (this.f150101j) {
            contentValues.put("closeStrategy", Integer.valueOf(this.field_closeStrategy));
        }
        if (this.f150102n) {
            contentValues.put("md5Str", this.field_md5Str);
        }
        if (this.f150103o) {
            contentValues.put("authKey", this.field_authKey);
        }
        if (this.f150104p) {
            contentValues.put("url", this.field_url);
        }
        if (this.f150105q) {
            contentValues.put("sessionKey", this.field_sessionKey);
        }
        if (this.f150106r) {
            contentValues.put("sessionBuf", this.field_sessionBuf);
        }
        if (this.f150107s) {
            contentValues.put("authBuf", this.field_authBuf);
        }
        if (this.f150108t) {
            contentValues.put("lvbuffer", this.field_lvbuffer);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseHardDeviceInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS HardDeviceInfo ( " + f150070Q0.sql + ");");
        for (String add : f150066M) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("HardDeviceInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f150070Q0, "HardDeviceInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("HardDeviceInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseHardDeviceInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f150070Q0;
    }

    public String[] getIndexCreateSQL() {
        return f150066M;
    }

    public StorageObserverOwner<C53353z4> getObserverOwner() {
        return f150072R0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_deviceID;
    }

    public SingleTable getTable() {
        return f150065L;
    }

    public String getTableName() {
        return f150065L.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("deviceID")) {
            this.field_deviceID = contentValues.getAsString("deviceID");
            if (z) {
                this.f150095d = true;
            }
        }
        if (contentValues.containsKey("brandName")) {
            this.field_brandName = contentValues.getAsString("brandName");
            if (z) {
                this.f150096e = true;
            }
        }
        if (contentValues.containsKey(TPDownloadProxyEnum.USER_MAC)) {
            this.field_mac = contentValues.getAsLong(TPDownloadProxyEnum.USER_MAC).longValue();
            if (z) {
                this.f150097f = true;
            }
        }
        if (contentValues.containsKey("deviceType")) {
            this.field_deviceType = contentValues.getAsString("deviceType");
            if (z) {
                this.f150098g = true;
            }
        }
        if (contentValues.containsKey("connProto")) {
            this.field_connProto = contentValues.getAsString("connProto");
            if (z) {
                this.f150099h = true;
            }
        }
        if (contentValues.containsKey("connStrategy")) {
            this.field_connStrategy = contentValues.getAsInteger("connStrategy").intValue();
            if (z) {
                this.f150100i = true;
            }
        }
        if (contentValues.containsKey("closeStrategy")) {
            this.field_closeStrategy = contentValues.getAsInteger("closeStrategy").intValue();
            if (z) {
                this.f150101j = true;
            }
        }
        if (contentValues.containsKey("md5Str")) {
            this.field_md5Str = contentValues.getAsString("md5Str");
            if (z) {
                this.f150102n = true;
            }
        }
        if (contentValues.containsKey("authKey")) {
            this.field_authKey = contentValues.getAsString("authKey");
            if (z) {
                this.f150103o = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f150104p = true;
            }
        }
        if (contentValues.containsKey("sessionKey")) {
            this.field_sessionKey = contentValues.getAsByteArray("sessionKey");
            if (z) {
                this.f150105q = true;
            }
        }
        if (contentValues.containsKey("sessionBuf")) {
            this.field_sessionBuf = contentValues.getAsByteArray("sessionBuf");
            if (z) {
                this.f150106r = true;
            }
        }
        if (contentValues.containsKey("authBuf")) {
            this.field_authBuf = contentValues.getAsByteArray("authBuf");
            if (z) {
                this.f150107s = true;
            }
        }
        if (contentValues.containsKey("lvbuffer")) {
            this.field_lvbuffer = contentValues.getAsByteArray("lvbuffer");
            if (z) {
                this.f150108t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
