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
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.C64854ye0;

/* renamed from: xh.d9 */
public class C66259d9 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f190505A = 109254796;

    /* renamed from: B */
    public static final int f190506B = 109757585;

    /* renamed from: C */
    public static final int f190507C = 1851542532;

    /* renamed from: D */
    public static final int f190508D = 757010317;

    /* renamed from: E */
    public static final int f190509E = 1928166420;

    /* renamed from: F */
    public static final int f190510F = -10073996;

    /* renamed from: G */
    public static final int f190511G = 838484914;

    /* renamed from: H */
    public static final int f190512H = 564765001;

    /* renamed from: I */
    public static final int f190513I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f190514J = initAutoDBInfo(C66259d9.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C66259d9> f190515K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f190516t;

    /* renamed from: u */
    public static final String[] f190517u = {"CREATE INDEX IF NOT EXISTS Finder_Local_Comment_Id ON UniAction(localCommentId)", "CREATE INDEX IF NOT EXISTS FinderAction_Feed_Id ON UniAction(feedId)", "CREATE INDEX IF NOT EXISTS Finder_Feed_CreateTime ON UniAction(actionTime)", "CREATE INDEX IF NOT EXISTS Finder_Feed_ActionType ON UniAction(actionType)", "CREATE INDEX IF NOT EXISTS Finder_Reply_state ON UniAction(state)"};

    /* renamed from: v */
    public static final int f190518v = 1175274671;

    /* renamed from: w */
    public static final int f190519w = -1278410919;

    /* renamed from: x */
    public static final int f190520x = 1851865635;

    /* renamed from: y */
    public static final int f190521y = 1851881104;

    /* renamed from: z */
    public static final int f190522z = -1362583253;

    /* renamed from: d */
    public boolean f190523d = true;

    /* renamed from: e */
    public boolean f190524e = true;

    /* renamed from: f */
    public boolean f190525f = true;
    public C64854ye0 field_actionInfo;
    public long field_actionTime;
    public int field_actionType;
    public int field_canRemove;
    public int field_failedFlag;
    public long field_feedId;
    public long field_lastTryTime;
    public long field_localCommentId;
    public String field_objectNonceId;
    public long field_postTime;
    public int field_scene;
    public int field_state;
    public long field_tryCount;

    /* renamed from: g */
    public boolean f190526g = true;

    /* renamed from: h */
    public boolean f190527h = true;

    /* renamed from: i */
    public boolean f190528i = true;

    /* renamed from: j */
    public boolean f190529j = true;

    /* renamed from: n */
    public boolean f190530n = true;

    /* renamed from: o */
    public boolean f190531o = true;

    /* renamed from: p */
    public boolean f190532p = true;

    /* renamed from: q */
    public boolean f190533q = true;

    /* renamed from: r */
    public boolean f190534r = true;

    /* renamed from: s */
    public boolean f190535s = true;

    static {
        SingleTable singleTable = new SingleTable("UniAction");
        f190516t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("localCommentId", "long", singleTable.getName(), "");
        new Column("feedId", "long", singleTable.getName(), "");
        new Column("actionTime", "long", singleTable.getName(), "");
        new Column("actionType", "int", singleTable.getName(), "");
        new Column("objectNonceId", "string", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
        new Column("actionInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderActionPb");
        new Column("postTime", "long", singleTable.getName(), "");
        new Column("tryCount", "long", singleTable.getName(), "");
        new Column("canRemove", "int", singleTable.getName(), "");
        new Column("lastTryTime", "long", singleTable.getName(), "");
        new Column("failedFlag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "localCommentId";
        mAutoDBInfo.colsMap.put("localCommentId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "localCommentId";
        mAutoDBInfo.columns[1] = "feedId";
        mAutoDBInfo.colsMap.put("feedId", "LONG");
        mAutoDBInfo.columns[2] = "actionTime";
        mAutoDBInfo.colsMap.put("actionTime", "LONG");
        mAutoDBInfo.columns[3] = "actionType";
        mAutoDBInfo.colsMap.put("actionType", "INTEGER");
        mAutoDBInfo.columns[4] = "objectNonceId";
        mAutoDBInfo.colsMap.put("objectNonceId", "TEXT");
        mAutoDBInfo.columns[5] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[6] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER");
        mAutoDBInfo.columns[7] = "actionInfo";
        mAutoDBInfo.colsMap.put("actionInfo", "BLOB");
        mAutoDBInfo.columns[8] = "postTime";
        mAutoDBInfo.colsMap.put("postTime", "LONG");
        mAutoDBInfo.columns[9] = "tryCount";
        mAutoDBInfo.colsMap.put("tryCount", "LONG");
        mAutoDBInfo.columns[10] = "canRemove";
        mAutoDBInfo.colsMap.put("canRemove", "INTEGER");
        mAutoDBInfo.columns[11] = "lastTryTime";
        mAutoDBInfo.colsMap.put("lastTryTime", "LONG");
        mAutoDBInfo.columns[12] = "failedFlag";
        mAutoDBInfo.colsMap.put("failedFlag", "INTEGER");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " localCommentId LONG PRIMARY KEY ,  feedId LONG,  actionTime LONG,  actionType INTEGER,  objectNonceId TEXT,  scene INTEGER,  state INTEGER,  actionInfo BLOB,  postTime LONG,  tryCount LONG,  canRemove INTEGER,  lastTryTime LONG,  failedFlag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66259d9)) {
            return false;
        }
        C66259d9 d9Var = (C66259d9) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_localCommentId), Long.valueOf(d9Var.field_localCommentId)) && C46238a.m51546a(Long.valueOf(this.field_feedId), Long.valueOf(d9Var.field_feedId)) && C46238a.m51546a(Long.valueOf(this.field_actionTime), Long.valueOf(d9Var.field_actionTime)) && C46238a.m51546a(Integer.valueOf(this.field_actionType), Integer.valueOf(d9Var.field_actionType)) && C46238a.m51546a(this.field_objectNonceId, d9Var.field_objectNonceId) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(d9Var.field_scene)) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(d9Var.field_state)) && C46238a.m51546a(this.field_actionInfo, d9Var.field_actionInfo) && C46238a.m51546a(Long.valueOf(this.field_postTime), Long.valueOf(d9Var.field_postTime)) && C46238a.m51546a(Long.valueOf(this.field_tryCount), Long.valueOf(d9Var.field_tryCount)) && C46238a.m51546a(Integer.valueOf(this.field_canRemove), Integer.valueOf(d9Var.field_canRemove)) && C46238a.m51546a(Long.valueOf(this.field_lastTryTime), Long.valueOf(d9Var.field_lastTryTime)) && C46238a.m51546a(Integer.valueOf(this.field_failedFlag), Integer.valueOf(d9Var.field_failedFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f190518v == hashCode) {
                    try {
                        this.field_localCommentId = cursor.getLong(i);
                        this.f190523d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190519w == hashCode) {
                    try {
                        this.field_feedId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190520x == hashCode) {
                    try {
                        this.field_actionTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190521y == hashCode) {
                    try {
                        this.field_actionType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190522z == hashCode) {
                    try {
                        this.field_objectNonceId = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190505A == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190506B == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190507C == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_actionInfo = (C64854ye0) new C64854ye0().parseFrom(blob);
                        }
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190508D == hashCode) {
                    try {
                        this.field_postTime = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190509E == hashCode) {
                    try {
                        this.field_tryCount = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190510F == hashCode) {
                    try {
                        this.field_canRemove = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190511G == hashCode) {
                    try {
                        this.field_lastTryTime = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190512H == hashCode) {
                    try {
                        this.field_failedFlag = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190513I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C64854ye0 ye02;
        ContentValues contentValues = new ContentValues();
        if (this.f190523d) {
            contentValues.put("localCommentId", Long.valueOf(this.field_localCommentId));
        }
        if (this.f190524e) {
            contentValues.put("feedId", Long.valueOf(this.field_feedId));
        }
        if (this.f190525f) {
            contentValues.put("actionTime", Long.valueOf(this.field_actionTime));
        }
        if (this.f190526g) {
            contentValues.put("actionType", Integer.valueOf(this.field_actionType));
        }
        if (this.f190527h) {
            contentValues.put("objectNonceId", this.field_objectNonceId);
        }
        if (this.f190528i) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f190529j) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f190530n && (ye02 = this.field_actionInfo) != null) {
            try {
                contentValues.put("actionInfo", ye02.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseUniAction", e.getMessage());
            }
        }
        if (this.f190531o) {
            contentValues.put("postTime", Long.valueOf(this.field_postTime));
        }
        if (this.f190532p) {
            contentValues.put("tryCount", Long.valueOf(this.field_tryCount));
        }
        if (this.f190533q) {
            contentValues.put("canRemove", Integer.valueOf(this.field_canRemove));
        }
        if (this.f190534r) {
            contentValues.put("lastTryTime", Long.valueOf(this.field_lastTryTime));
        }
        if (this.f190535s) {
            contentValues.put("failedFlag", Integer.valueOf(this.field_failedFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseUniAction", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS UniAction ( " + f190514J.sql + ");");
        for (String add : f190517u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseUniAction", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("UniAction", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f190514J, "UniAction", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseUniAction", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("UniAction", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseUniAction", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190514J;
    }

    public String[] getIndexCreateSQL() {
        return f190517u;
    }

    public StorageObserverOwner<C66259d9> getObserverOwner() {
        return f190515K;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_localCommentId);
    }

    public SingleTable getTable() {
        return f190516t;
    }

    public String getTableName() {
        return f190516t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("localCommentId")) {
            this.field_localCommentId = contentValues.getAsLong("localCommentId").longValue();
            if (z) {
                this.f190523d = true;
            }
        }
        if (contentValues.containsKey("feedId")) {
            this.field_feedId = contentValues.getAsLong("feedId").longValue();
            if (z) {
                this.f190524e = true;
            }
        }
        if (contentValues.containsKey("actionTime")) {
            this.field_actionTime = contentValues.getAsLong("actionTime").longValue();
            if (z) {
                this.f190525f = true;
            }
        }
        if (contentValues.containsKey("actionType")) {
            this.field_actionType = contentValues.getAsInteger("actionType").intValue();
            if (z) {
                this.f190526g = true;
            }
        }
        if (contentValues.containsKey("objectNonceId")) {
            this.field_objectNonceId = contentValues.getAsString("objectNonceId");
            if (z) {
                this.f190527h = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f190528i = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f190529j = true;
            }
        }
        if (contentValues.containsKey("actionInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("actionInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_actionInfo = (C64854ye0) new C64854ye0().parseFrom(asByteArray);
                    if (z) {
                        this.f190530n = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseUniAction", e.getMessage());
            }
        }
        if (contentValues.containsKey("postTime")) {
            this.field_postTime = contentValues.getAsLong("postTime").longValue();
            if (z) {
                this.f190531o = true;
            }
        }
        if (contentValues.containsKey("tryCount")) {
            this.field_tryCount = contentValues.getAsLong("tryCount").longValue();
            if (z) {
                this.f190532p = true;
            }
        }
        if (contentValues.containsKey("canRemove")) {
            this.field_canRemove = contentValues.getAsInteger("canRemove").intValue();
            if (z) {
                this.f190533q = true;
            }
        }
        if (contentValues.containsKey("lastTryTime")) {
            this.field_lastTryTime = contentValues.getAsLong("lastTryTime").longValue();
            if (z) {
                this.f190534r = true;
            }
        }
        if (contentValues.containsKey("failedFlag")) {
            this.field_failedFlag = contentValues.getAsInteger("failedFlag").intValue();
            if (z) {
                this.f190535s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
