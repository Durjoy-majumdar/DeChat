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

/* renamed from: xh.t9 */
public class C78825t9 extends IAutoDBItem {

    /* renamed from: N */
    public static final SingleTable f231360N;

    /* renamed from: P */
    public static final String[] f231361P = new String[0];

    /* renamed from: Q */
    public static final int f231362Q = 115802;

    /* renamed from: Q0 */
    public static final int f231363Q0 = 10510349;

    /* renamed from: R */
    public static final int f231364R = -1179758593;

    /* renamed from: R0 */
    public static final int f231365R0 = 1818388308;

    /* renamed from: S */
    public static final int f231366S = 1346963100;

    /* renamed from: S0 */
    public static final int f231367S0 = 138257377;

    /* renamed from: T */
    public static final int f231368T = -7909929;

    /* renamed from: T0 */
    public static final int f231369T0 = -462723920;

    /* renamed from: U */
    public static final int f231370U = 1085559891;

    /* renamed from: U0 */
    public static final int f231371U0 = -1073530192;

    /* renamed from: V */
    public static final int f231372V = 1818590211;

    /* renamed from: V0 */
    public static final int f231373V0 = -1239345283;

    /* renamed from: W */
    public static final int f231374W = -1159422514;

    /* renamed from: W0 */
    public static final int f231375W0 = 1666715772;

    /* renamed from: X */
    public static final int f231376X = 1968205169;

    /* renamed from: X0 */
    public static final int f231377X0 = 183903685;

    /* renamed from: Y */
    public static final int f231378Y = 780070806;

    /* renamed from: Y0 */
    public static final int f231379Y0 = -2068270970;

    /* renamed from: Z */
    public static final int f231380Z = -1838549635;

    /* renamed from: Z0 */
    public static final int f231381Z0 = -1434555678;

    /* renamed from: a1 */
    public static final int f231382a1 = 667884471;

    /* renamed from: b1 */
    public static final int f231383b1 = 1215761851;

    /* renamed from: c1 */
    public static final int f231384c1 = -1346725061;

    /* renamed from: d1 */
    public static final int f231385d1 = -112192032;

    /* renamed from: e1 */
    public static final int f231386e1 = -167932839;

    /* renamed from: f1 */
    public static final int f231387f1 = 224192583;

    /* renamed from: g1 */
    public static final int f231388g1 = 1971282070;

    /* renamed from: h1 */
    public static final int f231389h1 = 2040508524;

    /* renamed from: i1 */
    public static final int f231390i1 = -1501908290;

    /* renamed from: j1 */
    public static final int f231391j1 = 956376890;

    /* renamed from: k1 */
    public static final int f231392k1 = 108705909;

    /* renamed from: l1 */
    public static final IAutoDBItem.MAutoDBInfo f231393l1 = initAutoDBInfo(C78825t9.class);

    /* renamed from: m1 */
    public static final StorageObserverOwner<C78825t9> f231394m1 = new StorageObserverOwner<>();

    /* renamed from: p0 */
    public static final int f231395p0 = 2086005396;

    /* renamed from: x0 */
    public static final int f231396x0 = -1297525953;

    /* renamed from: y0 */
    public static final int f231397y0 = 1599674422;

    /* renamed from: A */
    public boolean f231398A = true;

    /* renamed from: B */
    public boolean f231399B = true;

    /* renamed from: C */
    public boolean f231400C = true;

    /* renamed from: D */
    public boolean f231401D = true;

    /* renamed from: E */
    public boolean f231402E = true;

    /* renamed from: F */
    public boolean f231403F = true;

    /* renamed from: G */
    public boolean f231404G = true;

    /* renamed from: H */
    public boolean f231405H = true;

    /* renamed from: I */
    public boolean f231406I = true;

    /* renamed from: J */
    public boolean f231407J = true;

    /* renamed from: K */
    public boolean f231408K = true;

    /* renamed from: L */
    public boolean f231409L = true;

    /* renamed from: M */
    public boolean f231410M = true;

    /* renamed from: d */
    public boolean f231411d = true;

    /* renamed from: e */
    public boolean f231412e = true;

