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

/* renamed from: w33.i */
public final class C118727i extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Map.Entry<String, List<C58104c<Class<? extends C114436a>, C114490k0.C114491a.C114492a<C114436a.C114440d>>>> f355251d;

    /* renamed from: e */
    public final /* synthetic */ C114467i f355252e;

    /* renamed from: f */
    public final /* synthetic */ int f355253f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118727i(Map.Entry<String, List<C58104c<Class<? extends C114436a>, C114490k0.C114491a.C114492a<C114436a.C114440d>>>> entry, C114467i iVar, int i) {
        super(1);
        this.f355251d = entry;
        this.f355252e = iVar;
        this.f355253f = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0047, code lost:
        r7 = (r7 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r7.f343207c).f343110g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            c30.g r10 = (c30.C104289g) r10
            java.lang.String r0 = "$this$subJson"
            gy3.C87412m.m108594g(r10, r0)
            java.util.Map$Entry<java.lang.String, java.util.List<d3.c<java.lang.Class<? extends com.tencent.matrix.batterycanary.monitor.feature.a>, com.tencent.matrix.batterycanary.monitor.feature.k0$a$a<com.tencent.matrix.batterycanary.monitor.feature.a$d>>>> r0 = r9.f355251d
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map$Entry<java.lang.String, java.util.List<d3.c<java.lang.Class<? extends com.tencent.matrix.batterycanary.monitor.feature.a>, com.tencent.matrix.batterycanary.monitor.feature.k0$a$a<com.tencent.matrix.batterycanary.monitor.feature.a$d>>>> r1 = r9.f355251d
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            java.util.Map$Entry<java.lang.String, java.util.List<d3.c<java.lang.Class<? extends com.tencent.matrix.batterycanary.monitor.feature.a>, com.tencent.matrix.batterycanary.monitor.feature.k0$a$a<com.tencent.matrix.batterycanary.monitor.feature.a$d>>>> r2 = r9.f355251d
            java.lang.Object r2 = r2.getValue()
            java.lang.String r3 = "entry.value"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r5 = r3
        L_0x002f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x005b
            java.lang.Object r7 = r2.next()
            d3.c r7 = (p329d3.C58104c) r7
            S r7 = r7.f166180b
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r7 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114492a) r7
            if (r7 == 0) goto L_0x0050
            RECORD r7 = r7.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.a$d r7 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r7
            if (r7 == 0) goto L_0x0050
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r7 = r7.f343110g
            if (r7 == 0) goto L_0x0050
            DIGIT r7 = r7.f343211a
            java.lang.Long r7 = (java.lang.Long) r7
            goto L_0x0051
        L_0x0050:
            r7 = 0
        L_0x0051:
            if (r7 != 0) goto L_0x0055
            r7 = r3
            goto L_0x0059
        L_0x0055:
            long r7 = r7.longValue()
        L_0x0059:
            long r5 = r5 + r7
            goto L_0x002f
        L_0x005b:
            com.tencent.matrix.batterycanary.monitor.feature.i r2 = r9.f355252e
            ce.a r2 = r2.f343163l
            if (r2 == 0) goto L_0x0063
            long r3 = r2.f338976n
        L_0x0063:
            float r2 = w33.C118738t.m167431b(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "runnable "
            r3.append(r4)
            int r4 = r9.f355253f
            r3.append(r4)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            r4 = 40
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ") = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.VoIPProfileReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.lang.String r3 = "name"
            r10.put(r3, r0)
            java.lang.String r0 = "count"
            r10.mo145953n(r0, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            java.lang.String r1 = "cpuLoad"
            r10.put(r1, r0)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w33.C118727i.invoke(java.lang.Object):java.lang.Object");
    }
}
