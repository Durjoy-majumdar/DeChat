package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C113596ci;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mapsdk.internal.cd */
public abstract class C113590cd implements C113593cf {

    /* renamed from: a */
    public String f339970a;

    /* renamed from: b */
    public final C113605co f339971b = new C113605co();

    /* renamed from: f */
    private final Set<C113591a> f339972f = new LinkedHashSet();

    /* renamed from: g */
    private C113595ch f339973g;

    /* renamed from: com.tencent.mapsdk.internal.cd$a */
    public static class C113591a<S extends C113598cj> {

        /* renamed from: a */
        public String f339974a;

        /* renamed from: b */
        public Class<S> f339975b;

        /* renamed from: c */
        public Method f339976c;

        /* renamed from: d */
        public Map<String, String> f339977d;

        /* renamed from: e */
        public S f339978e;

        public C113591a(String str, Class cls, Method method) {
            this.f339974a = str;
            this.f339975b = cls;
            this.f339976c = method;
        }
    }

    /* renamed from: c */
    private void m156468c(String str) {
        this.f339970a = str;
    }

    /* renamed from: d */
    private C113605co m156471d() {
        return this.f339971b;
    }

    /* renamed from: e */
    private <S extends C113598cj> S m156472e(Class<S> cls) {
        for (C113591a next : this.f339972f) {
            if (next.f339975b == cls) {
                Method method = next.f339976c;
                if (method == null) {
                    return null;
                }
                try {
                    method.setAccessible(true);
                    S invoke = method.invoke(this, new Object[]{next.f339975b});
                    if (invoke == null || invoke.getClass() != cls) {
                        return null;
                    }
                    S s = (C113598cj) invoke;
                    s.mo171925a(next.f339977d);
                    next.f339978e = s;
                    return s;
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo171909a() {
        return this.f339970a;
    }

    /* renamed from: b */
    public final C113595ch mo171913b() {
        return this.f339973g;
    }

    /* renamed from: b */
    public abstract <S extends C113598cj> S mo171914b(Class<S> cls);

    /* renamed from: d */
    private C113591a m156470d(String str) {
        for (C113591a next : this.f339972f) {
            if (next.f339974a.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C113596ci.C113597a mo171908a(String str) {
        return mo171915b(str);
    }

    /* renamed from: b */
    public final <S extends C113598cj> S mo171915b(String str) {
        C113591a d = m156470d(str);
        if (d == null) {
            return null;
        }
        S s = d.f339978e;
        if (s != null) {
            return s;
        }
        return m156472e(d.f339975b);
    }

    /* renamed from: c */
    public final <S extends C113598cj> S mo171916c(Class<S> cls) {
        C113591a aVar;
        Iterator<C113591a> it = this.f339972f.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.f339975b.equals(cls)) {
                break;
            }
        }
        if (aVar == null) {
            return null;
        }
        S s = aVar.f339978e;
        if (s != null) {
            return s;
        }
        return m156472e(aVar.f339975b);
    }

    /* renamed from: a */
    public final void mo171910a(C113595ch chVar) {
        if (this.f339973g != chVar) {
            this.f339973g = chVar;
            for (Class<? extends C114029p> a : chVar.mo171919a_()) {
                C114006o.m158420a(a);
            }
            Map<String, Class<? extends C113596ci.C113597a>> a2 = this.f339973g.mo171918a();
            this.f339972f.clear();
            for (Map.Entry next : a2.entrySet()) {
                String str = (String) next.getKey();
                Class cls = (Class) next.getValue();
                try {
                    this.f339972f.add(new C113591a(str, cls, C113590cd.class.getDeclaredMethod("b", new Class[]{Class.class})));
                } catch (NoSuchMethodException e) {
                    throw new IllegalStateException(e);
                }
            }
            Map<String, String> c = this.f339973g.mo171920c();
            if (c != null && !c.isEmpty()) {
                for (Map.Entry next2 : c.entrySet()) {
                    m156467a((String) next2.getKey(), (String) next2.getValue());
                }
            }
        }
    }

    /* renamed from: d */
    private C113591a m156469d(Class cls) {
        for (C113591a next : this.f339972f) {
            if (next.f339975b.equals(cls)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C113604cn mo171917c() {
        return this.f339971b;
    }

    /* renamed from: a */
    private void m156467a(String str, String str2) {
        for (C113591a next : this.f339972f) {
            if (next.f339977d == null) {
                next.f339977d = new HashMap();
            }
            next.f339977d.put(str, str2);
            S s = next.f339978e;
            if (s != null) {
                s.mo171925a(next.f339977d);
            }
        }
    }

    /* renamed from: a */
    public final <T extends C113596ci.C113597a> void mo171912a(String str, Class<T> cls) {
        try {
            this.f339972f.add(new C113591a(str, cls, C113590cd.class.getDeclaredMethod("b", new Class[]{Class.class})));
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public final <T extends C114029p> void mo171911a(Class<T> cls) {
        C114006o.m158420a(cls);
    }
}
