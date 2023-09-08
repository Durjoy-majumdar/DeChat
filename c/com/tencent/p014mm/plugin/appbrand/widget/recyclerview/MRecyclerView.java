package com.tencent.p014mm.plugin.appbrand.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import yt0.C53561a;
import yt0.C53568b;
import yt0.C53569c;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView */
public class MRecyclerView extends RecyclerView {

    /* renamed from: A1 */
    public C40584e f108987A1;

    /* renamed from: B1 */
    public View f108988B1;

    /* renamed from: y1 */
    public C53561a f108989y1;

    /* renamed from: z1 */
    public C40583d f108990z1;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView$a */
    public class C40580a extends RecyclerView.C16615g {
        public C40580a() {
        }

        /* renamed from: b */
        public void mo2556b() {
            MRecyclerView mRecyclerView = MRecyclerView.this;
            View view = mRecyclerView.f108988B1;
            if (view != null) {
                int i = mRecyclerView.mo63428A1() ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView$b */
    public class C40581b implements C53568b {
        public C40581b() {
        }

        /* renamed from: a */
        public void mo63442a(View view, int i, long j) {
            MRecyclerView mRecyclerView = MRecyclerView.this;
            C40583d dVar = mRecyclerView.f108990z1;
            if (dVar != null) {
                dVar.mo23073a(mRecyclerView, view, i, j);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView$c */
    public class C40582c implements C53569c {
        public C40582c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView$d */
    public interface C40583d {
        /* renamed from: a */
        void mo23073a(RecyclerView recyclerView, View view, int i, long j);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView$e */
    public interface C40584e {
        /* renamed from: a */
        boolean mo23457a(RecyclerView recyclerView, View view, int i, long j);
    }

    public MRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo23020y1();
    }

    /* renamed from: y1 */
    private void mo23020y1() {
        C53561a aVar = new C53561a();
        this.f108989y1 = aVar;
        if (!(this instanceof BizTimeLineHotListView)) {
            aVar.setHasStableIds(true);
        }
        super.setAdapter(this.f108989y1);
        this.f108989y1.registerAdapterDataObserver(new C40580a());
    }

    /* renamed from: A1 */
    public boolean mo63428A1() {
        return this.f108989y1.getItemCount() == 0;
    }

    public void addFooterView(View view) {
        C53561a aVar = this.f108989y1;
        ((LinkedList) aVar.f150541h).add(view);
        aVar.notifyItemRangeChanged(aVar.getItemCount() - 1, 1);
    }

    public void addHeaderView(View view) {
        C53561a aVar = this.f108989y1;
        ((LinkedList) aVar.f150540g).add(view);
        aVar.notifyItemRangeChanged(0, 1);
    }

    public RecyclerView.C16613e<?> getAdapter() {
        return this.f108989y1;
    }

    public View getEmptyView() {
        return this.f108988B1;
    }

    /* renamed from: r1 */
    public void mo17115r1(int i) {
        super.mo17115r1(i);
    }

    public void setAdapter(RecyclerView.C16613e eVar) {
        C53561a aVar = this.f108989y1;
        RecyclerView.C16613e eVar2 = aVar.f150537d;
        if (eVar2 != null) {
            if (!eVar2.equals(eVar)) {
                aVar.f150537d.unregisterAdapterDataObserver(aVar.f150544n);
            } else {
                return;
            }
        }
        aVar.f150537d = eVar;
        if (eVar != null) {
            eVar.registerAdapterDataObserver(aVar.f150544n);
        }
    }

    public void setEmptyView(View view) {
        if (this.f108988B1 != view) {
            this.f108988B1 = view;
            if (view != null) {
                int i = mo63428A1() ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView", "setEmptyView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView", "setEmptyView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public void setOnItemClickListener(C40583d dVar) {
        this.f108990z1 = dVar;
        this.f108989y1.f150542i = new C40581b();
    }

    public void setOnItemLongClickListener(C40584e eVar) {
        this.f108987A1 = eVar;
        this.f108989y1.f150543j = new C40582c();
    }

    /* renamed from: x1 */
    public int mo63440x1(RecyclerView.C16631z zVar) {
        C53561a aVar = this.f108989y1;
        if (aVar == null) {
            return -1;
        }
        aVar.getClass();
        if (zVar == null || zVar.mo17363j() == -1) {
            return -1;
        }
        return zVar.mo17363j() - (aVar.f150540g.isEmpty() ^ true ? 1 : 0);
    }

    /* renamed from: z1 */
    public void mo63441z1(View view) {
        C53561a aVar = this.f108989y1;
        ((LinkedList) aVar.f150541h).remove(view);
        aVar.notifyItemRangeChanged(aVar.getItemCount() - 1, 1);
    }

    public MRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo23020y1();
    }

    public MRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        mo23020y1();
    }
}
