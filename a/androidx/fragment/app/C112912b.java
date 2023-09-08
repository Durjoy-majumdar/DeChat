package androidx.fragment.app;

import android.content.Context;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C112943n;
import androidx.fragment.app.C112950q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p1042u.C111055b;
import p1042u.C118556h;
import p834a3.C112741b;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.fragment.app.b */
public class C112912b extends C112950q0 {

    /* renamed from: androidx.fragment.app.b$a */
    public class C112913a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f338007d;

        /* renamed from: e */
        public final /* synthetic */ C112950q0.C112954d f338008e;

        public C112913a(List list, C112950q0.C112954d dVar) {
            this.f338007d = list;
            this.f338008e = dVar;
        }

        public void run() {
            if (this.f338007d.contains(this.f338008e)) {
                this.f338007d.remove(this.f338008e);
                C112912b bVar = C112912b.this;
                C112950q0.C112954d dVar = this.f338008e;
                bVar.getClass();
                dVar.f338142a.mo165245a(dVar.f338144c.mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    public static class C112914b extends C112915c {

        /* renamed from: c */
        public boolean f338010c;

        /* renamed from: d */
        public boolean f338011d = false;

        /* renamed from: e */
        public C112943n.C112944a f338012e;

        public C112914b(C112950q0.C112954d dVar, C112741b bVar, boolean z) {
            super(dVar, bVar);
            this.f338010c = z;
        }

        /* renamed from: c */
        public C112943n.C112944a mo165185c(Context context) {
            if (this.f338011d) {
                return this.f338012e;
            }
            C112950q0.C112954d dVar = this.f338013a;
            C112943n.C112944a a = C112943n.m154542a(context, dVar.f338144c, dVar.f338142a == C112950q0.C112954d.C112957c.VISIBLE, this.f338010c);
            this.f338012e = a;
            this.f338011d = true;
            return a;
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    public static class C112915c {

        /* renamed from: a */
        public final C112950q0.C112954d f338013a;

        /* renamed from: b */
        public final C112741b f338014b;

        public C112915c(C112950q0.C112954d dVar, C112741b bVar) {
            this.f338013a = dVar;
            this.f338014b = bVar;
        }

        /* renamed from: a */
        public void mo165186a() {
            C112950q0.C112954d dVar = this.f338013a;
            if (dVar.f338146e.remove(this.f338014b) && dVar.f338146e.isEmpty()) {
                dVar.mo165240b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r2 = androidx.fragment.app.C112950q0.C112954d.C112957c.VISIBLE;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo165187b() {
            /*
                r3 = this;
                androidx.fragment.app.q0$d r0 = r3.f338013a
                androidx.fragment.app.Fragment r0 = r0.f338144c
                android.view.View r0 = r0.mView
                androidx.fragment.app.q0$d$c r0 = androidx.fragment.app.C112950q0.C112954d.C112957c.m154567c(r0)
                androidx.fragment.app.q0$d r1 = r3.f338013a
                androidx.fragment.app.q0$d$c r1 = r1.f338142a
                if (r0 == r1) goto L_0x0019
                androidx.fragment.app.q0$d$c r2 = androidx.fragment.app.C112950q0.C112954d.C112957c.VISIBLE
                if (r0 == r2) goto L_0x0017
                if (r1 == r2) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r0 = 0
                goto L_0x001a
            L_0x0019:
                r0 = 1
            L_0x001a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C112912b.C112915c.mo165187b():boolean");
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    public static class C112916d extends C112915c {

        /* renamed from: c */
        public final Object f338015c;

        /* renamed from: d */
        public final boolean f338016d;

        /* renamed from: e */
        public final Object f338017e;

        public C112916d(C112950q0.C112954d dVar, C112741b bVar, boolean z, boolean z2) {
            super(dVar, bVar);
            if (dVar.f338142a == C112950q0.C112954d.C112957c.VISIBLE) {
                this.f338015c = z ? dVar.f338144c.getReenterTransition() : dVar.f338144c.getEnterTransition();
                this.f338016d = z ? dVar.f338144c.getAllowReturnTransitionOverlap() : dVar.f338144c.getAllowEnterTransitionOverlap();
            } else {
                this.f338015c = z ? dVar.f338144c.getReturnTransition() : dVar.f338144c.getExitTransition();
                this.f338016d = true;
            }
            if (!z2) {
                this.f338017e = null;
            } else if (z) {
                this.f338017e = dVar.f338144c.getSharedElementReturnTransition();
            } else {
                this.f338017e = dVar.f338144c.getSharedElementEnterTransition();
            }
        }

        /* renamed from: c */
        public final C112941l0 mo165188c(Object obj) {
            if (obj == null) {
                return null;
            }
            C112941l0 l0Var = C112935j0.f338102b;
            if (l0Var != null) {
                ((C16573k0) l0Var).getClass();
                if (obj instanceof Transition) {
                    return l0Var;
                }
            }
            C112941l0 l0Var2 = C112935j0.f338103c;
            if (l0Var2 != null && l0Var2.mo16814e(obj)) {
                return l0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f338013a.f338144c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public C112912b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0669 A[LOOP:14: B:219:0x0663->B:221:0x0669, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo165180b(java.util.List<androidx.fragment.app.C112950q0.C112954d> r40, boolean r41) {
        /*
            r39 = this;
            r7 = r39
            r6 = r41
            androidx.fragment.app.q0$d$c r8 = androidx.fragment.app.C112950q0.C112954d.C112957c.GONE
            androidx.fragment.app.q0$d$c r9 = androidx.fragment.app.C112950q0.C112954d.C112957c.VISIBLE
            java.util.Iterator r0 = r40.iterator()
            r11 = 0
            r12 = 0
        L_0x000e:
            boolean r1 = r0.hasNext()
            r13 = 2
            r14 = 1
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.q0$d r1 = (androidx.fragment.app.C112950q0.C112954d) r1
            androidx.fragment.app.Fragment r2 = r1.f338144c
            android.view.View r2 = r2.mView
            androidx.fragment.app.q0$d$c r2 = androidx.fragment.app.C112950q0.C112954d.C112957c.m154567c(r2)
            androidx.fragment.app.q0$d$c r3 = r1.f338142a
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x0038
            if (r3 == r14) goto L_0x0034
            if (r3 == r13) goto L_0x0038
            r4 = 3
            if (r3 == r4) goto L_0x0038
            goto L_0x000e
        L_0x0034:
            if (r2 == r9) goto L_0x000e
            r12 = r1
            goto L_0x000e
        L_0x0038:
            if (r2 != r9) goto L_0x000e
            if (r11 != 0) goto L_0x000e
            r11 = r1
            goto L_0x000e
        L_0x003e:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = r40
            r4.<init>(r0)
            java.util.Iterator r0 = r40.iterator()
        L_0x0053:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a1
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.q0$d r1 = (androidx.fragment.app.C112950q0.C112954d) r1
            a3.b r2 = new a3.b
            r2.<init>()
            r1.mo165241d()
            java.util.HashSet<a3.b> r3 = r1.f338146e
            r3.add(r2)
            androidx.fragment.app.b$b r3 = new androidx.fragment.app.b$b
            r3.<init>(r1, r2, r6)
            r15.add(r3)
            a3.b r2 = new a3.b
            r2.<init>()
            r1.mo165241d()
            java.util.HashSet<a3.b> r3 = r1.f338146e
            r3.add(r2)
            androidx.fragment.app.b$d r3 = new androidx.fragment.app.b$d
            if (r6 == 0) goto L_0x0088
            if (r1 != r11) goto L_0x008c
            goto L_0x008a
        L_0x0088:
            if (r1 != r12) goto L_0x008c
        L_0x008a:
            r13 = 1
            goto L_0x008d
        L_0x008c:
            r13 = 0
        L_0x008d:
            r3.<init>(r1, r2, r6, r13)
            r5.add(r3)
            androidx.fragment.app.b$a r2 = new androidx.fragment.app.b$a
            r2.<init>(r4, r1)
            java.util.List<java.lang.Runnable> r1 = r1.f338145d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r2)
            r13 = 2
            goto L_0x0053
        L_0x00a1:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.Iterator r0 = r5.iterator()
            r3 = 0
        L_0x00ab:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x013d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b$d r1 = (androidx.fragment.app.C112912b.C112916d) r1
            boolean r2 = r1.mo165187b()
            if (r2 == 0) goto L_0x00c1
            r16 = r0
            goto L_0x0138
        L_0x00c1:
            java.lang.Object r2 = r1.f338015c
            androidx.fragment.app.l0 r2 = r1.mo165188c(r2)
            java.lang.Object r10 = r1.f338017e
            androidx.fragment.app.l0 r10 = r1.mo165188c(r10)
            java.lang.String r14 = " returned Transition "
            r16 = r0
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r2 == 0) goto L_0x0105
            if (r10 == 0) goto L_0x0105
            if (r2 != r10) goto L_0x00da
            goto L_0x0105
        L_0x00da:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            androidx.fragment.app.q0$d r0 = r1.f338013a
            androidx.fragment.app.Fragment r0 = r0.f338144c
            r3.append(r0)
            r3.append(r14)
            java.lang.Object r0 = r1.f338015c
            r3.append(r0)
            java.lang.String r0 = " which uses a different Transition  type than its shared element transition "
            r3.append(r0)
            java.lang.Object r0 = r1.f338017e
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0105:
            if (r2 == 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r2 = r10
        L_0x0109:
            if (r3 != 0) goto L_0x010d
            r3 = r2
            goto L_0x0138
        L_0x010d:
            if (r2 == 0) goto L_0x0138
            if (r3 != r2) goto L_0x0112
            goto L_0x0138
        L_0x0112:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            androidx.fragment.app.q0$d r0 = r1.f338013a
            androidx.fragment.app.Fragment r0 = r0.f338144c
            r3.append(r0)
            r3.append(r14)
            java.lang.Object r0 = r1.f338015c
            r3.append(r0)
            java.lang.String r0 = " which uses a different Transition  type than other Fragments."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0138:
            r0 = r16
            r14 = 1
            goto L_0x00ab
        L_0x013d:
            if (r3 != 0) goto L_0x0163
            java.util.Iterator r0 = r5.iterator()
        L_0x0143:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x015a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b$d r1 = (androidx.fragment.app.C112912b.C112916d) r1
            androidx.fragment.app.q0$d r2 = r1.f338013a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r13.put(r2, r3)
            r1.mo165186a()
            goto L_0x0143
        L_0x015a:
            r36 = r4
            r11 = r8
            r8 = r13
            r26 = r15
        L_0x0160:
            r6 = 0
            goto L_0x0541
        L_0x0163:
            android.view.View r10 = new android.view.View
            android.view.ViewGroup r0 = r7.f338132a
            android.content.Context r0 = r0.getContext()
            r10.<init>(r0)
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            u.b r0 = new u.b
            r0.<init>()
            java.util.Iterator r25 = r5.iterator()
            r16 = r4
            r17 = r5
            r5 = r11
            r4 = r12
            r26 = r15
            r15 = 0
            r27 = 0
            r28 = 0
        L_0x0193:
            boolean r18 = r25.hasNext()
            if (r18 == 0) goto L_0x0398
            java.lang.Object r18 = r25.next()
            r29 = r9
            r9 = r18
            androidx.fragment.app.b$d r9 = (androidx.fragment.app.C112912b.C112916d) r9
            java.lang.Object r9 = r9.f338017e
            if (r9 == 0) goto L_0x01aa
            r18 = 1
            goto L_0x01ac
        L_0x01aa:
            r18 = 0
        L_0x01ac:
            if (r18 == 0) goto L_0x0377
            if (r5 == 0) goto L_0x0377
            if (r4 == 0) goto L_0x0377
            java.lang.Object r9 = r3.mo16815g(r9)
            java.lang.Object r15 = r3.mo16827x(r9)
            androidx.fragment.app.Fragment r9 = r4.f338144c
            java.util.ArrayList r9 = r9.getSharedElementSourceNames()
            r18 = r3
            androidx.fragment.app.Fragment r3 = r5.f338144c
            java.util.ArrayList r3 = r3.getSharedElementSourceNames()
            r30 = r8
            androidx.fragment.app.Fragment r8 = r5.f338144c
            java.util.ArrayList r8 = r8.getSharedElementTargetNames()
            r32 = r10
            r31 = r13
            r13 = 0
        L_0x01d5:
            int r10 = r8.size()
            r33 = r14
            r14 = -1
            if (r13 >= r10) goto L_0x01f4
            java.lang.Object r10 = r8.get(r13)
            int r10 = r9.indexOf(r10)
            if (r10 == r14) goto L_0x01ef
            java.lang.Object r14 = r3.get(r13)
            r9.set(r10, r14)
        L_0x01ef:
            int r13 = r13 + 1
            r14 = r33
            goto L_0x01d5
        L_0x01f4:
            androidx.fragment.app.Fragment r3 = r4.f338144c
            java.util.ArrayList r8 = r3.getSharedElementTargetNames()
            if (r6 != 0) goto L_0x0207
            androidx.fragment.app.Fragment r3 = r5.f338144c
            r3.getExitTransitionCallback()
            androidx.fragment.app.Fragment r3 = r4.f338144c
            r3.getEnterTransitionCallback()
            goto L_0x0211
        L_0x0207:
            androidx.fragment.app.Fragment r3 = r5.f338144c
            r3.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r3 = r4.f338144c
            r3.getExitTransitionCallback()
        L_0x0211:
            int r3 = r9.size()
            r10 = 0
        L_0x0216:
            if (r10 >= r3) goto L_0x022d
            java.lang.Object r13 = r9.get(r10)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r19 = r8.get(r10)
            r14 = r19
            java.lang.String r14 = (java.lang.String) r14
            r0.put(r13, r14)
            int r10 = r10 + 1
            r14 = -1
            goto L_0x0216
        L_0x022d:
            u.b r10 = new u.b
            r10.<init>()
            androidx.fragment.app.Fragment r3 = r5.f338144c
            android.view.View r3 = r3.mView
            r7.mo165182k(r10, r3)
            p1042u.C118556h.m167218k(r10, r9)
            java.util.Set r3 = r10.keySet()
            p1042u.C118556h.m167218k(r0, r3)
            u.b r13 = new u.b
            r13.<init>()
            androidx.fragment.app.Fragment r3 = r4.f338144c
            android.view.View r3 = r3.mView
            r7.mo165182k(r13, r3)
            p1042u.C118556h.m167218k(r13, r8)
            java.util.Collection r3 = r0.values()
            p1042u.C118556h.m167218k(r13, r3)
            int[] r3 = androidx.fragment.app.C112935j0.f338101a
            int r3 = r0.f332583f
            r14 = -1
            int r3 = r3 + r14
        L_0x025f:
            if (r3 < 0) goto L_0x0273
            java.lang.Object r14 = r0.mo162791l(r3)
            java.lang.String r14 = (java.lang.String) r14
            boolean r14 = r13.containsKey(r14)
            if (r14 != 0) goto L_0x0270
            r0.mo162790k(r3)
        L_0x0270:
            int r3 = r3 + -1
            goto L_0x025f
        L_0x0273:
            java.util.Set r3 = r0.keySet()
            r7.mo165183l(r10, r3)
            java.util.Collection r3 = r0.values()
            r7.mo165183l(r13, r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x02a0
            r2.clear()
            r1.clear()
            r24 = r0
            r14 = r2
            r36 = r16
            r37 = r17
            r3 = r18
            r8 = r31
            r0 = r32
            r6 = r33
            r15 = 0
        L_0x029d:
            r2 = r1
            goto L_0x0385
        L_0x02a0:
            androidx.fragment.app.Fragment r3 = r4.f338144c
            androidx.fragment.app.Fragment r4 = r5.f338144c
            r14 = 1
            androidx.fragment.app.C112935j0.m154508c(r3, r4, r6, r10, r14)
            android.view.ViewGroup r5 = r7.f338132a
            androidx.fragment.app.g r4 = new androidx.fragment.app.g
            r24 = r0
            r0 = r4
            r3 = r1
            r1 = r39
            r14 = r2
            r2 = r12
            r35 = r3
            r34 = r18
            r6 = 0
            r3 = r11
            r6 = r4
            r36 = r16
            r4 = r41
            r38 = r12
            r37 = r17
            r12 = r5
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            p849e3.C58525r.m67941a(r12, r6)
            java.util.Collection r0 = r10.values()
            u.h$e r0 = (p1042u.C118556h.C118561e) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x02d5:
            r1 = r0
            u.h$a r1 = (p1042u.C118556h.C118557a) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02e8
            java.lang.Object r1 = r1.next()
            android.view.View r1 = (android.view.View) r1
            r7.mo165181j(r14, r1)
            goto L_0x02d5
        L_0x02e8:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0304
            r0 = 0
            java.lang.Object r1 = r9.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            java.lang.Object r1 = r10.getOrDefault(r1, r0)
            android.view.View r1 = (android.view.View) r1
            r3 = r34
            r3.mo16823s(r15, r1)
            r27 = r1
            goto L_0x0306
        L_0x0304:
            r3 = r34
        L_0x0306:
            java.util.Collection r0 = r13.values()
            u.h$e r0 = (p1042u.C118556h.C118561e) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0310:
            r1 = r0
            u.h$a r1 = (p1042u.C118556h.C118557a) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0325
            java.lang.Object r1 = r1.next()
            android.view.View r1 = (android.view.View) r1
            r2 = r35
            r7.mo165181j(r2, r1)
            goto L_0x0310
        L_0x0325:
            r2 = r35
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x034e
            r0 = 0
            java.lang.Object r1 = r8.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            java.lang.Object r1 = r13.getOrDefault(r1, r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x034e
            android.view.ViewGroup r0 = r7.f338132a
            androidx.fragment.app.h r4 = new androidx.fragment.app.h
            r6 = r33
            r4.<init>(r7, r3, r1, r6)
            p849e3.C58525r.m67941a(r0, r4)
            r0 = r32
            r28 = 1
            goto L_0x0352
        L_0x034e:
            r6 = r33
            r0 = r32
        L_0x0352:
            r3.mo16825v(r15, r0, r14)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r3
            r17 = r15
            r22 = r15
            r23 = r2
            r16.mo16821q(r17, r18, r19, r20, r21, r22, r23)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r8 = r31
            r8.put(r11, r1)
            r12 = r38
            r8.put(r12, r1)
            r5 = r11
            r4 = r12
            goto L_0x0385
        L_0x0377:
            r24 = r0
            r30 = r8
            r0 = r10
            r8 = r13
            r6 = r14
            r36 = r16
            r37 = r17
            r14 = r2
            goto L_0x029d
        L_0x0385:
            r10 = r0
            r1 = r2
            r13 = r8
            r2 = r14
            r0 = r24
            r9 = r29
            r8 = r30
            r16 = r36
            r17 = r37
            r14 = r6
            r6 = r41
            goto L_0x0193
        L_0x0398:
            r24 = r0
            r30 = r8
            r29 = r9
            r0 = r10
            r8 = r13
            r6 = r14
            r36 = r16
            r37 = r17
            r14 = r2
            r2 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r37.iterator()
            r11 = r4
            r4 = 0
            r10 = 0
        L_0x03b3:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x04b1
            java.lang.Object r13 = r9.next()
            androidx.fragment.app.b$d r13 = (androidx.fragment.app.C112912b.C112916d) r13
            boolean r16 = r13.mo165187b()
            if (r16 == 0) goto L_0x03e3
            r41 = r9
            androidx.fragment.app.q0$d r9 = r13.f338013a
            r38 = r12
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r8.put(r9, r12)
            r13.mo165186a()
            r32 = r0
            r31 = r4
            r9 = r11
            r25 = r15
            r0 = r27
            r4 = r29
            r11 = r30
            r12 = 0
            goto L_0x049e
        L_0x03e3:
            r41 = r9
            r38 = r12
            java.lang.Object r9 = r13.f338015c
            java.lang.Object r9 = r3.mo16815g(r9)
            androidx.fragment.app.q0$d r12 = r13.f338013a
            if (r15 == 0) goto L_0x03f7
            if (r12 == r5) goto L_0x03f5
            if (r12 != r11) goto L_0x03f7
        L_0x03f5:
            r11 = 1
            goto L_0x03f8
        L_0x03f7:
            r11 = 0
        L_0x03f8:
            if (r9 != 0) goto L_0x0413
            if (r11 != 0) goto L_0x0404
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.put(r12, r9)
            r13.mo165186a()
        L_0x0404:
            r32 = r0
            r31 = r4
            r25 = r15
            r0 = r27
            r4 = r29
            r11 = r30
            r12 = 0
            goto L_0x049c
        L_0x0413:
            r25 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r31 = r4
            androidx.fragment.app.Fragment r4 = r12.f338144c
            android.view.View r4 = r4.mView
            r7.mo165181j(r15, r4)
            if (r11 == 0) goto L_0x042e
            if (r12 != r5) goto L_0x042b
            r15.removeAll(r14)
            goto L_0x042e
        L_0x042b:
            r15.removeAll(r2)
        L_0x042e:
            boolean r4 = r15.isEmpty()
            if (r4 == 0) goto L_0x043c
            r3.mo16811a(r9, r0)
            r32 = r0
            r11 = r30
            goto L_0x046e
        L_0x043c:
            r3.mo16812b(r9, r15)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r16 = r3
            r17 = r9
            r18 = r9
            r19 = r15
            r16.mo16821q(r17, r18, r19, r20, r21, r22, r23)
            androidx.fragment.app.q0$d$c r4 = r12.f338142a
            r11 = r30
            if (r4 != r11) goto L_0x046c
            androidx.fragment.app.Fragment r4 = r12.f338144c
            android.view.View r4 = r4.mView
            r3.mo16820p(r9, r4, r15)
            android.view.ViewGroup r4 = r7.f338132a
            r32 = r0
            androidx.fragment.app.i r0 = new androidx.fragment.app.i
            r0.<init>(r7, r15)
            p849e3.C58525r.m67941a(r4, r0)
            goto L_0x046e
        L_0x046c:
            r32 = r0
        L_0x046e:
            androidx.fragment.app.q0$d$c r0 = r12.f338142a
            r4 = r29
            if (r0 != r4) goto L_0x047f
            r1.addAll(r15)
            if (r28 == 0) goto L_0x047c
            r3.mo16822r(r9, r6)
        L_0x047c:
            r0 = r27
            goto L_0x0484
        L_0x047f:
            r0 = r27
            r3.mo16823s(r9, r0)
        L_0x0484:
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r8.put(r12, r15)
            boolean r12 = r13.f338016d
            if (r12 == 0) goto L_0x0493
            r12 = 0
            java.lang.Object r10 = r3.mo16817l(r10, r9, r12)
            goto L_0x049c
        L_0x0493:
            r13 = r31
            r12 = 0
            java.lang.Object r9 = r3.mo16817l(r13, r9, r12)
            r31 = r9
        L_0x049c:
            r9 = r38
        L_0x049e:
            r27 = r0
            r29 = r4
            r30 = r11
            r15 = r25
            r4 = r31
            r0 = r32
            r12 = r38
            r11 = r9
            r9 = r41
            goto L_0x03b3
        L_0x04b1:
            r13 = r4
            r38 = r12
            r11 = r30
            java.lang.Object r0 = r3.mo16816k(r10, r13, r15)
            java.util.Iterator r4 = r37.iterator()
        L_0x04be:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0512
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.b$d r6 = (androidx.fragment.app.C112912b.C112916d) r6
            boolean r9 = r6.mo165187b()
            if (r9 == 0) goto L_0x04d1
            goto L_0x04be
        L_0x04d1:
            java.lang.Object r9 = r6.f338015c
            androidx.fragment.app.q0$d r10 = r6.f338013a
            r12 = r38
            if (r15 == 0) goto L_0x04df
            if (r10 == r5) goto L_0x04dd
            if (r10 != r12) goto L_0x04df
        L_0x04dd:
            r13 = 1
            goto L_0x04e0
        L_0x04df:
            r13 = 0
        L_0x04e0:
            if (r9 != 0) goto L_0x04e4
            if (r13 == 0) goto L_0x050f
        L_0x04e4:
            android.view.ViewGroup r9 = r7.f338132a
            java.util.WeakHashMap<android.view.View, e3.a0> r13 = p849e3.C107207u.f320808a
            boolean r9 = p849e3.C107207u.C107211e.m145208c(r9)
            if (r9 != 0) goto L_0x0501
            r9 = 2
            boolean r13 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r9)
            if (r13 == 0) goto L_0x04fd
            android.view.ViewGroup r9 = r7.f338132a
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r10)
        L_0x04fd:
            r6.mo165186a()
            goto L_0x050f
        L_0x0501:
            androidx.fragment.app.q0$d r9 = r6.f338013a
            androidx.fragment.app.Fragment r9 = r9.f338144c
            a3.b r10 = r6.f338014b
            androidx.fragment.app.j r13 = new androidx.fragment.app.j
            r13.<init>(r7, r6)
            r3.mo16824t(r9, r0, r10, r13)
        L_0x050f:
            r38 = r12
            goto L_0x04be
        L_0x0512:
            android.view.ViewGroup r4 = r7.f338132a
            java.util.WeakHashMap<android.view.View, e3.a0> r5 = p849e3.C107207u.f320808a
            boolean r4 = p849e3.C107207u.C107211e.m145208c(r4)
            if (r4 != 0) goto L_0x051e
            goto L_0x0160
        L_0x051e:
            r4 = 4
            androidx.fragment.app.C112935j0.m154516k(r1, r4)
            java.util.ArrayList r20 = r3.mo165223m(r2)
            android.view.ViewGroup r4 = r7.f338132a
            r3.mo16813c(r4, r0)
            android.view.ViewGroup r0 = r7.f338132a
            r16 = r3
            r17 = r0
            r18 = r14
            r19 = r2
            r21 = r24
            r16.mo165224u(r17, r18, r19, r20, r21)
            r6 = 0
            androidx.fragment.app.C112935j0.m154516k(r1, r6)
            r3.mo16826w(r15, r14, r2)
        L_0x0541:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r9 = r8.containsValue(r0)
            android.view.ViewGroup r10 = r7.f338132a
            android.content.Context r12 = r10.getContext()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r26.iterator()
            r3 = 0
        L_0x0557:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x05f0
            java.lang.Object r0 = r14.next()
            r15 = r0
            androidx.fragment.app.b$b r15 = (androidx.fragment.app.C112912b.C112914b) r15
            boolean r0 = r15.mo165187b()
            if (r0 == 0) goto L_0x056e
            r15.mo165186a()
            goto L_0x0557
        L_0x056e:
            androidx.fragment.app.n$a r0 = r15.mo165185c(r12)
            if (r0 != 0) goto L_0x0578
            r15.mo165186a()
            goto L_0x0557
        L_0x0578:
            android.animation.Animator r5 = r0.f338122b
            if (r5 != 0) goto L_0x0580
            r13.add(r15)
            goto L_0x0557
        L_0x0580:
            androidx.fragment.app.q0$d r4 = r15.f338013a
            androidx.fragment.app.Fragment r0 = r4.f338144c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r2 = r8.get(r4)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x059e
            r1 = 2
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r2 == 0) goto L_0x059a
            java.util.Objects.toString(r0)
        L_0x059a:
            r15.mo165186a()
            goto L_0x0557
        L_0x059e:
            androidx.fragment.app.q0$d$c r1 = r4.f338142a
            if (r1 != r11) goto L_0x05a5
            r16 = 1
            goto L_0x05a7
        L_0x05a5:
            r16 = 0
        L_0x05a7:
            r3 = r36
            if (r16 == 0) goto L_0x05ae
            r3.remove(r4)
        L_0x05ae:
            android.view.View r2 = r0.mView
            r10.startViewTransition(r2)
            androidx.fragment.app.c r1 = new androidx.fragment.app.c
            r0 = r1
            r31 = r8
            r8 = r1
            r1 = r39
            r40 = r2
            r2 = r10
            r17 = r3
            r3 = r40
            r18 = r4
            r4 = r16
            r30 = r11
            r11 = r5
            r5 = r18
            r16 = 0
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.addListener(r8)
            r0 = r40
            r11.setTarget(r0)
            r11.start()
            a3.b r0 = r15.f338014b
            androidx.fragment.app.d r1 = new androidx.fragment.app.d
            r1.<init>(r7, r11)
            r0.mo164501b(r1)
            r36 = r17
            r11 = r30
            r8 = r31
            r3 = 1
            r6 = 0
            goto L_0x0557
        L_0x05f0:
            r17 = r36
            java.util.Iterator r0 = r13.iterator()
        L_0x05f6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x065f
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b$b r1 = (androidx.fragment.app.C112912b.C112914b) r1
            androidx.fragment.app.q0$d r2 = r1.f338013a
            androidx.fragment.app.Fragment r4 = r2.f338144c
            if (r9 == 0) goto L_0x0616
            r5 = 2
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
            if (r2 == 0) goto L_0x0612
            java.util.Objects.toString(r4)
        L_0x0612:
            r1.mo165186a()
            goto L_0x05f6
        L_0x0616:
            r5 = 2
            if (r3 == 0) goto L_0x0626
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
            if (r2 == 0) goto L_0x0622
            java.util.Objects.toString(r4)
        L_0x0622:
            r1.mo165186a()
            goto L_0x05f6
        L_0x0626:
            android.view.View r4 = r4.mView
            androidx.fragment.app.n$a r6 = r1.mo165185c(r12)
            r6.getClass()
            android.view.animation.Animation r6 = r6.f338121a
            r6.getClass()
            androidx.fragment.app.q0$d$c r2 = r2.f338142a
            androidx.fragment.app.q0$d$c r8 = androidx.fragment.app.C112950q0.C112954d.C112957c.REMOVED
            if (r2 == r8) goto L_0x0641
            r4.startAnimation(r6)
            r1.mo165186a()
            goto L_0x0654
        L_0x0641:
            r10.startViewTransition(r4)
            androidx.fragment.app.n$b r2 = new androidx.fragment.app.n$b
            r2.<init>(r6, r10, r4)
            androidx.fragment.app.e r6 = new androidx.fragment.app.e
            r6.<init>(r7, r10, r4, r1)
            r2.setAnimationListener(r6)
            r4.startAnimation(r2)
        L_0x0654:
            a3.b r2 = r1.f338014b
            androidx.fragment.app.f r6 = new androidx.fragment.app.f
            r6.<init>(r7, r4, r10, r1)
            r2.mo164501b(r6)
            goto L_0x05f6
        L_0x065f:
            java.util.Iterator r0 = r17.iterator()
        L_0x0663:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0679
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.q0$d r1 = (androidx.fragment.app.C112950q0.C112954d) r1
            androidx.fragment.app.Fragment r2 = r1.f338144c
            android.view.View r2 = r2.mView
            androidx.fragment.app.q0$d$c r1 = r1.f338142a
            r1.mo165245a(r2)
            goto L_0x0663
        L_0x0679:
            r17.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C112912b.mo165180b(java.util.List, boolean):void");
    }

    /* renamed from: j */
    public void mo165181j(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo165181j(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: k */
    public void mo165182k(Map<String, View> map, View view) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        String k = C107207u.C107213g.m145226k(view);
        if (k != null) {
            map.put(k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo165182k(map, childAt);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo165183l(C111055b<String, View> bVar, Collection<String> collection) {
        Iterator it = ((C118556h.C118558b) bVar.entrySet()).iterator();
        while (true) {
            C118556h.C118560d dVar = (C118556h.C118560d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (!collection.contains(C107207u.C107213g.m145226k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }
}
