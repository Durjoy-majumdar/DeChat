package yu1;

import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87413o;
import java.util.Map;
import p172io.flutter.embedding.engine.FlutterEngine;
import rx3.C13598b0;
import xu1.C112174a;

/* renamed from: yu1.m */
public final class C112503m extends C87413o implements C32227p<FlutterEngine, Map<String, Object>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f336918d;

    /* renamed from: e */
    public final /* synthetic */ boolean f336919e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<C112174a> f336920f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112503m(String str, boolean z, C8479f0<C112174a> f0Var) {
        super(2);
        this.f336918d = str;
        this.f336919e = z;
        this.f336920f = f0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x004a, code lost:
        r8 = r8.f335880e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            io.flutter.embedding.engine.FlutterEngine r8 = (p172io.flutter.embedding.engine.FlutterEngine) r8
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r0 = "engine"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "paramsBuilder"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = r7.f336918d
            java.lang.String r1 = "TalkerUsername"
            r9.put(r1, r0)
            java.lang.String r0 = eb0.C75592q0.m90789s()
            java.lang.String r1 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = "MyUserName"
            r9.put(r1, r0)
            boolean r0 = r7.f336919e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "IsVideoMode"
            r9.put(r1, r0)
            gy3.f0<xu1.a> r0 = r7.f336920f
            xu1.a r1 = new xu1.a
            io.flutter.embedding.engine.renderer.FlutterRenderer r8 = r8.getRenderer()
            java.lang.String r2 = "engine.renderer"
            gy3.C87412m.m108593f(r8, r2)
            r1.<init>(r8)
            r0.f27484d = r1
            gy3.f0<xu1.a> r8 = r7.f336920f
            T r8 = r8.f27484d
            xu1.a r8 = (xu1.C112174a) r8
            r0 = -1
            if (r8 == 0) goto L_0x0051
            uu1.c r8 = r8.f335880e
            if (r8 == 0) goto L_0x0051
            long r2 = r8.f333048a
            goto L_0x0052
        L_0x0051:
            r2 = r0
        L_0x0052:
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "LocalId"
            r9.put(r2, r8)
            gy3.f0<xu1.a> r8 = r7.f336920f
            T r8 = r8.f27484d
            xu1.a r8 = (xu1.C112174a) r8
            if (r8 == 0) goto L_0x0069
            uu1.c r8 = r8.f335881f
            if (r8 == 0) goto L_0x0069
            long r0 = r8.f333048a
        L_0x0069:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "RemoteId"
            r9.put(r0, r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.String r0 = "IsPreRender"
            r9.put(r0, r8)
            r8 = 4
            java.lang.String r0 = eb0.C86487f6.m107217a(r8)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r8 = ";"
            java.lang.String[] r1 = new java.lang.String[]{r8}
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.util.List r8 = z04.C112550d0.m153785U(r0, r1, r2, r3, r4, r5)
            java.util.Iterator r8 = r8.iterator()
        L_0x0092:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r1)
            java.lang.String r0 = "28002100"
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            java.lang.String r0 = "28002135"
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r1)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0092
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r1 = "HadShowAudioMenu"
            r9.put(r1, r0)
            goto L_0x0092
        L_0x00c0:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yu1.C112503m.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
