package eg1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveRecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: eg1.s */
public final class C58594s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58589p f167760d;

    /* renamed from: e */
    public final /* synthetic */ int f167761e;

    public C58594s(C58589p pVar, int i) {
        this.f167760d = pVar;
        this.f167761e = i;
    }

    public final void onClick(View view) {
        FinderLiveRecyclerView finderLiveRecyclerView;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/FinderLiveAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveViewCallback finderLiveViewCallback = this.f167760d.f167743f;
        if (!(finderLiveViewCallback == null || (finderLiveRecyclerView = finderLiveViewCallback.f159220q) == null)) {
            int i = this.f167761e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(finderLiveRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/FinderLiveAdapter$onBindViewHolder$2", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            finderLiveRecyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(finderLiveRecyclerView, "com/tencent/mm/plugin/finder/live/FinderLiveAdapter$onBindViewHolder$2", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        FinderLiveViewCallback finderLiveViewCallback2 = this.f167760d.f167743f;
        if (finderLiveViewCallback2 != null) {
            finderLiveViewCallback2.mo77518Z();
        }
        FinderLiveViewCallback finderLiveViewCallback3 = this.f167760d.f167743f;
        if (finderLiveViewCallback3 != null) {
            finderLiveViewCallback3.mo77513E0(true, false);
        }
        FinderLiveViewCallback finderLiveViewCallback4 = this.f167760d.f167743f;
        if (finderLiveViewCallback4 != null) {
            finderLiveViewCallback4.mo77520k0(this.f167761e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/FinderLiveAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
