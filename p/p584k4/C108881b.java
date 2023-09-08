package p584k4;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p1042u.C111055b;

/* renamed from: k4.b */
public abstract class C108881b {

    /* renamed from: a */
    public final C111055b<String, Method> f326039a;

    /* renamed from: b */
    public final C111055b<String, Method> f326040b;

    /* renamed from: c */
    public final C111055b<String, Class> f326041c;

    public C108881b(C111055b<String, Method> bVar, C111055b<String, Method> bVar2, C111055b<String, Class> bVar3) {
        this.f326039a = bVar;
        this.f326040b = bVar2;
        this.f326041c = bVar3;
    }

    /* renamed from: a */
    public abstract void mo159995a();

    /* renamed from: b */
    public abstract C108881b mo159996b();

    /* renamed from: c */
    public final Class mo159997c(Class<? extends C108883d> cls) {
        Class orDefault = this.f326041c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f326041c.put(cls.getName(), cls2);
        return cls2;
    }

    /* renamed from: d */
    public final Method mo159998d(String str) {
        Class<C108881b> cls = C108881b.class;
        Method orDefault = this.f326039a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f326039a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public final Method mo159999e(Class cls) {
        Method orDefault = this.f326040b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class c = mo159997c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C108881b.class});
        this.f326040b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: f */
    public abstract boolean mo160000f();

    /* renamed from: g */
    public abstract byte[] mo160001g();

    /* renamed from: h */
    public abstract CharSequence mo160002h();

    /* renamed from: i */
    public abstract boolean mo160003i(int i);

    /* renamed from: j */
    public abstract int mo160004j();

    /* renamed from: k */
    public int mo160005k(int i, int i2) {
        return !mo160003i(i2) ? i : mo160004j();
    }

    /* renamed from: l */
    public abstract <T extends Parcelable> T mo160006l();

    /* renamed from: m */
    public <T extends Parcelable> T mo160007m(T t, int i) {
        return !mo160003i(i) ? t : mo160006l();
    }

    /* renamed from: n */
    public abstract String mo160008n();

    /* renamed from: o */
    public <T extends C108883d> T mo160009o() {
        String n = mo160008n();
        if (n == null) {
            return null;
        }
        C108881b b = mo159996b();
        try {
            return (C108883d) mo159998d(n).invoke((Object) null, new Object[]{b});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: p */
    public abstract void mo160010p(int i);

    /* renamed from: q */
    public abstract void mo160011q(boolean z);

    /* renamed from: r */
    public abstract void mo160012r(byte[] bArr);

    /* renamed from: s */
    public abstract void mo160013s(CharSequence charSequence);

    /* renamed from: t */
    public abstract void mo160014t(int i);

    /* renamed from: u */
    public void mo160015u(int i, int i2) {
        mo160010p(i2);
        mo160014t(i);
    }

    /* renamed from: v */
    public abstract void mo160016v(Parcelable parcelable);

    /* renamed from: w */
    public abstract void mo160017w(String str);

    /* renamed from: x */
    public void mo160018x(C108883d dVar) {
        if (dVar == null) {
            mo160017w((String) null);
            return;
        }
        try {
            mo160017w(mo159997c(dVar.getClass()).getName());
            C108881b b = mo159996b();
            try {
                mo159999e(dVar.getClass()).invoke((Object) null, new Object[]{dVar, b});
                b.mo159995a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
