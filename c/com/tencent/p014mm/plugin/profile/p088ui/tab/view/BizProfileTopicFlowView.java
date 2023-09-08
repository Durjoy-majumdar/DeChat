package com.tencent.p014mm.plugin.profile.p088ui.tab.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C20999i5;
import ht1.C76243a5;
import java.util.ArrayList;
import java.util.List;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;
import mf2.C47023f;
import rf2.C22239d;
import rf2.C48023a;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CB#\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010A\u001a\u0004\u0018\u00010@\u0012\u0006\u0010D\u001a\u00020/¢\u0006\u0004\bB\u0010EJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0007R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010.\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\"\u00106\u001a\u00020/8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u0002078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006F"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "Lmf2/f;", "adapter", "Lrx3/b0;", "setOnItemClickListener", "Landroidx/recyclerview/widget/RecyclerView$l;", "getItemDecoration", "Lrf2/a;", "d", "Lrf2/a;", "getPresenter", "()Lrf2/a;", "setPresenter", "(Lrf2/a;)V", "presenter", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "e", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRecyclerView", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "recyclerView", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "getAdapter", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "setAdapter", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;)V", "g", "getFoldAdapter", "setFoldAdapter", "foldAdapter", "Lht1/i5;", "h", "Lht1/i5;", "getLayoutManager", "()Lht1/i5;", "setLayoutManager", "(Lht1/i5;)V", "layoutManager", "i", "getFoldRecyclerView", "setFoldRecyclerView", "foldRecyclerView", "", "j", "I", "getFoldHeight", "()I", "setFoldHeight", "(I)V", "foldHeight", "", "n", "Z", "isFold", "()Z", "setFold", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView */
public final class BizProfileTopicFlowView extends FrameLayout {

    /* renamed from: d */
    public C48023a f53181d;

    /* renamed from: e */
    public WxRecyclerView f53182e;

    /* renamed from: f */
    public WxRecyclerAdapter<C47023f> f53183f;

    /* renamed from: g */
    public WxRecyclerAdapter<C47023f> f53184g;

    /* renamed from: h */
    public C20999i5 f53185h;

    /* renamed from: i */
    public WxRecyclerView f53186i;

    /* renamed from: j */
    public int f53187j;

    /* renamed from: n */
    public boolean f53188n;

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView$b */
    public static final class C18952b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTopicFlowView f53189d;

