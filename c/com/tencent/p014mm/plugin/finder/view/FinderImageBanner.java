package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.view.MediaBannerIndicator;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import oj3.C62036a;
import rx3.C13598b0;
import sr1.C13775e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106B#\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b5\u00109R\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010-\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006:"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderImageBanner;", "Lcom/tencent/mm/plugin/finder/view/FinderBaseMediaBanner;", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "Lcom/tencent/mm/plugin/finder/view/u7;", "q", "Lcom/tencent/mm/plugin/finder/view/u7;", "getMediaType", "()Lcom/tencent/mm/plugin/finder/view/u7;", "setMediaType", "(Lcom/tencent/mm/plugin/finder/view/u7;)V", "mediaType", "Lcom/tencent/mm/view/MediaBannerIndicator;", "r", "Lcom/tencent/mm/view/MediaBannerIndicator;", "getIndicator", "()Lcom/tencent/mm/view/MediaBannerIndicator;", "setIndicator", "(Lcom/tencent/mm/view/MediaBannerIndicator;)V", "indicator", "Landroidx/recyclerview/widget/RecyclerView;", "s", "Landroidx/recyclerview/widget/RecyclerView;", "getParentRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setParentRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "parentRecyclerView", "Lsr1/e;", "t", "Lsr1/e;", "getImageAdapter", "()Lsr1/e;", "imageAdapter", "Lcom/tencent/mm/plugin/finder/view/x6;", "v", "Lcom/tencent/mm/plugin/finder/view/x6;", "getPageChangeCallback", "()Lcom/tencent/mm/plugin/finder/view/x6;", "setPageChangeCallback", "(Lcom/tencent/mm/plugin/finder/view/x6;)V", "pageChangeCallback", "", "value", "w", "Z", "isAutoPlay", "()Z", "setAutoPlay", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderImageBanner */
public final class FinderImageBanner extends FinderBaseMediaBanner<RecyclerHorizontalViewPager> {

    /* renamed from: y */
    public static final /* synthetic */ int f17807y = 0;

    /* renamed from: q */
    public C4189u7 f17808q = C4189u7.IMAGE;

    /* renamed from: r */
    public MediaBannerIndicator f17809r;

    /* renamed from: s */
    public RecyclerView f17810s;

    /* renamed from: t */
    public final C13775e f17811t;

    /* renamed from: u */
    public C3961b f17812u;

    /* renamed from: v */
    public C4212x6 f17813v;

    /* renamed from: w */
    public boolean f17814w;

    /* renamed from: x */
    public final MMHandler f17815x;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderImageBanner$a */
    public static final class C3960a extends RecyclerHorizontalViewPager {

        /* renamed from: F1 */
        public final /* synthetic */ FinderImageBanner f17816F1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3960a(FinderImageBanner finderImageBanner, Context context) {
            super(context);
            this.f17816F1 = finderImageBanner;
            C87412m.m108593f(context, "context");
        }

