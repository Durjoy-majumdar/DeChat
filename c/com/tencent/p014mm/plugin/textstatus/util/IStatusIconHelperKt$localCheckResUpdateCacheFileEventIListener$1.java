package com.tencent.p014mm.plugin.textstatus.util;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/util/IStatusIconHelperKt$localCheckResUpdateCacheFileEventIListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/LocalCheckResUpdateCacheFileEvent;", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.util.IStatusIconHelperKt$localCheckResUpdateCacheFileEventIListener$1 */
public final class IStatusIconHelperKt$localCheckResUpdateCacheFileEventIListener$1 extends IListener<LocalCheckResUpdateCacheFileEvent> {
    public IStatusIconHelperKt$localCheckResUpdateCacheFileEventIListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = (LocalCheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(localCheckResUpdateCacheFileEvent, "event");
        LocalCheckResUpdateCacheFileEvent.C28773a aVar = localCheckResUpdateCacheFileEvent.f78859d;
        if (aVar.f78860a != 86 || aVar.f78861b != 2) {
            return false;
        }
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", "localCheckResUpdateCacheFileEvent " + localCheckResUpdateCacheFileEvent.f78859d.f78862c);
        C61926c.m72661F("TextStatusThread", new C30510b(localCheckResUpdateCacheFileEvent));
        return false;
    }
}
