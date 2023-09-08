package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletSecuritySettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.f0 */
public class C85508f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletSecuritySettingUI.C72022f f249173d;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.f0$a */
    public class C72037a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f208989d;

        public C72037a(boolean z) {
            this.f208989d = z;
        }

        public void run() {
            WalletSecuritySettingUI.C72022f fVar = C85508f0.this.f249173d;
            boolean z = this.f208989d;
            if (WalletSecuritySettingUI.this.f208931r != null) {
                if (z) {
                    fVar.f208952h = 2;
                } else {
                    fVar.f208952h = 1;
                }
                Log.m105919d("MicroMsg.WalletSecuritySettingUI", "check status: %s %s", Integer.valueOf(fVar.f208952h), Integer.valueOf(fVar.hashCode()));
                String b = WalletSecuritySettingUI.this.f208931r.mo99252b();
                if (!Util.isNullOrNil(b)) {
                    WalletSecuritySettingUI.this.f208924h.mo7741E(b);
                }
                WalletSecuritySettingUI.this.f208921e.notifyDataSetChanged();
            }
        }
    }

    public C85508f0(WalletSecuritySettingUI.C72022f fVar) {
        this.f249173d = fVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:28|(2:29|30)|31|33|34|(2:36|(2:37|(1:39)(1:51)))(0)|40|41|42|(1:46)|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0030, code lost:
        r0 = j53.C87882t.m109360a(r1.getAbsolutePath());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0160 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = android.os.Environment.DIRECTORY_DOWNLOADS
            r0.append(r1)
            java.lang.String r1 = "/.tmfs/sk_k_g.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = r1.getAbsolutePath()
            byte[] r0 = j53.C87882t.m109360a(r0)
            if (r0 == 0) goto L_0x0043
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0043
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L_0x0044
        L_0x0043:
            r1 = r2
        L_0x0044:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r0 == 0) goto L_0x004d
            goto L_0x019a
        L_0x004d:
            r0 = 0
            java.lang.String r4 = j53.C87882t.m109361b()     // Catch:{ all -> 0x007b }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x007b }
            if (r5 == 0) goto L_0x005c
            java.lang.String r4 = j53.C87882t.m109362c()     // Catch:{ all -> 0x007b }
        L_0x005c:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x007b }
            if (r5 != 0) goto L_0x0079
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x006b }
            byte[] r4 = android.util.Base64.decode(r4, r3)     // Catch:{ Exception -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r4 = r0
        L_0x006c:
            byte[] r4 = j53.C87882t.C87883a.m109363a(r4, r0)     // Catch:{ all -> 0x007b }
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x007b }
            java.lang.String r6 = "gbk"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x007b }
            r2 = r5
            goto L_0x007c
        L_0x0079:
            r2 = r4
            goto L_0x007c
        L_0x007b:
        L_0x007c:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x0084
            goto L_0x019a
        L_0x0084:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "guid"
            r5.put(r6, r2)     // Catch:{ JSONException -> 0x009f }
            java.lang.String r2 = "secretId"
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x009f }
            java.lang.String r1 = "req"
            r4.put(r1, r5)     // Catch:{ JSONException -> 0x009f }
        L_0x009f:
            java.lang.String r1 = "https://jprx.m.qq.com/data/2241/forward"
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "url: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = " request: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.SgLiveChecker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            r4 = 1
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r6.<init>(r1)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.net.URLConnection r1 = r6.openConnection()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r1.setDoOutput(r4)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r1.setDoInput(r4)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r1.setUseCaches(r3)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r6 = "User-Agent"
            java.lang.String r7 = "QQPimSecure"
            r1.setRequestProperty(r6, r7)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r6 = "Content-Type"
            java.lang.String r7 = "application/json"
            r1.setRequestProperty(r6, r7)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r6 = "POST"
            r1.setRequestMethod(r6)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.io.OutputStream r8 = r1.getOutputStream()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r9 = "UTF-8"
            r7.<init>(r8, r9)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r6.<init>(r7)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r6.write(r2)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r6.close()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r6 = "http_test"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r7.<init>()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r8 = "responseCode: "
            r7.append(r8)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r7.append(r2)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r6.<init>()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r2 != r7) goto L_0x0143
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r7.<init>(r1)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r2.<init>(r7)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
        L_0x0134:
            java.lang.String r1 = r2.readLine()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            if (r1 == 0) goto L_0x0143
            r6.append(r1)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r1 = "\n"
            r6.append(r1)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            goto L_0x0134
        L_0x0143:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r1.<init>()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r2 = "result: "
            r1.append(r2)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r2 = r6.toString()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            r1.append(r2)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException | MalformedURLException | ProtocolException -> 0x0160 }
        L_0x0160:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0185 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r0 = "ret"
            int r0 = r1.getInt(r0)     // Catch:{ Exception -> 0x0185 }
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r1 = "resp"
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r1 = "status"
            int r0 = r0.getInt(r1)     // Catch:{ Exception -> 0x0185 }
            if (r0 != r4) goto L_0x0185
            r3 = 1
        L_0x0185:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "status alive: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
        L_0x019a:
            com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$f r0 = r10.f249173d
            com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI r0 = com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletSecuritySettingUI.this
            com.tencent.mm.plugin.wallet.pwd.ui.f0$a r1 = new com.tencent.mm.plugin.wallet.pwd.ui.f0$a
            r1.<init>(r3)
            r0.runOnUiThread(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.pwd.p122ui.C85508f0.run():void");
    }
}
