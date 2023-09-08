package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import al1.C54130j;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54795n5;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget;
import com.tencent.p014mm.plugin.finder.live.view.C56081l;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveApplyLinkView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveLayoutManager;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveTextIndicator;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import hi1.C59912d;
import il1.C46276z4;
import il1.C60342a5;
import il1.C60541x4;
import il1.C60553y4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import qk1.C63211f0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64175a0;
import te3.C49712hj1;

/* renamed from: qj1.w1 */
public final class C63068w1 extends C62660c {

    /* renamed from: A */
    public boolean f178977A;

    /* renamed from: B */
    public boolean f178978B;

    /* renamed from: C */
    public boolean f178979C;

    /* renamed from: D */
    public C56081l f178980D;

    /* renamed from: E */
    public final C13601g f178981E;

    /* renamed from: F */
    public final C59912d f178982F;

    /* renamed from: G */
    public final C63211f0 f178983G;

    /* renamed from: H */
    public final ArrayList<FinderLiveApplyLinkView> f178984H;

    /* renamed from: I */
    public int f178985I;

    /* renamed from: J */
    public boolean f178986J;

    /* renamed from: p */
    public final C58124b f178987p;

    /* renamed from: q */
    public final String f178988q = "Finder.FinderLiveAnchorLinkListPlugin";

    /* renamed from: r */
    public final RecyclerView f178989r;

    /* renamed from: s */
    public final FinderLiveTextIndicator f178990s;

    /* renamed from: t */
    public final LiveBottomSheetPanel f178991t;

    /* renamed from: u */
    public final View f178992u;

    /* renamed from: v */
    public final View f178993v;

    /* renamed from: w */
    public final View f178994w;

    /* renamed from: x */
    public final View f178995x;

    /* renamed from: y */
    public final View f178996y;

    /* renamed from: z */
    public final C60541x4 f178997z;

    /* renamed from: qj1.w1$a */
    public static final class C63069a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63068w1 f178998d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63069a(C63068w1 w1Var) {
            super(1);
            this.f178998d = w1Var;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                C58124b.C7172a.m7372a(this.f178998d.f178987p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HIDE_APPLY_LIST, (Bundle) null, 2, (Object) null);
                Iterator<FinderLiveApplyLinkView> it = this.f178998d.f178983G.f179372f.iterator();
                while (it.hasNext()) {
                    it.next().mo77790f();
                }
                this.f178998d.f178997z.mo85507b();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.w1$b */
    public static final class C63070b extends C87413o implements C32228q<Integer, View, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63068w1 f178999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63070b(C63068w1 w1Var) {
            super(3);
            this.f178999d = w1Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            ((Boolean) obj3).booleanValue();
            C87412m.m108594g((View) obj2, "child");
            this.f178999d.f178985I = intValue;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.w1$c */
    public static final class C63071c extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C63068w1 f179000d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f179001e;

        /* renamed from: qj1.w1$c$a */
        public static final class C63072a extends C87413o implements C32226l<C54130j, Boolean> {

            /* renamed from: d */
            public static final C63072a f179002d = new C63072a();

            public C63072a() {
                super(1);
            }

            public Object invoke(Object obj) {
                return Boolean.valueOf(!((C54130j) obj).f152004h);
            }
        }

        /* renamed from: qj1.w1$c$b */
        public static final class C63073b extends C87413o implements C32226l<C54130j, Boolean> {

            /* renamed from: d */
            public static final C63073b f179003d = new C63073b();

            public C63073b() {
                super(1);
            }

            public Object invoke(Object obj) {
                return Boolean.valueOf(((C54130j) obj).f152004h);
            }
        }

