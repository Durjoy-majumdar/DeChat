package ub2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import la2.C99364n;

/* renamed from: ub2.n0 */
public final class C65300n0 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ MusicMvLyricView f187958d;

    public C65300n0(MusicMvLyricView musicMvLyricView) {
        this.f187958d = musicMvLyricView;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) eVar;
        if (i >= 0 || i < wxRecyclerAdapter.getItemCount()) {
            long j = ((MusicMvLyricView.C57106f) wxRecyclerAdapter.getData().get(i)).f163618d.f163615d;
            int duration = C99364n.m129616h().mo138822a().getDuration();
            if (j >= ((long) duration)) {
                Log.m105920e("MicroMsg.MusicMvCommentView", "invalid time, position:" + i + ", currentPosTime:" + j + ", duration:" + duration);
                return;
            }
            Log.m105924i("MicroMsg.MusicMvCommentView", "onItemClick position:" + i);
            MusicMvLyricView musicMvLyricView = this.f187958d;
            musicMvLyricView.f163608w = true;
            musicMvLyricView.mo80568f();
            this.f187958d.setShowLyricPrelude(false);
            MusicMvLyricView musicMvLyricView2 = this.f187958d;
            musicMvLyricView2.mo80565c(musicMvLyricView2.f163607v, i);
            MusicMvLyricView musicMvLyricView3 = this.f187958d;
            musicMvLyricView3.f163583A = true;
            MusicMvLyricView.C57108h eventListener = musicMvLyricView3.getEventListener();
            if (eventListener != null) {
                eventListener.mo80588a(i, ((MusicMvLyricView.C57106f) wxRecyclerAdapter.getData().get(i)).f163618d.f163615d);
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.MusicMvCommentView", "invalid position:" + i);
    }
}
