package nf1;

import android.graphics.Point;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nf1.d */
public class C21626d {

    /* renamed from: a */
    public RecyclerView.LayoutManager f61226a;

    /* renamed from: b */
    public RecyclerView f61227b;

    public C21626d(RecyclerView.LayoutManager layoutManager, RecyclerView recyclerView) {
        this.f61226a = layoutManager;
        this.f61227b = recyclerView;
    }

    /* renamed from: b */
    public static boolean m24551b(int i, int i2, int i3, int i4, int i5, C21625c cVar) {
        C21624b bVar = cVar.f61224a;
        int i6 = bVar.f61223b;
        if (!(i6 > 0) || cVar.f61225b != i6) {
            return bVar.f61222a.ordinal() != 1 ? (i + i2) + i5 > i4 : (i - i2) - i5 < i3;
        }
        return true;
    }

    /* renamed from: a */
    public Point mo33864a(C21625c cVar) {
        return cVar.f61224a.f61222a.ordinal() != 1 ? new Point(this.f61227b.getPaddingLeft(), this.f61226a.getPaddingTop()) : new Point(this.f61226a.getWidth() - this.f61226a.getPaddingRight(), this.f61226a.getPaddingTop());
    }

    /* renamed from: c */
    public int mo33865c() {
        return (this.f61226a.getWidth() - this.f61226a.getPaddingRight()) - this.f61227b.getPaddingLeft();
    }
}
