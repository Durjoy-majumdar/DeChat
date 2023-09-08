package id2;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.mmdata.rpt.AndroidCertErrorStruct;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75105d;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import eb0.C75576f4;
import f40.C86709a0;
import java.util.HashMap;
import kd2.C76559f;
import kd2.C76563g;
import org.json.JSONObject;
import p156gj.C87203t;
import p823sg.C90193h;
import te3.C64651q80;

/* renamed from: id2.n */
public class C76309n extends C76305i {

    /* renamed from: f */
    public String f223523f = "";

    /* renamed from: g */
    public String f223524g = "";

    /* renamed from: h */
    public String f223525h = "";

    /* renamed from: i */
    public String f223526i = "";

    /* renamed from: j */
    public String f223527j = "";

    /* renamed from: n */
    public int f223528n = 0;

    /* renamed from: o */
    public String f223529o = "";

    /* renamed from: p */
    public String f223530p = "";

    /* renamed from: q */
    public String f223531q = "";

    /* renamed from: r */
    public String f223532r;

    /* renamed from: s */
    public int f223533s;

    /* renamed from: t */
    public String f223534t;

    /* renamed from: u */
    public int f223535u = 0;

    /* renamed from: v */
    public int f223536v = 0;

    /* renamed from: w */
    public int f223537w;

    /* renamed from: x */
    public String f223538x = C90193h.m112878f((System.currentTimeMillis() + "").getBytes());

