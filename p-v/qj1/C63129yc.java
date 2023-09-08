package qj1;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;

/* renamed from: qj1.yc */
public final class C63129yc extends C62660c {

    /* renamed from: p */
    public final ViewGroup f179146p;

    /* renamed from: q */
    public final String f179147q = "FinderLiveOneClickGameTipsPlugin";

    /* renamed from: r */
    public final C13601g f179148r = C36568h.m40985a(new C63137h(this));

    /* renamed from: s */
    public final C13601g f179149s;

    /* renamed from: qj1.yc$a */
    public static final class C63130a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C63129yc f179150d;

        public C63130a(C63129yc ycVar) {
            this.f179150d = ycVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f179150d.mo88059a1();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: qj1.yc$b */
    public static final class C63131b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63129yc f179151d;

        /* renamed from: e */
        public final /* synthetic */ C58124b f179152e;

        public C63131b(C63129yc ycVar, C58124b bVar) {
            this.f179151d = ycVar;
            this.f179152e = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f179151d.mo88059a1();
            if (((C54991o) this.f179151d.mo87696x0(C54991o.class)).f154190D) {
                C58124b.C7172a.m7372a(this.f179152e, C58124b.C58125b.FINDER_LIVE_VISITOR_GAME_PLAY_TOGETHER_SHOW_HALF, (Bundle) null, 2, (Object) null);
            } else {
                C58124b.C7172a.m7372a(this.f179152e, C58124b.C58125b.FINDER_LIVE_ANCHOR_GAME_PLAY_TOGETHER_SHOW_HALF, (Bundle) null, 2, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.yc$c */
    public static final class C63132c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C63129yc f179153d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63132c(C63129yc ycVar) {
            super(0);
            this.f179153d = ycVar;
        }

        public Object invoke() {
            return this.f179153d.f179146p.findViewById(C0966R.C0970id.nuq);
        }
    }

    /* renamed from: qj1.yc$d */
    public static final class C63133d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C63129yc f179154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63133d(C63129yc ycVar) {
            super(0);
            this.f179154d = ycVar;
        }

        public Object invoke() {
            return this.f179154d.f179146p.findViewById(C0966R.C0970id.nur);
        }
    }

    /* renamed from: qj1.yc$e */
    public static final class C63134e<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C63129yc f179155d;

        public C63134e(C63129yc ycVar) {
            this.f179155d = ycVar;
        }

        public void onChanged(Object obj) {
            Class cls = C54991o.class;
            if (C87412m.m108589b((Boolean) obj, Boolean.TRUE)) {
                String str = ((C54991o) this.f179155d.mo87696x0(cls)).f154306d4;
                if (!(str == null || str.length() == 0)) {
                    C63129yc ycVar = this.f179155d;
                    ycVar.mo88061c1(((C54991o) ycVar.mo87696x0(cls)).f154306d4);
                }
            }
        }
    }

    /* renamed from: qj1.yc$f */
    public static final class C63135f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63129yc f179156d;

        /* renamed from: e */
        public final /* synthetic */ View f179157e;

        /* renamed from: f */
        public final /* synthetic */ String f179158f;

        public C63135f(C63129yc ycVar, View view, String str) {
            this.f179156d = ycVar;
            this.f179157e = view;
            this.f179158f = str;
        }

        public final void run() {
            this.f179156d.mo88059a1();
            C63129yc.m74464Z0(this.f179156d, this.f179157e);
            this.f179156d.mo10792g(0);
            ((TextView) ((C36570n) this.f179156d.f179148r).getValue()).setText(this.f179158f);
            ((C54991o) this.f179156d.mo87696x0(C54991o.class)).f154306d4 = null;
        }
    }

    /* renamed from: qj1.yc$g */
    public static final class C63136g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63129yc f179159d;

        /* renamed from: e */
        public final /* synthetic */ View f179160e;

        public C63136g(C63129yc ycVar, View view) {
            this.f179159d = ycVar;
            this.f179160e = view;
        }

