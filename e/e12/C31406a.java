package e12;

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

/* renamed from: e12.a */
public class C31406a extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f84053n;

    /* renamed from: o */
    public static final String[] f84054o = new String[0];

    /* renamed from: p */
    public static final int f84055p = -894832108;

    /* renamed from: q */
    public static final int f84056q = -384566343;

    /* renamed from: r */
    public static final int f84057r = 986572010;

    /* renamed from: s */
    public static final int f84058s = -384409297;

    /* renamed from: t */
    public static final int f84059t = 107902;

    /* renamed from: u */
    public static final int f84060u = 116079;

    /* renamed from: v */
    public static final int f84061v = 1369213417;

    /* renamed from: w */
    public static final int f84062w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f84063x = initAutoDBInfo(C31406a.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C31406a> f84064y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f84065d = true;

    /* renamed from: e */
    public boolean f84066e = true;

    /* renamed from: f */
    public boolean f84067f = true;
    public long field_createTime;
    public String field_md5;
    public String field_projectId;
    public String field_resourceName;
    public int field_resourceSize;
    public int field_resourceVersion;
    public String field_url;

    /* renamed from: g */
    public boolean f84068g = true;

    /* renamed from: h */
    public boolean f84069h = true;

    /* renamed from: i */
    public boolean f84070i = true;

    /* renamed from: j */
    public boolean f84071j = true;

    static {
        SingleTable singleTable = new SingleTable("ILinkResourceInfo");
        f84053n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("projectId", "string", singleTable.getName(), "");
        new Column("resourceName", "string", singleTable.getName(), "");
        new Column("resourceVersion", "int", singleTable.getName(), "");
        new Column("resourceSize", "int", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "projectId";
        mAutoDBInfo.colsMap.put("projectId", "TEXT");
        mAutoDBInfo.columns[1] = "resourceName";
        mAutoDBInfo.colsMap.put("resourceName", "TEXT");
        mAutoDBInfo.columns[2] = "resourceVersion";
        mAutoDBInfo.colsMap.put("resourceVersion", "INTEGER");
        mAutoDBInfo.columns[3] = "resourceSize";
        mAutoDBInfo.colsMap.put("resourceSize", "INTEGER");
        mAutoDBInfo.columns[4] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[5] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[6] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " projectId TEXT,  resourceName TEXT,  resourceVersion INTEGER,  resourceSize INTEGER,  md5 TEXT,  url TEXT,  createTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C31406a)) {
            return false;
        }
        C31406a aVar = (C31406a) iAutoDBItem;
        return C46238a.m51546a(this.field_projectId, aVar.field_projectId) && C46238a.m51546a(this.field_resourceName, aVar.field_resourceName) && C46238a.m51546a(Integer.valueOf(this.field_resourceVersion), Integer.valueOf(aVar.field_resourceVersion)) && C46238a.m51546a(Integer.valueOf(this.field_resourceSize), Integer.valueOf(aVar.field_resourceSize)) && C46238a.m51546a(this.field_md5, aVar.field_md5) && C46238a.m51546a(this.field_url, aVar.field_url) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(aVar.field_createTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f84055p == hashCode) {
                    try {
                        this.field_projectId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseILinkResourceInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f84056q == hashCode) {
                    try {
                        this.field_resourceName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseILinkResourceInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f84057r == hashCode) {
                    try {
                        this.field_resourceVersion = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseILinkResourceInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f84058s == hashCode) {
                    try {
                        this.field_resourceSize = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseILinkResourceInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f84059t == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseILinkResourceInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f84060u == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseILinkResourceInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f84061v == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseILinkResourceInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f84062w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f84065d) {
            contentValues.put("projectId", this.field_projectId);
        }
        if (this.f84066e) {
            contentValues.put("resourceName", this.field_resourceName);
        }
        if (this.f84067f) {
            contentValues.put("resourceVersion", Integer.valueOf(this.field_resourceVersion));
        }
        if (this.f84068g) {
            contentValues.put("resourceSize", Integer.valueOf(this.field_resourceSize));
        }
        if (this.f84069h) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f84070i) {
            contentValues.put("url", this.field_url);
        }
        if (this.f84071j) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseILinkResourceInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ILinkResourceInfo ( " + f84063x.sql + ");");
        for (String add : f84054o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseILinkResourceInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ILinkResourceInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f84063x, "ILinkResourceInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseILinkResourceInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ILinkResourceInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseILinkResourceInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f84063x;
    }

    public String[] getIndexCreateSQL() {
        return f84054o;
    }

    public StorageObserverOwner<C31406a> getObserverOwner() {
        return f84064y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f84053n;
    }

    public String getTableName() {
        return f84053n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("projectId")) {
            this.field_projectId = contentValues.getAsString("projectId");
            if (z) {
                this.f84065d = true;
            }
        }
        if (contentValues.containsKey("resourceName")) {
            this.field_resourceName = contentValues.getAsString("resourceName");
            if (z) {
                this.f84066e = true;
            }
        }
        if (contentValues.containsKey("resourceVersion")) {
            this.field_resourceVersion = contentValues.getAsInteger("resourceVersion").intValue();
            if (z) {
                this.f84067f = true;
            }
        }
        if (contentValues.containsKey("resourceSize")) {
            this.field_resourceSize = contentValues.getAsInteger("resourceSize").intValue();
            if (z) {
                this.f84068g = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f84069h = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f84070i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f84071j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
