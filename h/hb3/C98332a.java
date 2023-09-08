package hb3;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96727e;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hb3.a */
public abstract class C98332a extends RecyclerView.C0130p {
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/adapter/NoteRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/adapter/NoteRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/adapter/NoteRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (Math.abs(i2) > 0) {
            if (!recyclerView.canScrollVertically(-1)) {
                NoteEditorUI.this.hideActionbarLine();
            } else if (!recyclerView.canScrollVertically(1)) {
                NoteEditorUI noteEditorUI = NoteEditorUI.this;
                int i3 = NoteEditorUI.f283207p1;
                noteEditorUI.f270015g.f295032q = true;
                noteEditorUI.f283236W0 = true;
            } else if (i2 < 0) {
                NoteEditorUI noteEditorUI2 = NoteEditorUI.this;
                int i4 = NoteEditorUI.f283207p1;
                noteEditorUI2.getClass();
                C86709a0.m107525e().postToWorker(new C96727e(noteEditorUI2));
            } else if (i2 > 0) {
                NoteEditorUI.C96700g0 g0Var = (NoteEditorUI.C96700g0) this;
                NoteEditorUI.this.showActionbarLine();
                NoteEditorUI noteEditorUI3 = NoteEditorUI.this;
                int i5 = NoteEditorUI.f283207p1;
                noteEditorUI3.getClass();
                C86709a0.m107525e().postToWorker(new C96727e(noteEditorUI3));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/adapter/NoteRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
