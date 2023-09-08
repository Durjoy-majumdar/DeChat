package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.story.p108ui.layout.GalleryLayoutManager;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gw2.C98266k;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import lw2.C99703l;
import lw2.C99704m;
import ow2.C100615y;
import ow2.C11777d;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001.B!\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010*\u001a\u00020\r¢\u0006\u0004\b+\u0010,B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b+\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR@\u0010\u0015\u001a \u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R6\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006/"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "enabled", "Lrx3/b0;", "setScrollEnable", "Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "y1", "Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "getLayoutManager", "()Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "layoutManager", "Lkotlin/Function3;", "", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView;", "B1", "Lfy3/q;", "getOnRowSelected", "()Lfy3/q;", "setOnRowSelected", "(Lfy3/q;)V", "onRowSelected", "Lkotlin/Function2;", "", "C1", "Lfy3/p;", "getOnScrollCallback", "()Lfy3/p;", "setOnScrollCallback", "(Lfy3/p;)V", "onScrollCallback", "value", "D1", "Z", "isActive", "()Z", "setActive", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "c", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView */
public final class GalleryRecyclerView extends RecyclerView {

    /* renamed from: A1 */
    public int f282007A1;

    /* renamed from: B1 */
    public C32228q<? super Integer, ? super RecyclerView, ? super GalleryHorizontalControlView, C13598b0> f282008B1;

    /* renamed from: C1 */
    public C32227p<? super Integer, ? super Float, C13598b0> f282009C1;

    /* renamed from: D1 */
    public boolean f282010D1;

    /* renamed from: y1 */
    public final GalleryLayoutManager f282011y1;

