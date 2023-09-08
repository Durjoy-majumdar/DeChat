package sv0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.plugin.backup.wifidirect.WifiDirectReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Method;
import p385u2.C111105a;
import rx3.C13598b0;

/* renamed from: sv0.b */
public final class C22400b {

    /* renamed from: n */
    public static final C22408b f63500n = new C22408b((C8480h) null);

    /* renamed from: a */
    public final Context f63501a;

    /* renamed from: b */
    public int f63502b;

    /* renamed from: c */
    public WifiP2pManager f63503c;

    /* renamed from: d */
    public WifiP2pManager.Channel f63504d;

    /* renamed from: e */
    public final IntentFilter f63505e = new IntentFilter();

    /* renamed from: f */
    public BroadcastReceiver f63506f;

    /* renamed from: g */
    public WifiP2pDevice f63507g;

    /* renamed from: h */
    public C22399a f63508h;

    /* renamed from: i */
    public int f63509i;

    /* renamed from: j */
    public int f63510j;

    /* renamed from: k */
    public String f63511k = "";

    /* renamed from: l */
    public String f63512l;

    /* renamed from: m */
    public boolean f63513m;

    /* renamed from: sv0.b$a */
    public static final class C22401a implements WifiP2pManager.ChannelListener {

        /* renamed from: a */
        public final /* synthetic */ C22400b f63514a;

        public C22401a(C22400b bVar) {
            this.f63514a = bVar;
        }

        public final void onChannelDisconnected() {
            Log.m105920e("MicroMsg.WifiDirectCore", "mChannel onChannelDisconnected");
            C22400b bVar = this.f63514a;
            bVar.getClass();
            bVar.f63511k = "";
        }
    }

    /* renamed from: sv0.b$c */
    public static final class C22402c implements WifiP2pManager.ActionListener {

        /* renamed from: a */
        public final /* synthetic */ C22400b f63515a;

        /* renamed from: b */
        public final /* synthetic */ WifiP2pDevice f63516b;

        /* renamed from: c */
        public final /* synthetic */ C32227p<String, String, C13598b0> f63517c;

        /* renamed from: sv0.b$c$a */
        public static final class C22403a implements WifiP2pManager.ActionListener {

            /* renamed from: a */
            public final /* synthetic */ C22400b f63518a;

            /* renamed from: b */
            public final /* synthetic */ WifiP2pDevice f63519b;

            /* renamed from: c */
            public final /* synthetic */ C32227p<String, String, C13598b0> f63520c;

            public C22403a(C22400b bVar, WifiP2pDevice wifiP2pDevice, C32227p<? super String, ? super String, C13598b0> pVar) {
                this.f63518a = bVar;
                this.f63519b = wifiP2pDevice;
                this.f63520c = pVar;
            }

            public void onFailure(int i) {
                Log.m105920e("MicroMsg.WifiDirectCore", "cancelConnect initiated");
            }

            public void onSuccess() {
                Log.m105924i("MicroMsg.WifiDirectCore", "cancelConnect initiated");
                this.f63518a.mo35548a(this.f63519b, this.f63520c);
            }
        }

        /* renamed from: sv0.b$c$b */
        public static final class C22404b implements WifiP2pManager.ConnectionInfoListener {

            /* renamed from: a */
            public final /* synthetic */ C32227p<String, String, C13598b0> f63521a;

            /* renamed from: b */
            public final /* synthetic */ WifiP2pDevice f63522b;

            public C22404b(C32227p<? super String, ? super String, C13598b0> pVar, WifiP2pDevice wifiP2pDevice) {
                this.f63521a = pVar;
                this.f63522b = wifiP2pDevice;
            }

            public final void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
                if ((wifiP2pInfo != null ? wifiP2pInfo.groupOwnerAddress : null) != null) {
                    C32227p<String, String, C13598b0> pVar = this.f63521a;
                    if (pVar != null) {
                        WifiP2pDevice wifiP2pDevice = this.f63522b;
                        String hostAddress = wifiP2pInfo.groupOwnerAddress.getHostAddress();
                        String str = wifiP2pDevice.deviceAddress;
                        C87412m.m108593f(str, "device.deviceAddress");
                        C13598b0 invoke = pVar.invoke(hostAddress, str);
                    }
                    Log.m105924i("MicroMsg.WifiDirectCore", "Connect onSuccess:" + wifiP2pInfo + " hostAddress:" + wifiP2pInfo.groupOwnerAddress.getHostAddress());
                    return;
                }
                Log.m105920e("MicroMsg.WifiDirectCore", "Connect onSuccess:info is null " + wifiP2pInfo);
            }
        }

