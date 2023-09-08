package zn0;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import ao0.C79609b;
import ao0.C79612e;
import ao0.C79614g;
import bo0.C79743f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.vendor.MIUI;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.C89922k;

/* renamed from: zn0.b */
public class C91802b extends C82268c {
    public static final int CTRL_INDEX = 318;
    public static final String NAME = "getConnectedWifi";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105920e("MicroMsg.JsApiGetConnectedWifi", "mContext is null, invoke fail!");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 12010);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:context is null");
            }
            hashMap.put("errno", 4);
            fVar2.mo109647a(i2, mo115114o("fail:context is null", hashMap));
        } else if (!C91807d.f262895g) {
            Log.m105920e("MicroMsg.JsApiGetConnectedWifi", "not invoke startWifi");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 12000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505001, "fail:not invoke startWifi");
            }
            hashMap2.put("errno", 1505001);
            fVar2.mo109647a(i2, mo115114o("fail:not invoke startWifi", hashMap2));
        } else {
            C79614g.m96681b(context);
            if (!C79743f.m96882b()) {
                Log.m105920e("MicroMsg.JsApiGetConnectedWifi", "wifi is disable,invoke fail!");
                HashMap hashMap3 = new HashMap();
                hashMap3.put("errCode", 12005);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505002, "fail:wifi is disable");
                }
                hashMap3.put("errno", 1505002);
                fVar2.mo109647a(i2, mo115114o("fail:wifi is disable", hashMap3));
                return;
            }
            C79609b bVar = C79609b.f233451a;
            bVar.getClass();
            C79612e a = bVar.mo109751a(jSONObject2 != null ? jSONObject2.optBoolean("acceptIncompleteWiFiInfo", false) : false);
            if (a != null && a.mo109753a()) {
                ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
                if (connectivityManager == null) {
                    Log.m105920e("MicroMsg.JsApiGetConnectedWifi", "ConnectivityManager is null");
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("errCode", 12010);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:connectivityManager is null");
                    }
                    hashMap4.put("errno", 4);
                    fVar2.mo109647a(i2, mo115114o("fail:connectivityManager is null", hashMap4));
                    return;
                }
                boolean optBoolean = jSONObject2 != null ? jSONObject2.optBoolean("checkNetInfo") : false;
                Log.m105924i("MicroMsg.JsApiGetConnectedWifi", "checkNetInfo: " + optBoolean);
                if (optBoolean || context.getApplicationInfo().targetSdkVersion < 29 || Build.VERSION.SDK_INT < 29) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        Log.m105920e("MicroMsg.JsApiGetConnectedWifi", "netInfo is null");
                        HashMap hashMap5 = new HashMap();
                        hashMap5.put("errCode", 12010);
                        if (BuildInfo.DEBUG) {
                            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505040, "fail:netInfo is null");
                        }
                        hashMap5.put("errno", 1505040);
                        fVar2.mo109647a(i2, mo115114o("fail:netInfo is null", hashMap5));
                        return;
                    } else if (activeNetworkInfo.getDetailedState() != NetworkInfo.DetailedState.CONNECTED) {
                        Log.m105921e("MicroMsg.JsApiGetConnectedWifi", "ConnectivityManager is null, detailState:%s", activeNetworkInfo.getDetailedState());
                        HashMap hashMap6 = new HashMap();
                        hashMap6.put("errCode", 12010);
                        if (BuildInfo.DEBUG) {
                            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505040, "fail:detailState is not connected");
                        }
                        hashMap6.put("errno", 1505040);
                        fVar2.mo109647a(i2, mo115114o("fail:detailState is not connected", hashMap6));
                        return;
                    }
                }
                Log.m105925i("MicroMsg.JsApiGetConnectedWifi", "[invoke]currentWifi:%s", a);
                try {
                    HashMap hashMap7 = new HashMap();
                    hashMap7.put("wifi", a.mo109754b());
                    hashMap7.put("errCode", 0);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                    }
                    hashMap7.put("errno", 0);
                    fVar2.mo109647a(i2, mo115114o("ok", hashMap7));
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.JsApiGetConnectedWifi", e, "", new Object[0]);
                    HashMap hashMap8 = new HashMap();
                    hashMap8.put("errCode", 12010);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:parse json err");
                    }
                    hashMap8.put("errno", 4);
                    fVar2.mo109647a(i2, mo115114o("fail:parse json err", hashMap8));
                }
            } else if (Build.VERSION.SDK_INT < 23 || MIUI.isMIUI() || LocationUtil.isGpsEnable()) {
                boolean b = C89922k.m112465b((Activity) context, fVar2, "android.permission.ACCESS_FINE_LOCATION");
                Log.m105925i("MicroMsg.JsApiGetConnectedWifi", "checkLocation:%b", Boolean.valueOf(b));
                if (!b) {
                    HashMap hashMap9 = new HashMap();
                    hashMap9.put("errCode", 12012);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505004, "fail:may be not obtain GPS Perrmission");
                    }
                    hashMap9.put("errno", 1505004);
                    fVar2.mo109647a(i2, mo115114o("fail:may be not obtain GPS Perrmission", hashMap9));
                    Log.m105920e("MicroMsg.JsApiGetConnectedWifi", "wifiList is empty, may be not obtain GPS Perrmission");
                } else if (a == null) {
                    Log.m105920e("MicroMsg.JsApiGetConnectedWifi", "currentWifi is null");
                    HashMap hashMap10 = new HashMap();
                    hashMap10.put("errCode", 12010);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505005, "fail:currentWifi is null");
                    }
                    hashMap10.put("errno", 1505005);
                    fVar2.mo109647a(i2, mo115114o("fail:currentWifi is null", hashMap10));
                } else {
                    Log.m105920e("MicroMsg.JsApiGetConnectedWifi", "currentWifi is invalid");
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505006, "fail:current connected wifi is invalid");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("errno", 1505006);
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                    }
                    fVar2.mo109647a(i2, mo115115p("fail:current connected wifi is invalid", jSONObject3));
                }
            } else {
                HashMap hashMap11 = new HashMap();
                hashMap11.put("errCode", 12006);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505003, "fail:may be not open GPS");
                }
                hashMap11.put("errno", 1505003);
                fVar2.mo109647a(i2, mo115114o("fail:may be not open GPS", hashMap11));
                Log.m105920e("MicroMsg.JsApiGetConnectedWifi", "wifiList is empty, may be not open GPS");
            }
        }
    }
}
