package o83;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.webview.emojistore.p476ui.SimilarEmojiLoadMoreRecyclerView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: o83.c */
public class C100298c extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ SimilarEmojiLoadMoreRecyclerView f293815d;

    public C100298c(SimilarEmojiLoadMoreRecyclerView similarEmojiLoadMoreRecyclerView) {
        this.f293815d = similarEmojiLoadMoreRecyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
        r10 = r8.f293815d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0.add(r1)
            java.lang.Object[] r7 = r0.toArray()
            r0.clear()
            java.lang.String r2 = "com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1"
            java.lang.String r3 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r4 = "onScrollStateChanged"
            java.lang.String r5 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            r6 = r8
            j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
            super.onScrollStateChanged(r9, r10)
            java.lang.String r9 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            java.lang.String r0 = "onScrollStateChanged"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r2 = "com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1"
            if (r10 != 0) goto L_0x007c
            com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView r10 = r8.f293815d
            boolean r3 = r10.f282909R1
            if (r3 != 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r10.getLayoutManager()
            if (r10 == 0) goto L_0x007c
            com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView r10 = r8.f293815d
            androidx.recyclerview.widget.RecyclerView$e r10 = r10.getAdapter()
            if (r10 != 0) goto L_0x0046
            goto L_0x007c
        L_0x0046:
            com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView r10 = r8.f293815d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r10.getLayoutManager()
            androidx.recyclerview.widget.GridLayoutManager r10 = (androidx.recyclerview.widget.GridLayoutManager) r10
            int r10 = r10.mo16959E()
            int r10 = r10 + 1
            com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView r3 = r8.f293815d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.getLayoutManager()
            androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
            int r3 = r3.f44669w
            int r10 = r10 + r3
            com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView r3 = r8.f293815d
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            int r3 = r3.getItemCount()
            if (r10 < r3) goto L_0x0078
            com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView r10 = r8.f293815d
            bq.m1$a r3 = r10.f282908Q1
            if (r3 == 0) goto L_0x0078
            androidx.recyclerview.widget.RecyclerView$e r4 = r10.getAdapter()
            r3.mo126274X1(r10, r4)
        L_0x0078:
            j20.C117292a.m165361g(r8, r2, r1, r0, r9)
            return
        L_0x007c:
            j20.C117292a.m165361g(r8, r2, r1, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o83.C100298c.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
