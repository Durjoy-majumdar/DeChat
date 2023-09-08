package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OnlineVideoEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gw2.C98268m;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$onlineVideoEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/OnlineVideoEvent;", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$onlineVideoEventListener$1 */
public final class StoryVideoViewMgr$onlineVideoEventListener$1 extends IListener<OnlineVideoEvent> {

    /* renamed from: d */
    public final /* synthetic */ StoryVideoViewMgr f282196d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryVideoViewMgr$onlineVideoEventListener$1(StoryVideoViewMgr storyVideoViewMgr, C40008f fVar) {
        super(fVar);
        this.f282196d = storyVideoViewMgr;
    }

    public boolean callback(IEvent iEvent) {
        OnlineVideoEvent onlineVideoEvent = (OnlineVideoEvent) iEvent;
        C87412m.m108594g(onlineVideoEvent, "event");
        String unused = this.f282196d.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("onelinevideo event callback, retcode:");
        OnlineVideoEvent.C92538a aVar = onlineVideoEvent.f264965d;
        sb.append(aVar != null ? Integer.valueOf(aVar.f264967b) : null);
        sb.append(", currVideoItem:");
        sb.append(this.f282196d.f282155f);
        Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", sb.toString());
        StoryVideoViewMgr storyVideoViewMgr = this.f282196d;
        C98268m mVar = storyVideoViewMgr.f282155f;
        if (mVar != null) {
            if (!(mVar.f288088a == 0) && onlineVideoEvent.f264965d.f264967b == -21112) {
                C61926c.m72668M(new C96455e(storyVideoViewMgr, onlineVideoEvent));
            }
        }
        return false;
    }
}
