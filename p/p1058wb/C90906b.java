package p1058wb;

import aq0.C79626a;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.nio.ByteBuffer;
import js0.C88016e;
import kotlin.Result;
import org.json.JSONObject;
import pe3.C47465a;
import te3.C49335eu3;

/* renamed from: wb.b */
public final class C90906b extends C82268c<C81879g> {
    @Deprecated
    private static final int CTRL_INDEX = -2;
    @Deprecated
    private static final String NAME = "responseClientRequest";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C79626a aVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C81879g gVar = (C81879g) fVar;
        if (jSONObject2 != null) {
            int optInt = jSONObject2.optInt("id", 0);
            boolean optBoolean = jSONObject2.optBoolean("support");
            if (!(gVar == null || (aVar = (C79626a) gVar.mo109668l(C79626a.class)) == null)) {
                Object opt = jSONObject2.opt("data");
                Log.m105924i("Luggage.CgiServiceImplByLibServer", "handleLibServerResponse(requestId:" + optInt + ", support:" + optBoolean + ')');
                if (!optBoolean) {
                    aVar.mo109768d(optInt);
                } else {
                    C79626a.C54287a remove = aVar.f233499h.remove(Integer.valueOf(optInt));
                    if (remove == null) {
                        Log.m105920e("Luggage.CgiServiceImplByLibServer", "handleLibServerResponse supported but missing mario for requestId:" + optInt);
                    } else if (opt instanceof ByteBuffer) {
                        try {
                            Object newInstance = remove.f152375b.newInstance();
                            C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ResponseProtoBuf");
                            C47465a parseFrom = ((C49335eu3) newInstance).parseFrom(C88016e.m109544a((ByteBuffer) opt));
                            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ResponseProtoBuf");
                            remove.f152374a.resumeWith(Result.m168114constructorimpl((C49335eu3) parseFrom));
                            C79626a.C79628d dVar = aVar.f233500i;
                            int i3 = dVar.f233503b;
                            C87412m.m108592e(Integer.valueOf(optInt), "null cannot be cast to non-null type kotlin.Any");
                            dVar.removeMessages(i3, Integer.valueOf(optInt));
                            Log.m105924i("Luggage.CgiServiceImplByLibServer", "handleLibServerResponse succeed for requestId:" + optInt);
                        } catch (Exception e) {
                            Log.m105920e("Luggage.CgiServiceImplByLibServer", "handleLibServerResponse succeed but parse data failed for requestId:" + optInt + ", exception:" + e);
                        }
                    } else {
                        Log.m105920e("Luggage.CgiServiceImplByLibServer", "handleLibServerResponse succeed but responded data(" + opt + ") invalid for requestId:" + optInt);
                    }
                }
            }
            if (gVar != null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                gVar.mo109647a(i2, mo115115p("ok", jSONObject3));
            }
        } else if (gVar != null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
            }
            gVar.mo109647a(i2, mo115115p("fail:jsapi invalid request data", jSONObject4));
        }
    }
}