    /* renamed from: f */
    public boolean f231413f = true;
    public int field_authen_account_type;
    public String field_bank_priority;
    public int field_card_num;
    public String field_cre_name;
    public int field_cre_type;
    public String field_find_passwd_url;
    public String field_forget_passwd_url;
    public String field_ftf_pay_url;
    public boolean field_isDomesticUser;
    public int field_is_open_lqb;
    public int field_is_open_touch;
    public int field_is_reg;
    public int field_is_show_lqb;
    public String field_lct_url;
    public String field_lct_wording;
    public String field_lqb_open_url;
    public String field_lqt_cell_icon;
    public int field_lqt_cell_is_open_lqt;
    public int field_lqt_cell_is_show;
    public String field_lqt_cell_lqt_open_url;
    public String field_lqt_cell_lqt_title;
    public String field_lqt_cell_lqt_wording;
    public int field_lqt_state;
    public String field_main_card_bind_serialno;
    public int field_paymenu_use_new;
    public String field_reset_passwd_flag;
    public int field_soter_pay_open_type;
    public int field_switchConfig;
    public String field_true_name;
    public String field_uin;
    public int field_unipay_order_state;
    public long field_wallet_balance;
    public int field_wallet_entrance_balance_switch_state;

    /* renamed from: g */
    public boolean f231414g = true;

    /* renamed from: h */
    public boolean f231415h = true;

    /* renamed from: i */
    public boolean f231416i = true;

    /* renamed from: j */
    public boolean f231417j = true;

    /* renamed from: n */
    public boolean f231418n = true;

    /* renamed from: o */
    public boolean f231419o = true;

    /* renamed from: p */
    public boolean f231420p = true;

    /* renamed from: q */
    public boolean f231421q = true;

    /* renamed from: r */
    public boolean f231422r = true;

    /* renamed from: s */
    public boolean f231423s = true;

    /* renamed from: t */
    public boolean f231424t = true;

    /* renamed from: u */
    public boolean f231425u = true;

    /* renamed from: v */
    public boolean f231426v = true;

    /* renamed from: w */
    public boolean f231427w = true;

    /* renamed from: x */
    public boolean f231428x = true;

    /* renamed from: y */
    public boolean f231429y = true;

    /* renamed from: z */
    public boolean f231430z = true;

