package b63;

import android.database.Cursor;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.utils.C72515x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.p137ui.C45128u;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import e63.C75557c;
import e63.C75559d;
import eb0.C75576f4;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import sf0.C90188n0;
import te3.C64485k53;
import te3.C77951j53;

/* renamed from: b63.s0 */
public class C67205s0 {

    /* renamed from: a */
    public ArrayList<Bankcard> f192948a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<Bankcard> f192949b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<Bankcard> f192950c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<Bankcard> f192951d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<Bankcard> f192952e = new ArrayList<>();

    /* renamed from: f */
    public C67203r0 f192953f = null;

    /* renamed from: g */
    public Bankcard f192954g = null;

    /* renamed from: h */
    public Bankcard f192955h = null;

    /* renamed from: i */
    public C67199q0 f192956i = null;

    /* renamed from: j */
    public C28269p f192957j = null;

    /* renamed from: k */
    public C67176b f192958k = null;

    /* renamed from: l */
    public List<C67180c> f192959l = new LinkedList();

    /* renamed from: m */
    public Bankcard f192960m = null;

    /* renamed from: n */
    public C77951j53 f192961n;

    /* renamed from: o */
    public long f192962o = Util.nowSecond();

    /* renamed from: p */
    public long f192963p = 0;

    /* renamed from: q */
    public long f192964q = -1;

    /* renamed from: r */
    public int f192965r = 10000;

    /* renamed from: s */
    public int f192966s = 0;

    /* renamed from: t */
    public String f192967t = "";

    /* renamed from: u */
    public String f192968u = "";

    /* renamed from: b63.s0$a */
    public class C67206a implements C75228t.C45127n {
        public C67206a() {
        }

        /* renamed from: a */
        public void mo70512a(Object obj) {
            if (obj == null || !(obj instanceof Double)) {
                Log.m105924i("MicroMsg.WalletUserInfoManger", "hy: no balance info. set to negative");
                Bankcard bankcard = C67205s0.this.f192955h;
                if (bankcard != null) {
                    bankcard.f209415j2 = -1.0d;
                    return;
                }
                return;
            }
            Double d = (Double) obj;
            if (d.doubleValue() < 0.0d) {
                Log.m105927v("MicroMsg.WalletUserInfoManger", "val is zero %s", Util.getStack().toString());
            }
            Bankcard bankcard2 = C67205s0.this.f192955h;
            if (bankcard2 != null) {
                bankcard2.f209415j2 = d.doubleValue();
            }
        }
    }

    public C67205s0() {
        mo91344z();
    }

