package qj1;

import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import d60.C58124b;
import gg1.C32444a;
import gy3.C87412m;
import org.libpag.PAGView;
import qs1.C63325a;
import te3.C49712hj1;
import te3.C64780vo2;

/* renamed from: qj1.h6 */
public final class C62804h6 extends C62660c {

    /* renamed from: p */
    public final C58124b f178273p;

    /* renamed from: q */
    public final PAGView f178274q;

    /* renamed from: r */
    public final C62806b f178275r;

    /* renamed from: qj1.h6$a */
    public /* synthetic */ class C62805a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f178276a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[7] = 1;
            f178276a = iArr;
        }
    }

    /* renamed from: qj1.h6$b */
    public static final class C62806b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178277d;

        /* renamed from: e */
        public final /* synthetic */ C62804h6 f178278e;

        public C62806b(ViewGroup viewGroup, C62804h6 h6Var) {
            this.f178277d = viewGroup;
            this.f178278e = h6Var;
        }

        /* JADX WARNING: type inference failed for: r0v7, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "updateBgDecoration by running delay task. "
                r0.append(r1)
                android.view.ViewGroup r1 = r5.f178277d
                android.content.Context r1 = r1.getContext()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Finder.FinderLiveDecorationPlugin"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                android.view.ViewGroup r0 = r5.f178277d
                android.content.Context r0 = r0.getContext()
                boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
                r2 = 0
                if (r1 == 0) goto L_0x002b
                com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
                goto L_0x002c
            L_0x002b:
                r0 = r2
            L_0x002c:
                r1 = 1
                r3 = 0
                if (r0 == 0) goto L_0x0038
                boolean r0 = r0.isDestroyed()
                if (r0 != 0) goto L_0x0038
                r0 = 1
                goto L_0x0039
            L_0x0038:
                r0 = 0
            L_0x0039:
                if (r0 == 0) goto L_0x0073
                android.view.ViewGroup r0 = r5.f178277d
                android.content.Context r0 = r0.getContext()
                boolean r4 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
                if (r4 == 0) goto L_0x0048
                r2 = r0
                com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            L_0x0048:
                if (r2 == 0) goto L_0x0051
                boolean r0 = r2.isFinishing()
                if (r0 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r1 = 0
            L_0x0052:
                if (r1 == 0) goto L_0x0073
                qj1.h6 r0 = r5.f178278e
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                androidx.lifecycle.i0 r0 = r0.mo87696x0(r1)
                cl1.o r0 = (cl1.C54991o) r0
                boolean r0 = r0.mo75997d4()
                if (r0 != 0) goto L_0x0073
                qj1.h6 r0 = r5.f178278e
                java.lang.Class<qs1.a> r1 = qs1.C63325a.class
                androidx.lifecycle.i0 r1 = r0.mo87696x0(r1)
                qs1.a r1 = (qs1.C63325a) r1
                te3.vo2 r1 = r1.f179686g
                qj1.C62804h6.m73894Z0(r0, r1)
            L_0x0073:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62804h6.C62806b.run():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62804h6(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178273p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.lzt);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…_live_decoration_bg_view)");
        this.f178274q = (PAGView) findViewById;
        this.f178275r = new C62806b(viewGroup, this);
    }

    /* renamed from: Z0 */
    public static final void m73894Z0(C62804h6 h6Var, C64780vo2 vo22) {
        h6Var.f166287d.removeCallbacks(h6Var.f178275r);
        C63325a aVar = (C63325a) h6Var.mo87696x0(C63325a.class);
        String str = vo22 != null ? vo22.f185964e : null;
        if ((str == null || str.length() == 0) || h6Var.mo82893g0()) {
            Log.m105924i("Finder.FinderLiveDecorationPlugin", "updateBgDecoration url is null or empty.");
            aVar.f179686g = vo22;
            h6Var.f178274q.stop();
            h6Var.f178274q.setVisibility(8);
            h6Var.mo10792g(8);
        } else if (C86013q1.m106450k(aVar.mo88226c3(vo22))) {
            Log.m105924i("Finder.FinderLiveDecorationPlugin", "updateBgDecoration local decorations exist.");
            aVar.f179686g = vo22;
            h6Var.mo87792a1();
            h6Var.f166287d.postDelayed(h6Var.f178275r, C32444a.f86124a2.mo60266n().longValue() * 1000);
        } else {
            Log.m105924i("Finder.FinderLiveDecorationPlugin", "updateBgDecoration download decorations.");
            aVar.mo88227d3(vo22, new C62841k6(vo22, aVar, h6Var));
        }
    }

    /* renamed from: a1 */
    public final void mo87792a1() {
        C63325a aVar = (C63325a) mo87696x0(C63325a.class);
        aVar.f179687h = System.currentTimeMillis();
        this.f178274q.setVisibility(0);
        mo10792g(0);
        this.f178274q.setProgress(0.0d);
        this.f178274q.setPath(aVar.mo88226c3(aVar.f179686g));
        this.f178274q.stop();
        this.f178274q.play();
        this.f178274q.flush();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c3  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210u0(d60.C58124b.C58125b r13, android.os.Bundle r14) {
        /*
            r12 = this;
            java.lang.String r0 = "status"
            gy3.C87412m.m108594g(r13, r0)
            int[] r0 = qj1.C62804h6.C62805a.f178276a
            int r13 = r13.ordinal()
            r13 = r0[r13]
            r0 = 1
            if (r13 != r0) goto L_0x00c7
            if (r14 == 0) goto L_0x001a
            java.lang.String r13 = "PARAM_FINDER_LIVE_START_BY_MINI_WINDOW"
            boolean r13 = r14.getBoolean(r13)
            goto L_0x001b
        L_0x001a:
            r13 = 0
        L_0x001b:
            if (r13 == 0) goto L_0x00c7
            java.lang.Class<qs1.a> r13 = qs1.C63325a.class
            androidx.lifecycle.i0 r13 = r12.mo87696x0(r13)
            qs1.a r13 = (qs1.C63325a) r13
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r13.f179687h
            r4 = 0
            r6 = 1000(0x3e8, double:4.94E-321)
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x0044
            gg1.a r14 = gg1.C32444a.f86121a
            pe1.c<java.lang.Long> r14 = gg1.C32444a.f86124a2
            java.lang.Object r14 = r14.mo60266n()
            java.lang.Number r14 = (java.lang.Number) r14
            long r2 = r14.longValue()
        L_0x0041:
            long r2 = r2 * r6
            goto L_0x007d
        L_0x0044:
            long r2 = r0 - r2
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0059
            gg1.a r14 = gg1.C32444a.f86121a
            pe1.c<java.lang.Long> r14 = gg1.C32444a.f86124a2
            java.lang.Object r14 = r14.mo60266n()
            java.lang.Number r14 = (java.lang.Number) r14
            long r2 = r14.longValue()
            goto L_0x0041
        L_0x0059:
            gg1.a r14 = gg1.C32444a.f86121a
            pe1.c<java.lang.Long> r14 = gg1.C32444a.f86124a2
            java.lang.Object r14 = r14.mo60266n()
            java.lang.Number r14 = (java.lang.Number) r14
            long r2 = r14.longValue()
            long r2 = r2 * r6
            long r8 = r13.f179687h
            long r8 = r0 - r8
            pe1.c<java.lang.Long> r14 = gg1.C32444a.f86124a2
            java.lang.Object r14 = r14.mo60266n()
            java.lang.Number r14 = (java.lang.Number) r14
            long r10 = r14.longValue()
            long r10 = r10 * r6
            long r8 = r8 % r10
            long r2 = r2 - r8
        L_0x007d:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r8 = "fromMiniWin will running delayTask. lastBgDecorShowTimestamp:"
            r14.append(r8)
            long r8 = r13.f179687h
            r14.append(r8)
            java.lang.String r13 = " now:"
            r14.append(r13)
            r14.append(r0)
            java.lang.String r13 = " delay:"
            r14.append(r13)
            r14.append(r2)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = "Finder.FinderLiveDecorationPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            android.view.ViewGroup r13 = r12.f166287d
            qj1.h6$b r14 = r12.f178275r
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r4 = r2
        L_0x00af:
            gg1.a r0 = gg1.C32444a.f86121a
            pe1.c<java.lang.Long> r0 = gg1.C32444a.f86124a2
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r0 = r0 * r6
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c4
            r4 = r0
        L_0x00c4:
            r13.postDelayed(r14, r4)
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62804h6.mo3210u0(d60.b$b, android.os.Bundle):void");
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f166287d.removeCallbacks(this.f178275r);
    }
}
