package com.tencent.p014mm.plugin.finder.video.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import pr1.C100836a;
import pr1.C100837b;
import rh3.C101380d;
import rh3.C101383g;
import rx3.C13598b0;
import sh3.C101624e;
import sh3.C101630j;
import te3.C101814mn2;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002'(B!\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b$\u0010&R2\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006)"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/sticker/StickerEffectView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "Lte3/mn2;", "Lrx3/b0;", "B", "Lfy3/l;", "getSelectionCallback", "()Lfy3/l;", "setSelectionCallback", "(Lfy3/l;)V", "selectionCallback", "Lkotlin/Function0;", "C", "Lfy3/a;", "getLoadMoreCallback", "()Lfy3/a;", "setLoadMoreCallback", "(Lfy3/a;)V", "loadMoreCallback", "Lpr1/a;", "moreDiffCallback", "Lpr1/a;", "getMoreDiffCallback", "()Lpr1/a;", "setMoreDiffCallback", "(Lpr1/a;)V", "historyDiffCallback", "getHistoryDiffCallback", "setHistoryDiffCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "c", "d", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.sticker.StickerEffectView */
public final class StickerEffectView extends ConstraintLayout {

    /* renamed from: A */
    public final C32227p<Integer, C101380d, C13598b0> f270664A;

    /* renamed from: B */
    public C32226l<? super C101814mn2, C13598b0> f270665B;

    /* renamed from: C */
    public C32224a<C13598b0> f270666C;

    /* renamed from: v */
    public final String f270667v;

    /* renamed from: w */
    public final C93781d f270668w;

    /* renamed from: x */
    public String f270669x;

    /* renamed from: y */
    public C101814mn2 f270670y;

    /* renamed from: z */
    public final C65231j<C101630j> f270671z;

    /* renamed from: com.tencent.mm.plugin.finder.video.sticker.StickerEffectView$a */
    public static final class C93777a extends C87413o implements C32227p<Integer, C101380d, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StickerEffectView f270672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93777a(StickerEffectView stickerEffectView) {
            super(2);
            this.f270672d = stickerEffectView;
        }

