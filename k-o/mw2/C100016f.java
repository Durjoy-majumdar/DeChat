package mw2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aw2.C92163a;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import gy3.C87412m;
import iw2.C98804a;
import iw2.C98811c;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: mw2.f */
public abstract class C100016f extends RecyclerView.C0130p {
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/album/StoryAlbumScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (i == 0 && linearLayoutManager.mo16958D() == linearLayoutManager.getItemCount() - 1) {
            C92163a aVar = ((C100019j) this).f293036d.f281797h;
            if (aVar != null) {
                StoryCore.f281736t.mo134194l().post(new C98811c((C98804a) aVar));
            } else {
                C87412m.m108603p("mPresenter");
                throw null;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/album/StoryAlbumScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/album/StoryAlbumScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/album/StoryAlbumScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
