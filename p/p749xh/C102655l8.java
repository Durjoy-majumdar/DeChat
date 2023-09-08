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
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.l8 */
public class C102655l8 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f302615A = 3575610;

    /* renamed from: B */
    public static final int f302616B = -1180128302;

    /* renamed from: C */
    public static final int f302617C = 1378908669;

    /* renamed from: D */
    public static final int f302618D = 64794890;

    /* renamed from: E */
    public static final int f302619E = 784608427;

    /* renamed from: F */
    public static final int f302620F = 908408390;

    /* renamed from: G */
    public static final int f302621G = 2104075851;

    /* renamed from: H */
    public static final int f302622H = 1512848407;

    /* renamed from: I */
    public static final int f302623I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f302624J = initAutoDBInfo(C102655l8.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C102655l8> f302625K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f302626t;

    /* renamed from: u */
    public static final String[] f302627u = {"CREATE INDEX IF NOT EXISTS SnsComment_snsID_index ON SnsComment(snsID)", "CREATE INDEX IF NOT EXISTS SnsComment_parentID_index ON SnsComment(parentID)", "CREATE INDEX IF NOT EXISTS SnsComment_isRead_index ON SnsComment(isRead)", "CREATE INDEX IF NOT EXISTS SnsComment_isSend_index ON SnsComment(isSend)"};

    /* renamed from: v */
    public static final int f302628v = 109594771;

    /* renamed from: w */
    public static final int f302629w = 1175162693;

    /* renamed from: x */
    public static final int f302630x = -1180158496;

    /* renamed from: y */
    public static final int f302631y = 1369213417;

    /* renamed from: z */
    public static final int f302632z = -881080743;

    /* renamed from: d */
    public boolean f302633d = true;

    /* renamed from: e */
    public boolean f302634e = true;

    /* renamed from: f */
    public boolean f302635f = true;
    public String field_clientId;
    public long field_commentSvrID;
    public int field_commentflag;
    public int field_createTime;
    public byte[] field_curActionBuf;
    public short field_isRead;
    public boolean field_isSend;
    public int field_isSilence;
    public long field_parentID;
    public byte[] field_refActionBuf;
    public long field_snsID;
    public String field_talker;
    public int field_type;

    /* renamed from: g */
    public boolean f302636g = true;

    /* renamed from: h */
    public boolean f302637h = true;

    /* renamed from: i */
    public boolean f302638i = true;

    /* renamed from: j */
    public boolean f302639j = true;

    /* renamed from: n */
    public boolean f302640n = true;

    /* renamed from: o */
    public boolean f302641o = true;

    /* renamed from: p */
    public boolean f302642p = true;

    /* renamed from: q */
    public boolean f302643q = true;

    /* renamed from: r */
    public boolean f302644r = true;

    /* renamed from: s */
    public boolean f302645s = true;

    static {
        SingleTable singleTable = new SingleTable("SnsComment");
        f302626t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("snsID", "long", singleTable.getName(), "");
        new Column("parentID", "long", singleTable.getName(), "");
        new Column("isRead", "short", singleTable.getName(), "");
        new Column("createTime", "int", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("isSend", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("curActionBuf", "byte[]", singleTable.getName(), "");
        new Column("refActionBuf", "byte[]", singleTable.getName(), "");
        new Column("commentSvrID", "long", singleTable.getName(), "");
        new Column(ClientInfoTable.Columns.CLIENTID, "string", singleTable.getName(), "");
        new Column("commentflag", "int", singleTable.getName(), "");
        new Column("isSilence", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "snsID";
        mAutoDBInfo.colsMap.put("snsID", "LONG");
        mAutoDBInfo.columns[1] = "parentID";
        mAutoDBInfo.colsMap.put("parentID", "LONG");
        mAutoDBInfo.columns[2] = "isRead";
        mAutoDBInfo.colsMap.put("isRead", "SHORT default '0' ");
        mAutoDBInfo.columns[3] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "INTEGER");
        mAutoDBInfo.columns[4] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT");
        mAutoDBInfo.columns[5] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[6] = "isSend";
        mAutoDBInfo.colsMap.put("isSend", "INTEGER default 'false' ");
        mAutoDBInfo.columns[7] = "curActionBuf";
        mAutoDBInfo.colsMap.put("curActionBuf", "BLOB");
        mAutoDBInfo.columns[8] = "refActionBuf";
        mAutoDBInfo.colsMap.put("refActionBuf", "BLOB");
        mAutoDBInfo.columns[9] = "commentSvrID";
        mAutoDBInfo.colsMap.put("commentSvrID", "LONG");
        mAutoDBInfo.columns[10] = ClientInfoTable.Columns.CLIENTID;
        mAutoDBInfo.colsMap.put(ClientInfoTable.Columns.CLIENTID, "TEXT");
        mAutoDBInfo.columns[11] = "commentflag";
        mAutoDBInfo.colsMap.put("commentflag", "INTEGER");
        mAutoDBInfo.columns[12] = "isSilence";
        mAutoDBInfo.colsMap.put("isSilence", "INTEGER default '0' ");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " snsID LONG,  parentID LONG,  isRead SHORT default '0' ,  createTime INTEGER,  talker TEXT,  type INTEGER,  isSend INTEGER default 'false' ,  curActionBuf BLOB,  refActionBuf BLOB,  commentSvrID LONG,  clientId TEXT,  commentflag INTEGER,  isSilence INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102655l8)) {
            return false;
        }
        C102655l8 l8Var = (C102655l8) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_snsID), Long.valueOf(l8Var.field_snsID)) && C46238a.m51546a(Long.valueOf(this.field_parentID), Long.valueOf(l8Var.field_parentID)) && C46238a.m51546a(Short.valueOf(this.field_isRead), Short.valueOf(l8Var.field_isRead)) && C46238a.m51546a(Integer.valueOf(this.field_createTime), Integer.valueOf(l8Var.field_createTime)) && C46238a.m51546a(this.field_talker, l8Var.field_talker) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(l8Var.field_type)) && C46238a.m51546a(Boolean.valueOf(this.field_isSend), Boolean.valueOf(l8Var.field_isSend)) && C46238a.m51546a(this.field_curActionBuf, l8Var.field_curActionBuf) && C46238a.m51546a(this.field_refActionBuf, l8Var.field_refActionBuf) && C46238a.m51546a(Long.valueOf(this.field_commentSvrID), Long.valueOf(l8Var.field_commentSvrID)) && C46238a.m51546a(this.field_clientId, l8Var.field_clientId) && C46238a.m51546a(Integer.valueOf(this.field_commentflag), Integer.valueOf(l8Var.field_commentflag)) && C46238a.m51546a(Integer.valueOf(this.field_isSilence), Integer.valueOf(l8Var.field_isSilence));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302628v == hashCode) {
                    try {
                        this.field_snsID = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302629w == hashCode) {
                    try {
                        this.field_parentID = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302630x == hashCode) {
                    try {
                        this.field_isRead = cursor.getShort(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302631y == hashCode) {
                    try {
                        this.field_createTime = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302632z == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302615A == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302616B == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i) != 0;
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302617C == hashCode) {
                    try {
                        this.field_curActionBuf = cursor.getBlob(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302618D == hashCode) {
                    try {
                        this.field_refActionBuf = cursor.getBlob(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302619E == hashCode) {
                    try {
                        this.field_commentSvrID = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302620F == hashCode) {
                    try {
                        this.field_clientId = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302621G == hashCode) {
                    try {
                        this.field_commentflag = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302622H == hashCode) {
                    try {
                        this.field_isSilence = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302623I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302633d) {
            contentValues.put("snsID", Long.valueOf(this.field_snsID));
        }
        if (this.f302634e) {
            contentValues.put("parentID", Long.valueOf(this.field_parentID));
        }
        if (this.f302635f) {
            contentValues.put("isRead", Short.valueOf(this.field_isRead));
        }
        if (this.f302636g) {
            contentValues.put("createTime", Integer.valueOf(this.field_createTime));
        }
        if (this.f302637h) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f302638i) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f302639j) {
            if (this.field_isSend) {
                contentValues.put("isSend", 1);
            } else {
                contentValues.put("isSend", 0);
            }
        }
        if (this.f302640n) {
            contentValues.put("curActionBuf", this.field_curActionBuf);
        }
        if (this.f302641o) {
            contentValues.put("refActionBuf", this.field_refActionBuf);
        }
        if (this.f302642p) {
            contentValues.put("commentSvrID", Long.valueOf(this.field_commentSvrID));
        }
        if (this.f302643q) {
            contentValues.put(ClientInfoTable.Columns.CLIENTID, this.field_clientId);
        }
        if (this.f302644r) {
            contentValues.put("commentflag", Integer.valueOf(this.field_commentflag));
        }
        if (this.f302645s) {
            contentValues.put("isSilence", Integer.valueOf(this.field_isSilence));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSnsComment", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SnsComment ( " + f302624J.sql + ");");
        for (String add : f302627u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSnsComment", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SnsComment", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302624J, "SnsComment", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSnsComment", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SnsComment", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSnsComment", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302624J;
    }

    public String[] getIndexCreateSQL() {
        return f302627u;
    }

    public StorageObserverOwner<C102655l8> getObserverOwner() {
        return f302625K;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f302626t;
    }

    public String getTableName() {
        return f302626t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("snsID")) {
            this.field_snsID = contentValues.getAsLong("snsID").longValue();
            if (z) {
                this.f302633d = true;
            }
        }
        if (contentValues.containsKey("parentID")) {
            this.field_parentID = contentValues.getAsLong("parentID").longValue();
            if (z) {
                this.f302634e = true;
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.field_isRead = contentValues.getAsShort("isRead").shortValue();
            if (z) {
                this.f302635f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z) {
                this.f302636g = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f302637h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f302638i = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue() != 0;
            if (z) {
                this.f302639j = true;
            }
        }
        if (contentValues.containsKey("curActionBuf")) {
            this.field_curActionBuf = contentValues.getAsByteArray("curActionBuf");
            if (z) {
                this.f302640n = true;
            }
        }
        if (contentValues.containsKey("refActionBuf")) {
            this.field_refActionBuf = contentValues.getAsByteArray("refActionBuf");
            if (z) {
                this.f302641o = true;
            }
        }
        if (contentValues.containsKey("commentSvrID")) {
            this.field_commentSvrID = contentValues.getAsLong("commentSvrID").longValue();
            if (z) {
                this.f302642p = true;
            }
        }
        if (contentValues.containsKey(ClientInfoTable.Columns.CLIENTID)) {
            this.field_clientId = contentValues.getAsString(ClientInfoTable.Columns.CLIENTID);
            if (z) {
                this.f302643q = true;
            }
        }
        if (contentValues.containsKey("commentflag")) {
            this.field_commentflag = contentValues.getAsInteger("commentflag").intValue();
            if (z) {
                this.f302644r = true;
            }
        }
        if (contentValues.containsKey("isSilence")) {
            this.field_isSilence = contentValues.getAsInteger("isSilence").intValue();
            if (z) {
                this.f302645s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
