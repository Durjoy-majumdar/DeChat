package id2;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.model.C75105d;
import com.tencent.p014mm.wallet_core.model.C75120i;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import f40.C86709a0;
import fr3.C75790l;
import java.util.ArrayList;
import java.util.HashMap;
import kd2.C76559f;
import org.json.JSONObject;
import p156gj.C87199n;
import p156gj.C87203t;
import qe3.C89625d;
import yq3.C79144b;

/* renamed from: id2.l */
public class C76307l extends C75790l {

    /* renamed from: t */
    public static final /* synthetic */ int f223509t = 0;

    /* renamed from: d */
    public String f223510d = "";

    /* renamed from: e */
    public String f223511e = "";

    /* renamed from: f */
    public String f223512f = "";

    /* renamed from: g */
    public String f223513g = "";

    /* renamed from: h */
    public String f223514h = "";

    /* renamed from: i */
    public String f223515i = "";

    /* renamed from: j */
    public String f223516j = "";

    /* renamed from: n */
    public int f223517n = 0;

    /* renamed from: o */
    public String f223518o = "";

    /* renamed from: p */
    public String f223519p = "";

    /* renamed from: q */
    public String f223520q = "";

    /* renamed from: r */
    public int f223521r;

    /* renamed from: s */
    public int f223522s = 20000;

    public C76307l(Bankcard bankcard, String str, int i) {
        String i2 = C87203t.m108273i();
        String str2 = (String) C87199n.m108254a().f252865a.get(256);
        if (!Util.isNullOrNil(str2) && str2.equals(i2)) {
            C115669n.INSTANCE.mo175911u(965, 48);
        }
        Log.m105925i("MicroMsg.NetSceneTenpayWxOfflineCreate", "old id: %s, new id: %s", str2, i2);
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put(TPDownloadProxyEnum.USER_DEVICE_ID, i2);
        hashMap.put("weixin_ver", "0x" + Integer.toHexString(C89625d.f257841g));
        hashMap.put("bind_serialno", bankcard.field_bindSerial);
        hashMap.put("bank_type", bankcard.field_bankcardType);
        hashMap.put("card_tail", bankcard.field_bankcardTail);
        hashMap.put("open_limitfee", "" + i);
        this.f223522s = i;
        String u = C75228t.m90272u();
        String mD5String = MD5Util.getMD5String(MD5Util.getMD5String(u) + MD5Util.getMD5String(C87203t.m108273i()));
        hashMap.put("user_id", mD5String);
        String d = C75105d.m90074e().mo104801d(mD5String, C79144b.m95773a().mo109090e() ? 1 : 0);
        Log.m105925i("MicroMsg.NetSceneTenpayWxOfflineCreate", "crt_csr %s %s", d, Boolean.valueOf(C79144b.m95773a().mo109090e()));
        if (Util.isNullOrNil(d)) {
            Log.m105929w("MicroMsg.NetSceneTenpayWxOfflineCreate", "crt_csr is null!!! errorcode: %s", Integer.valueOf(C75105d.m90074e().mo104802f()));
        }
        hashMap.put("crt_csr", d);
        hashMap.put("type", "3");
        hashMap.put("version_number", "3");
        C76559f.m92116l();
        this.f223521r = 1;
        hashMap.put("is_new_authcodes", "" + this.f223521r);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 565;
    }

    public int getTenpayCgicmd() {
        return 46;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinecreate";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 != null) {
            this.f223511e = jSONObject2.optString("crt_crt");
            this.f223510d = jSONObject2.optString("cn");
            this.f223512f = jSONObject2.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            this.f223513g = jSONObject2.optString("valid_end");
            this.f223514h = jSONObject2.optString("encrypt_str");
            this.f223515i = jSONObject2.optString("deviceid");
            if (C75105d.m90074e().mo104804h(this.f223510d, this.f223511e)) {
                Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt success");
            } else {
                Log.m105920e("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt fail");
            }
            this.f223516j = jSONObject2.optString("token_v2");
            this.f223517n = jSONObject2.optInt("algorithm_type");
            this.f223518o = jSONObject2.optString("card_list");
            this.f223519p = jSONObject2.optString("key_list");
            this.f223520q = jSONObject2.optString("token_pin");
            String optString = jSONObject2.optString("notice_url");
            String optString2 = jSONObject2.optString("auth_codes");
            int optInt = jSONObject2.optInt("update_interval");
            String optString3 = jSONObject2.optString("code_ver");
            int optInt2 = jSONObject2.optInt("cipher_type", 0);
            C69963m.wx0().Cx0(196617, this.f223510d);
            C69963m.wx0().Cx0(196626, this.f223513g);
            C69963m.wx0().Cx0(196627, this.f223514h);
            C69963m.wx0().Cx0(196628, this.f223515i);
            C69963m.wx0().Cx0(196630, "1");
            C69963m wx02 = C69963m.wx0();
            wx02.Cx0(196632, "" + (System.currentTimeMillis() / 1000));
            C76559f.m92124t(this.f223512f, this.f223516j, this.f223518o, this.f223519p, this.f223521r == 1 ? 2 : 1);
            int i2 = this.f223517n;
            C69963m wx03 = C69963m.wx0();
            wx03.Cx0(196644, "" + i2);
            C69963m.wx0().Cx0(196647, this.f223520q);
            C69963m.wx0().Cx0(196616, optString);
            C75105d.m90074e().mo104799b(C69963m.wx0().zx0(196617));
            boolean k = C75105d.m90074e().mo104807k(this.f223510d, optString2, optInt2 == 1);
            Log.m105925i("MicroMsg.NetSceneTenpayWxOfflineCreate", "offlinecreate isOk %s cn: %s", Boolean.valueOf(k), this.f223510d);
            if (!k) {
                Log.m105920e("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens failed!");
                Log.m105920e("MicroMsg.NetSceneTenpayWxOfflineCreate", "WalletOfflineEntranceUI CertUtil.getInstance().getLastError():" + C75105d.m90074e().mo104802f());
            } else {
                Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens success!");
            }
            C69963m wx04 = C69963m.wx0();
            wx04.Cx0(196649, "" + optInt);
            C86709a0.m107528h();
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_OFFLINE_IEMI_STRING_SYNC;
            i3.mo119677K(aVar, "" + C87203t.m108270f(true));
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, optString3);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_KINDAOFFLINE_CERTTYPE_INT_SYNC, 1);
        }
    }

    public void onGYNetEnd2(C75120i iVar, JSONObject jSONObject) {
        C75105d e = C75105d.m90074e();
        e.getClass();
        Log.m105918d("MicroMsg.CertUtilWx", "importCertNone");
        synchronized (e) {
            e.f221019a = false;
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        if (!(i2 == 0 && i3 == 0)) {
            C69963m.wx0().Cx0(196630, "0");
        }
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(135);
        iDKey.SetValue(1);
        iDKey.SetKey(11);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(135);
        iDKey2.SetValue(1);
        if (i3 == 0 && i3 == 0) {
            iDKey2.SetKey(9);
        } else {
            iDKey2.SetKey(10);
        }
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        C115669n.INSTANCE.mo160124a(arrayList, true);
    }
}
