package km1;

import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import j20.C117292a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import sn0.C90259e;
import up1.C37521f;

/* renamed from: km1.l */
public final class C10361l {

    /* renamed from: a */
    public final int f31540a = C37521f.f99125A5.mo60266n().intValue();

    /* renamed from: b */
    public final int f31541b;

    /* renamed from: c */
    public View f31542c;

    /* renamed from: d */
    public View f31543d;

    /* renamed from: e */
    public int[] f31544e;

    /* renamed from: f */
    public NearbyLiveSquareTabFragment f31545f;

    /* renamed from: g */
    public boolean f31546g;

    /* renamed from: h */
    public C10362a f31547h;

    /* renamed from: i */
    public GestureDetector f31548i;

    /* renamed from: j */
    public MMHandler f31549j;

    /* renamed from: k */
    public Runnable f31550k;

    /* renamed from: km1.l$a */
    public static final class C10362a implements GestureDetector.OnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ C10361l f31551d;

        public C10362a(C10361l lVar) {
            this.f31551d = lVar;
        }

        public boolean onDown(MotionEvent motionEvent) {
            Log.m105924i("FinderLivePageScrollGuideHelper", "onDown");
            if (C10361l.m10284c(this.f31551d, motionEvent)) {
                return false;
            }
            if (C10361l.m10282a(this.f31551d, motionEvent)) {
                return true;
            }
            C10361l.m10283b(this.f31551d, motionEvent);
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFling e1:");
            Float f3 = null;
            sb.append(motionEvent != null ? Float.valueOf(motionEvent.getX()) : null);
            sb.append(" e2:");
            if (motionEvent2 != null) {
                f3 = Float.valueOf(motionEvent2.getX());
            }
            sb.append(f3);
            sb.append(" velocityX:");
            sb.append(f);
            sb.append(" velocityY:");
            sb.append(f2);
            Log.m105924i("FinderLivePageScrollGuideHelper", sb.toString());
            if (C10361l.m10284c(this.f31551d, motionEvent)) {
                return false;
            }
            if (C10361l.m10282a(this.f31551d, motionEvent)) {
                return true;
            }
            C10361l.m10283b(this.f31551d, motionEvent);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            Log.m105924i("FinderLivePageScrollGuideHelper", C90259e.C90260a.NAME);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            StringBuilder sb = new StringBuilder();
            sb.append("onScroll e1:");
            Float f3 = null;
            sb.append(motionEvent != null ? Float.valueOf(motionEvent.getX()) : null);
            sb.append(" e2:");
            if (motionEvent2 != null) {
                f3 = Float.valueOf(motionEvent2.getX());
            }
            sb.append(f3);
            sb.append(" distanceX:");
            sb.append(f);
            sb.append(" distanceY:");
            sb.append(f2);
            Log.m105924i("FinderLivePageScrollGuideHelper", sb.toString());
            if (C10361l.m10284c(this.f31551d, motionEvent)) {
                return false;
            }
            if (C10361l.m10282a(this.f31551d, motionEvent)) {
                if (f > 10.0f) {
                    this.f31551d.mo10662e();
                    C10361l.m10285d(this.f31551d);
                } else {
                    this.f31551d.mo10662e();
                }
                return true;
            }
            if (C10361l.m10283b(this.f31551d, motionEvent)) {
                if (f > 10.0f) {
                    this.f31551d.mo10662e();
                    C10361l.m10285d(this.f31551d);
                } else {
                    this.f31551d.mo10662e();
                }
            }
            return true;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            Log.m105924i("FinderLivePageScrollGuideHelper", "onSingleTapUp");
            if (C10361l.m10284c(this.f31551d, motionEvent)) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return false;
            } else if (C10361l.m10282a(this.f31551d, motionEvent)) {
                this.f31551d.mo10662e();
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return true;
            } else if (C10361l.m10283b(this.f31551d, motionEvent)) {
                this.f31551d.mo10662e();
                C10361l.m10285d(this.f31551d);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return true;
            } else {
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return true;
            }
        }
    }

    public C10361l() {
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        fVar.getClass();
        this.f31541b = C37521f.f99134B5.mo60266n().intValue();
        this.f31544e = new int[2];
        this.f31547h = new C10362a(this);
        this.f31548i = new GestureDetector(this.f31547h);
        this.f31549j = new MMHandler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static final boolean m10282a(C10361l lVar, MotionEvent motionEvent) {
        lVar.getClass();
        float rawX = motionEvent != null ? motionEvent.getRawX() : 0.0f;
        if (motionEvent != null) {
            motionEvent.getRawY();
        }
        View view = lVar.f31543d;
        int width = view != null ? view.getWidth() : 0;
        View view2 = lVar.f31543d;
        C87412m.m108591d(view2);
        return rawX < ((float) width) - view2.getContext().getResources().getDimension(C0966R.dimen.f3761db) && rawX > 0.0f;
    }

    /* renamed from: b */
    public static final boolean m10283b(C10361l lVar, MotionEvent motionEvent) {
        lVar.getClass();
        float rawX = motionEvent != null ? motionEvent.getRawX() : 0.0f;
        if (motionEvent != null) {
            motionEvent.getRawY();
        }
        View view = lVar.f31543d;
        int width = view != null ? view.getWidth() : 0;
        View view2 = lVar.f31543d;
        C87412m.m108591d(view2);
        float f = (float) width;
        return rawX > f - view2.getContext().getResources().getDimension(C0966R.dimen.f3761db) && rawX < f;
    }

    /* renamed from: c */
    public static final boolean m10284c(C10361l lVar, MotionEvent motionEvent) {
        lVar.getClass();
        if (motionEvent != null) {
            motionEvent.getRawX();
        }
        return (motionEvent != null ? motionEvent.getRawY() : 0.0f) < ((float) lVar.f31544e[1]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        r6 = r7.f15690r;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m10285d(km1.C10361l r7) {
        /*
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r7 = r7.f31545f
            if (r7 != 0) goto L_0x0005
            goto L_0x0055
        L_0x0005:
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r7 = r7.getParentFragment()
            gy3.C87412m.m108591d(r7)
            bl3.r$a r7 = r0.mo62445d(r7)
            java.lang.Class<com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC> r0 = com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class
            androidx.lifecycle.i0 r7 = r7.mo75002a(r0)
            r0 = r7
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC r0 = (com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) r0
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r7 = r0.mo3605d3()
            java.util.LinkedList<com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment> r1 = r0.f15663o
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L_0x0027:
            boolean r4 = r1.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x004b
            java.lang.Object r4 = r1.next()
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r4 = (com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) r4
            if (r7 == 0) goto L_0x0044
            te3.x91 r6 = r7.f15690r
            if (r6 == 0) goto L_0x0044
            int r6 = r6.f144531d
            te3.x91 r4 = r4.f15690r
            int r4 = r4.f144531d
            if (r6 != r4) goto L_0x0044
            r4 = 1
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            int r3 = r3 + 1
            goto L_0x0027
        L_0x004b:
            r3 = -1
        L_0x004c:
            int r1 = r3 + 1
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.m3322j3(r0, r1, r2, r3, r4, r5)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km1.C10361l.m10285d(km1.l):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0112  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10662e() {
        /*
            r14 = this;
            java.lang.String r0 = "FinderLivePageScrollGuideHelper"
            java.lang.String r1 = "cancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.Runnable r1 = r14.f31550k
            r2 = 0
            if (r1 == 0) goto L_0x0013
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r14.f31549j
            r3.removeCallbacks(r1)
            r14.f31550k = r2
        L_0x0013:
            boolean r1 = r14.f31546g
            if (r1 != 0) goto L_0x002e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cancel for isStartAnim:"
            r1.append(r2)
            boolean r2 = r14.f31546g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x002e:
            java.lang.Class<com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC> r1 = com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r3 = r14.f31545f
            r4 = 0
            if (r3 != 0) goto L_0x0037
        L_0x0035:
            r3 = 0
            goto L_0x00ab
        L_0x0037:
            bl3.r r5 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            gy3.C87412m.m108591d(r3)
            bl3.r$a r3 = r5.mo62445d(r3)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r1)
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC r3 = (com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) r3
            java.util.LinkedList<com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment> r3 = r3.f15663o
            int r3 = r3.size()
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r6 = r14.f31545f
            gy3.C87412m.m108591d(r6)
            androidx.fragment.app.Fragment r6 = r6.getParentFragment()
            gy3.C87412m.m108591d(r6)
            bl3.r$a r5 = r5.mo62445d(r6)
            androidx.lifecycle.i0 r1 = r5.mo75002a(r1)
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC r1 = (com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) r1
            int r1 = r1.mo3606e3()
            int r5 = r1 + 1
            if (r3 != r5) goto L_0x008b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getSmoothScrollDistance return 0 for size:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " index:"
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x0035
        L_0x008b:
            android.view.View r3 = r14.f31543d
            if (r3 == 0) goto L_0x0094
            int r3 = r3.getWidth()
            goto L_0x0095
        L_0x0094:
            r3 = 0
        L_0x0095:
            int r3 = r3 * r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "getSmoothScrollDistance distance:"
            r1.append(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x00ab:
            r14.mo10663f(r3, r4, r4)
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r1 = r14.f31545f
            if (r1 == 0) goto L_0x00c0
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x00c0
            r3 = 2131312846(0x7f0940ce, float:1.8244072E38)
            android.view.View r1 = r1.findViewById(r3)
            goto L_0x00c1
        L_0x00c0:
            r1 = r2
        L_0x00c1:
            if (r1 != 0) goto L_0x00c4
            goto L_0x0106
        L_0x00c4:
            r3 = 8
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13.mo10233c(r3)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper"
            java.lang.String r8 = "dismissNextPageFragmentGuide"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r3 = r13.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper"
            java.lang.String r7 = "dismissNextPageFragmentGuide"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x0106:
            android.view.View r1 = r14.f31542c
            if (r1 == 0) goto L_0x010f
            android.view.View r1 = r1.findViewWithTag(r0)
            goto L_0x0110
        L_0x010f:
            r1 = r2
        L_0x0110:
            if (r1 == 0) goto L_0x0115
            r1.setOnTouchListener(r2)
        L_0x0115:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "detachFloatView view:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            android.view.View r0 = r14.f31542c
            java.lang.String r2 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout"
            gy3.C87412m.m108592e(r0, r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.removeView(r1)
            r14.f31546g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km1.C10361l.mo10662e():void");
    }

    /* renamed from: f */
    public final void mo10663f(int i, int i2, int i3) {
        Class<ViewPager> cls = ViewPager.class;
        try {
            Class cls2 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("smoothScrollTo", new Class[]{cls2, cls2, cls2});
            declaredMethod.setAccessible(true);
            View view = this.f31543d;
            C87412m.m108592e(view, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
            declaredMethod.invoke((ViewPager) view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } catch (Exception e) {
            Log.m105928w("FinderLivePageScrollGuideHelper", "smoothScrollTo " + e.getMessage());
        }
    }
}
