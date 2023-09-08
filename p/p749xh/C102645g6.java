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
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.g6 */
public class C102645g6 extends IAutoDBItem {

    /* renamed from: A */
    public static final IAutoDBItem.MAutoDBInfo f302369A = initAutoDBInfo(C102645g6.class);

    /* renamed from: B */
    public static final StorageObserverOwner<C102645g6> f302370B = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f302371o;

    /* renamed from: p */
    public static final Column f302372p;

    /* renamed from: q */
    public static final String[] f302373q = new String[0];

    /* renamed from: r */
    public static final int f302374r = 338409958;

    /* renamed from: s */
    public static final int f302375s = -520067291;

    /* renamed from: t */
    public static final int f302376t = -1294411543;

    /* renamed from: u */
    public static final int f302377u = -892481550;

    /* renamed from: v */
    public static final int f302378v = -1724719024;

    /* renamed from: w */
    public static final int f302379w = -1534483634;

    /* renamed from: x */
    public static final int f302380x = -1638078763;

    /* renamed from: y */
    public static final int f302381y = -1683478113;

    /* renamed from: z */
    public static final int f302382z = 108705909;

    /* renamed from: d */
    public boolean f302383d = false;

    /* renamed from: e */
    public boolean f302384e = false;

    /* renamed from: f */
    public boolean f302385f = false;
    private int field_downloadProgress;
    private byte[] field_extraMsgInfo;
    private long field_localId;
    private long field_msgLocalId;
    private long field_msgSvrId;
    private int field_startUploadProgress;
    private int field_status;
    private int field_uploadProgress;

    /* renamed from: g */
    public boolean f302386g = false;

    /* renamed from: h */
    public boolean f302387h = false;

    /* renamed from: i */
    public boolean f302388i = false;

    /* renamed from: j */
    public boolean f302389j = false;

    /* renamed from: n */
    public boolean f302390n = false;

