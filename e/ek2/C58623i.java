package ek2;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ek2.i */
public final class C58623i extends C54259z {

    /* renamed from: f */
    public int f167846f;

    /* renamed from: g */
    public int f167847g = -1;

    /* renamed from: h */
    public C58624a f167848h;

    /* renamed from: i */
    public C16682y f167849i;

    /* renamed from: j */
    public RecyclerView f167850j;

    /* renamed from: k */
    public final C58628c f167851k = new C58628c(this);

    /* renamed from: l */
    public final C58625b f167852l = new C58625b(this);

    /* renamed from: ek2.i$a */
    public interface C58624a {
        void onPageSelected(int i);
    }

    /* renamed from: ek2.i$b */
    public static final class C58625b extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ C58623i f167853a;

        /* renamed from: ek2.i$b$a */
        public static final class C58626a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C58623i f167854d;

            public C58626a(C58623i iVar) {
                this.f167854d = iVar;
            }

            public final void run() {
                this.f167854d.getClass();
            }
        }

        /* renamed from: ek2.i$b$b */
        public static final class C58627b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C58623i f167855d;

            public C58627b(C58623i iVar) {
                this.f167855d = iVar;
            }

            public final void run() {
                this.f167855d.getClass();
            }
        }

        public C58625b(C58623i iVar) {
            this.f167853a = iVar;
        }

        /* renamed from: b */
        public void mo2556b() {
            RecyclerView recyclerView;
            C58623i iVar = this.f167853a;
            if (iVar.f167847g == -1 && (recyclerView = iVar.f167850j) != null) {
                recyclerView.post(new C58626a(iVar));
            }
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            RecyclerView recyclerView;
            C58623i iVar = this.f167853a;
            if (iVar.f167847g == -1 && (recyclerView = iVar.f167850j) != null) {
                recyclerView.post(new C58627b(iVar));
            }
        }
    }

    /* renamed from: ek2.i$c */
    public static final class C58628c extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C58623i f167856d;

        public C58628c(C58623i iVar) {
            this.f167856d = iVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/RingtoneVideoSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            Log.m105924i("MicroMsg.RingtoneVideoSnapHelper", "onScrollStateChanged:" + i + ", snapPosition:" + this.f167856d.f167847g);
            if (i == 0) {
                this.f167856d.getClass();
                this.f167856d.getClass();
            }
            if (i == 1) {
                this.f167856d.getClass();
                this.f167856d.getClass();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneVideoSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/RingtoneVideoSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneVideoSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C58623i(int i) {
        this.f167846f = i;
    }

    /* renamed from: b */
    public void mo75025b(RecyclerView recyclerView) {
        RecyclerView.C16613e adapter;
        RecyclerView.C16613e adapter2;
        super.mo75025b(recyclerView);
        RecyclerView recyclerView2 = this.f167850j;
        if (recyclerView2 != null) {
            recyclerView2.mo17098m1(this.f167851k);
        }
        RecyclerView recyclerView3 = this.f167850j;
        if (!(recyclerView3 == null || (adapter2 = recyclerView3.getAdapter()) == null)) {
            adapter2.unregisterAdapterDataObserver(this.f167852l);
        }
        this.f167850j = recyclerView;
        if (recyclerView != null) {
            recyclerView.mo17043c(this.f167851k);
        }
        RecyclerView recyclerView4 = this.f167850j;
        if (recyclerView4 != null && (adapter = recyclerView4.getAdapter()) != null) {
            adapter.registerAdapterDataObserver(this.f167852l);
        }
    }

    /* renamed from: c */
    public int[] mo75026c(RecyclerView.LayoutManager layoutManager, View view) {
        C87412m.m108594g(layoutManager, "layoutManager");
        C87412m.m108594g(view, "targetView");
        int[] iArr = new int[2];
        C16682y m = mo83506m(layoutManager);
        int e = m.mo17564e(view);
        int k = m.mo17570k();
        if (this.f167847g > 0) {
            k += this.f167846f;
        }
        iArr[1] = e - k;
        return iArr;
    }

    /* renamed from: d */
    public RecyclerView.C16634v mo75027d(RecyclerView.LayoutManager layoutManager) {
        return mo75028e(layoutManager);
    }

    /* renamed from: f */
    public View mo75029f(RecyclerView.LayoutManager layoutManager) {
        C87412m.m108594g(layoutManager, "layoutManager");
        View n = mo83507n(layoutManager, mo83506m(layoutManager));
        RecyclerView.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = n != null ? n.getLayoutParams() : null;
        if (layoutParams2 instanceof RecyclerView.LayoutParams) {
            layoutParams = (RecyclerView.LayoutParams) layoutParams2;
        }
        int a = layoutParams != null ? layoutParams.mo17279a() : -1;
        if (this.f167847g != a) {
            this.f167847g = a;
            C58624a aVar = this.f167848h;
            if (aVar != null) {
                aVar.onPageSelected(a);
            }
        }
        return n;
    }

    /* renamed from: g */
    public int mo75030g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        View n;
        int position;
        PointF f;
        C87412m.m108594g(layoutManager, "layoutManager");
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (n = mo83507n(layoutManager, mo83506m(layoutManager))) == null || (position = layoutManager.getPosition(n)) == -1) {
            return -1;
        }
        int i3 = 0;
        boolean z = i2 > 0;
        boolean z2 = (layoutManager instanceof RecyclerView.C16634v.C16636b) && (f = ((RecyclerView.C16634v.C16636b) layoutManager).mo16988f(itemCount + -1)) != null && (f.x < 0.0f || f.y < 0.0f);
        int i4 = this.f167847g;
        if (position == i4) {
            position = z2 ? position - 1 : position + -1;
            position++;
        }
        if (i4 != -1) {
            position = Math.max(Math.min(position, i4 + 1), this.f167847g - 1);
        }
        if (this.f167846f > 0) {
            if (position == 1 && this.f167847g == 0) {
                position = 2;
            }
            if (position == 1 && this.f167847g == 2) {
                position = 0;
            }
        }
        if (position >= 0) {
            i3 = position;
        }
        if (i3 >= itemCount) {
            i3 = itemCount - 1;
        }
        if (i3 != this.f167847g) {
            this.f167847g = i3;
            C58624a aVar = this.f167848h;
            if (aVar != null) {
                aVar.onPageSelected(i3);
            }
        }
        return this.f167847g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0.f45081a != r2) goto L_0x000b;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.recyclerview.widget.C16682y mo83506m(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
        /*
            r1 = this;
            androidx.recyclerview.widget.y r0 = r1.f167849i
            if (r0 == 0) goto L_0x000b
            gy3.C87412m.m108591d(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.f45081a
            if (r0 == r2) goto L_0x0012
        L_0x000b:
            androidx.recyclerview.widget.x r0 = new androidx.recyclerview.widget.x
            r0.<init>(r2)
            r1.f167849i = r0
        L_0x0012:
            androidx.recyclerview.widget.y r2 = r1.f167849i
            gy3.C87412m.m108591d(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ek2.C58623i.mo83506m(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.y");
    }

    /* renamed from: n */
    public final View mo83507n(RecyclerView.LayoutManager layoutManager, C16682y yVar) {
        int childCount;
        int abs;
        View view = null;
        if (layoutManager == null || (childCount = layoutManager.getChildCount()) == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        int k = yVar.mo17570k();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            if (childAt != null && ((this.f167846f <= 0 || layoutManager.getPosition(childAt) != 1) && (abs = Math.abs(yVar.mo17564e(childAt) - k)) < i)) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }
}
