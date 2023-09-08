package ub2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ub2.f0 */
public final class C65284f0 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ MusicMvCommentView f187939d;

    public C65284f0(MusicMvCommentView musicMvCommentView) {
        this.f187939d = musicMvCommentView;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$prepareViews$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$prepareViews$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$prepareViews$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = this.f187939d.f163545h.f166797b.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int E = ((LinearLayoutManager) layoutManager).mo16959E();
        MusicMvCommentView musicMvCommentView = this.f187939d;
        int i3 = musicMvCommentView.f163543f;
        if (E >= i3) {
            i3 = E;
        }
        musicMvCommentView.f163543f = i3;
        WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter = musicMvCommentView.f163542e;
        if (wxRecyclerAdapter != null) {
            boolean z = true;
            if (E != wxRecyclerAdapter.getItemCount() - 1) {
                z = false;
            }
            if (z) {
                this.f187939d.mo80543b();
                MusicMvCommentView musicMvCommentView2 = this.f187939d;
                WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter2 = musicMvCommentView2.f163542e;
                if (wxRecyclerAdapter2 != null) {
                    musicMvCommentView2.f163543f = wxRecyclerAdapter2.getItemCount();
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            } else {
                int size = this.f187939d.f163541d.size();
                MusicMvCommentView musicMvCommentView3 = this.f187939d;
                musicMvCommentView3.mo80545d(size - musicMvCommentView3.f163543f);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$prepareViews$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        C87412m.m108603p("adapter");
        throw null;
    }
}
