package kk0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import rx3.C13604l;
import sk0.C90216b;
import sx3.C90364q0;

/* renamed from: kk0.j */
public final class C88185j extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 1059;
    public static final String NAME = "isBluetoothDevicePaired";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar != null) {
            if (jSONObject == null) {
                Log.m105929w("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, data is null", new Object[0]);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                fVar.mo109647a(i, mo115115p("fail:invalid data", jSONObject2));
            } else if (!jSONObject.has("deviceId")) {
                Log.m105929w("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, do not have key: deviceId", new Object[0]);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                fVar.mo109647a(i, mo115115p("fail:invalid data", jSONObject3));
            } else {
                String optString = jSONObject.optString("deviceId");
                Log.m105925i("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, deviceId: " + optString, new Object[0]);
                if (!BluetoothAdapter.checkBluetoothAddress(optString)) {
                    Log.m105929w("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, deviceId is illegal", new Object[0]);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("errno", 101);
                    } catch (Exception e3) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                    }
                    fVar.mo109647a(i, mo115115p("fail:invalid data", jSONObject4));
                    return;
                }
                BluetoothAdapter d = C90216b.m112935d();
                if (d == null || !d.isEnabled()) {
                    Log.m105929w("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, bluetoothAdapter is null or disabled", new Object[0]);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("errno", 1500102);
                    } catch (Exception e4) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                    }
                    fVar.mo109647a(i, mo115115p("fail:not available", jSONObject5));
                    return;
                }
                Set<BluetoothDevice> bondedDevices = d.getBondedDevices();
                T t = null;
                if (bondedDevices != null) {
                    Iterator<T> it = bondedDevices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C87412m.m108589b(optString, ((BluetoothDevice) next).getAddress())) {
                            t = next;
                            break;
                        }
                    }
                    t = (BluetoothDevice) t;
                }
                boolean z = t != null;
                Log.m105925i("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, isPaired: " + z, new Object[0]);
                Map g = C90364q0.m113148g(new C13604l("isPaired", Boolean.valueOf(z)));
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                g.put("errno", 0);
                fVar.mo109647a(i, mo115114o("ok", g));
            }
        }
    }
}
