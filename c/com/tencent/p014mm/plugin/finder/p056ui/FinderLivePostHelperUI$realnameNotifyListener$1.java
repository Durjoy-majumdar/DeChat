package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import il1.C8966e6;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/FinderLivePostHelperUI$realnameNotifyListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/WalletRealNameResultNotifyEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI$realnameNotifyListener$1 */
public final class FinderLivePostHelperUI$realnameNotifyListener$1 extends IListener<WalletRealNameResultNotifyEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePostHelperUI f16937d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLivePostHelperUI$realnameNotifyListener$1(FinderLivePostHelperUI finderLivePostHelperUI, C40008f fVar) {
        super(fVar);
        this.f16937d = finderLivePostHelperUI;
    }

    public boolean callback(IEvent iEvent) {
        WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent = (WalletRealNameResultNotifyEvent) iEvent;
        C87412m.m108594g(walletRealNameResultNotifyEvent, "event");
        dead();
        FinderLivePostHelperUI finderLivePostHelperUI = this.f16937d;
        if (walletRealNameResultNotifyEvent.f9603d.f9604a == -1) {
            finderLivePostHelperUI.mo4068Q7(finderLivePostHelperUI.f16926r);
            finderLivePostHelperUI.f16926r = 0;
        } else {
            C8966e6 e6Var = finderLivePostHelperUI.f16924p;
            if (e6Var != null) {
                e6Var.mo9775g(false, finderLivePostHelperUI.f16926r);
                finderLivePostHelperUI.f16926r = 0;
            } else {
                C87412m.m108603p("precheck");
                throw null;
            }
        }
        return false;
    }
}
