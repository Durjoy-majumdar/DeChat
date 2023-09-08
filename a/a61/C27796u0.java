package a61;

import com.tencent.p014mm.autogen.events.RefreshSmileyPanelEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import p490dl.C97489o;

/* renamed from: a61.u0 */
public class C27796u0 extends IStaticListener<RefreshSmileyPanelEvent> {
    public boolean callback(IEvent iEvent) {
        RefreshSmileyPanelEvent refreshSmileyPanelEvent = (RefreshSmileyPanelEvent) iEvent;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.emoji.EmojiStorageMgr", "RefreshSmileyPanelEvent was arrived before login, ignore it.");
            return false;
        }
        Log.m105924i("MicroMsg.emoji.EmojiStorageMgr", "REFRESH_PANEL_EVENT");
        C97489o g = C97489o.m125592g();
        g.mo136769k(true);
        g.mo136771m(true);
        g.mo136770l(true);
        return false;
    }
}
