package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r */
public final class C1654r extends C87413o implements C32226l<Result<? extends List<? extends MonitoredBluetoothDeviceInfo>>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C82260t f11309d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f11310e;

    /* renamed from: f */
    public final /* synthetic */ int f11311f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1654r(C82260t tVar, C82381f fVar, int i) {
        super(1);
        this.f11309d = tVar;
        this.f11310e = fVar;
        this.f11311f = i;
    }

    public Object invoke(Object obj) {
        Object r132 = ((Result) obj).m168123unboximpl();
        if (Result.m168120isFailureimpl(r132)) {
            r132 = null;
        }
        List<MonitoredBluetoothDeviceInfo> list = (List) r132;
        if (list == null) {
            C82260t tVar = this.f11309d;
            C82381f fVar = this.f11310e;
            int i = this.f11311f;
            tVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, tVar.mo115115p("fail:internal error", jSONObject));
        } else {
            JSONArray jSONArray = new JSONArray();
            for (MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo : list) {
                jSONArray.put((JSONObject) ((C36570n) monitoredBluetoothDeviceInfo.f239964z).getValue());
            }
            C82381f fVar2 = this.f11310e;
            int i2 = this.f11311f;
            C82260t tVar2 = this.f11309d;
            HashMap e2 = C90364q0.m113146e(new C13604l("devices", jSONArray));
            tVar2.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            e2.put("errno", 0);
            fVar2.mo109647a(i2, tVar2.mo115114o("ok", e2));
        }
        return C13598b0.f38549a;
    }
}
