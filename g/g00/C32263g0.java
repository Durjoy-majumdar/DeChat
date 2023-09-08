package g00;

import com.tencent.p014mm.autogen.events.WebviewReportTmplTransferEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import g93.C32355a;

/* renamed from: g00.g0 */
public class C32263g0 extends IStaticListener<WebviewReportTmplTransferEvent> {
    public boolean callback(IEvent iEvent) {
        WebviewReportTmplTransferEvent webviewReportTmplTransferEvent = (WebviewReportTmplTransferEvent) iEvent;
        if (!(webviewReportTmplTransferEvent instanceof WebviewReportTmplTransferEvent)) {
            return false;
        }
        C32355a.m39690b(974, webviewReportTmplTransferEvent.f79068d.f79069a, 1, false);
        return true;
    }
}
