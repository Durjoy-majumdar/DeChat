package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KV14609ReportEvent;
import com.tencent.p014mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/launching/BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/KV14609ReportEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 */
public final class BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 extends IListener<KV14609ReportEvent> {

    /* renamed from: d */
    public final /* synthetic */ String f243333d;

    /* renamed from: e */
    public final /* synthetic */ int f243334e;

    /* renamed from: f */
    public final /* synthetic */ int f243335f;

    /* renamed from: g */
    public final /* synthetic */ QualitySession f243336g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1(String str, int i, int i2, QualitySession qualitySession, C40008f fVar) {
        super(fVar);
        this.f243333d = str;
        this.f243334e = i;
        this.f243335f = i2;
        this.f243336g = qualitySession;
    }

    public boolean callback(IEvent iEvent) {
        KV14609ReportEvent kV14609ReportEvent = (KV14609ReportEvent) iEvent;
        C87412m.m108594g(kV14609ReportEvent, "event");
        KV14609ReportEvent.C80727a aVar = kV14609ReportEvent.f236226d;
        kv_14609 kv_14609 = aVar != null ? aVar.f236227a : null;
        if (kv_14609 == null || !C87412m.m108589b(this.f243333d, kv_14609.f245668g) || this.f243334e != kv_14609.f245672n || this.f243335f != kv_14609.f245669h - 1) {
            return false;
        }
        QualitySession qualitySession = this.f243336g;
        kv_14609.f245654A = qualitySession.f245832d;
        kv_14609.f245655B = qualitySession.f245835g;
        kv_14609.f245656C = qualitySession.f245836h;
        return false;
    }
}
