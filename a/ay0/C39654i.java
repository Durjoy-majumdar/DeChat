package ay0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ay0.i */
public final class C39654i extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MpWebViewController f106410d;

    /* renamed from: e */
    public final /* synthetic */ long f106411e;

    /* renamed from: f */
    public final /* synthetic */ C8477a0 f106412f;

    /* renamed from: g */
    public final /* synthetic */ long f106413g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39654i(MpWebViewController mpWebViewController, long j, C8477a0 a0Var, long j2) {
        super(1);
        this.f106410d = mpWebViewController;
        this.f106411e = j;
        this.f106412f = a0Var;
        this.f106413g = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = "value"
            gy3.C87412m.m108594g(r8, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r0 = r7.f106410d
            java.lang.String r0 = r0.mo63662A1()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onReceivePageData, jsContent evaluateJavascript cb, ret = "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ", view "
            r1.append(r2)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r2 = r7.f106410d
            com.tencent.mm.ui.widget.MMWebView r2 = r2.f117553a
            java.lang.String r2 = r2.getRandomStr()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            long r0 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.now()
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r2 = r7.f106410d
            java.lang.String r3 = "ok"
            r4 = 0
            boolean r3 = z04.C112550d0.m153801u(r8, r3, r4)
            r2.f109597V1 = r3
            xx0.b r2 = xx0.C53458b.f150358a
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r3 = r7.f106410d
            te3.ah4 r5 = r3.f109581F1
            boolean r3 = r3.f109597V1
            r2.mo74093l(r5, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r2 = r7.f106410d
            te3.ah4 r3 = r2.f109581F1
            int r3 = r3.f130544o
            boolean r2 = r2.f109597V1
            if (r2 == 0) goto L_0x0059
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x005b
        L_0x0059:
            r2 = 129(0x81, float:1.81E-43)
        L_0x005b:
            r5 = 1
            g93.C32355a.m39690b(r3, r2, r5, r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r2 = r7.f106410d
            ea3.u r2 = r2.f117543Q
            java.lang.String r3 = "onInjectEnd"
            r2.mo73829a(r3, r0)
            java.lang.String r2 = "\""
            java.lang.String r3 = ""
            java.lang.String r2 = z04.C112551y.m153814n(r8, r2, r3, r4)
            z04.k r3 = new z04.k
            java.lang.String r6 = ","
            r3.<init>((java.lang.String) r6)
            java.util.List r2 = r3.mo90760e(r2, r4)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x00aa
            int r3 = r2.size()
            java.util.ListIterator r3 = r2.listIterator(r3)
        L_0x0089:
            boolean r6 = r3.hasPrevious()
            if (r6 == 0) goto L_0x00aa
            java.lang.Object r6 = r3.previous()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x009d
            r6 = 1
            goto L_0x009e
        L_0x009d:
            r6 = 0
        L_0x009e:
            if (r6 != 0) goto L_0x0089
            int r3 = r3.nextIndex()
            int r3 = r3 + r5
            java.util.List r2 = sx3.C110818d0.m150947s0(r2, r3)
            goto L_0x00ac
        L_0x00aa:
            sx3.f0 r2 = sx3.C64186f0.f181907d
        L_0x00ac:
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r3 = r2.length
            if (r3 != 0) goto L_0x00bd
            r4 = 1
        L_0x00bd:
            r3 = r4 ^ 1
            if (r3 == 0) goto L_0x00f6
            int r3 = r2.length
            int r3 = r3 - r5
            r3 = r2[r3]
            java.lang.String r4 = "[0-9\\.]+"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.lang.String r6 = "compile(pattern)"
            gy3.C87412m.m108593f(r4, r6)
            java.lang.String r6 = "input"
            gy3.C87412m.m108594g(r3, r6)
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L_0x00f6
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r3 = r7.f106410d
            ea3.u r3 = r3.f117543Q
            int r4 = r2.length
            int r4 = r4 - r5
            r2 = r2[r4]
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            double r4 = r2.doubleValue()
            long r4 = (long) r4
            java.lang.String r2 = "onWebInjectEnd"
            r3.mo73829a(r2, r4)
        L_0x00f6:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r2 = r7.f106410d
            java.lang.String r2 = r2.mo63662A1()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "terry trace 2.1 onReceivePageData ret:"
            r3.append(r4)
            r3.append(r8)
            java.lang.String r8 = " eval:"
            r3.append(r8)
            long r4 = r7.f106411e
            long r4 = r0 - r4
            r3.append(r4)
            java.lang.String r8 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r8 = r7.f106410d
            boolean r2 = r8.f109597V1
            if (r2 != 0) goto L_0x0129
            r2 = -113(0xffffffffffffff8f, float:NaN)
            r8.mo67685N(r2)
            goto L_0x012e
        L_0x0129:
            r2 = -112(0xffffffffffffff90, float:NaN)
            r8.mo67685N(r2)
        L_0x012e:
            zt3.t r8 = zt3.C119157j.f356862d
            ay0.h r2 = new ay0.h
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r3 = r7.f106410d
            r2.<init>(r3)
            zt3.j r8 = (zt3.C119157j) r8
            r8.mo183895z(r2)
            gy3.a0 r8 = r7.f106412f
            boolean r8 = r8.f27482d
            if (r8 == 0) goto L_0x0145
            r8 = 126(0x7e, float:1.77E-43)
            goto L_0x0147
        L_0x0145:
            r8 = 122(0x7a, float:1.71E-43)
        L_0x0147:
            long r2 = r7.f106413g
            long r0 = r0 - r2
            g93.C32355a.m39692d(r8, r0)
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ay0.C39654i.invoke(java.lang.Object):java.lang.Object");
    }
}
