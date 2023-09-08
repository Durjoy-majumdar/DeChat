package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60905o;
import jq3.C9493c;
import kotlin.Metadata;
import o40.C61926c;
import rs1.C13442s8;
import rs1.C13464t8;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\"B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFoldedScrollLayout;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/view/i6;", "presenter", "Lrx3/b0;", "setup", "Landroidx/recyclerview/widget/RecyclerView$l;", "getItemDecoration", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "Ljq3/c;", "e", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "getAdapter", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "setAdapter", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;)V", "adapter", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRecyclerView", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "recyclerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFoldedScrollLayout */
public final class FinderFoldedScrollLayout extends FrameLayout {

    /* renamed from: j */
    public static long f17780j;

    /* renamed from: n */
    public static long f17781n;

    /* renamed from: o */
    public static long f17782o;

    /* renamed from: p */
    public static long f17783p;

    /* renamed from: q */
    public static final /* synthetic */ int f17784q = 0;

    /* renamed from: d */
    public final int f17785d = 1;

    /* renamed from: e */
    public WxRecyclerAdapter<C9493c> f17786e;

    /* renamed from: f */
    public WxRecyclerView f17787f;

    /* renamed from: g */
    public ArrayList<C9493c> f17788g = new ArrayList<>();

    /* renamed from: h */
    public final C4185u2 f17789h = new C4185u2();

    /* renamed from: i */
    public final C4178t2 f17790i = new C4178t2(this);

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderFoldedScrollLayout$a */
    public interface C3953a {
        /* renamed from: a */
        ConstraintLayout.LayoutParams mo2386a();

        /* renamed from: c */
        boolean mo2387c();

        /* renamed from: e */
        int mo2388e();

        /* renamed from: f */
        void mo2389f(C60905o oVar);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderFoldedScrollLayout$b */
    public static final class C3954b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ FinderFoldedScrollLayout f17791d;

        public C3954b(FinderFoldedScrollLayout finderFoldedScrollLayout) {
            this.f17791d = finderFoldedScrollLayout;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3723cd);
            this.f17791d.getClass();
            int max = Math.max((int) view.getContext().getResources().getDimension(C0966R.dimen.a66), 0);
            int N0 = recyclerView.mo17029N0(view);
            if (N0 == 0) {
                rect.left = dimension;
                rect.right = max;
                rect.bottom = 0;
                rect.top = 0;
            } else if (N0 == this.f17791d.f17788g.size() - 1) {
                rect.left = max;
                rect.right = dimension;
                rect.bottom = 0;
                rect.top = 0;
            } else {
                rect.left = max;
                rect.right = max;
                rect.bottom = 0;
                rect.top = 0;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFoldedScrollLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo4556a();
    }

    /* renamed from: a */
    public final void mo4556a() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        setRecyclerView(new WxRecyclerView(context));
        getRecyclerView().setBackgroundResource(C0966R.C0969drawable.a6c);
        addView(getRecyclerView(), new FrameLayout.LayoutParams(-1, -1));
        WxRecyclerView recyclerView = getRecyclerView();
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        recyclerView.setLayoutManager(new FinderLinearLayoutManager(context2, 0, false));
        setAdapter(new WxRecyclerAdapter(new FinderFoldedScrollLayout$buildItemCoverts$1(this), this.f17788g, true));
        getRecyclerView().setAdapter(getAdapter());
        getRecyclerView().mo17085h0(getItemDecoration());
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context3 = getContext();
        C87412m.m108593f(context3, "context");
        C13442s8 f = aVar.mo12873f(context3);
        if (f != null) {
            WxRecyclerAdapter<C9493c> adapter = getAdapter();
            C87412m.m108594g(adapter, "adapter");
            C61926c.m72668M(new C13464t8(f, adapter));
        }
    }

    public final WxRecyclerAdapter<C9493c> getAdapter() {
        WxRecyclerAdapter<C9493c> wxRecyclerAdapter = this.f17786e;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public final RecyclerView.C0129l getItemDecoration() {
        return new C3954b(this);
    }

    public final WxRecyclerView getRecyclerView() {
        WxRecyclerView wxRecyclerView = this.f17787f;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public final void setAdapter(WxRecyclerAdapter<C9493c> wxRecyclerAdapter) {
        C87412m.m108594g(wxRecyclerAdapter, "<set-?>");
        this.f17786e = wxRecyclerAdapter;
    }

    public final void setRecyclerView(WxRecyclerView wxRecyclerView) {
        C87412m.m108594g(wxRecyclerView, "<set-?>");
        this.f17787f = wxRecyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        r2 = r2.mo3513o();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setup(com.tencent.p014mm.plugin.finder.view.C4073i6 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "presenter"
            gy3.C87412m.m108594g(r12, r0)
            r12.mo4967e()
            java.util.ArrayList<jq3.c> r0 = r11.f17788g
            r0.clear()
            java.util.List r0 = r12.mo4964b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "steup foldedlayout "
            r1.append(r2)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r12.mo4969g()
            r3 = 0
            if (r2 == 0) goto L_0x002e
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = r2.getDebugDescription()
            goto L_0x002f
        L_0x002e:
            r2 = r3
        L_0x002f:
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r12.mo4969g()
            if (r4 == 0) goto L_0x0042
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            goto L_0x0043
        L_0x0042:
            r4 = r3
        L_0x0043:
            r1.append(r4)
            r1.append(r2)
            r2 = 0
            java.lang.Object r4 = sx3.C110818d0.m150917O(r0, r2)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
            if (r4 == 0) goto L_0x005c
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            if (r4 == 0) goto L_0x005c
            java.lang.String r3 = r4.getDebugDescription()
        L_0x005c:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.FinderFoldedScrollLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.util.ArrayList<jq3.c> r1 = r11.f17788g
            r1.addAll(r0)
            boolean r12 = r12.hasMore()
            if (r12 == 0) goto L_0x007a
            java.util.ArrayList<jq3.c> r12 = r11.f17788g
            com.tencent.mm.plugin.finder.view.u2 r0 = r11.f17789h
            r12.add(r0)
        L_0x007a:
            com.tencent.mm.view.recyclerview.WxRecyclerView r12 = r11.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r12 = r12.getLayoutManager()
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager"
            gy3.C87412m.m108592e(r12, r0)
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r12 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r12
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.mo10233c(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.mo10233c(r1)
            java.lang.Object[] r4 = r0.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/view/FinderFoldedScrollLayout"
            java.lang.String r6 = "setup"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/finder/view/FoldedScrollPresenter;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "scrollToPositionWithOffset"
            java.lang.String r10 = "(II)V"
            r3 = r12
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r0.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 1
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.mo16973V(r1, r0)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/view/FinderFoldedScrollLayout"
            java.lang.String r5 = "setup"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/view/FoldedScrollPresenter;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "scrollToPositionWithOffset"
            java.lang.String r9 = "(II)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            com.tencent.mm.view.recyclerview.WxRecyclerView r12 = r11.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$e r12 = r12.getAdapter()
            if (r12 == 0) goto L_0x00ea
            r12.notifyDataSetChanged()
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout.setup(com.tencent.mm.plugin.finder.view.i6):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFoldedScrollLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo4556a();
    }
}
