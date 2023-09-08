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

/* renamed from: xh.l9 */
public class C78816l9 extends IAutoDBItem {

    /* renamed from: A1 */
    public static final int f230897A1 = -1463109338;

    /* renamed from: B1 */
    public static final int f230898B1 = 796496262;

    /* renamed from: C1 */
    public static final int f230899C1 = 550365648;

    /* renamed from: D1 */
    public static final int f230900D1 = 796240212;

    /* renamed from: E1 */
    public static final int f230901E1 = 3560248;

    /* renamed from: F1 */
    public static final int f230902F1 = 416503277;

    /* renamed from: G1 */
    public static final int f230903G1 = -634201532;

    /* renamed from: H1 */
    public static final int f230904H1 = 1677701347;

    /* renamed from: I1 */
    public static final int f230905I1 = 796742547;

    /* renamed from: J1 */
    public static final int f230906J1 = -730419449;

    /* renamed from: K1 */
    public static final int f230907K1 = -1168160340;

    /* renamed from: L1 */
    public static final int f230908L1 = 520462124;

    /* renamed from: M1 */
    public static final int f230909M1 = -1075056120;

    /* renamed from: N1 */
    public static final int f230910N1 = 902532754;

    /* renamed from: O1 */
    public static final int f230911O1 = -249695096;

    /* renamed from: P1 */
    public static final int f230912P1 = 269041332;

    /* renamed from: Q1 */
    public static final int f230913Q1 = 56546442;

    /* renamed from: R1 */
    public static final int f230914R1 = -640957422;

    /* renamed from: S1 */
    public static final int f230915S1 = -675347369;

    /* renamed from: T1 */
    public static final int f230916T1 = -442578629;

    /* renamed from: U1 */
    public static final int f230917U1 = 195743081;

    /* renamed from: V1 */
    public static final int f230918V1 = 488633851;

    /* renamed from: W0 */
    public static final SingleTable f230919W0;

    /* renamed from: W1 */
    public static final int f230920W1 = -784318424;

    /* renamed from: X0 */
    public static final String[] f230921X0 = new String[0];

    /* renamed from: X1 */
    public static final int f230922X1 = -873730047;

    /* renamed from: Y0 */
    public static final int f230923Y0 = 877014161;

    /* renamed from: Y1 */
    public static final int f230924Y1 = -2109771163;

    /* renamed from: Z0 */
    public static final int f230925Z0 = 1555072544;

    /* renamed from: Z1 */
    public static final int f230926Z1 = -488926721;

    /* renamed from: a1 */
    public static final int f230927a1 = -8227222;

    /* renamed from: a2 */
    public static final int f230928a2 = 108705909;

    /* renamed from: b1 */
    public static final int f230929b1 = 1043005605;

    /* renamed from: b2 */
    public static final IAutoDBItem.MAutoDBInfo f230930b2 = initAutoDBInfo(C78816l9.class);

    /* renamed from: c1 */
    public static final int f230931c1 = -634445634;

    /* renamed from: c2 */
    public static final StorageObserverOwner<C78816l9> f230932c2 = new StorageObserverOwner<>();

    /* renamed from: d1 */
    public static final int f230933d1 = -1859291417;

    /* renamed from: e1 */
    public static final int f230934e1 = 1280606374;

    /* renamed from: f1 */
    public static final int f230935f1 = 391949393;

    /* renamed from: g1 */
    public static final int f230936g1 = -789974866;

    /* renamed from: h1 */
    public static final int f230937h1 = 1280583100;

    /* renamed from: i1 */
    public static final int f230938i1 = -613908149;

    /* renamed from: j1 */
    public static final int f230939j1 = -1068855134;

    /* renamed from: k1 */
    public static final int f230940k1 = 1844047161;

    /* renamed from: l1 */
    public static final int f230941l1 = 3079825;

    /* renamed from: m1 */
    public static final int f230942m1 = -1801401198;

    /* renamed from: n1 */
    public static final int f230943n1 = -833837303;

    /* renamed from: o1 */
    public static final int f230944o1 = -849300309;

    /* renamed from: p1 */
    public static final int f230945p1 = 1323727508;

    /* renamed from: q1 */
    public static final int f230946q1 = 26467824;

    /* renamed from: r1 */
    public static final int f230947r1 = -594145489;

    /* renamed from: s1 */
    public static final int f230948s1 = 1154333854;

    /* renamed from: t1 */
    public static final int f230949t1 = 1654524442;

    /* renamed from: u1 */
    public static final int f230950u1 = -748276795;

    /* renamed from: v1 */
    public static final int f230951v1 = 1735436183;

    /* renamed from: w1 */
    public static final int f230952w1 = 1392265745;

    /* renamed from: x1 */
    public static final int f230953x1 = -1305843613;

    /* renamed from: y1 */
    public static final int f230954y1 = -2022910508;

    /* renamed from: z1 */
    public static final int f230955z1 = -384106590;

    /* renamed from: A */
    public boolean f230956A = true;

    /* renamed from: B */
    public boolean f230957B = true;

    /* renamed from: C */
    public boolean f230958C = true;

    /* renamed from: D */
    public boolean f230959D = true;

    /* renamed from: E */
    public boolean f230960E = true;

    /* renamed from: F */
    public boolean f230961F = true;

    /* renamed from: G */
    public boolean f230962G = true;

    /* renamed from: H */
    public boolean f230963H = true;

    /* renamed from: I */
    public boolean f230964I = true;

    /* renamed from: J */
    public boolean f230965J = true;

    /* renamed from: K */
    public boolean f230966K = true;

    /* renamed from: L */
    public boolean f230967L = true;

    /* renamed from: M */
    public boolean f230968M = true;

    /* renamed from: N */
    public boolean f230969N = true;

    /* renamed from: P */
    public boolean f230970P = true;

    /* renamed from: Q */
    public boolean f230971Q = true;

    /* renamed from: Q0 */
    public boolean f230972Q0 = true;

    /* renamed from: R */
    public boolean f230973R = true;

    /* renamed from: R0 */
    public boolean f230974R0 = true;

    /* renamed from: S */
    public boolean f230975S = true;

    /* renamed from: S0 */
    public boolean f230976S0 = true;

    /* renamed from: T */
    public boolean f230977T = true;

    /* renamed from: T0 */
    public boolean f230978T0 = true;

    /* renamed from: U */
    public boolean f230979U = true;

    /* renamed from: U0 */
    public boolean f230980U0 = true;

    /* renamed from: V */
    public boolean f230981V = true;

    /* renamed from: V0 */
    public boolean f230982V0 = true;

    /* renamed from: W */
    public boolean f230983W = true;

    /* renamed from: X */
    public boolean f230984X = true;

    /* renamed from: Y */
    public boolean f230985Y = true;

    /* renamed from: Z */
    public boolean f230986Z = true;

