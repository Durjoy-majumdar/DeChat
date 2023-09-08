package p1109f4;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.tencent.p014mm.C0966R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p1118h4.C108057a;

/* renamed from: f4.a */
public final class C107470a {

    /* renamed from: d */
    public static volatile C107470a f321495d;

    /* renamed from: e */
    public static final Object f321496e = new Object();

    /* renamed from: a */
    public final Map<Class<?>, Object> f321497a = new HashMap();

    /* renamed from: b */
    public final Set<Class<? extends C107471b<?>>> f321498b = new HashSet();

    /* renamed from: c */
    public final Context f321499c;

    public C107470a(Context context) {
        this.f321499c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo157878a(Bundle bundle) {
        String string = this.f321499c.getString(C0966R.string.f7563jr);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (C107471b.class.isAssignableFrom(cls)) {
                            ((HashSet) this.f321498b).add(cls);
                        }
                    }
                }
                Iterator it = ((HashSet) this.f321498b).iterator();
                while (it.hasNext()) {
                    mo157879b((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new C107472c((Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public final <T> T mo157879b(Class<? extends C107471b<?>> cls, Set<Class<?>> set) {
        T t;
        if (C108057a.m146362a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!((HashMap) this.f321497a).containsKey(cls)) {
                set.add(cls);
                C107471b bVar = (C107471b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends C107471b<?>>> dependencies = bVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class next : dependencies) {
                        if (!((HashMap) this.f321497a).containsKey(next)) {
                            mo157879b(next, set);
                        }
                    }
                }
                t = bVar.mo119723a(this.f321499c);
                set.remove(cls);
                ((HashMap) this.f321497a).put(cls, t);
            } else {
                t = ((HashMap) this.f321497a).get(cls);
            }
            Trace.endSection();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
