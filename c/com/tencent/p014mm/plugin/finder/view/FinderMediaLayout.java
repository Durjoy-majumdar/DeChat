package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.C18791w;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.view.HardTouchableLayout;
import com.tencent.p014mm.view.MediaBannerIndicator;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import dp1.C7429c2;
import ef1.C58553c;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C87412m;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Metadata;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sr1.C13775e;
import te3.C51538uf1;
import te3.C64689rq2;
import zp3.C23571u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010P\u001a\u00020O\u0012\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bS\u0010TB#\b\u0016\u0012\u0006\u0010P\u001a\u00020O\u0012\b\u0010R\u001a\u0004\u0018\u00010Q\u0012\u0006\u0010U\u001a\u00020\u0004¢\u0006\u0004\bS\u0010VJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106RB\u0010B\u001a\"\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;\u0018\u0001088\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010ARB\u0010F\u001a\"\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;\u0018\u0001088\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR*\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010G8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006W"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderMediaLayout;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/view/w$d;", "Lcom/tencent/mm/plugin/finder/view/w$c;", "", "longPressTimeout", "Lrx3/b0;", "setLongPressTimeout", "Lcom/tencent/mm/plugin/finder/view/u7;", "d", "Lcom/tencent/mm/plugin/finder/view/u7;", "getMediaType", "()Lcom/tencent/mm/plugin/finder/view/u7;", "setMediaType", "(Lcom/tencent/mm/plugin/finder/view/u7;)V", "mediaType", "Lcom/tencent/mm/plugin/finder/view/FinderImageBanner;", "e", "Lrx3/g;", "getImageBanner", "()Lcom/tencent/mm/plugin/finder/view/FinderImageBanner;", "imageBanner", "Lcom/tencent/mm/plugin/finder/view/FinderVideoBanner;", "f", "getVideoBanner", "()Lcom/tencent/mm/plugin/finder/view/FinderVideoBanner;", "videoBanner", "Lcom/tencent/mm/plugin/finder/view/w;", "g", "getTouchDetector", "()Lcom/tencent/mm/plugin/finder/view/w;", "touchDetector", "Lcom/tencent/mm/view/HardTouchableLayout$f;", "h", "Lcom/tencent/mm/view/HardTouchableLayout$f;", "getOnSingleClickListener", "()Lcom/tencent/mm/view/HardTouchableLayout$f;", "setOnSingleClickListener", "(Lcom/tencent/mm/view/HardTouchableLayout$f;)V", "onSingleClickListener", "Lcom/tencent/mm/view/HardTouchableLayout$a;", "i", "Lcom/tencent/mm/view/HardTouchableLayout$a;", "getOnDoubleClickListener", "()Lcom/tencent/mm/view/HardTouchableLayout$a;", "setOnDoubleClickListener", "(Lcom/tencent/mm/view/HardTouchableLayout$a;)V", "onDoubleClickListener", "Lcom/tencent/mm/view/HardTouchableLayout$c;", "j", "Lcom/tencent/mm/view/HardTouchableLayout$c;", "getOnLongClickListener", "()Lcom/tencent/mm/view/HardTouchableLayout$c;", "setOnLongClickListener", "(Lcom/tencent/mm/view/HardTouchableLayout$c;)V", "onLongClickListener", "Lkotlin/Function4;", "Landroid/view/MotionEvent;", "", "", "n", "Lfy3/r;", "getOnScrollListener", "()Lfy3/r;", "setOnScrollListener", "(Lfy3/r;)V", "onScrollListener", "o", "getOnFlingListener", "setOnFlingListener", "onFlingListener", "Lkotlin/Function0;", "p", "Lfy3/a;", "getOnTouchEventUpOrCancel", "()Lfy3/a;", "setOnTouchEventUpOrCancel", "(Lfy3/a;)V", "onTouchEventUpOrCancel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderMediaLayout */
public final class FinderMediaLayout extends FrameLayout implements C18791w.C18795d, C18791w.C18794c {

    /* renamed from: d */
    public C4189u7 f17887d = C4189u7.DEFAULT;

    /* renamed from: e */
    public final C13601g f17888e = C36568h.m40985a(new C4103m3(this));

