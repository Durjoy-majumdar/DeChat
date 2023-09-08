package ub2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import tb2.C64216a;

/* renamed from: ub2.d0 */
public final class C65278d0 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ MusicMvCommentView f187929d;

    public C65278d0(MusicMvCommentView musicMvCommentView) {
        this.f187929d = musicMvCommentView;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C64216a aVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) eVar;
        if (i >= 0 || i < wxRecyclerAdapter.getItemCount()) {
            long j = ((MusicMvCommentView.C57091a) wxRecyclerAdapter.getData().get(i)).f163546d.f163548a.f183882o;
            String str = ((MusicMvCommentView.C57091a) wxRecyclerAdapter.getData().get(i)).f163546d.f163548a.f183883p;
            if (str == null) {
                str = "";
            }
            if (0 != j && (aVar = this.f187929d.f163544g) != null) {
                aVar.mo80465b(j, str);
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.MusicMvCommentView", "invalid position:" + i);
    }
}
