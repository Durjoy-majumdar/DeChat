package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import android.util.Base64;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tenpay.ndk.CertUtil;
import com.tenpay.ndk.WxSmCertUtil;
import f40.C86709a0;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.wallet_core.model.e */
public class C75108e {

    /* renamed from: c */
    public static C75108e f221022c;

    /* renamed from: d */
    public static boolean f221023d;

    /* renamed from: a */
    public boolean f221024a = false;

    /* renamed from: b */
    public CertUtil.EventListener f221025b = new C75109a(this);

    /* renamed from: com.tencent.mm.wallet_core.model.e$a */
    public class C75109a implements CertUtil.EventListener {
        public C75109a(C75108e eVar) {
        }

        public String getUniqueID() {
            String f = C87203t.m108270f(false);
            return Util.isNullOrNil(f) ? C87203t.m108273i() : f;
        }

        public void onEvent(int i, String str) {
            Log.m105925i("MicroMsg.CertUtilWx", "code ret: %s %s", Integer.valueOf(i), str);
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.e$b */
    public enum C75110b {
        DigitalCertEncryptTypeRSA,
        DigitalCertEncryptTypeCa,
        DigitalCertEncryptTypeTw
    }

    /* renamed from: b */
    public static C75108e m90085b() {
        if (f221022c == null) {
            f221022c = new C75108e();
        }
        return f221022c;
    }

    /* renamed from: a */
    public String mo104811a(String str, byte[] bArr) {
        Log.m105919d("MicroMsg.CertUtilWx", "genUserSig stack %s", Util.getStack().toString());
        C86709a0.m107528h();
        int ordinal = C75110b.values()[C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_WALLETDIGITAL_CERT_ENCRYPT_TYPE_INT_SYNC, 0)].ordinal();
        if (ordinal != 1 && ordinal != 2) {
            return CertUtil.getInstance().genUserSig(str, bArr);
        }
        String encodeToString = Base64.encodeToString(WxSmCertUtil.getInstance().certSign(str, bArr, "1234567812345678".getBytes()), 2);
        if (Util.isNullOrNil(encodeToString)) {
            Log.m105918d("MicroMsg.CertUtilWx", "genUserSig is nil");
        }
        return encodeToString;
    }

    /* renamed from: c */
    public int mo104812c() {
        Log.m105919d("MicroMsg.CertUtilWx", "getLastError stack %s", Util.getStack().toString());
        C86709a0.m107528h();
        int ordinal = C75110b.values()[C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_WALLETDIGITAL_CERT_ENCRYPT_TYPE_INT_SYNC, 0)].ordinal();
        return (ordinal == 1 || ordinal == 2) ? WxSmCertUtil.getInstance().getLastError() : CertUtil.getInstance().getLastError();
    }

    /* renamed from: d */
    public boolean mo104813d(String str, String str2, C75110b bVar) {
        boolean importCert;
        Log.m105925i("MicroMsg.CertUtilWx", "importCert  cid %s cert %s certType %d stack %s", str, str2, Integer.valueOf(bVar.ordinal()), Util.getStack().toString());
        synchronized (this) {
            this.f221024a = false;
            int ordinal = bVar.ordinal();
            importCert = (ordinal == 1 || ordinal == 2) ? WxSmCertUtil.getInstance().importCert(str, str2, false) : CertUtil.getInstance().importCert(str, str2);
        }
        Log.m105925i("MicroMsg.CertUtilWx", "importCert %s", Boolean.valueOf(importCert));
        return importCert;
    }

    /* renamed from: e */
    public void mo104814e(Context context) {
        if (!f221023d) {
            Log.m105919d("MicroMsg.CertUtilWx", "init  %s", Util.getStack().toString());
            CertUtil.getInstance().init(context, this.f221025b);
            String str = context.getFilesDir().getParentFile().getAbsolutePath() + "/smcertnew";
            WxSmCertUtil instance = WxSmCertUtil.getInstance();
            String f = C87203t.m108270f(false);
            if (Util.isNullOrNil(f)) {
                f = C87203t.m108273i();
            }
            instance.init(str, f, "", "1234567812345678");
            f221023d = true;
        }
    }

