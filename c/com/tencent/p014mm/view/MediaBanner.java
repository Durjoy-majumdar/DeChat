package com.tencent.p014mm.view;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C16631z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import zp3.C119121z;
import zp3.C23549a0;
import zp3.C23550b0;
import zp3.C23552c0;
import zp3.C23571u;
import zp3.C23573y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003opqB\u001b\b\u0016\u0012\u0006\u0010h\u001a\u00020g\u0012\b\u0010j\u001a\u0004\u0018\u00010i¢\u0006\u0004\bk\u0010lB#\b\u0016\u0012\u0006\u0010h\u001a\u00020g\u0012\b\u0010j\u001a\u0004\u0018\u00010i\u0012\u0006\u0010m\u001a\u00020\b¢\u0006\u0004\bk\u0010nJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010&\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00103\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010I\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR.\u0010Q\u001a\u0004\u0018\u00010J2\b\u00100\u001a\u0004\u0018\u00010J8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001d\u0010W\u001a\u0004\u0018\u00010R8FX\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR:\u0010_\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010X2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010X8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010a\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006r"}, mo182094d2 = {"Lcom/tencent/mm/view/MediaBanner;", "Landroidx/recyclerview/widget/RecyclerView$z;", "VH", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/view/MediaBanner$c;", "style", "Lrx3/b0;", "setIndicatorStyle", "", "e", "I", "getIndicatorHeight", "()I", "indicatorHeight", "f", "Lcom/tencent/mm/view/MediaBanner$c;", "getStyle", "()Lcom/tencent/mm/view/MediaBanner$c;", "setStyle", "(Lcom/tencent/mm/view/MediaBanner$c;)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "g", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "manager", "Lzp3/u;", "h", "Lzp3/u;", "getIndicator", "()Lzp3/u;", "setIndicator", "(Lzp3/u;)V", "indicator", "i", "getFocusPosition", "setFocusPosition", "(I)V", "focusPosition", "Landroidx/recyclerview/widget/RecyclerView;", "j", "Landroidx/recyclerview/widget/RecyclerView;", "getParentRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setParentRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "parentRecyclerView", "", "value", "n", "Z", "isAutoPlay", "()Z", "setAutoPlay", "(Z)V", "Landroidx/recyclerview/widget/RecyclerView$g;", "o", "Landroidx/recyclerview/widget/RecyclerView$g;", "getDataObserver", "()Landroidx/recyclerview/widget/RecyclerView$g;", "setDataObserver", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "dataObserver", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "p", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "getPagerView", "()Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "pagerView", "q", "Landroid/widget/FrameLayout;", "getPagerViewContainer", "()Landroid/widget/FrameLayout;", "pagerViewContainer", "Landroidx/recyclerview/widget/RecyclerView$q;", "r", "Landroidx/recyclerview/widget/RecyclerView$q;", "getViewPool", "()Landroidx/recyclerview/widget/RecyclerView$q;", "setViewPool", "(Landroidx/recyclerview/widget/RecyclerView$q;)V", "viewPool", "Landroid/widget/LinearLayout;", "s", "Lrx3/g;", "getContainer", "()Landroid/widget/LinearLayout;", "container", "Landroidx/recyclerview/widget/RecyclerView$e;", "u", "Landroidx/recyclerview/widget/RecyclerView$e;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$e;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$e;)V", "adapter", "Lcom/tencent/mm/view/MediaBanner$b;", "pageChangeCallback", "Lcom/tencent/mm/view/MediaBanner$b;", "getPageChangeCallback", "()Lcom/tencent/mm/view/MediaBanner$b;", "setPageChangeCallback", "(Lcom/tencent/mm/view/MediaBanner$b;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.MediaBanner */
public class MediaBanner<VH extends RecyclerView.C16631z> extends FrameLayout {

    /* renamed from: d */
    public final int f56639d = ((int) getResources().getDimension(C0966R.dimen.f3766df));

    /* renamed from: e */
    public final int f56640e = ((int) getResources().getDimension(C0966R.dimen.f3743cv));

    /* renamed from: f */
    public C19882c f56641f = C19882c.BOTTOM;

