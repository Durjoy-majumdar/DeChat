package com.tencent.p014mm.plugin.textstatus.util;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/util/IStatusIconHelperKt$checkResUpdateCacheFileEventIListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.util.IStatusIconHelperKt$checkResUpdateCacheFileEventIListener$1 */
public final class IStatusIconHelperKt$checkResUpdateCacheFileEventIListener$1 extends IListener<CheckResUpdateCacheFileEvent> {
    public IStatusIconHelperKt$checkResUpdateCacheFileEventIListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        if (aVar.f78744a != 86 || aVar.f78745b != 2) {
            return false;
        }
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", "checkResUpdateCacheFileEvent " + checkResUpdateCacheFileEvent.f78743d.f78746c);
        C61926c.m72661F("TextStatusThread", new C30509a(checkResUpdateCacheFileEvent));
        return false;
    }
}
