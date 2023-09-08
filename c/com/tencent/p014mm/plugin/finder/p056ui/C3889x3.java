package com.tencent.p014mm.plugin.finder.p056ui;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import em1.C58636b;
import fy3.C32224a;
import gr1.C59687x1;
import gy3.C87413o;
import ht1.C60171g1;
import jq3.C60905o;
import jq3.C9493c;
import o40.C61926c;
import os1.C62168u;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.x3 */
public final class C3889x3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17461d;

    /* renamed from: e */
    public final /* synthetic */ FinderLinearLayoutManager f17462e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView f17463f;

    /* renamed from: com.tencent.mm.plugin.finder.ui.x3$a */
    public static final class C3890a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLinearLayoutManager f17464d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView f17465e;

        /* renamed from: f */
        public final /* synthetic */ FinderShareFeedRelUI f17466f;

        /* renamed from: g */
        public final /* synthetic */ long f17467g;

        /* renamed from: h */
        public final /* synthetic */ float f17468h;

        /* renamed from: i */
        public final /* synthetic */ boolean f17469i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3890a(FinderLinearLayoutManager finderLinearLayoutManager, RecyclerView recyclerView, FinderShareFeedRelUI finderShareFeedRelUI, long j, float f, boolean z) {
            super(0);
            this.f17464d = finderLinearLayoutManager;
            this.f17465e = recyclerView;
            this.f17466f = finderShareFeedRelUI;
            this.f17467g = j;
            this.f17468h = f;
            this.f17469i = z;
        }

        public Object invoke() {
            C58636b player;
            C9493c cVar;
            RecyclerView.C16631z I0 = this.f17465e.mo17023I0(this.f17464d.mo16957C());
            FinderThumbPlayerProxy finderThumbPlayerProxy = null;
            C60905o oVar = I0 instanceof C60905o ? (C60905o) I0 : null;
            long itemId = (oVar == null || (cVar = (C9493c) oVar.f173503E) == null) ? 0 : cVar.getItemId();
            boolean z = false;
            if (oVar != null && oVar.f44859i == 4) {
                String str = this.f17466f.f17166s;
                Log.m105924i(str, "checkSeek: video feedId=" + C61926c.m72691p(itemId) + " seekTime=" + this.f17467g + " playSpeedRatio:" + this.f17468h + " afterSeekPlay:" + this.f17469i);
                ((C62168u) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class)).mo87219c3(itemId);
                Object obj = oVar.f173503E;
                C55018j0 j0Var = obj instanceof C55018j0 ? (C55018j0) obj : null;
                if (j0Var != null) {
                    j0Var.f154481f = true;
                }
                FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
                C60171g1 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
                if (videoView instanceof FinderThumbPlayerProxy) {
                    finderThumbPlayerProxy = (FinderThumbPlayerProxy) videoView;
                }
                if (finderThumbPlayerProxy != null) {
                    finderThumbPlayerProxy.setMute(true);
                }
                FinderVideoLayout finderVideoLayout2 = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
                if (finderVideoLayout2 != null) {
                    long j = this.f17467g;
                    float f = this.f17468h;
                    boolean z2 = this.f17469i;
                    C61926c.m72668M(new C59687x1(finderVideoLayout2, j, z2, 3, f, new C3887w3(this.f17466f, itemId, z2, oVar)));
                }
            } else {
                if (oVar != null && oVar.f44859i == 2) {
                    z = true;
                }
                if (z && this.f17467g > 0) {
                    String str2 = this.f17466f.f17166s;
                    Log.m105924i(str2, "[checkSeek] photo feedId=" + C61926c.m72691p(itemId) + " seekTime=" + this.f17467g);
                    FinderImgFeedMusicTag finderImgFeedMusicTag = (FinderImgFeedMusicTag) oVar.mo85812D(C0966R.C0970id.a8s);
                    if (!(finderImgFeedMusicTag == null || (player = finderImgFeedMusicTag.getPlayer()) == null)) {
                        player.seekTo(this.f17467g);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C3889x3(FinderShareFeedRelUI finderShareFeedRelUI, FinderLinearLayoutManager finderLinearLayoutManager, RecyclerView recyclerView) {
        this.f17461d = finderShareFeedRelUI;
        this.f17462e = finderLinearLayoutManager;
        this.f17463f = recyclerView;
    }

    public final void run() {
        long longExtra = this.f17461d.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0);
        float floatExtra = this.f17461d.getIntent().getFloatExtra("KEY_VIDEO_PLAY_SPEED_RATIO", 1.0f);
        boolean z = !this.f17461d.getIntent().getBooleanExtra("KEY_VIDEO_IS_PAUSE", false);
        boolean booleanExtra = this.f17461d.getIntent().getBooleanExtra("KEY_VIDEO_CLEAR_VIDEO_CACHE", false);
        if (longExtra > 0 || booleanExtra) {
            C61926c.m72666K(0, new C3890a(this.f17462e, this.f17463f, this.f17461d, longExtra, floatExtra, z));
        }
    }
}
