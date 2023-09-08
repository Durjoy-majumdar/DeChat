package yl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82560l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82863k;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import js0.C88016e;
import org.json.JSONObject;
import p224ra.C89909e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import zl0.C91774e;
import zl0.C91788n;
import zl0.C91789o;
import zt3.C119157j;

/* renamed from: yl0.m */
public final class C91496m extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 792;
    public static final String NAME = "NFCTransceive";

    /* renamed from: yl0.m$a */
    public static final class C91497a extends C87413o implements C32226l<C91789o<byte[]>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f262300d;

        /* renamed from: e */
        public final /* synthetic */ int f262301e;

        /* renamed from: f */
        public final /* synthetic */ C91496m f262302f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91497a(C82381f fVar, int i, C91496m mVar) {
            super(1);
            this.f262300d = fVar;
            this.f262301e = i;
            this.f262302f = mVar;
        }

        public Object invoke(Object obj) {
            String str;
            C91789o oVar = (C91789o) obj;
            C87412m.m108594g(oVar, "result");
            Log.m105918d("MicroMsg.AppBrand.JsApiNFCTransceive", "transceive, result: " + oVar);
            if (oVar instanceof C91789o.C91791b) {
                C82381f fVar = this.f262300d;
                int i = this.f262301e;
                C91496m mVar = this.f262302f;
                Map g = C90364q0.m113148g(new C13604l("data", C84782s1.m104464e((byte[]) ((C91789o.C91791b) oVar).f262871a)));
                mVar.getClass();
                if (C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) == C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT) {
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 2, "fail:convert native buffer parameter fail. native buffer exceed size limit.");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errno", 2);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    str = mVar.mo115115p("fail:convert native buffer parameter fail. native buffer exceed size limit.", jSONObject);
                } else {
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                    }
                    g.put("errno", 0);
                    str = mVar.mo115114o("ok", g);
                }
                fVar.mo109647a(i, str);
            } else if (oVar instanceof C91789o.C91790a) {
                C82381f fVar2 = this.f262300d;
                int i2 = this.f262301e;
                C91496m mVar2 = this.f262302f;
                C91789o.C91790a aVar = (C91789o.C91790a) oVar;
                int i3 = aVar.f262869a;
                fVar2.mo109647a(i2, C82863k.m101618a(mVar2, i3, "fail:" + aVar.f262870b, C90364q0.m113146e(new C13604l("errCode", Integer.valueOf(aVar.f262869a)))));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiNFCTransceive", "invoke, env is null");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiNFCTransceive", "invoke, data is null");
            fVar.mo109647a(i, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
        } else {
            C82560l0 l0Var = (C82560l0) C89909e.m112436a(C82560l0.class);
            if (l0Var == null || l0Var.mo56895eO()) {
                C91774e a = C91774e.f262832c.mo125637a(fVar);
                Log.m105918d("MicroMsg.AppBrand.JsApiNFCTransceive", "invoke, appId: " + fVar.getAppId() + ", data: " + jSONObject);
                try {
                    String string = jSONObject.getString("tech");
                    try {
                        Object obj = jSONObject.get("data");
                        C87412m.m108592e(obj, "null cannot be cast to non-null type java.nio.ByteBuffer");
                        byte[] a2 = C88016e.m109544a((ByteBuffer) obj);
                        C87412m.m108593f(a2, "try {\n                Ap…     return\n            }");
                        C87412m.m108593f(string, "tech");
                        C91497a aVar = new C91497a(fVar, i, this);
                        StringBuilder sb = new StringBuilder();
                        sb.append("transceive, techName: ");
                        sb.append(string);
                        sb.append(", reqData: ");
                        String arrays = Arrays.toString(a2);
                        C87412m.m108593f(arrays, "toString(this)");
                        sb.append(arrays);
                        Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", sb.toString());
                        ((C119157j) C119157j.f356862d).mo183876g(new C91788n(a, aVar, string, a2), "NFC-IO");
                    } catch (Exception e) {
                        Log.m105928w("MicroMsg.AppBrand.JsApiNFCTransceive", "parse data failed since " + e);
                        fVar.mo109647a(i, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
                    }
                } catch (Exception unused) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiNFCTransceive", "parse tech failed");
                    fVar.mo109647a(i, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
                }
            } else {
                fVar.mo109647a(i, C82863k.m101618a(this, 13019, "fail:user is not authorized", C90364q0.m113146e(new C13604l("errCode", 13019))));
            }
        }
    }
}
