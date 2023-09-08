package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HalfScreenWebViewCloseEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView$halfScreenWebViewCloseEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/HalfScreenWebViewCloseEvent;", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.HalfScreenWebView$halfScreenWebViewCloseEventListener$1 */
public final class HalfScreenWebView$halfScreenWebViewCloseEventListener$1 extends IListener<HalfScreenWebViewCloseEvent> {

    /* renamed from: d */
    public final /* synthetic */ HalfScreenWebView f119804d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfScreenWebView$halfScreenWebViewCloseEventListener$1(HalfScreenWebView halfScreenWebView, C40008f fVar) {
        super(fVar);
        this.f119804d = halfScreenWebView;
    }

    public boolean callback(IEvent iEvent) {
        HalfScreenWebViewCloseEvent halfScreenWebViewCloseEvent = (HalfScreenWebViewCloseEvent) iEvent;
        C87412m.m108594g(halfScreenWebViewCloseEvent, "event");
        StringBuilder sb = new StringBuilder();
        sb.append("HalfScreenWebViewCloseEvent isShowing=");
        sb.append(this.f119804d.isShowing());
        sb.append(", sameContext=");
        sb.append(C87412m.m108589b(this.f119804d.f119791s, halfScreenWebViewCloseEvent.f107612d.f107613a));
        sb.append(", touchOuter ");
        halfScreenWebViewCloseEvent.f107612d.getClass();
        sb.append(true);
        Log.m105924i("MicroMsg.HalfScreenWebView", sb.toString());
        if (!C87412m.m108589b(this.f119804d.f119791s, halfScreenWebViewCloseEvent.f107612d.f107613a) || !this.f119804d.isShowing()) {
            return false;
        }
        this.f119804d.cancel();
        return false;
    }
}
