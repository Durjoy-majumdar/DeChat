package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
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
import te3.C51978xi1;

/* renamed from: xh.w3 */
public class C66277w3 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f190701A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f190702B = initAutoDBInfo(C66277w3.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C66277w3> f190703C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f190704p;

    /* renamed from: q */
    public static final String[] f190705q = {"CREATE INDEX IF NOT EXISTS Finder_RedDot_tips_id ON FinderRedDotInfo(tipsId)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_revoke_id ON FinderRedDotInfo(revokeId)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_ctrType ON FinderRedDotInfo(ctrType)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_expiredTime ON FinderRedDotInfo(expiredTime)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_ai_scene ON FinderRedDotInfo(aiScene)"};

    /* renamed from: r */
    public static final int f190706r = -873566605;

    /* renamed from: s */
    public static final int f190707s = 1097097839;

    /* renamed from: t */
    public static final int f190708t = 3560141;

    /* renamed from: u */
    public static final int f190709u = -255488447;

    /* renamed from: v */
    public static final int f190710v = 1236302788;

    /* renamed from: w */
    public static final int f190711w = 1097436411;

    /* renamed from: x */
    public static final int f190712x = -92515438;

    /* renamed from: y */
    public static final int f190713y = -1020693180;

    /* renamed from: z */
    public static final int f190714z = -265713450;

    /* renamed from: d */
    public boolean f190715d = true;

    /* renamed from: e */
    public boolean f190716e = true;

    /* renamed from: f */
    public boolean f190717f = true;
    public long field_aiScene;
    public C51978xi1 field_ctrInfo;
    public int field_ctrType;
    public long field_expiredTime;
    public String field_revokeId;
    public long field_time;
    public String field_tipsId;
    public FinderTipsShowEntranceExtInfo field_tipsShowEntranceExtInfo;
    public String field_username;

    /* renamed from: g */
    public boolean f190718g = true;

    /* renamed from: h */
    public boolean f190719h = true;

    /* renamed from: i */
    public boolean f190720i = true;

    /* renamed from: j */
    public boolean f190721j = true;

    /* renamed from: n */
    public boolean f190722n = true;

    /* renamed from: o */
    public boolean f190723o = true;

    static {
        SingleTable singleTable = new SingleTable("FinderRedDotInfo");
        f190704p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("tipsId", "string", singleTable.getName(), "");
        new Column("ctrInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderRedDotCtrlInfo");
        new Column("time", "long", singleTable.getName(), "");
        new Column("revokeId", "string", singleTable.getName(), "");
        new Column("tipsShowEntranceExtInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo");
        new Column("ctrType", "int", singleTable.getName(), "");
        new Column("expiredTime", "long", singleTable.getName(), "");
        new Column("aiScene", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "tipsId";
        mAutoDBInfo.colsMap.put("tipsId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "tipsId";
        mAutoDBInfo.columns[1] = "ctrInfo";
        mAutoDBInfo.colsMap.put("ctrInfo", "BLOB");
        mAutoDBInfo.columns[2] = "time";
        mAutoDBInfo.colsMap.put("time", "LONG");
        mAutoDBInfo.columns[3] = "revokeId";
        mAutoDBInfo.colsMap.put("revokeId", "TEXT");
        mAutoDBInfo.columns[4] = "tipsShowEntranceExtInfo";
        mAutoDBInfo.colsMap.put("tipsShowEntranceExtInfo", "BLOB");
        mAutoDBInfo.columns[5] = "ctrType";
        mAutoDBInfo.colsMap.put("ctrType", "INTEGER");
        mAutoDBInfo.columns[6] = "expiredTime";
        mAutoDBInfo.colsMap.put("expiredTime", "LONG");
        mAutoDBInfo.columns[7] = "aiScene";
        mAutoDBInfo.colsMap.put("aiScene", "LONG");
        mAutoDBInfo.columns[8] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default '' ");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " tipsId TEXT PRIMARY KEY ,  ctrInfo BLOB,  time LONG,  revokeId TEXT,  tipsShowEntranceExtInfo BLOB,  ctrType INTEGER,  expiredTime LONG,  aiScene LONG,  username TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66277w3)) {
            return false;
        }
        C66277w3 w3Var = (C66277w3) iAutoDBItem;
        return C46238a.m51546a(this.field_tipsId, w3Var.field_tipsId) && C46238a.m51546a(this.field_ctrInfo, w3Var.field_ctrInfo) && C46238a.m51546a(Long.valueOf(this.field_time), Long.valueOf(w3Var.field_time)) && C46238a.m51546a(this.field_revokeId, w3Var.field_revokeId) && C46238a.m51546a(this.field_tipsShowEntranceExtInfo, w3Var.field_tipsShowEntranceExtInfo) && C46238a.m51546a(Integer.valueOf(this.field_ctrType), Integer.valueOf(w3Var.field_ctrType)) && C46238a.m51546a(Long.valueOf(this.field_expiredTime), Long.valueOf(w3Var.field_expiredTime)) && C46238a.m51546a(Long.valueOf(this.field_aiScene), Long.valueOf(w3Var.field_aiScene)) && C46238a.m51546a(this.field_username, w3Var.field_username);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f190706r == hashCode) {
                    try {
                        this.field_tipsId = cursor.getString(i);
                        this.f190715d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190707s == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_ctrInfo = (C51978xi1) new C51978xi1().parseFrom(blob);
                        }
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190708t == hashCode) {
                    try {
                        this.field_time = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190709u == hashCode) {
                    try {
                        this.field_revokeId = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190710v == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_tipsShowEntranceExtInfo = (FinderTipsShowEntranceExtInfo) new FinderTipsShowEntranceExtInfo().parseFrom(blob2);
                        }
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190711w == hashCode) {
                    try {
                        this.field_ctrType = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190712x == hashCode) {
                    try {
                        this.field_expiredTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190713y == hashCode) {
                    try {
                        this.field_aiScene = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190714z == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190701A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo;
        C51978xi1 xi12;
        ContentValues contentValues = new ContentValues();
        if (this.f190715d) {
            contentValues.put("tipsId", this.field_tipsId);
        }
        if (this.f190716e && (xi12 = this.field_ctrInfo) != null) {
            try {
                contentValues.put("ctrInfo", xi12.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderRedDotInfo", e.getMessage());
            }
        }
        if (this.f190717f) {
            contentValues.put("time", Long.valueOf(this.field_time));
        }
        if (this.f190718g) {
            contentValues.put("revokeId", this.field_revokeId);
        }
        if (this.f190719h && (finderTipsShowEntranceExtInfo = this.field_tipsShowEntranceExtInfo) != null) {
            try {
                contentValues.put("tipsShowEntranceExtInfo", finderTipsShowEntranceExtInfo.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderRedDotInfo", e2.getMessage());
            }
        }
        if (this.f190720i) {
            contentValues.put("ctrType", Integer.valueOf(this.field_ctrType));
        }
        if (this.f190721j) {
            contentValues.put("expiredTime", Long.valueOf(this.field_expiredTime));
        }
        if (this.f190722n) {
            contentValues.put("aiScene", Long.valueOf(this.field_aiScene));
        }
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f190723o) {
            contentValues.put("username", this.field_username);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderRedDotInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderRedDotInfo ( " + f190702B.sql + ");");
        for (String add : f190705q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderRedDotInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderRedDotInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f190702B, "FinderRedDotInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderRedDotInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderRedDotInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderRedDotInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190702B;
    }

    public String[] getIndexCreateSQL() {
        return f190705q;
    }

    public StorageObserverOwner<C66277w3> getObserverOwner() {
        return f190703C;
    }

    public Object getPrimaryKeyValue() {
        return this.field_tipsId;
    }

    public SingleTable getTable() {
        return f190704p;
    }

    public String getTableName() {
        return f190704p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("tipsId")) {
            this.field_tipsId = contentValues.getAsString("tipsId");
            if (z) {
                this.f190715d = true;
            }
        }
        if (contentValues.containsKey("ctrInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("ctrInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_ctrInfo = (C51978xi1) new C51978xi1().parseFrom(asByteArray);
                    if (z) {
                        this.f190716e = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderRedDotInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z) {
                this.f190717f = true;
            }
        }
        if (contentValues.containsKey("revokeId")) {
            this.field_revokeId = contentValues.getAsString("revokeId");
            if (z) {
                this.f190718g = true;
            }
        }
        if (contentValues.containsKey("tipsShowEntranceExtInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("tipsShowEntranceExtInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_tipsShowEntranceExtInfo = (FinderTipsShowEntranceExtInfo) new FinderTipsShowEntranceExtInfo().parseFrom(asByteArray2);
                    if (z) {
                        this.f190719h = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderRedDotInfo", e2.getMessage());
            }
        }
        if (contentValues.containsKey("ctrType")) {
            this.field_ctrType = contentValues.getAsInteger("ctrType").intValue();
            if (z) {
                this.f190720i = true;
            }
        }
        if (contentValues.containsKey("expiredTime")) {
            this.field_expiredTime = contentValues.getAsLong("expiredTime").longValue();
            if (z) {
                this.f190721j = true;
            }
        }
        if (contentValues.containsKey("aiScene")) {
            this.field_aiScene = contentValues.getAsLong("aiScene").longValue();
            if (z) {
                this.f190722n = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f190723o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
