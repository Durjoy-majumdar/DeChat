package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.xweb.IXWebBroadcastListener;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.y1 */
public class C102678y1 extends IAutoDBItem {

    /* renamed from: A1 */
    public static final int f303190A1 = 1961195224;

    /* renamed from: B1 */
    public static final int f303191B1 = -212895428;

    /* renamed from: C1 */
    public static final int f303192C1 = -1828144229;

    /* renamed from: D1 */
    public static final int f303193D1 = 1581142539;

    /* renamed from: E1 */
    public static final int f303194E1 = -275695851;

    /* renamed from: F1 */
    public static final int f303195F1 = -1555904225;

    /* renamed from: G1 */
    public static final int f303196G1 = -1106353479;

    /* renamed from: H1 */
    public static final int f303197H1 = 1822793073;

    /* renamed from: I1 */
    public static final int f303198I1 = 755498214;

    /* renamed from: J1 */
    public static final int f303199J1 = 3004913;

    /* renamed from: K1 */
    public static final int f303200K1 = -1102667083;

    /* renamed from: L1 */
    public static final int f303201L1 = -981791210;

    /* renamed from: M1 */
    public static final int f303202M1 = 108705909;

    /* renamed from: N1 */
    public static final IAutoDBItem.MAutoDBInfo f303203N1 = initAutoDBInfo(C102678y1.class);

    /* renamed from: O1 */
    public static final StorageObserverOwner<C102678y1> f303204O1 = new StorageObserverOwner<>();

    /* renamed from: Q0 */
    public static final String[] f303205Q0 = {"CREATE INDEX IF NOT EXISTS emojiGroupIndex ON EmojiInfo(catalog)"};

    /* renamed from: R0 */
    public static final int f303206R0 = 107902;

    /* renamed from: S0 */
    public static final int f303207S0 = 109833162;

    /* renamed from: T0 */
    public static final int f303208T0 = 555704345;

    /* renamed from: U0 */
    public static final int f303209U0 = 3575610;

    /* renamed from: V0 */
    public static final int f303210V0 = 3530753;

    /* renamed from: W0 */
    public static final int f303211W0 = 109757538;

    /* renamed from: X0 */
    public static final int f303212X0 = 109757585;

    /* renamed from: Y0 */
    public static final int f303213Y0 = 3373707;

    /* renamed from: Z0 */
    public static final int f303214Z0 = 951530617;

    /* renamed from: a1 */
    public static final int f303215a1 = 2022955529;

    /* renamed from: b1 */
    public static final int f303216b1 = 2022955530;

    /* renamed from: c1 */
    public static final int f303217c1 = 2022955531;

    /* renamed from: d1 */
    public static final int f303218d1 = 2022955532;

    /* renamed from: e1 */
    public static final int f303219e1 = -1411074055;

    /* renamed from: f1 */
    public static final int f303220f1 = 293428218;

    /* renamed from: g1 */
    public static final int f303221g1 = 1736147326;

    /* renamed from: h1 */
    public static final int f303222h1 = -253322636;

    /* renamed from: i1 */
    public static final int f303223i1 = 104125;

    /* renamed from: j1 */
    public static final int f303224j1 = 3556308;

    /* renamed from: k1 */
    public static final int f303225k1 = -896505829;

    /* renamed from: l1 */
    public static final int f303226l1 = -363311593;

    /* renamed from: m1 */
    public static final int f303227m1 = -28946106;

    /* renamed from: n1 */
    public static final int f303228n1 = 1566917561;

    /* renamed from: o1 */
    public static final int f303229o1 = -1364966910;

    /* renamed from: p1 */
    public static final int f303230p1 = -1512620822;

    /* renamed from: q1 */
    public static final int f303231q1 = -1421131984;

    /* renamed from: r1 */
    public static final int f303232r1 = 113126854;

    /* renamed from: s1 */
    public static final int f303233s1 = -1221029593;

    /* renamed from: t1 */
    public static final int f303234t1 = -609031761;

    /* renamed from: u1 */
    public static final int f303235u1 = -609039938;

    /* renamed from: v1 */
    public static final int f303236v1 = 2048620650;

    /* renamed from: w1 */
    public static final int f303237w1 = 110581107;

    /* renamed from: x1 */
    public static final int f303238x1 = 2063396283;

    /* renamed from: y0 */
    public static final SingleTable f303239y0;

    /* renamed from: y1 */
    public static final int f303240y1 = 1767159665;

    /* renamed from: z1 */
    public static final int f303241z1 = -1664826127;

    /* renamed from: A */
    public boolean f303242A = true;

    /* renamed from: B */
    public boolean f303243B = true;

    /* renamed from: C */
    public boolean f303244C = true;

    /* renamed from: D */
    public boolean f303245D = true;

    /* renamed from: E */
    public boolean f303246E = true;

    /* renamed from: F */
    public boolean f303247F = true;

    /* renamed from: G */
    public boolean f303248G = true;

    /* renamed from: H */
    public boolean f303249H = true;

    /* renamed from: I */
    public boolean f303250I = true;

    /* renamed from: J */
    public boolean f303251J = true;

