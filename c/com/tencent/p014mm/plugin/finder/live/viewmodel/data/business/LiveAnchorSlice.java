package com.tencent.p014mm.plugin.finder.live.viewmodel.data.business;

import cl1.C39970c;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLivePauseActionEvent;
import com.tencent.p014mm.sdk.event.IListener;
import fj1.C45795b;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice */
public final class LiveAnchorSlice extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f160030f = "LiveAnchorSlice";

    /* renamed from: g */
    public boolean f160031g;

    /* renamed from: h */
    public int f160032h;

    /* renamed from: i */
    public long f160033i;

    /* renamed from: j */
    public final IListener<FinderLivePauseActionEvent> f160034j = new LiveAnchorSlice$notifyPausePushingLive$1(this, C40008f.f107254d);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveAnchorSlice(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: c3 */
    public final long mo78214c3() {
        return this.f160033i;
    }

    /* renamed from: d3 */
    public final int mo78215d3() {
        return this.f160032h;
    }

    public void onCleared() {
        this.f160034j.dead();
        this.f160031g = false;
    }
}
