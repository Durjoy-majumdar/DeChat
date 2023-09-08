package vf1;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHorizontalVideoHalfFeedUI;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import fy3.C32224a;
import gy3.C87413o;
import jq3.C60905o;
import jq3.C9493c;
import o40.C61926c;
import os1.C62168u;
import rx3.C13598b0;

/* renamed from: vf1.q0 */
public final class C14814q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderHorizontalVideoHalfFeedUI f40803d;

    /* renamed from: e */
    public final /* synthetic */ FinderLinearLayoutManager f40804e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView f40805f;

    /* renamed from: vf1.q0$a */
    public static final class C14815a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLinearLayoutManager f40806d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView f40807e;

        /* renamed from: f */
        public final /* synthetic */ long f40808f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14815a(FinderLinearLayoutManager finderLinearLayoutManager, RecyclerView recyclerView, long j) {
            super(0);
            this.f40806d = finderLinearLayoutManager;
            this.f40807e = recyclerView;
            this.f40808f = j;
        }

        public Object invoke() {
            FinderVideoLayout finderVideoLayout;
            C9493c cVar;
            RecyclerView.C16631z I0 = this.f40807e.mo17023I0(this.f40806d.mo16957C());
            C55018j0 j0Var = null;
            C60905o oVar = I0 instanceof C60905o ? (C60905o) I0 : null;
            long itemId = (oVar == null || (cVar = (C9493c) oVar.f173503E) == null) ? 0 : cVar.getItemId();
            Log.m105924i("FinderHalfScreenUI", "[checkSeek] video feedId=" + C61926c.m72691p(itemId) + " seekTime=" + this.f40808f);
            ((C62168u) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class)).mo87219c3(itemId);
            C9493c cVar2 = oVar != null ? (C9493c) oVar.f173503E : null;
            if (cVar2 instanceof C55018j0) {
                j0Var = (C55018j0) cVar2;
            }
            if (j0Var != null) {
                j0Var.f154481f = true;
            }
            if (!(oVar == null || (finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a)) == null)) {
                FinderVideoLayout.m65079J(finderVideoLayout, this.f40808f, 3, 0.0f, false, (ITPPlayerListener.IOnSeekCompleteListener) null, 28, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    public C14814q0(FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI, FinderLinearLayoutManager finderLinearLayoutManager, RecyclerView recyclerView) {
        this.f40803d = finderHorizontalVideoHalfFeedUI;
        this.f40804e = finderLinearLayoutManager;
        this.f40805f = recyclerView;
    }

    public final void run() {
        long longExtra = this.f40803d.getContext().getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0);
        if (longExtra > 0) {
            C61926c.m72666K(0, new C14815a(this.f40804e, this.f40805f, longExtra));
        }
    }
}
