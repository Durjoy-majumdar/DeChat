package g00;

import com.tencent.p014mm.autogen.events.JsapiResultEvent;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: g00.u */
public class C75822u extends IStaticListener<JsapiResultEvent> {
    public boolean callback(IEvent iEvent) {
        JsapiResultEvent jsapiResultEvent = (JsapiResultEvent) iEvent;
        if (!(jsapiResultEvent instanceof JsapiResultEvent)) {
            return false;
        }
        MsgHandler b = C44040v3.m48331b();
        JsapiResultEvent.C67720a aVar = jsapiResultEvent.f193694d;
        b.mmOnActivityResult(aVar.f193695a, aVar.f193696b, aVar.f193697c);
        return true;
    }
}
