package com.tencent.p014mm.live.core.util;

import a14.C53916l;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.Result;
import w50.C65933h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/live/core/util/LiveMakeupUtil$downloadCdnRes$realDownload$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.util.LiveMakeupUtil$downloadCdnRes$realDownload$2$1 */
public final class LiveMakeupUtil$downloadCdnRes$realDownload$2$1 extends IListener<CheckResUpdateCacheFileEvent> {

    /* renamed from: d */
    public final /* synthetic */ C53916l<Boolean> f79435d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<IListener<CheckResUpdateCacheFileEvent>> f79436e;

    /* renamed from: f */
    public final /* synthetic */ String f79437f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveMakeupUtil$downloadCdnRes$realDownload$2$1(C53916l<? super Boolean> lVar, C8479f0<IListener<CheckResUpdateCacheFileEvent>> f0Var, String str, C40008f fVar) {
        super(fVar);
        this.f79435d = lVar;
        this.f79436e = f0Var;
        this.f79437f = str;
    }

    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        if (checkResUpdateCacheFileEvent.f78743d.f78744a == 151) {
            C65933h.m77669e(this.f79436e, this.f79437f);
            CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
            int i = aVar.f78745b;
            String str = aVar.f78746c;
            boolean z = aVar.f78748e;
            Log.m105924i("LiveMakeupUtil", "#downloadCdnRes-realDownload " + i + ", " + str + ", " + z);
            if (str == null || str.length() == 0) {
                C53916l<Boolean> lVar = this.f79435d;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            } else {
                C53916l<Boolean> lVar2 = this.f79435d;
                Result.Companion companion2 = Result.Companion;
                lVar2.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            }
        }
        return false;
    }
}
