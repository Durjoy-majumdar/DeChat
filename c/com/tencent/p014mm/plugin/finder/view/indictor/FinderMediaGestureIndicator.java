package com.tencent.p014mm.plugin.finder.view.indictor;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.C54257t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import zp3.C23571u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003&'(B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator;", "Landroidx/recyclerview/widget/RecyclerView;", "Lzp3/u;", "", "isShow", "Lrx3/b0;", "setShowOnlyOneIndicator", "", "count", "setCount", "getCount", "index", "setCurrentIndex", "getCurrentIndex", "Landroid/view/View;", "getView", "Lzp3/u$a;", "listener", "setOnSelectedPageListener", "getOnSelectedPageListener", "Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$a;", "y1", "Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$a;", "getSliderAdapter", "()Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$a;", "sliderAdapter", "Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$SliderLayoutManager;", "z1", "Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$SliderLayoutManager;", "getSliderLayoutManager", "()Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$SliderLayoutManager;", "sliderLayoutManager", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "SliderLayoutManager", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator */
public final class FinderMediaGestureIndicator extends RecyclerView implements C23571u {

    /* renamed from: A1 */
    public C23571u.C23572a f111941A1;

    /* renamed from: B1 */
    public int f111942B1;

    /* renamed from: C1 */
    public int f111943C1;

    /* renamed from: y1 */
    public final C41588a f111944y1;

    /* renamed from: z1 */
    public final SliderLayoutManager f111945z1;

    /* renamed from: com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator$a */
    public static final class C41588a extends RecyclerView.C16613e<C41589b> {

        /* renamed from: d */
        public final ArrayList<Integer> f111946d = new ArrayList<>();

        /* renamed from: e */
        public int f111947e;

