package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.lifecycle.k0 */
public class C54209k0 {

    /* renamed from: a */
    public final C54210b f152178a;

    /* renamed from: b */
    public final C39630m0 f152179b;

    /* renamed from: androidx.lifecycle.k0$a */
    public static class C39627a extends C39628d {

        /* renamed from: c */
        public static C39627a f106387c;

        /* renamed from: b */
        public Application f106388b;

        public C39627a(Application application) {
            this.f106388b = application;
        }

        public <T extends C39622i0> T create(Class<T> cls) {
            if (!C39621a.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                return (C39622i0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f106388b});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    /* renamed from: androidx.lifecycle.k0$d */
    public static class C39628d implements C54210b {

        /* renamed from: a */
        public static C39628d f106389a;

        public <T extends C39622i0> T create(Class<T> cls) {
            try {
                return (C39622i0) cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    /* renamed from: androidx.lifecycle.k0$b */
    public interface C54210b {
        <T extends C39622i0> T create(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.k0$c */
    public static abstract class C54211c extends C54212e implements C54210b {
        /* renamed from: b */
        public abstract <T extends C39622i0> T mo75004b(String str, Class<T> cls);

        public <T extends C39622i0> T create(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }
    }

    /* renamed from: androidx.lifecycle.k0$e */
    public static class C54212e {
        /* renamed from: a */
        public void mo75005a(C39622i0 i0Var) {
        }
    }

    public C54209k0(C0123n0 n0Var, C54210b bVar) {
        this(n0Var.getViewModelStore(), bVar);
    }

    /* renamed from: a */
    public <T extends C39622i0> T mo75002a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo75003b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C39622i0> T mo75003b(String str, Class<T> cls) {
        T t = (C39622i0) this.f152179b.f106390a.get(str);
        if (cls.isInstance(t)) {
            C54210b bVar = this.f152178a;
            if (bVar instanceof C54212e) {
                ((C54212e) bVar).mo75005a(t);
            }
            return t;
        }
        C54210b bVar2 = this.f152178a;
        T b = bVar2 instanceof C54211c ? ((C54211c) bVar2).mo75004b(str, cls) : bVar2.create(cls);
        C39622i0 put = this.f152179b.f106390a.put(str, b);
        if (put != null) {
            put.onCleared();
        }
        return b;
    }

    public C54209k0(C39630m0 m0Var, C54210b bVar) {
        this.f152178a = bVar;
        this.f152179b = m0Var;
    }
}
