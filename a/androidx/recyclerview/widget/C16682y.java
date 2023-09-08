package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.y */
public abstract class C16682y {

    /* renamed from: a */
    public final RecyclerView.LayoutManager f45081a;

    /* renamed from: b */
    public int f45082b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f45083c = new Rect();

    public C16682y(RecyclerView.LayoutManager layoutManager, C16680w wVar) {
        this.f45081a = layoutManager;
    }

    /* renamed from: a */
    public static C16682y m16171a(RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return new C16680w(layoutManager);
        }
        if (i == 1) {
            return new C16681x(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo17561b(View view);

    /* renamed from: c */
    public abstract int mo17562c(View view);

    /* renamed from: d */
    public abstract int mo17563d(View view);

    /* renamed from: e */
    public abstract int mo17564e(View view);

    /* renamed from: f */
    public abstract int mo17565f();

    /* renamed from: g */
    public abstract int mo17566g();

    /* renamed from: h */
    public abstract int mo17567h();

    /* renamed from: i */
    public abstract int mo17568i();

    /* renamed from: j */
    public abstract int mo17569j();

    /* renamed from: k */
    public abstract int mo17570k();

    /* renamed from: l */
    public abstract int mo17571l();

    /* renamed from: m */
    public int mo17575m() {
        if (Integer.MIN_VALUE == this.f45082b) {
            return 0;
        }
        return mo17571l() - this.f45082b;
    }

    /* renamed from: n */
    public abstract int mo17572n(View view);

    /* renamed from: o */
    public abstract int mo17573o(View view);

    /* renamed from: p */
    public abstract void mo17574p(int i);
}
