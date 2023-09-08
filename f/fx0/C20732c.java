package fx0;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18440a0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import wx3.C15601d;

/* renamed from: fx0.c */
public final class C20732c implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ WeakReference<C18440a0> f58612d;

    /* renamed from: e */
    public final /* synthetic */ CopyOnWriteArrayList<C18468r> f58613e;

    public C20732c(WeakReference<C18440a0> weakReference, CopyOnWriteArrayList<C18468r> copyOnWriteArrayList) {
        this.f58612d = weakReference;
        this.f58613e = copyOnWriteArrayList;
    }

    public final boolean onTimerExpired() {
        C20729b bVar = C20729b.f58601a;
        if (C20729b.f58604d > 0) {
            Log.m105918d("MicroMsg.BizFinderLiveUILogic", "startCheckOftenReadBizLives often read bar hide");
            return true;
        }
        C18440a0 a0Var = this.f58612d.get();
        if (a0Var != null) {
            CopyOnWriteArrayList<C18468r> copyOnWriteArrayList = this.f58613e;
            C87412m.m108594g(copyOnWriteArrayList, "mOftenReadList");
            if (C19428d.f54856a.mo25179n()) {
                C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C20727a(copyOnWriteArrayList, new WeakReference(a0Var), (C15601d<? super C20727a>) null), 2, (Object) null);
            }
        }
        return true;
    }
}
