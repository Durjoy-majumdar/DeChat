package com.tencent.p014mm.plugin.finder.feed;

import bl3.C39818r;
import cm1.C0735h;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import rs1.C63586o;

/* renamed from: com.tencent.mm.plugin.finder.feed.c0 */
public final class C2636c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelinePresenter f13476d;

    /* renamed from: e */
    public final /* synthetic */ int f13477e;

    /* renamed from: f */
    public final /* synthetic */ int f13478f;

    /* renamed from: g */
    public final /* synthetic */ int f13479g;

    /* renamed from: h */
    public final /* synthetic */ int f13480h;

    /* renamed from: i */
    public final /* synthetic */ String f13481i;

    public C2636c0(FinderTimelinePresenter finderTimelinePresenter, int i, int i2, int i3, int i4, String str) {
        this.f13476d = finderTimelinePresenter;
        this.f13477e = i;
        this.f13478f = i2;
        this.f13479g = i3;
        this.f13480h = i4;
        this.f13481i = str;
    }

    public final void run() {
        Log.m105924i(this.f13476d.f13249I, "notifyChanged,msgNotifyData");
        FinderTimelinePresenter finderTimelinePresenter = this.f13476d;
        FinderHomeTabFragment finderHomeTabFragment = finderTimelinePresenter.f13267h;
        if (finderHomeTabFragment != null) {
            int i = this.f13477e;
            int i2 = this.f13478f;
            int i3 = this.f13479g;
            int i4 = this.f13480h;
            String str = this.f13481i;
            C0735h hVar = finderTimelinePresenter.f13255P;
            hVar.f1753d = i;
            hVar.f1755f = i2;
            hVar.f1756g = i3;
            hVar.f1754e = i4;
            C87412m.m108594g(str, "<set-?>");
            hVar.f1757h = str;
            ((C63586o) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo75002a(C63586o.class)).mo88437f3();
        }
    }
}
