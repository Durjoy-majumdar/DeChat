package com.tencent.p014mm.plugin.repairer.p099ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/repairer/ui/RepairerResDownloadUI$resUpdateListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI$resUpdateListener$1 */
public final class RepairerResDownloadUI$resUpdateListener$1 extends IListener<CheckResUpdateCacheFileEvent> {

    /* renamed from: d */
    public final /* synthetic */ RepairerResDownloadUI f273085d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepairerResDownloadUI$resUpdateListener$1(RepairerResDownloadUI repairerResDownloadUI, C40008f fVar) {
        super(fVar);
        this.f273085d = repairerResDownloadUI;
    }

    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        this.f273085d.f273079d.append("========================\n");
        StringBuffer stringBuffer = this.f273085d.f273079d;
        StringBuilder sb = new StringBuilder();
        sb.append("type:");
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        String str = null;
        sb.append(aVar != null ? Integer.valueOf(aVar.f78744a) : null);
        sb.append(" subtype:");
        CheckResUpdateCacheFileEvent.C28720a aVar2 = checkResUpdateCacheFileEvent.f78743d;
        sb.append(aVar2 != null ? Integer.valueOf(aVar2.f78745b) : null);
        sb.append(" version:");
        CheckResUpdateCacheFileEvent.C28720a aVar3 = checkResUpdateCacheFileEvent.f78743d;
        sb.append(aVar3 != null ? Integer.valueOf(aVar3.f78747d) : null);
        sb.append(" updated:");
        CheckResUpdateCacheFileEvent.C28720a aVar4 = checkResUpdateCacheFileEvent.f78743d;
        sb.append(aVar4 != null ? Boolean.valueOf(aVar4.f78748e) : null);
        sb.append(" fileSize:");
        CheckResUpdateCacheFileEvent.C28720a aVar5 = checkResUpdateCacheFileEvent.f78743d;
        if (aVar5 != null) {
            str = aVar5.f78746c;
        }
        sb.append(C86013q1.m106451l(str));
        sb.append(10);
        stringBuffer.append(sb.toString());
        C61926c.m72668M(new C94445b(this.f273085d));
        return false;
    }
}
