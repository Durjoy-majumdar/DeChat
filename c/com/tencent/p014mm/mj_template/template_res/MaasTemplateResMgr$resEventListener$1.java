package com.tencent.p014mm.mj_template.template_res;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/mj_template/template_res/MaasTemplateResMgr$resEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "plugin-mj-template_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.mj_template.template_res.MaasTemplateResMgr$resEventListener$1 */
public final class MaasTemplateResMgr$resEventListener$1 extends IListener<CheckResUpdateCacheFileEvent> {

    /* renamed from: d */
    public final /* synthetic */ MaasTemplateResMgr f79464d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaasTemplateResMgr$resEventListener$1(MaasTemplateResMgr maasTemplateResMgr, C40008f fVar) {
        super(fVar);
        this.f79464d = maasTemplateResMgr;
    }

    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        int i = aVar.f78744a;
        MaasTemplateResMgr maasTemplateResMgr = this.f79464d;
        if (i != maasTemplateResMgr.f79457a) {
            return false;
        }
        int i2 = aVar.f78745b;
        String str = aVar.f78746c;
        boolean z = aVar.f78748e;
        String str2 = maasTemplateResMgr.f79459c;
        Log.m105924i(str2, "get res " + i2 + ", " + str + ", " + z);
        if (str == null) {
            Log.m105928w(this.f79464d.f79459c, "get res path is null");
            return false;
        } else if (!z || !this.f79464d.mo56376h(i2, str)) {
            return false;
        } else {
            this.f79464d.mo56369a();
            return false;
        }
    }
}
