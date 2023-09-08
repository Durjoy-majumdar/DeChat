package com.tencent.p014mm.plugin.finder.view.base;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.view.MediaBanner;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import oj3.C62036a;
import oj3.C62040b;
import zp3.C23571u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010I\u001a\u00020H\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bL\u0010MB#\b\u0016\u0012\u0006\u0010I\u001a\u00020H\u0012\b\u0010K\u001a\u0004\u0018\u00010J\u0012\u0006\u0010N\u001a\u000201¢\u0006\u0004\bL\u0010OR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R:\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010%\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\"8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u00100\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020)8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006P"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/base/MediaPlayBanner;", "Landroid/widget/FrameLayout;", "", "d", "F", "getSmoothScrollerSpeed", "()F", "setSmoothScrollerSpeed", "(F)V", "smoothScrollerSpeed", "Landroidx/recyclerview/widget/LinearLayoutManager;", "value", "e", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "layoutManager", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "f", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "getRecyclerView", "()Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$e;", "Loj3/b;", "g", "Landroidx/recyclerview/widget/RecyclerView$e;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$e;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$e;)V", "adapter", "", "h", "Z", "isAutoPlay", "()Z", "setAutoPlay", "(Z)V", "", "i", "J", "getPlayLoopDurationMs", "()J", "setPlayLoopDurationMs", "(J)V", "playLoopDurationMs", "", "j", "I", "getFocusPosition", "()I", "setFocusPosition", "(I)V", "focusPosition", "Lzp3/u;", "n", "Lzp3/u;", "getIndicator", "()Lzp3/u;", "setIndicator", "(Lzp3/u;)V", "indicator", "Lcom/tencent/mm/view/MediaBanner$b;", "pageChangeCallback", "Lcom/tencent/mm/view/MediaBanner$b;", "getPageChangeCallback", "()Lcom/tencent/mm/view/MediaBanner$b;", "setPageChangeCallback", "(Lcom/tencent/mm/view/MediaBanner$b;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.base.MediaPlayBanner */
public class MediaPlayBanner extends FrameLayout {

    /* renamed from: d */
    public float f52571d = 60.0f;

    /* renamed from: e */
    public LinearLayoutManager f52572e;

    /* renamed from: f */
    public final RecyclerHorizontalViewPager f52573f;

    /* renamed from: g */
    public RecyclerView.C16613e<C62040b> f52574g;

    /* renamed from: h */
    public boolean f52575h;

    /* renamed from: i */
    public long f52576i;

    /* renamed from: j */
    public int f52577j;

    /* renamed from: n */
    public C23571u f52578n;

    /* renamed from: o */
    public final C18784a f52579o;

    /* renamed from: p */
    public final MMHandler f52580p;

    /* renamed from: com.tencent.mm.plugin.finder.view.base.MediaPlayBanner$a */
    public static final class C18784a extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ MediaPlayBanner f52581a;

        public C18784a(MediaPlayBanner mediaPlayBanner) {
            this.f52581a = mediaPlayBanner;
        }

