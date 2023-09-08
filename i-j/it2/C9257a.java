package it2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: it2.a */
public abstract class C9257a extends RecyclerView.C0130p {
    /* renamed from: a */
    public abstract void mo10033a();

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/album/SnsAlbumScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumScrollListener");
        super.onScrollStateChanged(recyclerView, i);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (i == 0 && linearLayoutManager.mo16958D() == linearLayoutManager.getItemCount() - 1) {
            mo10033a();
        }
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumScrollListener");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/album/SnsAlbumScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumScrollListener");
        super.onScrolled(recyclerView, i, i2);
        SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumScrollListener");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
