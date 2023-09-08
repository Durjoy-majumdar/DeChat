package q72;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import kj2.C117407d;
import o72.C35113b;
import p156gj.C87203t;
import p72.C35412b;

/* renamed from: q72.b */
public class C89536b extends C89535a {

    /* renamed from: e */
    public String f257650e;

    /* renamed from: f */
    public int f257651f = 0;

    /* renamed from: g */
    public C35412b.C35413a f257652g;

    /* renamed from: h */
    public Network f257653h;

    /* renamed from: i */
    public ConnectivityManager.NetworkCallback f257654i = new C89537a();

    /* renamed from: q72.b$a */
    public class C89537a extends ConnectivityManager.NetworkCallback {
        public C89537a() {
        }

        public void onAvailable(Network network) {
            super.onAvailable(network);
            Log.m105925i("MicroMsg.GetMobileToken", "network %s is available", ((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).getNetworkInfo(network).getTypeName());
            C89536b bVar = C89536b.this;
            bVar.f257653h = network;
            bVar.mo123825c();
            C117407d.INSTANCE.mo182088q(1360, 7);
        }

        public void onUnavailable() {
            super.onUnavailable();
            Log.m105925i("MicroMsg.GetMobileToken", "network %s is unavailable", ((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).getNetworkInfo(C89536b.this.f257653h).getTypeName());
            C89536b.this.f257653h = null;
            C117407d.INSTANCE.mo182088q(1360, 6);
        }
    }

    public C89536b(String str, String str2) {
        super(str);
        this.f257650e = str2;
        this.f257652g = (C35412b.C35413a) ((ConcurrentHashMap) ((C35113b) C86312j.m106911c(C35113b.class)).f94194d).get(str);
    }

    /* renamed from: a */
    public final void mo123823a(String str) {
        Log.m105925i("MicroMsg.GetMobileToken", "callback %s", str);
        if (!Util.isNullOrNil(str)) {
            C117407d.INSTANCE.mo182088q(1360, 8);
        } else {
            C117407d.INSTANCE.mo182088q(1360, 9);
        }
        if (this.f257652g != null) {
            Bundle bundle = new Bundle();
            bundle.putString("session", this.f257649d);
            bundle.putString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
            this.f257652g.mo60247K1(bundle);
            this.f257652g = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099 A[SYNTHETIC, Splitter:B:29:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1 A[Catch:{ IOException -> 0x009d }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123824b(java.net.HttpURLConnection r8) {
        /*
            r7 = this;
            int r0 = r8.getResponseCode()
            java.lang.String r1 = r8.getResponseMessage()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r1
            int r1 = r7.f257651f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 2
            r2[r5] = r1
            java.lang.String r1 = "MicroMsg.GetMobileToken"
            java.lang.String r6 = "httpCode %d, message %s, redirectCount %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r2)
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 == r2) goto L_0x0061
            r2 = 302(0x12e, float:4.23E-43)
            if (r0 == r2) goto L_0x002f
            goto L_0x00b6
        L_0x002f:
            int r0 = r7.f257651f
            if (r0 >= r5) goto L_0x004d
            int r0 = r0 + r3
            r7.f257651f = r0
            java.lang.String r0 = "location"
            java.lang.String r8 = r8.getHeaderField(r0)
            r7.f257650e = r8
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r8
            java.lang.String r8 = "redirect to url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r8, r0)
            r7.mo123826d()
            goto L_0x00b6
        L_0x004d:
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r8[r4] = r0
            java.lang.String r0 = "redirect exceed %d times"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r8)
            java.lang.String r8 = ""
            r7.mo123823a(r8)
            goto L_0x00b6
        L_0x0061:
            r0 = 0
            java.io.InputStream r8 = r8.getInputStream()     // Catch:{ all -> 0x0094 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0091 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0091 }
            r5.<init>()     // Catch:{ all -> 0x0091 }
        L_0x006f:
            int r6 = r8.read(r2)     // Catch:{ all -> 0x008f }
            if (r6 <= 0) goto L_0x007c
            r5.write(r2, r4, r6)     // Catch:{ all -> 0x008f }
            r5.flush()     // Catch:{ all -> 0x008f }
            goto L_0x006f
        L_0x007c:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x008f }
            byte[] r6 = r5.toByteArray()     // Catch:{ all -> 0x008f }
            r2.<init>(r6)     // Catch:{ all -> 0x008f }
            r8.close()     // Catch:{ IOException -> 0x008c }
            r5.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x00b3
        L_0x008c:
            r8 = move-exception
            r0 = r2
            goto L_0x00a5
        L_0x008f:
            r2 = move-exception
            goto L_0x0097
        L_0x0091:
            r2 = move-exception
            r5 = r0
            goto L_0x0097
        L_0x0094:
            r2 = move-exception
            r8 = r0
            r5 = r8
        L_0x0097:
            if (r8 == 0) goto L_0x009f
            r8.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x009f
        L_0x009d:
            r8 = move-exception
            goto L_0x00a5
        L_0x009f:
            if (r5 == 0) goto L_0x00a4
            r5.close()     // Catch:{ IOException -> 0x009d }
        L_0x00a4:
            throw r2     // Catch:{ IOException -> 0x009d }
        L_0x00a5:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r8 = r8.getMessage()
            r2[r4] = r8
            java.lang.String r8 = "%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r8, r2)
            r2 = r0
        L_0x00b3:
            r7.mo123823a(r2)
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q72.C89536b.mo123824b(java.net.HttpURLConnection):void");
    }

    /* renamed from: c */
    public final void mo123825c() {
        try {
            Log.m105924i("MicroMsg.GetMobileToken", "select mobile network");
            HttpURLConnection httpURLConnection = (HttpURLConnection) this.f257653h.openConnection(new URL(this.f257650e));
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.connect();
            mo123824b(httpURLConnection);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.GetMobileToken", "http exception:%s", e.getMessage());
            mo123823a((String) null);
        }
    }

    /* renamed from: d */
    public final void mo123826d() {
        if (NetStatusUtil.isMobile(MMApplicationContext.getContext())) {
            C117407d.INSTANCE.mo182088q(1360, 2);
            try {
                Log.m105924i("MicroMsg.GetMobileToken", "use mobile network directly");
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f257650e).openConnection();
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                mo123824b(httpURLConnection);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GetMobileToken", "http exception:%s", e.getMessage());
                mo123823a((String) null);
            }
        } else if (this.f257653h == null) {
            C117407d.INSTANCE.mo182088q(1360, 5);
            Log.m105924i("MicroMsg.GetMobileToken", "request mobile network");
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addTransportType(0);
            ((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).requestNetwork(builder.build(), this.f257654i);
        } else {
            mo123825c();
        }
    }

    public void run() {
        try {
            C117407d dVar = C117407d.INSTANCE;
            dVar.mo182088q(1360, 0);
            if (Util.isNullOrNil(C87203t.m108277m()) || !NetStatusUtil.isMobileNetworkOpen(MMApplicationContext.getContext())) {
                if (Util.isNullOrNil(C87203t.m108277m())) {
                    dVar.mo182088q(1360, 1);
                } else if (!NetStatusUtil.isMobileNetworkOpen(MMApplicationContext.getContext())) {
                    dVar.mo182088q(1360, 3);
                }
                Log.m105928w("MicroMsg.GetMobileToken", "get mobile token failed, mobile network is not open");
                mo123823a((String) null);
                return;
            }
            mo123826d();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.GetMobileToken", "http exception:%s", e.getMessage());
            mo123823a((String) null);
        }
    }
}
