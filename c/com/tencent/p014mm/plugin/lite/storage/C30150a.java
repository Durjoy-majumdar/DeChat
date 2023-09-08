package com.tencent.p014mm.plugin.lite.storage;

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
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.plugin.lite.storage.a */
public class C30150a extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f81500i;

    /* renamed from: j */
    public static final String[] f81501j = new String[0];

    /* renamed from: n */
    public static final int f81502n = 3208616;

    /* renamed from: o */
    public static final int f81503o = 106436749;

    /* renamed from: p */
    public static final int f81504p = -213310577;

    /* renamed from: q */
    public static final int f81505q = 1171402127;

    /* renamed from: r */
    public static final int f81506r = -295931082;

    /* renamed from: s */
    public static final int f81507s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f81508t = initAutoDBInfo(C30150a.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C30150a> f81509u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f81510d = true;

    /* renamed from: e */
    public boolean f81511e = true;

    /* renamed from: f */
    public boolean f81512f = true;
    public String field_headerMap;
    public String field_host;
    public String field_param;
    public String field_paramMap;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f81513g = true;

    /* renamed from: h */
    public boolean f81514h = true;

    static {
        SingleTable singleTable = new SingleTable("LiteAppAuthInfo");
        f81500i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("host", "string", singleTable.getName(), "");
        new Column("param", "string", singleTable.getName(), "");
        new Column("headerMap", "string", singleTable.getName(), "");
        new Column("paramMap", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "host";
        mAutoDBInfo.colsMap.put("host", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "host";
        mAutoDBInfo.columns[1] = "param";
        mAutoDBInfo.colsMap.put("param", "TEXT");
        mAutoDBInfo.columns[2] = "headerMap";
        mAutoDBInfo.colsMap.put("headerMap", "TEXT");
        mAutoDBInfo.columns[3] = "paramMap";
        mAutoDBInfo.colsMap.put("paramMap", "TEXT");
        mAutoDBInfo.columns[4] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " host TEXT PRIMARY KEY ,  param TEXT,  headerMap TEXT,  paramMap TEXT,  updateTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C30150a)) {
            return false;
        }
        C30150a aVar = (C30150a) iAutoDBItem;
        return C46238a.m51546a(this.field_host, aVar.field_host) && C46238a.m51546a(this.field_param, aVar.field_param) && C46238a.m51546a(this.field_headerMap, aVar.field_headerMap) && C46238a.m51546a(this.field_paramMap, aVar.field_paramMap) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(aVar.field_updateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f81502n == hashCode) {
                    try {
                        this.field_host = cursor.getString(i);
                        this.f81510d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppAuthInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f81503o == hashCode) {
                    try {
                        this.field_param = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppAuthInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f81504p == hashCode) {
                    try {
                        this.field_headerMap = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppAuthInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f81505q == hashCode) {
                    try {
                        this.field_paramMap = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppAuthInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f81506r == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppAuthInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f81507s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f81510d) {
            contentValues.put("host", this.field_host);
        }
        if (this.f81511e) {
            contentValues.put("param", this.field_param);
        }
        if (this.f81512f) {
            contentValues.put("headerMap", this.field_headerMap);
        }
        if (this.f81513g) {
            contentValues.put("paramMap", this.field_paramMap);
        }
        if (this.f81514h) {
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
            Log.m105920e("MicroMsg.SDK.BaseLiteAppAuthInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LiteAppAuthInfo ( " + f81508t.sql + ");");
        for (String add : f81501j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLiteAppAuthInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LiteAppAuthInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f81508t, "LiteAppAuthInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLiteAppAuthInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LiteAppAuthInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLiteAppAuthInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f81508t;
    }

    public String[] getIndexCreateSQL() {
        return f81501j;
    }

    public StorageObserverOwner<C30150a> getObserverOwner() {
        return f81509u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_host;
    }

    public SingleTable getTable() {
        return f81500i;
    }

    public String getTableName() {
        return f81500i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("host")) {
            this.field_host = contentValues.getAsString("host");
            if (z) {
                this.f81510d = true;
            }
        }
        if (contentValues.containsKey("param")) {
            this.field_param = contentValues.getAsString("param");
            if (z) {
                this.f81511e = true;
            }
        }
        if (contentValues.containsKey("headerMap")) {
            this.field_headerMap = contentValues.getAsString("headerMap");
            if (z) {
                this.f81512f = true;
            }
        }
        if (contentValues.containsKey("paramMap")) {
            this.field_paramMap = contentValues.getAsString("paramMap");
            if (z) {
                this.f81513g = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f81514h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
