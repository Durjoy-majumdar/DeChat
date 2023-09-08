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

/* renamed from: xh.n4 */
public class C38617n4 extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C38617n4> f103097A = new StorageObserverOwner<>();

    /* renamed from: a3 */
    public static final int f103098a3 = 1471892607;

    /* renamed from: b3 */
    public static final int f103099b3 = 109254796;

    /* renamed from: o */
    public static final SingleTable f103100o;

    /* renamed from: p */
    public static final String[] f103101p = new String[0];

    /* renamed from: q */
    public static final int f103102q = 908759025;

    /* renamed from: r */
    public static final int f103103r = 93028124;

    /* renamed from: s */
    public static final int f103104s = -972749318;

    /* renamed from: t */
    public static final int f103105t = 230741914;

    /* renamed from: u */
    public static final int f103106u = 1369213417;

    /* renamed from: v */
    public static final int f103107v = 656275146;

    /* renamed from: w */
    public static final int f103108w = -684021848;

    /* renamed from: x */
    public static final int f103109x = 540279545;

    /* renamed from: y */
    public static final int f103110y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f103111z = initAutoDBInfo(C38617n4.class);

    /* renamed from: Y2 */
    public boolean f103112Y2 = true;

    /* renamed from: Z2 */
    public boolean f103113Z2 = true;

    /* renamed from: d */
    public boolean f103114d = true;

    /* renamed from: e */
    public boolean f103115e = true;

    /* renamed from: f */
    public boolean f103116f = true;
    public String field_appId;
    public long field_checkCgiTime;
    public long field_createTime;
    public byte[] field_downloadItemList;
    public int field_expiredSeconds;
    public long field_finishDownloadTime;
    public int field_intervalSeconds;
    public String field_packageName;
    public int field_scene;
    public long field_taskExpiredSeconds;

    /* renamed from: g */
    public boolean f103117g = true;

    /* renamed from: h */
    public boolean f103118h = true;

    /* renamed from: i */
    public boolean f103119i = true;

    /* renamed from: j */
    public boolean f103120j = true;

    /* renamed from: n */
    public boolean f103121n = true;

    static {
        SingleTable singleTable = new SingleTable("GameResourceDownload");
        f103100o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("packageName", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("intervalSeconds", "int", singleTable.getName(), "");
        new Column("expiredSeconds", "int", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("checkCgiTime", "long", singleTable.getName(), "");
        new Column("finishDownloadTime", "long", singleTable.getName(), "");
        new Column("downloadItemList", "byte[]", singleTable.getName(), "");
        new Column("taskExpiredSeconds", "long", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[10];
        String[] strArr = new String[11];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "packageName";
        mAutoDBInfo.colsMap.put("packageName", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "packageName";
        mAutoDBInfo.columns[1] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[2] = "intervalSeconds";
        mAutoDBInfo.colsMap.put("intervalSeconds", "INTEGER");
        mAutoDBInfo.columns[3] = "expiredSeconds";
        mAutoDBInfo.colsMap.put("expiredSeconds", "INTEGER");
        mAutoDBInfo.columns[4] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[5] = "checkCgiTime";
        mAutoDBInfo.colsMap.put("checkCgiTime", "LONG");
        mAutoDBInfo.columns[6] = "finishDownloadTime";
        mAutoDBInfo.colsMap.put("finishDownloadTime", "LONG");
        mAutoDBInfo.columns[7] = "downloadItemList";
        mAutoDBInfo.colsMap.put("downloadItemList", "BLOB");
        mAutoDBInfo.columns[8] = "taskExpiredSeconds";
        mAutoDBInfo.colsMap.put("taskExpiredSeconds", "LONG");
        mAutoDBInfo.columns[9] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " packageName TEXT PRIMARY KEY ,  appId TEXT,  intervalSeconds INTEGER,  expiredSeconds INTEGER,  createTime LONG,  checkCgiTime LONG,  finishDownloadTime LONG,  downloadItemList BLOB,  taskExpiredSeconds LONG,  scene INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38617n4)) {
            return false;
        }
        C38617n4 n4Var = (C38617n4) iAutoDBItem;
        return C46238a.m51546a(this.field_packageName, n4Var.field_packageName) && C46238a.m51546a(this.field_appId, n4Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_intervalSeconds), Integer.valueOf(n4Var.field_intervalSeconds)) && C46238a.m51546a(Integer.valueOf(this.field_expiredSeconds), Integer.valueOf(n4Var.field_expiredSeconds)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(n4Var.field_createTime)) && C46238a.m51546a(Long.valueOf(this.field_checkCgiTime), Long.valueOf(n4Var.field_checkCgiTime)) && C46238a.m51546a(Long.valueOf(this.field_finishDownloadTime), Long.valueOf(n4Var.field_finishDownloadTime)) && C46238a.m51546a(this.field_downloadItemList, n4Var.field_downloadItemList) && C46238a.m51546a(Long.valueOf(this.field_taskExpiredSeconds), Long.valueOf(n4Var.field_taskExpiredSeconds)) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(n4Var.field_scene));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103102q == hashCode) {
                    try {
                        this.field_packageName = cursor.getString(i);
                        this.f103114d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103103r == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103104s == hashCode) {
                    try {
                        this.field_intervalSeconds = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103105t == hashCode) {
                    try {
                        this.field_expiredSeconds = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103106u == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103107v == hashCode) {
                    try {
                        this.field_checkCgiTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103108w == hashCode) {
                    try {
                        this.field_finishDownloadTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103109x == hashCode) {
                    try {
                        this.field_downloadItemList = cursor.getBlob(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103098a3 == hashCode) {
                    try {
                        this.field_taskExpiredSeconds = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103099b3 == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103110y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103114d) {
            contentValues.put("packageName", this.field_packageName);
        }
        if (this.f103115e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103116f) {
            contentValues.put("intervalSeconds", Integer.valueOf(this.field_intervalSeconds));
        }
        if (this.f103117g) {
            contentValues.put("expiredSeconds", Integer.valueOf(this.field_expiredSeconds));
        }
        if (this.f103118h) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f103119i) {
            contentValues.put("checkCgiTime", Long.valueOf(this.field_checkCgiTime));
        }
        if (this.f103120j) {
            contentValues.put("finishDownloadTime", Long.valueOf(this.field_finishDownloadTime));
        }
        if (this.f103121n) {
            contentValues.put("downloadItemList", this.field_downloadItemList);
        }
        if (this.f103112Y2) {
            contentValues.put("taskExpiredSeconds", Long.valueOf(this.field_taskExpiredSeconds));
        }
        if (this.f103113Z2) {
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
            Log.m105920e("MicroMsg.SDK.BaseGameResourceDownload", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameResourceDownload ( " + f103111z.sql + ");");
        for (String add : f103101p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameResourceDownload", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameResourceDownload", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103111z, "GameResourceDownload", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameResourceDownload", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameResourceDownload", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameResourceDownload", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103111z;
    }

    public String[] getIndexCreateSQL() {
        return f103101p;
    }

    public StorageObserverOwner<C38617n4> getObserverOwner() {
        return f103097A;
    }

    public Object getPrimaryKeyValue() {
        return this.field_packageName;
    }

    public SingleTable getTable() {
        return f103100o;
    }

    public String getTableName() {
        return f103100o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("packageName")) {
            this.field_packageName = contentValues.getAsString("packageName");
            if (z) {
                this.f103114d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103115e = true;
            }
        }
        if (contentValues.containsKey("intervalSeconds")) {
            this.field_intervalSeconds = contentValues.getAsInteger("intervalSeconds").intValue();
            if (z) {
                this.f103116f = true;
            }
        }
        if (contentValues.containsKey("expiredSeconds")) {
            this.field_expiredSeconds = contentValues.getAsInteger("expiredSeconds").intValue();
            if (z) {
                this.f103117g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f103118h = true;
            }
        }
        if (contentValues.containsKey("checkCgiTime")) {
            this.field_checkCgiTime = contentValues.getAsLong("checkCgiTime").longValue();
            if (z) {
                this.f103119i = true;
            }
        }
        if (contentValues.containsKey("finishDownloadTime")) {
            this.field_finishDownloadTime = contentValues.getAsLong("finishDownloadTime").longValue();
            if (z) {
                this.f103120j = true;
            }
        }
        if (contentValues.containsKey("downloadItemList")) {
            this.field_downloadItemList = contentValues.getAsByteArray("downloadItemList");
            if (z) {
                this.f103121n = true;
            }
        }
        if (contentValues.containsKey("taskExpiredSeconds")) {
            this.field_taskExpiredSeconds = contentValues.getAsLong("taskExpiredSeconds").longValue();
            if (z) {
                this.f103112Y2 = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f103113Z2 = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
