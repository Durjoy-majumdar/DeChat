package vk0;

import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.QbarNative;
import java.util.HashMap;
import js0.C88020k;
import org.json.JSONObject;

/* renamed from: vk0.k */
public class C90818k extends C82919r2 {
    private static final int CTRL_INDEX = 455;
    public static final String NAME = "onCameraScanCode";

    /* renamed from: i */
    public static C90818k f260764i = new C90818k();

    /* renamed from: p */
    public static void m113893p(C82381f fVar, int i, String str, int i2, String str2, byte[] bArr, QbarNative.QBarPoint qBarPoint) {
        HashMap hashMap = new HashMap();
        hashMap.put("cameraId", Integer.valueOf(i));
        hashMap.put("type", str);
        hashMap.put("result", str2);
        hashMap.put("codeVersion", Integer.valueOf(i2));
        if (qBarPoint != null) {
            hashMap.put("scanArea", new float[]{qBarPoint.f56815x0 / C88020k.m109556g(), qBarPoint.f56819y0 / C88020k.m109556g(), (qBarPoint.f56816x1 - qBarPoint.f56815x0) / C88020k.m109556g(), (qBarPoint.f56822y3 - qBarPoint.f56819y0) / C88020k.m109556g()});
        }
        if (bArr != null && bArr.length > 0) {
            String encodeToString = Base64.encodeToString(bArr, 2);
            hashMap.put("charSet", "utf-8");
            hashMap.put("rawData", encodeToString);
        }
        String jSONObject = new JSONObject(hashMap).toString();
        Log.m105919d("MicroMsg.JsApiCameraScanCode", "onCameraScanCode:%s", jSONObject);
        fVar.mo109651e(f260764i.mo114779e(), jSONObject, (int[]) null);
    }
}
