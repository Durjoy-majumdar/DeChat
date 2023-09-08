package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import p1195ge.C116947b;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k */
public class C114489k implements C87705i<C114490k0.C114491a.C114492a<C116947b.C116948a>> {

    /* renamed from: a */
    public final /* synthetic */ C114467i f343201a;

    public C114489k(C114467i iVar) {
        this.f343201a = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r7) {
        /*
            r6 = this;
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r7 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114492a) r7
            com.tencent.matrix.batterycanary.monitor.feature.i r0 = r6.f343201a
            RECORD r1 = r7.f343207c
            ge.b$a r1 = (p1195ge.C116947b.C116948a) r1
            r0.getClass()
            boolean r2 = r1.f343203b
            if (r2 == 0) goto L_0x00d1
            ce.g r2 = r0.f343162k
            if (r2 != 0) goto L_0x0014
            goto L_0x002e
        L_0x0014:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r1.f350469f = r3
            ce.f r2 = r2.f339057d
            boolean r2 = r2.f339029D
            com.tencent.matrix.batterycanary.monitor.feature.i$o r3 = new com.tencent.matrix.batterycanary.monitor.feature.i$o
            r3.<init>()
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature> r4 = com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature.class
            com.tencent.matrix.batterycanary.monitor.feature.s r5 = new com.tencent.matrix.batterycanary.monitor.feature.s
            r5.<init>(r0, r2, r3, r1)
            r0.mo173671o(r4, r5)
        L_0x002e:
            RECORD r0 = r7.f343207c
            ge.b$a r0 = (p1195ge.C116947b.C116948a) r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f350469f
            java.lang.String r1 = "JiffyUid"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.util.Map
            r2 = 0
            if (r1 == 0) goto L_0x0053
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "power-cpu-uidDiff"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.Double
            if (r1 == 0) goto L_0x0053
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            RECORD r4 = r7.f343207c
            ge.b$a r4 = (p1195ge.C116947b.C116948a) r4
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b r0 = com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114494b.C114497b.m161112b(r0)
            r4.f350471g = r0
            RECORD r0 = r7.f343207c
            ge.b$a r0 = (p1195ge.C116947b.C116948a) r0
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r0 = r0.f350475i
            DIGIT r0 = r0.f343211a
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x009a
            RECORD r0 = r7.f343207c
            ge.b$a r0 = (p1195ge.C116947b.C116948a) r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f350469f
            java.lang.String r1 = "power-mobile-statByte"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.Double
            if (r1 == 0) goto L_0x008b
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            goto L_0x008c
        L_0x008b:
            r0 = r2
        L_0x008c:
            RECORD r4 = r7.f343207c
            ge.b$a r4 = (p1195ge.C116947b.C116948a) r4
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b r0 = com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114494b.C114497b.m161112b(r0)
            r4.f350475i = r0
        L_0x009a:
            RECORD r0 = r7.f343207c
            ge.b$a r0 = (p1195ge.C116947b.C116948a) r0
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r0 = r0.f350477j
            DIGIT r0 = r0.f343211a
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x00d0
            RECORD r0 = r7.f343207c
            ge.b$a r0 = (p1195ge.C116947b.C116948a) r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f350469f
            java.lang.String r1 = "power-wifi-statByte"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.Double
            if (r1 == 0) goto L_0x00c2
            java.lang.Double r0 = (java.lang.Double) r0
            double r2 = r0.doubleValue()
        L_0x00c2:
            RECORD r7 = r7.f343207c
            ge.b$a r7 = (p1195ge.C116947b.C116948a) r7
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b r0 = com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114494b.C114497b.m161112b(r0)
            r7.f350477j = r0
        L_0x00d0:
            return
        L_0x00d1:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only support delta snapshot"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.batterycanary.monitor.feature.C114489k.accept(java.lang.Object):void");
    }
}
