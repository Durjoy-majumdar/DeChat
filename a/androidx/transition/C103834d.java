package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.C0966R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p1042u.C111055b;
import p849e3.C107168a0;
import p849e3.C107207u;
import p853i4.C60244h;

/* renamed from: androidx.transition.d */
public class C103834d {

    /* renamed from: a */
    public static Transition f306776a = new AutoTransition();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C111055b<ViewGroup, ArrayList<Transition>>>> f306777b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f306778c = new ArrayList<>();

    /* renamed from: androidx.transition.d$a */
    public static class C103835a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: d */
        public Transition f306779d;

        /* renamed from: e */
        public ViewGroup f306780e;

        /* renamed from: androidx.transition.d$a$a */
        public class C103836a extends C67095c {

            /* renamed from: d */
            public final /* synthetic */ C111055b f306781d;

            public C103836a(C111055b bVar) {
                this.f306781d = bVar;
            }

            /* renamed from: b */
            public void mo77557b(Transition transition) {
                ((ArrayList) this.f306781d.getOrDefault(C103835a.this.f306780e, null)).remove(transition);
            }
        }

        public C103835a(Transition transition, ViewGroup viewGroup) {
            this.f306779d = transition;
            this.f306780e = viewGroup;
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x021c  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0248  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x01f6 A[EDGE_INSN: B:140:0x01f6->B:93:0x01f6 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01fb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r18 = this;
                r0 = r18
                android.view.ViewGroup r1 = r0.f306780e
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f306780e
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = androidx.transition.C103834d.f306778c
                android.view.ViewGroup r2 = r0.f306780e
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                u.b r1 = androidx.transition.C103834d.m138408b()
                android.view.ViewGroup r3 = r0.f306780e
                r4 = 0
                java.lang.Object r3 = r1.getOrDefault(r3, r4)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f306780e
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                androidx.transition.Transition r6 = r0.f306779d
                r3.add(r6)
                androidx.transition.Transition r3 = r0.f306779d
                androidx.transition.d$a$a r6 = new androidx.transition.d$a$a
                r6.<init>(r1)
                r3.mo145324a(r6)
                androidx.transition.Transition r1 = r0.f306779d
                android.view.ViewGroup r3 = r0.f306780e
                r6 = 0
                r1.mo145332l(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                androidx.transition.Transition r3 = (androidx.transition.Transition) r3
                android.view.ViewGroup r5 = r0.f306780e
                r3.mo145312F(r5)
                goto L_0x0060
            L_0x0072:
                androidx.transition.Transition r1 = r0.f306779d
                android.view.ViewGroup r8 = r0.f306780e
                r1.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f306728v = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f306729w = r3
                i4.p r3 = r1.f306724r
                i4.p r5 = r1.f306725s
                u.b r7 = new u.b
                u.b<android.view.View, i4.o> r9 = r3.f324394a
                r7.<init>((p1042u.C111059i) r9)
                u.b r9 = new u.b
                u.b<android.view.View, i4.o> r10 = r5.f324394a
                r9.<init>((p1042u.C111059i) r10)
                r10 = 0
            L_0x009a:
                int[] r11 = r1.f306727u
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01f6
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01b4
                r12 = 2
                if (r11 == r12) goto L_0x0166
                r12 = 3
                if (r11 == r12) goto L_0x0112
                r12 = 4
                if (r11 == r12) goto L_0x00af
            L_0x00ac:
                r17 = r3
                goto L_0x010e
            L_0x00af:
                u.f<android.view.View> r11 = r3.f324396c
                u.f<android.view.View> r12 = r5.f324396c
                int r13 = r11.mo162757f()
                r14 = 0
            L_0x00b8:
                if (r14 >= r13) goto L_0x00ac
                java.lang.Object r15 = r11.mo162758g(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x0104
                boolean r16 = r1.mo145344z(r15)
                if (r16 == 0) goto L_0x0104
                boolean r6 = r11.f332573d
                if (r6 == 0) goto L_0x00cf
                r11.mo162752c()
            L_0x00cf:
                long[] r6 = r11.f332574e
                r17 = r3
                r2 = r6[r14]
                java.lang.Object r2 = r12.mo162755d(r2, r4)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x0106
                boolean r3 = r1.mo145344z(r2)
                if (r3 == 0) goto L_0x0106
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                i4.o r3 = (p853i4.C108353o) r3
                java.lang.Object r6 = r9.getOrDefault(r2, r4)
                i4.o r6 = (p853i4.C108353o) r6
                if (r3 == 0) goto L_0x0106
                if (r6 == 0) goto L_0x0106
                java.util.ArrayList<i4.o> r4 = r1.f306728v
                r4.add(r3)
                java.util.ArrayList<i4.o> r3 = r1.f306729w
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x0106
            L_0x0104:
                r17 = r3
            L_0x0106:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00b8
            L_0x010e:
                r2 = r17
                goto L_0x01ec
            L_0x0112:
                r2 = r3
                android.util.SparseArray<android.view.View> r3 = r2.f324395b
                android.util.SparseArray<android.view.View> r4 = r5.f324395b
                int r6 = r3.size()
                r11 = 0
            L_0x011c:
                if (r11 >= r6) goto L_0x01ec
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x0161
                boolean r13 = r1.mo145344z(r12)
                if (r13 == 0) goto L_0x0161
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x0161
                boolean r14 = r1.mo145344z(r13)
                if (r14 == 0) goto L_0x0161
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                i4.o r15 = (p853i4.C108353o) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                i4.o r14 = (p853i4.C108353o) r14
                if (r15 == 0) goto L_0x0161
                if (r14 == 0) goto L_0x0161
                java.util.ArrayList<i4.o> r0 = r1.f306728v
                r0.add(r15)
                java.util.ArrayList<i4.o> r0 = r1.f306729w
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x0161:
                int r11 = r11 + 1
                r0 = r18
                goto L_0x011c
            L_0x0166:
                r2 = r3
                u.b<java.lang.String, android.view.View> r0 = r2.f324397d
                u.b<java.lang.String, android.view.View> r3 = r5.f324397d
                int r4 = r0.f332583f
                r6 = 0
            L_0x016e:
                if (r6 >= r4) goto L_0x01ec
                java.lang.Object r11 = r0.mo162791l(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01b1
                boolean r12 = r1.mo145344z(r11)
                if (r12 == 0) goto L_0x01b1
                java.lang.Object r12 = r0.mo162789j(r6)
                r13 = 0
                java.lang.Object r12 = r3.getOrDefault(r12, r13)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01b1
                boolean r14 = r1.mo145344z(r12)
                if (r14 == 0) goto L_0x01b1
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                i4.o r14 = (p853i4.C108353o) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                i4.o r15 = (p853i4.C108353o) r15
                if (r14 == 0) goto L_0x01b1
                if (r15 == 0) goto L_0x01b1
                java.util.ArrayList<i4.o> r13 = r1.f306728v
                r13.add(r14)
                java.util.ArrayList<i4.o> r13 = r1.f306729w
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01b1:
                int r6 = r6 + 1
                goto L_0x016e
            L_0x01b4:
                r2 = r3
                int r0 = r7.f332583f
            L_0x01b7:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01ec
                java.lang.Object r3 = r7.mo162789j(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01b7
                boolean r4 = r1.mo145344z(r3)
                if (r4 == 0) goto L_0x01b7
                java.lang.Object r3 = r9.remove(r3)
                i4.o r3 = (p853i4.C108353o) r3
                if (r3 == 0) goto L_0x01b7
                android.view.View r4 = r3.f324392b
                if (r4 == 0) goto L_0x01b7
                boolean r4 = r1.mo145344z(r4)
                if (r4 == 0) goto L_0x01b7
                java.lang.Object r4 = r7.mo162790k(r0)
                i4.o r4 = (p853i4.C108353o) r4
                java.util.ArrayList<i4.o> r6 = r1.f306728v
                r6.add(r4)
                java.util.ArrayList<i4.o> r4 = r1.f306729w
                r4.add(r3)
                goto L_0x01b7
            L_0x01ec:
                int r10 = r10 + 1
                r0 = r18
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009a
            L_0x01f6:
                r0 = 0
            L_0x01f7:
                int r2 = r7.f332583f
                if (r0 >= r2) goto L_0x0217
                java.lang.Object r2 = r7.mo162791l(r0)
                i4.o r2 = (p853i4.C108353o) r2
                android.view.View r3 = r2.f324392b
                boolean r3 = r1.mo145344z(r3)
                if (r3 == 0) goto L_0x0214
                java.util.ArrayList<i4.o> r3 = r1.f306728v
                r3.add(r2)
                java.util.ArrayList<i4.o> r2 = r1.f306729w
                r3 = 0
                r2.add(r3)
            L_0x0214:
                int r0 = r0 + 1
                goto L_0x01f7
            L_0x0217:
                r0 = 0
            L_0x0218:
                int r2 = r9.f332583f
                if (r0 >= r2) goto L_0x0238
                java.lang.Object r2 = r9.mo162791l(r0)
                i4.o r2 = (p853i4.C108353o) r2
                android.view.View r3 = r2.f324392b
                boolean r3 = r1.mo145344z(r3)
                if (r3 == 0) goto L_0x0235
                java.util.ArrayList<i4.o> r3 = r1.f306729w
                r3.add(r2)
                java.util.ArrayList<i4.o> r2 = r1.f306728v
                r3 = 0
                r2.add(r3)
            L_0x0235:
                int r0 = r0 + 1
                goto L_0x0218
            L_0x0238:
                u.b r0 = androidx.transition.Transition.m138289v()
                int r2 = r0.f332583f
                i4.z r3 = p853i4.C108360v.f324401a
                android.view.WindowId r3 = r8.getWindowId()
                r4 = 1
                int r2 = r2 - r4
            L_0x0246:
                if (r2 < 0) goto L_0x02a7
                java.lang.Object r4 = r0.mo162789j(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                r5 = 0
                if (r4 == 0) goto L_0x02a4
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                androidx.transition.Transition$b r6 = (androidx.transition.Transition.C103822b) r6
                if (r6 == 0) goto L_0x02a4
                android.view.View r7 = r6.f306733a
                if (r7 == 0) goto L_0x02a4
                i4.d0 r7 = r6.f306736d
                boolean r9 = r7 instanceof p853i4.C108340c0
                if (r9 == 0) goto L_0x026f
                i4.c0 r7 = (p853i4.C108340c0) r7
                android.view.WindowId r7 = r7.f324369a
                boolean r7 = r7.equals(r3)
                if (r7 == 0) goto L_0x026f
                r7 = 1
                goto L_0x0270
            L_0x026f:
                r7 = 0
            L_0x0270:
                if (r7 == 0) goto L_0x02a4
                i4.o r7 = r6.f306735c
                android.view.View r9 = r6.f306733a
                r10 = 1
                i4.o r11 = r1.mo145342x(r9, r10)
                i4.o r9 = r1.mo145341u(r9, r10)
                if (r11 != 0) goto L_0x0283
                if (r9 == 0) goto L_0x028d
            L_0x0283:
                androidx.transition.Transition r6 = r6.f306737e
                boolean r6 = r6.mo145343y(r7, r9)
                if (r6 == 0) goto L_0x028d
                r6 = 1
                goto L_0x028e
            L_0x028d:
                r6 = 0
            L_0x028e:
                if (r6 == 0) goto L_0x02a4
                boolean r6 = r4.isRunning()
                if (r6 != 0) goto L_0x02a1
                boolean r6 = r4.isStarted()
                if (r6 == 0) goto L_0x029d
                goto L_0x02a1
            L_0x029d:
                r0.remove(r4)
                goto L_0x02a4
            L_0x02a1:
                r4.cancel()
            L_0x02a4:
                int r2 = r2 + -1
                goto L_0x0246
            L_0x02a7:
                i4.p r9 = r1.f306724r
                i4.p r10 = r1.f306725s
                java.util.ArrayList<i4.o> r11 = r1.f306728v
                java.util.ArrayList<i4.o> r12 = r1.f306729w
                r7 = r1
                r7.mo145335p(r8, r9, r10, r11, r12)
                r1.mo145313G()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C103834d.C103835a.onPreDraw():boolean");
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f306780e.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f306780e.removeOnAttachStateChangeListener(this);
            C103834d.f306778c.remove(this.f306780e);
            ArrayList orDefault = C103834d.m138408b().getOrDefault(this.f306780e, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo145312F(this.f306780e);
                }
            }
            this.f306779d.mo145333m(true);
        }
    }

    /* renamed from: a */
    public static void m138407a(ViewGroup viewGroup, Transition transition) {
        if (!f306778c.contains(viewGroup)) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145208c(viewGroup)) {
                f306778c.add(viewGroup);
                if (transition == null) {
                    transition = f306776a;
                }
                Transition n = transition.clone();
                m138410d(viewGroup, n);
                viewGroup.setTag(C0966R.C0970id.ktq, (Object) null);
                if (n != null) {
                    C103835a aVar = new C103835a(n, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(aVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                }
            }
        }
    }

    /* renamed from: b */
    public static C111055b<ViewGroup, ArrayList<Transition>> m138408b() {
        C111055b<ViewGroup, ArrayList<Transition>> bVar;
        WeakReference weakReference = f306777b.get();
        if (weakReference != null && (bVar = (C111055b) weakReference.get()) != null) {
            return bVar;
        }
        C111055b<ViewGroup, ArrayList<Transition>> bVar2 = new C111055b<>();
        f306777b.set(new WeakReference(bVar2));
        return bVar2;
    }

    /* renamed from: c */
    public static void m138409c(C60244h hVar, Transition transition) {
        ViewGroup viewGroup = hVar.f171770c;
        if (f306778c.contains(viewGroup)) {
            return;
        }
        if (transition == null) {
            hVar.mo85230a();
            return;
        }
        f306778c.add(viewGroup);
        Transition n = transition.clone();
        n.mo145320O(viewGroup);
        C60244h hVar2 = (C60244h) viewGroup.getTag(C0966R.C0970id.ktq);
        if (hVar2 != null) {
            if (hVar2.f171769b > 0) {
                n.mo145314H(true);
            }
        }
        m138410d(viewGroup, n);
        hVar.mo85230a();
        C103835a aVar = new C103835a(n, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: d */
    public static void m138410d(ViewGroup viewGroup, Transition transition) {
        Runnable runnable;
        ArrayList orDefault = m138408b().getOrDefault(viewGroup, null);
        if (orDefault != null && orDefault.size() > 0) {
            Iterator it = orDefault.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo145309B(viewGroup);
            }
        }
        if (transition != null) {
            transition.mo145332l(viewGroup, true);
        }
        C60244h hVar = (C60244h) viewGroup.getTag(C0966R.C0970id.ktq);
        if (hVar != null && ((C60244h) hVar.f171770c.getTag(C0966R.C0970id.ktq)) == hVar && (runnable = hVar.f171773f) != null) {
            runnable.run();
        }
    }
}
