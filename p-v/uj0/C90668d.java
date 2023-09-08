package uj0;

import android.content.Context;
import android.util.Base64;
import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.LinkedList;
import ob0.C47350c;
import p547hb.C87464c;
import p823sg.C90193h;
import pe3.C89349b;
import te3.C50304ls1;
import te3.C51871ws3;
import te3.C52015xs3;
import te3.d65;

/* renamed from: uj0.d */
public class C90668d {

    /* renamed from: a */
    public d65 f260488a;

    /* renamed from: b */
    public WeakReference<AppBrandRuntime> f260489b;

    /* renamed from: c */
    public MMHandler f260490c = new MMHandler("canvas_security_guard");

    /* renamed from: d */
    public PublicKey f260491d;

    /* renamed from: uj0.d$a */
    public class C90669a implements C40324j.C40326a {
        public C90669a(C90668d dVar) {
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m105925i("MicroMsg.WAGameCanvasSecurityGuard", "hy: trigger upload with data: %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    public C90668d(d65 d65, AppBrandRuntime appBrandRuntime) {
        C89349b bVar;
        byte[] bArr;
        this.f260488a = d65;
        this.f260489b = new WeakReference<>(appBrandRuntime);
        d65 d652 = this.f260488a;
        if (d652 == null || (bVar = d652.f182638f) == null || (bArr = bVar.f257327a) == null) {
            Log.m105928w("MicroMsg.WAGameCanvasSecurityGuard", "hy: no pubkey retrieved");
            this.f260491d = null;
            return;
        }
        try {
            this.f260491d = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new String(bArr).replace("\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WAGameCanvasSecurityGuard", th, "hy: can not retrieve rsa key!", new Object[0]);
            this.f260491d = null;
        }
        Log.m105919d("MicroMsg.WAGameCanvasSecurityGuard", "hy: sample config: %s", this.f260488a.f182637e);
    }

    /* renamed from: a */
    public static boolean m113651a(C90668d dVar) {
        d65 d65;
        if (dVar.f260489b.get() == null || (d65 = dVar.f260488a) == null || d65.f182639g == 0) {
            return false;
        }
        int netType = NetStatusUtil.getNetType((Context) dVar.f260489b.get().mo113026R());
        Log.m105919d("MicroMsg.WAGameCanvasSecurityGuard", "hy: isNetworkMatch netType:%d,SampleNetworkBits:%d", Integer.valueOf(netType), Integer.valueOf(dVar.f260488a.f182639g));
        int i = dVar.f260488a.f182639g;
        return ((i == 1 || i == 3) && netType == 0) || ((i == 2 || i == 3) && netType == 10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m113652b(uj0.C90668d r10, java.lang.String r11, android.graphics.Bitmap r12) {
        /*
            te3.d65 r0 = r10.f260488a
            int r1 = r0.f182640h
            int r0 = r0.f182641i
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.WAGameCanvasSecurityGuard"
            java.lang.String r6 = "hy: server sample: %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
            if (r1 <= 0) goto L_0x0068
            if (r0 <= 0) goto L_0x0068
            r2 = 100
            if (r0 > r2) goto L_0x0068
            if (r1 <= r2) goto L_0x0029
            goto L_0x0068
        L_0x0029:
            float r1 = (float) r1
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
            r2[r4] = r6
            java.lang.String r6 = "hy: scale: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r2)
            int r2 = r12.getWidth()
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = (int) r2
            int r6 = r12.getHeight()
            float r6 = (float) r6
            float r6 = r6 * r1
            int r1 = (int) r6
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createScaledBitmap(r12, r2, r1, r4)
            if (r12 != 0) goto L_0x0056
            java.lang.String r12 = "hy: scaled is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r12)
            goto L_0x0068
        L_0x0056:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
            r12.compress(r2, r0, r1)
            byte[] r12 = r1.toByteArray()
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r1)
            goto L_0x0069
        L_0x0068:
            r12 = 0
        L_0x0069:
            if (r12 == 0) goto L_0x00b5
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 117(0x75, float:1.64E-43)
            r0.<init>(r1)
            byte[] r2 = new byte[r1]     // Catch:{ Exception -> 0x009c }
            int r6 = r12.length     // Catch:{ Exception -> 0x009c }
            int r6 = r6 / r1
            int r6 = r6 + r5
            r7 = 0
        L_0x0078:
            if (r7 >= r6) goto L_0x009e
            int r8 = r7 * 117
            int r9 = r12.length     // Catch:{ Exception -> 0x009c }
            int r9 = r9 - r8
            int r9 = java.lang.Math.min(r1, r9)     // Catch:{ Exception -> 0x009c }
            java.lang.System.arraycopy(r12, r8, r2, r4, r9)     // Catch:{ Exception -> 0x009c }
            java.security.PublicKey r8 = r10.f260491d     // Catch:{ Exception -> 0x009c }
            java.lang.String r9 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r9 = javax.crypto.Cipher.getInstance(r9)     // Catch:{ Exception -> 0x009c }
            r9.init(r5, r8)     // Catch:{ Exception -> 0x009c }
            byte[] r8 = r9.doFinal(r2)     // Catch:{ Exception -> 0x009c }
            r0.write(r8)     // Catch:{ Exception -> 0x009c }
            int r7 = r7 + 1
            goto L_0x0078
        L_0x009a:
            r10 = move-exception
            goto L_0x00b1
        L_0x009c:
            r10 = move-exception
            goto L_0x00a6
        L_0x009e:
            byte[] r12 = r0.toByteArray()     // Catch:{ Exception -> 0x009c }
            r10.mo124815g(r11, r12)     // Catch:{ Exception -> 0x009c }
            goto L_0x00ad
        L_0x00a6:
            java.lang.String r11 = "hy: enc failed!"
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x009a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r10, r11, r12)     // Catch:{ all -> 0x009a }
        L_0x00ad:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
            goto L_0x00ba
        L_0x00b1:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
            throw r10
        L_0x00b5:
            java.lang.String r10 = "hy: compress failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r10)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uj0.C90668d.m113652b(uj0.d, java.lang.String, android.graphics.Bitmap):void");
    }

    /* renamed from: c */
    public final C83928t1 mo124811c() {
        if (this.f260489b.get() != null && this.f260489b.get().mo113042Z() != null && this.f260489b.get().mo113042Z().getCurrentPage() != null && (this.f260489b.get().mo113042Z().getCurrentPage().getCurrentPageView() instanceof C83928t1)) {
            return (C83928t1) this.f260489b.get().mo113042Z().getCurrentPage().getCurrentPageView();
        }
        Log.m105928w("MicroMsg.WAGameCanvasSecurityGuard", "hy: runtime released");
        return null;
    }

    /* renamed from: d */
    public final C87464c mo124812d() {
        if (mo124811c() != null) {
            return (C87464c) mo124811c().mo116150E0(C87464c.class);
        }
        Log.m105928w("MicroMsg.WAGameCanvasSecurityGuard", "hy: GamePageLogicExt not found");
        return null;
    }

    /* renamed from: e */
    public final boolean mo124813e() {
        boolean z;
        if (!(mo124812d() == null || mo124812d().mo111251c() == null)) {
            C80301a magicBrush = mo124812d().mo111251c().getMagicBrush();
            synchronized (magicBrush) {
                z = magicBrush.f235052a == 0;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo124814f() {
        Log.m105918d("MicroMsg.WAGameCanvasSecurityGuard", "hy: triggerMakeCanvasBitmap");
        if (this.f260488a == null || mo124812d() == null || Util.isNullOrNil(this.f260488a.f182637e) || !this.f260488a.f182636d || this.f260491d == null) {
            Log.m105928w("MicroMsg.WAGameCanvasSecurityGuard", "hy: should not do make canvas bitmap!");
        } else if (mo124813e()) {
            mo124812d().mo111260i();
        }
    }

    /* renamed from: g */
    public final void mo124815g(String str, byte[] bArr) {
        if (bArr.length > 204800) {
            Log.m105929w("MicroMsg.WAGameCanvasSecurityGuard", "triggerUploadWithData exceed max limit upload size: %d, max: %d", Integer.valueOf(bArr.length), 204800);
        } else if (this.f260489b.get() == null) {
            Log.m105928w("MicroMsg.WAGameCanvasSecurityGuard", "hy: runtime released when triggerUploadWithData");
        } else {
            String str2 = this.f260489b.get().f238147j;
            int i = this.f260489b.get().mo113051d0().f261072r.pkgVersion;
            int i2 = this.f260489b.get().mo113051d0().f261072r.f238585d;
            String f = C90193h.m112878f(bArr);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C51871ws3();
            bVar.f127067b = new C52015xs3();
            bVar.f127069d = 12630;
            bVar.f127068c = "/cgi-bin/mmgame-bin/reportserverdata";
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            C51871ws3 ws32 = (C51871ws3) a.f127055a.f127080a;
            ws32.f144247d = new LinkedList<>();
            C50304ls1 ls12 = new C50304ls1();
            ls12.f137623d = str2;
            ls12.f137625f = i2;
            ls12.f137624e = i;
            ls12.f137628i = str;
            ls12.f137627h = f;
            ls12.f137626g = C89349b.m111674a(bArr);
            ws32.f144247d.add(ls12);
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C90669a(this));
        }
    }
}