    /* renamed from: f */
    public boolean mo104815f(String str) {
        if (str.length() == 0) {
            Log.m105918d("MicroMsg.CertUtilWx", "cid length is 0");
            return false;
        }
        Log.m105919d("MicroMsg.CertUtilWx", "isCertExist stack %s", Util.getStack().toString());
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(414, 5, 1, true);
        if (CertUtil.getInstance().isCertExist(str)) {
            nVar.idkeyStat(414, 6, 1, true);
            return true;
        } else if (!WxSmCertUtil.getInstance().hasCert(str)) {
            return false;
        } else {
            nVar.idkeyStat(414, 6, 1, true);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        return r8;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo104816g(java.lang.String r8, java.lang.String r9, com.tencent.p014mm.wallet_core.model.C75108e.C75110b r10, int r11) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.CertUtilWx"
            java.lang.String r1 = "makeCSR lock %s %s"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.mm.sdk.platformtools.MMStack r4 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r4 = r4.toString()
            r5 = 0
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r6 = 1
            r3[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            monitor-enter(r7)
            boolean r0 = r7.f221024a     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x002c
            java.lang.String r8 = "MicroMsg.CertUtilWx"
            java.lang.String r9 = "isCert_Wating"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = ""
            monitor-exit(r7)     // Catch:{ all -> 0x0084 }
            return r8
        L_0x002c:
            r7.f221024a = r6     // Catch:{ all -> 0x0084 }
            int r10 = r10.ordinal()     // Catch:{ all -> 0x0084 }
            if (r10 == r6) goto L_0x005d
            if (r10 == r2) goto L_0x005d
            com.tenpay.ndk.CertUtil r8 = com.tenpay.ndk.CertUtil.getInstance()     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = r8.getCertApplyCSR(r9, r11)     // Catch:{ all -> 0x0084 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ all -> 0x0084 }
            if (r9 == 0) goto L_0x005b
            java.lang.String r9 = "MicroMsg.CertUtilWx"
            java.lang.String r10 = "csr nil.%d"
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0084 }
            com.tenpay.ndk.WxSmCertUtil r0 = com.tenpay.ndk.WxSmCertUtil.getInstance()     // Catch:{ all -> 0x0084 }
            int r0 = r0.getLastError()     // Catch:{ all -> 0x0084 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0084 }
            r11[r5] = r0     // Catch:{ all -> 0x0084 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r11)     // Catch:{ all -> 0x0084 }
        L_0x005b:
            monitor-exit(r7)     // Catch:{ all -> 0x0084 }
            return r8
        L_0x005d:
            com.tenpay.ndk.WxSmCertUtil r10 = com.tenpay.ndk.WxSmCertUtil.getInstance()     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = r10.makeCsr(r8, r9)     // Catch:{ all -> 0x0084 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ all -> 0x0084 }
            if (r9 == 0) goto L_0x0082
            java.lang.String r9 = "MicroMsg.CertUtilWx"
            java.lang.String r10 = "csr nil.%d"
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0084 }
            com.tenpay.ndk.WxSmCertUtil r0 = com.tenpay.ndk.WxSmCertUtil.getInstance()     // Catch:{ all -> 0x0084 }
            int r0 = r0.getLastError()     // Catch:{ all -> 0x0084 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0084 }
            r11[r5] = r0     // Catch:{ all -> 0x0084 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r11)     // Catch:{ all -> 0x0084 }
        L_0x0082:
            monitor-exit(r7)     // Catch:{ all -> 0x0084 }
            return r8
        L_0x0084:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0084 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.model.C75108e.mo104816g(java.lang.String, java.lang.String, com.tencent.mm.wallet_core.model.e$b, int):java.lang.String");
    }
}
