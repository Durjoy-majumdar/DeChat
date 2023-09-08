package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import fy3.C32226l;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import p329d3.C58104c;
import rx3.C13598b0;

/* renamed from: w33.l */
public final class C118730l extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Map.Entry<String, List<C58104c<Class<? extends C114436a>, C114490k0.C114491a.C114492a<C114436a.C114440d>>>> f355259d;

    /* renamed from: e */
    public final /* synthetic */ C114467i f355260e;

    /* renamed from: f */
    public final /* synthetic */ int f355261f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118730l(Map.Entry<String, List<C58104c<Class<? extends C114436a>, C114490k0.C114491a.C114492a<C114436a.C114440d>>>> entry, C114467i iVar, int i) {
        super(1);
        this.f355259d = entry;
        this.f355260e = iVar;
        this.f355261f = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        r7 = (r7 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r7.f343207c).f343110g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            c30.g r10 = (c30.C104289g) r10
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.j0> r0 = com.tencent.matrix.batterycanary.monitor.feature.C114486j0.class
            java.lang.String r1 = "$this$subJson"
            gy3.C87412m.m108594g(r10, r1)
            java.util.Map$Entry<java.lang.String, java.util.List<d3.c<java.lang.Class<? extends com.tencent.matrix.batterycanary.monitor.feature.a>, com.tencent.matrix.batterycanary.monitor.feature.k0$a$a<com.tencent.matrix.batterycanary.monitor.feature.a$d>>>> r1 = r9.f355259d
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map$Entry<java.lang.String, java.util.List<d3.c<java.lang.Class<? extends com.tencent.matrix.batterycanary.monitor.feature.a>, com.tencent.matrix.batterycanary.monitor.feature.k0$a$a<com.tencent.matrix.batterycanary.monitor.feature.a$d>>>> r2 = r9.f355259d
            java.lang.Object r2 = r2.getValue()
            java.lang.String r3 = "entry.value"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0027:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0040
            java.lang.Object r5 = r2.next()
            r6 = r5
            d3.c r6 = (p329d3.C58104c) r6
            F r6 = r6.f166179a
            boolean r6 = gy3.C87412m.m108589b(r6, r0)
            if (r6 == 0) goto L_0x0027
            r4.add(r5)
            goto L_0x0027
        L_0x0040:
            int r2 = r4.size()
            java.util.Map$Entry<java.lang.String, java.util.List<d3.c<java.lang.Class<? extends com.tencent.matrix.batterycanary.monitor.feature.a>, com.tencent.matrix.batterycanary.monitor.feature.k0$a$a<com.tencent.matrix.batterycanary.monitor.feature.a$d>>>> r4 = r9.f355259d
            java.lang.Object r4 = r4.getValue()
            gy3.C87412m.m108593f(r4, r3)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0058:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0071
            java.lang.Object r5 = r4.next()
            r6 = r5
            d3.c r6 = (p329d3.C58104c) r6
            F r6 = r6.f166179a
            boolean r6 = gy3.C87412m.m108589b(r6, r0)
            if (r6 == 0) goto L_0x0058
            r3.add(r5)
            goto L_0x0058
        L_0x0071:
            java.util.Iterator r0 = r3.iterator()
            r3 = 0
            r5 = r3
        L_0x0078:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00a4
            java.lang.Object r7 = r0.next()
            d3.c r7 = (p329d3.C58104c) r7
            S r7 = r7.f166180b
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r7 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114492a) r7
            if (r7 == 0) goto L_0x0099
            RECORD r7 = r7.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.a$d r7 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r7
            if (r7 == 0) goto L_0x0099
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r7 = r7.f343110g
            if (r7 == 0) goto L_0x0099
            DIGIT r7 = r7.f343211a
            java.lang.Long r7 = (java.lang.Long) r7
            goto L_0x009a
        L_0x0099:
            r7 = 0
        L_0x009a:
            if (r7 != 0) goto L_0x009e
            r7 = r3
            goto L_0x00a2
        L_0x009e:
            long r7 = r7.longValue()
        L_0x00a2:
            long r5 = r5 + r7
            goto L_0x0078
        L_0x00a4:
            com.tencent.matrix.batterycanary.monitor.feature.i r0 = r9.f355260e
            ce.a r0 = r0.f343163l
            if (r0 == 0) goto L_0x00ac
            long r3 = r0.f338976n
        L_0x00ac:
            float r0 = w33.C118738t.m167431b(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "runnable "
            r3.append(r4)
            int r4 = r9.f355261f
            r3.append(r4)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r1)
            r4 = 40
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ") = "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.VoIPProfileReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.lang.String r3 = "name"
            r10.put(r3, r1)
            java.lang.String r1 = "count"
            r10.mo145953n(r1, r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r1 = "cpuLoad"
            r10.put(r1, r0)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w33.C118730l.invoke(java.lang.Object):java.lang.Object");
    }
}
