package com.tencent.plugin.finder.detector.api.detect;

import androidx.lifecycle.C0124r;
import com.tencent.p014mm.sdk.platformtools.Log;
import fs3.C59316c;
import gy3.C87412m;
import hs3.C60149a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/plugin/finder/detector/api/detect/BaseEventDetector;", "T", "Landroidx/lifecycle/r;", "<init>", "()V", "plugin-finder-detector_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public abstract class BaseEventDetector<T> implements C0124r {

    /* renamed from: d */
    public final ConcurrentHashMap<String, C59316c<T>> f165800d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public final String f165801e = ("Detector_" + hashCode() + '_' + mo76379f());

    /* renamed from: f */
    public final Object f165802f = new Object();

    @C91590f(mo125468c = "com.tencent.plugin.finder.detector.api.detect.BaseEventDetector", mo125469f = "BaseEventDetector.kt", mo125470l = {82, 91, 101, 112}, mo125471m = "checkDetect$suspendImpl")
    /* renamed from: com.tencent.plugin.finder.detector.api.detect.BaseEventDetector$a */
    public static final class C57932a extends C66704d {

        /* renamed from: d */
        public Object f165803d;

        /* renamed from: e */
        public Object f165804e;

        /* renamed from: f */
        public Object f165805f;

        /* renamed from: g */
        public /* synthetic */ Object f165806g;

        /* renamed from: h */
        public final /* synthetic */ BaseEventDetector<T> f165807h;

        /* renamed from: i */
        public int f165808i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57932a(BaseEventDetector<T> baseEventDetector, C15601d<? super C57932a> dVar) {
            super(dVar);
            this.f165807h = baseEventDetector;
        }

        public final Object invokeSuspend(Object obj) {
            this.f165806g = obj;
            this.f165808i |= Integer.MIN_VALUE;
            return BaseEventDetector.m67012a(this.f165807h, (C60149a) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.plugin.finder.detector.api.detect.BaseEventDetector", mo125469f = "BaseEventDetector.kt", mo125470l = {120}, mo125471m = "leakReport")
    /* renamed from: com.tencent.plugin.finder.detector.api.detect.BaseEventDetector$b */
    public static final class C57933b extends C66704d {

        /* renamed from: d */
        public Object f165809d;

        /* renamed from: e */
        public Object f165810e;

        /* renamed from: f */
        public /* synthetic */ Object f165811f;

        /* renamed from: g */
        public final /* synthetic */ BaseEventDetector<T> f165812g;

        /* renamed from: h */
        public int f165813h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57933b(BaseEventDetector<T> baseEventDetector, C15601d<? super C57933b> dVar) {
            super(dVar);
            this.f165812g = baseEventDetector;
        }

        public final Object invokeSuspend(Object obj) {
            this.f165811f = obj;
            this.f165813h |= Integer.MIN_VALUE;
            return this.f165812g.mo82662m((Map) null, (C60149a) null, this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: hs3.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m67012a(com.tencent.plugin.finder.detector.api.detect.BaseEventDetector r11, hs3.C60149a r12, wx3.C15601d r13) {
        /*
            boolean r0 = r13 instanceof com.tencent.plugin.finder.detector.api.detect.BaseEventDetector.C57932a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector$a r0 = (com.tencent.plugin.finder.detector.api.detect.BaseEventDetector.C57932a) r0
            int r1 = r0.f165808i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f165808i = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector$a r0 = new com.tencent.plugin.finder.detector.api.detect.BaseEventDetector$a
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f165806g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f165808i
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x006b
            if (r2 == r8) goto L_0x005e
            if (r2 == r7) goto L_0x004d
            if (r2 == r6) goto L_0x003c
            if (r2 != r5) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0194
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            java.lang.Object r11 = r0.f165805f
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r0.f165804e
            hs3.a r12 = (hs3.C60149a) r12
            java.lang.Object r2 = r0.f165803d
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector r2 = (com.tencent.plugin.finder.detector.api.detect.BaseEventDetector) r2
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x012a
        L_0x004d:
            java.lang.Object r11 = r0.f165805f
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r0.f165804e
            hs3.a r12 = (hs3.C60149a) r12
            java.lang.Object r2 = r0.f165803d
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector r2 = (com.tencent.plugin.finder.detector.api.detect.BaseEventDetector) r2
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00db
        L_0x005e:
            java.lang.Object r11 = r0.f165804e
            r12 = r11
            hs3.a r12 = (hs3.C60149a) r12
            java.lang.Object r11 = r0.f165803d
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector r11 = (com.tencent.plugin.finder.detector.api.detect.BaseEventDetector) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x009a
        L_0x006b:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.String r13 = r11.f165801e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "checkDetect dataEventMap size: "
            r2.append(r9)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, fs3.c<T>> r9 = r11.f165800d
            int r9 = r9.size()
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            r9 = 60000(0xea60, double:2.9644E-319)
            r0.f165803d = r11
            r0.f165804e = r12
            r0.f165808i = r8
            java.lang.Object r13 = a14.C53965x0.m60607b(r9, r0)
            if (r13 != r1) goto L_0x009a
            return r1
        L_0x009a:
            java.lang.String r13 = r12.f171695a
            java.util.Map r13 = r11.mo76381h(r13)
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L_0x00b0
            java.lang.String r11 = r11.f165801e
            java.lang.String r12 = "checkDetect first leak size = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x00b0:
            java.lang.String r2 = r11.f165801e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "checkDetect second check, leakFirstMap = "
            r8.append(r9)
            java.lang.String r9 = r11.mo82663n(r13)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            r0.f165803d = r11
            r0.f165804e = r12
            r0.f165805f = r13
            r0.f165808i = r7
            java.lang.Object r2 = a14.C53965x0.m60607b(r3, r0)
            if (r2 != r1) goto L_0x00d9
            return r1
        L_0x00d9:
            r2 = r11
            r11 = r13
        L_0x00db:
            java.lang.String r13 = r12.f171695a
            java.util.Map r13 = r2.mo76381h(r13)
            java.util.Map r11 = r2.mo82658b(r11, r13)
            java.lang.String r7 = r2.f165801e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "checkDetect second check result leakSecondMap = "
            r8.append(r9)
            java.lang.String r13 = r2.mo82663n(r13)
            r8.append(r13)
            java.lang.String r13 = " diffSecondLeakMap: "
            r8.append(r13)
            java.lang.String r13 = r2.mo82663n(r11)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)
            boolean r13 = r11.isEmpty()
            if (r13 == 0) goto L_0x011b
            java.lang.String r11 = r2.f165801e
            java.lang.String r12 = "checkDetect second leak size = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x011b:
            r0.f165803d = r2
            r0.f165804e = r12
            r0.f165805f = r11
            r0.f165808i = r6
            java.lang.Object r13 = a14.C53965x0.m60607b(r3, r0)
            if (r13 != r1) goto L_0x012a
            return r1
        L_0x012a:
            java.lang.String r13 = r12.f171695a
            java.util.Map r13 = r2.mo76381h(r13)
            java.util.Map r11 = r2.mo82658b(r11, r13)
            java.lang.String r3 = r2.f165801e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "checkDetect third check leakThirdMap = "
            r4.append(r6)
            java.lang.String r13 = r2.mo82663n(r13)
            r4.append(r13)
            java.lang.String r13 = " diffThirdLeakMap: "
            r4.append(r13)
            java.lang.String r13 = r2.mo82663n(r11)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
            boolean r13 = r11.isEmpty()
            if (r13 == 0) goto L_0x016a
            java.lang.String r11 = r2.f165801e
            java.lang.String r12 = "checkDetect third leak size = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x016a:
            java.lang.String r13 = r2.f165801e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkDetect third check result diffThirdLeakMap = "
            r3.append(r4)
            java.lang.String r4 = r2.mo82663n(r11)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            r13 = 0
            r0.f165803d = r13
            r0.f165804e = r13
            r0.f165805f = r13
            r0.f165808i = r5
            java.lang.Object r11 = r2.mo82662m(r11, r12, r0)
            if (r11 != r1) goto L_0x0194
            return r1
        L_0x0194:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.plugin.finder.detector.api.detect.BaseEventDetector.m67012a(com.tencent.plugin.finder.detector.api.detect.BaseEventDetector, hs3.a, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public final Map<String, C59316c<T>> mo82658b(Map<String, C59316c<T>> map, Map<String, C59316c<T>> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (map2.containsKey(next.getKey())) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public final void mo82659c(C59316c<T> cVar) {
        C87412m.m108594g(cVar, "event");
        synchronized (this.f165802f) {
            C59316c remove = this.f165800d.remove(cVar.mo84417a());
        }
        String str = this.f165801e;
        Log.m105924i(str, "eventEnd getEventKey " + cVar.mo84417a() + " size: " + this.f165800d.size());
    }

    /* renamed from: d */
    public final void mo82660d(C59316c<T> cVar) {
        C87412m.m108594g(cVar, "event");
        synchronized (this.f165802f) {
            this.f165800d.put(cVar.mo84417a(), cVar);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        String str = this.f165801e;
        Log.m105924i(str, "eventStart getEventKey " + cVar.mo84417a() + " size: " + this.f165800d.size() + " extra: " + cVar.f169615c + ' ');
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Activity mo82661e(android.view.View r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0027
            android.content.Context r1 = r3.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0017
            android.content.Context r3 = r3.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r3, r0)
            android.app.Activity r3 = (android.app.Activity) r3
            return r3
        L_0x0017:
            android.view.ViewParent r3 = r3.getParent()
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0022
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0022:
            android.app.Activity r3 = r2.mo82661e(r0)
            return r3
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.plugin.finder.detector.api.detect.BaseEventDetector.mo82661e(android.view.View):android.app.Activity");
    }

    /* renamed from: f */
    public abstract String mo76379f();

    /* renamed from: g */
    public abstract long mo76380g();

    /* renamed from: h */
    public abstract Map<String, C59316c<T>> mo76381h(String str);

    /* renamed from: i */
    public abstract int mo76382i();

    /* renamed from: j */
    public abstract String mo76383j(C59316c<T> cVar, C60149a aVar);

    /* renamed from: k */
    public abstract void mo76384k(C59316c<T> cVar);

    /* renamed from: l */
    public abstract boolean mo76385l();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: m */
    public final java.lang.Object mo82662m(java.util.Map<java.lang.String, fs3.C59316c<T>> r7, hs3.C60149a r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.tencent.plugin.finder.detector.api.detect.BaseEventDetector.C57933b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector$b r0 = (com.tencent.plugin.finder.detector.api.detect.BaseEventDetector.C57933b) r0
            int r1 = r0.f165813h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f165813h = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector$b r0 = new com.tencent.plugin.finder.detector.api.detect.BaseEventDetector$b
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f165811f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f165813h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r7 = r0.f165810e
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r0.f165809d
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector r8 = (com.tencent.plugin.finder.detector.api.detect.BaseEventDetector) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0065
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r9)
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x004a
            java.lang.String r7 = r6.f165801e
            java.lang.String r8 = "leakReport data size = 0 , return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x004a:
            r0.f165809d = r6
            r0.f165810e = r7
            r0.f165813h = r3
            a14.h0 r9 = a14.C53872d1.f151119c
            gs3.a r2 = new gs3.a
            r4 = 0
            r2.<init>(r7, r6, r8, r4)
            java.lang.Object r8 = a14.C53895h.m60469g(r9, r2, r0)
            if (r8 != r1) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x0061:
            if (r8 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r8 = r6
        L_0x0065:
            java.lang.Object r9 = r8.f165802f
            monitor-enter(r9)
            java.util.Set r7 = r7.entrySet()     // Catch:{ all -> 0x00e4 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00e4 }
        L_0x0070:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00e4 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00e4 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, fs3.c<T>> r1 = r8.f165800d     // Catch:{ all -> 0x00e4 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x00e4 }
            r1.remove(r2)     // Catch:{ all -> 0x00e4 }
            boolean r1 = r8.mo76385l()     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = r8.f165801e     // Catch:{ all -> 0x00e4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r4.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = "leakReport isNeedAutoRecover: "
            r4.append(r5)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x0099
            r5 = 1
            goto L_0x009a
        L_0x0099:
            r5 = 0
        L_0x009a:
            r4.append(r5)     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = " \n data = "
            r4.append(r5)     // Catch:{ all -> 0x00e4 }
            r4.append(r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = " dataEventMap: "
            r4.append(r5)     // Catch:{ all -> 0x00e4 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, fs3.c<T>> r5 = r8.f165800d     // Catch:{ all -> 0x00e4 }
            r4.append(r5)     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00e4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x0070
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00e4 }
            fs3.c r0 = (fs3.C59316c) r0     // Catch:{ all -> 0x00e4 }
            r8.mo76384k(r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x0070
        L_0x00c2:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00e4 }
            monitor-exit(r9)
            java.lang.String r7 = r8.f165801e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "leakReport after dataEventMap: "
            r9.append(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, fs3.c<T>> r8 = r8.f165800d
            int r8 = r8.size()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x00e4:
            r7 = move-exception
            monitor-exit(r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.plugin.finder.detector.api.detect.BaseEventDetector.mo82662m(java.util.Map, hs3.a, wx3.d):java.lang.Object");
    }

    /* renamed from: n */
    public final String mo82663n(Map<String, C59316c<T>> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            if (i != 0) {
                sb.append(" ; ");
            }
            i++;
            sb.append("eventName: " + ((C59316c) next.getValue()).mo84417a());
        }
        sb.append(" }");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: o */
    public Object mo82664o(C60149a aVar, Map.Entry<String, C59316c<T>> entry, C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }
}
