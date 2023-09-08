package sl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83101e;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83103f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import hr0.C87583a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p224ra.C89909e;
import sp0.C90311n;
import sp0.C90318o;

/* renamed from: sl0.m */
public class C90225m extends C82268c {
    public static final int CTRL_INDEX = 347;
    public static final String NAME = "operateSocketTask";

    /* renamed from: g */
    public boolean f259038g = false;

    /* renamed from: h */
    public boolean f259039h = false;

    /* renamed from: i */
    public final AtomicBoolean f259040i = new AtomicBoolean(false);

    /* renamed from: j */
    public C90311n.C90317f f259041j;

    public C90225m(C90311n.C90317f fVar) {
        this.f259041j = fVar;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C90311n.C90317f fVar2;
        C82381f fVar3 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        Class cls = C87583a.class;
        Log.m105918d("MicroMsg.JsApiOperateSocketTask", "JsApiOperateSocketTask");
        if (!this.f259040i.getAndSet(true) && (fVar2 = this.f259041j) != null) {
            this.f259038g = fVar2.mo116758x(fVar.getAppId());
            this.f259039h = this.f259041j.mo116757a(fVar.getAppId());
        }
        if (jSONObject2 == null) {
            fVar3.mo109647a(i2, mo115109j("fail:data is null"));
            Log.m105920e("MicroMsg.JsApiOperateSocketTask", "data is null");
            return;
        }
        String optString = jSONObject2.optString("socketTaskId");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiOperateSocketTask", "taskId is null");
            fVar3.mo109647a(i2, mo115109j("fail:taskId is null or nil"));
            return;
        }
        String optString2 = jSONObject2.optString("operationType");
        if (Util.isNullOrNil(optString2)) {
            Log.m105920e("MicroMsg.JsApiOperateSocketTask", "operationType is null");
            fVar3.mo109647a(i2, mo115109j("fail:operationType is null or nil"));
            return;
        }
        AtomicInteger atomicInteger = C90318o.f259278b;
        C83101e a = C90318o.C90320b.f259280a.mo124551a(fVar.getAppId());
        if (a == null) {
            fVar3.mo109647a(i2, mo115109j("fail:no task"));
            Log.m105928w("MicroMsg.JsApiOperateSocketTask", "client is null");
            return;
        }
        C83103f a2 = a.mo115339a(optString);
        if (a2 == null) {
            fVar3.mo109647a(i2, mo115109j("fail:taskID not exist"));
            Log.m105928w("MicroMsg.JsApiOperateSocketTask", "webSocketClient is null");
        } else if (optString2.equals("close")) {
            int optInt = jSONObject2.optInt("code", 1000);
            if (optInt == 1000 || (optInt >= 3000 && optInt < 5000)) {
                String optString3 = jSONObject2.optString(TPReportKeys.PlayerStep.PLAYER_REASON, "");
                a.mo115340b(a2, optInt, optString3);
                fVar3.mo109647a(i2, mo115109j("ok"));
                Log.m105925i("MicroMsg.JsApiOperateSocketTask", "closeSocket taskId:%s, code %d, reason %s", optString, Integer.valueOf(optInt), optString3);
                return;
            }
            fVar3.mo109647a(i2, mo115109j("fail:The code must be either 1000, or between 3000 and 4999"));
        } else if (!optString2.equals("send")) {
            fVar3.mo109647a(i2, mo115109j("fail:unknown operationType"));
            Log.m105928w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage fail:unknown operationType");
        } else if (!a.mo115343e(a2)) {
            fVar3.mo109647a(i2, mo115109j("fail:don't send before socket connected"));
            Log.m105929w("MicroMsg.JsApiOperateSocketTask", "send fail taskId: %s", optString);
        } else {
            Object opt = jSONObject2.opt("data");
            if (opt != null) {
                try {
                    if (opt instanceof ByteBuffer) {
                        Log.m105919d("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage ok message:%s", opt);
                        a.mo115341c(a2, (ByteBuffer) opt);
                        ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 4, 1, false);
                    } else if (opt instanceof String) {
                        Log.m105918d("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage ok message");
                        a.mo115344f(a2, (String) opt);
                        ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 4, 1, false);
                    } else {
                        Log.m105928w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage error message type wrong");
                        fVar3.mo109647a(i2, mo115109j("fail:unknown data"));
                        return;
                    }
                    fVar3.mo109647a(i2, mo115109j("ok"));
                } catch (Exception e) {
                    fVar3.mo109647a(i2, mo115109j("fail:" + e.getMessage()));
                    if (this.f259038g || this.f259039h) {
                        ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 6, 1, false);
                    } else {
                        ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 5, 1, false);
                    }
                }
            } else {
                fVar3.mo109647a(i2, mo115109j("fail:message is null or nil"));
                Log.m105929w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage fail:%s", opt);
            }
        }
    }
}
