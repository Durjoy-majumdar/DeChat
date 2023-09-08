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
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import org.json.JSONObject;

/* renamed from: xh.n2 */
public class C102657n2 extends IAutoDBItem {

    /* renamed from: A */
    public static final Column f302679A;

    /* renamed from: B */
    public static final String[] f302680B = {"CREATE INDEX IF NOT EXISTS FavCdnTransferInfo_LocalId ON FavCdnInfo(favLocalId)", "CREATE INDEX IF NOT EXISTS FavCDNInfo_modifyTime_Index ON FavCdnInfo(modifyTime)"};

    /* renamed from: C */
    public static final int f302681C = -1338919323;

    /* renamed from: D */
    public static final int f302682D = -597679541;

    /* renamed from: E */
    public static final int f302683E = 3575610;

    /* renamed from: F */
    public static final int f302684F = -1364966910;

    /* renamed from: G */
    public static final int f302685G = -1364976910;

    /* renamed from: H */
    public static final int f302686H = -849913807;

    /* renamed from: I */
    public static final int f302687I = -1019779949;

    /* renamed from: J */
    public static final int f302688J = -892481550;

    /* renamed from: K */
    public static final int f302689K = 3433509;

    /* renamed from: L */
    public static final int f302690L = 1789070852;

    /* renamed from: M */
    public static final int f302691M = 1211388583;

    /* renamed from: N */
    public static final int f302692N = -1306589907;

    /* renamed from: P */
    public static final int f302693P = 553577725;

    /* renamed from: Q */
    public static final int f302694Q = -1006873195;

    /* renamed from: R */
    public static final int f302695R = 108705909;

    /* renamed from: S */
    public static final IAutoDBItem.MAutoDBInfo f302696S = initAutoDBInfo(C102657n2.class);

    /* renamed from: T */
    public static final StorageObserverOwner<C102657n2> f302697T = new StorageObserverOwner<>();

    /* renamed from: u */
    public static final SingleTable f302698u;

    /* renamed from: v */
    public static final Column f302699v;

    /* renamed from: w */
    public static final Column f302700w;

    /* renamed from: x */
    public static final Column f302701x;

    /* renamed from: y */
    public static final Column f302702y;

    /* renamed from: z */
    public static final Column f302703z;

    /* renamed from: d */
    public boolean f302704d = true;

    /* renamed from: e */
    public boolean f302705e = true;

    /* renamed from: f */
    public boolean f302706f = true;
    public long field_attrFlag;
    public String field_cdnKey;
    public String field_cdnUrl;
    public String field_dataId;
    public int field_dataType;
    public int field_extFlag;
    public long field_favLocalId;
    public long field_modifyTime;
    public int field_offset;
    public String field_path;
    public int field_retryTime;
    public int field_status;
    public int field_totalLen;
    public int field_type;

    /* renamed from: g */
    public boolean f302707g = true;

    /* renamed from: h */
    public boolean f302708h = true;

    /* renamed from: i */
    public boolean f302709i = true;

    /* renamed from: j */
    public boolean f302710j = true;

    /* renamed from: n */
    public boolean f302711n = true;

    /* renamed from: o */
    public boolean f302712o = true;

    /* renamed from: p */
    public boolean f302713p = true;

    /* renamed from: q */
    public boolean f302714q = true;

    /* renamed from: r */
    public boolean f302715r = true;

    /* renamed from: s */
    public boolean f302716s = true;

    /* renamed from: t */
    public boolean f302717t = true;

