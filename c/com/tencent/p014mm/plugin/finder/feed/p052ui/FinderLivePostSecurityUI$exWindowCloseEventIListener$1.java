package com.tencent.p014mm.plugin.finder.feed.p052ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WebViewExWindowCloseEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$exWindowCloseEventIListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/WebViewExWindowCloseEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$exWindowCloseEventIListener$1 */
public final class FinderLivePostSecurityUI$exWindowCloseEventIListener$1 extends IListener<WebViewExWindowCloseEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePostSecurityUI f14560d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLivePostSecurityUI$exWindowCloseEventIListener$1(FinderLivePostSecurityUI finderLivePostSecurityUI, C40008f fVar) {
        super(fVar);
        this.f14560d = finderLivePostSecurityUI;
    }

    public boolean callback(IEvent iEvent) {
        WebViewExWindowCloseEvent webViewExWindowCloseEvent = (WebViewExWindowCloseEvent) iEvent;
        C87412m.m108594g(webViewExWindowCloseEvent, "event");
        if (!C87412m.m108589b(webViewExWindowCloseEvent.f9610d.f9611a, "next_continue_open_live")) {
            return false;
        }
        Log.m105924i(this.f14560d.f14543o, "face verify success,and next");
        this.f14560d.setResult(-1);
        this.f14560d.finish();
        return false;
    }
}