    /* renamed from: K */
    public boolean f303252K = true;

    /* renamed from: L */
    public boolean f303253L = true;

    /* renamed from: M */
    public boolean f303254M = true;

    /* renamed from: N */
    public boolean f303255N = true;

    /* renamed from: P */
    public boolean f303256P = true;

    /* renamed from: Q */
    public boolean f303257Q = true;

    /* renamed from: R */
    public boolean f303258R = true;

    /* renamed from: S */
    public boolean f303259S = true;

    /* renamed from: T */
    public boolean f303260T = true;

    /* renamed from: U */
    public boolean f303261U = true;

    /* renamed from: V */
    public boolean f303262V = true;

    /* renamed from: W */
    public boolean f303263W = true;

    /* renamed from: X */
    public boolean f303264X = true;

    /* renamed from: Y */
    public boolean f303265Y = true;

    /* renamed from: Z */
    public boolean f303266Z = true;

    /* renamed from: d */
    public boolean f303267d = true;

    /* renamed from: e */
    public boolean f303268e = true;

    /* renamed from: f */
    public boolean f303269f = true;
    public String field_activityid;
    public String field_aeskey;
    public String field_app_id;
    public String field_attachTextColor;
    public byte[] field_attachedEmojiMD5;
    public String field_attachedText;
    public String field_attr;
    public long field_captureEnterTime;
    public int field_captureScene;
    public int field_captureStatus;
    public int field_captureUploadCounter;
    public int field_captureUploadErrCode;
    public int field_catalog;
    public String field_cdnUrl;
    public String field_content;
    public String field_designerID;
    public String field_encrypturl;
    public String field_externMd5;
    public String field_externUrl;
    public String field_framesInfo;
    public String field_groupId;
    public int field_height;
    public int field_idx;
    public String field_imitateMd5;
    public long field_lastUseTime;
    public String field_lensId;
    public String field_linkId;
    public String field_md5;
    public String field_meanings;
    public String field_name;
    public int field_needupload;
    public String field_reserved1;
    public String field_reserved2;
    public int field_reserved3;
    public int field_reserved4;
    public int field_size;
    public int field_source;
    public int field_start;
    public int field_state;
    public String field_svrid;
    public int field_temp;
    public String field_thumbUrl;
    public String field_tpauthkey;
    public String field_tpurl;
    public int field_type;
    public int field_width;
    public String field_wxamMd5;

    /* renamed from: g */
    public boolean f303270g = true;

    /* renamed from: h */
    public boolean f303271h = true;

    /* renamed from: i */
    public boolean f303272i = true;

    /* renamed from: j */
    public boolean f303273j = true;

    /* renamed from: n */
    public boolean f303274n = true;

    /* renamed from: o */
    public boolean f303275o = true;

    /* renamed from: p */
    public boolean f303276p = true;

    /* renamed from: p0 */
    public boolean f303277p0 = true;

    /* renamed from: q */
    public boolean f303278q = true;

    /* renamed from: r */
    public boolean f303279r = true;

    /* renamed from: s */
    public boolean f303280s = true;

    /* renamed from: t */
    public boolean f303281t = true;

    /* renamed from: u */
    public boolean f303282u = true;

    /* renamed from: v */
    public boolean f303283v = true;

    /* renamed from: w */
    public boolean f303284w = true;

    /* renamed from: x */
    public boolean f303285x = true;

    /* renamed from: x0 */
    public boolean f303286x0 = true;

    /* renamed from: y */
    public boolean f303287y = true;

    /* renamed from: z */
    public boolean f303288z = true;

