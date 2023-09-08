package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87412m;
import kg3.C76577a;
import kw0.C46746a;
import p905j3.C108547c;

/* renamed from: com.tencent.mm.ui.chatting.i3 */
public final class C73721i3 extends FrameLayout {

    /* renamed from: d */
    public final C32226l<MotionEvent, Boolean> f216462d;

    /* renamed from: e */
    public ViewGroup f216463e;

    /* renamed from: f */
    public View f216464f;

    /* renamed from: g */
    public Activity f216465g;

    /* renamed from: h */
    public C108547c f216466h = new C108547c(getContext(), this, new C73722a());

    /* renamed from: i */
    public float f216467i;

    /* renamed from: j */
    public int f216468j;

    /* renamed from: n */
    public boolean f216469n;

    /* renamed from: com.tencent.mm.ui.chatting.i3$a */
    public final class C73722a extends C108547c.C108549c {
        public C73722a() {
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
            return C73721i3.this.f216468j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
            r9 = r9.getWindow();
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo96791i(android.view.View r9, int r10, int r11, int r12, int r13) {
            /*
                r8 = this;
                java.lang.String r10 = "changedView"
                gy3.C87412m.m108594g(r9, r10)
                com.tencent.mm.ui.chatting.i3 r10 = com.tencent.p014mm.p136ui.chatting.C73721i3.this
                android.view.View r12 = r10.f216464f
                if (r9 != r12) goto L_0x00b8
                int r9 = r10.f216468j
                if (r11 < r9) goto L_0x00b8
                boolean r9 = r10.f216469n
                if (r9 != 0) goto L_0x00b8
                r9 = 1
                r10.f216469n = r9
                android.app.Activity r9 = r10.f216465g
                if (r9 == 0) goto L_0x001d
                r9.finish()
            L_0x001d:
                com.tencent.mm.ui.chatting.i3 r9 = com.tencent.p014mm.p136ui.chatting.C73721i3.this
                android.view.View r9 = r9.f216464f
                r10 = 0
                r11 = 8
                if (r9 != 0) goto L_0x0027
                goto L_0x0065
            L_0x0027:
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
                java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
                r12.mo10233c(r13)
                java.lang.Object[] r1 = r12.mo10232b()
                java.lang.String r2 = "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback"
                java.lang.String r3 = "onViewPositionChanged"
                java.lang.String r4 = "(Landroid/view/View;IIII)V"
                java.lang.String r5 = "android/view/View_EXEC_"
                java.lang.String r6 = "setVisibility"
                java.lang.String r7 = "(I)V"
                r0 = r9
                j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
                java.lang.Object r12 = r12.mo10231a(r10)
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r12 = r12.intValue()
                r9.setVisibility(r12)
                java.lang.String r1 = "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback"
                java.lang.String r2 = "onViewPositionChanged"
                java.lang.String r3 = "(Landroid/view/View;IIII)V"
                java.lang.String r4 = "android/view/View_EXEC_"
                java.lang.String r5 = "setVisibility"
                java.lang.String r6 = "(I)V"
                j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            L_0x0065:
                com.tencent.mm.ui.chatting.i3 r9 = com.tencent.p014mm.p136ui.chatting.C73721i3.this
                android.app.Activity r9 = r9.f216465g
                if (r9 == 0) goto L_0x0076
                android.view.Window r9 = r9.getWindow()
                if (r9 == 0) goto L_0x0076
                android.view.View r9 = r9.getDecorView()
                goto L_0x0077
            L_0x0076:
                r9 = 0
            L_0x0077:
                if (r9 != 0) goto L_0x007a
                goto L_0x00b8
            L_0x007a:
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r12.mo10233c(r11)
                java.lang.Object[] r1 = r12.mo10232b()
                java.lang.String r2 = "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback"
                java.lang.String r3 = "onViewPositionChanged"
                java.lang.String r4 = "(Landroid/view/View;IIII)V"
                java.lang.String r5 = "android/view/View_EXEC_"
                java.lang.String r6 = "setVisibility"
                java.lang.String r7 = "(I)V"
                r0 = r9
                j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
                java.lang.Object r10 = r12.mo10231a(r10)
                java.lang.Integer r10 = (java.lang.Integer) r10
                int r10 = r10.intValue()
                r9.setVisibility(r10)
                java.lang.String r1 = "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback"
                java.lang.String r2 = "onViewPositionChanged"
                java.lang.String r3 = "(Landroid/view/View;IIII)V"
                java.lang.String r4 = "android/view/View_EXEC_"
                java.lang.String r5 = "setVisibility"
                java.lang.String r6 = "(I)V"
                j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73721i3.C73722a.mo96791i(android.view.View, int, int, int, int):void");
        }

        /* renamed from: j */
        public void mo96792j(View view, float f, float f2) {
            C87412m.m108594g(view, "releasedChild");
            C73721i3 i3Var = C73721i3.this;
            if (((float) view.getTop()) <= i3Var.f216467i) {
                C108547c cVar = i3Var.f216466h;
                if (cVar != null) {
                    cVar.mo159430s(0, 0);
                }
            } else {
                C108547c cVar2 = i3Var.f216466h;
                if (cVar2 != null) {
                    cVar2.mo159430s(0, i3Var.f216468j);
                }
            }
            C73721i3.this.invalidate();
        }

        /* renamed from: k */
        public boolean mo96793k(View view, int i) {
            C87412m.m108594g(view, "child");
            ViewGroup viewGroup = C73721i3.this.f216463e;
            if (viewGroup == null) {
                return true;
            }
            viewGroup.setBackgroundColor(0);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73721i3(Activity activity, C32226l<? super MotionEvent, Boolean> lVar) {
        super(activity);
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(lVar, "dragEnableBlock");
        this.f216462d = lVar;
        this.f216465g = activity;
    }

    /* renamed from: a */
    public final void mo102796a(int i) {
        Activity activity = this.f216465g;
        if (activity != null) {
            View decorView = activity.getWindow().getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            this.f216463e = viewGroup;
            this.f216464f = viewGroup.getChildAt(0);
            ViewGroup viewGroup2 = this.f216463e;
            C87412m.m108591d(viewGroup2);
            viewGroup2.removeView(this.f216464f);
            addView(this.f216464f);
            ViewGroup viewGroup3 = this.f216463e;
            C87412m.m108591d(viewGroup3);
            viewGroup3.addView(this);
            C46746a.f125826a.mo71977j(this.f216464f, (float) C76577a.m92151b(MMApplicationContext.getContext(), 12), true, false);
            this.f216468j = i;
            this.f216467i = ((float) i) * 0.3f;
        }
    }

    public void computeScroll() {
        C108547c cVar = this.f216466h;
        boolean z = false;
        if (cVar != null && cVar.mo159420h(true)) {
            z = true;
        }
        if (z) {
            invalidate();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C108547c cVar;
        C87412m.m108594g(motionEvent, "event");
        if (!this.f216462d.invoke(motionEvent).booleanValue() || (cVar = this.f216466h) == null) {
            return false;
        }
        return cVar.mo159431t(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        C108547c cVar = this.f216466h;
        if (cVar == null) {
            return true;
        }
        cVar.mo159424m(motionEvent);
        return true;
    }
}
