package yt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: yt0.a */
public class C53561a extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: o */
    public static ViewGroup.LayoutParams f150536o = new ViewGroup.LayoutParams(-1, -2);

    /* renamed from: d */
    public RecyclerView.C16613e f150537d;

    /* renamed from: e */
    public ViewGroup f150538e;

    /* renamed from: f */
    public ViewGroup f150539f;

    /* renamed from: g */
    public List<View> f150540g = new LinkedList();

    /* renamed from: h */
    public List<View> f150541h = new LinkedList();

    /* renamed from: i */
    public C53568b f150542i;

    /* renamed from: j */
    public C53569c f150543j;

    /* renamed from: n */
    public RecyclerView.C16615g f150544n = new C53562a();

    /* renamed from: yt0.a$a */
    public class C53562a extends RecyclerView.C16615g {
        public C53562a() {
        }

        /* renamed from: b */
        public void mo2556b() {
            C53561a.this.notifyDataSetChanged();
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            C53561a.this.notifyItemRangeChanged(i + (C53561a.this.f150540g.isEmpty() ^ true ? 1 : 0), i2);
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            C53561a.this.notifyItemRangeChanged(i + (C53561a.this.f150540g.isEmpty() ^ true ? 1 : 0), i2, obj);
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            C53561a.this.notifyItemRangeInserted(i + (C53561a.this.f150540g.isEmpty() ^ true ? 1 : 0), i2);
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            if (i3 == 1) {
                C53561a aVar = C53561a.this;
                aVar.notifyItemMoved(i + (aVar.f150540g.isEmpty() ^ true ? 1 : 0), i2 + (true ^ C53561a.this.f150540g.isEmpty() ? 1 : 0));
                return;
            }
            C53561a.this.notifyDataSetChanged();
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            C53561a.this.notifyItemRangeRemoved(i + (C53561a.this.f150540g.isEmpty() ^ true ? 1 : 0), i2);
        }
    }

    /* renamed from: yt0.a$b */
    public class C53563b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView.C16631z f150546d;

        /* renamed from: e */
        public final /* synthetic */ int f150547e;

        public C53563b(RecyclerView.C16631z zVar, int i) {
            this.f150546d = zVar;
            this.f150547e = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C53568b bVar = C53561a.this.f150542i;
            if (bVar != null) {
                RecyclerView.C16631z zVar = this.f150546d;
                bVar.mo63442a(zVar.f44854d, this.f150547e, zVar.f44858h);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yt0.a$c */
    public class C53564c implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView.C16631z f150549d;

        /* renamed from: e */
        public final /* synthetic */ int f150550e;

        public C53564c(RecyclerView.C16631z zVar, int i) {
            this.f150549d = zVar;
            this.f150550e = i;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C53569c cVar = C53561a.this.f150543j;
            boolean z = false;
            if (cVar != null) {
                RecyclerView.C16631z zVar = this.f150549d;
                View view2 = zVar.f44854d;
                int i = this.f150550e;
                long j = zVar.f44858h;
                MRecyclerView mRecyclerView = MRecyclerView.this;
                MRecyclerView.C40584e eVar = mRecyclerView.f108987A1;
                if (eVar != null) {
                    z = eVar.mo23457a(mRecyclerView, view2, i, j);
                }
                C117292a.m165362h(z, this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return z;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: yt0.a$d */
    public class C53565d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView.C16631z f150552d;

        /* renamed from: e */
        public final /* synthetic */ int f150553e;

        public C53565d(RecyclerView.C16631z zVar, int i) {
            this.f150552d = zVar;
            this.f150553e = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C53568b bVar = C53561a.this.f150542i;
            if (bVar != null) {
                RecyclerView.C16631z zVar = this.f150552d;
                bVar.mo63442a(zVar.f44854d, this.f150553e, zVar.f44858h);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yt0.a$e */
    public class C53566e implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView.C16631z f150555d;

        /* renamed from: e */
        public final /* synthetic */ int f150556e;

        public C53566e(RecyclerView.C16631z zVar, int i) {
            this.f150555d = zVar;
            this.f150556e = i;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C53569c cVar = C53561a.this.f150543j;
            boolean z = false;
            if (cVar != null) {
                RecyclerView.C16631z zVar = this.f150555d;
                View view2 = zVar.f44854d;
                int i = this.f150556e;
                long j = zVar.f44858h;
                MRecyclerView mRecyclerView = MRecyclerView.this;
                MRecyclerView.C40584e eVar = mRecyclerView.f108987A1;
                if (eVar != null) {
                    z = eVar.mo23457a(mRecyclerView, view2, i, j);
                }
                C117292a.m165362h(z, this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return z;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: yt0.a$f */
    public static class C53567f extends RecyclerView.C16631z {
        public C53567f(View view) {
            super(view);
        }
    }

    /* renamed from: F4 */
    public final void mo74211F4(RecyclerView.C16631z zVar) {
        if (zVar.f44854d.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) {
            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) zVar.f44854d.getLayoutParams();
            layoutParams.f44911i = true;
            zVar.f44854d.setLayoutParams(layoutParams);
        }
    }

    public final int getItemCount() {
        RecyclerView.C16613e eVar = this.f150537d;
        int itemCount = eVar == null ? 0 : eVar.getItemCount();
        if (!this.f150540g.isEmpty()) {
            itemCount++;
        }
        return !this.f150541h.isEmpty() ? itemCount + 1 : itemCount;
    }

    public long getItemId(int i) {
        return getItemViewType(i) == Integer.MAX_VALUE ? (long) -1782095970 : getItemViewType(i) == 2147483646 ? (long) 1955920812 : !this.f150537d.hasStableIds() ? (long) i : this.f150537d.getItemId(i - (this.f150540g.isEmpty() ^ true ? 1 : 0));
    }

    public final int getItemViewType(int i) {
        if (!this.f150540g.isEmpty() && i == 0) {
            return Integer.MAX_VALUE;
        }
        if (this.f150541h.isEmpty() || i != getItemCount() - 1) {
            return this.f150537d.getItemViewType(i - (this.f150540g.isEmpty() ^ true ? 1 : 0));
        }
        return 2147483646;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        if (!this.f150540g.isEmpty() && i == 0) {
            mo74211F4(zVar);
        } else if (this.f150541h.isEmpty() || i != getItemCount() - 1) {
            int i2 = i - (this.f150540g.isEmpty() ^ true ? 1 : 0);
            this.f150537d.onBindViewHolder(zVar, i2);
            if (this.f150542i != null) {
                zVar.f44854d.setOnClickListener(new C53563b(zVar, i2));
            }
            if (this.f150543j != null) {
                zVar.f44854d.setOnLongClickListener(new C53564c(zVar, i2));
            }
        } else {
            mo74211F4(zVar);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 2147483646) {
            ViewGroup viewGroup2 = this.f150538e;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c7x, viewGroup, false);
            this.f150538e = viewGroup3;
            for (View next : this.f150541h) {
                if (next.getParent() instanceof ViewGroup) {
                    ((ViewGroup) next.getParent()).removeView(next);
                }
                viewGroup3.addView(next, f150536o);
            }
            return new C53567f(viewGroup3);
        } else if (i != Integer.MAX_VALUE) {
            return this.f150537d.onCreateViewHolder(viewGroup, i);
        } else {
            ViewGroup viewGroup4 = this.f150539f;
            if (viewGroup4 != null) {
                viewGroup4.removeAllViews();
            }
            ViewGroup viewGroup5 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c7x, viewGroup, false);
            this.f150539f = viewGroup5;
            for (View addView : this.f150540g) {
                viewGroup5.addView(addView, f150536o);
            }
            return new C53567f(viewGroup5);
        }
    }

    public void onViewAttachedToWindow(RecyclerView.C16631z zVar) {
        super.onViewAttachedToWindow(zVar);
        int i = zVar.f44859i;
        if (i != Integer.MAX_VALUE && i != 2147483646) {
            this.f150537d.onViewAttachedToWindow(zVar);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.C16631z zVar) {
        super.onViewDetachedFromWindow(zVar);
        int i = zVar.f44859i;
        if (i != Integer.MAX_VALUE && i != 2147483646) {
            this.f150537d.onViewDetachedFromWindow(zVar);
        }
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List<Object> list) {
        if (!this.f150540g.isEmpty() && i == 0) {
            mo74211F4(zVar);
        } else if (this.f150541h.isEmpty() || i != getItemCount() - 1) {
            int i2 = i - (this.f150540g.isEmpty() ^ true ? 1 : 0);
            this.f150537d.onBindViewHolder(zVar, i2, list);
            if (this.f150542i != null) {
                zVar.f44854d.setOnClickListener(new C53565d(zVar, i2));
            }
            if (this.f150543j != null) {
                zVar.f44854d.setOnLongClickListener(new C53566e(zVar, i2));
            }
        } else {
            mo74211F4(zVar);
        }
    }
}
