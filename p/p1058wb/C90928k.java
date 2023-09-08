package p1058wb;

import com.tencent.mars.cdn.AndroidCertVerifyResult;
import com.tencent.mars.cdn.CronetMultiNetLinkWaysUtil;
import com.tencent.mars.cdn.X509Util;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.websocket.libwcwss.WcwssNative;
import gy3.C87412m;
import hr0.C87583a;
import hr0.C87584b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import javax.net.ssl.X509TrustManager;
import jr3.C33653a;
import js0.C88023q;
import li0.C88508b;
import li0.C88509c;
import p206nj.C88957l;
import p224ra.C12964b;
import p224ra.C89909e;
import sp0.C90272a;
import sp0.C90309m;

/* renamed from: wb.k */
public class C90928k {

    /* renamed from: a */
    public String f260936a = null;

    /* renamed from: b */
    public int f260937b = -1;

    /* renamed from: c */
    public C90272a f260938c = null;

    /* renamed from: d */
    public X509TrustManager f260939d = null;

    /* renamed from: e */
    public boolean f260940e = false;

    /* renamed from: f */
    public boolean f260941f = true;

    /* renamed from: g */
    public String f260942g = null;

    /* renamed from: h */
    public WcwssNative f260943h;

    /* renamed from: i */
    public final C90937g f260944i = new C90937g(this, new C90933d());

    /* renamed from: wb.k$a */
    public class C90929a implements WcwssNative.IWcWssReportListener {
        public C90929a(C90928k kVar) {
        }