        /* renamed from: x1 */
        public void mo4595x1(int i, boolean z, boolean z2) {
            super.mo4595x1(i, z, z2);
            this.f17816F1.setFocusPosition(i);
            MediaBannerIndicator indicator = this.f17816F1.getIndicator();
            if (indicator != null) {
                indicator.setCurrentIndex(i);
            }
            C4212x6 pageChangeCallback = this.f17816F1.getPageChangeCallback();
            if (pageChangeCallback != null) {
                pageChangeCallback.mo4665a(i, z, z2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderImageBanner$b */
    public static final class C3961b extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ FinderImageBanner f17817a;

        public C3961b(FinderImageBanner finderImageBanner) {
            this.f17817a = finderImageBanner;
        }

        /* renamed from: b */
        public void mo2556b() {
            MediaBannerIndicator indicator = this.f17817a.getIndicator();
            if (indicator != null) {
                indicator.setCount(this.f17817a.getImageAdapter().getItemCount());
            }
            MediaBannerIndicator indicator2 = this.f17817a.getIndicator();
            if ((indicator2 != null ? indicator2.getCount() : 0) > 0) {
                RecyclerHorizontalViewPager recyclerHorizontalViewPager = (RecyclerHorizontalViewPager) this.f17817a.getMediaView();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                RecyclerHorizontalViewPager recyclerHorizontalViewPager2 = recyclerHorizontalViewPager;
                C117292a.m165358d(recyclerHorizontalViewPager2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderImageBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
                recyclerHorizontalViewPager.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerHorizontalViewPager2, "com/tencent/mm/plugin/finder/view/FinderImageBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            MediaBannerIndicator indicator = this.f17817a.getIndicator();
            if (indicator != null) {
                indicator.setCount(this.f17817a.getImageAdapter().getItemCount());
            }
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            MediaBannerIndicator indicator = this.f17817a.getIndicator();
            if (indicator != null) {
                indicator.setCount(this.f17817a.getImageAdapter().getItemCount());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderImageBanner$c */
    public static final class C3962c implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ FinderImageBanner f17818d;

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderImageBanner$c$a */
        public static final class C3963a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C13775e f17819d;

            /* renamed from: e */
            public final /* synthetic */ FinderImageBanner f17820e;

            public C3963a(C13775e eVar, FinderImageBanner finderImageBanner) {
                this.f17819d = eVar;
                this.f17820e = finderImageBanner;
            }

            public final void run() {
                C13775e eVar = this.f17819d;
                eVar.mo86984u5(eVar.getItemCount() - 1);
                this.f17819d.registerAdapterDataObserver(this.f17820e.f17812u);
                this.f17820e.mo4580c(0, true);
                this.f17820e.mo4583e();
            }
        }

        public C3962c(FinderImageBanner finderImageBanner) {
            this.f17818d = finderImageBanner;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            if (message.what == 1 && this.f17818d.getImageAdapter().getItemCount() > 1) {
                int focusPosition = this.f17818d.getFocusPosition() + 1;
                Log.m105924i("MicroMsg.MediaBanner", "[handleMsg] targetPosition:" + focusPosition);
                if (focusPosition < this.f17818d.getImageAdapter().getItemCount()) {
                    this.f17818d.mo4581d(focusPosition, true);
                    this.f17818d.mo4583e();
                } else if (focusPosition == this.f17818d.getImageAdapter().getItemCount()) {
                    C13775e imageAdapter = this.f17818d.getImageAdapter();
                    if (imageAdapter instanceof C62036a) {
                        FinderImageBanner finderImageBanner = this.f17818d;
                        try {
                            Result.Companion companion = Result.Companion;
                            imageAdapter.unregisterAdapterDataObserver(finderImageBanner.f17812u);
                            Result.m168114constructorimpl(C13598b0.f38549a);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            Result.m168114constructorimpl(ResultKt.createFailure(th));
                        }
                        int itemCount = imageAdapter.getItemCount();
                        imageAdapter.f176359d.add(itemCount, imageAdapter.f176359d.get(0));
                        imageAdapter.notifyItemInserted(itemCount);
                        ((RecyclerHorizontalViewPager) this.f17818d.getMediaView()).setItemAnimator((RecyclerView.C16616j) null);
                        this.f17818d.mo4581d(focusPosition, false);
                        FinderImageBanner finderImageBanner2 = this.f17818d;
                        finderImageBanner2.postDelayed(new C3963a(imageAdapter, finderImageBanner2), 500);
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImageBanner(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C13775e eVar = new C13775e();
        this.f17811t = eVar;
        this.f17812u = new C3961b(this);
        C3960a aVar = new C3960a(this, getContext());
        aVar.setOverScrollMode(0);
        aVar.setNestedScrollingEnabled(false);
        aVar.setImportantForAccessibility(2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(aVar.getContext());
        aVar.setLayoutManager(linearLayoutManager);
        linearLayoutManager.f44689u = 3;
        linearLayoutManager.setItemPrefetchEnabled(true);
        linearLayoutManager.mo16974W(0);
        aVar.setAdapter(eVar);
        setMediaView(aVar);
        eVar.registerAdapterDataObserver(this.f17812u);
        addView(getMediaView(), 0, new FrameLayout.LayoutParams(-1, -1));
        this.f17815x = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C3962c(this));
    }

    /* renamed from: b */
    public View mo4376b() {
        RecyclerView.C16631z I0 = ((RecyclerHorizontalViewPager) getMediaView()).mo17023I0(getFocusPosition());
        if (I0 != null) {
            return I0.f44854d;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo4580c(int i, boolean z) {
        RecyclerHorizontalViewPager recyclerHorizontalViewPager = (RecyclerHorizontalViewPager) getMediaView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerHorizontalViewPager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderImageBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerHorizontalViewPager.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerHorizontalViewPager, "com/tencent/mm/plugin/finder/view/FinderImageBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        ((RecyclerHorizontalViewPager) getMediaView()).mo4595x1(i, true, z);
    }

    /* renamed from: d */
    public final void mo4581d(int i, boolean z) {
        RecyclerHorizontalViewPager recyclerHorizontalViewPager = (RecyclerHorizontalViewPager) getMediaView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerHorizontalViewPager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderImageBanner", "smoothScrollTo", "(IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerHorizontalViewPager.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerHorizontalViewPager, "com/tencent/mm/plugin/finder/view/FinderImageBanner", "smoothScrollTo", "(IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
        ((RecyclerHorizontalViewPager) getMediaView()).mo4595x1(i, true, z);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        if (motionEvent.getAction() == 0) {
            mo4584f();
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f17814w) {
            mo4583e();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void mo4583e() {
        Log.m105924i("Finder.ImageBanner", "[startLoopPlay] isAutoPlay:" + this.f17814w);
        this.f17815x.removeMessages(1);
        this.f17815x.sendEmptyMessageDelayed(1, 2500);
    }

    /* renamed from: f */
    public final void mo4584f() {
        Log.m105924i("Finder.ImageBanner", "[stopLoopPlay] isAutoPlay:" + this.f17814w);
        this.f17815x.removeMessages(1);
    }

    public final C13775e getImageAdapter() {
        return this.f17811t;
    }

    public final MediaBannerIndicator getIndicator() {
        return this.f17809r;
    }

    public C4189u7 getMediaType() {
        return this.f17808q;
    }

    public final C4212x6 getPageChangeCallback() {
        return this.f17813v;
    }

    public final RecyclerView getParentRecyclerView() {
        RecyclerView recyclerView = this.f17810s;
        if (recyclerView != null) {
            return recyclerView;
        }
        C87412m.m108603p("parentRecyclerView");
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17814w) {
            mo4583e();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo4584f();
    }

    public final void setAutoPlay(boolean z) {
        this.f17814w = z;
        if (z) {
            mo4583e();
        } else {
            mo4584f();
        }
    }

    public final void setIndicator(MediaBannerIndicator mediaBannerIndicator) {
        this.f17809r = mediaBannerIndicator;
    }

    public void setMediaType(C4189u7 u7Var) {
        C87412m.m108594g(u7Var, "<set-?>");
        this.f17808q = u7Var;
    }

    public final void setPageChangeCallback(C4212x6 x6Var) {
        this.f17813v = x6Var;
    }

    public final void setParentRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "<set-?>");
        this.f17810s = recyclerView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImageBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C13775e eVar = new C13775e();
        this.f17811t = eVar;
        this.f17812u = new C3961b(this);
        C3960a aVar = new C3960a(this, getContext());
        aVar.setOverScrollMode(0);
        aVar.setNestedScrollingEnabled(false);
        aVar.setImportantForAccessibility(2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(aVar.getContext());
        aVar.setLayoutManager(linearLayoutManager);
        linearLayoutManager.f44689u = 3;
        linearLayoutManager.setItemPrefetchEnabled(true);
        linearLayoutManager.mo16974W(0);
        aVar.setAdapter(eVar);
        setMediaView(aVar);
        eVar.registerAdapterDataObserver(this.f17812u);
        addView(getMediaView(), 0, new FrameLayout.LayoutParams(-1, -1));
        this.f17815x = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C3962c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImageBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C13775e eVar = new C13775e();
        this.f17811t = eVar;
        this.f17812u = new C3961b(this);
        C3960a aVar = new C3960a(this, getContext());
        aVar.setOverScrollMode(0);
        aVar.setNestedScrollingEnabled(false);
        aVar.setImportantForAccessibility(2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(aVar.getContext());
        aVar.setLayoutManager(linearLayoutManager);
        linearLayoutManager.f44689u = 3;
        linearLayoutManager.setItemPrefetchEnabled(true);
        linearLayoutManager.mo16974W(0);
        aVar.setAdapter(eVar);
        setMediaView(aVar);
        eVar.registerAdapterDataObserver(this.f17812u);
        addView(getMediaView(), 0, new FrameLayout.LayoutParams(-1, -1));
        this.f17815x = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C3962c(this));
    }
}