    static {
        SingleTable singleTable = new SingleTable("EmojiInfo");
        f303239y0 = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("svrid", "string", singleTable.getName(), "");
        new Column("catalog", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("size", "int", singleTable.getName(), "");
        new Column(IXWebBroadcastListener.STAGE_START, "int", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
        new Column("name", "string", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("reserved1", "string", singleTable.getName(), "");
        new Column("reserved2", "string", singleTable.getName(), "");
        new Column("reserved3", "int", singleTable.getName(), "");
        new Column("reserved4", "int", singleTable.getName(), "");
        new Column("app_id", "string", singleTable.getName(), "");
        new Column("groupId", "string", singleTable.getName(), "");
        new Column("lastUseTime", "long", singleTable.getName(), "");
        new Column("framesInfo", "string", singleTable.getName(), "");
        new Column("idx", "int", singleTable.getName(), "");
        new Column("temp", "int", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.SOURCE, "int", singleTable.getName(), "");
        new Column("needupload", "int", singleTable.getName(), "");
        new Column("designerID", "string", singleTable.getName(), "");
        new Column("thumbUrl", "string", singleTable.getName(), "");
        new Column("cdnUrl", "string", singleTable.getName(), "");
        new Column("encrypturl", "string", singleTable.getName(), "");
        new Column("aeskey", "string", singleTable.getName(), "");
        new Column("width", "int", singleTable.getName(), "");
        new Column("height", "int", singleTable.getName(), "");
        new Column("externUrl", "string", singleTable.getName(), "");
        new Column("externMd5", "string", singleTable.getName(), "");
        new Column("activityid", "string", singleTable.getName(), "");
        new Column("tpurl", "string", singleTable.getName(), "");
        new Column("tpauthkey", "string", singleTable.getName(), "");
        new Column("wxamMd5", "string", singleTable.getName(), "");
        new Column("attachedText", "string", singleTable.getName(), "");
        new Column("captureStatus", "int", singleTable.getName(), "");
        new Column("attachedEmojiMD5", "byte[]", singleTable.getName(), "");
        new Column("imitateMd5", "string", singleTable.getName(), "");
        new Column("captureUploadErrCode", "int", singleTable.getName(), "");
        new Column("captureUploadCounter", "int", singleTable.getName(), "");
        new Column("captureEnterTime", "long", singleTable.getName(), "");
        new Column("lensId", "string", singleTable.getName(), "");
        new Column("attachTextColor", "string", singleTable.getName(), "");
        new Column("captureScene", "int", singleTable.getName(), "");
        new Column("attr", "string", singleTable.getName(), "");
        new Column("linkId", "string", singleTable.getName(), "");
        new Column("meanings", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[47];
        String[] strArr = new String[48];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT PRIMARY KEY  COLLATE NOCASE ");
        mAutoDBInfo.primaryKey = "md5";
        mAutoDBInfo.columns[1] = "svrid";
        mAutoDBInfo.colsMap.put("svrid", "TEXT");
        mAutoDBInfo.columns[2] = "catalog";
        mAutoDBInfo.colsMap.put("catalog", "INTEGER");
        mAutoDBInfo.columns[3] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[4] = "size";
        mAutoDBInfo.colsMap.put("size", "INTEGER");
        mAutoDBInfo.columns[5] = IXWebBroadcastListener.STAGE_START;
        mAutoDBInfo.colsMap.put(IXWebBroadcastListener.STAGE_START, "INTEGER");
        mAutoDBInfo.columns[6] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER");
        mAutoDBInfo.columns[7] = "name";
        mAutoDBInfo.colsMap.put("name", "TEXT");
        mAutoDBInfo.columns[8] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT");
        mAutoDBInfo.columns[9] = "reserved1";
        mAutoDBInfo.colsMap.put("reserved1", "TEXT");
        mAutoDBInfo.columns[10] = "reserved2";
        mAutoDBInfo.colsMap.put("reserved2", "TEXT");
        mAutoDBInfo.columns[11] = "reserved3";
        mAutoDBInfo.colsMap.put("reserved3", "INTEGER");
        mAutoDBInfo.columns[12] = "reserved4";
        mAutoDBInfo.colsMap.put("reserved4", "INTEGER");
        mAutoDBInfo.columns[13] = "app_id";
        mAutoDBInfo.colsMap.put("app_id", "TEXT");
        mAutoDBInfo.columns[14] = "groupId";
        mAutoDBInfo.colsMap.put("groupId", "TEXT default '' ");
        mAutoDBInfo.columns[15] = "lastUseTime";
        mAutoDBInfo.colsMap.put("lastUseTime", "LONG");
        mAutoDBInfo.columns[16] = "framesInfo";
        mAutoDBInfo.colsMap.put("framesInfo", "TEXT default '' ");
        mAutoDBInfo.columns[17] = "idx";
        mAutoDBInfo.colsMap.put("idx", "INTEGER default '0' ");
        mAutoDBInfo.columns[18] = "temp";
        mAutoDBInfo.colsMap.put("temp", "INTEGER default '0' ");
        mAutoDBInfo.columns[19] = FirebaseAnalytics.C113379b.SOURCE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.SOURCE, "INTEGER default '0' ");
        mAutoDBInfo.columns[20] = "needupload";
        mAutoDBInfo.colsMap.put("needupload", "INTEGER default '0' ");
        mAutoDBInfo.columns[21] = "designerID";
        mAutoDBInfo.colsMap.put("designerID", "TEXT");
        mAutoDBInfo.columns[22] = "thumbUrl";
        mAutoDBInfo.colsMap.put("thumbUrl", "TEXT");
        mAutoDBInfo.columns[23] = "cdnUrl";
        mAutoDBInfo.colsMap.put("cdnUrl", "TEXT");
        mAutoDBInfo.columns[24] = "encrypturl";
        mAutoDBInfo.colsMap.put("encrypturl", "TEXT");
        mAutoDBInfo.columns[25] = "aeskey";
        mAutoDBInfo.colsMap.put("aeskey", "TEXT");
        mAutoDBInfo.columns[26] = "width";
        mAutoDBInfo.colsMap.put("width", "INTEGER default '0' ");
        mAutoDBInfo.columns[27] = "height";
        mAutoDBInfo.colsMap.put("height", "INTEGER default '0' ");
        mAutoDBInfo.columns[28] = "externUrl";
        mAutoDBInfo.colsMap.put("externUrl", "TEXT");
        mAutoDBInfo.columns[29] = "externMd5";
        mAutoDBInfo.colsMap.put("externMd5", "TEXT");
        mAutoDBInfo.columns[30] = "activityid";
        mAutoDBInfo.colsMap.put("activityid", "TEXT");
        mAutoDBInfo.columns[31] = "tpurl";
        mAutoDBInfo.colsMap.put("tpurl", "TEXT");
        mAutoDBInfo.columns[32] = "tpauthkey";
        mAutoDBInfo.colsMap.put("tpauthkey", "TEXT");
        mAutoDBInfo.columns[33] = "wxamMd5";
        mAutoDBInfo.colsMap.put("wxamMd5", "TEXT");
        mAutoDBInfo.columns[34] = "attachedText";
        mAutoDBInfo.colsMap.put("attachedText", "TEXT");
        mAutoDBInfo.columns[35] = "captureStatus";
        mAutoDBInfo.colsMap.put("captureStatus", "INTEGER default '0' ");
        mAutoDBInfo.columns[36] = "attachedEmojiMD5";
        mAutoDBInfo.colsMap.put("attachedEmojiMD5", "BLOB default '' ");
        mAutoDBInfo.columns[37] = "imitateMd5";
        mAutoDBInfo.colsMap.put("imitateMd5", "TEXT");
        mAutoDBInfo.columns[38] = "captureUploadErrCode";
        mAutoDBInfo.colsMap.put("captureUploadErrCode", "INTEGER default '0' ");
        mAutoDBInfo.columns[39] = "captureUploadCounter";
        mAutoDBInfo.colsMap.put("captureUploadCounter", "INTEGER default '0' ");
        mAutoDBInfo.columns[40] = "captureEnterTime";
        mAutoDBInfo.colsMap.put("captureEnterTime", "LONG");
        mAutoDBInfo.columns[41] = "lensId";
        mAutoDBInfo.colsMap.put("lensId", "TEXT");
        mAutoDBInfo.columns[42] = "attachTextColor";
        mAutoDBInfo.colsMap.put("attachTextColor", "TEXT");
        mAutoDBInfo.columns[43] = "captureScene";
        mAutoDBInfo.colsMap.put("captureScene", "INTEGER");
        mAutoDBInfo.columns[44] = "attr";
        mAutoDBInfo.colsMap.put("attr", "TEXT");
        mAutoDBInfo.columns[45] = "linkId";
        mAutoDBInfo.colsMap.put("linkId", "TEXT");
        mAutoDBInfo.columns[46] = "meanings";
        mAutoDBInfo.colsMap.put("meanings", "TEXT");
        mAutoDBInfo.columns[47] = "rowid";
        mAutoDBInfo.sql = " md5 TEXT PRIMARY KEY  COLLATE NOCASE ,  svrid TEXT,  catalog INTEGER,  type INTEGER,  size INTEGER,  start INTEGER,  state INTEGER,  name TEXT,  content TEXT,  reserved1 TEXT,  reserved2 TEXT,  reserved3 INTEGER,  reserved4 INTEGER,  app_id TEXT,  groupId TEXT default '' ,  lastUseTime LONG,  framesInfo TEXT default '' ,  idx INTEGER default '0' ,  temp INTEGER default '0' ,  source INTEGER default '0' ,  needupload INTEGER default '0' ,  designerID TEXT,  thumbUrl TEXT,  cdnUrl TEXT,  encrypturl TEXT,  aeskey TEXT,  width INTEGER default '0' ,  height INTEGER default '0' ,  externUrl TEXT,  externMd5 TEXT,  activityid TEXT,  tpurl TEXT,  tpauthkey TEXT,  wxamMd5 TEXT,  attachedText TEXT,  captureStatus INTEGER default '0' ,  attachedEmojiMD5 BLOB default '' ,  imitateMd5 TEXT,  captureUploadErrCode INTEGER default '0' ,  captureUploadCounter INTEGER default '0' ,  captureEnterTime LONG,  lensId TEXT,  attachTextColor TEXT,  captureScene INTEGER,  attr TEXT,  linkId TEXT,  meanings TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102678y1)) {
            return false;
        }
        C102678y1 y1Var = (C102678y1) iAutoDBItem;
        return C46238a.m51546a(this.field_md5, y1Var.field_md5) && C46238a.m51546a(this.field_svrid, y1Var.field_svrid) && C46238a.m51546a(Integer.valueOf(this.field_catalog), Integer.valueOf(y1Var.field_catalog)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(y1Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_size), Integer.valueOf(y1Var.field_size)) && C46238a.m51546a(Integer.valueOf(this.field_start), Integer.valueOf(y1Var.field_start)) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(y1Var.field_state)) && C46238a.m51546a(this.field_name, y1Var.field_name) && C46238a.m51546a(this.field_content, y1Var.field_content) && C46238a.m51546a(this.field_reserved1, y1Var.field_reserved1) && C46238a.m51546a(this.field_reserved2, y1Var.field_reserved2) && C46238a.m51546a(Integer.valueOf(this.field_reserved3), Integer.valueOf(y1Var.field_reserved3)) && C46238a.m51546a(Integer.valueOf(this.field_reserved4), Integer.valueOf(y1Var.field_reserved4)) && C46238a.m51546a(this.field_app_id, y1Var.field_app_id) && C46238a.m51546a(this.field_groupId, y1Var.field_groupId) && C46238a.m51546a(Long.valueOf(this.field_lastUseTime), Long.valueOf(y1Var.field_lastUseTime)) && C46238a.m51546a(this.field_framesInfo, y1Var.field_framesInfo) && C46238a.m51546a(Integer.valueOf(this.field_idx), Integer.valueOf(y1Var.field_idx)) && C46238a.m51546a(Integer.valueOf(this.field_temp), Integer.valueOf(y1Var.field_temp)) && C46238a.m51546a(Integer.valueOf(this.field_source), Integer.valueOf(y1Var.field_source)) && C46238a.m51546a(Integer.valueOf(this.field_needupload), Integer.valueOf(y1Var.field_needupload)) && C46238a.m51546a(this.field_designerID, y1Var.field_designerID) && C46238a.m51546a(this.field_thumbUrl, y1Var.field_thumbUrl) && C46238a.m51546a(this.field_cdnUrl, y1Var.field_cdnUrl) && C46238a.m51546a(this.field_encrypturl, y1Var.field_encrypturl) && C46238a.m51546a(this.field_aeskey, y1Var.field_aeskey) && C46238a.m51546a(Integer.valueOf(this.field_width), Integer.valueOf(y1Var.field_width)) && C46238a.m51546a(Integer.valueOf(this.field_height), Integer.valueOf(y1Var.field_height)) && C46238a.m51546a(this.field_externUrl, y1Var.field_externUrl) && C46238a.m51546a(this.field_externMd5, y1Var.field_externMd5) && C46238a.m51546a(this.field_activityid, y1Var.field_activityid) && C46238a.m51546a(this.field_tpurl, y1Var.field_tpurl) && C46238a.m51546a(this.field_tpauthkey, y1Var.field_tpauthkey) && C46238a.m51546a(this.field_wxamMd5, y1Var.field_wxamMd5) && C46238a.m51546a(this.field_attachedText, y1Var.field_attachedText) && C46238a.m51546a(Integer.valueOf(this.field_captureStatus), Integer.valueOf(y1Var.field_captureStatus)) && C46238a.m51546a(this.field_attachedEmojiMD5, y1Var.field_attachedEmojiMD5) && C46238a.m51546a(this.field_imitateMd5, y1Var.field_imitateMd5) && C46238a.m51546a(Integer.valueOf(this.field_captureUploadErrCode), Integer.valueOf(y1Var.field_captureUploadErrCode)) && C46238a.m51546a(Integer.valueOf(this.field_captureUploadCounter), Integer.valueOf(y1Var.field_captureUploadCounter)) && C46238a.m51546a(Long.valueOf(this.field_captureEnterTime), Long.valueOf(y1Var.field_captureEnterTime)) && C46238a.m51546a(this.field_lensId, y1Var.field_lensId) && C46238a.m51546a(this.field_attachTextColor, y1Var.field_attachTextColor) && C46238a.m51546a(Integer.valueOf(this.field_captureScene), Integer.valueOf(y1Var.field_captureScene)) && C46238a.m51546a(this.field_attr, y1Var.field_attr) && C46238a.m51546a(this.field_linkId, y1Var.field_linkId) && C46238a.m51546a(this.field_meanings, y1Var.field_meanings);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f303206R0 == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                        this.f303267d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303207S0 == hashCode) {
                    try {
                        this.field_svrid = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303208T0 == hashCode) {
                    try {
                        this.field_catalog = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303209U0 == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303210V0 == hashCode) {
                    try {
                        this.field_size = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303211W0 == hashCode) {
                    try {
                        this.field_start = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303212X0 == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303213Y0 == hashCode) {
                    try {
                        this.field_name = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303214Z0 == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303215a1 == hashCode) {
                    try {
                        this.field_reserved1 = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303216b1 == hashCode) {
                    try {
                        this.field_reserved2 = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303217c1 == hashCode) {
                    try {
                        this.field_reserved3 = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303218d1 == hashCode) {
                    try {
                        this.field_reserved4 = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303219e1 == hashCode) {
                    try {
                        this.field_app_id = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303220f1 == hashCode) {
                    try {
                        this.field_groupId = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303221g1 == hashCode) {
                    try {
                        this.field_lastUseTime = cursor.getLong(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303222h1 == hashCode) {
                    try {
                        this.field_framesInfo = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303223i1 == hashCode) {
                    try {
                        this.field_idx = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303224j1 == hashCode) {
                    try {
                        this.field_temp = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303225k1 == hashCode) {
                    try {
                        this.field_source = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303226l1 == hashCode) {
                    try {
                        this.field_needupload = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303227m1 == hashCode) {
                    try {
                        this.field_designerID = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303228n1 == hashCode) {
                    try {
                        this.field_thumbUrl = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303229o1 == hashCode) {
                    try {
                        this.field_cdnUrl = cursor.getString(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303230p1 == hashCode) {
                    try {
                        this.field_encrypturl = cursor.getString(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303231q1 == hashCode) {
                    try {
                        this.field_aeskey = cursor.getString(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303232r1 == hashCode) {
                    try {
                        this.field_width = cursor.getInt(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303233s1 == hashCode) {
                    try {
                        this.field_height = cursor.getInt(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303234t1 == hashCode) {
                    try {
                        this.field_externUrl = cursor.getString(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303235u1 == hashCode) {
                    try {
                        this.field_externMd5 = cursor.getString(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303236v1 == hashCode) {
                    try {
                        this.field_activityid = cursor.getString(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303237w1 == hashCode) {
                    try {
                        this.field_tpurl = cursor.getString(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303238x1 == hashCode) {
                    try {
                        this.field_tpauthkey = cursor.getString(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303240y1 == hashCode) {
                    try {
                        this.field_wxamMd5 = cursor.getString(i);
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303241z1 == hashCode) {
                    try {
                        this.field_attachedText = cursor.getString(i);
                    } catch (Throwable th37) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th37, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303190A1 == hashCode) {
                    try {
                        this.field_captureStatus = cursor.getInt(i);
                    } catch (Throwable th38) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th38, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303191B1 == hashCode) {
                    try {
                        this.field_attachedEmojiMD5 = cursor.getBlob(i);
                    } catch (Throwable th39) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th39, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303192C1 == hashCode) {
                    try {
                        this.field_imitateMd5 = cursor.getString(i);
                    } catch (Throwable th40) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th40, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303193D1 == hashCode) {
                    try {
                        this.field_captureUploadErrCode = cursor.getInt(i);
                    } catch (Throwable th41) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th41, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303194E1 == hashCode) {
                    try {
                        this.field_captureUploadCounter = cursor.getInt(i);
                    } catch (Throwable th42) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th42, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303195F1 == hashCode) {
                    try {
                        this.field_captureEnterTime = cursor.getLong(i);
                    } catch (Throwable th43) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th43, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303196G1 == hashCode) {
                    try {
                        this.field_lensId = cursor.getString(i);
                    } catch (Throwable th44) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th44, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303197H1 == hashCode) {
                    try {
                        this.field_attachTextColor = cursor.getString(i);
                    } catch (Throwable th45) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th45, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303198I1 == hashCode) {
                    try {
                        this.field_captureScene = cursor.getInt(i);
                    } catch (Throwable th46) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th46, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303199J1 == hashCode) {
                    try {
                        this.field_attr = cursor.getString(i);
                    } catch (Throwable th47) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th47, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303200K1 == hashCode) {
                    try {
                        this.field_linkId = cursor.getString(i);
                    } catch (Throwable th48) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th48, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303201L1 == hashCode) {
                    try {
                        this.field_meanings = cursor.getString(i);
                    } catch (Throwable th49) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfo", th49, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303202M1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f303267d) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f303268e) {
            contentValues.put("svrid", this.field_svrid);
        }
        if (this.f303269f) {
            contentValues.put("catalog", Integer.valueOf(this.field_catalog));
        }
        if (this.f303270g) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f303271h) {
            contentValues.put("size", Integer.valueOf(this.field_size));
        }
        if (this.f303272i) {
            contentValues.put(IXWebBroadcastListener.STAGE_START, Integer.valueOf(this.field_start));
        }
        if (this.f303273j) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f303274n) {
            contentValues.put("name", this.field_name);
        }
        if (this.f303275o) {
            contentValues.put("content", this.field_content);
        }
        if (this.f303276p) {
            contentValues.put("reserved1", this.field_reserved1);
        }
        if (this.f303278q) {
            contentValues.put("reserved2", this.field_reserved2);
        }
        if (this.f303279r) {
            contentValues.put("reserved3", Integer.valueOf(this.field_reserved3));
        }
        if (this.f303280s) {
            contentValues.put("reserved4", Integer.valueOf(this.field_reserved4));
        }
        if (this.f303281t) {
            contentValues.put("app_id", this.field_app_id);
        }
        if (this.field_groupId == null) {
            this.field_groupId = "";
        }
        if (this.f303282u) {
            contentValues.put("groupId", this.field_groupId);
        }
        if (this.f303283v) {
            contentValues.put("lastUseTime", Long.valueOf(this.field_lastUseTime));
        }
        if (this.field_framesInfo == null) {
            this.field_framesInfo = "";
        }
        if (this.f303284w) {
            contentValues.put("framesInfo", this.field_framesInfo);
        }
        if (this.f303285x) {
            contentValues.put("idx", Integer.valueOf(this.field_idx));
        }
        if (this.f303287y) {
            contentValues.put("temp", Integer.valueOf(this.field_temp));
        }
        if (this.f303288z) {
            contentValues.put(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(this.field_source));
        }
        if (this.f303242A) {
            contentValues.put("needupload", Integer.valueOf(this.field_needupload));
        }
        if (this.f303243B) {
            contentValues.put("designerID", this.field_designerID);
        }
        if (this.f303244C) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.f303245D) {
            contentValues.put("cdnUrl", this.field_cdnUrl);
        }
        if (this.f303246E) {
            contentValues.put("encrypturl", this.field_encrypturl);
        }
        if (this.f303247F) {
            contentValues.put("aeskey", this.field_aeskey);
        }
        if (this.f303248G) {
            contentValues.put("width", Integer.valueOf(this.field_width));
        }
        if (this.f303249H) {
            contentValues.put("height", Integer.valueOf(this.field_height));
        }
        if (this.f303250I) {
            contentValues.put("externUrl", this.field_externUrl);
        }
        if (this.f303251J) {
            contentValues.put("externMd5", this.field_externMd5);
        }
        if (this.f303252K) {
            contentValues.put("activityid", this.field_activityid);
        }
        if (this.f303253L) {
            contentValues.put("tpurl", this.field_tpurl);
        }
        if (this.f303254M) {
            contentValues.put("tpauthkey", this.field_tpauthkey);
        }
        if (this.f303255N) {
            contentValues.put("wxamMd5", this.field_wxamMd5);
        }
        if (this.f303256P) {
            contentValues.put("attachedText", this.field_attachedText);
        }
        if (this.f303257Q) {
            contentValues.put("captureStatus", Integer.valueOf(this.field_captureStatus));
        }
        if (this.f303258R) {
            contentValues.put("attachedEmojiMD5", this.field_attachedEmojiMD5);
        }
        if (this.f303259S) {
            contentValues.put("imitateMd5", this.field_imitateMd5);
        }
        if (this.f303260T) {
            contentValues.put("captureUploadErrCode", Integer.valueOf(this.field_captureUploadErrCode));
        }
        if (this.f303261U) {
            contentValues.put("captureUploadCounter", Integer.valueOf(this.field_captureUploadCounter));
        }
        if (this.f303262V) {
            contentValues.put("captureEnterTime", Long.valueOf(this.field_captureEnterTime));
        }
        if (this.f303263W) {
            contentValues.put("lensId", this.field_lensId);
        }
        if (this.f303264X) {
            contentValues.put("attachTextColor", this.field_attachTextColor);
        }
        if (this.f303265Y) {
            contentValues.put("captureScene", Integer.valueOf(this.field_captureScene));
        }
        if (this.f303266Z) {
            contentValues.put("attr", this.field_attr);
        }
        if (this.f303277p0) {
            contentValues.put("linkId", this.field_linkId);
        }
        if (this.f303286x0) {
            contentValues.put("meanings", this.field_meanings);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEmojiInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmojiInfo ( " + f303203N1.sql + ");");
        for (String add : f303205Q0) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmojiInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f303203N1, "EmojiInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmojiInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmojiInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f303203N1;
    }

    public String[] getIndexCreateSQL() {
        return f303205Q0;
    }

    public StorageObserverOwner<C102678y1> getObserverOwner() {
        return f303204O1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_md5;
    }

    public SingleTable getTable() {
        return f303239y0;
    }

    public String getTableName() {
        return f303239y0.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f303267d = true;
            }
        }
        if (contentValues.containsKey("svrid")) {
            this.field_svrid = contentValues.getAsString("svrid");
            if (z) {
                this.f303268e = true;
            }
        }
        if (contentValues.containsKey("catalog")) {
            this.field_catalog = contentValues.getAsInteger("catalog").intValue();
            if (z) {
                this.f303269f = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f303270g = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsInteger("size").intValue();
            if (z) {
                this.f303271h = true;
            }
        }
        if (contentValues.containsKey(IXWebBroadcastListener.STAGE_START)) {
            this.field_start = contentValues.getAsInteger(IXWebBroadcastListener.STAGE_START).intValue();
            if (z) {
                this.f303272i = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f303273j = true;
            }
        }
        if (contentValues.containsKey("name")) {
            this.field_name = contentValues.getAsString("name");
            if (z) {
                this.f303274n = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f303275o = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.field_reserved1 = contentValues.getAsString("reserved1");
            if (z) {
                this.f303276p = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.field_reserved2 = contentValues.getAsString("reserved2");
            if (z) {
                this.f303278q = true;
            }
        }
        if (contentValues.containsKey("reserved3")) {
            this.field_reserved3 = contentValues.getAsInteger("reserved3").intValue();
            if (z) {
                this.f303279r = true;
            }
        }
        if (contentValues.containsKey("reserved4")) {
            this.field_reserved4 = contentValues.getAsInteger("reserved4").intValue();
            if (z) {
                this.f303280s = true;
            }
        }
        if (contentValues.containsKey("app_id")) {
            this.field_app_id = contentValues.getAsString("app_id");
            if (z) {
                this.f303281t = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsString("groupId");
            if (z) {
                this.f303282u = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.field_lastUseTime = contentValues.getAsLong("lastUseTime").longValue();
            if (z) {
                this.f303283v = true;
            }
        }
        if (contentValues.containsKey("framesInfo")) {
            this.field_framesInfo = contentValues.getAsString("framesInfo");
            if (z) {
                this.f303284w = true;
            }
        }
        if (contentValues.containsKey("idx")) {
            this.field_idx = contentValues.getAsInteger("idx").intValue();
            if (z) {
                this.f303285x = true;
            }
        }
        if (contentValues.containsKey("temp")) {
            this.field_temp = contentValues.getAsInteger("temp").intValue();
            if (z) {
                this.f303287y = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.SOURCE)) {
            this.field_source = contentValues.getAsInteger(FirebaseAnalytics.C113379b.SOURCE).intValue();
            if (z) {
                this.f303288z = true;
            }
        }
        if (contentValues.containsKey("needupload")) {
            this.field_needupload = contentValues.getAsInteger("needupload").intValue();
            if (z) {
                this.f303242A = true;
            }
        }
        if (contentValues.containsKey("designerID")) {
            this.field_designerID = contentValues.getAsString("designerID");
            if (z) {
                this.f303243B = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z) {
                this.f303244C = true;
            }
        }
        if (contentValues.containsKey("cdnUrl")) {
            this.field_cdnUrl = contentValues.getAsString("cdnUrl");
            if (z) {
                this.f303245D = true;
            }
        }
        if (contentValues.containsKey("encrypturl")) {
            this.field_encrypturl = contentValues.getAsString("encrypturl");
            if (z) {
                this.f303246E = true;
            }
        }
        if (contentValues.containsKey("aeskey")) {
            this.field_aeskey = contentValues.getAsString("aeskey");
            if (z) {
                this.f303247F = true;
            }
        }
        if (contentValues.containsKey("width")) {
            this.field_width = contentValues.getAsInteger("width").intValue();
            if (z) {
                this.f303248G = true;
            }
        }
        if (contentValues.containsKey("height")) {
            this.field_height = contentValues.getAsInteger("height").intValue();
            if (z) {
                this.f303249H = true;
            }
        }
        if (contentValues.containsKey("externUrl")) {
            this.field_externUrl = contentValues.getAsString("externUrl");
            if (z) {
                this.f303250I = true;
            }
        }
        if (contentValues.containsKey("externMd5")) {
            this.field_externMd5 = contentValues.getAsString("externMd5");
            if (z) {
                this.f303251J = true;
            }
        }
        if (contentValues.containsKey("activityid")) {
            this.field_activityid = contentValues.getAsString("activityid");
            if (z) {
                this.f303252K = true;
            }
        }
        if (contentValues.containsKey("tpurl")) {
            this.field_tpurl = contentValues.getAsString("tpurl");
            if (z) {
                this.f303253L = true;
            }
        }
        if (contentValues.containsKey("tpauthkey")) {
            this.field_tpauthkey = contentValues.getAsString("tpauthkey");
            if (z) {
                this.f303254M = true;
            }
        }
        if (contentValues.containsKey("wxamMd5")) {
            this.field_wxamMd5 = contentValues.getAsString("wxamMd5");
            if (z) {
                this.f303255N = true;
            }
        }
        if (contentValues.containsKey("attachedText")) {
            this.field_attachedText = contentValues.getAsString("attachedText");
            if (z) {
                this.f303256P = true;
            }
        }
        if (contentValues.containsKey("captureStatus")) {
            this.field_captureStatus = contentValues.getAsInteger("captureStatus").intValue();
            if (z) {
                this.f303257Q = true;
            }
        }
        if (contentValues.containsKey("attachedEmojiMD5")) {
            this.field_attachedEmojiMD5 = contentValues.getAsByteArray("attachedEmojiMD5");
            if (z) {
                this.f303258R = true;
            }
        }
        if (contentValues.containsKey("imitateMd5")) {
            this.field_imitateMd5 = contentValues.getAsString("imitateMd5");
            if (z) {
                this.f303259S = true;
            }
        }
        if (contentValues.containsKey("captureUploadErrCode")) {
            this.field_captureUploadErrCode = contentValues.getAsInteger("captureUploadErrCode").intValue();
            if (z) {
                this.f303260T = true;
            }
        }
        if (contentValues.containsKey("captureUploadCounter")) {
            this.field_captureUploadCounter = contentValues.getAsInteger("captureUploadCounter").intValue();
            if (z) {
                this.f303261U = true;
            }
        }
        if (contentValues.containsKey("captureEnterTime")) {
            this.field_captureEnterTime = contentValues.getAsLong("captureEnterTime").longValue();
            if (z) {
                this.f303262V = true;
            }
        }
        if (contentValues.containsKey("lensId")) {
            this.field_lensId = contentValues.getAsString("lensId");
            if (z) {
                this.f303263W = true;
            }
        }
        if (contentValues.containsKey("attachTextColor")) {
            this.field_attachTextColor = contentValues.getAsString("attachTextColor");
            if (z) {
                this.f303264X = true;
            }
        }
        if (contentValues.containsKey("captureScene")) {
            this.field_captureScene = contentValues.getAsInteger("captureScene").intValue();
            if (z) {
                this.f303265Y = true;
            }
        }
        if (contentValues.containsKey("attr")) {
            this.field_attr = contentValues.getAsString("attr");
            if (z) {
                this.f303266Z = true;
            }
        }
        if (contentValues.containsKey("linkId")) {
            this.field_linkId = contentValues.getAsString("linkId");
            if (z) {
                this.f303277p0 = true;
            }
        }
        if (contentValues.containsKey("meanings")) {
            this.field_meanings = contentValues.getAsString("meanings");
            if (z) {
                this.f303286x0 = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