    /* renamed from: f */
    public final C13601g f17889f = C36568h.m40985a(new C4138o3(this));

    /* renamed from: g */
    public final C13601g f17890g = C36568h.m40985a(new C4121n3(this));

    /* renamed from: h */
    public HardTouchableLayout.C7077f f17891h;

    /* renamed from: i */
    public HardTouchableLayout.C7074a f17892i;

    /* renamed from: j */
    public HardTouchableLayout.C7076c f17893j;

    /* renamed from: n */
    public C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> f17894n;

    /* renamed from: o */
    public C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> f17895o;

    /* renamed from: p */
    public C32224a<C13598b0> f17896p;

    /* renamed from: q */
    public long f17897q = -1;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderMediaLayout$b */
    public static final class C3967b implements C23571u.C23572a {

        /* renamed from: a */
        public final /* synthetic */ FinderMediaLayout f17898a;

        public C3967b(FinderMediaLayout finderMediaLayout) {
            this.f17898a = finderMediaLayout;
        }

        /* renamed from: a */
        public void mo4664a(int i) {
            FinderImageBanner imageBanner = this.f17898a.getImageBanner();
            int i2 = FinderImageBanner.f17807y;
            imageBanner.mo4580c(i, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderMediaLayout$c */
    public static final class C3968c implements C4212x6 {

        /* renamed from: e */
        public final /* synthetic */ FinderMediaLayout f17899e;

        public C3968c(FinderMediaLayout finderMediaLayout) {
            this.f17899e = finderMediaLayout;
        }

        /* renamed from: a */
        public void mo4665a(int i, boolean z, boolean z2) {
            BaseFinderFeed finderFeed = this.f17899e.getImageBanner().getFinderFeed();
            if (i < finderFeed.mo3513o().getMediaList().size()) {
                C64689rq2 rq22 = finderFeed.mo3513o().getMediaList().get(i);
                C87412m.m108593f(rq22, "feed.feedObject.mediaList[position]");
                C64689rq2 rq23 = rq22;
                finderFeed.mo3484R(i);
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = this.f17899e.getContext();
                C87412m.m108593f(context, "context");
                C13442s8 f = aVar.mo12873f(context);
                if (f != null) {
                    C58553c a = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null);
                    long id = finderFeed.mo3513o().getId();
                    String objectNonceId = finderFeed.mo3513o().getObjectNonceId();
                    LinkedList linkedList = new LinkedList(finderFeed.mo3513o().getMediaList());
                    C87412m.m108594g(objectNonceId, "objectNonceId");
                    C7429c2 c2Var = new C7429c2(id, rq23, objectNonceId, i, linkedList, finderFeed, z2);
                    if (a != null) {
                        a.mo83451b(c2Var);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderMediaLayout$d */
    public static final class C3969d implements View.OnTouchListener {

        /* renamed from: d */
        public boolean f17900d;

        /* renamed from: e */
        public final /* synthetic */ FinderMediaLayout f17901e;

        /* renamed from: f */
        public final /* synthetic */ C4190v f17902f;

        public C3969d(FinderMediaLayout finderMediaLayout, C4190v vVar) {
            this.f17901e = finderMediaLayout;
            this.f17902f = vVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderMediaLayout$createMediaView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C87412m.m108594g(view, "v");
            C87412m.m108594g(motionEvent, "event");
            if (motionEvent.getAction() == 0) {
                this.f17900d = this.f17901e.getImageBanner().f17814w;
                this.f17901e.getImageBanner().setAutoPlay(false);
                RecyclerView recyclerView = this.f17902f.f18453a;
                if (recyclerView != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null && (layoutManager instanceof FinderLinearLayoutManager)) {
                        ((FinderLinearLayoutManager) layoutManager).f162357A = false;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f17901e.getImageBanner().setAutoPlay(this.f17900d);
                RecyclerView recyclerView2 = this.f17902f.f18453a;
                if (recyclerView2 != null) {
                    RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
                    if (layoutManager2 != null && (layoutManager2 instanceof FinderLinearLayoutManager)) {
                        ((FinderLinearLayoutManager) layoutManager2).f162357A = true;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/view/FinderMediaLayout$createMediaView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMediaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setId(C0966R.C0970id.ol_);
    }

    private final C18791w getTouchDetector() {
        return (C18791w) this.f17890g.getValue();
    }

    /* renamed from: a */
    public final void mo4635a(BaseFinderFeed baseFinderFeed, C4100m mVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(mVar, "extra");
        FeedData a = FeedData.Companion.mo78883a(baseFinderFeed);
        C4189u7 u7Var = this.f17887d;
        if (u7Var == C4189u7.VIDEO || u7Var == C4189u7.LIVE) {
            getVideoBanner().setFinderFeed(baseFinderFeed);
            FinderVideoBanner videoBanner = getVideoBanner();
            C51538uf1 uf12 = new C51538uf1();
            uf12.f142829e = baseFinderFeed.mo3513o().getRefObjectId();
            uf12.f142828d = baseFinderFeed.mo3513o().getRefObjectFlag();
            uf12.f142830f = baseFinderFeed.mo3513o().getRefObjectContact();
            videoBanner.setRefFeedInfo(uf12);
            FinderVideoCore finderVideoCore = mVar.f18246e;
            C87412m.m108591d(finderVideoCore);
            ((FinderVideoLayout) getVideoBanner().getMediaView()).setVideoCore(finderVideoCore);
            ((FinderVideoLayout) getVideoBanner().getMediaView()).setLongVideo(mVar.f18242a);
            FinderVideoLayout.m65083p((FinderVideoLayout) getVideoBanner().getMediaView(), 0, a, mVar.f18245d, mVar.f18244c, mVar.f18243b, mVar.f18247f, mVar.f18248g, false, false, 384, (Object) null);
        } else if (u7Var == C4189u7.IMAGE) {
            getImageBanner().setFinderFeed(baseFinderFeed);
            RecyclerView.C16613e adapter = ((RecyclerHorizontalViewPager) getImageBanner().getMediaView()).getAdapter();
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.adapter.FinderImageBannerAdapter");
            C13775e eVar = (C13775e) adapter;
            LinkedList<C64689rq2> mediaList = baseFinderFeed.mo3513o().getMediaList();
            if (mediaList != null) {
                eVar.f176359d = mediaList;
                eVar.notifyDataSetChanged();
            }
            eVar.f38893g = true;
            MediaBannerIndicator indicator = getImageBanner().getIndicator();
            if (indicator != null) {
                indicator.setCurrentIndex(0);
            }
            getImageBanner().setAutoPlay(false);
            FinderImageBanner imageBanner = getImageBanner();
            C51538uf1 uf13 = new C51538uf1();
            uf13.f142829e = baseFinderFeed.mo3513o().getRefObjectId();
            uf13.f142828d = baseFinderFeed.mo3513o().getRefObjectFlag();
            uf13.f142830f = baseFinderFeed.mo3513o().getRefObjectContact();
            imageBanner.setRefFeedInfo(uf13);
        }
    }

    /* renamed from: b */
    public final void mo4636b(C4189u7 u7Var, C4190v vVar) {
        C87412m.m108594g(u7Var, "mediaType");
        C87412m.m108594g(vVar, "extra");
        this.f17887d = u7Var;
        if (u7Var == C4189u7.IMAGE) {
            removeView(getImageBanner());
            FinderImageBanner imageBanner = getImageBanner();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C13598b0 b0Var = C13598b0.f38549a;
            addView(imageBanner, 0, layoutParams);
            ((RecyclerHorizontalViewPager) getImageBanner().getMediaView()).setRecycledViewPool(vVar.f18455c);
            FinderImageBanner imageBanner2 = getImageBanner();
            MediaBannerIndicator mediaBannerIndicator = vVar.f18454b;
            if (mediaBannerIndicator != null) {
                imageBanner2.setIndicator(mediaBannerIndicator);
                FinderImageBanner imageBanner3 = getImageBanner();
                RecyclerView recyclerView = vVar.f18453a;
                if (recyclerView != null) {
                    imageBanner3.setParentRecyclerView(recyclerView);
                    MediaBannerIndicator indicator = getImageBanner().getIndicator();
                    if (indicator != null) {
                        indicator.setShowOnlyOneIndicator(true);
                    }
                    MediaBannerIndicator indicator2 = getImageBanner().getIndicator();
                    if (indicator2 != null) {
                        indicator2.setOnSelectedPageListener(new C3967b(this));
                    }
                    getImageBanner().setPageChangeCallback(new C3968c(this));
                    getImageBanner().setOnTouchListener(new C3969d(this, vVar));
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("indicator");
            throw null;
        } else if (u7Var == C4189u7.VIDEO) {
            removeView(getVideoBanner());
            FinderVideoBanner videoBanner = getVideoBanner();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 17;
            C13598b0 b0Var2 = C13598b0.f38549a;
            addView(videoBanner, 0, layoutParams2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            super.dispatchTouchEvent(r4)
            com.tencent.mm.plugin.finder.view.w r0 = r3.getTouchDetector()
            r0.mo23720a(r4)
            int r0 = r4.getAction()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 != 0) goto L_0x0021
            int r4 = r4.getAction()
            r0 = 3
            if (r4 != r0) goto L_0x001f
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0028
        L_0x0021:
            fy3.a<rx3.b0> r4 = r3.f17896p
            if (r4 == 0) goto L_0x0028
            r4.invoke()
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderMediaLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final FinderImageBanner getImageBanner() {
        return (FinderImageBanner) this.f17888e.getValue();
    }

    public final C4189u7 getMediaType() {
        return this.f17887d;
    }

    public final HardTouchableLayout.C7074a getOnDoubleClickListener() {
        return this.f17892i;
    }

    public final C32229r<MotionEvent, MotionEvent, Float, Float, Boolean> getOnFlingListener() {
        return this.f17895o;
    }

    public final HardTouchableLayout.C7076c getOnLongClickListener() {
        return this.f17893j;
    }

    public final C32229r<MotionEvent, MotionEvent, Float, Float, Boolean> getOnScrollListener() {
        return this.f17894n;
    }

    public final HardTouchableLayout.C7077f getOnSingleClickListener() {
        return this.f17891h;
    }

    public final C32224a<C13598b0> getOnTouchEventUpOrCancel() {
        return this.f17896p;
    }

    public final FinderVideoBanner getVideoBanner() {
        return (FinderVideoBanner) this.f17889f.getValue();
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f17897q;
        if (211 <= elapsedRealtime && elapsedRealtime < 300) {
            return false;
        }
        HardTouchableLayout.C7074a aVar = this.f17892i;
        if (aVar != null) {
            aVar.mo2343a(this, motionEvent);
        }
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f17897q = SystemClock.elapsedRealtime();
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar = this.f17895o;
        if (rVar != null) {
            return rVar.mo162I(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)).booleanValue();
        }
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        HardTouchableLayout.C7076c cVar = this.f17893j;
        if (cVar != null) {
            cVar.mo2345a(this, motionEvent);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar = this.f17894n;
        if (rVar != null) {
            return rVar.mo162I(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)).booleanValue();
        }
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        HardTouchableLayout.C7077f fVar = this.f17891h;
        if (fVar == null) {
            return true;
        }
        fVar.mo2341a(this, motionEvent);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public final void setLongPressTimeout(int i) {
        getTouchDetector().f52596f = i;
    }

    public final void setMediaType(C4189u7 u7Var) {
        C87412m.m108594g(u7Var, "<set-?>");
        this.f17887d = u7Var;
    }

    public final void setOnDoubleClickListener(HardTouchableLayout.C7074a aVar) {
        this.f17892i = aVar;
    }

    public final void setOnFlingListener(C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar) {
        this.f17895o = rVar;
    }

    public final void setOnLongClickListener(HardTouchableLayout.C7076c cVar) {
        this.f17893j = cVar;
    }

    public final void setOnScrollListener(C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar) {
        this.f17894n = rVar;
    }

    public final void setOnSingleClickListener(HardTouchableLayout.C7077f fVar) {
        this.f17891h = fVar;
    }

    public final void setOnTouchEventUpOrCancel(C32224a<C13598b0> aVar) {
        this.f17896p = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMediaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setId(C0966R.C0970id.ol_);
    }
}
