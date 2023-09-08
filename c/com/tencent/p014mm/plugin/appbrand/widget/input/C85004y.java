package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import j20.C117292a;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p225rc.C89917h;
import p849e3.C107168a0;
import p849e3.C107207u;
import st0.C90358a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.y */
public final class C85004y extends FrameLayout {

    /* renamed from: r */
    public static final /* synthetic */ int f247715r = 0;

    /* renamed from: d */
    public View f247716d;

    /* renamed from: e */
    public View f247717e;

    /* renamed from: f */
    public int f247718f = -1;

    /* renamed from: g */
    public boolean f247719g = false;

    /* renamed from: h */
    public final int[] f247720h = new int[2];

    /* renamed from: i */
    public C84978r1 f247721i;

    /* renamed from: j */
    public C90358a f247722j;

    /* renamed from: n */
    public WeakHashMap<View, y$$e> f247723n = new WeakHashMap<>();

    /* renamed from: o */
    public Runnable f247724o = new y$$b(this);

    /* renamed from: p */
    public final Runnable f247725p = new y$$c(this);

    /* renamed from: q */
    public final Set<y$$d> f247726q = new HashSet();

    public C85004y(Context context, View view) {
        super(context.getApplicationContext());
        super.setId(C0966R.C0970id.f6025v7);
        this.f247717e = view;
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
        if (castActivityOrNull instanceof FragmentActivity) {
            this.f247721i = new C84978r1(castActivityOrNull);
        }
    }

    /* renamed from: d */
    public static C85004y m104825d(View view) {
        return (C85004y) view.getRootView().findViewById(C0966R.C0970id.f6025v7);
    }

    /* renamed from: e */
    public static C84967l0 m104826e(View view) {
        C85004y d = m104825d(view);
        if (d == null) {
            return null;
        }
        if (d.getOnLayoutListener() == null || !(d.getOnLayoutListener() instanceof C84967l0)) {
            C84967l0 l0Var = new C84967l0();
            d.setOnLayoutListener(l0Var);
            C84978r1 r1Var = d.f247721i;
            if (r1Var != null) {
                l0Var.f247625b = r1Var;
                r1Var.f247642a = new C84966k0(l0Var);
            }
        }
        return (C84967l0) d.getOnLayoutListener();
    }

    /* renamed from: a */
    public void mo117919a(View view, boolean z) {
        View view2 = this.f247716d;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f247716d = null;
        }
        if (this != view.getParent()) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f247716d = view;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            super.addView(view, layoutParams);
            y$$e y__e = new y$$e();
            y__e.f247729a = z;
            this.f247723n.put(view, y__e);
        }
    }

    public void addView(View view) {
        if (view == this.f247717e || view == this.f247716d) {
            super.addView(view);
        }
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        return false;
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        return false;
    }

    /* renamed from: b */
    public final void mo117927b() {
        y$$e y__e;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145208c(this)) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!(childAt == null || childAt == this.f247717e || (y__e = this.f247723n.get(childAt)) == null)) {
                    if (!z && y__e.f247730b != 0 && childAt.getVisibility() == 0) {
                        this.f247716d = childAt;
                        post(this.f247724o);
                        z = true;
                    }
                    z2 |= y__e.f247730b == 0;
                    z3 &= childAt.getVisibility() != 0;
                    y__e.f247730b = childAt.getVisibility();
                }
            }
            if (z || (z2 && z3)) {
                post(this.f247725p);
            }
        }
    }

    /* renamed from: c */
    public void mo117928c() {
        View view = this.f247716d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dismissAllPanels", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dismissAllPanels", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f247716d = null;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        y$$e y__e = this.f247723n.get(this.f247716d);
        if (y__e != null && y__e.f247729a && (view = this.f247716d) != null && view.isShown() && motionEvent.getAction() == 0) {
            float rawY = motionEvent.getRawY();
            this.f247716d.getLocationOnScreen(this.f247720h);
            float f = (float) this.f247720h[1];
            float height = ((float) this.f247716d.getHeight()) + f;
            if (rawY < f || rawY > height) {
                View view2 = this.f247716d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: f */
    public boolean mo117930f(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            View view = this.f247716d;
            if (view != null && view.isShown()) {
                View view2 = this.f247716d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "onKeyEventChanged", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "onKeyEventChanged", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            } else if (C89917h.m112458a(getContext())) {
                return true;
            }
        }
        return dispatchKeyEvent(keyEvent);
    }

    public View getCurrentBottomPanel() {
        return this.f247716d;
    }

    public C90358a getOnLayoutListener() {
        return this.f247722j;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            Log.m105924i("MicroMsg.AppBrandUIdRootFrameLayout", "attach input root layout above android Q");
            y$$a y__a = new y$$a(this);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107213g.m145236u(this, y__a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDetachedFromWindow() {
        /*
            r5 = this;
            super.onDetachedFromWindow()
            st0.a r0 = r5.f247722j
            r1 = 0
            if (r0 == 0) goto L_0x002c
            com.tencent.mm.plugin.appbrand.widget.input.l0 r0 = (com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0) r0
            com.tencent.mm.plugin.appbrand.widget.input.r1 r2 = r0.f247625b
            if (r2 == 0) goto L_0x002c
            r2.mo117856b()
            com.tencent.mm.plugin.appbrand.widget.input.r1 r2 = r0.f247625b
            androidx.lifecycle.r r3 = r2.f247648g
            if (r3 == 0) goto L_0x0028
            android.app.Activity r3 = r2.f247647f
            boolean r4 = r3 instanceof androidx.lifecycle.C0125s
            if (r4 == 0) goto L_0x0028
            androidx.lifecycle.s r3 = (androidx.lifecycle.C0125s) r3
            androidx.lifecycle.j r3 = r3.getLifecycle()
            androidx.lifecycle.r r2 = r2.f247648g
            r3.removeObserver(r2)
        L_0x0028:
            com.tencent.mm.plugin.appbrand.widget.input.r1 r0 = r0.f247625b
            r0.f247642a = r1
        L_0x002c:
            r5.f247722j = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L_0x0039
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107213g.m145236u(r5, r1)
        L_0x0039:
            r5.removeAllViews()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C85004y.onDetachedFromWindow():void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        this.f247719g = true;
        mo117927b();
        super.onLayout(z, i, i2, i3, i4);
        C90358a aVar = this.f247722j;
        if (aVar != null) {
            ((C84967l0) aVar).mo117846d(this, z, i, i2, i3, i4);
        }
        this.f247719g = false;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f247718f;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f247723n.remove(view);
    }

    public void setForceHeight(int i) {
        boolean z = i != this.f247718f;
        this.f247718f = i;
        if (z) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145208c(this) && !this.f247719g) {
                requestLayout();
            }
        }
    }

    public void setId(int i) {
    }

    public void setOnLayoutListener(C90358a aVar) {
        this.f247722j = aVar;
    }

    public void addView(View view, int i) {
        if (view == this.f247717e || view == this.f247716d) {
            super.addView(view, i);
        }
    }

    public void addView(View view, int i, int i2) {
        if (view == this.f247717e || view == this.f247716d) {
            super.addView(view, i, i2);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == this.f247717e || view == this.f247716d) {
            super.addView(view, layoutParams);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view == this.f247717e || view == this.f247716d) {
            super.addView(view, i, layoutParams);
        }
    }
}
