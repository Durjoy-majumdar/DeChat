package qj1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import cl1.C54951d;
import cl1.C54991o;
import cl1.C55004v1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.multistream.CommonCircleIndicator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import gy3.C87412m;
import java.util.WeakHashMap;
import kg3.C76577a;
import p849e3.C107168a0;
import p849e3.C107179f0;
import p849e3.C107204q;
import p849e3.C107207u;
import te3.C49712hj1;

/* renamed from: qj1.fb */
public final class C62772fb extends C62660c {

    /* renamed from: p */
    public final C58124b f178182p;

    /* renamed from: q */
    public final CommonCircleIndicator f178183q;

    /* renamed from: r */
    public boolean f178184r;

    /* renamed from: qj1.fb$a */
    public static final class C12397a implements C107204q {

        /* renamed from: a */
        public final /* synthetic */ C62772fb f35714a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f35715b;

        public C12397a(C62772fb fbVar, ViewGroup viewGroup) {
            this.f35714a = fbVar;
            this.f35715b = viewGroup;
        }

        /* renamed from: a */
        public final C107179f0 mo12075a(View view, C107179f0 f0Var) {
            if (!this.f35714a.mo82893g0() && !((C54991o) this.f35714a.mo87696x0(C54991o.class)).mo75992a4()) {
                ViewGroup.LayoutParams layoutParams = this.f35715b.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    ViewGroup viewGroup = this.f35715b;
                    layoutParams2.addRule(12);
                    layoutParams2.topMargin = 0;
                    layoutParams2.bottomMargin = C76577a.m92151b(MMApplicationContext.getContext(), 14) + C75044y4.m89991c(viewGroup.getContext());
                    Log.m105924i("MultiStreamIndicatorPlugin", "bottomMargin: " + layoutParams2.bottomMargin);
                }
                this.f35715b.requestLayout();
            }
            return C107207u.m145167h(view, f0Var);
        }
    }

    /* renamed from: qj1.fb$b */
    public /* synthetic */ class C62773b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f178185a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[7] = 1;
            f178185a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62772fb(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178182p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.mo_);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.circle_indicator)");
        this.f178183q = (CommonCircleIndicator) findViewById;
        super.mo10792g(8);
        C12397a aVar = new C12397a(this, viewGroup);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145236u(viewGroup, aVar);
    }

    /* renamed from: Z0 */
    public final void mo87771Z0() {
        if (((C54951d) mo87696x0(C54951d.class)).mo75869e3()) {
            this.f178183q.setAlpha(0.0f);
        } else {
            this.f178183q.setAlpha(1.0f);
        }
    }

    /* JADX WARNING: type inference failed for: r8v17, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87772a1(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r8 = r7.mo82893g0()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x00b4
            java.lang.Class<cl1.o> r8 = cl1.C54991o.class
            androidx.lifecycle.i0 r8 = r7.mo87696x0(r8)
            cl1.o r8 = (cl1.C54991o) r8
            boolean r8 = r8.mo75992a4()
            r2 = 12
            r3 = 0
            if (r8 == 0) goto L_0x0089
            boolean r8 = r7.mo82893g0()
            if (r8 != 0) goto L_0x00b4
            ok1.e r8 = ok1.C62042e.f176370a
            boolean r8 = r8.mo87027N0()
            if (r8 == 0) goto L_0x0035
            android.view.ViewGroup r8 = r7.f166287d
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r4 = 2131165337(0x7f070099, float:1.7944888E38)
            goto L_0x0042
        L_0x0035:
            android.view.ViewGroup r8 = r7.f166287d
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r4 = 2131165355(0x7f0700ab, float:1.7944925E38)
        L_0x0042:
            float r8 = r8.getDimension(r4)
            java.lang.Class<qj1.x6> r4 = qj1.C63102x6.class
            qj1.c r4 = r7.mo87687E0(r4)
            qj1.x6 r4 = (qj1.C63102x6) r4
            if (r4 == 0) goto L_0x0058
            int r5 = r4.mo14483f0()
            if (r5 != 0) goto L_0x0058
            r5 = 1
            goto L_0x0059
        L_0x0058:
            r5 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0062
            android.view.ViewGroup r4 = r4.f166287d
            int r4 = r4.getHeight()
            goto L_0x0063
        L_0x0062:
            r4 = 0
        L_0x0063:
            android.view.ViewGroup r5 = r7.f166287d
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r6 = r5 instanceof android.widget.RelativeLayout.LayoutParams
            if (r6 == 0) goto L_0x0070
            r3 = r5
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
        L_0x0070:
            if (r3 == 0) goto L_0x00b4
            r3.removeRule(r2)
            int r9 = r9 + r10
            int r9 = r9 + r4
            float r9 = (float) r9
            com.tencent.mm.plugin.finder.live.multistream.CommonCircleIndicator r10 = r7.f178183q
            float r10 = r10.getIndicatorHeight()
            float r8 = r8 - r10
            r10 = 2
            float r10 = (float) r10
            float r8 = r8 / r10
            float r9 = r9 + r8
            int r8 = (int) r9
            r3.topMargin = r8
            r3.bottomMargin = r1
            goto L_0x00b4
        L_0x0089:
            android.view.ViewGroup r8 = r7.f166287d
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            boolean r9 = r8 instanceof android.widget.RelativeLayout.LayoutParams
            if (r9 == 0) goto L_0x0096
            r3 = r8
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
        L_0x0096:
            if (r3 == 0) goto L_0x00b4
            r3.addRule(r2)
            r3.topMargin = r1
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 14
            int r8 = kg3.C76577a.m92151b(r8, r9)
            android.view.ViewGroup r9 = r7.f166287d
            android.content.Context r9 = r9.getContext()
            int r9 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r9)
            int r8 = r8 + r9
            r3.bottomMargin = r8
        L_0x00b4:
            android.view.ViewGroup r8 = r7.f166287d
            r8.requestLayout()
            r7.f178184r = r0
            java.lang.Class<cl1.v1> r8 = cl1.C55004v1.class
            androidx.lifecycle.i0 r8 = r7.mo87696x0(r8)
            cl1.v1 r8 = (cl1.C55004v1) r8
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.Integer> r8 = r8.f154441o
            java.lang.Object r8 = r8.getValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L_0x00d1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L_0x00d1:
            int r8 = r8.intValue()
            if (r8 <= r0) goto L_0x00da
            super.mo10792g(r1)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62772fb.mo87772a1(int, int, int):void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
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
        if (C62773b.f178185a[bVar.ordinal()] == 1) {
            Class cls = C55004v1.class;
            ((C55004v1) mo87696x0(cls)).f154441o.observe(this, new C62792gb(this));
            ((C55004v1) mo87696x0(cls)).f154436g.observe(this, new C62808hb(this));
            ((C55004v1) mo87696x0(cls)).f154442p.observe(this, new C62820ib(this));
            ((C54951d) mo87696x0(C54951d.class)).f154007o.observe(this, new C62831jb(this));
            mo87771Z0();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        super.mo10792g(8);
        this.f178184r = false;
    }
}
