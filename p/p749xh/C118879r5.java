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

/* renamed from: xh.r5 */
public class C118879r5 extends IAutoDBItem {

    /* renamed from: A1 */
    public static final int f355913A1 = -734674017;

    /* renamed from: B1 */
    public static final int f355914B1 = 1073334147;

    /* renamed from: C1 */
    public static final int f355915C1 = 100054884;

    /* renamed from: D1 */
    public static final int f355916D1 = 976349293;

    /* renamed from: E1 */
    public static final int f355917E1 = 2273433;

    /* renamed from: F1 */
    public static final int f355918F1 = 1653245630;

    /* renamed from: G1 */
    public static final int f355919G1 = 1653245782;

    /* renamed from: H1 */
    public static final int f355920H1 = 1653246166;

    /* renamed from: I1 */
    public static final int f355921I1 = 1653245692;

    /* renamed from: J1 */
    public static final int f355922J1 = 873213424;

    /* renamed from: K1 */
    public static final int f355923K1 = 108705909;

    /* renamed from: L1 */
    public static final IAutoDBItem.MAutoDBInfo f355924L1 = initAutoDBInfo(C118879r5.class);

    /* renamed from: M1 */
    public static final StorageObserverOwner<C118879r5> f355925M1 = new StorageObserverOwner<>();

    /* renamed from: Q0 */
    public static final int f355926Q0 = 1758167574;

    /* renamed from: R0 */
    public static final int f355927R0 = 96960536;

    /* renamed from: S0 */
    public static final int f355928S0 = 2622298;

    /* renamed from: T0 */
    public static final int f355929T0 = 1567053517;

    /* renamed from: U0 */
    public static final int f355930U0 = -1805606060;

    /* renamed from: V0 */
    public static final int f355931V0 = 1963938402;

    /* renamed from: W0 */
    public static final int f355932W0 = 30876478;

    /* renamed from: X0 */
    public static final int f355933X0 = -1828788546;

    /* renamed from: Y0 */
    public static final int f355934Y0 = -1828954344;

    /* renamed from: Z0 */
    public static final int f355935Z0 = 80436;

    /* renamed from: a1 */
    public static final int f355936a1 = 1296174903;

    /* renamed from: b1 */
    public static final int f355937b1 = -1805356078;

    /* renamed from: c1 */
    public static final int f355938c1 = -1805355926;

    /* renamed from: d1 */
    public static final int f355939d1 = -1805355542;

    /* renamed from: e1 */
    public static final int f355940e1 = -1805356016;

    /* renamed from: f1 */
    public static final int f355941f1 = -1073466183;

    /* renamed from: g1 */
    public static final int f355942g1 = -1073466031;

    /* renamed from: h1 */
    public static final int f355943h1 = -1073465647;

    /* renamed from: i1 */
    public static final int f355944i1 = -1073466121;

    /* renamed from: j1 */
    public static final int f355945j1 = 1703457707;

    /* renamed from: k1 */
    public static final int f355946k1 = 1703457859;

    /* renamed from: l1 */
    public static final int f355947l1 = 1703458243;

    /* renamed from: m1 */
    public static final int f355948m1 = 1703457769;

    /* renamed from: n1 */
    public static final int f355949n1 = -2128341457;

    /* renamed from: o1 */
    public static final int f355950o1 = -1606289880;

    /* renamed from: p1 */
    public static final int f355951p1 = 1349547969;

    /* renamed from: q1 */
    public static final int f355952q1 = 852985952;

    /* renamed from: r1 */
    public static final int f355953r1 = -892481550;

    /* renamed from: s1 */
    public static final int f355954s1 = -290517359;

    /* renamed from: t1 */
    public static final int f355955t1 = -290517207;

    /* renamed from: u1 */
    public static final int f355956u1 = -290516823;

    /* renamed from: v1 */
    public static final int f355957v1 = -290517297;

    /* renamed from: w1 */
    public static final int f355958w1 = 314075022;

    /* renamed from: x0 */
    public static final SingleTable f355959x0;

    /* renamed from: x1 */
    public static final int f355960x1 = 314075174;

    /* renamed from: y0 */
    public static final String[] f355961y0 = new String[0];

    /* renamed from: y1 */
    public static final int f355962y1 = 314075558;

    /* renamed from: z1 */
    public static final int f355963z1 = 314075084;

    /* renamed from: A */
    public boolean f355964A = true;

    /* renamed from: B */
    public boolean f355965B = true;

    /* renamed from: C */
    public boolean f355966C = true;

    /* renamed from: D */
    public boolean f355967D = true;

    /* renamed from: E */
    public boolean f355968E = true;

    /* renamed from: F */
    public boolean f355969F = true;

    /* renamed from: G */
    public boolean f355970G = true;

    /* renamed from: H */
    public boolean f355971H = true;

    /* renamed from: I */
    public boolean f355972I = true;

    /* renamed from: J */
    public boolean f355973J = true;

    /* renamed from: K */
    public boolean f355974K = true;

    /* renamed from: L */
    public boolean f355975L = true;

    /* renamed from: M */
    public boolean f355976M = true;

    /* renamed from: N */
    public boolean f355977N = true;

    /* renamed from: P */
    public boolean f355978P = true;

    /* renamed from: Q */
    public boolean f355979Q = true;

    /* renamed from: R */
    public boolean f355980R = true;

    /* renamed from: S */
    public boolean f355981S = true;

    /* renamed from: T */
    public boolean f355982T = true;

    /* renamed from: U */
    public boolean f355983U = true;