        /* renamed from: b */
        public void mo2556b() {
            RecyclerView.C16613e<C62040b> adapter = this.f52581a.getAdapter();
            if (adapter != null) {
                MediaPlayBanner mediaPlayBanner = this.f52581a;
                C23571u indicator = mediaPlayBanner.getIndicator();
                if (indicator != null) {
                    indicator.setCount(adapter.getItemCount());
                }
                C23571u indicator2 = mediaPlayBanner.getIndicator();
                if ((indicator2 != null ? indicator2.getCount() : 0) > 0) {
                    RecyclerHorizontalViewPager recyclerView = mediaPlayBanner.getRecyclerView();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager = recyclerView;
                    C117292a.m165358d(recyclerHorizontalViewPager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(recyclerHorizontalViewPager, "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            C23571u indicator;
            RecyclerView.C16613e<C62040b> adapter = this.f52581a.getAdapter();
            if (adapter != null && (indicator = this.f52581a.getIndicator()) != null) {
                indicator.setCount(adapter.getItemCount());
            }
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            C23571u indicator;
            RecyclerView.C16613e<C62040b> adapter = this.f52581a.getAdapter();
            if (adapter != null && (indicator = this.f52581a.getIndicator()) != null) {
                indicator.setCount(adapter.getItemCount());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.base.MediaPlayBanner$b */
    public static final class C18785b implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ MediaPlayBanner f52582d;

        /* renamed from: com.tencent.mm.plugin.finder.view.base.MediaPlayBanner$b$a */
        public static final class C18786a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ RecyclerView.C16613e<C62040b> f52583d;

            /* renamed from: e */
            public final /* synthetic */ MediaPlayBanner f52584e;

            public C18786a(RecyclerView.C16613e<C62040b> eVar, MediaPlayBanner mediaPlayBanner) {
                this.f52583d = eVar;
                this.f52584e = mediaPlayBanner;
            }

            public final void run() {
                RecyclerView.C16613e<C62040b> eVar = this.f52583d;
                ((C62036a) eVar).mo86984u5(((C62036a) eVar).getItemCount() - 1);
                ((C62036a) this.f52583d).registerAdapterDataObserver(this.f52584e.f52579o);
                MediaPlayBanner mediaPlayBanner = this.f52584e;
                RecyclerHorizontalViewPager recyclerHorizontalViewPager = mediaPlayBanner.f52573f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(recyclerHorizontalViewPager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerHorizontalViewPager.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerHorizontalViewPager, "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
                mediaPlayBanner.f52573f.mo4595x1(0, true, true);
                MediaPlayBanner.m19540b(this.f52584e, 0, 1, (Object) null);
            }
        }

        public C18785b(MediaPlayBanner mediaPlayBanner) {
            this.f52582d = mediaPlayBanner;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r10, r0)
                int r0 = r10.what
                r1 = 1
                if (r0 != r1) goto L_0x00a6
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r0 = r9.f52582d
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                r2 = 0
                if (r0 == 0) goto L_0x0018
                int r0 = r0.getItemCount()
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                if (r0 <= r1) goto L_0x00a6
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r0 = r9.f52582d
                int r0 = r0.getFocusPosition()
                int r0 = r0 + r1
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r3 = r9.f52582d
                androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
                if (r3 == 0) goto L_0x002f
                int r3 = r3.getItemCount()
                goto L_0x0030
            L_0x002f:
                r3 = 0
            L_0x0030:
                r4 = 0
                if (r0 >= r3) goto L_0x0040
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r10 = r9.f52582d
                r10.mo23698a(r0, r1)
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r10 = r9.f52582d
                r2 = 0
                com.tencent.p014mm.plugin.finder.view.base.MediaPlayBanner.m19540b(r10, r2, r1, r4)
                goto L_0x00a6
            L_0x0040:
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r3 = r9.f52582d
                androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
                if (r3 == 0) goto L_0x004d
                int r3 = r3.getItemCount()
                goto L_0x004e
            L_0x004d:
                r3 = 0
            L_0x004e:
                if (r0 != r3) goto L_0x00a6
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r3 = r9.f52582d
                androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
                boolean r5 = r3 instanceof oj3.C62036a
                if (r5 == 0) goto L_0x00a6
                r5 = r3
                oj3.a r5 = (oj3.C62036a) r5     // Catch:{ Exception -> 0x0064 }
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r6 = r9.f52582d     // Catch:{ Exception -> 0x0064 }
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner$a r6 = r6.f52579o     // Catch:{ Exception -> 0x0064 }
                r5.unregisterAdapterDataObserver(r6)     // Catch:{ Exception -> 0x0064 }
            L_0x0064:
                r5 = r3
                oj3.a r5 = (oj3.C62036a) r5
                int r6 = r5.getItemCount()
                java.util.List<T> r7 = r5.f176359d
                java.lang.Object r7 = r7.get(r2)
                java.util.List<T> r8 = r5.f176359d
                r8.add(r6, r7)
                r5.notifyItemInserted(r6)
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r5 = r9.f52582d
                com.tencent.mm.view.RecyclerHorizontalViewPager r5 = r5.getRecyclerView()
                r5.setItemAnimator(r4)
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r5 = r9.f52582d
                r5.mo23698a(r0, r2)
                java.lang.Object r10 = r10.obj
                boolean r0 = r10 instanceof java.lang.Long
                if (r0 == 0) goto L_0x0090
                r4 = r10
                java.lang.Long r4 = (java.lang.Long) r4
            L_0x0090:
                if (r4 == 0) goto L_0x0097
                long r4 = r4.longValue()
                goto L_0x0099
            L_0x0097:
                r4 = 2500(0x9c4, double:1.235E-320)
            L_0x0099:
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r10 = r9.f52582d
                com.tencent.mm.plugin.finder.view.base.MediaPlayBanner$b$a r0 = new com.tencent.mm.plugin.finder.view.base.MediaPlayBanner$b$a
                r0.<init>(r3, r10)
                r2 = 5
                long r2 = (long) r2
                long r4 = r4 / r2
                r10.postDelayed(r0, r4)
            L_0x00a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.base.MediaPlayBanner.C18785b.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.base.MediaPlayBanner$c */
    public static final class C18787c implements RecyclerHorizontalViewPager.C57875a {

        /* renamed from: d */
        public final /* synthetic */ MediaPlayBanner f52585d;

        public C18787c(MediaPlayBanner mediaPlayBanner) {
            this.f52585d = mediaPlayBanner;
        }

        /* renamed from: a */
        public void mo23719a(int i, boolean z, boolean z2) {
            this.f52585d.setFocusPosition(i);
            C23571u indicator = this.f52585d.getIndicator();
            if (indicator != null) {
                indicator.setCurrentIndex(i);
            }
            MediaBanner.C19881b pageChangeCallback = this.f52585d.getPageChangeCallback();
            if (pageChangeCallback != null) {
                pageChangeCallback.mo26567a(i, z, z2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaPlayBanner(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        MediaPlayBanner$layoutManager$1 mediaPlayBanner$layoutManager$1 = new MediaPlayBanner$layoutManager$1(this, getContext());
        mediaPlayBanner$layoutManager$1.mo16974W(0);
        this.f52572e = mediaPlayBanner$layoutManager$1;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        RecyclerHorizontalViewPager recyclerHorizontalViewPager = new RecyclerHorizontalViewPager(context2);
        recyclerHorizontalViewPager.setPageChangeListener(new C18787c(this));
        recyclerHorizontalViewPager.setLayoutManager(this.f52572e);
        addView(recyclerHorizontalViewPager, new FrameLayout.LayoutParams(-1, -1));
        this.f52573f = recyclerHorizontalViewPager;
        this.f52576i = 2500;
        this.f52579o = new C18784a(this);
        this.f52580p = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C18785b(this));
    }

    /* renamed from: b */
    public static void m19540b(MediaPlayBanner mediaPlayBanner, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = mediaPlayBanner.f52576i;
            }
            if (mediaPlayBanner.f52575h) {
                mediaPlayBanner.f52580p.removeMessages(1);
                mediaPlayBanner.f52580p.sendMessageDelayed(mediaPlayBanner.f52580p.obtainMessage(1, Long.valueOf(j)), j);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoopPlay");
    }

    /* renamed from: a */
    public final void mo23698a(int i, boolean z) {
        RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f52573f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerHorizontalViewPager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner", "smoothScrollTo", "(IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerHorizontalViewPager.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerHorizontalViewPager, "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner", "smoothScrollTo", "(IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
        this.f52573f.mo4595x1(i, true, z);
    }

    public final RecyclerView.C16613e<C62040b> getAdapter() {
        return this.f52574g;
    }

    public final int getFocusPosition() {
        return this.f52577j;
    }

    public final C23571u getIndicator() {
        return this.f52578n;
    }

    public final LinearLayoutManager getLayoutManager() {
        return this.f52572e;
    }

    public final MediaBanner.C19881b getPageChangeCallback() {
        return null;
    }

    public final long getPlayLoopDurationMs() {
        return this.f52576i;
    }

    public final RecyclerHorizontalViewPager getRecyclerView() {
        return this.f52573f;
    }

    public final float getSmoothScrollerSpeed() {
        return this.f52571d;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f52575h) {
            m19540b(this, 0, 1, (Object) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52580p.removeMessages(1);
    }

    public final void setAdapter(RecyclerView.C16613e<C62040b> eVar) {
        this.f52574g = eVar;
        this.f52573f.setAdapter(eVar);
        try {
            RecyclerView.C16613e<C62040b> eVar2 = this.f52574g;
            if (eVar2 != null) {
                eVar2.unregisterAdapterDataObserver(this.f52579o);
            }
        } catch (Throwable unused) {
        }
        RecyclerView.C16613e<C62040b> eVar3 = this.f52574g;
        if (eVar3 != null) {
            eVar3.registerAdapterDataObserver(this.f52579o);
        }
    }

    public final void setAutoPlay(boolean z) {
        this.f52575h = z;
        if (z) {
            m19540b(this, 0, 1, (Object) null);
        } else {
            this.f52580p.removeMessages(1);
        }
    }

    public final void setFocusPosition(int i) {
        this.f52577j = i;
    }

    public final void setIndicator(C23571u uVar) {
        this.f52578n = uVar;
    }

    public final void setLayoutManager(LinearLayoutManager linearLayoutManager) {
        C87412m.m108594g(linearLayoutManager, "value");
        this.f52572e = linearLayoutManager;
        this.f52573f.setLayoutManager(linearLayoutManager);
    }

    public final void setPageChangeCallback(MediaBanner.C19881b bVar) {
    }

    public final void setPlayLoopDurationMs(long j) {
        this.f52576i = j;
        if (this.f52575h) {
            this.f52580p.removeMessages(1);
            this.f52580p.sendMessageDelayed(this.f52580p.obtainMessage(1, Long.valueOf(j)), j);
        }
    }

    public final void setSmoothScrollerSpeed(float f) {
        this.f52571d = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaPlayBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        MediaPlayBanner$layoutManager$1 mediaPlayBanner$layoutManager$1 = new MediaPlayBanner$layoutManager$1(this, getContext());
        mediaPlayBanner$layoutManager$1.mo16974W(0);
        this.f52572e = mediaPlayBanner$layoutManager$1;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        RecyclerHorizontalViewPager recyclerHorizontalViewPager = new RecyclerHorizontalViewPager(context2);
        recyclerHorizontalViewPager.setPageChangeListener(new C18787c(this));
        recyclerHorizontalViewPager.setLayoutManager(this.f52572e);
        addView(recyclerHorizontalViewPager, new FrameLayout.LayoutParams(-1, -1));
        this.f52573f = recyclerHorizontalViewPager;
        this.f52576i = 2500;
        this.f52579o = new C18784a(this);
        this.f52580p = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C18785b(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaPlayBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        MediaPlayBanner$layoutManager$1 mediaPlayBanner$layoutManager$1 = new MediaPlayBanner$layoutManager$1(this, getContext());
        mediaPlayBanner$layoutManager$1.mo16974W(0);
        this.f52572e = mediaPlayBanner$layoutManager$1;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        RecyclerHorizontalViewPager recyclerHorizontalViewPager = new RecyclerHorizontalViewPager(context2);
        recyclerHorizontalViewPager.setPageChangeListener(new C18787c(this));
        recyclerHorizontalViewPager.setLayoutManager(this.f52572e);
        addView(recyclerHorizontalViewPager, new FrameLayout.LayoutParams(-1, -1));
        this.f52573f = recyclerHorizontalViewPager;
        this.f52576i = 2500;
        this.f52579o = new C18784a(this);
        this.f52580p = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C18785b(this));
    }
}
