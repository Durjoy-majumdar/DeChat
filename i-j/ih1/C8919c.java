package ih1;

import a14.C0000n0;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import fh1.C59079s2;
import fy3.C32227p;
import gh1.C59439b;
import gh1.C8313a;
import gi1.C8324b;
import gy3.C87412m;
import hh1.C59894a;
import kotlin.ResultKt;
import org.json.JSONObject;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ih1.c */
public final class C8919c extends C8313a implements C59439b, C59894a {

    /* renamed from: j */
    public FrameLayout f28213j;

    /* renamed from: n */
    public FrameLayout f28214n;

    /* renamed from: o */
    public ViewGroup f28215o;

    /* renamed from: p */
    public int f28216p = -1;

    /* renamed from: q */
    public int f28217q = 1;

    /* renamed from: r */
    public C8324b f28218r;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.mic.TopContentLayoutController$checkContentModeChange$1", mo125469f = "TopContentLayoutController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ih1.c$a */
    public static final class C8920a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C8919c f28219d;

        /* renamed from: e */
        public final /* synthetic */ boolean f28220e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8920a(C8919c cVar, boolean z, C15601d<? super C8920a> dVar) {
            super(2, dVar);
            this.f28219d = cVar;
            this.f28220e = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8920a(this.f28219d, this.f28220e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8920a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C59079s2 s2Var = (C59079s2) this.f28219d.controller(C59079s2.class);
            if (s2Var != null) {
                C59079s2.m69007m3(s2Var, this.f28220e, s2Var.mo84287n3(), false, 4, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8919c(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: J1 */
    public void mo9728J1(C8324b bVar) {
        C87412m.m108594g(bVar, "micInfoData");
        this.f28218r = bVar;
        mo9731m3(bVar, "onMicInfoChanged");
    }

    /* renamed from: g2 */
    public void mo9729g2(boolean z) {
    }

    /* renamed from: m2 */
    public void mo9730m2(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (((cl1.C54991o) business(cl1.C54991o.class)).mo75992a4() == false) goto L_0x0096;
     */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9731m3(gi1.C8324b r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.LinkedHashMap<java.lang.String, android.graphics.Rect> r0 = r9.f27278a
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkContentModeChange source: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = " micCount: "
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = "TopContentLayoutControl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            r10 = 0
            r1 = 0
            r2 = 1
            if (r0 <= r2) goto L_0x0096
            int r0 = r9.f27281d
            if (r0 != r2) goto L_0x002f
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 != 0) goto L_0x0096
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r0 = r0.mo87030O0()
            if (r0 != 0) goto L_0x005c
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.mo85682Z()
            if (r0 != r2) goto L_0x004b
            r0 = 1
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 != 0) goto L_0x005c
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r8.business(r0)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75992a4()
            if (r0 == 0) goto L_0x0096
        L_0x005c:
            android.view.ViewGroup r0 = r8.f28215o
            if (r0 == 0) goto L_0x00cf
            android.view.ViewParent r0 = r0.getParent()
            android.widget.FrameLayout r3 = r8.f28214n
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            if (r0 != 0) goto L_0x00cf
            android.view.ViewGroup r0 = r8.f28215o
            if (r0 == 0) goto L_0x0075
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0076
        L_0x0075:
            r0 = r10
        L_0x0076:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x007d
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x007e
        L_0x007d:
            r0 = r10
        L_0x007e:
            if (r0 == 0) goto L_0x0085
            android.view.ViewGroup r3 = r8.f28215o
            r0.removeView(r3)
        L_0x0085:
            android.widget.FrameLayout r0 = r8.f28214n
            if (r0 == 0) goto L_0x008c
            r0.removeAllViews()
        L_0x008c:
            android.widget.FrameLayout r0 = r8.f28214n
            if (r0 == 0) goto L_0x00cf
            android.view.ViewGroup r3 = r8.f28215o
            r0.addView(r3)
            goto L_0x00cf
        L_0x0096:
            android.view.ViewGroup r0 = r8.f28215o
            if (r0 == 0) goto L_0x00cf
            android.view.ViewParent r0 = r0.getParent()
            android.widget.FrameLayout r3 = r8.f28213j
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            if (r0 != 0) goto L_0x00cf
            android.view.ViewGroup r0 = r8.f28215o
            if (r0 == 0) goto L_0x00af
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x00b0
        L_0x00af:
            r0 = r10
        L_0x00b0:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x00b7
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x00b8
        L_0x00b7:
            r0 = r10
        L_0x00b8:
            if (r0 == 0) goto L_0x00bf
            android.view.ViewGroup r3 = r8.f28215o
            r0.removeView(r3)
        L_0x00bf:
            android.widget.FrameLayout r0 = r8.f28213j
            if (r0 == 0) goto L_0x00c6
            r0.removeAllViews()
        L_0x00c6:
            android.widget.FrameLayout r0 = r8.f28213j
            if (r0 == 0) goto L_0x00cf
            android.view.ViewGroup r3 = r8.f28215o
            r0.addView(r3)
        L_0x00cf:
            int r0 = r8.f28216p
            int r3 = r9.f27281d
            if (r0 != r3) goto L_0x00df
            java.util.LinkedHashMap<java.lang.String, android.graphics.Rect> r0 = r9.f27278a
            int r0 = r0.size()
            int r3 = r8.f28217q
            if (r0 == r3) goto L_0x00e0
        L_0x00df:
            r1 = 1
        L_0x00e0:
            int r0 = r9.f27281d
            r8.f28216p = r0
            java.util.LinkedHashMap<java.lang.String, android.graphics.Rect> r9 = r9.f27278a
            int r9 = r9.size()
            r8.f28217q = r9
            a14.h0 r9 = a14.C53872d1.f151117a
            a14.k2 r3 = f14.C58901s.f168555a
            r4 = 0
            ih1.c$a r5 = new ih1.c$a
            r5.<init>(r8, r1, r10)
            r6 = 2
            r7 = 0
            r2 = r8
            nk1.C11207i.m11071g(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ih1.C8919c.mo9731m3(gi1.b, java.lang.String):void");
    }

    public void onLiveActivate() {
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        this.f28218r = null;
        Log.m105924i("TopContentLayoutControl", "onLiveDeactivate");
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f28213j = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.k3i);
        this.f28214n = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.o1c);
        this.f28215o = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.jza);
        C8324b bVar = this.f28218r;
        if (bVar != null) {
            mo9731m3(bVar, "onViewMount");
        }
    }

    /* renamed from: v0 */
    public void mo9732v0(JSONObject jSONObject) {
    }
}
