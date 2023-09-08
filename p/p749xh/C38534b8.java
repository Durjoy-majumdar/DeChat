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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.b8 */
public class C38534b8 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f101817j;

    /* renamed from: n */
    public static final String[] f101818n = new String[0];

    /* renamed from: o */
    public static final int f101819o = -1051830678;

    /* renamed from: p */
    public static final int f101820p = 310314082;

    /* renamed from: q */
    public static final int f101821q = -825857270;

    /* renamed from: r */
    public static final int f101822r = 1380000798;

    /* renamed from: s */
    public static final int f101823s = -325175551;

    /* renamed from: t */
    public static final int f101824t = 109254796;

    /* renamed from: u */
    public static final int f101825u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f101826v = initAutoDBInfo(C38534b8.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38534b8> f101827w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101828d = true;

    /* renamed from: e */
    public boolean f101829e = true;

    /* renamed from: f */
    public boolean f101830f = true;
    public long field_ScanTime;
    public int field_funcType;
    public String field_productId;
    public String field_qrcodeUrl;
    public int field_scene;
    public String field_xmlContent;

    /* renamed from: g */
    public boolean f101831g = true;

    /* renamed from: h */
    public boolean f101832h = true;

    /* renamed from: i */
    public boolean f101833i = true;

    static {
        SingleTable singleTable = new SingleTable("ScanHistoryItem");
        f101817j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("productId", "string", singleTable.getName(), "");
        new Column("xmlContent", "string", singleTable.getName(), "");
        new Column("ScanTime", "long", singleTable.getName(), "");
        new Column("funcType", "int", singleTable.getName(), "");
        new Column("qrcodeUrl", "string", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "productId";
        mAutoDBInfo.colsMap.put("productId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "productId";
        mAutoDBInfo.columns[1] = "xmlContent";
        mAutoDBInfo.colsMap.put("xmlContent", "TEXT");
        mAutoDBInfo.columns[2] = "ScanTime";
        mAutoDBInfo.colsMap.put("ScanTime", "LONG");
        mAutoDBInfo.columns[3] = "funcType";
        mAutoDBInfo.colsMap.put("funcType", "INTEGER");
        mAutoDBInfo.columns[4] = "qrcodeUrl";
        mAutoDBInfo.colsMap.put("qrcodeUrl", "TEXT");
        mAutoDBInfo.columns[5] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " productId TEXT PRIMARY KEY ,  xmlContent TEXT,  ScanTime LONG,  funcType INTEGER,  qrcodeUrl TEXT,  scene INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38534b8)) {
            return false;
        }
        C38534b8 b8Var = (C38534b8) iAutoDBItem;
        return C46238a.m51546a(this.field_productId, b8Var.field_productId) && C46238a.m51546a(this.field_xmlContent, b8Var.field_xmlContent) && C46238a.m51546a(Long.valueOf(this.field_ScanTime), Long.valueOf(b8Var.field_ScanTime)) && C46238a.m51546a(Integer.valueOf(this.field_funcType), Integer.valueOf(b8Var.field_funcType)) && C46238a.m51546a(this.field_qrcodeUrl, b8Var.field_qrcodeUrl) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(b8Var.field_scene));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101819o == hashCode) {
                    try {
                        this.field_productId = cursor.getString(i);
                        this.f101828d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101820p == hashCode) {
                    try {
                        this.field_xmlContent = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101821q == hashCode) {
                    try {
                        this.field_ScanTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101822r == hashCode) {
                    try {
                        this.field_funcType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101823s == hashCode) {
                    try {
                        this.field_qrcodeUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101824t == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101825u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101828d) {
            contentValues.put("productId", this.field_productId);
        }
        if (this.f101829e) {
            contentValues.put("xmlContent", this.field_xmlContent);
        }
        if (this.f101830f) {
            contentValues.put("ScanTime", Long.valueOf(this.field_ScanTime));
        }
        if (this.f101831g) {
            contentValues.put("funcType", Integer.valueOf(this.field_funcType));
        }
        if (this.f101832h) {
            contentValues.put("qrcodeUrl", this.field_qrcodeUrl);
        }
        if (this.f101833i) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseScanHistoryItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ScanHistoryItem ( " + f101826v.sql + ");");
        for (String add : f101818n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseScanHistoryItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ScanHistoryItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101826v, "ScanHistoryItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseScanHistoryItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ScanHistoryItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseScanHistoryItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101826v;
    }

    public String[] getIndexCreateSQL() {
        return f101818n;
    }

    public StorageObserverOwner<C38534b8> getObserverOwner() {
        return f101827w;
    }

    public Object getPrimaryKeyValue() {
        return this.field_productId;
    }

    public SingleTable getTable() {
        return f101817j;
    }

    public String getTableName() {
        return f101817j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("productId")) {
            this.field_productId = contentValues.getAsString("productId");
            if (z) {
                this.f101828d = true;
            }
        }
        if (contentValues.containsKey("xmlContent")) {
            this.field_xmlContent = contentValues.getAsString("xmlContent");
            if (z) {
                this.f101829e = true;
            }
        }
        if (contentValues.containsKey("ScanTime")) {
            this.field_ScanTime = contentValues.getAsLong("ScanTime").longValue();
            if (z) {
                this.f101830f = true;
            }
        }
        if (contentValues.containsKey("funcType")) {
            this.field_funcType = contentValues.getAsInteger("funcType").intValue();
            if (z) {
                this.f101831g = true;
            }
        }
        if (contentValues.containsKey("qrcodeUrl")) {
            this.field_qrcodeUrl = contentValues.getAsString("qrcodeUrl");
            if (z) {
                this.f101832h = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f101833i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
