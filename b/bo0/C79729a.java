package bo0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ao0.C79610c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p903ij.C76359b;

/* renamed from: bo0.a */
public class C79729a {

    /* renamed from: a */
    public C79610c f233678a;

    /* renamed from: b */
    public Context f233679b;

    /* renamed from: c */
    public Handler f233680c = null;

    /* renamed from: d */
    public C79731b f233681d = null;

    /* renamed from: e */
    public WifiConfiguration f233682e = null;

    /* renamed from: f */
    public boolean f233683f = false;

    /* renamed from: g */
    public BroadcastReceiver f233684g = null;

    /* renamed from: h */
    public ConnectivityManager f233685h;

    /* renamed from: i */
    public int f233686i = 0;

    /* renamed from: j */
    public long f233687j = 13000;

    /* renamed from: k */
    public boolean f233688k = false;

    /* renamed from: l */
    public final boolean f233689l;

    /* renamed from: bo0.a$a */
    public class C79730a extends Handler {
        public C79730a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message != null) {
                boolean z = true;
                if (message.what == 1) {
                    Log.m105924i("MicroMsg.WiFiConnector", "MSG_TIME_OUT");
                    C79729a aVar = C79729a.this;
                    int i = aVar.f233686i;
                    if (!(i == 3 || i == 2)) {
                        z = false;
                    }
                    if (!z) {
                        aVar.mo109859a("fail to connect wifi:time out");
                        Log.m105924i("MicroMsg.wifi_event", "MSG_TIME_OUT FAIL.");
                    }
                }
            }
        }
    }

    /* renamed from: bo0.a$b */
    public class C79731b implements InvocationHandler {

        /* renamed from: a */
        public final WifiConfiguration f233691a;

        public C79731b(C79729a aVar, WifiConfiguration wifiConfiguration) {
            this.f233691a = wifiConfiguration;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().compareTo("onSuccess") == 0) {
                Log.m105924i("MicroMsg.WiFiConnector", "connectWifi use ActionListener success");
                return null;
            }
            if (method.getName().compareTo("onFailure") == 0) {
                Log.m105928w("MicroMsg.WiFiConnector", "connectWifi use ActionListener fail, fallback to enableNetwork");
                try {
                    C79743f.f233719a.enableNetwork(this.f233691a.networkId, true);
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th, "enableNetwork", new Object[0]);
                }
            }
            return null;
        }
    }

    public C79729a(C79610c cVar, Context context, boolean z) {
        this.f233678a = cVar;
        this.f233679b = context;
        try {
            this.f233685h = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WiFiConnector", e, "can not retrieve ConnectivityManager", new Object[0]);
        }
        this.f233680c = new C79730a(context.getMainLooper());
        if ((z || !C76359b.m91787d(this.f233679b)) && this.f233679b.getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29) {
            this.f233689l = true;
        } else {
            this.f233689l = false;
        }
    }

    /* renamed from: a */
    public void mo109859a(String str) {
        WifiConfiguration wifiConfiguration = this.f233682e;
        if (wifiConfiguration != null) {
            C79734d.m96871a(wifiConfiguration.networkId);
            mo109860b(false, str);
            Log.m105924i("MicroMsg.wifi_event", "cancelConnect, " + C79744g.m96886b(this.f233682e.SSID) + " networkId:" + this.f233682e.networkId);
            Log.m105924i("MicroMsg.WiFiConnector", "cancelConnect");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109860b(boolean r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "finishConnectTask success:"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.WiFiConnector"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            int r0 = r1.f233686i
            r4 = 0
            r5 = 2
            r6 = 3
            r7 = 1
            if (r0 == r6) goto L_0x0027
            if (r0 != r5) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r0 = 0
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            if (r0 != 0) goto L_0x020b
            ao0.c r0 = r1.f233678a
            if (r0 == 0) goto L_0x01e0
            java.lang.String r8 = "ok"
            if (r2 == 0) goto L_0x0034
            r9 = r8
            goto L_0x0036
        L_0x0034:
            r9 = r21
        L_0x0036:
            boolean r10 = r1.f233689l
            r11 = r0
            zn0.a$a r11 = (zn0.C91797a.C91798a) r11
            java.lang.String r12 = "errno"
            java.lang.String r13 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r14 = "MicroMsg.AppBrandJsApi"
            r0 = 0
            ao0.C79614g.f233463d = r0
            boolean r0 = r9.equals(r8)
            java.lang.String r15 = "MicroMsg.JsApiConnectWifi"
            java.lang.String r6 = "errCode"
            if (r0 == 0) goto L_0x0145
            if (r10 == 0) goto L_0x005d
            java.lang.String r0 = "[IConnectWiFiCallback] connect success, refresh ConnectivityCompat cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r0 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
            r0.clearSensitiveWiFiInfoCache()
            r0.getWiFiIpAddress(r7)
        L_0x005d:
            ao0.b r0 = ao0.C79609b.f233451a
            boolean r9 = r11.f262878a
            ao0.e r0 = r0.mo109751a(r9)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r4] = r0
            java.lang.String r7 = "[IConnectWiFiCallback]currentWifi:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r7, r9)
            if (r0 == 0) goto L_0x0103
            boolean r7 = r0.mo109753a()
            if (r7 != 0) goto L_0x0078
            goto L_0x0103
        L_0x0078:
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ JSONException -> 0x00ba }
            r7.<init>()     // Catch:{ JSONException -> 0x00ba }
            java.lang.String r9 = "wifi"
            org.json.JSONObject r0 = r0.mo109754b()     // Catch:{ JSONException -> 0x00ba }
            r7.put(r9, r0)     // Catch:{ JSONException -> 0x00ba }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x00ba }
            r7.put(r6, r0)     // Catch:{ JSONException -> 0x00ba }
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r11.f262880c     // Catch:{ JSONException -> 0x00ba }
            int r9 = r11.f262881d     // Catch:{ JSONException -> 0x00ba }
            zn0.a r10 = zn0.C91797a.this     // Catch:{ JSONException -> 0x00ba }
            r10.getClass()     // Catch:{ JSONException -> 0x00ba }
            boolean r17 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ JSONException -> 0x00ba }
            if (r17 == 0) goto L_0x00aa
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ JSONException -> 0x00ba }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x00ba }
            r2[r4] = r17     // Catch:{ JSONException -> 0x00ba }
            r16 = 1
            r2[r16] = r8     // Catch:{ JSONException -> 0x00ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r13, r2)     // Catch:{ JSONException -> 0x00ba }
        L_0x00aa:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x00ba }
            r7.put(r12, r2)     // Catch:{ JSONException -> 0x00ba }
            java.lang.String r2 = r10.mo115114o(r8, r7)     // Catch:{ JSONException -> 0x00ba }
            r0.mo109647a(r9, r2)     // Catch:{ JSONException -> 0x00ba }
            goto L_0x01e0
        L_0x00ba:
            r0 = move-exception
            java.lang.String r2 = "IConnectWiFiCallback is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r7 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r7, r2)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = 12010(0x2eea, float:1.683E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r6, r2)
            com.tencent.mm.plugin.appbrand.jsapi.f r2 = r11.f262880c
            int r6 = r11.f262881d
            zn0.a r7 = zn0.C91797a.this
            java.lang.String r8 = "fail:parse json err"
            r7.getClass()
            r9 = 4
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r10 == 0) goto L_0x00f3
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r10[r4] = r11
            r11 = 1
            r10[r11] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r13, r10)
        L_0x00f3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.put(r12, r9)
            java.lang.String r0 = r7.mo115114o(r8, r0)
            r2.mo109647a(r6, r0)
            goto L_0x01e0
        L_0x0103:
            java.lang.String r2 = "[IConnectWiFiCallback]currentWIfi is null or invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            zn0.a r6 = zn0.C91797a.this
            android.content.Context r7 = r11.f262879b
            com.tencent.mm.plugin.appbrand.jsapi.f r8 = r11.f262880c
            android.util.Pair r6 = zn0.C91797a.m115314w(r6, r7, r8, r2, r10)
            if (r6 != 0) goto L_0x012e
            if (r0 != 0) goto L_0x0125
            android.util.Pair r6 = new android.util.Pair
            fl0.c r0 = fl0.C86917b.f252302y
            java.lang.String r7 = "fail:can't gain current wifi"
            r6.<init>(r7, r0)
            goto L_0x012e
        L_0x0125:
            fl0.c r0 = fl0.C86917b.f252303z
            android.util.Pair r6 = new android.util.Pair
            java.lang.String r7 = "fail:current connected wifi is invalid"
            r6.<init>(r7, r0)
        L_0x012e:
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r11.f262880c
            int r7 = r11.f262881d
            zn0.a r8 = zn0.C91797a.this
            java.lang.Object r9 = r6.first
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r6 = r6.second
            fl0.c r6 = (fl0.C86918c) r6
            java.lang.String r2 = r8.mo115110k(r9, r6, r2)
            r0.mo109647a(r7, r2)
            goto L_0x01e0
        L_0x0145:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "duplicated request"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 12004(0x2ee4, float:1.6821E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r6, r2)
            fl0.c r2 = fl0.C86917b.f252264B
            java.lang.String r7 = "fail:duplicated request"
            goto L_0x01c2
        L_0x0160:
            java.lang.String r2 = "password error"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x0177
            r2 = 12002(0x2ee2, float:1.6818E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r6, r2)
            fl0.c r2 = fl0.C86917b.f252265C
            java.lang.String r7 = "fail:password error"
            goto L_0x01c2
        L_0x0177:
            java.lang.String r2 = "wifi config may be expired"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x018e
            r2 = 12013(0x2eed, float:1.6834E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r6, r2)
            fl0.c r2 = fl0.C86917b.f252266D
            java.lang.String r7 = "fail:wifi config may be expired"
            goto L_0x01c2
        L_0x018e:
            java.lang.String r2 = "fail to connect wifi:time out"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x01a4
            r2 = 12003(0x2ee3, float:1.682E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r6, r2)
            fl0.c r2 = fl0.C86917b.f252267E
            java.lang.String r7 = "fail:fail to connect wifi:time out"
            goto L_0x01c2
        L_0x01a4:
            zn0.a r2 = zn0.C91797a.this
            android.content.Context r7 = r11.f262879b
            com.tencent.mm.plugin.appbrand.jsapi.f r8 = r11.f262880c
            android.util.Pair r2 = zn0.C91797a.m115314w(r2, r7, r8, r0, r10)
            if (r2 == 0) goto L_0x01be
            java.lang.Object r7 = r2.second
            fl0.c r7 = (fl0.C86918c) r7
            java.lang.Object r2 = r2.first
            java.lang.String r2 = (java.lang.String) r2
            r18 = r7
            r7 = r2
            r2 = r18
            goto L_0x01c2
        L_0x01be:
            fl0.c r2 = fl0.C86917b.f252263A
            java.lang.String r7 = "fail:unknown error"
        L_0x01c2:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = r0.get(r6)
            r8[r4] = r6
            r6 = 1
            r8[r6] = r7
            java.lang.String r9 = "[IConnectWiFiCallback]errCode:%d, errMsg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r9, r8)
            com.tencent.mm.plugin.appbrand.jsapi.f r8 = r11.f262880c
            int r9 = r11.f262881d
            zn0.a r10 = zn0.C91797a.this
            java.lang.String r0 = r10.mo115110k(r7, r2, r0)
            r8.mo109647a(r9, r0)
            goto L_0x01e1
        L_0x01e0:
            r6 = 1
        L_0x01e1:
            android.os.Handler r0 = r1.f233680c
            r0.removeMessages(r6)
            boolean r0 = r1.f233683f
            if (r0 == 0) goto L_0x01f9
            android.content.Context r0 = r1.f233679b
            android.content.BroadcastReceiver r2 = r1.f233684g
            r0.unregisterReceiver(r2)
            r1.f233683f = r4
            java.lang.String r0 = "stopMonitorWiFiEvent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x01f9:
            if (r20 == 0) goto L_0x01fc
            goto L_0x01fd
        L_0x01fc:
            r5 = 3
        L_0x01fd:
            r1.mo109861c(r5)
            if (r20 != 0) goto L_0x020b
            android.net.wifi.WifiConfiguration r0 = r1.f233682e
            if (r0 == 0) goto L_0x020b
            int r0 = r0.networkId
            bo0.C79734d.m96871a(r0)
        L_0x020b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo0.C79729a.mo109860b(boolean, java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo109861c(int i) {
        if (this.f233686i != i) {
            this.f233686i = i;
            StringBuilder sb = new StringBuilder();
            sb.append("switchState:");
            int i2 = this.f233686i;
            sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "UnknowState" : "STATE_FAIL" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_NONE");
            Log.m105924i("MicroMsg.WiFiConnector", sb.toString());
        }
    }
}
