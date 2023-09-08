package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gg1.C32444a;
import gs1.C59695l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lgs1/l;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager */
public class FinderLiveLayoutManager extends LinearLayoutManager implements C59695l {

    /* renamed from: E */
    public static final int f159772E = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);

    /* renamed from: A */
    public C32224a<Boolean> f159773A;

    /* renamed from: B */
    public boolean f159774B;

    /* renamed from: C */
    public int f159775C;

    /* renamed from: D */
    public C32227p<? super Long, ? super RecyclerView.C16628w, C13598b0> f159776D;

    /* renamed from: v */
    public final Context f159777v;

    /* renamed from: w */
    public int f159778w;

    /* renamed from: x */
    public boolean f159779x;

    /* renamed from: y */
    public int f159780y = -1;

    /* renamed from: z */
    public C32228q<? super Integer, ? super View, ? super Boolean, C13598b0> f159781z;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager$a */
    public static final class C56021a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLayoutManager f159782d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56021a(FinderLiveLayoutManager finderLiveLayoutManager) {
            super(0);
            this.f159782d = finderLiveLayoutManager;
        }

        public Object invoke() {
            FinderLiveLayoutManager finderLiveLayoutManager = this.f159782d;
            FinderLiveLayoutManager.m63990e0(finderLiveLayoutManager, finderLiveLayoutManager.f159779x, false, 2, (Object) null);
            this.f159782d.f159779x = false;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        C87412m.m108594g(context, "context");
        this.f159777v = context;
        C32444a aVar = C32444a.f86121a;
        this.f159774B = C32444a.f86098S0.mo60266n().intValue() == 0;
        this.f159775C = f159772E + C79406f.m96347a(MMApplicationContext.getContext(), 1.0f);
    }

    /* renamed from: e0 */
    public static void m63990e0(FinderLiveLayoutManager finderLiveLayoutManager, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            int i2 = 0;
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if (finderLiveLayoutManager.getChildCount() != 1) {
                if (!super.canScrollHorizontally()) {
                    int height = finderLiveLayoutManager.getHeight() / 2;
                    int childCount = finderLiveLayoutManager.getChildCount();
                    while (true) {
                        if (i2 >= childCount) {
                            break;
                        }
                        View childAt = finderLiveLayoutManager.getChildAt(i2);
                        C87412m.m108591d(childAt);
                        int top = childAt.getTop();
                        View childAt2 = finderLiveLayoutManager.getChildAt(i2);
                        C87412m.m108591d(childAt2);
                        if ((top + childAt2.getBottom()) / 2 == height) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    int width = finderLiveLayoutManager.getWidth() / 2;
                    int childCount2 = finderLiveLayoutManager.getChildCount();
                    while (true) {
                        if (i2 >= childCount2) {
                            break;
                        }
                        View childAt3 = finderLiveLayoutManager.getChildAt(i2);
                        C87412m.m108591d(childAt3);
                        int left = childAt3.getLeft();
                        View childAt4 = finderLiveLayoutManager.getChildAt(i2);
                        C87412m.m108591d(childAt4);
                        if ((left + childAt4.getRight()) / 2 == width) {
                            break;
                        }
                        i2++;
                    }
                }
                i2 = -1;
            }
            if (i2 >= 0) {
                View childAt5 = finderLiveLayoutManager.getChildAt(i2);
                C87412m.m108591d(childAt5);
                int position = finderLiveLayoutManager.getPosition(childAt5);
                if (position != finderLiveLayoutManager.f159780y || z || z2) {
                    finderLiveLayoutManager.f159780y = position;
                    Log.m105924i("MicroMsg.FinderLiveLayoutManager", "selectedPosition:" + finderLiveLayoutManager.f159780y);
                    C32228q<? super Integer, ? super View, ? super Boolean, C13598b0> qVar = finderLiveLayoutManager.f159781z;
                    if (qVar != null) {
                        qVar.invoke(Integer.valueOf(finderLiveLayoutManager.f159780y), childAt5, Boolean.valueOf(z2));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelectedChild");
    }

    /* renamed from: M */
    public int mo16966M(RecyclerView.C16628w wVar) {
        if (!this.f159774B) {
            return super.mo16966M(wVar);
        }
        int i = this.f159775C;
        return i == -1 ? super.mo16966M(wVar) : i;
    }

    /* renamed from: c0 */
    public final boolean mo77959c0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public boolean canScrollHorizontally() {
        return super.canScrollHorizontally();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean canScrollVertically() {
        /*
            r5 = this;
            int r0 = r5.f44675d
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0077
            android.content.Context r0 = r5.f159777v
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r0 != r2) goto L_0x0077
            int r0 = r5.f159780y
            android.view.View r0 = r5.findViewByPosition(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0025
            r4 = 2131304410(0x7f091fda, float:1.8226962E38)
            android.view.View r0 = r0.findViewById(r4)
            goto L_0x0026
        L_0x0025:
            r0 = r3
        L_0x0026:
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout
            if (r4 == 0) goto L_0x002d
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r0 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) r0
            goto L_0x002e
        L_0x002d:
            r0 = r3
        L_0x002e:
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.isInputMode()
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 != 0) goto L_0x0077
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r0 = r0.mo87027N0()
            if (r0 != 0) goto L_0x0051
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.mo85682Z()
            if (r0 != r2) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 != 0) goto L_0x0077
            int r0 = r5.f159780y
            android.view.View r0 = r5.findViewByPosition(r0)
            if (r0 == 0) goto L_0x0064
            r4 = 2131304241(0x7f091f31, float:1.822662E38)
            android.view.View r0 = r0.findViewById(r4)
            goto L_0x0065
        L_0x0064:
            r0 = r3
        L_0x0065:
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout
            if (r4 == 0) goto L_0x006c
            r3 = r0
            com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout r3 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout) r3
        L_0x006c:
            if (r3 == 0) goto L_0x0073
            boolean r0 = r3.getInterceptTouch()
            goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            if (r0 != 0) goto L_0x0077
            r1 = 1
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveLayoutManager.canScrollVertically():boolean");
    }

    /* renamed from: d */
    public void mo77960d(C32227p<? super Long, ? super RecyclerView.C16628w, C13598b0> pVar) {
        this.f159776D = pVar;
    }

    /* renamed from: d0 */
    public final boolean mo77961d0(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return view.isLayoutRequested() || !isMeasurementCacheEnabled() || !mo77959c0(view.getWidth(), i, layoutParams.width) || !mo77959c0(view.getHeight(), i2, layoutParams.height);
    }

    public void measureChild(View view, int i, int i2) {
        C87412m.m108594g(view, "child");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        calculateItemDecorationsForChild(view, new Rect());
        int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i, layoutParams2.width, canScrollHorizontally());
        int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i2, layoutParams2.height, canScrollVertically());
        try {
            if (mo77961d0(view, childMeasureSpec, childMeasureSpec2, layoutParams2)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.FinderLiveLayoutManager", "measureChild error", th);
        }
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        C87412m.m108594g(view, "child");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        calculateItemDecorationsForChild(view, new Rect());
        int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + layoutParams2.leftMargin + layoutParams2.rightMargin + i, layoutParams2.width, canScrollHorizontally());
        int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutParams2.topMargin + layoutParams2.bottomMargin + i2, layoutParams2.height, canScrollVertically());
        try {
            if (mo77961d0(view, childMeasureSpec, childMeasureSpec2, layoutParams2)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.FinderLiveLayoutManager", "measureChildWithMargins error", th);
        }
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        super.onLayoutCompleted(wVar);
        C61926c.m72666K(0, new C56021a(this));
    }

    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        this.f159778w = i;
        if (i == 0) {
            C32224a<Boolean> aVar = this.f159773A;
            if (aVar != null) {
                boolean booleanValue = aVar.invoke().booleanValue();
                Log.m105924i("MicroMsg.FinderLiveLayoutManager", "isNeedCheck = " + booleanValue);
                if (booleanValue) {
                    m63990e0(this, true, false, 2, (Object) null);
                } else {
                    m63990e0(this, false, false, 3, (Object) null);
                }
            }
            if (this.f159773A == null) {
                m63990e0(this, false, false, 3, (Object) null);
            }
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        long currentTimeMillis = this.f159776D == null ? 0 : System.currentTimeMillis();
        try {
            return super.scrollVerticallyBy(i, rVar, wVar);
        } finally {
            C32227p<? super Long, ? super RecyclerView.C16628w, C13598b0> pVar = this.f159776D;
            if (pVar != null && currentTimeMillis > 0) {
                pVar.invoke(Long.valueOf(System.currentTimeMillis() - currentTimeMillis), wVar);
            }
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
