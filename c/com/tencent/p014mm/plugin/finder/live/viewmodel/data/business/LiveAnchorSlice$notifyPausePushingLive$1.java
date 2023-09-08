package com.tencent.p014mm.plugin.finder.live.viewmodel.data.business;

import al1.C54130j;
import c50.C54655b;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLivePauseActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58115i;
import di3.C86312j;
import gg1.C32444a;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import o40.C61926c;
import p565ir.C60606n;
import s50.C36624a;
import s50.C63699b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveAnchorSlice$notifyPausePushingLive$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLivePauseActionEvent;", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice$notifyPausePushingLive$1 */
public final class LiveAnchorSlice$notifyPausePushingLive$1 extends IListener<FinderLivePauseActionEvent> {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorSlice f160035d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveAnchorSlice$notifyPausePushingLive$1(LiveAnchorSlice liveAnchorSlice, C40008f fVar) {
        super(fVar);
        this.f160035d = liveAnchorSlice;
    }

    public boolean callback(IEvent iEvent) {
        C54655b bVar;
        C58115i iVar;
        FinderLivePauseActionEvent finderLivePauseActionEvent = (FinderLivePauseActionEvent) iEvent;
        Class cls = C60606n.class;
        Class cls2 = C55001u.class;
        Class cls3 = C54991o.class;
        C87412m.m108594g(finderLivePauseActionEvent, "event");
        boolean z = C54655b.f153178f1 != null;
        boolean d4 = ((C54991o) ((C55001u) this.f160035d.business(cls2)).business(cls3)).mo75997d4();
        boolean z2 = ((C55001u) this.f160035d.business(cls2)).f154420q.f182392d != 0;
        boolean u = C61926c.m72696u(((C54991o) this.f160035d.business(cls3)).f154291a1, 524288);
        boolean G3 = ((C54991o) this.f160035d.business(cls3)).mo75960G3();
        List<C54130j> list = ((C54963d0) this.f160035d.business(C54963d0.class)).f154074q;
        boolean z3 = (list != null ? list.size() : 0) > 0;
        int intValue = C32444a.f86216x2.mo60266n().intValue();
        C54655b bVar2 = C54655b.f153178f1;
        if (bVar2 != null) {
            if (bVar2 == null) {
                C54655b.f153178f1 = new C54655b();
            }
            bVar = C54655b.f153178f1;
            C87412m.m108591d(bVar);
        } else {
            bVar = null;
        }
        boolean c = (bVar == null || (iVar = bVar.f172989A) == null) ? false : iVar.mo82881c();
        String str = this.f160035d.f160030f;
        Log.m105924i(str, "[notifyPausePushingLive] isAnchor = " + z + ", isLiveStarted = " + z2 + ", isLiveFinish = " + d4 + ", isLivePaused = " + u + ", isAudioMode = " + G3 + ", pause = " + finderLivePauseActionEvent.f154776d.f154778a + ", isAnchorLinkMic = " + z3 + ", pauseWay = " + intValue + ", isFloatMode = " + c);
        if (!z || d4) {
            Log.m105924i(this.f160035d.f160030f, "is not Anchor, isLiveFinish, return ");
        } else if (G3) {
            Log.m105924i(this.f160035d.f160030f, "isAudioMode, return ");
        } else if (z2 && !d4 && !c) {
            String str2 = this.f160035d.f160030f;
            Log.m105924i(str2, "isFloatMode = " + c);
            finderLivePauseActionEvent.f154777e.f154779a = true;
        } else if (intValue == 0) {
            if (finderLivePauseActionEvent.f154776d.f154778a) {
                if (bVar != null) {
                    bVar.mo85702u0();
                }
            } else if (bVar != null) {
                bVar.mo75578J0((C36624a) null, (C63699b) null);
            }
        } else if (finderLivePauseActionEvent.f154776d.f154778a) {
            if (z2) {
                if (!u) {
                    ((C60606n) C86312j.m106911c(cls)).a50(0);
                    if (bVar != null) {
                        bVar.mo85689g0();
                    }
                    this.f160035d.f160031g = true;
                }
            } else if (bVar != null) {
                bVar.mo85702u0();
            }
        } else if (z2) {
            if (this.f160035d.f160031g) {
                ((C60606n) C86312j.m106911c(cls)).mo85093vB(0);
                if (bVar != null) {
                    bVar.mo75578J0((C36624a) null, (C63699b) null);
                }
                if (bVar != null) {
                    bVar.mo85695n0();
                }
            }
        } else if (bVar != null) {
            bVar.mo75578J0((C36624a) null, (C63699b) null);
        }
        return true;
    }
}
