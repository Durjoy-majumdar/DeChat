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

/* renamed from: xh.w7 */
public class C78830w7 extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C78830w7> f231547A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f231548o;

    /* renamed from: p */
    public static final String[] f231549p = {"CREATE INDEX IF NOT EXISTS remittance_record_status_index ON RemittanceRecord(receiveStatus)", "CREATE INDEX IF NOT EXISTS remittance_record_talker_index ON RemittanceRecord(talker)"};

    /* renamed from: q */
    public static final int f231550q = -1727368602;

    /* renamed from: r */
    public static final int f231551r = -1232917541;

    /* renamed from: s */
    public static final int f231552s = 1505638581;

    /* renamed from: t */
    public static final int f231553t = -1180128302;

    /* renamed from: u */
    public static final int f231554u = -881080743;

    /* renamed from: v */
    public static final int f231555v = -952209084;

    /* renamed from: w */
    public static final int f231556w = -755218150;

    /* renamed from: x */
    public static final int f231557x = -1402055635;

    /* renamed from: y */
    public static final int f231558y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f231559z = initAutoDBInfo(C78830w7.class);

    /* renamed from: d */
    public boolean f231560d = true;

    /* renamed from: e */
    public boolean f231561e = true;

    /* renamed from: f */
    public boolean f231562f = true;
    public boolean field_hasClicked;
    public long field_invalidtime;
    public boolean field_isSend;
    public long field_locaMsgId;
    public int field_receiveStatus;
    public String field_receiverName;
    public String field_talker;
    public String field_transferId;

    /* renamed from: g */
    public boolean f231563g = true;

    /* renamed from: h */
    public boolean f231564h = true;

    /* renamed from: i */
    public boolean f231565i = true;

    /* renamed from: j */
    public boolean f231566j = true;

    /* renamed from: n */
    public boolean f231567n = true;

    static {
        SingleTable singleTable = new SingleTable("RemittanceRecord");
        f231548o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("transferId", "string", singleTable.getName(), "");
        new Column("locaMsgId", "long", singleTable.getName(), "");
        new Column("receiveStatus", "int", singleTable.getName(), "");
        new Column("isSend", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("invalidtime", "long", singleTable.getName(), "");
        new Column("receiverName", "string", singleTable.getName(), "");
        new Column("hasClicked", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "transferId";
        mAutoDBInfo.colsMap.put("transferId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "transferId";
        mAutoDBInfo.columns[1] = "locaMsgId";
        mAutoDBInfo.colsMap.put("locaMsgId", "LONG");
        mAutoDBInfo.columns[2] = "receiveStatus";
        mAutoDBInfo.colsMap.put("receiveStatus", "INTEGER default '-1' ");
        mAutoDBInfo.columns[3] = "isSend";
        mAutoDBInfo.colsMap.put("isSend", "INTEGER");
        mAutoDBInfo.columns[4] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT");
        mAutoDBInfo.columns[5] = "invalidtime";
        mAutoDBInfo.colsMap.put("invalidtime", "LONG");
        mAutoDBInfo.columns[6] = "receiverName";
        mAutoDBInfo.colsMap.put("receiverName", "TEXT");
        mAutoDBInfo.columns[7] = "hasClicked";
        mAutoDBInfo.colsMap.put("hasClicked", "INTEGER");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " transferId TEXT PRIMARY KEY ,  locaMsgId LONG,  receiveStatus INTEGER default '-1' ,  isSend INTEGER,  talker TEXT,  invalidtime LONG,  receiverName TEXT,  hasClicked INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78830w7)) {
            return false;
        }
        C78830w7 w7Var = (C78830w7) iAutoDBItem;
        return C46238a.m51546a(this.field_transferId, w7Var.field_transferId) && C46238a.m51546a(Long.valueOf(this.field_locaMsgId), Long.valueOf(w7Var.field_locaMsgId)) && C46238a.m51546a(Integer.valueOf(this.field_receiveStatus), Integer.valueOf(w7Var.field_receiveStatus)) && C46238a.m51546a(Boolean.valueOf(this.field_isSend), Boolean.valueOf(w7Var.field_isSend)) && C46238a.m51546a(this.field_talker, w7Var.field_talker) && C46238a.m51546a(Long.valueOf(this.field_invalidtime), Long.valueOf(w7Var.field_invalidtime)) && C46238a.m51546a(this.field_receiverName, w7Var.field_receiverName) && C46238a.m51546a(Boolean.valueOf(this.field_hasClicked), Boolean.valueOf(w7Var.field_hasClicked));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231550q == hashCode) {
                    try {
                        this.field_transferId = cursor.getString(i);
                        this.f231560d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231551r == hashCode) {
                    try {
                        this.field_locaMsgId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231552s == hashCode) {
                    try {
                        this.field_receiveStatus = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231553t == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i) != 0;
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231554u == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231555v == hashCode) {
                    try {
                        this.field_invalidtime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231556w == hashCode) {
                    try {
                        this.field_receiverName = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231557x == hashCode) {
                    try {
                        this.field_hasClicked = cursor.getInt(i) != 0;
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231558y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231560d) {
            contentValues.put("transferId", this.field_transferId);
        }
        if (this.f231561e) {
            contentValues.put("locaMsgId", Long.valueOf(this.field_locaMsgId));
        }
        if (this.f231562f) {
            contentValues.put("receiveStatus", Integer.valueOf(this.field_receiveStatus));
        }
        if (this.f231563g) {
            if (this.field_isSend) {
                contentValues.put("isSend", 1);
            } else {
                contentValues.put("isSend", 0);
            }
        }
        if (this.f231564h) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f231565i) {
            contentValues.put("invalidtime", Long.valueOf(this.field_invalidtime));
        }
        if (this.f231566j) {
            contentValues.put("receiverName", this.field_receiverName);
        }
        if (this.f231567n) {
            if (this.field_hasClicked) {
                contentValues.put("hasClicked", 1);
            } else {
                contentValues.put("hasClicked", 0);
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseRemittanceRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS RemittanceRecord ( " + f231559z.sql + ");");
        for (String add : f231549p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseRemittanceRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("RemittanceRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231559z, "RemittanceRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseRemittanceRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("RemittanceRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseRemittanceRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231559z;
    }

    public String[] getIndexCreateSQL() {
        return f231549p;
    }

    public StorageObserverOwner<C78830w7> getObserverOwner() {
        return f231547A;
    }

    public Object getPrimaryKeyValue() {
        return this.field_transferId;
    }

    public SingleTable getTable() {
        return f231548o;
    }

    public String getTableName() {
        return f231548o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("transferId")) {
            this.field_transferId = contentValues.getAsString("transferId");
            if (z) {
                this.f231560d = true;
            }
        }
        if (contentValues.containsKey("locaMsgId")) {
            this.field_locaMsgId = contentValues.getAsLong("locaMsgId").longValue();
            if (z) {
                this.f231561e = true;
            }
        }
        if (contentValues.containsKey("receiveStatus")) {
            this.field_receiveStatus = contentValues.getAsInteger("receiveStatus").intValue();
            if (z) {
                this.f231562f = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue() != 0;
            if (z) {
                this.f231563g = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f231564h = true;
            }
        }
        if (contentValues.containsKey("invalidtime")) {
            this.field_invalidtime = contentValues.getAsLong("invalidtime").longValue();
            if (z) {
                this.f231565i = true;
            }
        }
        if (contentValues.containsKey("receiverName")) {
            this.field_receiverName = contentValues.getAsString("receiverName");
            if (z) {
                this.f231566j = true;
            }
        }
        if (contentValues.containsKey("hasClicked")) {
            if (contentValues.getAsInteger("hasClicked").intValue() != 0) {
                z2 = true;
            }
            this.field_hasClicked = z2;
            if (z) {
                this.f231567n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
