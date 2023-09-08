package tm0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.ExportErrorStatus;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: tm0.k */
public class C90538k extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 39;
    public static final String NAME = "getNetworkType";

    /* renamed from: g */
    public final AtomicBoolean f260146g = new AtomicBoolean(false);

    /* renamed from: h */
    public Method f260147h = null;

    /* renamed from: i */
    public volatile int f260148i = Integer.MAX_VALUE;

    /* renamed from: j */
    public final AtomicBoolean f260149j = new AtomicBoolean(false);

    /* renamed from: n */
    public final C90542d f260150n = new C90542d((C90539a) null);

    /* renamed from: tm0.k$a */
    public class C90539a implements C90541c {

        /* renamed from: a */
        public Future<?> f260151a;

        /* renamed from: b */
        public final /* synthetic */ Map f260152b;

        /* renamed from: c */
        public final /* synthetic */ C82381f f260153c;

        /* renamed from: d */
        public final /* synthetic */ int f260154d;

        public C90539a(Map map, C82381f fVar, int i) {
            this.f260152b = map;
            this.f260153c = fVar;
            this.f260154d = i;
            C119179t tVar = C119157j.f356862d;
            k$a$$a k_a__a = new k$a$$a(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            this.f260151a = jVar.mo183892w(k_a__a, 3000, false);
        }

        /* renamed from: a */
        public void mo124677a(int i) {
            if (this.f260151a.isDone()) {
                Log.m105929w("MicroMsg.JsApiGetNetworkType", "onGetSignalStrength, dbm: %d, fallbackFuture done too early", Integer.valueOf(i));
                return;
            }
            this.f260151a.cancel(true);
            mo124678b(i);
        }

        /* renamed from: b */
        public final void mo124678b(int i) {
            Log.m105924i("MicroMsg.JsApiGetNetworkType", "onGetSignalStrengthInternal, dbm: " + i);
            if (Integer.MAX_VALUE != i) {
                this.f260152b.put("signalStrength", Integer.valueOf(i));
            }
            this.f260153c.mo109647a(this.f260154d, C90538k.this.mo115112m("ok", this.f260152b));
        }
    }

    /* renamed from: tm0.k$b */
    public class C90540b implements C90541c {

        /* renamed from: a */
        public final /* synthetic */ Map f260156a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f260157b;

        /* renamed from: c */
        public final /* synthetic */ int f260158c;

        public C90540b(Map map, C82381f fVar, int i) {
            this.f260156a = map;
            this.f260157b = fVar;
            this.f260158c = i;
        }

        /* renamed from: a */
        public void mo124677a(int i) {
            Log.m105924i("MicroMsg.JsApiGetNetworkType", "onGetSignalStrength, dbm: " + i);
            if (Integer.MAX_VALUE != i) {
                this.f260156a.put("signalStrength", Integer.valueOf(i));
            }
            this.f260157b.mo109647a(this.f260158c, C90538k.this.mo115112m("ok", this.f260156a));
        }
    }

    /* renamed from: tm0.k$c */
    public interface C90541c {
        /* renamed from: a */
        void mo124677a(int i);
    }

    /* renamed from: tm0.k$d */
    public class C90542d {

        /* renamed from: a */
        public PhoneStateListener f260160a = null;

        /* renamed from: b */
        public boolean f260161b = false;

        /* renamed from: c */
        public List<C90541c> f260162c = null;

        public C90542d(C90539a aVar) {
        }
    }

    /* renamed from: tm0.k$e */
    public enum C90543e {
        None("none"),
        Mobile_2g("2g"),
        Mobile_3g("3g"),
        Mobile_4g("4g"),
        Mobile_5g("5g"),
        Wifi("wifi"),
        Unknown("unknown");
        

        /* renamed from: d */
        public final String f260172d;

        /* access modifiers changed from: public */
        C90543e(String str) {
            this.f260172d = str;
        }
    }

    /* renamed from: x */
    public static C90543e m113361x(Context context) {
        C90543e eVar = C90543e.Unknown;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                return eVar;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getType() == 1) {
                        return C90543e.Wifi;
                    }
                    if (!(activeNetworkInfo.getSubtype() == 2 || activeNetworkInfo.getSubtype() == 1)) {
                        if (activeNetworkInfo.getSubtype() != 4) {
                            if (activeNetworkInfo.getSubtype() >= 5 && activeNetworkInfo.getSubtype() < 13) {
                                return C90543e.Mobile_3g;
                            }
                            if (activeNetworkInfo.getSubtype() >= 13 && activeNetworkInfo.getSubtype() < 20) {
                                return C90543e.Mobile_4g;
                            }
                            if (activeNetworkInfo.getSubtype() >= 20) {
                                return C90543e.Mobile_5g;
                            }
                            return eVar;
                        }
                    }
                    return C90543e.Mobile_2g;
                }
            }
            return C90543e.None;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiGetNetworkType", e, "", new Object[0]);
        }
    }

    /* renamed from: u */
    public final void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        boolean z;
        HashMap hashMap = new HashMap();
        C90543e y = mo124676y(fVar);
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("https.proxyHost");
        Log.m105925i("MicroMsg.JsApiGetNetworkType", "invoke appId:%s, networkType:%s,httpProxyHost:%s,httpsProxyHost:%s", fVar.getAppId(), y, property, property2);
        hashMap.put("networkType", y.f260172d);
        if (!Util.isNullOrNil(property) || !Util.isNullOrNil(property2)) {
            hashMap.put("hasSystemProxy", Boolean.TRUE);
        } else {
            hashMap.put("hasSystemProxy", Boolean.FALSE);
        }
        switch (y.ordinal()) {
            case 0:
            case 6:
                fVar.mo109647a(i, mo115112m("ok", hashMap));
                return;
            case 1:
            case 2:
            case 3:
            case 4:
                C90539a aVar = new C90539a(hashMap, fVar, i);
                if (!this.f260149j.getAndSet(true)) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C37212l(this, fVar));
                }
                C90542d dVar = this.f260150n;
                synchronized (dVar) {
                    z = dVar.f260161b;
                }
                if (z) {
                    aVar.mo124677a(this.f260148i);
                    return;
                }
                C90542d dVar2 = this.f260150n;
                synchronized (dVar2) {
                    if (dVar2.f260162c == null) {
                        dVar2.f260162c = new ArrayList();
                    }
                    dVar2.f260162c.add(aVar);
                }
                return;
            case 5:
                C90540b bVar = new C90540b(hashMap, fVar, i);
                if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    bVar.mo124677a(ConnectivityCompat.Companion.getWiFiRssi());
                    return;
                }
                Log.m105928w("MicroMsg.JsApiGetNetworkType", "getWifiSignalStrength, getConnectionInfo is invalid");
                bVar.mo124677a(Integer.MAX_VALUE);
                return;
            default:
                return;
        }
    }

    /* renamed from: w */
    public final int mo124675w(SignalStrength signalStrength) {
        int i;
        if (signalStrength.isGsm()) {
            int gsmSignalStrength = signalStrength.getGsmSignalStrength();
            i = -1;
            if (gsmSignalStrength == 99) {
                gsmSignalStrength = -1;
            }
            if (gsmSignalStrength != -1) {
                i = (gsmSignalStrength * 2) + ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS;
            }
        } else {
            i = signalStrength.getCdmaDbm();
        }
        Log.m105924i("MicroMsg.JsApiGetNetworkType", "getDbmFallback, dBm: " + i);
        return i;
    }

    /* renamed from: y */
    public C90543e mo124676y(C82381f fVar) {
        return m113361x(fVar.getContext());
    }
}
