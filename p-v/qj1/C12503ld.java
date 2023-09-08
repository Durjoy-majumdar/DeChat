package qj1;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import cl1.C54979h1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;

/* renamed from: qj1.ld */
public final class C12503ld extends C62660c {

    /* renamed from: p */
    public final ViewGroup f35955p;

    /* renamed from: q */
    public final String f35956q = "FinderLivePromoteBubbleStatusPlugin";

    /* renamed from: r */
    public final C13601g f35957r = C36568h.m40985a(new C12506c(this));

    /* renamed from: s */
    public final C13601g f35958s = C36568h.m40985a(new C12505b(this));

    /* renamed from: qj1.ld$a */
    public static final class C12504a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C12503ld f35959d;

        public C12504a(C12503ld ldVar) {
            this.f35959d = ldVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubbleStatusPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Log.m105924i(this.f35959d.f35956q, "[onTouch] touch to dimiss");
            this.f35959d.mo10792g(8);
            boolean z = motionEvent.getAction() != 2;
            C117292a.m165362h(z, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubbleStatusPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z;
        }
    }

    /* renamed from: qj1.ld$b */
    public static final class C12505b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C12503ld f35960d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12505b(C12503ld ldVar) {
            super(0);
            this.f35960d = ldVar;
        }

        public Object invoke() {
            return this.f35960d.f35955p.findViewById(C0966R.C0970id.odg);
        }
    }

    /* renamed from: qj1.ld$c */
    public static final class C12506c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C12503ld f35961d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12506c(C12503ld ldVar) {
            super(0);
            this.f35961d = ldVar;
        }

        public Object invoke() {
            return (TextView) this.f35961d.f35955p.findViewById(C0966R.C0970id.odi);
        }
    }

    /* renamed from: qj1.ld$d */
    public static final class C12507d<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12503ld f35962d;

        public C12507d(C12503ld ldVar) {
            this.f35962d = ldVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x0194  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                te3.su0 r1 = (te3.C51298su0) r1
                qj1.ld r2 = r0.f35962d
                java.lang.String r2 = r2.f35956q
                java.lang.String r3 = "receive promote status msg"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                ok1.e r2 = ok1.C62042e.f176370a
                boolean r2 = r2.mo87027N0()
                if (r2 == 0) goto L_0x019e
                qj1.ld r2 = r0.f35962d
                java.lang.String r3 = "it"
                gy3.C87412m.m108593f(r1, r3)
                java.lang.Class<qj1.l0> r3 = qj1.C12490l0.class
                qj1.c r3 = r2.mo87687E0(r3)
                qj1.l0 r3 = (qj1.C12490l0) r3
                if (r3 == 0) goto L_0x0191
                sp1.a r3 = r3.f35929s
                android.view.ViewGroup r3 = r3.f38868a
                if (r3 == 0) goto L_0x0191
                boolean r5 = r3.isShown()
                if (r5 == 0) goto L_0x0035
                goto L_0x0036
            L_0x0035:
                r3 = 0
            L_0x0036:
                if (r3 == 0) goto L_0x0191
                java.lang.String r5 = r2.f35956q
                java.lang.String r6 = "[refreshBubble] go show bubble"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                r5 = 8
                r2.mo10792g(r5)
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.graphics.Point r5 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r5)
                int r6 = r5.y
                int r5 = r5.x
                boolean r7 = r2.mo82893g0()
                if (r7 != 0) goto L_0x0058
                r7 = r6
                goto L_0x0059
            L_0x0058:
                r7 = r5
            L_0x0059:
                boolean r8 = r2.mo82893g0()
                if (r8 != 0) goto L_0x0061
                r8 = r5
                goto L_0x0062
            L_0x0061:
                r8 = r6
            L_0x0062:
                int[] r9 = o40.C61926c.m72690o(r3)
                r10 = 0
                r11 = r9[r10]
                int r12 = r3.getWidth()
                int r11 = r11 + r12
                r12 = 1
                r12 = r9[r12]
                android.view.ViewGroup r13 = r2.f35955p
                android.content.Context r13 = r13.getContext()
                android.content.res.Resources r13 = r13.getResources()
                r14 = 2131165279(0x7f07005f, float:1.794477E38)
                float r13 = r13.getDimension(r14)
                android.view.ViewGroup r14 = r2.f35955p
                android.content.Context r14 = r14.getContext()
                android.content.res.Resources r14 = r14.getResources()
                r15 = 2131165307(0x7f07007b, float:1.7944827E38)
                float r14 = r14.getDimension(r15)
                int r7 = r7 - r12
                float r7 = (float) r7
                float r7 = r7 - r13
                int r13 = r8 - r11
                float r13 = (float) r13
                android.view.ViewGroup r15 = r2.f35955p
                android.content.Context r15 = r15.getContext()
                android.content.res.Resources r15 = r15.getResources()
                r4 = 2131165284(0x7f070064, float:1.794478E38)
                float r4 = r15.getDimension(r4)
                float r13 = r13 - r4
                int r4 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
                if (r4 >= 0) goto L_0x00b0
                goto L_0x00b1
            L_0x00b0:
                r14 = r13
            L_0x00b1:
                android.view.ViewGroup r4 = r2.f35955p
                int r13 = r4.getPaddingLeft()
                android.view.ViewGroup r15 = r2.f35955p
                int r15 = r15.getPaddingTop()
                int r10 = (int) r14
                int r0 = (int) r7
                r4.setPadding(r13, r15, r10, r0)
                android.view.ViewGroup r0 = r2.f35955p
                boolean r4 = r0 instanceof android.widget.LinearLayout
                if (r4 == 0) goto L_0x00cb
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                goto L_0x00cc
            L_0x00cb:
                r0 = 0
            L_0x00cc:
                if (r0 != 0) goto L_0x00cf
                goto L_0x00d4
            L_0x00cf:
                r4 = 85
                r0.setGravity(r4)
            L_0x00d4:
                float r0 = (float) r8
                float r0 = r0 - r14
                android.view.ViewGroup r4 = r2.f35955p
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r8 = 2131165324(0x7f07008c, float:1.7944862E38)
                float r4 = r4.getDimension(r8)
                float r8 = (float) r11
                float r0 = r0 - r8
                int r8 = r3.getWidth()
                r10 = 2
                int r8 = r8 / r10
                float r8 = (float) r8
                float r10 = (float) r10
                float r4 = r4 / r10
                float r8 = r8 - r4
                float r0 = r0 + r8
                rx3.g r4 = r2.f35958s
                rx3.n r4 = (rx3.C36570n) r4
                java.lang.Object r4 = r4.getValue()
                android.view.View r4 = (android.view.View) r4
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                boolean r8 = r4 instanceof android.widget.LinearLayout.LayoutParams
                if (r8 == 0) goto L_0x0109
                android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
                goto L_0x010a
            L_0x0109:
                r4 = 0
            L_0x010a:
                if (r4 == 0) goto L_0x011c
                int r0 = (int) r0
                r4.rightMargin = r0
                rx3.g r0 = r2.f35958s
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                android.view.View r0 = (android.view.View) r0
                r0.setLayoutParams(r4)
            L_0x011c:
                er1.j4 r0 = er1.C58739j4.f168176a
                boolean r0 = r0.mo83692U()
                if (r0 == 0) goto L_0x017b
                java.lang.String r0 = r2.f35956q
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r8 = "targetView = "
                r4.append(r8)
                r4.append(r3)
                java.lang.String r3 = ",targetViewLoc-x = "
                r4.append(r3)
                r3 = 0
                r8 = r9[r3]
                r4.append(r8)
                java.lang.String r3 = ", screenHeightHardWare = "
                r4.append(r3)
                r4.append(r6)
                java.lang.String r3 = ", screenWidthHardWare = "
                r4.append(r3)
                r4.append(r5)
                java.lang.String r3 = ", targetViewRight = "
                r4.append(r3)
                r4.append(r11)
                java.lang.String r3 = ", targetViewTop = "
                r4.append(r3)
                r4.append(r12)
                java.lang.String r3 = ", paddingBottom = "
                r4.append(r3)
                r4.append(r7)
                java.lang.String r3 = ", paddingEnd = "
                r4.append(r3)
                r4.append(r14)
                java.lang.String r3 = ", "
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            L_0x017b:
                rx3.g r0 = r2.f35957r
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r1 = r1.f141758h
                r0.setText(r1)
                r0 = 0
                r2.mo10792g(r0)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                goto L_0x0192
            L_0x0191:
                r4 = 0
            L_0x0192:
                if (r4 != 0) goto L_0x019b
                java.lang.String r0 = r2.f35956q
                java.lang.String r1 = "[refreshBubble] shop entrance is not Shown"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            L_0x019b:
                r0 = r16
                goto L_0x01a7
            L_0x019e:
                qj1.ld r1 = r0.f35962d
                java.lang.String r1 = r1.f35956q
                java.lang.String r2 = "receive promote status msg, but not allow"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            L_0x01a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12503ld.C12507d.onChanged(java.lang.Object):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12503ld(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35955p = viewGroup;
        viewGroup.setOnTouchListener(new C12504a(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        ((C54979h1) mo87696x0(C54979h1.class)).f154115G.observe(this, new C12507d(this));
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }
}
