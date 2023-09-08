package sb2;

import fy3.C32224a;
import gy3.C87413o;
import hb2.C59811e;
import rx3.C13598b0;

/* renamed from: sb2.l0 */
public final class C63806l0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63774j0 f180876d;

    /* renamed from: e */
    public final /* synthetic */ C59811e f180877e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63806l0(C63774j0 j0Var, C59811e eVar) {
        super(0);
        this.f180876d = j0Var;
        this.f180877e = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (r0 = r0.getPlayer()).getPlayer();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r8 = this;
            sb2.j0 r0 = r8.f180876d
            j03.c r0 = r0.f180823r
            r1 = 0
            if (r0 == 0) goto L_0x0019
            j03.a r0 = r0.getPlayer()
            if (r0 == 0) goto L_0x0019
            j03.b r0 = r0.getPlayer()
            if (r0 == 0) goto L_0x0019
            long r3 = r0.getDurationMs()
            goto L_0x001a
        L_0x0019:
            r3 = r1
        L_0x001a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "setVideoDuration: origin:"
            r0.append(r5)
            sb2.j0 r5 = r8.f180876d
            long r5 = r5.f180825t
            r0.append(r5)
            java.lang.String r5 = ", player:"
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "MicroMsg.Mv.MusicMvMakerItemEditUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ae
            sb2.j0 r0 = r8.f180876d
            long r0 = r0.f180825t
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00ae
            hb2.e r0 = r8.f180877e
            hb2.e$h r0 = r0.f170731n
            if (r0 != 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            r0.mo84771d(r3)
        L_0x0053:
            sb2.j0 r0 = r8.f180876d
            r0.f180825t = r3
            androidx.recyclerview.widget.RecyclerView r1 = r0.mo88578e3()
            int r1 = r1.getChildCount()
            r2 = 0
        L_0x0060:
            if (r2 >= r1) goto L_0x00ae
            androidx.recyclerview.widget.RecyclerView r3 = r0.mo88578e3()
            android.view.View r3 = r3.getChildAt(r2)
            com.tencent.mm.plugin.mv.ui.view.FrameListView2 r3 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.FrameListView2) r3
            if (r3 != 0) goto L_0x006f
            goto L_0x00ab
        L_0x006f:
            androidx.recyclerview.widget.RecyclerView r4 = r0.mo88578e3()
            int r4 = r4.mo17029N0(r3)
            sb2.j0$b r5 = r0.mo88577d3()
            java.util.ArrayList<u23.a> r5 = r5.f180832d
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r5 = "frameAdapter.trackInfoList[position]"
            gy3.C87412m.m108593f(r4, r5)
            u23.a r4 = (u23.C65003a) r4
            float r5 = r0.f180827v
            long r6 = r0.f180825t
            float r6 = (float) r6
            float r5 = r5 * r6
            int r6 = r0.f180806C
            float r6 = (float) r6
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 * r7
            int r7 = r4.f187122b
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r4.f187121a
            float r7 = (float) r7
            float r6 = r6 * r7
            float r5 = r5 / r6
            r4.f187126f = r5
            r4.mo89218f()
            r3.setTrackInfo(r4)
            r3.requestLayout()
        L_0x00ab:
            int r2 = r2 + 1
            goto L_0x0060
        L_0x00ae:
            sb2.j0 r0 = r8.f180876d
            android.widget.ImageView r0 = r0.mo88581i3()
            r1 = 4
            r0.setVisibility(r1)
            sb2.j0 r0 = r8.f180876d
            j03.c r0 = r0.f180823r
            if (r0 != 0) goto L_0x00bf
            goto L_0x00c3
        L_0x00bf:
            r1 = 0
            r0.setOnFrameAvailable(r1)
        L_0x00c3:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63806l0.invoke():java.lang.Object");
    }
}