        public C18952b(BizProfileTopicFlowView bizProfileTopicFlowView) {
            this.f53189d = bizProfileTopicFlowView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
            r4 = r4.f128818d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView r0 = r5.f53189d
                rf2.a r1 = r0.f53181d
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0014
                java.util.ArrayList<mf2.f> r1 = r1.f128818d
                if (r1 == 0) goto L_0x0014
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ r2
                if (r1 != r2) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r2 = 0
            L_0x0015:
                if (r2 == 0) goto L_0x006a
                r1 = 2131302477(0x7f09184d, float:1.8223041E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
                if (r1 == 0) goto L_0x0072
                ht1.i5 r2 = r0.f53185h
                if (r2 == 0) goto L_0x0056
                rf2.a r4 = r0.f53181d
                if (r4 == 0) goto L_0x0033
                java.util.ArrayList<mf2.f> r4 = r4.f128818d
                if (r4 == 0) goto L_0x0033
                int r4 = r4.size()
                goto L_0x0034
            L_0x0033:
                r4 = 0
            L_0x0034:
                int r2 = r2.mo23640h(r3)
                if (r4 <= r2) goto L_0x003d
                r1.setVisibility(r3)
            L_0x003d:
                r2 = 2131302476(0x7f09184c, float:1.822304E38)
                android.view.View r2 = r1.findViewById(r2)
                com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
                rf2.b r3 = new rf2.b
                r3.<init>(r0, r2)
                r0.setOnClickListener(r3)
                rf2.c r3 = new rf2.c
                r3.<init>(r2)
                r0.setOnTouchListener(r3)
            L_0x0056:
                android.content.Context r0 = r0.getContext()
                r2 = 20
                int r0 = kg3.C76577a.m92151b(r0, r2)
                kw0.a r2 = kw0.C46746a.f125826a
                android.view.ViewParent r3 = r1.getParent()
                r2.mo71969b(r3, r1, r0, r0)
                goto L_0x0072
            L_0x006a:
                ht1.i5 r0 = r0.f53185h
                if (r0 != 0) goto L_0x006f
                goto L_0x0072
            L_0x006f:
                r0.mo23642p(r3)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.view.BizProfileTopicFlowView.C18952b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView$c */
    public static final class C18953c implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTopicFlowView f53190d;

        public C18953c(BizProfileTopicFlowView bizProfileTopicFlowView) {
            this.f53190d = bizProfileTopicFlowView;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C32226l<? super C47023f, C13598b0> lVar;
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            C47023f fVar = (C47023f) oVar.f173503E;
            if (fVar != null) {
                BizProfileTopicFlowView bizProfileTopicFlowView = this.f53190d;
                WxRecyclerAdapter<C47023f> wxRecyclerAdapter = bizProfileTopicFlowView.f53183f;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                WxRecyclerAdapter<C47023f> wxRecyclerAdapter2 = bizProfileTopicFlowView.f53184g;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyDataSetChanged();
                }
                C48023a presenter = this.f53190d.getPresenter();
                if (presenter != null && (lVar = presenter.f128820f) != null) {
                    lVar.invoke(fVar);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView$d */
    public static final class C18954d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTopicFlowView f53191d;

        public C18954d(BizProfileTopicFlowView bizProfileTopicFlowView) {
            this.f53191d = bizProfileTopicFlowView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WxRecyclerView foldRecyclerView = this.f53191d.getFoldRecyclerView();
            if (foldRecyclerView != null) {
                Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams = foldRecyclerView.getLayoutParams();
                layoutParams.height = intValue;
                foldRecyclerView.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView$a */
    public static final class C18955a extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
            rect.left = dimension;
            rect.right = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3723cd);
            rect.bottom = dimension;
            rect.top = dimension;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizProfileTopicFlowView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static final void m20003a(BizProfileTopicFlowView bizProfileTopicFlowView, boolean z) {
        ArrayList<C47023f> arrayList;
        bizProfileTopicFlowView.getClass();
        C20999i5 v002 = ((C76243a5) C86312j.m106911c(C76243a5.class)).v00();
        v002.mo23639c(true);
        if (bizProfileTopicFlowView.f53186i == null) {
            WxRecyclerView wxRecyclerView = (WxRecyclerView) bizProfileTopicFlowView.findViewById(C0966R.C0970id.f358027d30);
            bizProfileTopicFlowView.f53186i = wxRecyclerView;
            if (wxRecyclerView != null) {
                wxRecyclerView.mo17085h0(bizProfileTopicFlowView.getItemDecoration());
            }
            WxRecyclerView wxRecyclerView2 = bizProfileTopicFlowView.f53186i;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.setLayoutManager((RecyclerView.LayoutManager) v002);
            }
            WxRecyclerView wxRecyclerView3 = bizProfileTopicFlowView.f53186i;
            if (wxRecyclerView3 != null) {
                wxRecyclerView3.setNestedScrollingEnabled(false);
            }
            C20999i5 i5Var = bizProfileTopicFlowView.f53185h;
            int h = i5Var != null ? i5Var.mo23640h(0) : 0;
            ArrayList arrayList2 = new ArrayList();
            C48023a aVar = bizProfileTopicFlowView.f53181d;
            if (!(aVar == null || (arrayList = aVar.f128818d) == null)) {
                List<C47023f> subList = arrayList.subList(h, arrayList.size());
                C87412m.m108593f(subList, "it.subList(firstRowItemCount, it.size)");
                arrayList2.addAll(subList);
            }
            if (!arrayList2.isEmpty()) {
                WxRecyclerAdapter<C47023f> wxRecyclerAdapter = new WxRecyclerAdapter<>(new BizProfileTopicFlowView$buildItemCoverts$1(), arrayList2, false);
                bizProfileTopicFlowView.setOnItemClickListener(wxRecyclerAdapter);
                bizProfileTopicFlowView.f53184g = wxRecyclerAdapter;
                WxRecyclerView wxRecyclerView4 = bizProfileTopicFlowView.f53186i;
                if (wxRecyclerView4 != null) {
                    wxRecyclerView4.setAdapter(wxRecyclerAdapter);
                }
                WxRecyclerView wxRecyclerView5 = bizProfileTopicFlowView.f53186i;
                if (wxRecyclerView5 != null) {
                    wxRecyclerView5.setVisibility(0);
                }
            } else {
                return;
            }
        }
        int i = bizProfileTopicFlowView.f53187j;
        if (i <= 0) {
            WxRecyclerView wxRecyclerView6 = bizProfileTopicFlowView.f53186i;
            if (wxRecyclerView6 != null) {
                wxRecyclerView6.post(new C22239d(bizProfileTopicFlowView, v002, z));
            }
        } else if (z) {
            bizProfileTopicFlowView.mo24113d(0, i, 0.0f, 1.0f);
        } else {
            bizProfileTopicFlowView.mo24113d(i, 0, 1.0f, 0.0f);
        }
    }

    private final void setOnItemClickListener(WxRecyclerAdapter<C47023f> wxRecyclerAdapter) {
        wxRecyclerAdapter.f173488o = new C18953c(this);
    }

    /* renamed from: b */
    public final void mo24111b(C48023a aVar) {
        C87412m.m108594g(aVar, "presenter");
        this.f53181d = aVar;
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cky, this, true);
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById(C0966R.C0970id.d2y);
        this.f53182e = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.mo17085h0(getItemDecoration());
        }
        WxRecyclerView wxRecyclerView2 = this.f53182e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setNestedScrollingEnabled(false);
        }
        C20999i5 v002 = ((C76243a5) C86312j.m106911c(C76243a5.class)).v00();
        v002.mo23639c(true);
        this.f53185h = v002;
        WxRecyclerView wxRecyclerView3 = this.f53182e;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.setLayoutManager((RecyclerView.LayoutManager) v002);
        }
        WxRecyclerAdapter<C47023f> wxRecyclerAdapter = new WxRecyclerAdapter<>(new BizProfileTopicFlowView$buildItemCoverts$1(), aVar.f128818d, false);
        setOnItemClickListener(wxRecyclerAdapter);
        this.f53183f = wxRecyclerAdapter;
        WxRecyclerView wxRecyclerView4 = this.f53182e;
        if (wxRecyclerView4 != null) {
            wxRecyclerView4.setAdapter(wxRecyclerAdapter);
        }
    }

