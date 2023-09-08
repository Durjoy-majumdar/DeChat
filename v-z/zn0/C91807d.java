package zn0;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import ao0.C79605a;
import ao0.C79612e;
import ao0.C79614g;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import zn0.C91797a;

/* renamed from: zn0.d */
public class C91807d extends C82268c {
    public static final int CTRL_INDEX = 314;
    public static final String NAME = "startWifi";

    /* renamed from: g */
    public static boolean f262895g;

    /* renamed from: zn0.d$a */
    public class C91808a implements C79605a.C79608b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f262896a;

        public C91808a(C82381f fVar) {
            this.f262896a = fVar;
        }

        /* renamed from: a */
        public void mo109748a() {
            C91807d dVar = C91807d.this;
            C82381f fVar = this.f262896a;
            dVar.getClass();
            try {
                C91797a.C91800c cVar = new C91797a.C91800c();
                HashMap hashMap = new HashMap();
                hashMap.put("wifi", new C79612e().mo109754b());
                cVar.mo115161k(fVar);
                cVar.f242409h = 0;
                cVar.mo115165o(hashMap);
                cVar.mo115158h();
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.JsApiStartWifi", "mWiFiEventReceiver is error");
                Log.printErrStackTrace("MicroMsg.JsApiStartWifi", e, "", new Object[0]);
            }
        }

        /* renamed from: b */
        public void mo109749b(C79612e eVar) {
            if (!eVar.mo109753a()) {
                Log.m105928w("MicroMsg.JsApiStartWifi", "onConnectAcceptIncomplete, wifiItem is invalid");
                return;
            }
            try {
                C91797a.C91801d dVar = new C91797a.C91801d();
                HashMap hashMap = new HashMap();
                hashMap.put("wifi", eVar.mo109754b());
                dVar.mo115161k(this.f262896a);
                dVar.f242409h = 0;
                dVar.mo115165o(hashMap);
                dVar.mo115158h();
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.JsApiStartWifi", "onConnectAcceptIncomplete error");
                Log.printErrStackTrace("MicroMsg.JsApiStartWifi", e, "", new Object[0]);
            }
        }

        /* renamed from: c */
        public void mo109750c(C79612e eVar) {
            if (!eVar.mo109753a()) {
                Log.m105928w("MicroMsg.JsApiStartWifi", "onConnect, wifiItem is invalid");
                return;
            }
            try {
                C91797a.C91800c cVar = new C91797a.C91800c();
                HashMap hashMap = new HashMap();
                hashMap.put("wifi", eVar.mo109754b());
                cVar.mo115161k(this.f262896a);
                cVar.f242409h = 0;
                cVar.mo115165o(hashMap);
                cVar.mo115158h();
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.JsApiStartWifi", "onConnect error");
                Log.printErrStackTrace("MicroMsg.JsApiStartWifi", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: zn0.d$b */
    public class C91809b extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ Context f262898d;

        /* renamed from: e */
        public final /* synthetic */ C82381f f262899e;

        public C91809b(C91807d dVar, Context context, C82381f fVar) {
            this.f262898d = context;
            this.f262899e = fVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            C79605a.m96670a(this.f262898d);
            C91807d.f262895g = false;
            C83231l.m102144e(this.f262899e.getAppId(), this);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        int i2 = i;
        Log.m105924i("MicroMsg.JsApiStartWifi", "invoke startWifi");
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105920e("MicroMsg.JsApiStartWifi", "mContext is null, invoke fail!");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 12010);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:context is null");
            }
            hashMap.put("errno", 4);
            fVar2.mo109647a(i2, mo115114o("fail:context is null", hashMap));
            return;
        }
        C79614g.m96681b(context);
        if (!f262895g) {
            Log.m105924i("MicroMsg.AppBrand.ConnectWifiEvents", "enable");
            if (C79605a.f233446a) {
                Log.m105924i("MicroMsg.AppBrand.ConnectWifiEvents", "enable, already enabled");
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    C79605a.f233446a = true;
                    if (C79605a.f233447b == null) {
                        C79605a.C79606a aVar = new C79605a.C79606a();
                        C79605a.f233447b = aVar;
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        intentFilter.setPriority(Integer.MAX_VALUE);
                        applicationContext.registerReceiver(aVar, intentFilter);
                        if (Build.VERSION.SDK_INT >= 24) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
                            if (connectivityManager == null) {
                                Log.m105928w("MicroMsg.AppBrand.ConnectWifiEvents", "enable, connectivityManager is null");
                            } else {
                                try {
                                    connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().removeCapability(14).build(), aVar.f233448a);
                                } catch (Exception e) {
                                    Log.printErrStackTrace("MicroMsg.AppBrand.ConnectWifiEvents", e, "registerNetworkCallback failure", new Object[0]);
                                }
                            }
                        }
                    } else {
                        Log.m105928w("MicroMsg.AppBrand.ConnectWifiEvents", "enable, receiver is not null");
                    }
                }
            }
            C91808a aVar2 = new C91808a(fVar2);
            Log.m105924i("MicroMsg.AppBrand.ConnectWifiEvents", "addListener");
            C79605a.C79606a aVar3 = C79605a.f233447b;
            if (aVar3 != null) {
                ((CopyOnWriteArrayList) aVar3.f233449b).add(aVar2);
            } else {
                Log.m105928w("MicroMsg.AppBrand.ConnectWifiEvents", "addListener, receiver is null");
            }
            f262895g = true;
        }
        C83231l.m102140a(fVar.getAppId(), new C91809b(this, context, fVar2));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("errCode", 0);
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        hashMap2.put("errno", 0);
        fVar2.mo109647a(i2, mo115114o("ok", hashMap2));
    }
}
