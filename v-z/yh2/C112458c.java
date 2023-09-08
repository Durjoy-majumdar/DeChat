package yh2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioSearchView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jh2.C108745d;
import xh2.C112151a;

/* renamed from: yh2.c */
public final class C112458c extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioSearchView f336724d;

    public C112458c(EditorAudioSearchView editorAudioSearchView) {
        this.f336724d = editorAudioSearchView;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$mScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int E = ((LinearLayoutManager) layoutManager).mo16959E();
            C108745d.C108746a aVar = C108745d.f325632h;
            C108745d.f325634j.f310342g = (long) E;
            EditorAudioSearchView editorAudioSearchView = this.f336724d;
            C112151a aVar2 = editorAudioSearchView.f315503u;
            if (aVar2 != null && E == aVar2.getItemCount() - 1) {
                AudioCacheInfo F4 = aVar2.mo163962F4(E);
                boolean z = false;
                if (F4 != null && F4.f163820o == 5) {
                    z = true;
                }
                if (z) {
                    editorAudioSearchView.mo151358c(true);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$mScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$mScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$mScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