    /* renamed from: c */
    public final void mo24112c() {
        RecyclerView.C16613e adapter;
        Log.m105924i("BizProfileTopicFlowView", "refresh");
        C20999i5 i5Var = this.f53185h;
        if (i5Var != null) {
            i5Var.mo23642p(true);
        }
        WxRecyclerView wxRecyclerView = this.f53182e;
        if (!(wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null)) {
            adapter.notifyDataSetChanged();
        }
        WxRecyclerView wxRecyclerView2 = this.f53182e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.post(new C18952b(this));
        }
    }

    /* renamed from: d */
    public final void mo24113d(int i, int i2, float f, float f2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new C18954d(this));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f53186i, "alpha", new float[]{f, f2});
        ofFloat.setDuration(300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).with(ofFloat);
        animatorSet.start();
    }

    public final WxRecyclerAdapter<C47023f> getAdapter() {
        return this.f53183f;
    }

    public final WxRecyclerAdapter<C47023f> getFoldAdapter() {
        return this.f53184g;
    }

    public final int getFoldHeight() {
        return this.f53187j;
    }

    public final WxRecyclerView getFoldRecyclerView() {
        return this.f53186i;
    }

    public final RecyclerView.C0129l getItemDecoration() {
        return new C18955a();
    }

    public final C20999i5 getLayoutManager() {
        return this.f53185h;
    }

    public final C48023a getPresenter() {
        return this.f53181d;
    }

    public final WxRecyclerView getRecyclerView() {
        return this.f53182e;
    }

    public final void setAdapter(WxRecyclerAdapter<C47023f> wxRecyclerAdapter) {
        this.f53183f = wxRecyclerAdapter;
    }

    public final void setFold(boolean z) {
        this.f53188n = z;
    }

    public final void setFoldAdapter(WxRecyclerAdapter<C47023f> wxRecyclerAdapter) {
        this.f53184g = wxRecyclerAdapter;
    }

    public final void setFoldHeight(int i) {
        this.f53187j = i;
    }

    public final void setFoldRecyclerView(WxRecyclerView wxRecyclerView) {
        this.f53186i = wxRecyclerView;
    }

    public final void setLayoutManager(C20999i5 i5Var) {
        this.f53185h = i5Var;
    }

    public final void setPresenter(C48023a aVar) {
        this.f53181d = aVar;
    }

    public final void setRecyclerView(WxRecyclerView wxRecyclerView) {
        this.f53182e = wxRecyclerView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizProfileTopicFlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizProfileTopicFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
