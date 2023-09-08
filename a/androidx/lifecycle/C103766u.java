package androidx.lifecycle;

import androidx.lifecycle.C39623j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p1135n.C109659a;
import p1135n.C109660b;
import p856m.C61417a;

/* renamed from: androidx.lifecycle.u */
public class C103766u extends C39623j {

    /* renamed from: a */
    public C109659a<C0124r, C103767a> f306530a = new C109659a<>();

    /* renamed from: b */
    public C39623j.C39626c f306531b;

    /* renamed from: c */
    public final WeakReference<C0125s> f306532c;

    /* renamed from: d */
    public int f306533d = 0;

    /* renamed from: e */
    public boolean f306534e = false;

    /* renamed from: f */
    public boolean f306535f = false;

    /* renamed from: g */
    public ArrayList<C39623j.C39626c> f306536g = new ArrayList<>();

    /* renamed from: h */
    public final boolean f306537h;

    /* renamed from: androidx.lifecycle.u$a */
    public static class C103767a {

        /* renamed from: a */
        public C39623j.C39626c f306538a;

        /* renamed from: b */
        public C103764p f306539b;

        public C103767a(C0124r rVar, C39623j.C39626c cVar) {
            C103764p pVar;
            Map<Class<?>, Integer> map = C103768w.f306540a;
            boolean z = rVar instanceof C103764p;
            boolean z2 = rVar instanceof C103761g;
            if (z && z2) {
                pVar = new FullLifecycleObserverAdapter((C103761g) rVar, (C103764p) rVar);
            } else if (z2) {
                pVar = new FullLifecycleObserverAdapter((C103761g) rVar, (C103764p) null);
            } else if (z) {
                pVar = (C103764p) rVar;
            } else {
                Class<?> cls = rVar.getClass();
                if (C103768w.m138180c(cls) == 2) {
                    List list = (List) ((HashMap) C103768w.f306541b).get(cls);
                    if (list.size() == 1) {
                        pVar = new SingleGeneratedAdapterObserver(C103768w.m138178a((Constructor) list.get(0), rVar));
                    } else {
                        C103763h[] hVarArr = new C103763h[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            hVarArr[i] = C103768w.m138178a((Constructor) list.get(i), rVar);
                        }
                        pVar = new CompositeGeneratedAdaptersObserver(hVarArr);
                    }
                } else {
                    pVar = new ReflectiveGenericLifecycleObserver(rVar);
                }
            }
            this.f306539b = pVar;
            this.f306538a = cVar;
        }

        /* renamed from: a */
        public void mo145140a(C0125s sVar, C39623j.C39625b bVar) {
            C39623j.C39626c a = bVar.mo62186a();
            C39623j.C39626c cVar = this.f306538a;
            if (a != null && a.compareTo(cVar) < 0) {
                cVar = a;
            }
            this.f306538a = cVar;
            this.f306539b.mo104k4(sVar, bVar);
            this.f306538a = a;
        }
    }

    public C103766u(C0125s sVar) {
        this.f306532c = new WeakReference<>(sVar);
        this.f306531b = C39623j.C39626c.INITIALIZED;
        this.f306537h = true;
    }

    /* renamed from: a */
    public final C39623j.C39626c mo145133a(C0124r rVar) {
        C109659a<C0124r, C103767a> aVar = this.f306530a;
        C39623j.C39626c cVar = null;
        C109660b.C109663c<K, V> cVar2 = aVar.f328278h.containsKey(rVar) ? aVar.f328278h.get(rVar).f328286g : null;
        C39623j.C39626c cVar3 = cVar2 != null ? ((C103767a) cVar2.f328284e).f306538a : null;
        if (!this.f306536g.isEmpty()) {
            ArrayList<C39623j.C39626c> arrayList = this.f306536g;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        C39623j.C39626c cVar4 = this.f306531b;
        if (cVar3 == null || cVar3.compareTo(cVar4) >= 0) {
            cVar3 = cVar4;
        }
        return (cVar == null || cVar.compareTo(cVar3) >= 0) ? cVar3 : cVar;
    }

    public void addObserver(C0124r rVar) {
        C0125s sVar;
        mo145134b("addObserver");
        C39623j.C39626c cVar = this.f306531b;
        C39623j.C39626c cVar2 = C39623j.C39626c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = C39623j.C39626c.INITIALIZED;
        }
        C103767a aVar = new C103767a(rVar, cVar2);
        if (this.f306530a.mo160872h(rVar, aVar) == null && (sVar = this.f306532c.get()) != null) {
            boolean z = this.f306533d != 0 || this.f306534e;
            C39623j.C39626c a = mo145133a(rVar);
            this.f306533d++;
            while (aVar.f306538a.compareTo(a) < 0 && this.f306530a.f328278h.containsKey(rVar)) {
                this.f306536g.add(aVar.f306538a);
                int i = C39623j.C39624a.f106385a[aVar.f306538a.ordinal()];
                C39623j.C39625b bVar = i != 1 ? i != 2 ? i != 5 ? null : C39623j.C39625b.ON_CREATE : C39623j.C39625b.ON_RESUME : C39623j.C39625b.ON_START;
                if (bVar != null) {
                    aVar.mo145140a(sVar, bVar);
                    ArrayList<C39623j.C39626c> arrayList = this.f306536g;
                    arrayList.remove(arrayList.size() - 1);
                    a = mo145133a(rVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f306538a);
                }
            }
            if (!z) {
                mo145139g();
            }
            this.f306533d--;
        }
    }

