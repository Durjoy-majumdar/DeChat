package xq1;

import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C87412m;
import java.util.HashMap;
import u60.C65220d;

/* renamed from: xq1.d */
public abstract class C66406d {

    /* renamed from: a */
    public final HashMap<String, C66408e> f191152a = new HashMap<>();

    /* renamed from: xq1.d$a */
    public final class C66407a extends C65220d {

        /* renamed from: f */
        public final C66408e f191153f;

        /* renamed from: g */
        public final /* synthetic */ C66406d f191154g;

        public C66407a(C66406d dVar, C66408e eVar) {
            C87412m.m108594g(eVar, IXWebBroadcastListener.STAGE_TAG);
            this.f191154g = dVar;
            this.f191153f = eVar;
        }

        /* JADX WARNING: type inference failed for: r2v35, types: [xq1.e] */
        /* JADX WARNING: type inference failed for: r2v36, types: [xq1.e] */
        /* JADX WARNING: type inference failed for: r2v37, types: [xq1.e] */
        /* JADX WARNING: type inference failed for: r2v38, types: [xq1.e] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo11852a() {
            /*
                r6 = this;
                xq1.e r0 = r6.f191153f
                boolean r1 = r0 instanceof xq1.C66413j
                if (r1 == 0) goto L_0x00fe
                xq1.j r0 = (xq1.C66413j) r0
                xq1.e r0 = r0.mo90273c()
                xq1.e r1 = r6.f191153f
                java.lang.String r2 = "Finder.PipelineCore"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "[dealNextStage] taskId:"
                r3.append(r4)
                xq1.e r4 = r6.f191153f
                java.lang.String r4 = r4.mo90502b()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                boolean r2 = r0 instanceof xq1.C66413j
                r3 = 0
                if (r2 == 0) goto L_0x003e
                xq1.e r2 = r6.f191153f
                boolean r4 = r2 instanceof xq1.C66413j
                if (r4 == 0) goto L_0x0038
                r3 = r2
                xq1.j r3 = (xq1.C66413j) r3
            L_0x0038:
                if (r3 == 0) goto L_0x0076
                r3.mo75103e(r0)
                goto L_0x0076
            L_0x003e:
                boolean r2 = r0 instanceof xq1.C66412i
                if (r2 == 0) goto L_0x0051
                xq1.e r2 = r6.f191153f
                boolean r4 = r2 instanceof xq1.C66413j
                if (r4 == 0) goto L_0x004b
                r3 = r2
                xq1.j r3 = (xq1.C66413j) r3
            L_0x004b:
                if (r3 == 0) goto L_0x0076
                r3.mo75103e(r0)
                goto L_0x0076
            L_0x0051:
                boolean r2 = r0 instanceof xq1.C66405c
                if (r2 == 0) goto L_0x0064
                xq1.e r2 = r6.f191153f
                boolean r4 = r2 instanceof xq1.C66413j
                if (r4 == 0) goto L_0x005e
                r3 = r2
                xq1.j r3 = (xq1.C66413j) r3
            L_0x005e:
                if (r3 == 0) goto L_0x0076
                r3.mo75102d(r0)
                goto L_0x0076
            L_0x0064:
                boolean r2 = r0 instanceof xq1.C66414k
                if (r2 == 0) goto L_0x0076
                xq1.e r2 = r6.f191153f
                boolean r4 = r2 instanceof xq1.C66413j
                if (r4 == 0) goto L_0x0071
                r3 = r2
                xq1.j r3 = (xq1.C66413j) r3
            L_0x0071:
                if (r3 == 0) goto L_0x0076
                r3.mo75104f(r0)
            L_0x0076:
                xq1.d r2 = r6.f191154g
                java.util.HashMap<java.lang.String, xq1.e> r3 = r2.f191152a
                monitor-enter(r3)
                java.util.HashMap<java.lang.String, xq1.e> r2 = r2.f191152a     // Catch:{ all -> 0x00fb }
                xq1.e r4 = r6.f191153f     // Catch:{ all -> 0x00fb }
                java.lang.String r4 = r4.mo90502b()     // Catch:{ all -> 0x00fb }
                r2.put(r4, r0)     // Catch:{ all -> 0x00fb }
                java.lang.String r2 = "Finder.PipelineCore"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
                r4.<init>()     // Catch:{ all -> 0x00fb }
                java.lang.String r5 = "[dealNextStage] add next stage, taskId:"
                r4.append(r5)     // Catch:{ all -> 0x00fb }
                xq1.e r5 = r6.f191153f     // Catch:{ all -> 0x00fb }
                java.lang.String r5 = r5.mo90502b()     // Catch:{ all -> 0x00fb }
                r4.append(r5)     // Catch:{ all -> 0x00fb }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00fb }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x00fb }
                rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00fb }
                monitor-exit(r3)
                xq1.d r2 = r6.f191154g
                xq1.e r3 = r6.f191153f
                java.lang.String r3 = r3.mo90502b()
                r2.getClass()
                java.lang.String r2 = "taskId"
                gy3.C87412m.m108594g(r3, r2)
                java.lang.String r2 = "from"
                gy3.C87412m.m108594g(r1, r2)
                java.lang.String r2 = "to"
                gy3.C87412m.m108594g(r0, r2)
                xq1.d r2 = r6.f191154g
                wq1.d r2 = (wq1.C66175d) r2
                wq1.e r2 = r2.f190189e
                if (r2 == 0) goto L_0x00d2
                xq1.e r3 = r6.f191153f
                java.lang.String r3 = r3.mo90502b()
                r2.mo75420a(r3, r1, r0)
            L_0x00d2:
                xq1.d r1 = r6.f191154g
                wq1.d r1 = (wq1.C66175d) r1
                r1.getClass()
                java.util.Map<java.lang.Integer, xq1.b> r2 = r1.f190188d
                int r3 = r0.mo75100a()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
                java.lang.Object r2 = r2.get(r3)
                xq1.b r2 = (xq1.C66403b) r2
                if (r2 != 0) goto L_0x00ef
                xq1.b r2 = r1.f190187c
            L_0x00ef:
                xq1.d$a r1 = new xq1.d$a
                xq1.d r3 = r6.f191154g
                r1.<init>(r3, r0)
                r2.mo90503a(r1)
                goto L_0x0185
            L_0x00fb:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            L_0x00fe:
                boolean r1 = r0 instanceof xq1.C66402a
                if (r1 == 0) goto L_0x0185
                xq1.a r0 = (xq1.C66402a) r0
                r0.mo75101c()
                java.lang.String r0 = "Finder.PipelineCore"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[call] taskId:"
                r1.append(r2)
                xq1.e r2 = r6.f191153f
                xq1.a r2 = (xq1.C66402a) r2
                java.lang.String r2 = r2.f191147d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                xq1.d r0 = r6.f191154g
                java.util.HashMap<java.lang.String, xq1.e> r1 = r0.f191152a
                monitor-enter(r1)
                java.util.HashMap<java.lang.String, xq1.e> r0 = r0.f191152a     // Catch:{ all -> 0x0182 }
                xq1.e r2 = r6.f191153f     // Catch:{ all -> 0x0182 }
                java.lang.String r2 = r2.mo90502b()     // Catch:{ all -> 0x0182 }
                r0.remove(r2)     // Catch:{ all -> 0x0182 }
                java.lang.String r0 = "Finder.PipelineCore"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0182 }
                r2.<init>()     // Catch:{ all -> 0x0182 }
                java.lang.String r3 = "[call] remove taskId:"
                r2.append(r3)     // Catch:{ all -> 0x0182 }
                xq1.e r3 = r6.f191153f     // Catch:{ all -> 0x0182 }
                xq1.a r3 = (xq1.C66402a) r3     // Catch:{ all -> 0x0182 }
                java.lang.String r3 = r3.f191147d     // Catch:{ all -> 0x0182 }
                r2.append(r3)     // Catch:{ all -> 0x0182 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0182 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0182 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0182 }
                monitor-exit(r1)
                xq1.d r0 = r6.f191154g
                wq1.d r0 = (wq1.C66175d) r0
                wq1.e r0 = r0.f190189e
                if (r0 == 0) goto L_0x0165
                xq1.e r1 = r6.f191153f
                java.lang.String r1 = r1.mo90502b()
                xq1.e r2 = r6.f191153f
                r0.mo75422c(r1, r2)
            L_0x0165:
                xq1.d r0 = r6.f191154g
                xq1.e r1 = r6.f191153f
                r2 = r1
                xq1.a r2 = (xq1.C66402a) r2
                java.lang.String r2 = r2.f191147d
                wq1.d r0 = (wq1.C66175d) r0
                r0.getClass()
                java.lang.String r3 = "taskId"
                gy3.C87412m.m108594g(r2, r3)
                java.lang.String r2 = "finalStage"
                gy3.C87412m.m108594g(r1, r2)
                r0.mo90271b(r1)
                goto L_0x0185
            L_0x0182:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L_0x0185:
                u60.n r0 = u60.C65234n.OK
                r6.mo11853b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xq1.C66406d.C66407a.mo11852a():void");
        }

        /* renamed from: d */
        public String mo11854d() {
            return this.f191153f.getClass().getSimpleName() + '_' + this.f191153f.mo90502b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        r0 = (wq1.C66175d) r4;
        r1 = (xq1.C66403b) ((java.util.LinkedHashMap) r0.f190188d).get(java.lang.Integer.valueOf(r5.mo75100a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        if (r1 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        r1 = r0.f190187c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        r4.f191152a.put(r5.f191158d, r5);
        r0 = r0.f190189e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        if (r0 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        r0.mo75421b(r5.f191158d, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.PipelineCore", "[start] exec taskId:" + r5.f191158d);
        r1.mo90503a(new xq1.C66406d.C66407a(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0091, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90504a(xq1.C66413j r5) {
        /*
            r4 = this;
            java.lang.String r0 = "stage"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "Finder.PipelineCore"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[start] taskId:"
            r1.append(r2)
            java.lang.String r2 = r5.f191158d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.HashMap<java.lang.String, xq1.e> r0 = r4.f191152a
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, xq1.e> r1 = r4.f191152a     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = r5.f191158d     // Catch:{ all -> 0x0092 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = "Finder.PipelineCore"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r2.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "[start] task in pipeline return, taskId:"
            r2.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r5 = r5.f191158d     // Catch:{ all -> 0x0092 }
            r2.append(r5)     // Catch:{ all -> 0x0092 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0092 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)
            return
        L_0x0045:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)
            r0 = r4
            wq1.d r0 = (wq1.C66175d) r0
            java.util.Map<java.lang.Integer, xq1.b> r1 = r0.f190188d
            int r2 = r5.mo75100a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r2)
            xq1.b r1 = (xq1.C66403b) r1
            if (r1 != 0) goto L_0x0061
            xq1.b r1 = r0.f190187c
        L_0x0061:
            java.util.HashMap<java.lang.String, xq1.e> r2 = r4.f191152a
            java.lang.String r3 = r5.f191158d
            r2.put(r3, r5)
            wq1.e r0 = r0.f190189e
            if (r0 == 0) goto L_0x0071
            java.lang.String r2 = r5.f191158d
            r0.mo75421b(r2, r5)
        L_0x0071:
            java.lang.String r0 = "Finder.PipelineCore"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[start] exec taskId:"
            r2.append(r3)
            java.lang.String r3 = r5.f191158d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            xq1.d$a r0 = new xq1.d$a
            r0.<init>(r4, r5)
            r1.mo90503a(r0)
            return
        L_0x0092:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xq1.C66406d.mo90504a(xq1.j):void");
    }
}
