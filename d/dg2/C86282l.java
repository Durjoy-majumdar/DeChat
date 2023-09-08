package dg2;

import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;

/* renamed from: dg2.l */
public class C86282l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ReadMailUI f250897d;

    /* renamed from: dg2.l$a */
    public class C86283a implements Runnable {
        public C86283a() {
        }

        public void run() {
            ReadMailUI.m105395I7(C86282l.this.f250897d);
        }
    }

    public C86282l(ReadMailUI readMailUI) {
        this.f250897d = readMailUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00da A[SYNTHETIC, Splitter:B:27:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ee A[SYNTHETIC, Splitter:B:34:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.ReadMailUI"
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI r4 = r11.f250897d     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.String r4 = r4.f248805A     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            r3.setInstanceFollowRedirects(r1)     // Catch:{ Exception -> 0x00c9 }
            r3.connect()     // Catch:{ Exception -> 0x00c9 }
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI r2 = r11.f250897d     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r4 = "Location"
            java.lang.String r4 = r3.getHeaderField(r4)     // Catch:{ Exception -> 0x00c9 }
            r2.f248806B = r4     // Catch:{ Exception -> 0x00c9 }
            java.io.InputStream r2 = r3.getInputStream()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r4 = "Content-Length"
            r5 = -1
            int r4 = r3.getHeaderFieldInt(r4, r5)     // Catch:{ Exception -> 0x00c9 }
            if (r4 > 0) goto L_0x004f
            java.lang.String r4 = "error content-length"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ Exception -> 0x00c9 }
            r2.close()     // Catch:{ Exception -> 0x00c9 }
            r3.disconnect()     // Catch:{ Exception -> 0x00c9 }
            java.io.InputStream r1 = r3.getInputStream()     // Catch:{ Exception -> 0x0043 }
            r1.close()     // Catch:{ Exception -> 0x0043 }
            goto L_0x004b
        L_0x0043:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x004b:
            r3.disconnect()
            return
        L_0x004f:
            byte[] r5 = new byte[r4]     // Catch:{ Exception -> 0x00c9 }
            int r6 = r2.read(r5)     // Catch:{ Exception -> 0x00c9 }
            r2.close()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r2 = "dz[mQQMailDownloadUrl:%s]"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00c9 }
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI r9 = r11.f250897d     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r9 = r9.f248806B     // Catch:{ Exception -> 0x00c9 }
            r8[r1] = r9     // Catch:{ Exception -> 0x00c9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r8)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r2 = "len %d, readLen %d, md5 %s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00c9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00c9 }
            r8[r1] = r4     // Catch:{ Exception -> 0x00c9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00c9 }
            r8[r7] = r4     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00c9 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00c9 }
            r6 = 2
            r8[r6] = r4     // Catch:{ Exception -> 0x00c9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r8)     // Catch:{ Exception -> 0x00c9 }
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI r2 = r11.f250897d     // Catch:{ Exception -> 0x00c9 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r4 = "rsa_public_key_forwx.pem"
            java.security.PublicKey r2 = p823sg.C90195n.m112883a(r2, r4)     // Catch:{ Exception -> 0x00c9 }
            byte[] r4 = android.util.Base64.decode(r5, r1)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r5 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch:{ Exception -> 0x00c9 }
            r5.init(r6, r2)     // Catch:{ Exception -> 0x00c9 }
            byte[] r2 = r5.doFinal(r4)     // Catch:{ Exception -> 0x00c9 }
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI r4 = r11.f250897d     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x00c9 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x00c9 }
            r4.f248807C = r5     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r2 = "dz[mQQMailMD5:%s]"
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00c9 }
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI r5 = r11.f250897d     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r5 = r5.f248807C     // Catch:{ Exception -> 0x00c9 }
            r4[r1] = r5     // Catch:{ Exception -> 0x00c9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)     // Catch:{ Exception -> 0x00c9 }
            dg2.l$a r2 = new dg2.l$a     // Catch:{ Exception -> 0x00c9 }
            r2.<init>()     // Catch:{ Exception -> 0x00c9 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)     // Catch:{ Exception -> 0x00c9 }
            java.io.InputStream r1 = r3.getInputStream()     // Catch:{ Exception -> 0x00c7 }
        L_0x00c3:
            r1.close()     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00e6
        L_0x00c7:
            r1 = move-exception
            goto L_0x00df
        L_0x00c9:
            r2 = move-exception
            goto L_0x00d1
        L_0x00cb:
            r1 = move-exception
            goto L_0x00ec
        L_0x00cd:
            r3 = move-exception
            r10 = r3
            r3 = r2
            r2 = r10
        L_0x00d1:
            java.lang.String r4 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ea }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r4, r1)     // Catch:{ all -> 0x00ea }
            if (r3 == 0) goto L_0x00e9
            java.io.InputStream r1 = r3.getInputStream()     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00c3
        L_0x00df:
            java.lang.String r1 = r1.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x00e6:
            r3.disconnect()
        L_0x00e9:
            return
        L_0x00ea:
            r1 = move-exception
            r2 = r3
        L_0x00ec:
            if (r2 == 0) goto L_0x0101
            java.io.InputStream r3 = r2.getInputStream()     // Catch:{ Exception -> 0x00f6 }
            r3.close()     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00fe
        L_0x00f6:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
        L_0x00fe:
            r2.disconnect()
        L_0x0101:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dg2.C86282l.run():void");
    }
}
