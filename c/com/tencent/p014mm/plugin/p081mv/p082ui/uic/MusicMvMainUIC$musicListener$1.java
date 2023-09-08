package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import nb2.C61646d;
import sb2.C63756e;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC$musicListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$musicListener$1 */
public final class MusicMvMainUIC$musicListener$1 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ AppCompatActivity f163330d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvMainUIC f163331e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvMainUIC$musicListener$1(AppCompatActivity appCompatActivity, MusicMvMainUIC musicMvMainUIC, C40008f fVar) {
        super(fVar);
        this.f163330d = appCompatActivity;
        this.f163331e = musicMvMainUIC;
    }

    public boolean callback(IEvent iEvent) {
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        C87412m.m108594g(musicPlayerEvent, "event");
        AppCompatActivity appCompatActivity = this.f163330d;
        MusicMvMainUIC musicMvMainUIC = this.f163331e;
        if (!((C63756e) C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C63756e.class)).mo88572f3(musicPlayerEvent.f9336d.f9338b) || musicPlayerEvent.f9336d.f9337a != 0) {
            return false;
        }
        C61646d dVar = (C61646d) C110818d0.m150916N(musicMvMainUIC.f163270g);
        if (dVar != null) {
            musicMvMainUIC.mo80449I3(dVar.f175298d);
        }
        musicMvMainUIC.mo80450J3();
        return false;
    }
}
