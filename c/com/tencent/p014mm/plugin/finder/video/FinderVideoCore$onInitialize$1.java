package com.tencent.p014mm.plugin.finder.video;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderVideoCtrlEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/video/FinderVideoCore$onInitialize$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderVideoCtrlEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$1 */
public final class FinderVideoCore$onInitialize$1 extends IListener<FinderVideoCtrlEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoCore f161837d;

    /* renamed from: e */
    public final /* synthetic */ AppCompatActivity f161838e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoCore$onInitialize$1(FinderVideoCore finderVideoCore, AppCompatActivity appCompatActivity, C40008f fVar) {
        super(fVar);
        this.f161837d = finderVideoCore;
        this.f161838e = appCompatActivity;
    }

    public boolean callback(IEvent iEvent) {
        FinderVideoCtrlEvent finderVideoCtrlEvent = (FinderVideoCtrlEvent) iEvent;
        C87412m.m108594g(finderVideoCtrlEvent, "event");
        if (finderVideoCtrlEvent.f154814d.f154815a) {
            this.f161837d.mo79538z1().mo80076f1(this.f161838e);
            this.f161837d.mo79537y1().mo83078g3();
            Log.m105924i("FinderVideoCore", "resume video from event");
            return true;
        }
        this.f161837d.mo79538z1().mo80068N(this.f161838e);
        this.f161837d.mo79537y1().mo83077f3();
        Log.m105924i("FinderVideoCore", "pause video from event");
        return true;
    }
}