        public Object invoke(Object obj, Object obj2) {
            C100837b bVar;
            C100837b bVar2;
            ((Number) obj).intValue();
            C101380d dVar = (C101380d) obj2;
            C65234n nVar = C65234n.OK;
            C87412m.m108594g(dVar, "lensItem");
            StickerEffectView stickerEffectView = this.f270672d;
            C101814mn2 mn22 = dVar.f296960a;
            stickerEffectView.f270670y = mn22;
            stickerEffectView.f270669x = mn22.f298862d;
            Iterator<C93779c> it = stickerEffectView.f270668w.f270679d.iterator();
            while (it.hasNext()) {
                C93779c next = it.next();
                if (!(next == null || (bVar2 = next.f270676c) == null)) {
                    String str = stickerEffectView.f270669x;
                    if (!C87412m.m108589b(bVar2.f295348f, str)) {
                        bVar2.f295348f = str;
                        Iterator<C101380d> it4 = bVar2.f295346d.iterator();
                        int i = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i = -1;
                                break;
                            } else if (C87412m.m108589b(it4.next().f296960a.f298862d, str)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        int i2 = bVar2.f295347e;
                        if (i2 != i) {
                            bVar2.f295349g = false;
                            bVar2.notifyItemChanged(i2);
                            bVar2.f295347e = i;
                            bVar2.notifyItemChanged(i);
                        }
                    }
                }
            }
            C65234n c = this.f270672d.f270669x == null ? nVar : C101624e.f297484a.mo141086c(dVar.f296960a);
            if (c == nVar) {
                StickerEffectView.m118460r(this.f270672d, c);
            } else {
                StickerEffectView stickerEffectView2 = this.f270672d;
                Iterator<C93779c> it5 = stickerEffectView2.f270668w.f270679d.iterator();
                while (it5.hasNext()) {
                    C93779c next2 = it5.next();
                    if (!(next2 == null || (bVar = next2.f270676c) == null)) {
                        if (C87412m.m108589b(bVar.f295348f, stickerEffectView2.f270669x) && !bVar.f295349g) {
                            bVar.f295349g = true;
                            bVar.notifyItemChanged(bVar.f295347e);
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.sticker.StickerEffectView$b */
    public static final class C93778b implements C65231j<C101630j> {

        /* renamed from: a */
        public final /* synthetic */ StickerEffectView f270673a;

        public C93778b(StickerEffectView stickerEffectView) {
            this.f270673a = stickerEffectView;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C100837b bVar;
            C101630j jVar = (C101630j) dVar;
            C87412m.m108594g(jVar, "task");
            C87412m.m108594g(nVar, "status");
            if (C87412m.m108589b(this.f270673a.f270669x, jVar.f297495f.f284101e)) {
                String str = this.f270673a.f270667v;
                Log.m105924i(str, "onLoaderFin: " + this.f270673a.f270669x + ", " + nVar);
                StickerEffectView.m118460r(this.f270673a, nVar);
                StickerEffectView stickerEffectView = this.f270673a;
                Iterator<C93779c> it = stickerEffectView.f270668w.f270679d.iterator();
                while (it.hasNext()) {
                    C93779c next = it.next();
                    if (!(next == null || (bVar = next.f270676c) == null)) {
                        if (C87412m.m108589b(bVar.f295348f, stickerEffectView.f270669x) && bVar.f295349g) {
                            bVar.f295349g = false;
                            bVar.notifyItemChanged(bVar.f295347e);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.sticker.StickerEffectView$c */
    public final class C93779c {

        /* renamed from: a */
        public final View f270674a;

        /* renamed from: b */
        public final RecyclerView f270675b;

        /* renamed from: c */
        public final C100837b f270676c;

        /* renamed from: com.tencent.mm.plugin.finder.video.sticker.StickerEffectView$c$a */
        public static final class C93780a extends C87413o implements C32226l<Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C93779c f270677d;

            /* renamed from: e */
            public final /* synthetic */ StickerEffectView f270678e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C93780a(C93779c cVar, StickerEffectView stickerEffectView) {
                super(1);
                this.f270677d = cVar;
                this.f270678e = stickerEffectView;
            }

            public Object invoke(Object obj) {
                C32224a<C13598b0> loadMoreCallback;
                if (((Number) obj).intValue() >= this.f270677d.f270676c.getItemCount() - 4 && (loadMoreCallback = this.f270678e.getLoadMoreCallback()) != null) {
                    loadMoreCallback.invoke();
                }
                return C13598b0.f38549a;
            }
        }

        public C93779c(StickerEffectView stickerEffectView, View view, boolean z) {
            C87412m.m108594g(view, "itemView");
            this.f270674a = view;
            View findViewById = view.findViewById(C0966R.C0970id.cdl);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.….effect_sticker_recycler)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.f270675b = recyclerView;
            C100837b bVar = new C100837b();
            this.f270676c = bVar;
            bVar.f295350h = stickerEffectView.f270664A;
            if (z) {
                bVar.f295351i = new C93780a(this, stickerEffectView);
            }
            recyclerView.setAdapter(bVar);
            recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 5));
            recyclerView.setItemAnimator((RecyclerView.C16616j) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.sticker.StickerEffectView$d */
    public final class C93781d extends C103853a {

        /* renamed from: d */
        public final ArrayList<C93779c> f270679d;

        public C93781d() {
            ArrayList<C93779c> arrayList = new ArrayList<>(2);
            this.f270679d = arrayList;
            arrayList.add((Object) null);
            arrayList.add((Object) null);
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            C87412m.m108594g(viewGroup, "container");
            C87412m.m108594g(obj, "obj");
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return 2;
        }

        public CharSequence getPageTitle(int i) {
            return i == 0 ? StickerEffectView.this.getContext().getString(C0966R.string.hur) : StickerEffectView.this.getContext().getString(C0966R.string.hus);
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "container");
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a_e, viewGroup, false);
            StickerEffectView stickerEffectView = StickerEffectView.this;
            C87412m.m108593f(inflate, "itemView");
            C93779c cVar = new C93779c(stickerEffectView, inflate, z);
            if (z) {
                StickerEffectView.this.getMoreDiffCallback();
            } else {
                StickerEffectView.this.getHistoryDiffCallback();
            }
            this.f270679d.set(i, cVar);
            viewGroup.addView(cVar.f270675b);
            return cVar.f270675b;
        }

        public boolean isViewFromObject(View view, Object obj) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(obj, "obj");
            return C87412m.m108589b(view, obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f270667v = "MicroMsg.StickerEffectView";
        View.inflate(context, C0966R.C0971layout.a_d, this);
        setBackgroundResource(C0966R.C0969drawable.f5106x0);
        View findViewById = findViewById(C0966R.C0970id.cdm);
        C87412m.m108593f(findViewById, "findViewById(R.id.effect_sticker_tab)");
        View findViewById2 = findViewById(C0966R.C0970id.cdn);
        C87412m.m108593f(findViewById2, "findViewById(R.id.effect_sticker_view_pager)");
        ViewPager viewPager = (ViewPager) findViewById2;
        ((TabLayout) findViewById).setupWithViewPager(viewPager);
        C93781d dVar = new C93781d();
        this.f270668w = dVar;
        viewPager.setAdapter(dVar);
        viewPager.setCurrentItem(1);
        this.f270664A = new C93777a(this);
        C93778b bVar = new C93778b(this);
        this.f270671z = bVar;
        C101624e.f297484a.mo141088e(bVar);
    }

    /* renamed from: r */
    public static final void m118460r(StickerEffectView stickerEffectView, C65234n nVar) {
        String str = stickerEffectView.f270669x;
        if (str == null || nVar != C65234n.OK) {
            C32226l<? super C101814mn2, C13598b0> lVar = stickerEffectView.f270665B;
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        String b = C101624e.f297484a.mo141085b(str);
        C87412m.m108594g(b, "packDir");
        C101383g gVar = new C101383g();
        gVar.f296978c = b;
        gVar.mo140865b(b);
        if (gVar.mo140864a()) {
            if (Util.isNullOrNil(gVar.f296976a)) {
                String str2 = stickerEffectView.f270669x;
                C87412m.m108591d(str2);
                gVar.f296976a = str2;
            }
            C32226l<? super C101814mn2, C13598b0> lVar2 = stickerEffectView.f270665B;
            if (lVar2 != null) {
                lVar2.invoke(stickerEffectView.f270670y);
                return;
            }
            return;
        }
        Log.m105924i(stickerEffectView.f270667v, "onLoaderFin: sticker is not valid");
        C86013q1.m106445f(b);
    }

    public final C100836a getHistoryDiffCallback() {
        return null;
    }

    public final C32224a<C13598b0> getLoadMoreCallback() {
        return this.f270666C;
    }

    public final C100836a getMoreDiffCallback() {
        return null;
    }

    public final C32226l<C101814mn2, C13598b0> getSelectionCallback() {
        return this.f270665B;
    }

    public final void setHistoryDiffCallback(C100836a aVar) {
    }

    public final void setLoadMoreCallback(C32224a<C13598b0> aVar) {
        this.f270666C = aVar;
    }

    public final void setMoreDiffCallback(C100836a aVar) {
    }

    public final void setSelectionCallback(C32226l<? super C101814mn2, C13598b0> lVar) {
        this.f270665B = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickerEffectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
