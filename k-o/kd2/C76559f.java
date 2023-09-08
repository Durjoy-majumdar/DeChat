package kd2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelpay.JumpToOfflinePay;
import com.tencent.p014mm.plugin.offline.C69946d;
import com.tencent.p014mm.plugin.offline.C69949e;
import com.tencent.p014mm.plugin.offline.C69954h;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75105d;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import h81.C32735h;
import ie3.C76324c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kd2.C76555c;
import nj3.C76879j;
import oa1.C117731d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import p763ym.C79138l;
import pe3.C89349b;
import t14.C77818a;
import t14.C77819b;
import t14.C77820c;
import t14.C77822e;
import t14.C77823f;
import t14.C77824g;
import t14.C77826i;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

/* renamed from: kd2.f */
public class C76559f {

    /* renamed from: a */
    public static String f224083a = "";

    /* renamed from: b */
    public static String f224084b = "";

    /* renamed from: c */
    public static String f224085c = "";

    /* renamed from: d */
    public static String f224086d = "";

    /* renamed from: e */
    public static String f224087e = "";

    /* renamed from: f */
    public static int f224088f = 0;

    /* renamed from: g */
    public static int f224089g = 1;

    /* renamed from: h */
    public static int f224090h = 0;

    /* renamed from: i */
    public static long f224091i = 0;

    /* renamed from: j */
    public static boolean f224092j = false;

    /* renamed from: k */
    public static String f224093k = "";

    /* renamed from: l */
    public static String f224094l = "";

    /* renamed from: m */
    public static String f224095m = "";

