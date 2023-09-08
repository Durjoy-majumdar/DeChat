package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.dynamite.ProviderConstants;
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
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.C64417hb1;
import te3.C64783vq0;

/* renamed from: xh.e3 */
public class C66260e3 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f190536A = 1327350620;

    /* renamed from: B */
    public static final int f190537B = 1574310077;

    /* renamed from: C */
    public static final int f190538C = 90495162;

    /* renamed from: D */
    public static final int f190539D = 644739212;

    /* renamed from: E */
    public static final int f190540E = 833206634;

    /* renamed from: F */
    public static final int f190541F = 351608024;

    /* renamed from: G */
    public static final int f190542G = -1008490854;

    /* renamed from: H */
    public static final int f190543H = -1225389584;

    /* renamed from: I */
    public static final int f190544I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f190545J = initAutoDBInfo(C66260e3.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C66260e3> f190546K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f190547t;

    /* renamed from: u */
    public static final String[] f190548u = {"CREATE INDEX IF NOT EXISTS FinderDraftItem_local_index ON FinderDraftItem(localId)", "CREATE INDEX IF NOT EXISTS FinderDraftItem_create_time ON FinderDraftItem(createTime)", "CREATE INDEX IF NOT EXISTS FinderDraftItem__Local_Flag ON FinderDraftItem(localFlag)", "CREATE INDEX IF NOT EXISTS FinderDraftItem__Object_Type ON FinderDraftItem(objectType)", "CREATE INDEX IF NOT EXISTS FinderDraftItem_svr_index ON FinderDraftItem(objectId)"};

    /* renamed from: v */
    public static final int f190549v = 338409958;

    /* renamed from: w */
    public static final int f190550w = 1369213417;

    /* renamed from: x */
    public static final int f190551x = -1205623433;

    /* renamed from: y */
    public static final int f190552y = 617079897;

    /* renamed from: z */
    public static final int f190553z = 1066856217;

    /* renamed from: d */
    public boolean f190554d = true;

    /* renamed from: e */
    public boolean f190555e = true;

    /* renamed from: f */
    public boolean f190556f = true;
    public int field_createTime;
    public int field_dbversion;
    public long field_extraInfoFlag;
    public C64783vq0 field_finderItem;
    public int field_localFlag;
    public long field_localId;
    public int field_markDeleted;
    public long field_objectId;
    public int field_objectType;
    public C64417hb1 field_originMvInfo;
    public String field_postIntent;
    public int field_version;
    public int field_watermarkFlag;

    /* renamed from: g */
    public boolean f190557g = true;

    /* renamed from: h */
    public boolean f190558h = true;

    /* renamed from: i */
    public boolean f190559i = true;

    /* renamed from: j */
    public boolean f190560j = true;

    /* renamed from: n */
    public boolean f190561n = true;

    /* renamed from: o */
    public boolean f190562o = true;

    /* renamed from: p */
    public boolean f190563p = true;

    /* renamed from: q */
    public boolean f190564q = true;

    /* renamed from: r */
    public boolean f190565r = true;

    /* renamed from: s */
    public boolean f190566s = true;

    static {
        SingleTable singleTable = new SingleTable("FinderDraftItem");
        f190547t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "long", singleTable.getName(), "");
        new Column("createTime", "int", singleTable.getName(), "");
        new Column("localFlag", "int", singleTable.getName(), "");
        new Column("finderItem", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderItemPb");
        new Column("objectType", "int", singleTable.getName(), "");
        new Column("postIntent", "string", singleTable.getName(), "");
        new Column("originMvInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderMVInfo");
        new Column("objectId", "long", singleTable.getName(), "");
        new Column("markDeleted", "int", singleTable.getName(), "");
        new Column("extraInfoFlag", "long", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "int", singleTable.getName(), "");
        new Column("dbversion", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_WATERMARKFLAG, "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = C66261f3.COL_LOCALID;
        mAutoDBInfo.columns[1] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "INTEGER");
        mAutoDBInfo.columns[2] = "localFlag";
        mAutoDBInfo.colsMap.put("localFlag", "INTEGER");
        mAutoDBInfo.columns[3] = "finderItem";
        mAutoDBInfo.colsMap.put("finderItem", "BLOB");
        mAutoDBInfo.columns[4] = "objectType";
        mAutoDBInfo.colsMap.put("objectType", "INTEGER");
        mAutoDBInfo.columns[5] = "postIntent";
        mAutoDBInfo.colsMap.put("postIntent", "TEXT");
        mAutoDBInfo.columns[6] = "originMvInfo";
        mAutoDBInfo.colsMap.put("originMvInfo", "BLOB");
        mAutoDBInfo.columns[7] = "objectId";
        mAutoDBInfo.colsMap.put("objectId", "LONG default '0' ");
        mAutoDBInfo.columns[8] = "markDeleted";
        mAutoDBInfo.colsMap.put("markDeleted", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "extraInfoFlag";
        mAutoDBInfo.colsMap.put("extraInfoFlag", "LONG default '0' ");
        mAutoDBInfo.columns[10] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "dbversion";
        mAutoDBInfo.colsMap.put("dbversion", "INTEGER default '0' ");
        mAutoDBInfo.columns[12] = C66261f3.COL_WATERMARKFLAG;
        mAutoDBInfo.colsMap.put(C66261f3.COL_WATERMARKFLAG, "INTEGER");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " localId LONG PRIMARY KEY ,  createTime INTEGER,  localFlag INTEGER,  finderItem BLOB,  objectType INTEGER,  postIntent TEXT,  originMvInfo BLOB,  objectId LONG default '0' ,  markDeleted INTEGER default '0' ,  extraInfoFlag LONG default '0' ,  version INTEGER default '0' ,  dbversion INTEGER default '0' ,  watermarkFlag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66260e3)) {
            return false;
        }
        C66260e3 e3Var = (C66260e3) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_localId), Long.valueOf(e3Var.field_localId)) && C46238a.m51546a(Integer.valueOf(this.field_createTime), Integer.valueOf(e3Var.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_localFlag), Integer.valueOf(e3Var.field_localFlag)) && C46238a.m51546a(this.field_finderItem, e3Var.field_finderItem) && C46238a.m51546a(Integer.valueOf(this.field_objectType), Integer.valueOf(e3Var.field_objectType)) && C46238a.m51546a(this.field_postIntent, e3Var.field_postIntent) && C46238a.m51546a(this.field_originMvInfo, e3Var.field_originMvInfo) && C46238a.m51546a(Long.valueOf(this.field_objectId), Long.valueOf(e3Var.field_objectId)) && C46238a.m51546a(Integer.valueOf(this.field_markDeleted), Integer.valueOf(e3Var.field_markDeleted)) && C46238a.m51546a(Long.valueOf(this.field_extraInfoFlag), Long.valueOf(e3Var.field_extraInfoFlag)) && C46238a.m51546a(Integer.valueOf(this.field_version), Integer.valueOf(e3Var.field_version)) && C46238a.m51546a(Integer.valueOf(this.field_dbversion), Integer.valueOf(e3Var.field_dbversion)) && C46238a.m51546a(Integer.valueOf(this.field_watermarkFlag), Integer.valueOf(e3Var.field_watermarkFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f190549v == hashCode) {
                    try {
                        this.field_localId = cursor.getLong(i);
                        this.f190554d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190550w == hashCode) {
                    try {
                        this.field_createTime = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190551x == hashCode) {
                    try {
                        this.field_localFlag = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190552y == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_finderItem = (C64783vq0) new C64783vq0().parseFrom(blob);
                        }
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190553z == hashCode) {
                    try {
                        this.field_objectType = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190536A == hashCode) {
                    try {
                        this.field_postIntent = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190537B == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_originMvInfo = (C64417hb1) new C64417hb1().parseFrom(blob2);
                        }
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190538C == hashCode) {
                    try {
                        this.field_objectId = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190539D == hashCode) {
                    try {
                        this.field_markDeleted = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190540E == hashCode) {
                    try {
                        this.field_extraInfoFlag = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190541F == hashCode) {
                    try {
                        this.field_version = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190542G == hashCode) {
                    try {
                        this.field_dbversion = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190543H == hashCode) {
                    try {
                        this.field_watermarkFlag = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190544I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C64417hb1 hb12;
        C64783vq0 vq02;
        ContentValues contentValues = new ContentValues();
        if (this.f190554d) {
            contentValues.put(C66261f3.COL_LOCALID, Long.valueOf(this.field_localId));
        }
        if (this.f190555e) {
            contentValues.put("createTime", Integer.valueOf(this.field_createTime));
        }
        if (this.f190556f) {
            contentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
        }
        if (this.f190557g && (vq02 = this.field_finderItem) != null) {
            try {
                contentValues.put("finderItem", vq02.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDraftItem", e.getMessage());
            }
        }
        if (this.f190558h) {
            contentValues.put("objectType", Integer.valueOf(this.field_objectType));
        }
        if (this.f190559i) {
            contentValues.put("postIntent", this.field_postIntent);
        }
        if (this.f190560j && (hb12 = this.field_originMvInfo) != null) {
            try {
                contentValues.put("originMvInfo", hb12.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDraftItem", e2.getMessage());
            }
        }
        if (this.f190561n) {
            contentValues.put("objectId", Long.valueOf(this.field_objectId));
        }
        if (this.f190562o) {
            contentValues.put("markDeleted", Integer.valueOf(this.field_markDeleted));
        }
        if (this.f190563p) {
            contentValues.put("extraInfoFlag", Long.valueOf(this.field_extraInfoFlag));
        }
        if (this.f190564q) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(this.field_version));
        }
        if (this.f190565r) {
            contentValues.put("dbversion", Integer.valueOf(this.field_dbversion));
        }
        if (this.f190566s) {
            contentValues.put(C66261f3.COL_WATERMARKFLAG, Integer.valueOf(this.field_watermarkFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderDraftItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderDraftItem ( " + f190545J.sql + ");");
        for (String add : f190548u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderDraftItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderDraftItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f190545J, "FinderDraftItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderDraftItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderDraftItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderDraftItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190545J;
    }

    public String[] getIndexCreateSQL() {
        return f190548u;
    }

    public StorageObserverOwner<C66260e3> getObserverOwner() {
        return f190546K;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_localId);
    }

    public SingleTable getTable() {
        return f190547t;
    }

    public String getTableName() {
        return f190547t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(C66261f3.COL_LOCALID).longValue();
            if (z) {
                this.f190554d = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z) {
                this.f190555e = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z) {
                this.f190556f = true;
            }
        }
        if (contentValues.containsKey("finderItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("finderItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_finderItem = (C64783vq0) new C64783vq0().parseFrom(asByteArray);
                    if (z) {
                        this.f190557g = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDraftItem", e.getMessage());
            }
        }
        if (contentValues.containsKey("objectType")) {
            this.field_objectType = contentValues.getAsInteger("objectType").intValue();
            if (z) {
                this.f190558h = true;
            }
        }
        if (contentValues.containsKey("postIntent")) {
            this.field_postIntent = contentValues.getAsString("postIntent");
            if (z) {
                this.f190559i = true;
            }
        }
        if (contentValues.containsKey("originMvInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("originMvInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_originMvInfo = (C64417hb1) new C64417hb1().parseFrom(asByteArray2);
                    if (z) {
                        this.f190560j = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDraftItem", e2.getMessage());
            }
        }
        if (contentValues.containsKey("objectId")) {
            this.field_objectId = contentValues.getAsLong("objectId").longValue();
            if (z) {
                this.f190561n = true;
            }
        }
        if (contentValues.containsKey("markDeleted")) {
            this.field_markDeleted = contentValues.getAsInteger("markDeleted").intValue();
            if (z) {
                this.f190562o = true;
            }
        }
        if (contentValues.containsKey("extraInfoFlag")) {
            this.field_extraInfoFlag = contentValues.getAsLong("extraInfoFlag").longValue();
            if (z) {
                this.f190563p = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsInteger(ProviderConstants.API_COLNAME_FEATURE_VERSION).intValue();
            if (z) {
                this.f190564q = true;
            }
        }
        if (contentValues.containsKey("dbversion")) {
            this.field_dbversion = contentValues.getAsInteger("dbversion").intValue();
            if (z) {
                this.f190565r = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_WATERMARKFLAG)) {
            this.field_watermarkFlag = contentValues.getAsInteger(C66261f3.COL_WATERMARKFLAG).intValue();
            if (z) {
                this.f190566s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
