package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.thumbplayer.api.TPOptionalID;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p1136n3.C109678b;
import p849e3.C107168a0;
import p849e3.C107207u;
import p849e3.C58521d;
import rx3.C13598b0;
import sn0.C90259e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003!\"#B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/ui/base/MMOverScrollView;", "Landroid/widget/FrameLayout;", "", "enableGesture", "Lrx3/b0;", "setEnableGesture", "Lcom/tencent/mm/ui/base/MMPullDownView$e;", "callBack", "setAtTopCallBack", "Lcom/tencent/mm/ui/base/MMPullDownView$d;", "setAtBottomCallBack", "Lcom/tencent/mm/ui/base/MMOverScrollView$c;", "u", "Lcom/tencent/mm/ui/base/MMOverScrollView$c;", "getViewProvider", "()Lcom/tencent/mm/ui/base/MMOverScrollView$c;", "viewProvider", "Lcom/tencent/mm/ui/base/MMOverScrollView$b;", "v", "Lcom/tencent/mm/ui/base/MMOverScrollView$b;", "getScrollConsumer", "()Lcom/tencent/mm/ui/base/MMOverScrollView$b;", "setScrollConsumer", "(Lcom/tencent/mm/ui/base/MMOverScrollView$b;)V", "scrollConsumer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "c", "d", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.base.MMOverScrollView */
public final class MMOverScrollView extends FrameLayout {

    /* renamed from: d */
    public MMPullDownView.C73177d f284207d;

    /* renamed from: e */
    public MMPullDownView.C73178e f284208e;

    /* renamed from: f */
    public boolean f284209f;

    /* renamed from: g */
    public final OverScroller f284210g;

    /* renamed from: h */
    public final C58521d f284211h;

    /* renamed from: i */
    public boolean f284212i;

    /* renamed from: j */
    public boolean f284213j;

    /* renamed from: n */
    public boolean f284214n;

    /* renamed from: o */
    public boolean f284215o;

    /* renamed from: p */
    public boolean f284216p;

    /* renamed from: q */
    public boolean f284217q;

    /* renamed from: r */
    public boolean f284218r;

    /* renamed from: s */
    public boolean f284219s;

    /* renamed from: t */
    public boolean f284220t;

    /* renamed from: u */
    public final C96997c f284221u;

    /* renamed from: v */
    public C96996b f284222v;

    /* renamed from: com.tencent.mm.ui.base.MMOverScrollView$a */
    public static final class C96995a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ MMOverScrollView f284223d;

