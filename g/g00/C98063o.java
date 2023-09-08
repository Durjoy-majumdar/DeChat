package g00;

import com.tencent.p014mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent;
import com.tencent.p014mm.plugin.websearch.C96598h;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import te3.C64342ej;
import te3.t25;

/* renamed from: g00.o */
public class C98063o extends IStaticListener<OnSearchSearchBoxCtrlInfoChangedEvent> {
    public boolean callback(IEvent iEvent) {
        OnSearchSearchBoxCtrlInfoChangedEvent onSearchSearchBoxCtrlInfoChangedEvent = (OnSearchSearchBoxCtrlInfoChangedEvent) iEvent;
        if (onSearchSearchBoxCtrlInfoChangedEvent.f264957d.f264958a == 0) {
            ((C96598h) C6080m.m5949lS()).f282788d = 0;
            ((C96598h) C6080m.m5949lS()).f282789e = null;
        } else {
            ((C96598h) C6080m.m5949lS()).f282788d = 1;
            ((C96598h) C6080m.m5949lS()).f282789e = new t25();
            ((C96598h) C6080m.m5949lS()).f282789e.f185477d = 1;
            ((C96598h) C6080m.m5949lS()).f282789e.f185478e = new C64342ej();
            ((C96598h) C6080m.m5949lS()).f282789e.f185478e.f182972d = onSearchSearchBoxCtrlInfoChangedEvent.f264957d.f264961d;
            ((C96598h) C6080m.m5949lS()).f282789e.f185478e.f182973e = onSearchSearchBoxCtrlInfoChangedEvent.f264957d.f264962e;
            ((C96598h) C6080m.m5949lS()).f282789e.f185478e.f182974f = onSearchSearchBoxCtrlInfoChangedEvent.f264957d.f264963f;
            ((C96598h) C6080m.m5949lS()).f282789e.f185478e.f182975g = onSearchSearchBoxCtrlInfoChangedEvent.f264957d.f264964g;
        }
        return false;
    }
}
