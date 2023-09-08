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

/* renamed from: xh.o0 */
public class C53343o0 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f149691A = 1437412018;

    /* renamed from: B */
    public static final int f149692B = 697480212;

    /* renamed from: C */
    public static final int f149693C = 1437210115;

    /* renamed from: D */
    public static final int f149694D = -1820546228;

    /* renamed from: E */
    public static final int f149695E = -1972687264;

    /* renamed from: F */
    public static final int f149696F = -178249254;

    /* renamed from: G */
    public static final int f149697G = -103570919;

    /* renamed from: H */
    public static final int f149698H = -81097877;

    /* renamed from: I */
    public static final int f149699I = -190711079;

    /* renamed from: J */
    public static final int f149700J = -266718455;

    /* renamed from: K */
    public static final int f149701K = 1204310228;

    /* renamed from: L */
    public static final int f149702L = -172778809;

    /* renamed from: M */
    public static final int f149703M = 108705909;

    /* renamed from: N */
    public static final IAutoDBItem.MAutoDBInfo f149704N = initAutoDBInfo(C53343o0.class);

    /* renamed from: P */
    public static final StorageObserverOwner<C53343o0> f149705P = new StorageObserverOwner<>();

    /* renamed from: v */
    public static final SingleTable f149706v;

    /* renamed from: w */
    public static final String[] f149707w = new String[0];

    /* renamed from: x */
    public static final int f149708x = -497476517;

    /* renamed from: y */
    public static final int f149709y = 2115249852;

    /* renamed from: z */
    public static final int f149710z = -64277091;

    /* renamed from: d */
    public boolean f149711d = true;

    /* renamed from: e */
    public boolean f149712e = true;

    /* renamed from: f */
    public boolean f149713f = true;
    public String field_addMemberUrl;
    public int field_bitFlag;
    public long field_bizChatLocalId;
    public String field_bizChatServId;
    public String field_brandUserName;
    public String field_chatName;
    public String field_chatNamePY;
    public int field_chatType;
    public int field_chatVersion;
    public String field_headImageUrl;
    public int field_maxMemberCnt;
    public boolean field_needToUpdate;
    public String field_ownerUserId;
    public int field_roomflag;
    public String field_userList;

    /* renamed from: g */
    public boolean f149714g = true;

    /* renamed from: h */
    public boolean f149715h = true;

    /* renamed from: i */
    public boolean f149716i = true;

    /* renamed from: j */
    public boolean f149717j = true;

    /* renamed from: n */
    public boolean f149718n = true;

    /* renamed from: o */
    public boolean f149719o = true;

    /* renamed from: p */
    public boolean f149720p = true;

    /* renamed from: q */
    public boolean f149721q = true;

    /* renamed from: r */
    public boolean f149722r = true;

    /* renamed from: s */
    public boolean f149723s = true;

    /* renamed from: t */
    public boolean f149724t = true;

    /* renamed from: u */
    public boolean f149725u = true;

    static {
        SingleTable singleTable = new SingleTable("BizChatInfo");
        f149706v = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("bizChatLocalId", "long", singleTable.getName(), "");
        new Column("bizChatServId", "string", singleTable.getName(), "");
        new Column("brandUserName", "string", singleTable.getName(), "");
        new Column("chatType", "int", singleTable.getName(), "");
        new Column("headImageUrl", "string", singleTable.getName(), "");
        new Column("chatName", "string", singleTable.getName(), "");
        new Column("chatNamePY", "string", singleTable.getName(), "");
        new Column("chatVersion", "int", singleTable.getName(), "");
        new Column("needToUpdate", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("bitFlag", "int", singleTable.getName(), "");
        new Column("maxMemberCnt", "int", singleTable.getName(), "");
        new Column("ownerUserId", "string", singleTable.getName(), "");
        new Column("userList", "string", singleTable.getName(), "");
        new Column("addMemberUrl", "string", singleTable.getName(), "");
        new Column("roomflag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[15];
        String[] strArr = new String[16];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "bizChatLocalId";
        mAutoDBInfo.colsMap.put("bizChatLocalId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "bizChatLocalId";
        mAutoDBInfo.columns[1] = "bizChatServId";
        mAutoDBInfo.colsMap.put("bizChatServId", "TEXT");
        mAutoDBInfo.columns[2] = "brandUserName";
        mAutoDBInfo.colsMap.put("brandUserName", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "chatType";
        mAutoDBInfo.colsMap.put("chatType", "INTEGER");
        mAutoDBInfo.columns[4] = "headImageUrl";
        mAutoDBInfo.colsMap.put("headImageUrl", "TEXT");
        mAutoDBInfo.columns[5] = "chatName";
        mAutoDBInfo.colsMap.put("chatName", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "chatNamePY";
        mAutoDBInfo.colsMap.put("chatNamePY", "TEXT default '' ");
        mAutoDBInfo.columns[7] = "chatVersion";
        mAutoDBInfo.colsMap.put("chatVersion", "INTEGER default '-1' ");
        mAutoDBInfo.columns[8] = "needToUpdate";
        mAutoDBInfo.colsMap.put("needToUpdate", "INTEGER default 'true' ");
        mAutoDBInfo.columns[9] = "bitFlag";
        mAutoDBInfo.colsMap.put("bitFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "maxMemberCnt";
        mAutoDBInfo.colsMap.put("maxMemberCnt", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "ownerUserId";
        mAutoDBInfo.colsMap.put("ownerUserId", "TEXT");
        mAutoDBInfo.columns[12] = "userList";
        mAutoDBInfo.colsMap.put("userList", "TEXT");
        mAutoDBInfo.columns[13] = "addMemberUrl";
        mAutoDBInfo.colsMap.put("addMemberUrl", "TEXT");
        mAutoDBInfo.columns[14] = "roomflag";
        mAutoDBInfo.colsMap.put("roomflag", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "rowid";
        mAutoDBInfo.sql = " bizChatLocalId LONG PRIMARY KEY ,  bizChatServId TEXT,  brandUserName TEXT default '' ,  chatType INTEGER,  headImageUrl TEXT,  chatName TEXT default '' ,  chatNamePY TEXT default '' ,  chatVersion INTEGER default '-1' ,  needToUpdate INTEGER default 'true' ,  bitFlag INTEGER default '0' ,  maxMemberCnt INTEGER default '0' ,  ownerUserId TEXT,  userList TEXT,  addMemberUrl TEXT,  roomflag INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53343o0)) {
            return false;
        }
        C53343o0 o0Var = (C53343o0) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_bizChatLocalId), Long.valueOf(o0Var.field_bizChatLocalId)) && C46238a.m51546a(this.field_bizChatServId, o0Var.field_bizChatServId) && C46238a.m51546a(this.field_brandUserName, o0Var.field_brandUserName) && C46238a.m51546a(Integer.valueOf(this.field_chatType), Integer.valueOf(o0Var.field_chatType)) && C46238a.m51546a(this.field_headImageUrl, o0Var.field_headImageUrl) && C46238a.m51546a(this.field_chatName, o0Var.field_chatName) && C46238a.m51546a(this.field_chatNamePY, o0Var.field_chatNamePY) && C46238a.m51546a(Integer.valueOf(this.field_chatVersion), Integer.valueOf(o0Var.field_chatVersion)) && C46238a.m51546a(Boolean.valueOf(this.field_needToUpdate), Boolean.valueOf(o0Var.field_needToUpdate)) && C46238a.m51546a(Integer.valueOf(this.field_bitFlag), Integer.valueOf(o0Var.field_bitFlag)) && C46238a.m51546a(Integer.valueOf(this.field_maxMemberCnt), Integer.valueOf(o0Var.field_maxMemberCnt)) && C46238a.m51546a(this.field_ownerUserId, o0Var.field_ownerUserId) && C46238a.m51546a(this.field_userList, o0Var.field_userList) && C46238a.m51546a(this.field_addMemberUrl, o0Var.field_addMemberUrl) && C46238a.m51546a(Integer.valueOf(this.field_roomflag), Integer.valueOf(o0Var.field_roomflag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149708x == hashCode) {
                    try {
                        this.field_bizChatLocalId = cursor.getLong(i);
                        this.f149711d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149709y == hashCode) {
                    try {
                        this.field_bizChatServId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149710z == hashCode) {
                    try {
                        this.field_brandUserName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149691A == hashCode) {
                    try {
                        this.field_chatType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149692B == hashCode) {
                    try {
                        this.field_headImageUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149693C == hashCode) {
                    try {
                        this.field_chatName = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149694D == hashCode) {
                    try {
                        this.field_chatNamePY = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149695E == hashCode) {
                    try {
                        this.field_chatVersion = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149696F == hashCode) {
                    try {
                        this.field_needToUpdate = cursor.getInt(i) != 0;
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149697G == hashCode) {
                    try {
                        this.field_bitFlag = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149698H == hashCode) {
                    try {
                        this.field_maxMemberCnt = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149699I == hashCode) {
                    try {
                        this.field_ownerUserId = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149700J == hashCode) {
                    try {
                        this.field_userList = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149701K == hashCode) {
                    try {
                        this.field_addMemberUrl = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149702L == hashCode) {
                    try {
                        this.field_roomflag = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149703M == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149711d) {
            contentValues.put("bizChatLocalId", Long.valueOf(this.field_bizChatLocalId));
        }
        if (this.f149712e) {
            contentValues.put("bizChatServId", this.field_bizChatServId);
        }
        if (this.field_brandUserName == null) {
            this.field_brandUserName = "";
        }
        if (this.f149713f) {
            contentValues.put("brandUserName", this.field_brandUserName);
        }
        if (this.f149714g) {
            contentValues.put("chatType", Integer.valueOf(this.field_chatType));
        }
        if (this.f149715h) {
            contentValues.put("headImageUrl", this.field_headImageUrl);
        }
        if (this.field_chatName == null) {
            this.field_chatName = "";
        }
        if (this.f149716i) {
            contentValues.put("chatName", this.field_chatName);
        }
        if (this.field_chatNamePY == null) {
            this.field_chatNamePY = "";
        }
        if (this.f149717j) {
            contentValues.put("chatNamePY", this.field_chatNamePY);
        }
        if (this.f149718n) {
            contentValues.put("chatVersion", Integer.valueOf(this.field_chatVersion));
        }
        if (this.f149719o) {
            if (this.field_needToUpdate) {
                contentValues.put("needToUpdate", 1);
            } else {
                contentValues.put("needToUpdate", 0);
            }
        }
        if (this.f149720p) {
            contentValues.put("bitFlag", Integer.valueOf(this.field_bitFlag));
        }
        if (this.f149721q) {
            contentValues.put("maxMemberCnt", Integer.valueOf(this.field_maxMemberCnt));
        }
        if (this.f149722r) {
            contentValues.put("ownerUserId", this.field_ownerUserId);
        }
        if (this.f149723s) {
            contentValues.put("userList", this.field_userList);
        }
        if (this.f149724t) {
            contentValues.put("addMemberUrl", this.field_addMemberUrl);
        }
        if (this.f149725u) {
            contentValues.put("roomflag", Integer.valueOf(this.field_roomflag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizChatInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizChatInfo ( " + f149704N.sql + ");");
        for (String add : f149707w) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizChatInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizChatInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149704N, "BizChatInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizChatInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizChatInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizChatInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149704N;
    }

    public String[] getIndexCreateSQL() {
        return f149707w;
    }

    public StorageObserverOwner<C53343o0> getObserverOwner() {
        return f149705P;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_bizChatLocalId);
    }

    public SingleTable getTable() {
        return f149706v;
    }

    public String getTableName() {
        return f149706v.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("bizChatLocalId")) {
            this.field_bizChatLocalId = contentValues.getAsLong("bizChatLocalId").longValue();
            if (z) {
                this.f149711d = true;
            }
        }
        if (contentValues.containsKey("bizChatServId")) {
            this.field_bizChatServId = contentValues.getAsString("bizChatServId");
            if (z) {
                this.f149712e = true;
            }
        }
        if (contentValues.containsKey("brandUserName")) {
            this.field_brandUserName = contentValues.getAsString("brandUserName");
            if (z) {
                this.f149713f = true;
            }
        }
        if (contentValues.containsKey("chatType")) {
            this.field_chatType = contentValues.getAsInteger("chatType").intValue();
            if (z) {
                this.f149714g = true;
            }
        }
        if (contentValues.containsKey("headImageUrl")) {
            this.field_headImageUrl = contentValues.getAsString("headImageUrl");
            if (z) {
                this.f149715h = true;
            }
        }
        if (contentValues.containsKey("chatName")) {
            this.field_chatName = contentValues.getAsString("chatName");
            if (z) {
                this.f149716i = true;
            }
        }
        if (contentValues.containsKey("chatNamePY")) {
            this.field_chatNamePY = contentValues.getAsString("chatNamePY");
            if (z) {
                this.f149717j = true;
            }
        }
        if (contentValues.containsKey("chatVersion")) {
            this.field_chatVersion = contentValues.getAsInteger("chatVersion").intValue();
            if (z) {
                this.f149718n = true;
            }
        }
        if (contentValues.containsKey("needToUpdate")) {
            this.field_needToUpdate = contentValues.getAsInteger("needToUpdate").intValue() != 0;
            if (z) {
                this.f149719o = true;
            }
        }
        if (contentValues.containsKey("bitFlag")) {
            this.field_bitFlag = contentValues.getAsInteger("bitFlag").intValue();
            if (z) {
                this.f149720p = true;
            }
        }
        if (contentValues.containsKey("maxMemberCnt")) {
            this.field_maxMemberCnt = contentValues.getAsInteger("maxMemberCnt").intValue();
            if (z) {
                this.f149721q = true;
            }
        }
        if (contentValues.containsKey("ownerUserId")) {
            this.field_ownerUserId = contentValues.getAsString("ownerUserId");
            if (z) {
                this.f149722r = true;
            }
        }
        if (contentValues.containsKey("userList")) {
            this.field_userList = contentValues.getAsString("userList");
            if (z) {
                this.f149723s = true;
            }
        }
        if (contentValues.containsKey("addMemberUrl")) {
            this.field_addMemberUrl = contentValues.getAsString("addMemberUrl");
            if (z) {
                this.f149724t = true;
            }
        }
        if (contentValues.containsKey("roomflag")) {
            this.field_roomflag = contentValues.getAsInteger("roomflag").intValue();
            if (z) {
                this.f149725u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
