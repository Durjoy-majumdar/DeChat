package com.tencent.p014mm.plugin.appbrand.debugger;

import androidx.lifecycle.C0125s;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import te3.uw4;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.RemoteDebugJsEngine$4 */
class RemoteDebugJsEngine$4 extends IListener<AppBrandNetWorkReqHeaderReceivedEvent> {

    /* renamed from: d */
    public final /* synthetic */ C81745v f239775d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteDebugJsEngine$4(C81745v vVar, C0125s sVar) {
        super(sVar);
        this.f239775d = vVar;
        this.__eventId = -1286330970;
    }

    public boolean callback(IEvent iEvent) {
        AppBrandNetWorkReqHeaderReceivedEvent.C80702a aVar;
        AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent = (AppBrandNetWorkReqHeaderReceivedEvent) iEvent;
        if (!(appBrandNetWorkReqHeaderReceivedEvent == null || (aVar = appBrandNetWorkReqHeaderReceivedEvent.f236133d) == null || aVar.f236136c == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f239775d.f239910d.f239885g.f239909g == 1) {
                Log.m105918d("MicroMsg.RemoteDebugJsEngine", "NEW_REMOTE_DEBUG_TYPE and do onReceiveNetworkHeader");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("api_name", appBrandNetWorkReqHeaderReceivedEvent.f236133d.f236134a);
                    jSONObject.put("task_id", appBrandNetWorkReqHeaderReceivedEvent.f236133d.f236135b);
                    jSONObject.put("request_headers", appBrandNetWorkReqHeaderReceivedEvent.f236133d.f236136c.toString());
                    jSONObject.put(AppMeasurement.Param.TIMESTAMP, currentTimeMillis);
                    C81695a0 a0Var = this.f239775d.f239914h;
                    if (a0Var != null) {
                        a0Var.mo114047c(jSONObject.toString());
                    }
                } catch (Exception e) {
                    Log.printDebugStack("MicroMsg.RemoteDebugJsEngine", "", e);
                }
            } else {
                uw4 uw4 = new uw4();
                AppBrandNetWorkReqHeaderReceivedEvent.C80702a aVar2 = appBrandNetWorkReqHeaderReceivedEvent.f236133d;
                uw4.f185803d = aVar2.f236134a;
                uw4.f185804e = aVar2.f236135b;
                uw4.f185805f = aVar2.f236136c.toString();
                uw4.f185806g = currentTimeMillis;
                this.f239775d.f239914h.mo114052h(C81738h0.m100298d(uw4, this.f239775d.f239910d, "networkDebugAPI"));
            }
        }
        return true;
    }
}
