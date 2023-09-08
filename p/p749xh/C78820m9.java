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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.m9 */
public class C78820m9 extends IAutoDBItem {

    /* renamed from: A1 */
    public static final int f231090A1 = -1305843613;

    /* renamed from: B1 */
    public static final int f231091B1 = -2022910508;

    /* renamed from: C1 */
    public static final int f231092C1 = -384106590;

    /* renamed from: D1 */
    public static final int f231093D1 = -1463109338;

    /* renamed from: E1 */
    public static final int f231094E1 = 796496262;

    /* renamed from: F1 */
    public static final int f231095F1 = 550365648;

    /* renamed from: G1 */
    public static final int f231096G1 = 796240212;

    /* renamed from: H1 */
    public static final int f231097H1 = 3560248;

    /* renamed from: I1 */
    public static final int f231098I1 = 416503277;

    /* renamed from: J1 */
    public static final int f231099J1 = -634201532;

    /* renamed from: K1 */
    public static final int f231100K1 = 1677701347;

    /* renamed from: L1 */
    public static final int f231101L1 = 796742547;

    /* renamed from: M1 */
    public static final int f231102M1 = -730419449;

    /* renamed from: N1 */
    public static final int f231103N1 = -1168160340;

    /* renamed from: O1 */
    public static final int f231104O1 = 520462124;

    /* renamed from: P1 */
    public static final int f231105P1 = -1075056120;

    /* renamed from: Q1 */
    public static final int f231106Q1 = 902532754;

    /* renamed from: R1 */
    public static final int f231107R1 = -249695096;

    /* renamed from: S1 */
    public static final int f231108S1 = 269041332;

    /* renamed from: T1 */
    public static final int f231109T1 = 56546442;

    /* renamed from: U1 */
    public static final int f231110U1 = -640957422;

    /* renamed from: V1 */
    public static final int f231111V1 = -675347369;

    /* renamed from: W1 */
    public static final int f231112W1 = -442578629;

    /* renamed from: X1 */
    public static final int f231113X1 = 195743081;

    /* renamed from: Y0 */
    public static final SingleTable f231114Y0;

    /* renamed from: Y1 */
    public static final int f231115Y1 = 488633851;

    /* renamed from: Z0 */
    public static final String[] f231116Z0 = {"CREATE INDEX IF NOT EXISTS bankcard_scene_index ON WalletBankcardScene(scene)"};

    /* renamed from: Z1 */
    public static final int f231117Z1 = -784318424;

    /* renamed from: a1 */
    public static final int f231118a1 = -1281925072;

    /* renamed from: a2 */
    public static final int f231119a2 = -873730047;

    /* renamed from: b1 */
    public static final int f231120b1 = 877014161;

    /* renamed from: b2 */
    public static final int f231121b2 = -2109771163;

    /* renamed from: c1 */
    public static final int f231122c1 = 1555072544;

    /* renamed from: c2 */
    public static final int f231123c2 = -488926721;

    /* renamed from: d1 */
    public static final int f231124d1 = -8227222;

    /* renamed from: d2 */
    public static final int f231125d2 = 109254796;

    /* renamed from: e1 */
    public static final int f231126e1 = 1043005605;

    /* renamed from: e2 */
    public static final int f231127e2 = 108705909;

    /* renamed from: f1 */
    public static final int f231128f1 = -634445634;

    /* renamed from: f2 */
    public static final IAutoDBItem.MAutoDBInfo f231129f2 = initAutoDBInfo(C78820m9.class);

    /* renamed from: g1 */
    public static final int f231130g1 = -1859291417;

    /* renamed from: g2 */
    public static final StorageObserverOwner<C78820m9> f231131g2 = new StorageObserverOwner<>();

    /* renamed from: h1 */
    public static final int f231132h1 = 1280606374;

    /* renamed from: i1 */
    public static final int f231133i1 = 391949393;

    /* renamed from: j1 */
    public static final int f231134j1 = -789974866;

    /* renamed from: k1 */
    public static final int f231135k1 = 1280583100;

    /* renamed from: l1 */
    public static final int f231136l1 = -613908149;

    /* renamed from: m1 */
    public static final int f231137m1 = -1068855134;

    /* renamed from: n1 */
    public static final int f231138n1 = 1844047161;

    /* renamed from: o1 */
    public static final int f231139o1 = 3079825;

    /* renamed from: p1 */
    public static final int f231140p1 = -1801401198;

    /* renamed from: q1 */
    public static final int f231141q1 = -833837303;

    /* renamed from: r1 */
    public static final int f231142r1 = -849300309;

    /* renamed from: s1 */
    public static final int f231143s1 = 1323727508;

    /* renamed from: t1 */
    public static final int f231144t1 = 26467824;

    /* renamed from: u1 */
    public static final int f231145u1 = -594145489;

    /* renamed from: v1 */
    public static final int f231146v1 = 1154333854;

    /* renamed from: w1 */
    public static final int f231147w1 = 1654524442;

    /* renamed from: x1 */
    public static final int f231148x1 = -748276795;

    /* renamed from: y1 */
    public static final int f231149y1 = 1735436183;

    /* renamed from: z1 */
    public static final int f231150z1 = 1392265745;

    /* renamed from: A */
    public boolean f231151A = true;

    /* renamed from: B */
    public boolean f231152B = true;

    /* renamed from: C */
    public boolean f231153C = true;

    /* renamed from: D */
    public boolean f231154D = true;

    /* renamed from: E */
    public boolean f231155E = true;

    /* renamed from: F */
    public boolean f231156F = true;

    /* renamed from: G */
    public boolean f231157G = true;

    /* renamed from: H */
    public boolean f231158H = true;

    /* renamed from: I */
    public boolean f231159I = true;

    /* renamed from: J */
    public boolean f231160J = true;

    /* renamed from: K */
    public boolean f231161K = true;

    /* renamed from: L */
    public boolean f231162L = true;

    /* renamed from: M */
    public boolean f231163M = true;

    /* renamed from: N */
    public boolean f231164N = true;

    /* renamed from: P */
    public boolean f231165P = true;

    /* renamed from: Q */
    public boolean f231166Q = true;

    /* renamed from: Q0 */
    public boolean f231167Q0 = true;

    /* renamed from: R */
    public boolean f231168R = true;