    /* renamed from: z1 */
    public RecyclerView f282012z1;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView$a */
    public static final class C96410a extends C87413o implements C32227p<Integer, View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ GalleryRecyclerView f282013d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96410a(GalleryRecyclerView galleryRecyclerView) {
            super(2);
            this.f282013d = galleryRecyclerView;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            View view = (View) obj2;
            C87412m.m108594g(view, "child");
            GalleryRecyclerView galleryRecyclerView = this.f282013d;
            galleryRecyclerView.getClass();
            int i = galleryRecyclerView.f282007A1;
            galleryRecyclerView.f282007A1 = intValue;
            RecyclerView recyclerView = galleryRecyclerView.f282012z1;
            C100615y yVar = (C100615y) galleryRecyclerView.mo17031P0(view);
            RecyclerView.LayoutManager layoutManager = null;
            galleryRecyclerView.f282012z1 = yVar != null ? yVar.f294794z : null;
            C32228q<? super Integer, ? super RecyclerView, ? super GalleryHorizontalControlView, C13598b0> qVar = galleryRecyclerView.f282008B1;
            if (qVar != null) {
                qVar.invoke(Integer.valueOf(intValue), galleryRecyclerView.f282012z1, yVar != null ? yVar.f294793B : null);
            }
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            }
            GalleryLayoutManager galleryLayoutManager = (GalleryLayoutManager) layoutManager;
            if (galleryRecyclerView.getAdapter() instanceof C96412c) {
                RecyclerView.C16613e adapter = galleryRecyclerView.getAdapter();
                C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView.VerticalAdapter");
                C96412c cVar = (C96412c) adapter;
                int i2 = galleryLayoutManager != null ? galleryLayoutManager.f54349x : 0;
                cVar.f282017f = i;
                cVar.f282018g = i2;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView$b */
    public static final class C96411b extends C87413o implements C32227p<Integer, Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ GalleryRecyclerView f282014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96411b(GalleryRecyclerView galleryRecyclerView) {
            super(2);
            this.f282014d = galleryRecyclerView;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            float floatValue = ((Number) obj2).floatValue();
            C32227p<Integer, Float, C13598b0> onScrollCallback = this.f282014d.getOnScrollCallback();
            if (onScrollCallback != null) {
                onScrollCallback.invoke(Integer.valueOf(intValue), Float.valueOf(floatValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView$c */
    public final class C96412c extends RecyclerView.C16613e<C100615y> {

        /* renamed from: d */
        public final ArrayList<ArrayList<C98266k>> f282015d = new ArrayList<>();

        /* renamed from: e */
        public C32226l<? super Integer, C13598b0> f282016e;

        /* renamed from: f */
        public int f282017f = -1;

        /* renamed from: g */
        public int f282018g;

        /* renamed from: h */
        public final RecyclerView.C16623q f282019h;

        public C96412c() {
            RecyclerView.C16623q qVar = new RecyclerView.C16623q();
            this.f282019h = qVar;
            qVar.mo17336e(0, 2);
        }

        public int getItemCount() {
            return this.f282015d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C100615y yVar = (C100615y) zVar;
            C87412m.m108594g(yVar, "holder");
            C99703l lVar = yVar.f294792A;
            ArrayList<C98266k> arrayList = this.f282015d.get(i);
            C87412m.m108593f(arrayList, "galleryItems[position]");
            lVar.getClass();
            lVar.f292220f.clear();
            lVar.f292220f.addAll(arrayList);
            C99703l lVar2 = yVar.f294792A;
            lVar2.f292221g = GalleryRecyclerView.this.f282010D1;
            lVar2.notifyDataSetChanged();
            GalleryHorizontalControlView galleryHorizontalControlView = yVar.f294793B;
            ArrayList<C98266k> arrayList2 = this.f282015d.get(i);
            C87412m.m108593f(arrayList2, "galleryItems[position]");
            galleryHorizontalControlView.mo6520a(arrayList2);
            C32226l<? super Integer, C13598b0> lVar3 = this.f282016e;
            if (lVar3 != null) {
                lVar3.invoke(Integer.valueOf(i));
            }
            int i2 = i == this.f282017f ? this.f282018g : 0;
            RecyclerView recyclerView = yVar.f294794z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView$VerticalAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/VerticalViewHolder;I)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView$VerticalAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/VerticalViewHolder;I)V", "Undefined", "scrollToPosition", "(I)V");
            yVar.f294793B.setSelection(i2);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c6u, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            layoutParams.width = viewGroup.getWidth();
            layoutParams.height = viewGroup.getHeight();
            inflate.setLayoutParams(layoutParams);
            C100615y yVar = new C100615y(inflate, viewGroup.getWidth(), viewGroup.getHeight());
            yVar.f294794z.setRecycledViewPool(this.f282019h);
            return yVar;
        }

        public void onViewAttachedToWindow(RecyclerView.C16631z zVar) {
            C100615y yVar = (C100615y) zVar;
            C87412m.m108594g(yVar, "holder");
            super.onViewAttachedToWindow(yVar);
            if (yVar.f294794z.getChildCount() > 0) {
                RecyclerView.C16631z P0 = yVar.f294794z.mo17031P0(yVar.f294794z.getChildAt(0));
                if (P0 instanceof C99704m) {
                    ((C99704m) P0).mo139067y();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        GalleryLayoutManager galleryLayoutManager = new GalleryLayoutManager(context, 1);
        this.f282011y1 = galleryLayoutManager;
        setLayoutManager(galleryLayoutManager);
        galleryLayoutManager.f54350y = new C96410a(this);
        galleryLayoutManager.f54351z = new C96411b(this);
        mo17085h0(new C11777d(1));
        setItemAnimator((RecyclerView.C16616j) null);
        setItemViewCacheSize(0);
    }

    public final GalleryLayoutManager getLayoutManager() {
        return this.f282011y1;
    }

    public final C32228q<Integer, RecyclerView, GalleryHorizontalControlView, C13598b0> getOnRowSelected() {
        return this.f282008B1;
    }

    public final C32227p<Integer, Float, C13598b0> getOnScrollCallback() {
        return this.f282009C1;
    }

    public final void setActive(boolean z) {
        this.f282010D1 = z;
        RecyclerView recyclerView = this.f282012z1;
        RecyclerView.C16613e eVar = null;
        if ((recyclerView != null ? recyclerView.getAdapter() : null) instanceof C99703l) {
            RecyclerView recyclerView2 = this.f282012z1;
            if (recyclerView2 != null) {
                eVar = recyclerView2.getAdapter();
            }
            C87412m.m108592e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.adapter.StoryGalleryAdapter");
            ((C99703l) eVar).f292221g = z;
        }
    }

    public final void setOnRowSelected(C32228q<? super Integer, ? super RecyclerView, ? super GalleryHorizontalControlView, C13598b0> qVar) {
        this.f282008B1 = qVar;
    }

    public final void setOnScrollCallback(C32227p<? super Integer, ? super Float, C13598b0> pVar) {
        this.f282009C1 = pVar;
    }

    public final void setScrollEnable(boolean z) {
        this.f282011y1.f54346A = z;
        RecyclerView recyclerView = this.f282012z1;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof GalleryLayoutManager) {
            ((GalleryLayoutManager) layoutManager).f54346A = z;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