    /* renamed from: g */
    public final LinearLayoutManager f56642g;

    /* renamed from: h */
    public C23571u f56643h;

    /* renamed from: i */
    public int f56644i;

    /* renamed from: j */
    public RecyclerView f56645j;

    /* renamed from: n */
    public boolean f56646n;

    /* renamed from: o */
    public RecyclerView.C16615g f56647o;

    /* renamed from: p */
    public final RecyclerHorizontalViewPager f56648p;

    /* renamed from: q */
    public final FrameLayout f56649q;

    /* renamed from: r */
    public RecyclerView.C16623q f56650r;

    /* renamed from: s */
    public final C13601g f56651s;

    /* renamed from: t */
    public final MMHandler f56652t;

    /* renamed from: u */
    public RecyclerView.C16613e<VH> f56653u;

    /* renamed from: com.tencent.mm.view.MediaBanner$a */
    public interface C19880a {
        /* renamed from: o */
        void mo26566o(boolean z);
    }

    /* renamed from: com.tencent.mm.view.MediaBanner$b */
    public interface C19881b {
        /* renamed from: a */
        void mo26567a(int i, boolean z, boolean z2);
    }

    /* renamed from: com.tencent.mm.view.MediaBanner$c */
    public enum C19882c {
        BOTTOM
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2);
        this.f56642g = linearLayoutManager;
        Context context3 = getContext();
        C87412m.m108593f(context3, "context");
        this.f56643h = new MediaBannerIndicator(context3);
        this.f56647o = new C23549a0(this);
        C23552c0 c0Var = new C23552c0(this, getContext());
        this.f56648p = c0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f56649q = frameLayout;
        this.f56651s = C36568h.m40985a(new C119121z(this));
        c0Var.setHasFixedSize(false);
        linearLayoutManager.f44689u = 3;
        linearLayoutManager.setItemPrefetchEnabled(true);
        linearLayoutManager.mo16974W(0);
        c0Var.setLayoutManager(linearLayoutManager);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LinearLayout container = getContainer();
        if (container != null) {
            container.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
        setIndicatorStyle(this.f56641f);
        c0Var.setOnInterceptTouchEvent(new C23573y(this));
        this.f56652t = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C23550b0(this));
    }

    /* renamed from: a */
    public final void mo26538a(int i, boolean z) {
        RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f56648p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerHorizontalViewPager, aVar.mo10232b(), "com/tencent/mm/view/MediaBanner", "smoothScrollTo", "(IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerHorizontalViewPager.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerHorizontalViewPager, "com/tencent/mm/view/MediaBanner", "smoothScrollTo", "(IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
        this.f56648p.mo4595x1(i, true, z);
    }

    /* renamed from: b */
    public void mo26539b() {
        Log.m105924i("MicroMsg.MediaBanner", "[startLoopPlay] isAutoPlay:" + this.f56646n);
        this.f56652t.removeMessages(1);
        this.f56652t.sendEmptyMessageDelayed(1, 2500);
    }

    /* renamed from: c */
    public void mo26540c() {
        Log.m105924i("MicroMsg.MediaBanner", "[stopLoopPlay] isAutoPlay:" + this.f56646n);
        this.f56652t.removeMessages(1);
    }

    public final RecyclerView.C16613e<VH> getAdapter() {
        return this.f56653u;
    }

    public final LinearLayout getContainer() {
        return (LinearLayout) this.f56651s.getValue();
    }

    public final RecyclerView.C16615g getDataObserver() {
        return this.f56647o;
    }

    public final int getFocusPosition() {
        return this.f56644i;
    }

    public final C23571u getIndicator() {
        return this.f56643h;
    }

    public final int getIndicatorHeight() {
        return this.f56640e;
    }

    public final LinearLayoutManager getManager() {
        return this.f56642g;
    }

    public final C19881b getPageChangeCallback() {
        return null;
    }

    public final RecyclerHorizontalViewPager getPagerView() {
        return this.f56648p;
    }

    public final FrameLayout getPagerViewContainer() {
        return this.f56649q;
    }

    public final RecyclerView getParentRecyclerView() {
        return this.f56645j;
    }

    public final C19882c getStyle() {
        return this.f56641f;
    }

    public final RecyclerView.C16623q getViewPool() {
        return this.f56650r;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f56646n) {
            mo26539b();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo26540c();
    }

    public final void setAdapter(RecyclerView.C16613e<VH> eVar) {
        this.f56653u = eVar;
        this.f56648p.setAdapter(eVar);
        RecyclerView.C16613e<VH> eVar2 = this.f56653u;
        if (eVar2 != null) {
            eVar2.registerAdapterDataObserver(this.f56647o);
        }
    }

    public final void setAutoPlay(boolean z) {
        this.f56646n = z;
        if (z) {
            mo26539b();
        } else {
            mo26540c();
        }
    }

    public final void setDataObserver(RecyclerView.C16615g gVar) {
        C87412m.m108594g(gVar, "<set-?>");
        this.f56647o = gVar;
    }

    public final void setFocusPosition(int i) {
        this.f56644i = i;
    }

    public final void setIndicator(C23571u uVar) {
        C87412m.m108594g(uVar, "<set-?>");
        this.f56643h = uVar;
    }

    public final void setIndicatorStyle(C19882c cVar) {
        C87412m.m108594g(cVar, "style");
        this.f56641f = cVar;
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            LinearLayout container = getContainer();
            if (container != null) {
                container.setOrientation(1);
                container.setGravity(49);
                FrameLayout frameLayout = this.f56649q;
                RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f56648p;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                C13598b0 b0Var = C13598b0.f38549a;
                frameLayout.addView(recyclerHorizontalViewPager, layoutParams);
                container.addView(this.f56649q, new LinearLayout.LayoutParams(-1, -2));
                View view = this.f56643h.getView();
                if (view instanceof LinearLayout) {
                    ((LinearLayout) view).setGravity(17);
                }
                container.addView(this.f56643h.getView(), new LinearLayout.LayoutParams(-1, this.f56640e));
                container.setGravity(17);
                addView(container, new FrameLayout.LayoutParams(-1, -1));
            }
        } else if (ordinal == 1) {
            this.f56649q.addView(this.f56648p);
            addView(this.f56649q, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, this.f56640e);
            layoutParams2.bottomMargin = this.f56639d;
            layoutParams2.gravity = 81;
            View view2 = this.f56643h.getView();
            if (view2 instanceof LinearLayout) {
                ((LinearLayout) view2).setGravity(81);
            }
            addView(this.f56643h.getView(), layoutParams2);
        } else if (ordinal == 2) {
            this.f56649q.removeView(this.f56643h.getView());
            LinearLayout container2 = getContainer();
            if (container2 != null) {
                container2.removeView(this.f56643h.getView());
            }
            removeView(this.f56643h.getView());
        }
    }

    public final void setPageChangeCallback(C19881b bVar) {
    }

    public final void setParentRecyclerView(RecyclerView recyclerView) {
        this.f56645j = recyclerView;
    }

    public final void setStyle(C19882c cVar) {
        C87412m.m108594g(cVar, "<set-?>");
        this.f56641f = cVar;
    }

    public final void setViewPool(RecyclerView.C16623q qVar) {
        this.f56650r = qVar;
        this.f56648p.setRecycledViewPool(qVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2);
        this.f56642g = linearLayoutManager;
        Context context3 = getContext();
        C87412m.m108593f(context3, "context");
        this.f56643h = new MediaBannerIndicator(context3);
        this.f56647o = new C23549a0(this);
        C23552c0 c0Var = new C23552c0(this, getContext());
        this.f56648p = c0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f56649q = frameLayout;
        this.f56651s = C36568h.m40985a(new C119121z(this));
        c0Var.setHasFixedSize(false);
        linearLayoutManager.f44689u = 3;
        linearLayoutManager.setItemPrefetchEnabled(true);
        linearLayoutManager.mo16974W(0);
        c0Var.setLayoutManager(linearLayoutManager);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LinearLayout container = getContainer();
        if (container != null) {
            container.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
        setIndicatorStyle(this.f56641f);
        c0Var.setOnInterceptTouchEvent(new C23573y(this));
        this.f56652t = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C23550b0(this));
    }
}