    /* renamed from: b */
    public final void mo145134b(String str) {
        if (this.f306537h && !C61417a.m72117a().mo86363b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: c */
    public void mo145135c(C39623j.C39625b bVar) {
        mo145134b("handleLifecycleEvent");
        mo145137e(bVar.mo62186a());
    }

    @Deprecated
    /* renamed from: d */
    public void mo145136d(C39623j.C39626c cVar) {
        mo145134b("markState");
        mo145138f(cVar);
    }

    /* renamed from: e */
    public final void mo145137e(C39623j.C39626c cVar) {
        if (this.f306531b != cVar) {
            this.f306531b = cVar;
            if (this.f306534e || this.f306533d != 0) {
                this.f306535f = true;
                return;
            }
            this.f306534e = true;
            mo145139g();
            this.f306534e = false;
        }
    }

    /* renamed from: f */
    public void mo145138f(C39623j.C39626c cVar) {
        mo145134b("setCurrentState");
        mo145137e(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r2 = ((androidx.lifecycle.C103766u.C103767a) r1.f328279d.f328284e).f306538a;
        r5 = ((androidx.lifecycle.C103766u.C103767a) r1.f328280e.f328284e).f306538a;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo145139g() {
        /*
            r10 = this;
            java.lang.ref.WeakReference<androidx.lifecycle.s> r0 = r10.f306532c
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.s r0 = (androidx.lifecycle.C0125s) r0
            if (r0 == 0) goto L_0x017e
        L_0x000a:
            n.a<androidx.lifecycle.r, androidx.lifecycle.u$a> r1 = r10.f306530a
            int r2 = r1.f328282g
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0013
            goto L_0x0029
        L_0x0013:
            n.b$c<K, V> r2 = r1.f328279d
            V r2 = r2.f328284e
            androidx.lifecycle.u$a r2 = (androidx.lifecycle.C103766u.C103767a) r2
            androidx.lifecycle.j$c r2 = r2.f306538a
            n.b$c<K, V> r5 = r1.f328280e
            V r5 = r5.f328284e
            androidx.lifecycle.u$a r5 = (androidx.lifecycle.C103766u.C103767a) r5
            androidx.lifecycle.j$c r5 = r5.f306538a
            if (r2 != r5) goto L_0x002b
            androidx.lifecycle.j$c r2 = r10.f306531b
            if (r2 != r5) goto L_0x002b
        L_0x0029:
            r2 = 1
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            if (r2 != 0) goto L_0x017b
            r10.f306535f = r3
            androidx.lifecycle.j$c r2 = r10.f306531b
            n.b$c<K, V> r1 = r1.f328279d
            V r1 = r1.f328284e
            androidx.lifecycle.u$a r1 = (androidx.lifecycle.C103766u.C103767a) r1
            androidx.lifecycle.j$c r1 = r1.f306538a
            int r1 = r2.compareTo(r1)
            r2 = 0
            r3 = 2
            if (r1 >= 0) goto L_0x00d4
            n.a<androidx.lifecycle.r, androidx.lifecycle.u$a> r1 = r10.f306530a
            n.b$b r5 = new n.b$b
            n.b$c<K, V> r6 = r1.f328280e
            n.b$c<K, V> r7 = r1.f328279d
            r5.<init>(r6, r7)
            java.util.WeakHashMap<n.b$f<K, V>, java.lang.Boolean> r1 = r1.f328281f
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r1.put(r5, r6)
        L_0x0054:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00d4
            boolean r1 = r10.f306535f
            if (r1 != 0) goto L_0x00d4
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r6 = r1.getValue()
            androidx.lifecycle.u$a r6 = (androidx.lifecycle.C103766u.C103767a) r6
        L_0x006a:
            androidx.lifecycle.j$c r7 = r6.f306538a
            androidx.lifecycle.j$c r8 = r10.f306531b
            int r7 = r7.compareTo(r8)
            if (r7 <= 0) goto L_0x0054
            boolean r7 = r10.f306535f
            if (r7 != 0) goto L_0x0054
            n.a<androidx.lifecycle.r, androidx.lifecycle.u$a> r7 = r10.f306530a
            java.lang.Object r8 = r1.getKey()
            java.util.HashMap<K, n.b$c<K, V>> r7 = r7.f328278h
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L_0x0054
            androidx.lifecycle.j$c r7 = r6.f306538a
            int[] r8 = androidx.lifecycle.C39623j.C39624a.f106385a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L_0x009f
            if (r7 == r3) goto L_0x009c
            r8 = 3
            if (r7 == r8) goto L_0x0099
            r7 = r2
            goto L_0x00a1
        L_0x0099:
            androidx.lifecycle.j$b r7 = androidx.lifecycle.C39623j.C39625b.ON_PAUSE
            goto L_0x00a1
        L_0x009c:
            androidx.lifecycle.j$b r7 = androidx.lifecycle.C39623j.C39625b.ON_STOP
            goto L_0x00a1
        L_0x009f:
            androidx.lifecycle.j$b r7 = androidx.lifecycle.C39623j.C39625b.ON_DESTROY
        L_0x00a1:
            if (r7 == 0) goto L_0x00bb
            androidx.lifecycle.j$c r8 = r7.mo62186a()
            java.util.ArrayList<androidx.lifecycle.j$c> r9 = r10.f306536g
            r9.add(r8)
            r6.mo145140a(r0, r7)
            java.util.ArrayList<androidx.lifecycle.j$c> r7 = r10.f306536g
            int r8 = r7.size()
            int r8 = r8 + -1
            r7.remove(r8)
            goto L_0x006a
        L_0x00bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no event down from "
            r1.append(r2)
            androidx.lifecycle.j$c r2 = r6.f306538a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d4:
            n.a<androidx.lifecycle.r, androidx.lifecycle.u$a> r1 = r10.f306530a
            n.b$c<K, V> r1 = r1.f328280e
            boolean r5 = r10.f306535f
            if (r5 != 0) goto L_0x000a
            if (r1 == 0) goto L_0x000a
            androidx.lifecycle.j$c r5 = r10.f306531b
            V r1 = r1.f328284e
            androidx.lifecycle.u$a r1 = (androidx.lifecycle.C103766u.C103767a) r1
            androidx.lifecycle.j$c r1 = r1.f306538a
            int r1 = r5.compareTo(r1)
            if (r1 <= 0) goto L_0x000a
            n.a<androidx.lifecycle.r, androidx.lifecycle.u$a> r1 = r10.f306530a
            r1.getClass()
            n.b$d r5 = new n.b$d
            r5.<init>()
            java.util.WeakHashMap<n.b$f<K, V>, java.lang.Boolean> r1 = r1.f328281f
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r1.put(r5, r6)
        L_0x00fd:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x000a
            boolean r1 = r10.f306535f
            if (r1 != 0) goto L_0x000a
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r6 = r1.getValue()
            androidx.lifecycle.u$a r6 = (androidx.lifecycle.C103766u.C103767a) r6
        L_0x0113:
            androidx.lifecycle.j$c r7 = r6.f306538a
            androidx.lifecycle.j$c r8 = r10.f306531b
            int r7 = r7.compareTo(r8)
            if (r7 >= 0) goto L_0x00fd
            boolean r7 = r10.f306535f
            if (r7 != 0) goto L_0x00fd
            n.a<androidx.lifecycle.r, androidx.lifecycle.u$a> r7 = r10.f306530a
            java.lang.Object r8 = r1.getKey()
            java.util.HashMap<K, n.b$c<K, V>> r7 = r7.f328278h
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L_0x00fd
            androidx.lifecycle.j$c r7 = r6.f306538a
            java.util.ArrayList<androidx.lifecycle.j$c> r8 = r10.f306536g
            r8.add(r7)
            androidx.lifecycle.j$c r7 = r6.f306538a
            int[] r8 = androidx.lifecycle.C39623j.C39624a.f106385a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L_0x014f
            if (r7 == r3) goto L_0x014c
            r8 = 5
            if (r7 == r8) goto L_0x0149
            r7 = r2
            goto L_0x0151
        L_0x0149:
            androidx.lifecycle.j$b r7 = androidx.lifecycle.C39623j.C39625b.ON_CREATE
            goto L_0x0151
        L_0x014c:
            androidx.lifecycle.j$b r7 = androidx.lifecycle.C39623j.C39625b.ON_RESUME
            goto L_0x0151
        L_0x014f:
            androidx.lifecycle.j$b r7 = androidx.lifecycle.C39623j.C39625b.ON_START
        L_0x0151:
            if (r7 == 0) goto L_0x0162
            r6.mo145140a(r0, r7)
            java.util.ArrayList<androidx.lifecycle.j$c> r7 = r10.f306536g
            int r8 = r7.size()
            int r8 = r8 + -1
            r7.remove(r8)
            goto L_0x0113
        L_0x0162:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no event up from "
            r1.append(r2)
            androidx.lifecycle.j$c r2 = r6.f306538a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x017b:
            r10.f306535f = r3
            return
        L_0x017e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C103766u.mo145139g():void");
    }

    public C39623j.C39626c getCurrentState() {
        return this.f306531b;
    }

    public void removeObserver(C0124r rVar) {
        mo145134b("removeObserver");
        this.f306530a.mo160873i(rVar);
    }
}
