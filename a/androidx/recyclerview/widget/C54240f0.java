package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f0 */
public abstract class C54240f0 extends RecyclerView.C16633n {

    /* renamed from: a */
    public RecyclerView f152241a;

    /* renamed from: b */
    public Scroller f152242b;

    /* renamed from: c */
    public final RecyclerView.C0130p f152243c = new C54241a();

    /* renamed from: androidx.recyclerview.widget.f0$a */
    public class C54241a extends RecyclerView.C0130p {

        /* renamed from: d */
        public boolean f152244d = false;

        public C54241a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f152244d) {
                this.f152244d = false;
                C54240f0.this.mo75031h();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f152244d = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.f0$b */
    public class C54242b extends C54256s {
        public C54242b(Context context) {
            super(context);
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C54240f0 f0Var = C54240f0.this;
            RecyclerView recyclerView = f0Var.f152241a;
            if (recyclerView != null) {
                int[] c = f0Var.mo75026c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int l = mo10339l(Math.max(Math.abs(i), Math.abs(i2)));
                if (l > 0) {
                    aVar.mo17388b(i, i2, l, this.f152290i);
                }
            }
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: a */
    public boolean mo17379a(int i, int i2) {
        boolean z;
        RecyclerView.C16634v d;
        int g;
        RecyclerView.LayoutManager layoutManager = this.f152241a.getLayoutManager();
        if (layoutManager == null || this.f152241a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f152241a.getMinFlingVelocity();
        if (Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) {
            return false;
        }
        if (!(layoutManager instanceof RecyclerView.C16634v.C16636b) || (d = mo75027d(layoutManager)) == null || (g = mo75030g(layoutManager, i, i2)) == -1) {
            z = false;
        } else {
            d.f44872a = g;
            layoutManager.startSmoothScroll(d);
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public void mo75025b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f152241a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo17098m1(this.f152243c);
                this.f152241a.setOnFlingListener((RecyclerView.C16633n) null);
            }
            this.f152241a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f152241a.mo17043c(this.f152243c);
                this.f152241a.setOnFlingListener(this);
                this.f152242b = new Scroller(this.f152241a.getContext(), new DecelerateInterpolator());
                mo75031h();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    /* renamed from: c */
    public abstract int[] mo75026c(RecyclerView.LayoutManager layoutManager, View view);

    /* renamed from: d */
    public RecyclerView.C16634v mo75027d(RecyclerView.LayoutManager layoutManager) {
        return mo75028e(layoutManager);
    }

    @Deprecated
    /* renamed from: e */
    public C54256s mo75028e(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.C16634v.C16636b)) {
            return null;
        }
        return new C54242b(this.f152241a.getContext());
    }

    /* renamed from: f */
    public abstract View mo75029f(RecyclerView.LayoutManager layoutManager);

    /* renamed from: g */
    public abstract int mo75030g(RecyclerView.LayoutManager layoutManager, int i, int i2);

    /* renamed from: h */
    public void mo75031h() {
        RecyclerView.LayoutManager layoutManager;
        View f;
        RecyclerView recyclerView = this.f152241a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (f = mo75029f(layoutManager)) != null) {
            int[] c = mo75026c(layoutManager, f);
            int i = c[0];
            if (i != 0 || c[1] != 0) {
                this.f152241a.smoothScrollBy(i, c[1]);
            }
        }
    }
}
