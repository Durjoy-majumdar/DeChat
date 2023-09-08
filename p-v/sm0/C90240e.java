package sm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import org.json.JSONObject;
import p284zb.C91635f;
import zt3.C119157j;

/* renamed from: sm0.e */
public abstract class C90240e extends C82268c<C91635f> {
    /* renamed from: s */
    public ByteBuffer mo115118s(String str, C83170k kVar, int i) {
        ByteBuffer k1 = kVar.mo115416k1(i, false);
        return k1 == null ? ByteBuffer.allocate(0) : k1;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C91635f fVar2 = (C91635f) fVar;
        if (fVar2 != null) {
            if (jSONObject == null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                fVar2.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject2));
                return;
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C90239d(this, fVar2, jSONObject, i), "SmCryptoInvoker");
        }
    }

    /* renamed from: w */
    public abstract C90247p mo124472w();
}