    public C76309n(String str, int i, int i2) {
        String str2;
        String str3;
        String str4;
        String str5 = str;
        int i3 = i;
        Log.m105927v("MicroMsg.NetSceneTenpayWxOfflineGetToken", "scene %s stack %s ", Integer.valueOf(i), Util.getStack().toString());
        String e = C76559f.m92109e();
        String zx02 = C69963m.wx0().zx0(196628);
        zx02 = TextUtils.isEmpty(zx02) ? C87203t.m108273i() : zx02;
        if (TextUtils.isEmpty(e)) {
            str2 = zx02 + "&" + str5 + "&" + (((int) (Math.random() * 1000000.0d)) + 1000000);
        } else {
            str2 = zx02 + "&" + str5 + "&" + (((int) (1000000.0d * Math.random())) + 1000000) + "&" + e;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("token_src", str2);
        String zx03 = C69963m.wx0().zx0(196617);
        int i4 = 12;
        switch (i2) {
            case 1:
                i4 = 13;
                break;
            case 2:
                i4 = 14;
                break;
            case 3:
                i4 = 15;
                break;
            case 4:
                i4 = 16;
                break;
            case 5:
                i4 = 17;
                break;
            case 6:
                i4 = 18;
                break;
            case 7:
                i4 = 19;
                break;
            case 8:
                i4 = 20;
                break;
            case 9:
                i4 = 24;
                break;
            case 10:
                i4 = 72;
                break;
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(135, (long) i4, 1, true);
        AndroidCertErrorStruct androidCertErrorStruct = new AndroidCertErrorStruct();
        androidCertErrorStruct.f194121h = androidCertErrorStruct.mo86045b("session2", this.f223538x, true);
        androidCertErrorStruct.f194117d = 1;
        if (C75105d.m90074e().mo104806j(zx03)) {
            androidCertErrorStruct.f194118e = 1;
            androidCertErrorStruct.f194119f = (long) C75105d.m90074e().mo104802f();
            androidCertErrorStruct.mo86054n();
            AndroidCertErrorStruct androidCertErrorStruct2 = new AndroidCertErrorStruct();
            androidCertErrorStruct2.f194121h = androidCertErrorStruct2.mo86045b("session2", this.f223538x, true);
            androidCertErrorStruct2.f194117d = 3;
            str3 = C75105d.m90074e().mo104800c(zx03, str2);
            if (Util.isNullOrNil(str3)) {
                androidCertErrorStruct2.f194118e = 0;
                androidCertErrorStruct2.f194119f = (long) C75105d.m90074e().mo104802f();
                androidCertErrorStruct2.mo86054n();
            } else {
                androidCertErrorStruct2.f194118e = 1;
                androidCertErrorStruct2.f194119f = (long) C75105d.m90074e().mo104802f();
                androidCertErrorStruct2.mo86054n();
            }
            Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().isCertExist(cn) true");
        } else {
            Log.m105920e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().getLastError():" + C75105d.m90074e().mo104802f());
            androidCertErrorStruct.f194118e = 0;
            androidCertErrorStruct.f194119f = (long) C75105d.m90074e().mo104802f();
            androidCertErrorStruct.mo86054n();
            nVar.idkeyStat(135, 6, 1, true);
            AndroidCertErrorStruct androidCertErrorStruct3 = new AndroidCertErrorStruct();
            androidCertErrorStruct3.f194121h = androidCertErrorStruct3.mo86045b("session2", this.f223538x, true);
            androidCertErrorStruct3.f194117d = 2;
            C86709a0.m107528h();
            String str6 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_IEMI_STRING_SYNC, "");
            if (str6 == null || !str6.equals(C87203t.m108270f(true))) {
                androidCertErrorStruct3.f194118e = 0;
                androidCertErrorStruct3.f194119f = (long) C75105d.m90074e().mo104802f();
                Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken iemi is diff between create and getToken");
                nVar.idkeyStat(135, 5, 1, true);
            } else {
                Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken iemi is same between create and getToken");
                androidCertErrorStruct3.f194118e = 1;
                androidCertErrorStruct3.f194119f = (long) C75105d.m90074e().mo104802f();
            }
            androidCertErrorStruct3.mo86054n();
            Log.m105920e("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().isCertExist return false! cn: " + zx03);
            str3 = "";
        }
        if (TextUtils.isEmpty(str3)) {
            Log.m105920e("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken sign is empty!");
            nVar.idkeyStat(135, 4, 1, true);
        } else {
            Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "sign is valid");
        }
        hashMap.put("sign", str3);
        hashMap.put("cert_no", zx03);
        int i5 = C76307l.f223509t;
        hashMap.put("type", "3");
        hashMap.put("version_number", "3");
        String zx04 = C69963m.wx0().zx0(196644);
        if (((TextUtils.isEmpty(zx04) || !C76559f.m92114j(zx04)) ? 0 : Util.getInt(zx04, 0)) == 2) {
            if (!TextUtils.isEmpty(C76559f.f224084b)) {
                str4 = C76559f.f224084b;
            } else {
                C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C76563g(), (String) null));
                if (TextUtils.isEmpty(C76559f.f224084b)) {
                    Log.m105920e("MicroMsg.WalletOfflineUtil", "offline_token_v2 is null");
                }
                str4 = C76559f.f224084b;
            }
            hashMap.put("last_token", str4);
        } else {
            hashMap.put("last_token", C76559f.m92109e());
        }
        Log.m105925i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "inOfflineUI: %B", Boolean.valueOf(C69963m.f201787j));
        if (i3 == 65281) {
            hashMap.put("fetch_tag", String.valueOf(2));
        } else if (C69963m.f201787j) {
            hashMap.put("fetch_tag", String.valueOf(1));
        } else {
            hashMap.put("fetch_tag", String.valueOf(0));
        }
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "" + (i3 == 65281 ? 3 : i3));
        C76559f.m92116l();
        this.f223537w = 1;
        hashMap.put("is_new_authcodes", "" + this.f223537w);
        hashMap.put("code_ver", "" + C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, ""));
        setRequestData(hashMap);
    }

    /* renamed from: k1 */
    public static C64651q80 m91733k1(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C64651q80 q802 = new C64651q80();
        q802.f184980d = jSONObject.optInt("is_need_show", 0);
        q802.f184982f = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
        q802.f184983g = jSONObject.optString("button");
        q802.f184981e = jSONObject.optString("icon");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, jSONObject.toString());
        return q802;
    }

    public int getFuncId() {
        return C69963m.f201787j ? 571 : 1725;
    }

    public int getTenpayCgicmd() {
        return C69963m.f201787j ? 52 : 1725;
    }

    public String getUri() {
        return C69963m.f201787j ? "/cgi-bin/mmpay-bin/tenpay/offlinegettoken" : "/cgi-bin/mmpay-bin/tenpay/offlinegettokenbackground";
    }

    /* renamed from: j1 */
    public void mo106542j1(int i, String str, String str2) {
        Log.m105919d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "onGYNetEnd2: %s", str2);
        try {
            m91733k1(new JSONObject(str2).optJSONObject("enable_code_page"));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneTenpayWxOfflineGetToken", e, "", new Object[0]);
        }
    }

    /* renamed from: l1 */
    public boolean mo106544l1() {
        Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "do save token");
        C69963m.wx0().Cx0(196626, this.f223524g);
        C69963m.wx0().Cx0(196627, this.f223525h);
        C69963m.wx0().Cx0(196628, this.f223526i);
        C69963m wx02 = C69963m.wx0();
        wx02.Cx0(196632, "" + (System.currentTimeMillis() / 1000));
        C76559f.m92124t(this.f223523f, this.f223527j, this.f223529o, this.f223530p, this.f223537w == 1 ? 2 : 1);
        int i = this.f223528n;
        C69963m wx03 = C69963m.wx0();
        wx03.Cx0(196644, "" + i);
        C69963m.wx0().Cx0(196647, this.f223531q);
        String zx02 = C69963m.wx0().zx0(196617);
        C75105d.m90074e().mo104799b(zx02);
        boolean k = C75105d.m90074e().mo104807k(zx02, this.f223532r, this.f223536v == 1);
        AndroidCertErrorStruct androidCertErrorStruct = new AndroidCertErrorStruct();
        androidCertErrorStruct.f194121h = androidCertErrorStruct.mo86045b("session2", this.f223538x, true);
        androidCertErrorStruct.f194117d = 3;
        if (!k) {
            androidCertErrorStruct.f194118e = 0;
            androidCertErrorStruct.f194119f = (long) C75105d.m90074e().mo104802f();
            Log.m105920e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens failed!");
            Log.m105920e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "WalletOfflineEntranceUI CertUtil.getInstance().getLastError():" + C75105d.m90074e().mo104802f());
        } else {
            androidCertErrorStruct.f194118e = 1;
            androidCertErrorStruct.f194119f = (long) C75105d.m90074e().mo104802f();
            Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens success!");
        }
        androidCertErrorStruct.mo86054n();
        C69963m wx04 = C69963m.wx0();
        wx04.Cx0(196649, "" + this.f223533s);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, this.f223534t);
        return k;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105919d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "errCode: %d, errMsg: %s", Integer.valueOf(i), str);
        if (i == 0 && jSONObject != null) {
            this.f223523f = jSONObject.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            this.f223524g = jSONObject.optString("valid_end");
            this.f223525h = jSONObject.optString("encrypt_str");
            this.f223526i = jSONObject.optString("deviceid");
            this.f223527j = jSONObject.optString("token_v2");
            this.f223528n = jSONObject.optInt("algorithm_type");
            this.f223529o = jSONObject.optString("card_list");
            this.f223530p = jSONObject.optString("key_list");
            this.f223531q = jSONObject.optString("token_pin");
            this.f223532r = jSONObject.optString("auth_codes");
            this.f223533s = jSONObject.optInt("update_interval");
            this.f223534t = jSONObject.optString("code_ver");
            this.f223535u = jSONObject.optInt("reget_token_num", 0);
            this.f223536v = jSONObject.optInt("cipher_type", 0);
            C76559f.m92122r(this.f223535u);
            Log.m105919d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "json: %s", jSONObject.toString());
        }
    }
}