        public final void run() {
            C63129yc.m74464Z0(this.f179159d, this.f179160e);
        }
    }

    /* renamed from: qj1.yc$h */
    public static final class C63137h extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63129yc f179161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63137h(C63129yc ycVar) {
            super(0);
            this.f179161d = ycVar;
        }

        public Object invoke() {
            return (TextView) this.f179161d.f179146p.findViewById(C0966R.C0970id.nut);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63129yc(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f179146p = viewGroup;
        C13601g a = C36568h.m40985a(new C63133d(this));
        this.f179149s = C36568h.m40985a(new C63132c(this));
        viewGroup.setOnTouchListener(new C63130a(this));
        ((View) a.getValue()).setOnClickListener(new C63131b(this, bVar));
    }

    /* JADX WARNING: type inference failed for: r8v23, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m74464Z0(qj1.C63129yc r14, android.view.View r15) {
        /*
            r14.getClass()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r0)
            int r1 = r0.y
            int r0 = r0.x
            boolean r2 = r14.mo82893g0()
            if (r2 != 0) goto L_0x0017
            r2 = r1
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            boolean r3 = r14.mo82893g0()
            if (r3 != 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            int[] r4 = o40.C61926c.m72690o(r15)
            r5 = 0
            r6 = r4[r5]
            int r7 = r15.getWidth()
            int r6 = r6 + r7
            r7 = 1
            r7 = r4[r7]
            android.view.ViewGroup r8 = r14.f179146p
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131165279(0x7f07005f, float:1.794477E38)
            float r8 = r8.getDimension(r9)
            android.view.ViewGroup r9 = r14.f179146p
            android.content.Context r9 = r9.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165307(0x7f07007b, float:1.7944827E38)
            float r9 = r9.getDimension(r10)
            android.view.ViewGroup r10 = r14.f179146p
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r10 = r10.getDimension(r11)
            int r2 = r2 - r7
            float r2 = (float) r2
            float r2 = r2 - r8
            java.lang.Class<cl1.o> r8 = cl1.C54991o.class
            androidx.lifecycle.i0 r8 = r14.mo87696x0(r8)
            cl1.o r8 = (cl1.C54991o) r8
            boolean r8 = r8.f154190D
            if (r8 == 0) goto L_0x0073
            float r2 = r2 - r10
        L_0x0073:
            int r8 = r3 - r6
            float r8 = (float) r8
            android.view.ViewGroup r10 = r14.f179146p
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131165351(0x7f0700a7, float:1.7944917E38)
            float r10 = r10.getDimension(r11)
            float r8 = r8 - r10
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 >= 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r9 = r8
        L_0x008e:
            android.view.ViewGroup r8 = r14.f179146p
            int r10 = r8.getPaddingLeft()
            android.view.ViewGroup r11 = r14.f179146p
            int r11 = r11.getPaddingTop()
            int r12 = (int) r9
            int r13 = (int) r2
            r8.setPadding(r10, r11, r12, r13)
            android.view.ViewGroup r8 = r14.f179146p
            boolean r10 = r8 instanceof android.widget.LinearLayout
            r11 = 0
            if (r10 == 0) goto L_0x00a9
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            goto L_0x00aa
        L_0x00a9:
            r8 = r11
        L_0x00aa:
            if (r8 != 0) goto L_0x00ad
            goto L_0x00b2
        L_0x00ad:
            r10 = 85
            r8.setGravity(r10)
        L_0x00b2:
            float r3 = (float) r3
            float r3 = r3 - r9
            android.view.ViewGroup r8 = r14.f179146p
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r10 = 2131165371(0x7f0700bb, float:1.7944957E38)
            float r8 = r8.getDimension(r10)
            float r12 = (float) r6
            float r3 = r3 - r12
            int r12 = r15.getWidth()
            r13 = 2
            int r12 = r12 / r13
            float r12 = (float) r12
            float r13 = (float) r13
            float r8 = r8 / r13
            float r12 = r12 - r8
            float r3 = r3 + r12
            rx3.g r8 = r14.f179149s
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            boolean r12 = r8 instanceof android.widget.LinearLayout.LayoutParams
            if (r12 == 0) goto L_0x00e7
            r11 = r8
            android.widget.LinearLayout$LayoutParams r11 = (android.widget.LinearLayout.LayoutParams) r11
        L_0x00e7:
            if (r11 == 0) goto L_0x010a
            int r3 = (int) r3
            r11.rightMargin = r3
            android.view.ViewGroup r3 = r14.f179146p
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            float r3 = r3.getDimension(r10)
            int r3 = (int) r3
            r11.bottomMargin = r3
            rx3.g r3 = r14.f179149s
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            r3.setLayoutParams(r11)
        L_0x010a:
            er1.j4 r3 = er1.C58739j4.f168176a
            boolean r3 = r3.mo83692U()
            if (r3 == 0) goto L_0x0168
            java.lang.String r14 = r14.f179147q
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "targetView = "
            r3.append(r8)
            r3.append(r15)
            java.lang.String r15 = ",targetViewLoc-x = "
            r3.append(r15)
            r15 = r4[r5]
            r3.append(r15)
            java.lang.String r15 = ", screenHeightHardWare = "
            r3.append(r15)
            r3.append(r1)
            java.lang.String r15 = ", screenWidthHardWare = "
            r3.append(r15)
            r3.append(r0)
            java.lang.String r15 = ", targetViewRight = "
            r3.append(r15)
            r3.append(r6)
            java.lang.String r15 = ", targetViewTop = "
            r3.append(r15)
            r3.append(r7)
            java.lang.String r15 = ", paddingBottom = "
            r3.append(r15)
            r3.append(r2)
            java.lang.String r15 = ", paddingEnd = "
            r3.append(r15)
            r3.append(r9)
            java.lang.String r15 = ", "
            r3.append(r15)
            java.lang.String r15 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)
        L_0x0168:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63129yc.m74464Z0(qj1.yc, android.view.View):void");
    }

    /* renamed from: a1 */
    public final void mo88059a1() {
        mo10792g(8);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final View mo88060b1() {
        C12490l0 l0Var;
        if (((C54991o) mo87696x0(C54991o.class)).f154190D) {
            C62741dg dgVar = (C62741dg) mo87687E0(C62741dg.class);
            if (dgVar != null) {
                return dgVar.f178129x.f172521a;
            }
            return null;
        } else if (!C62042e.f176370a.mo87027N0() || (l0Var = (C12490l0) mo87687E0(C12490l0.class)) == null) {
            return null;
        } else {
            return l0Var.f35936z.f28784a;
        }
    }

    /* renamed from: c1 */
    public final void mo88061c1(String str) {
        View findViewById;
        View b1 = mo88060b1();
        if (!(b1 == null || (findViewById = b1.findViewById(C0966R.C0970id.dld)) == null)) {
            if (!findViewById.isShown()) {
                findViewById = null;
            }
            if (findViewById != null) {
                findViewById.post(new C63135f(this, findViewById, str));
                return;
            }
        }
        mo88059a1();
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        ((C54991o) mo87696x0(C54991o.class)).f154290Z3.observe(this, new C63134e(this));
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r3 = r3.f179023q;
     */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210u0(d60.C58124b.C58125b r3, android.os.Bundle r4) {
        /*
            r2 = this;
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            java.lang.String r0 = "status"
            gy3.C87412m.m108594g(r3, r0)
            int r3 = r3.ordinal()
            r0 = 118(0x76, float:1.65E-43)
            if (r3 == r0) goto L_0x0016
            r0 = 120(0x78, float:1.68E-43)
            if (r3 == r0) goto L_0x0016
            goto L_0x0089
        L_0x0016:
            java.lang.Class<qj1.w6> r3 = qj1.C63084w6.class
            qj1.c r3 = r2.mo87687E0(r3)
            qj1.w6 r3 = (qj1.C63084w6) r3
            r0 = 0
            if (r3 == 0) goto L_0x0030
            il1.p4 r3 = r3.f179023q
            if (r3 == 0) goto L_0x0030
            java.lang.Boolean r3 = r3.mo85447c()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r3 = gy3.C87412m.m108589b(r3, r1)
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x0037
            r2.mo88059a1()
            return
        L_0x0037:
            int r3 = r2.mo14483f0()
            r1 = 0
            if (r3 != 0) goto L_0x0063
            android.view.View r3 = r2.mo88060b1()
            if (r3 == 0) goto L_0x005f
            r4 = 2131303512(0x7f091c58, float:1.822514E38)
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x005f
            boolean r4 = r3.isShown()
            if (r4 == 0) goto L_0x0054
            r1 = r3
        L_0x0054:
            if (r1 == 0) goto L_0x005f
            qj1.yc$g r3 = new qj1.yc$g
            r3.<init>(r2, r1)
            r1.post(r3)
            goto L_0x0089
        L_0x005f:
            r2.mo88059a1()
            goto L_0x0089
        L_0x0063:
            androidx.lifecycle.i0 r3 = r2.mo87696x0(r4)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154306d4
            if (r3 == 0) goto L_0x0073
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0074
        L_0x0073:
            r0 = 1
        L_0x0074:
            if (r0 != 0) goto L_0x0089
            androidx.lifecycle.i0 r3 = r2.mo87696x0(r4)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154306d4
            r2.mo88061c1(r3)
            androidx.lifecycle.i0 r3 = r2.mo87696x0(r4)
            cl1.o r3 = (cl1.C54991o) r3
            r3.f154306d4 = r1
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63129yc.mo3210u0(d60.b$b, android.os.Bundle):void");
    }
}
