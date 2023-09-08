package dy1;

import android.content.Intent;
import com.tencent.p014mm.autogen.events.NotifyGameWebviewOperationEvent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import p244tt.C14088e;

/* renamed from: dy1.t */
public class C7568t extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Class cls = C14088e.class;
        if (jSONObject.has("url")) {
            try {
                NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = new NotifyGameWebviewOperationEvent();
                notifyGameWebviewOperationEvent.f9355d.f9356a = 2;
                Intent intent = new Intent();
                intent.putExtra("rawUrl", jSONObject.getString("url"));
                intent.putExtra("nextAnimIn", ((C14088e) C86312j.m106911c(cls)).g00(jSONObject));
                intent.putExtra("currentAnimOut", ((C14088e) C86312j.m106911c(cls)).mo13519f6(jSONObject));
                notifyGameWebviewOperationEvent.f9355d.f9357b = mo5676d();
                if (jSONObject.has(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO)) {
                    intent.putExtra("game_liteapp_pass_data", jSONObject.getJSONObject(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO).toString());
                }
                notifyGameWebviewOperationEvent.f9355d.f9358c = intent;
                notifyGameWebviewOperationEvent.publish();
            } catch (JSONException e) {
                Log.printErrStackTrace("LiteAppJsApiStartGameWebview", e, "get url", new Object[0]);
            }
        }
    }
}
