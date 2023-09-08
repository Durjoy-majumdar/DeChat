package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C113742fx.C113743a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.tencent.mapsdk.internal.fx */
public final class C113742fx<T extends C113743a> {

    /* renamed from: c */
    private static final int f340308c = 50;

    /* renamed from: e */
    private static final int f340309e = 40;

    /* renamed from: a */
    private final C113731fn f340310a;

    /* renamed from: b */
    private final int f340311b;

    /* renamed from: d */
    private Set<T> f340312d;

    /* renamed from: f */
    private List<C113742fx<T>> f340313f;

    /* renamed from: com.tencent.mapsdk.internal.fx$a */
    public interface C113743a {
        /* renamed from: a */
        C113732fo mo171874a();
    }

    private C113742fx(double d, double d2, double d3, double d4) {
        this(new C113731fn(d, d2, d3, d4));
    }

    /* renamed from: b */
    private boolean m156907b(T t) {
        C113732fo a = t.mo171874a();
        if (!this.f340310a.mo172081a(a.f340215a, a.f340216b)) {
            return false;
        }
        double d = a.f340215a;
        double d2 = a.f340216b;
        C113742fx fxVar = this;
        while (true) {
            List<C113742fx<T>> list = fxVar.f340313f;
            if (list == null) {
                break;
            }
            C113731fn fnVar = fxVar.f340310a;
            if (d2 < fnVar.f340214f) {
                if (d < fnVar.f340213e) {
                    fxVar = list.get(0);
                } else {
                    fxVar = list.get(1);
                }
            } else if (d < fnVar.f340213e) {
                fxVar = list.get(2);
            } else {
                fxVar = list.get(3);
            }
        }
        Set<T> set = fxVar.f340312d;
        if (set == null) {
            return false;
        }
        return set.remove(t);
    }

    /* renamed from: a */
    public final void mo172117a(T t) {
        C113732fo a = t.mo171874a();
        if (this.f340310a.mo172081a(a.f340215a, a.f340216b)) {
            m156903a(a.f340215a, a.f340216b, t);
        }
    }

    public C113742fx(C113731fn fnVar) {
        this(fnVar, 0);
    }

    private C113742fx(double d, double d2, double d3, double d4, int i) {
        this(new C113731fn(d, d2, d3, d4), i);
    }

    private C113742fx(C113731fn fnVar, int i) {
        this.f340313f = null;
        this.f340310a = fnVar;
        this.f340311b = i;
    }

    /* renamed from: a */
    private void m156903a(double d, double d2, T t) {
        C113742fx fxVar = this;
        while (true) {
            List<C113742fx<T>> list = fxVar.f340313f;
            if (list == null) {
                break;
            }
            C113731fn fnVar = fxVar.f340310a;
            if (d2 < fnVar.f340214f) {
                if (d < fnVar.f340213e) {
                    fxVar = list.get(0);
                } else {
                    fxVar = list.get(1);
                }
            } else if (d < fnVar.f340213e) {
                fxVar = list.get(2);
            } else {
                fxVar = list.get(3);
            }
        }
        if (fxVar.f340312d == null) {
            fxVar.f340312d = new HashSet();
        }
        fxVar.f340312d.add(t);
        if (fxVar.f340312d.size() > 50 && fxVar.f340311b < 40) {
            fxVar.m156902a();
        }
    }

    /* renamed from: b */
    private boolean m156906b(double d, double d2, T t) {
        C113742fx fxVar = this;
        while (true) {
            List<C113742fx<T>> list = fxVar.f340313f;
            if (list == null) {
                break;
            }
            C113731fn fnVar = fxVar.f340310a;
            if (d2 < fnVar.f340214f) {
                if (d < fnVar.f340213e) {
                    fxVar = list.get(0);
                } else {
                    fxVar = list.get(1);
                }
            } else if (d < fnVar.f340213e) {
                fxVar = list.get(2);
            } else {
                fxVar = list.get(3);
            }
        }
        Set<T> set = fxVar.f340312d;
        if (set == null) {
            return false;
        }
        return set.remove(t);
    }

    /* renamed from: a */
    private void m156902a() {
        ArrayList arrayList = new ArrayList(4);
        this.f340313f = arrayList;
        C113731fn fnVar = this.f340310a;
        arrayList.add(new C113742fx(fnVar.f340209a, fnVar.f340213e, fnVar.f340210b, fnVar.f340214f, this.f340311b + 1));
        List<C113742fx<T>> list = this.f340313f;
        C113731fn fnVar2 = this.f340310a;
        list.add(new C113742fx(fnVar2.f340213e, fnVar2.f340211c, fnVar2.f340210b, fnVar2.f340214f, this.f340311b + 1));
        List<C113742fx<T>> list2 = this.f340313f;
        C113731fn fnVar3 = this.f340310a;
        list2.add(new C113742fx(fnVar3.f340209a, fnVar3.f340213e, fnVar3.f340214f, fnVar3.f340212d, this.f340311b + 1));
        List<C113742fx<T>> list3 = this.f340313f;
        C113731fn fnVar4 = this.f340310a;
        list3.add(new C113742fx(fnVar4.f340213e, fnVar4.f340211c, fnVar4.f340214f, fnVar4.f340212d, this.f340311b + 1));
        Set<T> set = this.f340312d;
        this.f340312d = null;
        for (T t : set) {
            m156903a(t.mo171874a().f340215a, t.mo171874a().f340216b, t);
        }
    }

    /* renamed from: b */
    private void m156905b() {
        this.f340313f = null;
        Set<T> set = this.f340312d;
        if (set != null) {
            set.clear();
        }
    }

    /* renamed from: a */
    public final Collection<T> mo172116a(C113731fn fnVar) {
        ArrayList arrayList = new ArrayList();
        m156904a(fnVar, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private void m156904a(C113731fn fnVar, Collection<T> collection) {
        if (this.f340310a.mo172082a(fnVar)) {
            List<C113742fx<T>> list = this.f340313f;
            if (list != null) {
                for (C113742fx<T> a : list) {
                    a.m156904a(fnVar, collection);
                }
                return;
            }
            Set<T> set = this.f340312d;
            if (set != null) {
                C113731fn fnVar2 = this.f340310a;
                if (fnVar2.f340209a >= fnVar.f340209a && fnVar2.f340211c <= fnVar.f340211c && fnVar2.f340210b >= fnVar.f340210b && fnVar2.f340212d <= fnVar.f340212d) {
                    collection.addAll(set);
                    return;
                }
                for (T t : set) {
                    C113732fo a2 = t.mo171874a();
                    if (fnVar.mo172081a(a2.f340215a, a2.f340216b)) {
                        collection.add(t);
                    }
                }
            }
        }
    }
}