    static {
        SingleTable singleTable = new SingleTable("MsgExtraInfo");
        f302371o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "long", singleTable.getName(), "");
        f302372p = new Column("msgLocalId", "long", singleTable.getName(), "");
        new Column("msgSvrId", "long", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("startUploadProgress", "int", singleTable.getName(), "");
        new Column("uploadProgress", "int", singleTable.getName(), "");
        new Column("downloadProgress", "int", singleTable.getName(), "");
        new Column("extraMsgInfo", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = C66261f3.COL_LOCALID;
        mAutoDBInfo.columns[1] = "msgLocalId";
        mAutoDBInfo.colsMap.put("msgLocalId", "LONG");
        mAutoDBInfo.columns[2] = "msgSvrId";
        mAutoDBInfo.colsMap.put("msgSvrId", "LONG");
        mAutoDBInfo.columns[3] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = "startUploadProgress";
        mAutoDBInfo.colsMap.put("startUploadProgress", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "uploadProgress";
        mAutoDBInfo.colsMap.put("uploadProgress", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "downloadProgress";
        mAutoDBInfo.colsMap.put("downloadProgress", "INTEGER default '0' ");
        mAutoDBInfo.columns[7] = "extraMsgInfo";
        mAutoDBInfo.colsMap.put("extraMsgInfo", "BLOB");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " localId LONG PRIMARY KEY ,  msgLocalId LONG,  msgSvrId LONG,  status INTEGER default '0' ,  startUploadProgress INTEGER default '0' ,  uploadProgress INTEGER default '0' ,  downloadProgress INTEGER default '0' ,  extraMsgInfo BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    /* renamed from: q2 */
    public static final SelectSql m135569q2(long j) {
        return f302371o.selectAll().where(f302372p.equal((Number) Long.valueOf(j))).log("MicroMsg.SDK.BaseMsgExtraInfo").build();
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102645g6)) {
            return false;
        }
        C102645g6 g6Var = (C102645g6) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_localId), Long.valueOf(g6Var.field_localId)) && C46238a.m51546a(Long.valueOf(this.field_msgLocalId), Long.valueOf(g6Var.field_msgLocalId)) && C46238a.m51546a(Long.valueOf(this.field_msgSvrId), Long.valueOf(g6Var.field_msgSvrId)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(g6Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_startUploadProgress), Integer.valueOf(g6Var.field_startUploadProgress)) && C46238a.m51546a(Integer.valueOf(this.field_uploadProgress), Integer.valueOf(g6Var.field_uploadProgress)) && C46238a.m51546a(Integer.valueOf(this.field_downloadProgress), Integer.valueOf(g6Var.field_downloadProgress)) && C46238a.m51546a(this.field_extraMsgInfo, g6Var.field_extraMsgInfo);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302374r == hashCode) {
                    try {
                        this.field_localId = cursor.getLong(i);
                        this.f302383d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgExtraInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302375s == hashCode) {
                    try {
                        this.field_msgLocalId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgExtraInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302376t == hashCode) {
                    try {
                        this.field_msgSvrId = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgExtraInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302377u == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgExtraInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302378v == hashCode) {
                    try {
                        this.field_startUploadProgress = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgExtraInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302379w == hashCode) {
                    try {
                        this.field_uploadProgress = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgExtraInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302380x == hashCode) {
                    try {
                        this.field_downloadProgress = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgExtraInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302381y == hashCode) {
                    try {
                        this.field_extraMsgInfo = cursor.getBlob(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgExtraInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302382z == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302383d) {
            contentValues.put(C66261f3.COL_LOCALID, Long.valueOf(this.field_localId));
        }
        if (this.f302384e) {
            contentValues.put("msgLocalId", Long.valueOf(this.field_msgLocalId));
        }
        if (this.f302385f) {
            contentValues.put("msgSvrId", Long.valueOf(this.field_msgSvrId));
        }
        if (this.f302386g) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f302387h) {
            contentValues.put("startUploadProgress", Integer.valueOf(this.field_startUploadProgress));
        }
        if (this.f302388i) {
            contentValues.put("uploadProgress", Integer.valueOf(this.field_uploadProgress));
        }
        if (this.f302389j) {
            contentValues.put("downloadProgress", Integer.valueOf(this.field_downloadProgress));
        }
        if (this.f302390n) {
            contentValues.put("extraMsgInfo", this.field_extraMsgInfo);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMsgExtraInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MsgExtraInfo ( " + f302369A.sql + ");");
        for (String add : f302373q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMsgExtraInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MsgExtraInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302369A, "MsgExtraInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMsgExtraInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MsgExtraInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMsgExtraInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: d */
    public void mo142298d(int i) {
        this.field_status = i;
        this.f302386g = true;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302369A;
    }

    public String[] getIndexCreateSQL() {
        return f302373q;
    }

    public long getLocalId() {
        return this.field_localId;
    }

    public StorageObserverOwner<C102645g6> getObserverOwner() {
        return f302370B;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_localId);
    }

    public int getStatus() {
        return this.field_status;
    }

    public SingleTable getTable() {
        return f302371o;
    }

    public String getTableName() {
        return f302371o.getName();
    }

    /* renamed from: l2 */
    public int mo142301l2() {
        return this.field_downloadProgress;
    }

    /* renamed from: m2 */
    public byte[] mo142302m2() {
        return this.field_extraMsgInfo;
    }

    /* renamed from: n2 */
    public long mo142303n2() {
        return this.field_msgLocalId;
    }

    /* renamed from: o2 */
    public int mo142304o2() {
        return this.field_startUploadProgress;
    }

    /* renamed from: p2 */
    public int mo142305p2() {
        return this.field_uploadProgress;
    }

    /* renamed from: r2 */
    public void mo142306r2(int i) {
        this.field_downloadProgress = i;
        this.f302389j = true;
    }

    /* renamed from: s2 */
    public void mo142307s2(byte[] bArr) {
        this.field_extraMsgInfo = bArr;
        this.f302390n = true;
    }

    public void setLocalId(long j) {
        this.field_localId = j;
        this.f302383d = true;
    }

    /* renamed from: t2 */
    public void mo142309t2(long j) {
        this.field_msgLocalId = j;
        this.f302384e = true;
    }

    /* renamed from: u2 */
    public void mo142310u2(long j) {
        this.field_msgSvrId = j;
        this.f302385f = true;
    }

    /* renamed from: v2 */
    public void mo142311v2(int i) {
        this.field_startUploadProgress = i;
        this.f302387h = true;
    }

    /* renamed from: w2 */
    public void mo142312w2(int i) {
        this.field_uploadProgress = i;
        this.f302388i = true;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(C66261f3.COL_LOCALID).longValue();
            if (z) {
                this.f302383d = true;
            }
        }
        if (contentValues.containsKey("msgLocalId")) {
            this.field_msgLocalId = contentValues.getAsLong("msgLocalId").longValue();
            if (z) {
                this.f302384e = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z) {
                this.f302385f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f302386g = true;
            }
        }
        if (contentValues.containsKey("startUploadProgress")) {
            this.field_startUploadProgress = contentValues.getAsInteger("startUploadProgress").intValue();
            if (z) {
                this.f302387h = true;
            }
        }
        if (contentValues.containsKey("uploadProgress")) {
            this.field_uploadProgress = contentValues.getAsInteger("uploadProgress").intValue();
            if (z) {
                this.f302388i = true;
            }
        }
        if (contentValues.containsKey("downloadProgress")) {
            this.field_downloadProgress = contentValues.getAsInteger("downloadProgress").intValue();
            if (z) {
                this.f302389j = true;
            }
        }
        if (contentValues.containsKey("extraMsgInfo")) {
            this.field_extraMsgInfo = contentValues.getAsByteArray("extraMsgInfo");
            if (z) {
                this.f302390n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
