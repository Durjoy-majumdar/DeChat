package com.tencent.p014mm.plugin.finder.profile.filter;

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
import cm1.C0734g2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.FlowLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import dp1.C7435f2;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq3.C60898l;
import jq3.C60905o;
import ko1.C10370c;
import ko1.C10373f;
import kotlin.Metadata;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C51270sn1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CB#\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010A\u001a\u0004\u0018\u00010@\u0012\u0006\u0010D\u001a\u00020/¢\u0006\u0004\bB\u0010EJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0007R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010.\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\"\u00106\u001a\u00020/8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u0002078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006F"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/filter/FinderTopicFilterView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "Lcm1/g2;", "adapter", "Lrx3/b0;", "setOnItemClickListener", "Landroidx/recyclerview/widget/RecyclerView$l;", "getItemDecoration", "Lko1/c;", "d", "Lko1/c;", "getPresenter", "()Lko1/c;", "setPresenter", "(Lko1/c;)V", "presenter", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "e", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRecyclerView", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "recyclerView", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "getAdapter", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "setAdapter", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;)V", "g", "getFoldAdapter", "setFoldAdapter", "foldAdapter", "Lcom/tencent/mm/plugin/finder/profile/FlowLayoutManager;", "h", "Lcom/tencent/mm/plugin/finder/profile/FlowLayoutManager;", "getLayoutManager", "()Lcom/tencent/mm/plugin/finder/profile/FlowLayoutManager;", "setLayoutManager", "(Lcom/tencent/mm/plugin/finder/profile/FlowLayoutManager;)V", "layoutManager", "i", "getFoldRecyclerView", "setFoldRecyclerView", "foldRecyclerView", "", "j", "I", "getFoldHeight", "()I", "setFoldHeight", "(I)V", "foldHeight", "", "n", "Z", "isFold", "()Z", "setFold", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView */
public final class FinderTopicFilterView extends FrameLayout {

    /* renamed from: d */
    public C10370c f16129d;

    /* renamed from: e */
    public WxRecyclerView f16130e;

    /* renamed from: f */
    public WxRecyclerAdapter<C0734g2> f16131f;

    /* renamed from: g */
    public WxRecyclerAdapter<C0734g2> f16132g;

    /* renamed from: h */
    public FlowLayoutManager f16133h;

    /* renamed from: i */
    public WxRecyclerView f16134i;

    /* renamed from: j */
    public int f16135j;

    /* renamed from: n */
    public boolean f16136n;

    /* renamed from: com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView$a */
    public static final class C3427a extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
            rect.left = dimension;
            rect.right = dimension;
            rect.bottom = dimension;
            rect.top = dimension;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView$b */
    public static final class C3428b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicFilterView f16137d;

