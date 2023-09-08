package m21;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.component.editor.C93076j;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: m21.a */
public abstract class C99784a extends RecyclerView.C0130p {
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/CollectEditorRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/CollectEditorRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/CollectEditorRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (Math.abs(i2) > 0) {
            if (!recyclerView.canScrollVertically(-1)) {
                EditorUI.this.hideActionbarLine();
            } else if (recyclerView.canScrollVertically(1)) {
                if (i2 < 0) {
                    EditorUI editorUI = EditorUI.this;
                    int i3 = EditorUI.f268032J;
                    editorUI.getClass();
                    C86709a0.m107525e().postToWorker(new C93076j(editorUI));
                } else if (i2 > 0) {
                    EditorUI.C93061n nVar = (EditorUI.C93061n) this;
                    EditorUI.this.showActionbarLine();
                    EditorUI editorUI2 = EditorUI.this;
                    int i4 = EditorUI.f268032J;
                    editorUI2.getClass();
                    C86709a0.m107525e().postToWorker(new C93076j(editorUI2));
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/CollectEditorRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
