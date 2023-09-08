package bo0;

import android.net.ConnectivityManager;
import android.net.Network;
import ao0.C79605a;
import ao0.C79612e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import lu3.C34379c;
import zt3.C119157j;

/* renamed from: bo0.e */
public final class C79735e {

    /* renamed from: a */
    public static final C79735e f233694a = new C79735e();

    /* renamed from: bo0.e$a */
    public interface C79736a {
        /* renamed from: a */
        void mo109865a();

        /* renamed from: b */
        void mo109866b();
    }

    /* renamed from: bo0.e$b */
    public static final class C79737b implements C79605a.C79608b {

        /* renamed from: a */
        public final /* synthetic */ String f233695a;

        /* renamed from: b */
        public final /* synthetic */ String f233696b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<C34379c<?>> f233697c;

        /* renamed from: d */
        public final /* synthetic */ C79742e f233698d;

        public C79737b(String str, String str2, C8479f0<C34379c<?>> f0Var, C79742e eVar) {
            this.f233695a = str;
            this.f233696b = str2;
            this.f233697c = f0Var;
            this.f233698d = eVar;
        }

        /* renamed from: a */
        public void mo109748a() {
        }

        /* renamed from: b */
        public void mo109749b(C79612e eVar) {
            C87412m.m108594g(eVar, "wiFiItem");
            Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectAcceptIncomplete#sysListener");
            if (Util.isEqual(this.f233695a, eVar.f233453a)) {
                if ((this.f233696b.length() == 0) || Util.isEqual(this.f233696b, eVar.f233454b)) {
                    Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectInternal#sysListener, match");
                    C34379c cVar = (C34379c) this.f233697c.f27484d;
                    if (cVar != null) {
                        cVar.cancel(true);
                    }
                    C79605a.m96671b(this);
                    this.f233698d.mo109865a();
                }
            }
        }

        /* renamed from: c */
        public void mo109750c(C79612e eVar) {
            C87412m.m108594g(eVar, "wiFiItem");
            Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnect#sysListener");
        }
    }

    /* renamed from: bo0.e$c */
    public static final class C79738c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ConnectivityManager f233699d;

        /* renamed from: e */
        public final /* synthetic */ C79739d f233700e;

        /* renamed from: f */
        public final /* synthetic */ C79742e f233701f;