    /* renamed from: R0 */
    public boolean f231169R0 = true;

    /* renamed from: S */
    public boolean f231170S = true;

    /* renamed from: S0 */
    public boolean f231171S0 = true;

    /* renamed from: T */
    public boolean f231172T = true;

    /* renamed from: T0 */
    public boolean f231173T0 = true;

    /* renamed from: U */
    public boolean f231174U = true;

    /* renamed from: U0 */
    public boolean f231175U0 = true;

    /* renamed from: V */
    public boolean f231176V = true;

    /* renamed from: V0 */
    public boolean f231177V0 = true;

    /* renamed from: W */
    public boolean f231178W = true;

    /* renamed from: W0 */
    public boolean f231179W0 = true;

    /* renamed from: X */
    public boolean f231180X = true;

    /* renamed from: X0 */
    public boolean f231181X0 = true;

    /* renamed from: Y */
    public boolean f231182Y = true;

    /* renamed from: Z */
    public boolean f231183Z = true;

    /* renamed from: d */
    public boolean f231184d = true;

    /* renamed from: e */
    public boolean f231185e = true;

    /* renamed from: f */
    public boolean f231186f = true;
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
    public int field_fakePk;
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
    public int field_scene;
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
    public boolean f231187g = true;

    /* renamed from: h */
    public boolean f231188h = true;

    /* renamed from: i */
    public boolean f231189i = true;

    /* renamed from: j */
    public boolean f231190j = true;

    /* renamed from: n */
    public boolean f231191n = true;

    /* renamed from: o */
    public boolean f231192o = true;

    /* renamed from: p */
    public boolean f231193p = true;

    /* renamed from: p0 */
    public boolean f231194p0 = true;

    /* renamed from: q */
    public boolean f231195q = true;

    /* renamed from: r */
    public boolean f231196r = true;

    /* renamed from: s */
    public boolean f231197s = true;

    /* renamed from: t */
    public boolean f231198t = true;

    /* renamed from: u */
    public boolean f231199u = true;

    /* renamed from: v */
    public boolean f231200v = true;

    /* renamed from: w */
    public boolean f231201w = true;

    /* renamed from: x */
    public boolean f231202x = true;

    /* renamed from: x0 */
    public boolean f231203x0 = true;

    /* renamed from: y */
    public boolean f231204y = true;

    /* renamed from: y0 */
    public boolean f231205y0 = true;

    /* renamed from: z */
    public boolean f231206z = true;

