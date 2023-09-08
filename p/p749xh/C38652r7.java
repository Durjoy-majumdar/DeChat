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

/* renamed from: xh.r7 */
public class C38652r7 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103520j;

    /* renamed from: n */
    public static final String[] f103521n = {"CREATE INDEX IF NOT EXISTS PushDuplicateLaunchWxaAppRespTableStartTimeIndex ON PredownloadIssueLaunchWxaAppResponse(startTime)", "CREATE INDEX IF NOT EXISTS PushDuplicateLaunchWxaAppRespTableEndTimeIndex ON PredownloadIssueLaunchWxaAppResponse(endTime)"};

    /* renamed from: o */
    public static final int f103522o = 93028124;

    /* renamed from: p */
    public static final int f103523p = 109254796;

    /* renamed from: q */
    public static final int f103524q = -205344974;

    /* renamed from: r */
    public static final int f103525r = -2129294769;

    /* renamed from: s */
    public static final int f103526s = -1607243192;

    /* renamed from: t */
    public static final int f103527t = -427040401;

    /* renamed from: u */
    public static final int f103528u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f103529v = initAutoDBInfo(C38652r7.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38652r7> f103530w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103531d = true;

    /* renamed from: e */
    public boolean f103532e = true;

    /* renamed from: f */
    public boolean f103533f = true;
    public String field_appId;
    public long field_endTime;
    public byte[] field_launchProtoBlob;
    public long field_reportId;
    public int field_scene;
    public long field_startTime;

    /* renamed from: g */
    public boolean f103534g = true;

    /* renamed from: h */
    public boolean f103535h = true;

    /* renamed from: i */
    public boolean f103536i = true;

    static {
        SingleTable singleTable = new SingleTable("PredownloadIssueLaunchWxaAppResponse");
        f103520j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("launchProtoBlob", "byte[]", singleTable.getName(), "");
        new Column("startTime", "long", singleTable.getName(), "");
        new Column("endTime", "long", singleTable.getName(), "");
        new Column("reportId", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[2] = "launchProtoBlob";
        mAutoDBInfo.colsMap.put("launchProtoBlob", "BLOB");
        mAutoDBInfo.columns[3] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "LONG");
        mAutoDBInfo.columns[4] = "endTime";
        mAutoDBInfo.colsMap.put("endTime", "LONG");
        mAutoDBInfo.columns[5] = "reportId";
        mAutoDBInfo.colsMap.put("reportId", "LONG");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  scene INTEGER,  launchProtoBlob BLOB,  startTime LONG,  endTime LONG,  reportId LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38652r7)) {
            return false;
        }
        C38652r7 r7Var = (C38652r7) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, r7Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(r7Var.field_scene)) && C46238a.m51546a(this.field_launchProtoBlob, r7Var.field_launchProtoBlob) && C46238a.m51546a(Long.valueOf(this.field_startTime), Long.valueOf(r7Var.field_startTime)) && C46238a.m51546a(Long.valueOf(this.field_endTime), Long.valueOf(r7Var.field_endTime)) && C46238a.m51546a(Long.valueOf(this.field_reportId), Long.valueOf(r7Var.field_reportId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103522o == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103523p == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103524q == hashCode) {
                    try {
                        this.field_launchProtoBlob = cursor.getBlob(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103525r == hashCode) {
                    try {
                        this.field_startTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103526s == hashCode) {
                    try {
                        this.field_endTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103527t == hashCode) {
                    try {
                        this.field_reportId = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103528u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103531d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103532e) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f103533f) {
            contentValues.put("launchProtoBlob", this.field_launchProtoBlob);
        }
        if (this.f103534g) {
            contentValues.put("startTime", Long.valueOf(this.field_startTime));
        }
        if (this.f103535h) {
            contentValues.put("endTime", Long.valueOf(this.field_endTime));
        }
        if (this.f103536i) {
            contentValues.put("reportId", Long.valueOf(this.field_reportId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PredownloadIssueLaunchWxaAppResponse ( " + f103529v.sql + ");");
        for (String add : f103521n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PredownloadIssueLaunchWxaAppResponse", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103529v, "PredownloadIssueLaunchWxaAppResponse", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PredownloadIssueLaunchWxaAppResponse", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103529v;
    }

    public String[] getIndexCreateSQL() {
        return f103521n;
    }

    public StorageObserverOwner<C38652r7> getObserverOwner() {
        return f103530w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103520j;
    }

    public String getTableName() {
        return f103520j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103531d = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f103532e = true;
            }
        }
        if (contentValues.containsKey("launchProtoBlob")) {
            this.field_launchProtoBlob = contentValues.getAsByteArray("launchProtoBlob");
            if (z) {
                this.f103533f = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z) {
                this.f103534g = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z) {
                this.f103535h = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsLong("reportId").longValue();
            if (z) {
                this.f103536i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