    /* renamed from: V */
    public boolean f355984V = true;

    /* renamed from: W */
    public boolean f355985W = true;

    /* renamed from: X */
    public boolean f355986X = true;

    /* renamed from: Y */
    public boolean f355987Y = true;

    /* renamed from: Z */
    public boolean f355988Z = true;

    /* renamed from: d */
    public boolean f355989d = true;

    /* renamed from: e */
    public boolean f355990e = true;

    /* renamed from: f */
    public boolean f355991f = true;
    public int field_AllVer;
    public int field_BizType;
    public String field_Desc_cn;
    public String field_Desc_en;
    public String field_Desc_hk;
    public String field_Desc_tw;
    public String field_DetailURL;
    public String field_Icon;
    public String field_ImgUrl_android_cn;
    public String field_ImgUrl_android_en;
    public String field_ImgUrl_android_hk;
    public String field_ImgUrl_android_tw;
    public String field_ImgUrl_cn;
    public String field_ImgUrl_en;
    public String field_ImgUrl_hk;
    public String field_ImgUrl_tw;
    public String field_Introduce_cn;
    public String field_Introduce_en;
    public String field_Introduce_hk;
    public String field_Introduce_tw;
    public String field_LabsAppId;
    public int field_Pos;
    public int field_RedPoint;
    public int field_Switch;
    public String field_ThumbUrl_cn;
    public String field_ThumbUrl_en;
    public String field_ThumbUrl_hk;
    public String field_ThumbUrl_tw;
    public String field_TitleKey_android;
    public String field_Title_cn;
    public String field_Title_en;
    public String field_Title_hk;
    public String field_Title_tw;
    public int field_Type;
    public int field_WeAppDebugMode;
    public String field_WeAppPath;
    public String field_WeAppUser;
    public int field_bItemFromXExpt;
    public long field_endtime;
    public String field_expId;
    public int field_idkey;
    public int field_idkeyValue;
    public int field_prioritylevel;
    public long field_sequence;
    public long field_starttime;
    public int field_status;

    /* renamed from: g */
    public boolean f355992g = true;

    /* renamed from: h */
    public boolean f355993h = true;

    /* renamed from: i */
    public boolean f355994i = true;

    /* renamed from: j */
    public boolean f355995j = true;

    /* renamed from: n */
    public boolean f355996n = true;

    /* renamed from: o */
    public boolean f355997o = true;

    /* renamed from: p */
    public boolean f355998p = true;

    /* renamed from: p0 */
    public boolean f355999p0 = true;

    /* renamed from: q */
    public boolean f356000q = true;

    /* renamed from: r */
    public boolean f356001r = true;

    /* renamed from: s */
    public boolean f356002s = true;

    /* renamed from: t */
    public boolean f356003t = true;

    /* renamed from: u */
    public boolean f356004u = true;

    /* renamed from: v */
    public boolean f356005v = true;

    /* renamed from: w */
    public boolean f356006w = true;

    /* renamed from: x */
    public boolean f356007x = true;

    /* renamed from: y */
    public boolean f356008y = true;

    /* renamed from: z */
    public boolean f356009z = true;