    static {
        SingleTable singleTable = new SingleTable("WalletBankcardScene");
        f231114Y0 = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("fakePk", "int", singleTable.getName(), "");
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
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[56];
        String[] strArr = new String[57];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "fakePk";
        mAutoDBInfo.colsMap.put("fakePk", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "fakePk";
        mAutoDBInfo.columns[1] = "bindSerial";
        mAutoDBInfo.colsMap.put("bindSerial", "TEXT");
        mAutoDBInfo.columns[2] = "defaultCardState";
        mAutoDBInfo.colsMap.put("defaultCardState", "INTEGER");
        mAutoDBInfo.columns[3] = "cardType";
        mAutoDBInfo.colsMap.put("cardType", "INTEGER");
        mAutoDBInfo.columns[4] = "bankcardState";
        mAutoDBInfo.colsMap.put("bankcardState", "INTEGER");
        mAutoDBInfo.columns[5] = "forbidWord";
        mAutoDBInfo.colsMap.put("forbidWord", "TEXT");
        mAutoDBInfo.columns[6] = "bankName";
        mAutoDBInfo.colsMap.put("bankName", "TEXT");
        mAutoDBInfo.columns[7] = "bankcardType";
        mAutoDBInfo.colsMap.put("bankcardType", "TEXT");
        mAutoDBInfo.columns[8] = "bankcardTypeName";
        mAutoDBInfo.colsMap.put("bankcardTypeName", "TEXT");
        mAutoDBInfo.columns[9] = "bankcardTag";
        mAutoDBInfo.colsMap.put("bankcardTag", "INTEGER");
        mAutoDBInfo.columns[10] = "bankcardTail";
        mAutoDBInfo.colsMap.put("bankcardTail", "TEXT");
        mAutoDBInfo.columns[11] = "supportTag";
        mAutoDBInfo.colsMap.put("supportTag", "INTEGER");
        mAutoDBInfo.columns[12] = "mobile";
        mAutoDBInfo.colsMap.put("mobile", "TEXT");
        mAutoDBInfo.columns[13] = "trueName";
        mAutoDBInfo.colsMap.put("trueName", "TEXT");
        mAutoDBInfo.columns[14] = "desc";
        mAutoDBInfo.colsMap.put("desc", "TEXT");
        mAutoDBInfo.columns[15] = "bankPhone";
        mAutoDBInfo.colsMap.put("bankPhone", "TEXT");
        mAutoDBInfo.columns[16] = "bizUsername";
        mAutoDBInfo.colsMap.put("bizUsername", "TEXT");
        mAutoDBInfo.columns[17] = "onceQuotaKind";
        mAutoDBInfo.colsMap.put("onceQuotaKind", "DOUBLE");
        mAutoDBInfo.columns[18] = "onceQuotaVirtual";
        mAutoDBInfo.colsMap.put("onceQuotaVirtual", "DOUBLE");
        mAutoDBInfo.columns[19] = "dayQuotaKind";
        mAutoDBInfo.colsMap.put("dayQuotaKind", "DOUBLE");
        mAutoDBInfo.columns[20] = "dayQuotaVirtual";
        mAutoDBInfo.colsMap.put("dayQuotaVirtual", "DOUBLE");
        mAutoDBInfo.columns[21] = "fetchArriveTime";
        mAutoDBInfo.colsMap.put("fetchArriveTime", "LONG");
        mAutoDBInfo.columns[22] = "fetchArriveTimeWording";
        mAutoDBInfo.colsMap.put("fetchArriveTimeWording", "TEXT");
        mAutoDBInfo.columns[23] = "repay_url";
        mAutoDBInfo.colsMap.put("repay_url", "TEXT");
        mAutoDBInfo.columns[24] = "wxcreditState";
        mAutoDBInfo.colsMap.put("wxcreditState", "INTEGER");
        mAutoDBInfo.columns[25] = "bankcardClientType";
        mAutoDBInfo.colsMap.put("bankcardClientType", "INTEGER");
        mAutoDBInfo.columns[26] = "ext_msg";
        mAutoDBInfo.colsMap.put("ext_msg", "TEXT");
        mAutoDBInfo.columns[27] = "support_micropay";
        mAutoDBInfo.colsMap.put("support_micropay", "INTEGER");
        mAutoDBInfo.columns[28] = "arrive_type";
        mAutoDBInfo.colsMap.put("arrive_type", "TEXT");
        mAutoDBInfo.columns[29] = "avail_save_wording";
        mAutoDBInfo.colsMap.put("avail_save_wording", "TEXT");
        mAutoDBInfo.columns[30] = "fetch_charge_rate";
        mAutoDBInfo.colsMap.put("fetch_charge_rate", "DOUBLE");
        mAutoDBInfo.columns[31] = "full_fetch_charge_fee";
        mAutoDBInfo.colsMap.put("full_fetch_charge_fee", "DOUBLE");
        mAutoDBInfo.columns[32] = "fetch_charge_info";
        mAutoDBInfo.colsMap.put("fetch_charge_info", "TEXT");
        mAutoDBInfo.columns[33] = "tips";
        mAutoDBInfo.colsMap.put("tips", "TEXT");
        mAutoDBInfo.columns[34] = "forbid_title";
        mAutoDBInfo.colsMap.put("forbid_title", "TEXT");
        mAutoDBInfo.columns[35] = "forbid_url";
        mAutoDBInfo.colsMap.put("forbid_url", "TEXT");
        mAutoDBInfo.columns[36] = "no_micro_word";
        mAutoDBInfo.colsMap.put("no_micro_word", "TEXT");
        mAutoDBInfo.columns[37] = "card_bottom_wording";
        mAutoDBInfo.colsMap.put("card_bottom_wording", "TEXT");
        mAutoDBInfo.columns[38] = "support_lqt_turn_in";
        mAutoDBInfo.colsMap.put("support_lqt_turn_in", "INTEGER");
        mAutoDBInfo.columns[39] = "support_lqt_turn_out";
        mAutoDBInfo.colsMap.put("support_lqt_turn_out", "INTEGER");
        mAutoDBInfo.columns[40] = "is_hightlight_pre_arrive_time_wording";
        mAutoDBInfo.colsMap.put("is_hightlight_pre_arrive_time_wording", "INTEGER");
        mAutoDBInfo.columns[41] = "card_state_name";
        mAutoDBInfo.colsMap.put("card_state_name", "TEXT");
        mAutoDBInfo.columns[42] = "prompt_info_prompt_text";
        mAutoDBInfo.colsMap.put("prompt_info_prompt_text", "TEXT");
        mAutoDBInfo.columns[43] = "prompt_info_jump_text";
        mAutoDBInfo.colsMap.put("prompt_info_jump_text", "TEXT");
        mAutoDBInfo.columns[44] = "prompt_info_jump_url";
        mAutoDBInfo.colsMap.put("prompt_info_jump_url", "TEXT");
        mAutoDBInfo.columns[45] = "yht_related_bank";
        mAutoDBInfo.colsMap.put("yht_related_bank", "TEXT");
        mAutoDBInfo.columns[46] = "yht_avail_balance";
        mAutoDBInfo.colsMap.put("yht_avail_balance", "LONG");
        mAutoDBInfo.columns[47] = "yht_user_state";
        mAutoDBInfo.colsMap.put("yht_user_state", "INTEGER");
        mAutoDBInfo.columns[48] = "yht_system_state";
        mAutoDBInfo.colsMap.put("yht_system_state", "INTEGER");
        mAutoDBInfo.columns[49] = "yht_ext_msg";
        mAutoDBInfo.colsMap.put("yht_ext_msg", "TEXT");
        mAutoDBInfo.columns[50] = "minimch_key";
        mAutoDBInfo.colsMap.put("minimch_key", "TEXT");
        mAutoDBInfo.columns[51] = "minimch_avail_balance";
        mAutoDBInfo.colsMap.put("minimch_avail_balance", "LONG");
        mAutoDBInfo.columns[52] = "minimch_user_state";
        mAutoDBInfo.colsMap.put("minimch_user_state", "INTEGER");
        mAutoDBInfo.columns[53] = "minimch_system_state";
        mAutoDBInfo.colsMap.put("minimch_system_state", "INTEGER");
        mAutoDBInfo.columns[54] = "minimch_ext_msg";
        mAutoDBInfo.colsMap.put("minimch_ext_msg", "TEXT");
        mAutoDBInfo.columns[55] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER default '0' ");
        mAutoDBInfo.columns[56] = "rowid";
        mAutoDBInfo.sql = " fakePk INTEGER PRIMARY KEY ,  bindSerial TEXT,  defaultCardState INTEGER,  cardType INTEGER,  bankcardState INTEGER,  forbidWord TEXT,  bankName TEXT,  bankcardType TEXT,  bankcardTypeName TEXT,  bankcardTag INTEGER,  bankcardTail TEXT,  supportTag INTEGER,  mobile TEXT,  trueName TEXT,  desc TEXT,  bankPhone TEXT,  bizUsername TEXT,  onceQuotaKind DOUBLE,  onceQuotaVirtual DOUBLE,  dayQuotaKind DOUBLE,  dayQuotaVirtual DOUBLE,  fetchArriveTime LONG,  fetchArriveTimeWording TEXT,  repay_url TEXT,  wxcreditState INTEGER,  bankcardClientType INTEGER,  ext_msg TEXT,  support_micropay INTEGER,  arrive_type TEXT,  avail_save_wording TEXT,  fetch_charge_rate DOUBLE,  full_fetch_charge_fee DOUBLE,  fetch_charge_info TEXT,  tips TEXT,  forbid_title TEXT,  forbid_url TEXT,  no_micro_word TEXT,  card_bottom_wording TEXT,  support_lqt_turn_in INTEGER,  support_lqt_turn_out INTEGER,  is_hightlight_pre_arrive_time_wording INTEGER,  card_state_name TEXT,  prompt_info_prompt_text TEXT,  prompt_info_jump_text TEXT,  prompt_info_jump_url TEXT,  yht_related_bank TEXT,  yht_avail_balance LONG,  yht_user_state INTEGER,  yht_system_state INTEGER,  yht_ext_msg TEXT,  minimch_key TEXT,  minimch_avail_balance LONG,  minimch_user_state INTEGER,  minimch_system_state INTEGER,  minimch_ext_msg TEXT,  scene INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78820m9)) {
            return false;
        }
        C78820m9 m9Var = (C78820m9) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_fakePk), Integer.valueOf(m9Var.field_fakePk)) && C46238a.m51546a(this.field_bindSerial, m9Var.field_bindSerial) && C46238a.m51546a(Integer.valueOf(this.field_defaultCardState), Integer.valueOf(m9Var.field_defaultCardState)) && C46238a.m51546a(Integer.valueOf(this.field_cardType), Integer.valueOf(m9Var.field_cardType)) && C46238a.m51546a(Integer.valueOf(this.field_bankcardState), Integer.valueOf(m9Var.field_bankcardState)) && C46238a.m51546a(this.field_forbidWord, m9Var.field_forbidWord) && C46238a.m51546a(this.field_bankName, m9Var.field_bankName) && C46238a.m51546a(this.field_bankcardType, m9Var.field_bankcardType) && C46238a.m51546a(this.field_bankcardTypeName, m9Var.field_bankcardTypeName) && C46238a.m51546a(Integer.valueOf(this.field_bankcardTag), Integer.valueOf(m9Var.field_bankcardTag)) && C46238a.m51546a(this.field_bankcardTail, m9Var.field_bankcardTail) && C46238a.m51546a(Integer.valueOf(this.field_supportTag), Integer.valueOf(m9Var.field_supportTag)) && C46238a.m51546a(this.field_mobile, m9Var.field_mobile) && C46238a.m51546a(this.field_trueName, m9Var.field_trueName) && C46238a.m51546a(this.field_desc, m9Var.field_desc) && C46238a.m51546a(this.field_bankPhone, m9Var.field_bankPhone) && C46238a.m51546a(this.field_bizUsername, m9Var.field_bizUsername) && C46238a.m51546a(Double.valueOf(this.field_onceQuotaKind), Double.valueOf(m9Var.field_onceQuotaKind)) && C46238a.m51546a(Double.valueOf(this.field_onceQuotaVirtual), Double.valueOf(m9Var.field_onceQuotaVirtual)) && C46238a.m51546a(Double.valueOf(this.field_dayQuotaKind), Double.valueOf(m9Var.field_dayQuotaKind)) && C46238a.m51546a(Double.valueOf(this.field_dayQuotaVirtual), Double.valueOf(m9Var.field_dayQuotaVirtual)) && C46238a.m51546a(Long.valueOf(this.field_fetchArriveTime), Long.valueOf(m9Var.field_fetchArriveTime)) && C46238a.m51546a(this.field_fetchArriveTimeWording, m9Var.field_fetchArriveTimeWording) && C46238a.m51546a(this.field_repay_url, m9Var.field_repay_url) && C46238a.m51546a(Integer.valueOf(this.field_wxcreditState), Integer.valueOf(m9Var.field_wxcreditState)) && C46238a.m51546a(Integer.valueOf(this.field_bankcardClientType), Integer.valueOf(m9Var.field_bankcardClientType)) && C46238a.m51546a(this.field_ext_msg, m9Var.field_ext_msg) && C46238a.m51546a(Boolean.valueOf(this.field_support_micropay), Boolean.valueOf(m9Var.field_support_micropay)) && C46238a.m51546a(this.field_arrive_type, m9Var.field_arrive_type) && C46238a.m51546a(this.field_avail_save_wording, m9Var.field_avail_save_wording) && C46238a.m51546a(Double.valueOf(this.field_fetch_charge_rate), Double.valueOf(m9Var.field_fetch_charge_rate)) && C46238a.m51546a(Double.valueOf(this.field_full_fetch_charge_fee), Double.valueOf(m9Var.field_full_fetch_charge_fee)) && C46238a.m51546a(this.field_fetch_charge_info, m9Var.field_fetch_charge_info) && C46238a.m51546a(this.field_tips, m9Var.field_tips) && C46238a.m51546a(this.field_forbid_title, m9Var.field_forbid_title) && C46238a.m51546a(this.field_forbid_url, m9Var.field_forbid_url) && C46238a.m51546a(this.field_no_micro_word, m9Var.field_no_micro_word) && C46238a.m51546a(this.field_card_bottom_wording, m9Var.field_card_bottom_wording) && C46238a.m51546a(Integer.valueOf(this.field_support_lqt_turn_in), Integer.valueOf(m9Var.field_support_lqt_turn_in)) && C46238a.m51546a(Integer.valueOf(this.field_support_lqt_turn_out), Integer.valueOf(m9Var.field_support_lqt_turn_out)) && C46238a.m51546a(Integer.valueOf(this.field_is_hightlight_pre_arrive_time_wording), Integer.valueOf(m9Var.field_is_hightlight_pre_arrive_time_wording)) && C46238a.m51546a(this.field_card_state_name, m9Var.field_card_state_name) && C46238a.m51546a(this.field_prompt_info_prompt_text, m9Var.field_prompt_info_prompt_text) && C46238a.m51546a(this.field_prompt_info_jump_text, m9Var.field_prompt_info_jump_text) && C46238a.m51546a(this.field_prompt_info_jump_url, m9Var.field_prompt_info_jump_url) && C46238a.m51546a(this.field_yht_related_bank, m9Var.field_yht_related_bank) && C46238a.m51546a(Long.valueOf(this.field_yht_avail_balance), Long.valueOf(m9Var.field_yht_avail_balance)) && C46238a.m51546a(Integer.valueOf(this.field_yht_user_state), Integer.valueOf(m9Var.field_yht_user_state)) && C46238a.m51546a(Integer.valueOf(this.field_yht_system_state), Integer.valueOf(m9Var.field_yht_system_state)) && C46238a.m51546a(this.field_yht_ext_msg, m9Var.field_yht_ext_msg) && C46238a.m51546a(this.field_minimch_key, m9Var.field_minimch_key) && C46238a.m51546a(Long.valueOf(this.field_minimch_avail_balance), Long.valueOf(m9Var.field_minimch_avail_balance)) && C46238a.m51546a(Integer.valueOf(this.field_minimch_user_state), Integer.valueOf(m9Var.field_minimch_user_state)) && C46238a.m51546a(Integer.valueOf(this.field_minimch_system_state), Integer.valueOf(m9Var.field_minimch_system_state)) && C46238a.m51546a(this.field_minimch_ext_msg, m9Var.field_minimch_ext_msg) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(m9Var.field_scene));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231118a1 == hashCode) {
                    try {
                        this.field_fakePk = cursor.getInt(i);
                        this.f231184d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231120b1 == hashCode) {
                    try {
                        this.field_bindSerial = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231122c1 == hashCode) {
                    try {
                        this.field_defaultCardState = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231124d1 == hashCode) {
                    try {
                        this.field_cardType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231126e1 == hashCode) {
                    try {
                        this.field_bankcardState = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231128f1 == hashCode) {
                    try {
                        this.field_forbidWord = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231130g1 == hashCode) {
                    try {
                        this.field_bankName = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231132h1 == hashCode) {
                    try {
                        this.field_bankcardType = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231133i1 == hashCode) {
                    try {
                        this.field_bankcardTypeName = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231134j1 == hashCode) {
                    try {
                        this.field_bankcardTag = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231135k1 == hashCode) {
                    try {
                        this.field_bankcardTail = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231136l1 == hashCode) {
                    try {
                        this.field_supportTag = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231137m1 == hashCode) {
                    try {
                        this.field_mobile = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231138n1 == hashCode) {
                    try {
                        this.field_trueName = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231139o1 == hashCode) {
                    try {
                        this.field_desc = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231140p1 == hashCode) {
                    try {
                        this.field_bankPhone = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231141q1 == hashCode) {
                    try {
                        this.field_bizUsername = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231142r1 == hashCode) {
                    try {
                        this.field_onceQuotaKind = cursor.getDouble(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231143s1 == hashCode) {
                    try {
                        this.field_onceQuotaVirtual = cursor.getDouble(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231144t1 == hashCode) {
                    try {
                        this.field_dayQuotaKind = cursor.getDouble(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231145u1 == hashCode) {
                    try {
                        this.field_dayQuotaVirtual = cursor.getDouble(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231146v1 == hashCode) {
                    try {
                        this.field_fetchArriveTime = cursor.getLong(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231147w1 == hashCode) {
                    try {
                        this.field_fetchArriveTimeWording = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231148x1 == hashCode) {
                    try {
                        this.field_repay_url = cursor.getString(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231149y1 == hashCode) {
                    try {
                        this.field_wxcreditState = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231150z1 == hashCode) {
                    try {
                        this.field_bankcardClientType = cursor.getInt(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231090A1 == hashCode) {
                    try {
                        this.field_ext_msg = cursor.getString(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231091B1 == hashCode) {
                    try {
                        this.field_support_micropay = cursor.getInt(i) != 0;
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231092C1 == hashCode) {
                    try {
                        this.field_arrive_type = cursor.getString(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231093D1 == hashCode) {
                    try {
                        this.field_avail_save_wording = cursor.getString(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231094E1 == hashCode) {
                    try {
                        this.field_fetch_charge_rate = cursor.getDouble(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231095F1 == hashCode) {
                    try {
                        this.field_full_fetch_charge_fee = cursor.getDouble(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231096G1 == hashCode) {
                    try {
                        this.field_fetch_charge_info = cursor.getString(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231097H1 == hashCode) {
                    try {
                        this.field_tips = cursor.getString(i);
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231098I1 == hashCode) {
                    try {
                        this.field_forbid_title = cursor.getString(i);
                    } catch (Throwable th37) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th37, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231099J1 == hashCode) {
                    try {
                        this.field_forbid_url = cursor.getString(i);
                    } catch (Throwable th38) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th38, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231100K1 == hashCode) {
                    try {
                        this.field_no_micro_word = cursor.getString(i);
                    } catch (Throwable th39) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th39, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231101L1 == hashCode) {
                    try {
                        this.field_card_bottom_wording = cursor.getString(i);
                    } catch (Throwable th40) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th40, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231102M1 == hashCode) {
                    try {
                        this.field_support_lqt_turn_in = cursor.getInt(i);
                    } catch (Throwable th41) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th41, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231103N1 == hashCode) {
                    try {
                        this.field_support_lqt_turn_out = cursor.getInt(i);
                    } catch (Throwable th42) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th42, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231104O1 == hashCode) {
                    try {
                        this.field_is_hightlight_pre_arrive_time_wording = cursor.getInt(i);
                    } catch (Throwable th43) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th43, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231105P1 == hashCode) {
                    try {
                        this.field_card_state_name = cursor.getString(i);
                    } catch (Throwable th44) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th44, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231106Q1 == hashCode) {
                    try {
                        this.field_prompt_info_prompt_text = cursor.getString(i);
                    } catch (Throwable th45) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th45, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231107R1 == hashCode) {
                    try {
                        this.field_prompt_info_jump_text = cursor.getString(i);
                    } catch (Throwable th46) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th46, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231108S1 == hashCode) {
                    try {
                        this.field_prompt_info_jump_url = cursor.getString(i);
                    } catch (Throwable th47) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th47, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231109T1 == hashCode) {
                    try {
                        this.field_yht_related_bank = cursor.getString(i);
                    } catch (Throwable th48) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th48, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231110U1 == hashCode) {
                    try {
                        this.field_yht_avail_balance = cursor.getLong(i);
                    } catch (Throwable th49) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th49, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231111V1 == hashCode) {
                    try {
                        this.field_yht_user_state = cursor.getInt(i);
                    } catch (Throwable th50) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th50, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231112W1 == hashCode) {
                    try {
                        this.field_yht_system_state = cursor.getInt(i);
                    } catch (Throwable th51) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th51, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231113X1 == hashCode) {
                    try {
                        this.field_yht_ext_msg = cursor.getString(i);
                    } catch (Throwable th52) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th52, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231115Y1 == hashCode) {
                    try {
                        this.field_minimch_key = cursor.getString(i);
                    } catch (Throwable th53) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th53, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231117Z1 == hashCode) {
                    try {
                        this.field_minimch_avail_balance = cursor.getLong(i);
                    } catch (Throwable th54) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th54, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231119a2 == hashCode) {
                    try {
                        this.field_minimch_user_state = cursor.getInt(i);
                    } catch (Throwable th55) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th55, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231121b2 == hashCode) {
                    try {
                        this.field_minimch_system_state = cursor.getInt(i);
                    } catch (Throwable th56) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th56, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231123c2 == hashCode) {
                    try {
                        this.field_minimch_ext_msg = cursor.getString(i);
                    } catch (Throwable th57) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th57, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231125d2 == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th58) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBankcardScene", th58, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231127e2 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231184d) {
            contentValues.put("fakePk", Integer.valueOf(this.field_fakePk));
        }
        if (this.f231185e) {
            contentValues.put("bindSerial", this.field_bindSerial);
        }
        if (this.f231186f) {
            contentValues.put("defaultCardState", Integer.valueOf(this.field_defaultCardState));
        }
        if (this.f231187g) {
            contentValues.put("cardType", Integer.valueOf(this.field_cardType));
        }
        if (this.f231188h) {
            contentValues.put("bankcardState", Integer.valueOf(this.field_bankcardState));
        }
        if (this.f231189i) {
            contentValues.put("forbidWord", this.field_forbidWord);
        }
        if (this.f231190j) {
            contentValues.put("bankName", this.field_bankName);
        }
        if (this.f231191n) {
            contentValues.put("bankcardType", this.field_bankcardType);
        }
        if (this.f231192o) {
            contentValues.put("bankcardTypeName", this.field_bankcardTypeName);
        }
        if (this.f231193p) {
            contentValues.put("bankcardTag", Integer.valueOf(this.field_bankcardTag));
        }
        if (this.f231195q) {
            contentValues.put("bankcardTail", this.field_bankcardTail);
        }
        if (this.f231196r) {
            contentValues.put("supportTag", Integer.valueOf(this.field_supportTag));
        }
        if (this.f231197s) {
            contentValues.put("mobile", this.field_mobile);
        }
        if (this.f231198t) {
            contentValues.put("trueName", this.field_trueName);
        }
        if (this.f231199u) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f231200v) {
            contentValues.put("bankPhone", this.field_bankPhone);
        }
        if (this.f231201w) {
            contentValues.put("bizUsername", this.field_bizUsername);
        }
        if (this.f231202x) {
            contentValues.put("onceQuotaKind", Double.valueOf(this.field_onceQuotaKind));
        }
        if (this.f231204y) {
            contentValues.put("onceQuotaVirtual", Double.valueOf(this.field_onceQuotaVirtual));
        }
        if (this.f231206z) {
            contentValues.put("dayQuotaKind", Double.valueOf(this.field_dayQuotaKind));
        }
        if (this.f231151A) {
            contentValues.put("dayQuotaVirtual", Double.valueOf(this.field_dayQuotaVirtual));
        }
        if (this.f231152B) {
            contentValues.put("fetchArriveTime", Long.valueOf(this.field_fetchArriveTime));
        }
        if (this.f231153C) {
            contentValues.put("fetchArriveTimeWording", this.field_fetchArriveTimeWording);
        }
        if (this.f231154D) {
            contentValues.put("repay_url", this.field_repay_url);
        }
        if (this.f231155E) {
            contentValues.put("wxcreditState", Integer.valueOf(this.field_wxcreditState));
        }
        if (this.f231156F) {
            contentValues.put("bankcardClientType", Integer.valueOf(this.field_bankcardClientType));
        }
        if (this.f231157G) {
            contentValues.put("ext_msg", this.field_ext_msg);
        }
        if (this.f231158H) {
            if (this.field_support_micropay) {
                contentValues.put("support_micropay", 1);
            } else {
                contentValues.put("support_micropay", 0);
            }
        }
        if (this.f231159I) {
            contentValues.put("arrive_type", this.field_arrive_type);
        }
        if (this.f231160J) {
            contentValues.put("avail_save_wording", this.field_avail_save_wording);
        }
        if (this.f231161K) {
            contentValues.put("fetch_charge_rate", Double.valueOf(this.field_fetch_charge_rate));
        }
        if (this.f231162L) {
            contentValues.put("full_fetch_charge_fee", Double.valueOf(this.field_full_fetch_charge_fee));
        }
        if (this.f231163M) {
            contentValues.put("fetch_charge_info", this.field_fetch_charge_info);
        }
        if (this.f231164N) {
            contentValues.put("tips", this.field_tips);
        }
        if (this.f231165P) {
            contentValues.put("forbid_title", this.field_forbid_title);
        }
        if (this.f231166Q) {
            contentValues.put("forbid_url", this.field_forbid_url);
        }
        if (this.f231168R) {
            contentValues.put("no_micro_word", this.field_no_micro_word);
        }
        if (this.f231170S) {
            contentValues.put("card_bottom_wording", this.field_card_bottom_wording);
        }
        if (this.f231172T) {
            contentValues.put("support_lqt_turn_in", Integer.valueOf(this.field_support_lqt_turn_in));
        }
        if (this.f231174U) {
            contentValues.put("support_lqt_turn_out", Integer.valueOf(this.field_support_lqt_turn_out));
        }
        if (this.f231176V) {
            contentValues.put("is_hightlight_pre_arrive_time_wording", Integer.valueOf(this.field_is_hightlight_pre_arrive_time_wording));
        }
        if (this.f231178W) {
            contentValues.put("card_state_name", this.field_card_state_name);
        }
        if (this.f231180X) {
            contentValues.put("prompt_info_prompt_text", this.field_prompt_info_prompt_text);
        }
        if (this.f231182Y) {
            contentValues.put("prompt_info_jump_text", this.field_prompt_info_jump_text);
        }
        if (this.f231183Z) {
            contentValues.put("prompt_info_jump_url", this.field_prompt_info_jump_url);
        }
        if (this.f231194p0) {
            contentValues.put("yht_related_bank", this.field_yht_related_bank);
        }
        if (this.f231203x0) {
            contentValues.put("yht_avail_balance", Long.valueOf(this.field_yht_avail_balance));
        }
        if (this.f231205y0) {
            contentValues.put("yht_user_state", Integer.valueOf(this.field_yht_user_state));
        }
        if (this.f231167Q0) {
            contentValues.put("yht_system_state", Integer.valueOf(this.field_yht_system_state));
        }
        if (this.f231169R0) {
            contentValues.put("yht_ext_msg", this.field_yht_ext_msg);
        }
        if (this.f231171S0) {
            contentValues.put("minimch_key", this.field_minimch_key);
        }
        if (this.f231173T0) {
            contentValues.put("minimch_avail_balance", Long.valueOf(this.field_minimch_avail_balance));
        }
        if (this.f231175U0) {
            contentValues.put("minimch_user_state", Integer.valueOf(this.field_minimch_user_state));
        }
        if (this.f231177V0) {
            contentValues.put("minimch_system_state", Integer.valueOf(this.field_minimch_system_state));
        }
        if (this.f231179W0) {
            contentValues.put("minimch_ext_msg", this.field_minimch_ext_msg);
        }
        if (this.f231181X0) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWalletBankcardScene", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WalletBankcardScene ( " + f231129f2.sql + ");");
        for (String add : f231116Z0) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWalletBankcardScene", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WalletBankcardScene", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231129f2, "WalletBankcardScene", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWalletBankcardScene", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WalletBankcardScene", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWalletBankcardScene", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231129f2;
    }

    public String[] getIndexCreateSQL() {
        return f231116Z0;
    }

    public StorageObserverOwner<C78820m9> getObserverOwner() {
        return f231131g2;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_fakePk);
    }

    public SingleTable getTable() {
        return f231114Y0;
    }

    public String getTableName() {
        return f231114Y0.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("fakePk")) {
            this.field_fakePk = contentValues.getAsInteger("fakePk").intValue();
            if (z) {
                this.f231184d = true;
            }
        }
        if (contentValues.containsKey("bindSerial")) {
            this.field_bindSerial = contentValues.getAsString("bindSerial");
            if (z) {
                this.f231185e = true;
            }
        }
        if (contentValues.containsKey("defaultCardState")) {
            this.field_defaultCardState = contentValues.getAsInteger("defaultCardState").intValue();
            if (z) {
                this.f231186f = true;
            }
        }
        if (contentValues.containsKey("cardType")) {
            this.field_cardType = contentValues.getAsInteger("cardType").intValue();
            if (z) {
                this.f231187g = true;
            }
        }
        if (contentValues.containsKey("bankcardState")) {
            this.field_bankcardState = contentValues.getAsInteger("bankcardState").intValue();
            if (z) {
                this.f231188h = true;
            }
        }
        if (contentValues.containsKey("forbidWord")) {
            this.field_forbidWord = contentValues.getAsString("forbidWord");
            if (z) {
                this.f231189i = true;
            }
        }
        if (contentValues.containsKey("bankName")) {
            this.field_bankName = contentValues.getAsString("bankName");
            if (z) {
                this.f231190j = true;
            }
        }
        if (contentValues.containsKey("bankcardType")) {
            this.field_bankcardType = contentValues.getAsString("bankcardType");
            if (z) {
                this.f231191n = true;
            }
        }
        if (contentValues.containsKey("bankcardTypeName")) {
            this.field_bankcardTypeName = contentValues.getAsString("bankcardTypeName");
            if (z) {
                this.f231192o = true;
            }
        }
        if (contentValues.containsKey("bankcardTag")) {
            this.field_bankcardTag = contentValues.getAsInteger("bankcardTag").intValue();
            if (z) {
                this.f231193p = true;
            }
        }
        if (contentValues.containsKey("bankcardTail")) {
            this.field_bankcardTail = contentValues.getAsString("bankcardTail");
            if (z) {
                this.f231195q = true;
            }
        }
        if (contentValues.containsKey("supportTag")) {
            this.field_supportTag = contentValues.getAsInteger("supportTag").intValue();
            if (z) {
                this.f231196r = true;
            }
        }
        if (contentValues.containsKey("mobile")) {
            this.field_mobile = contentValues.getAsString("mobile");
            if (z) {
                this.f231197s = true;
            }
        }
        if (contentValues.containsKey("trueName")) {
            this.field_trueName = contentValues.getAsString("trueName");
            if (z) {
                this.f231198t = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z) {
                this.f231199u = true;
            }
        }
        if (contentValues.containsKey("bankPhone")) {
            this.field_bankPhone = contentValues.getAsString("bankPhone");
            if (z) {
                this.f231200v = true;
            }
        }
        if (contentValues.containsKey("bizUsername")) {
            this.field_bizUsername = contentValues.getAsString("bizUsername");
            if (z) {
                this.f231201w = true;
            }
        }
        if (contentValues.containsKey("onceQuotaKind")) {
            this.field_onceQuotaKind = contentValues.getAsDouble("onceQuotaKind").doubleValue();
            if (z) {
                this.f231202x = true;
            }
        }
        if (contentValues.containsKey("onceQuotaVirtual")) {
            this.field_onceQuotaVirtual = contentValues.getAsDouble("onceQuotaVirtual").doubleValue();
            if (z) {
                this.f231204y = true;
            }
        }
        if (contentValues.containsKey("dayQuotaKind")) {
            this.field_dayQuotaKind = contentValues.getAsDouble("dayQuotaKind").doubleValue();
            if (z) {
                this.f231206z = true;
            }
        }
        if (contentValues.containsKey("dayQuotaVirtual")) {
            this.field_dayQuotaVirtual = contentValues.getAsDouble("dayQuotaVirtual").doubleValue();
            if (z) {
                this.f231151A = true;
            }
        }
        if (contentValues.containsKey("fetchArriveTime")) {
            this.field_fetchArriveTime = contentValues.getAsLong("fetchArriveTime").longValue();
            if (z) {
                this.f231152B = true;
            }
        }
        if (contentValues.containsKey("fetchArriveTimeWording")) {
            this.field_fetchArriveTimeWording = contentValues.getAsString("fetchArriveTimeWording");
            if (z) {
                this.f231153C = true;
            }
        }
        if (contentValues.containsKey("repay_url")) {
            this.field_repay_url = contentValues.getAsString("repay_url");
            if (z) {
                this.f231154D = true;
            }
        }
        if (contentValues.containsKey("wxcreditState")) {
            this.field_wxcreditState = contentValues.getAsInteger("wxcreditState").intValue();
            if (z) {
                this.f231155E = true;
            }
        }
        if (contentValues.containsKey("bankcardClientType")) {
            this.field_bankcardClientType = contentValues.getAsInteger("bankcardClientType").intValue();
            if (z) {
                this.f231156F = true;
            }
        }
        if (contentValues.containsKey("ext_msg")) {
            this.field_ext_msg = contentValues.getAsString("ext_msg");
            if (z) {
                this.f231157G = true;
            }
        }
        if (contentValues.containsKey("support_micropay")) {
            this.field_support_micropay = contentValues.getAsInteger("support_micropay").intValue() != 0;
            if (z) {
                this.f231158H = true;
            }
        }
        if (contentValues.containsKey("arrive_type")) {
            this.field_arrive_type = contentValues.getAsString("arrive_type");
            if (z) {
                this.f231159I = true;
            }
        }
        if (contentValues.containsKey("avail_save_wording")) {
            this.field_avail_save_wording = contentValues.getAsString("avail_save_wording");
            if (z) {
                this.f231160J = true;
            }
        }
        if (contentValues.containsKey("fetch_charge_rate")) {
            this.field_fetch_charge_rate = contentValues.getAsDouble("fetch_charge_rate").doubleValue();
            if (z) {
                this.f231161K = true;
            }
        }
        if (contentValues.containsKey("full_fetch_charge_fee")) {
            this.field_full_fetch_charge_fee = contentValues.getAsDouble("full_fetch_charge_fee").doubleValue();
            if (z) {
                this.f231162L = true;
            }
        }
        if (contentValues.containsKey("fetch_charge_info")) {
            this.field_fetch_charge_info = contentValues.getAsString("fetch_charge_info");
            if (z) {
                this.f231163M = true;
            }
        }
        if (contentValues.containsKey("tips")) {
            this.field_tips = contentValues.getAsString("tips");
            if (z) {
                this.f231164N = true;
            }
        }
        if (contentValues.containsKey("forbid_title")) {
            this.field_forbid_title = contentValues.getAsString("forbid_title");
            if (z) {
                this.f231165P = true;
            }
        }
        if (contentValues.containsKey("forbid_url")) {
            this.field_forbid_url = contentValues.getAsString("forbid_url");
            if (z) {
                this.f231166Q = true;
            }
        }
        if (contentValues.containsKey("no_micro_word")) {
            this.field_no_micro_word = contentValues.getAsString("no_micro_word");
            if (z) {
                this.f231168R = true;
            }
        }
        if (contentValues.containsKey("card_bottom_wording")) {
            this.field_card_bottom_wording = contentValues.getAsString("card_bottom_wording");
            if (z) {
                this.f231170S = true;
            }
        }
        if (contentValues.containsKey("support_lqt_turn_in")) {
            this.field_support_lqt_turn_in = contentValues.getAsInteger("support_lqt_turn_in").intValue();
            if (z) {
                this.f231172T = true;
            }
        }
        if (contentValues.containsKey("support_lqt_turn_out")) {
            this.field_support_lqt_turn_out = contentValues.getAsInteger("support_lqt_turn_out").intValue();
            if (z) {
                this.f231174U = true;
            }
        }
        if (contentValues.containsKey("is_hightlight_pre_arrive_time_wording")) {
            this.field_is_hightlight_pre_arrive_time_wording = contentValues.getAsInteger("is_hightlight_pre_arrive_time_wording").intValue();
            if (z) {
                this.f231176V = true;
            }
        }
        if (contentValues.containsKey("card_state_name")) {
            this.field_card_state_name = contentValues.getAsString("card_state_name");
            if (z) {
                this.f231178W = true;
            }
        }
        if (contentValues.containsKey("prompt_info_prompt_text")) {
            this.field_prompt_info_prompt_text = contentValues.getAsString("prompt_info_prompt_text");
            if (z) {
                this.f231180X = true;
            }
        }
        if (contentValues.containsKey("prompt_info_jump_text")) {
            this.field_prompt_info_jump_text = contentValues.getAsString("prompt_info_jump_text");
            if (z) {
                this.f231182Y = true;
            }
        }
        if (contentValues.containsKey("prompt_info_jump_url")) {
            this.field_prompt_info_jump_url = contentValues.getAsString("prompt_info_jump_url");
            if (z) {
                this.f231183Z = true;
            }
        }
        if (contentValues.containsKey("yht_related_bank")) {
            this.field_yht_related_bank = contentValues.getAsString("yht_related_bank");
            if (z) {
                this.f231194p0 = true;
            }
        }
        if (contentValues.containsKey("yht_avail_balance")) {
            this.field_yht_avail_balance = contentValues.getAsLong("yht_avail_balance").longValue();
            if (z) {
                this.f231203x0 = true;
            }
        }
        if (contentValues.containsKey("yht_user_state")) {
            this.field_yht_user_state = contentValues.getAsInteger("yht_user_state").intValue();
            if (z) {
                this.f231205y0 = true;
            }
        }
        if (contentValues.containsKey("yht_system_state")) {
            this.field_yht_system_state = contentValues.getAsInteger("yht_system_state").intValue();
            if (z) {
                this.f231167Q0 = true;
            }
        }
        if (contentValues.containsKey("yht_ext_msg")) {
            this.field_yht_ext_msg = contentValues.getAsString("yht_ext_msg");
            if (z) {
                this.f231169R0 = true;
            }
        }
        if (contentValues.containsKey("minimch_key")) {
            this.field_minimch_key = contentValues.getAsString("minimch_key");
            if (z) {
                this.f231171S0 = true;
            }
        }
        if (contentValues.containsKey("minimch_avail_balance")) {
            this.field_minimch_avail_balance = contentValues.getAsLong("minimch_avail_balance").longValue();
            if (z) {
                this.f231173T0 = true;
            }
        }
        if (contentValues.containsKey("minimch_user_state")) {
            this.field_minimch_user_state = contentValues.getAsInteger("minimch_user_state").intValue();
            if (z) {
                this.f231175U0 = true;
            }
        }
        if (contentValues.containsKey("minimch_system_state")) {
            this.field_minimch_system_state = contentValues.getAsInteger("minimch_system_state").intValue();
            if (z) {
                this.f231177V0 = true;
            }
        }
        if (contentValues.containsKey("minimch_ext_msg")) {
            this.field_minimch_ext_msg = contentValues.getAsString("minimch_ext_msg");
            if (z) {
                this.f231179W0 = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f231181X0 = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
