package com.tencent.p014mm.plugin.appbrand.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import yt0.C53561a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView */
public class LoadMoreRecyclerView extends MRecyclerView {

    /* renamed from: C1 */
    public View f108979C1;

    /* renamed from: D1 */
    public C40579c f108980D1;

    /* renamed from: E1 */
    public boolean f108981E1;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView$a */
    public class C40577a extends RecyclerView.C0130p {

        /* renamed from: d */
        public int f108982d = 0;

        /* renamed from: e */
        public final /* synthetic */ LinearLayoutManager f108983e;

        public C40577a(LinearLayoutManager linearLayoutManager) {
            this.f108983e = linearLayoutManager;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
            r9 = r8.f108984f;
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
                java.lang.String r2 = "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView$1"
                java.lang.String r3 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
                java.lang.String r4 = "onScrollStateChanged"
                java.lang.String r5 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
                r6 = r8
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                super.onScrollStateChanged(r9, r10)
                if (r10 != 0) goto L_0x0047
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r9 = com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.this
                boolean r10 = r9.f108981E1
                if (r10 == 0) goto L_0x0047
                int r10 = r8.f108982d
                yt0.a r9 = r9.f108989y1
                int r9 = r9.getItemCount()
                int r9 = r9 + -1
                if (r10 != r9) goto L_0x0047
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r9 = com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.this
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView$c r10 = r9.f108980D1
                if (r10 == 0) goto L_0x0047
                yt0.a r0 = r9.f108989y1
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.f150537d
                r10.mo23454a(r9, r0)
            L_0x0047:
                java.lang.String r9 = "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView$1"
                java.lang.String r10 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
                java.lang.String r0 = "onScrollStateChanged"
                java.lang.String r1 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
                j20.C117292a.m165361g(r8, r9, r10, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.C40577a.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            this.f108982d = this.f108983e.mo16959E();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView$b */
    public class C40578b extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ LinearLayoutManager f108985a;

        public C40578b(LinearLayoutManager linearLayoutManager) {
            this.f108985a = linearLayoutManager;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
            r2 = r1.f108986b;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2560g(int r2, int r3) {
            /*
                r1 = this;
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r2 = com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.this
                boolean r2 = r2.f108981E1
                if (r2 == 0) goto L_0x0025
                androidx.recyclerview.widget.LinearLayoutManager r2 = r1.f108985a
                int r2 = r2.mo16959E()
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r3 = com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.this
                yt0.a r3 = r3.f108989y1
                int r3 = r3.getItemCount()
                int r3 = r3 + -1
                if (r2 != r3) goto L_0x0025
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r2 = com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.this
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView$c r3 = r2.f108980D1
                if (r3 == 0) goto L_0x0025
                yt0.a r0 = r2.f108989y1
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.f150537d
                r3.mo23454a(r2, r0)
            L_0x0025:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.C40578b.mo2560g(int, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView$c */
    public interface C40579c {
        /* renamed from: a */
        void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar);
    }

    public LoadMoreRecyclerView(Context context) {
        super(context);
        m43803y1();
    }

    /* renamed from: y1 */
    private void m43803y1() {
        LinearLayoutManager B1 = mo63429B1();
        super.setLayoutManager(B1);
        mo17043c(new C40577a(B1));
        this.f108989y1.registerAdapterDataObserver(new C40578b(B1));
    }

    /* renamed from: A1 */
    public boolean mo63428A1() {
        return this.f108979C1 != null ? this.f108989y1.getItemCount() == 1 && ((LinkedList) this.f108989y1.f150541h).size() == 1 : super.mo63428A1();
    }

    /* renamed from: B1 */
    public LinearLayoutManager mo63429B1() {
        return new LinearLayoutManager(getContext());
    }

    /* renamed from: I */
    public void mo63430I(boolean z) {
        if (this.f108981E1 != z) {
            this.f108981E1 = z;
            View view = this.f108979C1;
            if (view != null) {
                int i = z ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public void addFooterView(View view) {
        int size = ((LinkedList) this.f108989y1.f150541h).size() - 1;
        if (this.f108979C1 == null || size < 0) {
            super.addFooterView(view);
            return;
        }
        C53561a aVar = this.f108989y1;
        ((LinkedList) aVar.f150541h).add(size, view);
        aVar.notifyItemRangeChanged(aVar.getItemCount() - 1, 1);
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
    }

    public void setLoadingView(View view) {
        View view2 = this.f108979C1;
        if (view2 != view) {
            if (view2 != null && !view2.equals(view)) {
                mo63441z1(this.f108979C1);
            }
            this.f108979C1 = view;
            if (view != null) {
                addFooterView(view);
                View view3 = this.f108979C1;
                int i = this.f108981E1 ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "setLoadingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "setLoadingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public void setOnLoadingStateChangedListener(C40579c cVar) {
        this.f108980D1 = cVar;
    }

    public LoadMoreRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43803y1();
    }

    public LoadMoreRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43803y1();
    }

    public void setLoadingView(int i) {
        setLoadingView(LayoutInflater.from(getContext()).inflate(i, this, false));
    }
}
