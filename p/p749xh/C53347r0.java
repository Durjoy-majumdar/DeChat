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

/* renamed from: xh.r0 */
public class C53347r0 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f149813A = 108047634;

    /* renamed from: B */
    public static final int f149814B = -147142513;

    /* renamed from: C */
    public static final int f149815C = -266894889;

    /* renamed from: D */
    public static final int f149816D = 1941392098;

    /* renamed from: E */
    public static final int f149817E = -1951888162;

    /* renamed from: F */
    public static final int f149818F = 1498925413;

    /* renamed from: G */
    public static final int f149819G = -1880172218;

    /* renamed from: H */
    public static final int f149820H = -266464859;

    /* renamed from: I */
    public static final int f149821I = 1437254082;

    /* renamed from: J */
    public static final int f149822J = -497938374;

    /* renamed from: K */
    public static final int f149823K = -1902240898;

    /* renamed from: L */
    public static final int f149824L = -1180598077;

    /* renamed from: M */
    public static final int f149825M = -1878109890;

    /* renamed from: N */
    public static final int f149826N = 1894056615;

    /* renamed from: P */
    public static final int f149827P = -1622122235;

    /* renamed from: Q */
    public static final int f149828Q = -1585790517;

    /* renamed from: R */
    public static final int f149829R = 108705909;

    /* renamed from: S */
    public static final IAutoDBItem.MAutoDBInfo f149830S = initAutoDBInfo(C53347r0.class);

    /* renamed from: T */
    public static final StorageObserverOwner<C53347r0> f149831T = new StorageObserverOwner<>();

    /* renamed from: x */
    public static final SingleTable f149832x;

    /* renamed from: y */
    public static final String[] f149833y = new String[0];

    /* renamed from: z */
    public static final int f149834z = -266666762;

    /* renamed from: d */
    public boolean f149835d = true;

    /* renamed from: e */
    public boolean f149836e = true;

    /* renamed from: f */
    public boolean f149837f = true;
    public boolean field_chatOpen;
    public boolean field_hide_colleage_invite;
    public boolean field_hide_create_chat;
    public boolean field_hide_mod_chat_member;
    public int field_qyUin;
    public byte[] field_raw_attrs;
    public boolean field_show_confirm;
    public boolean field_use_preset_banner_tips;
    public int field_userFlag;
    public String field_userName;
    public int field_userType;
    public int field_userUin;
    public long field_wwCorpId;
    public int field_wwExposeTimes;
    public int field_wwMaxExposeTimes;
    public int field_wwUnreadCnt;
    public long field_wwUserVid;

    /* renamed from: g */
    public boolean f149838g = true;

    /* renamed from: h */
    public boolean f149839h = true;

    /* renamed from: i */
    public boolean f149840i = true;

    /* renamed from: j */
    public boolean f149841j = true;

    /* renamed from: n */
    public boolean f149842n = true;

    /* renamed from: o */
    public boolean f149843o = true;

    /* renamed from: p */
    public boolean f149844p = true;

    /* renamed from: q */
    public boolean f149845q = true;

    /* renamed from: r */
    public boolean f149846r = true;

    /* renamed from: s */
    public boolean f149847s = true;

    /* renamed from: t */
    public boolean f149848t = true;

    /* renamed from: u */
    public boolean f149849u = true;

    /* renamed from: v */
    public boolean f149850v = true;

    /* renamed from: w */
    public boolean f149851w = true;

    static {
        SingleTable singleTable = new SingleTable("BizEnterprise");
        f149832x = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("qyUin", "int", singleTable.getName(), "");
        new Column("userUin", "int", singleTable.getName(), "");
        new Column("userFlag", "int", singleTable.getName(), "");
        new Column("wwExposeTimes", "int", singleTable.getName(), "");
        new Column("wwMaxExposeTimes", "int", singleTable.getName(), "");
        new Column("wwCorpId", "long", singleTable.getName(), "");
        new Column("wwUserVid", "long", singleTable.getName(), "");
        new Column("userType", "int", singleTable.getName(), "");
        new Column("chatOpen", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("wwUnreadCnt", "int", singleTable.getName(), "");
        new Column("show_confirm", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("use_preset_banner_tips", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("hide_create_chat", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("hide_mod_chat_member", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("hide_colleage_invite", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("raw_attrs", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[17];
        String[] strArr = new String[18];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "userName";
        mAutoDBInfo.columns[1] = "qyUin";
        mAutoDBInfo.colsMap.put("qyUin", "INTEGER");
        mAutoDBInfo.columns[2] = "userUin";
        mAutoDBInfo.colsMap.put("userUin", "INTEGER");
        mAutoDBInfo.columns[3] = "userFlag";
        mAutoDBInfo.colsMap.put("userFlag", "INTEGER");
        mAutoDBInfo.columns[4] = "wwExposeTimes";
        mAutoDBInfo.colsMap.put("wwExposeTimes", "INTEGER");
        mAutoDBInfo.columns[5] = "wwMaxExposeTimes";
        mAutoDBInfo.colsMap.put("wwMaxExposeTimes", "INTEGER");
        mAutoDBInfo.columns[6] = "wwCorpId";
        mAutoDBInfo.colsMap.put("wwCorpId", "LONG");
        mAutoDBInfo.columns[7] = "wwUserVid";
        mAutoDBInfo.colsMap.put("wwUserVid", "LONG");
        mAutoDBInfo.columns[8] = "userType";
        mAutoDBInfo.colsMap.put("userType", "INTEGER");
        mAutoDBInfo.columns[9] = "chatOpen";
        mAutoDBInfo.colsMap.put("chatOpen", "INTEGER");
        mAutoDBInfo.columns[10] = "wwUnreadCnt";
        mAutoDBInfo.colsMap.put("wwUnreadCnt", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "show_confirm";
        mAutoDBInfo.colsMap.put("show_confirm", "INTEGER");
        mAutoDBInfo.columns[12] = "use_preset_banner_tips";
        mAutoDBInfo.colsMap.put("use_preset_banner_tips", "INTEGER");
        mAutoDBInfo.columns[13] = "hide_create_chat";
        mAutoDBInfo.colsMap.put("hide_create_chat", "INTEGER");
        mAutoDBInfo.columns[14] = "hide_mod_chat_member";
        mAutoDBInfo.colsMap.put("hide_mod_chat_member", "INTEGER");
        mAutoDBInfo.columns[15] = "hide_colleage_invite";
        mAutoDBInfo.colsMap.put("hide_colleage_invite", "INTEGER default 'true' ");
        mAutoDBInfo.columns[16] = "raw_attrs";
        mAutoDBInfo.colsMap.put("raw_attrs", "BLOB");
        mAutoDBInfo.columns[17] = "rowid";
        mAutoDBInfo.sql = " userName TEXT PRIMARY KEY ,  qyUin INTEGER,  userUin INTEGER,  userFlag INTEGER,  wwExposeTimes INTEGER,  wwMaxExposeTimes INTEGER,  wwCorpId LONG,  wwUserVid LONG,  userType INTEGER,  chatOpen INTEGER,  wwUnreadCnt INTEGER default '0' ,  show_confirm INTEGER,  use_preset_banner_tips INTEGER,  hide_create_chat INTEGER,  hide_mod_chat_member INTEGER,  hide_colleage_invite INTEGER default 'true' ,  raw_attrs BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53347r0)) {
            return false;
        }
        C53347r0 r0Var = (C53347r0) iAutoDBItem;
        return C46238a.m51546a(this.field_userName, r0Var.field_userName) && C46238a.m51546a(Integer.valueOf(this.field_qyUin), Integer.valueOf(r0Var.field_qyUin)) && C46238a.m51546a(Integer.valueOf(this.field_userUin), Integer.valueOf(r0Var.field_userUin)) && C46238a.m51546a(Integer.valueOf(this.field_userFlag), Integer.valueOf(r0Var.field_userFlag)) && C46238a.m51546a(Integer.valueOf(this.field_wwExposeTimes), Integer.valueOf(r0Var.field_wwExposeTimes)) && C46238a.m51546a(Integer.valueOf(this.field_wwMaxExposeTimes), Integer.valueOf(r0Var.field_wwMaxExposeTimes)) && C46238a.m51546a(Long.valueOf(this.field_wwCorpId), Long.valueOf(r0Var.field_wwCorpId)) && C46238a.m51546a(Long.valueOf(this.field_wwUserVid), Long.valueOf(r0Var.field_wwUserVid)) && C46238a.m51546a(Integer.valueOf(this.field_userType), Integer.valueOf(r0Var.field_userType)) && C46238a.m51546a(Boolean.valueOf(this.field_chatOpen), Boolean.valueOf(r0Var.field_chatOpen)) && C46238a.m51546a(Integer.valueOf(this.field_wwUnreadCnt), Integer.valueOf(r0Var.field_wwUnreadCnt)) && C46238a.m51546a(Boolean.valueOf(this.field_show_confirm), Boolean.valueOf(r0Var.field_show_confirm)) && C46238a.m51546a(Boolean.valueOf(this.field_use_preset_banner_tips), Boolean.valueOf(r0Var.field_use_preset_banner_tips)) && C46238a.m51546a(Boolean.valueOf(this.field_hide_create_chat), Boolean.valueOf(r0Var.field_hide_create_chat)) && C46238a.m51546a(Boolean.valueOf(this.field_hide_mod_chat_member), Boolean.valueOf(r0Var.field_hide_mod_chat_member)) && C46238a.m51546a(Boolean.valueOf(this.field_hide_colleage_invite), Boolean.valueOf(r0Var.field_hide_colleage_invite)) && C46238a.m51546a(this.field_raw_attrs, r0Var.field_raw_attrs);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149834z == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                        this.f149835d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149813A == hashCode) {
                    try {
                        this.field_qyUin = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149814B == hashCode) {
                    try {
                        this.field_userUin = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149815C == hashCode) {
                    try {
                        this.field_userFlag = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149816D == hashCode) {
                    try {
                        this.field_wwExposeTimes = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149817E == hashCode) {
                    try {
                        this.field_wwMaxExposeTimes = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149818F == hashCode) {
                    try {
                        this.field_wwCorpId = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149819G == hashCode) {
                    try {
                        this.field_wwUserVid = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149820H == hashCode) {
                    try {
                        this.field_userType = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149821I == hashCode) {
                    try {
                        this.field_chatOpen = cursor.getInt(i) != 0;
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149822J == hashCode) {
                    try {
                        this.field_wwUnreadCnt = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149823K == hashCode) {
                    try {
                        this.field_show_confirm = cursor.getInt(i) != 0;
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149824L == hashCode) {
                    try {
                        this.field_use_preset_banner_tips = cursor.getInt(i) != 0;
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149825M == hashCode) {
                    try {
                        this.field_hide_create_chat = cursor.getInt(i) != 0;
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149826N == hashCode) {
                    try {
                        this.field_hide_mod_chat_member = cursor.getInt(i) != 0;
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149827P == hashCode) {
                    try {
                        this.field_hide_colleage_invite = cursor.getInt(i) != 0;
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149828Q == hashCode) {
                    try {
                        this.field_raw_attrs = cursor.getBlob(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149829R == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149835d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f149836e) {
            contentValues.put("qyUin", Integer.valueOf(this.field_qyUin));
        }
        if (this.f149837f) {
            contentValues.put("userUin", Integer.valueOf(this.field_userUin));
        }
        if (this.f149838g) {
            contentValues.put("userFlag", Integer.valueOf(this.field_userFlag));
        }
        if (this.f149839h) {
            contentValues.put("wwExposeTimes", Integer.valueOf(this.field_wwExposeTimes));
        }
        if (this.f149840i) {
            contentValues.put("wwMaxExposeTimes", Integer.valueOf(this.field_wwMaxExposeTimes));
        }
        if (this.f149841j) {
            contentValues.put("wwCorpId", Long.valueOf(this.field_wwCorpId));
        }
        if (this.f149842n) {
            contentValues.put("wwUserVid", Long.valueOf(this.field_wwUserVid));
        }
        if (this.f149843o) {
            contentValues.put("userType", Integer.valueOf(this.field_userType));
        }
        if (this.f149844p) {
            if (this.field_chatOpen) {
                contentValues.put("chatOpen", 1);
            } else {
                contentValues.put("chatOpen", 0);
            }
        }
        if (this.f149845q) {
            contentValues.put("wwUnreadCnt", Integer.valueOf(this.field_wwUnreadCnt));
        }
        if (this.f149846r) {
            if (this.field_show_confirm) {
                contentValues.put("show_confirm", 1);
            } else {
                contentValues.put("show_confirm", 0);
            }
        }
        if (this.f149847s) {
            if (this.field_use_preset_banner_tips) {
                contentValues.put("use_preset_banner_tips", 1);
            } else {
                contentValues.put("use_preset_banner_tips", 0);
            }
        }
        if (this.f149848t) {
            if (this.field_hide_create_chat) {
                contentValues.put("hide_create_chat", 1);
            } else {
                contentValues.put("hide_create_chat", 0);
            }
        }
        if (this.f149849u) {
            if (this.field_hide_mod_chat_member) {
                contentValues.put("hide_mod_chat_member", 1);
            } else {
                contentValues.put("hide_mod_chat_member", 0);
            }
        }
        if (this.f149850v) {
            if (this.field_hide_colleage_invite) {
                contentValues.put("hide_colleage_invite", 1);
            } else {
                contentValues.put("hide_colleage_invite", 0);
            }
        }
        if (this.f149851w) {
            contentValues.put("raw_attrs", this.field_raw_attrs);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizEnterprise", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizEnterprise ( " + f149830S.sql + ");");
        for (String add : f149833y) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizEnterprise", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizEnterprise", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149830S, "BizEnterprise", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizEnterprise", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizEnterprise", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizEnterprise", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149830S;
    }

    public String[] getIndexCreateSQL() {
        return f149833y;
    }

    public StorageObserverOwner<C53347r0> getObserverOwner() {
        return f149831T;
    }

    public Object getPrimaryKeyValue() {
        return this.field_userName;
    }

    public SingleTable getTable() {
        return f149832x;
    }

    public String getTableName() {
        return f149832x.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f149835d = true;
            }
        }
        if (contentValues.containsKey("qyUin")) {
            this.field_qyUin = contentValues.getAsInteger("qyUin").intValue();
            if (z) {
                this.f149836e = true;
            }
        }
        if (contentValues.containsKey("userUin")) {
            this.field_userUin = contentValues.getAsInteger("userUin").intValue();
            if (z) {
                this.f149837f = true;
            }
        }
        if (contentValues.containsKey("userFlag")) {
            this.field_userFlag = contentValues.getAsInteger("userFlag").intValue();
            if (z) {
                this.f149838g = true;
            }
        }
        if (contentValues.containsKey("wwExposeTimes")) {
            this.field_wwExposeTimes = contentValues.getAsInteger("wwExposeTimes").intValue();
            if (z) {
                this.f149839h = true;
            }
        }
        if (contentValues.containsKey("wwMaxExposeTimes")) {
            this.field_wwMaxExposeTimes = contentValues.getAsInteger("wwMaxExposeTimes").intValue();
            if (z) {
                this.f149840i = true;
            }
        }
        if (contentValues.containsKey("wwCorpId")) {
            this.field_wwCorpId = contentValues.getAsLong("wwCorpId").longValue();
            if (z) {
                this.f149841j = true;
            }
        }
        if (contentValues.containsKey("wwUserVid")) {
            this.field_wwUserVid = contentValues.getAsLong("wwUserVid").longValue();
            if (z) {
                this.f149842n = true;
            }
        }
        if (contentValues.containsKey("userType")) {
            this.field_userType = contentValues.getAsInteger("userType").intValue();
            if (z) {
                this.f149843o = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("chatOpen")) {
            this.field_chatOpen = contentValues.getAsInteger("chatOpen").intValue() != 0;
            if (z) {
                this.f149844p = true;
            }
        }
        if (contentValues.containsKey("wwUnreadCnt")) {
            this.field_wwUnreadCnt = contentValues.getAsInteger("wwUnreadCnt").intValue();
            if (z) {
                this.f149845q = true;
            }
        }
        if (contentValues.containsKey("show_confirm")) {
            this.field_show_confirm = contentValues.getAsInteger("show_confirm").intValue() != 0;
            if (z) {
                this.f149846r = true;
            }
        }
        if (contentValues.containsKey("use_preset_banner_tips")) {
            this.field_use_preset_banner_tips = contentValues.getAsInteger("use_preset_banner_tips").intValue() != 0;
            if (z) {
                this.f149847s = true;
            }
        }
        if (contentValues.containsKey("hide_create_chat")) {
            this.field_hide_create_chat = contentValues.getAsInteger("hide_create_chat").intValue() != 0;
            if (z) {
                this.f149848t = true;
            }
        }
        if (contentValues.containsKey("hide_mod_chat_member")) {
            this.field_hide_mod_chat_member = contentValues.getAsInteger("hide_mod_chat_member").intValue() != 0;
            if (z) {
                this.f149849u = true;
            }
        }
        if (contentValues.containsKey("hide_colleage_invite")) {
            if (contentValues.getAsInteger("hide_colleage_invite").intValue() != 0) {
                z2 = true;
            }
            this.field_hide_colleage_invite = z2;
            if (z) {
                this.f149850v = true;
            }
        }
        if (contentValues.containsKey("raw_attrs")) {
            this.field_raw_attrs = contentValues.getAsByteArray("raw_attrs");
            if (z) {
                this.f149851w = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
