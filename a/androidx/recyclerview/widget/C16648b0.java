package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C16644a;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b0 */
public class C16648b0 implements C16644a.C16645a {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f44953a;

    public C16648b0(RecyclerView recyclerView) {
        this.f44953a = recyclerView;
    }

    /* renamed from: a */
    public void mo17482a(C16644a.C16646b bVar) {
        int i = bVar.f44948a;
        if (i == 1) {
            RecyclerView recyclerView = this.f44953a;
            recyclerView.f44782s.onItemsAdded(recyclerView, bVar.f44949b, bVar.f44951d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f44953a;
            recyclerView2.f44782s.onItemsRemoved(recyclerView2, bVar.f44949b, bVar.f44951d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f44953a;
            recyclerView3.f44782s.onItemsUpdated(recyclerView3, bVar.f44949b, bVar.f44951d, bVar.f44950c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.f44953a;
            recyclerView4.f44782s.onItemsMoved(recyclerView4, bVar.f44949b, bVar.f44951d, 1);
        }
    }

    /* renamed from: b */
    public void mo17483b(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f44953a;
        int h = recyclerView.f44763h.mo17493h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.f44763h.mo17492g(i6);
            RecyclerView.C16631z Q0 = RecyclerView.m15803Q0(g);
            if (Q0 != null && !Q0.mo17377w() && (i4 = Q0.f44856f) >= i && i4 < i5) {
                Q0.mo17362i(2);
                Q0.mo17361h(obj);
                ((RecyclerView.LayoutParams) g.getLayoutParams()).f44800f = true;
            }
        }
        RecyclerView.C16625r rVar = recyclerView.f44757e;
        int size = rVar.f44824c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.C16631z zVar = rVar.f44824c.get(size);
                if (zVar != null && (i3 = zVar.f44856f) >= i && i3 < i5) {
                    zVar.mo17362i(2);
                    rVar.mo17343g(size);
                }
            } else {
                this.f44953a.f44758e1 = true;
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo17484c(int i, int i2) {
        RecyclerView recyclerView = this.f44953a;
        int h = recyclerView.f44763h.mo17493h();
        for (int i3 = 0; i3 < h; i3++) {
            RecyclerView.C16631z Q0 = RecyclerView.m15803Q0(recyclerView.f44763h.mo17492g(i3));
            if (Q0 != null && !Q0.mo17377w() && Q0.f44856f >= i) {
                Q0.mo17373t(i2, false);
                recyclerView.f44752a1.f44837f = true;
            }
        }
        RecyclerView.C16625r rVar = recyclerView.f44757e;
        int size = rVar.f44824c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.C16631z zVar = rVar.f44824c.get(i4);
            if (zVar != null && zVar.f44856f >= i) {
                zVar.mo17373t(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f44953a.f44756d1 = true;
    }

    /* renamed from: d */
    public void mo17485d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f44953a;
        int h = recyclerView.f44763h.mo17493h();
        int i15 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i16 = 0; i16 < h; i16++) {
            RecyclerView.C16631z Q0 = RecyclerView.m15803Q0(recyclerView.f44763h.mo17492g(i16));
            if (Q0 != null && (i9 = Q0.f44856f) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    Q0.mo17373t(i2 - i, false);
                } else {
                    Q0.mo17373t(i3, false);
                }
                recyclerView.f44752a1.f44837f = true;
            }
        }
        RecyclerView.C16625r rVar = recyclerView.f44757e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i15 = 1;
        }
        int size = rVar.f44824c.size();
        for (int i17 = 0; i17 < size; i17++) {
            RecyclerView.C16631z zVar = rVar.f44824c.get(i17);
            if (zVar != null && (i8 = zVar.f44856f) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    zVar.mo17373t(i2 - i, false);
                } else {
                    zVar.mo17373t(i15, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f44953a.f44756d1 = true;
    }
}
