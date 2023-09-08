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
import com.tencent.xweb.internal.ConstValue;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import org.json.JSONObject;

/* renamed from: xh.p2 */
public class C102660p2 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f302852A = -295931082;

    /* renamed from: B */
    public static final int f302853B = 1549531671;

    /* renamed from: C */
    public static final int f302854C = 108705909;

    /* renamed from: D */
    public static final IAutoDBItem.MAutoDBInfo f302855D = initAutoDBInfo(C102660p2.class);

    /* renamed from: E */
    public static final StorageObserverOwner<C102660p2> f302856E = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f302857p;

    /* renamed from: q */
    public static final Column f302858q;

    /* renamed from: r */
    public static final Column f302859r;

    /* renamed from: s */
    public static final String[] f302860s = new String[0];

    /* renamed from: t */
    public static final int f302861t = 97204630;

    /* renamed from: u */
    public static final int f302862u = 1549946232;

    /* renamed from: v */
    public static final int f302863v = -878156794;

    /* renamed from: w */
    public static final int f302864w = -1008634031;

    /* renamed from: x */
    public static final int f302865x = 771880589;

    /* renamed from: y */
    public static final int f302866y = 1549961701;

    /* renamed from: z */
    public static final int f302867z = 1177533677;

    /* renamed from: d */
    public boolean f302868d = false;

    /* renamed from: e */
    public boolean f302869e = false;

    /* renamed from: f */
    public boolean f302870f = false;
    private String field_clientVersion;
    private int field_delFlag;
    private String field_delSource;
    private long field_delTime;
    private int field_delType;
    private int field_favId;
    private int field_itemType;
    private String field_oriXml;
    private long field_updateTime;

    /* renamed from: g */
    public boolean f302871g = false;

    /* renamed from: h */
    public boolean f302872h = false;

    /* renamed from: i */
    public boolean f302873i = false;

    /* renamed from: j */
    public boolean f302874j = false;

    /* renamed from: n */
    public boolean f302875n = false;

    /* renamed from: o */
    public boolean f302876o = false;

    static {
        SingleTable singleTable = new SingleTable("FavDelInfo");
        f302857p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f302858q = new Column("favId", "int", singleTable.getName(), "");
        f302859r = new Column("delTime", "long", singleTable.getName(), "");
        new Column("delSource", "string", singleTable.getName(), "");
        new Column("oriXml", "string", singleTable.getName(), "");
        new Column(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, "string", singleTable.getName(), "");
        new Column("delType", "int", singleTable.getName(), "");
        new Column("itemType", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("delFlag", "int", singleTable.getName(), "");
    }

    public static void createTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFavDelInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FavDelInfo ( " + f302855D.sql + ");");
        for (String add : f302860s) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFavDelInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FavDelInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302855D, "FavDelInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFavDelInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FavDelInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFavDelInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "favId";
        mAutoDBInfo.colsMap.put("favId", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "favId";
        mAutoDBInfo.columns[1] = "delTime";
        mAutoDBInfo.colsMap.put("delTime", "LONG default '0' ");
        mAutoDBInfo.columns[2] = "delSource";
        mAutoDBInfo.colsMap.put("delSource", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "oriXml";
        mAutoDBInfo.colsMap.put("oriXml", "TEXT default '' ");
        mAutoDBInfo.columns[4] = ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION;
        mAutoDBInfo.colsMap.put(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, "TEXT default '' ");
        mAutoDBInfo.columns[5] = "delType";
        mAutoDBInfo.colsMap.put("delType", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "itemType";
        mAutoDBInfo.colsMap.put("itemType", "INTEGER default '0' ");
        mAutoDBInfo.columns[7] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[8] = "delFlag";
        mAutoDBInfo.colsMap.put("delFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " favId INTEGER PRIMARY KEY ,  delTime LONG default '0' ,  delSource TEXT default '' ,  oriXml TEXT default '' ,  clientVersion TEXT default '' ,  delType INTEGER default '0' ,  itemType INTEGER default '0' ,  updateTime LONG default '0' ,  delFlag INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102660p2)) {
            return false;
        }
        C102660p2 p2Var = (C102660p2) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_favId), Integer.valueOf(p2Var.field_favId)) && C46238a.m51546a(Long.valueOf(this.field_delTime), Long.valueOf(p2Var.field_delTime)) && C46238a.m51546a(this.field_delSource, p2Var.field_delSource) && C46238a.m51546a(this.field_oriXml, p2Var.field_oriXml) && C46238a.m51546a(this.field_clientVersion, p2Var.field_clientVersion) && C46238a.m51546a(Integer.valueOf(this.field_delType), Integer.valueOf(p2Var.field_delType)) && C46238a.m51546a(Integer.valueOf(this.field_itemType), Integer.valueOf(p2Var.field_itemType)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(p2Var.field_updateTime)) && C46238a.m51546a(Integer.valueOf(this.field_delFlag), Integer.valueOf(p2Var.field_delFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302861t == hashCode) {
                    try {
                        this.field_favId = cursor.getInt(i);
                        this.f302868d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302862u == hashCode) {
                    try {
                        this.field_delTime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302863v == hashCode) {
                    try {
                        this.field_delSource = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302864w == hashCode) {
                    try {
                        this.field_oriXml = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302865x == hashCode) {
                    try {
                        this.field_clientVersion = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302866y == hashCode) {
                    try {
                        this.field_delType = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302867z == hashCode) {
                    try {
                        this.field_itemType = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302852A == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302853B == hashCode) {
                    try {
                        this.field_delFlag = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302854C == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302868d) {
            contentValues.put("favId", Integer.valueOf(this.field_favId));
        }
        if (this.f302869e) {
            contentValues.put("delTime", Long.valueOf(this.field_delTime));
        }
        if (this.field_delSource == null) {
            this.field_delSource = "";
        }
        if (this.f302870f) {
            contentValues.put("delSource", this.field_delSource);
        }
        if (this.field_oriXml == null) {
            this.field_oriXml = "";
        }
        if (this.f302871g) {
            contentValues.put("oriXml", this.field_oriXml);
        }
        if (this.field_clientVersion == null) {
            this.field_clientVersion = "";
        }
        if (this.f302872h) {
            contentValues.put(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, this.field_clientVersion);
        }
        if (this.f302873i) {
            contentValues.put("delType", Integer.valueOf(this.field_delType));
        }
        if (this.f302874j) {
            contentValues.put("itemType", Integer.valueOf(this.field_itemType));
        }
        if (this.f302875n) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f302876o) {
            contentValues.put("delFlag", Integer.valueOf(this.field_delFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        createTable(iSQLiteDatabase);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302855D;
    }

    public String[] getIndexCreateSQL() {
        return f302860s;
    }

    public StorageObserverOwner<C102660p2> getObserverOwner() {
        return f302856E;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_favId);
    }

    public SingleTable getTable() {
        return f302857p;
    }

    public String getTableName() {
        return f302857p.getName();
    }

    public long getUpdateTime() {
        return this.field_updateTime;
    }

    /* renamed from: l2 */
    public int mo142411l2() {
        return this.field_delFlag;
    }

    /* renamed from: m2 */
    public long mo142412m2() {
        return this.field_delTime;
    }

    /* renamed from: n2 */
    public void mo142413n2(String str) {
        this.field_clientVersion = str;
        this.f302872h = true;
    }

    /* renamed from: o2 */
    public void mo142414o2(int i) {
        this.field_delFlag = i;
        this.f302876o = true;
    }

    /* renamed from: p2 */
    public void mo142415p2(long j) {
        this.field_delTime = j;
        this.f302869e = true;
    }

    /* renamed from: q2 */
    public void mo142416q2(int i) {
        this.field_delType = i;
        this.f302873i = true;
    }

    /* renamed from: r2 */
    public void mo142417r2(int i) {
        this.field_favId = i;
        this.f302868d = true;
    }

    /* renamed from: s2 */
    public void mo142418s2(int i) {
        this.field_itemType = i;
        this.f302874j = true;
    }

    /* renamed from: t2 */
    public void mo142419t2(long j) {
        this.field_updateTime = j;
        this.f302875n = true;
    }

    /* renamed from: u2 */
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "favId", Integer.valueOf(this.field_favId));
            C46238a.m51547b(jSONObject, "delTime", Long.valueOf(this.field_delTime));
            C46238a.m51547b(jSONObject, "delSource", this.field_delSource);
            C46238a.m51547b(jSONObject, "oriXml", this.field_oriXml);
            C46238a.m51547b(jSONObject, ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, this.field_clientVersion);
            C46238a.m51547b(jSONObject, "delType", Integer.valueOf(this.field_delType));
            C46238a.m51547b(jSONObject, "itemType", Integer.valueOf(this.field_itemType));
            C46238a.m51547b(jSONObject, C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
            C46238a.m51547b(jSONObject, "delFlag", Integer.valueOf(this.field_delFlag));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("favId")) {
            this.field_favId = contentValues.getAsInteger("favId").intValue();
            if (z) {
                this.f302868d = true;
            }
        }
        if (contentValues.containsKey("delTime")) {
            this.field_delTime = contentValues.getAsLong("delTime").longValue();
            if (z) {
                this.f302869e = true;
            }
        }
        if (contentValues.containsKey("delSource")) {
            this.field_delSource = contentValues.getAsString("delSource");
            if (z) {
                this.f302870f = true;
            }
        }
        if (contentValues.containsKey("oriXml")) {
            this.field_oriXml = contentValues.getAsString("oriXml");
            if (z) {
                this.f302871g = true;
            }
        }
        if (contentValues.containsKey(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION)) {
            this.field_clientVersion = contentValues.getAsString(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION);
            if (z) {
                this.f302872h = true;
            }
        }
        if (contentValues.containsKey("delType")) {
            this.field_delType = contentValues.getAsInteger("delType").intValue();
            if (z) {
                this.f302873i = true;
            }
        }
        if (contentValues.containsKey("itemType")) {
            this.field_itemType = contentValues.getAsInteger("itemType").intValue();
            if (z) {
                this.f302874j = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f302875n = true;
            }
        }
        if (contentValues.containsKey("delFlag")) {
            this.field_delFlag = contentValues.getAsInteger("delFlag").intValue();
            if (z) {
                this.f302876o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