    /* renamed from: d */
    public boolean f230987d = true;

    /* renamed from: e */
    public boolean f230988e = true;

    /* renamed from: f */
    public boolean f230989f = true;
    public String field_arrive_type;
    public String field_avail_save_wording;
    public String field_bankName;
    public String field_bankPhone;
    public int field_bankcardClientType;
    public int field_bankcardState;
    public int field_bankcardTag;
    public String field_bankcardTail;
    public String field_bankcardType;
    public String field_bankcardTypeName;
    public String field_bindSerial;
    public String field_bizUsername;
    public int field_cardType;
    public String field_card_bottom_wording;
    public String field_card_state_name;
    public double field_dayQuotaKind;
    public double field_dayQuotaVirtual;
    public int field_defaultCardState;
    public String field_desc;
    public String field_ext_msg;
    public long field_fetchArriveTime;
    public String field_fetchArriveTimeWording;
    public String field_fetch_charge_info;
    public double field_fetch_charge_rate;
    public String field_forbidWord;
    public String field_forbid_title;
    public String field_forbid_url;
    public double field_full_fetch_charge_fee;
    public int field_is_hightlight_pre_arrive_time_wording;
    public long field_minimch_avail_balance;
    public String field_minimch_ext_msg;
    public String field_minimch_key;
    public int field_minimch_system_state;
    public int field_minimch_user_state;
    public String field_mobile;
    public String field_no_micro_word;
    public double field_onceQuotaKind;
    public double field_onceQuotaVirtual;
    public String field_prompt_info_jump_text;
    public String field_prompt_info_jump_url;
    public String field_prompt_info_prompt_text;
    public String field_repay_url;
    public int field_supportTag;
    public int field_support_lqt_turn_in;
    public int field_support_lqt_turn_out;
    public boolean field_support_micropay;
    public String field_tips;
    public String field_trueName;
    public int field_wxcreditState;
    public long field_yht_avail_balance;
    public String field_yht_ext_msg;
    public String field_yht_related_bank;
    public int field_yht_system_state;
    public int field_yht_user_state;

    /* renamed from: g */
    public boolean f230990g = true;

    /* renamed from: h */
    public boolean f230991h = true;

    /* renamed from: i */
    public boolean f230992i = true;

    /* renamed from: j */
    public boolean f230993j = true;

    /* renamed from: n */
    public boolean f230994n = true;

    /* renamed from: o */
    public boolean f230995o = true;

    /* renamed from: p */
    public boolean f230996p = true;

    /* renamed from: p0 */
    public boolean f230997p0 = true;

    /* renamed from: q */
    public boolean f230998q = true;

    /* renamed from: r */
    public boolean f230999r = true;

    /* renamed from: s */
    public boolean f231000s = true;

    /* renamed from: t */
    public boolean f231001t = true;

    /* renamed from: u */
    public boolean f231002u = true;

    /* renamed from: v */
    public boolean f231003v = true;

    /* renamed from: w */
    public boolean f231004w = true;

    /* renamed from: x */
    public boolean f231005x = true;

    /* renamed from: x0 */
    public boolean f231006x0 = true;

    /* renamed from: y */
    public boolean f231007y = true;

    /* renamed from: y0 */
    public boolean f231008y0 = true;

    /* renamed from: z */
    public boolean f231009z = true;