        public C3428b(FinderTopicFilterView finderTopicFilterView) {
            this.f16137d = finderTopicFilterView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r1 = r1.f31575e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView r0 = r6.f16137d
                ko1.c r1 = r0.f16129d
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0015
                java.util.ArrayList<cm1.g2> r1 = r1.f31575e
                if (r1 == 0) goto L_0x0015
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ r2
                if (r1 != r2) goto L_0x0015
                r1 = 1
                goto L_0x0016
            L_0x0015:
                r1 = 0
            L_0x0016:
                if (r1 == 0) goto L_0x005e
                r1 = 2131302477(0x7f09184d, float:1.8223041E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                if (r1 == 0) goto L_0x0065
                r4 = 1096810496(0x41600000, float:14.0)
                android.content.Context r5 = r0.getContext()
                float r5 = kg3.C76577a.m92165p(r5)
                float r5 = r5 * r4
                r1.setTextSize(r2, r5)
                ko1.d r2 = new ko1.d
                r2.<init>(r0)
                zp3.C23564m.m28138h(r1, r2)
                com.tencent.mm.plugin.finder.profile.FlowLayoutManager r2 = r0.f16133h
                if (r2 == 0) goto L_0x0055
                ko1.c r4 = r0.f16129d
                if (r4 == 0) goto L_0x004b
                java.util.ArrayList<cm1.g2> r4 = r4.f31575e
                if (r4 == 0) goto L_0x004b
                int r4 = r4.size()
                goto L_0x004c
            L_0x004b:
                r4 = 0
            L_0x004c:
                int r2 = r2.mo23640h(r3)
                if (r4 <= r2) goto L_0x0055
                r1.setVisibility(r3)
            L_0x0055:
                ko1.e r2 = new ko1.e
                r2.<init>(r0, r1)
                r1.setOnClickListener(r2)
                goto L_0x0065
            L_0x005e:
                com.tencent.mm.plugin.finder.profile.FlowLayoutManager r0 = r0.f16133h
                if (r0 != 0) goto L_0x0063
                goto L_0x0065
            L_0x0063:
                r0.f52491q = r3
            L_0x0065:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.filter.FinderTopicFilterView.C3428b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView$c */
    public static final class C3429c implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<C0734g2> f16138d;

        /* renamed from: e */
        public final /* synthetic */ FinderTopicFilterView f16139e;

        public C3429c(WxRecyclerAdapter<C0734g2> wxRecyclerAdapter, FinderTopicFilterView finderTopicFilterView) {
            this.f16138d = wxRecyclerAdapter;
            this.f16139e = finderTopicFilterView;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C13604l lVar;
            C32227p<? super C51270sn1, ? super Boolean, C13598b0> pVar;
            ArrayList<C0734g2> arrayList;
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            int c6 = i - this.f16138d.mo85796c6();
            Log.m105924i("Finder.FinderTopicFilterView", "click item pos:" + c6);
            C0734g2 g2Var = (C0734g2) oVar.f173503E;
            if (g2Var != null) {
                C51270sn1 sn12 = g2Var.f1749d;
                long j = sn12.f141618e;
                if (g2Var.f1751f) {
                    g2Var.f1751f = false;
                    lVar = new C13604l(sn12, Boolean.FALSE);
                } else {
                    g2Var.f1751f = true;
                    lVar = new C13604l(sn12, Boolean.TRUE);
                }
                C51270sn1 sn13 = (C51270sn1) lVar.f38555d;
                boolean booleanValue = ((Boolean) lVar.f38556e).booleanValue();
                Log.m105924i("Finder.FinderTopicFilterView", "select item hash:" + g2Var.hashCode() + ", topic:" + g2Var.f1749d.f141617d + ", selected:" + g2Var.f1751f);
                C10370c presenter = this.f16139e.getPresenter();
                if (!(presenter == null || (arrayList = presenter.f31575e) == null)) {
                    Iterator<C0734g2> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0734g2 next = it.next();
                        if (next.f1749d.f141618e != j) {
                            next.f1751f = false;
                        }
                    }
                }
                FinderTopicFilterView finderTopicFilterView = this.f16139e;
                WxRecyclerAdapter<C0734g2> wxRecyclerAdapter = finderTopicFilterView.f16131f;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                WxRecyclerAdapter<C0734g2> wxRecyclerAdapter2 = finderTopicFilterView.f16132g;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyDataSetChanged();
                }
                C10370c presenter2 = this.f16139e.getPresenter();
                if (presenter2 != null && (pVar = presenter2.f31576f) != null) {
                    pVar.invoke(sn13, Boolean.valueOf(booleanValue));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView$d */
    public static final class C3430d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicFilterView f16140d;

        public C3430d(FinderTopicFilterView finderTopicFilterView) {
            this.f16140d = finderTopicFilterView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WxRecyclerView foldRecyclerView = this.f16140d.getFoldRecyclerView();
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTopicFilterView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static final void m3550a(FinderTopicFilterView finderTopicFilterView, boolean z, boolean z2) {
        finderTopicFilterView.getClass();
        String str = z2 ? "fold" : "unfold";
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = finderTopicFilterView.getContext();
        C87412m.m108593f(context, "context");
        C13442s8 f = aVar.mo12873f(context);
        f2Var.mo8577a(f != null ? f.mo12861q3() : null, str, z ? 1 : 0, (JSONObject) null);
    }

    /* renamed from: b */
    public static final void m3551b(FinderTopicFilterView finderTopicFilterView, boolean z) {
        ArrayList<C0734g2> arrayList;
        finderTopicFilterView.getClass();
        FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
        if (finderTopicFilterView.f16134i == null) {
            WxRecyclerView wxRecyclerView = (WxRecyclerView) finderTopicFilterView.findViewById(C0966R.C0970id.f358027d30);
            finderTopicFilterView.f16134i = wxRecyclerView;
            if (wxRecyclerView != null) {
                wxRecyclerView.mo17085h0(finderTopicFilterView.getItemDecoration());
            }
            WxRecyclerView wxRecyclerView2 = finderTopicFilterView.f16134i;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.setLayoutManager(flowLayoutManager);
            }
            FlowLayoutManager flowLayoutManager2 = finderTopicFilterView.f16133h;
            int h = flowLayoutManager2 != null ? flowLayoutManager2.mo23640h(0) : 0;
            ArrayList arrayList2 = new ArrayList();
            C10370c cVar = finderTopicFilterView.f16129d;
            if (!(cVar == null || (arrayList = cVar.f31575e) == null)) {
                List<C0734g2> subList = arrayList.subList(h, arrayList.size());
                C87412m.m108593f(subList, "it.subList(firstRowItemCount, it.size)");
                arrayList2.addAll(subList);
            }
            if (!arrayList2.isEmpty()) {
                WxRecyclerAdapter<C0734g2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderTopicFilterView$buildItemCoverts$1(), arrayList2, false);
                finderTopicFilterView.setOnItemClickListener(wxRecyclerAdapter);
                finderTopicFilterView.f16132g = wxRecyclerAdapter;
                WxRecyclerView wxRecyclerView3 = finderTopicFilterView.f16134i;
                if (wxRecyclerView3 != null) {
                    wxRecyclerView3.setAdapter(wxRecyclerAdapter);
                }
                WxRecyclerView wxRecyclerView4 = finderTopicFilterView.f16134i;
                if (wxRecyclerView4 != null) {
                    wxRecyclerView4.setVisibility(0);
                }
            } else {
                return;
            }
        }
        int i = finderTopicFilterView.f16135j;
        if (i <= 0) {
            WxRecyclerView wxRecyclerView5 = finderTopicFilterView.f16134i;
            if (wxRecyclerView5 != null) {
                wxRecyclerView5.post(new C10373f(finderTopicFilterView, flowLayoutManager, z));
            }
        } else if (z) {
            finderTopicFilterView.mo3778e(0, i, 0.0f, 1.0f);
        } else {
            finderTopicFilterView.mo3778e(i, 0, 1.0f, 0.0f);
        }
    }

    private final void setOnItemClickListener(WxRecyclerAdapter<C0734g2> wxRecyclerAdapter) {
        wxRecyclerAdapter.f173488o = new C3429c(wxRecyclerAdapter, this);
    }

    /* renamed from: c */
    public final void mo3776c(C10370c cVar) {
        C87412m.m108594g(cVar, "presenter");
        this.f16129d = cVar;
        if (2 == cVar.f31574d) {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a_x, this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.aof, this, true);
        }
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById(C0966R.C0970id.d2y);
        this.f16130e = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.mo17085h0(getItemDecoration());
        }
        FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
        this.f16133h = flowLayoutManager;
        WxRecyclerView wxRecyclerView2 = this.f16130e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(flowLayoutManager);
        }
        WxRecyclerAdapter<C0734g2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderTopicFilterView$buildItemCoverts$1(), cVar.f31575e, false);
        setOnItemClickListener(wxRecyclerAdapter);
        this.f16131f = wxRecyclerAdapter;
        WxRecyclerView wxRecyclerView3 = this.f16130e;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.setAdapter(wxRecyclerAdapter);
        }
    }

    /* renamed from: d */
    public final void mo3777d() {
        RecyclerView.C16613e adapter;
        Log.m105924i("Finder.FinderTopicFilterView", "refresh");
        FlowLayoutManager flowLayoutManager = this.f16133h;
        if (flowLayoutManager != null) {
            flowLayoutManager.f52491q = true;
        }
        WxRecyclerView wxRecyclerView = this.f16130e;
        if (!(wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null)) {
            adapter.notifyDataSetChanged();
        }
        WxRecyclerView wxRecyclerView2 = this.f16130e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.post(new C3428b(this));
        }
    }

    /* renamed from: e */
    public final void mo3778e(int i, int i2, float f, float f2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new C3430d(this));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16134i, "alpha", new float[]{f, f2});
        ofFloat.setDuration(300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).with(ofFloat);
        animatorSet.start();
    }

    public final WxRecyclerAdapter<C0734g2> getAdapter() {
        return this.f16131f;
    }

    public final WxRecyclerAdapter<C0734g2> getFoldAdapter() {
        return this.f16132g;
    }

    public final int getFoldHeight() {
        return this.f16135j;
    }

    public final WxRecyclerView getFoldRecyclerView() {
        return this.f16134i;
    }

    public final RecyclerView.C0129l getItemDecoration() {
        return new C3427a();
    }

    public final FlowLayoutManager getLayoutManager() {
        return this.f16133h;
    }

    public final C10370c getPresenter() {
        return this.f16129d;
    }

    public final WxRecyclerView getRecyclerView() {
        return this.f16130e;
    }

    public final void setAdapter(WxRecyclerAdapter<C0734g2> wxRecyclerAdapter) {
        this.f16131f = wxRecyclerAdapter;
    }

    public final void setFold(boolean z) {
        this.f16136n = z;
    }

    public final void setFoldAdapter(WxRecyclerAdapter<C0734g2> wxRecyclerAdapter) {
        this.f16132g = wxRecyclerAdapter;
    }

    public final void setFoldHeight(int i) {
        this.f16135j = i;
    }

    public final void setFoldRecyclerView(WxRecyclerView wxRecyclerView) {
        this.f16134i = wxRecyclerView;
    }

    public final void setLayoutManager(FlowLayoutManager flowLayoutManager) {
        this.f16133h = flowLayoutManager;
    }

    public final void setPresenter(C10370c cVar) {
        this.f16129d = cVar;
    }

    public final void setRecyclerView(WxRecyclerView wxRecyclerView) {
        this.f16130e = wxRecyclerView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTopicFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTopicFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
