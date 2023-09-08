package com.tencent.p014mm.plugin.recordvideo.res;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/recordvideo/res/BaseVideoResLogic$checkResUpdateCacheFileEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.res.BaseVideoResLogic$checkResUpdateCacheFileEventListener$1 */
public final class BaseVideoResLogic$checkResUpdateCacheFileEventListener$1 extends IListener<CheckResUpdateCacheFileEvent> {

    /* renamed from: d */
    public final /* synthetic */ BaseVideoResLogic f315411d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseVideoResLogic$checkResUpdateCacheFileEventListener$1(BaseVideoResLogic baseVideoResLogic, C40008f fVar) {
        super(fVar);
        this.f315411d = baseVideoResLogic;
    }

    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        if (checkResUpdateCacheFileEvent.f78743d.f78744a == this.f315411d.mo151279i()) {
            int i = checkResUpdateCacheFileEvent.f78743d.f78745b;
            this.f315411d.getClass();
            if (i == 1) {
                String j = this.f315411d.mo151280j();
                CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
                Log.m105925i(j, "download res finish, path: %s, fileVersion: %s, fileUpdated: %s", aVar.f78746c, Integer.valueOf(aVar.f78747d), Boolean.valueOf(checkResUpdateCacheFileEvent.f78743d.f78748e));
                C86709a0.m107525e().postToWorker(new C105980a(this.f315411d, checkResUpdateCacheFileEvent));
                this.f315411d.mo151276f().mo162904f();
            }
        }
        return false;
    }
}