        public C63071c(C63068w1 w1Var, ViewGroup viewGroup) {
            this.f179000d = w1Var;
            this.f179001e = viewGroup;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            boolean z;
            RecyclerView recyclerView2 = recyclerView;
            Class cls = C54108o.class;
            Class cls2 = C54963d0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView2);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView2, "recyclerView");
            if (i == 0) {
                C63068w1 w1Var = this.f179000d;
                Iterator<T> it = w1Var.f178984H.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    ((FinderLiveApplyLinkView) it.next()).mo77789a(w1Var.f178985I);
                    if (w1Var.f178985I == 0) {
                        View view = w1Var.f178995x;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "checkMoreActionShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "checkMoreActionShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (C62042e.f176370a.mo87106p0().getBoolean("LINK_LINK_MORE_ACTION_RED_DOT_KEY", true)) {
                            View view3 = w1Var.f178996y;
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(0);
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "checkMoreActionShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "checkMoreActionShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            View view5 = w1Var.f178996y;
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(8);
                            View view6 = view5;
                            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "checkMoreActionShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "checkMoreActionShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        View view7 = w1Var.f178995x;
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "checkMoreActionShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "checkMoreActionShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view9 = w1Var.f178996y;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(8);
                        View view10 = view9;
                        C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "checkMoreActionShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "checkMoreActionShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                C63068w1 w1Var2 = this.f179000d;
                int i2 = w1Var2.f178985I;
                if (i2 == 0) {
                    List<C54130j> list = ((C54963d0) w1Var2.mo87696x0(cls2)).f154072o;
                    C87412m.m108593f(list, "business(LiveLinkMicSlic….java).newLinkMicUserList");
                    C64175a0.m75512t(list, C63072a.f179002d);
                    C63068w1 w1Var3 = this.f179000d;
                    FinderLiveTextIndicator finderLiveTextIndicator = w1Var3.f178990s;
                    if (((C54963d0) w1Var3.mo87696x0(cls2)).mo75908O3() > 0) {
                        z = true;
                    }
                    finderLiveTextIndicator.mo77979a(z);
                    ((C54108o) C86312j.m106911c(cls)).Xx0(C54067f0.C54087y.ENTER_VISITOR_LINKMIC_TAB, "", -1, -1);
                } else if (i2 == 1) {
                    List<C54130j> list2 = ((C54963d0) w1Var2.mo87696x0(cls2)).f154072o;
                    C87412m.m108593f(list2, "business(LiveLinkMicSlic….java).newLinkMicUserList");
                    C64175a0.m75512t(list2, C63073b.f179003d);
                    C63068w1 w1Var4 = this.f179000d;
                    FinderLiveTextIndicator finderLiveTextIndicator2 = w1Var4.f178990s;
                    if (((C54963d0) w1Var4.mo87696x0(cls2)).mo75909P3() > 0) {
                        z = true;
                    }
                    finderLiveTextIndicator2.mo77980b(z);
                    ((C54108o) C86312j.m106911c(cls)).Xx0(C54067f0.C54087y.ENTER_ANCHOR_LINKMIC_TAB, "", -1, -1);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            int i4;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            FinderLiveTextIndicator finderLiveTextIndicator = this.f179000d.f178990s;
            int i5 = C75044y4.m89990b(this.f179001e.getContext()).x;
            finderLiveTextIndicator.getClass();
            float f = (float) i5;
            float abs = (((float) Math.abs(i)) / f) * 0.3f;
            float f2 = 0.5f;
            float f3 = 0.8f;
            if (i > 0) {
                TextView textView = finderLiveTextIndicator.f159825d;
                float alpha = textView.getAlpha() - abs;
                if (alpha >= 0.5f) {
                    f2 = alpha;
                }
                textView.setAlpha(f2);
                TextView textView2 = finderLiveTextIndicator.f159826e;
                float alpha2 = textView2.getAlpha() + abs;
                if (alpha2 <= 0.8f) {
                    f3 = alpha2;
                }
                textView2.setAlpha(f3);
            } else {
                TextView textView3 = finderLiveTextIndicator.f159825d;
                float alpha3 = textView3.getAlpha() + abs;
                if (alpha3 <= 0.8f) {
                    f3 = alpha3;
                }
                textView3.setAlpha(f3);
                TextView textView4 = finderLiveTextIndicator.f159826e;
                float alpha4 = textView4.getAlpha() - abs;
                if (alpha4 >= 0.5f) {
                    f2 = alpha4;
                }
                textView4.setAlpha(f2);
            }
            ViewGroup.LayoutParams layoutParams = finderLiveTextIndicator.f159830i.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            float marginStart = (float) (((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() + finderLiveTextIndicator.f159825d.getMeasuredWidth() + finderLiveTextIndicator.f159827f.getMeasuredWidth());
            float abs2 = (((float) Math.abs(i)) / f) * marginStart;
            if (i > 0) {
                View view = finderLiveTextIndicator.f159831j;
                float translationX = view.getTranslationX() + abs2;
                if (translationX <= marginStart) {
                    marginStart = translationX;
                }
                view.setTranslationX(marginStart);
            } else {
                View view2 = finderLiveTextIndicator.f159831j;
                float translationX2 = view2.getTranslationX() - abs2;
                if (translationX2 < 0.0f) {
                    translationX2 = 0.0f;
                }
                view2.setTranslationX(translationX2);
            }
            int abs3 = Math.abs(finderLiveTextIndicator.f159825d.getMeasuredWidth() - finderLiveTextIndicator.f159826e.getMeasuredWidth());
            if (abs3 == 0) {
                finderLiveTextIndicator.f159831j.getLayoutParams().width = finderLiveTextIndicator.f159825d.getMeasuredWidth();
            } else {
                if (finderLiveTextIndicator.f159825d.getMeasuredWidth() > finderLiveTextIndicator.f159826e.getMeasuredWidth()) {
                    i4 = finderLiveTextIndicator.f159825d.getMeasuredWidth();
                    i3 = finderLiveTextIndicator.f159826e.getMeasuredWidth();
                } else {
                    i4 = finderLiveTextIndicator.f159826e.getMeasuredWidth();
                    i3 = finderLiveTextIndicator.f159825d.getMeasuredWidth();
                }
                float abs4 = (((float) Math.abs(i)) / f) * ((float) abs3);
                if (finderLiveTextIndicator.f159825d.getMeasuredWidth() > finderLiveTextIndicator.f159826e.getMeasuredWidth()) {
                    if (i > 0) {
                        ViewGroup.LayoutParams layoutParams2 = finderLiveTextIndicator.f159831j.getLayoutParams();
                        int i6 = finderLiveTextIndicator.f159831j.getLayoutParams().width - ((int) abs4);
                        if (i6 >= i3) {
                            i3 = i6;
                        }
                        layoutParams2.width = i3;
                    } else {
                        ViewGroup.LayoutParams layoutParams3 = finderLiveTextIndicator.f159831j.getLayoutParams();
                        int i7 = finderLiveTextIndicator.f159831j.getLayoutParams().width + ((int) abs4);
                        if (i7 <= i4) {
                            i4 = i7;
                        }
                        layoutParams3.width = i4;
                    }
                } else if (i > 0) {
                    ViewGroup.LayoutParams layoutParams4 = finderLiveTextIndicator.f159831j.getLayoutParams();
                    int i8 = finderLiveTextIndicator.f159831j.getLayoutParams().width + ((int) abs4);
                    if (i8 <= i4) {
                        i4 = i8;
                    }
                    layoutParams4.width = i4;
                } else {
                    ViewGroup.LayoutParams layoutParams5 = finderLiveTextIndicator.f159831j.getLayoutParams();
                    int i9 = finderLiveTextIndicator.f159831j.getLayoutParams().width - ((int) abs4);
                    if (i9 >= i3) {
                        i3 = i9;
                    }
                    layoutParams5.width = i3;
                }
            }
            finderLiveTextIndicator.f159831j.requestLayout();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: qj1.w1$d */
    public static final class C63074d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63068w1 f179004d;

        public C63074d(C63068w1 w1Var) {
            this.f179004d = w1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = true;
            if (this.f179004d.f178997z.f172565d.getVisibility() == 0) {
                this.f179004d.f178997z.mo85506a();
            } else {
                if (this.f179004d.f178982F.f171015r.f172486d.getVisibility() == 0) {
                    this.f179004d.f178982F.f171015r.mo85485a();
                    this.f179004d.f178982F.mo3431p();
                } else {
                    C56081l lVar = this.f179004d.f178980D;
                    if (lVar == null || !lVar.mo78173t()) {
                        z = false;
                    }
                    if (z) {
                        C56081l lVar2 = this.f179004d.f178980D;
                        if (lVar2 != null) {
                            lVar2.mo78171s();
                        }
                    } else {
                        this.f179004d.mo88004a1();
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.w1$e */
    public static final class C63075e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63068w1 f179005d;

        public C63075e(C63068w1 w1Var) {
            this.f179005d = w1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = true;
            if (this.f179005d.f178997z.f172565d.getVisibility() == 0) {
                this.f179005d.f178997z.mo85506a();
            } else {
                if (this.f179005d.f178982F.f171015r.f172486d.getVisibility() != 0) {
                    z = false;
                }
                if (z) {
                    this.f179005d.f178982F.f171015r.mo85485a();
                    this.f179005d.f178982F.mo3431p();
                } else {
                    this.f179005d.mo88004a1();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.w1$f */
    public static final class C63076f extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63068w1 f179006d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63076f(C63068w1 w1Var) {
            super(1);
            this.f179006d = w1Var;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            RecyclerView recyclerView = this.f179006d.f178989r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(intValue));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$6", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$6", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.w1$g */
    public static final class C63077g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63068w1 f179007d;

        public C63077g(C63068w1 w1Var) {
            this.f179007d = w1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63068w1 w1Var = this.f179007d;
            w1Var.getClass();
            C62042e.f176370a.mo87106p0().putBoolean("LINK_LINK_MORE_ACTION_RED_DOT_KEY", false);
            View view2 = w1Var.f178996y;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "openMicMoreActionPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "openMicMoreActionPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            w1Var.f166287d.setBackground((Drawable) null);
            w1Var.mo88005b1();
            w1Var.f178982F.mo3431p();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.w1$h */
    public static final class C63078h extends C87413o implements C32224a<FinderLiveMicModeSelectWidget> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f179008d;

        /* renamed from: e */
        public final /* synthetic */ C63068w1 f179009e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63078h(ViewGroup viewGroup, C63068w1 w1Var) {
            super(0);
            this.f179008d = viewGroup;
            this.f179009e = w1Var;
        }

        public Object invoke() {
            Context context = this.f179008d.getContext();
            C87412m.m108593f(context, "root.context");
            C63068w1 w1Var = this.f179009e;
            View findViewById = this.f179008d.getRootView().findViewById(C0966R.C0970id.f358581fx0);
            C87412m.m108593f(findViewById, "root.rootView.findViewById(R.id.live_preview_view)");
            return new FinderLiveMicModeSelectWidget(context, w1Var, (LivePreviewView) findViewById, new C63154z1(this.f179008d, this.f179009e), new C62641b2(this.f179009e));
        }
    }

    /* renamed from: qj1.w1$i */
    public static final class C63079i extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f179010d;

        /* renamed from: e */
        public final /* synthetic */ C63068w1 f179011e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63079i(ViewGroup viewGroup, C63068w1 w1Var) {
            super(1);
            this.f179010d = viewGroup;
            this.f179011e = w1Var;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                ViewGroup viewGroup = this.f179010d;
                viewGroup.setBackground(viewGroup.getContext().getResources().getDrawable(C0966R.color.a1u));
                this.f179011e.f178991t.animate().translationY(0.0f);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.w1$j */
    public static final class C63080j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63068w1 f179012d;

        public C63080j(C63068w1 w1Var) {
            this.f179012d = w1Var;
        }

        public final void run() {
            ArrayList arrayList;
            ArrayList arrayList2;
            this.f179012d.f178991t.mo78804d();
            C63068w1 w1Var = this.f179012d;
            Class cls = C54963d0.class;
            List<C54130j> list = ((C54963d0) w1Var.mo87696x0(cls)).f154071n;
            C87412m.m108593f(list, "business(LiveLinkMicSlic…ass.java).linkMicUserList");
            synchronized (list) {
                arrayList = new ArrayList();
                for (T next : list) {
                    if (true ^ ((C54130j) next).f152004h) {
                        arrayList.add(next);
                    }
                }
            }
            List<C54130j> list2 = ((C54963d0) w1Var.mo87696x0(cls)).f154071n;
            C87412m.m108593f(list2, "business(LiveLinkMicSlic…ass.java).linkMicUserList");
            synchronized (list2) {
                arrayList2 = new ArrayList();
                for (T next2 : list2) {
                    if (((C54130j) next2).f152004h) {
                        arrayList2.add(next2);
                    }
                }
            }
            if (((C54963d0) w1Var.mo87696x0(cls)).mo75909P3() > 0) {
                RecyclerView recyclerView = w1Var.f178989r;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(1);
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else if (((C54963d0) w1Var.mo87696x0(cls)).mo75908O3() > 0) {
                RecyclerView recyclerView3 = w1Var.f178989r;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                RecyclerView recyclerView4 = recyclerView3;
                C117292a.m165358d(recyclerView4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView3.mo17149t1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else if (arrayList.isEmpty() && !arrayList2.isEmpty()) {
                RecyclerView recyclerView5 = w1Var.f178989r;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(1);
                RecyclerView recyclerView6 = recyclerView5;
                C117292a.m165358d(recyclerView6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView5.mo17149t1(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                RecyclerView recyclerView7 = w1Var.f178989r;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                RecyclerView recyclerView8 = recyclerView7;
                C117292a.m165358d(recyclerView8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView7.mo17149t1(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                RecyclerView recyclerView9 = w1Var.f178989r;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(1);
                RecyclerView recyclerView10 = recyclerView9;
                C117292a.m165358d(recyclerView10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView9.mo17149t1(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView10, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63068w1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178987p = bVar;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(C0966R.C0970id.dc5);
        this.f178989r = recyclerView;
        FinderLiveTextIndicator finderLiveTextIndicator = (FinderLiveTextIndicator) viewGroup.findViewById(C0966R.C0970id.dca);
        this.f178990s = finderLiveTextIndicator;
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) viewGroup.findViewById(C0966R.C0970id.dbn);
        this.f178991t = liveBottomSheetPanel;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dbk);
        this.f178992u = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.dbm);
        this.f178993v = findViewById2;
        this.f178994w = viewGroup.findViewById(C0966R.C0970id.dbu);
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.ol4);
        this.f178995x = findViewById3;
        this.f178996y = viewGroup.findViewById(C0966R.C0970id.f358194ol2);
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.do8);
        C87412m.m108593f(findViewById4, "root.findViewById<Linear…vite_anchor_link_ui_root)");
        this.f178997z = new C60541x4((ViewGroup) findViewById4, bVar, this);
        this.f178981E = C36568h.m40985a(new C63078h(viewGroup, this));
        this.f178982F = new C59912d(viewGroup, bVar, this, new C63079i(viewGroup, this));
        C63211f0 f0Var = new C63211f0(mo14476D0());
        this.f178983G = f0Var;
        ArrayList<FinderLiveApplyLinkView> arrayList = new ArrayList<>();
        this.f178984H = arrayList;
        C54259z zVar = new C54259z();
        recyclerView.getLayoutParams().height = (((C75044y4.m89990b(viewGroup.getContext()).y * 2) / 3) - C74942w4.m89784a(viewGroup.getContext(), 68)) - C75044y4.m89991c(viewGroup.getContext());
        liveBottomSheetPanel.setTranslationY((float) C75044y4.m89990b(viewGroup.getContext()).y);
        if (!mo82893g0()) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += C75044y4.m89991c(viewGroup.getContext());
        }
        liveBottomSheetPanel.setOnVisibilityListener(new C63069a(this));
        C56081l lVar = new C56081l(this.f166287d);
        lVar.setOnVisitorApplyListListener(new C62769f2(this));
        lVar.f159586d = lVar.f159586d;
        arrayList.add(lVar);
        this.f178980D = lVar;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        FinderLiveApplyLinkAnchorView finderLiveApplyLinkAnchorView = new FinderLiveApplyLinkAnchorView(context, (AttributeSet) null, 0);
        finderLiveApplyLinkAnchorView.setOnAnchorApplyListListener(new C62789g2(this));
        finderLiveApplyLinkAnchorView.f159586d = finderLiveApplyLinkAnchorView.f159586d;
        arrayList.add(finderLiveApplyLinkAnchorView);
        f0Var.f179372f.clear();
        f0Var.f179372f.addAll(arrayList);
        Context context2 = viewGroup.getContext();
        C87412m.m108593f(context2, "root.context");
        FinderLiveLayoutManager finderLiveLayoutManager = new FinderLiveLayoutManager(context2, 0, false);
        finderLiveLayoutManager.f159781z = new C63070b(this);
        recyclerView.setLayoutManager(finderLiveLayoutManager);
        recyclerView.mo17043c(new C63071c(this, viewGroup));
        recyclerView.setAdapter(f0Var);
        zVar.mo75025b(recyclerView);
        findViewById.setOnClickListener(new C63074d(this));
        findViewById2.setOnClickListener(new C63075e(this));
        finderLiveTextIndicator.setOnTabSelectedListener(new C63076f(this));
        Context context3 = finderLiveTextIndicator.getContext();
        C87412m.m108593f(context3, "context");
        Object systemService = context3.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f = (displayMetrics.density * 15.0f) / context3.getResources().getDisplayMetrics().density;
        finderLiveTextIndicator.f159825d.setTextSize(1, f);
        finderLiveTextIndicator.f159826e.setTextSize(1, f);
        findViewById3.setOnClickListener(new C63077g(this));
    }

    /* renamed from: Z0 */
    public final boolean mo88003Z0() {
        if (((C54963d0) mo87696x0(C54963d0.class)).mo75906M3() <= 2) {
            return true;
        }
        C76912y0.makeText(this.f166287d.getContext(), (CharSequence) this.f166287d.getContext().getResources().getString(C0966R.string.ds7), 0).show();
        return false;
    }

    /* renamed from: a1 */
    public final void mo88004a1() {
        this.f178991t.mo78802a();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b0 */
    public void mo11966b0(int i, int i2, Bundle bundle) {
        if (!C61926c.m72696u(i2, 16384)) {
            mo10792g(8);
        } else if (mo14483f0() != 0) {
            mo88008e1();
        }
    }

    /* renamed from: b1 */
    public final void mo88005b1() {
        this.f178991t.animate().translationY((float) C75044y4.m89990b(this.f166287d.getContext()).y);
        Iterator<FinderLiveApplyLinkView> it = this.f178983G.f179372f.iterator();
        while (it.hasNext()) {
            it.next().mo77790f();
        }
    }

    /* renamed from: c1 */
    public final void mo88006c1(int i) {
        FinderLiveApplyLinkView finderLiveApplyLinkView;
        if (mo14483f0() == 0 && (finderLiveApplyLinkView = (FinderLiveApplyLinkView) C110818d0.m150917O(this.f178984H, 1)) != null) {
            finderLiveApplyLinkView.mo77769c(i);
        }
    }

    /* renamed from: d1 */
    public final void mo88007d1(int i) {
        if (mo14483f0() == 0) {
            RecyclerView recyclerView = this.f178989r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(1);
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "onBattleActionSucc", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "onBattleActionSucc", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            FinderLiveApplyLinkView finderLiveApplyLinkView = (FinderLiveApplyLinkView) C110818d0.m150917O(this.f178984H, 1);
            if (finderLiveApplyLinkView != null) {
                finderLiveApplyLinkView.mo77770d(i);
            }
            mo88004a1();
        }
    }

    /* renamed from: e1 */
    public final void mo88008e1() {
        mo10792g(0);
        C60541x4 x4Var = this.f178997z;
        C54795n5 D0 = x4Var.f172567f.mo14476D0();
        if (D0 != null) {
            D0.mo75708L(new C46276z4(x4Var));
        }
        this.f178983G.f179371e = mo87684A0();
        this.f178983G.notifyDataSetChanged();
        mo88009f1();
        this.f178991t.post(new C63080j(this));
        String str = this.f178988q;
        Log.m105924i(str, "showApplyLinkList :" + ((C54963d0) mo87696x0(C54963d0.class)).f154071n.size());
    }

    /* renamed from: f1 */
    public final void mo88009f1() {
        Class cls = C54963d0.class;
        C54963d0 d0Var = (C54963d0) mo87684A0().mo71262a(cls);
        FinderLiveTextIndicator finderLiveTextIndicator = this.f178990s;
        finderLiveTextIndicator.setTab1Text("  " + this.f166287d.getContext().getResources().getString(C0966R.string.dqv) + "  ");
        FinderLiveTextIndicator finderLiveTextIndicator2 = this.f178990s;
        finderLiveTextIndicator2.setTab2Text("  " + this.f166287d.getContext().getResources().getString(C0966R.string.dqt) + "  ");
        C63211f0 f0Var = this.f178983G;
        C45795b A0 = mo87684A0();
        Iterator<FinderLiveApplyLinkView> it = f0Var.f179372f.iterator();
        while (it.hasNext()) {
            it.next().mo77777l(A0);
        }
        C60541x4 x4Var = this.f178997z;
        C45795b A02 = mo87684A0();
        x4Var.getClass();
        C87412m.m108594g(A02, "liveData");
        C61926c.m72668M(new C60342a5(x4Var));
        if (this.f178977A) {
            ((FinderLiveMicModeSelectWidget) ((C36570n) this.f178981E).getValue()).mo77578A(mo87684A0());
        }
        boolean z = false;
        this.f178990s.mo77979a(((C54963d0) mo87696x0(cls)).mo75908O3() > 0);
        FinderLiveTextIndicator finderLiveTextIndicator3 = this.f178990s;
        if (((C54963d0) mo87696x0(cls)).mo75909P3() > 0) {
            z = true;
        }
        finderLiveTextIndicator3.mo77980b(z);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h0 */
    public void mo8378h0(boolean z, int i) {
        Iterator<FinderLiveApplyLinkView> it = this.f178983G.f179372f.iterator();
        while (it.hasNext()) {
            it.next().mo77772g(z, i);
        }
        C60541x4 x4Var = this.f178997z;
        x4Var.getClass();
        Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "keyboardChange show:" + z + " height:" + i);
        if (z) {
            x4Var.mo85508c();
            x4Var.f172565d.post(new C60553y4(x4Var));
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f178997z.f172565d.getVisibility() == 0) {
            this.f178997z.mo85506a();
        } else {
            C56081l lVar = this.f178980D;
            if (lVar != null && lVar.mo78173t()) {
                C56081l lVar2 = this.f178980D;
                if (lVar2 != null) {
                    lVar2.mo78171s();
                }
            } else {
                if (this.f178982F.f171015r.f172486d.getVisibility() == 0) {
                    this.f178982F.f171015r.mo85485a();
                    this.f178982F.mo3431p();
                } else if (mo14483f0() != 0) {
                    return false;
                } else {
                    mo88004a1();
                }
            }
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
        for (FinderLiveApplyLinkView i : this.f178984H) {
            i.mo77792i(mo87684A0());
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        FinderLiveApplyLinkView finderLiveApplyLinkView;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        boolean z = false;
        if (ordinal == 148) {
            mo88008e1();
            if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_LINK_MIC_SHOW_BATTLE_PANEL", false) : false) {
                RecyclerView recyclerView = this.f178989r;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(1);
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "showBattlePanel", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "showBattlePanel", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                FinderLiveApplyLinkView finderLiveApplyLinkView2 = (FinderLiveApplyLinkView) C110818d0.m150917O(this.f178984H, 1);
                if (finderLiveApplyLinkView2 != null) {
                    finderLiveApplyLinkView2.mo77778m();
                }
            }
        } else if (ordinal == 169) {
            this.f178978B = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            if (bundle != null) {
                z = bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false);
            }
            this.f178979C = z;
        } else if (ordinal == 183 && mo14483f0() == 0 && (finderLiveApplyLinkView = (FinderLiveApplyLinkView) C110818d0.m150917O(this.f178984H, 1)) != null) {
            finderLiveApplyLinkView.mo77768b();
        }
        if (this.f178977A) {
            ((FinderLiveMicModeSelectWidget) ((C36570n) this.f178981E).getValue()).mo77590z(bVar, bundle);
        }
    }
}
