package wt0;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bt0.C79808b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.LinkedList;
import java.util.Objects;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107207u;
import u24.C90595a;

/* renamed from: wt0.d */
public final class C91110d {

    /* renamed from: a */
    public final C83780d1 f261299a;

    /* renamed from: b */
    public C91112b f261300b;

    /* renamed from: c */
    public C91114h f261301c;

    /* renamed from: d */
    public final MMHandler f261302d = new MMHandler(Looper.getMainLooper());

    /* renamed from: wt0.d$d */
    public static final class C53197d implements Runnable, View.OnAttachStateChangeListener {

        /* renamed from: d */
        public View f148395d;

        public C53197d(View view) {
            this.f148395d = view;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
        }

        public void run() {
            View view = this.f148395d;
            if (view != null) {
                try {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPagePromptHelper$ToastViewDismissRunner", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPagePromptHelper$ToastViewDismissRunner", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (this.f148395d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) this.f148395d.getParent()).removeView(this.f148395d);
                    }
                } finally {
                    this.f148395d = null;
                }
            }
        }
    }

    /* renamed from: wt0.d$a */
    public class C91111a implements View.OnAttachStateChangeListener {
        public C91111a() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            C91110d dVar = C91110d.this;
            if (view == dVar.f261300b) {
                dVar.f261300b = null;
            }
        }
    }

    /* renamed from: wt0.d$b */
    public static final class C91112b extends FrameLayout {

        /* renamed from: d */
        public final Rect f261304d = new Rect();

        /* renamed from: e */
        public final int[] f261305e = new int[2];

        /* renamed from: f */
        public boolean f261306f = false;

        public C91112b(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) super.generateLayoutParams(layoutParams);
            if (-1 == layoutParams2.gravity) {
                layoutParams2.gravity = 17;
            }
            return layoutParams2;
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.f261306f = false;
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.f261306f = true;
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(this)) {
                getWindowVisibleDisplayFrame(this.f261304d);
                getLocationInWindow(this.f261305e);
                if (Log.getLogLevel() <= 1) {
                    Log.m105919d("MicroMsg.PagePromptViewContainerLayout[keyboard]", "onLayout, WindowVisibleDisplayFrame=%s, location=%s", this.f261304d, C90595a.m113499c(this.f261305e, "{}"));
                }
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt = getChildAt(i5);
                    int top = ((this.f261305e[1] + childAt.getTop()) + childAt.getHeight()) - this.f261304d.bottom;
                    if (top > 0) {
                        int max = Math.max(0, childAt.getTop() - top);
                        childAt.layout(childAt.getLeft(), max, childAt.getRight(), childAt.getHeight() + max);
                    }
                }
            }
        }

        public void onViewAdded(View view) {
            super.onViewAdded(view);
            bringToFront();
            bringChildToFront(view);
        }

        public void onViewRemoved(View view) {
            super.onViewRemoved(view);
            if (getChildCount() == 0) {
                setVisibility(8);
                if (getParent() instanceof ViewGroup) {
                    ((ViewGroup) getParent()).removeView(this);
                }
            }
        }
    }

    /* renamed from: wt0.d$c */
    public static final class C91113c implements C82835n {

        /* renamed from: d */
        public final LinkedList<C83780d1> f261307d = new LinkedList<>();

        /* renamed from: c */
        public static C91113c m114295c(AppBrandRuntime appBrandRuntime, boolean z) {
            C91113c cVar = (C91113c) appBrandRuntime.mo113032U(C91113c.class);
            if (cVar != null || !z) {
                return cVar;
            }
            C91113c cVar2 = new C91113c();
            appBrandRuntime.mo113059i(cVar2);
            return cVar2;
        }
    }

    public C91110d(C83780d1 d1Var) {
        this.f261299a = d1Var;
    }

    /* renamed from: a */
    public final C91112b mo125167a() {
        C91112b bVar = this.f261300b;
        if (bVar != null && !bVar.f261306f) {
            return bVar;
        }
        this.f261300b = null;
        ViewGroup n = this.f261299a.f244556H.mo116436n();
        for (int i = 0; i < n.getChildCount(); i++) {
            View childAt = n.getChildAt(i);
            if (childAt instanceof C91112b) {
                return (C91112b) childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo125168b(boolean r17) {
        /*
            r16 = this;
            r0 = r16
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r0.f261299a
            boolean r1 = r1.isRunning()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0031
            if (r17 == 0) goto L_0x0029
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r0.f261299a
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.getRuntime()
            if (r1 == 0) goto L_0x0029
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r0.f261299a
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.getRuntime()
            wt0.d$c r1 = wt0.C91110d.C91113c.m114295c(r1, r2)
            if (r1 == 0) goto L_0x0029
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.d1> r1 = r1.f261307d
            com.tencent.mm.plugin.appbrand.page.d1 r4 = r0.f261299a
            r1.remove(r4)
        L_0x0029:
            if (r17 == 0) goto L_0x0030
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f261302d
            r1.removeCallbacksAndMessages(r3)
        L_0x0030:
            return r2
        L_0x0031:
            boolean r1 = com.tencent.p014mm.plugin.appbrand.utils.C2039g2.m1987a()
            if (r1 == 0) goto L_0x00ed
            wt0.d$b r1 = r0.f261300b
            if (r1 == 0) goto L_0x00c7
            java.util.WeakHashMap<android.view.View, e3.a0> r4 = p849e3.C107207u.f320808a
            boolean r4 = p849e3.C107207u.C107211e.m145207b(r1)
            if (r4 == 0) goto L_0x00c7
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r5 = 0
        L_0x0049:
            int r6 = r1.getChildCount()
            if (r5 >= r6) goto L_0x006a
            android.view.View r6 = r1.getChildAt(r5)
            if (r6 == 0) goto L_0x0067
            r7 = 2131297173(0x7f090395, float:1.8212283E38)
            java.lang.Object r7 = r6.getTag(r7)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 == 0) goto L_0x0067
            r4.add(r6)
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x0049
        L_0x006a:
            boolean r5 = r4.isEmpty()
            r5 = r5 ^ 1
            java.util.Iterator r4 = r4.iterator()
        L_0x0074:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00c8
            java.lang.Object r6 = r4.next()
            android.view.View r6 = (android.view.View) r6
            r7 = 8
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15.mo10233c(r7)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPagePromptHelper"
            java.lang.String r10 = "hideToastViews"
            java.lang.String r11 = "(Z)Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r6
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r7 = r15.mo10231a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPagePromptHelper"
            java.lang.String r9 = "hideToastViews"
            java.lang.String r10 = "(Z)Z"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r6
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            r1.removeView(r6)
            goto L_0x0074
        L_0x00c7:
            r5 = 0
        L_0x00c8:
            if (r17 == 0) goto L_0x00e5
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r0.f261299a
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.getRuntime()
            if (r1 == 0) goto L_0x00e5
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r0.f261299a
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.getRuntime()
            wt0.d$c r1 = wt0.C91110d.C91113c.m114295c(r1, r2)
            if (r1 == 0) goto L_0x00e5
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.d1> r1 = r1.f261307d
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r0.f261299a
            r1.remove(r2)
        L_0x00e5:
            if (r17 == 0) goto L_0x00ec
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f261302d
            r1.removeCallbacksAndMessages(r3)
        L_0x00ec:
            return r5
        L_0x00ed:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Should be called on main-thread"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wt0.C91110d.mo125168b(boolean):boolean");
    }

    /* renamed from: c */
    public final C91112b mo125169c() {
        ViewGroup n = this.f261299a.f244556H.mo116436n();
        C91112b a = mo125167a();
        if (a == null) {
            a = new C91112b(this.f261299a.getContext());
            a.addOnAttachStateChangeListener(new C91111a());
            n.addView(a, -1, -1);
        }
        a.bringToFront();
        this.f261300b = a;
        return a;
    }

    /* renamed from: d */
    public void mo125170d(int i) {
        C91112b a = mo125167a();
        if (a != null && (a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.getLayoutParams();
            if (i != marginLayoutParams.topMargin) {
                marginLayoutParams.topMargin = i;
                a.requestLayout();
            }
        }
    }

    /* renamed from: e */
    public void mo125171e(View view, long j) {
        if (this.f261299a.isRunning() && this.f261299a.getRuntime() != null) {
            if (C2039g2.m1987a()) {
                C91112b c = mo125169c();
                C79808b bVar = this.f261299a.f244554F;
                if (bVar != null) {
                    mo125170d(bVar.getTop() + bVar.getMeasuredHeight());
                }
                view.setTag(C0966R.C0970id.f6022v4, Boolean.TRUE);
                c.addView(view);
                if (j < 0) {
                    j = 0;
                }
                this.f261302d.postDelayed(new C53197d(view), j);
                C91113c c2 = C91113c.m114295c(this.f261299a.getRuntime(), true);
                Objects.requireNonNull(c2);
                c2.f261307d.add(this.f261299a);
                return;
            }
            throw new RuntimeException("Should be called on main-thread");
        }
    }
}
