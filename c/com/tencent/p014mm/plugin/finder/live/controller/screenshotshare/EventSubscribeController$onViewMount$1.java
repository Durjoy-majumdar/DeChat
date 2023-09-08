package com.tencent.p014mm.plugin.finder.live.controller.screenshotshare;

import a14.C53934p0;
import android.content.Context;
import cl1.C54991o;
import com.tencent.p014mm.autogen.events.MMFinderUIScreenShotEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import j50.C60735a;
import kh1.C10077a;
import kotlin.Metadata;
import nk1.C11207i;
import o40.C61926c;
import ok1.C62042e;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/controller/screenshotshare/EventSubscribeController$onViewMount$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MMFinderUIScreenShotEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController$onViewMount$1 */
public final class EventSubscribeController$onViewMount$1 extends IListener<MMFinderUIScreenShotEvent> {

    /* renamed from: d */
    public final /* synthetic */ EventSubscribeController f15018d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventSubscribeController$onViewMount$1(EventSubscribeController eventSubscribeController, Context context) {
        super((MMActivity) context);
        this.f15018d = eventSubscribeController;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((MMFinderUIScreenShotEvent) iEvent, "event");
        C62042e eVar = C62042e.f176370a;
        C45795b liveRoomData = this.f15018d.getStore().getLiveRoomData();
        eVar.getClass();
        Class cls = C54991o.class;
        C87412m.m108594g(liveRoomData, "buContext");
        boolean u = C61926c.m72696u(((C54991o) liveRoomData.mo71262a(cls)).f154388y0, 134217728);
        Log.m105924i("FinderLiveUtil", "[isDisableScreenShotSwitch] isDisable = " + u + ", flag = " + ((C54991o) liveRoomData.mo71262a(cls)).f154388y0);
        if (u) {
            Log.m105924i("FinderLiveScreenShotEventSubscribeController", "#onViewMount isDisableScreenShotSwitch");
        } else {
            EventSubscribeController eventSubscribeController = this.f15018d;
            eventSubscribeController.getClass();
            Log.m105924i("FinderLiveScreenShotEventSubscribeController", "#executeWork");
            if (eventSubscribeController.f27262f != 0) {
                Log.m105924i("FinderLiveScreenShotEventSubscribeController", "#executeWork state is " + eventSubscribeController.f27262f + ", return");
            } else {
                FinderLiveService.f159376d.getClass();
                C60735a aVar = FinderLiveService.f159378f;
                if (aVar != null && aVar.mo85682Z()) {
                    Log.m105924i("FinderLiveScreenShotEventSubscribeController", "#executeWork isInLinkMic is true, return");
                } else {
                    C11207i.m11066b(eventSubscribeController, (C66212f) null, (C53934p0) null, new C10077a(eventSubscribeController, (C15601d<? super C10077a>) null), 3, (Object) null);
                }
            }
        }
        return true;
    }
}