    static {
        SingleTable singleTable = new SingleTable("FavCdnInfo");
        f302698u = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f302699v = new Column("dataId", "string", singleTable.getName(), "");
        f302700w = new Column("favLocalId", "long", singleTable.getName(), "");
        f302701x = new Column("type", "int", singleTable.getName(), "");
        new Column("cdnUrl", "string", singleTable.getName(), "");
        new Column("cdnKey", "string", singleTable.getName(), "");
        new Column("totalLen", "int", singleTable.getName(), "");
        new Column("offset", "int", singleTable.getName(), "");
        f302702y = new Column("status", "int", singleTable.getName(), "");
        new Column("path", "string", singleTable.getName(), "");
        new Column("dataType", "int", singleTable.getName(), "");
        f302703z = new Column("modifyTime", "long", singleTable.getName(), "");
        new Column("extFlag", "int", singleTable.getName(), "");
        new Column("attrFlag", "long", singleTable.getName(), "");
        f302679A = new Column("retryTime", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[14];
        String[] strArr = new String[15];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "dataId";
        mAutoDBInfo.colsMap.put("dataId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "dataId";
        mAutoDBInfo.columns[1] = "favLocalId";
        mAutoDBInfo.colsMap.put("favLocalId", "LONG");
        mAutoDBInfo.columns[2] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[3] = "cdnUrl";
        mAutoDBInfo.colsMap.put("cdnUrl", "TEXT");
        mAutoDBInfo.columns[4] = "cdnKey";
        mAutoDBInfo.colsMap.put("cdnKey", "TEXT");
        mAutoDBInfo.columns[5] = "totalLen";
        mAutoDBInfo.colsMap.put("totalLen", "INTEGER");
        mAutoDBInfo.columns[6] = "offset";
        mAutoDBInfo.colsMap.put("offset", "INTEGER");
        mAutoDBInfo.columns[7] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[8] = "path";
        mAutoDBInfo.colsMap.put("path", "TEXT");
        mAutoDBInfo.columns[9] = "dataType";
        mAutoDBInfo.colsMap.put("dataType", "INTEGER");
        mAutoDBInfo.columns[10] = "modifyTime";
        mAutoDBInfo.colsMap.put("modifyTime", "LONG default '0' ");
        mAutoDBInfo.columns[11] = "extFlag";
        mAutoDBInfo.colsMap.put("extFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[12] = "attrFlag";
        mAutoDBInfo.colsMap.put("attrFlag", "LONG default '0' ");
        mAutoDBInfo.columns[13] = "retryTime";
        mAutoDBInfo.colsMap.put("retryTime", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "rowid";
        mAutoDBInfo.sql = " dataId TEXT PRIMARY KEY ,  favLocalId LONG,  type INTEGER,  cdnUrl TEXT,  cdnKey TEXT,  totalLen INTEGER,  offset INTEGER,  status INTEGER,  path TEXT,  dataType INTEGER,  modifyTime LONG default '0' ,  extFlag INTEGER default '0' ,  attrFlag LONG default '0' ,  retryTime INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public static final SelectSql m135634l2(String str) {
        return f302698u.selectAll().where(f302699v.equal(str)).log("MicroMsg.SDK.BaseFavCdnInfo").build();
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102657n2)) {
            return false;
        }
        C102657n2 n2Var = (C102657n2) iAutoDBItem;
        return C46238a.m51546a(this.field_dataId, n2Var.field_dataId) && C46238a.m51546a(Long.valueOf(this.field_favLocalId), Long.valueOf(n2Var.field_favLocalId)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(n2Var.field_type)) && C46238a.m51546a(this.field_cdnUrl, n2Var.field_cdnUrl) && C46238a.m51546a(this.field_cdnKey, n2Var.field_cdnKey) && C46238a.m51546a(Integer.valueOf(this.field_totalLen), Integer.valueOf(n2Var.field_totalLen)) && C46238a.m51546a(Integer.valueOf(this.field_offset), Integer.valueOf(n2Var.field_offset)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(n2Var.field_status)) && C46238a.m51546a(this.field_path, n2Var.field_path) && C46238a.m51546a(Integer.valueOf(this.field_dataType), Integer.valueOf(n2Var.field_dataType)) && C46238a.m51546a(Long.valueOf(this.field_modifyTime), Long.valueOf(n2Var.field_modifyTime)) && C46238a.m51546a(Integer.valueOf(this.field_extFlag), Integer.valueOf(n2Var.field_extFlag)) && C46238a.m51546a(Long.valueOf(this.field_attrFlag), Long.valueOf(n2Var.field_attrFlag)) && C46238a.m51546a(Integer.valueOf(this.field_retryTime), Integer.valueOf(n2Var.field_retryTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302681C == hashCode) {
                    try {
                        this.field_dataId = cursor.getString(i);
                        this.f302704d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302682D == hashCode) {
                    try {
                        this.field_favLocalId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302683E == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302684F == hashCode) {
                    try {
                        this.field_cdnUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302685G == hashCode) {
                    try {
                        this.field_cdnKey = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302686H == hashCode) {
                    try {
                        this.field_totalLen = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302687I == hashCode) {
                    try {
                        this.field_offset = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302688J == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302689K == hashCode) {
                    try {
                        this.field_path = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302690L == hashCode) {
                    try {
                        this.field_dataType = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302691M == hashCode) {
                    try {
                        this.field_modifyTime = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302692N == hashCode) {
                    try {
                        this.field_extFlag = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302693P == hashCode) {
                    try {
                        this.field_attrFlag = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302694Q == hashCode) {
                    try {
                        this.field_retryTime = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302695R == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302704d) {
            contentValues.put("dataId", this.field_dataId);
        }
        if (this.f302705e) {
            contentValues.put("favLocalId", Long.valueOf(this.field_favLocalId));
        }
        if (this.f302706f) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f302707g) {
            contentValues.put("cdnUrl", this.field_cdnUrl);
        }
        if (this.f302708h) {
            contentValues.put("cdnKey", this.field_cdnKey);
        }
        if (this.f302709i) {
            contentValues.put("totalLen", Integer.valueOf(this.field_totalLen));
        }
        if (this.f302710j) {
            contentValues.put("offset", Integer.valueOf(this.field_offset));
        }
        if (this.f302711n) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f302712o) {
            contentValues.put("path", this.field_path);
        }
        if (this.f302713p) {
            contentValues.put("dataType", Integer.valueOf(this.field_dataType));
        }
        if (this.f302714q) {
            contentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
        }
        if (this.f302715r) {
            contentValues.put("extFlag", Integer.valueOf(this.field_extFlag));
        }
        if (this.f302716s) {
            contentValues.put("attrFlag", Long.valueOf(this.field_attrFlag));
        }
        if (this.f302717t) {
            contentValues.put("retryTime", Integer.valueOf(this.field_retryTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFavCdnInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FavCdnInfo ( " + f302696S.sql + ");");
        for (String add : f302680B) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFavCdnInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FavCdnInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302696S, "FavCdnInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFavCdnInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FavCdnInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFavCdnInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302696S;
    }

    public String[] getIndexCreateSQL() {
        return f302680B;
    }

    public StorageObserverOwner<C102657n2> getObserverOwner() {
        return f302697T;
    }

    public Object getPrimaryKeyValue() {
        return this.field_dataId;
    }

    public SingleTable getTable() {
        return f302698u;
    }

    public String getTableName() {
        return f302698u.getName();
    }

    /* renamed from: m2 */
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "dataId", this.field_dataId);
            C46238a.m51547b(jSONObject, "favLocalId", Long.valueOf(this.field_favLocalId));
            C46238a.m51547b(jSONObject, "type", Integer.valueOf(this.field_type));
            C46238a.m51547b(jSONObject, "cdnUrl", this.field_cdnUrl);
            C46238a.m51547b(jSONObject, "cdnKey", this.field_cdnKey);
            C46238a.m51547b(jSONObject, "totalLen", Integer.valueOf(this.field_totalLen));
            C46238a.m51547b(jSONObject, "offset", Integer.valueOf(this.field_offset));
            C46238a.m51547b(jSONObject, "status", Integer.valueOf(this.field_status));
            C46238a.m51547b(jSONObject, "path", this.field_path);
            C46238a.m51547b(jSONObject, "dataType", Integer.valueOf(this.field_dataType));
            C46238a.m51547b(jSONObject, "modifyTime", Long.valueOf(this.field_modifyTime));
            C46238a.m51547b(jSONObject, "extFlag", Integer.valueOf(this.field_extFlag));
            C46238a.m51547b(jSONObject, "attrFlag", Long.valueOf(this.field_attrFlag));
            C46238a.m51547b(jSONObject, "retryTime", Integer.valueOf(this.field_retryTime));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("dataId")) {
            this.field_dataId = contentValues.getAsString("dataId");
            if (z) {
                this.f302704d = true;
            }
        }
        if (contentValues.containsKey("favLocalId")) {
            this.field_favLocalId = contentValues.getAsLong("favLocalId").longValue();
            if (z) {
                this.f302705e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f302706f = true;
            }
        }
        if (contentValues.containsKey("cdnUrl")) {
            this.field_cdnUrl = contentValues.getAsString("cdnUrl");
            if (z) {
                this.f302707g = true;
            }
        }
        if (contentValues.containsKey("cdnKey")) {
            this.field_cdnKey = contentValues.getAsString("cdnKey");
            if (z) {
                this.f302708h = true;
            }
        }
        if (contentValues.containsKey("totalLen")) {
            this.field_totalLen = contentValues.getAsInteger("totalLen").intValue();
            if (z) {
                this.f302709i = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsInteger("offset").intValue();
            if (z) {
                this.f302710j = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f302711n = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsString("path");
            if (z) {
                this.f302712o = true;
            }
        }
        if (contentValues.containsKey("dataType")) {
            this.field_dataType = contentValues.getAsInteger("dataType").intValue();
            if (z) {
                this.f302713p = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.field_modifyTime = contentValues.getAsLong("modifyTime").longValue();
            if (z) {
                this.f302714q = true;
            }
        }
        if (contentValues.containsKey("extFlag")) {
            this.field_extFlag = contentValues.getAsInteger("extFlag").intValue();
            if (z) {
                this.f302715r = true;
            }
        }
        if (contentValues.containsKey("attrFlag")) {
            this.field_attrFlag = contentValues.getAsLong("attrFlag").longValue();
            if (z) {
                this.f302716s = true;
            }
        }
        if (contentValues.containsKey("retryTime")) {
            this.field_retryTime = contentValues.getAsInteger("retryTime").intValue();
            if (z) {
                this.f302717t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