        public C79738c(ConnectivityManager connectivityManager, C79739d dVar, C79742e eVar) {
            this.f233699d = connectivityManager;
            this.f233700e = dVar;
            this.f233701f = eVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "timeout");
            this.f233699d.unregisterNetworkCallback(this.f233700e);
            this.f233701f.mo109866b();
        }
    }

    /* renamed from: bo0.e$d */
    public static final class C79739d extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C34379c<?>> f233702a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<C34379c<?>> f233703b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<C34379c<?>> f233704c;

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C79605a.C79608b> f233705d;

        /* renamed from: e */
        public final /* synthetic */ C79742e f233706e;

        /* renamed from: f */
        public final /* synthetic */ ConnectivityManager f233707f;

        /* renamed from: bo0.e$d$a */
        public static final class C79740a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Network f233708d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<C34379c<?>> f233709e;

            /* renamed from: f */
            public final /* synthetic */ C8479f0<C79605a.C79608b> f233710f;

            /* renamed from: g */
            public final /* synthetic */ C79742e f233711g;

            /* renamed from: h */
            public final /* synthetic */ ConnectivityManager f233712h;

            /* renamed from: i */
            public final /* synthetic */ C79739d f233713i;

            public C79740a(Network network, C8479f0<C34379c<?>> f0Var, C8479f0<C79605a.C79608b> f0Var2, C79742e eVar, ConnectivityManager connectivityManager, C79739d dVar) {
                this.f233708d = network;
                this.f233709e = f0Var;
                this.f233710f = f0Var2;
                this.f233711g = eVar;
                this.f233712h = connectivityManager;
                this.f233713i = dVar;
            }

            public final void run() {
                Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onLost, network: " + this.f233708d + ", timeout");
                C34379c cVar = (C34379c) this.f233709e.f27484d;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                C79605a.m96671b((C79605a.C79608b) this.f233710f.f27484d);
                this.f233711g.mo109866b();
                this.f233712h.bindProcessToNetwork((Network) null);
                this.f233712h.unregisterNetworkCallback(this.f233713i);
            }
        }

        /* renamed from: bo0.e$d$b */
        public static final class C79741b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<C34379c<?>> f233714d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<C79605a.C79608b> f233715e;

            /* renamed from: f */
            public final /* synthetic */ C79742e f233716f;

            public C79741b(C8479f0<C34379c<?>> f0Var, C8479f0<C79605a.C79608b> f0Var2, C79742e eVar) {
                this.f233714d = f0Var;
                this.f233715e = f0Var2;
                this.f233716f = eVar;
            }

            public final void run() {
                Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onUnavailable, timeout");
                C34379c cVar = (C34379c) this.f233714d.f27484d;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                C79605a.m96671b((C79605a.C79608b) this.f233715e.f27484d);
                this.f233716f.mo109866b();
            }
        }

        public C79739d(C8479f0<C34379c<?>> f0Var, C8479f0<C34379c<?>> f0Var2, C8479f0<C34379c<?>> f0Var3, C8479f0<C79605a.C79608b> f0Var4, C79742e eVar, ConnectivityManager connectivityManager, long j) {
            this.f233702a = f0Var;
            this.f233703b = f0Var2;
            this.f233704c = f0Var3;
            this.f233705d = f0Var4;
            this.f233706e = eVar;
            this.f233707f = connectivityManager;
        }

        public void onAvailable(Network network) {
            C87412m.m108594g(network, "network");
            super.onAvailable(network);
            Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onAvailable, network: " + network);
            C34379c cVar = (C34379c) this.f233702a.f27484d;
            if (cVar != null) {
                cVar.cancel(true);
            }
            C34379c cVar2 = (C34379c) this.f233703b.f27484d;
            if (cVar2 != null) {
                cVar2.cancel(true);
            }
            C34379c cVar3 = (C34379c) this.f233704c.f27484d;
            if (cVar3 != null) {
                cVar3.cancel(true);
            }
            C79605a.m96671b((C79605a.C79608b) this.f233705d.f27484d);
            this.f233706e.mo109865a();
            boolean bindProcessToNetwork = this.f233707f.bindProcessToNetwork(network);
            Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onAvailable, success: " + bindProcessToNetwork);
        }

        public void onLost(Network network) {
            C87412m.m108594g(network, "network");
            super.onLost(network);
            Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onLost, network: " + network);
            C8479f0<C34379c<?>> f0Var = this.f233704c;
            C119157j jVar = (C119157j) C119157j.f356862d;
            f0Var.f27484d = jVar.mo183878i(new C79740a(network, this.f233702a, this.f233705d, this.f233706e, this.f233707f, this), 3000);
        }

        public void onUnavailable() {
            super.onUnavailable();
            Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onUnavailable");
            this.f233703b.f27484d = ((C119157j) C119157j.f356862d).mo183878i(new C79741b(this.f233702a, this.f233705d, this.f233706e), 3000);
        }
    }

    /* renamed from: bo0.e$e */
    public static final class C79742e implements C79736a {

        /* renamed from: a */
        public final AtomicBoolean f233717a = new AtomicBoolean(false);

        /* renamed from: b */
        public final /* synthetic */ C79736a f233718b;

        public C79742e(C79736a aVar) {
            this.f233718b = aVar;
        }

        /* renamed from: a */
        public void mo109865a() {
            if (this.f233717a.compareAndSet(false, true)) {
                this.f233718b.mo109865a();
            } else {
                Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectSuccess, already call");
            }
        }

        /* renamed from: b */
        public void mo109866b() {
            if (this.f233717a.compareAndSet(false, true)) {
                this.f233718b.mo109866b();
            } else {
                Log.m105924i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectFailure, already call");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(23:15|16|17|18|19|(1:21)(1:22)|(1:24)|25|26|(1:28)|(1:30)|31|32|33|34|35|36|37|(1:39)|40|(1:42)(1:45)|46|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003d, code lost:
        r8 = r20.getApplicationContext();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0081 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087 A[Catch:{ Exception -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a A[Catch:{ Exception -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db A[Catch:{ Exception -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9 A[Catch:{ Exception -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0103 A[Catch:{ Exception -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0137  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109867a(android.content.Context r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, long r24, bo0.C79735e.C79736a r26) {
        /*
            r19 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r5 = r26
            java.lang.String r6 = "listener"
            gy3.C87412m.m108594g(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "connectWifi, ssid: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = ", bssid: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", timeoutMs: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.AppBrand.WifiConnector29Impl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            bo0.e$e r6 = new bo0.e$e
            r6.<init>(r5)
            r5 = 0
            if (r20 == 0) goto L_0x004a
            android.content.Context r8 = r20.getApplicationContext()
            if (r8 == 0) goto L_0x004a
            java.lang.String r9 = "connectivity"
            java.lang.Object r8 = r8.getSystemService(r9)
            goto L_0x004b
        L_0x004a:
            r8 = r5
        L_0x004b:
            boolean r9 = r8 instanceof android.net.ConnectivityManager
            if (r9 == 0) goto L_0x0052
            r5 = r8
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5
        L_0x0052:
            if (r5 != 0) goto L_0x005d
            java.lang.String r0 = "connectWifi, connectivityManager is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            r6.mo109866b()
            return
        L_0x005d:
            if (r0 == 0) goto L_0x0158
            if (r1 == 0) goto L_0x0158
            if (r2 != 0) goto L_0x0065
            goto L_0x0158
        L_0x0065:
            android.net.wifi.WifiNetworkSpecifier$Builder r8 = new android.net.wifi.WifiNetworkSpecifier$Builder     // Catch:{ Exception -> 0x013e }
            r8.<init>()     // Catch:{ Exception -> 0x013e }
            r8.setSsid(r0)     // Catch:{ Exception -> 0x013e }
            r9 = 0
            r15 = 1
            int r10 = r22.length()     // Catch:{ Exception -> 0x0081 }
            if (r10 <= 0) goto L_0x0077
            r10 = 1
            goto L_0x0078
        L_0x0077:
            r10 = 0
        L_0x0078:
            if (r10 == 0) goto L_0x0081
            android.net.MacAddress r10 = android.net.MacAddress.fromString(r22)     // Catch:{ Exception -> 0x0081 }
            r8.setBssid(r10)     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            int r10 = r23.length()     // Catch:{ Exception -> 0x013e }
            if (r10 <= 0) goto L_0x0088
            r9 = 1
        L_0x0088:
            if (r9 == 0) goto L_0x008d
            r8.setWpa2Passphrase(r2)     // Catch:{ Exception -> 0x013e }
        L_0x008d:
            android.net.wifi.WifiNetworkSpecifier r2 = r8.build()     // Catch:{ Exception -> 0x013e }
            java.lang.String r8 = "try {\n                Wi…     return\n            }"
            gy3.C87412m.m108593f(r2, r8)
            r16 = 3000(0xbb8, double:1.482E-320)
            gy3.f0 r14 = new gy3.f0
            r14.<init>()
            gy3.f0 r10 = new gy3.f0
            r10.<init>()
            gy3.f0 r11 = new gy3.f0
            r11.<init>()
            gy3.f0 r13 = new gy3.f0
            r13.<init>()
            android.net.NetworkRequest$Builder r8 = new android.net.NetworkRequest$Builder     // Catch:{ Exception -> 0x010c }
            r8.<init>()     // Catch:{ Exception -> 0x010c }
            android.net.NetworkRequest$Builder r8 = r8.addTransportType(r15)     // Catch:{ Exception -> 0x010c }
            android.net.NetworkRequest$Builder r2 = r8.setNetworkSpecifier(r2)     // Catch:{ Exception -> 0x010c }
            android.net.NetworkRequest r2 = r2.build()     // Catch:{ Exception -> 0x010c }
            bo0.e$b r8 = new bo0.e$b     // Catch:{ Exception -> 0x010c }
            r8.<init>(r0, r1, r14, r6)     // Catch:{ Exception -> 0x010c }
            r13.f27484d = r8     // Catch:{ Exception -> 0x010c }
            bo0.e$d r0 = new bo0.e$d     // Catch:{ Exception -> 0x010c }
            r8 = r0
            r9 = r14
            r12 = r13
            r1 = r13
            r13 = r6
            r18 = r7
            r7 = r14
            r14 = r5
            r15 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0101 }
            r8 = -1
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x00ea
            zt3.t r8 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x0101 }
            bo0.e$c r9 = new bo0.e$c     // Catch:{ Exception -> 0x0101 }
            r9.<init>(r5, r0, r6)     // Catch:{ Exception -> 0x0101 }
            zt3.j r8 = (zt3.C119157j) r8     // Catch:{ Exception -> 0x0101 }
            lu3.c r3 = r8.mo183878i(r9, r3)     // Catch:{ Exception -> 0x0101 }
            r7.f27484d = r3     // Catch:{ Exception -> 0x0101 }
        L_0x00ea:
            T r3 = r1.f27484d     // Catch:{ Exception -> 0x0101 }
            ao0.a$b r3 = (ao0.C79605a.C79608b) r3     // Catch:{ Exception -> 0x0101 }
            java.lang.String r4 = "MicroMsg.AppBrand.ConnectWifiEvents"
            java.lang.String r8 = "addListener"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)     // Catch:{ Exception -> 0x0101 }
            ao0.a$a r8 = ao0.C79605a.f233447b     // Catch:{ Exception -> 0x0101 }
            if (r8 == 0) goto L_0x0103
            java.util.List<ao0.a$b> r4 = r8.f233449b     // Catch:{ Exception -> 0x0101 }
            java.util.concurrent.CopyOnWriteArrayList r4 = (java.util.concurrent.CopyOnWriteArrayList) r4     // Catch:{ Exception -> 0x0101 }
            r4.add(r3)     // Catch:{ Exception -> 0x0101 }
            goto L_0x0108
        L_0x0101:
            r0 = move-exception
            goto L_0x0111
        L_0x0103:
            java.lang.String r3 = "addListener, receiver is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r3)     // Catch:{ Exception -> 0x0101 }
        L_0x0108:
            r5.requestNetwork(r2, r0)     // Catch:{ Exception -> 0x0101 }
            return
        L_0x010c:
            r0 = move-exception
            r18 = r7
            r1 = r13
            r7 = r14
        L_0x0111:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "connectWifi, fail since "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            T r0 = r7.f27484d
            lu3.c r0 = (lu3.C34379c) r0
            if (r0 == 0) goto L_0x0131
            r2 = 1
            r0.cancel(r2)
        L_0x0131:
            T r0 = r1.f27484d
            ao0.a$b r0 = (ao0.C79605a.C79608b) r0
            if (r0 == 0) goto L_0x013a
            ao0.C79605a.m96671b(r0)
        L_0x013a:
            r6.mo109866b()
            return
        L_0x013e:
            r0 = move-exception
            r2 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "connectWifi, build network specifier fail since "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            r6.mo109866b()
            return
        L_0x0158:
            r2 = r7
            java.lang.String r0 = "connectWifi, connect params illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            r6.mo109866b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo0.C79735e.mo109867a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, long, bo0.e$a):void");
    }
}
