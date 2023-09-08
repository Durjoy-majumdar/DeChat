package ly1;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: ly1.m */
public class C99756m extends GridLayoutManager.C0127b {

    /* renamed from: b */
    public final /* synthetic */ C99765p f292363b;

    public C99756m(C99765p pVar) {
        this.f292363b = pVar;
    }

    /* renamed from: c */
    public int mo118c(int i) {
        int itemViewType = this.f292363b.f292389B1.getItemViewType(i);
        return (itemViewType == Integer.MAX_VALUE || itemViewType == 2147483646 || itemViewType == 1 || itemViewType == 2) ? 2 : 1;
    }
}