        public C96995a(MMOverScrollView mMOverScrollView) {
            this.f284223d = mMOverScrollView;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMOverScrollView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/base/MMOverScrollView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMOverScrollView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/ui/base/MMOverScrollView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C87412m.m108594g(motionEvent, "e1");
            C87412m.m108594g(motionEvent2, "e2");
            C96996b scrollConsumer = this.f284223d.getScrollConsumer();
            if (scrollConsumer == null || this.f284223d.getScrollY() >= 0) {
                return false;
            }
            this.f284223d.f284218r = scrollConsumer.mo135684f(f2);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMOverScrollView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMOverScrollView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C87412m.m108594g(motionEvent, "e1");
            C87412m.m108594g(motionEvent2, "e2");
            C96996b scrollConsumer = this.f284223d.getScrollConsumer();
            if (scrollConsumer == null) {
                return false;
            }
            return scrollConsumer.mo135680b(f2);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMOverScrollView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/base/MMOverScrollView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMOverScrollView$b */
    public interface C96996b {
        /* renamed from: a */
        void mo135679a();

        /* renamed from: b */
        boolean mo135680b(float f);

        /* renamed from: c */
        void mo135681c(int i);

        /* renamed from: d */
        boolean mo135682d();

        /* renamed from: e */
        boolean mo135683e(boolean z, boolean z2);

        /* renamed from: f */
        boolean mo135684f(float f);
    }

    /* renamed from: com.tencent.mm.ui.base.MMOverScrollView$c */
    public interface C96997c {

        /* renamed from: com.tencent.mm.ui.base.MMOverScrollView$c$a */
        public static final class C96998a {
            /* renamed from: a */
            public static /* synthetic */ void m124677a(C96997c cVar, int i, int i2, int i3, Object obj) {
                if (obj == null) {
                    if ((i3 & 2) != 0) {
                        i2 = -1;
                    }
                    cVar.smoothScrollBy(i, i2);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: smoothScrollBy");
            }
        }

        /* renamed from: a */
        OverScroller mo135685a();

        /* renamed from: b0 */
        boolean mo135686b0();

        int getScrollY();

        /* renamed from: q0 */
        boolean mo135688q0();

        /* renamed from: r0 */
        void mo135689r0(int i, int i2);

        /* renamed from: s0 */
        void mo135690s0(float f, int i);

        void smoothScrollBy(int i, int i2);

        /* renamed from: t0 */
        void mo135692t0(int i);

        /* renamed from: u0 */
        void mo135693u0(int i);
    }

    /* renamed from: com.tencent.mm.ui.base.MMOverScrollView$d */
    public static final class C96999d implements C96996b {

        /* renamed from: a */
        public final C96997c f284224a;

        public C96999d(C96997c cVar) {
            C87412m.m108594g(cVar, "provider");
            this.f284224a = cVar;
        }

        /* renamed from: a */
        public void mo135679a() {
        }

        /* renamed from: b */
        public boolean mo135680b(float f) {
            int i = (int) f;
            int scrollY = this.f284224a.getScrollY() + i;
            if (this.f284224a.mo135686b0()) {
                if (scrollY <= 0) {
                    this.f284224a.mo135693u0(i / 2);
                    return true;
                } else if (this.f284224a.getScrollY() >= 0) {
                    return false;
                } else {
                    C96997c cVar = this.f284224a;
                    cVar.mo135693u0(-cVar.getScrollY());
                    return true;
                }
            } else if (!this.f284224a.mo135688q0()) {
                return false;
            } else {
                if (scrollY >= 0) {
                    this.f284224a.mo135693u0(i / 2);
                    return true;
                } else if (this.f284224a.getScrollY() <= 0) {
                    return false;
                } else {
                    C96997c cVar2 = this.f284224a;
                    cVar2.mo135693u0(-cVar2.getScrollY());
                    return true;
                }
            }
        }

        /* renamed from: c */
        public void mo135681c(int i) {
        }

        /* renamed from: d */
        public boolean mo135682d() {
            return true;
        }

        /* renamed from: e */
        public boolean mo135683e(boolean z, boolean z2) {
            if (!z2) {
                return false;
            }
            if (z) {
                return true;
            }
            C96997c cVar = this.f284224a;
            cVar.smoothScrollBy(-cVar.getScrollY(), 150);
            return true;
        }

        /* renamed from: f */
        public boolean mo135684f(float f) {
            if (f < -4000.0f) {
                this.f284224a.mo135690s0(f, 0);
                return true;
            }
            C96997c cVar = this.f284224a;
            C96997c.C96998a.m124677a(cVar, -cVar.getScrollY(), 0, 2, (Object) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMOverScrollView$e */
    public static final class C97000e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMOverScrollView f284225d;

        /* renamed from: e */
        public final /* synthetic */ MotionEvent f284226e;

        /* renamed from: f */
        public final /* synthetic */ View f284227f;

        /* renamed from: g */
        public final /* synthetic */ PointF f284228g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97000e(MMOverScrollView mMOverScrollView, MotionEvent motionEvent, View view, PointF pointF) {
            super(0);
            this.f284225d = mMOverScrollView;
            this.f284226e = motionEvent;
            this.f284227f = view;
            this.f284228g = pointF;
        }

        public Object invoke() {
            MMOverScrollView mMOverScrollView = this.f284225d;
            if (!mMOverScrollView.f284215o) {
                mMOverScrollView.f284215o = true;
                int action = this.f284226e.getAction();
                this.f284226e.setAction(3);
                boolean unused = MMOverScrollView.super.dispatchTouchEvent(this.f284226e);
                View view = this.f284227f;
                if (view != null) {
                    this.f284225d.mo135661b(view, this.f284226e, this.f284228g);
                }
                this.f284226e.setAction(action);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMOverScrollView$f */
    public static final class C97001f implements C96997c {

        /* renamed from: a */
        public final /* synthetic */ MMOverScrollView f284229a;

        public C97001f(MMOverScrollView mMOverScrollView) {
            this.f284229a = mMOverScrollView;
        }

        /* renamed from: a */
        public OverScroller mo135685a() {
            return this.f284229a.f284210g;
        }

        /* renamed from: b0 */
        public boolean mo135686b0() {
            return this.f284229a.f284219s;
        }

        public int getScrollY() {
            return this.f284229a.getScrollY();
        }

        /* renamed from: q0 */
        public boolean mo135688q0() {
            return this.f284229a.f284220t;
        }

        /* renamed from: r0 */
        public void mo135689r0(int i, int i2) {
            smoothScrollBy(i - getScrollY(), i2);
        }

        /* renamed from: s0 */
        public void mo135690s0(float f, int i) {
            int i2;
            MMOverScrollView mMOverScrollView = this.f284229a;
            mMOverScrollView.f284216p = false;
            if (i == 0) {
                mMOverScrollView.f284216p = true;
                i2 = 1;
            } else {
                i2 = i;
            }
            mMOverScrollView.f284210g.fling(0, getScrollY(), 0, -((int) f), 0, 0, i, i2);
            MMOverScrollView mMOverScrollView2 = this.f284229a;
            mMOverScrollView2.f284217q = true;
            mMOverScrollView2.postInvalidate();
        }

        public void smoothScrollBy(int i, int i2) {
            MMOverScrollView mMOverScrollView = this.f284229a;
            mMOverScrollView.f284216p = false;
            if (i2 < 0) {
                mMOverScrollView.f284210g.startScroll(0, getScrollY(), 0, i, TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
            } else {
                mMOverScrollView.f284210g.startScroll(0, getScrollY(), 0, i, i2);
            }
            MMOverScrollView mMOverScrollView2 = this.f284229a;
            mMOverScrollView2.f284217q = true;
            mMOverScrollView2.postInvalidate();
        }

        /* renamed from: t0 */
        public void mo135692t0(int i) {
            this.f284229a.scrollTo(0, i);
        }

        /* renamed from: u0 */
        public void mo135693u0(int i) {
            this.f284229a.scrollBy(0, i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MMOverScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: b */
    public final boolean mo135661b(View view, MotionEvent motionEvent, PointF pointF) {
        float x = pointF.x - motionEvent.getX();
        float y = pointF.y - motionEvent.getY();
        motionEvent.offsetLocation(x, y);
        boolean dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
        motionEvent.offsetLocation(-x, -y);
        return motionEvent.getAction() == 1 && dispatchTouchEvent;
    }

    /* renamed from: c */
    public final View mo135662c(ViewGroup viewGroup, PointF pointF) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            float left = ((float) (childAt.getLeft() - viewGroup.getScrollX())) + childAt.getTranslationX();
            float right = ((float) (childAt.getRight() - viewGroup.getScrollY())) + childAt.getTranslationX();
            float top = ((float) (childAt.getTop() - viewGroup.getScrollY())) + childAt.getTranslationY();
            float bottom = ((float) (childAt.getBottom() - viewGroup.getScrollY())) + childAt.getTranslationY();
            float f = pointF.x;
            boolean z = true;
            if (left <= f && f <= right) {
                float f2 = pointF.y;
                if (top > f2 || f2 > bottom) {
                    z = false;
                }
                if (z) {
                    pointF.offset(-left, -top);
                    return childAt;
                }
            }
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (!viewGroup2.getClipChildren()) {
                    pointF.offset(-left, -top);
                    View c = mo135662c(viewGroup2, pointF);
                    if (c != null) {
                        return c;
                    }
                    pointF.offset(left, top);
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public void computeScroll() {
        if (this.f284210g.computeScrollOffset()) {
            int currY = this.f284210g.getCurrY();
            if (this.f284216p && currY == 1) {
                currY = 0;
            }
            scrollTo(0, currY);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
            return;
        }
        this.f284216p = false;
        if (this.f284217q && !this.f284212i) {
            this.f284217q = false;
            this.f284218r = false;
            C96996b bVar = this.f284222v;
            if (bVar != null) {
                bVar.mo135679a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        if (r2 != 3) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c8 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r9, r0)
            boolean r0 = r8.f284209f
            r1 = 0
            if (r0 != 0) goto L_0x0011
            r8.f284212i = r1
            boolean r9 = super.dispatchTouchEvent(r9)
            return r9
        L_0x0011:
            r0 = 2
            android.graphics.PointF r2 = new android.graphics.PointF
            float r3 = r9.getX()
            float r4 = r9.getY()
            r2.<init>(r3, r4)
            float r3 = r9.getY()
            int r4 = r8.getScrollY()
            int r4 = -r4
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0032
            android.view.View r3 = r8.mo135662c(r8, r2)
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            com.tencent.mm.ui.base.MMPullDownView$e r4 = r8.f284208e
            if (r4 == 0) goto L_0x003c
            boolean r4 = r4.mo64386b0()
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            r8.f284219s = r4
            com.tencent.mm.ui.base.MMPullDownView$d r4 = r8.f284207d
            if (r4 == 0) goto L_0x0048
            boolean r4 = r4.mo64384q0()
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            r8.f284220t = r4
            int r4 = r9.getAction()
            r5 = 3
            r6 = 1
            if (r4 == 0) goto L_0x005b
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x0075
        L_0x0058:
            r8.f284212i = r1
            goto L_0x0075
        L_0x005b:
            r8.f284212i = r6
            r8.f284213j = r1
            r8.f284214n = r1
            r8.f284215o = r1
            r8.f284218r = r1
            r8.f284216p = r1
            r8.f284217q = r1
            android.widget.OverScroller r4 = r8.f284210g
            r4.forceFinished(r6)
            com.tencent.mm.ui.base.MMOverScrollView$b r4 = r8.f284222v
            if (r4 == 0) goto L_0x0075
            r4.mo135682d()
        L_0x0075:
            com.tencent.mm.ui.base.MMOverScrollView$e r4 = new com.tencent.mm.ui.base.MMOverScrollView$e
            r4.<init>(r8, r9, r3, r2)
            if (r3 == 0) goto L_0x008b
            boolean r7 = r8.f284214n
            if (r7 != 0) goto L_0x008b
            boolean r7 = r8.f284213j
            if (r7 != 0) goto L_0x008b
            boolean r2 = r8.mo135661b(r3, r9, r2)
            if (r2 == 0) goto L_0x008b
            return r6
        L_0x008b:
            e3.d r2 = r8.f284211h
            boolean r2 = r2.mo83434a(r9)
            r8.f284213j = r2
            int r2 = r9.getAction()
            if (r2 == r6) goto L_0x00a8
            if (r2 == r0) goto L_0x009e
            if (r2 == r5) goto L_0x00a8
            goto L_0x00ba
        L_0x009e:
            boolean r0 = r8.f284213j
            if (r0 == 0) goto L_0x00ba
            r8.f284214n = r6
            r4.invoke()
            goto L_0x00ba
        L_0x00a8:
            com.tencent.mm.ui.base.MMOverScrollView$b r0 = r8.f284222v
            if (r0 == 0) goto L_0x00b3
            boolean r2 = r8.f284218r
            boolean r3 = r8.f284214n
            r0.mo135683e(r2, r3)
        L_0x00b3:
            boolean r0 = r8.f284213j
            if (r0 == 0) goto L_0x00ba
            r4.invoke()
        L_0x00ba:
            boolean r0 = r8.f284213j
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r8.f284214n
            if (r0 != 0) goto L_0x00c8
            boolean r9 = super.dispatchTouchEvent(r9)
            if (r9 == 0) goto L_0x00c9
        L_0x00c8:
            r1 = 1
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMOverScrollView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final C96996b getScrollConsumer() {
        return this.f284222v;
    }

    public final C96997c getViewProvider() {
        return this.f284221u;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void scrollTo(int i, int i2) {
        int scrollY = i2 - getScrollY();
        super.scrollTo(i, i2);
        C96996b bVar = this.f284222v;
        if (bVar != null) {
            bVar.mo135681c(scrollY);
        }
    }

    public final void setAtBottomCallBack(MMPullDownView.C73177d dVar) {
        C87412m.m108594g(dVar, "callBack");
        this.f284207d = dVar;
    }

    public final void setAtTopCallBack(MMPullDownView.C73178e eVar) {
        C87412m.m108594g(eVar, "callBack");
        this.f284208e = eVar;
    }

    public final void setEnableGesture(boolean z) {
        this.f284209f = z;
    }

    public final void setScrollConsumer(C96996b bVar) {
        this.f284222v = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMOverScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f284209f = true;
        this.f284210g = new OverScroller(context, new C109678b());
        C97001f fVar = new C97001f(this);
        this.f284221u = fVar;
        this.f284222v = new C96999d(fVar);
        this.f284211h = new C58521d(context, new C96995a(this));
        setClipChildren(false);
        setClipToPadding(false);
    }
}
