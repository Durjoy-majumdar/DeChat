package a13;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: a13.g */
public abstract class C53849g extends RecyclerView.C16633n {

    /* renamed from: a */
    public RecyclerView f151090a;

    /* renamed from: b */
    public final RecyclerView.C0130p f151091b = new C53850a();

    /* renamed from: a13.g$a */
    public class C53850a extends RecyclerView.C0130p {

        /* renamed from: d */
        public boolean f151092d = false;

        public C53850a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/TopStoryVideoSnapHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f151092d) {
                this.f151092d = false;
                C53849g.this.mo74464g();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/widget/TopStoryVideoSnapHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/TopStoryVideoSnapHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            if (!(i == 0 && i2 == 0)) {
                this.f151092d = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/widget/TopStoryVideoSnapHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: a */
    public boolean mo17379a(int i, int i2) {
        boolean z;
        C54256s d;
        int f;
        RecyclerView.LayoutManager layoutManager = this.f151090a.getLayoutManager();
        if (layoutManager == null || this.f151090a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f151090a.getMinFlingVelocity();
        if (Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) {
            return false;
        }
        if (!(layoutManager instanceof RecyclerView.C16634v.C16636b) || (d = mo74461d(layoutManager)) == null || (f = mo74463f(layoutManager, i, i2)) == -1) {
            z = false;
        } else {
            d.f44872a = f;
            layoutManager.startSmoothScroll(d);
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public void mo74459b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f151090a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo17098m1(this.f151091b);
                this.f151090a.setOnFlingListener((RecyclerView.C16633n) null);
            }
            this.f151090a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f151090a.mo17043c(this.f151091b);
                this.f151090a.setOnFlingListener(this);
                new Scroller(this.f151090a.getContext(), new DecelerateInterpolator());
                mo74464g();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    /* renamed from: c */
    public abstract int[] mo74460c(RecyclerView.LayoutManager layoutManager, View view);

    @Deprecated
    /* renamed from: d */
    public abstract C54256s mo74461d(RecyclerView.LayoutManager layoutManager);

    /* renamed from: e */
    public abstract View mo74462e(RecyclerView.LayoutManager layoutManager);

    /* renamed from: f */
    public abstract int mo74463f(RecyclerView.LayoutManager layoutManager, int i, int i2);

    /* renamed from: g */
    public void mo74464g() {
        RecyclerView.LayoutManager layoutManager;
        View e;
        RecyclerView recyclerView = this.f151090a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (e = mo74462e(layoutManager)) != null) {
            int[] c = mo74460c(layoutManager, e);
            int i = c[0];
            if (i != 0 || c[1] != 0) {
                this.f151090a.smoothScrollBy(i, c[1]);
            }
        }
    }
}
