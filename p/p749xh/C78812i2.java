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

/* renamed from: xh.i2 */
public class C78812i2 extends IAutoDBItem {

    /* renamed from: A */
    public static final Column f230765A;

    /* renamed from: B */
    public static final Column f230766B;

    /* renamed from: C */
    public static final Column f230767C;

    /* renamed from: D */
    public static final Column f230768D;

    /* renamed from: E */
    public static final Column f230769E;

    /* renamed from: F */
    public static final String[] f230770F = {"CREATE INDEX IF NOT EXISTS fmconversation_isnew_Index ON fmessage_conversation(isNew)"};

    /* renamed from: G */
    public static final int f230771G = -881080743;

    /* renamed from: H */
    public static final int f230772H = -650394338;

    /* renamed from: I */
    public static final int f230773I = 1714148973;

    /* renamed from: J */
    public static final int f230774J = 109757585;

    /* renamed from: K */
    public static final int f230775K = -1540361492;

    /* renamed from: L */
    public static final int f230776L = 100473878;

    /* renamed from: M */
    public static final int f230777M = -1247417237;

    /* renamed from: N */
    public static final int f230778N = 1383537731;

    /* renamed from: P */
    public static final int f230779P = -331551475;

    /* renamed from: Q */
    public static final int f230780Q = -1278221515;

    /* renamed from: R */
    public static final int f230781R = 1487608478;

    /* renamed from: S */
    public static final int f230782S = -1292739781;

    /* renamed from: T */
    public static final int f230783T = -1595845191;

    /* renamed from: U */
    public static final int f230784U = -1800620025;

    /* renamed from: V */
    public static final int f230785V = -742030067;

    /* renamed from: W */
    public static final int f230786W = 1750003582;

    /* renamed from: X */
    public static final int f230787X = 690307527;

    /* renamed from: Y */
    public static final int f230788Y = -14629716;

    /* renamed from: Z */
    public static final int f230789Z = 108705909;

    /* renamed from: p0 */
    public static final IAutoDBItem.MAutoDBInfo f230790p0 = initAutoDBInfo(C78812i2.class);

    /* renamed from: x0 */
    public static final StorageObserverOwner<C78812i2> f230791x0 = new StorageObserverOwner<>();

    /* renamed from: y */
    public static final SingleTable f230792y;

    /* renamed from: z */
    public static final Column f230793z;

    /* renamed from: d */
    public boolean f230794d = true;

    /* renamed from: e */
    public boolean f230795e = true;

    /* renamed from: f */
    public boolean f230796f = true;
    public int field_addScene;
    public String field_contentFromUsername;
    public String field_contentFullPhoneNumMD5;
    public String field_contentNickname;
    public String field_contentPhoneNumMD5;
    public String field_contentVerifyContent;
    public String field_displayName;
    public String field_encryptTalker;
    public String field_fmsgContent;
    public int field_fmsgIsHasShowSelfQRCode;
    public int field_fmsgIsSend;
    public long field_fmsgSysRowId;
    public int field_fmsgType;
    public int field_isNew;
    public long field_lastModifiedTime;
    public int field_recvFmsgType;
    public int field_state;
    public String field_talker;

    /* renamed from: g */
    public boolean f230797g = true;

    /* renamed from: h */
    public boolean f230798h = true;

    /* renamed from: i */
    public boolean f230799i = true;

    /* renamed from: j */
    public boolean f230800j = true;

    /* renamed from: n */
    public boolean f230801n = true;

    /* renamed from: o */
    public boolean f230802o = true;

    /* renamed from: p */
    public boolean f230803p = true;

    /* renamed from: q */
    public boolean f230804q = true;

    /* renamed from: r */
    public boolean f230805r = true;

    /* renamed from: s */
    public boolean f230806s = true;

    /* renamed from: t */
    public boolean f230807t = true;

    /* renamed from: u */
    public boolean f230808u = true;

    /* renamed from: v */
    public boolean f230809v = true;

    /* renamed from: w */
    public boolean f230810w = true;

    /* renamed from: x */
    public boolean f230811x = true;

