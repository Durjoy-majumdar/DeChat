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

/* renamed from: xh.t0 */
public class C38665t0 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103741j;

    /* renamed from: n */
    public static final String[] f103742n = new String[0];

    /* renamed from: o */
    public static final int f103743o = -1010580219;

    /* renamed from: p */
    public static final int f103744p = -63323779;

    /* renamed from: q */
    public static final int f103745q = 1171836076;

    /* renamed from: r */
    public static final int f103746r = 70690926;

    /* renamed from: s */
    public static final int f103747s = -1134826699;

    /* renamed from: t */
    public static final int f103748t = -295931082;

    /* renamed from: u */
    public static final int f103749u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f103750v = initAutoDBInfo(C38665t0.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38665t0> f103751w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103752d = true;

    /* renamed from: e */
    public boolean f103753e = true;

    /* renamed from: f */
    public boolean f103754f = true;
    public String field_brandUsername;
    public String field_headImgUrl;
    public int field_kfType;
    public String field_nickname;
    public String field_openId;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f103755g = true;

    /* renamed from: h */
    public boolean f103756h = true;

    /* renamed from: i */
    public boolean f103757i = true;

    static {
        SingleTable singleTable = new SingleTable("BizKF");
        f103741j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("openId", "string", singleTable.getName(), "");
        new Column("brandUsername", "string", singleTable.getName(), "");
        new Column("headImgUrl", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("kfType", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "openId";
        mAutoDBInfo.colsMap.put("openId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "openId";
        mAutoDBInfo.columns[1] = "brandUsername";
        mAutoDBInfo.colsMap.put("brandUsername", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "headImgUrl";
        mAutoDBInfo.colsMap.put("headImgUrl", "TEXT");
        mAutoDBInfo.columns[3] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT");
        mAutoDBInfo.columns[4] = "kfType";
        mAutoDBInfo.colsMap.put("kfType", "INTEGER");
        mAutoDBInfo.columns[5] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " openId TEXT PRIMARY KEY ,  brandUsername TEXT default '' ,  headImgUrl TEXT,  nickname TEXT,  kfType INTEGER,  updateTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38665t0)) {
            return false;
        }
        C38665t0 t0Var = (C38665t0) iAutoDBItem;
        return C46238a.m51546a(this.field_openId, t0Var.field_openId) && C46238a.m51546a(this.field_brandUsername, t0Var.field_brandUsername) && C46238a.m51546a(this.field_headImgUrl, t0Var.field_headImgUrl) && C46238a.m51546a(this.field_nickname, t0Var.field_nickname) && C46238a.m51546a(Integer.valueOf(this.field_kfType), Integer.valueOf(t0Var.field_kfType)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(t0Var.field_updateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103743o == hashCode) {
                    try {
                        this.field_openId = cursor.getString(i);
                        this.f103752d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103744p == hashCode) {
                    try {
                        this.field_brandUsername = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103745q == hashCode) {
                    try {
                        this.field_headImgUrl = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103746r == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103747s == hashCode) {
                    try {
                        this.field_kfType = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103748t == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103749u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103752d) {
            contentValues.put("openId", this.field_openId);
        }
        if (this.field_brandUsername == null) {
            this.field_brandUsername = "";
        }
        if (this.f103753e) {
            contentValues.put("brandUsername", this.field_brandUsername);
        }
        if (this.f103754f) {
            contentValues.put("headImgUrl", this.field_headImgUrl);
        }
        if (this.f103755g) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f103756h) {
            contentValues.put("kfType", Integer.valueOf(this.field_kfType));
        }
        if (this.f103757i) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizKF", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizKF ( " + f103750v.sql + ");");
        for (String add : f103742n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizKF", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizKF", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103750v, "BizKF", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizKF", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizKF", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizKF", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103750v;
    }

    public String[] getIndexCreateSQL() {
        return f103742n;
    }

    public StorageObserverOwner<C38665t0> getObserverOwner() {
        return f103751w;
    }

    public Object getPrimaryKeyValue() {
        return this.field_openId;
    }

    public SingleTable getTable() {
        return f103741j;
    }

    public String getTableName() {
        return f103741j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("openId")) {
            this.field_openId = contentValues.getAsString("openId");
            if (z) {
                this.f103752d = true;
            }
        }
        if (contentValues.containsKey("brandUsername")) {
            this.field_brandUsername = contentValues.getAsString("brandUsername");
            if (z) {
                this.f103753e = true;
            }
        }
        if (contentValues.containsKey("headImgUrl")) {
            this.field_headImgUrl = contentValues.getAsString("headImgUrl");
            if (z) {
                this.f103754f = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f103755g = true;
            }
        }
        if (contentValues.containsKey("kfType")) {
            this.field_kfType = contentValues.getAsInteger("kfType").intValue();
            if (z) {
                this.f103756h = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f103757i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