        public C22402c(C22400b bVar, WifiP2pDevice wifiP2pDevice, C32227p<? super String, ? super String, C13598b0> pVar) {
            this.f63515a = bVar;
            this.f63516b = wifiP2pDevice;
            this.f63517c = pVar;
        }

        public void onFailure(int i) {
            String str = this.f63516b.deviceAddress;
            WifiP2pDevice wifiP2pDevice = this.f63515a.f63507g;
            if (str.equals(wifiP2pDevice != null ? wifiP2pDevice.deviceAddress : null)) {
                this.f63515a.f63507g = null;
            }
            Log.m105920e("MicroMsg.WifiDirectCore", "Connect onFailure:" + this.f63516b.deviceName + " reason:" + i);
            if (i == 2) {
                C22400b bVar = this.f63515a;
                int i2 = bVar.f63509i;
                bVar.f63509i = i2 + 1;
                if (i2 <= 5) {
                    bVar.f63503c.cancelConnect(bVar.f63504d, new C22403a(bVar, this.f63516b, this.f63517c));
                }
            }
        }

        public void onSuccess() {
            C22400b bVar = this.f63515a;
            WifiP2pDevice wifiP2pDevice = this.f63516b;
            bVar.f63507g = wifiP2pDevice;
            bVar.f63503c.requestConnectionInfo(bVar.f63504d, new C22404b(this.f63517c, wifiP2pDevice));
            Log.m105924i("MicroMsg.WifiDirectCore", "Connect onSuccess:" + this.f63516b.deviceName);
        }
    }

    /* renamed from: sv0.b$d */
    public static final class C22405d extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22400b f63523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22405d(C22400b bVar) {
            super(2);
            this.f63523d = bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = (String) obj2;
            C87412m.m108594g(str, MJTextResolver.KEY_DEVICE_NAME);
            Log.m105925i("MicroMsg.WifiDirectCore", " setDeviceName is state:%b, deviceName:%s", Boolean.valueOf(booleanValue), str);
            C22400b bVar = this.f63523d;
            bVar.f63503c.createGroup(bVar.f63504d, new C22409c(bVar));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sv0.b$e */
    public static final class C22406e implements WifiP2pManager.ActionListener {
        public void onFailure(int i) {
            Log.m105920e("MicroMsg.WifiDirectCore", "cancelConnect initiated");
        }

        public void onSuccess() {
            Log.m105924i("MicroMsg.WifiDirectCore", "cancelConnect initiated");
        }
    }

    /* renamed from: sv0.b$f */
    public static final class C22407f implements WifiP2pManager.ActionListener {
        public void onFailure(int i) {
            Log.m105920e("MicroMsg.WifiDirectCore", "stopPeerDiscovery onFailure");
        }

        public void onSuccess() {
            Log.m105924i("MicroMsg.WifiDirectCore", "stopPeerDiscovery onSuccess");
        }
    }

    /* renamed from: sv0.b$b */
    public static final class C22408b {
        public C22408b(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo35562a(Context context) {
            C87412m.m108594g(context, "context");
            return C111105a.m151499a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        }
    }

    public C22400b(Context context) {
        C87412m.m108594g(context, "context");
        this.f63501a = context;
        Object systemService = context.getSystemService("wifip2p");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.net.wifi.p2p.WifiP2pManager");
        this.f63503c = (WifiP2pManager) systemService;
        WifiP2pManager.Channel initialize = this.f63503c.initialize(context, context.getMainLooper(), new C22401a(this));
        C87412m.m108593f(initialize, "wifiP2pManager.initializ…        ip = \"\"\n        }");
        this.f63504d = initialize;
    }

    /* renamed from: a */
    public final void mo35548a(WifiP2pDevice wifiP2pDevice, C32227p<? super String, ? super String, C13598b0> pVar) {
        C87412m.m108594g(wifiP2pDevice, TPReportKeys.Common.COMMON_DEVICE_NAME);
        if (f63500n.mo35562a(this.f63501a)) {
            String str = wifiP2pDevice.deviceAddress;
            WifiP2pDevice wifiP2pDevice2 = this.f63507g;
            if (str.equals(wifiP2pDevice2 != null ? wifiP2pDevice2.deviceAddress : null)) {
                Log.m105920e("MicroMsg.WifiDirectCore", "Connect failed with same deviceName:" + wifiP2pDevice.deviceName + " deviceAddress:" + wifiP2pDevice.deviceAddress);
                return;
            }
            WifiP2pConfig wifiP2pConfig = new WifiP2pConfig();
            wifiP2pConfig.groupOwnerIntent = 15;
            wifiP2pConfig.deviceAddress = wifiP2pDevice.deviceAddress;
            wifiP2pConfig.wps.setup = 0;
            Log.m105924i("MicroMsg.WifiDirectCore", "Connect deviceName:" + wifiP2pDevice.deviceName);
            this.f63503c.connect(this.f63504d, wifiP2pConfig, new C22402c(this, wifiP2pDevice, pVar));
        }
    }

    /* renamed from: b */
    public final void mo35549b() {
        int i = this.f63510j;
        int i2 = i + 1;
        this.f63510j = i2;
        if (i > 10) {
            Log.m105921e("MicroMsg.WifiDirectCore", "createGroup error tryCreateGroupCount:%d", Integer.valueOf(i2));
            C22399a aVar = this.f63508h;
            if (aVar != null) {
                aVar.onFailed(this.f63502b);
            }
        } else if (f63500n.mo35562a(this.f63501a)) {
            String str = "WX_" + ((int) (Math.random() * ((double) 10000)));
            C22405d dVar = new C22405d(this);
            C87412m.m108594g(str, "devName");
            try {
                Log.m105925i("MicroMsg.WifiDirectCore", "setDeviceName devName:%s", str);
                Method method = WifiP2pManager.class.getMethod("setDeviceName", new Class[]{WifiP2pManager.Channel.class, String.class, WifiP2pManager.ActionListener.class});
                C87412m.m108593f(method, "WifiP2pManager::class.ja…:class.java\n            )");
                method.setAccessible(true);
                method.invoke(this.f63503c, new Object[]{this.f63504d, str, new C36844g(dVar, str)});
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WifiDirectCore", "setDeviceName ", e);
                C13598b0 b0Var = (C13598b0) dVar.invoke(Boolean.TRUE, str);
            }
        }
    }

    /* renamed from: c */
    public final void mo35550c() {
        this.f63509i = 0;
        this.f63503c.cancelConnect(this.f63504d, new C22406e());
        this.f63503c.stopPeerDiscovery(this.f63504d, new C22407f());
        BroadcastReceiver broadcastReceiver = this.f63506f;
        if (broadcastReceiver != null) {
            this.f63501a.unregisterReceiver(broadcastReceiver);
        }
        this.f63507g = null;
        this.f63511k = "";
        this.f63503c.removeGroup(this.f63504d, new C36843e((C32226l<? super Integer, C13598b0>) null));
        Log.m105924i("MicroMsg.WifiDirectCore", "wifi-direct finish");
    }

    /* renamed from: d */
    public final void mo35551d(String str) {
        this.f63512l = str;
        Log.m105925i("MicroMsg.WifiDirectCore", "initiate:%s", Boolean.valueOf(this.f63513m));
        if (!this.f63513m) {
            this.f63505e.addAction("android.net.wifi.p2p.STATE_CHANGED");
            this.f63505e.addAction("android.net.wifi.p2p.PEERS_CHANGED");
            this.f63505e.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            this.f63505e.addAction("android.net.wifi.p2p.THIS_DEVICE_CHANGED");
            WifiDirectReceiver wifiDirectReceiver = new WifiDirectReceiver(this, this.f63503c, this.f63504d);
            this.f63506f = wifiDirectReceiver;
            this.f63501a.registerReceiver(wifiDirectReceiver, this.f63505e);
            if (f63500n.mo35562a(this.f63501a)) {
                Log.m105924i("MicroMsg.WifiDirectCore", "discover ");
                this.f63503c.discoverPeers(this.f63504d, new C36842d());
            }
            this.f63513m = true;
        }
    }
}
