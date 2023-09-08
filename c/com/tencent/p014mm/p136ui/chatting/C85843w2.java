package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import m83.C10769b;
import m83.C10770c;
import m83.C10771d;

/* renamed from: com.tencent.mm.ui.chatting.w2 */
public class C85843w2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C73843s2 f250042d;

    /* renamed from: com.tencent.mm.ui.chatting.w2$a */
    public class C74334a implements Runnable {
        public C74334a() {
        }

        public void run() {
            if (Util.isNullOrNil(C85843w2.this.f250042d.f216698m) || Util.isNullOrNil(C85843w2.this.f250042d.f216699n)) {
                C73843s2.m87479a(C85843w2.this.f250042d);
                return;
            }
            C10770c cVar = new C10770c(C85843w2.this.f250042d.f216687b);
            cVar.f32244b = "mmdownloadapp_rQ8fhvGmzxUTY19Pce";
            ((C10771d) C86312j.m106911c(C10771d.class)).mo10782yz(cVar, (C10769b) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.w2$b */
    public class C74335b implements Runnable {
        public C74335b() {
        }

        public void run() {
            C73843s2.m87479a(C85843w2.this.f250042d);
        }
    }

    public C85843w2(C73843s2 s2Var) {
        this.f250042d = s2Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b3 A[SYNTHETIC, Splitter:B:21:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0 A[SYNTHETIC, Splitter:B:29:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            java.lang.String r0 = "mQQMailRedirectUrl: %s download url:%s, md5:%s"
            java.lang.String r1 = "MicroMsg.ChattingQQMailFooterHandler"
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            r6 = 0
            java.net.URL r7 = new java.net.URL     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            com.tencent.mm.ui.chatting.s2 r8 = r11.f250042d     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            java.lang.String r8 = r8.f216697l     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            r7.<init>(r8)     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            java.net.URLConnection r7 = r7.openConnection()     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            r7.setInstanceFollowRedirects(r5)     // Catch:{ Exception -> 0x009a }
            r7.connect()     // Catch:{ Exception -> 0x009a }
            com.tencent.mm.ui.chatting.s2 r6 = r11.f250042d     // Catch:{ Exception -> 0x009a }
            java.lang.String r8 = "Location"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch:{ Exception -> 0x009a }
            r6.f216698m = r8     // Catch:{ Exception -> 0x009a }
            java.io.InputStream r6 = r7.getInputStream()     // Catch:{ Exception -> 0x009a }
            java.lang.String r8 = "Content-Length"
            r9 = -1
            int r8 = r7.getHeaderFieldInt(r8, r9)     // Catch:{ Exception -> 0x009a }
            if (r8 > 0) goto L_0x003e
            java.lang.String r8 = "error content-length"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)     // Catch:{ Exception -> 0x009a }
            r6.close()     // Catch:{ Exception -> 0x009a }
            goto L_0x0073
        L_0x003e:
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x009a }
            r6.read(r8)     // Catch:{ Exception -> 0x009a }
            r6.close()     // Catch:{ Exception -> 0x009a }
            com.tencent.mm.ui.chatting.s2 r6 = r11.f250042d     // Catch:{ Exception -> 0x009a }
            android.content.Context r6 = r6.f216687b     // Catch:{ Exception -> 0x009a }
            java.lang.String r9 = "rsa_public_key_forwx.pem"
            java.security.PublicKey r6 = p823sg.C90195n.m112883a(r6, r9)     // Catch:{ Exception -> 0x009a }
            byte[] r8 = android.util.Base64.decode(r8, r5)     // Catch:{ Exception -> 0x009a }
            java.lang.String r9 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r9 = javax.crypto.Cipher.getInstance(r9)     // Catch:{ Exception -> 0x009a }
            r9.init(r2, r6)     // Catch:{ Exception -> 0x009a }
            byte[] r6 = r9.doFinal(r8)     // Catch:{ Exception -> 0x009a }
            com.tencent.mm.ui.chatting.s2 r8 = r11.f250042d     // Catch:{ Exception -> 0x009a }
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x009a }
            r9.<init>(r6)     // Catch:{ Exception -> 0x009a }
            r8.f216699n = r9     // Catch:{ Exception -> 0x009a }
            com.tencent.mm.ui.chatting.w2$a r6 = new com.tencent.mm.ui.chatting.w2$a     // Catch:{ Exception -> 0x009a }
            r6.<init>()     // Catch:{ Exception -> 0x009a }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r6)     // Catch:{ Exception -> 0x009a }
        L_0x0073:
            java.io.InputStream r6 = r7.getInputStream()     // Catch:{ Exception -> 0x007b }
            r6.close()     // Catch:{ Exception -> 0x007b }
            goto L_0x0083
        L_0x007b:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
        L_0x0083:
            r7.disconnect()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mm.ui.chatting.s2 r6 = r11.f250042d
            java.lang.String r7 = r6.f216697l
            r4[r5] = r7
            java.lang.String r5 = r6.f216698m
            r4[r3] = r5
            java.lang.String r3 = r6.f216699n
            r4[r2] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r4)
            goto L_0x00d9
        L_0x009a:
            r6 = move-exception
            goto L_0x00a2
        L_0x009c:
            r7 = move-exception
            goto L_0x00de
        L_0x009e:
            r7 = move-exception
            r10 = r7
            r7 = r6
            r6 = r10
        L_0x00a2:
            java.lang.String r8 = ""
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00da }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r6, r8, r9)     // Catch:{ all -> 0x00da }
            com.tencent.mm.ui.chatting.w2$b r6 = new com.tencent.mm.ui.chatting.w2$b     // Catch:{ all -> 0x00da }
            r6.<init>()     // Catch:{ all -> 0x00da }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r6)     // Catch:{ all -> 0x00da }
            if (r7 == 0) goto L_0x00d9
            java.io.InputStream r6 = r7.getInputStream()     // Catch:{ Exception -> 0x00bb }
            r6.close()     // Catch:{ Exception -> 0x00bb }
            goto L_0x00c3
        L_0x00bb:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
        L_0x00c3:
            r7.disconnect()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mm.ui.chatting.s2 r6 = r11.f250042d
            java.lang.String r7 = r6.f216697l
            r4[r5] = r7
            java.lang.String r5 = r6.f216698m
            r4[r3] = r5
            java.lang.String r3 = r6.f216699n
            r4[r2] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r4)
        L_0x00d9:
            return
        L_0x00da:
            r6 = move-exception
            r10 = r7
            r7 = r6
            r6 = r10
        L_0x00de:
            if (r6 == 0) goto L_0x0106
            java.io.InputStream r8 = r6.getInputStream()     // Catch:{ Exception -> 0x00e8 }
            r8.close()     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00f0
        L_0x00e8:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
        L_0x00f0:
            r6.disconnect()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mm.ui.chatting.s2 r6 = r11.f250042d
            java.lang.String r8 = r6.f216697l
            r4[r5] = r8
            java.lang.String r5 = r6.f216698m
            r4[r3] = r5
            java.lang.String r3 = r6.f216699n
            r4[r2] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r4)
        L_0x0106:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C85843w2.run():void");
    }
}
