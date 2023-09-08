package com.tencent.p014mm.plugin.finder.live.plugin;

import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import d60.C58124b;
import di3.C86312j;
import er1.C58728f5;
import gy3.C87412m;
import il1.C8968f2;
import il1.C8989g2;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorExceptionPlugin$realnameNotifyListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/WalletRealNameResultNotifyEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin$realnameNotifyListener$1 */
public final class FinderLiveAnchorExceptionPlugin$realnameNotifyListener$1 extends IListener<WalletRealNameResultNotifyEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorExceptionPlugin f159491d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveAnchorExceptionPlugin$realnameNotifyListener$1(FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin, C40008f fVar) {
        super(fVar);
        this.f159491d = finderLiveAnchorExceptionPlugin;
    }

    public boolean callback(IEvent iEvent) {
        WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent = (WalletRealNameResultNotifyEvent) iEvent;
        C87412m.m108594g(walletRealNameResultNotifyEvent, "event");
        dead();
        FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin = this.f159491d;
        int i = walletRealNameResultNotifyEvent.f9603d.f9604a;
        Class cls = C54108o.class;
        C8968f2 f2Var = finderLiveAnchorExceptionPlugin.f159485s;
        if (f2Var != null) {
            C61926c.m72668M(new C8989g2(f2Var));
        }
        if (i == -1) {
            C58124b bVar = finderLiveAnchorExceptionPlugin.f159482p;
            C58124b.C58125b bVar2 = C58124b.C58125b.LIVE_STATUS_CREATE_LIVE;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_POST_AFTER_FACE_VERIFY", true);
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle);
            ((C54108o) C86312j.m106911c(cls)).Ox0(C54067f0.C54069c0.LIVE_PASS_VERIFIED_SUCC, C66785b.f191882e.mo90662O5());
            return false;
        }
        ((C54108o) C86312j.m106911c(cls)).Ox0(C54067f0.C54069c0.LIVE_PASS_VERIFIED_FAIL, C66785b.f191882e.mo90662O5());
        C58124b.C7172a.m7372a(finderLiveAnchorExceptionPlugin.f159482p, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
        C58728f5.m68215a(C58728f5.f168144a, "faceVerify", i, 0, "", finderLiveAnchorExceptionPlugin.mo87684A0(), (String) null, 32, (Object) null);
        return false;
    }
}