    static {
        SingleTable singleTable = new SingleTable("WalletBankcard");
        f230919W0 = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("bindSerial", "string", singleTable.getName(), "");
        new Column("defaultCardState", "int", singleTable.getName(), "");
        new Column("cardType", "int", singleTable.getName(), "");
        new Column("bankcardState", "int", singleTable.getName(), "");
        new Column("forbidWord", "string", singleTable.getName(), "");
        new Column("bankName", "string", singleTable.getName(), "");
        new Column("bankcardType", "string", singleTable.getName(), "");
        new Column("bankcardTypeName", "string", singleTable.getName(), "");
        new Column("bankcardTag", "int", singleTable.getName(), "");
        new Column("bankcardTail", "string", singleTable.getName(), "");
        new Column("supportTag", "int", singleTable.getName(), "");
        new Column("mobile", "string", singleTable.getName(), "");
        new Column("trueName", "string", singleTable.getName(), "");
        new Column("desc", "string", singleTable.getName(), "");
        new Column("bankPhone", "string", singleTable.getName(), "");
        new Column("bizUsername", "string", singleTable.getName(), "");
        new Column("onceQuotaKind", "double", singleTable.getName(), "");
        new Column("onceQuotaVirtual", "double", singleTable.getName(), "");
        new Column("dayQuotaKind", "double", singleTable.getName(), "");
        new Column("dayQuotaVirtual", "double", singleTable.getName(), "");
        new Column("fetchArriveTime", "long", singleTable.getName(), "");
        new Column("fetchArriveTimeWording", "string", singleTable.getName(), "");
        new Column("repay_url", "string", singleTable.getName(), "");
        new Column("wxcreditState", "int", singleTable.getName(), "");
        new Column("bankcardClientType", "int", singleTable.getName(), "");
        new Column("ext_msg", "string", singleTable.getName(), "");
        new Column("support_micropay", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("arrive_type", "string", singleTable.getName(), "");
        new Column("avail_save_wording", "string", singleTable.getName(), "");
        new Column("fetch_charge_rate", "double", singleTable.getName(), "");
        new Column("full_fetch_charge_fee", "double", singleTable.getName(), "");
        new Column("fetch_charge_info", "string", singleTable.getName(), "");
        new Column("tips", "string", singleTable.getName(), "");
        new Column("forbid_title", "string", singleTable.getName(), "");
        new Column("forbid_url", "string", singleTable.getName(), "");
        new Column("no_micro_word", "string", singleTable.getName(), "");
        new Column("card_bottom_wording", "string", singleTable.getName(), "");
        new Column("support_lqt_turn_in", "int", singleTable.getName(), "");
        new Column("support_lqt_turn_out", "int", singleTable.getName(), "");
        new Column("is_hightlight_pre_arrive_time_wording", "int", singleTable.getName(), "");
        new Column("card_state_name", "string", singleTable.getName(), "");
        new Column("prompt_info_prompt_text", "string", singleTable.getName(), "");
        new Column("prompt_info_jump_text", "string", singleTable.getName(), "");
        new Column("prompt_info_jump_url", "string", singleTable.getName(), "");
        new Column("yht_related_bank", "string", singleTable.getName(), "");
        new Column("yht_avail_balance", "long", singleTable.getName(), "");
        new Column("yht_user_state", "int", singleTable.getName(), "");
        new Column("yht_system_state", "int", singleTable.getName(), "");
        new Column("yht_ext_msg", "string", singleTable.getName(), "");
        new Column("minimch_key", "string", singleTable.getName(), "");
        new Column("minimch_avail_balance", "long", singleTable.getName(), "");
        new Column("minimch_user_state", "int", singleTable.getName(), "");
        new Column("minimch_system_state", "int", singleTable.getName(), "");
        new Column("minimch_ext_msg", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[54];
        String[] strArr = new String[55];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "bindSerial";
        mAutoDBInfo.colsMap.put("bindSerial", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "bindSerial";
        mAutoDBInfo.columns[1] = "defaultCardState";
        mAutoDBInfo.colsMap.put("defaultCardState", "INTEGER");
        mAutoDBInfo.columns[2] = "cardType";
        mAutoDBInfo.colsMap.put("cardType", "INTEGER");
        mAutoDBInfo.columns[3] = "bankcardState";
        mAutoDBInfo.colsMap.put("bankcardState", "INTEGER");
        mAutoDBInfo.columns[4] = "forbidWord";
        mAutoDBInfo.colsMap.put("forbidWord", "TEXT");
        mAutoDBInfo.columns[5] = "bankName";
        mAutoDBInfo.colsMap.put("bankName", "TEXT");
        mAutoDBInfo.columns[6] = "bankcardType";
        mAutoDBInfo.colsMap.put("bankcardType", "TEXT");
        mAutoDBInfo.columns[7] = "bankcardTypeName";
        mAutoDBInfo.colsMap.put("bankcardTypeName", "TEXT");
        mAutoDBInfo.columns[8] = "bankcardTag";
        mAutoDBInfo.colsMap.put("bankcardTag", "INTEGER");
        mAutoDBInfo.columns[9] = "bankcardTail";
        mAutoDBInfo.colsMap.put("bankcardTail", "TEXT");
        mAutoDBInfo.columns[10] = "supportTag";
        mAutoDBInfo.colsMap.put("supportTag", "INTEGER");
        mAutoDBInfo.columns[11] = "mobile";
        mAutoDBInfo.colsMap.put("mobile", "TEXT");
        mAutoDBInfo.columns[12] = "trueName";
        mAutoDBInfo.colsMap.put("trueName", "TEXT");
        mAutoDBInfo.columns[13] = "desc";
        mAutoDBInfo.colsMap.put("desc", "TEXT");
        mAutoDBInfo.columns[14] = "bankPhone";
        mAutoDBInfo.colsMap.put("bankPhone", "TEXT");
        mAutoDBInfo.columns[15] = "bizUsername";
        mAutoDBInfo.colsMap.put("bizUsername", "TEXT");
        mAutoDBInfo.columns[16] = "onceQuotaKind";
        mAutoDBInfo.colsMap.put("onceQuotaKind", "DOUBLE");
        mAutoDBInfo.columns[17] = "onceQuotaVirtual";
        mAutoDBInfo.colsMap.put("onceQuotaVirtual", "DOUBLE");
        mAutoDBInfo.columns[18] = "dayQuotaKind";
        mAutoDBInfo.colsMap.put("dayQuotaKind", "DOUBLE");
        mAutoDBInfo.columns[19] = "dayQuotaVirtual";
        mAutoDBInfo.colsMap.put("dayQuotaVirtual", "DOUBLE");
        mAutoDBInfo.columns[20] = "fetchArriveTime";
        mAutoDBInfo.colsMap.put("fetchArriveTime", "LONG");
        mAutoDBInfo.columns[21] = "fetchArriveTimeWording";
        mAutoDBInfo.colsMap.put("fetchArriveTimeWording", "TEXT");
        mAutoDBInfo.columns[22] = "repay_url";
        mAutoDBInfo.colsMap.put("repay_url", "TEXT");
        mAutoDBInfo.columns[23] = "wxcreditState";
        mAutoDBInfo.colsMap.put("wxcreditState", "INTEGER");
        mAutoDBInfo.columns[24] = "bankcardClientType";
        mAutoDBInfo.colsMap.put("bankcardClientType", "INTEGER");
        mAutoDBInfo.columns[25] = "ext_msg";
        mAutoDBInfo.colsMap.put("ext_msg", "TEXT");
        mAutoDBInfo.columns[26] = "support_micropay";
        mAutoDBInfo.colsMap.put("support_micropay", "INTEGER");
        mAutoDBInfo.columns[27] = "arrive_type";
        mAutoDBInfo.colsMap.put("arrive_type", "TEXT");
        mAutoDBInfo.columns[28] = "avail_save_wording";
        mAutoDBInfo.colsMap.put("avail_save_wording", "TEXT");
        mAutoDBInfo.columns[29] = "fetch_charge_rate";
        mAutoDBInfo.colsMap.put("fetch_charge_rate", "DOUBLE");
        mAutoDBInfo.columns[30] = "full_fetch_charge_fee";
        mAutoDBInfo.colsMap.put("full_fetch_charge_fee", "DOUBLE");
        mAutoDBInfo.columns[31] = "fetch_charge_info";
        mAutoDBInfo.colsMap.put("fetch_charge_info", "TEXT");
        mAutoDBInfo.columns[32] = "tips";
        mAutoDBInfo.colsMap.put("tips", "TEXT");
        mAutoDBInfo.columns[33] = "forbid_title";
        mAutoDBInfo.colsMap.put("forbid_title", "TEXT");
        mAutoDBInfo.columns[34] = "forbid_url";
        mAutoDBInfo.colsMap.put("forbid_url", "TEXT");
        mAutoDBInfo.columns[35] = "no_micro_word";
        mAutoDBInfo.colsMap.put("no_micro_word", "TEXT");
        mAutoDBInfo.columns[36] = "card_bottom_wording";
        mAutoDBInfo.colsMap.put("card_bottom_wording", "TEXT");
        mAutoDBInfo.columns[37] = "support_lqt_turn_in";
        mAutoDBInfo.colsMap.put("support_lqt_turn_in", "INTEGER");
        mAutoDBInfo.columns[38] = "support_lqt_turn_out";
        mAutoDBInfo.colsMap.put("support_lqt_turn_out", "INTEGER");
        mAutoDBInfo.columns[39] = "is_hightlight_pre_arrive_time_wording";
        mAutoDBInfo.colsMap.put("is_hightlight_pre_arrive_time_wording", "INTEGER");
        mAutoDBInfo.columns[40] = "card_state_name";
        mAutoDBInfo.colsMap.put("card_state_name", "TEXT");
        mAutoDBInfo.columns[41] = "prompt_info_prompt_text";
        mAutoDBInfo.colsMap.put("prompt_info_prompt_text", "TEXT");
        mAutoDBInfo.columns[42] = "prompt_info_jump_text";
        mAutoDBInfo.colsMap.put("prompt_info_jump_text", "TEXT");
        mAutoDBInfo.columns[43] = "prompt_info_jump_url";
        mAutoDBInfo.colsMap.put("prompt_info_jump_url", "TEXT");
        mAutoDBInfo.columns[44] = "yht_related_bank";
        mAutoDBInfo.colsMap.put("yht_related_bank", "TEXT");
        mAutoDBInfo.columns[45] = "yht_avail_balance";
        mAutoDBInfo.colsMap.put("yht_avail_balance", "LONG");
        mAutoDBInfo.columns[46] = "yht_user_state";
        mAutoDBInfo.colsMap.put("yht_user_state", "INTEGER");
        mAutoDBInfo.columns[47] = "yht_system_state";
        mAutoDBInfo.colsMap.put("yht_system_state", "INTEGER");
        mAutoDBInfo.columns[48] = "yht_ext_msg";
        mAutoDBInfo.colsMap.put("yht_ext_msg", "TEXT");
        mAutoDBInfo.columns[49] = "minimch_key";
        mAutoDBInfo.colsMap.put("minimch_key", "TEXT");
        mAutoDBInfo.columns[50] = "minimch_avail_balance";
        mAutoDBInfo.colsMap.put("minimch_avail_balance", "LONG");
        mAutoDBInfo.columns[51] = "minimch_user_state";
        mAutoDBInfo.colsMap.put("minimch_user_state", "INTEGER");
        mAutoDBInfo.columns[52] = "minimch_system_state";
        mAutoDBInfo.colsMap.put("minimch_system_state", "INTEGER");
        mAutoDBInfo.columns[53] = "minimch_ext_msg";
        mAutoDBInfo.colsMap.put("minimch_ext_msg", "TEXT");
        mAutoDBInfo.columns[54] = "rowid";
        mAutoDBInfo.sql = " bindSerial TEXT PRIMARY KEY ,  defaultCardState INTEGER,  cardType INTEGER,  bankcardState INTEGER,  forbidWord TEXT,  bankName TEXT,  bankcardType TEXT,  bankcardTypeName TEXT,  bankcardTag INTEGER,  bankcardTail TEXT,  supportTag INTEGER,  mobile TEXT,  trueName TEXT,  desc TEXT,  bankPhone TEXT,  bizUsername TEXT,  onceQuotaKind DOUBLE,  onceQuotaVirtual DOUBLE,  dayQuotaKind DOUBLE,  dayQuotaVirtual DOUBLE,  fetchArriveTime LONG,  fetchArriveTimeWording TEXT,  repay_url TEXT,  wxcreditState INTEGER,  bankcardClientType INTEGER,  ext_msg TEXT,  support_micropay INTEGER,  arrive_type TEXT,  avail_save_wording TEXT,  fetch_charge_rate DOUBLE,  full_fetch_charge_fee DOUBLE,  fetch_charge_info TEXT,  tips TEXT,  forbid_title TEXT,  forbid_url TEXT,  no_micro_word TEXT,  card_bottom_wording TEXT,  support_lqt_turn_in INTEGER,  support_lqt_turn_out INTEGER,  is_hightlight_pre_arrive_time_wording INTEGER,  card_state_name TEXT,  prompt_info_prompt_text TEXT,  prompt_info_jump_text TEXT,  prompt_info_jump_url TEXT,  yht_related_bank TEXT,  yht_avail_balance LONG,  yht_user_state INTEGER,  yht_system_state INTEGER,  yht_ext_msg TEXT,  minimch_key TEXT,  minimch_avail_balance LONG,  minimch_user_state INTEGER,  minimch_system_state INTEGER,  minimch_ext_msg TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78816l9)) {
            return false;
        }
        C78816l9 l9Var = (C78816l9) iAutoDBItem;
        return C46238a.m51546a(this.field_bindSerial, l9Var.field_bindSerial) && C46238a.m51546a(Integer.valueOf(this.field_defaultCardState), Integer.valueOf(l9Var.field_defaultCardState)) && C46238a.m51546a(Integer.valueOf(this.field_cardType), Integer.valueOf(l9Var.field_cardType)) && C46238a.m51546a(Integer.valueOf(this.field_bankcardState), Integer.valueOf(l9Var.field_bankcardState)) && C46238a.m51546a(this.field_forbidWord, l9Var.field_forbidWord) && C46238a.m51546a(this.field_bankName, l9Var.field_bankName) && C46238a.m51546a(this.field_bankcardType, l9Var.field_bankcardType) && C46238a.m51546a(this.field_bankcardTypeName, l9Var.field_bankcardTypeName) && C46238a.m51546a(Integer.valueOf(this.field_bankcardTag), Integer.valueOf(l9Var.field_bankcardTag)) && C46238a.m51546a(this.field_bankcardTail, l9Var.field_bankcardTail) && C46238a.m51546a(Integer.valueOf(this.field_supportTag), Integer.valueOf(l9Var.field_supportTag)) && C46238a.m51546a(this.field_mobile, l9Var.field_mobile) && C46238a.m51546a(this.field_trueName, l9Var.field_trueName) && C46238a.m51546a(this.field_desc, l9Var.field_desc) && C46238a.m51546a(this.field_bankPhone, l9Var.field_bankPhone) && C46238a.m51546a(this.field_bizUsername, l9Var.field_bizUsername) && C46238a.m51546a(Double.valueOf(this.field_onceQuotaKind), Double.valueOf(l9Var.field_onceQuotaKind)) && C46238a.m51546a(Double.valueOf(this.field_onceQuotaVirtual), Double.valueOf(l9Var.field_onceQuotaVirtual)) && C46238a.m51546a(Double.valueOf(this.field_dayQuotaKind), Double.valueOf(l9Var.field_dayQuotaKind)) && C46238a.m51546a(Double.valueOf(this.field_dayQuotaVirtual), Double.valueOf(l9Var.field_dayQuotaVirtual)) && C46238a.m51546a(Long.valueOf(this.field_fetchArriveTime), Long.valueOf(l9Var.field_fetchArriveTime)) && C46238a.m51546a(this.field_fetchArriveTimeWording, l9Var.field_fetchArriveTimeWording) && C46238a.m51546a(this.field_repay_url, l9Var.field_repay_url) && C46238a.m51546a(Integer.valueOf(this.field_wxcreditState), Integer.valueOf(l9Var.field_wxcreditState)) && C46238a.m51546a(Integer.valueOf(this.field_bankcardClientType), Integer.valueOf(l9Var.field_bankcardClientType)) && C46238a.m51546a(this.field_ext_msg, l9Var.field_ext_msg) && C46238a.m51546a(Boolean.valueOf(this.field_support_micropay), Boolean.valueOf(l9Var.field_support_micropay)) && C46238a.m51546a(this.field_arrive_type, l9Var.field_arrive_type) && C46238a.m51546a(this.field_avail_save_wording, l9Var.field_avail_save_wording) && C46238a.m51546a(Double.valueOf(this.field_fetch_charge_rate), Double.valueOf(l9Var.field_fetch_charge_rate)) && C46238a.m51546a(Double.valueOf(this.field_full_fetch_charge_fee), Double.valueOf(l9Var.field_full_fetch_charge_fee)) && C46238a.m51546a(this.field_fetch_charge_info, l9Var.field_fetch_charge_info) && C46238a.m51546a(this.field_tips, l9Var.field_tips) && C46238a.m51546a(this.field_forbid_title, l9Var.field_forbid_title) && C46238a.m51546a(this.field_forbid_url, l9Var.field_forbid_url) && C46238a.m51546a(this.field_no_micro_word, l9Var.field_no_micro_word) && C46238a.m51546a(this.field_card_bottom_wording, l9Var.field_card_bottom_wording) && C46238a.m51546a(Integer.valueOf(this.field_support_lqt_turn_in), Integer.valueOf(l9Var.field_support_lqt_turn_in)) && C46238a.m51546a(Integer.valueOf(this.field_support_lqt_turn_out), Integer.valueOf(l9Var.field_support_lqt_turn_out)) && C46238a.m51546a(Integer.valueOf(this.field_is_hightlight_pre_arrive_time_wording), Integer.valueOf(l9Var.field_is_hightlight_pre_arrive_time_wording)) && C46238a.m51546a(this.field_card_state_name, l9Var.field_card_state_name) && C46238a.m51546a(this.field_prompt_info_prompt_text, l9Var.field_prompt_info_prompt_text) && C46238a.m51546a(this.field_prompt_info_jump_text, l9Var.field_prompt_info_jump_text) && C46238a.m51546a(this.field_prompt_info_jump_url, l9Var.field_prompt_info_jump_url) && C46238a.m51546a(this.field_yht_related_bank, l9Var.field_yht_related_bank) && C46238a.m51546a(Long.valueOf(this.field_yht_avail_balance), Long.valueOf(l9Var.field_yht_avail_balance)) && C46238a.m51546a(Integer.valueOf(this.field_yht_user_state), Integer.valueOf(l9Var.field_yht_user_state)) && C46238a.m51546a(Integer.valueOf(this.field_yht_system_state), Integer.valueOf(l9Var.field_yht_system_state)) && C46238a.m51546a(this.field_yht_ext_msg, l9Var.field_yht_ext_msg) && C46238a.m51546a(this.field_minimch_key, l9Var.field_minimch_key) && C46238a.m51546a(Long.valueOf(this.field_minimch_avail_balance), Long.valueOf(l9Var.field_minimch_avail_balance)) && C46238a.m51546a(Integer.valueOf(this.field_minimch_user_state), Integer.valueOf(l9Var.field_minimch_user_state)) && C46238a.m51546a(Integer.valueOf(this.field_minimch_system_state), Integer.valueOf(l9Var.field_minimch_system_state)) && C46238a.m51546a(this.field_minimch_ext_msg, l9Var.field_minimch_ext_msg);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230923Y0 == hashCode) {
                    try {
                        this.field_bindSerial = cursor.getString(i);
                        this.f230987d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230925Z0 == hashCode) {
                    try {
                        this.field_defaultCardState = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230927a1 == hashCode) {
                    try {
                        this.field_cardType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230929b1 == hashCode) {
                    try {
                        this.field_bankcardState = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230931c1 == hashCode) {
                    try {
                        this.field_forbidWord = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230933d1 == hashCode) {
                    try {
                        this.field_bankName = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230934e1 == hashCode) {
                    try {
                        this.field_bankcardType = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230935f1 == hashCode) {
                    try {
                        this.field_bankcardTypeName = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230936g1 == hashCode) {
                    try {
                        this.field_bankcardTag = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230937h1 == hashCode) {
                    try {
                        this.field_bankcardTail = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230938i1 == hashCode) {
                    try {
                        this.field_supportTag = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230939j1 == hashCode) {
                    try {
                        this.field_mobile = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230940k1 == hashCode) {
                    try {
                        this.field_trueName = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230941l1 == hashCode) {
                    try {
                        this.field_desc = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230942m1 == hashCode) {
                    try {
                        this.field_bankPhone = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230943n1 == hashCode) {
                    try {
                        this.field_bizUsername = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230944o1 == hashCode) {
                    try {
                        this.field_onceQuotaKind = cursor.getDouble(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230945p1 == hashCode) {
                    try {
                        this.field_onceQuotaVirtual = cursor.getDouble(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230946q1 == hashCode) {
                    try {
                        this.field_dayQuotaKind = cursor.getDouble(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230947r1 == hashCode) {
                    try {
                        this.field_dayQuotaVirtual = cursor.getDouble(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230948s1 == hashCode) {
                    try {
                        this.field_fetchArriveTime = cursor.getLong(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230949t1 == hashCode) {
                    try {
                        this.field_fetchArriveTimeWording = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230950u1 == hashCode) {
                    try {
                        this.field_repay_url = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230951v1 == hashCode) {
                    try {
                        this.field_wxcreditState = cursor.getInt(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230952w1 == hashCode) {
                    try {
                        this.field_bankcardClientType = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230953x1 == hashCode) {
                    try {
                        this.field_ext_msg = cursor.getString(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230954y1 == hashCode) {
                    try {
                        this.field_support_micropay = cursor.getInt(i) != 0;
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230955z1 == hashCode) {
                    try {
                        this.field_arrive_type = cursor.getString(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230897A1 == hashCode) {
                    try {
                        this.field_avail_save_wording = cursor.getString(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230898B1 == hashCode) {
                    try {
                        this.field_fetch_charge_rate = cursor.getDouble(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230899C1 == hashCode) {
                    try {
                        this.field_full_fetch_charge_fee = cursor.getDouble(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230900D1 == hashCode) {
                    try {
                        this.field_fetch_charge_info = cursor.getString(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230901E1 == hashCode) {
                    try {
                        this.field_tips = cursor.getString(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230902F1 == hashCode) {
                    try {
                        this.field_forbid_title = cursor.getString(i);
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230903G1 == hashCode) {
                    try {
                        this.field_forbid_url = cursor.getString(i);
                    } catch (Throwable th37) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th37, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230904H1 == hashCode) {
                    try {
                        this.field_no_micro_word = cursor.getString(i);
                    } catch (Throwable th38) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th38, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230905I1 == hashCode) {
                    try {
                        this.field_card_bottom_wording = cursor.getString(i);
                    } catch (Throwable th39) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th39, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230906J1 == hashCode) {
                    try {
                        this.field_support_lqt_turn_in = cursor.getInt(i);
                    } catch (Throwable th40) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th40, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230907K1 == hashCode) {
                    try {
                        this.field_support_lqt_turn_out = cursor.getInt(i);
                    } catch (Throwable th41) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th41, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230908L1 == hashCode) {
                    try {
                        this.field_is_hightlight_pre_arrive_time_wording = cursor.getInt(i);
                    } catch (Throwable th42) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th42, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230909M1 == hashCode) {
                    try {
                        this.field_card_state_name = cursor.getString(i);
                    } catch (Throwable th43) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th43, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230910N1 == hashCode) {
                    try {
                        this.field_prompt_info_prompt_text = cursor.getString(i);
                    } catch (Throwable th44) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th44, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230911O1 == hashCode) {
                    try {
                        this.field_prompt_info_jump_text = cursor.getString(i);
                    } catch (Throwable th45) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th45, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230912P1 == hashCode) {
                    try {
                        this.field_prompt_info_jump_url = cursor.getString(i);
                    } catch (Throwable th46) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th46, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230913Q1 == hashCode) {
                    try {
                        this.field_yht_related_bank = cursor.getString(i);
                    } catch (Throwable th47) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th47, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230914R1 == hashCode) {
                    try {
                        this.field_yht_avail_balance = cursor.getLong(i);
                    } catch (Throwable th48) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th48, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230915S1 == hashCode) {
                    try {
                        this.field_yht_user_state = cursor.getInt(i);
                    } catch (Throwable th49) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th49, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230916T1 == hashCode) {
                    try {
                        this.field_yht_system_state = cursor.getInt(i);
                    } catch (Throwable th50) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th50, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230917U1 == hashCode) {
                    try {
                        this.field_yht_ext_msg = cursor.getString(i);
                    } catch (Throwable th51) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th51, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230918V1 == hashCode) {
                    try {
                        this.field_minimch_key = cursor.getString(i);
                    } catch (Throwable th52) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th52, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230920W1 == hashCode) {
                    try {
                        this.field_minimch_avail_balance = cursor.getLong(i);
                    } catch (Throwable th53) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th53, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230922X1 == hashCode) {
                    try {
                        this.field_minimch_user_state = cursor.getInt(i);
                    } catch (Throwable th54) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th54, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230924Y1 == hashCode) {
                    try {
                        this.field_minimch_system_state = cursor.getInt(i);
                    } catch (Throwable th55) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th55, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230926Z1 == hashCode) {
                    try {
                        this.field_minimch_ext_msg = cursor.getString(i);
                    } catch (Throwable th56) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcard", th56, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230928a2 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f230987d) {
            contentValues.put("bindSerial", this.field_bindSerial);
        }
        if (this.f230988e) {
            contentValues.put("defaultCardState", Integer.valueOf(this.field_defaultCardState));
        }
        if (this.f230989f) {
            contentValues.put("cardType", Integer.valueOf(this.field_cardType));
        }
        if (this.f230990g) {
            contentValues.put("bankcardState", Integer.valueOf(this.field_bankcardState));
        }
        if (this.f230991h) {
            contentValues.put("forbidWord", this.field_forbidWord);
        }
        if (this.f230992i) {
            contentValues.put("bankName", this.field_bankName);
        }
        if (this.f230993j) {
            contentValues.put("bankcardType", this.field_bankcardType);
        }
        if (this.f230994n) {
            contentValues.put("bankcardTypeName", this.field_bankcardTypeName);
        }
        if (this.f230995o) {
            contentValues.put("bankcardTag", Integer.valueOf(this.field_bankcardTag));
        }
        if (this.f230996p) {
            contentValues.put("bankcardTail", this.field_bankcardTail);
        }
        if (this.f230998q) {
            contentValues.put("supportTag", Integer.valueOf(this.field_supportTag));
        }
        if (this.f230999r) {
            contentValues.put("mobile", this.field_mobile);
        }
        if (this.f231000s) {
            contentValues.put("trueName", this.field_trueName);
        }
        if (this.f231001t) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f231002u) {
            contentValues.put("bankPhone", this.field_bankPhone);
        }
        if (this.f231003v) {
            contentValues.put("bizUsername", this.field_bizUsername);
        }
        if (this.f231004w) {
            contentValues.put("onceQuotaKind", Double.valueOf(this.field_onceQuotaKind));
        }
        if (this.f231005x) {
            contentValues.put("onceQuotaVirtual", Double.valueOf(this.field_onceQuotaVirtual));
        }
        if (this.f231007y) {
            contentValues.put("dayQuotaKind", Double.valueOf(this.field_dayQuotaKind));
        }
        if (this.f231009z) {
            contentValues.put("dayQuotaVirtual", Double.valueOf(this.field_dayQuotaVirtual));
        }
        if (this.f230956A) {
            contentValues.put("fetchArriveTime", Long.valueOf(this.field_fetchArriveTime));
        }
        if (this.f230957B) {
            contentValues.put("fetchArriveTimeWording", this.field_fetchArriveTimeWording);
        }
        if (this.f230958C) {
            contentValues.put("repay_url", this.field_repay_url);
        }
        if (this.f230959D) {
            contentValues.put("wxcreditState", Integer.valueOf(this.field_wxcreditState));
        }
        if (this.f230960E) {
            contentValues.put("bankcardClientType", Integer.valueOf(this.field_bankcardClientType));
        }
        if (this.f230961F) {
            contentValues.put("ext_msg", this.field_ext_msg);
        }
        if (this.f230962G) {
            if (this.field_support_micropay) {
                contentValues.put("support_micropay", 1);
            } else {
                contentValues.put("support_micropay", 0);
            }
        }
        if (this.f230963H) {
            contentValues.put("arrive_type", this.field_arrive_type);
        }
        if (this.f230964I) {
            contentValues.put("avail_save_wording", this.field_avail_save_wording);
        }
        if (this.f230965J) {
            contentValues.put("fetch_charge_rate", Double.valueOf(this.field_fetch_charge_rate));
        }
        if (this.f230966K) {
            contentValues.put("full_fetch_charge_fee", Double.valueOf(this.field_full_fetch_charge_fee));
        }
        if (this.f230967L) {
            contentValues.put("fetch_charge_info", this.field_fetch_charge_info);
        }
        if (this.f230968M) {
            contentValues.put("tips", this.field_tips);
        }
        if (this.f230969N) {
            contentValues.put("forbid_title", this.field_forbid_title);
        }
        if (this.f230970P) {
            contentValues.put("forbid_url", this.field_forbid_url);
        }
        if (this.f230971Q) {
            contentValues.put("no_micro_word", this.field_no_micro_word);
        }
        if (this.f230973R) {
            contentValues.put("card_bottom_wording", this.field_card_bottom_wording);
        }
        if (this.f230975S) {
            contentValues.put("support_lqt_turn_in", Integer.valueOf(this.field_support_lqt_turn_in));
        }
        if (this.f230977T) {
            contentValues.put("support_lqt_turn_out", Integer.valueOf(this.field_support_lqt_turn_out));
        }
        if (this.f230979U) {
            contentValues.put("is_hightlight_pre_arrive_time_wording", Integer.valueOf(this.field_is_hightlight_pre_arrive_time_wording));
        }
        if (this.f230981V) {
            contentValues.put("card_state_name", this.field_card_state_name);
        }
        if (this.f230983W) {
            contentValues.put("prompt_info_prompt_text", this.field_prompt_info_prompt_text);
        }
        if (this.f230984X) {
            contentValues.put("prompt_info_jump_text", this.field_prompt_info_jump_text);
        }
        if (this.f230985Y) {
            contentValues.put("prompt_info_jump_url", this.field_prompt_info_jump_url);
        }
        if (this.f230986Z) {
            contentValues.put("yht_related_bank", this.field_yht_related_bank);
        }
        if (this.f230997p0) {
            contentValues.put("yht_avail_balance", Long.valueOf(this.field_yht_avail_balance));
        }
        if (this.f231006x0) {
            contentValues.put("yht_user_state", Integer.valueOf(this.field_yht_user_state));
        }
        if (this.f231008y0) {
            contentValues.put("yht_system_state", Integer.valueOf(this.field_yht_system_state));
        }
        if (this.f230972Q0) {
            contentValues.put("yht_ext_msg", this.field_yht_ext_msg);
        }
        if (this.f230974R0) {
            contentValues.put("minimch_key", this.field_minimch_key);
        }
        if (this.f230976S0) {
            contentValues.put("minimch_avail_balance", Long.valueOf(this.field_minimch_avail_balance));
        }
        if (this.f230978T0) {
            contentValues.put("minimch_user_state", Integer.valueOf(this.field_minimch_user_state));
        }
        if (this.f230980U0) {
            contentValues.put("minimch_system_state", Integer.valueOf(this.field_minimch_system_state));
        }
        if (this.f230982V0) {
            contentValues.put("minimch_ext_msg", this.field_minimch_ext_msg);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWalletBankcard", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WalletBankcard ( " + f230930b2.sql + ");");
        for (String add : f230921X0) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWalletBankcard", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WalletBankcard", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f230930b2, "WalletBankcard", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWalletBankcard", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WalletBankcard", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWalletBankcard", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230930b2;
    }

    public String[] getIndexCreateSQL() {
        return f230921X0;
    }

    public StorageObserverOwner<C78816l9> getObserverOwner() {
        return f230932c2;
    }

    public Object getPrimaryKeyValue() {
        return this.field_bindSerial;
    }

    public SingleTable getTable() {
        return f230919W0;
    }

    public String getTableName() {
        return f230919W0.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("bindSerial")) {
            this.field_bindSerial = contentValues.getAsString("bindSerial");
            if (z) {
                this.f230987d = true;
            }
        }
        if (contentValues.containsKey("defaultCardState")) {
            this.field_defaultCardState = contentValues.getAsInteger("defaultCardState").intValue();
            if (z) {
                this.f230988e = true;
            }
        }
        if (contentValues.containsKey("cardType")) {
            this.field_cardType = contentValues.getAsInteger("cardType").intValue();
            if (z) {
                this.f230989f = true;
            }
        }
        if (contentValues.containsKey("bankcardState")) {
            this.field_bankcardState = contentValues.getAsInteger("bankcardState").intValue();
            if (z) {
                this.f230990g = true;
            }
        }
        if (contentValues.containsKey("forbidWord")) {
            this.field_forbidWord = contentValues.getAsString("forbidWord");
            if (z) {
                this.f230991h = true;
            }
        }
        if (contentValues.containsKey("bankName")) {
            this.field_bankName = contentValues.getAsString("bankName");
            if (z) {
                this.f230992i = true;
            }
        }
        if (contentValues.containsKey("bankcardType")) {
            this.field_bankcardType = contentValues.getAsString("bankcardType");
            if (z) {
                this.f230993j = true;
            }
        }
        if (contentValues.containsKey("bankcardTypeName")) {
            this.field_bankcardTypeName = contentValues.getAsString("bankcardTypeName");
            if (z) {
                this.f230994n = true;
            }
        }
        if (contentValues.containsKey("bankcardTag")) {
            this.field_bankcardTag = contentValues.getAsInteger("bankcardTag").intValue();
            if (z) {
                this.f230995o = true;
            }
        }
        if (contentValues.containsKey("bankcardTail")) {
            this.field_bankcardTail = contentValues.getAsString("bankcardTail");
            if (z) {
                this.f230996p = true;
            }
        }
        if (contentValues.containsKey("supportTag")) {
            this.field_supportTag = contentValues.getAsInteger("supportTag").intValue();
            if (z) {
                this.f230998q = true;
            }
        }
        if (contentValues.containsKey("mobile")) {
            this.field_mobile = contentValues.getAsString("mobile");
            if (z) {
                this.f230999r = true;
            }
        }
        if (contentValues.containsKey("trueName")) {
            this.field_trueName = contentValues.getAsString("trueName");
            if (z) {
                this.f231000s = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z) {
                this.f231001t = true;
            }
        }
        if (contentValues.containsKey("bankPhone")) {
            this.field_bankPhone = contentValues.getAsString("bankPhone");
            if (z) {
                this.f231002u = true;
            }
        }
        if (contentValues.containsKey("bizUsername")) {
            this.field_bizUsername = contentValues.getAsString("bizUsername");
            if (z) {
                this.f231003v = true;
            }
        }
        if (contentValues.containsKey("onceQuotaKind")) {
            this.field_onceQuotaKind = contentValues.getAsDouble("onceQuotaKind").doubleValue();
            if (z) {
                this.f231004w = true;
            }
        }
        if (contentValues.containsKey("onceQuotaVirtual")) {
            this.field_onceQuotaVirtual = contentValues.getAsDouble("onceQuotaVirtual").doubleValue();
            if (z) {
                this.f231005x = true;
            }
        }
        if (contentValues.containsKey("dayQuotaKind")) {
            this.field_dayQuotaKind = contentValues.getAsDouble("dayQuotaKind").doubleValue();
            if (z) {
                this.f231007y = true;
            }
        }
        if (contentValues.containsKey("dayQuotaVirtual")) {
            this.field_dayQuotaVirtual = contentValues.getAsDouble("dayQuotaVirtual").doubleValue();
            if (z) {
                this.f231009z = true;
            }
        }
        if (contentValues.containsKey("fetchArriveTime")) {
            this.field_fetchArriveTime = contentValues.getAsLong("fetchArriveTime").longValue();
            if (z) {
                this.f230956A = true;
            }
        }
        if (contentValues.containsKey("fetchArriveTimeWording")) {
            this.field_fetchArriveTimeWording = contentValues.getAsString("fetchArriveTimeWording");
            if (z) {
                this.f230957B = true;
            }
        }
        if (contentValues.containsKey("repay_url")) {
            this.field_repay_url = contentValues.getAsString("repay_url");
            if (z) {
                this.f230958C = true;
            }
        }
        if (contentValues.containsKey("wxcreditState")) {
            this.field_wxcreditState = contentValues.getAsInteger("wxcreditState").intValue();
            if (z) {
                this.f230959D = true;
            }
        }
        if (contentValues.containsKey("bankcardClientType")) {
            this.field_bankcardClientType = contentValues.getAsInteger("bankcardClientType").intValue();
            if (z) {
                this.f230960E = true;
            }
        }
        if (contentValues.containsKey("ext_msg")) {
            this.field_ext_msg = contentValues.getAsString("ext_msg");
            if (z) {
                this.f230961F = true;
            }
        }
        if (contentValues.containsKey("support_micropay")) {
            this.field_support_micropay = contentValues.getAsInteger("support_micropay").intValue() != 0;
            if (z) {
                this.f230962G = true;
            }
        }
        if (contentValues.containsKey("arrive_type")) {
            this.field_arrive_type = contentValues.getAsString("arrive_type");
            if (z) {
                this.f230963H = true;
            }
        }
        if (contentValues.containsKey("avail_save_wording")) {
            this.field_avail_save_wording = contentValues.getAsString("avail_save_wording");
            if (z) {
                this.f230964I = true;
            }
        }
        if (contentValues.containsKey("fetch_charge_rate")) {
            this.field_fetch_charge_rate = contentValues.getAsDouble("fetch_charge_rate").doubleValue();
            if (z) {
                this.f230965J = true;
            }
        }
        if (contentValues.containsKey("full_fetch_charge_fee")) {
            this.field_full_fetch_charge_fee = contentValues.getAsDouble("full_fetch_charge_fee").doubleValue();
            if (z) {
                this.f230966K = true;
            }
        }
        if (contentValues.containsKey("fetch_charge_info")) {
            this.field_fetch_charge_info = contentValues.getAsString("fetch_charge_info");
            if (z) {
                this.f230967L = true;
            }
        }
        if (contentValues.containsKey("tips")) {
            this.field_tips = contentValues.getAsString("tips");
            if (z) {
                this.f230968M = true;
            }
        }
        if (contentValues.containsKey("forbid_title")) {
            this.field_forbid_title = contentValues.getAsString("forbid_title");
            if (z) {
                this.f230969N = true;
            }
        }
        if (contentValues.containsKey("forbid_url")) {
            this.field_forbid_url = contentValues.getAsString("forbid_url");
            if (z) {
                this.f230970P = true;
            }
        }
        if (contentValues.containsKey("no_micro_word")) {
            this.field_no_micro_word = contentValues.getAsString("no_micro_word");
            if (z) {
                this.f230971Q = true;
            }
        }
        if (contentValues.containsKey("card_bottom_wording")) {
            this.field_card_bottom_wording = contentValues.getAsString("card_bottom_wording");
            if (z) {
                this.f230973R = true;
            }
        }
        if (contentValues.containsKey("support_lqt_turn_in")) {
            this.field_support_lqt_turn_in = contentValues.getAsInteger("support_lqt_turn_in").intValue();
            if (z) {
                this.f230975S = true;
            }
        }
        if (contentValues.containsKey("support_lqt_turn_out")) {
            this.field_support_lqt_turn_out = contentValues.getAsInteger("support_lqt_turn_out").intValue();
            if (z) {
                this.f230977T = true;
            }
        }
        if (contentValues.containsKey("is_hightlight_pre_arrive_time_wording")) {
            this.field_is_hightlight_pre_arrive_time_wording = contentValues.getAsInteger("is_hightlight_pre_arrive_time_wording").intValue();
            if (z) {
                this.f230979U = true;
            }
        }
        if (contentValues.containsKey("card_state_name")) {
            this.field_card_state_name = contentValues.getAsString("card_state_name");
            if (z) {
                this.f230981V = true;
            }
        }
        if (contentValues.containsKey("prompt_info_prompt_text")) {
            this.field_prompt_info_prompt_text = contentValues.getAsString("prompt_info_prompt_text");
            if (z) {
                this.f230983W = true;
            }
        }
        if (contentValues.containsKey("prompt_info_jump_text")) {
            this.field_prompt_info_jump_text = contentValues.getAsString("prompt_info_jump_text");
            if (z) {
                this.f230984X = true;
            }
        }
        if (contentValues.containsKey("prompt_info_jump_url")) {
            this.field_prompt_info_jump_url = contentValues.getAsString("prompt_info_jump_url");
            if (z) {
                this.f230985Y = true;
            }
        }
        if (contentValues.containsKey("yht_related_bank")) {
            this.field_yht_related_bank = contentValues.getAsString("yht_related_bank");
            if (z) {
                this.f230986Z = true;
            }
        }
        if (contentValues.containsKey("yht_avail_balance")) {
            this.field_yht_avail_balance = contentValues.getAsLong("yht_avail_balance").longValue();
            if (z) {
                this.f230997p0 = true;
            }
        }
        if (contentValues.containsKey("yht_user_state")) {
            this.field_yht_user_state = contentValues.getAsInteger("yht_user_state").intValue();
            if (z) {
                this.f231006x0 = true;
            }
        }
        if (contentValues.containsKey("yht_system_state")) {
            this.field_yht_system_state = contentValues.getAsInteger("yht_system_state").intValue();
            if (z) {
                this.f231008y0 = true;
            }
        }
        if (contentValues.containsKey("yht_ext_msg")) {
            this.field_yht_ext_msg = contentValues.getAsString("yht_ext_msg");
            if (z) {
                this.f230972Q0 = true;
            }
        }
        if (contentValues.containsKey("minimch_key")) {
            this.field_minimch_key = contentValues.getAsString("minimch_key");
            if (z) {
                this.f230974R0 = true;
            }
        }
        if (contentValues.containsKey("minimch_avail_balance")) {
            this.field_minimch_avail_balance = contentValues.getAsLong("minimch_avail_balance").longValue();
            if (z) {
                this.f230976S0 = true;
            }
        }
        if (contentValues.containsKey("minimch_user_state")) {
            this.field_minimch_user_state = contentValues.getAsInteger("minimch_user_state").intValue();
            if (z) {
                this.f230978T0 = true;
            }
        }
        if (contentValues.containsKey("minimch_system_state")) {
            this.field_minimch_system_state = contentValues.getAsInteger("minimch_system_state").intValue();
            if (z) {
                this.f230980U0 = true;
            }
        }
        if (contentValues.containsKey("minimch_ext_msg")) {
            this.field_minimch_ext_msg = contentValues.getAsString("minimch_ext_msg");
            if (z) {
                this.f230982V0 = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
