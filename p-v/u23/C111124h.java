package u23;

import com.tencent.p014mm.plugin.vlog.p117ui.thumb.MultiTrackCropView;
import com.tencent.p014mm.plugin.vlog.p117ui.thumb.MultiTrackRecyclerView;
import gy3.C87412m;

/* renamed from: u23.h */
public final class C111124h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiTrackCropView f332723d;

    /* renamed from: e */
    public final /* synthetic */ int f332724e;

    /* renamed from: f */
    public final /* synthetic */ C111127k f332725f;

    public C111124h(MultiTrackCropView multiTrackCropView, int i, C111127k kVar) {
        this.f332723d = multiTrackCropView;
        this.f332724e = i;
        this.f332725f = kVar;
    }

    public final void run() {
        MultiTrackCropView multiTrackCropView = this.f332723d;
        MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView.f316889d;
        if (multiTrackRecyclerView != null) {
            multiTrackRecyclerView.f207428y1 = this.f332724e;
            multiTrackCropView.f316891f.mo162852F4(this.f332725f.f187129i);
            return;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }
}