    /* renamed from: kd2.f$a */
    public class C76560a implements C75576f4.C75578b {
        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null && gVar.mo55443A3() != null) {
                if (C76559f.f224083a != null) {
                    gVar.mo55443A3().mo55423X2("offline_token", C76559f.f224083a.getBytes());
                }
                if (C76559f.f224084b != null) {
                    gVar.mo55443A3().mo55423X2("offline_token_V2", C76559f.f224084b.getBytes());
                }
                if (C76559f.f224086d != null) {
                    gVar.mo55443A3().mo55423X2("offline_key_list", C76559f.f224086d.getBytes());
                }
            }
        }
    }

    /* renamed from: kd2.f$b */
    public static class C76561b {

        /* renamed from: a */
        public int f224096a;

        /* renamed from: b */
        public String f224097b;
    }

    /* renamed from: kd2.f$c */
    public static class C76562c {

        /* renamed from: a */
        public String f224098a;

        /* renamed from: b */
        public String f224099b;
    }

    /* renamed from: a */
    public static void m92105a() {
        Log.m105924i("MicroMsg.WalletOfflineUtil", "clear offline data");
        C69963m.wx0().Cx0(196630, "0");
        C69963m.wx0().Cx0(196626, "");
        C69963m.wx0().Cx0(196627, "");
        C69963m.wx0().Cx0(196628, "");
        C69963m.wx0().Cx0(196617, "");
        C69963m.wx0().Cx0(196632, "");
        C69963m.wx0().Cx0(196641, "");
        C69963m.wx0().Cx0(196647, "");
        C69963m.wx0().Cx0(196649, "");
        m92116l();
        m92124t("", "", "", "", 2);
        m92122r(0);
        C69963m.wx0().Cx0(196629, "0");
        C69963m.wx0().Cx0(196631, "");
        C69963m.wx0().Ax0().f223553b = null;
        C69963m.wx0().Bx0().getClass();
        C75105d.m90074e().mo104799b(C69963m.wx0().zx0(196617));
        C69963m.wx0().Cx0(196615, "");
        f224087e = "";
        C69963m.wx0().Cx0(196656, "");
        f224085c = "";
    }

    /* renamed from: b */
    public static void m92106b(Activity activity, int i) {
        String zx02 = C69963m.wx0().zx0(196640);
        int i2 = 0;
        if (!TextUtils.isEmpty(zx02) && m92114j(zx02)) {
            i2 = Util.getInt(zx02, 0);
        }
        m92129y(activity, "create", "", i2 > 0 ? i2 * 100 : 20000, i);
    }

    /* renamed from: c */
    public static List<Bankcard> m92107c(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Bankcard> a = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91319a(true);
        for (int i = 0; i < a.size(); i++) {
            Bankcard bankcard = a.get(i);
            if (z) {
                arrayList.add(bankcard);
            } else {
                arrayList.add(bankcard);
            }
        }
        Log.m105924i("MicroMsg.WalletOfflineUtil", "getBindBankCardList() list size is " + arrayList.size());
        return arrayList;
    }

    /* renamed from: d */
    public static Bankcard m92108d(boolean z) {
        Bankcard a = C76555c.f224079a.mo106804a(z);
        if (a != null && a.field_support_micropay && Util.isNullOrNil(a.field_forbidWord)) {
            return a;
        }
        ArrayList<Bankcard> a2 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91319a(true);
        for (int i = 0; i < a2.size(); i++) {
            Bankcard bankcard = a2.get(i);
            if (bankcard != null && bankcard.field_support_micropay) {
                return bankcard;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m92109e() {
        if (!TextUtils.isEmpty(f224083a)) {
            return f224083a;
        }
        C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C76563g(), (String) null));
        if (TextUtils.isEmpty(f224083a)) {
            Log.m105920e("MicroMsg.WalletOfflineUtil", "token is null");
        }
        return f224083a;
    }

    /* renamed from: f */
    public static int m92110f() {
        if (f224088f == 0) {
            f224088f = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_TOKEN_TYPE_INT_SYNC, 0)).intValue();
        }
        return f224088f;
    }

    /* renamed from: g */
    public static int m92111g() {
        String zx02 = C69963m.wx0().zx0(196649);
        if (TextUtils.isEmpty(zx02) || !m92114j(zx02)) {
            return 0;
        }
        return Util.getInt(zx02, 0);
    }

    /* renamed from: h */
    public static void m92112h(String str) {
        Log.m105925i("MicroMsg.WalletOfflineUtil", "launch 3rd app: %s", str);
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(str);
        if (appInfo == null) {
            Log.m105928w("MicroMsg.WalletOfflineUtil", "can not find app info");
            return;
        }
        Bundle bundle = new Bundle();
        JumpToOfflinePay.Resp resp = new JumpToOfflinePay.Resp();
        resp.errCode = 0;
        resp.toBundle(bundle);
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = appInfo.field_packageName;
        args.bundle = bundle;
        C72688j0.m85024j(args);
        C72688j0.m85021g(bundle);
        C72688j0.m85022h(bundle);
        MMessageActV2.send(MMApplicationContext.getContext(), args);
    }

    /* renamed from: i */
    public static boolean m92113i() {
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_android_offline_kinda_ready;
        Class cls = C32735h.class;
        C79144b.m95773a().getClass();
        if (!((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_android_wcpay_offline_kinda, true)) {
            return false;
        }
        boolean isOfflineReady = ((C76324c) C86312j.m106911c(C76324c.class)).isOfflineReady();
        Log.m105925i("MicroMsg.WalletOfflineUtil", "is kinda ready is %s", Boolean.valueOf(isOfflineReady));
        if (m92115k()) {
            if (m92110f() == 2) {
                Log.m105924i("MicroMsg.WalletOfflineUtil", "using v2authcode, depend on isKindaReady");
                if (!isOfflineReady && NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                    C115669n.INSTANCE.idkeyStat(1105, 111, 1, false);
                    C79144b.m95773a().getClass();
                    if (((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, false)) {
                        Log.m105924i("MicroMsg.WalletOfflineUtil", "offline mainui cache is not ready, but user connect to network, abtest is on, return YES");
                        return true;
                    }
                }
                return isOfflineReady;
            }
            Log.m105924i("MicroMsg.WalletOfflineUtil", "abtest is on, but using v1authcode, request get token");
            C69963m.wx0().Bx0().mo96267b(1, 1);
            return false;
        }
        Log.m105924i("MicroMsg.WalletOfflineUtil", "offlinepay is not create, depend on isKindaReady");
        if (!isOfflineReady && NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            C115669n.INSTANCE.idkeyStat(1105, 112, 1, false);
            C79144b.m95773a().getClass();
            if (((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, false)) {
                Log.m105924i("MicroMsg.WalletOfflineUtil", "offline mainui cache is not ready, but user connect to network, abtest is on, return YES");
                return true;
            }
        }
        return isOfflineReady;
    }

    /* renamed from: j */
    public static boolean m92114j(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* renamed from: k */
    public static boolean m92115k() {
        String zx02 = C69963m.wx0().zx0(196630);
        return zx02 != null && zx02.equals("1");
    }

    /* renamed from: l */
    public static int m92116l() {
        C79144b.m95773a().getClass();
        Log.m105919d("MicroMsg.WalletOfflineUtil", "is open online code: %s, is offline kinda open: %s", 1, Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_wcpay_offline_kinda, true)));
        return 1;
    }

    /* renamed from: m */
    public static boolean m92117m() {
        String zx02 = C69963m.wx0().zx0(196641);
        return zx02 != null && zx02.equals("1");
    }

    /* renamed from: n */
    public static void m92118n(Context context) {
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        boolean z = false;
        String f = C117731d.m166007c().mo182444f("clicfg_wcpay_host_change_to_cn_android", "", false, false);
        if (!Util.isNullOrNil(f) && Util.getInt(f, 0) != 0) {
            z = true;
        }
        C75228t.m90219L(context, z ? "zh_CN".equals(applicationLanguage) ? context.getString(C0966R.string.mis) : "zh_TW".equals(applicationLanguage) ? context.getString(C0966R.string.miv) : "zh_HK".equals(applicationLanguage) ? context.getString(C0966R.string.miu) : context.getResources().getString(C0966R.string.mit) : "zh_CN".equals(applicationLanguage) ? context.getString(C0966R.string.k8c) : "zh_TW".equals(applicationLanguage) ? context.getString(C0966R.string.k8f) : "zh_HK".equals(applicationLanguage) ? context.getString(C0966R.string.k8e) : context.getResources().getString(C0966R.string.k8d), true);
    }

    /* renamed from: o */
    public static LinkedList<C76561b> m92119o(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        LinkedList<C76561b> linkedList = new LinkedList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                C76561b bVar = new C76561b();
                bVar.f224096a = jSONObject.optInt("card_id");
                jSONObject.optString("bank_type");
                bVar.f224097b = jSONObject.optString("bind_serial");
                jSONObject.optString("forbid_word");
                linkedList.add(bVar);
            }
        }
        return linkedList;
    }

    /* renamed from: p */
    public static LinkedList<C76562c> m92120p(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            LinkedList<C76562c> linkedList = new LinkedList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    C76562c cVar = new C76562c();
                    cVar.f224098a = jSONObject.optString("bank_type");
                    cVar.f224099b = jSONObject.optString("icon_url");
                    linkedList.add(cVar);
                }
            }
            return linkedList;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.WalletOfflineUtil", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: q */
    public static C77820c m92121q(Map<String, String> map, int i) {
        String str;
        String str2;
        String str3;
        Map<String, String> map2 = map;
        int i2 = i;
        if (i2 == 0) {
            str = ".sysmsg.paymsg.user_roll.activity_info.record.exposure_info.";
        } else {
            str = ".sysmsg.paymsg.user_roll.activity_info.record" + i2 + ".exposure_info.";
        }
        if (map2 == null) {
            return null;
        }
        C77820c cVar = new C77820c();
        cVar.f226708e = Util.getInt(map2.get(str + "is_query_others"), 0);
        cVar.f226709f = map2.get(str + "draw_lottery_params");
        cVar.f226710g = Util.getInt(map2.get(str + "is_show_btn"), 0);
        cVar.f226712i = Util.nullAsNil(map2.get(str + "exposure_info_modify_params"));
        C77818a aVar = new C77818a();
        String str4 = str + "btn_info.";
        aVar.f226694d = map2.get(str4 + "btn_words");
        aVar.f226695e = map2.get(str4 + "btn_color");
        aVar.f226696f = Util.getInt(map2.get(str4 + "btn_op_type"), 0);
        aVar.f226697g = map2.get(str4 + "url");
        aVar.f226699i = map2.get(str4 + "get_lottery_params");
        String str5 = str4 + "mini_app_info.";
        C77824g gVar = new C77824g();
        aVar.f226698h = gVar;
        gVar.f226745d = map2.get(str5 + "activity_tinyapp_username");
        aVar.f226698h.f226746e = map2.get(str5 + "activity_tinyapp_path");
        C77824g gVar2 = aVar.f226698h;
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        String str6 = "activity_tinyapp_version";
        sb.append(str6);
        gVar2.f226747f = Util.getInt(map2.get(sb.toString()), 0);
        if (!Util.isNullOrNil(aVar.f226694d) || !Util.isNullOrNil(aVar.f226697g) || !Util.isNullOrNil(aVar.f226699i) || !Util.isNullOrNil(aVar.f226698h.f226745d) || !Util.isNullOrNil(aVar.f226698h.f226746e)) {
            cVar.f226711h = aVar;
        }
        cVar.f226713j = Util.getInt(map2.get(str + "user_opertaion_type"), 0);
        cVar.f226714n = Util.getInt(map2.get(str + "is_show_layer"), 0);
        cVar.f226716p = map2.get(str + "background_img_whole");
        cVar.f226707d = new LinkedList<>();
        int i3 = 255;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                str2 = str6;
                break;
            }
            if (i4 == 0) {
                str3 = str + "single_exposure_info_list.record.";
            } else {
                str3 = str + "single_exposure_info_list.record" + i4 + ".";
            }
            C77826i iVar = new C77826i();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            str2 = str6;
            sb4.append("logo");
            iVar.f226752d = map2.get(sb4.toString());
            iVar.f226753e = map2.get(str3 + "award_name");
            iVar.f226754f = map2.get(str3 + "award_description");
            iVar.f226755g = map2.get(str3 + "background_img");
            iVar.f226756h = map2.get(str3 + "award_name_color");
            iVar.f226757i = map2.get(str3 + "award_description_color");
            if (!Util.isNullOrNil(iVar.f226752d) || !Util.isNullOrNil(iVar.f226753e) || !Util.isNullOrNil(iVar.f226754f) || !Util.isNullOrNil(iVar.f226755g) || !Util.isNullOrNil(iVar.f226756h) || !Util.isNullOrNil(iVar.f226757i)) {
                cVar.f226707d.add(iVar);
            }
            if (Util.isNullOrNil(iVar.f226753e) || Util.isNullOrNil(iVar.f226754f)) {
                break;
            }
            i4++;
            str6 = str2;
            i3 = 255;
        }
        cVar.f226715o = new C77823f();
        String str7 = str + "layer_info.";
        cVar.f226715o.f226736d = map2.get(str7 + "layer_title");
        cVar.f226715o.f226737e = map2.get(str7 + "layer_logo");
        cVar.f226715o.f226738f = map2.get(str7 + "layer_type");
        cVar.f226715o.f226739g = map2.get(str7 + "layer_name");
        cVar.f226715o.f226740h = map2.get(str7 + "layer_description");
        cVar.f226715o.f226741i = Util.getInt(map2.get(str7 + "is_show_layer_btn"), 0);
        cVar.f226715o.f226742j = new C77822e();
        String str8 = str7 + "layer_btn_info.";
        cVar.f226715o.f226742j.f226730d = map2.get(str8 + "btn_words");
        cVar.f226715o.f226742j.f226731e = map2.get(str8 + "btn_color");
        cVar.f226715o.f226742j.f226732f = Util.getInt(map2.get(str8 + "btn_op_type"), 0);
        cVar.f226715o.f226742j.f226733g = map2.get(str8 + "get_lottery_params");
        cVar.f226715o.f226742j.f226734h = map2.get(str8 + "url");
        String str9 = str8 + "mini_app_info.";
        cVar.f226715o.f226742j.f226735i = new C77824g();
        cVar.f226715o.f226742j.f226735i.f226745d = map2.get(str9 + "activity_tinyapp_username");
        cVar.f226715o.f226742j.f226735i.f226746e = map2.get(str9 + "activity_tinyapp_path");
        C77824g gVar3 = cVar.f226715o.f226742j.f226735i;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str9);
        String str10 = str2;
        sb5.append(str10);
        gVar3.f226747f = Util.getInt(map2.get(sb5.toString()), 0);
        if (!Util.isNullOrNil(map2.get(str7 + "voice_url"))) {
            cVar.f226715o.f226743n = new C89349b(map2.get(str7 + "voice_url").getBytes());
        }
        if (!Util.isNullOrNil(map2.get(str7 + "voice_data"))) {
            cVar.f226715o.f226744o = new C89349b(map2.get(str7 + "voice_data").getBytes());
        }
        C77819b bVar = new C77819b();
        String str11 = str + "draw_lottery_info.";
        bVar.f226701e = map2.get(str11 + "url");
        bVar.f226702f = map2.get(str11 + "animation_wording");
        bVar.f226703g = map2.get(str11 + "animation_wording_color");
        bVar.f226704h = Util.getInt(map2.get(str11 + "op_type"), 0);
        bVar.f226705i = map2.get(str11 + "after_animation_wording");
        bVar.f226706j = map2.get(str11 + "after_animation_wording_color");
        String str12 = str11 + "mini_app_info.";
        C77824g gVar4 = new C77824g();
        bVar.f226700d = gVar4;
        gVar4.f226745d = map2.get(str12 + "activity_tinyapp_username");
        bVar.f226700d.f226746e = map2.get(str12 + "activity_tinyapp_path");
        bVar.f226700d.f226747f = Util.getInt(map2.get(str12 + str10), 0);
        if (!Util.isNullOrNil(bVar.f226701e) || !Util.isNullOrNil(bVar.f226702f) || !Util.isNullOrNil(bVar.f226703g) || !Util.isNullOrNil(bVar.f226700d.f226745d) || !Util.isNullOrNil(bVar.f226700d.f226746e)) {
            cVar.f226717q = bVar;
        }
        return cVar;
    }

    /* renamed from: r */
    public static void m92122r(int i) {
        if (i > 0) {
            boolean z = C69963m.f201787j;
            synchronized (C69963m.class) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.BUSINESS_OFFLINE_REGET_TOKEN_NUM_SYNC_INT, Integer.valueOf(i));
                C69963m.f201788n = i;
                C69963m.f201789o = true;
            }
            Log.m105925i("MicroMsg.WalletOfflineUtil", "set token num: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: s */
    public static void m92123s(String str) {
        ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91315E(str);
    }

    /* renamed from: t */
    public static void m92124t(String str, String str2, String str3, String str4, int i) {
        f224083a = str;
        f224084b = str2;
        f224085c = str3;
        f224086d = str4;
        C69963m.wx0().Cx0(196656, str3);
        f224085c = str3;
        m92125u(i);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, "");
        C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C76560a(), (String) null));
    }

    /* renamed from: u */
    public static void m92125u(int i) {
        int i2 = f224088f;
        f224088f = i;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_TOKEN_TYPE_INT_SYNC, Integer.valueOf(i));
        if (i2 != i) {
            C76555c cVar = C76555c.f224079a;
            Log.m105924i("MicroMsg.OfflinePriorBankcardLogic", "onTokenTypeChanged: " + m92110f());
            cVar.mo106805b();
            Iterator<C76555c.C76557b> it = C76555c.f224081c.iterator();
            while (it.hasNext()) {
                it.next().mo96287A0();
            }
        }
    }

    /* renamed from: v */
    public static void m92126v(Activity activity) {
        C76879j.m92726T(activity, activity.getResources().getString(C0966R.string.lau));
        if (!TextUtils.isEmpty(C69963m.wx0().zx0(196616))) {
            C75228t.m90219L(activity, C69963m.wx0().zx0(196616), true);
        }
    }

    /* renamed from: w */
    public static void m92127w(Activity activity, int i, int i2) {
        Class<C69949e> cls = C69949e.class;
        Class<C69946d> cls2 = C69946d.class;
        Class cls3 = C79173v.class;
        PayInfo payInfo = new PayInfo();
        payInfo.f212586d = 5;
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_pay_info", payInfo);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 5);
        bundle.putInt("key_offline_add_fee", i);
        if (i2 >= 0) {
            bundle.putInt("key_entry_scene", i2);
        }
        if (((C79173v) C86312j.m106911c(cls3)).Ex0().mo91341w()) {
            C79143a.m95771j(activity, cls2, bundle, (C79148e.C79149a) null);
        } else if (((C79173v) C86312j.m106911c(cls3)).Ex0().mo91343y()) {
            bundle.putBoolean("key_is_bind_bankcard", true);
            C79143a.m95771j(activity, cls, bundle, (C79148e.C79149a) null);
        } else if (((C79173v) C86312j.m106911c(cls3)).Ex0().mo91342x()) {
            bundle.putBoolean("key_is_bind_bankcard", true);
            C79143a.m95771j(activity, cls, bundle, (C79148e.C79149a) null);
        } else {
            C79143a.m95771j(activity, cls2, bundle, (C79148e.C79149a) null);
        }
    }

    /* renamed from: x */
    public static void m92128x(Activity activity, int i, int i2, Bundle bundle) {
        PayInfo payInfo = new PayInfo();
        payInfo.f212586d = 5;
        bundle.putParcelable("key_pay_info", payInfo);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 5);
        bundle.putInt("key_offline_add_fee", i);
        if (i2 >= 0) {
            bundle.putInt("key_entry_scene", i2);
        }
        C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
        C75133p0.m90118b(bundle.getInt("key_bind_scene"));
        ((C76324c) C86312j.m106911c(C76324c.class)).startBindCardUseCase(activity, bundle);
    }

    /* renamed from: y */
    public static void m92129y(Activity activity, String str, String str2, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("oper", str);
        bundle.putInt("offline_chg_fee", i);
        bundle.putString("pwd_tips", str2);
        if (i2 >= 0) {
            bundle.putInt("offline_from_scene", i2);
        }
        C79143a.m95771j(activity, C69954h.class, bundle, (C79148e.C79149a) null);
    }
}
