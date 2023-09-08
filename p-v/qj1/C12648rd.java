package qj1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C8478d0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: qj1.rd */
public final class C12648rd implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveRandomMatchLinkMicStatePlugin f36235d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f36236e;

    public C12648rd(FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin, C8478d0 d0Var) {
        this.f36235d = finderLiveRandomMatchLinkMicStatePlugin;
        this.f36236e = d0Var;
    }

    public final boolean onTimerExpired() {
        RecyclerView recyclerView = this.f36235d.f15148r;
        C8478d0 d0Var = this.f36236e;
        int i = d0Var.f27483d + 1;
        d0Var.f27483d = i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$startMatch$1", "onTimerExpired", "()Z", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$startMatch$1", "onTimerExpired", "()Z", "Undefined", "smoothScrollToPosition", "(I)V");
        return true;
    }
}