    /* renamed from: A */
    public final void mo91311A() {
        Log.m105924i("MicroMsg.WalletUserInfoManger", "recordDataState()");
        if (this.f192953f == null) {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "userInfo == null");
        }
        ArrayList<Bankcard> arrayList = this.f192951d;
        if (arrayList == null) {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "bankcards == null");
        } else if (arrayList.size() == 0) {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "bankcards.size() == 0");
        } else {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "bankcards.size() == " + this.f192951d.size());
        }
        ArrayList<Bankcard> arrayList2 = this.f192952e;
        if (arrayList2 == null) {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "virtualBankcards == null");
        } else if (arrayList2.size() == 0) {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == 0");
        } else {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == " + this.f192952e.size());
        }
        if (this.f192955h == null) {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "balance == null");
        } else {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "balance != null");
        }
        if (this.f192954g == null) {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "historyBankcard == null");
        } else {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "historyBankcard != null");
        }
        if (this.f192957j == null) {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo == null");
        } else {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo != null");
        }
    }

    /* renamed from: B */
    public void mo91312B() {
        C67203r0 r0Var = this.f192953f;
        if (r0Var != null) {
            r0Var.field_is_reg = -1;
            this.f192953f = null;
        }
        if (this.f192956i != null) {
            this.f192956i = null;
        }
        if (this.f192955h != null) {
            this.f192955h = null;
        }
        ArrayList<Bankcard> arrayList = this.f192951d;
        if (arrayList != null) {
            arrayList.clear();
            this.f192951d = null;
        }
        ArrayList<Bankcard> arrayList2 = this.f192952e;
        if (arrayList2 != null) {
            arrayList2.clear();
            this.f192952e = null;
        }
        if (this.f192961n != null) {
            this.f192961n = null;
        }
        this.f192963p = 0;
        C75228t.m90238c(new C75228t.C75239o("wallet_balance_version", -1), new C75228t.C75239o("wallet_balance_last_update_time", -1), new C75228t.C75239o("wallet_balance", -1));
        this.f192962o = Util.nowSecond();
    }

    /* renamed from: C */
    public void mo91313C(C67203r0 r0Var, ArrayList<Bankcard> arrayList, ArrayList<Bankcard> arrayList2, Bankcard bankcard, Bankcard bankcard2, C28269p pVar, C67176b bVar, Bankcard bankcard3, int i, int i2, List<C67180c> list) {
        C67203r0 r0Var2 = r0Var;
        ArrayList<Bankcard> arrayList3 = arrayList;
        ArrayList<Bankcard> arrayList4 = arrayList2;
        Bankcard bankcard4 = bankcard;
        Bankcard bankcard5 = bankcard2;
        C28269p pVar2 = pVar;
        Bankcard bankcard6 = bankcard3;
        int i3 = i2;
        Class cls = C79173v.class;
        Log.m105925i("MicroMsg.WalletUserInfoManger", "setBankcards scene %d", Integer.valueOf(i2));
        if (i3 == 8) {
            this.f192948a = arrayList3;
            this.f192959l = list;
        }
        if (i3 == 24 || i3 == 25) {
            this.f192949b = arrayList3;
        }
        if (i3 == 12) {
            this.f192950c = arrayList3;
        }
        this.f192951d = arrayList3;
        this.f192952e = arrayList4;
        this.f192955h = bankcard4;
        this.f192956i = new C67199q0(r0Var2.field_switchConfig, r0Var2.field_wallet_entrance_balance_switch_state);
        this.f192954g = bankcard5;
        this.f192957j = pVar2;
        this.f192958k = bVar;
        this.f192960m = bankcard6;
        Log.m105924i("MicroMsg.WalletUserInfoManger", "setBankcards()! " + r0Var2.field_switchConfig);
        mo91311A();
        int i4 = i < 0 ? 600 : i;
        this.f192962o = Util.nowSecond() + ((long) i4);
        this.f192963p = Util.nowSecond() + 600;
        Log.m105925i("MicroMsg.WalletUserInfoManger", "hy: cache time: %d, dead time: %d, cacheDeadTime: %s", Integer.valueOf(i4), Long.valueOf(this.f192962o), Long.valueOf(this.f192963p));
        if (i3 == 8 || i3 == 12 || i3 == 26) {
            C75557c wx02 = ((C79173v) C86312j.m106911c(cls)).wx0();
            wx02.getClass();
            wx02.f221976d.execSQL("WalletBankcardScene", "delete from WalletBankcardScene where scene=" + i3 + "");
        } else {
            ((C79173v) C86312j.m106911c(cls)).xx0().f221979d.execSQL("WalletBankcard", "delete from WalletBankcard");
        }
        if (!(i3 == 24 || i3 == 25 || arrayList3 == null)) {
            C72515x.m84851e(arrayList3, i3);
        }
        if (arrayList4 != null) {
            C72515x.m84851e(arrayList4, i3);
        }
        if (bankcard4 != null) {
            C72515x.m84850d(bankcard4, i3);
        }
        if (bankcard5 != null) {
            C72515x.m84850d(bankcard5, i3);
        }
        Bankcard bankcard7 = bankcard3;
        if (bankcard7 != null) {
            C72515x.m84850d(bankcard7, i3);
        }
        mo91318H(r0Var);
        ((C79173v) C86312j.m106911c(cls)).yx0().f84130d.execSQL("LoanEntryInfo", "delete from LoanEntryInfo");
        C28269p pVar3 = pVar;
        if (pVar3 != null) {
            ((C79173v) C86312j.m106911c(cls)).yx0().insert(pVar3);
        }
    }

    /* renamed from: D */
    public void mo91314D(String str) {
        if (!Util.isNullOrNil(str)) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(196612, str);
        }
    }

    /* renamed from: E */
    public void mo91315E(String str) {
        Log.m105925i("MicroMsg.WalletUserInfoManger", "setSelectBindSerial %s %s", str, Util.getStack().toString());
        if (str != null) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(196633, str);
        }
    }

    /* renamed from: F */
    public void mo91316F(C77951j53 j532) {
        String str;
        this.f192961n = j532;
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_OFFLINE_GUIDE_BAR_CONFIG_STRING_SYNC;
        if (j532 != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("guide_type", j532.f227645d);
                JSONObject jSONObject2 = new JSONObject();
                C64485k53 k532 = j532.f227646e;
                if (k532 != null) {
                    jSONObject2.put("bind_serial", k532.f183895d);
                }
                jSONObject.put("guide_data", jSONObject2.toString());
                jSONObject.put("is_show_guide", j532.f227647f);
                jSONObject.put("guide_content", j532.f227648g);
                jSONObject.put("guide_content_color", j532.f227649h);
                jSONObject.put("guide_btn_text", j532.f227650i);
                jSONObject.put("guide_btn_text_color", j532.f227651j);
                jSONObject.put("guide_btn_bg_color", j532.f227652n);
                jSONObject.put("guide_logo", j532.f227653o);
                jSONObject.put("background_color", j532.f227654p);
                jSONObject.put("attach_info_left_wording", j532.f227655q);
                jSONObject.put("attach_info_right_wording", j532.f227656r);
                jSONObject.put("btn_jump_mode", j532.f227657s);
                jSONObject.put("btn_jump_h5", j532.f227658t);
                jSONObject.put("btn_jump_tinyapp_username", j532.f227659u);
                jSONObject.put("btn_jump_tinyapp_path", j532.f227660v);
                jSONObject.put("dark_guide_btn_text_color", j532.f227661w);
                jSONObject.put("dark_guide_btn_bg_color", j532.f227662x);
                jSONObject.put("dark_background_color", j532.f227663y);
                str = jSONObject.toString();
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.WalletQueryBankcardParser", "getOfflineGuideBarJSONStr() Exception: %s", e.getMessage());
            }
            i.mo119677K(aVar, str);
        }
        str = "";
        i.mo119677K(aVar, str);
    }

    /* renamed from: G */
    public int mo91317G() {
        C67203r0 r0Var = this.f192953f;
        if (r0Var != null) {
            return r0Var.field_soter_pay_open_type;
        }
        return 0;
    }

    /* renamed from: H */
    public void mo91318H(C67203r0 r0Var) {
        Class cls = C79173v.class;
        this.f192953f = r0Var;
        ((C79173v) C86312j.m106911c(cls)).Dx0().f221987d.execSQL("WalletUserInfo", "delete from WalletUserInfo");
        ((C79173v) C86312j.m106911c(cls)).Dx0().insert(r0Var);
    }

    /* renamed from: a */
    public ArrayList<Bankcard> mo91319a(boolean z) {
        ArrayList<Bankcard> arrayList = new ArrayList<>();
        if (z) {
            if (this.f192955h != null && !mo91343y()) {
                arrayList.add(this.f192955h);
            }
            if (this.f192960m != null && !mo91343y()) {
                arrayList.add(this.f192960m);
            }
        }
        ArrayList<Bankcard> arrayList2 = this.f192951d;
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator<Bankcard> it = this.f192951d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public ArrayList<Bankcard> mo91320b(boolean z) {
        if (this.f192948a == null) {
            return null;
        }
        ArrayList<Bankcard> arrayList = new ArrayList<>();
        if (z) {
            if (this.f192955h != null && !mo91343y()) {
                arrayList.add(this.f192955h);
            }
            if (this.f192960m != null && !mo91343y()) {
                arrayList.add(this.f192960m);
            }
        }
        if (this.f192948a.size() > 0) {
            Iterator<Bankcard> it = this.f192948a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public ArrayList<Bankcard> mo91321c(boolean z) {
        ArrayList<Bankcard> arrayList = new ArrayList<>();
        if (z) {
            if (this.f192955h != null && !mo91343y()) {
                arrayList.add(this.f192955h);
            }
            if (this.f192960m != null && !mo91343y()) {
                arrayList.add(this.f192960m);
            }
        }
        ArrayList<Bankcard> arrayList2 = this.f192948a;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            ArrayList<Bankcard> arrayList3 = this.f192951d;
            if (arrayList3 != null && arrayList3.size() > 0) {
                Iterator<Bankcard> it = this.f192951d.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
        } else {
            Iterator<Bankcard> it4 = this.f192948a.iterator();
            while (it4.hasNext()) {
                arrayList.add(it4.next());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public String mo91322d() {
        ArrayList<Bankcard> arrayList = this.f192951d;
        if (arrayList == null || arrayList.size() <= 0) {
            Log.m105920e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
            return null;
        }
        Iterator<Bankcard> it = this.f192951d.iterator();
        if (it.hasNext()) {
            return it.next().field_bindSerial;
        }
        return null;
    }

    /* renamed from: e */
    public Bankcard mo91323e(String str) {
        ArrayList<Bankcard> arrayList = this.f192951d;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<Bankcard> it = this.f192951d.iterator();
            while (it.hasNext()) {
                Bankcard next = it.next();
                if (next.field_bindSerial.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public Bankcard mo91324f(String str) {
        ArrayList<Bankcard> b = mo91320b(true);
        if (Util.isNullOrNil(str) || b == null || b.isEmpty()) {
            return null;
        }
        Iterator<Bankcard> it = b.iterator();
        while (it.hasNext()) {
            Bankcard next = it.next();
            if (next.field_bindSerial.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: g */
    public Bankcard mo91325g(String str, boolean z, boolean z2) {
        Bankcard bankcard;
        Bankcard bankcard2;
        if (z && (bankcard2 = this.f192955h) != null && bankcard2.field_bindSerial.equals(str)) {
            return this.f192955h;
        }
        if (z2 && (bankcard = this.f192960m) != null && bankcard.field_bindSerial.equals(str)) {
            return this.f192960m;
        }
        Log.m105925i("MicroMsg.WalletUserInfoManger", "need get bankcard is ：%s ", str);
        ArrayList<Bankcard> arrayList = this.f192948a;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<Bankcard> it = this.f192948a.iterator();
            while (it.hasNext()) {
                Bankcard next = it.next();
                Log.m105925i("MicroMsg.WalletUserInfoManger", "compared offline offlinebankcards:%s", next.field_bindSerial);
                if (next.field_bindSerial.equals(str)) {
                    return next;
                }
            }
        }
        ArrayList<Bankcard> arrayList2 = this.f192951d;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return null;
        }
        Iterator<Bankcard> it4 = this.f192951d.iterator();
        while (it4.hasNext()) {
            Bankcard next2 = it4.next();
            Log.m105925i("MicroMsg.WalletUserInfoManger", "compared bankcards:%s", next2.field_bindSerial);
            if (next2.field_bindSerial.equals(str)) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: h */
    public ArrayList<Bankcard> mo91326h() {
        ArrayList<Bankcard> arrayList = this.f192951d;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f192951d = ((C79173v) C86312j.m106911c(C79173v.class)).xx0().mo105866jo();
        }
        ArrayList<Bankcard> arrayList2 = this.f192951d;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return null;
        }
        ArrayList<Bankcard> arrayList3 = new ArrayList<>();
        Iterator<Bankcard> it = this.f192951d.iterator();
        while (it.hasNext()) {
            arrayList3.add(it.next());
        }
        return arrayList3;
    }

    /* renamed from: i */
    public void mo91327i(ArrayList<Bankcard> arrayList, ArrayList<Bankcard> arrayList2) {
        if (arrayList == null || arrayList2 == null) {
            Log.m105920e("MicroMsg.WalletUserInfoManger", "error list,bankcardsClone == null || virtualBankcardsClone == null");
            return;
        }
        if (this.f192950c == null && this.f192951d != null) {
            Log.m105920e("MicroMsg.WalletUserInfoManger", "listManageUIbankcards == null && bankcards != null");
            this.f192950c = this.f192951d;
        }
        if (this.f192950c == null) {
            Log.m105920e("MicroMsg.WalletUserInfoManger", "error list, listManageUIbankcards == null");
            return;
        }
        arrayList.clear();
        arrayList2.clear();
        ArrayList<Bankcard> arrayList3 = this.f192950c;
        if (arrayList3 != null) {
            Iterator<Bankcard> it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        ArrayList<Bankcard> arrayList4 = this.f192952e;
        if (arrayList4 != null) {
            Iterator<Bankcard> it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                Bankcard next = it4.next();
                if (next.field_wxcreditState == 0) {
                    arrayList2.add(next);
                } else {
                    arrayList.add(next);
                }
            }
        }
    }

    /* renamed from: j */
    public ArrayList<Bankcard> mo91328j() {
        ArrayList<Bankcard> arrayList = this.f192951d;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        ArrayList<Bankcard> arrayList2 = new ArrayList<>();
        Iterator<Bankcard> it = this.f192951d.iterator();
        while (it.hasNext()) {
            Bankcard next = it.next();
            if (!next.mo99389o2() && !next.mo99392r2()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    @Deprecated
    /* renamed from: k */
    public Bankcard mo91329k(ArrayList<Bankcard> arrayList, String str, boolean z, boolean z2) {
        return mo91330l(arrayList, str, z, z2, false);
    }

    /* renamed from: l */
    public Bankcard mo91330l(ArrayList<Bankcard> arrayList, String str, boolean z, boolean z2, boolean z3) {
        C67203r0 r0Var;
        if (arrayList == null) {
            arrayList = this.f192951d;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "bindSerial is null ");
            C86709a0.m107528h();
            str = (String) C86709a0.m107535s().mo121142i().mo119684e(196612, (Object) null);
        }
        Log.m105925i("MicroMsg.WalletUserInfoManger", "getDefaultRecommendBankcard bindSerial:%s", str);
        if (z && this.f192955h != null) {
            if (mo91342x()) {
                return this.f192955h;
            }
            if (str != null && str.equals(this.f192955h.field_bindSerial)) {
                return this.f192955h;
            }
            Bankcard bankcard = this.f192960m;
            if (bankcard != null && (r0Var = this.f192953f) != null && r0Var.field_lqt_state == 1 && str != null && str.equals(bankcard.field_bindSerial)) {
                return this.f192960m;
            }
            if (!mo91343y() && (arrayList == null || arrayList.size() == 0)) {
                return this.f192955h;
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            Log.m105920e("MicroMsg.WalletUserInfoManger", "return not found bankcard!");
            return null;
        } else if (arrayList.size() != 1 || !z2) {
            Log.m105924i("MicroMsg.WalletUserInfoManger", "have multiple bankcards!");
            if (!Util.isNullOrNil(str)) {
                Iterator<Bankcard> it = arrayList.iterator();
                while (it.hasNext()) {
                    Bankcard next = it.next();
                    Log.m105925i("MicroMsg.WalletUserInfoManger", "bankcard serial ：%s，title :%s", next.field_bindSerial, next.field_forbid_title);
                    if (str.equals(next.field_bindSerial)) {
                        if (!z3 || !next.mo99392r2()) {
                            Log.m105925i("MicroMsg.WalletUserInfoManger", "return bankcard:%s", next.field_bindSerial);
                            return next;
                        }
                        Log.m105924i("MicroMsg.WalletUserInfoManger", "default card is honeypay");
                        if (!z || this.f192955h == null) {
                            Iterator<Bankcard> it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                Bankcard next2 = it4.next();
                                if (!next2.mo99392r2()) {
                                    Log.m105925i("MicroMsg.WalletUserInfoManger", "return bankcard1:%s", next2.field_bindSerial);
                                    return next2;
                                }
                            }
                            continue;
                        } else {
                            Log.m105924i("MicroMsg.WalletUserInfoManger", "return balance");
                            return this.f192955h;
                        }
                    }
                }
            }
            if (!z2) {
                return null;
            }
            Log.m105925i("MicroMsg.WalletUserInfoManger", "return bankcardList.get(0):%s", arrayList.get(0).field_bindSerial);
            return arrayList.get(0);
        } else {
            Log.m105921e("MicroMsg.WalletUserInfoManger", "return only one bankcard：%s", arrayList.get(0).field_bindSerial);
            return arrayList.get(0);
        }
    }

    /* renamed from: m */
    public String mo91331m() {
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_LQT_ENTRY_WORDING_STRING_SYNC, (Object) null);
        if (!Util.isNullOrNil(str)) {
            return str;
        }
        C67203r0 r0Var = this.f192953f;
        if (r0Var != null) {
            return r0Var.field_lct_wording;
        }
        return null;
    }

    /* renamed from: n */
    public ArrayList<Bankcard> mo91332n(boolean z) {
        ArrayList<Bankcard> arrayList = new ArrayList<>();
        if (z && this.f192955h != null && !mo91343y()) {
            arrayList.add(this.f192955h);
        }
        ArrayList<Bankcard> arrayList2 = this.f192949b;
        if (!(arrayList2 == null || this.f192951d == null || arrayList2.size() <= 0)) {
            Iterator<Bankcard> it = this.f192949b.iterator();
            while (it.hasNext()) {
                Bankcard next = it.next();
                if (!next.mo99392r2()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public int mo91333o() {
        C67203r0 r0Var = this.f192953f;
        if (r0Var != null) {
            return r0Var.field_cre_type;
        }
        return 1;
    }

    /* renamed from: p */
    public C67199q0 mo91334p() {
        C67199q0 q0Var = this.f192956i;
        return q0Var == null ? new C67199q0() : q0Var;
    }

    /* renamed from: q */
    public String mo91335q() {
        C67203r0 r0Var = this.f192953f;
        if (r0Var != null) {
            return r0Var.field_true_name;
        }
        return null;
    }

    /* renamed from: r */
    public C67203r0 mo91336r() {
        if (this.f192953f == null) {
            this.f192953f = ((C79173v) C86312j.m106911c(C79173v.class)).Dx0().mo105873jo();
        }
        return this.f192953f;
    }

    /* renamed from: s */
    public boolean mo91337s() {
        C67203r0 r0Var = this.f192953f;
        if (r0Var != null) {
            return r0Var.field_is_reg == -1;
        }
    }

    /* renamed from: t */
    public boolean mo91338t() {
        C67203r0 r0Var = this.f192953f;
        return r0Var != null && r0Var.field_isDomesticUser;
    }

    /* renamed from: u */
    public boolean mo91339u() {
        boolean z = C90188n0.f258933a;
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_LQT_OPEN_FLAG_INT_SYNC, -1)).intValue();
        if (intValue != -1) {
            return intValue == 1;
        }
        C67203r0 r0Var = this.f192953f;
        return r0Var != null && r0Var.field_lqt_state == 1;
    }

    /* renamed from: v */
    public boolean mo91340v() {
        C67203r0 r0Var = this.f192953f;
        if (r0Var != null) {
            if (r0Var.field_is_open_touch == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public boolean mo91341w() {
        C67203r0 r0Var = this.f192953f;
        if (r0Var != null) {
            if (r0Var.field_is_reg == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public boolean mo91342x() {
        C67203r0 r0Var = this.f192953f;
        if (r0Var != null) {
            if (r0Var.field_is_reg == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public boolean mo91343y() {
        C67203r0 r0Var = this.f192953f;
        if (r0Var != null) {
            if (r0Var.field_is_reg == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public void mo91344z() {
        Bankcard bankcard;
        Bankcard bankcard2;
        ArrayList<Bankcard> arrayList;
        Bankcard bankcard3;
        C28269p pVar;
        Class cls = C79173v.class;
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105928w("MicroMsg.WalletUserInfoManger", "Account Not Ready!");
            return;
        }
        C67203r0 jo = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo();
        this.f192953f = jo;
        this.f192956i = new C67199q0(jo.field_switchConfig, jo.field_wallet_entrance_balance_switch_state);
        if (!Util.isNullOrNil(this.f192953f.field_bank_priority)) {
            try {
                this.f192959l = C67196n0.m79482i(new JSONObject(this.f192953f.field_bank_priority));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.WalletUserInfoManger", e, "", new Object[0]);
            }
        }
        C75559d xx02 = ((C79173v) C86312j.m106911c(cls)).xx0();
        xx02.getClass();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = Bankcard.f209387V2;
        C77951j53 j532 = null;
        Cursor rawQuery = xx02.f221979d.rawQuery("select * from WalletBankcard where cardType & 8 != 0 ", (String[]) null, 2);
        if (rawQuery == null) {
            bankcard = null;
        } else {
            if (rawQuery.moveToFirst()) {
                bankcard = new Bankcard();
                bankcard.convertFrom(rawQuery);
            } else {
                bankcard = null;
            }
            rawQuery.close();
        }
        this.f192955h = bankcard;
        C75559d xx03 = ((C79173v) C86312j.m106911c(cls)).xx0();
        xx03.getClass();
        Cursor rawQuery2 = xx03.f221979d.rawQuery("select * from WalletBankcard where cardType & 64 != 0 ", (String[]) null, 2);
        if (rawQuery2 == null) {
            bankcard2 = null;
        } else {
            if (rawQuery2.moveToFirst()) {
                bankcard2 = new Bankcard();
                bankcard2.convertFrom(rawQuery2);
            } else {
                bankcard2 = null;
            }
            rawQuery2.close();
        }
        this.f192960m = bankcard2;
        C67206a aVar = new C67206a();
        Pattern pattern = C75228t.f221346a;
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C45128u("wallet_balance", aVar), (String) null));
        this.f192951d = ((C79173v) C86312j.m106911c(cls)).xx0().mo105866jo();
        this.f192948a = C72515x.m84849c(8);
        this.f192950c = C72515x.m84849c(12);
        C75559d xx04 = ((C79173v) C86312j.m106911c(cls)).xx0();
        xx04.getClass();
        Cursor rawQuery3 = xx04.f221979d.rawQuery("select * from WalletBankcard where cardType & 4 != 0 ", (String[]) null, 2);
        if (rawQuery3 == null) {
            arrayList = null;
        } else {
            if (rawQuery3.moveToFirst()) {
                arrayList = new ArrayList<>();
                do {
                    Bankcard bankcard4 = new Bankcard();
                    bankcard4.convertFrom(rawQuery3);
                    arrayList.add(bankcard4);
                } while (rawQuery3.moveToNext());
            } else {
                arrayList = null;
            }
            rawQuery3.close();
        }
        this.f192952e = arrayList;
        C75559d xx05 = ((C79173v) C86312j.m106911c(cls)).xx0();
        xx05.getClass();
        Cursor rawQuery4 = xx05.f221979d.rawQuery("select * from WalletBankcard where cardType & 16 != 0 ", (String[]) null, 2);
        if (rawQuery4 == null) {
            bankcard3 = null;
        } else {
            if (rawQuery4.moveToNext()) {
                bankcard3 = new Bankcard();
                bankcard3.convertFrom(rawQuery4);
            } else {
                bankcard3 = null;
            }
            rawQuery4.close();
        }
        this.f192954g = bankcard3;
        Cursor rawQuery5 = ((C79173v) C86312j.m106911c(cls)).yx0().f84130d.rawQuery("select * from LoanEntryInfo", (String[]) null, 2);
        if (rawQuery5 == null) {
            pVar = null;
        } else {
            if (rawQuery5.moveToFirst()) {
                pVar = new C28269p();
                pVar.convertFrom(rawQuery5);
            } else {
                pVar = null;
            }
            rawQuery5.close();
        }
        this.f192957j = pVar;
        Log.m105924i("MicroMsg.WalletUserInfoManger", "loadDbData!");
        mo91311A();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_OFFLINE_GUIDE_BAR_CONFIG_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            C77951j53 j533 = new C77951j53();
            try {
                JSONObject jSONObject = new JSONObject(str);
                j533.f227645d = jSONObject.optInt("guide_type");
                String optString = jSONObject.optString("guide_type");
                j533.f227646e = new C64485k53();
                if (Util.isNullOrNil(optString)) {
                    j533.f227646e.f183895d = new JSONObject(optString).optString("bind_serial");
                }
                j533.f227647f = jSONObject.optInt("is_show_guide");
                j533.f227648g = jSONObject.optString("guide_content");
                j533.f227649h = jSONObject.optString("guide_content_color");
                j533.f227650i = jSONObject.optString("guide_btn_text");
                j533.f227651j = jSONObject.optString("guide_btn_text_color");
                j533.f227652n = jSONObject.optString("guide_btn_bg_color");
                j533.f227653o = jSONObject.optString("guide_logo");
                j533.f227654p = jSONObject.optString("background_color");
                j533.f227655q = jSONObject.optString("attach_info_left_wording");
                j533.f227656r = jSONObject.optString("attach_info_right_wording");
                j533.f227657s = jSONObject.optInt("btn_jump_mode");
                j533.f227658t = jSONObject.optString("btn_jump_h5");
                j533.f227659u = jSONObject.optString("btn_jump_tinyapp_username");
                j533.f227660v = jSONObject.optString("btn_jump_tinyapp_path");
                j533.f227661w = jSONObject.optString("dark_guide_btn_text_color");
                j533.f227662x = jSONObject.optString("dark_guide_btn_bg_color");
                j533.f227663y = jSONObject.optString("dark_background_color");
                j532 = j533;
            } catch (JSONException e2) {
                Log.m105921e("MicroMsg.WalletQueryBankcardParser", "getOfflineGuideBarFromJSONStr() Exception:%s", e2.getMessage());
            }
        }
        this.f192961n = j532;
    }
}
