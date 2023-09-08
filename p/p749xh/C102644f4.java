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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.f4 */
public class C102644f4 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f302338A = 2140209826;

    /* renamed from: B */
    public static final int f302339B = -508913750;

    /* renamed from: C */
    public static final int f302340C = 1053908752;

    /* renamed from: D */
    public static final int f302341D = -1874720574;

    /* renamed from: E */
    public static final int f302342E = 1431953665;

    /* renamed from: F */
    public static final int f302343F = -1092892779;

    /* renamed from: G */
    public static final int f302344G = -572956617;

    /* renamed from: H */
    public static final int f302345H = 2009209388;

    /* renamed from: I */
    public static final int f302346I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f302347J = initAutoDBInfo(C102644f4.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C102644f4> f302348K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f302349t;

    /* renamed from: u */
    public static final String[] f302350u = new String[0];

    /* renamed from: v */
    public static final int f302351v = -880873088;

    /* renamed from: w */
    public static final int f302352w = 1369213417;

    /* renamed from: x */
    public static final int f302353x = 2009180682;

    /* renamed from: y */
    public static final int f302354y = 2140463422;

    /* renamed from: z */
    public static final int f302355z = 1114930084;

    /* renamed from: d */
    public boolean f302356d = true;

    /* renamed from: e */
    public boolean f302357e = true;

    /* renamed from: f */
    public boolean f302358f = true;
    public String field_BusinessData;
    public String field_bgMixTaskId;
    public boolean field_compressImg;
    public long field_createTime;
    public String field_localIdList;
    public String field_mediaList;
    public int field_mediaType;
    public int field_mixState;
    public int field_publishSource;
    public int field_publishState;
    public int field_sourceSceneId;
    public String field_taskId;
    public int field_uploadState;

    /* renamed from: g */
    public boolean f302359g = true;

    /* renamed from: h */
    public boolean f302360h = true;

    /* renamed from: i */
    public boolean f302361i = true;

    /* renamed from: j */
    public boolean f302362j = true;

    /* renamed from: n */
    public boolean f302363n = true;

    /* renamed from: o */
    public boolean f302364o = true;

    /* renamed from: p */
    public boolean f302365p = true;

    /* renamed from: q */
    public boolean f302366q = true;

    /* renamed from: r */
    public boolean f302367r = true;

    /* renamed from: s */
    public boolean f302368s = true;

    static {
        SingleTable singleTable = new SingleTable("GameHaowanPublishEdition");
        f302349t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("taskId", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("publishSource", "int", singleTable.getName(), "");
        new Column("mediaType", "int", singleTable.getName(), "");
        new Column("localIdList", "string", singleTable.getName(), "");
        new Column("mediaList", "string", singleTable.getName(), "");
        new Column("BusinessData", "string", singleTable.getName(), "");
        new Column("uploadState", "int", singleTable.getName(), "");
        new Column("publishState", "int", singleTable.getName(), "");
        new Column("compressImg", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("mixState", "int", singleTable.getName(), "");
        new Column("bgMixTaskId", "string", singleTable.getName(), "");
        new Column("sourceSceneId", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "taskId";
        mAutoDBInfo.colsMap.put("taskId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "taskId";
        mAutoDBInfo.columns[1] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[2] = "publishSource";
        mAutoDBInfo.colsMap.put("publishSource", "INTEGER");
        mAutoDBInfo.columns[3] = "mediaType";
        mAutoDBInfo.colsMap.put("mediaType", "INTEGER");
        mAutoDBInfo.columns[4] = "localIdList";
        mAutoDBInfo.colsMap.put("localIdList", "TEXT");
        mAutoDBInfo.columns[5] = "mediaList";
        mAutoDBInfo.colsMap.put("mediaList", "TEXT");
        mAutoDBInfo.columns[6] = "BusinessData";
        mAutoDBInfo.colsMap.put("BusinessData", "TEXT");
        mAutoDBInfo.columns[7] = "uploadState";
        mAutoDBInfo.colsMap.put("uploadState", "INTEGER default '0' ");
        mAutoDBInfo.columns[8] = "publishState";
        mAutoDBInfo.colsMap.put("publishState", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "compressImg";
        mAutoDBInfo.colsMap.put("compressImg", "INTEGER default 'true' ");
        mAutoDBInfo.columns[10] = "mixState";
        mAutoDBInfo.colsMap.put("mixState", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "bgMixTaskId";
        mAutoDBInfo.colsMap.put("bgMixTaskId", "TEXT");
        mAutoDBInfo.columns[12] = "sourceSceneId";
        mAutoDBInfo.colsMap.put("sourceSceneId", "INTEGER default '0' ");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " taskId TEXT PRIMARY KEY ,  createTime LONG,  publishSource INTEGER,  mediaType INTEGER,  localIdList TEXT,  mediaList TEXT,  BusinessData TEXT,  uploadState INTEGER default '0' ,  publishState INTEGER default '0' ,  compressImg INTEGER default 'true' ,  mixState INTEGER default '0' ,  bgMixTaskId TEXT,  sourceSceneId INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102644f4)) {
            return false;
        }
        C102644f4 f4Var = (C102644f4) iAutoDBItem;
        return C46238a.m51546a(this.field_taskId, f4Var.field_taskId) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(f4Var.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_publishSource), Integer.valueOf(f4Var.field_publishSource)) && C46238a.m51546a(Integer.valueOf(this.field_mediaType), Integer.valueOf(f4Var.field_mediaType)) && C46238a.m51546a(this.field_localIdList, f4Var.field_localIdList) && C46238a.m51546a(this.field_mediaList, f4Var.field_mediaList) && C46238a.m51546a(this.field_BusinessData, f4Var.field_BusinessData) && C46238a.m51546a(Integer.valueOf(this.field_uploadState), Integer.valueOf(f4Var.field_uploadState)) && C46238a.m51546a(Integer.valueOf(this.field_publishState), Integer.valueOf(f4Var.field_publishState)) && C46238a.m51546a(Boolean.valueOf(this.field_compressImg), Boolean.valueOf(f4Var.field_compressImg)) && C46238a.m51546a(Integer.valueOf(this.field_mixState), Integer.valueOf(f4Var.field_mixState)) && C46238a.m51546a(this.field_bgMixTaskId, f4Var.field_bgMixTaskId) && C46238a.m51546a(Integer.valueOf(this.field_sourceSceneId), Integer.valueOf(f4Var.field_sourceSceneId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302351v == hashCode) {
                    try {
                        this.field_taskId = cursor.getString(i);
                        this.f302356d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302352w == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302353x == hashCode) {
                    try {
                        this.field_publishSource = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302354y == hashCode) {
                    try {
                        this.field_mediaType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302355z == hashCode) {
                    try {
                        this.field_localIdList = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302338A == hashCode) {
                    try {
                        this.field_mediaList = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302339B == hashCode) {
                    try {
                        this.field_BusinessData = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302340C == hashCode) {
                    try {
                        this.field_uploadState = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302341D == hashCode) {
                    try {
                        this.field_publishState = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302342E == hashCode) {
                    try {
                        this.field_compressImg = cursor.getInt(i) != 0;
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302343F == hashCode) {
                    try {
                        this.field_mixState = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302344G == hashCode) {
                    try {
                        this.field_bgMixTaskId = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302345H == hashCode) {
                    try {
                        this.field_sourceSceneId = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302346I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302356d) {
            contentValues.put("taskId", this.field_taskId);
        }
        if (this.f302357e) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f302358f) {
            contentValues.put("publishSource", Integer.valueOf(this.field_publishSource));
        }
        if (this.f302359g) {
            contentValues.put("mediaType", Integer.valueOf(this.field_mediaType));
        }
        if (this.f302360h) {
            contentValues.put("localIdList", this.field_localIdList);
        }
        if (this.f302361i) {
            contentValues.put("mediaList", this.field_mediaList);
        }
        if (this.f302362j) {
            contentValues.put("BusinessData", this.field_BusinessData);
        }
        if (this.f302363n) {
            contentValues.put("uploadState", Integer.valueOf(this.field_uploadState));
        }
        if (this.f302364o) {
            contentValues.put("publishState", Integer.valueOf(this.field_publishState));
        }
        if (this.f302365p) {
            if (this.field_compressImg) {
                contentValues.put("compressImg", 1);
            } else {
                contentValues.put("compressImg", 0);
            }
        }
        if (this.f302366q) {
            contentValues.put("mixState", Integer.valueOf(this.field_mixState));
        }
        if (this.f302367r) {
            contentValues.put("bgMixTaskId", this.field_bgMixTaskId);
        }
        if (this.f302368s) {
            contentValues.put("sourceSceneId", Integer.valueOf(this.field_sourceSceneId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameHaowanPublishEdition", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameHaowanPublishEdition ( " + f302347J.sql + ");");
        for (String add : f302350u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameHaowanPublishEdition", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameHaowanPublishEdition", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302347J, "GameHaowanPublishEdition", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameHaowanPublishEdition", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameHaowanPublishEdition", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameHaowanPublishEdition", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302347J;
    }

    public String[] getIndexCreateSQL() {
        return f302350u;
    }

    public StorageObserverOwner<C102644f4> getObserverOwner() {
        return f302348K;
    }

    public Object getPrimaryKeyValue() {
        return this.field_taskId;
    }

    public SingleTable getTable() {
        return f302349t;
    }

    public String getTableName() {
        return f302349t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("taskId")) {
            this.field_taskId = contentValues.getAsString("taskId");
            if (z) {
                this.f302356d = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f302357e = true;
            }
        }
        if (contentValues.containsKey("publishSource")) {
            this.field_publishSource = contentValues.getAsInteger("publishSource").intValue();
            if (z) {
                this.f302358f = true;
            }
        }
        if (contentValues.containsKey("mediaType")) {
            this.field_mediaType = contentValues.getAsInteger("mediaType").intValue();
            if (z) {
                this.f302359g = true;
            }
        }
        if (contentValues.containsKey("localIdList")) {
            this.field_localIdList = contentValues.getAsString("localIdList");
            if (z) {
                this.f302360h = true;
            }
        }
        if (contentValues.containsKey("mediaList")) {
            this.field_mediaList = contentValues.getAsString("mediaList");
            if (z) {
                this.f302361i = true;
            }
        }
        if (contentValues.containsKey("BusinessData")) {
            this.field_BusinessData = contentValues.getAsString("BusinessData");
            if (z) {
                this.f302362j = true;
            }
        }
        if (contentValues.containsKey("uploadState")) {
            this.field_uploadState = contentValues.getAsInteger("uploadState").intValue();
            if (z) {
                this.f302363n = true;
            }
        }
        if (contentValues.containsKey("publishState")) {
            this.field_publishState = contentValues.getAsInteger("publishState").intValue();
            if (z) {
                this.f302364o = true;
            }
        }
        if (contentValues.containsKey("compressImg")) {
            this.field_compressImg = contentValues.getAsInteger("compressImg").intValue() != 0;
            if (z) {
                this.f302365p = true;
            }
        }
        if (contentValues.containsKey("mixState")) {
            this.field_mixState = contentValues.getAsInteger("mixState").intValue();
            if (z) {
                this.f302366q = true;
            }
        }
        if (contentValues.containsKey("bgMixTaskId")) {
            this.field_bgMixTaskId = contentValues.getAsString("bgMixTaskId");
            if (z) {
                this.f302367r = true;
            }
        }
        if (contentValues.containsKey("sourceSceneId")) {
            this.field_sourceSceneId = contentValues.getAsInteger("sourceSceneId").intValue();
            if (z) {
                this.f302368s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
