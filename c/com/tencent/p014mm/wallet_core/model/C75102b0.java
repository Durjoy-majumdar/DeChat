package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.wallet_core.model.C75108e;
import com.tencent.xweb.WCWebUpdater;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import java.util.Map;
import ob0.C117747y;
import org.json.JSONObject;
import p156gj.C87200o;
import p156gj.C87203t;
import p206nj.C117627q;
import p823sg.C77710q;
import qe3.C89625d;
import yq3.C79144b;

/* renamed from: com.tencent.mm.wallet_core.model.b0 */
public class C75102b0 extends C75790l {

    /* renamed from: d */
    public int f221012d = 0;

    /* renamed from: e */
    public C75108e.C75110b f221013e = C75108e.C75110b.DigitalCertEncryptTypeRSA;

    /* renamed from: f */
    public boolean f221014f = true;

    /* renamed from: g */
    public C75103a f221015g = null;

    /* renamed from: com.tencent.mm.wallet_core.model.b0$a */
    public interface C75103a {
        /* renamed from: a */
        void mo99663a(C117747y yVar, boolean z);
    }

    public C75102b0(String str, int i, String str2, C75108e.C75110b bVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        this.f221012d = 1;
        this.f221013e = bVar;
        baseRequset(hashMap);
        hashMap.put("type", C117627q.m165908a("1"));
        hashMap.put("id_no", C117627q.m165908a(str));
        hashMap.put("id_type", C117627q.m165908a(i + ""));
        hashMap.put("cert_encrypt_type", C117627q.m165908a(bVar.ordinal() + ""));
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public final void baseRequset(Map<String, String> map) {
        String str;
        C86709a0.m107528h();
        String a = C77710q.m93738a(C86709a0.m107523b().mo121110g());
        String f = C87203t.m108270f(false);
        byte[] bArr = new byte[16];
        byte[] bytes = C7088m0.m7307a().getBytes();
        if (bytes == null || bytes.length <= 0) {
            bytes = ("" + System.currentTimeMillis()).getBytes();
        }
        int i = 0;
        int i2 = 0;
        do {
            bArr[i2] = bytes[i];
            i2++;
            i++;
            if (i >= bytes.length) {
                i = 0;
                continue;
            }
        } while (i2 < 16);
        String str2 = new String(bArr);
        String mD5String = MD5Util.getMD5String(a + f);
        String mD5String2 = MD5Util.getMD5String(a + f + bArr);
        StringBuilder sb = new StringBuilder();
        sb.append("SN=");
        sb.append(mD5String2);
        String sb4 = sb.toString();
        int ordinal = this.f221013e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            str = C75108e.m90085b().mo104816g("WeChatPay", sb4, this.f221013e, 0);
        } else {
            String mD5String3 = MD5Util.getMD5String(a + mD5String + new String(bArr));
            C79144b.m95773a().getClass();
            Log.m105925i("MicroMsg.TenPaySdkAbTest", "isCertOpen2048 %s", Boolean.TRUE);
            str = C75108e.m90085b().mo104816g("WeChatPay", mD5String3, this.f221013e, 1);
        }
        Log.m105924i("MicroMsg.NetSceneGendigitalcert", "salt " + new String(bArr));
        Log.m105925i("MicroMsg.NetSceneGendigitalcert", "crt_csr: %s", str);
        try {
            map.put("sn_salt", C117627q.m165908a(str2));
            map.put("crt_csr", C117627q.m165908a(str));
            map.put("crt_device_id", mD5String);
            int i3 = C89625d.f257835a;
            map.put("device_os", C87200o.f252868a);
            map.put("device_name", C89625d.f257839e);
        } catch (Exception unused) {
        }
    }

    public int getFuncId() {
        return 1580;
    }

    public int getTenpayCgicmd() {
        return 1580;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/gendigitalcert";
    }

    public boolean isBlock() {
        return this.f221014f;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        Log.m105925i("MicroMsg.NetSceneGendigitalcert", "errCode %d errMsg %s", Integer.valueOf(i), str);
        try {
            String optString = jSONObject2.optString("crt_crt");
            String optString2 = jSONObject2.optString("crt_no");
            C75108e.C75110b bVar = C75108e.C75110b.values()[jSONObject2.optInt("cert_encrypt_type")];
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(414, 0, 1, true);
            if (C75108e.m90085b().mo104813d(optString2, optString, bVar)) {
                nVar.idkeyStat(414, 1, 1, true);
                Log.m105924i("MicroMsg.NetSceneGendigitalcert", "importCert crt_crt success");
                C75140t0.m90125e(optString2, bVar);
            } else {
                nVar.idkeyStat(414, 2, 1, true);
                Log.m105920e("MicroMsg.NetSceneGendigitalcert", "importCert crt_crt fail");
            }
            try {
                int i2 = this.f221012d;
                if (i2 == 1) {
                    nVar.mo160131h(13731, 3);
                } else if (i2 == 2) {
                    nVar.mo160131h(13731, 7);
                }
                Log.m105925i("MicroMsg.NetSceneGendigitalcert", "_crt_crt %s _crt_no %s", MD5Util.getMD5String(optString), optString2);
            } catch (Exception e) {
                e = e;
                Log.printErrStackTrace("MicroMsg.NetSceneGendigitalcert", e, "", new Object[0]);
            }
        } catch (Exception e2) {
            e = e2;
            Log.printErrStackTrace("MicroMsg.NetSceneGendigitalcert", e, "", new Object[0]);
        }
    }

    public void onGYNetEnd2(C75120i iVar, JSONObject jSONObject) {
        C75108e b = C75108e.m90085b();
        b.getClass();
        Log.m105918d("MicroMsg.CertUtilWx", "importCertNone");
        synchronized (b) {
            b.f221024a = false;
        }
        if (iVar.f221053b != 0) {
            int i = this.f221012d;
            if (i == 1) {
                C115669n.INSTANCE.mo160131h(13731, 4);
            } else if (i == 2) {
                C115669n.INSTANCE.mo160131h(13731, 8);
            }
        }
        C75103a aVar = this.f221015g;
        if (aVar == null) {
            return;
        }
        if (!this.f221014f) {
            aVar.mo99663a(this, true);
        } else if (iVar.f221053b == 0) {
            aVar.mo99663a(this, true);
        }
    }

    public C75102b0(String str, String str2, C75103a aVar, boolean z, C75108e.C75110b bVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        this.f221014f = z;
        this.f221012d = 2;
        this.f221013e = bVar;
        baseRequset(hashMap);
        hashMap.put("type", C117627q.m165908a("2"));
        hashMap.put("crt_sms", C117627q.m165908a(str));
        hashMap.put("reqkey", C117627q.m165908a(str2));
        hashMap.put("cert_encrypt_type", C117627q.m165908a(bVar.ordinal() + ""));
        this.f221015g = aVar;
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public C75102b0(String str, String str2, String str3, C75103a aVar, boolean z) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        this.f221012d = 4;
        this.f221015g = aVar;
        this.f221014f = z;
        baseRequset(hashMap);
        hashMap.put("type", C117627q.m165908a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL));
        hashMap.put("id_type", C117627q.m165908a(str));
        hashMap.put("cre_tail", C117627q.m165908a(str2));
        hashMap.put("reqkey", C117627q.m165908a(str3));
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }
}