    static {
        SingleTable singleTable = new SingleTable("fmessage_conversation");
        f230792y = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f230793z = new Column("talker", "string", singleTable.getName(), "");
        new Column("encryptTalker", "string", singleTable.getName(), "");
        new Column("displayName", "string", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
        f230765A = new Column("lastModifiedTime", "long", singleTable.getName(), "");
        f230766B = new Column("isNew", "int", singleTable.getName(), "");
        f230767C = new Column("addScene", "int", singleTable.getName(), "");
        new Column("fmsgSysRowId", "long", singleTable.getName(), "");
        f230768D = new Column("fmsgIsSend", "int", singleTable.getName(), "");
        new Column("fmsgType", "int", singleTable.getName(), "");
        new Column("fmsgContent", "string", singleTable.getName(), "");
        new Column("recvFmsgType", "int", singleTable.getName(), "");
        new Column("contentFromUsername", "string", singleTable.getName(), "");
        new Column("contentNickname", "string", singleTable.getName(), "");
        new Column("contentPhoneNumMD5", "string", singleTable.getName(), "");
        new Column("contentFullPhoneNumMD5", "string", singleTable.getName(), "");
        new Column("contentVerifyContent", "string", singleTable.getName(), "");
        f230769E = new Column("fmsgIsHasShowSelfQRCode", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[18];
        String[] strArr = new String[19];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT default '0'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "talker";
        mAutoDBInfo.columns[1] = "encryptTalker";
        mAutoDBInfo.colsMap.put("encryptTalker", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "displayName";
        mAutoDBInfo.colsMap.put("displayName", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = "lastModifiedTime";
        mAutoDBInfo.colsMap.put("lastModifiedTime", "LONG default '0' ");
        mAutoDBInfo.columns[5] = "isNew";
        mAutoDBInfo.colsMap.put("isNew", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "addScene";
        mAutoDBInfo.colsMap.put("addScene", "INTEGER default '0' ");
        mAutoDBInfo.columns[7] = "fmsgSysRowId";
        mAutoDBInfo.colsMap.put("fmsgSysRowId", "LONG default '0' ");
        mAutoDBInfo.columns[8] = "fmsgIsSend";
        mAutoDBInfo.colsMap.put("fmsgIsSend", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "fmsgType";
        mAutoDBInfo.colsMap.put("fmsgType", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "fmsgContent";
        mAutoDBInfo.colsMap.put("fmsgContent", "TEXT default '' ");
        mAutoDBInfo.columns[11] = "recvFmsgType";
        mAutoDBInfo.colsMap.put("recvFmsgType", "INTEGER default '0' ");
        mAutoDBInfo.columns[12] = "contentFromUsername";
        mAutoDBInfo.colsMap.put("contentFromUsername", "TEXT default '' ");
        mAutoDBInfo.columns[13] = "contentNickname";
        mAutoDBInfo.colsMap.put("contentNickname", "TEXT default '' ");
        mAutoDBInfo.columns[14] = "contentPhoneNumMD5";
        mAutoDBInfo.colsMap.put("contentPhoneNumMD5", "TEXT default '' ");
        mAutoDBInfo.columns[15] = "contentFullPhoneNumMD5";
        mAutoDBInfo.colsMap.put("contentFullPhoneNumMD5", "TEXT default '' ");
        mAutoDBInfo.columns[16] = "contentVerifyContent";
        mAutoDBInfo.colsMap.put("contentVerifyContent", "TEXT default '' ");
        mAutoDBInfo.columns[17] = "fmsgIsHasShowSelfQRCode";
        mAutoDBInfo.colsMap.put("fmsgIsHasShowSelfQRCode", "INTEGER default '0' ");
        mAutoDBInfo.columns[18] = "rowid";
        mAutoDBInfo.sql = " talker TEXT default '0'  PRIMARY KEY ,  encryptTalker TEXT default '' ,  displayName TEXT default '' ,  state INTEGER default '0' ,  lastModifiedTime LONG default '0' ,  isNew INTEGER default '0' ,  addScene INTEGER default '0' ,  fmsgSysRowId LONG default '0' ,  fmsgIsSend INTEGER default '0' ,  fmsgType INTEGER default '0' ,  fmsgContent TEXT default '' ,  recvFmsgType INTEGER default '0' ,  contentFromUsername TEXT default '' ,  contentNickname TEXT default '' ,  contentPhoneNumMD5 TEXT default '' ,  contentFullPhoneNumMD5 TEXT default '' ,  contentVerifyContent TEXT default '' ,  fmsgIsHasShowSelfQRCode INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78812i2)) {
            return false;
        }
        C78812i2 i2Var = (C78812i2) iAutoDBItem;
        return C46238a.m51546a(this.field_talker, i2Var.field_talker) && C46238a.m51546a(this.field_encryptTalker, i2Var.field_encryptTalker) && C46238a.m51546a(this.field_displayName, i2Var.field_displayName) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(i2Var.field_state)) && C46238a.m51546a(Long.valueOf(this.field_lastModifiedTime), Long.valueOf(i2Var.field_lastModifiedTime)) && C46238a.m51546a(Integer.valueOf(this.field_isNew), Integer.valueOf(i2Var.field_isNew)) && C46238a.m51546a(Integer.valueOf(this.field_addScene), Integer.valueOf(i2Var.field_addScene)) && C46238a.m51546a(Long.valueOf(this.field_fmsgSysRowId), Long.valueOf(i2Var.field_fmsgSysRowId)) && C46238a.m51546a(Integer.valueOf(this.field_fmsgIsSend), Integer.valueOf(i2Var.field_fmsgIsSend)) && C46238a.m51546a(Integer.valueOf(this.field_fmsgType), Integer.valueOf(i2Var.field_fmsgType)) && C46238a.m51546a(this.field_fmsgContent, i2Var.field_fmsgContent) && C46238a.m51546a(Integer.valueOf(this.field_recvFmsgType), Integer.valueOf(i2Var.field_recvFmsgType)) && C46238a.m51546a(this.field_contentFromUsername, i2Var.field_contentFromUsername) && C46238a.m51546a(this.field_contentNickname, i2Var.field_contentNickname) && C46238a.m51546a(this.field_contentPhoneNumMD5, i2Var.field_contentPhoneNumMD5) && C46238a.m51546a(this.field_contentFullPhoneNumMD5, i2Var.field_contentFullPhoneNumMD5) && C46238a.m51546a(this.field_contentVerifyContent, i2Var.field_contentVerifyContent) && C46238a.m51546a(Integer.valueOf(this.field_fmsgIsHasShowSelfQRCode), Integer.valueOf(i2Var.field_fmsgIsHasShowSelfQRCode));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230771G == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                        this.f230794d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230772H == hashCode) {
                    try {
                        this.field_encryptTalker = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230773I == hashCode) {
                    try {
                        this.field_displayName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230774J == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230775K == hashCode) {
                    try {
                        this.field_lastModifiedTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230776L == hashCode) {
                    try {
                        this.field_isNew = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230777M == hashCode) {
                    try {
                        this.field_addScene = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230778N == hashCode) {
                    try {
                        this.field_fmsgSysRowId = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230779P == hashCode) {
                    try {
                        this.field_fmsgIsSend = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230780Q == hashCode) {
                    try {
                        this.field_fmsgType = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230781R == hashCode) {
                    try {
                        this.field_fmsgContent = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230782S == hashCode) {
                    try {
                        this.field_recvFmsgType = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230783T == hashCode) {
                    try {
                        this.field_contentFromUsername = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230784U == hashCode) {
                    try {
                        this.field_contentNickname = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230785V == hashCode) {
                    try {
                        this.field_contentPhoneNumMD5 = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230786W == hashCode) {
                    try {
                        this.field_contentFullPhoneNumMD5 = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230787X == hashCode) {
                    try {
                        this.field_contentVerifyContent = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230788Y == hashCode) {
                    try {
                        this.field_fmsgIsHasShowSelfQRCode = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230789Z == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_talker == null) {
            this.field_talker = "0";
        }
        if (this.f230794d) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_encryptTalker == null) {
            this.field_encryptTalker = "";
        }
        if (this.f230795e) {
            contentValues.put("encryptTalker", this.field_encryptTalker);
        }
        if (this.field_displayName == null) {
            this.field_displayName = "";
        }
        if (this.f230796f) {
            contentValues.put("displayName", this.field_displayName);
        }
        if (this.f230797g) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f230798h) {
            contentValues.put("lastModifiedTime", Long.valueOf(this.field_lastModifiedTime));
        }
        if (this.f230799i) {
            contentValues.put("isNew", Integer.valueOf(this.field_isNew));
        }
        if (this.f230800j) {
            contentValues.put("addScene", Integer.valueOf(this.field_addScene));
        }
        if (this.f230801n) {
            contentValues.put("fmsgSysRowId", Long.valueOf(this.field_fmsgSysRowId));
        }
        if (this.f230802o) {
            contentValues.put("fmsgIsSend", Integer.valueOf(this.field_fmsgIsSend));
        }
        if (this.f230803p) {
            contentValues.put("fmsgType", Integer.valueOf(this.field_fmsgType));
        }
        if (this.field_fmsgContent == null) {
            this.field_fmsgContent = "";
        }
        if (this.f230804q) {
            contentValues.put("fmsgContent", this.field_fmsgContent);
        }
        if (this.f230805r) {
            contentValues.put("recvFmsgType", Integer.valueOf(this.field_recvFmsgType));
        }
        if (this.field_contentFromUsername == null) {
            this.field_contentFromUsername = "";
        }
        if (this.f230806s) {
            contentValues.put("contentFromUsername", this.field_contentFromUsername);
        }
        if (this.field_contentNickname == null) {
            this.field_contentNickname = "";
        }
        if (this.f230807t) {
            contentValues.put("contentNickname", this.field_contentNickname);
        }
        if (this.field_contentPhoneNumMD5 == null) {
            this.field_contentPhoneNumMD5 = "";
        }
        if (this.f230808u) {
            contentValues.put("contentPhoneNumMD5", this.field_contentPhoneNumMD5);
        }
        if (this.field_contentFullPhoneNumMD5 == null) {
            this.field_contentFullPhoneNumMD5 = "";
        }
        if (this.f230809v) {
            contentValues.put("contentFullPhoneNumMD5", this.field_contentFullPhoneNumMD5);
        }
        if (this.field_contentVerifyContent == null) {
            this.field_contentVerifyContent = "";
        }
        if (this.f230810w) {
            contentValues.put("contentVerifyContent", this.field_contentVerifyContent);
        }
        if (this.f230811x) {
            contentValues.put("fmsgIsHasShowSelfQRCode", Integer.valueOf(this.field_fmsgIsHasShowSelfQRCode));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFMessageConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS fmessage_conversation ( " + f230790p0.sql + ");");
        for (String add : f230770F) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFMessageConversation", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("fmessage_conversation", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f230790p0, "fmessage_conversation", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFMessageConversation", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("fmessage_conversation", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFMessageConversation", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230790p0;
    }

    public String[] getIndexCreateSQL() {
        return f230770F;
    }

    public StorageObserverOwner<C78812i2> getObserverOwner() {
        return f230791x0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_talker;
    }

    public SingleTable getTable() {
        return f230792y;
    }

    public String getTableName() {
        return f230792y.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f230794d = true;
            }
        }
        if (contentValues.containsKey("encryptTalker")) {
            this.field_encryptTalker = contentValues.getAsString("encryptTalker");
            if (z) {
                this.f230795e = true;
            }
        }
        if (contentValues.containsKey("displayName")) {
            this.field_displayName = contentValues.getAsString("displayName");
            if (z) {
                this.f230796f = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f230797g = true;
            }
        }
        if (contentValues.containsKey("lastModifiedTime")) {
            this.field_lastModifiedTime = contentValues.getAsLong("lastModifiedTime").longValue();
            if (z) {
                this.f230798h = true;
            }
        }
        if (contentValues.containsKey("isNew")) {
            this.field_isNew = contentValues.getAsInteger("isNew").intValue();
            if (z) {
                this.f230799i = true;
            }
        }
        if (contentValues.containsKey("addScene")) {
            this.field_addScene = contentValues.getAsInteger("addScene").intValue();
            if (z) {
                this.f230800j = true;
            }
        }
        if (contentValues.containsKey("fmsgSysRowId")) {
            this.field_fmsgSysRowId = contentValues.getAsLong("fmsgSysRowId").longValue();
            if (z) {
                this.f230801n = true;
            }
        }
        if (contentValues.containsKey("fmsgIsSend")) {
            this.field_fmsgIsSend = contentValues.getAsInteger("fmsgIsSend").intValue();
            if (z) {
                this.f230802o = true;
            }
        }
        if (contentValues.containsKey("fmsgType")) {
            this.field_fmsgType = contentValues.getAsInteger("fmsgType").intValue();
            if (z) {
                this.f230803p = true;
            }
        }
        if (contentValues.containsKey("fmsgContent")) {
            this.field_fmsgContent = contentValues.getAsString("fmsgContent");
            if (z) {
                this.f230804q = true;
            }
        }
        if (contentValues.containsKey("recvFmsgType")) {
            this.field_recvFmsgType = contentValues.getAsInteger("recvFmsgType").intValue();
            if (z) {
                this.f230805r = true;
            }
        }
        if (contentValues.containsKey("contentFromUsername")) {
            this.field_contentFromUsername = contentValues.getAsString("contentFromUsername");
            if (z) {
                this.f230806s = true;
            }
        }
        if (contentValues.containsKey("contentNickname")) {
            this.field_contentNickname = contentValues.getAsString("contentNickname");
            if (z) {
                this.f230807t = true;
            }
        }
        if (contentValues.containsKey("contentPhoneNumMD5")) {
            this.field_contentPhoneNumMD5 = contentValues.getAsString("contentPhoneNumMD5");
            if (z) {
                this.f230808u = true;
            }
        }
        if (contentValues.containsKey("contentFullPhoneNumMD5")) {
            this.field_contentFullPhoneNumMD5 = contentValues.getAsString("contentFullPhoneNumMD5");
            if (z) {
                this.f230809v = true;
            }
        }
        if (contentValues.containsKey("contentVerifyContent")) {
            this.field_contentVerifyContent = contentValues.getAsString("contentVerifyContent");
            if (z) {
                this.f230810w = true;
            }
        }
        if (contentValues.containsKey("fmsgIsHasShowSelfQRCode")) {
            this.field_fmsgIsHasShowSelfQRCode = contentValues.getAsInteger("fmsgIsHasShowSelfQRCode").intValue();
            if (z) {
                this.f230811x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