    static {
        SingleTable singleTable = new SingleTable("LabAppInfo");
        f355959x0 = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("LabsAppId", "string", singleTable.getName(), "");
        new Column("expId", "string", singleTable.getName(), "");
        new Column("Type", "int", singleTable.getName(), "");
        new Column("BizType", "int", singleTable.getName(), "");
        new Column("Switch", "int", singleTable.getName(), "");
        new Column("AllVer", "int", singleTable.getName(), "");
        new Column("DetailURL", "string", singleTable.getName(), "");
        new Column("WeAppUser", "string", singleTable.getName(), "");
        new Column("WeAppPath", "string", singleTable.getName(), "");
        new Column("Pos", "int", singleTable.getName(), "");
        new Column("TitleKey_android", "string", singleTable.getName(), "");
        new Column("Title_cn", "string", singleTable.getName(), "");
        new Column("Title_hk", "string", singleTable.getName(), "");
        new Column("Title_tw", "string", singleTable.getName(), "");
        new Column("Title_en", "string", singleTable.getName(), "");
        new Column("Desc_cn", "string", singleTable.getName(), "");
        new Column("Desc_hk", "string", singleTable.getName(), "");
        new Column("Desc_tw", "string", singleTable.getName(), "");
        new Column("Desc_en", "string", singleTable.getName(), "");
        new Column("Introduce_cn", "string", singleTable.getName(), "");
        new Column("Introduce_hk", "string", singleTable.getName(), "");
        new Column("Introduce_tw", "string", singleTable.getName(), "");
        new Column("Introduce_en", "string", singleTable.getName(), "");
        new Column("starttime", "long", singleTable.getName(), "");
        new Column("endtime", "long", singleTable.getName(), "");
        new Column("sequence", "long", singleTable.getName(), "");
        new Column("prioritylevel", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("ThumbUrl_cn", "string", singleTable.getName(), "");
        new Column("ThumbUrl_hk", "string", singleTable.getName(), "");
        new Column("ThumbUrl_tw", "string", singleTable.getName(), "");
        new Column("ThumbUrl_en", "string", singleTable.getName(), "");
        new Column("ImgUrl_android_cn", "string", singleTable.getName(), "");
        new Column("ImgUrl_android_hk", "string", singleTable.getName(), "");
        new Column("ImgUrl_android_tw", "string", singleTable.getName(), "");
        new Column("ImgUrl_android_en", "string", singleTable.getName(), "");
        new Column("RedPoint", "int", singleTable.getName(), "");
        new Column("WeAppDebugMode", "int", singleTable.getName(), "");
        new Column("idkey", "int", singleTable.getName(), "");
        new Column("idkeyValue", "int", singleTable.getName(), "");
        new Column("Icon", "string", singleTable.getName(), "");
        new Column("ImgUrl_cn", "string", singleTable.getName(), "");
        new Column("ImgUrl_hk", "string", singleTable.getName(), "");
        new Column("ImgUrl_tw", "string", singleTable.getName(), "");
        new Column("ImgUrl_en", "string", singleTable.getName(), "");
        new Column("bItemFromXExpt", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[46];
        String[] strArr = new String[47];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "LabsAppId";
        mAutoDBInfo.colsMap.put("LabsAppId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "LabsAppId";
        mAutoDBInfo.columns[1] = "expId";
        mAutoDBInfo.colsMap.put("expId", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "Type";
        mAutoDBInfo.colsMap.put("Type", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "BizType";
        mAutoDBInfo.colsMap.put("BizType", "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = "Switch";
        mAutoDBInfo.colsMap.put("Switch", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "AllVer";
        mAutoDBInfo.colsMap.put("AllVer", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "DetailURL";
        mAutoDBInfo.colsMap.put("DetailURL", "TEXT");
        mAutoDBInfo.columns[7] = "WeAppUser";
        mAutoDBInfo.colsMap.put("WeAppUser", "TEXT");
        mAutoDBInfo.columns[8] = "WeAppPath";
        mAutoDBInfo.colsMap.put("WeAppPath", "TEXT");
        mAutoDBInfo.columns[9] = "Pos";
        mAutoDBInfo.colsMap.put("Pos", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "TitleKey_android";
        mAutoDBInfo.colsMap.put("TitleKey_android", "TEXT");
        mAutoDBInfo.columns[11] = "Title_cn";
        mAutoDBInfo.colsMap.put("Title_cn", "TEXT");
        mAutoDBInfo.columns[12] = "Title_hk";
        mAutoDBInfo.colsMap.put("Title_hk", "TEXT");
        mAutoDBInfo.columns[13] = "Title_tw";
        mAutoDBInfo.colsMap.put("Title_tw", "TEXT");
        mAutoDBInfo.columns[14] = "Title_en";
        mAutoDBInfo.colsMap.put("Title_en", "TEXT");
        mAutoDBInfo.columns[15] = "Desc_cn";
        mAutoDBInfo.colsMap.put("Desc_cn", "TEXT");
        mAutoDBInfo.columns[16] = "Desc_hk";
        mAutoDBInfo.colsMap.put("Desc_hk", "TEXT");
        mAutoDBInfo.columns[17] = "Desc_tw";
        mAutoDBInfo.colsMap.put("Desc_tw", "TEXT");
        mAutoDBInfo.columns[18] = "Desc_en";
        mAutoDBInfo.colsMap.put("Desc_en", "TEXT");
        mAutoDBInfo.columns[19] = "Introduce_cn";
        mAutoDBInfo.colsMap.put("Introduce_cn", "TEXT");
        mAutoDBInfo.columns[20] = "Introduce_hk";
        mAutoDBInfo.colsMap.put("Introduce_hk", "TEXT");
        mAutoDBInfo.columns[21] = "Introduce_tw";
        mAutoDBInfo.colsMap.put("Introduce_tw", "TEXT");
        mAutoDBInfo.columns[22] = "Introduce_en";
        mAutoDBInfo.colsMap.put("Introduce_en", "TEXT");
        mAutoDBInfo.columns[23] = "starttime";
        mAutoDBInfo.colsMap.put("starttime", "LONG");
        mAutoDBInfo.columns[24] = "endtime";
        mAutoDBInfo.colsMap.put("endtime", "LONG");
        mAutoDBInfo.columns[25] = "sequence";
        mAutoDBInfo.colsMap.put("sequence", "LONG");
        mAutoDBInfo.columns[26] = "prioritylevel";
        mAutoDBInfo.colsMap.put("prioritylevel", "INTEGER");
        mAutoDBInfo.columns[27] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[28] = "ThumbUrl_cn";
        mAutoDBInfo.colsMap.put("ThumbUrl_cn", "TEXT");
        mAutoDBInfo.columns[29] = "ThumbUrl_hk";
        mAutoDBInfo.colsMap.put("ThumbUrl_hk", "TEXT");
        mAutoDBInfo.columns[30] = "ThumbUrl_tw";
        mAutoDBInfo.colsMap.put("ThumbUrl_tw", "TEXT");
        mAutoDBInfo.columns[31] = "ThumbUrl_en";
        mAutoDBInfo.colsMap.put("ThumbUrl_en", "TEXT");
        mAutoDBInfo.columns[32] = "ImgUrl_android_cn";
        mAutoDBInfo.colsMap.put("ImgUrl_android_cn", "TEXT");
        mAutoDBInfo.columns[33] = "ImgUrl_android_hk";
        mAutoDBInfo.colsMap.put("ImgUrl_android_hk", "TEXT");
        mAutoDBInfo.columns[34] = "ImgUrl_android_tw";
        mAutoDBInfo.colsMap.put("ImgUrl_android_tw", "TEXT");
        mAutoDBInfo.columns[35] = "ImgUrl_android_en";
        mAutoDBInfo.colsMap.put("ImgUrl_android_en", "TEXT");
        mAutoDBInfo.columns[36] = "RedPoint";
        mAutoDBInfo.colsMap.put("RedPoint", "INTEGER");
        mAutoDBInfo.columns[37] = "WeAppDebugMode";
        mAutoDBInfo.colsMap.put("WeAppDebugMode", "INTEGER");
        mAutoDBInfo.columns[38] = "idkey";
        mAutoDBInfo.colsMap.put("idkey", "INTEGER");
        mAutoDBInfo.columns[39] = "idkeyValue";
        mAutoDBInfo.colsMap.put("idkeyValue", "INTEGER");
        mAutoDBInfo.columns[40] = "Icon";
        mAutoDBInfo.colsMap.put("Icon", "TEXT");
        mAutoDBInfo.columns[41] = "ImgUrl_cn";
        mAutoDBInfo.colsMap.put("ImgUrl_cn", "TEXT");
        mAutoDBInfo.columns[42] = "ImgUrl_hk";
        mAutoDBInfo.colsMap.put("ImgUrl_hk", "TEXT");
        mAutoDBInfo.columns[43] = "ImgUrl_tw";
        mAutoDBInfo.colsMap.put("ImgUrl_tw", "TEXT");
        mAutoDBInfo.columns[44] = "ImgUrl_en";
        mAutoDBInfo.colsMap.put("ImgUrl_en", "TEXT");
        mAutoDBInfo.columns[45] = "bItemFromXExpt";
        mAutoDBInfo.colsMap.put("bItemFromXExpt", "INTEGER");
        mAutoDBInfo.columns[46] = "rowid";
        mAutoDBInfo.sql = " LabsAppId TEXT PRIMARY KEY ,  expId TEXT default '' ,  Type INTEGER default '0' ,  BizType INTEGER default '0' ,  Switch INTEGER default '0' ,  AllVer INTEGER default '0' ,  DetailURL TEXT,  WeAppUser TEXT,  WeAppPath TEXT,  Pos INTEGER default '0' ,  TitleKey_android TEXT,  Title_cn TEXT,  Title_hk TEXT,  Title_tw TEXT,  Title_en TEXT,  Desc_cn TEXT,  Desc_hk TEXT,  Desc_tw TEXT,  Desc_en TEXT,  Introduce_cn TEXT,  Introduce_hk TEXT,  Introduce_tw TEXT,  Introduce_en TEXT,  starttime LONG,  endtime LONG,  sequence LONG,  prioritylevel INTEGER,  status INTEGER,  ThumbUrl_cn TEXT,  ThumbUrl_hk TEXT,  ThumbUrl_tw TEXT,  ThumbUrl_en TEXT,  ImgUrl_android_cn TEXT,  ImgUrl_android_hk TEXT,  ImgUrl_android_tw TEXT,  ImgUrl_android_en TEXT,  RedPoint INTEGER,  WeAppDebugMode INTEGER,  idkey INTEGER,  idkeyValue INTEGER,  Icon TEXT,  ImgUrl_cn TEXT,  ImgUrl_hk TEXT,  ImgUrl_tw TEXT,  ImgUrl_en TEXT,  bItemFromXExpt INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C118879r5)) {
            return false;
        }
        C118879r5 r5Var = (C118879r5) iAutoDBItem;
        return C46238a.m51546a(this.field_LabsAppId, r5Var.field_LabsAppId) && C46238a.m51546a(this.field_expId, r5Var.field_expId) && C46238a.m51546a(Integer.valueOf(this.field_Type), Integer.valueOf(r5Var.field_Type)) && C46238a.m51546a(Integer.valueOf(this.field_BizType), Integer.valueOf(r5Var.field_BizType)) && C46238a.m51546a(Integer.valueOf(this.field_Switch), Integer.valueOf(r5Var.field_Switch)) && C46238a.m51546a(Integer.valueOf(this.field_AllVer), Integer.valueOf(r5Var.field_AllVer)) && C46238a.m51546a(this.field_DetailURL, r5Var.field_DetailURL) && C46238a.m51546a(this.field_WeAppUser, r5Var.field_WeAppUser) && C46238a.m51546a(this.field_WeAppPath, r5Var.field_WeAppPath) && C46238a.m51546a(Integer.valueOf(this.field_Pos), Integer.valueOf(r5Var.field_Pos)) && C46238a.m51546a(this.field_TitleKey_android, r5Var.field_TitleKey_android) && C46238a.m51546a(this.field_Title_cn, r5Var.field_Title_cn) && C46238a.m51546a(this.field_Title_hk, r5Var.field_Title_hk) && C46238a.m51546a(this.field_Title_tw, r5Var.field_Title_tw) && C46238a.m51546a(this.field_Title_en, r5Var.field_Title_en) && C46238a.m51546a(this.field_Desc_cn, r5Var.field_Desc_cn) && C46238a.m51546a(this.field_Desc_hk, r5Var.field_Desc_hk) && C46238a.m51546a(this.field_Desc_tw, r5Var.field_Desc_tw) && C46238a.m51546a(this.field_Desc_en, r5Var.field_Desc_en) && C46238a.m51546a(this.field_Introduce_cn, r5Var.field_Introduce_cn) && C46238a.m51546a(this.field_Introduce_hk, r5Var.field_Introduce_hk) && C46238a.m51546a(this.field_Introduce_tw, r5Var.field_Introduce_tw) && C46238a.m51546a(this.field_Introduce_en, r5Var.field_Introduce_en) && C46238a.m51546a(Long.valueOf(this.field_starttime), Long.valueOf(r5Var.field_starttime)) && C46238a.m51546a(Long.valueOf(this.field_endtime), Long.valueOf(r5Var.field_endtime)) && C46238a.m51546a(Long.valueOf(this.field_sequence), Long.valueOf(r5Var.field_sequence)) && C46238a.m51546a(Integer.valueOf(this.field_prioritylevel), Integer.valueOf(r5Var.field_prioritylevel)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(r5Var.field_status)) && C46238a.m51546a(this.field_ThumbUrl_cn, r5Var.field_ThumbUrl_cn) && C46238a.m51546a(this.field_ThumbUrl_hk, r5Var.field_ThumbUrl_hk) && C46238a.m51546a(this.field_ThumbUrl_tw, r5Var.field_ThumbUrl_tw) && C46238a.m51546a(this.field_ThumbUrl_en, r5Var.field_ThumbUrl_en) && C46238a.m51546a(this.field_ImgUrl_android_cn, r5Var.field_ImgUrl_android_cn) && C46238a.m51546a(this.field_ImgUrl_android_hk, r5Var.field_ImgUrl_android_hk) && C46238a.m51546a(this.field_ImgUrl_android_tw, r5Var.field_ImgUrl_android_tw) && C46238a.m51546a(this.field_ImgUrl_android_en, r5Var.field_ImgUrl_android_en) && C46238a.m51546a(Integer.valueOf(this.field_RedPoint), Integer.valueOf(r5Var.field_RedPoint)) && C46238a.m51546a(Integer.valueOf(this.field_WeAppDebugMode), Integer.valueOf(r5Var.field_WeAppDebugMode)) && C46238a.m51546a(Integer.valueOf(this.field_idkey), Integer.valueOf(r5Var.field_idkey)) && C46238a.m51546a(Integer.valueOf(this.field_idkeyValue), Integer.valueOf(r5Var.field_idkeyValue)) && C46238a.m51546a(this.field_Icon, r5Var.field_Icon) && C46238a.m51546a(this.field_ImgUrl_cn, r5Var.field_ImgUrl_cn) && C46238a.m51546a(this.field_ImgUrl_hk, r5Var.field_ImgUrl_hk) && C46238a.m51546a(this.field_ImgUrl_tw, r5Var.field_ImgUrl_tw) && C46238a.m51546a(this.field_ImgUrl_en, r5Var.field_ImgUrl_en) && C46238a.m51546a(Integer.valueOf(this.field_bItemFromXExpt), Integer.valueOf(r5Var.field_bItemFromXExpt));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f355926Q0 == hashCode) {
                    try {
                        this.field_LabsAppId = cursor.getString(i);
                        this.f355989d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355927R0 == hashCode) {
                    try {
                        this.field_expId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355928S0 == hashCode) {
                    try {
                        this.field_Type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355929T0 == hashCode) {
                    try {
                        this.field_BizType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355930U0 == hashCode) {
                    try {
                        this.field_Switch = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355931V0 == hashCode) {
                    try {
                        this.field_AllVer = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355932W0 == hashCode) {
                    try {
                        this.field_DetailURL = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355933X0 == hashCode) {
                    try {
                        this.field_WeAppUser = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355934Y0 == hashCode) {
                    try {
                        this.field_WeAppPath = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355935Z0 == hashCode) {
                    try {
                        this.field_Pos = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355936a1 == hashCode) {
                    try {
                        this.field_TitleKey_android = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355937b1 == hashCode) {
                    try {
                        this.field_Title_cn = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355938c1 == hashCode) {
                    try {
                        this.field_Title_hk = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355939d1 == hashCode) {
                    try {
                        this.field_Title_tw = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355940e1 == hashCode) {
                    try {
                        this.field_Title_en = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355941f1 == hashCode) {
                    try {
                        this.field_Desc_cn = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355942g1 == hashCode) {
                    try {
                        this.field_Desc_hk = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355943h1 == hashCode) {
                    try {
                        this.field_Desc_tw = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355944i1 == hashCode) {
                    try {
                        this.field_Desc_en = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355945j1 == hashCode) {
                    try {
                        this.field_Introduce_cn = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355946k1 == hashCode) {
                    try {
                        this.field_Introduce_hk = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355947l1 == hashCode) {
                    try {
                        this.field_Introduce_tw = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355948m1 == hashCode) {
                    try {
                        this.field_Introduce_en = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355949n1 == hashCode) {
                    try {
                        this.field_starttime = cursor.getLong(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355950o1 == hashCode) {
                    try {
                        this.field_endtime = cursor.getLong(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355951p1 == hashCode) {
                    try {
                        this.field_sequence = cursor.getLong(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355952q1 == hashCode) {
                    try {
                        this.field_prioritylevel = cursor.getInt(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355953r1 == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355954s1 == hashCode) {
                    try {
                        this.field_ThumbUrl_cn = cursor.getString(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355955t1 == hashCode) {
                    try {
                        this.field_ThumbUrl_hk = cursor.getString(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355956u1 == hashCode) {
                    try {
                        this.field_ThumbUrl_tw = cursor.getString(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355957v1 == hashCode) {
                    try {
                        this.field_ThumbUrl_en = cursor.getString(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355958w1 == hashCode) {
                    try {
                        this.field_ImgUrl_android_cn = cursor.getString(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355960x1 == hashCode) {
                    try {
                        this.field_ImgUrl_android_hk = cursor.getString(i);
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355962y1 == hashCode) {
                    try {
                        this.field_ImgUrl_android_tw = cursor.getString(i);
                    } catch (Throwable th37) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th37, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355963z1 == hashCode) {
                    try {
                        this.field_ImgUrl_android_en = cursor.getString(i);
                    } catch (Throwable th38) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th38, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355913A1 == hashCode) {
                    try {
                        this.field_RedPoint = cursor.getInt(i);
                    } catch (Throwable th39) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th39, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355914B1 == hashCode) {
                    try {
                        this.field_WeAppDebugMode = cursor.getInt(i);
                    } catch (Throwable th40) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th40, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355915C1 == hashCode) {
                    try {
                        this.field_idkey = cursor.getInt(i);
                    } catch (Throwable th41) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th41, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355916D1 == hashCode) {
                    try {
                        this.field_idkeyValue = cursor.getInt(i);
                    } catch (Throwable th42) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th42, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355917E1 == hashCode) {
                    try {
                        this.field_Icon = cursor.getString(i);
                    } catch (Throwable th43) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th43, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355918F1 == hashCode) {
                    try {
                        this.field_ImgUrl_cn = cursor.getString(i);
                    } catch (Throwable th44) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th44, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355919G1 == hashCode) {
                    try {
                        this.field_ImgUrl_hk = cursor.getString(i);
                    } catch (Throwable th45) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th45, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355920H1 == hashCode) {
                    try {
                        this.field_ImgUrl_tw = cursor.getString(i);
                    } catch (Throwable th46) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th46, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355921I1 == hashCode) {
                    try {
                        this.field_ImgUrl_en = cursor.getString(i);
                    } catch (Throwable th47) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th47, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355922J1 == hashCode) {
                    try {
                        this.field_bItemFromXExpt = cursor.getInt(i);
                    } catch (Throwable th48) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLabAppInfo", th48, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355923K1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f355989d) {
            contentValues.put("LabsAppId", this.field_LabsAppId);
        }
        if (this.field_expId == null) {
            this.field_expId = "";
        }
        if (this.f355990e) {
            contentValues.put("expId", this.field_expId);
        }
        if (this.f355991f) {
            contentValues.put("Type", Integer.valueOf(this.field_Type));
        }
        if (this.f355992g) {
            contentValues.put("BizType", Integer.valueOf(this.field_BizType));
        }
        if (this.f355993h) {
            contentValues.put("Switch", Integer.valueOf(this.field_Switch));
        }
        if (this.f355994i) {
            contentValues.put("AllVer", Integer.valueOf(this.field_AllVer));
        }
        if (this.f355995j) {
            contentValues.put("DetailURL", this.field_DetailURL);
        }
        if (this.f355996n) {
            contentValues.put("WeAppUser", this.field_WeAppUser);
        }
        if (this.f355997o) {
            contentValues.put("WeAppPath", this.field_WeAppPath);
        }
        if (this.f355998p) {
            contentValues.put("Pos", Integer.valueOf(this.field_Pos));
        }
        if (this.f356000q) {
            contentValues.put("TitleKey_android", this.field_TitleKey_android);
        }
        if (this.f356001r) {
            contentValues.put("Title_cn", this.field_Title_cn);
        }
        if (this.f356002s) {
            contentValues.put("Title_hk", this.field_Title_hk);
        }
        if (this.f356003t) {
            contentValues.put("Title_tw", this.field_Title_tw);
        }
        if (this.f356004u) {
            contentValues.put("Title_en", this.field_Title_en);
        }
        if (this.f356005v) {
            contentValues.put("Desc_cn", this.field_Desc_cn);
        }
        if (this.f356006w) {
            contentValues.put("Desc_hk", this.field_Desc_hk);
        }
        if (this.f356007x) {
            contentValues.put("Desc_tw", this.field_Desc_tw);
        }
        if (this.f356008y) {
            contentValues.put("Desc_en", this.field_Desc_en);
        }
        if (this.f356009z) {
            contentValues.put("Introduce_cn", this.field_Introduce_cn);
        }
        if (this.f355964A) {
            contentValues.put("Introduce_hk", this.field_Introduce_hk);
        }
        if (this.f355965B) {
            contentValues.put("Introduce_tw", this.field_Introduce_tw);
        }
        if (this.f355966C) {
            contentValues.put("Introduce_en", this.field_Introduce_en);
        }
        if (this.f355967D) {
            contentValues.put("starttime", Long.valueOf(this.field_starttime));
        }
        if (this.f355968E) {
            contentValues.put("endtime", Long.valueOf(this.field_endtime));
        }
        if (this.f355969F) {
            contentValues.put("sequence", Long.valueOf(this.field_sequence));
        }
        if (this.f355970G) {
            contentValues.put("prioritylevel", Integer.valueOf(this.field_prioritylevel));
        }
        if (this.f355971H) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f355972I) {
            contentValues.put("ThumbUrl_cn", this.field_ThumbUrl_cn);
        }
        if (this.f355973J) {
            contentValues.put("ThumbUrl_hk", this.field_ThumbUrl_hk);
        }
        if (this.f355974K) {
            contentValues.put("ThumbUrl_tw", this.field_ThumbUrl_tw);
        }
        if (this.f355975L) {
            contentValues.put("ThumbUrl_en", this.field_ThumbUrl_en);
        }
        if (this.f355976M) {
            contentValues.put("ImgUrl_android_cn", this.field_ImgUrl_android_cn);
        }
        if (this.f355977N) {
            contentValues.put("ImgUrl_android_hk", this.field_ImgUrl_android_hk);
        }
        if (this.f355978P) {
            contentValues.put("ImgUrl_android_tw", this.field_ImgUrl_android_tw);
        }
        if (this.f355979Q) {
            contentValues.put("ImgUrl_android_en", this.field_ImgUrl_android_en);
        }
        if (this.f355980R) {
            contentValues.put("RedPoint", Integer.valueOf(this.field_RedPoint));
        }
        if (this.f355981S) {
            contentValues.put("WeAppDebugMode", Integer.valueOf(this.field_WeAppDebugMode));
        }
        if (this.f355982T) {
            contentValues.put("idkey", Integer.valueOf(this.field_idkey));
        }
        if (this.f355983U) {
            contentValues.put("idkeyValue", Integer.valueOf(this.field_idkeyValue));
        }
        if (this.f355984V) {
            contentValues.put("Icon", this.field_Icon);
        }
        if (this.f355985W) {
            contentValues.put("ImgUrl_cn", this.field_ImgUrl_cn);
        }
        if (this.f355986X) {
            contentValues.put("ImgUrl_hk", this.field_ImgUrl_hk);
        }
        if (this.f355987Y) {
            contentValues.put("ImgUrl_tw", this.field_ImgUrl_tw);
        }
        if (this.f355988Z) {
            contentValues.put("ImgUrl_en", this.field_ImgUrl_en);
        }
        if (this.f355999p0) {
            contentValues.put("bItemFromXExpt", Integer.valueOf(this.field_bItemFromXExpt));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLabAppInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LabAppInfo ( " + f355924L1.sql + ");");
        for (String add : f355961y0) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLabAppInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LabAppInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f355924L1, "LabAppInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLabAppInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LabAppInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLabAppInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f355924L1;
    }

    public String[] getIndexCreateSQL() {
        return f355961y0;
    }

    public StorageObserverOwner<C118879r5> getObserverOwner() {
        return f355925M1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_LabsAppId;
    }

    public SingleTable getTable() {
        return f355959x0;
    }

    public String getTableName() {
        return f355959x0.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("LabsAppId")) {
            this.field_LabsAppId = contentValues.getAsString("LabsAppId");
            if (z) {
                this.f355989d = true;
            }
        }
        if (contentValues.containsKey("expId")) {
            this.field_expId = contentValues.getAsString("expId");
            if (z) {
                this.f355990e = true;
            }
        }
        if (contentValues.containsKey("Type")) {
            this.field_Type = contentValues.getAsInteger("Type").intValue();
            if (z) {
                this.f355991f = true;
            }
        }
        if (contentValues.containsKey("BizType")) {
            this.field_BizType = contentValues.getAsInteger("BizType").intValue();
            if (z) {
                this.f355992g = true;
            }
        }
        if (contentValues.containsKey("Switch")) {
            this.field_Switch = contentValues.getAsInteger("Switch").intValue();
            if (z) {
                this.f355993h = true;
            }
        }
        if (contentValues.containsKey("AllVer")) {
            this.field_AllVer = contentValues.getAsInteger("AllVer").intValue();
            if (z) {
                this.f355994i = true;
            }
        }
        if (contentValues.containsKey("DetailURL")) {
            this.field_DetailURL = contentValues.getAsString("DetailURL");
            if (z) {
                this.f355995j = true;
            }
        }
        if (contentValues.containsKey("WeAppUser")) {
            this.field_WeAppUser = contentValues.getAsString("WeAppUser");
            if (z) {
                this.f355996n = true;
            }
        }
        if (contentValues.containsKey("WeAppPath")) {
            this.field_WeAppPath = contentValues.getAsString("WeAppPath");
            if (z) {
                this.f355997o = true;
            }
        }
        if (contentValues.containsKey("Pos")) {
            this.field_Pos = contentValues.getAsInteger("Pos").intValue();
            if (z) {
                this.f355998p = true;
            }
        }
        if (contentValues.containsKey("TitleKey_android")) {
            this.field_TitleKey_android = contentValues.getAsString("TitleKey_android");
            if (z) {
                this.f356000q = true;
            }
        }
        if (contentValues.containsKey("Title_cn")) {
            this.field_Title_cn = contentValues.getAsString("Title_cn");
            if (z) {
                this.f356001r = true;
            }
        }
        if (contentValues.containsKey("Title_hk")) {
            this.field_Title_hk = contentValues.getAsString("Title_hk");
            if (z) {
                this.f356002s = true;
            }
        }
        if (contentValues.containsKey("Title_tw")) {
            this.field_Title_tw = contentValues.getAsString("Title_tw");
            if (z) {
                this.f356003t = true;
            }
        }
        if (contentValues.containsKey("Title_en")) {
            this.field_Title_en = contentValues.getAsString("Title_en");
            if (z) {
                this.f356004u = true;
            }
        }
        if (contentValues.containsKey("Desc_cn")) {
            this.field_Desc_cn = contentValues.getAsString("Desc_cn");
            if (z) {
                this.f356005v = true;
            }
        }
        if (contentValues.containsKey("Desc_hk")) {
            this.field_Desc_hk = contentValues.getAsString("Desc_hk");
            if (z) {
                this.f356006w = true;
            }
        }
        if (contentValues.containsKey("Desc_tw")) {
            this.field_Desc_tw = contentValues.getAsString("Desc_tw");
            if (z) {
                this.f356007x = true;
            }
        }
        if (contentValues.containsKey("Desc_en")) {
            this.field_Desc_en = contentValues.getAsString("Desc_en");
            if (z) {
                this.f356008y = true;
            }
        }
        if (contentValues.containsKey("Introduce_cn")) {
            this.field_Introduce_cn = contentValues.getAsString("Introduce_cn");
            if (z) {
                this.f356009z = true;
            }
        }
        if (contentValues.containsKey("Introduce_hk")) {
            this.field_Introduce_hk = contentValues.getAsString("Introduce_hk");
            if (z) {
                this.f355964A = true;
            }
        }
        if (contentValues.containsKey("Introduce_tw")) {
            this.field_Introduce_tw = contentValues.getAsString("Introduce_tw");
            if (z) {
                this.f355965B = true;
            }
        }
        if (contentValues.containsKey("Introduce_en")) {
            this.field_Introduce_en = contentValues.getAsString("Introduce_en");
            if (z) {
                this.f355966C = true;
            }
        }
        if (contentValues.containsKey("starttime")) {
            this.field_starttime = contentValues.getAsLong("starttime").longValue();
            if (z) {
                this.f355967D = true;
            }
        }
        if (contentValues.containsKey("endtime")) {
            this.field_endtime = contentValues.getAsLong("endtime").longValue();
            if (z) {
                this.f355968E = true;
            }
        }
        if (contentValues.containsKey("sequence")) {
            this.field_sequence = contentValues.getAsLong("sequence").longValue();
            if (z) {
                this.f355969F = true;
            }
        }
        if (contentValues.containsKey("prioritylevel")) {
            this.field_prioritylevel = contentValues.getAsInteger("prioritylevel").intValue();
            if (z) {
                this.f355970G = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f355971H = true;
            }
        }
        if (contentValues.containsKey("ThumbUrl_cn")) {
            this.field_ThumbUrl_cn = contentValues.getAsString("ThumbUrl_cn");
            if (z) {
                this.f355972I = true;
            }
        }
        if (contentValues.containsKey("ThumbUrl_hk")) {
            this.field_ThumbUrl_hk = contentValues.getAsString("ThumbUrl_hk");
            if (z) {
                this.f355973J = true;
            }
        }
        if (contentValues.containsKey("ThumbUrl_tw")) {
            this.field_ThumbUrl_tw = contentValues.getAsString("ThumbUrl_tw");
            if (z) {
                this.f355974K = true;
            }
        }
        if (contentValues.containsKey("ThumbUrl_en")) {
            this.field_ThumbUrl_en = contentValues.getAsString("ThumbUrl_en");
            if (z) {
                this.f355975L = true;
            }
        }
        if (contentValues.containsKey("ImgUrl_android_cn")) {
            this.field_ImgUrl_android_cn = contentValues.getAsString("ImgUrl_android_cn");
            if (z) {
                this.f355976M = true;
            }
        }
        if (contentValues.containsKey("ImgUrl_android_hk")) {
            this.field_ImgUrl_android_hk = contentValues.getAsString("ImgUrl_android_hk");
            if (z) {
                this.f355977N = true;
            }
        }
        if (contentValues.containsKey("ImgUrl_android_tw")) {
            this.field_ImgUrl_android_tw = contentValues.getAsString("ImgUrl_android_tw");
            if (z) {
                this.f355978P = true;
            }
        }
        if (contentValues.containsKey("ImgUrl_android_en")) {
            this.field_ImgUrl_android_en = contentValues.getAsString("ImgUrl_android_en");
            if (z) {
                this.f355979Q = true;
            }
        }
        if (contentValues.containsKey("RedPoint")) {
            this.field_RedPoint = contentValues.getAsInteger("RedPoint").intValue();
            if (z) {
                this.f355980R = true;
            }
        }
        if (contentValues.containsKey("WeAppDebugMode")) {
            this.field_WeAppDebugMode = contentValues.getAsInteger("WeAppDebugMode").intValue();
            if (z) {
                this.f355981S = true;
            }
        }
        if (contentValues.containsKey("idkey")) {
            this.field_idkey = contentValues.getAsInteger("idkey").intValue();
            if (z) {
                this.f355982T = true;
            }
        }
        if (contentValues.containsKey("idkeyValue")) {
            this.field_idkeyValue = contentValues.getAsInteger("idkeyValue").intValue();
            if (z) {
                this.f355983U = true;
            }
        }
        if (contentValues.containsKey("Icon")) {
            this.field_Icon = contentValues.getAsString("Icon");
            if (z) {
                this.f355984V = true;
            }
        }
        if (contentValues.containsKey("ImgUrl_cn")) {
            this.field_ImgUrl_cn = contentValues.getAsString("ImgUrl_cn");
            if (z) {
                this.f355985W = true;
            }
        }
        if (contentValues.containsKey("ImgUrl_hk")) {
            this.field_ImgUrl_hk = contentValues.getAsString("ImgUrl_hk");
            if (z) {
                this.f355986X = true;
            }
        }
        if (contentValues.containsKey("ImgUrl_tw")) {
            this.field_ImgUrl_tw = contentValues.getAsString("ImgUrl_tw");
            if (z) {
                this.f355987Y = true;
            }
        }
        if (contentValues.containsKey("ImgUrl_en")) {
            this.field_ImgUrl_en = contentValues.getAsString("ImgUrl_en");
            if (z) {
                this.f355988Z = true;
            }
        }
        if (contentValues.containsKey("bItemFromXExpt")) {
            this.field_bItemFromXExpt = contentValues.getAsInteger("bItemFromXExpt").intValue();
            if (z) {
                this.f355999p0 = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
