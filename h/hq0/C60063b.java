package hq0;

import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import te3.C64647q32;
import z04.C119027c;

/* renamed from: hq0.b */
public final class C60063b {

    /* renamed from: a */
    public static final C60063b f171410a = new C60063b();

    /* renamed from: a */
    public final C64647q32 mo84928a(MaterialModel materialModel) {
        C87412m.m108594g(materialModel, "materialModel");
        String str = materialModel.f267605e;
        C87412m.m108593f(str, "materialModel.materialExtension");
        boolean z = true;
        if (str.length() > 0) {
            String str2 = "OpenMaterialsRsp###" + str;
            Log.m105918d("MicroMsg.AppBrand.OpenMaterialDataCache", "get, cacheKey: " + str2);
            MultiProcessMMKV a = C1510o.f10864a.mo1516a();
            String string = a != null ? a.getString(str2, (String) null) : null;
            if (!(string == null || string.length() == 0)) {
                Log.m105924i("MicroMsg.AppBrand.OpenMaterialDataCache", "get, got rawCgiRsp for cacheKey: " + str2);
                try {
                    C64647q32 q322 = new C64647q32();
                    byte[] bytes = string.getBytes(C119027c.f356489b);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    q322.parseFrom(bytes);
                    return q322;
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.AppBrand.OpenMaterialDataCache", "get, parse rawCgiRsp fail since " + e);
                    return null;
                }
            }
        }
        String str3 = materialModel.f267604d;
        C87412m.m108593f(str3, "materialModel.mimeType");
        if (str3.length() == 0) {
            return null;
        }
        String str4 = "OpenMaterialsRsp###" + str3;
        Log.m105918d("MicroMsg.AppBrand.OpenMaterialDataCache", "get, cacheKeyFallback: " + str4);
        C1510o oVar = C1510o.f10864a;
        MultiProcessMMKV a2 = oVar.mo1516a();
        String string2 = a2 != null ? a2.getString(str4, (String) null) : null;
        if (string2 == null || string2.length() == 0) {
            return null;
        }
        Log.m105924i("MicroMsg.AppBrand.OpenMaterialDataCache", "get, got rawCgiRsp for cacheKeyFallback: " + str4);
        MultiProcessMMKV a3 = oVar.mo1516a();
        if (a3 != null) {
            a3.remove(str4);
        }
        if (str.length() <= 0) {
            z = false;
        }
        if (z) {
            String str5 = "OpenMaterialsRsp###" + str;
            MultiProcessMMKV a4 = oVar.mo1516a();
            if (a4 != null) {
                a4.putString(str5, string2);
            }
        }
        try {
            C64647q32 q323 = new C64647q32();
            byte[] bytes2 = string2.getBytes(C119027c.f356489b);
            C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
            q323.parseFrom(bytes2);
            return q323;
        } catch (Exception e2) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialDataCache", "get, parse rawCgiRsp fail since " + e2);
            return null;
        }
    }
}
