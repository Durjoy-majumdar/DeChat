package ub2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import qo3.C77407n;
import te3.C64435i23;
import te3.C64511l23;

/* renamed from: ub2.e0 */
public final class C65282e0 implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ MusicMvCommentView f187937d;

    public C65282e0(MusicMvCommentView musicMvCommentView) {
        this.f187937d = musicMvCommentView;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C64511l23 l232;
        String str;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) eVar;
        if (i >= 0 || i < wxRecyclerAdapter.getItemCount()) {
            long j = ((MusicMvCommentView.C57091a) wxRecyclerAdapter.getData().get(i)).f163546d.f163548a.f183877g;
            String str2 = ((MusicMvCommentView.C57091a) wxRecyclerAdapter.getData().get(i)).f163546d.f163548a.f183879i;
            String str3 = str2 == null ? "" : str2;
            C64435i23 i232 = ((MusicMvCommentView.C57091a) wxRecyclerAdapter.getData().get(i)).f163546d.f163548a.f183874d;
            String str4 = (i232 == null || (l232 = i232.f183595e) == null || (str = l232.f184027d) == null) ? "" : str;
            boolean z = ((MusicMvCommentView.C57091a) wxRecyclerAdapter.getData().get(i)).f163546d.f163548a.f183881n == 1;
            long j2 = ((MusicMvCommentView.C57091a) wxRecyclerAdapter.getData().get(i)).f163546d.f163548a.f183882o;
            String str5 = ((MusicMvCommentView.C57091a) wxRecyclerAdapter.getData().get(i)).f163546d.f163548a.f183883p;
            MusicMvCommentView musicMvCommentView = this.f187937d;
            Long valueOf = Long.valueOf(j2);
            musicMvCommentView.getClass();
            C77407n nVar = new C77407n(musicMvCommentView.getContext(), 1, false);
            nVar.f225771i = new C65266a0(musicMvCommentView, z);
            nVar.f225782p = new C65267b0(str4, musicMvCommentView, valueOf, str5, j, str3);
            nVar.mo107573q();
            return true;
        }
        Log.m105920e("MicroMsg.MusicMvCommentView", "invalid position:" + i);
        return false;
    }
}
