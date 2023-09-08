package com.tencent.p014mm.plugin.priority.model.precheck.downloader;

import com.tencent.p014mm.autogen.events.OnlineVideoEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import i21.C98590g;
import ke2.C99129c;
import kotlin.Metadata;
import ve2.C102179e;
import ve2.C102180f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/priority/model/precheck/downloader/C2CMsgPreDownloader$onlineVideoListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/OnlineVideoEvent;", "plugin-priority_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$onlineVideoListener$1 */
public final class C2CMsgPreDownloader$onlineVideoListener$1 extends IListener<OnlineVideoEvent> {

    /* renamed from: d */
    public final /* synthetic */ C2CMsgPreDownloader f272455d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2CMsgPreDownloader$onlineVideoListener$1(C2CMsgPreDownloader c2CMsgPreDownloader, C99129c cVar) {
        super(cVar);
        this.f272455d = c2CMsgPreDownloader;
    }

    public boolean callback(IEvent iEvent) {
        OnlineVideoEvent onlineVideoEvent = (OnlineVideoEvent) iEvent;
        C87412m.m108594g(onlineVideoEvent, "event");
        C102179e eVar = this.f272455d.f272429a;
        if (eVar != null && (eVar instanceof C102180f)) {
            OnlineVideoEvent.C92538a aVar = onlineVideoEvent.f264965d;
            if (aVar.f264966a == 6) {
                C102180f fVar = (C102180f) eVar;
                String str = aVar.f264968c;
                C87412m.m108593f(str, "event.data.mediaId");
                if (C87412m.m108589b(str, fVar.f300872i)) {
                    long j = fVar.f300869f;
                    String o2 = fVar.f300868e.mo142473o2();
                    C87412m.m108593f(o2, "msgDbItem.fromUser");
                    ((C98590g) C86312j.m106911c(C98590g.class)).bq0(3, j, o2, (long) fVar.f300868e.mo142471m2(), (long) fVar.f300868e.mo142480u2(), (long) fVar.f300868e.mo142472n2(), fVar.f300868e.getCreateTime());
                    Log.m105924i("MicroMsg.C2CVideoMsgTask", "c2c pre download video task find in storage, msgSvrId:" + fVar.f300869f);
                    C102179e.m134640e(fVar, 1, 0, 2, (Object) null);
                }
            }
        }
        return false;
    }
}