    static {
        SingleTable singleTable = new SingleTable("WalletUserInfo");
        f231360N = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("uin", "string", singleTable.getName(), "");
        new Column("is_reg", "int", singleTable.getName(), "");
        new Column("true_name", "string", singleTable.getName(), "");
        new Column("card_num", "int", singleTable.getName(), "");
        new Column("isDomesticUser", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("cre_type", "int", singleTable.getName(), "");
        new Column("main_card_bind_serialno", "string", singleTable.getName(), "");
        new Column("ftf_pay_url", "string", singleTable.getName(), "");
        new Column("switchConfig", "int", singleTable.getName(), "");
        new Column("reset_passwd_flag", "string", singleTable.getName(), "");
        new Column("find_passwd_url", "string", singleTable.getName(), "");
        new Column("is_open_touch", "int", singleTable.getName(), "");
        new Column("lct_wording", "string", singleTable.getName(), "");
        new Column("lct_url", "string", singleTable.getName(), "");
        new Column("cre_name", "string", singleTable.getName(), "");
        new Column("lqt_state", "int", singleTable.getName(), "");
        new Column("paymenu_use_new", "int", singleTable.getName(), "");
        new Column("is_show_lqb", "int", singleTable.getName(), "");
        new Column("is_open_lqb", "int", singleTable.getName(), "");
        new Column("lqb_open_url", "string", singleTable.getName(), "");
        new Column("lqt_cell_is_show", "int", singleTable.getName(), "");
        new Column("lqt_cell_icon", "string", singleTable.getName(), "");
        new Column("lqt_cell_is_open_lqt", "int", singleTable.getName(), "");
        new Column("lqt_cell_lqt_open_url", "string", singleTable.getName(), "");
        new Column("lqt_cell_lqt_title", "string", singleTable.getName(), "");
        new Column("lqt_cell_lqt_wording", "string", singleTable.getName(), "");
        new Column("forget_passwd_url", "string", singleTable.getName(), "");
        new Column("unipay_order_state", "int", singleTable.getName(), "");
        new Column("bank_priority", "string", singleTable.getName(), "");
        new Column("wallet_balance", "long", singleTable.getName(), "");
        new Column("wallet_entrance_balance_switch_state", "int", singleTable.getName(), "");
        new Column("soter_pay_open_type", "int", singleTable.getName(), "");
        new Column("authen_account_type", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[33];
        String[] strArr = new String[34];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "uin";
        mAutoDBInfo.colsMap.put("uin", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "uin";
        mAutoDBInfo.columns[1] = "is_reg";
        mAutoDBInfo.colsMap.put("is_reg", "INTEGER");
        mAutoDBInfo.columns[2] = "true_name";
        mAutoDBInfo.colsMap.put("true_name", "TEXT");
        mAutoDBInfo.columns[3] = "card_num";
        mAutoDBInfo.colsMap.put("card_num", "INTEGER");
        mAutoDBInfo.columns[4] = "isDomesticUser";
        mAutoDBInfo.colsMap.put("isDomesticUser", "INTEGER");
        mAutoDBInfo.columns[5] = "cre_type";
        mAutoDBInfo.colsMap.put("cre_type", "INTEGER");
        mAutoDBInfo.columns[6] = "main_card_bind_serialno";
        mAutoDBInfo.colsMap.put("main_card_bind_serialno", "TEXT");
        mAutoDBInfo.columns[7] = "ftf_pay_url";
        mAutoDBInfo.colsMap.put("ftf_pay_url", "TEXT");
        mAutoDBInfo.columns[8] = "switchConfig";
        mAutoDBInfo.colsMap.put("switchConfig", "INTEGER");
        mAutoDBInfo.columns[9] = "reset_passwd_flag";
        mAutoDBInfo.colsMap.put("reset_passwd_flag", "TEXT");
        mAutoDBInfo.columns[10] = "find_passwd_url";
        mAutoDBInfo.colsMap.put("find_passwd_url", "TEXT");
        mAutoDBInfo.columns[11] = "is_open_touch";
        mAutoDBInfo.colsMap.put("is_open_touch", "INTEGER");
        mAutoDBInfo.columns[12] = "lct_wording";
        mAutoDBInfo.colsMap.put("lct_wording", "TEXT");
        mAutoDBInfo.columns[13] = "lct_url";
        mAutoDBInfo.colsMap.put("lct_url", "TEXT");
        mAutoDBInfo.columns[14] = "cre_name";
        mAutoDBInfo.colsMap.put("cre_name", "TEXT");
        mAutoDBInfo.columns[15] = "lqt_state";
        mAutoDBInfo.colsMap.put("lqt_state", "INTEGER");
        mAutoDBInfo.columns[16] = "paymenu_use_new";
        mAutoDBInfo.colsMap.put("paymenu_use_new", "INTEGER");
        mAutoDBInfo.columns[17] = "is_show_lqb";
        mAutoDBInfo.colsMap.put("is_show_lqb", "INTEGER");
        mAutoDBInfo.columns[18] = "is_open_lqb";
        mAutoDBInfo.colsMap.put("is_open_lqb", "INTEGER");
        mAutoDBInfo.columns[19] = "lqb_open_url";
        mAutoDBInfo.colsMap.put("lqb_open_url", "TEXT");
        mAutoDBInfo.columns[20] = "lqt_cell_is_show";
        mAutoDBInfo.colsMap.put("lqt_cell_is_show", "INTEGER");
        mAutoDBInfo.columns[21] = "lqt_cell_icon";
        mAutoDBInfo.colsMap.put("lqt_cell_icon", "TEXT");
        mAutoDBInfo.columns[22] = "lqt_cell_is_open_lqt";
        mAutoDBInfo.colsMap.put("lqt_cell_is_open_lqt", "INTEGER");
        mAutoDBInfo.columns[23] = "lqt_cell_lqt_open_url";
        mAutoDBInfo.colsMap.put("lqt_cell_lqt_open_url", "TEXT");
        mAutoDBInfo.columns[24] = "lqt_cell_lqt_title";
        mAutoDBInfo.colsMap.put("lqt_cell_lqt_title", "TEXT");
        mAutoDBInfo.columns[25] = "lqt_cell_lqt_wording";
        mAutoDBInfo.colsMap.put("lqt_cell_lqt_wording", "TEXT");
        mAutoDBInfo.columns[26] = "forget_passwd_url";
        mAutoDBInfo.colsMap.put("forget_passwd_url", "TEXT");
        mAutoDBInfo.columns[27] = "unipay_order_state";
        mAutoDBInfo.colsMap.put("unipay_order_state", "INTEGER");
        mAutoDBInfo.columns[28] = "bank_priority";
        mAutoDBInfo.colsMap.put("bank_priority", "TEXT");
        mAutoDBInfo.columns[29] = "wallet_balance";
        mAutoDBInfo.colsMap.put("wallet_balance", "LONG");
        mAutoDBInfo.columns[30] = "wallet_entrance_balance_switch_state";
        mAutoDBInfo.colsMap.put("wallet_entrance_balance_switch_state", "INTEGER");
        mAutoDBInfo.columns[31] = "soter_pay_open_type";
        mAutoDBInfo.colsMap.put("soter_pay_open_type", "INTEGER");
        mAutoDBInfo.columns[32] = "authen_account_type";
        mAutoDBInfo.colsMap.put("authen_account_type", "INTEGER default '-1' ");
        mAutoDBInfo.columns[33] = "rowid";
        mAutoDBInfo.sql = " uin TEXT PRIMARY KEY ,  is_reg INTEGER,  true_name TEXT,  card_num INTEGER,  isDomesticUser INTEGER,  cre_type INTEGER,  main_card_bind_serialno TEXT,  ftf_pay_url TEXT,  switchConfig INTEGER,  reset_passwd_flag TEXT,  find_passwd_url TEXT,  is_open_touch INTEGER,  lct_wording TEXT,  lct_url TEXT,  cre_name TEXT,  lqt_state INTEGER,  paymenu_use_new INTEGER,  is_show_lqb INTEGER,  is_open_lqb INTEGER,  lqb_open_url TEXT,  lqt_cell_is_show INTEGER,  lqt_cell_icon TEXT,  lqt_cell_is_open_lqt INTEGER,  lqt_cell_lqt_open_url TEXT,  lqt_cell_lqt_title TEXT,  lqt_cell_lqt_wording TEXT,  forget_passwd_url TEXT,  unipay_order_state INTEGER,  bank_priority TEXT,  wallet_balance LONG,  wallet_entrance_balance_switch_state INTEGER,  soter_pay_open_type INTEGER,  authen_account_type INTEGER default '-1' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78825t9)) {
            return false;
        }
        C78825t9 t9Var = (C78825t9) iAutoDBItem;
        return C46238a.m51546a(this.field_uin, t9Var.field_uin) && C46238a.m51546a(Integer.valueOf(this.field_is_reg), Integer.valueOf(t9Var.field_is_reg)) && C46238a.m51546a(this.field_true_name, t9Var.field_true_name) && C46238a.m51546a(Integer.valueOf(this.field_card_num), Integer.valueOf(t9Var.field_card_num)) && C46238a.m51546a(Boolean.valueOf(this.field_isDomesticUser), Boolean.valueOf(t9Var.field_isDomesticUser)) && C46238a.m51546a(Integer.valueOf(this.field_cre_type), Integer.valueOf(t9Var.field_cre_type)) && C46238a.m51546a(this.field_main_card_bind_serialno, t9Var.field_main_card_bind_serialno) && C46238a.m51546a(this.field_ftf_pay_url, t9Var.field_ftf_pay_url) && C46238a.m51546a(Integer.valueOf(this.field_switchConfig), Integer.valueOf(t9Var.field_switchConfig)) && C46238a.m51546a(this.field_reset_passwd_flag, t9Var.field_reset_passwd_flag) && C46238a.m51546a(this.field_find_passwd_url, t9Var.field_find_passwd_url) && C46238a.m51546a(Integer.valueOf(this.field_is_open_touch), Integer.valueOf(t9Var.field_is_open_touch)) && C46238a.m51546a(this.field_lct_wording, t9Var.field_lct_wording) && C46238a.m51546a(this.field_lct_url, t9Var.field_lct_url) && C46238a.m51546a(this.field_cre_name, t9Var.field_cre_name) && C46238a.m51546a(Integer.valueOf(this.field_lqt_state), Integer.valueOf(t9Var.field_lqt_state)) && C46238a.m51546a(Integer.valueOf(this.field_paymenu_use_new), Integer.valueOf(t9Var.field_paymenu_use_new)) && C46238a.m51546a(Integer.valueOf(this.field_is_show_lqb), Integer.valueOf(t9Var.field_is_show_lqb)) && C46238a.m51546a(Integer.valueOf(this.field_is_open_lqb), Integer.valueOf(t9Var.field_is_open_lqb)) && C46238a.m51546a(this.field_lqb_open_url, t9Var.field_lqb_open_url) && C46238a.m51546a(Integer.valueOf(this.field_lqt_cell_is_show), Integer.valueOf(t9Var.field_lqt_cell_is_show)) && C46238a.m51546a(this.field_lqt_cell_icon, t9Var.field_lqt_cell_icon) && C46238a.m51546a(Integer.valueOf(this.field_lqt_cell_is_open_lqt), Integer.valueOf(t9Var.field_lqt_cell_is_open_lqt)) && C46238a.m51546a(this.field_lqt_cell_lqt_open_url, t9Var.field_lqt_cell_lqt_open_url) && C46238a.m51546a(this.field_lqt_cell_lqt_title, t9Var.field_lqt_cell_lqt_title) && C46238a.m51546a(this.field_lqt_cell_lqt_wording, t9Var.field_lqt_cell_lqt_wording) && C46238a.m51546a(this.field_forget_passwd_url, t9Var.field_forget_passwd_url) && C46238a.m51546a(Integer.valueOf(this.field_unipay_order_state), Integer.valueOf(t9Var.field_unipay_order_state)) && C46238a.m51546a(this.field_bank_priority, t9Var.field_bank_priority) && C46238a.m51546a(Long.valueOf(this.field_wallet_balance), Long.valueOf(t9Var.field_wallet_balance)) && C46238a.m51546a(Integer.valueOf(this.field_wallet_entrance_balance_switch_state), Integer.valueOf(t9Var.field_wallet_entrance_balance_switch_state)) && C46238a.m51546a(Integer.valueOf(this.field_soter_pay_open_type), Integer.valueOf(t9Var.field_soter_pay_open_type)) && C46238a.m51546a(Integer.valueOf(this.field_authen_account_type), Integer.valueOf(t9Var.field_authen_account_type));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231362Q == hashCode) {
                    try {
                        this.field_uin = cursor.getString(i);
                        this.f231411d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231364R == hashCode) {
                    try {
                        this.field_is_reg = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231366S == hashCode) {
                    try {
                        this.field_true_name = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231368T == hashCode) {
                    try {
                        this.field_card_num = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231370U == hashCode) {
                    try {
                        this.field_isDomesticUser = cursor.getInt(i) != 0;
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231372V == hashCode) {
                    try {
                        this.field_cre_type = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231374W == hashCode) {
                    try {
                        this.field_main_card_bind_serialno = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231376X == hashCode) {
                    try {
                        this.field_ftf_pay_url = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231378Y == hashCode) {
                    try {
                        this.field_switchConfig = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231380Z == hashCode) {
                    try {
                        this.field_reset_passwd_flag = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231395p0 == hashCode) {
                    try {
                        this.field_find_passwd_url = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231396x0 == hashCode) {
                    try {
                        this.field_is_open_touch = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231397y0 == hashCode) {
                    try {
                        this.field_lct_wording = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231363Q0 == hashCode) {
                    try {
                        this.field_lct_url = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231365R0 == hashCode) {
                    try {
                        this.field_cre_name = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231367S0 == hashCode) {
                    try {
                        this.field_lqt_state = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231369T0 == hashCode) {
                    try {
                        this.field_paymenu_use_new = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231371U0 == hashCode) {
                    try {
                        this.field_is_show_lqb = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231373V0 == hashCode) {
                    try {
                        this.field_is_open_lqb = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231375W0 == hashCode) {
                    try {
                        this.field_lqb_open_url = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231377X0 == hashCode) {
                    try {
                        this.field_lqt_cell_is_show = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231379Y0 == hashCode) {
                    try {
                        this.field_lqt_cell_icon = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231381Z0 == hashCode) {
                    try {
                        this.field_lqt_cell_is_open_lqt = cursor.getInt(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231382a1 == hashCode) {
                    try {
                        this.field_lqt_cell_lqt_open_url = cursor.getString(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231383b1 == hashCode) {
                    try {
                        this.field_lqt_cell_lqt_title = cursor.getString(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231384c1 == hashCode) {
                    try {
                        this.field_lqt_cell_lqt_wording = cursor.getString(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231385d1 == hashCode) {
                    try {
                        this.field_forget_passwd_url = cursor.getString(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231386e1 == hashCode) {
                    try {
                        this.field_unipay_order_state = cursor.getInt(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231387f1 == hashCode) {
                    try {
                        this.field_bank_priority = cursor.getString(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231388g1 == hashCode) {
                    try {
                        this.field_wallet_balance = cursor.getLong(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231389h1 == hashCode) {
                    try {
                        this.field_wallet_entrance_balance_switch_state = cursor.getInt(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231390i1 == hashCode) {
                    try {
                        this.field_soter_pay_open_type = cursor.getInt(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231391j1 == hashCode) {
                    try {
                        this.field_authen_account_type = cursor.getInt(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletUserInfo", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231392k1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231411d) {
            contentValues.put("uin", this.field_uin);
        }
        if (this.f231412e) {
            contentValues.put("is_reg", Integer.valueOf(this.field_is_reg));
        }
        if (this.f231413f) {
            contentValues.put("true_name", this.field_true_name);
        }
        if (this.f231414g) {
            contentValues.put("card_num", Integer.valueOf(this.field_card_num));
        }
        if (this.f231415h) {
            if (this.field_isDomesticUser) {
                contentValues.put("isDomesticUser", 1);
            } else {
                contentValues.put("isDomesticUser", 0);
            }
        }
        if (this.f231416i) {
            contentValues.put("cre_type", Integer.valueOf(this.field_cre_type));
        }
        if (this.f231417j) {
            contentValues.put("main_card_bind_serialno", this.field_main_card_bind_serialno);
        }
        if (this.f231418n) {
            contentValues.put("ftf_pay_url", this.field_ftf_pay_url);
        }
        if (this.f231419o) {
            contentValues.put("switchConfig", Integer.valueOf(this.field_switchConfig));
        }
        if (this.f231420p) {
            contentValues.put("reset_passwd_flag", this.field_reset_passwd_flag);
        }
        if (this.f231421q) {
            contentValues.put("find_passwd_url", this.field_find_passwd_url);
        }
        if (this.f231422r) {
            contentValues.put("is_open_touch", Integer.valueOf(this.field_is_open_touch));
        }
        if (this.f231423s) {
            contentValues.put("lct_wording", this.field_lct_wording);
        }
        if (this.f231424t) {
            contentValues.put("lct_url", this.field_lct_url);
        }
        if (this.f231425u) {
            contentValues.put("cre_name", this.field_cre_name);
        }
        if (this.f231426v) {
            contentValues.put("lqt_state", Integer.valueOf(this.field_lqt_state));
        }
        if (this.f231427w) {
            contentValues.put("paymenu_use_new", Integer.valueOf(this.field_paymenu_use_new));
        }
        if (this.f231428x) {
            contentValues.put("is_show_lqb", Integer.valueOf(this.field_is_show_lqb));
        }
        if (this.f231429y) {
            contentValues.put("is_open_lqb", Integer.valueOf(this.field_is_open_lqb));
        }
        if (this.f231430z) {
            contentValues.put("lqb_open_url", this.field_lqb_open_url);
        }
        if (this.f231398A) {
            contentValues.put("lqt_cell_is_show", Integer.valueOf(this.field_lqt_cell_is_show));
        }
        if (this.f231399B) {
            contentValues.put("lqt_cell_icon", this.field_lqt_cell_icon);
        }
        if (this.f231400C) {
            contentValues.put("lqt_cell_is_open_lqt", Integer.valueOf(this.field_lqt_cell_is_open_lqt));
        }
        if (this.f231401D) {
            contentValues.put("lqt_cell_lqt_open_url", this.field_lqt_cell_lqt_open_url);
        }
        if (this.f231402E) {
            contentValues.put("lqt_cell_lqt_title", this.field_lqt_cell_lqt_title);
        }
        if (this.f231403F) {
            contentValues.put("lqt_cell_lqt_wording", this.field_lqt_cell_lqt_wording);
        }
        if (this.f231404G) {
            contentValues.put("forget_passwd_url", this.field_forget_passwd_url);
        }
        if (this.f231405H) {
            contentValues.put("unipay_order_state", Integer.valueOf(this.field_unipay_order_state));
        }
        if (this.f231406I) {
            contentValues.put("bank_priority", this.field_bank_priority);
        }
        if (this.f231407J) {
            contentValues.put("wallet_balance", Long.valueOf(this.field_wallet_balance));
        }
        if (this.f231408K) {
            contentValues.put("wallet_entrance_balance_switch_state", Integer.valueOf(this.field_wallet_entrance_balance_switch_state));
        }
        if (this.f231409L) {
            contentValues.put("soter_pay_open_type", Integer.valueOf(this.field_soter_pay_open_type));
        }
        if (this.f231410M) {
            contentValues.put("authen_account_type", Integer.valueOf(this.field_authen_account_type));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWalletUserInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WalletUserInfo ( " + f231393l1.sql + ");");
        for (String add : f231361P) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWalletUserInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WalletUserInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231393l1, "WalletUserInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWalletUserInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WalletUserInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWalletUserInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231393l1;
    }

    public String[] getIndexCreateSQL() {
        return f231361P;
    }

    public StorageObserverOwner<C78825t9> getObserverOwner() {
        return f231394m1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_uin;
    }

    public SingleTable getTable() {
        return f231360N;
    }

    public String getTableName() {
        return f231360N.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("uin")) {
            this.field_uin = contentValues.getAsString("uin");
            if (z) {
                this.f231411d = true;
            }
        }
        if (contentValues.containsKey("is_reg")) {
            this.field_is_reg = contentValues.getAsInteger("is_reg").intValue();
            if (z) {
                this.f231412e = true;
            }
        }
        if (contentValues.containsKey("true_name")) {
            this.field_true_name = contentValues.getAsString("true_name");
            if (z) {
                this.f231413f = true;
            }
        }
        if (contentValues.containsKey("card_num")) {
            this.field_card_num = contentValues.getAsInteger("card_num").intValue();
            if (z) {
                this.f231414g = true;
            }
        }
        if (contentValues.containsKey("isDomesticUser")) {
            this.field_isDomesticUser = contentValues.getAsInteger("isDomesticUser").intValue() != 0;
            if (z) {
                this.f231415h = true;
            }
        }
        if (contentValues.containsKey("cre_type")) {
            this.field_cre_type = contentValues.getAsInteger("cre_type").intValue();
            if (z) {
                this.f231416i = true;
            }
        }
        if (contentValues.containsKey("main_card_bind_serialno")) {
            this.field_main_card_bind_serialno = contentValues.getAsString("main_card_bind_serialno");
            if (z) {
                this.f231417j = true;
            }
        }
        if (contentValues.containsKey("ftf_pay_url")) {
            this.field_ftf_pay_url = contentValues.getAsString("ftf_pay_url");
            if (z) {
                this.f231418n = true;
            }
        }
        if (contentValues.containsKey("switchConfig")) {
            this.field_switchConfig = contentValues.getAsInteger("switchConfig").intValue();
            if (z) {
                this.f231419o = true;
            }
        }
        if (contentValues.containsKey("reset_passwd_flag")) {
            this.field_reset_passwd_flag = contentValues.getAsString("reset_passwd_flag");
            if (z) {
                this.f231420p = true;
            }
        }
        if (contentValues.containsKey("find_passwd_url")) {
            this.field_find_passwd_url = contentValues.getAsString("find_passwd_url");
            if (z) {
                this.f231421q = true;
            }
        }
        if (contentValues.containsKey("is_open_touch")) {
            this.field_is_open_touch = contentValues.getAsInteger("is_open_touch").intValue();
            if (z) {
                this.f231422r = true;
            }
        }
        if (contentValues.containsKey("lct_wording")) {
            this.field_lct_wording = contentValues.getAsString("lct_wording");
            if (z) {
                this.f231423s = true;
            }
        }
        if (contentValues.containsKey("lct_url")) {
            this.field_lct_url = contentValues.getAsString("lct_url");
            if (z) {
                this.f231424t = true;
            }
        }
        if (contentValues.containsKey("cre_name")) {
            this.field_cre_name = contentValues.getAsString("cre_name");
            if (z) {
                this.f231425u = true;
            }
        }
        if (contentValues.containsKey("lqt_state")) {
            this.field_lqt_state = contentValues.getAsInteger("lqt_state").intValue();
            if (z) {
                this.f231426v = true;
            }
        }
        if (contentValues.containsKey("paymenu_use_new")) {
            this.field_paymenu_use_new = contentValues.getAsInteger("paymenu_use_new").intValue();
            if (z) {
                this.f231427w = true;
            }
        }
        if (contentValues.containsKey("is_show_lqb")) {
            this.field_is_show_lqb = contentValues.getAsInteger("is_show_lqb").intValue();
            if (z) {
                this.f231428x = true;
            }
        }
        if (contentValues.containsKey("is_open_lqb")) {
            this.field_is_open_lqb = contentValues.getAsInteger("is_open_lqb").intValue();
            if (z) {
                this.f231429y = true;
            }
        }
        if (contentValues.containsKey("lqb_open_url")) {
            this.field_lqb_open_url = contentValues.getAsString("lqb_open_url");
            if (z) {
                this.f231430z = true;
            }
        }
        if (contentValues.containsKey("lqt_cell_is_show")) {
            this.field_lqt_cell_is_show = contentValues.getAsInteger("lqt_cell_is_show").intValue();
            if (z) {
                this.f231398A = true;
            }
        }
        if (contentValues.containsKey("lqt_cell_icon")) {
            this.field_lqt_cell_icon = contentValues.getAsString("lqt_cell_icon");
            if (z) {
                this.f231399B = true;
            }
        }
        if (contentValues.containsKey("lqt_cell_is_open_lqt")) {
            this.field_lqt_cell_is_open_lqt = contentValues.getAsInteger("lqt_cell_is_open_lqt").intValue();
            if (z) {
                this.f231400C = true;
            }
        }
        if (contentValues.containsKey("lqt_cell_lqt_open_url")) {
            this.field_lqt_cell_lqt_open_url = contentValues.getAsString("lqt_cell_lqt_open_url");
            if (z) {
                this.f231401D = true;
            }
        }
        if (contentValues.containsKey("lqt_cell_lqt_title")) {
            this.field_lqt_cell_lqt_title = contentValues.getAsString("lqt_cell_lqt_title");
            if (z) {
                this.f231402E = true;
            }
        }
        if (contentValues.containsKey("lqt_cell_lqt_wording")) {
            this.field_lqt_cell_lqt_wording = contentValues.getAsString("lqt_cell_lqt_wording");
            if (z) {
                this.f231403F = true;
            }
        }
        if (contentValues.containsKey("forget_passwd_url")) {
            this.field_forget_passwd_url = contentValues.getAsString("forget_passwd_url");
            if (z) {
                this.f231404G = true;
            }
        }
        if (contentValues.containsKey("unipay_order_state")) {
            this.field_unipay_order_state = contentValues.getAsInteger("unipay_order_state").intValue();
            if (z) {
                this.f231405H = true;
            }
        }
        if (contentValues.containsKey("bank_priority")) {
            this.field_bank_priority = contentValues.getAsString("bank_priority");
            if (z) {
                this.f231406I = true;
            }
        }
        if (contentValues.containsKey("wallet_balance")) {
            this.field_wallet_balance = contentValues.getAsLong("wallet_balance").longValue();
            if (z) {
                this.f231407J = true;
            }
        }
        if (contentValues.containsKey("wallet_entrance_balance_switch_state")) {
            this.field_wallet_entrance_balance_switch_state = contentValues.getAsInteger("wallet_entrance_balance_switch_state").intValue();
            if (z) {
                this.f231408K = true;
            }
        }
        if (contentValues.containsKey("soter_pay_open_type")) {
            this.field_soter_pay_open_type = contentValues.getAsInteger("soter_pay_open_type").intValue();
            if (z) {
                this.f231409L = true;
            }
        }
        if (contentValues.containsKey("authen_account_type")) {
            this.field_authen_account_type = contentValues.getAsInteger("authen_account_type").intValue();
            if (z) {
                this.f231410M = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
