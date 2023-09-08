package com.tencent.p014mm.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.C54240f0;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u000245B\u001b\b\u0016\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010%\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00066"}, mo182094d2 = {"Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$e;", "adapter", "Lrx3/b0;", "setAdapter", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager$a;", "y1", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager$a;", "getPageChangeListener", "()Lcom/tencent/mm/view/RecyclerHorizontalViewPager$a;", "setPageChangeListener", "(Lcom/tencent/mm/view/RecyclerHorizontalViewPager$a;)V", "pageChangeListener", "Landroidx/recyclerview/widget/f0;", "z1", "Landroidx/recyclerview/widget/f0;", "getSnapHelper", "()Landroidx/recyclerview/widget/f0;", "setSnapHelper", "(Landroidx/recyclerview/widget/f0;)V", "snapHelper", "", "A1", "Z", "getFrozeTouch", "()Z", "setFrozeTouch", "(Z)V", "frozeTouch", "B1", "getCanMakeCancelAsUp", "setCanMakeCancelAsUp", "canMakeCancelAsUp", "C1", "getDisallowInterceptWhenHorizontalScroll", "setDisallowInterceptWhenHorizontalScroll", "disallowInterceptWhenHorizontalScroll", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager$b;", "D1", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager$b;", "getOnInterceptTouchEvent", "()Lcom/tencent/mm/view/RecyclerHorizontalViewPager$b;", "setOnInterceptTouchEvent", "(Lcom/tencent/mm/view/RecyclerHorizontalViewPager$b;)V", "onInterceptTouchEvent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.RecyclerHorizontalViewPager */
public class RecyclerHorizontalViewPager extends RecyclerView {

    /* renamed from: A1 */
    public boolean f165586A1;

    /* renamed from: B1 */
    public boolean f165587B1 = true;

    /* renamed from: C1 */
    public boolean f165588C1;

    /* renamed from: D1 */
    public C57876b f165589D1;

    /* renamed from: E1 */
    public float f165590E1;

    /* renamed from: y1 */
    public C57875a f165591y1;

    /* renamed from: z1 */
    public C54240f0 f165592z1;

    /* renamed from: com.tencent.mm.view.RecyclerHorizontalViewPager$a */
    public interface C57875a {
        /* renamed from: a */
        void mo23719a(int i, boolean z, boolean z2);
    }

    /* renamed from: com.tencent.mm.view.RecyclerHorizontalViewPager$b */
    public interface C57876b {
        /* renamed from: a */
        void mo37032a(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo37033b(int i, MotionEvent motionEvent, boolean z);
    }

    /* renamed from: com.tencent.mm.view.RecyclerHorizontalViewPager$c */
    public static final class C57877c extends RecyclerView.C0130p {

        /* renamed from: d */
        public int f165593d = -1;

        /* renamed from: e */
        public final Rect f165594e = new Rect();

        /* renamed from: f */
        public final Rect f165595f = new Rect();

        /* renamed from: g */
        public final /* synthetic */ RecyclerHorizontalViewPager f165596g;

        /* renamed from: com.tencent.mm.view.RecyclerHorizontalViewPager$c$a */
        public static final class C57878a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ RecyclerHorizontalViewPager f165597d;

            /* renamed from: e */
            public final /* synthetic */ int f165598e;

            public C57878a(RecyclerHorizontalViewPager recyclerHorizontalViewPager, int i) {
                this.f165597d = recyclerHorizontalViewPager;
                this.f165598e = i;
            }

            public final void run() {
                this.f165597d.mo4595x1(this.f165598e, true, true);
            }
        }

        public C57877c(RecyclerHorizontalViewPager recyclerHorizontalViewPager) {
            this.f165596g = recyclerHorizontalViewPager;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            RecyclerView.LayoutManager layoutManager = this.f165596g.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int C = ((LinearLayoutManager) layoutManager).mo16957C();
            RecyclerView.LayoutManager layoutManager2 = this.f165596g.getLayoutManager();
            C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int E = ((LinearLayoutManager) layoutManager2).mo16959E();
            RecyclerView.C16631z I0 = recyclerView.mo17023I0(C);
            View view = null;
            View view2 = I0 != null ? I0.f44854d : null;
            RecyclerView.C16631z I02 = recyclerView.mo17023I0(E);
            if (I02 != null) {
                view = I02.f44854d;
            }
            if (view2 != null) {
                view2.getLocalVisibleRect(this.f165594e);
            }
            if (view != null) {
                view.getLocalVisibleRect(this.f165595f);
            }
            if (this.f165594e.width() <= this.f165595f.width()) {
                C = E;
            }
            if (!(C == this.f165593d || C == -1)) {
                RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f165596g;
                recyclerHorizontalViewPager.post(new C57878a(recyclerHorizontalViewPager, C));
                this.f165593d = C;
            }
            C117292a.m165361g(this, "com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerHorizontalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 3 && this.f165587B1) {
            return super.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
        if (motionEvent.getAction() == 0 && this.f165588C1) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        C57876b bVar = this.f165589D1;
        if (bVar != null) {
            bVar.mo37032a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getCanMakeCancelAsUp() {
        return this.f165587B1;
    }

    public final boolean getDisallowInterceptWhenHorizontalScroll() {
        return this.f165588C1;
    }

    public final boolean getFrozeTouch() {
        return this.f165586A1;
    }

    public final C57876b getOnInterceptTouchEvent() {
        return this.f165589D1;
    }

    public final C57875a getPageChangeListener() {
        return this.f165591y1;
    }

    public final C54240f0 getSnapHelper() {
        return this.f165592z1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (this.f165586A1) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        C57876b bVar = this.f165589D1;
        if (bVar != null) {
            if (motionEvent.getAction() == 0) {
                this.f165590E1 = motionEvent.getX();
            }
            onInterceptTouchEvent = bVar.mo37033b(-((int) (motionEvent.getX(0) - this.f165590E1)), motionEvent, onInterceptTouchEvent);
            if (!onInterceptTouchEvent) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                onTouchEvent(obtain);
            }
        }
        return onInterceptTouchEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f165586A1) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdapter(RecyclerView.C16613e<?> eVar) {
        if (this.f165592z1 == null) {
            this.f165592z1 = new C54259z();
        }
        C54240f0 f0Var = this.f165592z1;
        if (f0Var != null) {
            f0Var.mo75025b(this);
        }
        super.setAdapter(eVar);
        mo17043c(new C57877c(this));
    }

    public final void setCanMakeCancelAsUp(boolean z) {
        this.f165587B1 = z;
    }

    public final void setDisallowInterceptWhenHorizontalScroll(boolean z) {
        this.f165588C1 = z;
    }

    public final void setFrozeTouch(boolean z) {
        this.f165586A1 = z;
    }

    public final void setOnInterceptTouchEvent(C57876b bVar) {
        this.f165589D1 = bVar;
    }

    public final void setPageChangeListener(C57875a aVar) {
        this.f165591y1 = aVar;
    }

    public final void setSnapHelper(C54240f0 f0Var) {
        this.f165592z1 = f0Var;
    }

    /* renamed from: x1 */
    public void mo4595x1(int i, boolean z, boolean z2) {
        C57875a aVar = this.f165591y1;
        if (aVar != null) {
            aVar.mo23719a(i, z, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerHorizontalViewPager(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
    }
}
