package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.KGenDigitalCrtReq;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.wallet_core.model.C7088m0;
import com.tencent.p014mm.wallet_core.model.C75108e;
import com.tencent.p014mm.wallet_core.model.C75120i;
import com.tencent.p014mm.wallet_core.model.C75140t0;
import com.tencent.xweb.WCWebUpdater;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p156gj.C87200o;
import p156gj.C87203t;
import p206nj.C117627q;
import p823sg.C77710q;
import qe3.C89625d;
import yq3.C79144b;

public class NetSceneKindaGenDigitalCert extends C75790l {
    private final String TAG = "kinda.NetSceneKindaGenDigitalCert";
    public C75108e.C75110b certEncryptType;

    /* renamed from: com.tencent.kinda.framework.module.impl.NetSceneKindaGenDigitalCert$1 */
    public static /* synthetic */ class C675431 {

        /* renamed from: $SwitchMap$com$tencent$mm$wallet_core$model$CertUtilWxNew$DigitalCertEncryptType */
        public static final /* synthetic */ int[] f193402x403d044a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
        static {
            /*
                com.tencent.mm.wallet_core.model.e$b[] r0 = com.tencent.p014mm.wallet_core.model.C75108e.C75110b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f193402x403d044a = r0
                r1 = 1
                r2 = 2
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                int[] r0 = f193402x403d044a     // Catch:{ NoSuchFieldError -> 0x0011 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r0 = f193402x403d044a     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1 = 0
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.module.impl.NetSceneKindaGenDigitalCert.C675431.<clinit>():void");
        }
    }

    public NetSceneKindaGenDigitalCert(KGenDigitalCrtReq kGenDigitalCrtReq) {
        C75108e.C75110b bVar = C75108e.C75110b.DigitalCertEncryptTypeRSA;
        this.certEncryptType = bVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int certEncryptType2 = kGenDigitalCrtReq.getCertEncryptType();
        Log.m105925i("kinda.NetSceneKindaGenDigitalCert", "encrypt type: %d", Integer.valueOf(certEncryptType2));
        if (certEncryptType2 < 0 || certEncryptType2 > 2) {
            this.certEncryptType = bVar;
        } else {
            this.certEncryptType = C75108e.C75110b.values()[certEncryptType2];
        }
        hashMap.put("cert_encrypt_type", C117627q.m165908a(this.certEncryptType.ordinal() + ""));
        baseRequset(hashMap);
        int i = kGenDigitalCrtReq.mType;
        if (i == 1) {
            hashMap.put("type", C117627q.m165908a("1"));
            hashMap.put("id_no", C117627q.m165908a(kGenDigitalCrtReq.getIdNo()));
            hashMap.put("id_type", C117627q.m165908a(kGenDigitalCrtReq.getIdType() + ""));
        } else if (i == 2) {
            hashMap.put("type", C117627q.m165908a("2"));
            hashMap.put("crt_sms", C117627q.m165908a(kGenDigitalCrtReq.getVerifyCode()));
            hashMap.put("reqkey", C117627q.m165908a(kGenDigitalCrtReq.getReqKey()));
        } else if (i == 3) {
            hashMap.put("type", C117627q.m165908a("3"));
            hashMap.put("crt_token", C117627q.m165908a(kGenDigitalCrtReq.getToken()));
        } else if (i == 4) {
            hashMap.put("type", C117627q.m165908a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL));
            hashMap.put("id_type", C117627q.m165908a(kGenDigitalCrtReq.getIdType() + ""));
            hashMap.put("cre_tail", C117627q.m165908a(kGenDigitalCrtReq.getCreTail()));
            hashMap.put("reqkey", C117627q.m165908a(kGenDigitalCrtReq.getReqKey()));
        } else {
            Log.m105920e("kinda.NetSceneKindaGenDigitalCert", "KGenDigitalCrtReq.mType is illeagl.");
        }
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    private void baseRequset(Map<String, String> map) {
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
        int ordinal = this.certEncryptType.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            str = C75108e.m90085b().mo104816g("WeChatPay", sb4, this.certEncryptType, 0);
        } else {
            String mD5String3 = MD5Util.getMD5String(a + mD5String + new String(bArr));
            C79144b.m95773a().getClass();
            Log.m105925i("MicroMsg.TenPaySdkAbTest", "isCertOpen2048 %s", Boolean.TRUE);
            str = C75108e.m90085b().mo104816g("WeChatPay", mD5String3, this.certEncryptType, 1);
        }
        Log.m105924i("kinda.NetSceneKindaGenDigitalCert", "salt " + new String(bArr));
        Log.m105925i("kinda.NetSceneKindaGenDigitalCert", "crt_csr: %s", str);
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

    public int getType() {
        return 1580;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/gendigitalcert";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }

    public void onGYNetEnd2(C75120i iVar, JSONObject jSONObject) {
        super.onGYNetEnd2(iVar, jSONObject);
        Log.m105925i("kinda.NetSceneKindaGenDigitalCert", "errCode %d errMsg %s", Integer.valueOf(iVar.f221053b), iVar.f221054c);
        try {
            String optString = jSONObject.optString("crt_crt");
            String optString2 = jSONObject.optString("crt_no");
            C75108e.C75110b bVar = C75108e.C75110b.values()[jSONObject.optInt("cert_encrypt_type")];
            if (iVar.f221053b != 0) {
                C75108e b = C75108e.m90085b();
                b.getClass();
                Log.m105918d("MicroMsg.CertUtilWx", "importCertNone");
                synchronized (b) {
                    b.f221024a = false;
                }
                Log.m105920e("kinda.NetSceneKindaGenDigitalCert", " importCert crt_crt was not executed because of cgi resp error");
            } else if (C75108e.m90085b().mo104813d(optString2, optString, bVar)) {
                Log.m105924i("kinda.NetSceneKindaGenDigitalCert", "importCert crt_crt success");
                C75140t0.m90125e(optString2, bVar);
            } else {
                Log.m105920e("kinda.NetSceneKindaGenDigitalCert", "importCert crt_crt fail");
            }
            Log.m105925i("kinda.NetSceneKindaGenDigitalCert", "_crt_crt %s _crt_no %s", MD5Util.getMD5String(optString), optString2);
        } catch (Exception e) {
            Log.printErrStackTrace("kinda.NetSceneKindaGenDigitalCert", e, "", new Object[0]);
        }
    }
}
