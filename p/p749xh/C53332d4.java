package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.LbsInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TagInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.UserRole;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.d4 */
public class C53332d4 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f149140A = -266666762;

    /* renamed from: B */
    public static final int f149141B = -173503994;

    /* renamed from: C */
    public static final int f149142C = 69737614;

    /* renamed from: D */
    public static final int f149143D = -428647082;

    /* renamed from: E */
    public static final int f149144E = 113766;

    /* renamed from: F */
    public static final int f149145F = -255654404;

    /* renamed from: G */
    public static final int f149146G = 670560869;

    /* renamed from: H */
    public static final int f149147H = -1549321368;

    /* renamed from: I */
    public static final int f149148I = -19704821;

    /* renamed from: J */
    public static final int f149149J = 3506294;

    /* renamed from: K */
    public static final int f149150K = 549231558;

    /* renamed from: L */
    public static final int f149151L = 2070091616;

    /* renamed from: M */
    public static final int f149152M = 1414282352;

    /* renamed from: N */
    public static final int f149153N = -266534175;

    /* renamed from: P */
    public static final int f149154P = 109140856;

    /* renamed from: Q */
    public static final int f149155Q = -154167682;

    /* renamed from: R */
    public static final int f149156R = -2015752444;

    /* renamed from: S */
    public static final int f149157S = -295931082;

    /* renamed from: T */
    public static final int f149158T = 108705909;

    /* renamed from: U */
    public static final IAutoDBItem.MAutoDBInfo f149159U = initAutoDBInfo(C53332d4.class);

    /* renamed from: V */
    public static final StorageObserverOwner<C53332d4> f149160V = new StorageObserverOwner<>();

    /* renamed from: y */
    public static final SingleTable f149161y;

    /* renamed from: z */
    public static final String[] f149162z = new String[0];

    /* renamed from: d */
    public boolean f149163d = true;

    /* renamed from: e */
    public boolean f149164e = true;

    /* renamed from: f */
    public boolean f149165f = true;
    public String field_avatarURL;
    public boolean field_canAtAll;
    public boolean field_canBeAt;
    public boolean field_canBeKicked;
    public boolean field_canKickMember;
    public boolean field_isAuthorized;
    public boolean field_isRobot;
    public JumpInfo field_jumpInfo;
    public LbsInfo field_lbsInfo;
    public String field_nickName;
    public byte[] field_rawPbData;
    public int field_role;
    public String field_roomName;
    public int field_sex;
    public TagInfo field_tagInfo;
    public long field_updateTime;
    public String field_userName;
    public UserRole field_userRole;

    /* renamed from: g */
    public boolean f149166g = true;

    /* renamed from: h */
    public boolean f149167h = true;

    /* renamed from: i */
    public boolean f149168i = true;

    /* renamed from: j */
    public boolean f149169j = true;

    /* renamed from: n */
    public boolean f149170n = true;

    /* renamed from: o */
    public boolean f149171o = true;

    /* renamed from: p */
    public boolean f149172p = true;

    /* renamed from: q */
    public boolean f149173q = true;

    /* renamed from: r */
    public boolean f149174r = true;

    /* renamed from: s */
    public boolean f149175s = true;

    /* renamed from: t */
    public boolean f149176t = true;

    /* renamed from: u */
    public boolean f149177u = true;

    /* renamed from: v */
    public boolean f149178v = true;

    /* renamed from: w */
    public boolean f149179w = true;

    /* renamed from: x */
    public boolean f149180x = true;

    static {
        SingleTable singleTable = new SingleTable("GameChatRoomContact");
        f149161y = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("roomName", "string", singleTable.getName(), "");
        new Column("nickName", "string", singleTable.getName(), "");
        new Column("avatarURL", "string", singleTable.getName(), "");
        new Column("sex", "int", singleTable.getName(), "");
        new Column("jumpInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo");
        new Column("isAuthorized", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("tagInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.plugin.game.autogen.chatroom.TagInfo");
        new Column("lbsInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo");
        new Column("role", "int", singleTable.getName(), "");
        new Column("canBeAt", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("isRobot", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("canKickMember", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("userRole", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.plugin.game.autogen.chatroom.UserRole");
        new Column("canBeKicked", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("canAtAll", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("rawPbData", "byte[]", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[18];
        String[] strArr = new String[19];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "userName";
        mAutoDBInfo.columns[1] = "roomName";
        mAutoDBInfo.colsMap.put("roomName", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "nickName";
        mAutoDBInfo.colsMap.put("nickName", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "avatarURL";
        mAutoDBInfo.colsMap.put("avatarURL", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "sex";
        mAutoDBInfo.colsMap.put("sex", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "jumpInfo";
        mAutoDBInfo.colsMap.put("jumpInfo", "BLOB");
        mAutoDBInfo.columns[6] = "isAuthorized";
        mAutoDBInfo.colsMap.put("isAuthorized", "INTEGER default 'true' ");
        mAutoDBInfo.columns[7] = "tagInfo";
        mAutoDBInfo.colsMap.put("tagInfo", "BLOB");
        mAutoDBInfo.columns[8] = "lbsInfo";
        mAutoDBInfo.colsMap.put("lbsInfo", "BLOB");
        mAutoDBInfo.columns[9] = "role";
        mAutoDBInfo.colsMap.put("role", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "canBeAt";
        mAutoDBInfo.colsMap.put("canBeAt", "INTEGER default 'true' ");
        mAutoDBInfo.columns[11] = "isRobot";
        mAutoDBInfo.colsMap.put("isRobot", "INTEGER default 'false' ");
        mAutoDBInfo.columns[12] = "canKickMember";
        mAutoDBInfo.colsMap.put("canKickMember", "INTEGER default 'false' ");
        mAutoDBInfo.columns[13] = "userRole";
        mAutoDBInfo.colsMap.put("userRole", "BLOB");
        mAutoDBInfo.columns[14] = "canBeKicked";
        mAutoDBInfo.colsMap.put("canBeKicked", "INTEGER default 'true' ");
        mAutoDBInfo.columns[15] = "canAtAll";
        mAutoDBInfo.colsMap.put("canAtAll", "INTEGER default 'false' ");
        mAutoDBInfo.columns[16] = "rawPbData";
        mAutoDBInfo.colsMap.put("rawPbData", "BLOB");
        mAutoDBInfo.columns[17] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[18] = "rowid";
        mAutoDBInfo.sql = " userName TEXT default ''  PRIMARY KEY ,  roomName TEXT default '' ,  nickName TEXT default '' ,  avatarURL TEXT default '' ,  sex INTEGER default '0' ,  jumpInfo BLOB,  isAuthorized INTEGER default 'true' ,  tagInfo BLOB,  lbsInfo BLOB,  role INTEGER default '0' ,  canBeAt INTEGER default 'true' ,  isRobot INTEGER default 'false' ,  canKickMember INTEGER default 'false' ,  userRole BLOB,  canBeKicked INTEGER default 'true' ,  canAtAll INTEGER default 'false' ,  rawPbData BLOB,  updateTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53332d4)) {
            return false;
        }
        C53332d4 d4Var = (C53332d4) iAutoDBItem;
        return C46238a.m51546a(this.field_userName, d4Var.field_userName) && C46238a.m51546a(this.field_roomName, d4Var.field_roomName) && C46238a.m51546a(this.field_nickName, d4Var.field_nickName) && C46238a.m51546a(this.field_avatarURL, d4Var.field_avatarURL) && C46238a.m51546a(Integer.valueOf(this.field_sex), Integer.valueOf(d4Var.field_sex)) && C46238a.m51546a(this.field_jumpInfo, d4Var.field_jumpInfo) && C46238a.m51546a(Boolean.valueOf(this.field_isAuthorized), Boolean.valueOf(d4Var.field_isAuthorized)) && C46238a.m51546a(this.field_tagInfo, d4Var.field_tagInfo) && C46238a.m51546a(this.field_lbsInfo, d4Var.field_lbsInfo) && C46238a.m51546a(Integer.valueOf(this.field_role), Integer.valueOf(d4Var.field_role)) && C46238a.m51546a(Boolean.valueOf(this.field_canBeAt), Boolean.valueOf(d4Var.field_canBeAt)) && C46238a.m51546a(Boolean.valueOf(this.field_isRobot), Boolean.valueOf(d4Var.field_isRobot)) && C46238a.m51546a(Boolean.valueOf(this.field_canKickMember), Boolean.valueOf(d4Var.field_canKickMember)) && C46238a.m51546a(this.field_userRole, d4Var.field_userRole) && C46238a.m51546a(Boolean.valueOf(this.field_canBeKicked), Boolean.valueOf(d4Var.field_canBeKicked)) && C46238a.m51546a(Boolean.valueOf(this.field_canAtAll), Boolean.valueOf(d4Var.field_canAtAll)) && C46238a.m51546a(this.field_rawPbData, d4Var.field_rawPbData) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(d4Var.field_updateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149140A == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                        this.f149163d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149141B == hashCode) {
                    try {
                        this.field_roomName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149142C == hashCode) {
                    try {
                        this.field_nickName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149143D == hashCode) {
                    try {
                        this.field_avatarURL = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149144E == hashCode) {
                    try {
                        this.field_sex = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149145F == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_jumpInfo = (JumpInfo) new JumpInfo().parseFrom(blob);
                        }
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149146G == hashCode) {
                    try {
                        this.field_isAuthorized = cursor.getInt(i) != 0;
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149147H == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_tagInfo = (TagInfo) new TagInfo().parseFrom(blob2);
                        }
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149148I == hashCode) {
                    try {
                        byte[] blob3 = cursor.getBlob(i);
                        if (blob3 != null && blob3.length > 0) {
                            this.field_lbsInfo = (LbsInfo) new LbsInfo().parseFrom(blob3);
                        }
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149149J == hashCode) {
                    try {
                        this.field_role = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149150K == hashCode) {
                    try {
                        this.field_canBeAt = cursor.getInt(i) != 0;
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149151L == hashCode) {
                    try {
                        this.field_isRobot = cursor.getInt(i) != 0;
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149152M == hashCode) {
                    try {
                        this.field_canKickMember = cursor.getInt(i) != 0;
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149153N == hashCode) {
                    try {
                        byte[] blob4 = cursor.getBlob(i);
                        if (blob4 != null && blob4.length > 0) {
                            this.field_userRole = (UserRole) new UserRole().parseFrom(blob4);
                        }
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149154P == hashCode) {
                    try {
                        this.field_canBeKicked = cursor.getInt(i) != 0;
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149155Q == hashCode) {
                    try {
                        this.field_canAtAll = cursor.getInt(i) != 0;
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149156R == hashCode) {
                    try {
                        this.field_rawPbData = cursor.getBlob(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149157S == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149158T == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        UserRole userRole;
        LbsInfo lbsInfo;
        TagInfo tagInfo;
        JumpInfo jumpInfo;
        ContentValues contentValues = new ContentValues();
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f149163d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.field_roomName == null) {
            this.field_roomName = "";
        }
        if (this.f149164e) {
            contentValues.put("roomName", this.field_roomName);
        }
        if (this.field_nickName == null) {
            this.field_nickName = "";
        }
        if (this.f149165f) {
            contentValues.put("nickName", this.field_nickName);
        }
        if (this.field_avatarURL == null) {
            this.field_avatarURL = "";
        }
        if (this.f149166g) {
            contentValues.put("avatarURL", this.field_avatarURL);
        }
        if (this.f149167h) {
            contentValues.put("sex", Integer.valueOf(this.field_sex));
        }
        if (this.f149168i && (jumpInfo = this.field_jumpInfo) != null) {
            try {
                contentValues.put("jumpInfo", jumpInfo.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseGameChatRoomContact", e.getMessage());
            }
        }
        if (this.f149169j) {
            if (this.field_isAuthorized) {
                contentValues.put("isAuthorized", 1);
            } else {
                contentValues.put("isAuthorized", 0);
            }
        }
        if (this.f149170n && (tagInfo = this.field_tagInfo) != null) {
            try {
                contentValues.put("tagInfo", tagInfo.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseGameChatRoomContact", e2.getMessage());
            }
        }
        if (this.f149171o && (lbsInfo = this.field_lbsInfo) != null) {
            try {
                contentValues.put("lbsInfo", lbsInfo.toByteArray());
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseGameChatRoomContact", e3.getMessage());
            }
        }
        if (this.f149172p) {
            contentValues.put("role", Integer.valueOf(this.field_role));
        }
        if (this.f149173q) {
            if (this.field_canBeAt) {
                contentValues.put("canBeAt", 1);
            } else {
                contentValues.put("canBeAt", 0);
            }
        }
        if (this.f149174r) {
            if (this.field_isRobot) {
                contentValues.put("isRobot", 1);
            } else {
                contentValues.put("isRobot", 0);
            }
        }
        if (this.f149175s) {
            if (this.field_canKickMember) {
                contentValues.put("canKickMember", 1);
            } else {
                contentValues.put("canKickMember", 0);
            }
        }
        if (this.f149176t && (userRole = this.field_userRole) != null) {
            try {
                contentValues.put("userRole", userRole.toByteArray());
            } catch (IOException e4) {
                Log.m105920e("MicroMsg.SDK.BaseGameChatRoomContact", e4.getMessage());
            }
        }
        if (this.f149177u) {
            if (this.field_canBeKicked) {
                contentValues.put("canBeKicked", 1);
            } else {
                contentValues.put("canBeKicked", 0);
            }
        }
        if (this.f149178v) {
            if (this.field_canAtAll) {
                contentValues.put("canAtAll", 1);
            } else {
                contentValues.put("canAtAll", 0);
            }
        }
        if (this.f149179w) {
            contentValues.put("rawPbData", this.field_rawPbData);
        }
        if (this.f149180x) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameChatRoomContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameChatRoomContact ( " + f149159U.sql + ");");
        for (String add : f149162z) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameChatRoomContact", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameChatRoomContact", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149159U, "GameChatRoomContact", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameChatRoomContact", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameChatRoomContact", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameChatRoomContact", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149159U;
    }

    public String[] getIndexCreateSQL() {
        return f149162z;
    }

    public StorageObserverOwner<C53332d4> getObserverOwner() {
        return f149160V;
    }

    public Object getPrimaryKeyValue() {
        return this.field_userName;
    }

    public SingleTable getTable() {
        return f149161y;
    }

    public String getTableName() {
        return f149161y.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f149163d = true;
            }
        }
        if (contentValues.containsKey("roomName")) {
            this.field_roomName = contentValues.getAsString("roomName");
            if (z) {
                this.f149164e = true;
            }
        }
        if (contentValues.containsKey("nickName")) {
            this.field_nickName = contentValues.getAsString("nickName");
            if (z) {
                this.f149165f = true;
            }
        }
        if (contentValues.containsKey("avatarURL")) {
            this.field_avatarURL = contentValues.getAsString("avatarURL");
            if (z) {
                this.f149166g = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.field_sex = contentValues.getAsInteger("sex").intValue();
            if (z) {
                this.f149167h = true;
            }
        }
        if (contentValues.containsKey("jumpInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("jumpInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_jumpInfo = (JumpInfo) new JumpInfo().parseFrom(asByteArray);
                    if (z) {
                        this.f149168i = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseGameChatRoomContact", e.getMessage());
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("isAuthorized")) {
            this.field_isAuthorized = contentValues.getAsInteger("isAuthorized").intValue() != 0;
            if (z) {
                this.f149169j = true;
            }
        }
        if (contentValues.containsKey("tagInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("tagInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_tagInfo = (TagInfo) new TagInfo().parseFrom(asByteArray2);
                    if (z) {
                        this.f149170n = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseGameChatRoomContact", e2.getMessage());
            }
        }
        if (contentValues.containsKey("lbsInfo")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("lbsInfo");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_lbsInfo = (LbsInfo) new LbsInfo().parseFrom(asByteArray3);
                    if (z) {
                        this.f149171o = true;
                    }
                }
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseGameChatRoomContact", e3.getMessage());
            }
        }
        if (contentValues.containsKey("role")) {
            this.field_role = contentValues.getAsInteger("role").intValue();
            if (z) {
                this.f149172p = true;
            }
        }
        if (contentValues.containsKey("canBeAt")) {
            this.field_canBeAt = contentValues.getAsInteger("canBeAt").intValue() != 0;
            if (z) {
                this.f149173q = true;
            }
        }
        if (contentValues.containsKey("isRobot")) {
            this.field_isRobot = contentValues.getAsInteger("isRobot").intValue() != 0;
            if (z) {
                this.f149174r = true;
            }
        }
        if (contentValues.containsKey("canKickMember")) {
            this.field_canKickMember = contentValues.getAsInteger("canKickMember").intValue() != 0;
            if (z) {
                this.f149175s = true;
            }
        }
        if (contentValues.containsKey("userRole")) {
            try {
                byte[] asByteArray4 = contentValues.getAsByteArray("userRole");
                if (asByteArray4 != null && asByteArray4.length > 0) {
                    this.field_userRole = (UserRole) new UserRole().parseFrom(asByteArray4);
                    if (z) {
                        this.f149176t = true;
                    }
                }
            } catch (IOException e4) {
                Log.m105920e("MicroMsg.SDK.BaseGameChatRoomContact", e4.getMessage());
            }
        }
        if (contentValues.containsKey("canBeKicked")) {
            this.field_canBeKicked = contentValues.getAsInteger("canBeKicked").intValue() != 0;
            if (z) {
                this.f149177u = true;
            }
        }
        if (contentValues.containsKey("canAtAll")) {
            if (contentValues.getAsInteger("canAtAll").intValue() != 0) {
                z2 = true;
            }
            this.field_canAtAll = z2;
            if (z) {
                this.f149178v = true;
            }
        }
        if (contentValues.containsKey("rawPbData")) {
            this.field_rawPbData = contentValues.getAsByteArray("rawPbData");
            if (z) {
                this.f149179w = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f149180x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
