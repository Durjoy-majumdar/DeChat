package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75108e;
import com.tenpay.ndk.CertUtil;
import com.tenpay.ndk.WxSmCertUtil;
import f40.C86709a0;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.wallet_core.model.t0 */
public class C75140t0 {

    /* renamed from: h */
    public static C75140t0 f221088h;

    /* renamed from: a */
    public int f221089a = 0;

    /* renamed from: b */
    public String f221090b = "";

    /* renamed from: c */
    public String f221091c = "";

    /* renamed from: d */
    public String f221092d = "";

    /* renamed from: e */
    public String f221093e = "";

    /* renamed from: f */
    public C75108e.C75110b f221094f = C75108e.C75110b.DigitalCertEncryptTypeRSA;

    /* renamed from: g */
    public Vector<C75138s0> f221095g = new Vector<>();

    /* renamed from: b */
    public static String m90123b() {
        C86709a0.m107528h();
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLETDIGITAL_CERT_NO_STRING_SYNC, "");
    }

    /* renamed from: c */
    public static C75140t0 m90124c() {
        if (f221088h == null) {
            f221088h = new C75140t0();
        }
        return f221088h;
    }

    /* renamed from: e */
    public static void m90125e(String str, C75108e.C75110b bVar) {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLETDIGITAL_CERT_NO_STRING_SYNC, str);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLETDIGITAL_CERT_ENCRYPT_TYPE_INT_SYNC, Integer.valueOf(bVar.ordinal()));
    }

    /* renamed from: a */
    public void mo104862a(String str) {
        if (!Util.isNullOrNil(str)) {
            if (str.equals(m90123b())) {
                this.f221089a = 0;
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLETDIGITAL_CERT_NO_STRING_SYNC, "");
                Log.m105925i("MicroMsg.WalletDigCertManager", "clean token %s  stack %s ", str, Util.getStack().toString());
                C75108e.m90085b().getClass();
                if (!Util.isNullOrNil(str)) {
                    Log.m105919d("MicroMsg.CertUtilWx", "clearCert stack %s", Util.getStack().toString());
                    if (CertUtil.getInstance().isCertExist(str)) {
                        Log.m105918d("MicroMsg.CertUtilWx", "CertUtil clear cert");
                        CertUtil.getInstance().clearCert(str);
                    } else if (WxSmCertUtil.getInstance().hasCert(str)) {
                        Log.m105918d("MicroMsg.CertUtilWx", "WxSmCertUtil clear cert");
                        WxSmCertUtil.getInstance().clearCert(str);
                    }
                }
            }
            Iterator<C75138s0> it = this.f221095g.iterator();
            while (it.hasNext()) {
                C75138s0 next = it.next();
                if (Util.isEqual(str, next.f221082c)) {
                    this.f221095g.remove(next);
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo104863d(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("cert_info");
        if (optJSONObject != null) {
            this.f221095g = new Vector<>();
            int optInt = optJSONObject.optInt("show_crt_info");
            this.f221089a = optJSONObject.optInt("is_crt_install");
            this.f221093e = optJSONObject.optString("crt_item_logo_url");
            this.f221090b = optJSONObject.optString("crt_entry_desc");
            this.f221091c = optJSONObject.optString("crt_entry_title");
            this.f221092d = optJSONObject.optString("crt_status_name");
            int optInt2 = optJSONObject.optInt("use_cert_encrypt_type");
            Log.m105925i("NetSceneKindaGenDigitalCert", "encrypt type: %d", Integer.valueOf(optInt2));
            C75108e.C75110b bVar = C75108e.C75110b.DigitalCertEncryptTypeRSA;
            C75108e.C75110b bVar2 = (optInt2 < 0 || optInt2 > 2) ? bVar : C75108e.C75110b.values()[optInt2];
            C75108e.C75110b bVar3 = C75108e.C75110b.DigitalCertEncryptTypeCa;
            if (bVar2 == bVar3) {
                this.f221094f = bVar3;
            } else {
                C75108e.C75110b bVar4 = C75108e.C75110b.DigitalCertEncryptTypeTw;
                if (bVar2 == bVar4) {
                    this.f221094f = bVar4;
                } else {
                    this.f221094f = bVar;
                }
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLETDIGITAL_CERT_SHOW_INT_SYNC, Integer.valueOf(optInt));
            String b = m90123b();
            JSONArray optJSONArray = optJSONObject.optJSONArray("crt_list");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        C75138s0 s0Var = new C75138s0(optJSONArray.getJSONObject(i));
                        if (s0Var.f221083d == 0) {
                            this.f221095g.add(s0Var);
                        } else if (Util.isNullOrNil(b)) {
                            Log.m105925i("MicroMsg.WalletDigCertManager", "drop crt list no exist local drop: %s", s0Var.f221082c);
                        } else if (s0Var.f221082c.equals(b)) {
                            this.f221095g.add(s0Var);
                        } else {
                            Log.m105925i("MicroMsg.WalletDigCertManager", "drop crt list %s drop: %s", b, s0Var.f221082c);
                        }
                    } catch (Exception e) {
                        Log.m105925i("MicroMsg.WalletDigCertManager", "WalletDigCertManager error %s", e.getMessage());
                    }
                }
            }
        }
    }
}
