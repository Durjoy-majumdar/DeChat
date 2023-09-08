package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.ndk.CertUtil;
import com.tenpay.ndk.MessageDigestUtil;
import f40.C86709a0;
import p156gj.C87203t;
import p823sg.C77710q;

/* renamed from: com.tencent.mm.wallet_core.model.d */
public class C75105d {

    /* renamed from: c */
    public static C75105d f221017c;

    /* renamed from: d */
    public static boolean f221018d;

    /* renamed from: a */
    public boolean f221019a = false;

    /* renamed from: b */
    public CertUtil.EventListener f221020b = new C75106a(this);

    /* renamed from: com.tencent.mm.wallet_core.model.d$a */
    public class C75106a implements CertUtil.EventListener {
        public C75106a(C75105d dVar) {
        }

        public String getUniqueID() {
            String f = C87203t.m108270f(false);
            return Util.isNullOrNil(f) ? C87203t.m108273i() : f;
        }

        public void onEvent(int i, String str) {
            Log.m105925i("MicroMsg.CertUtilWx", "code ret: %s %s", Integer.valueOf(i), str);
        }
    }

    /* renamed from: e */
    public static C75105d m90074e() {
        if (f221017c == null) {
            f221017c = new C75105d();
        }
        return f221017c;
    }

    /* renamed from: a */
    public void mo104798a(String str) {
        Log.m105919d("MicroMsg.CertUtilWx", "clearCert stack %s", Util.getStack().toString());
        CertUtil.getInstance().clearCert(str);
    }

    /* renamed from: b */
    public void mo104799b(String str) {
        Log.m105919d("MicroMsg.CertUtilWx", "clearToken stack %s", Util.getStack().toString());
        CertUtil.getInstance().clearToken(str);
    }

    /* renamed from: c */
    public String mo104800c(String str, String str2) {
        Log.m105919d("MicroMsg.CertUtilWx", "genUserSig stack %s", Util.getStack().toString());
        return CertUtil.getInstance().genUserSig(str, str2);
    }

    /* renamed from: d */
    public String mo104801d(String str, int i) {
        Log.m105925i("MicroMsg.CertUtilWx", "getCertApplyCSR lock %s %s", Util.getStack().toString(), Integer.valueOf(i));
        synchronized (this) {
            if (this.f221019a) {
                Log.m105924i("MicroMsg.CertUtilWx", "isCert_Wating");
                return "";
            }
            this.f221019a = true;
            String certApplyCSR = CertUtil.getInstance().getCertApplyCSR(str, i);
            return certApplyCSR;
        }
    }

    /* renamed from: f */
    public int mo104802f() {
        Log.m105919d("MicroMsg.CertUtilWx", "getLastError stack %s", Util.getStack().toString());
        return CertUtil.getInstance().getLastError();
    }

    /* renamed from: g */
    public String mo104803g(String str) {
        Log.m105919d("MicroMsg.CertUtilWx", "getToken stack %s", Util.getStack().toString());
        return CertUtil.getInstance().getToken(str);
    }

    /* renamed from: h */
    public boolean mo104804h(String str, String str2) {
        boolean importCert;
        Log.m105925i("MicroMsg.CertUtilWx", "importCert  cid %s cert %s stack %s", str, str2, Util.getStack().toString());
        synchronized (this) {
            this.f221019a = false;
            importCert = CertUtil.getInstance().importCert(str, str2);
        }
        Log.m105925i("MicroMsg.CertUtilWx", "importCert %s", Boolean.valueOf(importCert));
        return importCert;
    }

    /* renamed from: i */
    public void mo104805i(Context context) {
        if (!f221018d) {
            Log.m105919d("MicroMsg.CertUtilWx", "init  %s", Util.getStack().toString());
            CertUtil.getInstance().init(context, this.f221020b);
            f221018d = true;
        }
    }

    /* renamed from: j */
    public boolean mo104806j(String str) {
        Log.m105919d("MicroMsg.CertUtilWx", "isCertExist stack %s", Util.getStack().toString());
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(414, 5, 1, true);
        boolean isCertExist = CertUtil.getInstance().isCertExist(str);
        nVar.idkeyStat(414, 6, 1, true);
        return isCertExist;
    }

    /* renamed from: k */
    public boolean mo104807k(String str, String str2, boolean z) {
        String str3;
        if (z) {
            MessageDigestUtil messageDigestUtil = new MessageDigestUtil();
            C86709a0.m107528h();
            String a = C77710q.m93738a(C86709a0.m107523b().mo121110g());
            byte[] bArr = new byte[16];
            byte[] bytes = messageDigestUtil.getSHA256Hex((a + "_" + "pUI6cNqzLt2Z3mQSrYuF09XSGsBtTIcUgp9jcWZ7F7BBs8/DFVFMKiwbtaRPOiLE").getBytes()).getBytes();
            int i = 0;
            while (i < 16 && i < bytes.length) {
                bArr[i] = bytes[i];
                i++;
            }
            str3 = new String(bArr);
        } else {
            str3 = "";
        }
        Log.m105919d("MicroMsg.CertUtilWx", "setTokens stack v2 useSm4 %s sm4Key %s %s", Boolean.valueOf(z), str3, Util.getStack().toString());
        boolean tokens = CertUtil.getInstance().setTokens(str, str2, z, str3);
        Log.m105919d("MicroMsg.CertUtilWx", "setTokens result ret:%s", Boolean.valueOf(tokens));
        return tokens;
    }
}