        public int getItemCount() {
            return this.f111946d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C41589b bVar = (C41589b) zVar;
            C87412m.m108594g(bVar, "holder");
            bVar.f44854d.setOnClickListener(new C41591a(this, bVar, i));
            if (this.f111947e == i) {
                ImageView imageView = bVar.f111948z;
                if (imageView != null) {
                    imageView.setBackgroundResource(C0966R.C0969drawable.aqj);
                    return;
                }
                return;
            }
            ImageView imageView2 = bVar.f111948z;
            if (imageView2 != null) {
                imageView2.setBackgroundResource(C0966R.C0969drawable.a8f);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b1o, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…le_layout, parent, false)");
            return new C41589b(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator$b */
    public static final class C41589b extends RecyclerView.C16631z {

        /* renamed from: z */
        public final ImageView f111948z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41589b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f111948z = (ImageView) view.findViewById(C0966R.C0970id.bd4);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$SliderLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator$SliderLayoutManager */
    public static final class SliderLayoutManager extends LinearLayoutManager {

        /* renamed from: v */
        public float f111949v = 50.0f;

        /* renamed from: w */
        public RecyclerView f111950w;

        /* renamed from: com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator$SliderLayoutManager$a */
        public static final class C41590a extends C54256s {

            /* renamed from: n */
            public final /* synthetic */ SliderLayoutManager f111951n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C41590a(SliderLayoutManager sliderLayoutManager, Context context) {
                super(context);
                this.f111951n = sliderLayoutManager;
            }

            /* renamed from: k */
            public float mo3227k(DisplayMetrics displayMetrics) {
                C87412m.m108594g(displayMetrics, "displayMetrics");
                return this.f111951n.f111949v / ((float) displayMetrics.densityDpi);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SliderLayoutManager(Context context) {
            super(context);
            C87412m.m108594g(context, "context");
            mo16974W(0);
        }

        /* renamed from: c0 */
        public final void mo64701c0() {
            float width = ((float) getWidth()) / 2.0f;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                C87412m.m108591d(childAt);
                float sqrt = ((float) 1) - (((float) Math.sqrt((double) (Math.abs(width - (((float) (getDecoratedLeft(childAt) + getDecoratedRight(childAt))) / 2.0f)) / ((float) getWidth())))) * 0.66f);
                childAt.setScaleX(sqrt);
                childAt.setScaleY(sqrt);
            }
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
            super.onAttachedToWindow(recyclerView);
            C87412m.m108591d(recyclerView);
            this.f111950w = recyclerView;
            C54257t tVar = new C54257t();
            RecyclerView recyclerView2 = this.f111950w;
            if (recyclerView2 != null) {
                tVar.mo75025b(recyclerView2);
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }

        public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
            C87412m.m108594g(wVar, "state");
            super.onLayoutChildren(rVar, wVar);
            mo64701c0();
        }

        public void onScrollStateChanged(int i) {
            super.onScrollStateChanged(i);
            if (i == 0) {
                RecyclerView recyclerView = this.f111950w;
                if (recyclerView != null) {
                    int right = recyclerView.getRight();
                    RecyclerView recyclerView2 = this.f111950w;
                    if (recyclerView2 != null) {
                        int left = (right - recyclerView2.getLeft()) / 2;
                        RecyclerView recyclerView3 = this.f111950w;
                        if (recyclerView3 != null) {
                            int left2 = left + recyclerView3.getLeft();
                            int i2 = Integer.MAX_VALUE;
                            int i3 = 0;
                            RecyclerView recyclerView4 = this.f111950w;
                            if (recyclerView4 != null) {
                                int childCount = recyclerView4.getChildCount();
                                while (i3 < childCount) {
                                    RecyclerView recyclerView5 = this.f111950w;
                                    if (recyclerView5 != null) {
                                        View childAt = recyclerView5.getChildAt(i3);
                                        int abs = Math.abs((getDecoratedLeft(childAt) + ((getDecoratedRight(childAt) - getDecoratedLeft(childAt)) / 2)) - left2);
                                        if (abs < i2) {
                                            RecyclerView recyclerView6 = this.f111950w;
                                            if (recyclerView6 != null) {
                                                recyclerView6.mo17030O0(childAt);
                                                i2 = abs;
                                            } else {
                                                C87412m.m108603p("recyclerView");
                                                throw null;
                                            }
                                        }
                                        i3++;
                                    } else {
                                        C87412m.m108603p("recyclerView");
                                        throw null;
                                    }
                                }
                                return;
                            }
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }

        public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
            if (this.f44675d != 0) {
                return 0;
            }
            int scrollHorizontallyBy = super.scrollHorizontallyBy(i, rVar, wVar);
            mo64701c0();
            return scrollHorizontallyBy;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C41590a aVar = new C41590a(this, recyclerView.getContext());
            aVar.f44872a = i;
            startSmoothScroll(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMediaGestureIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C41588a aVar = new C41588a();
        this.f111944y1 = aVar;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        SliderLayoutManager sliderLayoutManager = new SliderLayoutManager(context2);
        this.f111945z1 = sliderLayoutManager;
        setAdapter(aVar);
        setLayoutManager(sliderLayoutManager);
        setHasFixedSize(true);
        setClipToPadding(false);
    }

    public int getCount() {
        return this.f111942B1;
    }

    public int getCurrentIndex() {
        return this.f111943C1;
    }

    public C23571u.C23572a getOnSelectedPageListener() {
        return this.f111941A1;
    }

    public final C41588a getSliderAdapter() {
        return this.f111944y1;
    }

    public final SliderLayoutManager getSliderLayoutManager() {
        return this.f111945z1;
    }

    public View getView() {
        return this;
    }

    public void setCount(int i) {
        this.f111942B1 = i;
        setCurrentIndex(0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        C41588a aVar = this.f111944y1;
        aVar.getClass();
        aVar.f111946d.clear();
        aVar.f111946d.addAll(arrayList);
        aVar.notifyDataSetChanged();
    }

    public void setCurrentIndex(int i) {
        int i2 = this.f111943C1;
        this.f111944y1.notifyItemChanged(i2);
        this.f111943C1 = i;
        C41588a aVar = this.f111944y1;
        aVar.f111947e = i;
        aVar.notifyItemChanged(i);
        int i3 = i2 + (i - i2);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i3));
        C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator", "setCurrentIndex", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        mo17149t1(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(this, "com/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator", "setCurrentIndex", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
    }

    public void setOnSelectedPageListener(C23571u.C23572a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f111941A1 = aVar;
    }

    public void setShowOnlyOneIndicator(boolean z) {
    }
}
