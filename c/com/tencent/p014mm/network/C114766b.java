package com.tencent.p014mm.network;

import android.text.TextUtils;
import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import f40.C86709a0;
import java.nio.charset.StandardCharsets;
import te3.C49569gj3;
import te3.C51018qv3;

/* renamed from: com.tencent.mm.network.b */
public class C114766b {

    /* renamed from: e */
    public static C114766b f344135e = new C114766b();

    /* renamed from: a */
    public C49569gj3 f344136a = new C49569gj3();

    /* renamed from: b */
    public String f344137b = "";

    /* renamed from: c */
    public String f344138c = "";

    /* renamed from: d */
    public long f344139d = 0;

    /* renamed from: com.tencent.mm.network.b$a */
    public static class C114767a {

        /* renamed from: a */
        public String f344140a = "";

        /* renamed from: b */
        public String f344141b = "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo174416a() {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.f344139d
            long r0 = r0 - r2
            r2 = 1
            r3 = 0
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            java.lang.String r0 = r7.f344138c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = r7.f344137b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 != 0) goto L_0x0028
        L_0x0026:
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x0116
            byte[][] r0 = com.tencent.p014mm.jni.utils.UtilsJni.ecdsaGeneralOctKeyPair()
            java.lang.String r1 = "CgiSignerPublicAndPrivateKey"
            if (r0 == 0) goto L_0x00f3
            int r4 = r0.length
            if (r4 == 0) goto L_0x00f3
            int r4 = r0.length
            if (r4 != r2) goto L_0x003b
            goto L_0x00f3
        L_0x003b:
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00d9 }
            r5 = r0[r3]     // Catch:{ Exception -> 0x00d9 }
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ Exception -> 0x00d9 }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x00d9 }
            r7.f344138c = r4     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00d9 }
            r0 = r0[r2]     // Catch:{ Exception -> 0x00d9 }
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ Exception -> 0x00d9 }
            r4.<init>(r0, r5)     // Catch:{ Exception -> 0x00d9 }
            r7.f344137b = r4     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r0 = r7.f344138c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = r7.f344137b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0063
            r0 = 1
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r0 != 0) goto L_0x0090
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "public or private key is empty, public key is empty: "
            r0.append(r2)
            java.lang.String r2 = r7.f344138c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r0.append(r2)
            java.lang.String r2 = ", private key is empty: "
            r0.append(r2)
            java.lang.String r2 = r7.f344137b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x010b
        L_0x0090:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "public key length "
            r0.append(r3)
            java.lang.String r3 = r7.f344138c
            int r3 = r3.length()
            r0.append(r3)
            java.lang.String r3 = " private key length "
            r0.append(r3)
            java.lang.String r3 = r7.f344137b
            int r3 = r3.length()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            long r3 = java.lang.System.currentTimeMillis()
            r7.f344139d = r3
            te3.gj3 r0 = r7.f344136a
            te3.qv3 r3 = new te3.qv3
            r3.<init>()
            java.lang.String r4 = r7.f344138c
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.ISO_8859_1
            byte[] r4 = r4.getBytes(r5)
            r3.mo73350k(r4)
            r0.f134079e = r3
            te3.gj3 r0 = r7.f344136a
            r3 = 415(0x19f, float:5.82E-43)
            r0.f134078d = r3
            goto L_0x010c
        L_0x00d9:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "gen keypair failed: "
            r2.append(r4)
            java.lang.String r0 = r0.getLocalizedMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x010b
        L_0x00f3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "gen keypair failed "
            r4.append(r5)
            if (r0 != 0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r2 = 0
        L_0x0101:
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
        L_0x010b:
            r2 = 0
        L_0x010c:
            if (r2 != 0) goto L_0x0116
            java.lang.String r0 = "gen keypair failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            java.lang.String r0 = ""
            return r0
        L_0x0116:
            java.lang.String r0 = r7.f344138c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C114766b.mo174416a():java.lang.String");
    }

    /* renamed from: b */
    public final void mo174417b() {
        if (TextUtils.isEmpty(this.f344137b) || TextUtils.isEmpty(this.f344138c)) {
            try {
                String[] F3 = C86709a0.m107529k().f251779b.f256809d.mo55447F3();
                boolean z = true;
                if (F3 == null || F3.length != 2 || TextUtils.isEmpty(F3[0]) || TextUtils.isEmpty(F3[1])) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("backup key is empty ");
                    if (F3 != null) {
                        z = false;
                    }
                    sb.append(z);
                    Log.m105928w("CgiSignerPublicAndPrivateKey", sb.toString());
                    return;
                }
                this.f344138c = F3[0];
                this.f344137b = F3[1];
                Log.m105928w("CgiSignerPublicAndPrivateKey", "origin key is empty, use backup key " + this.f344138c.length() + " " + this.f344137b.length());
                C49569gj3 gj32 = this.f344136a;
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(this.f344138c.getBytes(StandardCharsets.ISO_8859_1));
                gj32.f134079e = qv32;
                this.f344136a.f134078d = v2helper.EMethodOutputVolumeScaleEnable;
            } catch (Exception e) {
                Log.m105920e("CgiSignerPublicAndPrivateKey", "try restore key from push failed " + e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: c */
    public String mo174418c(String str) {
        mo174417b();
        try {
            byte[] ecdsaSignWithOctKey = UtilsJni.ecdsaSignWithOctKey(this.f344137b.getBytes(StandardCharsets.ISO_8859_1), str.getBytes(StandardCharsets.ISO_8859_1));
            if (ecdsaSignWithOctKey == null) {
                Log.m105920e("CgiSignerPublicAndPrivateKey", "sign result is null ");
                return "";
            }
            Log.m105918d("CgiSignerPublicAndPrivateKey", "sign result length " + ecdsaSignWithOctKey.length);
            return new String(ecdsaSignWithOctKey, StandardCharsets.ISO_8859_1);
        } catch (Exception e) {
            Log.m105920e("CgiSignerPublicAndPrivateKey", "sign data failed " + e.getLocalizedMessage());
            return "";
        }
    }

    /* renamed from: d */
    public byte[] mo174419d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        mo174417b();
        try {
            byte[] ecdsaSignWithOctKey = UtilsJni.ecdsaSignWithOctKey(this.f344137b.getBytes(StandardCharsets.ISO_8859_1), bArr);
            if (ecdsaSignWithOctKey == null) {
                Log.m105920e("CgiSignerPublicAndPrivateKey", "sign result is null ");
                return null;
            }
            Log.m105918d("CgiSignerPublicAndPrivateKey", "sign byte result length " + ecdsaSignWithOctKey.length);
            return ecdsaSignWithOctKey;
        } catch (Exception e) {
            Log.m105920e("CgiSignerPublicAndPrivateKey", "sign data byte failed " + e.getLocalizedMessage());
            return null;
        }
    }
}
