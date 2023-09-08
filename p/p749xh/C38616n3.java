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

/* renamed from: xh.n3 */
public class C38616n3 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f103064A = 1225207443;

    /* renamed from: B */
    public static final int f103065B = 966165798;

    /* renamed from: C */
    public static final int f103066C = -873566605;

    /* renamed from: D */
    public static final int f103067D = -1102434521;

    /* renamed from: E */
    public static final int f103068E = -1715674519;

    /* renamed from: F */
    public static final int f103069F = -544951136;

    /* renamed from: G */
    public static final int f103070G = -715330413;

    /* renamed from: H */
    public static final int f103071H = 350892871;

    /* renamed from: I */
    public static final int f103072I = -1278410919;

    /* renamed from: J */
    public static final int f103073J = 1585269267;

    /* renamed from: K */
    public static final int f103074K = 108705909;

    /* renamed from: L */
    public static final IAutoDBItem.MAutoDBInfo f103075L = initAutoDBInfo(C38616n3.class);

    /* renamed from: M */
    public static final StorageObserverOwner<C38616n3> f103076M = new StorageObserverOwner<>();

    /* renamed from: u */
    public static final SingleTable f103077u;

    /* renamed from: v */
    public static final String[] f103078v = {"CREATE INDEX IF NOT EXISTS FinderLiveNotifyExposureInfo_revokeId_index ON FinderLiveNotifyExposureInfo(revokeId)", "CREATE INDEX IF NOT EXISTS FinderLiveNotifyExposureInfo_msgId_index ON FinderLiveNotifyExposureInfo(msgId)", "CREATE INDEX IF NOT EXISTS FinderLiveNotifyExposureInfo_liveId ON FinderLiveNotifyExposureInfo(liveId)"};

    /* renamed from: w */
    public static final int f103079w = -255488447;

    /* renamed from: x */
    public static final int f103080x = 104191100;

    /* renamed from: y */
    public static final int f103081y = 207624153;

    /* renamed from: z */
    public static final int f103082z = 870321150;

    /* renamed from: d */
    public boolean f103083d = true;

    /* renamed from: e */
    public boolean f103084e = true;

    /* renamed from: f */
    public boolean f103085f = true;
    public byte[] field_businessBuf;
    public String field_bypInfo;
    public int field_controlFlag;
    public int field_ctrlInfoType;
    public int field_exposureStatus;
    public String field_feedId;
    public String field_forcePushId;
    public long field_insertTime;
    public String field_liveId;
    public int field_liveStatus;
    public long field_msgId;
    public String field_noticeId;
    public String field_revokeId;
    public String field_tipsId;

    /* renamed from: g */
    public boolean f103086g = true;

    /* renamed from: h */
    public boolean f103087h = true;

    /* renamed from: i */
    public boolean f103088i = true;

    /* renamed from: j */
    public boolean f103089j = true;

    /* renamed from: n */
    public boolean f103090n = true;

    /* renamed from: o */
    public boolean f103091o = true;

    /* renamed from: p */
    public boolean f103092p = true;

    /* renamed from: q */
    public boolean f103093q = true;

    /* renamed from: r */
    public boolean f103094r = true;

    /* renamed from: s */
    public boolean f103095s = true;

    /* renamed from: t */
    public boolean f103096t = true;

    static {
        SingleTable singleTable = new SingleTable("FinderLiveNotifyExposureInfo");
        f103077u = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("revokeId", "string", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("exposureStatus", "int", singleTable.getName(), "");
        new Column("liveStatus", "int", singleTable.getName(), "");
        new Column("businessBuf", "byte[]", singleTable.getName(), "");
        new Column("insertTime", "long", singleTable.getName(), "");
        new Column("tipsId", "string", singleTable.getName(), "");
        new Column("liveId", "string", singleTable.getName(), "");
        new Column("controlFlag", "int", singleTable.getName(), "");
        new Column("forcePushId", "string", singleTable.getName(), "");
        new Column("ctrlInfoType", "int", singleTable.getName(), "");
        new Column("bypInfo", "string", singleTable.getName(), "");
        new Column("feedId", "string", singleTable.getName(), "");
        new Column("noticeId", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[14];
        String[] strArr = new String[15];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "revokeId";
        mAutoDBInfo.colsMap.put("revokeId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "revokeId";
        mAutoDBInfo.columns[1] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG");
        mAutoDBInfo.columns[2] = "exposureStatus";
        mAutoDBInfo.colsMap.put("exposureStatus", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "liveStatus";
        mAutoDBInfo.colsMap.put("liveStatus", "INTEGER default '1' ");
        mAutoDBInfo.columns[4] = "businessBuf";
        mAutoDBInfo.colsMap.put("businessBuf", "BLOB");
        mAutoDBInfo.columns[5] = "insertTime";
        mAutoDBInfo.colsMap.put("insertTime", "LONG");
        mAutoDBInfo.columns[6] = "tipsId";
        mAutoDBInfo.colsMap.put("tipsId", "TEXT");
        mAutoDBInfo.columns[7] = "liveId";
        mAutoDBInfo.colsMap.put("liveId", "TEXT");
        mAutoDBInfo.columns[8] = "controlFlag";
        mAutoDBInfo.colsMap.put("controlFlag", "INTEGER");
        mAutoDBInfo.columns[9] = "forcePushId";
        mAutoDBInfo.colsMap.put("forcePushId", "TEXT");
        mAutoDBInfo.columns[10] = "ctrlInfoType";
        mAutoDBInfo.colsMap.put("ctrlInfoType", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "bypInfo";
        mAutoDBInfo.colsMap.put("bypInfo", "TEXT");
        mAutoDBInfo.columns[12] = "feedId";
        mAutoDBInfo.colsMap.put("feedId", "TEXT");
        mAutoDBInfo.columns[13] = "noticeId";
        mAutoDBInfo.colsMap.put("noticeId", "TEXT");
        mAutoDBInfo.columns[14] = "rowid";
        mAutoDBInfo.sql = " revokeId TEXT PRIMARY KEY ,  msgId LONG,  exposureStatus INTEGER default '0' ,  liveStatus INTEGER default '1' ,  businessBuf BLOB,  insertTime LONG,  tipsId TEXT,  liveId TEXT,  controlFlag INTEGER,  forcePushId TEXT,  ctrlInfoType INTEGER default '0' ,  bypInfo TEXT,  feedId TEXT,  noticeId TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38616n3)) {
            return false;
        }
        C38616n3 n3Var = (C38616n3) iAutoDBItem;
        return C46238a.m51546a(this.field_revokeId, n3Var.field_revokeId) && C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(n3Var.field_msgId)) && C46238a.m51546a(Integer.valueOf(this.field_exposureStatus), Integer.valueOf(n3Var.field_exposureStatus)) && C46238a.m51546a(Integer.valueOf(this.field_liveStatus), Integer.valueOf(n3Var.field_liveStatus)) && C46238a.m51546a(this.field_businessBuf, n3Var.field_businessBuf) && C46238a.m51546a(Long.valueOf(this.field_insertTime), Long.valueOf(n3Var.field_insertTime)) && C46238a.m51546a(this.field_tipsId, n3Var.field_tipsId) && C46238a.m51546a(this.field_liveId, n3Var.field_liveId) && C46238a.m51546a(Integer.valueOf(this.field_controlFlag), Integer.valueOf(n3Var.field_controlFlag)) && C46238a.m51546a(this.field_forcePushId, n3Var.field_forcePushId) && C46238a.m51546a(Integer.valueOf(this.field_ctrlInfoType), Integer.valueOf(n3Var.field_ctrlInfoType)) && C46238a.m51546a(this.field_bypInfo, n3Var.field_bypInfo) && C46238a.m51546a(this.field_feedId, n3Var.field_feedId) && C46238a.m51546a(this.field_noticeId, n3Var.field_noticeId);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103079w == hashCode) {
                    try {
                        this.field_revokeId = cursor.getString(i);
                        this.f103083d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103080x == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103081y == hashCode) {
                    try {
                        this.field_exposureStatus = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103082z == hashCode) {
                    try {
                        this.field_liveStatus = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103064A == hashCode) {
                    try {
                        this.field_businessBuf = cursor.getBlob(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103065B == hashCode) {
                    try {
                        this.field_insertTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103066C == hashCode) {
                    try {
                        this.field_tipsId = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103067D == hashCode) {
                    try {
                        this.field_liveId = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103068E == hashCode) {
                    try {
                        this.field_controlFlag = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103069F == hashCode) {
                    try {
                        this.field_forcePushId = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103070G == hashCode) {
                    try {
                        this.field_ctrlInfoType = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103071H == hashCode) {
                    try {
                        this.field_bypInfo = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103072I == hashCode) {
                    try {
                        this.field_feedId = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103073J == hashCode) {
                    try {
                        this.field_noticeId = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103074K == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103083d) {
            contentValues.put("revokeId", this.field_revokeId);
        }
        if (this.f103084e) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f103085f) {
            contentValues.put("exposureStatus", Integer.valueOf(this.field_exposureStatus));
        }
        if (this.f103086g) {
            contentValues.put("liveStatus", Integer.valueOf(this.field_liveStatus));
        }
        if (this.f103087h) {
            contentValues.put("businessBuf", this.field_businessBuf);
        }
        if (this.f103088i) {
            contentValues.put("insertTime", Long.valueOf(this.field_insertTime));
        }
        if (this.f103089j) {
            contentValues.put("tipsId", this.field_tipsId);
        }
        if (this.f103090n) {
            contentValues.put("liveId", this.field_liveId);
        }
        if (this.f103091o) {
            contentValues.put("controlFlag", Integer.valueOf(this.field_controlFlag));
        }
        if (this.f103092p) {
            contentValues.put("forcePushId", this.field_forcePushId);
        }
        if (this.f103093q) {
            contentValues.put("ctrlInfoType", Integer.valueOf(this.field_ctrlInfoType));
        }
        if (this.f103094r) {
            contentValues.put("bypInfo", this.field_bypInfo);
        }
        if (this.f103095s) {
            contentValues.put("feedId", this.field_feedId);
        }
        if (this.f103096t) {
            contentValues.put("noticeId", this.field_noticeId);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLiveNotifyExposureInfo ( " + f103075L.sql + ");");
        for (String add : f103078v) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLiveNotifyExposureInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103075L, "FinderLiveNotifyExposureInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLiveNotifyExposureInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103075L;
    }

    public String[] getIndexCreateSQL() {
        return f103078v;
    }

    public StorageObserverOwner<C38616n3> getObserverOwner() {
        return f103076M;
    }

    public Object getPrimaryKeyValue() {
        return this.field_revokeId;
    }

    public SingleTable getTable() {
        return f103077u;
    }

    public String getTableName() {
        return f103077u.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("revokeId")) {
            this.field_revokeId = contentValues.getAsString("revokeId");
            if (z) {
                this.f103083d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f103084e = true;
            }
        }
        if (contentValues.containsKey("exposureStatus")) {
            this.field_exposureStatus = contentValues.getAsInteger("exposureStatus").intValue();
            if (z) {
                this.f103085f = true;
            }
        }
        if (contentValues.containsKey("liveStatus")) {
            this.field_liveStatus = contentValues.getAsInteger("liveStatus").intValue();
            if (z) {
                this.f103086g = true;
            }
        }
        if (contentValues.containsKey("businessBuf")) {
            this.field_businessBuf = contentValues.getAsByteArray("businessBuf");
            if (z) {
                this.f103087h = true;
            }
        }
        if (contentValues.containsKey("insertTime")) {
            this.field_insertTime = contentValues.getAsLong("insertTime").longValue();
            if (z) {
                this.f103088i = true;
            }
        }
        if (contentValues.containsKey("tipsId")) {
            this.field_tipsId = contentValues.getAsString("tipsId");
            if (z) {
                this.f103089j = true;
            }
        }
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsString("liveId");
            if (z) {
                this.f103090n = true;
            }
        }
        if (contentValues.containsKey("controlFlag")) {
            this.field_controlFlag = contentValues.getAsInteger("controlFlag").intValue();
            if (z) {
                this.f103091o = true;
            }
        }
        if (contentValues.containsKey("forcePushId")) {
            this.field_forcePushId = contentValues.getAsString("forcePushId");
            if (z) {
                this.f103092p = true;
            }
        }
        if (contentValues.containsKey("ctrlInfoType")) {
            this.field_ctrlInfoType = contentValues.getAsInteger("ctrlInfoType").intValue();
            if (z) {
                this.f103093q = true;
            }
        }
        if (contentValues.containsKey("bypInfo")) {
            this.field_bypInfo = contentValues.getAsString("bypInfo");
            if (z) {
                this.f103094r = true;
            }
        }
        if (contentValues.containsKey("feedId")) {
            this.field_feedId = contentValues.getAsString("feedId");
            if (z) {
                this.f103095s = true;
            }
        }
        if (contentValues.containsKey("noticeId")) {
            this.field_noticeId = contentValues.getAsString("noticeId");
            if (z) {
                this.f103096t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
