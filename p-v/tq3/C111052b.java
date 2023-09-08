package tq3;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import gy3.C87412m;
import oq3.C110059h;
import oq3.C21803b;
import qq3.C110444a;
import sq3.C110811c;

/* renamed from: tq3.b */
public class C111052b implements C21803b, C110444a, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public View f332550d;

    /* renamed from: e */
    public C110811c f332551e = mo160998l();

    /* renamed from: f */
    public int f332552f;

    /* renamed from: g */
    public boolean f332553g = true;

    /* renamed from: h */
    public boolean f332554h = true;

    /* renamed from: i */
    public View f332555i;

    /* renamed from: j */
    public View f332556j;

    public C111052b(View view) {
        C87412m.m108594g(view, "outView");
        this.f332550d = view;
        this.f332555i = view;
        this.f332556j = view;
    }

    /* renamed from: a */
    public void mo34213a(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-((float) this.f332556j.getLeft()), -((float) this.f332556j.getTop()));
        View view = this.f332555i;
        View view2 = this.f332556j;
        if (view != view2) {
            View j = mo162732j(view2, pointF, view);
            C87412m.m108594g(j, "<set-?>");
            this.f332555i = j;
        }
        if (this.f332555i == this.f332556j) {
            this.f332551e.f331530a = null;
        } else {
            this.f332551e.f331530a = pointF;
        }
    }

    /* renamed from: b */
    public ValueAnimator.AnimatorUpdateListener mo34214b(int i) {
        if (i == 0) {
            return null;
        }
        if ((i >= 0 || !this.f332555i.canScrollVertically(1)) && (i <= 0 || !this.f332555i.canScrollVertically(-1))) {
            return null;
        }
        this.f332552f = i;
        return this;
    }

    /* renamed from: c */
    public void mo34215c(C110059h hVar) {
        this.f332551e.f331531b = hVar;
    }

    /* renamed from: d */
    public boolean mo34216d() {
        return this.f332553g && this.f332551e.mo160997b(this.f332556j);
    }

    /* renamed from: e */
    public void mo161934e(boolean z, boolean z2) {
        this.f332553g = z;
        this.f332554h = z2;
    }

    /* renamed from: f */
    public void mo34217f(boolean z) {
        this.f332551e.f331532c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0072  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34218g(oq3.C110058f r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "layout"
            gy3.C87412m.m108594g(r1, r2)
            android.view.View r2 = r0.f332556j
            boolean r3 = r2.isInEditMode()
            r5 = 0
        L_0x0010:
            if (r5 == 0) goto L_0x001a
            boolean r6 = r5 instanceof p849e3.C58524o
            if (r6 == 0) goto L_0x0096
            boolean r6 = r5 instanceof p849e3.C107199k
            if (r6 != 0) goto L_0x0096
        L_0x001a:
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0020
            r8 = 1
            goto L_0x0021
        L_0x0020:
            r8 = 0
        L_0x0021:
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.util.List r10 = gy3.C24564k0.m30738b(r9)
            r10.add(r2)
            r11 = 0
        L_0x002e:
            int r12 = r10.size()
            if (r12 <= 0) goto L_0x0090
            if (r11 != 0) goto L_0x0090
            java.lang.Object r12 = r9.poll()
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x002e
            if (r8 != 0) goto L_0x0042
            if (r12 == r2) goto L_0x0074
        L_0x0042:
            boolean r13 = r12 instanceof oq3.C21805g
            if (r13 == 0) goto L_0x0047
            goto L_0x006d
        L_0x0047:
            if (r13 == 0) goto L_0x004a
            goto L_0x005f
        L_0x004a:
            boolean r13 = r12 instanceof android.widget.AbsListView
            if (r13 != 0) goto L_0x0061
            boolean r13 = r12 instanceof android.widget.ScrollView
            if (r13 != 0) goto L_0x0061
            boolean r13 = r12 instanceof p849e3.C107206t
            if (r13 != 0) goto L_0x0061
            boolean r13 = r12 instanceof android.webkit.WebView
            if (r13 != 0) goto L_0x0061
            boolean r13 = r12 instanceof p849e3.C107199k
            if (r13 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r13 = 0
            goto L_0x0062
        L_0x0061:
            r13 = 1
        L_0x0062:
            if (r13 != 0) goto L_0x006f
            boolean r13 = r12 instanceof androidx.viewpager.widget.ViewPager
            if (r13 != 0) goto L_0x006f
            boolean r13 = r12 instanceof p849e3.C58524o
            if (r13 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r13 = 0
            goto L_0x0070
        L_0x006f:
            r13 = 1
        L_0x0070:
            if (r13 == 0) goto L_0x0074
            r11 = r12
            goto L_0x002e
        L_0x0074:
            boolean r13 = r12 instanceof android.view.ViewGroup
            if (r13 == 0) goto L_0x002e
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            int r13 = r12.getChildCount()
            r14 = 0
        L_0x007f:
            if (r14 >= r13) goto L_0x002e
            android.view.View r15 = r12.getChildAt(r14)
            java.lang.String r4 = "group.getChildAt(j)"
            gy3.C87412m.m108593f(r15, r4)
            r10.add(r15)
            int r14 = r14 + 1
            goto L_0x007f
        L_0x0090:
            if (r11 != 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r2 = r11
        L_0x0094:
            if (r2 != r5) goto L_0x009b
        L_0x0096:
            if (r5 == 0) goto L_0x009a
            r0.f332555i = r5
        L_0x009a:
            return
        L_0x009b:
            if (r3 != 0) goto L_0x00c5
            boolean r4 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout     // Catch:{ all -> 0x00c4 }
            if (r4 == 0) goto L_0x00c5
            r1.mo26570a(r7)     // Catch:{ all -> 0x00c4 }
            r4 = r2
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x00c4 }
            int r5 = r4.getChildCount()     // Catch:{ all -> 0x00c4 }
            r6 = -1
            int r5 = r5 + r6
        L_0x00ad:
            if (r6 >= r5) goto L_0x00c5
            android.view.View r7 = r4.getChildAt(r5)     // Catch:{ all -> 0x00c4 }
            boolean r8 = r7 instanceof com.google.android.material.appbar.AppBarLayout     // Catch:{ all -> 0x00c4 }
            if (r8 == 0) goto L_0x00c1
            com.google.android.material.appbar.AppBarLayout r7 = (com.google.android.material.appbar.AppBarLayout) r7     // Catch:{ all -> 0x00c4 }
            tq3.a r8 = new tq3.a     // Catch:{ all -> 0x00c4 }
            r8.<init>(r0)     // Catch:{ all -> 0x00c4 }
            r7.mo146159a(r8)     // Catch:{ all -> 0x00c4 }
        L_0x00c1:
            int r5 = r5 + -1
            goto L_0x00ad
        L_0x00c4:
        L_0x00c5:
            r5 = r2
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: tq3.C111052b.mo34218g(oq3.f):void");
    }

    public View getView() {
        return this.f332556j;
    }

    /* renamed from: h */
    public void mo34220h(int i) {
        this.f332550d.setTranslationY((float) i);
    }

    /* renamed from: i */
    public View mo34221i() {
        return this.f332555i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r0 == false) goto L_0x0063;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo162732j(android.view.View r12, android.graphics.PointF r13, android.view.View r14) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x007e
            if (r13 == 0) goto L_0x007e
            r0 = r12
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>()
        L_0x0012:
            if (r1 <= 0) goto L_0x007e
            int r2 = r1 + -1
            android.view.View r9 = r0.getChildAt(r2)
            sq3.c r2 = r11.f332551e
            java.lang.String r10 = "child"
            gy3.C87412m.m108593f(r9, r10)
            float r5 = r13.x
            float r6 = r13.y
            r3 = r12
            r4 = r9
            r7 = r8
            boolean r2 = r2.mo162397e(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x007b
            boolean r12 = r9 instanceof androidx.viewpager.widget.ViewPager
            if (r12 != 0) goto L_0x0063
            boolean r12 = r9 instanceof oq3.C21805g
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L_0x0039
            goto L_0x0061
        L_0x0039:
            boolean r12 = r9 instanceof oq3.C21805g
            if (r12 == 0) goto L_0x003e
            goto L_0x0053
        L_0x003e:
            boolean r12 = r9 instanceof android.widget.AbsListView
            if (r12 != 0) goto L_0x0055
            boolean r12 = r9 instanceof android.widget.ScrollView
            if (r12 != 0) goto L_0x0055
            boolean r12 = r9 instanceof p849e3.C107206t
            if (r12 != 0) goto L_0x0055
            boolean r12 = r9 instanceof android.webkit.WebView
            if (r12 != 0) goto L_0x0055
            boolean r12 = r9 instanceof p849e3.C107199k
            if (r12 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r12 = 0
            goto L_0x0056
        L_0x0055:
            r12 = 1
        L_0x0056:
            if (r12 != 0) goto L_0x0060
            boolean r12 = r9 instanceof androidx.viewpager.widget.ViewPager
            if (r12 != 0) goto L_0x0060
            boolean r12 = r9 instanceof p849e3.C58524o
            if (r12 == 0) goto L_0x0061
        L_0x0060:
            r0 = 1
        L_0x0061:
            if (r0 != 0) goto L_0x0077
        L_0x0063:
            float r12 = r8.x
            float r0 = r8.y
            r13.offset(r12, r0)
            android.view.View r9 = r11.mo162732j(r9, r13, r14)
            float r12 = r8.x
            float r12 = -r12
            float r14 = r8.y
            float r14 = -r14
            r13.offset(r12, r14)
        L_0x0077:
            gy3.C87412m.m108593f(r9, r10)
            return r9
        L_0x007b:
            int r1 = r1 + -1
            goto L_0x0012
        L_0x007e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: tq3.C111052b.mo162732j(android.view.View, android.graphics.PointF, android.view.View):android.view.View");
    }

    /* renamed from: k */
    public boolean mo34222k() {
        return this.f332554h && this.f332551e.mo160996a(this.f332556j);
    }

    /* renamed from: l */
    public C110811c mo160998l() {
        return new C110811c();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C87412m.m108594g(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        try {
            float scaleY = ((float) (intValue - this.f332552f)) * this.f332555i.getScaleY();
            View view = this.f332555i;
            if (view instanceof AbsListView) {
                C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.AbsListView");
                ((AbsListView) view).scrollListBy((int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable unused) {
        }
        this.f332552f = intValue;
    }
}
