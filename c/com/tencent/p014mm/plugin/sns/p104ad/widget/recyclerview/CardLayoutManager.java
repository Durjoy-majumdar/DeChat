package com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager */
public class CardLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: d */
    public int f54215d;

    /* renamed from: e */
    public int f54216e = -1;

    /* renamed from: f */
    public int f54217f = -1;

    /* renamed from: g */
    public int f54218g = 3;

    /* renamed from: h */
    public int f54219h;

    /* renamed from: i */
    public int f54220i = Integer.MIN_VALUE;

    /* renamed from: j */
    public int f54221j = Integer.MIN_VALUE;

    /* renamed from: n */
    public float f54222n = 0.0f;

    /* renamed from: o */
    public boolean f54223o = true;

    /* renamed from: p */
    public C19245a f54224p;

    /* renamed from: q */
    public int f54225q = 0;

    /* renamed from: r */
    public C19248d f54226r;

    /* renamed from: s */
    public final C19249e f54227s = new C19249e();

    /* renamed from: t */
    public final RecyclerView f54228t;

    /* renamed from: u */
    public C19247c f54229u;

    /* renamed from: v */
    public boolean f54230v = false;

    /* renamed from: w */
    public boolean f54231w = false;

    /* renamed from: x */
    public int f54232x = 0;

    /* renamed from: y */
    public int f54233y;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$a */
    public static class C19245a implements Handler.Callback {

        /* renamed from: d */
        public final Handler f54234d;

        /* renamed from: e */
        public final WeakReference<CardLayoutManager> f54235e;

        public C19245a(Context context, CardLayoutManager cardLayoutManager) {
            this.f54234d = new Handler(context.getMainLooper(), this);
            this.f54235e = new WeakReference<>(cardLayoutManager);
        }

        /* renamed from: a */
        public void mo24718a() {
            SnsMethodCalculate.markStartTimeMs("cancel", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            Handler handler = this.f54234d;
            if (handler != null) {
                handler.removeMessages(0);
            }
            SnsMethodCalculate.markEndTimeMs("cancel", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        }

        /* renamed from: b */
        public final boolean mo24719b() {
            CardLayoutManager cardLayoutManager;
            RecyclerView recyclerView;
            SnsMethodCalculate.markStartTimeMs("handleScrollMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            WeakReference<CardLayoutManager> weakReference = this.f54235e;
            if (weakReference == null || (cardLayoutManager = weakReference.get()) == null) {
                SnsMethodCalculate.markEndTimeMs("handleScrollMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                return false;
            }
            SnsMethodCalculate.markStartTimeMs("notifyAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            SnsMethodCalculate.markStartTimeMs("getScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            C19247c cVar = cardLayoutManager.f54229u;
            SnsMethodCalculate.markEndTimeMs("getScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            if (cVar != null) {
                cVar.mo24722b((cardLayoutManager.mo24713v() + 1) % cardLayoutManager.getItemCount());
            }
            SnsMethodCalculate.markEndTimeMs("notifyAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            SnsMethodCalculate.markStartTimeMs("smoothScrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            if (cardLayoutManager.f54230v && (recyclerView = cardLayoutManager.f54228t) != null && recyclerView.isAttachedToWindow()) {
                cardLayoutManager.f54232x = 1;
                RecyclerView recyclerView2 = cardLayoutManager.f54228t;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(cardLayoutManager.f54221j + 1));
                RecyclerView recyclerView3 = recyclerView2;
                C117292a.m165358d(recyclerView3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/CardLayoutManager", "smoothScrollToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView2.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView3, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/CardLayoutManager", "smoothScrollToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
            SnsMethodCalculate.markEndTimeMs("smoothScrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            SnsMethodCalculate.markEndTimeMs("handleScrollMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            return true;
        }

        public boolean handleMessage(Message message) {
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            if (message == null) {
                SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                return false;
            }
            if (message.what == 0) {
                try {
                    boolean b = mo24719b();
                    SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                    return b;
                } catch (Throwable unused) {
                }
            }
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$b */
    public class C19246b extends RecyclerView.C16633n {
        public C19246b() {
        }

        /* renamed from: a */
        public boolean mo17379a(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$FlingListener");
            try {
                Log.m105918d("SnsAd.CardLayoutManager", "on fling called velocityX = " + i);
                CardLayoutManager cardLayoutManager = CardLayoutManager.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                cardLayoutManager.getClass();
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                if (i > 0) {
                    CardLayoutManager.this.f54225q = 2;
                } else {
                    CardLayoutManager cardLayoutManager2 = CardLayoutManager.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                    cardLayoutManager2.getClass();
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                    if (i < 0) {
                        CardLayoutManager.this.f54225q = 1;
                    }
                }
                CardLayoutManager cardLayoutManager3 = CardLayoutManager.this;
                if (cardLayoutManager3.f54225q != 0) {
                    cardLayoutManager3.f54223o = true;
                }
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                cardLayoutManager3.mo24710s();
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$FlingListener");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$c */
    public interface C19247c {
        /* renamed from: a */
        void mo24721a(CardLayoutManager cardLayoutManager, int i);

        /* renamed from: b */
        void mo24722b(int i);

        /* renamed from: c */
        void mo24723c(CardLayoutManager cardLayoutManager, int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$d */
    public static abstract class C19248d {

        /* renamed from: a */
        public int f54237a;

        /* renamed from: b */
        public int f54238b;

        /* renamed from: c */
        public CardLayoutManager f54239c;

        /* renamed from: a */
        public abstract void mo24724a(View view);

        /* renamed from: b */
        public abstract void mo24725b(int i, float f, View view, int i2, int i3);

        /* renamed from: c */
        public abstract boolean mo24726c(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, int i, int i2);

        /* renamed from: d */
        public abstract float mo24727d();

        /* renamed from: e */
        public CardLayoutManager mo24728e() {
            SnsMethodCalculate.markStartTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            CardLayoutManager cardLayoutManager = this.f54239c;
            SnsMethodCalculate.markEndTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            return cardLayoutManager;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$e */
    public class C19249e {

        /* renamed from: a */
        public SparseBooleanArray f54240a = new SparseBooleanArray();

        /* renamed from: b */
        public List<Integer> f54241b = new LinkedList();

        public C19249e() {
        }

        /* renamed from: a */
        public void mo24729a(RecyclerView.C16625r rVar) {
            SnsMethodCalculate.markStartTimeMs("recycle", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            SparseBooleanArray sparseBooleanArray = this.f54240a;
            List<Integer> list = this.f54241b;
            if (sparseBooleanArray == null || sparseBooleanArray.size() == 0 || list == null) {
                SnsMethodCalculate.markEndTimeMs("recycle", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
                return;
            }
            LinkedList linkedList = (LinkedList) list;
            linkedList.clear();
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                int keyAt = sparseBooleanArray.keyAt(i);
                boolean z = sparseBooleanArray.get(keyAt);
                if (keyAt >= 0 && keyAt < CardLayoutManager.this.f54219h && !z) {
                    View e = rVar.mo17341e(keyAt);
                    Log.m105918d("SnsAd.CardLayoutManager", "pos is " + keyAt + ", recycle view " + e);
                    CardLayoutManager.this.removeAndRecycleView(e, rVar);
                    linkedList.add(Integer.valueOf(keyAt));
                }
            }
            for (Integer next : list) {
                if (next != null) {
                    sparseBooleanArray.delete(next.intValue());
                }
            }
            rVar.mo17338b();
            SnsMethodCalculate.markEndTimeMs("recycle", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$f */
    public static class C19250f {

        /* renamed from: a */
        public int f54243a;

        /* renamed from: b */
        public int f54244b;
    }

    public CardLayoutManager(RecyclerView recyclerView) {
        this.f54228t = recyclerView;
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(new C19246b());
            this.f54224p = new C19245a(recyclerView.getContext(), this);
            Log.m105924i("SnsAd.CardLayoutManager", "new CardLayoutManager, and recyclerView hashCode is " + recyclerView.hashCode());
            return;
        }
        Log.m105920e("SnsAd.CardLayoutManager", "the layout manager will not work properly, because of null recycler view!!!");
    }

    /* renamed from: A */
    public final void mo24703A(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("notifyVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        Log.m105918d("SnsAd.CardLayoutManager", "firstVirtualPosition is " + i + ", lastVirtualPosition " + i2 + ", should notify " + this.f54231w);
        C19247c cVar = this.f54229u;
        if (!(!this.f54231w || cVar == null || i == Integer.MIN_VALUE)) {
            int G = mo24709G(i);
            int i3 = -1;
            if (i2 != Integer.MIN_VALUE) {
                i3 = mo24709G(i2);
            }
            cVar.mo24723c(this, G, i3);
        }
        this.f54231w = false;
        SnsMethodCalculate.markEndTimeMs("notifyVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    /* renamed from: B */
    public void mo24704B(int i) {
        SnsMethodCalculate.markStartTimeMs("onScrollStateChangedInternal", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        super.onScrollStateChanged(i);
        Log.m105918d("SnsAd.CardLayoutManager", "the onScrollStateChanged is called, state = " + i);
        C19247c cVar = this.f54229u;
        if (cVar != null) {
            cVar.mo24721a(this, i);
        }
        if (i == 0) {
            Log.m105918d("SnsAd.CardLayoutManager", "the onScrollStateChanged is called, mScrollFixed = " + this.f54223o);
            if (!this.f54223o) {
                mo24710s();
                this.f54223o = true;
            } else {
                mo24703A(this.f54221j, this.f54220i);
            }
        } else if (i == 1) {
            this.f54223o = false;
            C19248d dVar = this.f54226r;
            if (this.f54232x == 1 && dVar != null) {
                float w = mo24714w();
                dVar.mo24727d();
                if (w > 0.5f) {
                    this.f54231w = true;
                    this.f54232x = 0;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInternal", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    /* renamed from: C */
    public void mo24705C() {
        SnsMethodCalculate.markStartTimeMs("scrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            C19245a aVar = this.f54224p;
            if (aVar != null) {
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("scrollImmediately", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                if (aVar.f54234d != null) {
                    aVar.mo24718a();
                    aVar.f54234d.sendEmptyMessage(0);
                }
                SnsMethodCalculate.markEndTimeMs("scrollImmediately", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("scrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    /* renamed from: D */
    public void mo24706D(long j) {
        SnsMethodCalculate.markStartTimeMs("scrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            C19245a aVar = this.f54224p;
            if (aVar != null && j > 0) {
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("delayScroll", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                if (aVar.f54234d != null) {
                    aVar.mo24718a();
                    aVar.f54234d.sendEmptyMessageDelayed(0, j);
                }
                SnsMethodCalculate.markEndTimeMs("delayScroll", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("scrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    /* renamed from: E */
    public void mo24707E(C19248d dVar) {
        SnsMethodCalculate.markStartTimeMs("setLayoutHelper", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f54226r = dVar;
        if (dVar != null) {
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setLayoutManager", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            dVar.f54239c = this;
            SnsMethodCalculate.markEndTimeMs("setLayoutManager", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        }
        SnsMethodCalculate.markEndTimeMs("setLayoutHelper", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    /* renamed from: F */
    public void mo24708F(C19247c cVar) {
        SnsMethodCalculate.markStartTimeMs("setScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f54229u = cVar;
        SnsMethodCalculate.markEndTimeMs("setScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    /* renamed from: G */
    public int mo24709G(int i) {
        SnsMethodCalculate.markStartTimeMs("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i2 = this.f54219h;
        if (i2 == 0) {
            SnsMethodCalculate.markEndTimeMs("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        } else if (i >= 0) {
            int i3 = i % i2;
            SnsMethodCalculate.markEndTimeMs("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i3;
        } else if (i % i2 == 0) {
            SnsMethodCalculate.markEndTimeMs("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        } else {
            int i4 = i2 + (i % i2);
            SnsMethodCalculate.markEndTimeMs("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i4;
        }
    }

    public boolean canScrollHorizontally() {
        SnsMethodCalculate.markStartTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        boolean z = this.f54216e > 0 && this.f54217f > 0;
        SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return z;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        SnsMethodCalculate.markStartTimeMs("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
        SnsMethodCalculate.markEndTimeMs("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return layoutParams;
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C16625r rVar) {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        super.onDetachedFromWindow(recyclerView, rVar);
        if (this.f54233y == 0) {
            this.f54215d = 0;
            this.f54221j = Integer.MIN_VALUE;
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        SnsMethodCalculate.markStartTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f54230v = false;
        if (wVar == null || rVar == null) {
            Log.m105920e("SnsAd.CardLayoutManager", "the state or recycler is null!!! Right?");
            SnsMethodCalculate.markEndTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        try {
            int b = wVar.mo17354b();
            this.f54219h = b;
            if (b != 0) {
                if (!wVar.f44838g) {
                    if (this.f54216e == -1 || this.f54217f == -1) {
                        mo24711t(rVar);
                    }
                    detachAndScrapAttachedViews(rVar);
                    mo24717z(rVar, 0);
                    SnsMethodCalculate.markEndTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                    return;
                }
            }
            Log.m105918d("SnsAd.CardLayoutManager", "there is no item or is pre layout remove all cached view!!");
            removeAndRecycleAllViews(rVar);
            SnsMethodCalculate.markEndTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        } catch (Throwable unused) {
        }
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        SnsMethodCalculate.markStartTimeMs("onLayoutCompleted", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            super.onLayoutCompleted(wVar);
            if (!this.f54230v) {
                mo24703A(this.f54221j, this.f54220i);
            }
            this.f54230v = true;
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onLayoutCompleted", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void onMeasure(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            C19248d dVar = this.f54226r;
            if (dVar == null || !dVar.mo24726c(rVar, wVar, i, i2)) {
                super.onMeasure(rVar, wVar, i, i2);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void onScrollStateChanged(int i) {
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            mo24704B(i);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    /* renamed from: s */
    public final void mo24710s() {
        SnsMethodCalculate.markStartTimeMs("calculateAndScrollToFixedTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int x = mo24715x();
        SnsMethodCalculate.markStartTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i = this.f54225q;
        this.f54225q = 0;
        if (i == 2) {
            x++;
            SnsMethodCalculate.markEndTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        } else if (i == 1) {
            SnsMethodCalculate.markEndTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        } else if (mo24714w() < 0.5f) {
            SnsMethodCalculate.markEndTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        } else {
            x++;
            SnsMethodCalculate.markEndTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        }
        SnsMethodCalculate.markStartTimeMs("scrollToTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        SnsMethodCalculate.markStartTimeMs("getPositionOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        SnsMethodCalculate.markEndTimeMs("getPositionOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f54228t.smoothScrollBy((x * this.f54216e) - this.f54215d, 0);
        SnsMethodCalculate.markEndTimeMs("scrollToTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        SnsMethodCalculate.markEndTimeMs("calculateAndScrollToFixedTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        SnsMethodCalculate.markStartTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            C19249e eVar = this.f54227s;
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("reverseValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            SparseBooleanArray sparseBooleanArray = eVar.f54240a;
            if (sparseBooleanArray == null) {
                SnsMethodCalculate.markEndTimeMs("reverseValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            } else {
                for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                    sparseBooleanArray.put(sparseBooleanArray.keyAt(i2), false);
                }
                SnsMethodCalculate.markEndTimeMs("reverseValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            }
            this.f54215d += i;
            detachAndScrapAttachedViews(rVar);
            mo24717z(rVar, i);
            this.f54227s.mo24729a(rVar);
            SnsMethodCalculate.markEndTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        SnsMethodCalculate.markStartTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (wVar == null || this.f54216e == 0 || this.f54217f == 0) {
            SnsMethodCalculate.markEndTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        try {
            if (wVar.mo17354b() == 0) {
                Log.m105918d("SnsAd.CardLayoutManager", "the item is 0, can't smooth scroll.");
                SnsMethodCalculate.markEndTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                return;
            }
            Log.m105918d("SnsAd.CardLayoutManager", "smoothScrollToPosition the position is " + i);
            SnsMethodCalculate.markStartTimeMs("getPositionOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            SnsMethodCalculate.markEndTimeMs("getPositionOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            recyclerView.smoothScrollBy((i * this.f54216e) - this.f54215d, 0);
            SnsMethodCalculate.markEndTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: t */
    public void mo24711t(RecyclerView.C16625r rVar) {
        SnsMethodCalculate.markStartTimeMs("calculateChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        C19248d dVar = this.f54226r;
        if (dVar == null) {
            SnsMethodCalculate.markEndTimeMs("calculateChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        View e = rVar.mo17341e(0);
        dVar.mo24724a(e);
        addView(e);
        measureChildWithMargins(e, 0, 0);
        this.f54216e = getDecoratedMeasuredWidth(e);
        this.f54217f = getDecoratedMeasuredHeight(e);
        SnsMethodCalculate.markStartTimeMs("setVisibleCount", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        SnsMethodCalculate.markEndTimeMs("setVisibleCount", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        int i = this.f54216e;
        int i2 = this.f54217f;
        SnsMethodCalculate.markStartTimeMs("setChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        dVar.f54237a = i;
        dVar.f54238b = i2;
        SnsMethodCalculate.markEndTimeMs("setChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        SnsMethodCalculate.markEndTimeMs("calculateChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    /* renamed from: u */
    public void mo24712u() {
        SnsMethodCalculate.markStartTimeMs("cancelScrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            C19245a aVar = this.f54224p;
            if (aVar != null) {
                aVar.mo24718a();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("cancelScrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    /* renamed from: v */
    public int mo24713v() {
        SnsMethodCalculate.markStartTimeMs("getCurrentAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            if (this.f54230v) {
                int G = mo24709G(this.f54221j);
                SnsMethodCalculate.markEndTimeMs("getCurrentAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                return G;
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("getCurrentAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return -1;
    }

    /* renamed from: w */
    public float mo24714w() {
        SnsMethodCalculate.markStartTimeMs("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i = this.f54216e;
        if (i <= 0 || this.f54217f <= 0) {
            SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0.0f;
        }
        int i2 = this.f54215d;
        if (i2 >= 0) {
            float f = (((float) (i2 % i)) * 1.0f) / ((float) i);
            SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return f;
        } else if (i2 % i == 0) {
            SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0.0f;
        } else {
            float f2 = ((((float) (i2 % i)) * 1.0f) / ((float) i)) + 1.0f;
            SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return f2;
        }
    }

    /* renamed from: x */
    public int mo24715x() {
        SnsMethodCalculate.markStartTimeMs("getFirstVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i = this.f54216e;
        if (i <= 0 || this.f54217f <= 0) {
            SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        }
        int floor = (int) Math.floor((((double) this.f54215d) * 1.0d) / ((double) i));
        SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return floor;
    }

    /* renamed from: y */
    public RecyclerView.C16631z mo24716y(int i) {
        SnsMethodCalculate.markStartTimeMs("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        RecyclerView recyclerView = this.f54228t;
        if (recyclerView == null) {
            SnsMethodCalculate.markEndTimeMs("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return null;
        }
        try {
            for (int childCount = recyclerView.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f54228t.getChildAt(childCount);
                if (this.f54228t.mo17029N0(childAt) == i) {
                    RecyclerView.C16631z P0 = this.f54228t.mo17031P0(childAt);
                    SnsMethodCalculate.markEndTimeMs("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                    return P0;
                }
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return null;
    }

    /* renamed from: z */
    public void mo24717z(RecyclerView.C16625r rVar, int i) {
        SnsMethodCalculate.markStartTimeMs("layoutChildView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (this.f54219h == 0 || this.f54216e <= 0 || this.f54217f <= 0 || this.f54226r == null) {
            SnsMethodCalculate.markEndTimeMs("layoutChildView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        int x = mo24715x();
        SnsMethodCalculate.markStartTimeMs("getLastVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int x2 = mo24715x() + this.f54218g;
        SnsMethodCalculate.markEndTimeMs("getLastVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        float w = mo24714w();
        this.f54226r.mo24727d();
        if (this.f54222n > 0.5f && w < 0.5f && i < 0) {
            w = 0.5f;
        }
        for (int i2 = x; i2 <= x2; i2++) {
            int G = mo24709G(i2);
            if (G < 0 || G >= this.f54219h) {
                RecyclerView.C16625r rVar2 = rVar;
            } else {
                View e = rVar.mo17341e(G);
                this.f54226r.mo24724a(e);
                if (!(e == null || this.f54227s == null)) {
                    addView(e, 0);
                    measureChildWithMargins(e, 0, 0);
                    this.f54226r.mo24725b(this.f54215d, w, e, i2 - x, i);
                    C19249e eVar = this.f54227s;
                    eVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("setPositionValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
                    SparseBooleanArray sparseBooleanArray = eVar.f54240a;
                    if (sparseBooleanArray != null) {
                        sparseBooleanArray.append(G, true);
                    }
                    SnsMethodCalculate.markEndTimeMs("setPositionValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
                }
            }
        }
        this.f54222n = w;
        SnsMethodCalculate.markStartTimeMs("updateVisibleItemPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i3 = this.f54221j;
        if (i3 != x) {
            this.f54220i = i3;
            this.f54221j = x;
            this.f54231w = true;
        }
        SnsMethodCalculate.markEndTimeMs("updateVisibleItemPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        SnsMethodCalculate.markEndTimeMs("layoutChildView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }
}
