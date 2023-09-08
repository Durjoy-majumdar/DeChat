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

/* renamed from: xh.x8 */
public class C102677x8 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f303149A = -266666762;

    /* renamed from: B */
    public static final int f303150B = 107902;

    /* renamed from: C */
    public static final int f303151C = -620940682;

    /* renamed from: D */
    public static final int f303152D = -1471303303;

    /* renamed from: E */
    public static final int f303153E = -1886842700;

    /* renamed from: F */
    public static final int f303154F = -295931082;

    /* renamed from: G */
    public static final int f303155G = -887494378;

    /* renamed from: H */
    public static final int f303156H = -934980271;

    /* renamed from: I */
    public static final int f303157I = 1049274274;

    /* renamed from: J */
    public static final int f303158J = -1639503432;

    /* renamed from: K */
    public static final int f303159K = -867539581;

    /* renamed from: L */
    public static final int f303160L = -2120771929;

    /* renamed from: M */
    public static final int f303161M = 704253398;

    /* renamed from: N */
    public static final int f303162N = 1081069911;

    /* renamed from: P */
    public static final int f303163P = -1992012396;

    /* renamed from: Q */
    public static final int f303164Q = -266803431;

    /* renamed from: R */
    public static final int f303165R = -1922716094;

    /* renamed from: S */
    public static final int f303166S = 1332040227;

    /* renamed from: T */
    public static final int f303167T = 108705909;

    /* renamed from: U */
    public static final IAutoDBItem.MAutoDBInfo f303168U = initAutoDBInfo(C102677x8.class);

    /* renamed from: V */
    public static final StorageObserverOwner<C102677x8> f303169V = new StorageObserverOwner<>();

    /* renamed from: y */
    public static final SingleTable f303170y;

    /* renamed from: z */
    public static final String[] f303171z = new String[0];

    /* renamed from: d */
    public boolean f303172d = true;

    /* renamed from: e */
    public boolean f303173e = true;

    /* renamed from: f */
    public boolean f303174f = true;
    public long field_duration;
    public String field_favoriteMd5;
    public long field_interactTime;
    public String field_md5;
    public String field_newThumbUrl;
    public String field_newVideoUrl;
    public long field_preLoadResource;
    public String field_preloadMediaId;
    public long field_preloadStoryId;
    public long field_readId;
    public long field_readTime;
    public int field_storyObjOneDay;
    public int field_storyPostTime;
    public long field_syncId;
    public long field_updateTime;
    public byte[] field_userInfo;
    public String field_userName;
    public int field_userStoryFlag;

    /* renamed from: g */
    public boolean f303175g = true;

    /* renamed from: h */
    public boolean f303176h = true;

    /* renamed from: i */
    public boolean f303177i = true;

    /* renamed from: j */
    public boolean f303178j = true;

    /* renamed from: n */
    public boolean f303179n = true;

    /* renamed from: o */
    public boolean f303180o = true;

    /* renamed from: p */
    public boolean f303181p = true;

    /* renamed from: q */
    public boolean f303182q = true;

    /* renamed from: r */
    public boolean f303183r = true;

    /* renamed from: s */
    public boolean f303184s = true;

    /* renamed from: t */
    public boolean f303185t = true;

    /* renamed from: u */
    public boolean f303186u = true;

    /* renamed from: v */
    public boolean f303187v = true;

    /* renamed from: w */
    public boolean f303188w = true;

    /* renamed from: x */
    public boolean f303189x = true;

    static {
        SingleTable singleTable = new SingleTable("StoryExtItem");
        f303170y = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("userStoryFlag", "int", singleTable.getName(), "");
        new Column("newThumbUrl", "string", singleTable.getName(), "");
        new Column("newVideoUrl", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("syncId", "long", singleTable.getName(), "");
        new Column("readId", "long", singleTable.getName(), "");
        new Column("storyPostTime", "int", singleTable.getName(), "");
        new Column("storyObjOneDay", "int", singleTable.getName(), "");
        new Column("readTime", "long", singleTable.getName(), "");
        new Column("preloadStoryId", "long", singleTable.getName(), "");
        new Column("preloadMediaId", "string", singleTable.getName(), "");
        new Column("preLoadResource", "long", singleTable.getName(), "");
        new Column("duration", "long", singleTable.getName(), "");
        new Column("userInfo", "byte[]", singleTable.getName(), "");
        new Column("favoriteMd5", "string", singleTable.getName(), "");
        new Column("interactTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[18];
        String[] strArr = new String[19];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "userName";
        mAutoDBInfo.columns[1] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[2] = "userStoryFlag";
        mAutoDBInfo.colsMap.put("userStoryFlag", "INTEGER");
        mAutoDBInfo.columns[3] = "newThumbUrl";
        mAutoDBInfo.colsMap.put("newThumbUrl", "TEXT");
        mAutoDBInfo.columns[4] = "newVideoUrl";
        mAutoDBInfo.colsMap.put("newVideoUrl", "TEXT");
        mAutoDBInfo.columns[5] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[6] = "syncId";
        mAutoDBInfo.colsMap.put("syncId", "LONG");
        mAutoDBInfo.columns[7] = "readId";
        mAutoDBInfo.colsMap.put("readId", "LONG");
        mAutoDBInfo.columns[8] = "storyPostTime";
        mAutoDBInfo.colsMap.put("storyPostTime", "INTEGER");
        mAutoDBInfo.columns[9] = "storyObjOneDay";
        mAutoDBInfo.colsMap.put("storyObjOneDay", "INTEGER");
        mAutoDBInfo.columns[10] = "readTime";
        mAutoDBInfo.colsMap.put("readTime", "LONG");
        mAutoDBInfo.columns[11] = "preloadStoryId";
        mAutoDBInfo.colsMap.put("preloadStoryId", "LONG");
        mAutoDBInfo.columns[12] = "preloadMediaId";
        mAutoDBInfo.colsMap.put("preloadMediaId", "TEXT");
        mAutoDBInfo.columns[13] = "preLoadResource";
        mAutoDBInfo.colsMap.put("preLoadResource", "LONG");
        mAutoDBInfo.columns[14] = "duration";
        mAutoDBInfo.colsMap.put("duration", "LONG");
        mAutoDBInfo.columns[15] = "userInfo";
        mAutoDBInfo.colsMap.put("userInfo", "BLOB");
        mAutoDBInfo.columns[16] = "favoriteMd5";
        mAutoDBInfo.colsMap.put("favoriteMd5", "TEXT");
        mAutoDBInfo.columns[17] = "interactTime";
        mAutoDBInfo.colsMap.put("interactTime", "LONG");
        mAutoDBInfo.columns[18] = "rowid";
        mAutoDBInfo.sql = " userName TEXT default ''  PRIMARY KEY ,  md5 TEXT,  userStoryFlag INTEGER,  newThumbUrl TEXT,  newVideoUrl TEXT,  updateTime LONG,  syncId LONG,  readId LONG,  storyPostTime INTEGER,  storyObjOneDay INTEGER,  readTime LONG,  preloadStoryId LONG,  preloadMediaId TEXT,  preLoadResource LONG,  duration LONG,  userInfo BLOB,  favoriteMd5 TEXT,  interactTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102677x8)) {
            return false;
        }
        C102677x8 x8Var = (C102677x8) iAutoDBItem;
        return C46238a.m51546a(this.field_userName, x8Var.field_userName) && C46238a.m51546a(this.field_md5, x8Var.field_md5) && C46238a.m51546a(Integer.valueOf(this.field_userStoryFlag), Integer.valueOf(x8Var.field_userStoryFlag)) && C46238a.m51546a(this.field_newThumbUrl, x8Var.field_newThumbUrl) && C46238a.m51546a(this.field_newVideoUrl, x8Var.field_newVideoUrl) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(x8Var.field_updateTime)) && C46238a.m51546a(Long.valueOf(this.field_syncId), Long.valueOf(x8Var.field_syncId)) && C46238a.m51546a(Long.valueOf(this.field_readId), Long.valueOf(x8Var.field_readId)) && C46238a.m51546a(Integer.valueOf(this.field_storyPostTime), Integer.valueOf(x8Var.field_storyPostTime)) && C46238a.m51546a(Integer.valueOf(this.field_storyObjOneDay), Integer.valueOf(x8Var.field_storyObjOneDay)) && C46238a.m51546a(Long.valueOf(this.field_readTime), Long.valueOf(x8Var.field_readTime)) && C46238a.m51546a(Long.valueOf(this.field_preloadStoryId), Long.valueOf(x8Var.field_preloadStoryId)) && C46238a.m51546a(this.field_preloadMediaId, x8Var.field_preloadMediaId) && C46238a.m51546a(Long.valueOf(this.field_preLoadResource), Long.valueOf(x8Var.field_preLoadResource)) && C46238a.m51546a(Long.valueOf(this.field_duration), Long.valueOf(x8Var.field_duration)) && C46238a.m51546a(this.field_userInfo, x8Var.field_userInfo) && C46238a.m51546a(this.field_favoriteMd5, x8Var.field_favoriteMd5) && C46238a.m51546a(Long.valueOf(this.field_interactTime), Long.valueOf(x8Var.field_interactTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f303149A == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                        this.f303172d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303150B == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303151C == hashCode) {
                    try {
                        this.field_userStoryFlag = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303152D == hashCode) {
                    try {
                        this.field_newThumbUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303153E == hashCode) {
                    try {
                        this.field_newVideoUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303154F == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303155G == hashCode) {
                    try {
                        this.field_syncId = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303156H == hashCode) {
                    try {
                        this.field_readId = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303157I == hashCode) {
                    try {
                        this.field_storyPostTime = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303158J == hashCode) {
                    try {
                        this.field_storyObjOneDay = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303159K == hashCode) {
                    try {
                        this.field_readTime = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303160L == hashCode) {
                    try {
                        this.field_preloadStoryId = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303161M == hashCode) {
                    try {
                        this.field_preloadMediaId = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303162N == hashCode) {
                    try {
                        this.field_preLoadResource = cursor.getLong(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303163P == hashCode) {
                    try {
                        this.field_duration = cursor.getLong(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303164Q == hashCode) {
                    try {
                        this.field_userInfo = cursor.getBlob(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303165R == hashCode) {
                    try {
                        this.field_favoriteMd5 = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303166S == hashCode) {
                    try {
                        this.field_interactTime = cursor.getLong(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303167T == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f303172d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f303173e) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f303174f) {
            contentValues.put("userStoryFlag", Integer.valueOf(this.field_userStoryFlag));
        }
        if (this.f303175g) {
            contentValues.put("newThumbUrl", this.field_newThumbUrl);
        }
        if (this.f303176h) {
            contentValues.put("newVideoUrl", this.field_newVideoUrl);
        }
        if (this.f303177i) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f303178j) {
            contentValues.put("syncId", Long.valueOf(this.field_syncId));
        }
        if (this.f303179n) {
            contentValues.put("readId", Long.valueOf(this.field_readId));
        }
        if (this.f303180o) {
            contentValues.put("storyPostTime", Integer.valueOf(this.field_storyPostTime));
        }
        if (this.f303181p) {
            contentValues.put("storyObjOneDay", Integer.valueOf(this.field_storyObjOneDay));
        }
        if (this.f303182q) {
            contentValues.put("readTime", Long.valueOf(this.field_readTime));
        }
        if (this.f303183r) {
            contentValues.put("preloadStoryId", Long.valueOf(this.field_preloadStoryId));
        }
        if (this.f303184s) {
            contentValues.put("preloadMediaId", this.field_preloadMediaId);
        }
        if (this.f303185t) {
            contentValues.put("preLoadResource", Long.valueOf(this.field_preLoadResource));
        }
        if (this.f303186u) {
            contentValues.put("duration", Long.valueOf(this.field_duration));
        }
        if (this.f303187v) {
            contentValues.put("userInfo", this.field_userInfo);
        }
        if (this.f303188w) {
            contentValues.put("favoriteMd5", this.field_favoriteMd5);
        }
        if (this.f303189x) {
            contentValues.put("interactTime", Long.valueOf(this.field_interactTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseStoryExtItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS StoryExtItem ( " + f303168U.sql + ");");
        for (String add : f303171z) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseStoryExtItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("StoryExtItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f303168U, "StoryExtItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseStoryExtItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("StoryExtItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseStoryExtItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f303168U;
    }

    public String[] getIndexCreateSQL() {
        return f303171z;
    }

    public StorageObserverOwner<C102677x8> getObserverOwner() {
        return f303169V;
    }

    public Object getPrimaryKeyValue() {
        return this.field_userName;
    }

    public SingleTable getTable() {
        return f303170y;
    }

    public String getTableName() {
        return f303170y.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f303172d = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f303173e = true;
            }
        }
        if (contentValues.containsKey("userStoryFlag")) {
            this.field_userStoryFlag = contentValues.getAsInteger("userStoryFlag").intValue();
            if (z) {
                this.f303174f = true;
            }
        }
        if (contentValues.containsKey("newThumbUrl")) {
            this.field_newThumbUrl = contentValues.getAsString("newThumbUrl");
            if (z) {
                this.f303175g = true;
            }
        }
        if (contentValues.containsKey("newVideoUrl")) {
            this.field_newVideoUrl = contentValues.getAsString("newVideoUrl");
            if (z) {
                this.f303176h = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f303177i = true;
            }
        }
        if (contentValues.containsKey("syncId")) {
            this.field_syncId = contentValues.getAsLong("syncId").longValue();
            if (z) {
                this.f303178j = true;
            }
        }
        if (contentValues.containsKey("readId")) {
            this.field_readId = contentValues.getAsLong("readId").longValue();
            if (z) {
                this.f303179n = true;
            }
        }
        if (contentValues.containsKey("storyPostTime")) {
            this.field_storyPostTime = contentValues.getAsInteger("storyPostTime").intValue();
            if (z) {
                this.f303180o = true;
            }
        }
        if (contentValues.containsKey("storyObjOneDay")) {
            this.field_storyObjOneDay = contentValues.getAsInteger("storyObjOneDay").intValue();
            if (z) {
                this.f303181p = true;
            }
        }
        if (contentValues.containsKey("readTime")) {
            this.field_readTime = contentValues.getAsLong("readTime").longValue();
            if (z) {
                this.f303182q = true;
            }
        }
        if (contentValues.containsKey("preloadStoryId")) {
            this.field_preloadStoryId = contentValues.getAsLong("preloadStoryId").longValue();
            if (z) {
                this.f303183r = true;
            }
        }
        if (contentValues.containsKey("preloadMediaId")) {
            this.field_preloadMediaId = contentValues.getAsString("preloadMediaId");
            if (z) {
                this.f303184s = true;
            }
        }
        if (contentValues.containsKey("preLoadResource")) {
            this.field_preLoadResource = contentValues.getAsLong("preLoadResource").longValue();
            if (z) {
                this.f303185t = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsLong("duration").longValue();
            if (z) {
                this.f303186u = true;
            }
        }
        if (contentValues.containsKey("userInfo")) {
            this.field_userInfo = contentValues.getAsByteArray("userInfo");
            if (z) {
                this.f303187v = true;
            }
        }
        if (contentValues.containsKey("favoriteMd5")) {
            this.field_favoriteMd5 = contentValues.getAsString("favoriteMd5");
            if (z) {
                this.f303188w = true;
            }
        }
        if (contentValues.containsKey("interactTime")) {
            this.field_interactTime = contentValues.getAsLong("interactTime").longValue();
            if (z) {
                this.f303189x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
