package dk1;

import com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: dk1.c */
public final class C58309c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveSideBar f166956d;

    public C58309c(FinderLiveSideBar finderLiveSideBar) {
        this.f166956d = finderLiveSideBar;
    }

    public final void run() {
        WxRecyclerView c = this.f166956d.mo77736c();
        int i = this.f166956d.f159518j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(c, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$mount$3", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(c, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$mount$3", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
