package dy1;

import com.tencent.p014mm.autogen.events.OpenGameCenterEvent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONObject;

/* renamed from: dy1.l */
public class C7558l extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            this.f19815f.mo5689a("invalid_params");
            return;
        }
        Log.m105925i("LiteAppJsApiOpenGameCenter", "JsonData = %s", jSONObject.toString());
        OpenGameCenterEvent openGameCenterEvent = new OpenGameCenterEvent();
        OpenGameCenterEvent.C1106a aVar = openGameCenterEvent.f9383d;
        aVar.f9384a = jSONObject;
        aVar.f9385b = MMApplicationContext.getContext();
        openGameCenterEvent.publish();
        this.f19815f.mo5690b();
    }
}
