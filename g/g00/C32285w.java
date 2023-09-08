package g00;

import com.tencent.p014mm.autogen.events.WebViewShortcutCommandEvent;
import com.tencent.p014mm.plugin.webview.model.C6034h;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: g00.w */
public class C32285w extends IStaticListener<WebViewShortcutCommandEvent> {
    public boolean callback(IEvent iEvent) {
        C6034h.f22306d = ((WebViewShortcutCommandEvent) iEvent).f79066d.f79067a.substring(11);
        return true;
    }
}
