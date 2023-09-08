package com.tencent.p014mm.plugin.profile.p088ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p905j3.C108547c;

/* renamed from: com.tencent.mm.plugin.profile.ui.m2 */
public final class C70285m2 extends FrameLayout {

    /* renamed from: d */
    public final C32224a<Boolean> f203045d;

    /* renamed from: e */
    public ViewGroup f203046e;

    /* renamed from: f */
    public View f203047f;

    /* renamed from: g */
    public Activity f203048g;

    /* renamed from: h */
    public C108547c f203049h = new C108547c(getContext(), this, new C70286a());

    /* renamed from: i */
    public float f203050i;

    /* renamed from: j */
    public int f203051j;

    /* renamed from: n */
    public boolean f203052n;

    /* renamed from: com.tencent.mm.plugin.profile.ui.m2$a */
    public final class C70286a extends C108547c.C108549c {
        public C70286a() {
        }

        /* renamed from: a */
        public int mo96788a(View view, int i, int i2) {
            C87412m.m108594g(view, "child");
            return 0;
        }

        /* renamed from: b */
        public int mo96789b(View view, int i, int i2) {
            C87412m.m108594g(view, "child");
            if (i >= 0) {
                return i;
            }
            return 0;
        }

        /* renamed from: d */
        public int mo96790d(View view) {
            C87412m.m108594g(view, "child");
            return C70285m2.this.f203051j;
        }

        /* renamed from: i */
        public void mo96791i(View view, int i, int i2, int i3, int i4) {
            C87412m.m108594g(view, "changedView");
            C70285m2 m2Var = C70285m2.this;
            if (view == m2Var.f203047f && i2 >= m2Var.f203051j && !m2Var.f203052n) {
                m2Var.f203052n = true;
                Activity activity = m2Var.f203048g;
                if (activity != null) {
                    activity.finish();
                    View view2 = C70285m2.this.f203047f;
                    if (view2 != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    Activity activity2 = C70285m2.this.f203048g;
                    if (activity2 != null) {
                        View decorView = activity2.getWindow().getDecorView();
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view3 = decorView;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        decorView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    C87412m.m108603p("mActivity");
                    throw null;
                }
                C87412m.m108603p("mActivity");
                throw null;
            }
        }

        /* renamed from: j */
        public void mo96792j(View view, float f, float f2) {
            C87412m.m108594g(view, "releasedChild");
            C70285m2 m2Var = C70285m2.this;
            if (((float) view.getTop()) <= m2Var.f203050i) {
                C108547c cVar = m2Var.f203049h;
                if (cVar != null) {
                    cVar.mo159430s(0, 0);
                } else {
                    C87412m.m108603p("mViewDragHelper");
                    throw null;
                }
            } else {
                C108547c cVar2 = m2Var.f203049h;
                if (cVar2 != null) {
                    cVar2.mo159430s(0, m2Var.f203051j);
                } else {
                    C87412m.m108603p("mViewDragHelper");
                    throw null;
                }
            }
            C70285m2.this.invalidate();
        }

        /* renamed from: k */
        public boolean mo96793k(View view, int i) {
            C87412m.m108594g(view, "child");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70285m2(Activity activity, C32224a<Boolean> aVar) {
        super(activity);
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(aVar, "dragEnableBlock");
        this.f203045d = aVar;
        this.f203048g = activity;
    }

    public void computeScroll() {
        C108547c cVar = this.f203049h;
        if (cVar == null) {
            C87412m.m108603p("mViewDragHelper");
            throw null;
        } else if (cVar.mo159420h(true)) {
            invalidate();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (!this.f203045d.invoke().booleanValue()) {
            return false;
        }
        C108547c cVar = this.f203049h;
        if (cVar != null) {
            return cVar.mo159431t(motionEvent);
        }
        C87412m.m108603p("mViewDragHelper");
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        C108547c cVar = this.f203049h;
        if (cVar != null) {
            cVar.mo159424m(motionEvent);
            return true;
        }
        C87412m.m108603p("mViewDragHelper");
        throw null;
    }
}
