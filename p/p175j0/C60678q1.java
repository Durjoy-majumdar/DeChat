package p175j0;

import a14.C0000n0;
import a14.C53916l;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", mo125469f = "Recomposer.kt", mo125470l = {436, 454}, mo125471m = "invokeSuspend")
/* renamed from: j0.q1 */
public final class C60678q1 extends C91594j implements C32228q<C0000n0, C60683t0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f172834d;

    /* renamed from: e */
    public Object f172835e;

    /* renamed from: f */
    public Object f172836f;

    /* renamed from: g */
    public Object f172837g;

    /* renamed from: h */
    public Object f172838h;

    /* renamed from: i */
    public int f172839i;

    /* renamed from: j */
    public /* synthetic */ Object f172840j;

    /* renamed from: n */
    public final /* synthetic */ C60661k1 f172841n;

    /* renamed from: j0.q1$a */
    public static final class C60679a extends C87413o implements C32226l<Long, C53916l<? super C13598b0>> {

        /* renamed from: d */
        public final /* synthetic */ C60661k1 f172842d;

        /* renamed from: e */
        public final /* synthetic */ List<C60689y> f172843e;

        /* renamed from: f */
        public final /* synthetic */ List<C24727x0> f172844f;

        /* renamed from: g */
        public final /* synthetic */ Set<C60689y> f172845g;

        /* renamed from: h */
        public final /* synthetic */ List<C60689y> f172846h;

        /* renamed from: i */
        public final /* synthetic */ Set<C60689y> f172847i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60679a(C60661k1 k1Var, List<C60689y> list, List<C24727x0> list2, Set<C60689y> set, List<C60689y> list3, Set<C60689y> set2) {
            super(1);
            this.f172842d = k1Var;
            this.f172843e = list;
            this.f172844f = list2;
            this.f172845g = set;
            this.f172846h = list3;
            this.f172847i = set2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a6, code lost:
            if ((!r8.isEmpty()) == false) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            sx3.C64175a0.m75508p(r9, r8);
            r0 = r8.size();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00af, code lost:
            if (r4 >= r0) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b1, code lost:
            r8.get(r4).mo51663g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
            r4 = r4 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            r8.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
            if ((!r7.isEmpty()) == false) goto L_0x00ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            sx3.C64175a0.m75508p(r9, r7);
            r0 = r7.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d8, code lost:
            if (r0.hasNext() == false) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00da, code lost:
            ((p175j0.C60689y) r0.next()).mo51669m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            r7.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f2, code lost:
            if ((!r9.isEmpty()) == false) goto L_0x0111;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            r0 = r9.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fc, code lost:
            if (r0.hasNext() == false) goto L_0x0108;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fe, code lost:
            ((p175j0.C60689y) r0.next()).mo51667k();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            r9.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0111, code lost:
            p175j0.C60661k1.m70938q(r2);
            r3 = r2.f172787d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0116, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
            r0 = r2.mo85597v();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x011c, code lost:
            android.os.Trace.endSection();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x011f, code lost:
            return r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                java.lang.Number r0 = (java.lang.Number) r0
                long r2 = r0.longValue()
                j0.k1 r0 = r1.f172842d
                j0.e r0 = r0.f172784a
                boolean r0 = r0.mo85592e()
                r4 = 0
                r5 = 1
                if (r0 == 0) goto L_0x004f
                java.lang.String r0 = "Recomposer:animation"
                j0.k1 r6 = r1.f172842d
                android.os.Trace.beginSection(r0)
                j0.e r0 = r6.f172784a     // Catch:{ all -> 0x004a }
                r0.mo85593f(r2)     // Catch:{ all -> 0x004a }
                java.lang.Object r2 = p241t0.C110865n.f331651c     // Catch:{ all -> 0x004a }
                monitor-enter(r2)     // Catch:{ all -> 0x004a }
                java.util.concurrent.atomic.AtomicReference<t0.a> r0 = p241t0.C110865n.f331657i     // Catch:{ all -> 0x0047 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0047 }
                t0.a r0 = (p241t0.C110834a) r0     // Catch:{ all -> 0x0047 }
                java.util.Set<t0.h0> r0 = r0.f331588h     // Catch:{ all -> 0x0047 }
                if (r0 == 0) goto L_0x003a
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0047 }
                r0 = r0 ^ r5
                if (r0 != r5) goto L_0x003a
                r0 = 1
                goto L_0x003b
            L_0x003a:
                r0 = 0
            L_0x003b:
                monitor-exit(r2)     // Catch:{ all -> 0x004a }
                if (r0 == 0) goto L_0x0041
                p241t0.C110865n.m151138a()     // Catch:{ all -> 0x004a }
            L_0x0041:
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x004a }
                android.os.Trace.endSection()
                goto L_0x004f
            L_0x0047:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004a }
                throw r0     // Catch:{ all -> 0x004a }
            L_0x004a:
                r0 = move-exception
                android.os.Trace.endSection()
                throw r0
            L_0x004f:
                java.lang.String r0 = "Recomposer:recompose"
                j0.k1 r2 = r1.f172842d
                java.util.List<j0.y> r3 = r1.f172843e
                java.util.List<j0.x0> r6 = r1.f172844f
                java.util.Set<j0.y> r7 = r1.f172845g
                java.util.List<j0.y> r8 = r1.f172846h
                java.util.Set<j0.y> r9 = r1.f172847i
                android.os.Trace.beginSection(r0)
                java.lang.Object r10 = r2.f172787d     // Catch:{ all -> 0x019c }
                monitor-enter(r10)     // Catch:{ all -> 0x019c }
                p175j0.C60661k1.m70940s(r2)     // Catch:{ all -> 0x0199 }
                java.util.List<j0.y> r0 = r2.f172792i     // Catch:{ all -> 0x0199 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0199 }
                int r11 = r0.size()     // Catch:{ all -> 0x0199 }
                r12 = 0
            L_0x006f:
                if (r12 >= r11) goto L_0x007d
                java.lang.Object r13 = r0.get(r12)     // Catch:{ all -> 0x0199 }
                j0.y r13 = (p175j0.C60689y) r13     // Catch:{ all -> 0x0199 }
                r3.add(r13)     // Catch:{ all -> 0x0199 }
                int r12 = r12 + 1
                goto L_0x006f
            L_0x007d:
                java.util.List<j0.y> r0 = r2.f172792i     // Catch:{ all -> 0x0199 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0199 }
                r0.clear()     // Catch:{ all -> 0x0199 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0199 }
                monitor-exit(r10)     // Catch:{ all -> 0x019c }
                k0.c r0 = new k0.c     // Catch:{ all -> 0x019c }
                r0.<init>()     // Catch:{ all -> 0x019c }
                k0.c r10 = new k0.c     // Catch:{ all -> 0x019c }
                r10.<init>()     // Catch:{ all -> 0x019c }
            L_0x0091:
                boolean r11 = r3.isEmpty()     // Catch:{ all -> 0x019c }
                r11 = r11 ^ r5
                if (r11 != 0) goto L_0x0124
                boolean r11 = r6.isEmpty()     // Catch:{ all -> 0x019c }
                r11 = r11 ^ r5
                if (r11 == 0) goto L_0x00a1
                goto L_0x0124
            L_0x00a1:
                boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x019c }
                r0 = r0 ^ r5
                if (r0 == 0) goto L_0x00c6
                sx3.C64175a0.m75508p(r9, r8)     // Catch:{ all -> 0x00c1 }
                int r0 = r8.size()     // Catch:{ all -> 0x00c1 }
            L_0x00af:
                if (r4 >= r0) goto L_0x00bd
                java.lang.Object r3 = r8.get(r4)     // Catch:{ all -> 0x00c1 }
                j0.y r3 = (p175j0.C60689y) r3     // Catch:{ all -> 0x00c1 }
                r3.mo51663g()     // Catch:{ all -> 0x00c1 }
                int r4 = r4 + 1
                goto L_0x00af
            L_0x00bd:
                r8.clear()     // Catch:{ all -> 0x019c }
                goto L_0x00c6
            L_0x00c1:
                r0 = move-exception
                r8.clear()     // Catch:{ all -> 0x019c }
                throw r0     // Catch:{ all -> 0x019c }
            L_0x00c6:
                boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x019c }
                r0 = r0 ^ r5
                if (r0 == 0) goto L_0x00ed
                sx3.C64175a0.m75508p(r9, r7)     // Catch:{ all -> 0x00e8 }
                java.util.Iterator r0 = r7.iterator()     // Catch:{ all -> 0x00e8 }
            L_0x00d4:
                boolean r3 = r0.hasNext()     // Catch:{ all -> 0x00e8 }
                if (r3 == 0) goto L_0x00e4
                java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x00e8 }
                j0.y r3 = (p175j0.C60689y) r3     // Catch:{ all -> 0x00e8 }
                r3.mo51669m()     // Catch:{ all -> 0x00e8 }
                goto L_0x00d4
            L_0x00e4:
                r7.clear()     // Catch:{ all -> 0x019c }
                goto L_0x00ed
            L_0x00e8:
                r0 = move-exception
                r7.clear()     // Catch:{ all -> 0x019c }
                throw r0     // Catch:{ all -> 0x019c }
            L_0x00ed:
                boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x019c }
                r0 = r0 ^ r5
                if (r0 == 0) goto L_0x0111
                java.util.Iterator r0 = r9.iterator()     // Catch:{ all -> 0x010c }
            L_0x00f8:
                boolean r3 = r0.hasNext()     // Catch:{ all -> 0x010c }
                if (r3 == 0) goto L_0x0108
                java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x010c }
                j0.y r3 = (p175j0.C60689y) r3     // Catch:{ all -> 0x010c }
                r3.mo51667k()     // Catch:{ all -> 0x010c }
                goto L_0x00f8
            L_0x0108:
                r9.clear()     // Catch:{ all -> 0x019c }
                goto L_0x0111
            L_0x010c:
                r0 = move-exception
                r9.clear()     // Catch:{ all -> 0x019c }
                throw r0     // Catch:{ all -> 0x019c }
            L_0x0111:
                p175j0.C60661k1.m70938q(r2)     // Catch:{ all -> 0x019c }
                java.lang.Object r3 = r2.f172787d     // Catch:{ all -> 0x019c }
                monitor-enter(r3)     // Catch:{ all -> 0x019c }
                a14.l r0 = r2.mo85597v()     // Catch:{ all -> 0x0120 }
                monitor-exit(r3)     // Catch:{ all -> 0x019c }
                android.os.Trace.endSection()
                return r0
            L_0x0120:
                r0 = move-exception
                r2 = r0
                monitor-exit(r3)     // Catch:{ all -> 0x019c }
                throw r2     // Catch:{ all -> 0x019c }
            L_0x0124:
                int r11 = r3.size()     // Catch:{ all -> 0x0194 }
                r12 = 0
            L_0x0129:
                if (r12 >= r11) goto L_0x0140
                java.lang.Object r13 = r3.get(r12)     // Catch:{ all -> 0x0194 }
                j0.y r13 = (p175j0.C60689y) r13     // Catch:{ all -> 0x0194 }
                r10.add(r13)     // Catch:{ all -> 0x0194 }
                j0.y r13 = p175j0.C60661k1.m70939r(r2, r13, r0)     // Catch:{ all -> 0x0194 }
                if (r13 == 0) goto L_0x013d
                r8.add(r13)     // Catch:{ all -> 0x0194 }
            L_0x013d:
                int r12 = r12 + 1
                goto L_0x0129
            L_0x0140:
                r3.clear()     // Catch:{ all -> 0x019c }
                int r11 = r0.f173545d     // Catch:{ all -> 0x019c }
                if (r11 <= 0) goto L_0x0149
                r11 = 1
                goto L_0x014a
            L_0x0149:
                r11 = 0
            L_0x014a:
                if (r11 == 0) goto L_0x0179
                java.lang.Object r11 = r2.f172787d     // Catch:{ all -> 0x019c }
                monitor-enter(r11)     // Catch:{ all -> 0x019c }
                java.util.List<j0.y> r12 = r2.f172790g     // Catch:{ all -> 0x0176 }
                java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0176 }
                int r13 = r12.size()     // Catch:{ all -> 0x0176 }
                r14 = 0
            L_0x0158:
                if (r14 >= r13) goto L_0x0172
                java.lang.Object r15 = r12.get(r14)     // Catch:{ all -> 0x0176 }
                j0.y r15 = (p175j0.C60689y) r15     // Catch:{ all -> 0x0176 }
                boolean r16 = r10.contains(r15)     // Catch:{ all -> 0x0176 }
                if (r16 != 0) goto L_0x016f
                boolean r16 = r15.mo51666j(r0)     // Catch:{ all -> 0x0176 }
                if (r16 == 0) goto L_0x016f
                r3.add(r15)     // Catch:{ all -> 0x0176 }
            L_0x016f:
                int r14 = r14 + 1
                goto L_0x0158
            L_0x0172:
                rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0176 }
                monitor-exit(r11)     // Catch:{ all -> 0x019c }
                goto L_0x0179
            L_0x0176:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x019c }
                throw r0     // Catch:{ all -> 0x019c }
            L_0x0179:
                boolean r11 = r3.isEmpty()     // Catch:{ all -> 0x019c }
                if (r11 == 0) goto L_0x0091
                p175j0.C60678q1.m70958f(r6, r2)     // Catch:{ all -> 0x019c }
            L_0x0182:
                boolean r11 = r6.isEmpty()     // Catch:{ all -> 0x019c }
                r11 = r11 ^ r5
                if (r11 == 0) goto L_0x0091
                java.util.List r11 = r2.mo85599y(r6, r0)     // Catch:{ all -> 0x019c }
                sx3.C64175a0.m75508p(r7, r11)     // Catch:{ all -> 0x019c }
                p175j0.C60678q1.m70958f(r6, r2)     // Catch:{ all -> 0x019c }
                goto L_0x0182
            L_0x0194:
                r0 = move-exception
                r3.clear()     // Catch:{ all -> 0x019c }
                throw r0     // Catch:{ all -> 0x019c }
            L_0x0199:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x019c }
                throw r0     // Catch:{ all -> 0x019c }
            L_0x019c:
                r0 = move-exception
                android.os.Trace.endSection()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p175j0.C60678q1.C60679a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60678q1(C60661k1 k1Var, C15601d<? super C60678q1> dVar) {
        super(3, dVar);
        this.f172841n = k1Var;
    }

    /* renamed from: f */
    public static final void m70958f(List list, C60661k1 k1Var) {
        list.clear();
        synchronized (k1Var.f172787d) {
            ArrayList arrayList = (ArrayList) k1Var.f172794k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                list.add((C24727x0) arrayList.get(i));
            }
            ((ArrayList) k1Var.f172794k).clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C0000n0 n0Var = (C0000n0) obj;
        C60678q1 q1Var = new C60678q1(this.f172841n, (C15601d) obj3);
        q1Var.f172840j = (C60683t0) obj2;
        return q1Var.invokeSuspend(C13598b0.f38549a);
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106  */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r1.f172839i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0062
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r2 = r1.f172838h
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.f172837g
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.f172836f
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.f172835e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.f172834d
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.f172840j
            j0.t0 r9 = (p175j0.C60683t0) r9
            kotlin.ResultKt.throwOnFailure(r18)
            r11 = r1
            r10 = r2
            r15 = r6
            r6 = 2
            r2 = r0
            r16 = r9
            r9 = r5
            r5 = r16
            goto L_0x0163
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003d:
            java.lang.Object r2 = r1.f172838h
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.f172837g
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.f172836f
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.f172835e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.f172834d
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.f172840j
            j0.t0 r9 = (p175j0.C60683t0) r9
            kotlin.ResultKt.throwOnFailure(r18)
            r10 = r1
            r11 = r2
            r12 = r5
            r15 = r6
            r14 = r7
            r13 = r8
            r5 = r9
            r2 = r0
            goto L_0x00e7
        L_0x0062:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r1.f172840j
            j0.t0 r2 = (p175j0.C60683t0) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r11 = r1
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r0
        L_0x008a:
            j0.k1 r12 = r11.f172841n
            java.lang.Object r12 = r12.f172787d
            monitor-enter(r12)
            monitor-exit(r12)
            j0.k1 r12 = r11.f172841n
            r11.f172840j = r5
            r11.f172834d = r6
            r11.f172835e = r7
            r11.f172836f = r8
            r11.f172837g = r9
            r11.f172838h = r10
            r11.f172839i = r4
            boolean r13 = r12.mo85598w()
            if (r13 != 0) goto L_0x00d9
            a14.m r13 = new a14.m
            wx3.d r14 = xx3.C66447b.m78392b(r11)
            r13.<init>(r14, r4)
            r13.mo74609p()
            java.lang.Object r14 = r12.f172787d
            monitor-enter(r14)
            boolean r15 = r12.mo85598w()     // Catch:{ all -> 0x00d6 }
            if (r15 == 0) goto L_0x00c7
            kotlin.Result$Companion r12 = kotlin.Result.Companion     // Catch:{ all -> 0x00d6 }
            rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00d6 }
            java.lang.Object r12 = kotlin.Result.m168114constructorimpl(r12)     // Catch:{ all -> 0x00d6 }
            r13.resumeWith(r12)     // Catch:{ all -> 0x00d6 }
            goto L_0x00c9
        L_0x00c7:
            r12.f172797n = r13     // Catch:{ all -> 0x00d6 }
        L_0x00c9:
            rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00d6 }
            monitor-exit(r14)
            java.lang.Object r12 = r13.mo74608o()
            if (r12 != r2) goto L_0x00d3
            goto L_0x00db
        L_0x00d3:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            goto L_0x00db
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00d9:
            rx3.b0 r12 = rx3.C13598b0.f38549a
        L_0x00db:
            if (r12 != r0) goto L_0x00de
            return r0
        L_0x00de:
            r13 = r6
            r14 = r7
            r15 = r8
            r12 = r9
            r16 = r11
            r11 = r10
            r10 = r16
        L_0x00e7:
            j0.k1 r6 = r10.f172841n
            java.lang.Object r7 = r6.f172787d
            monitor-enter(r7)
            java.util.List<j0.y> r8 = r6.f172792i     // Catch:{ all -> 0x0124 }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0124 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0124 }
            r8 = r8 ^ r4
            r9 = 0
            if (r8 != 0) goto L_0x0103
            j0.e r8 = r6.f172784a     // Catch:{ all -> 0x0124 }
            boolean r8 = r8.mo85592e()     // Catch:{ all -> 0x0124 }
            if (r8 == 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r8 = 0
            goto L_0x0104
        L_0x0103:
            r8 = 1
        L_0x0104:
            if (r8 != 0) goto L_0x0126
            p175j0.C60661k1.m70940s(r6)     // Catch:{ all -> 0x0124 }
            java.util.List<j0.y> r8 = r6.f172792i     // Catch:{ all -> 0x0124 }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0124 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0124 }
            r8 = r8 ^ r4
            if (r8 != 0) goto L_0x011f
            j0.e r6 = r6.f172784a     // Catch:{ all -> 0x0124 }
            boolean r6 = r6.mo85592e()     // Catch:{ all -> 0x0124 }
            if (r6 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r6 = 0
            goto L_0x0120
        L_0x011f:
            r6 = 1
        L_0x0120:
            if (r6 != 0) goto L_0x0126
            r9 = 1
            goto L_0x0126
        L_0x0124:
            r0 = move-exception
            goto L_0x016b
        L_0x0126:
            monitor-exit(r7)
            if (r9 == 0) goto L_0x0134
            r9 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r16 = r11
            r11 = r10
            r10 = r16
            goto L_0x008a
        L_0x0134:
            j0.q1$a r9 = new j0.q1$a
            j0.k1 r7 = r10.f172841n
            r6 = r9
            r8 = r13
            r4 = r9
            r9 = r14
            r3 = r10
            r10 = r12
            r18 = r11
            r11 = r15
            r1 = r12
            r12 = r18
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3.f172840j = r5
            r3.f172834d = r13
            r3.f172835e = r14
            r3.f172836f = r15
            r3.f172837g = r1
            r10 = r18
            r3.f172838h = r10
            r6 = 2
            r3.f172839i = r6
            java.lang.Object r4 = r5.mo74976d(r4, r3)
            if (r4 != r0) goto L_0x015f
            return r0
        L_0x015f:
            r9 = r1
            r11 = r3
            r8 = r13
            r7 = r14
        L_0x0163:
            r1 = r17
            r6 = r8
            r8 = r15
            r3 = 2
            r4 = 1
            goto L_0x008a
        L_0x016b:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p175j0.C60678q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
