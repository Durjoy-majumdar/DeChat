package qj1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cl1.C54991o;
import cl1.C55001u;
import cl1.C55004v1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: qj1.db */
public final class C62707db extends C62660c {

    /* renamed from: p */
    public final C58124b f178043p;

    /* renamed from: q */
    public final RelativeLayout f178044q;

    /* renamed from: r */
    public final View f178045r;

    /* renamed from: s */
    public final View f178046s;

    /* renamed from: t */
    public boolean f178047t;

    /* renamed from: u */
    public boolean f178048u = true;

    /* renamed from: v */
    public int f178049v;

    /* renamed from: qj1.db$a */
    public static final class C62708a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62707db f178050d;

        public C62708a(C62707db dbVar) {
            this.f178050d = dbVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMultiStreamBubblePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f178050d.mo87720b1();
            this.f178050d.mo87721c1();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMultiStreamBubblePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.db$b */
    public static final class C62709b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62707db f178051d;

        public C62709b(C62707db dbVar) {
            this.f178051d = dbVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMultiStreamBubblePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C55004v1) this.f178051d.mo87696x0(C55004v1.class)).f154435f.postValue(Boolean.TRUE);
            this.f178051d.mo87720b1();
            this.f178051d.mo87721c1();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMultiStreamBubblePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.db$c */
    public /* synthetic */ class C62710c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f178052a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[118] = 1;
            f178052a = iArr;
        }
    }

    /* renamed from: qj1.db$d */
    public static final class C62711d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62707db f178053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62711d(C62707db dbVar) {
            super(0);
            this.f178053d = dbVar;
        }

        public Object invoke() {
            this.f178053d.mo87718Z0();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62707db(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178043p = bVar;
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(C0966R.C0970id.bkl);
        this.f178044q = relativeLayout;
        this.f178045r = viewGroup.findViewById(C0966R.C0970id.bkm);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.bkk);
        this.f178046s = findViewById;
        findViewById.setOnClickListener(new C62708a(this));
        relativeLayout.setOnClickListener(new C62709b(this));
        ((TextView) viewGroup.findViewById(C0966R.C0970id.bkn)).setText(viewGroup.getContext().getResources().getString(C0966R.string.mau));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b8  */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87718Z0() {
        /*
            r13 = this;
            java.lang.Class<qj1.l0> r0 = qj1.C12490l0.class
            java.lang.Class<qj1.dg> r1 = qj1.C62741dg.class
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r3 = r2.mo87027N0()
            r4 = 0
            if (r3 == 0) goto L_0x001a
            qj1.c r3 = r13.mo87687E0(r0)
            qj1.l0 r3 = (qj1.C12490l0) r3
            if (r3 == 0) goto L_0x0027
            il1.t5 r3 = r3.f35931u
            android.view.ViewGroup r3 = r3.f172514a
            goto L_0x0028
        L_0x001a:
            qj1.c r3 = r13.mo87687E0(r1)
            qj1.dg r3 = (qj1.C62741dg) r3
            if (r3 == 0) goto L_0x0027
            il1.t5 r3 = r3.f178126u
            android.view.ViewGroup r3 = r3.f172514a
            goto L_0x0028
        L_0x0027:
            r3 = r4
        L_0x0028:
            boolean r5 = r2.mo87027N0()
            if (r5 == 0) goto L_0x003b
            qj1.c r0 = r13.mo87687E0(r0)
            qj1.l0 r0 = (qj1.C12490l0) r0
            if (r0 == 0) goto L_0x0048
            il1.t5 r0 = r0.f35931u
            android.view.ViewGroup r0 = r0.f172514a
            goto L_0x0049
        L_0x003b:
            qj1.c r0 = r13.mo87687E0(r1)
            qj1.dg r0 = (qj1.C62741dg) r0
            if (r0 == 0) goto L_0x0048
            il1.t5 r0 = r0.f178126u
            android.view.ViewGroup r0 = r0.f172514a
            goto L_0x0049
        L_0x0048:
            r0 = r4
        L_0x0049:
            if (r0 == 0) goto L_0x0050
            int[] r1 = o40.C61926c.m72690o(r0)
            goto L_0x0051
        L_0x0050:
            r1 = r4
        L_0x0051:
            r5 = 0
            if (r0 == 0) goto L_0x0059
            int r6 = r0.getWidth()
            goto L_0x005a
        L_0x0059:
            r6 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x0061
            int r7 = r0.getPaddingStart()
            goto L_0x0062
        L_0x0061:
            r7 = 0
        L_0x0062:
            int r6 = r6 - r7
            if (r0 == 0) goto L_0x006a
            int r7 = r0.getPaddingEnd()
            goto L_0x006b
        L_0x006a:
            r7 = 0
        L_0x006b:
            int r6 = r6 - r7
            if (r1 == 0) goto L_0x0079
            java.lang.Integer r1 = sx3.C110823p.m150981G(r1, r5)
            if (r1 == 0) goto L_0x0079
            int r1 = r1.intValue()
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            if (r0 == 0) goto L_0x0081
            int r0 = r0.getPaddingStart()
            goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            int r1 = r1 + r0
            int r6 = r6 / 2
            int r1 = r1 + r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "targetPos: "
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = " currentEntranceLocX: "
            r0.append(r6)
            int r6 = r13.f178049v
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "FinderLiveMultiStreamBubblePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.Class<cl1.v1> r0 = cl1.C55004v1.class
            androidx.lifecycle.i0 r0 = r13.mo87696x0(r0)
            cl1.v1 r0 = (cl1.C55004v1) r0
            java.util.LinkedList<te3.aq2> r0 = r0.f154438i
            int r0 = r0.size()
            r7 = 1
            if (r0 <= r7) goto L_0x01f5
            if (r3 == 0) goto L_0x00c2
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x00c2
            r0 = 1
            goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            if (r0 == 0) goto L_0x01f5
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r2.mo87106p0()
            java.lang.String r2 = r13.mo87719a1()
            int r0 = r0.getInt(r2, r5)
            if (r0 != 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            if (r7 == 0) goto L_0x01f5
            if (r1 == 0) goto L_0x01f5
            int r0 = r13.f178049v
            if (r0 != r1) goto L_0x00de
            return
        L_0x00de:
            r13.f178049v = r1
            boolean r0 = r13.f178048u
            if (r0 == 0) goto L_0x00f6
            a14.h0 r0 = a14.C53872d1.f151117a
            a14.k2 r8 = f14.C58901s.f168555a
            r9 = 0
            qj1.eb r10 = new qj1.eb
            r10.<init>(r13, r4)
            r11 = 2
            r12 = 0
            r7 = r13
            nk1.C11207i.m11072h(r7, r8, r9, r10, r11, r12)
            r13.f178048u = r5
        L_0x00f6:
            android.view.ViewGroup r0 = r13.f166287d
            android.content.Context r0 = r0.getContext()
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r0)
            int r0 = r0.x
            android.widget.RelativeLayout r2 = r13.f178044q
            int r2 = r2.getWidth()
            if (r2 != 0) goto L_0x011c
            android.view.ViewGroup r2 = r13.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165314(0x7f070082, float:1.7944842E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
        L_0x011c:
            android.view.ViewGroup r3 = r13.f166287d
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r3 = r3.getDimension(r4)
            int r3 = (int) r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "rootWidth: "
            r7.append(r8)
            android.view.ViewGroup r8 = r13.f166287d
            int r8 = r8.getWidth()
            r7.append(r8)
            java.lang.String r8 = " bubbleWidth: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = " screenWidth: "
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = " targetPos: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r8 = " margin: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            android.view.ViewGroup r6 = r13.f166287d
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            gy3.C87412m.m108592e(r6, r7)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r7 = -1
            r6.setGravity(r7)
            int r6 = r0 / 2
            r7 = 11
            r8 = 9
            java.lang.String r9 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            if (r1 >= r6) goto L_0x0191
            android.widget.RelativeLayout r0 = r13.f178044q
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            gy3.C87412m.m108592e(r0, r9)
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r0.addRule(r8)
            r0.removeRule(r7)
            goto L_0x01bf
        L_0x0191:
            int r0 = r0 - r2
            if (r1 > r0) goto L_0x01ae
            android.widget.RelativeLayout r0 = r13.f178044q
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            gy3.C87412m.m108592e(r0, r9)
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r0.removeRule(r7)
            r0.addRule(r8)
            int r2 = r2 / 2
            int r2 = r1 - r2
            int r2 = r2 - r3
            r0.setMarginStart(r2)
            goto L_0x01bf
        L_0x01ae:
            android.widget.RelativeLayout r0 = r13.f178044q
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            gy3.C87412m.m108592e(r0, r9)
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r0.removeRule(r8)
            r0.addRule(r7)
        L_0x01bf:
            android.view.ViewGroup r0 = r13.f166287d
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            float r0 = r0.getDimension(r4)
            int r0 = (int) r0
            android.view.View r2 = r13.f178045r
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            gy3.C87412m.m108592e(r2, r9)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r4 = 7
            r2.removeRule(r4)
            r4 = 19
            r2.removeRule(r4)
            r2.addRule(r8)
            r2.setMarginEnd(r5)
            int r0 = r0 / 2
            int r1 = r1 - r0
            int r1 = r1 - r3
            r2.setMarginStart(r1)
            android.view.ViewGroup r0 = r13.f166287d
            r0.requestLayout()
            goto L_0x01f8
        L_0x01f5:
            r13.mo87720b1()
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62707db.mo87718Z0():void");
    }

    /* renamed from: a1 */
    public final String mo87719a1() {
        return "MultiStream_" + ((C55001u) mo87696x0(C55001u.class)).f154420q.f182392d;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo87720b1() {
        mo10792g(8);
    }

    /* renamed from: c1 */
    public final void mo87721c1() {
        Log.m105924i("FinderLiveMultiStreamBubblePlugin", "markUse hasMarkUse: " + this.f178047t + " key: " + mo87719a1());
        mo87720b1();
        if (!this.f178047t) {
            this.f178047t = true;
            C62042e.f176370a.mo87106p0().putInt(mo87719a1(), 1);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C62710c.f178052a[bVar.ordinal()] == 1) {
            C61926c.m72666K(100, new C62711d(this));
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo10792g(8);
        this.f178047t = false;
        this.f178048u = true;
    }
}
