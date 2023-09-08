package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import je1.C9315i0;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nr3.C89059e;
import o40.C61926c;
import qk1.C12802g2;
import qk1.C12805h2;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49098d51;
import te3.C49712hj1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%B#\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\r\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR#\u0010\u0010\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u001a\u001a\n \u0003*\u0004\u0018\u00010\u00160\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001f\u001a\n \u0003*\u0004\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeView;", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "i", "Lrx3/g;", "getTitleTv", "()Landroid/widget/TextView;", "titleTv", "Landroid/view/View;", "j", "getCreateNoticeView", "()Landroid/view/View;", "createNoticeView", "n", "getBackBtn", "backBtn", "Lqk1/g2;", "p", "getMAdapter", "()Lqk1/g2;", "mAdapter", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "q", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "recyclerView", "Lcom/tencent/mm/view/refreshLayout/WxRefreshLayout;", "r", "getRefreshLayout", "()Lcom/tencent/mm/view/refreshLayout/WxRefreshLayout;", "refreshLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveMultiNoticeView */
public final class FinderLiveMultiNoticeView extends FrameLayout {

    /* renamed from: d */
    public final String f15284d = "Finder.FinderLiveMultiNoticeView";

    /* renamed from: e */
    public View f15285e;

    /* renamed from: f */
    public C9315i0 f15286f;

    /* renamed from: g */
    public FinderContact f15287g;

    /* renamed from: h */
    public List<String> f15288h;

    /* renamed from: i */
    public final C13601g f15289i = C36568h.m40985a(new C3215f1(this));

    /* renamed from: j */
    public final C13601g f15290j = C36568h.m40985a(new C3234w0(this));

    /* renamed from: n */
    public final C13601g f15291n = C36568h.m40985a(new C3232u0(this));

    /* renamed from: o */
    public C32226l<? super C49098d51, C13598b0> f15292o;

    /* renamed from: p */
    public final C13601g f15293p = C36568h.m40985a(new C3202a1(this));

    /* renamed from: q */
    public final C13601g f15294q = C36568h.m40985a(new C3205b1(this));

    /* renamed from: r */
    public final C13601g f15295r = C36568h.m40985a(new C3209d1(this));

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveMultiNoticeView$a */
    public static final class C3197a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMultiNoticeView f15296d;

        /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveMultiNoticeView$a$a */
        public static final class C3198a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveMultiNoticeView f15297d;

            public C3198a(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
                this.f15297d = finderLiveMultiNoticeView;
            }

            public final void run() {
                this.f15297d.setVisibility(8);
            }
        }

        public C3197a(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
            this.f15296d = finderLiveMultiNoticeView;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            FinderLiveMultiNoticeView finderLiveMultiNoticeView = this.f15296d;
            finderLiveMultiNoticeView.post(new C3198a(finderLiveMultiNoticeView));
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C12802g2 a = this.f15296d.getMAdapter();
            LinkedList<C49098d51> linkedList = a.f36642f;
            if (linkedList != null) {
                linkedList.clear();
            }
            a.notifyDataSetChanged();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMultiNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo3334f();
    }

    /* renamed from: g */
    public static void m3128g(FinderLiveMultiNoticeView finderLiveMultiNoticeView, boolean z, String str, String str2, int i, int i2, Object obj) {
        FinderLiveMultiNoticeView finderLiveMultiNoticeView2 = finderLiveMultiNoticeView;
        String str3 = (i2 & 4) != 0 ? "" : str2;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        C9315i0 i0Var = finderLiveMultiNoticeView2.f15286f;
        if (i0Var != null) {
            i0Var.mo85581g();
        }
        C9315i0 i0Var2 = new C9315i0((String) null, (String) null, str3, i3, (C9315i0.C9316a) null, (C49712hj1) null, 0, 51, (C8480h) null);
        C89059e i4 = i0Var2.mo9225i();
        Context context = finderLiveMultiNoticeView.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        i4.mo11397F((MMActivity) context);
        boolean z2 = z;
        i4.mo123420E(new C3235x0(finderLiveMultiNoticeView, z));
        finderLiveMultiNoticeView2.f15286f = i0Var2;
    }

    private final View getBackBtn() {
        return (View) this.f15291n.getValue();
    }

    private final View getCreateNoticeView() {
        return (View) this.f15290j.getValue();
    }

    /* access modifiers changed from: private */
    public final C12802g2 getMAdapter() {
        return (C12802g2) this.f15293p.getValue();
    }

    private final WxRecyclerView getRecyclerView() {
        return (WxRecyclerView) this.f15294q.getValue();
    }

    /* access modifiers changed from: private */
    public final WxRefreshLayout getRefreshLayout() {
        return (WxRefreshLayout) this.f15295r.getValue();
    }

    /* access modifiers changed from: private */
    public final TextView getTitleTv() {
        return (TextView) this.f15289i.getValue();
    }

    /* renamed from: d */
    public final void mo3332d(String str) {
        C87412m.m108594g(str, "id");
        C12802g2 mAdapter = getMAdapter();
        mAdapter.getClass();
        LinkedList<C49098d51> linkedList = mAdapter.f36642f;
        if (linkedList != null) {
            C61926c.m72675T(linkedList, new C12805h2(str));
        }
        mAdapter.notifyDataSetChanged();
        TextView titleTv = getTitleTv();
        if (titleTv != null) {
            titleTv.setText(getContext().getResources().getString(C0966R.string.m6m, new Object[]{Integer.valueOf(getMAdapter().getItemCount())}));
        }
    }

    /* renamed from: e */
    public final void mo3333e() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", new float[]{0.0f, (float) C85875k4.m106196n(1.0f)});
        ofFloat.setDuration(300);
        ofFloat.addListener(new C3197a(this));
        ofFloat.start();
    }

    /* renamed from: f */
    public final void mo3334f() {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.cns, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…ulti_notice_layout, this)");
        this.f15285e = inflate;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        getRecyclerView().setVisibility(0);
        View createNoticeView = getCreateNoticeView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(createNoticeView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        createNoticeView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(createNoticeView, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View backBtn = getBackBtn();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view = backBtn;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        backBtn.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMultiNoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo3334f();
    }
}
