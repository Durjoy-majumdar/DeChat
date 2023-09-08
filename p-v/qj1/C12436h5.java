package qj1;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: qj1.h5 */
public final class C12436h5 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C12322e5 f35812d;

    /* renamed from: qj1.h5$a */
    public static final class C12437a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f35813d;

        public C12437a(View view) {
            this.f35813d = view;
        }

        public final void run() {
            View view = this.f35813d;
            LinearLayoutManager linearLayoutManager = null;
            RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
            RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            }
            if (linearLayoutManager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(500);
                aVar.mo10233c(0);
                C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$2$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$2$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
    }

    public C12436h5(C12322e5 e5Var) {
        this.f35812d = e5Var;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [rx3.b0] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (r0 != 3) goto L_0x01d2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r12)
            r0.add(r13)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$2"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r11
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            er1.k r0 = er1.C45684k.f123488a
            qj1.e5 r1 = r11.f35812d
            fj1.b r1 = r1.mo87684A0()
            boolean r0 = r0.mo71181b(r1)
            r1 = 0
            if (r0 == 0) goto L_0x003b
            r2 = 0
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$2"
            java.lang.String r5 = "android/view/View$OnTouchListener"
            java.lang.String r6 = "onTouch"
            java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = r11
            j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x003b:
            int r0 = r13.getAction()
            java.lang.String r2 = "Finder.LiveCommentPlugin"
            java.lang.String r3 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            r4 = 1
            if (r0 == 0) goto L_0x018d
            r5 = 0
            if (r0 == r4) goto L_0x0182
            r6 = 2
            if (r0 == r6) goto L_0x0051
            r12 = 3
            if (r0 == r12) goto L_0x0182
            goto L_0x01d2
        L_0x0051:
            qj1.e5 r0 = r11.f35812d
            java.lang.Float r7 = r0.f35531v
            if (r7 == 0) goto L_0x0140
            float r7 = r7.floatValue()
            float r8 = r13.getY()
            float r8 = r8 - r7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "ken-ontouch-move, actionDownY = "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = ", moveY = "
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            boolean r7 = r0.f35534y
            if (r7 != 0) goto L_0x013e
            float r7 = java.lang.Math.abs(r8)
            r9 = 1125515264(0x43160000, float:150.0)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x013e
            r7 = 0
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00b6
            boolean r6 = r0.f35533x
            if (r6 == 0) goto L_0x013e
            boolean r6 = r0.mo12019a1(r4)
            if (r6 == 0) goto L_0x013e
            java.lang.String r6 = "ken-drag-top"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            qj1.C12322e5.m11875Z0(r0, r1)
            r0.f35534y = r4
            boolean r0 = r12 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L_0x00aa
            r5 = r12
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
        L_0x00aa:
            if (r5 == 0) goto L_0x013e
            qj1.h5$a r0 = new qj1.h5$a
            r0.<init>(r12)
            r5.post(r0)
            goto L_0x013e
        L_0x00b6:
            boolean r12 = r0.f35532w
            if (r12 == 0) goto L_0x013e
            java.lang.Class<cl1.o> r12 = cl1.C54991o.class
            androidx.lifecycle.i0 r12 = r0.mo87696x0(r12)
            cl1.o r12 = (cl1.C54991o) r12
            boolean r12 = r12.mo75960G3()
            java.lang.Class<qj1.dd> r5 = qj1.C62712dd.class
            qj1.c r5 = r0.mo87687E0(r5)
            qj1.dd r5 = (qj1.C62712dd) r5
            if (r5 == 0) goto L_0x00d8
            int r5 = r5.mo14483f0()
            if (r5 != 0) goto L_0x00d8
            r5 = 1
            goto L_0x00d9
        L_0x00d8:
            r5 = 0
        L_0x00d9:
            java.lang.Class<cl1.d0> r7 = cl1.C54963d0.class
            androidx.lifecycle.i0 r7 = r0.mo87696x0(r7)
            cl1.d0 r7 = (cl1.C54963d0) r7
            java.util.List r7 = r7.mo75929l3()
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x00ed
            r7 = 1
            goto L_0x00ee
        L_0x00ed:
            r7 = 0
        L_0x00ee:
            com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout r8 = r0.f35530u
            int r8 = r8.getMaxHeight()
            rx3.g r9 = r0.f35518P
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r9 = r9 + r8
            if (r12 != 0) goto L_0x0107
            if (r5 == 0) goto L_0x0131
        L_0x0107:
            if (r7 != 0) goto L_0x0131
            boolean r12 = r0.f35519Q
            if (r12 != 0) goto L_0x0131
            boolean r12 = r0.f35535z
            if (r12 == 0) goto L_0x0131
            r0.f35519Q = r4
            r0.f35520R = r1
            int[] r12 = new int[r6]
            r12[r1] = r8
            r12[r4] = r9
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofInt(r12)
            r5 = 100
            r12.setDuration(r5)
            qj1.f5 r5 = new qj1.f5
            r5.<init>(r0)
            r12.addUpdateListener(r5)
            r12.start()
            r12 = 1
            goto L_0x0132
        L_0x0131:
            r12 = 0
        L_0x0132:
            if (r12 == 0) goto L_0x013e
            qj1.C12322e5.m11875Z0(r0, r4)
            r0.f35534y = r4
            java.lang.String r12 = "ken-drag-bottom"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
        L_0x013e:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0140:
            if (r5 != 0) goto L_0x01d2
            qj1.e5 r12 = r11.f35812d
            boolean r0 = r12.mo12028j1()
            r12.f35532w = r0
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r12.mo12024f1()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            gy3.C87412m.m108592e(r0, r3)
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.mo17004z()
            if (r0 != 0) goto L_0x015e
            goto L_0x015f
        L_0x015e:
            r4 = 0
        L_0x015f:
            r12.f35533x = r4
            float r13 = r13.getY()
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r12.f35531v = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "ken-ontouch-move, init actionDownY = "
            r13.append(r0)
            java.lang.Float r12 = r12.f35531v
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
            goto L_0x01d2
        L_0x0182:
            qj1.e5 r12 = r11.f35812d
            r12.f35531v = r5
            r12.f35533x = r1
            r12.f35532w = r1
            r12.f35534y = r1
            goto L_0x01d2
        L_0x018d:
            qj1.e5 r12 = r11.f35812d
            float r13 = r13.getY()
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r12.f35531v = r13
            qj1.e5 r12 = r11.f35812d
            boolean r13 = r12.mo12028j1()
            r12.f35532w = r13
            qj1.e5 r12 = r11.f35812d
            com.tencent.mm.view.recyclerview.WxRecyclerView r13 = r12.mo12024f1()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r13 = r13.getLayoutManager()
            gy3.C87412m.m108592e(r13, r3)
            androidx.recyclerview.widget.LinearLayoutManager r13 = (androidx.recyclerview.widget.LinearLayoutManager) r13
            int r13 = r13.mo17004z()
            if (r13 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x01b7:
            r4 = 0
        L_0x01b8:
            r12.f35533x = r4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "ken-ontouch-down, actionDownY = "
            r12.append(r13)
            qj1.e5 r13 = r11.f35812d
            java.lang.Float r13 = r13.f35531v
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
        L_0x01d2:
            r3 = 0
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$2"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r11
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12436h5.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
