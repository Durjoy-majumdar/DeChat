package com.tencent.p014mm.plugin.repairer.plc;

import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i40.C98598e;
import kotlin.Metadata;
import oa1.C117731d;
import tf3.C37074r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/repairer/plc/RepairerLogFSC$onAccountInit$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ConfigUpdatedEvent;", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.plc.RepairerLogFSC$onAccountInit$1 */
public final class RepairerLogFSC$onAccountInit$1 extends IListener<ConfigUpdatedEvent> {

    /* renamed from: d */
    public final /* synthetic */ RepairerLogFSC f81917d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepairerLogFSC$onAccountInit$1(RepairerLogFSC repairerLogFSC, C98598e eVar) {
        super(eVar);
        this.f81917d = repairerLogFSC;
    }

    public boolean callback(IEvent iEvent) {
        ConfigUpdatedEvent configUpdatedEvent = (ConfigUpdatedEvent) iEvent;
        C87412m.m108594g(configUpdatedEvent, "event");
        if (C87412m.m108589b(configUpdatedEvent.f9044d.f9045a, "clicfg_repairer_print_xlog")) {
            this.f81917d.getClass();
            if (C117731d.m166007c().mo182440a(new C37074r()) == 1) {
                Log.setPrintAndroidLog(true);
            } else {
                Log.setPrintAndroidLog(false);
            }
        }
        return false;
    }
}