        public int getNetworkType() {
            try {
                int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
                Log.m105925i("Luggage.WcWssNativeInstallHelper", "getStatisticsNetType ret:%d", Integer.valueOf(netType));
                if (netType == -1) {
                    return -1;
                }
                if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
                    return 3;
                }
                if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
                    return 4;
                }
                if (NetStatusUtil.is4G(MMApplicationContext.getContext())) {
                    return 5;
                }
                if (NetStatusUtil.isWifi(netType)) {
                    return 1;
                }
                return NetStatusUtil.isWap(netType) ? 2 : 6;
            } catch (Exception e) {
                Log.printErrStackTrace("Luggage.WcWssNativeInstallHelper", e, "getStatisticsNetType_", new Object[0]);
                return -1;
            }
        }

        public void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3) {
            Log.m105918d("Luggage.WcWssNativeInstallHelper", "MMWcWss onIdKeyStat");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < iArr.length; i++) {
                arrayList.add(new IDKey(iArr[i], iArr2[i], iArr3[i]));
            }
            ((C87583a) C89909e.m112439d(C87583a.class, true)).mo121687a(arrayList, false);
        }

        public void onKvStat(int i, String str) {
            Log.m105919d("Luggage.WcWssNativeInstallHelper", "MMWcWss onKvStat logId:%d", Integer.valueOf(i));
            ((C87584b) C89909e.m112439d(C87584b.class, true)).kvStat(i, str);
        }
    }

    /* renamed from: wb.k$b */
    public class C90930b implements WcwssNative.IWcWssWebSocketListener {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f260945a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f260946b;

        /* renamed from: wb.k$b$a */
        public class C90931a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f260948d;

            /* renamed from: e */
            public final /* synthetic */ long f260949e;

            /* renamed from: f */
            public final /* synthetic */ int f260950f;

            public C90931a(String str, long j, int i) {
                this.f260948d = str;
                this.f260949e = j;
                this.f260950f = i;
            }

            public void run() {
                Log.m105919d("Luggage.WcWssNativeInstallHelper", "MMWcWss jsThreadHandler run onCallBack contextId:%s", this.f260948d);
                C90928k.this.f260943h.updateInterface(this.f260949e, this.f260950f);
            }
        }

        public C90930b(WeakReference weakReference, C82381f fVar) {
            this.f260945a = weakReference;
            this.f260946b = fVar;
        }

        public WcwssNative.IWcWssWebSocketListener.BindAndDnsReturn bindSocketToCellularAndDnsByCellular(int i, String str) {
            CronetMultiNetLinkWaysUtil.BindAndDnsReturnKt bindSocketToCellularAndDnsByCellular = CronetMultiNetLinkWaysUtil.Companion.instance().bindSocketToCellularAndDnsByCellular(i, str, MMApplicationContext.getContext());
            Log.m105919d("Luggage.WcWssNativeInstallHelper", "bind and dns ip %s", bindSocketToCellularAndDnsByCellular.getHostIpStr());
            WcwssNative.IWcWssWebSocketListener.BindAndDnsReturn bindAndDnsReturn = new WcwssNative.IWcWssWebSocketListener.BindAndDnsReturn();
            bindAndDnsReturn.hostIpStr = bindSocketToCellularAndDnsByCellular.getHostIpStr();
            bindAndDnsReturn.resultCode = bindSocketToCellularAndDnsByCellular.getResultCode();
            return bindAndDnsReturn;
        }

        public int doCertificateVerify(String str, long j, String str2, byte[][] bArr) {
            String str3 = str2;
            byte[][] bArr2 = bArr;
            C90928k kVar = C90928k.this;
            if (kVar.f260938c == null || kVar.f260939d == null) {
                kVar.f260938c = (C90272a) this.f260946b.mo109671p(C90272a.class);
                C90928k kVar2 = C90928k.this;
                C90272a aVar = kVar2.f260938c;
                if (aVar != null) {
                    kVar2.f260939d = C90309m.m113082q(aVar);
                    if (C90928k.this.f260939d == null) {
                        Log.m105920e("Luggage.WcWssNativeInstallHelper", "MMWcWss doCertificateVerify getTrustManager fail");
                    }
                } else {
                    Log.m105920e("Luggage.WcWssNativeInstallHelper", "MMWcWss doCertificateVerify getConfig fail");
                }
            }
            X509TrustManager x509TrustManager = C90928k.this.f260939d;
            Class cls = C87583a.class;
            Log.m105924i("Luggage.WcWssNativeInstallHelper", "certifivate verify for " + str3);
            try {
                AndroidCertVerifyResult verifyServerCertificates = X509Util.verifyServerCertificates(bArr2, "RSA", str3, 1, x509TrustManager);
                Log.m105925i("Luggage.WcWssNativeInstallHelper", "host %s rsa verify result %d, isknownroots %b, ishostmatched %b", str3, Integer.valueOf(verifyServerCertificates.getStatus()), Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()), Boolean.valueOf(verifyServerCertificates.isIssuedByHostMatched()));
                if (verifyServerCertificates.getStatus() != 0) {
                    verifyServerCertificates = X509Util.verifyServerCertificates(bArr2, "ECDSA", str3, 1, x509TrustManager);
                    Log.m105925i("Luggage.WcWssNativeInstallHelper", "host %s ecdsa verify result %d, isknownroots %b, ishostmatched %b", str3, Integer.valueOf(verifyServerCertificates.getStatus()), Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()), Boolean.valueOf(verifyServerCertificates.isIssuedByHostMatched()));
                }
                if (verifyServerCertificates.getStatus() != 0) {
                    ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 7, 1, false);
                }
                if (verifyServerCertificates.getStatus() == 0 && !verifyServerCertificates.isIssuedByHostMatched()) {
                    ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 8, 1, false);
                }
                if (verifyServerCertificates.getStatus() == 0 && !verifyServerCertificates.isIssuedByKnownRoot()) {
                    ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 9, 1, false);
                }
                return (verifyServerCertificates.getStatus() != 0 || !verifyServerCertificates.isIssuedByKnownRoot()) ? -1 : 0;
            } catch (Exception e) {
                Log.printErrStackTrace("Luggage.WcWssNativeInstallHelper", e, "doCertificateVerify Exception", new Object[0]);
                return -1;
            }
        }

        public void onStateChange(String str, long j, int i) {
            ((C83181q) this.f260945a.get()).post(new C90931a(str, j, i));
        }
    }

    /* renamed from: wb.k$c */
    public class C90932c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83165i f260952d;

        /* renamed from: e */
        public final /* synthetic */ WcwssNative.IWcWssWebSocketListener f260953e;

        /* renamed from: f */
        public final /* synthetic */ WcwssNative.IWcWssReportListener f260954f;

        public C90932c(C83165i iVar, WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener, WcwssNative.IWcWssReportListener iWcWssReportListener) {
            this.f260952d = iVar;
            this.f260953e = iWcWssWebSocketListener;
            this.f260954f = iWcWssReportListener;
        }

        public void run() {
            Log.m105924i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding setCallback ");
            if (C90928k.this.f260936a != null) {
                Log.m105920e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding mContextId != null");
                return;
            }
            C83187w wVar = (C83187w) this.f260952d.mo63321n0(C83187w.class);
            if (wVar == null) {
                Log.m105920e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding v8Addon is null");
                return;
            }
            C90928k.this.f260943h = new WcwssNative();
            C90928k kVar = C90928k.this;
            WcwssNative wcwssNative = kVar.f260943h;
            if (wcwssNative != null) {
                if (kVar.f260941f) {
                    kVar.f260936a = wcwssNative.initWcwss(wVar.mo115417m(), wVar.mo115393J0(), wVar.mo115414j());
                } else {
                    kVar.f260936a = wcwssNative.initWcwss(wVar.mo115417m(), wVar.mo115393J0(), 0);
                }
                C90928k kVar2 = C90928k.this;
                kVar2.f260937b = kVar2.f260943h.setCallback(this.f260953e, this.f260954f);
                C90928k kVar3 = C90928k.this;
                Log.m105925i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding setCallback mContextId:%s,mInitCallBack:%d", kVar3.f260936a, Integer.valueOf(kVar3.f260937b));
                return;
            }
            Log.m105920e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding mWcwssNative = null");
        }
    }

    /* renamed from: wb.k$d */
    public class C90933d implements Runnable {
        public C90933d() {
        }

        public void run() {
            synchronized (C90928k.this) {
                C90928k kVar = C90928k.this;
                if (kVar.f260943h != null) {
                    Log.m105925i("Luggage.WcWssNativeInstallHelper", "destroyTask destroyWcWssBinding mContextId:%s", kVar.f260936a);
                    C90928k.this.f260943h.destoryWcwss();
                    C90928k.this.f260943h = null;
                } else {
                    Log.m105920e("Luggage.WcWssNativeInstallHelper", "destroyTask mWcwssNative is null");
                }
            }
        }
    }

    /* renamed from: wb.k$e */
    public class C90934e implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ C83181q f260957d;

        /* renamed from: wb.k$e$a */
        public class C90935a implements Runnable {
            public C90935a() {
            }

            public void run() {
                WcwssNative wcwssNative = C90928k.this.f260943h;
                if (wcwssNative != null) {
                    wcwssNative.doOnRunningState();
                }
            }
        }

        public C90934e(C83181q qVar) {
            this.f260957d = qVar;
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            if (C88508b.SUSPEND == bVar && C90928k.this.f260943h != null) {
                this.f260957d.mo115419p(new C90935a(), true);
            }
        }
    }

    /* renamed from: wb.k$f */
    public class C90936f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82554k f260960d;

        public C90936f(C82554k kVar) {
            this.f260960d = kVar;
        }

        public void run() {
            ArrayList<String> arrayList;
            ArrayList<String> arrayList2;
            Log.m105925i("Luggage.WcWssNativeInstallHelper", "initConfigWcWss initConfig mContextId:%s", C90928k.this.f260936a);
            if (C90928k.this.f260943h == null) {
                Log.m105920e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss mWcwssNative is null");
                return;
            }
            C90272a aVar = (C90272a) this.f260960d.mo109671p(C90272a.class);
            if (aVar != null) {
                Log.m105925i("Luggage.WcWssNativeInstallHelper", "wcwss mbzType:%s,,websocketTimeoutMS:%d,userAgentString :%s,referer:%s,mode:%d", C90928k.this.f260942g, Integer.valueOf(aVar.f259130g), aVar.f259120B, aVar.f259122D, Integer.valueOf(aVar.f259123E));
                HashMap hashMap = new HashMap();
                hashMap.put("referer", aVar.f259122D);
                hashMap.put("User-Agent", aVar.f259120B);
                hashMap.put("bzType", C90928k.this.f260942g);
                hashMap.put("mode", String.valueOf(aVar.f259123E));
                hashMap.put("timeout", String.valueOf(aVar.f259130g));
                C90928k.this.f260943h.initConfig(hashMap);
                int i = aVar.f259123E;
                if (i == 0) {
                    Log.m105921e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss invalid mode:%d", Integer.valueOf(i));
                } else if (i == 1) {
                    ArrayList<String> arrayList3 = aVar.f259143w;
                    if (arrayList3 == null || arrayList3.size() == 0) {
                        Log.m105920e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss blacklistHeaders is null");
                        arrayList2 = null;
                    } else {
                        arrayList2 = aVar.f259143w;
                    }
                    C90928k.this.f260943h.initConfigWhiteBlack((ArrayList<String>) null, arrayList2);
                } else if (i == 2) {
                    ArrayList<String> arrayList4 = aVar.f259144x;
                    if (arrayList4 == null || arrayList4.size() == 0) {
                        Log.m105920e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss whitelistHeaders is null");
                        arrayList = null;
                    } else {
                        arrayList = aVar.f259144x;
                    }
                    C90928k.this.f260943h.initConfigWhiteBlack(arrayList, (ArrayList<String>) null);
                } else {
                    Log.m105921e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss invalid mode:%d", Integer.valueOf(i));
                }
            } else {
                Log.m105920e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss networkConfig is null");
            }
        }
    }

    /* renamed from: wb.k$g */
    public class C90937g extends C88023q implements C83174m.C83175a {
        public C90937g(C90928k kVar, Runnable runnable) {
            super(runnable);
        }

        public void onDestroy() {
            run();
        }
    }

    /* renamed from: wb.k$h */
    public interface C90938h extends C12964b {
        boolean isOpen();

        boolean tf0();
    }

    /* renamed from: a */
    public void mo125008a(C83165i iVar, C82381f fVar, int i) {
        Class cls = C83174m.class;
        Class<C90928k> cls2 = C90928k.class;
        Log.m105924i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding");
        C90938h hVar = (C90938h) fVar.mo109668l(C90938h.class);
        if (hVar != null) {
            this.f260940e = hVar.isOpen();
        }
        if (!this.f260940e) {
            Log.m105920e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding xSwitch false");
        } else if (iVar == null) {
            Log.m105920e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding jsruntime is null");
        } else {
            this.f260942g = String.valueOf(i);
            C88957l.m111079o("owl", cls2.getClassLoader());
            C88957l.m111079o("wcwss", cls2.getClassLoader());
            C33653a.f91067a.loadLibrary("mmwcwss");
            C83181q qVar = (C83181q) iVar.mo63321n0(C83181q.class);
            if (qVar == null) {
                Log.m105920e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding jsThreadHandler is null");
                return;
            }
            WeakReference weakReference = new WeakReference(qVar);
            C90915h hVar2 = (C90915h) fVar.mo109668l(C90915h.class);
            if (hVar2 != null) {
                boolean Wv = hVar2.mo60802Wv();
                this.f260941f = Wv;
                Log.m105925i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding xLibUVSwitch:%b ", Boolean.valueOf(Wv));
            }
            C90929a aVar = new C90929a(this);
            C83174m mVar = (C83174m) iVar.mo63321n0(cls);
            C87412m.m108594g(mVar, "lifecycleOwner");
            C90939l lVar = new C90939l(aVar, mVar);
            C90930b bVar = new C90930b(weakReference, fVar);
            C83174m mVar2 = (C83174m) iVar.mo63321n0(cls);
            C87412m.m108594g(mVar2, "lifecycleOwner");
            qVar.mo115423q0(new C90932c(iVar, new C90941m(bVar, mVar2), lVar));
        }
    }

    /* renamed from: b */
    public void mo125009b(C83165i iVar) {
        Log.m105925i("Luggage.WcWssNativeInstallHelper", "destroyWcWssBinding mContextId:%s", this.f260936a);
        if (!this.f260940e) {
            Log.m105920e("Luggage.WcWssNativeInstallHelper", "destroyWcWssBinding xSwitch false");
        } else if (iVar == null) {
            Log.m105920e("Luggage.WcWssNativeInstallHelper", "destroyWcWssBinding jsruntime is null");
        } else {
            ((C83174m) iVar.mo63321n0(C83174m.class)).mo115384z0(this.f260944i);
        }
    }

    /* renamed from: c */
    public void mo125010c(C83165i iVar, C82554k kVar) {
        Log.m105925i("Luggage.WcWssNativeInstallHelper", "initConfigWcWss mContextId:%s", this.f260936a);
        if (!this.f260940e) {
            Log.m105920e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss xSwitch false");
        } else if (iVar == null) {
            Log.m105920e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss jsruntime is null");
        } else {
            C83181q qVar = (C83181q) iVar.mo63321n0(C83181q.class);
            if (qVar == null) {
                Log.m105920e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss jsThreadHandler is null");
                return;
            }
            C90938h hVar = (C90938h) kVar.mo109668l(C90938h.class);
            boolean z = hVar != null && hVar.tf0();
            Log.m105925i("Luggage.WcWssNativeInstallHelper", "initConfigWcWss appId:%s, closeWcWssSocketsWhenSuspend:%b", kVar.getAppId(), Boolean.valueOf(z));
            if (z) {
                kVar.getRuntime().f238113K.mo122978a(new C90934e(qVar));
            }
            qVar.mo115423q0(new C90936f(kVar));
        }
    }
}
