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

/* renamed from: xh.q9 */
public class C78824q9 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f231333A = 774516116;

    /* renamed from: B */
    public static final int f231334B = -905963837;

    /* renamed from: C */
    public static final int f231335C = -952209084;

    /* renamed from: D */
    public static final int f231336D = -1294411543;

    /* renamed from: E */
    public static final int f231337E = 108705909;

    /* renamed from: F */
    public static final IAutoDBItem.MAutoDBInfo f231338F = initAutoDBInfo(C78824q9.class);

    /* renamed from: G */
    public static final StorageObserverOwner<C78824q9> f231339G = new StorageObserverOwner<>();

    /* renamed from: r */
    public static final SingleTable f231340r;

    /* renamed from: s */
    public static final String[] f231341s = new String[0];

    /* renamed from: t */
    public static final int f231342t = 1050590187;

    /* renamed from: u */
    public static final int f231343u = -1224408236;

    /* renamed from: v */
    public static final int f231344v = 984267035;

    /* renamed from: w */
    public static final int f231345w = -2103439280;

    /* renamed from: x */
    public static final int f231346x = 1505638581;

    /* renamed from: y */
    public static final int f231347y = 131048844;

    /* renamed from: z */
    public static final int f231348z = -905962955;

    /* renamed from: d */
    public boolean f231349d = true;

    /* renamed from: e */
    public boolean f231350e = true;

    /* renamed from: f */
    public boolean f231351f = true;
    public String field_exclusiveUsername;
    public int field_hbStatus;
    public int field_hbType;
    public int field_invalidtime;
    public String field_mNativeUrl;
    public long field_msgSvrId;
    public long field_receiveAmount;
    public int field_receiveStatus;
    public long field_receiveTime;
    public String field_sendId;
    public String field_sender;

    /* renamed from: g */
    public boolean f231352g = true;

    /* renamed from: h */
    public boolean f231353h = true;

    /* renamed from: i */
    public boolean f231354i = true;

    /* renamed from: j */
    public boolean f231355j = true;

    /* renamed from: n */
    public boolean f231356n = true;

    /* renamed from: o */
    public boolean f231357o = true;

    /* renamed from: p */
    public boolean f231358p = true;

    /* renamed from: q */
    public boolean f231359q = true;

    static {
        SingleTable singleTable = new SingleTable("WalletLuckyMoney");
        f231340r = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("mNativeUrl", "string", singleTable.getName(), "");
        new Column("hbType", "int", singleTable.getName(), "");
        new Column("receiveAmount", "long", singleTable.getName(), "");
        new Column("receiveTime", "long", singleTable.getName(), "");
        new Column("receiveStatus", "int", singleTable.getName(), "");
        new Column("hbStatus", "int", singleTable.getName(), "");
        new Column("sender", "string", singleTable.getName(), "");
        new Column("exclusiveUsername", "string", singleTable.getName(), "");
        new Column("sendId", "string", singleTable.getName(), "");
        new Column("invalidtime", "int", singleTable.getName(), "");
        new Column("msgSvrId", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[11];
        String[] strArr = new String[12];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "mNativeUrl";
        mAutoDBInfo.colsMap.put("mNativeUrl", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "mNativeUrl";
        mAutoDBInfo.columns[1] = "hbType";
        mAutoDBInfo.colsMap.put("hbType", "INTEGER");
        mAutoDBInfo.columns[2] = "receiveAmount";
        mAutoDBInfo.colsMap.put("receiveAmount", "LONG");
        mAutoDBInfo.columns[3] = "receiveTime";
        mAutoDBInfo.colsMap.put("receiveTime", "LONG");
        mAutoDBInfo.columns[4] = "receiveStatus";
        mAutoDBInfo.colsMap.put("receiveStatus", "INTEGER");
        mAutoDBInfo.columns[5] = "hbStatus";
        mAutoDBInfo.colsMap.put("hbStatus", "INTEGER");
        mAutoDBInfo.columns[6] = "sender";
        mAutoDBInfo.colsMap.put("sender", "TEXT");
        mAutoDBInfo.columns[7] = "exclusiveUsername";
        mAutoDBInfo.colsMap.put("exclusiveUsername", "TEXT");
        mAutoDBInfo.columns[8] = "sendId";
        mAutoDBInfo.colsMap.put("sendId", "TEXT");
        mAutoDBInfo.columns[9] = "invalidtime";
        mAutoDBInfo.colsMap.put("invalidtime", "INTEGER");
        mAutoDBInfo.columns[10] = "msgSvrId";
        mAutoDBInfo.colsMap.put("msgSvrId", "LONG");
        mAutoDBInfo.columns[11] = "rowid";
        mAutoDBInfo.sql = " mNativeUrl TEXT PRIMARY KEY ,  hbType INTEGER,  receiveAmount LONG,  receiveTime LONG,  receiveStatus INTEGER,  hbStatus INTEGER,  sender TEXT,  exclusiveUsername TEXT,  sendId TEXT,  invalidtime INTEGER,  msgSvrId LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78824q9)) {
            return false;
        }
        C78824q9 q9Var = (C78824q9) iAutoDBItem;
        return C46238a.m51546a(this.field_mNativeUrl, q9Var.field_mNativeUrl) && C46238a.m51546a(Integer.valueOf(this.field_hbType), Integer.valueOf(q9Var.field_hbType)) && C46238a.m51546a(Long.valueOf(this.field_receiveAmount), Long.valueOf(q9Var.field_receiveAmount)) && C46238a.m51546a(Long.valueOf(this.field_receiveTime), Long.valueOf(q9Var.field_receiveTime)) && C46238a.m51546a(Integer.valueOf(this.field_receiveStatus), Integer.valueOf(q9Var.field_receiveStatus)) && C46238a.m51546a(Integer.valueOf(this.field_hbStatus), Integer.valueOf(q9Var.field_hbStatus)) && C46238a.m51546a(this.field_sender, q9Var.field_sender) && C46238a.m51546a(this.field_exclusiveUsername, q9Var.field_exclusiveUsername) && C46238a.m51546a(this.field_sendId, q9Var.field_sendId) && C46238a.m51546a(Integer.valueOf(this.field_invalidtime), Integer.valueOf(q9Var.field_invalidtime)) && C46238a.m51546a(Long.valueOf(this.field_msgSvrId), Long.valueOf(q9Var.field_msgSvrId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231342t == hashCode) {
                    try {
                        this.field_mNativeUrl = cursor.getString(i);
                        this.f231349d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231343u == hashCode) {
                    try {
                        this.field_hbType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231344v == hashCode) {
                    try {
                        this.field_receiveAmount = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231345w == hashCode) {
                    try {
                        this.field_receiveTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231346x == hashCode) {
                    try {
                        this.field_receiveStatus = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231347y == hashCode) {
                    try {
                        this.field_hbStatus = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231348z == hashCode) {
                    try {
                        this.field_sender = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231333A == hashCode) {
                    try {
                        this.field_exclusiveUsername = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231334B == hashCode) {
                    try {
                        this.field_sendId = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231335C == hashCode) {
                    try {
                        this.field_invalidtime = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231336D == hashCode) {
                    try {
                        this.field_msgSvrId = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231337E == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231349d) {
            contentValues.put("mNativeUrl", this.field_mNativeUrl);
        }
        if (this.f231350e) {
            contentValues.put("hbType", Integer.valueOf(this.field_hbType));
        }
        if (this.f231351f) {
            contentValues.put("receiveAmount", Long.valueOf(this.field_receiveAmount));
        }
        if (this.f231352g) {
            contentValues.put("receiveTime", Long.valueOf(this.field_receiveTime));
        }
        if (this.f231353h) {
            contentValues.put("receiveStatus", Integer.valueOf(this.field_receiveStatus));
        }
        if (this.f231354i) {
            contentValues.put("hbStatus", Integer.valueOf(this.field_hbStatus));
        }
        if (this.f231355j) {
            contentValues.put("sender", this.field_sender);
        }
        if (this.f231356n) {
            contentValues.put("exclusiveUsername", this.field_exclusiveUsername);
        }
        if (this.f231357o) {
            contentValues.put("sendId", this.field_sendId);
        }
        if (this.f231358p) {
            contentValues.put("invalidtime", Integer.valueOf(this.field_invalidtime));
        }
        if (this.f231359q) {
            contentValues.put("msgSvrId", Long.valueOf(this.field_msgSvrId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWalletLuckyMoney", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WalletLuckyMoney ( " + f231338F.sql + ");");
        for (String add : f231341s) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWalletLuckyMoney", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WalletLuckyMoney", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231338F, "WalletLuckyMoney", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWalletLuckyMoney", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WalletLuckyMoney", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWalletLuckyMoney", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231338F;
    }

    public String[] getIndexCreateSQL() {
        return f231341s;
    }

    public StorageObserverOwner<C78824q9> getObserverOwner() {
        return f231339G;
    }

    public Object getPrimaryKeyValue() {
        return this.field_mNativeUrl;
    }

    public SingleTable getTable() {
        return f231340r;
    }

    public String getTableName() {
        return f231340r.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("mNativeUrl")) {
            this.field_mNativeUrl = contentValues.getAsString("mNativeUrl");
            if (z) {
                this.f231349d = true;
            }
        }
        if (contentValues.containsKey("hbType")) {
            this.field_hbType = contentValues.getAsInteger("hbType").intValue();
            if (z) {
                this.f231350e = true;
            }
        }
        if (contentValues.containsKey("receiveAmount")) {
            this.field_receiveAmount = contentValues.getAsLong("receiveAmount").longValue();
            if (z) {
                this.f231351f = true;
            }
        }
        if (contentValues.containsKey("receiveTime")) {
            this.field_receiveTime = contentValues.getAsLong("receiveTime").longValue();
            if (z) {
                this.f231352g = true;
            }
        }
        if (contentValues.containsKey("receiveStatus")) {
            this.field_receiveStatus = contentValues.getAsInteger("receiveStatus").intValue();
            if (z) {
                this.f231353h = true;
            }
        }
        if (contentValues.containsKey("hbStatus")) {
            this.field_hbStatus = contentValues.getAsInteger("hbStatus").intValue();
            if (z) {
                this.f231354i = true;
            }
        }
        if (contentValues.containsKey("sender")) {
            this.field_sender = contentValues.getAsString("sender");
            if (z) {
                this.f231355j = true;
            }
        }
        if (contentValues.containsKey("exclusiveUsername")) {
            this.field_exclusiveUsername = contentValues.getAsString("exclusiveUsername");
            if (z) {
                this.f231356n = true;
            }
        }
        if (contentValues.containsKey("sendId")) {
            this.field_sendId = contentValues.getAsString("sendId");
            if (z) {
                this.f231357o = true;
            }
        }
        if (contentValues.containsKey("invalidtime")) {
            this.field_invalidtime = contentValues.getAsInteger("invalidtime").intValue();
            if (z) {
                this.f231358p = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z) {
                this.f231359q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
